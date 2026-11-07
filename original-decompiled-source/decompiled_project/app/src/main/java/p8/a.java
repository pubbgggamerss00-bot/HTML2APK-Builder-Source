package p8;

import c0.g0;
import java.util.List;
import java.util.Set;
import pg.n;
import qg.k0;
import qg.o;
import qg.p;
import qg.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f21339a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f21340b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set<String> f21341c;

    static {
        List<String> listJ = p.j("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        f21339a = listJ;
        z zVar = z.f22752a;
        f21340b = k0.d(new n("showToast", zVar), new n("vibrate", g0.c("android.permission.VIBRATE")), new n("vibratePattern", g0.c("android.permission.VIBRATE")), new n("cancelVibrate", g0.c("android.permission.VIBRATE")), new n("setTorch", g0.c("android.permission.CAMERA")), new n("showNotification", g0.c("android.permission.POST_NOTIFICATIONS")), new n("cancelNotification", zVar), new n("cancelAllNotifications", zVar), new n("requestNotificationPermission", g0.c("android.permission.POST_NOTIFICATIONS")), new n("scheduleNotification", g0.c("android.permission.POST_NOTIFICATIONS")), new n("cancelScheduledNotification", zVar), new n("canScheduleExactAlarms", g0.c("android.permission.SCHEDULE_EXACT_ALARM")), new n("openExactAlarmSettings", g0.c("android.permission.SCHEDULE_EXACT_ALARM")), new n("openNotificationSettings", zVar), new n("getLaunchDeepLink", zVar), new n("getDeviceInfo", zVar), new n("getBatteryLevel", zVar), new n("getAppInfo", zVar), new n("hasPermission", zVar), new n("requestPermission", zVar), new n("requestPermissions", zVar), new n("shouldShowRequestPermissionRationale", zVar), new n("openAppSettings", zVar), new n("getScreenBrightness", zVar), new n("setScreenBrightness", zVar), new n("keepScreenOn", zVar), new n("isOnline", g0.c("android.permission.ACCESS_NETWORK_STATE")), new n("getNetworkType", g0.c("android.permission.ACCESS_NETWORK_STATE")), new n("getLocation", listJ), new n("startLocationUpdates", listJ), new n("stopLocationUpdates", zVar), new n("getAddress", zVar), new n("capturePhoto", zVar), new n("startCameraPreview", g0.c("android.permission.CAMERA")), new n("stopCameraPreview", zVar), new n("compressImage", zVar), new n("startAudioRecording", g0.c("android.permission.RECORD_AUDIO")), new n("stopAudioRecording", zVar), new n("getAudioFileBase64", zVar), new n("printPage", zVar), new n("copyToClipboard", zVar), new n("pasteFromClipboard", zVar), new n("shareText", zVar), new n("shareFile", zVar), new n("shareFileFromBase64", zVar), new n("pickFile", zVar), new n("writeFile", zVar), new n("readAppFile", zVar), new n("writeAppFile", zVar), new n("deleteAppFile", zVar), new n("listAppFiles", zVar), new n("saveToGallery", zVar), new n("startSensor", zVar), new n("stopSensor", zVar), new n("stopAllSensors", zVar), new n("httpGet", g0.c("android.permission.INTERNET")), new n("downloadBlobUrl", zVar), new n("downloadDataUri", zVar), new n("onBlobDownloaded", zVar), new n("onBlobDownloadError", zVar), new n("adsInitialize", zVar), new n("adsLoadInterstitial", zVar), new n("adsShowInterstitial", zVar), new n("adsLoadRewarded", zVar), new n("adsShowRewarded", zVar), new n("adsLoadBanner", zVar), new n("adsShowBanner", zVar), new n("adsHideBanner", zVar), new n("isBannerAdLoaded", zVar), new n("isInterstitialAdLoaded", zVar), new n("isRewardedAdLoaded", zVar), new n("adsCanRequestAds", zVar), new n("adsGetConsentStatus", zVar), new n("adsIsPrivacyOptionsRequired", zVar), new n("adsShowPrivacyOptionsForm", zVar), new n("adsResetConsent", zVar), new n("loadBannerAd", zVar), new n("showBannerAd", zVar), new n("hideBannerAd", zVar), new n("loadInterstitialAd", zVar), new n("showInterstitialAd", zVar), new n("loadRewardedAd", zVar), new n("showRewardedAd", zVar), new n("htmlToApkGateEnter", zVar), new n("htmlToApkGateExit", zVar));
        f21341c = o.C(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.POST_NOTIFICATIONS", "android.permission.SCHEDULE_EXACT_ALARM", "android.permission.VIBRATE", "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACTIVITY_RECOGNITION"});
    }
}
