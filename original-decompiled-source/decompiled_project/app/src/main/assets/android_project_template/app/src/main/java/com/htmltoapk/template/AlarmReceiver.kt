package {{packageName}}

import android.app.AlarmManager
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import org.json.JSONObject

/**
 * Zamanli bildirim alarmlari.
 *
 * Alarm kayitlari SharedPreferences'e yazilir: AlarmManager kayitlari telefon yeniden
 * baslayinca, uygulama guncellenince veya OEM tarafindan oldurulunce siliniyor; kalici
 * kayit olmadan "uygulama kapaliyken hatirlatma calismiyor" sikayeti kaacinilmaz oluyordu.
 */
class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED == intent.action ||
            Intent.ACTION_MY_PACKAGE_REPLACED == intent.action ||
            ACTION_RESTORE == intent.action
        ) {
            rescheduleAll(context)
            return
        }

        val id = intent.getStringExtra(EXTRA_ID) ?: return
        val title = intent.getStringExtra(EXTRA_TITLE) ?: ""
        val message = intent.getStringExtra(EXTRA_MESSAGE) ?: ""
        val repeatIntervalMs = intent.getLongExtra(EXTRA_REPEAT_INTERVAL_MS, 0L)

        showNotification(context, id, title, message)

        if (repeatIntervalMs > 0L) {
            val nextAt = System.currentTimeMillis() + repeatIntervalMs
            AlarmStore.save(context, id, title, message, nextAt, repeatIntervalMs)
            scheduleAlarm(context, id, title, message, nextAt, repeatIntervalMs)
        } else {
            // Tek kullanimlik alarm tetiklendi; kayit silinmezse her boot'ta tekrar tekrar kurilir.
            AlarmStore.remove(context, id)
        }
    }

    private fun showNotification(context: Context, id: String, title: String, message: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(context, android.Manifest.permission.POST_NOTIFICATIONS)
            != android.content.pm.PackageManager.PERMISSION_GRANTED
        ) {
            Log.w(TAG, "Notification '$id' dropped: POST_NOTIFICATIONS not granted")
            return
        }
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Scheduled Notifications",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }
        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle(title)
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .build()
        notificationManager.notify(id.hashCode(), notification)
    }

    companion object {
        private const val TAG = "AlarmReceiver"
        private const val CHANNEL_ID = "htmltoapk_scheduled_channel"
        private const val EXTRA_ID = "id"
        private const val EXTRA_TITLE = "title"
        private const val EXTRA_MESSAGE = "message"
        private const val EXTRA_REPEAT_INTERVAL_MS = "repeatIntervalMs"

        /** Boot/yeniden kurma sonrasi kayitli alarmlari yeniden kurmak icin kendi kendine broadcast. */
        const val ACTION_RESTORE = "{{packageName}}.RESTORE_ALARMS"

        data class ScheduleOutcome(val success: Boolean, val exact: Boolean) {
            val warning: String get() = if (!success) "alarm_failed" else if (!exact) "inexact_alarm" else ""
        }

        fun canScheduleExactAlarms(context: Context): Boolean {
            val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                try {
                    alarmManager.canScheduleExactAlarms()
                } catch (_: Exception) {
                    false
                }
            } else {
                true
            }
        }

        fun scheduleAlarm(
            context: Context,
            id: String,
            title: String,
            message: String,
            triggerAtMillis: Long,
            repeatIntervalMs: Long = 0L
        ): ScheduleOutcome {
            AlarmStore.save(context, id, title, message, triggerAtMillis, repeatIntervalMs)
            return armAlarm(context, id, title, message, triggerAtMillis, repeatIntervalMs)
        }

        private fun armAlarm(
            context: Context,
            id: String,
            title: String,
            message: String,
            triggerAtMillis: Long,
            repeatIntervalMs: Long
        ): ScheduleOutcome {
            return try {
                val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
                val intent = Intent(context, AlarmReceiver::class.java).apply {
                    putExtra(EXTRA_ID, id)
                    putExtra(EXTRA_TITLE, title)
                    putExtra(EXTRA_MESSAGE, message)
                    putExtra(EXTRA_REPEAT_INTERVAL_MS, repeatIntervalMs)
                }
                val flags = PendingIntent.FLAG_UPDATE_CURRENT or
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0
                val pendingIntent = PendingIntent.getBroadcast(context, id.hashCode(), intent, flags)

                val canExact = Build.VERSION.SDK_INT < Build.VERSION_CODES.S || canScheduleExactAlarms(context)
                if (canExact) {
                    try {
                        alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAtMillis, pendingIntent)
                        return ScheduleOutcome(success = true, exact = true)
                    } catch (_: SecurityException) {
                        // Asagidaki gayri-mutlu yola duser; cagiran "inexact_alarm" uyarisi alir.
                    }
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    alarmManager.setAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAtMillis, pendingIntent)
                } else {
                    alarmManager.set(AlarmManager.RTC_WAKEUP, triggerAtMillis, pendingIntent)
                }
                ScheduleOutcome(success = true, exact = false)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to schedule alarm", e)
                ScheduleOutcome(success = false, exact = false)
            }
        }

        /**
         * Boot / uygulama guncellemesi / OEM kill sonrasinda kayitli her seyi yeniden kurar.
         * AlarmManager listesi bu durumlarda sifirlanir; kayit olmadan hatirlatma bir daha gelmez.
         */
        fun rescheduleAll(context: Context) {
            val now = System.currentTimeMillis()
            AlarmStore.all(context).forEach { record ->
                val nextAt = nextTriggerAt(record.triggerAt, record.repeatIntervalMs, now)
                if (nextAt == null) {
                    AlarmStore.remove(context, record.id)
                } else {
                    if (nextAt != record.triggerAt) {
                        AlarmStore.save(context, record.id, record.title, record.message, nextAt, record.repeatIntervalMs)
                    }
                    armAlarm(context, record.id, record.title, record.message, nextAt, record.repeatIntervalMs)
                }
            }
        }

        /**
         * Yeniden kurulacak ani hesaplar: null = suresi gecmis tek seferlik kayit (dusurulecek).
         * Saf fonksiyon: birim testte dogrudan olculur.
         */
        internal fun nextTriggerAt(storedTriggerAt: Long, repeatIntervalMs: Long, now: Long): Long? {
            if (repeatIntervalMs > 0L) {
                if (storedTriggerAt > now) return storedTriggerAt
                val elapsed = now - storedTriggerAt
                val steps = (elapsed / repeatIntervalMs) + 1L
                return storedTriggerAt + steps * repeatIntervalMs
            }
            return if (storedTriggerAt > now) storedTriggerAt else null
        }

        fun cancelAlarm(context: Context, id: String) {
            val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
            val intent = Intent(context, AlarmReceiver::class.java)
            val flags = PendingIntent.FLAG_UPDATE_CURRENT or
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0
            val pendingIntent = PendingIntent.getBroadcast(context, id.hashCode(), intent, flags)
            alarmManager.cancel(pendingIntent)
            pendingIntent.cancel()
            AlarmStore.remove(context, id)
        }
    }
}

/** AlarmManager kayitlari kalici olmadigi icin zamanlanan her sey buraya yazilir. */
internal data class AlarmRecord(
    val id: String,
    val title: String,
    val message: String,
    val triggerAt: Long,
    val repeatIntervalMs: Long
)

internal object AlarmStore {
    private const val PREFS = "htmltoapk_alarms"

    fun save(context: Context, id: String, title: String, message: String, triggerAt: Long, repeatIntervalMs: Long) {
        try {
            val payload = JSONObject().apply {
                put("title", title)
                put("message", message)
                put("triggerAt", triggerAt)
                put("repeat", repeatIntervalMs)
            }
            context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putString(id, payload.toString()).apply()
        } catch (e: Exception) {
            Log.w("AlarmStore", "save failed: ${e.message}")
        }
    }

    fun remove(context: Context, id: String) {
        try {
            context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().remove(id).apply()
        } catch (e: Exception) {
            Log.w("AlarmStore", "remove failed: ${e.message}")
        }
    }

    fun all(context: Context): List<AlarmRecord> {
        return try {
            val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            prefs.all.mapNotNull { (key, value) ->
                try {
                    val json = JSONObject(value as String)
                    AlarmRecord(
                        id = key,
                        title = json.optString("title"),
                        message = json.optString("message"),
                        triggerAt = json.optLong("triggerAt"),
                        repeatIntervalMs = json.optLong("repeat")
                    )
                } catch (e: Exception) {
                    // Sesli dus: bozuk kayit buraya yazildiginda hatirlatmanin neden
                    // calismadigi logcat'ten gorulebilmeli (bol. 1/9 "sessiz donus yok").
                    Log.w("AlarmStore", "skipping corrupt record '$key': ${e.message}")
                    null
                }
            }
        } catch (e: Exception) {
            Log.w("AlarmStore", "kayitli hatirlatmalar okunamadi: ${e.message}")
            emptyList()
        }
    }
}
