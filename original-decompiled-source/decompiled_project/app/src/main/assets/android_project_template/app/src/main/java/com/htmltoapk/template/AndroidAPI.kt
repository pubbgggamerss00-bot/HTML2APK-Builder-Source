package {{packageName}}

import android.Manifest
import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.ClipData
import android.content.ClipboardManager
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.hardware.camera2.CameraAccessException
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.media.MediaRecorder
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.provider.MediaStore
import android.provider.Settings
import android.util.Log
import android.view.WindowManager
import android.webkit.JavascriptInterface
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.util.Locale

class AndroidAPI internal constructor(
    private val activity: MainActivity,
    private val isPro: Boolean = false,
    private val adMobBridge: AdMobBridge? = null,
    private val gate: BridgeGate
) {

    companion object {
        private const val TAG = "AndroidAPI"
        const val INTERFACE_NAME = "AndroidAPI"
        private const val NOTIF_CHANNEL = "htmltoapk_channel"

        // Base64 olarak JS'e taşınan dosyaların tavanı: 16 MB ham veri ~21 MB base64 + String
        // maliyeti demek; daha üstü orta segment cihazlarda OOM çökmesi üretiyordu.
        const val MAX_BASE64_FILE_BYTES = 16L * 1024 * 1024
        private const val LOCATION_TIMEOUT_MS = 15_000L
        private const val LOCATION_FRESH_MS = 60_000L
    }

    private val context: Context get() = activity
    private val mainHandler = Handler(Looper.getMainLooper())

    private fun ensurePro(): Boolean {
        if (!isPro) {
            emit("proRequired", JSONObject().apply {
                put("error", "This API requires Pro")
            })
        }
        return isPro
    }

    // Sensors
    private val sensorManager by lazy { context.getSystemService(Context.SENSOR_SERVICE) as SensorManager }
    private val activeSensors = mutableMapOf<String, SensorHolder>()

    private data class SensorHolder(
        val type: Int,
        val listener: SensorEventListener,
        val callbackId: String
    )

    // Location
    private val locationManager by lazy { context.getSystemService(Context.LOCATION_SERVICE) as LocationManager }
    private var locationListener: LocationListener? = null
    private var singleLocationListener: LocationListener? = null
    private var pendingLocationCallbackId: String? = null
    private var locationTimeoutRunnable: Runnable? = null

    // Audio recording
    private var mediaRecorder: MediaRecorder? = null
    private var audioRecordingFile: File? = null

    // Torch
    private var pendingTorchEnabled: Boolean? = null

    // Notification
    private var pendingNotification: Triple<String, String, String>? = null
    private val notificationManager by lazy { context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager }

    // Clipboard
    private val clipboard by lazy { context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager }

    // Yalniz BridgeGate'in guvenilen origin'lere enjekte ettigi sarmalayici cagirir; sayfa API'si degildir.
    @JavascriptInterface
    fun htmlToApkGateEnter(token: String) {
        gate.enter(token)
    }

    @JavascriptInterface
    fun htmlToApkGateExit() {
        gate.exit()
    }

    @JavascriptInterface
    fun showToast(message: String) {
        if (!gate.allows("showToast")) return
        runOnUiThread { Toast.makeText(context, message, Toast.LENGTH_SHORT).show() }
    }

    private fun defaultVibrator(): Vibrator? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val vm = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as? VibratorManager
            vm?.defaultVibrator
        } else {
            @Suppress("DEPRECATION")
            context.getSystemService(Context.VIBRATOR_SERVICE) as? Vibrator
        }
    }

    @JavascriptInterface
    fun vibrate(milliseconds: Int) {
        if (!gate.allows("vibrate")) return
        try {
            val vibrator = defaultVibrator() ?: return
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot(milliseconds.coerceAtLeast(1).toLong(), VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(milliseconds.coerceAtLeast(1).toLong())
            }
        } catch (e: Exception) {
            Log.w(TAG, "vibrate failed: ${e.message}")
        }
    }

    /**
     * Deseri bir titreşim deseni çalıştırır. patternJson örnegin "[300,100,300]" gelir;
     * gecersiz giriste hic titreşim olmaz ve sensorError benzeri bir olay yerine
     * vibrateResult ile hata bildirilir (sessiz basarisizlik birakmamak icin).
     */
    @JavascriptInterface
    fun vibratePattern(patternJson: String, repeat: Int) {
        if (!gate.allows("vibratePattern")) return
        val pattern = parseVibratePattern(patternJson)
        if (pattern == null || pattern.isEmpty()) {
            emit("vibrateResult", JSONObject().apply {
                put("success", false)
                put("error", "invalid_pattern")
                put("pattern", patternJson)
            })
            return
        }
        try {
            val vibrator = defaultVibrator()
            if (vibrator == null) {
                emit("vibrateResult", JSONObject().apply {
                    put("success", false)
                    put("error", "no_vibrator")
                })
                return
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createWaveform(pattern, repeat))
            } else {
                @Suppress("DEPRECATION")
                vibrator.vibrate(pattern, repeat)
            }
            emit("vibrateResult", JSONObject().apply {
                put("success", true)
                put("steps", pattern.size)
                put("repeat", repeat)
                put("error", "")
            })
        } catch (e: Exception) {
            emit("vibrateResult", JSONObject().apply {
                put("success", false)
                put("error", e.message ?: "vibrate_failed")
            })
        }
    }

    @JavascriptInterface
    fun cancelVibrate() {
        if (!gate.allows("cancelVibrate")) return
        try {
            defaultVibrator()?.cancel()
        } catch (e: Exception) {
            Log.w(TAG, "cancelVibrate failed: ${e.message}")
        }
    }

    @JavascriptInterface
    fun setTorch(enabled: Boolean) {
        if (!gate.allows("setTorch")) return
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            pendingTorchEnabled = enabled
            runOnUiThread {
                activity.requestPermission(Manifest.permission.CAMERA, "torch")
            }
            return
        }
        applyTorch(enabled)
    }

    private fun applyTorch(enabled: Boolean) {
        val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as? CameraManager
        if (cameraManager == null) {
            emitTorchResult(enabled, false, "CameraManager not available")
            return
        }
        try {
            val cameraId = findTorchCameraId(cameraManager)
            if (cameraId == null) {
                emitTorchResult(enabled, false, "No camera with flashlight found")
                return
            }
            cameraManager.setTorchMode(cameraId, enabled)
            emitTorchResult(enabled, true, null)
        } catch (e: CameraAccessException) {
            emitTorchResult(enabled, false, e.message)
        }
    }

    private fun findTorchCameraId(cameraManager: CameraManager): String? {
        return try {
            cameraManager.cameraIdList.find { id ->
                val characteristics = cameraManager.getCameraCharacteristics(id)
                val flashAvailable = characteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE) ?: false
                val facing = characteristics.get(CameraCharacteristics.LENS_FACING)
                flashAvailable && facing == CameraCharacteristics.LENS_FACING_BACK
            } ?: cameraManager.cameraIdList.find { id ->
                cameraManager.getCameraCharacteristics(id).get(CameraCharacteristics.FLASH_INFO_AVAILABLE) == true
            }
        } catch (_: Exception) {
            null
        }
    }

    private fun emitTorchResult(enabled: Boolean, success: Boolean, error: String?) {
        emit("torchResult", JSONObject().apply {
            put("enabled", enabled)
            put("success", success)
            put("error", error ?: JSONObject.NULL)
        })
    }

    @JavascriptInterface
    fun showNotification(title: String, message: String) {
        if (!gate.allows("showNotification")) return
        showNotification(title, message, "")
    }

    /** bigText bos birakilirsa klasik bildirim, doluysa buyutulebilir (BigText) bildirim gosterilir. */
    @JavascriptInterface
    fun showNotification(title: String, message: String, bigText: String) {
        if (!gate.allows("showNotification")) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                pendingNotification = Triple(title, message, bigText)
                runOnUiThread {
                    activity.requestPermission(Manifest.permission.POST_NOTIFICATIONS, "notification")
                }
                return
            }
        }
        postNotification(title, message, bigText)
    }

    @JavascriptInterface
    fun cancelNotification(id: Int) {
        if (!gate.allows("cancelNotification")) return
        try {
            notificationManager.cancel(id)
            emit("notificationResult", JSONObject().apply {
                put("action", "cancel")
                put("notificationId", id)
                put("success", true)
                put("error", "")
            })
        } catch (e: Exception) {
            Log.w(TAG, "cancelNotification failed: ${e.message}")
            emit("notificationResult", JSONObject().apply {
                put("action", "cancel")
                put("notificationId", id)
                put("success", false)
                put("error", "cancel_failed")
            })
        }
    }

    @JavascriptInterface
    fun cancelAllNotifications() {
        if (!gate.allows("cancelAllNotifications")) return
        try {
            notificationManager.cancelAll()
            emit("notificationResult", JSONObject().apply {
                put("action", "cancelAll")
                put("success", true)
                put("error", "")
            })
        } catch (e: Exception) {
            emit("notificationResult", JSONObject().apply {
                put("action", "cancelAll")
                put("success", false)
                put("error", e.message ?: "cancel_failed")
            })
        }
    }

    private fun postNotification(title: String, message: String, bigText: String = "") {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val channel = NotificationChannel(
                    NOTIF_CHANNEL,
                    "HTML to APK",
                    NotificationManager.IMPORTANCE_DEFAULT
                )
                notificationManager.createNotificationChannel(channel)
            }
            val builder = NotificationCompat.Builder(context, NOTIF_CHANNEL)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true)
            if (bigText.isNotBlank()) {
                builder.setStyle(NotificationCompat.BigTextStyle().bigText(bigText))
            }
            val id = (System.currentTimeMillis() % Int.MAX_VALUE).toInt()
            notificationManager.notify(id, builder.build())
            emit("notificationResult", JSONObject().apply {
                put("action", "post")
                put("notificationId", id)
                put("success", true)
                put("error", "")
            })
        } catch (e: Exception) {
            Log.e(TAG, "showNotification failed", e)
            emit("notificationResult", JSONObject().apply {
                put("action", "post")
                put("success", false)
                put("error", e.message ?: "notification_failed")
            })
        }
    }

    @JavascriptInterface
    fun requestNotificationPermission(callbackId: String) {
        if (!gate.allows("requestNotificationPermission")) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            runOnUiThread {
                activity.requestPermission(Manifest.permission.POST_NOTIFICATIONS, callbackId)
            }
        } else {
            emit("permissionResult", JSONObject().apply {
                put("callbackId", callbackId)
                put("permission", Manifest.permission.POST_NOTIFICATIONS)
                put("granted", true)
            })
        }
    }

    @JavascriptInterface
    fun scheduleNotification(id: String, title: String, message: String, delayMs: Long) {
        if (!gate.allows("scheduleNotification")) return
        scheduleNotification(id, title, message, delayMs, 0L)
    }

    @JavascriptInterface
    fun scheduleNotification(id: String, title: String, message: String, delayMs: Long, repeatIntervalMs: Long) {
        if (!gate.allows("scheduleNotification")) return
        if (!ensurePro()) {
            emit("scheduledNotificationResult", JSONObject().apply {
                put("id", id)
                put("success", false)
                put("error", "pro_required")
            })
            return
        }
        val triggerAt = System.currentTimeMillis() + delayMs.coerceAtLeast(0)
        val outcome = AlarmReceiver.scheduleAlarm(context, id, title, message, triggerAt, repeatIntervalMs)
        val warnings = mutableListOf<String>()
        if (outcome.success && !outcome.exact) warnings.add("inexact_alarm")
        if (outcome.success && !hasNotificationPermission()) warnings.add("notification_permission_missing")
        emit("scheduledNotificationResult", JSONObject().apply {
            put("id", id)
            put("success", outcome.success)
            put("exact", outcome.exact)
            put("triggerAt", triggerAt)
            put("warning", warnings.joinToString(","))
            put("error", if (outcome.success) "" else "alarm_failed")
        })
    }

    private fun hasNotificationPermission(): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) return true
        return ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) ==
            PackageManager.PERMISSION_GRANTED
    }

    /**
     * Android 12+ cihazlarda "tam zamanli alarm" izni kullanicinin tercihiyle kapali olabilir;
     * bu durumda alarm gayri-mutlu kalir ve hatirlatma gecikir. HTML tarafinda kontrol edilip
     * kullanicici ayarlara yonlendirilebilsin diye aciga cikarildi.
     */
    @JavascriptInterface
    fun canScheduleExactAlarms(): Boolean {
        if (!gate.allows("canScheduleExactAlarms")) return false
        return AlarmReceiver.canScheduleExactAlarms(context)
    }

    @JavascriptInterface
    fun openExactAlarmSettings() {
        if (!gate.allows("openExactAlarmSettings")) return
        runOnUiThread {
            try {
                val intent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    Intent(Settings.ACTION_REQUEST_SCHEDULE_EXACT_ALARM).apply {
                        data = android.net.Uri.fromParts("package", context.packageName, null)
                    }
                } else {
                    Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                        data = android.net.Uri.fromParts("package", context.packageName, null)
                    }
                }
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
                emit("appSettingsResult", JSONObject().apply {
                    put("screen", "exact_alarm")
                    put("success", true)
                    put("error", "")
                })
            } catch (e: Exception) {
                emit("appSettingsResult", JSONObject().apply {
                    put("screen", "exact_alarm")
                    put("success", false)
                    put("error", e.message ?: "settings_unavailable")
                })
            }
        }
    }

    /** Uygulamanin bildirim ayarlari ekranini acar (POST_NOTIFICATIONS kalici reddedildiyse). */
    @JavascriptInterface
    fun openNotificationSettings() {
        if (!gate.allows("openNotificationSettings")) return
        runOnUiThread {
            try {
                val intent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    Intent(Settings.ACTION_APP_NOTIFICATION_SETTINGS).apply {
                        putExtra(Settings.EXTRA_APP_PACKAGE, context.packageName)
                    }
                } else {
                    Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                        data = android.net.Uri.fromParts("package", context.packageName, null)
                    }
                }
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
                emit("appSettingsResult", JSONObject().apply {
                    put("screen", "notifications")
                    put("success", true)
                    put("error", "")
                })
            } catch (e: Exception) {
                emit("appSettingsResult", JSONObject().apply {
                    put("screen", "notifications")
                    put("success", false)
                    put("error", e.message ?: "settings_unavailable")
                })
            }
        }
    }

    @JavascriptInterface
    fun cancelScheduledNotification(id: String) {
        if (!gate.allows("cancelScheduledNotification")) return
        if (!ensurePro()) return
        try {
            AlarmReceiver.cancelAlarm(context, id)
            emit("scheduledNotificationResult", JSONObject().apply {
                put("id", id)
                put("cancelled", true)
                put("success", true)
                put("error", "")
            })
        } catch (e: Exception) {
            emit("scheduledNotificationResult", JSONObject().apply {
                put("id", id)
                put("cancelled", false)
                put("success", false)
                put("error", e.message ?: "cancel_failed")
            })
        }
    }

    @JavascriptInterface
    fun getLaunchDeepLink(): String {
        if (!gate.allows("getLaunchDeepLink")) return ""
        return activity.launchDeepLink ?: ""
    }

    @JavascriptInterface
    fun getDeviceInfo(): String {
        if (!gate.allows("getDeviceInfo")) return "{}"
        val json = JSONObject()
        json.put("model", Build.MODEL)
        json.put("manufacturer", Build.MANUFACTURER)
        json.put("androidVersion", Build.VERSION.RELEASE)
        json.put("sdk", Build.VERSION.SDK_INT)
        return json.toString()
    }

    @JavascriptInterface
    fun getBatteryLevel(): Int {
        if (!gate.allows("getBatteryLevel")) return -1
        val intent = context.registerReceiver(null, android.content.IntentFilter(android.content.Intent.ACTION_BATTERY_CHANGED))
        val level = intent?.getIntExtra(android.os.BatteryManager.EXTRA_LEVEL, -1) ?: -1
        val scale = intent?.getIntExtra(android.os.BatteryManager.EXTRA_SCALE, -1) ?: -1
        return if (level >= 0 && scale > 0) (level * 100 / scale) else -1
    }

    @JavascriptInterface
    fun hasPermission(permission: String): Boolean {
        if (!gate.allows("hasPermission")) return false
        return ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED
    }

    @JavascriptInterface
    fun requestPermission(permission: String, callbackId: String) {
        if (!gate.allows("requestPermission")) return
        runOnUiThread {
            activity.requestPermission(permission, callbackId)
        }
    }

    @JavascriptInterface
    fun requestPermissions(permissionsJson: String, callbackId: String) {
        if (!gate.allows("requestPermissions")) return
        val permissions = try {
            JSONArray(permissionsJson)
        } catch (_: Exception) {
            JSONArray()
        }
        val list = mutableListOf<String>()
        for (i in 0 until permissions.length()) {
            list.add(permissions.optString(i))
        }
        runOnUiThread {
            activity.requestPermissions(list.toTypedArray(), callbackId)
        }
    }

    @JavascriptInterface
    fun getScreenBrightness(): Int {
        if (!gate.allows("getScreenBrightness")) return -1
        return try {
            android.provider.Settings.System.getInt(context.contentResolver, android.provider.Settings.System.SCREEN_BRIGHTNESS)
        } catch (_: Exception) {
            -1
        }
    }

    /**
     * Kendi penceresi icin parlaklik (0..1); -1 sistem varsayilanina doner.
     * WRITE_SETTINGS istemiyor, bu yuzden Play politikasi acisindan guvenli.
     * Pencereye yalnizca UI is parcaciginda dokunulabilir; sonuc screenSettingResult ile gelir.
     */
    @JavascriptInterface
    fun setScreenBrightness(level: Float) {
        if (!gate.allows("setScreenBrightness")) return
        val normalized = normalizeScreenBrightness(level)
        runOnUiThread {
            try {
                val params = activity.window.attributes
                params.screenBrightness = normalized
                activity.window.attributes = params
                emitScreenSetting("brightness", normalized, true, null)
            } catch (e: Exception) {
                Log.w(TAG, "setScreenBrightness failed: ${e.message}")
                emitScreenSetting("brightness", normalized, false, e.message ?: "brightness_failed")
            }
        }
    }

    @JavascriptInterface
    fun keepScreenOn(enable: Boolean) {
        if (!gate.allows("keepScreenOn")) return
        runOnUiThread {
            try {
                if (enable) {
                    activity.window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
                } else {
                    activity.window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
                }
                emitScreenSetting("keepScreenOn", if (enable) 1f else 0f, true, null)
            } catch (e: Exception) {
                Log.w(TAG, "keepScreenOn failed: ${e.message}")
                emitScreenSetting("keepScreenOn", if (enable) 1f else 0f, false, e.message ?: "keep_screen_on_failed")
            }
        }
    }

    private fun emitScreenSetting(setting: String, value: Float, success: Boolean, error: String?) {
        emit("screenSettingResult", JSONObject().apply {
            put("setting", setting)
            put("value", value)
            put("success", success)
            put("error", error ?: "")
        })
    }

    @JavascriptInterface
    fun isOnline(): Boolean {
        if (!gate.allows("isOnline")) return false
        return try {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager ?: return true
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val network = cm.activeNetwork ?: return false
                val caps = cm.getNetworkCapabilities(network) ?: return false
                caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            } else {
                @Suppress("DEPRECATION")
                cm.activeNetworkInfo?.isConnected == true
            }
        } catch (_: Exception) {
            true
        }
    }

    @JavascriptInterface
    fun getNetworkType(): String {
        if (!gate.allows("getNetworkType")) return ""
        return try {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
                ?: return "unknown"
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                @Suppress("DEPRECATION")
                return when (cm.activeNetworkInfo?.type) {
                    android.net.ConnectivityManager.TYPE_WIFI -> "wifi"
                    android.net.ConnectivityManager.TYPE_MOBILE -> "cellular"
                    null -> "none"
                    else -> "other"
                }
            }
            val caps = cm.getNetworkCapabilities(cm.activeNetwork) ?: return "none"
            when {
                caps.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> "wifi"
                caps.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> "cellular"
                caps.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> "ethernet"
                !caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) -> "none"
                else -> "other"
            }
        } catch (_: Exception) {
            "unknown"
        }
    }

    @JavascriptInterface
    fun getAppInfo(): String {
        if (!gate.allows("getAppInfo")) return "{}"
        val json = JSONObject()
        try {
            val info = context.packageManager.getPackageInfo(context.packageName, 0)
            json.put("packageName", context.packageName)
            json.put("versionName", info.versionName ?: "")
            json.put("versionCode", if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) info.longVersionCode else info.versionCode.toLong())
            json.put("appName", context.applicationInfo.loadLabel(context.packageManager).toString())
        } catch (e: Exception) {
            json.put("error", e.message ?: "package_info_failed")
        }
        json.put("isPro", isPro)
        json.put("deviceSdk", Build.VERSION.SDK_INT)
        json.put("targetSdk", context.applicationInfo.targetSdkVersion)
        return json.toString()
    }

    @JavascriptInterface
    fun shouldShowRequestPermissionRationale(permission: String): Boolean {
        if (!gate.allows("shouldShowRequestPermissionRationale")) return false
        return try {
            ActivityCompat.shouldShowRequestPermissionRationale(activity, permission)
        } catch (e: Exception) {
            false
        }
    }

    /** Izin kalici olarak reddedildiyse kullaniciyi uygulama ayarlarina yonlendirme cikisi. */
    @JavascriptInterface
    fun openAppSettings() {
        if (!gate.allows("openAppSettings")) return
        runOnUiThread {
            try {
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                    data = android.net.Uri.fromParts("package", context.packageName, null)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
                emit("appSettingsResult", JSONObject().apply {
                    put("screen", "app")
                    put("success", true)
                    put("error", "")
                })
            } catch (e: Exception) {
                emit("appSettingsResult", JSONObject().apply {
                    put("screen", "app")
                    put("success", false)
                    put("error", e.message ?: "settings_unavailable")
                })
            }
        }
    }

    // Location
    @JavascriptInterface
    fun getLocation(callbackId: String) {
        if (!gate.allows("getLocation")) return
        if (!ensurePro()) {
            emitLocationResult(callbackId, null, "pro_required")
            return
        }
        if (!hasPermission(Manifest.permission.ACCESS_FINE_LOCATION) && !hasPermission(Manifest.permission.ACCESS_COARSE_LOCATION)) {
            emitLocationResult(callbackId, null, "permission_denied")
            return
        }
        runOnUiThread {
            // Bekleyen bir istek varsa sahibine "superseded" bildirilir; aksi halde o
            // callbackId hiç sonuç almadan kayboluyordu.
            if (pendingLocationCallbackId != null) {
                finishSingleLocation(null, "superseded")
            }
            pendingLocationCallbackId = callbackId
            try {
                val provider = enabledLocationProvider()
                if (provider == null) {
                    finishSingleLocation(null, "provider_disabled")
                    return@runOnUiThread
                }
                val fresh = lastKnownLocation()
                if (fresh != null) {
                    finishSingleLocation(fresh, null, true)
                    return@runOnUiThread
                }
                val listener = object : LocationListener {
                    override fun onLocationChanged(location: Location) {
                        finishSingleLocation(location, null)
                    }
                    override fun onProviderEnabled(provider: String) {}
                    override fun onProviderDisabled(provider: String) {}
                    @Deprecated("Deprecated in Java")
                    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {}
                }
                singleLocationListener = listener
                locationManager.requestSingleUpdate(provider, listener, null)
                // Kapalı mekanda GPS fix'i hiç gelmediğinde JS sonsuza kadar beklemesin.
                val timeout = Runnable { finishSingleLocation(null, "timeout") }
                locationTimeoutRunnable = timeout
                mainHandler.postDelayed(timeout, LOCATION_TIMEOUT_MS)
            } catch (e: SecurityException) {
                finishSingleLocation(null, "permission_revoked")
            } catch (e: Exception) {
                finishSingleLocation(null, e.message ?: "location_failed")
            }
        }
    }

    private fun enabledLocationProvider(): String? = when {
        locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) -> LocationManager.GPS_PROVIDER
        locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER) -> LocationManager.NETWORK_PROVIDER
        else -> null
    }

    @SuppressLint("MissingPermission")
    private fun lastKnownLocation(): Location? {
        val providers = listOf(
            LocationManager.GPS_PROVIDER,
            LocationManager.NETWORK_PROVIDER,
            LocationManager.PASSIVE_PROVIDER
        )
        val newest = providers.mapNotNull { provider ->
            try {
                locationManager.getLastKnownLocation(provider)
            } catch (_: SecurityException) {
                null
            }
        }.maxByOrNull { it.time } ?: return null
        return if (System.currentTimeMillis() - newest.time <= LOCATION_FRESH_MS) newest else null
    }

    private fun finishSingleLocation(location: Location?, error: String?, fromLastKnown: Boolean = false) {
        val callbackId = pendingLocationCallbackId ?: return
        pendingLocationCallbackId = null
        locationTimeoutRunnable?.let { mainHandler.removeCallbacks(it) }
        locationTimeoutRunnable = null
        singleLocationListener?.let { listener ->
            try {
                locationManager.removeUpdates(listener)
            } catch (_: Exception) {
            }
        }
        singleLocationListener = null
        emitLocationResult(callbackId, location, error, fromLastKnown)
    }

    private fun emitLocationResult(callbackId: String, location: Location?, error: String?, fromLastKnown: Boolean = false) {
        emit("locationResult", JSONObject().apply {
            put("callbackId", callbackId)
            if (location != null) {
                put("success", true)
                put("latitude", location.latitude)
                put("longitude", location.longitude)
                put("accuracy", location.accuracy.toDouble())
                put("provider", location.provider)
                put("time", location.time)
                put("fromLastKnown", fromLastKnown)
            } else {
                put("success", false)
            }
            put("error", error ?: "")
        })
    }

    @JavascriptInterface
    fun startLocationUpdates(callbackId: String) {
        if (!gate.allows("startLocationUpdates")) return
        if (!ensurePro()) {
            emitLocationUpdate(callbackId, null, "pro_required", null)
            return
        }
        if (!hasPermission(Manifest.permission.ACCESS_FINE_LOCATION) && !hasPermission(Manifest.permission.ACCESS_COARSE_LOCATION)) {
            emitLocationUpdate(callbackId, null, "permission_denied", null)
            return
        }
        runOnUiThread {
            try {
                stopLocationUpdates()
                val provider = enabledLocationProvider()
                if (provider == null) {
                    emitLocationUpdate(callbackId, null, "provider_disabled", null)
                    return@runOnUiThread
                }
                val listener = object : LocationListener {
                    override fun onLocationChanged(location: Location) {
                        emitLocationUpdate(callbackId, location, null, null)
                    }
                    override fun onProviderEnabled(provider: String) {}
                    override fun onProviderDisabled(provider: String) {}
                    @Deprecated("Deprecated in Java")
                    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {}
                }
                locationListener = listener
                locationManager.requestLocationUpdates(provider, 1000L, 1f, listener)
                // Kayit basariyla olusturuldu: cagri "hic calismadi" ile "fix bekleniyor" ayrimi icin.
                emitLocationUpdate(callbackId, null, null, "started:$provider")
            } catch (e: SecurityException) {
                emitLocationUpdate(callbackId, null, "permission_revoked", null)
            } catch (e: Exception) {
                emitLocationUpdate(callbackId, null, e.message ?: "updates_failed", null)
            }
        }
    }

    private fun emitLocationUpdate(callbackId: String, location: Location?, error: String?, status: String?) {
        emit("locationUpdate", JSONObject().apply {
            put("callbackId", callbackId)
            if (location != null) {
                put("success", true)
                put("latitude", location.latitude)
                put("longitude", location.longitude)
                put("accuracy", location.accuracy.toDouble())
                put("provider", location.provider)
                put("time", location.time)
            } else if (error == null) {
                put("success", true)
            } else {
                put("success", false)
            }
            put("status", status ?: "")
            put("error", error ?: "")
        })
    }

    @JavascriptInterface
    fun stopLocationUpdates() {
        if (!gate.allows("stopLocationUpdates")) return
        if (!ensurePro()) return
        locationListener?.let {
            try {
                locationManager.removeUpdates(it)
            } catch (_: Exception) {
            }
            locationListener = null
        }
    }

    /** Enlem-boylam'i adres metnine cevirir; INTERNET yeterlidir, ek izin gerektirmez. */
    @JavascriptInterface
    fun getAddress(latitude: Double, longitude: Double, callbackId: String) {
        if (!gate.allows("getAddress")) return
        if (!ensurePro()) {
            emitAddressResult(callbackId, latitude, longitude, "", "", "pro_required")
            return
        }
        if (!Geocoder.isPresent()) {
            emitAddressResult(callbackId, latitude, longitude, "", "", "geocoder_unavailable")
            return
        }
        Thread {
            try {
                val found = geocoder.getFromLocation(latitude, longitude, 1)
                if (found.isNullOrEmpty()) {
                    emitAddressResult(callbackId, latitude, longitude, "", "", "no_result")
                } else {
                    val address = found[0]
                    val lines = (0..address.maxAddressLineIndex).mapNotNull { index ->
                        address.getAddressLine(index)?.takeIf { it.isNotBlank() }
                    }
                    val country = address.countryCode ?: address.locale?.country ?: ""
                    emitAddressResult(
                        callbackId, latitude, longitude,
                        if (lines.isNotEmpty()) lines.joinToString(", ") else address.locality ?: "",
                        country, null
                    )
                }
            } catch (e: Exception) {
                emitAddressResult(callbackId, latitude, longitude, "", "", e.message ?: "geocode_failed")
            }
        }.start()
    }

    private val geocoder by lazy { Geocoder(context) }

    private fun emitAddressResult(
        callbackId: String,
        latitude: Double,
        longitude: Double,
        address: String,
        countryCode: String,
        error: String?
    ) {
        emit("addressResult", JSONObject().apply {
            put("callbackId", callbackId)
            put("success", error == null && address.isNotEmpty())
            put("latitude", latitude)
            put("longitude", longitude)
            put("address", address)
            put("countryCode", countryCode)
            put("error", error ?: "")
        })
    }

    // Camera
    @JavascriptInterface
    fun capturePhoto(callbackId: String) {
        if (!gate.allows("capturePhoto")) return
        runOnUiThread {
            activity.capturePhoto(callbackId, false)
        }
    }

    /** facing "front" ise on kamera CameraX ile kullanilir (intent'te on/arka secimi guvenilir degil). */
    @JavascriptInterface
    fun capturePhoto(callbackId: String, facing: String) {
        if (!gate.allows("capturePhoto")) return
        runOnUiThread {
            activity.capturePhoto(callbackId, facing.equals("front", ignoreCase = true))
        }
    }

    /**
     * Buyuk fotoğraflari HTML tarafinda islemek base64 yuzunden pahaliydi; burada native
     * tarafta kucukluk/kalite dusurulup data URL olarak geri donulur.
     */
    @JavascriptInterface
    fun compressImage(base64Data: String, maxWidth: Int, quality: Int, callbackId: String) {
        if (!gate.allows("compressImage")) return
        Thread {
            var bitmap: android.graphics.Bitmap? = null
            var scaled: android.graphics.Bitmap? = null
            try {
                val clean = base64Data.substringAfter(",")
                if (clean.isEmpty()) {
                    emitImageResult(callbackId, "", 0, 0, 0L, "invalid_data")
                    return@Thread
                }
                val bytes = android.util.Base64.decode(clean, android.util.Base64.DEFAULT)
                val bounds = android.graphics.BitmapFactory.Options().apply { inJustDecodeBounds = true }
                android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.size, bounds)
                if (bounds.outWidth <= 0 || bounds.outHeight <= 0) {
                    emitImageResult(callbackId, "", 0, 0, bytes.size.toLong(), "decode_failed")
                    return@Thread
                }
                val targetWidth = if (maxWidth in 16..10000) maxWidth else 1280
                var sample = 1
                while (bounds.outWidth / (sample * 2) >= targetWidth) sample *= 2
                val opts = android.graphics.BitmapFactory.Options().apply { inSampleSize = sample }
                bitmap = android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.size, opts)
                if (bitmap == null) {
                    emitImageResult(callbackId, "", 0, 0, bytes.size.toLong(), "decode_failed")
                    return@Thread
                }
                val ratio = (targetWidth.toFloat() / bitmap!!.width).coerceAtMost(1f)
                val width = (bitmap!!.width * ratio).toInt().coerceAtLeast(1)
                val height = (bitmap!!.height * ratio).toInt().coerceAtLeast(1)
                scaled = if (ratio < 1f) {
                    android.graphics.Bitmap.createScaledBitmap(bitmap!!, width, height, true)
                } else {
                    bitmap
                }
                val out = java.io.ByteArrayOutputStream()
                val compressed = scaled!!.compress(
                    android.graphics.Bitmap.CompressFormat.JPEG,
                    quality.coerceIn(1, 100),
                    out
                )
                val encoded = if (compressed) {
                    android.util.Base64.encodeToString(out.toByteArray(), android.util.Base64.NO_WRAP)
                } else {
                    ""
                }
                if (encoded.isEmpty()) {
                    emitImageResult(callbackId, "", width, height, bytes.size.toLong(), "compress_failed")
                } else {
                    emitImageResult(callbackId, "data:image/jpeg;base64,$encoded", width, height, out.size().toLong(), null)
                }
            } catch (e: OutOfMemoryError) {
                Log.e(TAG, "compressImage OOM", e)
                emitImageResult(callbackId, "", 0, 0, 0L, "image_too_large")
            } catch (e: Exception) {
                emitImageResult(callbackId, "", 0, 0, 0L, e.message ?: "compress_failed")
            } finally {
                try {
                    if (scaled != null && scaled !== bitmap) scaled!!.recycle()
                    bitmap?.recycle()
                } catch (_: Exception) {
                }
            }
        }.start()
    }

    private fun emitImageResult(callbackId: String, dataUrl: String, width: Int, height: Int, bytes: Long, error: String?) {
        emit("imageCompressResult", JSONObject().apply {
            put("callbackId", callbackId)
            put("success", error == null && dataUrl.isNotEmpty())
            put("base64", dataUrl)
            put("width", width)
            put("height", height)
            put("bytes", bytes)
            put("error", error ?: "")
        })
    }

    @JavascriptInterface
    fun startCameraPreview() {
        if (!gate.allows("startCameraPreview")) return
        if (!ensurePro()) {
            onCameraPreviewResult(false, false, "pro_required")
            return
        }
        runOnUiThread {
            activity.startCameraPreview()
        }
    }

    @JavascriptInterface
    fun stopCameraPreview() {
        if (!gate.allows("stopCameraPreview")) return
        if (!ensurePro()) {
            onCameraPreviewResult(false, false, "pro_required")
            return
        }
        runOnUiThread {
            activity.stopCameraPreview()
        }
    }

    // Audio
    @JavascriptInterface
    fun startAudioRecording(fileName: String) {
        if (!gate.allows("startAudioRecording")) return
        if (!ensurePro()) {
            emitAudioStart(fileName, false, "pro_required", null)
            return
        }
        if (!isSafeAppFileName(fileName)) {
            emitAudioStart(fileName, false, "invalid_file_name", null)
            return
        }
        if (!hasPermission(Manifest.permission.RECORD_AUDIO)) {
            emitAudioStart(fileName, false, "permission_denied", null)
            return
        }
        runOnUiThread {
            var discarded = false
            try {
                // Onceki kayit sessizce birakilir (JS yeni bir kayit baslatti); bilgi uyar olarak verilir.
                discarded = releaseRecorderQuietly()
                val file = File(context.cacheDir, fileName).apply { parentFile?.mkdirs() }
                audioRecordingFile = file
                val recorder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                    MediaRecorder(context)
                } else {
                    @Suppress("DEPRECATION")
                    MediaRecorder()
                }
                try {
                    recorder.setAudioSource(MediaRecorder.AudioSource.MIC)
                    recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
                    recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
                    recorder.setOutputFile(file.absolutePath)
                    recorder.prepare()
                    recorder.start()
                    mediaRecorder = recorder
                    emitAudioStart(fileName, true, null, if (discarded) "previous_recording_discarded" else null)
                } catch (e: Exception) {
                    try {
                        recorder.release()
                    } catch (_: Exception) {
                    }
                    audioRecordingFile = null
                    Log.e(TAG, "startAudioRecording failed", e)
                    emitAudioStart(fileName, false, "start_failed", null)
                }
            } catch (e: Exception) {
                audioRecordingFile = null
                Log.e(TAG, "startAudioRecording setup failed", e)
                emitAudioStart(fileName, false, e.message ?: "start_failed", null)
            }
        }
    }

    /** Aktif kaydediciyi olay yaymadan serbest birakir; true donerse atilan bir kayit vardi. */
    private fun releaseRecorderQuietly(): Boolean {
        val recorder = mediaRecorder ?: return false
        mediaRecorder = null
        audioRecordingFile = null
        try {
            recorder.stop()
        } catch (_: Exception) {
        }
        try {
            recorder.release()
        } catch (_: Exception) {
        }
        return true
    }

    private fun emitAudioStart(fileName: String, success: Boolean, error: String?, warning: String?) {
        emit("audioRecordingStartResult", JSONObject().apply {
            put("fileName", fileName)
            put("success", success)
            put("warning", warning ?: "")
            put("error", error ?: "")
        })
    }

    @JavascriptInterface
    fun stopAudioRecording(callbackId: String) {
        if (!gate.allows("stopAudioRecording")) return
        if (!ensurePro()) {
            emitAudioStop(callbackId, null, "pro_required")
            return
        }
        runOnUiThread {
            val recorder = mediaRecorder
            val file = audioRecordingFile
            mediaRecorder = null
            audioRecordingFile = null
            if (recorder == null) {
                emitAudioStop(callbackId, null, "no_active_recording")
                return@runOnUiThread
            }
            var failure: String? = null
            try {
                recorder.stop()
            } catch (e: Exception) {
                Log.e(TAG, "stopAudioRecording failed", e)
                failure = "stop_failed"
            } finally {
                try {
                    recorder.release()
                } catch (_: Exception) {
                }
            }
            if (failure != null) {
                try {
                    file?.delete()
                } catch (_: Throwable) {
                }
            }
            emitAudioStop(callbackId, file, failure)
        }
    }

    private fun emitAudioStop(callbackId: String, file: File?, error: String?) {
        val usable = error == null && file != null && file.exists() && file.length() > 0L
        emit("audioRecordingResult", JSONObject().apply {
            put("callbackId", callbackId)
            put("success", usable)
            put("path", if (usable) file!!.absolutePath else "")
            put("fileName", file?.name ?: "")
            put("size", file?.length() ?: 0L)
            put("mimeType", "audio/mp4")
            put("error", error ?: if (usable) "" else "empty_recording")
        })
    }

    /** cacheDir'deki kaydi base64 olarak dondurur (HTML tarafinda calastirmak icin). */
    @JavascriptInterface
    fun getAudioFileBase64(fileName: String, callbackId: String) {
        if (!gate.allows("getAudioFileBase64")) return
        if (!isSafeAppFileName(fileName)) {
            emitAudioFileResult(callbackId, fileName, "", 0L, "invalid_file_name")
            return
        }
        Thread {
            val file = File(context.cacheDir, fileName)
            when {
                !file.exists() -> emitAudioFileResult(callbackId, fileName, "", 0L, "not_found")
                file.length() > MAX_BASE64_FILE_BYTES ->
                    emitAudioFileResult(callbackId, fileName, "", file.length(), "file_too_large")
                else -> try {
                    val base64 = android.util.Base64.encodeToString(file.readBytes(), android.util.Base64.NO_WRAP)
                    emitAudioFileResult(callbackId, fileName, base64, file.length(), null)
                } catch (e: Exception) {
                    emitAudioFileResult(callbackId, fileName, "", file.length(), e.message ?: "read_failed")
                }
            }
        }.start()
    }

    private fun emitAudioFileResult(callbackId: String, fileName: String, base64: String, size: Long, error: String?) {
        emit("audioFileResult", JSONObject().apply {
            put("callbackId", callbackId)
            put("fileName", fileName)
            put("success", error == null && base64.isNotEmpty())
            put("base64", base64)
            put("mimeType", "audio/mp4")
            put("size", size)
            put("error", error ?: "")
        })
    }

    // Clipboard
    @JavascriptInterface
    fun copyToClipboard(text: String) {
        if (!gate.allows("copyToClipboard")) return
        runOnUiThread {
            try {
                clipboard.setPrimaryClip(ClipData.newPlainText("text", text))
            } catch (_: Exception) {
                // Clipboard service may be dead/unavailable on some devices.
            }
        }
    }

    @JavascriptInterface
    fun pasteFromClipboard(): String {
        if (!gate.allows("pasteFromClipboard")) return ""
        return try {
            if (clipboard.hasPrimaryClip()) {
                val item = clipboard.primaryClip?.getItemAt(0)
                item?.text?.toString() ?: ""
            } else ""
        } catch (_: Exception) {
            ""
        }
    }

    // Share
    @JavascriptInterface
    fun shareText(text: String) {
        if (!gate.allows("shareText")) return
        runOnUiThread {
            try {
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, text)
                }
                context.startActivity(Intent.createChooser(intent, "Share"))
                emitShareResult("text", true, null)
            } catch (e: Exception) {
                emitShareResult("text", false, e.message ?: "launch_failed")
            }
        }
    }

    @JavascriptInterface
    fun shareFile(filePath: String, mimeType: String?) {
        if (!gate.allows("shareFile")) return
        runOnUiThread {
            try {
                // Ham yol verildiyse oldugu gibi kullan; slash icermeyen ad writeAppFile/readAppFile'in
                // yazdigi filesDir icinde aranir - aksi halde JS'in paylasacagi dosyaya erisimi yoktu.
                val file = if (filePath.contains('/')) File(filePath) else {
                    if (!isSafeAppFileName(filePath)) {
                        emitShareResult("file", false, "invalid_file_name")
                        return@runOnUiThread
                    }
                    File(context.filesDir, filePath)
                }
                if (!file.exists()) {
                    emitShareResult("file", false, "not_found")
                    return@runOnUiThread
                }
                val uri = FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", file)
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = mimeType?.takeIf { it.isNotBlank() } ?: "*/*"
                    putExtra(Intent.EXTRA_STREAM, uri)
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                }
                context.startActivity(Intent.createChooser(intent, "Share"))
                emitShareResult("file", true, null)
            } catch (e: Exception) {
                emitShareResult("file", false, e.message ?: "share_failed")
            }
        }
    }

    /**
     * HTML tarafinda uretilen icerigi paylasir. shareFile ham dosya yolu ister ve JS bu yolu
     * bilemeyecegi icin pratikte kullanilamiyordu; buradan base64 ile dogrudan veriliyor.
     */
    @JavascriptInterface
    fun shareFileFromBase64(fileName: String, base64Data: String, mimeType: String) {
        if (!gate.allows("shareFileFromBase64")) return
        if (!isSafeAppFileName(fileName)) {
            emitShareResult("file", false, "invalid_file_name")
            return
        }
        Thread {
            try {
                val clean = base64Data.substringAfter(",")
                val bytes = android.util.Base64.decode(clean, android.util.Base64.DEFAULT)
                if (bytes.isEmpty()) {
                    emitShareResult("file", false, "empty_data")
                    return@Thread
                }
                if (bytes.size.toLong() > MAX_BASE64_FILE_BYTES) {
                    emitShareResult("file", false, "file_too_large")
                    return@Thread
                }
                val file = File(context.cacheDir, "shared_" + fileName.substringAfterLast('/'))
                file.parentFile?.mkdirs()
                file.writeBytes(bytes)
                val uri = FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", file)
                runOnUiThread {
                    try {
                        val intent = Intent(Intent.ACTION_SEND).apply {
                            type = mimeType.takeIf { it.isNotBlank() } ?: "*/*"
                            putExtra(Intent.EXTRA_STREAM, uri)
                            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                        }
                        context.startActivity(Intent.createChooser(intent, "Share"))
                        emitShareResult("file", true, null)
                    } catch (e: Exception) {
                        emitShareResult("file", false, e.message ?: "launch_failed")
                    }
                }
            } catch (e: Exception) {
                emitShareResult("file", false, e.message ?: "write_failed")
            }
        }.start()
    }

    private fun emitShareResult(kind: String, success: Boolean, error: String?) {
        emit("shareResult", JSONObject().apply {
            put("kind", kind)
            put("success", success)
            put("error", error ?: "")
        })
    }

    /** Opens Android's print dialog; success means opened, not that the user saved a PDF. */
    @JavascriptInterface
    fun printPage() {
        mainHandler.post {
            val error = activity.printCurrentPage()
            emit("printResult", JSONObject().apply {
                put("success", error == null)
                put("status", if (error == null) "opened" else "failed")
                put("error", error ?: "")
            })
        }
    }

    // File I/O via SAF
    @JavascriptInterface
    fun pickFile(mimeType: String, callbackId: String) {
        if (!gate.allows("pickFile")) return
        if (!ensurePro()) return
        runOnUiThread {
            activity.pickFile(mimeType, callbackId)
        }
    }

    @JavascriptInterface
    fun writeFile(fileName: String, content: String, mimeType: String?, callbackId: String) {
        if (!gate.allows("writeFile")) return
        if (!ensurePro()) return
        runOnUiThread {
            activity.createFile(fileName, mimeType ?: "*/*", content, callbackId)
        }
    }

    @JavascriptInterface
    fun readAppFile(fileName: String): String {
        if (!gate.allows("readAppFile")) return ""
        if (!isSafeAppFileName(fileName)) return ""
        return try {
            File(context.filesDir, fileName).readText()
        } catch (_: Exception) {
            ""
        }
    }

    @JavascriptInterface
    fun writeAppFile(fileName: String, content: String): Boolean {
        if (!gate.allows("writeAppFile")) return false
        if (!isSafeAppFileName(fileName)) return false
        return try {
            val file = File(context.filesDir, fileName)
            file.parentFile?.mkdirs()
            file.writeText(content)
            true
        } catch (_: Exception) {
            false
        }
    }

    @JavascriptInterface
    fun deleteAppFile(fileName: String): Boolean {
        if (!gate.allows("deleteAppFile")) return false
        if (!isSafeAppFileName(fileName)) return false
        return try {
            File(context.filesDir, fileName).delete()
        } catch (_: Exception) {
            false
        }
    }

    /** Uygulamanin kendi klasorundeki dosyalarin listesi (JSON dizi olarak doner). */
    @JavascriptInterface
    fun listAppFiles(): String {
        if (!gate.allows("listAppFiles")) return "[]"
        val array = JSONArray()
        try {
            context.filesDir.walkTopDown().filter { it.isFile }.forEach { file ->
                val relative = file.absolutePath.removePrefix(context.filesDir.absolutePath).trimStart('/')
                array.put(JSONObject().apply {
                    put("name", relative)
                    put("size", file.length())
                    put("lastModified", file.lastModified())
                })
            }
        } catch (e: Exception) {
            Log.w(TAG, "listAppFiles failed: ${e.message}")
        }
        return array.toString()
    }

    // Gallery
    @JavascriptInterface
    fun saveToGallery(fileName: String, base64Image: String, callbackId: String) {
        if (!gate.allows("saveToGallery")) return
        if (!ensurePro()) return
        runOnUiThread {
            try {
                val bitmap = base64ToBitmap(base64Image) ?: throw IllegalArgumentException("Invalid image data")
                val values = ContentValues().apply {
                    put(MediaStore.Images.Media.DISPLAY_NAME, fileName)
                    put(MediaStore.Images.Media.MIME_TYPE, "image/png")
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        put(MediaStore.Images.Media.IS_PENDING, 1)
                        put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES)
                    }
                }
                val resolver = context.contentResolver
                val uri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
                if (uri != null) {
                    resolver.openOutputStream(uri)?.use { out ->
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, out)
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        values.clear()
                        values.put(MediaStore.Images.Media.IS_PENDING, 0)
                        resolver.update(uri, values, null, null)
                    }
                    emit("gallerySaveResult", JSONObject().apply {
                        put("callbackId", callbackId)
                        put("success", true)
                        put("uri", uri.toString())
                    })
                } else {
                    throw IOException("Failed to create MediaStore entry")
                }
            } catch (e: Exception) {
                emit("gallerySaveResult", JSONObject().apply {
                    put("callbackId", callbackId)
                    put("success", false)
                    put("error", e.message)
                })
            }
        }
    }

    // Sensors
    @JavascriptInterface
    fun startSensor(sensorType: String, callbackId: String) {
        if (!gate.allows("startSensor")) return
        if (!ensurePro()) return
        runOnUiThread {
            val type = sensorTypeToInt(sensorType)
            if (type == -1) {
                emit("sensorError", JSONObject().apply {
                    put("callbackId", callbackId)
                    put("sensor", sensorType)
                    put("error", "Unknown sensor type")
                })
                return@runOnUiThread
            }
            if (sensorType == "stepCounter" && !hasPermission(Manifest.permission.ACTIVITY_RECOGNITION)) {
                emit("sensorError", JSONObject().apply {
                    put("callbackId", callbackId)
                    put("sensor", sensorType)
                    put("error", "Activity recognition permission not granted")
                })
                return@runOnUiThread
            }
            stopSensor(sensorType)
            val sensor = sensorManager.getDefaultSensor(type)
            if (sensor == null) {
                emit("sensorError", JSONObject().apply {
                    put("callbackId", callbackId)
                    put("sensor", sensorType)
                    put("error", "Sensor not available on this device")
                })
                return@runOnUiThread
            }
            val listener = object : SensorEventListener {
                override fun onSensorChanged(event: SensorEvent) {
                    emit("sensorData", JSONObject().apply {
                        put("callbackId", callbackId)
                        put("sensor", sensorType)
                        put("values", JSONArray(event.values.map { it.toDouble() }))
                        put("timestamp", event.timestamp)
                        put("accuracy", event.accuracy)
                    })
                }
                override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
            }
            activeSensors[sensorType] = SensorHolder(type, listener, callbackId)
            sensorManager.registerListener(listener, sensor, SensorManager.SENSOR_DELAY_UI)
        }
    }

    @JavascriptInterface
    fun stopSensor(sensorType: String) {
        if (!gate.allows("stopSensor")) return
        if (!ensurePro()) return
        activeSensors.remove(sensorType)?.let { holder ->
            sensorManager.unregisterListener(holder.listener)
        }
    }

    @JavascriptInterface
    fun stopAllSensors() {
        if (!gate.allows("stopAllSensors")) return
        if (!ensurePro()) return
        activeSensors.values.forEach { holder ->
            sensorManager.unregisterListener(holder.listener)
        }
        activeSensors.clear()
    }

    // Called by MainActivity
    fun onPermissionResult(callbackId: String, permission: String, granted: Boolean) {
        if (callbackId == "torch") {
            val pending = pendingTorchEnabled
            pendingTorchEnabled = null
            if (granted) {
                pending?.let { applyTorch(it) }
            } else if (pending != null) {
                // Izin reddedilince fener denemesi burada bitiyor; JS en azindan bir sonuc aliyor.
                emitTorchResult(pending, false, "permission_denied")
            }
        }
        if (callbackId == "notification") {
            val pending = pendingNotification
            pendingNotification = null
            if (granted) {
                pending?.let { (title, message, bigText) -> postNotification(title, message, bigText) }
            } else if (pending != null) {
                emit("notificationResult", JSONObject().apply {
                    put("action", "post")
                    put("success", false)
                    put("error", "permission_denied")
                })
            }
        }
        emit("permissionResult", JSONObject().apply {
            put("callbackId", callbackId)
            put("permission", permission)
            put("granted", granted)
        })
    }

    fun onPermissionsResult(callbackId: String, results: Map<String, Boolean>) {
        val obj = JSONObject()
        results.forEach { (k, v) -> obj.put(k, v) }
        emit("permissionsResult", JSONObject().apply {
            put("callbackId", callbackId)
            put("results", obj)
        })
    }

    fun onCameraResult(callbackId: String, success: Boolean, base64: String?, error: String? = null) {
        emit("cameraResult", JSONObject().apply {
            put("callbackId", callbackId)
            put("success", success)
            put("base64", base64 ?: "")
            put("error", error ?: "")
        })
    }

    fun onCameraPreviewResult(success: Boolean, active: Boolean, error: String?) {
        emit("cameraPreviewResult", JSONObject().apply {
            put("success", success)
            put("active", active)
            put("error", error ?: "")
        })
    }

    fun onFilePicked(callbackId: String, content: String?, error: String?) {
        emit("filePicked", JSONObject().apply {
            put("callbackId", callbackId)
            put("success", content != null && error == null)
            put("content", content ?: "")
            put("error", error ?: "")
        })
    }

    fun onFileWritten(callbackId: String, success: Boolean, error: String?) {
        emit("fileWritten", JSONObject().apply {
            put("callbackId", callbackId)
            put("success", success)
            put("error", error ?: "")
        })
    }

    internal fun emit(event: String, data: JSONObject) {
        val jsonStr = data.toString()
        val quotedEvent = JSONObject.quote(event)
        val script = """
            (function() {
                try {
                    var eventName = $quotedEvent;
                    var payload = ${jsonStr};
                    if (window.onAndroidEvent) {
                        window.onAndroidEvent(eventName, payload);
                    }
                    window.dispatchEvent(new CustomEvent(eventName, { detail: payload }));
                } catch(e) {
                    console.error('Error dispatching Android event:', e);
                }
            })();
        """.trimIndent()
        mainHandler.post {
            // Ana belge dis bir siteye gectiyse sonuclar (konum, dosya, kayit) ona teslim edilmez.
            if (!gate.isTrustedPage(activity.webView.url)) return@post
            activity.webView.evaluateJavascript(script, null)
        }
    }

    // --- Ads JS API ---

    @JavascriptInterface
    fun adsInitialize() {
        if (!gate.allows("adsInitialize")) return
        adMobBridge?.initializeFromJs() ?: emit("adResult", disabledConsentResult().put("initialized", false))
    }

    // Immutable native snapshots are safe to read on the WebView JavaBridge thread.
    @JavascriptInterface
    fun adsCanRequestAds(): Boolean {
        if (!gate.allows("adsCanRequestAds")) return false
        return adMobBridge?.canRequestAds() ?: false
    }

    @JavascriptInterface
    fun adsGetConsentStatus(): String {
        if (!gate.allows("adsGetConsentStatus")) return "{}"
        return (adMobBridge?.consentStatusJson() ?: disabledConsentResult()).toString()
    }

    @JavascriptInterface
    fun adsIsPrivacyOptionsRequired(): Boolean {
        if (!gate.allows("adsIsPrivacyOptionsRequired")) return false
        return adMobBridge?.isPrivacyOptionsRequired() ?: false
    }

    @JavascriptInterface
    fun adsShowPrivacyOptionsForm() {
        if (!gate.allows("adsShowPrivacyOptionsForm")) return
        adMobBridge?.showPrivacyOptions() ?: emit("privacyOptionsResult", disabledConsentResult())
    }

    @JavascriptInterface
    fun adsResetConsent() {
        if (!gate.allows("adsResetConsent")) return
        adMobBridge?.resetConsent() ?: emit("consentResetResult", disabledConsentResult())
    }

    private fun disabledConsentResult() = JSONObject().apply {
        put("success", false); put("error", "ads_disabled")
        put("canRequestAds", false); put("consentStatus", "UNKNOWN")
        put("privacyOptionsRequired", false); put("privacyOptionsStatus", "UNKNOWN")
        put("inProgress", false); put("debugEnabled", false)
    }

    @JavascriptInterface
    fun adsLoadInterstitial() {
        if (!gate.allows("adsLoadInterstitial")) return
        adsLoadInterstitial("")
    }

    @JavascriptInterface
    fun adsLoadInterstitial(adUnitId: String) {
        if (!gate.allows("adsLoadInterstitial")) return
        val id = adUnitId.trim().ifBlank { adMobBridge?.interstitialId ?: "" }
        if (id.isNotBlank()) {
            adMobBridge?.loadInterstitial(id)
        } else {
            emit("adFailedToLoad", JSONObject().apply { put("message", "Interstitial Ad Unit ID not configured") })
        }
    }

    @JavascriptInterface
    fun loadInterstitialAd() {
        if (!gate.allows("loadInterstitialAd")) return
        adsLoadInterstitial("")
    }

    @JavascriptInterface
    fun loadInterstitialAd(adUnitId: String) {
        if (!gate.allows("loadInterstitialAd")) return
        adsLoadInterstitial(adUnitId)
    }

    @JavascriptInterface
    fun adsShowInterstitial() {
        if (!gate.allows("adsShowInterstitial")) return
        adMobBridge?.showInterstitial()
            ?: emit("adFailedToShow", JSONObject().apply { put("message", "AdMob not configured") })
    }

    @JavascriptInterface
    fun showInterstitialAd() {
        if (!gate.allows("showInterstitialAd")) return
        adsShowInterstitial()
    }

    @JavascriptInterface
    fun isInterstitialAdLoaded(): Boolean {
        if (!gate.allows("isInterstitialAdLoaded")) return false
        return adMobBridge?.isInterstitialLoaded() ?: false
    }

    @JavascriptInterface
    fun adsLoadRewarded() {
        if (!gate.allows("adsLoadRewarded")) return
        adsLoadRewarded("")
    }

    @JavascriptInterface
    fun adsLoadRewarded(adUnitId: String) {
        if (!gate.allows("adsLoadRewarded")) return
        val id = adUnitId.trim().ifBlank { adMobBridge?.rewardedId ?: "" }
        if (id.isNotBlank()) {
            adMobBridge?.loadRewarded(id)
        } else {
            emit("adFailedToLoad", JSONObject().apply { put("message", "Rewarded Ad Unit ID not configured") })
        }
    }

    @JavascriptInterface
    fun loadRewardedAd() {
        if (!gate.allows("loadRewardedAd")) return
        adsLoadRewarded("")
    }

    @JavascriptInterface
    fun loadRewardedAd(adUnitId: String) {
        if (!gate.allows("loadRewardedAd")) return
        adsLoadRewarded(adUnitId)
    }

    @JavascriptInterface
    fun adsShowRewarded() {
        if (!gate.allows("adsShowRewarded")) return
        adsShowRewarded("")
    }

    @JavascriptInterface
    fun adsShowRewarded(callbackName: String) {
        if (!gate.allows("adsShowRewarded")) return
        showRewardedAd(callbackName)
    }

    @JavascriptInterface
    fun showRewardedAd() {
        if (!gate.allows("showRewardedAd")) return
        adsShowRewarded("")
    }

    @JavascriptInterface
    fun showRewardedAd(callbackName: String) {
        if (!gate.allows("showRewardedAd")) return
        adMobBridge?.showRewarded(callbackName.trim().takeIf { it.isNotBlank() })
            ?: emit("adFailedToShow", JSONObject().apply { put("message", "AdMob not configured") })
    }

    @JavascriptInterface
    fun isRewardedAdLoaded(): Boolean {
        if (!gate.allows("isRewardedAdLoaded")) return false
        return adMobBridge?.isRewardedLoaded() ?: false
    }

    @JavascriptInterface
    fun adsLoadBanner() {
        if (!gate.allows("adsLoadBanner")) return
        adsLoadBanner("", "bottom")
    }

    @JavascriptInterface
    fun adsLoadBanner(adUnitId: String) {
        if (!gate.allows("adsLoadBanner")) return
        adsLoadBanner(adUnitId, "bottom")
    }

    @JavascriptInterface
    fun adsLoadBanner(adUnitId: String, position: String) {
        if (!gate.allows("adsLoadBanner")) return
        val id = adUnitId.trim().ifBlank { adMobBridge?.bannerId ?: "" }
        if (id.isNotBlank()) {
            adMobBridge?.loadBanner(id, position)
        } else {
            emit("adFailedToLoad", JSONObject().apply { put("message", "Banner Ad Unit ID not configured") })
        }
    }

    @JavascriptInterface
    fun loadBannerAd() {
        if (!gate.allows("loadBannerAd")) return
        adsLoadBanner()
    }

    @JavascriptInterface
    fun loadBannerAd(adUnitId: String) {
        if (!gate.allows("loadBannerAd")) return
        adsLoadBanner(adUnitId)
    }

    @JavascriptInterface
    fun loadBannerAd(adUnitId: String, position: String) {
        if (!gate.allows("loadBannerAd")) return
        adsLoadBanner(adUnitId, position)
    }

    @JavascriptInterface
    fun adsShowBanner() {
        if (!gate.allows("adsShowBanner")) return
        showBannerAd()
    }

    @JavascriptInterface
    fun adsShowBanner(position: String) {
        if (!gate.allows("adsShowBanner")) return
        showBannerAd(position)
    }

    @JavascriptInterface
    fun showBannerAd() {
        if (!gate.allows("showBannerAd")) return
        adMobBridge?.showBanner()
    }

    @JavascriptInterface
    fun showBannerAd(position: String) {
        if (!gate.allows("showBannerAd")) return
        adMobBridge?.let {
            it.setBannerPosition(position)
            it.showBanner()
        }
    }

    @JavascriptInterface
    fun adsHideBanner() {
        if (!gate.allows("adsHideBanner")) return
        adMobBridge?.hideBanner()
    }

    @JavascriptInterface
    fun hideBannerAd() {
        if (!gate.allows("hideBannerAd")) return
        adsHideBanner()
    }

    @JavascriptInterface
    fun isBannerAdLoaded(): Boolean {
        if (!gate.allows("isBannerAdLoaded")) return false
        return adMobBridge?.isBannerLoaded() ?: false
    }

    // --- HTTP Cleartext Bridge ---
    @JavascriptInterface
    fun httpGet(url: String, callbackId: String) {
        if (!gate.allows("httpGet")) return
        Thread {
            try {
                var currentUrl = url
                var redirects = 0
                var conn: java.net.HttpURLConnection
                while (true) {
                    val urlObj = java.net.URL(currentUrl)
                    conn = urlObj.openConnection() as java.net.HttpURLConnection
                    conn.instanceFollowRedirects = false
                    conn.connectTimeout = 15000
                    conn.readTimeout = 30000
                    try {
                        conn.setRequestProperty("User-Agent", activity.webView.settings.userAgentString)
                    } catch (_: Throwable) {}
                    conn.connect()
                    val code = conn.responseCode
                    if ((code in 301..303 || code == 307 || code == 308) && redirects < 5) {
                        val location = conn.getHeaderField("Location")
                        if (!location.isNullOrBlank()) {
                            currentUrl = java.net.URL(urlObj, location).toString()
                            redirects++
                            conn.disconnect()
                            continue
                        }
                    }
                    break
                }
                val stream = if (conn.responseCode in 200..299) conn.inputStream else (conn.errorStream ?: conn.inputStream)
                val body = stream?.bufferedReader()?.use { it.readText() } ?: ""
                emit("httpResult", JSONObject().apply {
                    put("callbackId", callbackId)
                    put("status", conn.responseCode)
                    put("body", body)
                    put("success", conn.responseCode in 200..299)
                })
            } catch (e: Exception) {
                emit("httpResult", JSONObject().apply {
                    put("callbackId", callbackId)
                    put("success", false)
                    put("error", e.message ?: "Network error")
                })
            }
        }.start()
    }

    private fun runOnUiThread(action: () -> Unit) {
        mainHandler.post(action)
    }

    private fun sensorTypeToInt(type: String): Int {
        return when (type.lowercase(Locale.ROOT)) {
            "accelerometer" -> Sensor.TYPE_ACCELEROMETER
            "gyroscope" -> Sensor.TYPE_GYROSCOPE
            "magnetometer" -> Sensor.TYPE_MAGNETIC_FIELD
            "stepcounter" -> Sensor.TYPE_STEP_COUNTER
            "orientation" -> Sensor.TYPE_ROTATION_VECTOR
            "light" -> Sensor.TYPE_LIGHT
            "proximity" -> Sensor.TYPE_PROXIMITY
            else -> -1
        }
    }

    private fun base64ToBitmap(base64: String): android.graphics.Bitmap? {
        return try {
            val clean = base64.substringAfter(",")
            val bytes = android.util.Base64.decode(clean, android.util.Base64.DEFAULT)
            android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
        } catch (_: Exception) {
            null
        }
    }

    // --- Blob downloads ---

    /**
     * Called from the injected click interceptor in MainActivity when the
     * user taps (or JS clicks) an <a download> element pointing to a blob: URL.
     * Fetches the blob via JS, converts it to a data URL and forwards it to
     * onBlobDownloaded(...) for persistence through MediaStore.
     */
    @JavascriptInterface
    fun downloadBlobUrl(blobUrl: String, fileName: String, mimeType: String) {
        downloadBlobUrlIn(null, INTERFACE_NAME, blobUrl, fileName, mimeType)
    }

    /**
     * Blob URL'leri yalniz olusturulduklari belgede okunabilir; popup'taki bir blob ana WebView'dan
     * fetch edilemiyordu. [target] null ise ana WebView kullanilir.
     */
    fun downloadBlobUrlIn(target: android.webkit.WebView?, bridgeName: String, blobUrl: String, fileName: String, mimeType: String) {
        if (blobUrl.startsWith("data:")) {
            activity.downloadDataUri(blobUrl, fileName, mimeType)
            return
        }
        val safeUrl = JSONObject.quote(blobUrl)
        val safeFileName = JSONObject.quote(fileName)
        val safeMimeType = JSONObject.quote(mimeType)
        val script = """
            (function() {
                const url = ${safeUrl};
                const bridge = window[${JSONObject.quote(bridgeName)}];
                fetch(url)
                    .then(response => response.blob())
                    .then(blob => {
                        const reader = new FileReader();
                        reader.onloadend = function() {
                            if (bridge && bridge.onBlobDownloaded) {
                                bridge.onBlobDownloaded(reader.result, ${safeFileName}, blob.type || ${safeMimeType});
                            }
                        };
                        reader.onerror = function() {
                            if (bridge && bridge.onBlobDownloadError) {
                                bridge.onBlobDownloadError('Failed to read blob');
                            }
                        };
                        reader.readAsDataURL(blob);
                    })
                    .catch(error => {
                        if (bridge && bridge.onBlobDownloadError) {
                            bridge.onBlobDownloadError(error.message || 'Failed to fetch blob');
                        }
                    });
            })();
        """.trimIndent()
        activity.runOnUiThread {
            (target ?: activity.webView).evaluateJavascript(script, null)
        }
    }

    @JavascriptInterface
    fun downloadDataUri(dataUri: String, fileName: String, mimeType: String) {
        activity.downloadDataUri(dataUri, fileName, mimeType)
    }

    @JavascriptInterface
    fun onBlobDownloaded(dataUrl: String, fileName: String, mimeType: String) {
        activity.downloadDataUri(dataUrl, fileName, mimeType)
    }

    @JavascriptInterface
    fun onBlobDownloadError(message: String) {
        android.util.Log.e("AndroidAPI", "Blob download error: $message")
        emit("blobDownloadError", JSONObject().apply {
            put("message", message)
        })
    }

    /** Indirme sonucunu JS'e bildirir; daha once yalnizca Toast gosteriliyordu. */
    fun onDownloadResult(fileName: String, success: Boolean, error: String?) {
        emit("downloadResult", JSONObject().apply {
            put("fileName", fileName)
            put("success", success)
            put("error", error ?: "")
        })
    }
}

/**
 * JS'ten gelen "[300,100,300]" biçimindeki titreşim desenini LongArray'e çevirir.
 * En fazla 32 adım kabul edilir; uzun desenler titreşim servisini meşgul bırakabiliyor.
 * org.json yerine düz metin ayrıştırması kullanılıyor ki birim testte (stub android.jar)
 * "not mocked" hatasıyla değil, gercek girdi davranisiyla sinansin.
 */
internal fun parseVibratePattern(patternJson: String): LongArray? {
    val text = patternJson.trim()
    if (!text.startsWith("[") || !text.endsWith("]")) return null
    val parts = text.removeSurrounding("[", "]").split(',')
    if (parts.isEmpty() || parts.size > 32 || parts.any { it.isBlank() }) return null
    return try {
        LongArray(parts.size) { index ->
            val value = parts[index].trim().toLong()
            if (value < 0) return null
            value
        }
    } catch (_: Exception) {
        null
    }
}

/**
 * Pencere parlaklığı WindowManager.LayoutParams 0..1 aralığında değer ister; -1 sistem
 * varsayılanına döner. WRITE_SETTINGS istemeden yalnızca kendi ekranı ayarlanır.
 */
internal fun normalizeScreenBrightness(value: Float): Float {
    return when {
        value < 0f -> -1f
        value > 1f -> 1f
        else -> value
    }
}

/**
 * Uygulama-ozel dosya adlarini dogrular: mutlak yol, ters bölü ve ".." segmentlerini reddeder.
 * Alt klasor kullanimina izin verilir (proje klasörleri "altklsor/veri.json" yazabiliyor).
 */
internal fun isSafeAppFileName(name: String): Boolean {
    if (name.isBlank() || name.length > 200) return false
    if (name.startsWith("/")) return false
    if (name.contains('\\')) return false
    return name.split('/').none { it == ".." || it.isEmpty() }
}

/**
 * Popup WebView'lara verilen dar kopru: yalniz indirme. AndroidAPI'nin geri kalani (dosya, kamera,
 * konum...) popup'ta acilan ucuncu taraf sayfalara bilerek acilmaz.
 */
class PopupDownloadBridge(
    private val activity: MainActivity,
    private val api: AndroidAPI,
    private val target: android.webkit.WebView
) {
    @JavascriptInterface
    fun downloadBlobUrl(blobUrl: String, fileName: String, mimeType: String) {
        api.downloadBlobUrlIn(target, NAME, blobUrl, fileName, mimeType)
    }

    @JavascriptInterface
    fun downloadDataUri(dataUri: String, fileName: String, mimeType: String) {
        activity.downloadDataUri(dataUri, fileName, mimeType)
    }

    @JavascriptInterface
    fun onBlobDownloaded(dataUrl: String, fileName: String, mimeType: String) {
        activity.downloadDataUri(dataUrl, fileName, mimeType)
    }

    @JavascriptInterface
    fun onBlobDownloadError(message: String) {
        api.onBlobDownloadError(message)
    }

    companion object {
        const val NAME = "HtmlToApkDownloads"
    }
}
