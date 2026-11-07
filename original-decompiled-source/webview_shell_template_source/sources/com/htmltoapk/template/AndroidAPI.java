package com.htmltoapk.template;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaRecorder;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.qe;
import com.htmltoapk.template.AlarmReceiver;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AndroidAPI {
    public static final Companion Companion = new Companion(null);
    public static final String INTERFACE_NAME = "AndroidAPI";
    private static final long LOCATION_FRESH_MS = 60000;
    private static final long LOCATION_TIMEOUT_MS = 15000;
    public static final long MAX_BASE64_FILE_BYTES = 16777216;
    private static final String NOTIF_CHANNEL = "htmltoapk_channel";
    private static final String TAG = "AndroidAPI";
    private final Map<String, SensorHolder> activeSensors;
    private final WebViewActivity activity;
    private final AdMobBridge adMobBridge;
    private File audioRecordingFile;
    private final d5.b clipboard$delegate;
    private final BridgeGate gate;
    private final d5.b geocoder$delegate;
    private final boolean isPro;
    private LocationListener locationListener;
    private final d5.b locationManager$delegate;
    private Runnable locationTimeoutRunnable;
    private final Handler mainHandler;
    private MediaRecorder mediaRecorder;
    private final d5.b notificationManager$delegate;
    private String pendingLocationCallbackId;
    private d5.g<String, String, String> pendingNotification;
    private Boolean pendingTorchEnabled;
    private final d5.b sensorManager$delegate;
    private LocationListener singleLocationListener;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class SensorHolder {
        private final String callbackId;
        private final SensorEventListener listener;
        private final int type;

        public SensorHolder(int i6, SensorEventListener sensorEventListener, String str) {
            kotlin.jvm.internal.j.e("listener", sensorEventListener);
            kotlin.jvm.internal.j.e("callbackId", str);
            this.type = i6;
            this.listener = sensorEventListener;
            this.callbackId = str;
        }

        public static /* synthetic */ SensorHolder copy$default(SensorHolder sensorHolder, int i6, SensorEventListener sensorEventListener, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i6 = sensorHolder.type;
            }
            if ((i7 & 2) != 0) {
                sensorEventListener = sensorHolder.listener;
            }
            if ((i7 & 4) != 0) {
                str = sensorHolder.callbackId;
            }
            return sensorHolder.copy(i6, sensorEventListener, str);
        }

        public final int component1() {
            return this.type;
        }

        public final SensorEventListener component2() {
            return this.listener;
        }

        public final String component3() {
            return this.callbackId;
        }

        public final SensorHolder copy(int i6, SensorEventListener sensorEventListener, String str) {
            kotlin.jvm.internal.j.e("listener", sensorEventListener);
            kotlin.jvm.internal.j.e("callbackId", str);
            return new SensorHolder(i6, sensorEventListener, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SensorHolder)) {
                return false;
            }
            SensorHolder sensorHolder = (SensorHolder) obj;
            return this.type == sensorHolder.type && kotlin.jvm.internal.j.a(this.listener, sensorHolder.listener) && kotlin.jvm.internal.j.a(this.callbackId, sensorHolder.callbackId);
        }

        public final String getCallbackId() {
            return this.callbackId;
        }

        public final SensorEventListener getListener() {
            return this.listener;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return this.callbackId.hashCode() + ((this.listener.hashCode() + (Integer.hashCode(this.type) * 31)) * 31);
        }

        public String toString() {
            int i6 = this.type;
            SensorEventListener sensorEventListener = this.listener;
            String str = this.callbackId;
            StringBuilder sb = new StringBuilder("SensorHolder(type=");
            sb.append(i6);
            sb.append(", listener=");
            sb.append(sensorEventListener);
            sb.append(", callbackId=");
            return androidx.activity.m.e(sb, str, ")");
        }
    }

    public AndroidAPI(WebViewActivity webViewActivity, boolean z6, AdMobBridge adMobBridge, BridgeGate bridgeGate) {
        kotlin.jvm.internal.j.e("activity", webViewActivity);
        kotlin.jvm.internal.j.e("gate", bridgeGate);
        this.activity = webViewActivity;
        this.isPro = z6;
        this.adMobBridge = adMobBridge;
        this.gate = bridgeGate;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.sensorManager$delegate = androidx.activity.c0.g(new t(1, this));
        this.activeSensors = new LinkedHashMap();
        this.locationManager$delegate = androidx.activity.c0.g(new e0(0, this));
        this.notificationManager$delegate = androidx.activity.c0.g(new s(this, 2));
        this.clipboard$delegate = androidx.activity.c0.g(new f0(0, this));
        this.geocoder$delegate = androidx.activity.c0.g(new h(1, this));
    }

    private final void applyTorch(boolean z6) throws JSONException, CameraAccessException {
        Object systemService = getContext().getSystemService("camera");
        CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
        if (cameraManager == null) {
            emitTorchResult(z6, false, "CameraManager not available");
            return;
        }
        try {
            String strFindTorchCameraId = findTorchCameraId(cameraManager);
            if (strFindTorchCameraId == null) {
                emitTorchResult(z6, false, "No camera with flashlight found");
            } else {
                cameraManager.setTorchMode(strFindTorchCameraId, z6);
                emitTorchResult(z6, true, null);
            }
        } catch (CameraAccessException e6) {
            emitTorchResult(z6, false, e6.getMessage());
        }
    }

    private final Bitmap base64ToBitmap(String str) {
        try {
            byte[] bArrDecode = Base64.decode(x5.o.C(str, ",", str), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j capturePhoto$lambda$61(AndroidAPI androidAPI, String str) throws JSONException, PackageManager.NameNotFoundException {
        androidAPI.activity.capturePhoto(str, false);
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j capturePhoto$lambda$62(AndroidAPI androidAPI, String str, String str2) throws JSONException, PackageManager.NameNotFoundException {
        androidAPI.activity.capturePhoto(str, x5.l.k(str2, "front"));
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClipboardManager clipboard_delegate$lambda$4(AndroidAPI androidAPI) {
        Object systemService = androidAPI.getContext().getSystemService("clipboard");
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.content.ClipboardManager", systemService);
        return (ClipboardManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void compressImage$lambda$65(String str, AndroidAPI androidAPI, String str2, int i6, int i7) throws Throwable {
        Throwable th;
        Bitmap bitmap;
        AndroidAPI androidAPI2;
        String str3;
        OutOfMemoryError outOfMemoryError;
        Bitmap bitmapDecodeByteArray;
        Exception exc;
        String message;
        String strC;
        Bitmap bitmap2 = null;
        try {
            try {
                try {
                    try {
                        strC = x5.o.C(str, ",", str);
                        try {
                        } catch (Exception e6) {
                            e = e6;
                            exc = e;
                            bitmapDecodeByteArray = null;
                            message = exc.getMessage();
                            if (message == null) {
                                message = "compress_failed";
                            }
                            androidAPI2.emitImageResult(str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, 0, 0L, message);
                            if (0 != 0 && null != bitmapDecodeByteArray) {
                                bitmap2.recycle();
                            }
                            if (bitmapDecodeByteArray == null) {
                                return;
                            }
                            bitmapDecodeByteArray.recycle();
                            return;
                        } catch (OutOfMemoryError e7) {
                            e = e7;
                            outOfMemoryError = e;
                            bitmapDecodeByteArray = null;
                            Log.e("AndroidAPI", "compressImage OOM", outOfMemoryError);
                            androidAPI2.emitImageResult(str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, 0, 0L, "image_too_large");
                            if (0 != 0 && null != bitmapDecodeByteArray) {
                                bitmap2.recycle();
                            }
                            if (bitmapDecodeByteArray == null) {
                                return;
                            }
                            bitmapDecodeByteArray.recycle();
                            return;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = 0;
                    if (0 != 0 && 0 != bitmap) {
                        try {
                            bitmap2.recycle();
                        } catch (Exception unused2) {
                            throw th;
                        }
                    }
                    if (bitmap == 0) {
                        throw th;
                    }
                    bitmap.recycle();
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
                androidAPI2 = androidAPI;
                str3 = str2;
            } catch (OutOfMemoryError e9) {
                e = e9;
                androidAPI2 = androidAPI;
                str3 = str2;
            }
            if (strC.length() == 0) {
                androidAPI.emitImageResult(str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, 0, 0L, "invalid_data");
                return;
            }
            androidAPI2 = androidAPI;
            str3 = str2;
            byte[] bArrDecode = Base64.decode(strC, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
            if (options.outWidth > 0 && options.outHeight > 0) {
                if (16 > i6 || i6 >= 10001) {
                    i6 = 1280;
                }
                int i8 = 1;
                while (true) {
                    int i9 = i8 * 2;
                    if (options.outWidth / i9 < i6) {
                        break;
                    } else {
                        i8 = i9;
                    }
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i8;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options2);
                try {
                } catch (Exception e10) {
                    exc = e10;
                    message = exc.getMessage();
                    if (message == null) {
                    }
                    androidAPI2.emitImageResult(str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, 0, 0L, message);
                    if (0 != 0) {
                        bitmap2.recycle();
                    }
                    if (bitmapDecodeByteArray == null) {
                    }
                    bitmapDecodeByteArray.recycle();
                    return;
                } catch (OutOfMemoryError e11) {
                    outOfMemoryError = e11;
                    Log.e("AndroidAPI", "compressImage OOM", outOfMemoryError);
                    androidAPI2.emitImageResult(str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, 0, 0L, "image_too_large");
                    if (0 != 0) {
                        bitmap2.recycle();
                    }
                    if (bitmapDecodeByteArray == null) {
                    }
                    bitmapDecodeByteArray.recycle();
                    return;
                }
                if (bitmapDecodeByteArray == null) {
                    androidAPI2.emitImageResult(str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, 0, bArrDecode.length, "decode_failed");
                    return;
                }
                float width = i6 / bitmapDecodeByteArray.getWidth();
                if (width > 1.0f) {
                    width = 1.0f;
                }
                int width2 = (int) (bitmapDecodeByteArray.getWidth() * width);
                int i10 = width2 < 1 ? 1 : width2;
                int height = (int) (bitmapDecodeByteArray.getHeight() * width);
                int i11 = height < 1 ? 1 : height;
                Bitmap bitmapCreateScaledBitmap = width < 1.0f ? Bitmap.createScaledBitmap(bitmapDecodeByteArray, i10, i11, true) : bitmapDecodeByteArray;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                kotlin.jvm.internal.j.b(bitmapCreateScaledBitmap);
                String strEncodeToString = bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, u5.d.p(i7, 1, 100), byteArrayOutputStream) ? Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                kotlin.jvm.internal.j.b(strEncodeToString);
                if (strEncodeToString.length() == 0) {
                    androidAPI2.emitImageResult(str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, i10, i11, bArrDecode.length, "compress_failed");
                } else {
                    androidAPI2.emitImageResult(str3, "data:image/jpeg;base64," + strEncodeToString, i10, i11, byteArrayOutputStream.size(), null);
                }
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapCreateScaledBitmap.recycle();
                }
                bitmapDecodeByteArray.recycle();
                return;
            }
            androidAPI2.emitImageResult(str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, 0, bArrDecode.length, "decode_failed");
        } catch (Throwable th3) {
            th = th3;
            bitmap = androidAPI;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j copyToClipboard$lambda$76(AndroidAPI androidAPI, String str) {
        try {
            androidAPI.getClipboard().setPrimaryClip(ClipData.newPlainText("text", str));
        } catch (Exception unused) {
        }
        return d5.j.f12745a;
    }

    private final Vibrator defaultVibrator() {
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = getContext().getSystemService("vibrator_manager");
            VibratorManager vibratorManagerE = b4.a.o(systemService) ? androidx.camera.camera2.internal.compat.quirk.b.e(systemService) : null;
            if (vibratorManagerE != null) {
                return vibratorManagerE.getDefaultVibrator();
            }
        } else {
            Object systemService2 = getContext().getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                return (Vibrator) systemService2;
            }
        }
        return null;
    }

    private final JSONObject disabledConsentResult() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("error", "ads_disabled");
        jSONObject.put("canRequestAds", false);
        jSONObject.put("consentStatus", "UNKNOWN");
        jSONObject.put("privacyOptionsRequired", false);
        jSONObject.put("privacyOptionsStatus", "UNKNOWN");
        jSONObject.put("inProgress", false);
        jSONObject.put("debugEnabled", false);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadBlobUrlIn$lambda$132(WebView webView, AndroidAPI androidAPI, String str) {
        if (webView == null) {
            webView = androidAPI.activity.getWebView();
        }
        webView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void emit$lambda$115(AndroidAPI androidAPI, String str) {
        if (androidAPI.gate.isTrustedPage(androidAPI.activity.getWebView().getUrl())) {
            androidAPI.activity.getWebView().evaluateJavascript(str, null);
        }
    }

    private final void emitAddressResult(String str, double d7, double d8, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        jSONObject.put("success", str4 == null && str2.length() > 0);
        jSONObject.put("latitude", d7);
        jSONObject.put("longitude", d8);
        jSONObject.put("address", str2);
        jSONObject.put("countryCode", str3);
        if (str4 == null) {
            str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str4);
        emit$template_adsRelease("addressResult", jSONObject);
    }

    private final void emitAudioFileResult(String str, String str2, String str3, long j6, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        jSONObject.put("fileName", str2);
        jSONObject.put("success", str4 == null && str3.length() > 0);
        jSONObject.put("base64", str3);
        jSONObject.put("mimeType", "audio/mp4");
        jSONObject.put("size", j6);
        if (str4 == null) {
            str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str4);
        emit$template_adsRelease("audioFileResult", jSONObject);
    }

    private final void emitAudioStart(String str, boolean z6, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileName", str);
        jSONObject.put("success", z6);
        if (str3 == null) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("warning", str3);
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str2);
        emit$template_adsRelease("audioRecordingStartResult", jSONObject);
    }

    private final void emitAudioStop(String str, File file, String str2) throws JSONException {
        String absolutePath;
        String name;
        boolean z6 = str2 == null && file != null && file.exists() && file.length() > 0;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        jSONObject.put("success", z6);
        if (z6) {
            kotlin.jvm.internal.j.b(file);
            absolutePath = file.getAbsolutePath();
        } else {
            absolutePath = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("path", absolutePath);
        if (file == null || (name = file.getName()) == null) {
            name = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("fileName", name);
        jSONObject.put("size", file != null ? file.length() : 0L);
        jSONObject.put("mimeType", "audio/mp4");
        if (str2 == null) {
            str2 = z6 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "empty_recording";
        }
        jSONObject.put("error", str2);
        emit$template_adsRelease("audioRecordingResult", jSONObject);
    }

    private final void emitImageResult(String str, String str2, int i6, int i7, long j6, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        jSONObject.put("success", str3 == null && str2.length() > 0);
        jSONObject.put("base64", str2);
        jSONObject.put("width", i6);
        jSONObject.put("height", i7);
        jSONObject.put("bytes", j6);
        if (str3 == null) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str3);
        emit$template_adsRelease("imageCompressResult", jSONObject);
    }

    private final void emitLocationResult(String str, Location location, String str2, boolean z6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        if (location != null) {
            jSONObject.put("success", true);
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            jSONObject.put("accuracy", location.getAccuracy());
            jSONObject.put("provider", location.getProvider());
            jSONObject.put("time", location.getTime());
            jSONObject.put("fromLastKnown", z6);
        } else {
            jSONObject.put("success", false);
        }
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str2);
        emit$template_adsRelease("locationResult", jSONObject);
    }

    public static /* synthetic */ void emitLocationResult$default(AndroidAPI androidAPI, String str, Location location, String str2, boolean z6, int i6, Object obj) throws JSONException {
        if ((i6 & 8) != 0) {
            z6 = false;
        }
        androidAPI.emitLocationResult(str, location, str2, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitLocationUpdate(String str, Location location, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        if (location != null) {
            jSONObject.put("success", true);
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            jSONObject.put("accuracy", location.getAccuracy());
            jSONObject.put("provider", location.getProvider());
            jSONObject.put("time", location.getTime());
        } else if (str2 == null) {
            jSONObject.put("success", true);
        } else {
            jSONObject.put("success", false);
        }
        if (str3 == null) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("status", str3);
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str2);
        emit$template_adsRelease("locationUpdate", jSONObject);
    }

    private final void emitScreenSetting(String str, float f6, boolean z6, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("setting", str);
        jSONObject.put("value", Float.valueOf(f6));
        jSONObject.put("success", z6);
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str2);
        emit$template_adsRelease("screenSettingResult", jSONObject);
    }

    private final void emitShareResult(String str, boolean z6, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("kind", str);
        jSONObject.put("success", z6);
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str2);
        emit$template_adsRelease("shareResult", jSONObject);
    }

    private final void emitTorchResult(boolean z6, boolean z7, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enabled", z6);
        jSONObject.put("success", z7);
        Object obj = str;
        if (str == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("error", obj);
        emit$template_adsRelease("torchResult", jSONObject);
    }

    private final String enabledLocationProvider() {
        if (getLocationManager().isProviderEnabled("gps")) {
            return "gps";
        }
        if (getLocationManager().isProviderEnabled("network")) {
            return "network";
        }
        return null;
    }

    private final boolean ensurePro() throws JSONException {
        if (!this.isPro) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", "This API requires Pro");
            emit$template_adsRelease("proRequired", jSONObject);
        }
        return this.isPro;
    }

    private final String findTorchCameraId(CameraManager cameraManager) throws CameraAccessException {
        String str;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            kotlin.jvm.internal.j.d("getCameraIdList(...)", cameraIdList);
            int length = cameraIdList.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    str = null;
                    break;
                }
                str = cameraIdList[i6];
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                kotlin.jvm.internal.j.d("getCameraCharacteristics(...)", cameraCharacteristics);
                Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (zBooleanValue && num != null && num.intValue() == 1) {
                    break;
                }
                i6++;
            }
            if (str != null) {
                return str;
            }
            String[] cameraIdList2 = cameraManager.getCameraIdList();
            kotlin.jvm.internal.j.d("getCameraIdList(...)", cameraIdList2);
            for (String str2 : cameraIdList2) {
                if (kotlin.jvm.internal.j.a(cameraManager.getCameraCharacteristics(str2).get(CameraCharacteristics.FLASH_INFO_AVAILABLE), Boolean.TRUE)) {
                    return str2;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final void finishSingleLocation(Location location, String str, boolean z6) throws JSONException {
        String str2 = this.pendingLocationCallbackId;
        if (str2 == null) {
            return;
        }
        this.pendingLocationCallbackId = null;
        Runnable runnable = this.locationTimeoutRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.locationTimeoutRunnable = null;
        LocationListener locationListener = this.singleLocationListener;
        if (locationListener != null) {
            try {
                getLocationManager().removeUpdates(locationListener);
            } catch (Exception unused) {
            }
        }
        this.singleLocationListener = null;
        emitLocationResult(str2, location, str, z6);
    }

    public static /* synthetic */ void finishSingleLocation$default(AndroidAPI androidAPI, Location location, String str, boolean z6, int i6, Object obj) throws JSONException {
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        androidAPI.finishSingleLocation(location, str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Geocoder geocoder_delegate$lambda$59(AndroidAPI androidAPI) {
        return new Geocoder(androidAPI.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074 A[PHI: r13
      0x0074: PHI (r13v4 java.lang.String) = (r13v3 java.lang.String), (r13v9 java.lang.String) binds: [B:26:0x0062, B:32:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.location.Geocoder] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [double] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getAddress$lambda$58(AndroidAPI androidAPI, double d7, double d8, String str) throws JSONException, IOException {
        ?? r12;
        double d9;
        double d10;
        Exception exc;
        String str2;
        AndroidAPI androidAPI2;
        String message;
        List<Address> fromLocation;
        String str3;
        String str4;
        try {
            r12 = d7;
            try {
                fromLocation = androidAPI.getGeocoder().getFromLocation(r12, d8, 1);
                d10 = d8;
                d9 = r12;
            } catch (Exception e6) {
                e = e6;
                d10 = d8;
                d9 = r12;
            }
        } catch (Exception e7) {
            e = e7;
            r12 = androidAPI;
            d9 = d7;
            d10 = d8;
        }
        try {
        } catch (Exception e8) {
            e = e8;
            exc = e;
            androidAPI2 = r12;
            message = exc.getMessage();
            if (message == null) {
            }
            androidAPI2.emitAddressResult(str2, d9, d10, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, message);
            return;
        }
        if (fromLocation != null) {
            try {
            } catch (Exception e9) {
                e = e9;
                r12 = androidAPI;
                str2 = str;
                exc = e;
                androidAPI2 = r12;
                message = exc.getMessage();
                if (message == null) {
                }
                androidAPI2.emitAddressResult(str2, d9, d10, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, message);
                return;
            }
            if (!fromLocation.isEmpty()) {
                Address address = fromLocation.get(0);
                u5.c cVar = new u5.c(0, address.getMaxAddressLineIndex(), 1);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = cVar.iterator();
                while (true) {
                    try {
                        String str5 = null;
                        if (!((u5.b) it).f14723u) {
                            break;
                        }
                        try {
                            String addressLine = address.getAddressLine(((e5.v) it).nextInt());
                            if (addressLine != null && !x5.o.v(addressLine)) {
                                str5 = addressLine;
                            }
                            if (str5 != null) {
                                arrayList.add(str5);
                            }
                        } catch (Exception e10) {
                            exc = e10;
                            androidAPI2 = androidAPI;
                            str2 = str;
                        }
                        exc = e10;
                        androidAPI2 = androidAPI;
                        str2 = str;
                    } catch (Exception e11) {
                        androidAPI2 = androidAPI;
                        str2 = str;
                        exc = e11;
                    }
                    message = exc.getMessage();
                    if (message == null) {
                        message = "geocode_failed";
                    }
                    androidAPI2.emitAddressResult(str2, d9, d10, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, message);
                    return;
                }
                String countryCode = address.getCountryCode();
                String strH = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                if (countryCode != null) {
                    str3 = countryCode;
                } else {
                    Locale locale = address.getLocale();
                    countryCode = locale != null ? locale.getCountry() : null;
                    if (countryCode == null) {
                        str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                }
                if (arrayList.isEmpty()) {
                    String locality = address.getLocality();
                    if (locality != null) {
                        str4 = locality;
                    }
                    androidAPI.emitAddressResult(str, d9, d10, str4, str3, null);
                    return;
                }
                strH = e5.q.h(arrayList, ", ", null, 62);
                str4 = strH;
                androidAPI.emitAddressResult(str, d9, d10, str4, str3, null);
                return;
            }
        }
        androidAPI.emitAddressResult(str, d9, d10, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "no_result");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAudioFileBase64$lambda$74(AndroidAPI androidAPI, String str, String str2) throws JSONException {
        File file = new File(androidAPI.getContext().getCacheDir(), str);
        if (!file.exists()) {
            androidAPI.emitAudioFileResult(str2, str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0L, "not_found");
            return;
        }
        if (file.length() > MAX_BASE64_FILE_BYTES) {
            androidAPI.emitAudioFileResult(str2, str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, file.length(), "file_too_large");
            return;
        }
        try {
            String strEncodeToString = Base64.encodeToString(m5.f.j(file), 2);
            kotlin.jvm.internal.j.b(strEncodeToString);
            androidAPI.emitAudioFileResult(str2, str, strEncodeToString, file.length(), null);
        } catch (Exception e6) {
            long length = file.length();
            String message = e6.getMessage();
            if (message == null) {
                message = "read_failed";
            }
            androidAPI.emitAudioFileResult(str2, str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, length, message);
        }
    }

    private final ClipboardManager getClipboard() {
        return (ClipboardManager) this.clipboard$delegate.getValue();
    }

    private final Context getContext() {
        return this.activity;
    }

    private final Geocoder getGeocoder() {
        return (Geocoder) this.geocoder$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j getLocation$lambda$47(AndroidAPI androidAPI, String str) throws JSONException {
        final AndroidAPI androidAPI2;
        d5.j jVar = d5.j.f12745a;
        if (androidAPI.pendingLocationCallbackId != null) {
            finishSingleLocation$default(androidAPI, null, "superseded", false, 4, null);
            androidAPI2 = androidAPI;
        } else {
            androidAPI2 = androidAPI;
        }
        androidAPI2.pendingLocationCallbackId = str;
        try {
            String strEnabledLocationProvider = androidAPI2.enabledLocationProvider();
            if (strEnabledLocationProvider == null) {
                finishSingleLocation$default(androidAPI2, null, "provider_disabled", false, 4, null);
                return jVar;
            }
            Location locationLastKnownLocation = androidAPI2.lastKnownLocation();
            if (locationLastKnownLocation != null) {
                androidAPI2.finishSingleLocation(locationLastKnownLocation, null, true);
                return jVar;
            }
            LocationListener locationListener = new LocationListener() { // from class: com.htmltoapk.template.AndroidAPI$getLocation$1$listener$1
                @Override // android.location.LocationListener
                public void onLocationChanged(Location location) throws JSONException {
                    kotlin.jvm.internal.j.e("location", location);
                    AndroidAPI.finishSingleLocation$default(this.this$0, location, null, false, 4, null);
                }

                @Override // android.location.LocationListener
                public void onProviderDisabled(String str2) {
                    kotlin.jvm.internal.j.e("provider", str2);
                }

                @Override // android.location.LocationListener
                public void onProviderEnabled(String str2) {
                    kotlin.jvm.internal.j.e("provider", str2);
                }

                @Override // android.location.LocationListener
                public void onStatusChanged(String str2, int i6, Bundle bundle) {
                }
            };
            androidAPI2.singleLocationListener = locationListener;
            androidAPI2.getLocationManager().requestSingleUpdate(strEnabledLocationProvider, locationListener, (Looper) null);
            e eVar = new e(1, androidAPI2);
            androidAPI2.locationTimeoutRunnable = eVar;
            androidAPI2.mainHandler.postDelayed(eVar, LOCATION_TIMEOUT_MS);
            return jVar;
        } catch (SecurityException unused) {
            finishSingleLocation$default(androidAPI2, null, "permission_revoked", false, 4, null);
            return jVar;
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "location_failed";
            }
            finishSingleLocation$default(androidAPI2, null, message, false, 4, null);
            return jVar;
        }
    }

    private final LocationManager getLocationManager() {
        return (LocationManager) this.locationManager$delegate.getValue();
    }

    private final NotificationManager getNotificationManager() {
        return (NotificationManager) this.notificationManager$delegate.getValue();
    }

    private final SensorManager getSensorManager() {
        return (SensorManager) this.sensorManager$delegate.getValue();
    }

    private final boolean hasNotificationPermission() {
        return Build.VERSION.SDK_INT < 33 || k0.a.a(getContext(), "android.permission.POST_NOTIFICATIONS") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void httpGet$lambda$130(String str, AndroidAPI androidAPI, String str2) throws JSONException, IOException {
        HttpURLConnection httpURLConnection;
        InputStream errorStream;
        String strC;
        String headerField;
        int i6 = 0;
        while (true) {
            try {
                URL url = new URL(str);
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                kotlin.jvm.internal.j.c("null cannot be cast to non-null type java.net.HttpURLConnection", uRLConnectionOpenConnection);
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(30000);
                try {
                    httpURLConnection.setRequestProperty("User-Agent", androidAPI.activity.getWebView().getSettings().getUserAgentString());
                } catch (Throwable unused) {
                }
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if ((301 > responseCode || responseCode >= 304) && responseCode != 307 && responseCode != 308) {
                    break;
                }
                if (i6 >= 5 || (headerField = httpURLConnection.getHeaderField("Location")) == null || x5.o.v(headerField)) {
                    break;
                }
                String string = new URL(url, headerField).toString();
                i6++;
                httpURLConnection.disconnect();
                str = string;
            } catch (Exception e6) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("callbackId", str2);
                jSONObject.put("success", false);
                String message = e6.getMessage();
                if (message == null) {
                    message = "Network error";
                }
                jSONObject.put("error", message);
                androidAPI.emit$template_adsRelease("httpResult", jSONObject);
                return;
            }
        }
        int responseCode2 = httpURLConnection.getResponseCode();
        if ((200 <= responseCode2 && responseCode2 < 300) || (errorStream = httpURLConnection.getErrorStream()) == null) {
            errorStream = httpURLConnection.getInputStream();
        }
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, x5.a.f15157a), 8192);
            try {
                strC = j3.b.c(bufferedReader);
                bufferedReader.close();
            } finally {
            }
        } else {
            strC = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("callbackId", str2);
        jSONObject2.put("status", httpURLConnection.getResponseCode());
        jSONObject2.put("body", strC);
        int responseCode3 = httpURLConnection.getResponseCode();
        jSONObject2.put("success", 200 <= responseCode3 && responseCode3 < 300);
        androidAPI.emit$template_adsRelease("httpResult", jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j keepScreenOn$lambda$40(boolean z6, AndroidAPI androidAPI) throws JSONException {
        try {
            if (z6) {
                androidAPI.activity.getWindow().addFlags(128);
            } else {
                androidAPI.activity.getWindow().clearFlags(128);
            }
            androidAPI.emitScreenSetting("keepScreenOn", z6 ? 1.0f : 0.0f, true, null);
        } catch (Exception e6) {
            Log.w("AndroidAPI", "keepScreenOn failed: " + e6.getMessage());
            float f6 = z6 ? 1.0f : 0.0f;
            String message = e6.getMessage();
            if (message == null) {
                message = "keep_screen_on_failed";
            }
            androidAPI.emitScreenSetting("keepScreenOn", f6, false, message);
        }
        return d5.j.f12745a;
    }

    @SuppressLint({"MissingPermission"})
    private final Location lastKnownLocation() {
        Object next;
        List listC = e5.l.c("gps", "network", "passive");
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (true) {
            Location lastKnownLocation = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                lastKnownLocation = getLocationManager().getLastKnownLocation((String) it.next());
            } catch (SecurityException unused) {
            }
            if (lastKnownLocation != null) {
                arrayList.add(lastKnownLocation);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long time = ((Location) next).getTime();
                do {
                    Object next2 = it2.next();
                    long time2 = ((Location) next2).getTime();
                    if (time < time2) {
                        next = next2;
                        time = time2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Location location = (Location) next;
        if (location != null && System.currentTimeMillis() - location.getTime() <= LOCATION_FRESH_MS) {
            return location;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listAppFiles$lambda$91(File file) {
        kotlin.jvm.internal.j.e("it", file);
        return file.isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationManager locationManager_delegate$lambda$2(AndroidAPI androidAPI) {
        Object systemService = androidAPI.getContext().getSystemService("location");
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.location.LocationManager", systemService);
        return (LocationManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationManager notificationManager_delegate$lambda$3(AndroidAPI androidAPI) {
        Object systemService = androidAPI.getContext().getSystemService("notification");
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.app.NotificationManager", systemService);
        return (NotificationManager) systemService;
    }

    public static /* synthetic */ void onCameraResult$default(AndroidAPI androidAPI, String str, boolean z6, String str2, String str3, int i6, Object obj) throws JSONException {
        if ((i6 & 8) != 0) {
            str3 = null;
        }
        androidAPI.onCameraResult(str, z6, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j openAppSettings$lambda$45(AndroidAPI androidAPI) throws JSONException {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", androidAPI.getContext().getPackageName(), null));
            intent.addFlags(268435456);
            androidAPI.getContext().startActivity(intent);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("screen", "app");
            jSONObject.put("success", true);
            jSONObject.put("error", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            androidAPI.emit$template_adsRelease("appSettingsResult", jSONObject);
        } catch (Exception e6) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("screen", "app");
            jSONObject2.put("success", false);
            String message = e6.getMessage();
            if (message == null) {
                message = "settings_unavailable";
            }
            jSONObject2.put("error", message);
            androidAPI.emit$template_adsRelease("appSettingsResult", jSONObject2);
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j openExactAlarmSettings$lambda$29(AndroidAPI androidAPI) throws JSONException {
        Intent intent;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.fromParts("package", androidAPI.getContext().getPackageName(), null));
            } else {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", androidAPI.getContext().getPackageName(), null));
            }
            intent.addFlags(268435456);
            androidAPI.getContext().startActivity(intent);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("screen", "exact_alarm");
            jSONObject.put("success", true);
            jSONObject.put("error", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            androidAPI.emit$template_adsRelease("appSettingsResult", jSONObject);
        } catch (Exception e6) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("screen", "exact_alarm");
            jSONObject2.put("success", false);
            String message = e6.getMessage();
            if (message == null) {
                message = "settings_unavailable";
            }
            jSONObject2.put("error", message);
            androidAPI.emit$template_adsRelease("appSettingsResult", jSONObject2);
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j openNotificationSettings$lambda$34(AndroidAPI androidAPI) throws JSONException {
        Intent intent;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", androidAPI.getContext().getPackageName());
            } else {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", androidAPI.getContext().getPackageName(), null));
            }
            intent.addFlags(268435456);
            androidAPI.getContext().startActivity(intent);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("screen", "notifications");
            jSONObject.put("success", true);
            jSONObject.put("error", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            androidAPI.emit$template_adsRelease("appSettingsResult", jSONObject);
        } catch (Exception e6) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("screen", "notifications");
            jSONObject2.put("success", false);
            String message = e6.getMessage();
            if (message == null) {
                message = "settings_unavailable";
            }
            jSONObject2.put("error", message);
            androidAPI.emit$template_adsRelease("appSettingsResult", jSONObject2);
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j pickFile$lambda$89(AndroidAPI androidAPI, String str, String str2) {
        androidAPI.activity.pickFile(str, str2);
        return d5.j.f12745a;
    }

    private final void postNotification(String str, String str2, String str3) throws JSONException {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                com.google.android.gms.ads.internal.util.o.c();
                getNotificationManager().createNotificationChannel(androidx.camera.camera2.internal.compat.b.a());
            }
            i0.m mVar = new i0.m(getContext(), NOTIF_CHANNEL);
            mVar.f13331p.icon = android.R.drawable.ic_dialog_info;
            mVar.f13321e = i0.m.b(str);
            mVar.f13322f = i0.m.b(str2);
            mVar.f13324i = 0;
            mVar.c();
            if (!x5.o.v(str3)) {
                i0.l lVar = new i0.l();
                lVar.f13316b = i0.m.b(str3);
                mVar.e(lVar);
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
            getNotificationManager().notify(iCurrentTimeMillis, mVar.a());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "post");
            jSONObject.put("notificationId", iCurrentTimeMillis);
            jSONObject.put("success", true);
            jSONObject.put("error", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            emit$template_adsRelease("notificationResult", jSONObject);
        } catch (Exception e6) {
            Log.e("AndroidAPI", "showNotification failed", e6);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", "post");
            jSONObject2.put("success", false);
            String message = e6.getMessage();
            if (message == null) {
                message = "notification_failed";
            }
            jSONObject2.put("error", message);
            emit$template_adsRelease("notificationResult", jSONObject2);
        }
    }

    public static /* synthetic */ void postNotification$default(AndroidAPI androidAPI, String str, String str2, String str3, int i6, Object obj) throws JSONException {
        if ((i6 & 4) != 0) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        androidAPI.postNotification(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void printPage$lambda$88(AndroidAPI androidAPI) throws JSONException, Resources.NotFoundException {
        String strPrintCurrentPage$template_adsRelease = androidAPI.activity.printCurrentPage$template_adsRelease();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", strPrintCurrentPage$template_adsRelease == null);
        jSONObject.put("status", strPrintCurrentPage$template_adsRelease == null ? "opened" : "failed");
        if (strPrintCurrentPage$template_adsRelease == null) {
            strPrintCurrentPage$template_adsRelease = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", strPrintCurrentPage$template_adsRelease);
        androidAPI.emit$template_adsRelease("printResult", jSONObject);
    }

    private final boolean releaseRecorderQuietly() throws IllegalStateException {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder == null) {
            return false;
        }
        this.mediaRecorder = null;
        this.audioRecordingFile = null;
        try {
            mediaRecorder.stop();
        } catch (Exception unused) {
        }
        try {
            mediaRecorder.release();
            return true;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j requestNotificationPermission$lambda$21(AndroidAPI androidAPI, String str) {
        androidAPI.activity.requestPermission("android.permission.POST_NOTIFICATIONS", str);
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j requestPermission$lambda$37(AndroidAPI androidAPI, String str, String str2) {
        androidAPI.activity.requestPermission(str, str2);
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j requestPermissions$lambda$38(AndroidAPI androidAPI, List list, String str) {
        androidAPI.activity.requestPermissions((String[]) list.toArray(new String[0]), str);
        return d5.j.f12745a;
    }

    private final void runOnUiThread(p5.a<d5.j> aVar) {
        this.mainHandler.post(new androidx.camera.core.processing.p(5, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j saveToGallery$lambda$98(AndroidAPI androidAPI, String str, String str2, String str3) throws JSONException, IOException {
        boolean z6;
        Bitmap bitmapBase64ToBitmap;
        int i6;
        try {
            bitmapBase64ToBitmap = androidAPI.base64ToBitmap(str);
        } catch (Exception e6) {
            e = e6;
            z6 = false;
        }
        try {
        } catch (Exception e7) {
            e = e7;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("callbackId", str3);
            jSONObject.put("success", z6);
            jSONObject.put("error", e.getMessage());
            androidAPI.emit$template_adsRelease("gallerySaveResult", jSONObject);
            return d5.j.f12745a;
        }
        if (bitmapBase64ToBitmap == null) {
            throw new IllegalArgumentException("Invalid image data");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str2);
        contentValues.put("mime_type", "image/png");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
        }
        ContentResolver contentResolver = androidAPI.getContext().getContentResolver();
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            throw new IOException("Failed to create MediaStore entry");
        }
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
        if (outputStreamOpenOutputStream != null) {
            try {
                z6 = false;
                i6 = 0;
                try {
                    bitmapBase64ToBitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        androidx.activity.c0.d(outputStreamOpenOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                z6 = false;
            }
        } else {
            i6 = 0;
        }
        if (i7 >= 29) {
            contentValues.clear();
            contentValues.put("is_pending", Integer.valueOf(i6));
            contentResolver.update(uriInsert, contentValues, null, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("callbackId", str3);
        jSONObject2.put("success", true);
        jSONObject2.put("uri", uriInsert.toString());
        androidAPI.emit$template_adsRelease("gallerySaveResult", jSONObject2);
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SensorManager sensorManager_delegate$lambda$1(AndroidAPI androidAPI) {
        Object systemService = androidAPI.getContext().getSystemService("sensor");
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.hardware.SensorManager", systemService);
        return (SensorManager) systemService;
    }

    private final int sensorTypeToInt(String str) {
        Locale locale = Locale.ROOT;
        kotlin.jvm.internal.j.d("ROOT", locale);
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
        switch (lowerCase.hashCode()) {
            case -1439500848:
                return !lowerCase.equals("orientation") ? -1 : 11;
            case -1096920656:
                return !lowerCase.equals("stepcounter") ? -1 : 19;
            case -490041217:
                return !lowerCase.equals("proximity") ? -1 : 8;
            case 102970646:
                return !lowerCase.equals("light") ? -1 : 5;
            case 325741829:
                return !lowerCase.equals("gyroscope") ? -1 : 4;
            case 697872463:
                return !lowerCase.equals("accelerometer") ? -1 : 1;
            case 1744994404:
                return !lowerCase.equals("magnetometer") ? -1 : 2;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j setScreenBrightness$lambda$39(AndroidAPI androidAPI, float f6) throws JSONException {
        try {
            WindowManager.LayoutParams attributes = androidAPI.activity.getWindow().getAttributes();
            attributes.screenBrightness = f6;
            androidAPI.activity.getWindow().setAttributes(attributes);
            androidAPI.emitScreenSetting("brightness", f6, true, null);
        } catch (Exception e6) {
            Log.w("AndroidAPI", "setScreenBrightness failed: " + e6.getMessage());
            String message = e6.getMessage();
            if (message == null) {
                message = "brightness_failed";
            }
            androidAPI.emitScreenSetting("brightness", f6, false, message);
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j setTorch$lambda$10(AndroidAPI androidAPI) {
        androidAPI.activity.requestPermission("android.permission.CAMERA", "torch");
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final d5.j shareFile$lambda$81(String str, AndroidAPI androidAPI, String str2) throws JSONException {
        File file;
        d5.j jVar = d5.j.f12745a;
        try {
            if (x5.o.p(str, '/')) {
                file = new File(str);
            } else {
                if (!AndroidAPIKt.isSafeAppFileName(str)) {
                    androidAPI.emitShareResult("file", false, "invalid_file_name");
                    return jVar;
                }
                file = new File(androidAPI.getContext().getFilesDir(), str);
            }
            if (!file.exists()) {
                androidAPI.emitShareResult("file", false, "not_found");
                return jVar;
            }
            Uri uriForFile = FileProvider.getUriForFile(androidAPI.getContext(), androidAPI.getContext().getPackageName() + ".fileprovider", file);
            Intent intent = new Intent("android.intent.action.SEND");
            if (str2 == null) {
                str2 = "*/*";
            } else {
                if (x5.o.v(str2)) {
                    str2 = null;
                }
                if (str2 == null) {
                }
            }
            intent.setType(str2);
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            androidAPI.getContext().startActivity(Intent.createChooser(intent, "Share"));
            androidAPI.emitShareResult("file", true, null);
            return jVar;
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "share_failed";
            }
            androidAPI.emitShareResult("file", false, message);
            return jVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shareFileFromBase64$lambda$85(String str, AndroidAPI androidAPI, String str2, String str3) throws JSONException {
        try {
            byte[] bArrDecode = Base64.decode(x5.o.C(str, ",", str), 0);
            kotlin.jvm.internal.j.b(bArrDecode);
            if (bArrDecode.length == 0) {
                androidAPI.emitShareResult("file", false, "empty_data");
                return;
            }
            if (bArrDecode.length > MAX_BASE64_FILE_BYTES) {
                androidAPI.emitShareResult("file", false, "file_too_large");
                return;
            }
            File file = new File(androidAPI.getContext().getCacheDir(), "shared_".concat(x5.o.D(str2, '/', str2)));
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            m5.f.k(file, bArrDecode);
            androidAPI.runOnUiThread(new v(androidAPI, str3, FileProvider.getUriForFile(androidAPI.getContext(), androidAPI.getContext().getPackageName() + ".fileprovider", file)));
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "write_failed";
            }
            androidAPI.emitShareResult("file", false, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j shareFileFromBase64$lambda$85$lambda$84(AndroidAPI androidAPI, String str, Uri uri) throws JSONException {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            if (x5.o.v(str)) {
                str = null;
            }
            if (str == null) {
                str = "*/*";
            }
            intent.setType(str);
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.addFlags(1);
            androidAPI.getContext().startActivity(Intent.createChooser(intent, "Share"));
            androidAPI.emitShareResult("file", true, null);
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "launch_failed";
            }
            androidAPI.emitShareResult("file", false, message);
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j shareText$lambda$78(AndroidAPI androidAPI, String str) throws JSONException {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            androidAPI.getContext().startActivity(Intent.createChooser(intent, "Share"));
            androidAPI.emitShareResult("text", true, null);
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "launch_failed";
            }
            androidAPI.emitShareResult("text", false, message);
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j showNotification$lambda$14(AndroidAPI androidAPI) {
        androidAPI.activity.requestPermission("android.permission.POST_NOTIFICATIONS", "notification");
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j showToast$lambda$5(AndroidAPI androidAPI, String str) {
        Toast.makeText(androidAPI.getContext(), str, 0).show();
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j startAudioRecording$lambda$70(AndroidAPI androidAPI, String str) throws IllegalStateException, JSONException, IOException {
        try {
            boolean zReleaseRecorderQuietly = androidAPI.releaseRecorderQuietly();
            File file = new File(androidAPI.getContext().getCacheDir(), str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            androidAPI.audioRecordingFile = file;
            MediaRecorder mediaRecorderD = Build.VERSION.SDK_INT >= 31 ? qe.d(androidAPI.getContext()) : new MediaRecorder();
            try {
                mediaRecorderD.setAudioSource(1);
                mediaRecorderD.setOutputFormat(2);
                mediaRecorderD.setAudioEncoder(3);
                mediaRecorderD.setOutputFile(file.getAbsolutePath());
                mediaRecorderD.prepare();
                mediaRecorderD.start();
                androidAPI.mediaRecorder = mediaRecorderD;
                androidAPI.emitAudioStart(str, true, null, zReleaseRecorderQuietly ? "previous_recording_discarded" : null);
            } catch (Exception e6) {
                try {
                    mediaRecorderD.release();
                } catch (Exception unused) {
                }
                androidAPI.audioRecordingFile = null;
                Log.e("AndroidAPI", "startAudioRecording failed", e6);
                androidAPI.emitAudioStart(str, false, "start_failed", null);
            }
        } catch (Exception e7) {
            androidAPI.audioRecordingFile = null;
            Log.e("AndroidAPI", "startAudioRecording setup failed", e7);
            String message = e7.getMessage();
            androidAPI.emitAudioStart(str, false, message != null ? message : "start_failed", null);
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j startCameraPreview$lambda$67(AndroidAPI androidAPI) throws JSONException {
        androidAPI.activity.startCameraPreview();
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j startLocationUpdates$lambda$53(final AndroidAPI androidAPI, final String str) throws JSONException {
        String strEnabledLocationProvider;
        d5.j jVar = d5.j.f12745a;
        try {
            androidAPI.stopLocationUpdates();
            strEnabledLocationProvider = androidAPI.enabledLocationProvider();
        } catch (SecurityException unused) {
            androidAPI.emitLocationUpdate(str, null, "permission_revoked", null);
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "updates_failed";
            }
            androidAPI.emitLocationUpdate(str, null, message, null);
        }
        if (strEnabledLocationProvider == null) {
            androidAPI.emitLocationUpdate(str, null, "provider_disabled", null);
            return jVar;
        }
        LocationListener locationListener = new LocationListener() { // from class: com.htmltoapk.template.AndroidAPI$startLocationUpdates$1$listener$1
            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) throws JSONException {
                kotlin.jvm.internal.j.e("location", location);
                this.this$0.emitLocationUpdate(str, location, null, null);
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String str2) {
                kotlin.jvm.internal.j.e("provider", str2);
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str2) {
                kotlin.jvm.internal.j.e("provider", str2);
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str2, int i6, Bundle bundle) {
            }
        };
        androidAPI.locationListener = locationListener;
        androidAPI.getLocationManager().requestLocationUpdates(strEnabledLocationProvider, 1000L, 1.0f, locationListener);
        androidAPI.emitLocationUpdate(str, null, null, "started:".concat(strEnabledLocationProvider));
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j startSensor$lambda$102(final AndroidAPI androidAPI, final String str, final String str2) throws JSONException {
        int iSensorTypeToInt = androidAPI.sensorTypeToInt(str);
        d5.j jVar = d5.j.f12745a;
        if (iSensorTypeToInt == -1) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("callbackId", str2);
            jSONObject.put("sensor", str);
            jSONObject.put("error", "Unknown sensor type");
            androidAPI.emit$template_adsRelease("sensorError", jSONObject);
            return jVar;
        }
        if (kotlin.jvm.internal.j.a(str, "stepCounter") && !androidAPI.hasPermission("android.permission.ACTIVITY_RECOGNITION")) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("callbackId", str2);
            jSONObject2.put("sensor", str);
            jSONObject2.put("error", "Activity recognition permission not granted");
            androidAPI.emit$template_adsRelease("sensorError", jSONObject2);
            return jVar;
        }
        androidAPI.stopSensor(str);
        Sensor defaultSensor = androidAPI.getSensorManager().getDefaultSensor(iSensorTypeToInt);
        if (defaultSensor != null) {
            SensorEventListener sensorEventListener = new SensorEventListener() { // from class: com.htmltoapk.template.AndroidAPI$startSensor$1$listener$1
                @Override // android.hardware.SensorEventListener
                public void onSensorChanged(SensorEvent sensorEvent) throws JSONException {
                    kotlin.jvm.internal.j.e("event", sensorEvent);
                    AndroidAPI androidAPI2 = this.this$0;
                    JSONObject jSONObject3 = new JSONObject();
                    String str3 = str2;
                    String str4 = str;
                    jSONObject3.put("callbackId", str3);
                    jSONObject3.put("sensor", str4);
                    float[] fArr = sensorEvent.values;
                    kotlin.jvm.internal.j.d("values", fArr);
                    ArrayList arrayList = new ArrayList(fArr.length);
                    for (float f6 : fArr) {
                        arrayList.add(Double.valueOf(f6));
                    }
                    jSONObject3.put("values", new JSONArray((Collection) arrayList));
                    jSONObject3.put("timestamp", sensorEvent.timestamp);
                    jSONObject3.put("accuracy", sensorEvent.accuracy);
                    androidAPI2.emit$template_adsRelease("sensorData", jSONObject3);
                }

                @Override // android.hardware.SensorEventListener
                public void onAccuracyChanged(Sensor sensor, int i6) {
                }
            };
            androidAPI.activeSensors.put(str, new SensorHolder(iSensorTypeToInt, sensorEventListener, str2));
            androidAPI.getSensorManager().registerListener(sensorEventListener, defaultSensor, 2);
            return jVar;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("callbackId", str2);
        jSONObject3.put("sensor", str);
        jSONObject3.put("error", "Sensor not available on this device");
        androidAPI.emit$template_adsRelease("sensorError", jSONObject3);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j stopAudioRecording$lambda$72(AndroidAPI androidAPI, String str) throws JSONException {
        MediaRecorder mediaRecorder = androidAPI.mediaRecorder;
        File file = androidAPI.audioRecordingFile;
        String str2 = null;
        androidAPI.mediaRecorder = null;
        androidAPI.audioRecordingFile = null;
        d5.j jVar = d5.j.f12745a;
        if (mediaRecorder == null) {
            androidAPI.emitAudioStop(str, null, "no_active_recording");
            return jVar;
        }
        try {
            try {
                mediaRecorder.stop();
            } catch (Exception e6) {
                Log.e("AndroidAPI", "stopAudioRecording failed", e6);
                str2 = "stop_failed";
            }
            if (str2 != null && file != null) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            androidAPI.emitAudioStop(str, file, str2);
            return jVar;
        } finally {
            try {
                mediaRecorder.release();
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j stopCameraPreview$lambda$68(AndroidAPI androidAPI) throws ExecutionException, JSONException, InterruptedException {
        androidAPI.activity.stopCameraPreview();
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j writeFile$lambda$90(AndroidAPI androidAPI, String str, String str2, String str3, String str4) {
        WebViewActivity webViewActivity = androidAPI.activity;
        if (str2 == null) {
            str2 = "*/*";
        }
        webViewActivity.createFile(str, str2, str3, str4);
        return d5.j.f12745a;
    }

    @JavascriptInterface
    public final boolean adsCanRequestAds() {
        AdMobBridge adMobBridge;
        if (this.gate.allows("adsCanRequestAds") && (adMobBridge = this.adMobBridge) != null) {
            return adMobBridge.canRequestAds();
        }
        return false;
    }

    @JavascriptInterface
    public final String adsGetConsentStatus() throws JSONException {
        JSONObject jSONObjectDisabledConsentResult;
        if (!this.gate.allows("adsGetConsentStatus")) {
            return "{}";
        }
        AdMobBridge adMobBridge = this.adMobBridge;
        if (adMobBridge == null || (jSONObjectDisabledConsentResult = adMobBridge.consentStatusJson()) == null) {
            jSONObjectDisabledConsentResult = disabledConsentResult();
        }
        String string = jSONObjectDisabledConsentResult.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        return string;
    }

    @JavascriptInterface
    public final void adsHideBanner() {
        AdMobBridge adMobBridge;
        if (this.gate.allows("adsHideBanner") && (adMobBridge = this.adMobBridge) != null) {
            adMobBridge.hideBanner();
        }
    }

    @JavascriptInterface
    public final void adsInitialize() throws JSONException {
        if (this.gate.allows("adsInitialize")) {
            AdMobBridge adMobBridge = this.adMobBridge;
            if (adMobBridge != null) {
                adMobBridge.initializeFromJs();
                return;
            }
            JSONObject jSONObjectPut = disabledConsentResult().put("initialized", false);
            kotlin.jvm.internal.j.d("put(...)", jSONObjectPut);
            emit$template_adsRelease("adResult", jSONObjectPut);
        }
    }

    @JavascriptInterface
    public final boolean adsIsPrivacyOptionsRequired() {
        AdMobBridge adMobBridge;
        if (this.gate.allows("adsIsPrivacyOptionsRequired") && (adMobBridge = this.adMobBridge) != null) {
            return adMobBridge.isPrivacyOptionsRequired();
        }
        return false;
    }

    @JavascriptInterface
    public final void adsLoadBanner() throws JSONException {
        if (this.gate.allows("adsLoadBanner")) {
            adsLoadBanner(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "bottom");
        }
    }

    @JavascriptInterface
    public final void adsLoadInterstitial() throws JSONException {
        if (this.gate.allows("adsLoadInterstitial")) {
            adsLoadInterstitial(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    @JavascriptInterface
    public final void adsLoadRewarded() throws JSONException {
        if (this.gate.allows("adsLoadRewarded")) {
            adsLoadRewarded(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    @JavascriptInterface
    public final void adsResetConsent() {
        if (this.gate.allows("adsResetConsent")) {
            AdMobBridge adMobBridge = this.adMobBridge;
            if (adMobBridge != null) {
                adMobBridge.resetConsent();
            } else {
                emit$template_adsRelease("consentResetResult", disabledConsentResult());
            }
        }
    }

    @JavascriptInterface
    public final void adsShowBanner() {
        if (this.gate.allows("adsShowBanner")) {
            showBannerAd();
        }
    }

    @JavascriptInterface
    public final void adsShowInterstitial() throws JSONException {
        if (this.gate.allows("adsShowInterstitial")) {
            AdMobBridge adMobBridge = this.adMobBridge;
            if (adMobBridge != null) {
                adMobBridge.showInterstitial();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "AdMob not configured");
            emit$template_adsRelease("adFailedToShow", jSONObject);
        }
    }

    @JavascriptInterface
    public final void adsShowPrivacyOptionsForm() {
        if (this.gate.allows("adsShowPrivacyOptionsForm")) {
            AdMobBridge adMobBridge = this.adMobBridge;
            if (adMobBridge != null) {
                adMobBridge.showPrivacyOptions();
            } else {
                emit$template_adsRelease("privacyOptionsResult", disabledConsentResult());
            }
        }
    }

    @JavascriptInterface
    public final void adsShowRewarded() throws JSONException {
        if (this.gate.allows("adsShowRewarded")) {
            adsShowRewarded(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    @JavascriptInterface
    public final boolean canScheduleExactAlarms() {
        if (this.gate.allows("canScheduleExactAlarms")) {
            return AlarmReceiver.Companion.canScheduleExactAlarms(getContext());
        }
        return false;
    }

    @JavascriptInterface
    public final void cancelAllNotifications() throws JSONException {
        if (this.gate.allows("cancelAllNotifications")) {
            try {
                getNotificationManager().cancelAll();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "cancelAll");
                jSONObject.put("success", true);
                jSONObject.put("error", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                emit$template_adsRelease("notificationResult", jSONObject);
            } catch (Exception e6) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action", "cancelAll");
                jSONObject2.put("success", false);
                String message = e6.getMessage();
                if (message == null) {
                    message = "cancel_failed";
                }
                jSONObject2.put("error", message);
                emit$template_adsRelease("notificationResult", jSONObject2);
            }
        }
    }

    @JavascriptInterface
    public final void cancelNotification(int i6) throws JSONException {
        if (this.gate.allows("cancelNotification")) {
            try {
                getNotificationManager().cancel(i6);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "cancel");
                jSONObject.put("notificationId", i6);
                jSONObject.put("success", true);
                jSONObject.put("error", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                emit$template_adsRelease("notificationResult", jSONObject);
            } catch (Exception e6) {
                Log.w("AndroidAPI", "cancelNotification failed: " + e6.getMessage());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action", "cancel");
                jSONObject2.put("notificationId", i6);
                jSONObject2.put("success", false);
                jSONObject2.put("error", "cancel_failed");
                emit$template_adsRelease("notificationResult", jSONObject2);
            }
        }
    }

    @JavascriptInterface
    public final void cancelScheduledNotification(String str) throws JSONException {
        kotlin.jvm.internal.j.e("id", str);
        if (this.gate.allows("cancelScheduledNotification") && ensurePro()) {
            try {
                AlarmReceiver.Companion.cancelAlarm(getContext(), str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("cancelled", true);
                jSONObject.put("success", true);
                jSONObject.put("error", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                emit$template_adsRelease("scheduledNotificationResult", jSONObject);
            } catch (Exception e6) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", str);
                jSONObject2.put("cancelled", false);
                jSONObject2.put("success", false);
                String message = e6.getMessage();
                if (message == null) {
                    message = "cancel_failed";
                }
                jSONObject2.put("error", message);
                emit$template_adsRelease("scheduledNotificationResult", jSONObject2);
            }
        }
    }

    @JavascriptInterface
    public final void cancelVibrate() {
        if (this.gate.allows("cancelVibrate")) {
            try {
                Vibrator vibratorDefaultVibrator = defaultVibrator();
                if (vibratorDefaultVibrator != null) {
                    vibratorDefaultVibrator.cancel();
                }
            } catch (Exception e6) {
                Log.w("AndroidAPI", "cancelVibrate failed: " + e6.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void capturePhoto(String str) {
        kotlin.jvm.internal.j.e("callbackId", str);
        if (this.gate.allows("capturePhoto")) {
            runOnUiThread(new b(this, str));
        }
    }

    @JavascriptInterface
    public final void compressImage(final String str, final int i6, final int i7, final String str2) {
        kotlin.jvm.internal.j.e("base64Data", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        if (this.gate.allows("compressImage")) {
            new Thread(new Runnable() { // from class: com.htmltoapk.template.c0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    AndroidAPI.compressImage$lambda$65(str, this, str2, i6, i7);
                }
            }).start();
        }
    }

    @JavascriptInterface
    public final void copyToClipboard(String str) {
        kotlin.jvm.internal.j.e("text", str);
        if (this.gate.allows("copyToClipboard")) {
            runOnUiThread(new q(1, this, str));
        }
    }

    @JavascriptInterface
    public final boolean deleteAppFile(String str) {
        kotlin.jvm.internal.j.e("fileName", str);
        if (!this.gate.allows("deleteAppFile") || !AndroidAPIKt.isSafeAppFileName(str)) {
            return false;
        }
        try {
            return new File(getContext().getFilesDir(), str).delete();
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public final void downloadBlobUrl(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("blobUrl", str);
        kotlin.jvm.internal.j.e("fileName", str2);
        kotlin.jvm.internal.j.e("mimeType", str3);
        downloadBlobUrlIn(null, "AndroidAPI", str, str2, str3);
    }

    public final void downloadBlobUrlIn(WebView webView, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.j.e("bridgeName", str);
        kotlin.jvm.internal.j.e("blobUrl", str2);
        kotlin.jvm.internal.j.e("fileName", str3);
        kotlin.jvm.internal.j.e("mimeType", str4);
        if (x5.l.n(str2, "data:", false)) {
            this.activity.downloadDataUri(str2, str3, str4);
            return;
        }
        String strQuote = JSONObject.quote(str2);
        String strQuote2 = JSONObject.quote(str3);
        String strQuote3 = JSONObject.quote(str4);
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("\n            (function() {\n                const url = ", strQuote, ";\n                const bridge = window[", JSONObject.quote(str), "];\n                fetch(url)\n                    .then(response => response.blob())\n                    .then(blob => {\n                        const reader = new FileReader();\n                        reader.onloadend = function() {\n                            if (bridge && bridge.onBlobDownloaded) {\n                                bridge.onBlobDownloaded(reader.result, ");
        sbA.append(strQuote2);
        sbA.append(", blob.type || ");
        sbA.append(strQuote3);
        sbA.append(");\n                            }\n                        };\n                        reader.onerror = function() {\n                            if (bridge && bridge.onBlobDownloadError) {\n                                bridge.onBlobDownloadError('Failed to read blob');\n                            }\n                        };\n                        reader.readAsDataURL(blob);\n                    })\n                    .catch(error => {\n                        if (bridge && bridge.onBlobDownloadError) {\n                            bridge.onBlobDownloadError(error.message || 'Failed to fetch blob');\n                        }\n                    });\n            })();\n        ");
        this.activity.runOnUiThread(new androidx.camera.core.q(webView, this, x5.h.h(sbA.toString()), 2));
    }

    @JavascriptInterface
    public final void downloadDataUri(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("dataUri", str);
        kotlin.jvm.internal.j.e("fileName", str2);
        kotlin.jvm.internal.j.e("mimeType", str3);
        this.activity.downloadDataUri(str, str2, str3);
    }

    public final void emit$template_adsRelease(String str, JSONObject jSONObject) {
        kotlin.jvm.internal.j.e("event", str);
        kotlin.jvm.internal.j.e("data", jSONObject);
        String string = jSONObject.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        this.mainHandler.post(new androidx.camera.core.e(5, this, x5.h.h("\n            (function() {\n                try {\n                    var eventName = " + JSONObject.quote(str) + ";\n                    var payload = " + string + ";\n                    if (window.onAndroidEvent) {\n                        window.onAndroidEvent(eventName, payload);\n                    }\n                    window.dispatchEvent(new CustomEvent(eventName, { detail: payload }));\n                } catch(e) {\n                    console.error('Error dispatching Android event:', e);\n                }\n            })();\n        ")));
    }

    @JavascriptInterface
    public final void getAddress(final double d7, final double d8, final String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        if (this.gate.allows("getAddress")) {
            if (!ensurePro()) {
                emitAddressResult(str, d7, d8, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "pro_required");
            } else if (Geocoder.isPresent()) {
                new Thread(new Runnable() { // from class: com.htmltoapk.template.g0
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException, IOException {
                        AndroidAPI.getAddress$lambda$58(this.s, d7, d8, str);
                    }
                }).start();
            } else {
                emitAddressResult(str, d7, d8, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "geocoder_unavailable");
            }
        }
    }

    @JavascriptInterface
    public final String getAppInfo() throws JSONException, PackageManager.NameNotFoundException {
        if (!this.gate.allows("getAppInfo")) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0);
            jSONObject.put("packageName", getContext().getPackageName());
            String str = packageInfo.versionName;
            if (str == null) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            jSONObject.put("versionName", str);
            jSONObject.put("versionCode", Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
            jSONObject.put("appName", getContext().getApplicationInfo().loadLabel(getContext().getPackageManager()).toString());
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "package_info_failed";
            }
            jSONObject.put("error", message);
        }
        jSONObject.put("isPro", this.isPro);
        jSONObject.put("deviceSdk", Build.VERSION.SDK_INT);
        jSONObject.put("targetSdk", getContext().getApplicationInfo().targetSdkVersion);
        String string = jSONObject.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        return string;
    }

    @JavascriptInterface
    public final void getAudioFileBase64(String str, String str2) throws JSONException {
        kotlin.jvm.internal.j.e("fileName", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        if (this.gate.allows("getAudioFileBase64")) {
            if (AndroidAPIKt.isSafeAppFileName(str)) {
                new Thread(new androidx.camera.core.q(this, str, str2, 1)).start();
            } else {
                emitAudioFileResult(str2, str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0L, "invalid_file_name");
            }
        }
    }

    @JavascriptInterface
    public final int getBatteryLevel() {
        if (!this.gate.allows("getBatteryLevel")) {
            return -1;
        }
        Intent intentRegisterReceiver = getContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra < 0 || intExtra2 <= 0) {
            return -1;
        }
        return (intExtra * 100) / intExtra2;
    }

    @JavascriptInterface
    public final String getDeviceInfo() throws JSONException {
        if (!this.gate.allows("getDeviceInfo")) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("manufacturer", Build.MANUFACTURER);
        jSONObject.put("androidVersion", Build.VERSION.RELEASE);
        jSONObject.put("sdk", Build.VERSION.SDK_INT);
        String string = jSONObject.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        return string;
    }

    @JavascriptInterface
    public final String getLaunchDeepLink() {
        String launchDeepLink;
        return (this.gate.allows("getLaunchDeepLink") && (launchDeepLink = this.activity.getLaunchDeepLink()) != null) ? launchDeepLink : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @JavascriptInterface
    public final void getLocation(String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        if (this.gate.allows("getLocation")) {
            if (!ensurePro()) {
                emitLocationResult$default(this, str, null, "pro_required", false, 8, null);
            } else if (hasPermission("android.permission.ACCESS_FINE_LOCATION") || hasPermission("android.permission.ACCESS_COARSE_LOCATION")) {
                runOnUiThread(new q(2, this, str));
            } else {
                emitLocationResult$default(this, str, null, "permission_denied", false, 8, null);
            }
        }
    }

    @JavascriptInterface
    public final String getNetworkType() {
        if (!this.gate.allows("getNetworkType")) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            Object systemService = getContext().getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null) {
                return "unknown";
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : networkCapabilities.hasTransport(3) ? "ethernet" : !networkCapabilities.hasCapability(12) ? "none" : "other";
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @JavascriptInterface
    public final int getScreenBrightness() {
        if (!this.gate.allows("getScreenBrightness")) {
            return -1;
        }
        try {
            return Settings.System.getInt(getContext().getContentResolver(), "screen_brightness");
        } catch (Exception unused) {
            return -1;
        }
    }

    @JavascriptInterface
    public final boolean hasPermission(String str) {
        kotlin.jvm.internal.j.e("permission", str);
        return this.gate.allows("hasPermission") && k0.a.a(getContext(), str) == 0;
    }

    @JavascriptInterface
    public final void hideBannerAd() {
        if (this.gate.allows("hideBannerAd")) {
            adsHideBanner();
        }
    }

    @JavascriptInterface
    public final void htmlToApkGateEnter(String str) {
        kotlin.jvm.internal.j.e("token", str);
        this.gate.enter(str);
    }

    @JavascriptInterface
    public final void htmlToApkGateExit() {
        this.gate.exit();
    }

    @JavascriptInterface
    public final void httpGet(String str, String str2) {
        kotlin.jvm.internal.j.e("url", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        if (this.gate.allows("httpGet")) {
            new Thread(new x(this, str, str2)).start();
        }
    }

    @JavascriptInterface
    public final boolean isBannerAdLoaded() {
        AdMobBridge adMobBridge;
        if (this.gate.allows("isBannerAdLoaded") && (adMobBridge = this.adMobBridge) != null) {
            return adMobBridge.isBannerLoaded();
        }
        return false;
    }

    @JavascriptInterface
    public final boolean isInterstitialAdLoaded() {
        AdMobBridge adMobBridge;
        if (this.gate.allows("isInterstitialAdLoaded") && (adMobBridge = this.adMobBridge) != null) {
            return adMobBridge.isInterstitialLoaded();
        }
        return false;
    }

    @JavascriptInterface
    public final boolean isOnline() {
        NetworkCapabilities networkCapabilities;
        if (!this.gate.allows("isOnline")) {
            return false;
        }
        try {
            Object systemService = getContext().getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager == null) {
                return true;
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(12);
        } catch (Exception unused) {
            return true;
        }
    }

    @JavascriptInterface
    public final boolean isRewardedAdLoaded() {
        AdMobBridge adMobBridge;
        if (this.gate.allows("isRewardedAdLoaded") && (adMobBridge = this.adMobBridge) != null) {
            return adMobBridge.isRewardedLoaded();
        }
        return false;
    }

    @JavascriptInterface
    public final void keepScreenOn(final boolean z6) {
        if (this.gate.allows("keepScreenOn")) {
            runOnUiThread(new p5.a() { // from class: com.htmltoapk.template.i0
                @Override // p5.a
                public final Object a() {
                    return AndroidAPI.keepScreenOn$lambda$40(z6, this);
                }
            });
        }
    }

    @JavascriptInterface
    public final String listAppFiles() throws JSONException {
        CharSequence charSequenceSubSequence;
        if (!this.gate.allows("listAppFiles")) {
            return "[]";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            File filesDir = getContext().getFilesDir();
            kotlin.jvm.internal.j.d("getFilesDir(...)", filesDir);
            b.a aVar = new b.a(new w5.b(new m5.d(filesDir, m5.e.s), new androidx.camera.core.u()));
            while (aVar.hasNext()) {
                File file = (File) aVar.next();
                String absolutePath = file.getAbsolutePath();
                kotlin.jvm.internal.j.d("getAbsolutePath(...)", absolutePath);
                String absolutePath2 = getContext().getFilesDir().getAbsolutePath();
                kotlin.jvm.internal.j.d("getAbsolutePath(...)", absolutePath2);
                String strZ = x5.o.z(absolutePath, absolutePath2);
                int i6 = 0;
                char[] cArr = {'/'};
                int length = strZ.length();
                while (true) {
                    if (i6 >= length) {
                        charSequenceSubSequence = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        break;
                    }
                    if (!e5.j.u(cArr, strZ.charAt(i6))) {
                        charSequenceSubSequence = strZ.subSequence(i6, strZ.length());
                        break;
                    }
                    i6++;
                }
                String string = charSequenceSubSequence.toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", string);
                jSONObject.put("size", file.length());
                jSONObject.put("lastModified", file.lastModified());
                jSONArray.put(jSONObject);
            }
        } catch (Exception e6) {
            Log.w("AndroidAPI", "listAppFiles failed: " + e6.getMessage());
        }
        String string2 = jSONArray.toString();
        kotlin.jvm.internal.j.d("toString(...)", string2);
        return string2;
    }

    @JavascriptInterface
    public final void loadBannerAd() throws JSONException {
        if (this.gate.allows("loadBannerAd")) {
            adsLoadBanner();
        }
    }

    @JavascriptInterface
    public final void loadInterstitialAd() throws JSONException {
        if (this.gate.allows("loadInterstitialAd")) {
            adsLoadInterstitial(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    @JavascriptInterface
    public final void loadRewardedAd() throws JSONException {
        if (this.gate.allows("loadRewardedAd")) {
            adsLoadRewarded(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    @JavascriptInterface
    public final void onBlobDownloadError(String str) throws JSONException {
        kotlin.jvm.internal.j.e("message", str);
        Log.e("AndroidAPI", "Blob download error: ".concat(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", str);
        emit$template_adsRelease("blobDownloadError", jSONObject);
    }

    @JavascriptInterface
    public final void onBlobDownloaded(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("dataUrl", str);
        kotlin.jvm.internal.j.e("fileName", str2);
        kotlin.jvm.internal.j.e("mimeType", str3);
        this.activity.downloadDataUri(str, str2, str3);
    }

    public final void onCameraPreviewResult(boolean z6, boolean z7, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", z6);
        jSONObject.put("active", z7);
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str);
        emit$template_adsRelease("cameraPreviewResult", jSONObject);
    }

    public final void onCameraResult(String str, boolean z6, String str2, String str3) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        jSONObject.put("success", z6);
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("base64", str2);
        if (str3 == null) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str3);
        emit$template_adsRelease("cameraResult", jSONObject);
    }

    public final void onDownloadResult(String str, boolean z6, String str2) throws JSONException {
        kotlin.jvm.internal.j.e("fileName", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileName", str);
        jSONObject.put("success", z6);
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str2);
        emit$template_adsRelease("downloadResult", jSONObject);
    }

    public final void onFilePicked(String str, String str2, String str3) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        jSONObject.put("success", str2 != null && str3 == null);
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("content", str2);
        if (str3 == null) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str3);
        emit$template_adsRelease("filePicked", jSONObject);
    }

    public final void onFileWritten(String str, boolean z6, String str2) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", str);
        jSONObject.put("success", z6);
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        jSONObject.put("error", str2);
        emit$template_adsRelease("fileWritten", jSONObject);
    }

    public final void onPermissionResult(String str, String str2, boolean z6) throws JSONException, CameraAccessException {
        kotlin.jvm.internal.j.e("callbackId", str);
        kotlin.jvm.internal.j.e("permission", str2);
        if (str.equals("torch")) {
            Boolean bool = this.pendingTorchEnabled;
            this.pendingTorchEnabled = null;
            if (z6) {
                if (bool != null) {
                    applyTorch(bool.booleanValue());
                }
            } else if (bool != null) {
                emitTorchResult(bool.booleanValue(), false, "permission_denied");
            }
        }
        if (str.equals("notification")) {
            d5.g<String, String, String> gVar = this.pendingNotification;
            this.pendingNotification = null;
            if (z6) {
                if (gVar != null) {
                    postNotification(gVar.s, gVar.f12742t, gVar.f12743u);
                }
            } else if (gVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "post");
                jSONObject.put("success", false);
                jSONObject.put("error", "permission_denied");
                emit$template_adsRelease("notificationResult", jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("callbackId", str);
        jSONObject2.put("permission", str2);
        jSONObject2.put("granted", z6);
        emit$template_adsRelease("permissionResult", jSONObject2);
    }

    public final void onPermissionsResult(String str, Map<String, Boolean> map) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        kotlin.jvm.internal.j.e("results", map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().booleanValue());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("callbackId", str);
        jSONObject2.put("results", jSONObject);
        emit$template_adsRelease("permissionsResult", jSONObject2);
    }

    @JavascriptInterface
    public final void openAppSettings() {
        if (this.gate.allows("openAppSettings")) {
            runOnUiThread(new a0(1, this));
        }
    }

    @JavascriptInterface
    public final void openExactAlarmSettings() {
        if (this.gate.allows("openExactAlarmSettings")) {
            runOnUiThread(new s(this, 1));
        }
    }

    @JavascriptInterface
    public final void openNotificationSettings() {
        if (this.gate.allows("openNotificationSettings")) {
            runOnUiThread(new a0(0, this));
        }
    }

    @JavascriptInterface
    public final String pasteFromClipboard() {
        CharSequence text;
        if (!this.gate.allows("pasteFromClipboard")) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            if (getClipboard().hasPrimaryClip()) {
                ClipData primaryClip = getClipboard().getPrimaryClip();
                ClipData.Item itemAt = primaryClip != null ? primaryClip.getItemAt(0) : null;
                if (itemAt != null && (text = itemAt.getText()) != null) {
                    String string = text.toString();
                    if (string != null) {
                        return string;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @JavascriptInterface
    public final void pickFile(final String str, final String str2) {
        kotlin.jvm.internal.j.e("mimeType", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        if (this.gate.allows("pickFile") && ensurePro()) {
            runOnUiThread(new p5.a() { // from class: com.htmltoapk.template.y
                @Override // p5.a
                public final Object a() {
                    return AndroidAPI.pickFile$lambda$89(this.s, str, str2);
                }
            });
        }
    }

    @JavascriptInterface
    public final void printPage() {
        this.mainHandler.post(new androidx.camera.lifecycle.a(2, this));
    }

    @JavascriptInterface
    public final String readAppFile(String str) throws IOException {
        kotlin.jvm.internal.j.e("fileName", str);
        if (!this.gate.allows("readAppFile") || !AndroidAPIKt.isSafeAppFileName(str)) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            File file = new File(getContext().getFilesDir(), str);
            Charset charset = x5.a.f15157a;
            kotlin.jvm.internal.j.e("charset", charset);
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
            try {
                String strC = j3.b.c(inputStreamReader);
                inputStreamReader.close();
                return strC;
            } finally {
            }
        } catch (Exception unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    public final void requestNotificationPermission(String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        if (this.gate.allows("requestNotificationPermission")) {
            if (Build.VERSION.SDK_INT >= 33) {
                runOnUiThread(new n(1, this, str));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("callbackId", str);
            jSONObject.put("permission", "android.permission.POST_NOTIFICATIONS");
            jSONObject.put("granted", true);
            emit$template_adsRelease("permissionResult", jSONObject);
        }
    }

    @JavascriptInterface
    public final void requestPermission(String str, String str2) {
        kotlin.jvm.internal.j.e("permission", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        if (this.gate.allows("requestPermission")) {
            runOnUiThread(new j(this, str, str2, 1));
        }
    }

    @JavascriptInterface
    public final void requestPermissions(String str, String str2) {
        JSONArray jSONArray;
        kotlin.jvm.internal.j.e("permissionsJson", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        if (this.gate.allows("requestPermissions")) {
            try {
                jSONArray = new JSONArray(str);
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i6 = 0; i6 < length; i6++) {
                String strOptString = jSONArray.optString(i6);
                kotlin.jvm.internal.j.d("optString(...)", strOptString);
                arrayList.add(strOptString);
            }
            runOnUiThread(new v(this, arrayList, str2));
        }
    }

    @JavascriptInterface
    public final void saveToGallery(final String str, final String str2, final String str3) {
        kotlin.jvm.internal.j.e("fileName", str);
        kotlin.jvm.internal.j.e("base64Image", str2);
        kotlin.jvm.internal.j.e("callbackId", str3);
        if (this.gate.allows("saveToGallery") && ensurePro()) {
            runOnUiThread(new p5.a() { // from class: com.htmltoapk.template.w
                @Override // p5.a
                public final Object a() {
                    return AndroidAPI.saveToGallery$lambda$98(this.s, str2, str, str3);
                }
            });
        }
    }

    @JavascriptInterface
    public final void scheduleNotification(String str, String str2, String str3, long j6) throws JSONException {
        kotlin.jvm.internal.j.e("id", str);
        kotlin.jvm.internal.j.e("title", str2);
        kotlin.jvm.internal.j.e("message", str3);
        if (this.gate.allows("scheduleNotification")) {
            scheduleNotification(str, str2, str3, j6, 0L);
        }
    }

    @JavascriptInterface
    public final void setScreenBrightness(float f6) {
        if (this.gate.allows("setScreenBrightness")) {
            final float fNormalizeScreenBrightness = AndroidAPIKt.normalizeScreenBrightness(f6);
            runOnUiThread(new p5.a() { // from class: com.htmltoapk.template.b0
                @Override // p5.a
                public final Object a() {
                    return AndroidAPI.setScreenBrightness$lambda$39(this.s, fNormalizeScreenBrightness);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setTorch(boolean z6) throws JSONException, CameraAccessException {
        if (this.gate.allows("setTorch")) {
            if (k0.a.a(getContext(), "android.permission.CAMERA") == 0) {
                applyTorch(z6);
            } else {
                this.pendingTorchEnabled = Boolean.valueOf(z6);
                runOnUiThread(new t(0, this));
            }
        }
    }

    @JavascriptInterface
    public final void shareFile(final String str, final String str2) {
        kotlin.jvm.internal.j.e("filePath", str);
        if (this.gate.allows("shareFile")) {
            runOnUiThread(new p5.a(this) { // from class: com.htmltoapk.template.h0

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ AndroidAPI f12562t;

                {
                    this.f12562t = this;
                }

                @Override // p5.a
                public final Object a() {
                    return AndroidAPI.shareFile$lambda$81(str, this.f12562t, str2);
                }
            });
        }
    }

    @JavascriptInterface
    public final void shareFileFromBase64(String str, String str2, String str3) throws JSONException {
        kotlin.jvm.internal.j.e("fileName", str);
        kotlin.jvm.internal.j.e("base64Data", str2);
        kotlin.jvm.internal.j.e("mimeType", str3);
        if (this.gate.allows("shareFileFromBase64")) {
            if (AndroidAPIKt.isSafeAppFileName(str)) {
                new Thread(new androidx.camera.core.s(str2, this, str, str3, 1)).start();
            } else {
                emitShareResult("file", false, "invalid_file_name");
            }
        }
    }

    @JavascriptInterface
    public final void shareText(String str) {
        kotlin.jvm.internal.j.e("text", str);
        if (this.gate.allows("shareText")) {
            runOnUiThread(new c(1, this, str));
        }
    }

    @JavascriptInterface
    public final boolean shouldShowRequestPermissionRationale(String str) {
        kotlin.jvm.internal.j.e("permission", str);
        if (!this.gate.allows("shouldShowRequestPermissionRationale")) {
            return false;
        }
        try {
            return i0.a.d(this.activity, str);
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public final void showBannerAd() {
        AdMobBridge adMobBridge;
        if (this.gate.allows("showBannerAd") && (adMobBridge = this.adMobBridge) != null) {
            adMobBridge.showBanner();
        }
    }

    @JavascriptInterface
    public final void showInterstitialAd() throws JSONException {
        if (this.gate.allows("showInterstitialAd")) {
            adsShowInterstitial();
        }
    }

    @JavascriptInterface
    public final void showNotification(String str, String str2) throws JSONException {
        kotlin.jvm.internal.j.e("title", str);
        kotlin.jvm.internal.j.e("message", str2);
        if (this.gate.allows("showNotification")) {
            showNotification(str, str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    @JavascriptInterface
    public final void showRewardedAd() throws JSONException {
        if (this.gate.allows("showRewardedAd")) {
            adsShowRewarded(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    @JavascriptInterface
    public final void showToast(String str) {
        kotlin.jvm.internal.j.e("message", str);
        if (this.gate.allows("showToast")) {
            runOnUiThread(new q(0, this, str));
        }
    }

    @JavascriptInterface
    public final void startAudioRecording(String str) throws JSONException {
        kotlin.jvm.internal.j.e("fileName", str);
        if (this.gate.allows("startAudioRecording")) {
            if (!ensurePro()) {
                emitAudioStart(str, false, "pro_required", null);
                return;
            }
            if (!AndroidAPIKt.isSafeAppFileName(str)) {
                emitAudioStart(str, false, "invalid_file_name", null);
            } else if (hasPermission("android.permission.RECORD_AUDIO")) {
                runOnUiThread(new m(1, this, str));
            } else {
                emitAudioStart(str, false, "permission_denied", null);
            }
        }
    }

    @JavascriptInterface
    public final void startCameraPreview() throws JSONException {
        if (this.gate.allows("startCameraPreview")) {
            if (ensurePro()) {
                runOnUiThread(new s(this, 0));
            } else {
                onCameraPreviewResult(false, false, "pro_required");
            }
        }
    }

    @JavascriptInterface
    public final void startLocationUpdates(String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        if (this.gate.allows("startLocationUpdates")) {
            if (!ensurePro()) {
                emitLocationUpdate(str, null, "pro_required", null);
            } else if (hasPermission("android.permission.ACCESS_FINE_LOCATION") || hasPermission("android.permission.ACCESS_COARSE_LOCATION")) {
                runOnUiThread(new u(0, this, str));
            } else {
                emitLocationUpdate(str, null, "permission_denied", null);
            }
        }
    }

    @JavascriptInterface
    public final void startSensor(String str, String str2) {
        kotlin.jvm.internal.j.e("sensorType", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        if (this.gate.allows("startSensor") && ensurePro()) {
            runOnUiThread(new d0(this, str, str2, 1));
        }
    }

    @JavascriptInterface
    public final void stopAllSensors() {
        if (this.gate.allows("stopAllSensors") && ensurePro()) {
            Iterator<T> it = this.activeSensors.values().iterator();
            while (it.hasNext()) {
                getSensorManager().unregisterListener(((SensorHolder) it.next()).getListener());
            }
            this.activeSensors.clear();
        }
    }

    @JavascriptInterface
    public final void stopAudioRecording(String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        if (this.gate.allows("stopAudioRecording")) {
            if (ensurePro()) {
                runOnUiThread(new u(1, this, str));
            } else {
                emitAudioStop(str, null, "pro_required");
            }
        }
    }

    @JavascriptInterface
    public final void stopCameraPreview() throws JSONException {
        if (this.gate.allows("stopCameraPreview")) {
            if (ensurePro()) {
                runOnUiThread(new w2.c(2, this));
            } else {
                onCameraPreviewResult(false, false, "pro_required");
            }
        }
    }

    @JavascriptInterface
    public final void stopLocationUpdates() {
        LocationListener locationListener;
        if (this.gate.allows("stopLocationUpdates") && ensurePro() && (locationListener = this.locationListener) != null) {
            try {
                getLocationManager().removeUpdates(locationListener);
            } catch (Exception unused) {
            }
            this.locationListener = null;
        }
    }

    @JavascriptInterface
    public final void stopSensor(String str) {
        SensorHolder sensorHolderRemove;
        kotlin.jvm.internal.j.e("sensorType", str);
        if (this.gate.allows("stopSensor") && ensurePro() && (sensorHolderRemove = this.activeSensors.remove(str)) != null) {
            getSensorManager().unregisterListener(sensorHolderRemove.getListener());
        }
    }

    @JavascriptInterface
    public final void vibrate(int i6) {
        if (this.gate.allows("vibrate")) {
            try {
                Vibrator vibratorDefaultVibrator = defaultVibrator();
                if (vibratorDefaultVibrator == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (i6 < 1) {
                        i6 = 1;
                    }
                    vibratorDefaultVibrator.vibrate(VibrationEffect.createOneShot(i6, -1));
                } else {
                    if (i6 < 1) {
                        i6 = 1;
                    }
                    vibratorDefaultVibrator.vibrate(i6);
                }
            } catch (Exception e6) {
                Log.w("AndroidAPI", "vibrate failed: " + e6.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void vibratePattern(String str, int i6) throws JSONException {
        kotlin.jvm.internal.j.e("patternJson", str);
        if (this.gate.allows("vibratePattern")) {
            long[] vibratePattern = AndroidAPIKt.parseVibratePattern(str);
            if (vibratePattern == null || vibratePattern.length == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("error", "invalid_pattern");
                jSONObject.put("pattern", str);
                emit$template_adsRelease("vibrateResult", jSONObject);
                return;
            }
            try {
                Vibrator vibratorDefaultVibrator = defaultVibrator();
                if (vibratorDefaultVibrator == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("success", false);
                    jSONObject2.put("error", "no_vibrator");
                    emit$template_adsRelease("vibrateResult", jSONObject2);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    vibratorDefaultVibrator.vibrate(VibrationEffect.createWaveform(vibratePattern, i6));
                } else {
                    vibratorDefaultVibrator.vibrate(vibratePattern, i6);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("success", true);
                jSONObject3.put("steps", vibratePattern.length);
                jSONObject3.put("repeat", i6);
                jSONObject3.put("error", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                emit$template_adsRelease("vibrateResult", jSONObject3);
            } catch (Exception e6) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("success", false);
                String message = e6.getMessage();
                if (message == null) {
                    message = "vibrate_failed";
                }
                jSONObject4.put("error", message);
                emit$template_adsRelease("vibrateResult", jSONObject4);
            }
        }
    }

    @JavascriptInterface
    public final boolean writeAppFile(String str, String str2) throws IOException {
        kotlin.jvm.internal.j.e("fileName", str);
        kotlin.jvm.internal.j.e("content", str2);
        if (!this.gate.allows("writeAppFile") || !AndroidAPIKt.isSafeAppFileName(str)) {
            return false;
        }
        try {
            File file = new File(getContext().getFilesDir(), str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            Charset charset = x5.a.f15157a;
            kotlin.jvm.internal.j.e("charset", charset);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                m5.f.l(fileOutputStream, str2, charset);
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    @JavascriptInterface
    public final void writeFile(final String str, final String str2, final String str3, final String str4) {
        kotlin.jvm.internal.j.e("fileName", str);
        kotlin.jvm.internal.j.e("content", str2);
        kotlin.jvm.internal.j.e("callbackId", str4);
        if (this.gate.allows("writeFile") && ensurePro()) {
            runOnUiThread(new p5.a() { // from class: com.htmltoapk.template.z
                @Override // p5.a
                public final Object a() {
                    return AndroidAPI.writeFile$lambda$90(this.s, str, str3, str2, str4);
                }
            });
        }
    }

    @JavascriptInterface
    public final void adsLoadBanner(String str) throws JSONException {
        kotlin.jvm.internal.j.e("adUnitId", str);
        if (this.gate.allows("adsLoadBanner")) {
            adsLoadBanner(str, "bottom");
        }
    }

    @JavascriptInterface
    public final void adsLoadInterstitial(String str) throws JSONException {
        AdMobBridge adMobBridge;
        kotlin.jvm.internal.j.e("adUnitId", str);
        if (this.gate.allows("adsLoadInterstitial")) {
            String string = x5.o.G(str).toString();
            if (x5.o.v(string) && ((adMobBridge = this.adMobBridge) == null || (string = adMobBridge.getInterstitialId()) == null)) {
                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (!x5.o.v(string)) {
                AdMobBridge adMobBridge2 = this.adMobBridge;
                if (adMobBridge2 != null) {
                    adMobBridge2.loadInterstitial(string);
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "Interstitial Ad Unit ID not configured");
            emit$template_adsRelease("adFailedToLoad", jSONObject);
        }
    }

    @JavascriptInterface
    public final void adsLoadRewarded(String str) throws JSONException {
        AdMobBridge adMobBridge;
        kotlin.jvm.internal.j.e("adUnitId", str);
        if (this.gate.allows("adsLoadRewarded")) {
            String string = x5.o.G(str).toString();
            if (x5.o.v(string) && ((adMobBridge = this.adMobBridge) == null || (string = adMobBridge.getRewardedId()) == null)) {
                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (!x5.o.v(string)) {
                AdMobBridge adMobBridge2 = this.adMobBridge;
                if (adMobBridge2 != null) {
                    adMobBridge2.loadRewarded(string);
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "Rewarded Ad Unit ID not configured");
            emit$template_adsRelease("adFailedToLoad", jSONObject);
        }
    }

    @JavascriptInterface
    public final void adsShowBanner(String str) {
        kotlin.jvm.internal.j.e("position", str);
        if (this.gate.allows("adsShowBanner")) {
            showBannerAd(str);
        }
    }

    @JavascriptInterface
    public final void adsShowRewarded(String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackName", str);
        if (this.gate.allows("adsShowRewarded")) {
            showRewardedAd(str);
        }
    }

    @JavascriptInterface
    public final void capturePhoto(String str, String str2) {
        kotlin.jvm.internal.j.e("callbackId", str);
        kotlin.jvm.internal.j.e("facing", str2);
        if (this.gate.allows("capturePhoto")) {
            runOnUiThread(new d0(this, str, str2, 0));
        }
    }

    @JavascriptInterface
    public final void loadBannerAd(String str) throws JSONException {
        kotlin.jvm.internal.j.e("adUnitId", str);
        if (this.gate.allows("loadBannerAd")) {
            adsLoadBanner(str);
        }
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str) throws JSONException {
        kotlin.jvm.internal.j.e("adUnitId", str);
        if (this.gate.allows("loadInterstitialAd")) {
            adsLoadInterstitial(str);
        }
    }

    @JavascriptInterface
    public final void loadRewardedAd(String str) throws JSONException {
        kotlin.jvm.internal.j.e("adUnitId", str);
        if (this.gate.allows("loadRewardedAd")) {
            adsLoadRewarded(str);
        }
    }

    @JavascriptInterface
    public final void scheduleNotification(String str, String str2, String str3, long j6, long j7) throws JSONException {
        kotlin.jvm.internal.j.e("id", str);
        kotlin.jvm.internal.j.e("title", str2);
        kotlin.jvm.internal.j.e("message", str3);
        if (this.gate.allows("scheduleNotification")) {
            if (!ensurePro()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("success", false);
                jSONObject.put("error", "pro_required");
                emit$template_adsRelease("scheduledNotificationResult", jSONObject);
                return;
            }
            long jCurrentTimeMillis = (j6 >= 0 ? j6 : 0L) + System.currentTimeMillis();
            AlarmReceiver.Companion.ScheduleOutcome scheduleOutcomeScheduleAlarm = AlarmReceiver.Companion.scheduleAlarm(getContext(), str, str2, str3, jCurrentTimeMillis, j7);
            ArrayList arrayList = new ArrayList();
            if (scheduleOutcomeScheduleAlarm.getSuccess() && !scheduleOutcomeScheduleAlarm.getExact()) {
                arrayList.add("inexact_alarm");
            }
            if (scheduleOutcomeScheduleAlarm.getSuccess() && !hasNotificationPermission()) {
                arrayList.add("notification_permission_missing");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject2.put("success", scheduleOutcomeScheduleAlarm.getSuccess());
            jSONObject2.put("exact", scheduleOutcomeScheduleAlarm.getExact());
            jSONObject2.put("triggerAt", jCurrentTimeMillis);
            jSONObject2.put("warning", e5.q.h(arrayList, ",", null, 62));
            jSONObject2.put("error", scheduleOutcomeScheduleAlarm.getSuccess() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "alarm_failed");
            emit$template_adsRelease("scheduledNotificationResult", jSONObject2);
        }
    }

    @JavascriptInterface
    public final void showBannerAd(String str) {
        AdMobBridge adMobBridge;
        kotlin.jvm.internal.j.e("position", str);
        if (this.gate.allows("showBannerAd") && (adMobBridge = this.adMobBridge) != null) {
            adMobBridge.setBannerPosition(str);
            adMobBridge.showBanner();
        }
    }

    @JavascriptInterface
    public final void showNotification(String str, String str2, String str3) throws JSONException {
        kotlin.jvm.internal.j.e("title", str);
        kotlin.jvm.internal.j.e("message", str2);
        kotlin.jvm.internal.j.e("bigText", str3);
        if (this.gate.allows("showNotification")) {
            if (Build.VERSION.SDK_INT >= 33 && k0.a.a(getContext(), "android.permission.POST_NOTIFICATIONS") != 0) {
                this.pendingNotification = new d5.g<>(str, str2, str3);
                runOnUiThread(new e0(1, this));
            } else {
                postNotification(str, str2, str3);
            }
        }
    }

    @JavascriptInterface
    public final void showRewardedAd(String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackName", str);
        if (this.gate.allows("showRewardedAd")) {
            AdMobBridge adMobBridge = this.adMobBridge;
            if (adMobBridge == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("message", "AdMob not configured");
                emit$template_adsRelease("adFailedToShow", jSONObject);
            } else {
                String string = x5.o.G(str).toString();
                if (x5.o.v(string)) {
                    string = null;
                }
                adMobBridge.showRewarded(string);
            }
        }
    }

    @JavascriptInterface
    public final void adsLoadBanner(String str, String str2) throws JSONException {
        AdMobBridge adMobBridge;
        kotlin.jvm.internal.j.e("adUnitId", str);
        kotlin.jvm.internal.j.e("position", str2);
        if (this.gate.allows("adsLoadBanner")) {
            String string = x5.o.G(str).toString();
            if (x5.o.v(string) && ((adMobBridge = this.adMobBridge) == null || (string = adMobBridge.getBannerId()) == null)) {
                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (!x5.o.v(string)) {
                AdMobBridge adMobBridge2 = this.adMobBridge;
                if (adMobBridge2 != null) {
                    adMobBridge2.loadBanner(string, str2);
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "Banner Ad Unit ID not configured");
            emit$template_adsRelease("adFailedToLoad", jSONObject);
        }
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String str2) throws JSONException {
        kotlin.jvm.internal.j.e("adUnitId", str);
        kotlin.jvm.internal.j.e("position", str2);
        if (this.gate.allows("loadBannerAd")) {
            adsLoadBanner(str, str2);
        }
    }

    public /* synthetic */ AndroidAPI(WebViewActivity webViewActivity, boolean z6, AdMobBridge adMobBridge, BridgeGate bridgeGate, int i6, kotlin.jvm.internal.f fVar) {
        this(webViewActivity, (i6 & 2) != 0 ? false : z6, (i6 & 4) != 0 ? null : adMobBridge, bridgeGate);
    }
}
