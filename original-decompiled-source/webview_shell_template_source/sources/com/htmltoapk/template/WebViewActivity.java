package com.htmltoapk.template;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.camera2.CameraAccessException;
import android.media.ExifInterface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.print.PrintAttributes;
import android.print.PrintJob;
import android.print.PrintManager;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.camera.view.r;
import androidx.core.content.FileProvider;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.yy1;
import com.htmltoapk.template.PdfActivity;
import com.htmltoapk.template.TrustedOrigins;
import d5.d;
import h2.b;
import i2.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.f0;
import u0.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class WebViewActivity extends ComponentActivity {
    private PrintJob activePrintJob;
    private AdMobBridge adMobBridge;
    private AndroidAPI androidApi;
    private Object appliedBarsSignature;
    private h2.b assetLoader;
    private int bannerPaddingBottom;
    private int bannerPaddingTop;
    private BridgeGate bridgeGate;
    private ExecutorService cameraExecutor;
    private View customVideoView;
    private WebChromeClient.CustomViewCallback customViewCallback;
    private DisplayConfig displayConfig;
    private DownloadListener downloadListener;
    private d.c<Intent> fileChooserLauncher;
    private ValueCallback<Uri[]> filePathCallback;
    private boolean fullBleedUnderStatusBar;
    private final d.c<String[]> geolocationPermissionLauncher;
    private int lastBottomBarInset;
    private boolean lastPageLoadFailed;
    private int lastTopBarInset;
    private String launchDeepLink;
    private WebChromeClient mainChromeClient;
    private WebViewClient mainWebViewClient;
    private View navBarScrim;
    private Dialog noInternetDialog;
    private boolean pageLoadFinished;
    private w2.l0 pdfDocument;
    private final d.c<String> pdfSaveLauncher;
    private String pendingCameraCallbackId;
    private boolean pendingCameraFront;
    private String pendingFileCallbackId;
    private GeolocationPermissions.Callback pendingGeolocationCallback;
    private String pendingGeolocationOrigin;
    private File pendingPdfSave;
    private String pendingPermission;
    private String pendingPermissionCallbackId;
    private String pendingPermissionsCallbackId;
    private File pendingPhotoFile;
    private File pendingWebCaptureFile;
    private PermissionRequest pendingWebPermissionRequest;
    private String pendingWriteCallbackId;
    private String pendingWriteContent;
    private final d.c<String> permissionLauncher;
    private FrameLayout popupContainer;
    private WebView popupWebView;
    private PreviewView previewView;
    private ProgressBar progressBar;
    private Runnable splashDismissRunnable;
    private long splashStartTime;
    private ImageView splashView;
    private View statusBarScrim;
    private SwipeRefreshLayout swipeRefreshLayout;
    private final d.c<Uri> takePictureLauncher;
    private View toolbar;
    private TextView toolbarTitle;
    private WebView webView;
    private final PullRefreshGuard pullRefreshGuard = new PullRefreshGuard();
    private int configuredOrientation = -1;
    private m0.b popupInsets = m0.b.f13853e;
    private final p5.p<String, JSONObject, d5.j> jsEventEmitter = new c1(this);
    private String cachedUserAgent = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private final Handler splashHandler = new Handler(Looper.getMainLooper());
    private final Handler pageLoadHandler = new Handler(Looper.getMainLooper());
    private final Runnable pageLoadTimeoutRunnable = new x0(this, 1);
    private int currentWebBgColor = -16777216;
    private final d.c<String[]> webPermissionLauncher = registerForActivityResult(new e.d(), new n0(this));
    private final d.c<String[]> multiplePermissionsLauncher = registerForActivityResult(new e.d(), new androidx.camera.core.impl.e(5, this));
    private final d.c<String[]> launchPermissionsLauncher = registerForActivityResult(new e.d(), new androidx.camera.camera2.internal.compat.workaround.c());
    private final d.c<String[]> pickFileLauncher = registerForActivityResult(new e.c(), new androidx.camera.core.l(this));
    private final d.c<String> createDocumentLauncher = registerForActivityResult(new e.b("*/*"), new d1(this, 0));

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class DisplayConfig {
        private final String admobAppId;
        private final boolean admobAutoLoadInterstitial;
        private final boolean admobAutoLoadRewarded;
        private final boolean admobBannerEnabled;
        private final String admobBannerPosition;
        private final String admobBannerUnitId;
        private final int admobChildDirectedTreatment;
        private final boolean admobEnabled;
        private final boolean admobInterstitialEnabled;
        private final int admobInterstitialIntervalSeconds;
        private final int admobInterstitialPageCount;
        private final String admobInterstitialUnitId;
        private final String admobMaxAdContentRating;
        private final boolean admobRewardedEnabled;
        private final String admobRewardedUnitId;
        private final boolean admobShowBannerOnStart;
        private final List<String> admobTestDeviceIds;
        private final int admobUnderAgeOfConsent;
        private final boolean admobUseTestAds;
        private final boolean backHistoryNavigation;
        private final boolean bridgeOwnOriginOnly;
        private final String colorMode;
        private final boolean desktopMode;
        private final boolean exitConfirmationDialog;
        private final boolean hasSplash;
        private final boolean isPro;
        private final boolean keepScreenOn;
        private final boolean loadingIndicator;
        private final String mode;
        private final int navBarAlpha;
        private final String navBarColor;
        private final String navBarIcons;
        private final boolean noInternetDialog;
        private final String orientation;
        private final String pdfReaderJson;
        private final List<String> permissions;
        private final String primaryColor;
        private final boolean pullToRefresh;
        private final boolean showActionBar;
        private final boolean showCameraCutout;
        private final boolean showHeader;
        private final boolean showWatermark;
        private final String splashBgColor;
        private final int splashDuration;
        private final int splashFadeDuration;
        private final boolean splashFadeOut;
        private final boolean splashFullScreen;
        private final boolean splashHideLoader;
        private final int splashIconRadius;
        private final int splashIconSize;
        private final String splashLoaderColor;
        private final int splashLoaderSize;
        private final String splashLoaderStyle;
        private final int splashLoaderThickness;
        private final int splashSpacing;
        private final int statusBarAlpha;
        private final String statusBarColor;
        private final String statusBarIcons;
        private final boolean umpDebugEnabled;
        private final String umpDebugGeography;
        private final List<String> umpTestDeviceIds;
        private final String url;
        private final String webBackgroundColor;
        private final WebViewSettings webViewSettings;

        public DisplayConfig() {
            this(null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, 0, 0, 0, 0, 0, 0, 0, null, false, false, null, null, null, 0, null, null, 0, null, false, false, null, null, 0, 0, null, false, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, null, -1, -1, null);
        }

        public final String component1() {
            return this.mode;
        }

        public final boolean component10() {
            return this.loadingIndicator;
        }

        public final boolean component11() {
            return this.backHistoryNavigation;
        }

        public final boolean component12() {
            return this.exitConfirmationDialog;
        }

        public final boolean component13() {
            return this.bridgeOwnOriginOnly;
        }

        public final String component14() {
            return this.orientation;
        }

        public final String component15() {
            return this.primaryColor;
        }

        public final boolean component16() {
            return this.hasSplash;
        }

        public final String component17() {
            return this.splashBgColor;
        }

        public final boolean component18() {
            return this.splashFadeOut;
        }

        public final String component19() {
            return this.splashLoaderStyle;
        }

        public final String component2() {
            return this.url;
        }

        public final int component20() {
            return this.splashIconSize;
        }

        public final int component21() {
            return this.splashIconRadius;
        }

        public final int component22() {
            return this.splashLoaderSize;
        }

        public final int component23() {
            return this.splashSpacing;
        }

        public final int component24() {
            return this.splashDuration;
        }

        public final int component25() {
            return this.splashLoaderThickness;
        }

        public final int component26() {
            return this.splashFadeDuration;
        }

        public final String component27() {
            return this.splashLoaderColor;
        }

        public final boolean component28() {
            return this.splashFullScreen;
        }

        public final boolean component29() {
            return this.splashHideLoader;
        }

        public final boolean component3() {
            return this.showHeader;
        }

        public final String component30() {
            return this.colorMode;
        }

        public final String component31() {
            return this.webBackgroundColor;
        }

        public final String component32() {
            return this.statusBarColor;
        }

        public final int component33() {
            return this.statusBarAlpha;
        }

        public final String component34() {
            return this.statusBarIcons;
        }

        public final String component35() {
            return this.navBarColor;
        }

        public final int component36() {
            return this.navBarAlpha;
        }

        public final String component37() {
            return this.navBarIcons;
        }

        public final boolean component38() {
            return this.showWatermark;
        }

        public final boolean component39() {
            return this.isPro;
        }

        public final boolean component4() {
            return this.showActionBar;
        }

        public final List<String> component40() {
            return this.permissions;
        }

        public final WebViewSettings component41() {
            return this.webViewSettings;
        }

        public final int component42() {
            return this.admobChildDirectedTreatment;
        }

        public final int component43() {
            return this.admobUnderAgeOfConsent;
        }

        public final String component44() {
            return this.admobMaxAdContentRating;
        }

        public final boolean component45() {
            return this.umpDebugEnabled;
        }

        public final String component46() {
            return this.umpDebugGeography;
        }

        public final List<String> component47() {
            return this.umpTestDeviceIds;
        }

        public final boolean component48() {
            return this.admobEnabled;
        }

        public final String component49() {
            return this.admobAppId;
        }

        public final boolean component5() {
            return this.keepScreenOn;
        }

        public final String component50() {
            return this.admobBannerUnitId;
        }

        public final String component51() {
            return this.admobInterstitialUnitId;
        }

        public final String component52() {
            return this.admobRewardedUnitId;
        }

        public final String component53() {
            return this.admobBannerPosition;
        }

        public final boolean component54() {
            return this.admobShowBannerOnStart;
        }

        public final List<String> component55() {
            return this.admobTestDeviceIds;
        }

        public final boolean component56() {
            return this.admobAutoLoadInterstitial;
        }

        public final boolean component57() {
            return this.admobAutoLoadRewarded;
        }

        public final boolean component58() {
            return this.admobUseTestAds;
        }

        public final boolean component59() {
            return this.admobBannerEnabled;
        }

        public final boolean component6() {
            return this.showCameraCutout;
        }

        public final boolean component60() {
            return this.admobInterstitialEnabled;
        }

        public final boolean component61() {
            return this.admobRewardedEnabled;
        }

        public final int component62() {
            return this.admobInterstitialIntervalSeconds;
        }

        public final int component63() {
            return this.admobInterstitialPageCount;
        }

        public final String component64() {
            return this.pdfReaderJson;
        }

        public final boolean component7() {
            return this.desktopMode;
        }

        public final boolean component8() {
            return this.pullToRefresh;
        }

        public final boolean component9() {
            return this.noInternetDialog;
        }

        public final DisplayConfig copy(String str, String str2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str3, String str4, boolean z17, String str5, boolean z18, String str6, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str7, boolean z19, boolean z20, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, boolean z21, boolean z22, List<String> list, WebViewSettings webViewSettings, int i15, int i16, String str14, boolean z23, String str15, List<String> list2, boolean z24, String str16, String str17, String str18, String str19, String str20, boolean z25, List<String> list3, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i17, int i18, String str21) {
            kotlin.jvm.internal.j.e("mode", str);
            kotlin.jvm.internal.j.e("url", str2);
            kotlin.jvm.internal.j.e("orientation", str3);
            kotlin.jvm.internal.j.e("primaryColor", str4);
            kotlin.jvm.internal.j.e("splashBgColor", str5);
            kotlin.jvm.internal.j.e("splashLoaderStyle", str6);
            kotlin.jvm.internal.j.e("splashLoaderColor", str7);
            kotlin.jvm.internal.j.e("colorMode", str8);
            kotlin.jvm.internal.j.e("webBackgroundColor", str9);
            kotlin.jvm.internal.j.e("statusBarColor", str10);
            kotlin.jvm.internal.j.e("statusBarIcons", str11);
            kotlin.jvm.internal.j.e("navBarColor", str12);
            kotlin.jvm.internal.j.e("navBarIcons", str13);
            kotlin.jvm.internal.j.e("permissions", list);
            kotlin.jvm.internal.j.e("webViewSettings", webViewSettings);
            kotlin.jvm.internal.j.e("admobMaxAdContentRating", str14);
            kotlin.jvm.internal.j.e("umpDebugGeography", str15);
            kotlin.jvm.internal.j.e("umpTestDeviceIds", list2);
            kotlin.jvm.internal.j.e("admobAppId", str16);
            kotlin.jvm.internal.j.e("admobBannerUnitId", str17);
            kotlin.jvm.internal.j.e("admobInterstitialUnitId", str18);
            kotlin.jvm.internal.j.e("admobRewardedUnitId", str19);
            kotlin.jvm.internal.j.e("admobBannerPosition", str20);
            kotlin.jvm.internal.j.e("admobTestDeviceIds", list3);
            kotlin.jvm.internal.j.e("pdfReaderJson", str21);
            return new DisplayConfig(str, str2, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, str3, str4, z17, str5, z18, str6, i6, i7, i8, i9, i10, i11, i12, str7, z19, z20, str8, str9, str10, i13, str11, str12, i14, str13, z21, z22, list, webViewSettings, i15, i16, str14, z23, str15, list2, z24, str16, str17, str18, str19, str20, z25, list3, z26, z27, z28, z29, z30, z31, i17, i18, str21);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayConfig)) {
                return false;
            }
            DisplayConfig displayConfig = (DisplayConfig) obj;
            return kotlin.jvm.internal.j.a(this.mode, displayConfig.mode) && kotlin.jvm.internal.j.a(this.url, displayConfig.url) && this.showHeader == displayConfig.showHeader && this.showActionBar == displayConfig.showActionBar && this.keepScreenOn == displayConfig.keepScreenOn && this.showCameraCutout == displayConfig.showCameraCutout && this.desktopMode == displayConfig.desktopMode && this.pullToRefresh == displayConfig.pullToRefresh && this.noInternetDialog == displayConfig.noInternetDialog && this.loadingIndicator == displayConfig.loadingIndicator && this.backHistoryNavigation == displayConfig.backHistoryNavigation && this.exitConfirmationDialog == displayConfig.exitConfirmationDialog && this.bridgeOwnOriginOnly == displayConfig.bridgeOwnOriginOnly && kotlin.jvm.internal.j.a(this.orientation, displayConfig.orientation) && kotlin.jvm.internal.j.a(this.primaryColor, displayConfig.primaryColor) && this.hasSplash == displayConfig.hasSplash && kotlin.jvm.internal.j.a(this.splashBgColor, displayConfig.splashBgColor) && this.splashFadeOut == displayConfig.splashFadeOut && kotlin.jvm.internal.j.a(this.splashLoaderStyle, displayConfig.splashLoaderStyle) && this.splashIconSize == displayConfig.splashIconSize && this.splashIconRadius == displayConfig.splashIconRadius && this.splashLoaderSize == displayConfig.splashLoaderSize && this.splashSpacing == displayConfig.splashSpacing && this.splashDuration == displayConfig.splashDuration && this.splashLoaderThickness == displayConfig.splashLoaderThickness && this.splashFadeDuration == displayConfig.splashFadeDuration && kotlin.jvm.internal.j.a(this.splashLoaderColor, displayConfig.splashLoaderColor) && this.splashFullScreen == displayConfig.splashFullScreen && this.splashHideLoader == displayConfig.splashHideLoader && kotlin.jvm.internal.j.a(this.colorMode, displayConfig.colorMode) && kotlin.jvm.internal.j.a(this.webBackgroundColor, displayConfig.webBackgroundColor) && kotlin.jvm.internal.j.a(this.statusBarColor, displayConfig.statusBarColor) && this.statusBarAlpha == displayConfig.statusBarAlpha && kotlin.jvm.internal.j.a(this.statusBarIcons, displayConfig.statusBarIcons) && kotlin.jvm.internal.j.a(this.navBarColor, displayConfig.navBarColor) && this.navBarAlpha == displayConfig.navBarAlpha && kotlin.jvm.internal.j.a(this.navBarIcons, displayConfig.navBarIcons) && this.showWatermark == displayConfig.showWatermark && this.isPro == displayConfig.isPro && kotlin.jvm.internal.j.a(this.permissions, displayConfig.permissions) && kotlin.jvm.internal.j.a(this.webViewSettings, displayConfig.webViewSettings) && this.admobChildDirectedTreatment == displayConfig.admobChildDirectedTreatment && this.admobUnderAgeOfConsent == displayConfig.admobUnderAgeOfConsent && kotlin.jvm.internal.j.a(this.admobMaxAdContentRating, displayConfig.admobMaxAdContentRating) && this.umpDebugEnabled == displayConfig.umpDebugEnabled && kotlin.jvm.internal.j.a(this.umpDebugGeography, displayConfig.umpDebugGeography) && kotlin.jvm.internal.j.a(this.umpTestDeviceIds, displayConfig.umpTestDeviceIds) && this.admobEnabled == displayConfig.admobEnabled && kotlin.jvm.internal.j.a(this.admobAppId, displayConfig.admobAppId) && kotlin.jvm.internal.j.a(this.admobBannerUnitId, displayConfig.admobBannerUnitId) && kotlin.jvm.internal.j.a(this.admobInterstitialUnitId, displayConfig.admobInterstitialUnitId) && kotlin.jvm.internal.j.a(this.admobRewardedUnitId, displayConfig.admobRewardedUnitId) && kotlin.jvm.internal.j.a(this.admobBannerPosition, displayConfig.admobBannerPosition) && this.admobShowBannerOnStart == displayConfig.admobShowBannerOnStart && kotlin.jvm.internal.j.a(this.admobTestDeviceIds, displayConfig.admobTestDeviceIds) && this.admobAutoLoadInterstitial == displayConfig.admobAutoLoadInterstitial && this.admobAutoLoadRewarded == displayConfig.admobAutoLoadRewarded && this.admobUseTestAds == displayConfig.admobUseTestAds && this.admobBannerEnabled == displayConfig.admobBannerEnabled && this.admobInterstitialEnabled == displayConfig.admobInterstitialEnabled && this.admobRewardedEnabled == displayConfig.admobRewardedEnabled && this.admobInterstitialIntervalSeconds == displayConfig.admobInterstitialIntervalSeconds && this.admobInterstitialPageCount == displayConfig.admobInterstitialPageCount && kotlin.jvm.internal.j.a(this.pdfReaderJson, displayConfig.pdfReaderJson);
        }

        public final String getAdmobAppId() {
            return this.admobAppId;
        }

        public final boolean getAdmobAutoLoadInterstitial() {
            return this.admobAutoLoadInterstitial;
        }

        public final boolean getAdmobAutoLoadRewarded() {
            return this.admobAutoLoadRewarded;
        }

        public final boolean getAdmobBannerEnabled() {
            return this.admobBannerEnabled;
        }

        public final String getAdmobBannerPosition() {
            return this.admobBannerPosition;
        }

        public final String getAdmobBannerUnitId() {
            return this.admobBannerUnitId;
        }

        public final int getAdmobChildDirectedTreatment() {
            return this.admobChildDirectedTreatment;
        }

        public final boolean getAdmobEnabled() {
            return this.admobEnabled;
        }

        public final boolean getAdmobInterstitialEnabled() {
            return this.admobInterstitialEnabled;
        }

        public final int getAdmobInterstitialIntervalSeconds() {
            return this.admobInterstitialIntervalSeconds;
        }

        public final int getAdmobInterstitialPageCount() {
            return this.admobInterstitialPageCount;
        }

        public final String getAdmobInterstitialUnitId() {
            return this.admobInterstitialUnitId;
        }

        public final String getAdmobMaxAdContentRating() {
            return this.admobMaxAdContentRating;
        }

        public final boolean getAdmobRewardedEnabled() {
            return this.admobRewardedEnabled;
        }

        public final String getAdmobRewardedUnitId() {
            return this.admobRewardedUnitId;
        }

        public final boolean getAdmobShowBannerOnStart() {
            return this.admobShowBannerOnStart;
        }

        public final List<String> getAdmobTestDeviceIds() {
            return this.admobTestDeviceIds;
        }

        public final int getAdmobUnderAgeOfConsent() {
            return this.admobUnderAgeOfConsent;
        }

        public final boolean getAdmobUseTestAds() {
            return this.admobUseTestAds;
        }

        public final boolean getBackHistoryNavigation() {
            return this.backHistoryNavigation;
        }

        public final boolean getBridgeOwnOriginOnly() {
            return this.bridgeOwnOriginOnly;
        }

        public final String getColorMode() {
            return this.colorMode;
        }

        public final boolean getDesktopMode() {
            return this.desktopMode;
        }

        public final boolean getExitConfirmationDialog() {
            return this.exitConfirmationDialog;
        }

        public final boolean getHasSplash() {
            return this.hasSplash;
        }

        public final boolean getKeepScreenOn() {
            return this.keepScreenOn;
        }

        public final boolean getLoadingIndicator() {
            return this.loadingIndicator;
        }

        public final String getMode() {
            return this.mode;
        }

        public final int getNavBarAlpha() {
            return this.navBarAlpha;
        }

        public final String getNavBarColor() {
            return this.navBarColor;
        }

        public final String getNavBarIcons() {
            return this.navBarIcons;
        }

        public final boolean getNoInternetDialog() {
            return this.noInternetDialog;
        }

        public final String getOrientation() {
            return this.orientation;
        }

        public final String getPdfReaderJson() {
            return this.pdfReaderJson;
        }

        public final List<String> getPermissions() {
            return this.permissions;
        }

        public final String getPrimaryColor() {
            return this.primaryColor;
        }

        public final boolean getPullToRefresh() {
            return this.pullToRefresh;
        }

        public final boolean getShowActionBar() {
            return this.showActionBar;
        }

        public final boolean getShowCameraCutout() {
            return this.showCameraCutout;
        }

        public final boolean getShowHeader() {
            return this.showHeader;
        }

        public final boolean getShowWatermark() {
            return this.showWatermark;
        }

        public final String getSplashBgColor() {
            return this.splashBgColor;
        }

        public final int getSplashDuration() {
            return this.splashDuration;
        }

        public final int getSplashFadeDuration() {
            return this.splashFadeDuration;
        }

        public final boolean getSplashFadeOut() {
            return this.splashFadeOut;
        }

        public final boolean getSplashFullScreen() {
            return this.splashFullScreen;
        }

        public final boolean getSplashHideLoader() {
            return this.splashHideLoader;
        }

        public final int getSplashIconRadius() {
            return this.splashIconRadius;
        }

        public final int getSplashIconSize() {
            return this.splashIconSize;
        }

        public final String getSplashLoaderColor() {
            return this.splashLoaderColor;
        }

        public final int getSplashLoaderSize() {
            return this.splashLoaderSize;
        }

        public final String getSplashLoaderStyle() {
            return this.splashLoaderStyle;
        }

        public final int getSplashLoaderThickness() {
            return this.splashLoaderThickness;
        }

        public final int getSplashSpacing() {
            return this.splashSpacing;
        }

        public final int getStatusBarAlpha() {
            return this.statusBarAlpha;
        }

        public final String getStatusBarColor() {
            return this.statusBarColor;
        }

        public final String getStatusBarIcons() {
            return this.statusBarIcons;
        }

        public final boolean getUmpDebugEnabled() {
            return this.umpDebugEnabled;
        }

        public final String getUmpDebugGeography() {
            return this.umpDebugGeography;
        }

        public final List<String> getUmpTestDeviceIds() {
            return this.umpTestDeviceIds;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getWebBackgroundColor() {
            return this.webBackgroundColor;
        }

        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public int hashCode() {
            return this.pdfReaderJson.hashCode() + ((Integer.hashCode(this.admobInterstitialPageCount) + ((Integer.hashCode(this.admobInterstitialIntervalSeconds) + androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c((this.admobTestDeviceIds.hashCode() + androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d(androidx.camera.view.g.d(androidx.camera.view.g.d(androidx.camera.view.g.d(androidx.camera.view.g.d(androidx.camera.camera2.internal.compat.workaround.c.c((this.umpTestDeviceIds.hashCode() + androidx.camera.view.g.d(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d((Integer.hashCode(this.admobUnderAgeOfConsent) + ((Integer.hashCode(this.admobChildDirectedTreatment) + ((this.webViewSettings.hashCode() + ((this.permissions.hashCode() + androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d((Integer.hashCode(this.navBarAlpha) + androidx.camera.view.g.d(androidx.camera.view.g.d((Integer.hashCode(this.statusBarAlpha) + androidx.camera.view.g.d(androidx.camera.view.g.d(androidx.camera.view.g.d(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d((Integer.hashCode(this.splashFadeDuration) + ((Integer.hashCode(this.splashLoaderThickness) + ((Integer.hashCode(this.splashDuration) + ((Integer.hashCode(this.splashSpacing) + ((Integer.hashCode(this.splashLoaderSize) + ((Integer.hashCode(this.splashIconRadius) + ((Integer.hashCode(this.splashIconSize) + androidx.camera.view.g.d(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d(androidx.camera.view.g.d(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.view.g.d(this.mode.hashCode() * 31, 31, this.url), 31, this.showHeader), 31, this.showActionBar), 31, this.keepScreenOn), 31, this.showCameraCutout), 31, this.desktopMode), 31, this.pullToRefresh), 31, this.noInternetDialog), 31, this.loadingIndicator), 31, this.backHistoryNavigation), 31, this.exitConfirmationDialog), 31, this.bridgeOwnOriginOnly), 31, this.orientation), 31, this.primaryColor), 31, this.hasSplash), 31, this.splashBgColor), 31, this.splashFadeOut), 31, this.splashLoaderStyle)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.splashLoaderColor), 31, this.splashFullScreen), 31, this.splashHideLoader), 31, this.colorMode), 31, this.webBackgroundColor), 31, this.statusBarColor)) * 31, 31, this.statusBarIcons), 31, this.navBarColor)) * 31, 31, this.navBarIcons), 31, this.showWatermark), 31, this.isPro)) * 31)) * 31)) * 31)) * 31, 31, this.admobMaxAdContentRating), 31, this.umpDebugEnabled), 31, this.umpDebugGeography)) * 31, 31, this.admobEnabled), 31, this.admobAppId), 31, this.admobBannerUnitId), 31, this.admobInterstitialUnitId), 31, this.admobRewardedUnitId), 31, this.admobBannerPosition), 31, this.admobShowBannerOnStart)) * 31, 31, this.admobAutoLoadInterstitial), 31, this.admobAutoLoadRewarded), 31, this.admobUseTestAds), 31, this.admobBannerEnabled), 31, this.admobInterstitialEnabled), 31, this.admobRewardedEnabled)) * 31)) * 31);
        }

        public final boolean isPro() {
            return this.isPro;
        }

        public String toString() {
            String str = this.mode;
            String str2 = this.url;
            boolean z6 = this.showHeader;
            boolean z7 = this.showActionBar;
            boolean z8 = this.keepScreenOn;
            boolean z9 = this.showCameraCutout;
            boolean z10 = this.desktopMode;
            boolean z11 = this.pullToRefresh;
            boolean z12 = this.noInternetDialog;
            boolean z13 = this.loadingIndicator;
            boolean z14 = this.backHistoryNavigation;
            boolean z15 = this.exitConfirmationDialog;
            boolean z16 = this.bridgeOwnOriginOnly;
            String str3 = this.orientation;
            String str4 = this.primaryColor;
            boolean z17 = this.hasSplash;
            String str5 = this.splashBgColor;
            boolean z18 = this.splashFadeOut;
            String str6 = this.splashLoaderStyle;
            int i6 = this.splashIconSize;
            int i7 = this.splashIconRadius;
            int i8 = this.splashLoaderSize;
            int i9 = this.splashSpacing;
            int i10 = this.splashDuration;
            int i11 = this.splashLoaderThickness;
            int i12 = this.splashFadeDuration;
            String str7 = this.splashLoaderColor;
            boolean z19 = this.splashFullScreen;
            boolean z20 = this.splashHideLoader;
            String str8 = this.colorMode;
            String str9 = this.webBackgroundColor;
            String str10 = this.statusBarColor;
            int i13 = this.statusBarAlpha;
            String str11 = this.statusBarIcons;
            String str12 = this.navBarColor;
            int i14 = this.navBarAlpha;
            String str13 = this.navBarIcons;
            boolean z21 = this.showWatermark;
            boolean z22 = this.isPro;
            List<String> list = this.permissions;
            WebViewSettings webViewSettings = this.webViewSettings;
            int i15 = this.admobChildDirectedTreatment;
            int i16 = this.admobUnderAgeOfConsent;
            String str14 = this.admobMaxAdContentRating;
            boolean z23 = this.umpDebugEnabled;
            String str15 = this.umpDebugGeography;
            List<String> list2 = this.umpTestDeviceIds;
            boolean z24 = this.admobEnabled;
            String str16 = this.admobAppId;
            String str17 = this.admobBannerUnitId;
            String str18 = this.admobInterstitialUnitId;
            String str19 = this.admobRewardedUnitId;
            String str20 = this.admobBannerPosition;
            boolean z25 = this.admobShowBannerOnStart;
            List<String> list3 = this.admobTestDeviceIds;
            boolean z26 = this.admobAutoLoadInterstitial;
            boolean z27 = this.admobAutoLoadRewarded;
            boolean z28 = this.admobUseTestAds;
            boolean z29 = this.admobBannerEnabled;
            boolean z30 = this.admobInterstitialEnabled;
            boolean z31 = this.admobRewardedEnabled;
            int i17 = this.admobInterstitialIntervalSeconds;
            int i18 = this.admobInterstitialPageCount;
            String str21 = this.pdfReaderJson;
            StringBuilder sbA = androidx.camera.camera2.internal.i0.a("DisplayConfig(mode=", str, ", url=", str2, ", showHeader=");
            sbA.append(z6);
            sbA.append(", showActionBar=");
            sbA.append(z7);
            sbA.append(", keepScreenOn=");
            sbA.append(z8);
            sbA.append(", showCameraCutout=");
            sbA.append(z9);
            sbA.append(", desktopMode=");
            sbA.append(z10);
            sbA.append(", pullToRefresh=");
            sbA.append(z11);
            sbA.append(", noInternetDialog=");
            sbA.append(z12);
            sbA.append(", loadingIndicator=");
            sbA.append(z13);
            sbA.append(", backHistoryNavigation=");
            sbA.append(z14);
            sbA.append(", exitConfirmationDialog=");
            sbA.append(z15);
            sbA.append(", bridgeOwnOriginOnly=");
            sbA.append(z16);
            sbA.append(", orientation=");
            sbA.append(str3);
            sbA.append(", primaryColor=");
            sbA.append(str4);
            sbA.append(", hasSplash=");
            sbA.append(z17);
            sbA.append(", splashBgColor=");
            sbA.append(str5);
            sbA.append(", splashFadeOut=");
            sbA.append(z18);
            sbA.append(", splashLoaderStyle=");
            sbA.append(str6);
            sbA.append(", splashIconSize=");
            sbA.append(i6);
            sbA.append(", splashIconRadius=");
            sbA.append(i7);
            sbA.append(", splashLoaderSize=");
            sbA.append(i8);
            sbA.append(", splashSpacing=");
            sbA.append(i9);
            sbA.append(", splashDuration=");
            sbA.append(i10);
            sbA.append(", splashLoaderThickness=");
            sbA.append(i11);
            sbA.append(", splashFadeDuration=");
            sbA.append(i12);
            sbA.append(", splashLoaderColor=");
            sbA.append(str7);
            sbA.append(", splashFullScreen=");
            sbA.append(z19);
            sbA.append(", splashHideLoader=");
            sbA.append(z20);
            sbA.append(", colorMode=");
            sbA.append(str8);
            sbA.append(", webBackgroundColor=");
            sbA.append(str9);
            sbA.append(", statusBarColor=");
            sbA.append(str10);
            sbA.append(", statusBarAlpha=");
            sbA.append(i13);
            sbA.append(", statusBarIcons=");
            sbA.append(str11);
            sbA.append(", navBarColor=");
            sbA.append(str12);
            sbA.append(", navBarAlpha=");
            sbA.append(i14);
            sbA.append(", navBarIcons=");
            sbA.append(str13);
            sbA.append(", showWatermark=");
            sbA.append(z21);
            sbA.append(", isPro=");
            sbA.append(z22);
            sbA.append(", permissions=");
            sbA.append(list);
            sbA.append(", webViewSettings=");
            sbA.append(webViewSettings);
            sbA.append(", admobChildDirectedTreatment=");
            sbA.append(i15);
            sbA.append(", admobUnderAgeOfConsent=");
            sbA.append(i16);
            sbA.append(", admobMaxAdContentRating=");
            sbA.append(str14);
            sbA.append(", umpDebugEnabled=");
            sbA.append(z23);
            sbA.append(", umpDebugGeography=");
            sbA.append(str15);
            sbA.append(", umpTestDeviceIds=");
            sbA.append(list2);
            sbA.append(", admobEnabled=");
            sbA.append(z24);
            sbA.append(", admobAppId=");
            sbA.append(str16);
            sbA.append(", admobBannerUnitId=");
            sbA.append(str17);
            sbA.append(", admobInterstitialUnitId=");
            sbA.append(str18);
            sbA.append(", admobRewardedUnitId=");
            sbA.append(str19);
            sbA.append(", admobBannerPosition=");
            sbA.append(str20);
            sbA.append(", admobShowBannerOnStart=");
            sbA.append(z25);
            sbA.append(", admobTestDeviceIds=");
            sbA.append(list3);
            sbA.append(", admobAutoLoadInterstitial=");
            sbA.append(z26);
            sbA.append(", admobAutoLoadRewarded=");
            sbA.append(z27);
            sbA.append(", admobUseTestAds=");
            sbA.append(z28);
            sbA.append(", admobBannerEnabled=");
            sbA.append(z29);
            sbA.append(", admobInterstitialEnabled=");
            sbA.append(z30);
            sbA.append(", admobRewardedEnabled=");
            sbA.append(z31);
            sbA.append(", admobInterstitialIntervalSeconds=");
            sbA.append(i17);
            sbA.append(", admobInterstitialPageCount=");
            sbA.append(i18);
            sbA.append(", pdfReaderJson=");
            sbA.append(str21);
            sbA.append(")");
            return sbA.toString();
        }

        public DisplayConfig(String str, String str2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str3, String str4, boolean z17, String str5, boolean z18, String str6, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str7, boolean z19, boolean z20, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, boolean z21, boolean z22, List<String> list, WebViewSettings webViewSettings, int i15, int i16, String str14, boolean z23, String str15, List<String> list2, boolean z24, String str16, String str17, String str18, String str19, String str20, boolean z25, List<String> list3, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i17, int i18, String str21) {
            kotlin.jvm.internal.j.e("mode", str);
            kotlin.jvm.internal.j.e("url", str2);
            kotlin.jvm.internal.j.e("orientation", str3);
            kotlin.jvm.internal.j.e("primaryColor", str4);
            kotlin.jvm.internal.j.e("splashBgColor", str5);
            kotlin.jvm.internal.j.e("splashLoaderStyle", str6);
            kotlin.jvm.internal.j.e("splashLoaderColor", str7);
            kotlin.jvm.internal.j.e("colorMode", str8);
            kotlin.jvm.internal.j.e("webBackgroundColor", str9);
            kotlin.jvm.internal.j.e("statusBarColor", str10);
            kotlin.jvm.internal.j.e("statusBarIcons", str11);
            kotlin.jvm.internal.j.e("navBarColor", str12);
            kotlin.jvm.internal.j.e("navBarIcons", str13);
            kotlin.jvm.internal.j.e("permissions", list);
            kotlin.jvm.internal.j.e("webViewSettings", webViewSettings);
            kotlin.jvm.internal.j.e("admobMaxAdContentRating", str14);
            kotlin.jvm.internal.j.e("umpDebugGeography", str15);
            kotlin.jvm.internal.j.e("umpTestDeviceIds", list2);
            kotlin.jvm.internal.j.e("admobAppId", str16);
            kotlin.jvm.internal.j.e("admobBannerUnitId", str17);
            kotlin.jvm.internal.j.e("admobInterstitialUnitId", str18);
            kotlin.jvm.internal.j.e("admobRewardedUnitId", str19);
            kotlin.jvm.internal.j.e("admobBannerPosition", str20);
            kotlin.jvm.internal.j.e("admobTestDeviceIds", list3);
            kotlin.jvm.internal.j.e("pdfReaderJson", str21);
            this.mode = str;
            this.url = str2;
            this.showHeader = z6;
            this.showActionBar = z7;
            this.keepScreenOn = z8;
            this.showCameraCutout = z9;
            this.desktopMode = z10;
            this.pullToRefresh = z11;
            this.noInternetDialog = z12;
            this.loadingIndicator = z13;
            this.backHistoryNavigation = z14;
            this.exitConfirmationDialog = z15;
            this.bridgeOwnOriginOnly = z16;
            this.orientation = str3;
            this.primaryColor = str4;
            this.hasSplash = z17;
            this.splashBgColor = str5;
            this.splashFadeOut = z18;
            this.splashLoaderStyle = str6;
            this.splashIconSize = i6;
            this.splashIconRadius = i7;
            this.splashLoaderSize = i8;
            this.splashSpacing = i9;
            this.splashDuration = i10;
            this.splashLoaderThickness = i11;
            this.splashFadeDuration = i12;
            this.splashLoaderColor = str7;
            this.splashFullScreen = z19;
            this.splashHideLoader = z20;
            this.colorMode = str8;
            this.webBackgroundColor = str9;
            this.statusBarColor = str10;
            this.statusBarAlpha = i13;
            this.statusBarIcons = str11;
            this.navBarColor = str12;
            this.navBarAlpha = i14;
            this.navBarIcons = str13;
            this.showWatermark = z21;
            this.isPro = z22;
            this.permissions = list;
            this.webViewSettings = webViewSettings;
            this.admobChildDirectedTreatment = i15;
            this.admobUnderAgeOfConsent = i16;
            this.admobMaxAdContentRating = str14;
            this.umpDebugEnabled = z23;
            this.umpDebugGeography = str15;
            this.umpTestDeviceIds = list2;
            this.admobEnabled = z24;
            this.admobAppId = str16;
            this.admobBannerUnitId = str17;
            this.admobInterstitialUnitId = str18;
            this.admobRewardedUnitId = str19;
            this.admobBannerPosition = str20;
            this.admobShowBannerOnStart = z25;
            this.admobTestDeviceIds = list3;
            this.admobAutoLoadInterstitial = z26;
            this.admobAutoLoadRewarded = z27;
            this.admobUseTestAds = z28;
            this.admobBannerEnabled = z29;
            this.admobInterstitialEnabled = z30;
            this.admobRewardedEnabled = z31;
            this.admobInterstitialIntervalSeconds = i17;
            this.admobInterstitialPageCount = i18;
            this.pdfReaderJson = str21;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ DisplayConfig(String str, String str2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str3, String str4, boolean z17, String str5, boolean z18, String str6, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str7, boolean z19, boolean z20, String str8, String str9, String str10, int i13, String str11, String str12, int i14, String str13, boolean z21, boolean z22, List list, WebViewSettings webViewSettings, int i15, int i16, String str14, boolean z23, String str15, List list2, boolean z24, String str16, String str17, String str18, String str19, String str20, boolean z25, List list3, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, int i17, int i18, String str21, int i19, int i20, kotlin.jvm.internal.f fVar) {
            String str22 = (i19 & 1) != 0 ? "local" : str;
            String str23 = (i19 & 2) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
            boolean z32 = (i19 & 4) != 0 ? true : z6;
            boolean z33 = (i19 & 8) != 0 ? false : z7;
            boolean z34 = (i19 & 16) != 0 ? false : z8;
            boolean z35 = (i19 & 32) != 0 ? false : z9;
            boolean z36 = (i19 & 64) != 0 ? false : z10;
            boolean z37 = (i19 & 128) != 0 ? true : z11;
            boolean z38 = (i19 & 256) != 0 ? true : z12;
            boolean z39 = (i19 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z13;
            boolean z40 = (i19 & 1024) != 0 ? true : z14;
            boolean z41 = (i19 & 2048) != 0 ? false : z15;
            boolean z42 = (i19 & 4096) != 0 ? true : z16;
            String str24 = str22;
            String str25 = (i19 & 8192) != 0 ? "portrait" : str3;
            String str26 = (i19 & 16384) != 0 ? "#2196F3" : str4;
            boolean z43 = (i19 & 32768) != 0 ? false : z17;
            String str27 = (i19 & 65536) != 0 ? "#0F1318" : str5;
            boolean z44 = (i19 & 131072) != 0 ? true : z18;
            String str28 = (i19 & 262144) != 0 ? "circle" : str6;
            int i21 = (i19 & 524288) != 0 ? 120 : i6;
            int i22 = (i19 & 1048576) != 0 ? 16 : i7;
            int i23 = (i19 & 2097152) != 0 ? 48 : i8;
            int i24 = (i19 & 4194304) != 0 ? 28 : i9;
            int i25 = (i19 & 8388608) != 0 ? 2 : i10;
            int i26 = (i19 & 16777216) != 0 ? 4 : i11;
            int i27 = (i19 & 33554432) != 0 ? 400 : i12;
            String str29 = (i19 & 67108864) != 0 ? "#00E5CC" : str7;
            boolean z45 = (i19 & 134217728) != 0 ? false : z19;
            boolean z46 = (i19 & 268435456) != 0 ? false : z20;
            String str30 = (i19 & 536870912) != 0 ? "auto" : str8;
            String str31 = (i19 & 1073741824) != 0 ? "#000000" : str9;
            String str32 = (i19 & Integer.MIN_VALUE) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str10;
            int i28 = (i20 & 1) != 0 ? 100 : i13;
            String str33 = (i20 & 2) != 0 ? "auto" : str11;
            String str34 = (i20 & 4) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str12;
            int i29 = (i20 & 8) != 0 ? 100 : i14;
            String str35 = (i20 & 16) == 0 ? str13 : "auto";
            boolean z47 = (i20 & 32) != 0 ? false : z21;
            boolean z48 = (i20 & 64) != 0 ? false : z22;
            String str36 = str32;
            int i30 = i20 & 128;
            List list4 = e5.s.s;
            this(str24, str23, z32, z33, z34, z35, z36, z37, z38, z39, z40, z41, z42, str25, str26, z43, str27, z44, str28, i21, i22, i23, i24, i25, i26, i27, str29, z45, z46, str30, str31, str36, i28, str33, str34, i29, str35, z47, z48, i30 != 0 ? list4 : list, (i20 & 256) != 0 ? new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, null, 0, false, 32767, null) : webViewSettings, (i20 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? -1 : i15, (i20 & 1024) != 0 ? -1 : i16, (i20 & 2048) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str14, (i20 & 4096) != 0 ? false : z23, (i20 & 8192) != 0 ? "DISABLED" : str15, (i20 & 16384) != 0 ? list4 : list2, (i20 & 32768) != 0 ? false : z24, (i20 & 65536) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str16, (i20 & 131072) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str17, (i20 & 262144) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str18, (i20 & 524288) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str19, (i20 & 1048576) != 0 ? "bottom" : str20, (i20 & 2097152) != 0 ? false : z25, (i20 & 4194304) == 0 ? list3 : list4, (i20 & 8388608) != 0 ? false : z26, (i20 & 16777216) != 0 ? false : z27, (i20 & 33554432) != 0 ? false : z28, (i20 & 67108864) != 0 ? false : z29, (i20 & 134217728) != 0 ? false : z30, (i20 & 268435456) != 0 ? false : z31, (i20 & 536870912) != 0 ? 0 : i17, (i20 & 1073741824) != 0 ? 0 : i18, (i20 & Integer.MIN_VALUE) != 0 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str21);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class PullRefreshGuard {
        private volatile boolean blocked;

        public final boolean getBlocked() {
            return this.blocked;
        }

        @JavascriptInterface
        public final void setBlocked(boolean z6) {
            this.blocked = z6;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class UriReadResult {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class Content extends UriReadResult {
            private final String base64;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(String str) {
                super(null);
                kotlin.jvm.internal.j.e("base64", str);
                this.base64 = str;
            }

            public static /* synthetic */ Content copy$default(Content content, String str, int i6, Object obj) {
                if ((i6 & 1) != 0) {
                    str = content.base64;
                }
                return content.copy(str);
            }

            public final String component1() {
                return this.base64;
            }

            public final Content copy(String str) {
                kotlin.jvm.internal.j.e("base64", str);
                return new Content(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && kotlin.jvm.internal.j.a(this.base64, ((Content) obj).base64);
            }

            public final String getBase64() {
                return this.base64;
            }

            public int hashCode() {
                return this.base64.hashCode();
            }

            public String toString() {
                return androidx.camera.camera2.internal.v0.b("Content(base64=", this.base64, ")");
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class Error extends UriReadResult {
            private final String code;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String str) {
                super(null);
                kotlin.jvm.internal.j.e("code", str);
                this.code = str;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i6, Object obj) {
                if ((i6 & 1) != 0) {
                    str = error.code;
                }
                return error.copy(str);
            }

            public final String component1() {
                return this.code;
            }

            public final Error copy(String str) {
                kotlin.jvm.internal.j.e("code", str);
                return new Error(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && kotlin.jvm.internal.j.a(this.code, ((Error) obj).code);
            }

            public final String getCode() {
                return this.code;
            }

            public int hashCode() {
                return this.code.hashCode();
            }

            public String toString() {
                return androidx.camera.camera2.internal.v0.b("Error(code=", this.code, ")");
            }
        }

        public /* synthetic */ UriReadResult(kotlin.jvm.internal.f fVar) {
            this();
        }

        private UriReadResult() {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class WebCompatBridge {
        public WebCompatBridge() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void unlockOrientation$lambda$1(WebViewActivity webViewActivity) {
            webViewActivity.setRequestedOrientation(webViewActivity.configuredOrientation);
        }

        @JavascriptInterface
        public final String lockOrientation(String str) {
            kotlin.jvm.internal.j.e("type", str);
            Integer numWebOrientationToActivity = WebViewActivityKt.webOrientationToActivity(str);
            if (numWebOrientationToActivity == null) {
                return "invalid_orientation";
            }
            final int iIntValue = numWebOrientationToActivity.intValue();
            final WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.runOnUiThread(new Runnable() { // from class: com.htmltoapk.template.l1
                @Override // java.lang.Runnable
                public final void run() {
                    webViewActivity.setRequestedOrientation(iIntValue);
                }
            });
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }

        @JavascriptInterface
        public final void unlockOrientation() {
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.runOnUiThread(new k1(webViewActivity, 0));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class WebViewSettings {
        private final boolean allowContentAccess;
        private final boolean allowFileAccess;
        private final boolean allowFileAccessFromFileURLs;
        private final boolean allowUniversalAccessFromFileURLs;
        private final boolean builtInZoomControls;
        private final int cacheMode;
        private final boolean displayZoomControls;
        private final boolean domStorageEnabled;
        private final boolean geolocationEnabled;
        private final boolean javaScriptEnabled;
        private final boolean loadWithOverviewMode;
        private final int mixedContentMode;
        private final int textZoom;
        private final boolean useWideViewPort;
        private final String userAgent;

        public WebViewSettings() {
            this(false, false, false, false, false, false, false, false, false, false, 0, 0, null, 0, false, 32767, null);
        }

        public final boolean component1() {
            return this.javaScriptEnabled;
        }

        public final boolean component10() {
            return this.loadWithOverviewMode;
        }

        public final int component11() {
            return this.cacheMode;
        }

        public final int component12() {
            return this.mixedContentMode;
        }

        public final String component13() {
            return this.userAgent;
        }

        public final int component14() {
            return this.textZoom;
        }

        public final boolean component15() {
            return this.geolocationEnabled;
        }

        public final boolean component2() {
            return this.domStorageEnabled;
        }

        public final boolean component3() {
            return this.allowFileAccess;
        }

        public final boolean component4() {
            return this.allowContentAccess;
        }

        public final boolean component5() {
            return this.allowUniversalAccessFromFileURLs;
        }

        public final boolean component6() {
            return this.allowFileAccessFromFileURLs;
        }

        public final boolean component7() {
            return this.builtInZoomControls;
        }

        public final boolean component8() {
            return this.displayZoomControls;
        }

        public final boolean component9() {
            return this.useWideViewPort;
        }

        public final WebViewSettings copy(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i6, int i7, String str, int i8, boolean z16) {
            return new WebViewSettings(z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, i6, i7, str, i8, z16);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewSettings)) {
                return false;
            }
            WebViewSettings webViewSettings = (WebViewSettings) obj;
            return this.javaScriptEnabled == webViewSettings.javaScriptEnabled && this.domStorageEnabled == webViewSettings.domStorageEnabled && this.allowFileAccess == webViewSettings.allowFileAccess && this.allowContentAccess == webViewSettings.allowContentAccess && this.allowUniversalAccessFromFileURLs == webViewSettings.allowUniversalAccessFromFileURLs && this.allowFileAccessFromFileURLs == webViewSettings.allowFileAccessFromFileURLs && this.builtInZoomControls == webViewSettings.builtInZoomControls && this.displayZoomControls == webViewSettings.displayZoomControls && this.useWideViewPort == webViewSettings.useWideViewPort && this.loadWithOverviewMode == webViewSettings.loadWithOverviewMode && this.cacheMode == webViewSettings.cacheMode && this.mixedContentMode == webViewSettings.mixedContentMode && kotlin.jvm.internal.j.a(this.userAgent, webViewSettings.userAgent) && this.textZoom == webViewSettings.textZoom && this.geolocationEnabled == webViewSettings.geolocationEnabled;
        }

        public final boolean getAllowContentAccess() {
            return this.allowContentAccess;
        }

        public final boolean getAllowFileAccess() {
            return this.allowFileAccess;
        }

        public final boolean getAllowFileAccessFromFileURLs() {
            return this.allowFileAccessFromFileURLs;
        }

        public final boolean getAllowUniversalAccessFromFileURLs() {
            return this.allowUniversalAccessFromFileURLs;
        }

        public final boolean getBuiltInZoomControls() {
            return this.builtInZoomControls;
        }

        public final int getCacheMode() {
            return this.cacheMode;
        }

        public final boolean getDisplayZoomControls() {
            return this.displayZoomControls;
        }

        public final boolean getDomStorageEnabled() {
            return this.domStorageEnabled;
        }

        public final boolean getGeolocationEnabled() {
            return this.geolocationEnabled;
        }

        public final boolean getJavaScriptEnabled() {
            return this.javaScriptEnabled;
        }

        public final boolean getLoadWithOverviewMode() {
            return this.loadWithOverviewMode;
        }

        public final int getMixedContentMode() {
            return this.mixedContentMode;
        }

        public final int getTextZoom() {
            return this.textZoom;
        }

        public final boolean getUseWideViewPort() {
            return this.useWideViewPort;
        }

        public final String getUserAgent() {
            return this.userAgent;
        }

        public int hashCode() {
            int iHashCode = (Integer.hashCode(this.mixedContentMode) + ((Integer.hashCode(this.cacheMode) + androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(androidx.camera.camera2.internal.compat.workaround.c.c(Boolean.hashCode(this.javaScriptEnabled) * 31, 31, this.domStorageEnabled), 31, this.allowFileAccess), 31, this.allowContentAccess), 31, this.allowUniversalAccessFromFileURLs), 31, this.allowFileAccessFromFileURLs), 31, this.builtInZoomControls), 31, this.displayZoomControls), 31, this.useWideViewPort), 31, this.loadWithOverviewMode)) * 31)) * 31;
            String str = this.userAgent;
            return Boolean.hashCode(this.geolocationEnabled) + ((Integer.hashCode(this.textZoom) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public String toString() {
            return "WebViewSettings(javaScriptEnabled=" + this.javaScriptEnabled + ", domStorageEnabled=" + this.domStorageEnabled + ", allowFileAccess=" + this.allowFileAccess + ", allowContentAccess=" + this.allowContentAccess + ", allowUniversalAccessFromFileURLs=" + this.allowUniversalAccessFromFileURLs + ", allowFileAccessFromFileURLs=" + this.allowFileAccessFromFileURLs + ", builtInZoomControls=" + this.builtInZoomControls + ", displayZoomControls=" + this.displayZoomControls + ", useWideViewPort=" + this.useWideViewPort + ", loadWithOverviewMode=" + this.loadWithOverviewMode + ", cacheMode=" + this.cacheMode + ", mixedContentMode=" + this.mixedContentMode + ", userAgent=" + this.userAgent + ", textZoom=" + this.textZoom + ", geolocationEnabled=" + this.geolocationEnabled + ")";
        }

        public WebViewSettings(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i6, int i7, String str, int i8, boolean z16) {
            this.javaScriptEnabled = z6;
            this.domStorageEnabled = z7;
            this.allowFileAccess = z8;
            this.allowContentAccess = z9;
            this.allowUniversalAccessFromFileURLs = z10;
            this.allowFileAccessFromFileURLs = z11;
            this.builtInZoomControls = z12;
            this.displayZoomControls = z13;
            this.useWideViewPort = z14;
            this.loadWithOverviewMode = z15;
            this.cacheMode = i6;
            this.mixedContentMode = i7;
            this.userAgent = str;
            this.textZoom = i8;
            this.geolocationEnabled = z16;
        }

        public /* synthetic */ WebViewSettings(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i6, int i7, String str, int i8, boolean z16, int i9, kotlin.jvm.internal.f fVar) {
            this((i9 & 1) != 0 ? true : z6, (i9 & 2) != 0 ? true : z7, (i9 & 4) != 0 ? false : z8, (i9 & 8) != 0 ? false : z9, (i9 & 16) != 0 ? true : z10, (i9 & 32) != 0 ? true : z11, (i9 & 64) != 0 ? true : z12, (i9 & 128) != 0 ? false : z13, (i9 & 256) != 0 ? true : z14, (i9 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? z15 : true, (i9 & 1024) != 0 ? -1 : i6, (i9 & 2048) != 0 ? 0 : i7, (i9 & 4096) != 0 ? null : str, (i9 & 8192) != 0 ? 100 : i8, (i9 & 16384) != 0 ? false : z16);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.htmltoapk.template.WebViewActivity$onCreate$13, reason: invalid class name */
    public static final class AnonymousClass13 extends WebViewClient {
        final /* synthetic */ boolean $isLocalMode;
        final /* synthetic */ boolean $isUrlMode;

        public AnonymousClass13(boolean z6, boolean z7) {
            this.$isUrlMode = z6;
            this.$isLocalMode = z7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPageFinished$lambda$1(WebViewActivity webViewActivity) {
            webViewActivity.hideSplash();
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z6) {
            super.doUpdateVisitedHistory(webView, str, z6);
            BridgeGate bridgeGate = WebViewActivity.this.bridgeGate;
            if (bridgeGate != null) {
                bridgeGate.onMainFrameUrl(str);
            } else {
                kotlin.jvm.internal.j.g("bridgeGate");
                throw null;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Dialog dialog;
            WebViewActivity.this.pageLoadFinished = true;
            WebViewActivity.this.pageLoadHandler.removeCallbacks(WebViewActivity.this.pageLoadTimeoutRunnable);
            ProgressBar progressBar = WebViewActivity.this.progressBar;
            if (progressBar == null) {
                kotlin.jvm.internal.j.g("progressBar");
                throw null;
            }
            progressBar.setVisibility(8);
            DisplayConfig displayConfig = WebViewActivity.this.displayConfig;
            if (displayConfig == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            if (displayConfig.getHasSplash()) {
                if (WebViewActivity.this.displayConfig == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw null;
                }
                long jMax = Math.max(0L, (u5.d.p(r0.getSplashDuration(), 1, 15) * 1000) - (System.currentTimeMillis() - WebViewActivity.this.splashStartTime));
                Runnable runnable = WebViewActivity.this.splashDismissRunnable;
                if (runnable != null) {
                    WebViewActivity.this.splashHandler.removeCallbacks(runnable);
                }
                WebViewActivity webViewActivity = WebViewActivity.this;
                webViewActivity.splashDismissRunnable = new j1(webViewActivity, 1);
                Handler handler = WebViewActivity.this.splashHandler;
                Runnable runnable2 = WebViewActivity.this.splashDismissRunnable;
                kotlin.jvm.internal.j.b(runnable2);
                handler.postDelayed(runnable2, jMax);
            } else {
                WebViewActivity.this.hideSplash();
            }
            SwipeRefreshLayout swipeRefreshLayout = WebViewActivity.this.swipeRefreshLayout;
            if (swipeRefreshLayout == null) {
                kotlin.jvm.internal.j.g("swipeRefreshLayout");
                throw null;
            }
            swipeRefreshLayout.setRefreshing(false);
            if (!WebViewActivity.this.lastPageLoadFailed && WebViewActivity.this.isNetworkConnected() && (dialog = WebViewActivity.this.noInternetDialog) != null && dialog.isShowing()) {
                Dialog dialog2 = WebViewActivity.this.noInternetDialog;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                WebViewActivity.this.noInternetDialog = null;
            }
            WebViewActivity.this.emitDeepLink();
            WebViewActivity.this.injectCleartextInterceptor();
            WebViewActivity.this.injectBlobDownloadInterceptor();
            if (webView != null) {
                webView.evaluateJavascript("window.print = function() { AndroidAPI.printPage(); };", null);
            }
            if (webView != null) {
                webView.evaluateJavascript(WebViewActivityKt.WEB_API_SHIM_SCRIPT, null);
            }
            if (this.$isUrlMode) {
                DisplayConfig displayConfig2 = WebViewActivity.this.displayConfig;
                if (displayConfig2 == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw null;
                }
                if (displayConfig2.getPullToRefresh() && webView != null) {
                    webView.evaluateJavascript(WebViewActivityKt.PULL_REFRESH_GUARD_SCRIPT, null);
                }
            }
            if (WebViewActivity.this.adMobBridge != null) {
                AdMobBridge adMobBridge = WebViewActivity.this.adMobBridge;
                if (adMobBridge == null) {
                    kotlin.jvm.internal.j.g("adMobBridge");
                    throw null;
                }
                adMobBridge.onPageLoaded();
            }
            Log.d("WebViewActivity", "WebView page finished: " + str);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            BridgeGate bridgeGate = WebViewActivity.this.bridgeGate;
            if (bridgeGate == null) {
                kotlin.jvm.internal.j.g("bridgeGate");
                throw null;
            }
            bridgeGate.onMainFrameUrl(str);
            if (webView != null) {
                webView.setBackgroundColor(WebViewActivity.this.currentWebBgColor);
            }
            WebViewActivity.this.pageLoadFinished = false;
            WebViewActivity.this.lastPageLoadFailed = false;
            WebViewActivity.this.injectCleartextInterceptor();
            WebViewActivity.this.injectBlobDownloadInterceptor();
            if (this.$isUrlMode) {
                DisplayConfig displayConfig = WebViewActivity.this.displayConfig;
                if (displayConfig == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw null;
                }
                if (displayConfig.getLoadingIndicator()) {
                    ProgressBar progressBar = WebViewActivity.this.progressBar;
                    if (progressBar == null) {
                        kotlin.jvm.internal.j.g("progressBar");
                        throw null;
                    }
                    progressBar.setVisibility(0);
                    ProgressBar progressBar2 = WebViewActivity.this.progressBar;
                    if (progressBar2 == null) {
                        kotlin.jvm.internal.j.g("progressBar");
                        throw null;
                    }
                    progressBar2.setProgress(10);
                }
            } else {
                ProgressBar progressBar3 = WebViewActivity.this.progressBar;
                if (progressBar3 == null) {
                    kotlin.jvm.internal.j.g("progressBar");
                    throw null;
                }
                progressBar3.setVisibility(8);
            }
            WebViewActivity.this.pageLoadHandler.removeCallbacks(WebViewActivity.this.pageLoadTimeoutRunnable);
            WebViewActivity.this.pageLoadHandler.postDelayed(WebViewActivity.this.pageLoadTimeoutRunnable, 20000L);
            Log.d("WebViewActivity", "WebView page started: " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            CharSequence description;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            CharSequence description2 = webResourceError != null ? webResourceError.getDescription() : null;
            Log.d("WebViewActivity", "WebView error on " + url + ": " + ((Object) description2) + " (" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + ")");
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            SwipeRefreshLayout swipeRefreshLayout = WebViewActivity.this.swipeRefreshLayout;
            if (swipeRefreshLayout == null) {
                kotlin.jvm.internal.j.g("swipeRefreshLayout");
                throw null;
            }
            swipeRefreshLayout.setRefreshing(false);
            WebViewActivity.this.lastPageLoadFailed = true;
            if (this.$isUrlMode) {
                DisplayConfig displayConfig = WebViewActivity.this.displayConfig;
                if (displayConfig == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw null;
                }
                if (displayConfig.getNoInternetDialog()) {
                    WebViewActivity.this.showNoInternetDialog();
                    return;
                }
            }
            WebViewActivity webViewActivity = WebViewActivity.this;
            int i6 = R.string.error_page_load;
            if (webResourceError == null || (description = webResourceError.getDescription()) == null) {
                description = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            String string = webViewActivity.getString(i6, description);
            kotlin.jvm.internal.j.d("getString(...)", string);
            webViewActivity.onPageLoadFailed(string);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String string;
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            Log.d("WebViewActivity", "WebView HTTP error on " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + ": " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null));
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame() || this.$isUrlMode) {
                return;
            }
            WebViewActivity webViewActivity = WebViewActivity.this;
            int i6 = R.string.error_server;
            if (webResourceResponse == null || (string = Integer.valueOf(webResourceResponse.getStatusCode()).toString()) == null) {
                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            String string2 = webViewActivity.getString(i6, string);
            kotlin.jvm.internal.j.d("getString(...)", string2);
            webViewActivity.onPageLoadFailed(string2);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws IOException {
            Uri url;
            WebResourceResponse webResourceResponseFetchProxyResource;
            WebResourceResponse webResourceResponseA;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            boolean z6 = this.$isLocalMode;
            boolean z7 = false;
            String lowerCase = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (z6) {
                h2.b bVar = WebViewActivity.this.assetLoader;
                Integer num = null;
                if (bVar != null) {
                    ArrayList arrayList = bVar.f13275a;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        b.c cVar = (b.c) obj;
                        cVar.getClass();
                        String str = cVar.f13278b;
                        b.InterfaceC0065b interfaceC0065b = (!url.getScheme().equals("http") && (url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(cVar.f13277a) && url.getPath().startsWith(str)) ? cVar.f13279c : null;
                        if (interfaceC0065b != null) {
                            webResourceResponseA = interfaceC0065b.a(url.getPath().replaceFirst(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                            break;
                        }
                    }
                    webResourceResponseA = null;
                    if (webResourceResponseA != null) {
                        String path = url.getPath();
                        if (path != null) {
                            lowerCase = path;
                        }
                        String mimeType = webResourceResponseA.getMimeType();
                        if (((mimeType != null && x5.o.o(mimeType, "html", true)) || x5.l.j(lowerCase, ".html", true) || x5.l.j(lowerCase, "/", false) || lowerCase.equals("/assets/www")) && webResourceResponseA.getData() != null) {
                            try {
                                String str2 = "\n<script>\n" + WebViewActivityKt.CLEARTEXT_INTERCEPTOR_SCRIPT + "\n" + WebViewActivityKt.DOWNLOAD_INTERCEPTOR_SCRIPT + "\nwindow.print = function() { AndroidAPI.printPage(); };\n" + WebViewActivityKt.WEB_API_SHIM_SCRIPT + "\n</script>\n";
                                HtmlScriptInjector htmlScriptInjector = HtmlScriptInjector.INSTANCE;
                                InputStream data = webResourceResponseA.getData();
                                kotlin.jvm.internal.j.d("getData(...)", data);
                                InputStream inputStreamInject = htmlScriptInjector.inject(data, str2);
                                Map<String, String> responseHeaders = webResourceResponseA.getResponseHeaders();
                                LinkedHashMap linkedHashMap = responseHeaders != null ? new LinkedHashMap(responseHeaders) : new LinkedHashMap();
                                linkedHashMap.put("Cache-Control", "no-cache, no-store, must-revalidate");
                                int statusCode = webResourceResponseA.getStatusCode();
                                Integer numValueOf = Integer.valueOf(statusCode);
                                if ((100 <= statusCode && statusCode < 300) || (400 <= statusCode && statusCode < 600)) {
                                    num = numValueOf;
                                }
                                int iIntValue = num != null ? num.intValue() : 200;
                                String reasonPhrase = webResourceResponseA.getReasonPhrase();
                                if (reasonPhrase == null) {
                                    reasonPhrase = "OK";
                                }
                                return new WebResourceResponse("text/html", "UTF-8", iIntValue, reasonPhrase, linkedHashMap, inputStreamInject);
                            } catch (Exception e6) {
                                Log.e("WebViewActivity", "Failed to inject cleartext script into HTML: " + e6.getMessage(), e6);
                                try {
                                    String strZ = x5.o.z(x5.o.z(x5.o.C(lowerCase, "/assets/", lowerCase), "www/"), "/");
                                    if (x5.o.v(strZ)) {
                                        strZ = "index.html";
                                    }
                                    InputStream inputStreamOpen = WebViewActivity.this.getAssets().open("www/" + ((Object) strZ));
                                    kotlin.jvm.internal.j.d("open(...)", inputStreamOpen);
                                    return new WebResourceResponse("text/html", "UTF-8", 200, "OK", null, inputStreamOpen);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        return webResourceResponseA;
                    }
                } else {
                    webResourceResponseA = null;
                    if (webResourceResponseA != null) {
                    }
                }
            }
            String path2 = url.getPath();
            if (path2 == null) {
                path2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            String host = url.getHost();
            if (host != null) {
                lowerCase = host.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
            }
            boolean z8 = lowerCase.equals(TrustedOrigins.LOCAL_HOST) && x5.l.n(path2, "/__cleartext_proxy__", false);
            String scheme = url.getScheme();
            if (scheme != null && scheme.equalsIgnoreCase("http") && !lowerCase.equals(TrustedOrigins.LOCAL_HOST)) {
                z7 = true;
            }
            if (z8 || z7) {
                String queryParameter = z8 ? url.getQueryParameter("url") : url.toString();
                if (queryParameter != null && !x5.o.v(queryParameter) && (webResourceResponseFetchProxyResource = WebViewActivity.this.fetchProxyResource(queryParameter, webResourceRequest)) != null) {
                    return webResourceResponseFetchProxyResource;
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            if (webResourceRequest != null && webResourceRequest.isForMainFrame() && PdfActivity.Companion.isPdf(url)) {
                WebViewActivity webViewActivity = WebViewActivity.this;
                kotlin.jvm.internal.j.b(url);
                webViewActivity.openPdf(url);
                return true;
            }
            boolean zHandleExternalNavigation = WebViewActivity.this.handleExternalNavigation(url);
            if (zHandleExternalNavigation || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return zHandleExternalNavigation;
            }
            BridgeGate bridgeGate = WebViewActivity.this.bridgeGate;
            if (bridgeGate != null) {
                bridgeGate.onMainFrameUrl(url != null ? url.toString() : null);
                return zHandleExternalNavigation;
            }
            kotlin.jvm.internal.j.g("bridgeGate");
            throw null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.htmltoapk.template.WebViewActivity$onCreate$14, reason: invalid class name */
    public static final class AnonymousClass14 extends WebChromeClient {
        final /* synthetic */ boolean $isUrlMode;
        final /* synthetic */ WebViewSettings $settings;

        public AnonymousClass14(boolean z6, WebViewSettings webViewSettings) {
            this.$isUrlMode = z6;
            this.$settings = webViewSettings;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPermissionRequest$lambda$3(PermissionRequest permissionRequest, WebViewActivity webViewActivity) {
            if (permissionRequest == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] resources = permissionRequest.getResources();
            kotlin.jvm.internal.j.d("getResources(...)", resources);
            for (String str : resources) {
                if (kotlin.jvm.internal.j.a(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                    arrayList.add("android.permission.CAMERA");
                } else if (kotlin.jvm.internal.j.a(str, "android.webkit.resource.AUDIO_CAPTURE")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                if (k0.a.a(webViewActivity, (String) obj) != 0) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                permissionRequest.grant(permissionRequest.getResources());
            } else {
                webViewActivity.pendingWebPermissionRequest = permissionRequest;
                webViewActivity.webPermissionLauncher.a(arrayList2.toArray(new String[0]));
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage != null) {
                Log.d("WebViewActivity", "JS console [" + consoleMessage.messageLevel() + "] " + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + " - " + consoleMessage.message());
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
            return WebViewActivity.this.attachPopupWindow(z7, message);
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (callback == null) {
                return;
            }
            boolean zIsLocationPermissionDeclared = WebViewActivity.this.isLocationPermissionDeclared();
            if (!this.$settings.getGeolocationEnabled() && !zIsLocationPermissionDeclared) {
                callback.invoke(str, false, false);
                return;
            }
            if (WebViewActivity.this.hasLocationPermission()) {
                callback.invoke(str, true, false);
                return;
            }
            if (!zIsLocationPermissionDeclared) {
                callback.invoke(str, false, false);
                return;
            }
            GeolocationPermissions.Callback callback2 = WebViewActivity.this.pendingGeolocationCallback;
            if (callback2 != null) {
                callback2.invoke(WebViewActivity.this.pendingGeolocationOrigin, false, false);
            }
            WebViewActivity.this.pendingGeolocationOrigin = str;
            WebViewActivity.this.pendingGeolocationCallback = callback;
            try {
                WebViewActivity.this.geolocationPermissionLauncher.a(WebViewActivity.this.declaredLocationPermissions().toArray(new String[0]));
            } catch (Exception e6) {
                Log.e("WebViewActivity", "Geolocation permission request failed", e6);
                WebViewActivity.this.pendingGeolocationCallback = null;
                WebViewActivity.this.pendingGeolocationOrigin = null;
                callback.invoke(str, false, false);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            WebViewActivity.this.hideCustomView();
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.runOnUiThread(new androidx.camera.core.e(7, permissionRequest, webViewActivity));
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i6) {
            super.onProgressChanged(webView, i6);
            if (this.$isUrlMode) {
                DisplayConfig displayConfig = WebViewActivity.this.displayConfig;
                if (displayConfig == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw null;
                }
                if (displayConfig.getLoadingIndicator()) {
                    if (i6 >= 100) {
                        ProgressBar progressBar = WebViewActivity.this.progressBar;
                        if (progressBar != null) {
                            progressBar.setVisibility(8);
                            return;
                        } else {
                            kotlin.jvm.internal.j.g("progressBar");
                            throw null;
                        }
                    }
                    ProgressBar progressBar2 = WebViewActivity.this.progressBar;
                    if (progressBar2 == null) {
                        kotlin.jvm.internal.j.g("progressBar");
                        throw null;
                    }
                    progressBar2.setVisibility(0);
                    ProgressBar progressBar3 = WebViewActivity.this.progressBar;
                    if (progressBar3 != null) {
                        progressBar3.setProgress(i6);
                    } else {
                        kotlin.jvm.internal.j.g("progressBar");
                        throw null;
                    }
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (WebViewActivity.this.customVideoView != null) {
                if (customViewCallback != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                return;
            }
            WebViewActivity.this.customVideoView = view;
            WebViewActivity.this.customViewCallback = customViewCallback;
            View viewFindViewById = WebViewActivity.this.findViewById(R.id.root_layout);
            kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById);
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            View viewFindViewById2 = WebViewActivity.this.findViewById(R.id.main_content_container);
            kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById2);
            viewFindViewById2.setVisibility(4);
            if (view != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
            }
            Window window = WebViewActivity.this.getWindow();
            u0.w wVar = new u0.w(WebViewActivity.this.getWindow().getDecorView());
            int i6 = Build.VERSION.SDK_INT;
            androidx.work.j x0Var = i6 >= 35 ? new u0.x0(window, wVar) : i6 >= 30 ? new u0.w0(window, wVar) : i6 >= 26 ? new u0.v0(window, wVar) : new u0.u0(window, wVar);
            x0Var.h(519);
            x0Var.m();
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.applySystemBarScrims(webViewActivity.lastTopBarInset, WebViewActivity.this.lastBottomBarInset);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [e5.s] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            ?? arrayList;
            String[] acceptTypes;
            ValueCallback valueCallback2 = WebViewActivity.this.filePathCallback;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            WebViewActivity.this.filePathCallback = valueCallback;
            if (fileChooserParams == null || (acceptTypes = fileChooserParams.getAcceptTypes()) == null) {
                arrayList = e5.s.s;
            } else {
                arrayList = new ArrayList();
                for (String str : acceptTypes) {
                    kotlin.jvm.internal.j.b(str);
                    if (!x5.o.v(str)) {
                        arrayList.add(str);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : arrayList) {
                kotlin.jvm.internal.j.b(str2);
                String string = x5.o.G(str2).toString();
                Locale locale = Locale.ROOT;
                kotlin.jvm.internal.j.d("ROOT", locale);
                String lowerCase = string.toLowerCase(locale);
                kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
                if (x5.l.n(lowerCase, ".", false)) {
                    String strZ = x5.o.z(lowerCase, ".");
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strZ);
                    if (mimeTypeFromExtension != null) {
                        arrayList2.add(mimeTypeFromExtension);
                    } else if (strZ.equals("json")) {
                        arrayList2.add("application/json");
                    } else {
                        arrayList2.add("*/*");
                    }
                } else if (x5.o.o(lowerCase, "/", false)) {
                    arrayList2.add(lowerCase);
                }
            }
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            if (arrayList2.isEmpty()) {
                intent.setType("*/*");
            } else if (arrayList2.size() == 1) {
                intent.setType((String) arrayList2.get(0));
            } else {
                intent.setType("*/*");
                kotlin.jvm.internal.j.b(intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList2.toArray(new String[0])));
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", fileChooserParams != null && fileChooserParams.getMode() == 1);
            Uri uriPrepareWebCaptureUri = WebViewActivityKt.shouldOfferCameraCapture(arrayList2) ? WebViewActivity.this.prepareWebCaptureUri() : null;
            Intent intentCreateChooser = Intent.createChooser(intent, "Choose file");
            if (uriPrepareWebCaptureUri != null) {
                Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                intent2.putExtra("output", uriPrepareWebCaptureUri);
                intent2.addFlags(3);
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Parcelable[]{intent2});
            }
            try {
                d.c cVar = WebViewActivity.this.fileChooserLauncher;
                if (cVar == null) {
                    kotlin.jvm.internal.j.g("fileChooserLauncher");
                    throw null;
                }
                kotlin.jvm.internal.j.b(intentCreateChooser);
                cVar.a(intentCreateChooser);
                return true;
            } catch (Exception e6) {
                Log.e("WebViewActivity", "File chooser launch failed", e6);
                WebViewActivity.this.pendingWebCaptureFile = null;
                ValueCallback valueCallback3 = WebViewActivity.this.filePathCallback;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(null);
                }
                WebViewActivity.this.filePathCallback = null;
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.htmltoapk.template.WebViewActivity$openPopupWebView$2, reason: invalid class name */
    public static final class AnonymousClass2 extends WebViewClient {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void shouldOverrideUrlLoading$lambda$0(WebViewActivity webViewActivity, WebView webView) {
            if (webViewActivity.popupWebView == webView) {
                webViewActivity.closePopupWebView();
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = WebViewActivity.this.mainWebViewClient;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            }
            kotlin.jvm.internal.j.g("mainWebViewClient");
            throw null;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebView webView2;
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            boolean zHandleExternalNavigation = true;
            if (webResourceRequest != null && webResourceRequest.isForMainFrame() && PdfActivity.Companion.isPdf(url)) {
                WebViewActivity webViewActivity = WebViewActivity.this;
                kotlin.jvm.internal.j.b(url);
                zHandleExternalNavigation = webViewActivity.openPdf(url);
                webView2 = webView;
            } else {
                if (!x5.l.k(url != null ? url.getScheme() : null, "blob") || webView == null) {
                    webView2 = webView;
                    zHandleExternalNavigation = WebViewActivity.this.handleExternalNavigation(url);
                } else {
                    AndroidAPI androidAPI = WebViewActivity.this.androidApi;
                    if (androidAPI == null) {
                        kotlin.jvm.internal.j.g("androidApi");
                        throw null;
                    }
                    webView2 = webView;
                    androidAPI.downloadBlobUrlIn(webView2, PopupDownloadBridge.NAME, String.valueOf(url), "export_" + System.currentTimeMillis(), "application/octet-stream");
                }
            }
            boolean zK = x5.l.k(url != null ? url.getScheme() : null, "blob");
            if (zHandleExternalNavigation && !zK && webView2 != null && webView2.copyBackForwardList().getSize() == 0) {
                webView2.post(new androidx.camera.core.x(7, WebViewActivity.this, webView2));
            }
            return zHandleExternalNavigation;
        }
    }

    public WebViewActivity() {
        int i6 = 0;
        this.permissionLauncher = registerForActivityResult(new e.e(), new e1(this, i6));
        this.geolocationPermissionLauncher = registerForActivityResult(new e.d(), new f1(this, i6));
        int i7 = 1;
        this.takePictureLauncher = registerForActivityResult(new e.g(), new d1(this, i7));
        this.pdfSaveLauncher = registerForActivityResult(new e.b("application/pdf"), new e1(this, i7));
    }

    public static final /* synthetic */ void access$hideSplash(WebViewActivity webViewActivity) {
        webViewActivity.hideSplash();
    }

    private final void applyBarScrim(View view, int i6, boolean z6, int i7, int i8) {
        if (view == null) {
            return;
        }
        if (!z6) {
            i6 = 0;
        }
        if (i6 <= 0 || i8 <= 0) {
            if (view.getVisibility() != 8) {
                view.setVisibility(8);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height == 0) {
                return;
            }
            layoutParams.height = 0;
            view.setLayoutParams(layoutParams);
            return;
        }
        view.setBackgroundColor(i7);
        view.setAlpha(u5.d.p(i8, 0, 100) / 100.0f);
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null || layoutParams2.height == i6) {
            return;
        }
        layoutParams2.height = i6;
        view.setLayoutParams(layoutParams2);
    }

    private final void applyDarkMode(boolean z6) {
        if (this.webView == null) {
            return;
        }
        try {
            if (androidx.activity.c0.f("ALGORITHMIC_DARKENING")) {
                WebSettings settings = getWebView().getSettings();
                if (!i2.j.f13353c.d()) {
                    throw i2.j.a();
                }
                ((WebSettingsBoundaryInterface) h2.a.a(settings).f2343t).setAlgorithmicDarkeningAllowed(z6);
            } else if (androidx.activity.c0.f("FORCE_DARK")) {
                int i6 = z6 ? 2 : 0;
                WebSettings settings2 = getWebView().getSettings();
                a.h hVar = i2.j.f13355e;
                if (hVar.c()) {
                    settings2.setForceDark(i6);
                } else {
                    if (!hVar.d()) {
                        throw i2.j.a();
                    }
                    ((WebSettingsBoundaryInterface) h2.a.a(settings2).f2343t).setForceDark(i6);
                }
            }
            if (androidx.activity.c0.f("FORCE_DARK_STRATEGY")) {
                WebSettings settings3 = getWebView().getSettings();
                if (!i2.j.f13356f.d()) {
                    throw i2.j.a();
                }
                ((WebSettingsBoundaryInterface) h2.a.a(settings3).f2343t).setForceDarkBehavior(2);
            }
        } catch (Exception e6) {
            Log.w("WebViewActivity", "applyDarkMode failed: " + e6.getMessage());
        }
    }

    private final void applyPrimaryColor(String str, boolean z6) {
        try {
            int color = Color.parseColor(str);
            if (z6) {
                View view = this.toolbar;
                if (view != null) {
                    view.setBackgroundColor(color);
                }
                boolean z7 = m0.a.b(color) > 0.5d;
                TextView textView = this.toolbarTitle;
                if (textView != null) {
                    textView.setTextColor(z7 ? -16777216 : -1);
                }
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySystemBarScrims(int i6, int i7) {
        this.lastTopBarInset = i6;
        this.lastBottomBarInset = i7;
        View view = this.statusBarScrim;
        boolean zIsStatusBarScrimActive = isStatusBarScrimActive();
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        int iResolveBarColor = resolveBarColor(displayConfig.getStatusBarColor(), true);
        DisplayConfig displayConfig2 = this.displayConfig;
        if (displayConfig2 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        applyBarScrim(view, i6, zIsStatusBarScrimActive, iResolveBarColor, displayConfig2.getStatusBarAlpha());
        View view2 = this.navBarScrim;
        boolean zIsNavBarScrimActive = isNavBarScrimActive();
        DisplayConfig displayConfig3 = this.displayConfig;
        if (displayConfig3 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        int iResolveBarColor2 = resolveBarColor(displayConfig3.getNavBarColor(), false);
        DisplayConfig displayConfig4 = this.displayConfig;
        if (displayConfig4 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        applyBarScrim(view2, i7, zIsNavBarScrimActive, iResolveBarColor2, displayConfig4.getNavBarAlpha());
        updateSystemBarsAppearance((getResources().getConfiguration().uiMode & 48) == 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attachPopupWindow(boolean z6, Message message) {
        Object obj = message != null ? message.obj : null;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport == null) {
            return false;
        }
        if (!z6) {
            Log.d("WebViewActivity", "Popup blocked: no user gesture");
            return false;
        }
        try {
            webViewTransport.setWebView(openPopupWebView());
            message.sendToTarget();
            return true;
        } catch (Exception e6) {
            Log.e("WebViewActivity", "Popup WebView creation failed", e6);
            return false;
        }
    }

    private final boolean barShouldUseDarkIcons(String str, int i6, boolean z6, boolean z7) {
        String lowerCase = x5.o.G(str).toString().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
        if (lowerCase.equals("dark")) {
            return true;
        }
        if (lowerCase.equals("light")) {
            return false;
        }
        return z6 ? m0.a.b(i6) > 0.5d : !z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Object] */
    public static final void captureFrontPhoto$lambda$77(c5.a aVar, WebViewActivity webViewActivity, File file, String str) throws JSONException {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        try {
            pVar.s = aVar.get();
            ImageCapture imageCaptureBuild = new ImageCapture.Builder().setCaptureMode(1).build();
            kotlin.jvm.internal.j.d("build(...)", imageCaptureBuild);
            T t6 = pVar.s;
            kotlin.jvm.internal.j.b(t6);
            ((ProcessCameraProvider) t6).unbindAll();
            T t7 = pVar.s;
            kotlin.jvm.internal.j.b(t7);
            CameraSelector cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
            kotlin.jvm.internal.j.d("DEFAULT_FRONT_CAMERA", cameraSelector);
            ((ProcessCameraProvider) t7).bindToLifecycle(webViewActivity, cameraSelector, imageCaptureBuild);
            ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
            kotlin.jvm.internal.j.d("build(...)", outputFileOptionsBuild);
            ExecutorService executorService = webViewActivity.cameraExecutor;
            if (executorService != null) {
                imageCaptureBuild.lambda$takePicture$2(outputFileOptionsBuild, executorService, new WebViewActivity$captureFrontPhoto$1$1(webViewActivity, pVar, str, file));
            } else {
                kotlin.jvm.internal.j.g("cameraExecutor");
                throw null;
            }
        } catch (Exception e6) {
            Log.e("WebViewActivity", "Front camera setup failed", e6);
            webViewActivity.unbindCamera((ProcessCameraProvider) pVar.s);
            try {
                file.delete();
            } catch (Throwable unused) {
            }
            AndroidAPI androidAPI = webViewActivity.androidApi;
            if (androidAPI == null) {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
            String message = e6.getMessage();
            if (message == null) {
                message = "front_camera_unavailable";
            }
            androidAPI.onCameraResult(str, false, null, message);
        }
    }

    public static /* synthetic */ void capturePhoto$default(WebViewActivity webViewActivity, String str, boolean z6, int i6, Object obj) throws JSONException, PackageManager.NameNotFoundException {
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        webViewActivity.capturePhoto(str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closePopupWebView() {
        WebView webView = this.popupWebView;
        if (webView == null) {
            return;
        }
        FrameLayout frameLayout = this.popupContainer;
        this.popupWebView = null;
        this.popupContainer = null;
        ViewParent parent = frameLayout != null ? frameLayout.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
        try {
            webView.stopLoading();
            webView.setWebChromeClient(null);
            webView.destroy();
        } catch (Exception e6) {
            Log.w("WebViewActivity", "Popup WebView destroy failed: " + e6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDocumentLauncher$lambda$26(WebViewActivity webViewActivity, Uri uri) throws JSONException {
        String str = webViewActivity.pendingWriteCallbackId;
        String str2 = webViewActivity.pendingWriteContent;
        webViewActivity.pendingWriteCallbackId = null;
        webViewActivity.pendingWriteContent = null;
        if (str == null) {
            return;
        }
        if (uri != null && str2 != null) {
            new Thread(new b1(webViewActivity, uri, str2, str)).start();
            return;
        }
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            androidAPI.onFileWritten(str, false, "cancelled");
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDocumentLauncher$lambda$26$lambda$25(WebViewActivity webViewActivity, Uri uri, String str, String str2) throws IOException {
        try {
            OutputStream outputStreamOpenOutputStream = webViewActivity.getContentResolver().openOutputStream(uri);
            if (outputStreamOpenOutputStream != null) {
                try {
                    byte[] bytes = str.getBytes(x5.a.f15157a);
                    kotlin.jvm.internal.j.d("getBytes(...)", bytes);
                    outputStreamOpenOutputStream.write(bytes);
                    outputStreamOpenOutputStream.close();
                } finally {
                }
            }
            webViewActivity.runOnUiThread(new h1(webViewActivity, str2, 0));
        } catch (Exception e6) {
            webViewActivity.runOnUiThread(new androidx.camera.core.processing.j(webViewActivity, str2, e6, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDocumentLauncher$lambda$26$lambda$25$lambda$23(WebViewActivity webViewActivity, String str) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            androidAPI.onFileWritten(str, true, null);
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDocumentLauncher$lambda$26$lambda$25$lambda$24(WebViewActivity webViewActivity, String str, Exception exc) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            androidAPI.onFileWritten(str, false, exc.getMessage());
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> declaredLocationPermissions() {
        try {
            String[] strArr = getPackageManager().getPackageInfo(getPackageName(), 4096).requestedPermissions;
            Set setW = strArr != null ? e5.j.w(strArr) : e5.u.s;
            List listC = e5.l.c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                if (setW.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception e6) {
            Log.w("WebViewActivity", "requestedPermissions lookup failed", e6);
            return e5.s.s;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverPhotoFile(String str, File file) {
        new Thread(new androidx.camera.core.q(file, this, str, 3)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deliverPhotoFile$lambda$16(File file, WebViewActivity webViewActivity, String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i6 = 1;
            while (Math.max(options.outWidth, options.outHeight) / i6 > 1600) {
                i6 *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i6;
            options2.inPreferredConfig = Bitmap.Config.RGB_565;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
            try {
                int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
                Matrix matrix = new Matrix();
                if (attributeInt == 3) {
                    matrix.postRotate(180.0f);
                } else if (attributeInt == 6) {
                    matrix.postRotate(90.0f);
                } else if (attributeInt == 8) {
                    matrix.postRotate(270.0f);
                }
                if (bitmapDecodeFile != null && !matrix.isIdentity()) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                    kotlin.jvm.internal.j.d("createBitmap(...)", bitmapCreateBitmap);
                    if (!bitmapCreateBitmap.equals(bitmapDecodeFile)) {
                        bitmapDecodeFile.recycle();
                        bitmapDecodeFile = bitmapCreateBitmap;
                    }
                }
            } catch (Throwable unused) {
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            }
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.j.b(byteArray);
            if (byteArray.length == 0) {
                try {
                    file.delete();
                } catch (Throwable unused2) {
                }
                webViewActivity.runOnUiThread(new androidx.camera.core.e(6, webViewActivity, str));
            } else {
                String strEncodeToString = Base64.encodeToString(byteArray, 2);
                try {
                    file.delete();
                } catch (Throwable unused3) {
                }
                webViewActivity.runOnUiThread(new r(webViewActivity, str, strEncodeToString, 1));
            }
        } catch (Throwable th) {
            Log.e("WebViewActivity", "Error processing captured photo", th);
            try {
                file.delete();
            } catch (Throwable unused4) {
            }
            webViewActivity.runOnUiThread(new androidx.camera.core.processing.concurrent.d(webViewActivity, str, th, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deliverPhotoFile$lambda$16$lambda$13(WebViewActivity webViewActivity, String str) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            androidAPI.onCameraResult(str, false, null, "encode_failed");
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deliverPhotoFile$lambda$16$lambda$14(WebViewActivity webViewActivity, String str, String str2) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            AndroidAPI.onCameraResult$default(androidAPI, str, true, androidx.camera.camera2.internal.k0.a("data:image/jpeg;base64,", str2), null, 8, null);
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deliverPhotoFile$lambda$16$lambda$15(WebViewActivity webViewActivity, String str, Throwable th) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI == null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "decode_failed";
        }
        androidAPI.onCameraResult(str, false, null, message);
    }

    public static /* synthetic */ void downloadDataUri$default(WebViewActivity webViewActivity, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str2 = null;
        }
        if ((i6 & 4) != 0) {
            str3 = null;
        }
        webViewActivity.downloadDataUri(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void downloadDataUri$lambda$98(String str, WebViewActivity webViewActivity, String str2, String str3) throws JSONException, UnsupportedEncodingException {
        byte[] bytes;
        byte[] bArrDecode;
        String strH;
        try {
            int iS = x5.o.s(str, ',', 6);
            if (iS == -1) {
                AndroidAPI androidAPI = webViewActivity.androidApi;
                if (androidAPI != null) {
                    androidAPI.onDownloadResult(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, "invalid_data_uri");
                    return;
                } else {
                    kotlin.jvm.internal.j.g("androidApi");
                    throw null;
                }
            }
            String strSubstring = str.substring(0, iS);
            kotlin.jvm.internal.j.d("substring(...)", strSubstring);
            String strSubstring2 = str.substring(iS + 1);
            kotlin.jvm.internal.j.d("substring(...)", strSubstring2);
            boolean zO = x5.o.o(strSubstring, ";base64", true);
            String string = x5.o.G(x5.o.E(x5.o.z(strSubstring, "data:"), ';')).toString();
            if (x5.o.v(string)) {
                string = null;
            }
            if (string == null) {
                string = (str2 == null || x5.o.v(str2)) ? null : str2;
                if (string == null) {
                    string = "application/octet-stream";
                }
            }
            if (zO) {
                bArrDecode = Base64.decode(x5.o.G(strSubstring2).toString(), 0);
                kotlin.jvm.internal.j.b(bArrDecode);
            } else {
                try {
                    String strDecode = URLDecoder.decode(strSubstring2, "UTF-8");
                    kotlin.jvm.internal.j.d("decode(...)", strDecode);
                    bytes = strDecode.getBytes(x5.a.f15157a);
                    kotlin.jvm.internal.j.d("getBytes(...)", bytes);
                } catch (Exception unused) {
                    bytes = strSubstring2.getBytes(x5.a.f15157a);
                    kotlin.jvm.internal.j.d("getBytes(...)", bytes);
                }
                bArrDecode = bytes;
            }
            if (bArrDecode.length == 0) {
                AndroidAPI androidAPI2 = webViewActivity.androidApi;
                if (androidAPI2 != null) {
                    androidAPI2.onDownloadResult(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, "empty_data");
                    return;
                } else {
                    kotlin.jvm.internal.j.g("androidApi");
                    throw null;
                }
            }
            String strExtensionForMime = WebViewActivityKt.extensionForMime(string);
            if (strExtensionForMime == null && (strExtensionForMime = MimeTypeMap.getSingleton().getExtensionFromMimeType(string)) == null) {
                strExtensionForMime = "bin";
            }
            if (str3 != null) {
                String string2 = x5.o.G(str3).toString();
                if (x5.o.o(string2, "filename=", true)) {
                    strH = x5.o.H(x5.o.C(string2, "filename=", string2), '\"', ' ', ';');
                } else if (x5.l.n(string2, "attachment", true)) {
                    strH = null;
                } else if (x5.o.o(string2, ".", false)) {
                    strH = x5.o.H(string2, '\"', ' ');
                } else {
                    strH = string2 + "." + strExtensionForMime;
                }
            }
            String strGuessFileName = strH == null ? URLUtil.guessFileName(str, str3, string) : strH;
            if (strH == null || x5.o.v(strH)) {
                kotlin.jvm.internal.j.b(strGuessFileName);
                if (x5.o.v(strGuessFileName) || strGuessFileName.equals("downloadfile.bin") || x5.o.o(strGuessFileName, ";base64", false)) {
                    strH = "export_" + System.currentTimeMillis() + "." + strExtensionForMime;
                } else {
                    strH = strGuessFileName;
                }
            }
            webViewActivity.saveBytesToDownloads(bArrDecode, WebViewActivityKt.resolveDownloadName(strH, string), string);
        } catch (Exception e6) {
            Log.e("WebViewActivity", "Data URI download failed", e6);
            AndroidAPI androidAPI3 = webViewActivity.androidApi;
            if (androidAPI3 == null) {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
            String message = e6.getMessage();
            if (message == null) {
                message = "download_failed";
            }
            androidAPI3.onDownloadResult(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDeepLink() {
        String str = this.launchDeepLink;
        if (str != null && isTrustedPageShown$template_adsRelease()) {
            getWebView().evaluateJavascript(androidx.camera.camera2.internal.v0.b("window.onDeepLink && window.onDeepLink(", JSONObject.quote(str), ")"), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0298 A[Catch: Exception -> 0x0015, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030a A[Catch: Exception -> 0x0015, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0319 A[Catch: Exception -> 0x0015, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0322 A[Catch: Exception -> 0x0015, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0339 A[Catch: Exception -> 0x0015, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0352 A[Catch: Exception -> 0x0015, TRY_ENTER, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0358 A[Catch: Exception -> 0x0015, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036b A[Catch: Exception -> 0x0015, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x038e A[Catch: Exception -> 0x0015, LOOP:7: B:172:0x038c->B:173:0x038e, LOOP_END, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e3 A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120 A[Catch: Exception -> 0x0015, TryCatch #7 {Exception -> 0x0015, blocks: (B:3:0x000c, B:8:0x001a, B:11:0x0038, B:14:0x0089, B:17:0x00b9, B:18:0x00c1, B:20:0x00c7, B:22:0x00f9, B:24:0x0101, B:26:0x010c, B:29:0x0116, B:31:0x0120, B:33:0x0128, B:40:0x0150, B:43:0x015a, B:45:0x0160, B:51:0x016f, B:53:0x0175, B:64:0x0190, B:66:0x019d, B:67:0x01a5, B:69:0x01ab, B:71:0x01c3, B:73:0x01cd, B:74:0x01d4, B:76:0x01da, B:78:0x01e2, B:92:0x0207, B:94:0x020f, B:97:0x0216, B:98:0x023a, B:100:0x0244, B:113:0x0260, B:117:0x0269, B:119:0x0298, B:120:0x02a0, B:122:0x02a6, B:124:0x02c0, B:126:0x02d1, B:128:0x02da, B:133:0x0300, B:135:0x030a, B:139:0x0319, B:144:0x0327, B:148:0x0331, B:156:0x034a, B:159:0x0352, B:174:0x039a, B:178:0x03b1, B:184:0x03e3, B:186:0x03f5, B:187:0x0411, B:192:0x0426, B:161:0x0358, B:162:0x0365, B:164:0x036b, B:166:0x037a, B:170:0x0383, B:171:0x0387, B:173:0x038e, B:151:0x0339, B:154:0x0342, B:143:0x0322, B:56:0x017d, B:58:0x0183), top: B:255:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse fetchProxyResource(String str, WebResourceRequest webResourceRequest) throws IOException {
        WebResourceResponse webResourceResponse;
        String method;
        String str2;
        String str3;
        String str4;
        String str5;
        int i6;
        String str6;
        String str7;
        String str8;
        String str9;
        HttpURLConnection httpURLConnection;
        String str10;
        String str11;
        String str12;
        String str13;
        CookieManager cookieManager;
        String cookie;
        String str14;
        String contentType;
        Map<String, List<String>> headerFields;
        HttpURLConnection httpURLConnection2;
        String contentEncoding;
        String lowerCase;
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inflaterInputStream;
        int size;
        int i7;
        String str15;
        int i8;
        String str16;
        Object obj;
        Object obj2;
        InputStream inputStream3;
        String str17;
        Object obj3;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        Object obj4;
        String str23;
        WebResourceResponse webResourceResponse2;
        String strFetchProxyResource$lambda$71;
        int i9;
        Set set;
        HttpURLConnection httpURLConnection3;
        Iterator<Map.Entry<String, List<String>>> it;
        String headerField;
        String str24;
        String str25;
        String str26 = "Cookie";
        String str27 = "User-Agent";
        try {
            method = webResourceRequest.getMethod();
            if (method == null) {
                method = "GET";
            }
            str2 = "getBytes(...)";
            str3 = "Access-Control-Allow-Headers";
            str4 = "GET, POST, PUT, DELETE, HEAD, OPTIONS, PATCH";
            str5 = "Access-Control-Allow-Methods";
            i6 = 5;
            str6 = "Access-Control-Allow-Origin";
            str7 = "*";
        } catch (Exception e6) {
            e = e6;
            webResourceResponse = null;
        }
        if (method.equalsIgnoreCase("OPTIONS")) {
            d5.c[] cVarArr = {new d5.c("Access-Control-Allow-Origin", "*"), new d5.c("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, HEAD, OPTIONS, PATCH"), new d5.c("Access-Control-Allow-Headers", "*"), new d5.c("Access-Control-Allow-Credentials", "true"), new d5.c("Access-Control-Max-Age", "86400")};
            LinkedHashMap linkedHashMap = new LinkedHashMap(e5.w.i(5));
            e5.x.j(linkedHashMap, cVarArr);
            byte[] bytes = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.getBytes(x5.a.f15157a);
            kotlin.jvm.internal.j.d("getBytes(...)", bytes);
            return new WebResourceResponse("text/plain", "UTF-8", 200, "OK", linkedHashMap, new ByteArrayInputStream(bytes));
        }
        String string = str;
        int i10 = 0;
        while (true) {
            URL url = new URL(string);
            str8 = str3;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            str9 = str5;
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type java.net.HttpURLConnection", uRLConnectionOpenConnection);
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(60000);
            httpURLConnection.setRequestMethod(method);
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders != null) {
                for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                    String str28 = method;
                    String key = entry.getKey();
                    String str29 = str4;
                    String value = entry.getValue();
                    kotlin.jvm.internal.j.b(key);
                    String str30 = str7;
                    String lowerCase2 = key.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase2);
                    String str31 = str6;
                    if (lowerCase2.equals("host") || lowerCase2.equals("accept-encoding")) {
                        str25 = str2;
                    } else {
                        str25 = str2;
                        if (!x5.l.n(lowerCase2, "sec-fetch-", false)) {
                            if (lowerCase2.equals("origin")) {
                                kotlin.jvm.internal.j.b(value);
                                if (!x5.o.o(value, TrustedOrigins.LOCAL_HOST, false)) {
                                    if (lowerCase2.equals("referer")) {
                                        kotlin.jvm.internal.j.b(value);
                                        if (!x5.o.o(value, TrustedOrigins.LOCAL_HOST, false)) {
                                            try {
                                                httpURLConnection.setRequestProperty(key, value);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str7 = str30;
                    str4 = str29;
                    method = str28;
                    str6 = str31;
                    str2 = str25;
                }
            }
            String str32 = method;
            str10 = str7;
            str11 = str6;
            str12 = str2;
            str13 = str4;
            String str33 = this.cachedUserAgent;
            if (x5.o.v(str33)) {
                str33 = "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36";
            }
            String requestProperty = httpURLConnection.getRequestProperty(str27);
            if (requestProperty == null || x5.o.v(requestProperty)) {
                try {
                    httpURLConnection.setRequestProperty(str27, str33);
                } catch (Throwable unused2) {
                }
            }
            try {
                cookieManager = CookieManager.getInstance();
            } catch (Throwable unused3) {
                cookieManager = null;
            }
            String requestProperty2 = httpURLConnection.getRequestProperty(str26);
            if ((requestProperty2 == null || x5.o.v(requestProperty2)) && cookieManager != null && (cookie = cookieManager.getCookie(string)) != null) {
                if (x5.o.v(cookie)) {
                    cookie = null;
                }
                if (cookie != null) {
                    try {
                        httpURLConnection.setRequestProperty(str26, cookie);
                    } catch (Throwable unused4) {
                    }
                }
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
            if (headerFields2 != null) {
                for (Map.Entry<String, List<String>> entry2 : headerFields2.entrySet()) {
                    String str34 = str26;
                    String key2 = entry2.getKey();
                    List<String> value2 = entry2.getValue();
                    if (key2 != null) {
                        str24 = str27;
                        if (key2.equalsIgnoreCase("Set-Cookie")) {
                            kotlin.jvm.internal.j.b(value2);
                            for (String str35 : value2) {
                                if (cookieManager != null) {
                                    cookieManager.setCookie(string, str35);
                                }
                            }
                        }
                    } else {
                        str24 = str27;
                    }
                    str27 = str24;
                    str26 = str34;
                }
            }
            String str36 = str26;
            String str37 = str27;
            if ((301 > responseCode || responseCode >= 304) && responseCode != 307 && responseCode != 308) {
                break;
            }
            int i11 = i6;
            if (i10 >= i11 || (headerField = httpURLConnection.getHeaderField("Location")) == null || x5.o.v(headerField)) {
                break;
            }
            string = new URL(url, headerField).toString();
            i10++;
            httpURLConnection.disconnect();
            i6 = i11;
            str3 = str8;
            str5 = str9;
            str27 = str37;
            str7 = str10;
            str4 = str13;
            method = str32;
            str6 = str11;
            str2 = str12;
            str26 = str36;
        }
        int responseCode2 = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseMessage != null) {
            if (x5.o.v(responseMessage)) {
                responseMessage = null;
            }
            if (responseMessage != null) {
                str14 = responseMessage;
                contentType = httpURLConnection.getContentType();
                if (contentType == null) {
                }
                String string2 = x5.o.G(x5.o.F(contentType, ";")).toString();
                Set setW = e5.j.w(new String[]{"connection", "keep-alive", "transfer-encoding", "te", "trailer", "upgrade", "proxy-authenticate", "proxy-authorization"});
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null) {
                }
                String str38 = str14;
                httpURLConnection2 = httpURLConnection;
                contentEncoding = httpURLConnection2.getContentEncoding();
                if (contentEncoding != null) {
                }
                if (responseCode2 < 400) {
                }
            }
        } else if (responseCode2 == 200 || responseCode2 != 206) {
            str14 = "OK";
            contentType = httpURLConnection.getContentType();
            if (contentType == null) {
                contentType = "application/octet-stream";
            }
            String string22 = x5.o.G(x5.o.F(contentType, ";")).toString();
            Set setW2 = e5.j.w(new String[]{"connection", "keep-alive", "transfer-encoding", "te", "trailer", "upgrade", "proxy-authenticate", "proxy-authorization"});
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                Iterator<Map.Entry<String, List<String>>> it2 = headerFields.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, List<String>> next = it2.next();
                    String key3 = next.getKey();
                    String str39 = str14;
                    List<String> value3 = next.getValue();
                    if (key3 != null) {
                        httpURLConnection3 = httpURLConnection;
                        String lowerCase3 = key3.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase3);
                        if (!setW2.contains(lowerCase3)) {
                            kotlin.jvm.internal.j.b(value3);
                            if (!value3.isEmpty()) {
                                set = setW2;
                                it = it2;
                                linkedHashMap22.put(key3, e5.q.h(value3, ", ", null, 62));
                                str14 = str39;
                                httpURLConnection = httpURLConnection3;
                                setW2 = set;
                                it2 = it;
                            }
                        }
                        set = setW2;
                    } else {
                        set = setW2;
                        httpURLConnection3 = httpURLConnection;
                    }
                    it = it2;
                    str14 = str39;
                    httpURLConnection = httpURLConnection3;
                    setW2 = set;
                    it2 = it;
                }
            }
            String str382 = str14;
            httpURLConnection2 = httpURLConnection;
            contentEncoding = httpURLConnection2.getContentEncoding();
            if (contentEncoding != null) {
                lowerCase = contentEncoding.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
            } else {
                lowerCase = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (responseCode2 < 400 || (inputStream = httpURLConnection2.getErrorStream()) == null) {
                inputStream = httpURLConnection2.getInputStream();
            }
            if (!x5.o.o(lowerCase, "gzip", false) && inputStream != null) {
                inflaterInputStream = new GZIPInputStream(inputStream);
            } else if (x5.o.o(lowerCase, "deflate", false) || inputStream == null) {
                inputStream2 = inputStream;
                if (x5.o.o(lowerCase, "gzip", false) || x5.o.o(lowerCase, "deflate", false)) {
                    Set setKeySet = linkedHashMap22.keySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : setKeySet) {
                        String str40 = (String) obj5;
                        if (x5.l.k(str40, "Content-Encoding") || x5.l.k(str40, "Content-Length")) {
                            arrayList.add(obj5);
                        }
                    }
                    size = arrayList.size();
                    i7 = 0;
                    while (i7 < size) {
                        Object obj6 = arrayList.get(i7);
                        i7++;
                        linkedHashMap22.remove((String) obj6);
                    }
                }
                try {
                    if (x5.o.o(string22, "mpegurl", true)) {
                        i8 = responseCode2;
                        str15 = ";";
                        str16 = contentType;
                        if (!x5.l.j(x5.o.F(str, "?"), ".m3u8", true)) {
                            inputStream3 = inputStream2;
                            obj4 = "true";
                            obj3 = "Access-Control-Allow-Credentials";
                            str18 = str9;
                            str21 = str10;
                            str20 = str13;
                            str22 = str11;
                            str17 = null;
                            obj2 = "bytes";
                            obj = "Accept-Ranges";
                            str19 = str8;
                            if (!x5.l.n(string22, "video/", true) || x5.l.n(string22, "audio/", true) || x5.l.n(string22, "image/", true) || string22.equalsIgnoreCase("application/octet-stream") || string22.equalsIgnoreCase("application/pdf") || string22.equalsIgnoreCase("application/wasm") || x5.l.j(x5.o.F(str, "?"), ".ts", true) || x5.l.j(x5.o.F(str, "?"), ".mp4", true)) {
                                str23 = str17;
                            } else {
                                String str41 = str16;
                                if (x5.o.o(str41, "charset=", true)) {
                                    String string3 = x5.o.G(x5.o.F(x5.o.C(str41, "charset=", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), str15)).toString();
                                    if (!x5.o.v(string3)) {
                                        str23 = string3;
                                    }
                                }
                            }
                            linkedHashMap22.put(str22, str21);
                            linkedHashMap22.put(str18, str20);
                            linkedHashMap22.put(str19, str21);
                            linkedHashMap22.put(obj3, obj4);
                            linkedHashMap22.put("Access-Control-Expose-Headers", "Content-Length, Content-Range, Accept-Ranges, Content-Type");
                            linkedHashMap22.put(obj, obj2);
                            return new WebResourceResponse(string22, str23, i8, str382, linkedHashMap22, inputStream3);
                        }
                    } else {
                        str15 = ";";
                        i8 = responseCode2;
                        str16 = contentType;
                    }
                    if (inputStream2 != null) {
                        inputStream3 = inputStream2;
                        obj4 = "true";
                        obj3 = "Access-Control-Allow-Credentials";
                        str18 = str9;
                        str21 = str10;
                        str20 = str13;
                        str22 = str11;
                        str17 = null;
                        obj2 = "bytes";
                        str19 = str8;
                        obj = "Accept-Ranges";
                        if (x5.l.n(string22, "video/", true)) {
                            str23 = str17;
                        }
                        linkedHashMap22.put(str22, str21);
                        linkedHashMap22.put(str18, str20);
                        linkedHashMap22.put(str19, str21);
                        linkedHashMap22.put(obj3, obj4);
                        linkedHashMap22.put("Access-Control-Expose-Headers", "Content-Length, Content-Range, Accept-Ranges, Content-Type");
                        linkedHashMap22.put(obj, obj2);
                        return new WebResourceResponse(string22, str23, i8, str382, linkedHashMap22, inputStream3);
                    }
                    Charset charset = x5.a.f15157a;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, charset), 8192);
                    try {
                        String strC = j3.b.c(bufferedReader);
                        bufferedReader.close();
                        URL url2 = new URL(string);
                        w5.l lVarX = x5.o.x(strC);
                        StringBuilder sb = new StringBuilder();
                        sb.append((CharSequence) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        Iterator<R> it3 = lVarX.iterator();
                        int i12 = 0;
                        while (it3.hasNext()) {
                            try {
                                strFetchProxyResource$lambda$71 = fetchProxyResource$lambda$71(url2, (String) it3.next());
                                i9 = i12 + 1;
                                if (i9 > 1) {
                                    sb.append((CharSequence) "\n");
                                }
                                webResourceResponse2 = null;
                            } catch (Exception e7) {
                                e = e7;
                                webResourceResponse2 = null;
                                webResourceResponse = webResourceResponse2;
                                Log.e("WebViewActivity", "fetchProxyResource failed for " + str + ": " + e.getMessage(), e);
                                return webResourceResponse;
                            }
                            try {
                                a1.a.b(sb, strFetchProxyResource$lambda$71, null);
                                i12 = i9;
                            } catch (Exception e8) {
                                e = e8;
                                webResourceResponse = webResourceResponse2;
                                Log.e("WebViewActivity", "fetchProxyResource failed for " + str + ": " + e.getMessage(), e);
                                return webResourceResponse;
                            }
                        }
                        webResourceResponse2 = null;
                        sb.append((CharSequence) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        String string4 = sb.toString();
                        kotlin.jvm.internal.j.d("toString(...)", string4);
                        byte[] bytes2 = string4.getBytes(charset);
                        kotlin.jvm.internal.j.d(str12, bytes2);
                        linkedHashMap22.put("Content-Length", String.valueOf(bytes2.length));
                        linkedHashMap22.put(str11, str10);
                        linkedHashMap22.put(str9, str13);
                        linkedHashMap22.put(str8, str10);
                        linkedHashMap22.put("Access-Control-Allow-Credentials", "true");
                        linkedHashMap22.put("Access-Control-Expose-Headers", "Content-Length, Content-Range, Accept-Ranges, Content-Type");
                        linkedHashMap22.put("Accept-Ranges", "bytes");
                        return new WebResourceResponse("application/vnd.apple.mpegurl", "UTF-8", i8, str382, linkedHashMap22, new ByteArrayInputStream(bytes2));
                    } finally {
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } else {
                inflaterInputStream = new InflaterInputStream(inputStream);
            }
            inputStream2 = inflaterInputStream;
            if (x5.o.o(lowerCase, "gzip", false)) {
                Set setKeySet2 = linkedHashMap22.keySet();
                ArrayList arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                }
                size = arrayList2.size();
                i7 = 0;
                while (i7 < size) {
                }
                if (x5.o.o(string22, "mpegurl", true)) {
                }
                if (inputStream2 != null) {
                }
            }
        } else {
            responseMessage = "Partial Content";
            str14 = responseMessage;
            contentType = httpURLConnection.getContentType();
            if (contentType == null) {
            }
            String string222 = x5.o.G(x5.o.F(contentType, ";")).toString();
            Set setW22 = e5.j.w(new String[]{"connection", "keep-alive", "transfer-encoding", "te", "trailer", "upgrade", "proxy-authenticate", "proxy-authorization"});
            LinkedHashMap linkedHashMap222 = new LinkedHashMap();
            headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
            }
            String str3822 = str14;
            httpURLConnection2 = httpURLConnection;
            contentEncoding = httpURLConnection2.getContentEncoding();
            if (contentEncoding != null) {
            }
            if (responseCode2 < 400) {
                inputStream = httpURLConnection2.getInputStream();
                if (!x5.o.o(lowerCase, "gzip", false)) {
                    if (x5.o.o(lowerCase, "deflate", false)) {
                    }
                    inputStream2 = inputStream;
                    if (x5.o.o(lowerCase, "gzip", false)) {
                    }
                }
            }
        }
        Log.e("WebViewActivity", "fetchProxyResource failed for " + str + ": " + e.getMessage(), e);
        return webResourceResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String fetchProxyResource$lambda$71(URL url, String str) {
        kotlin.jvm.internal.j.e("line", str);
        String string = x5.o.G(str).toString();
        if (string.length() != 0) {
            if (!x5.l.n(string, "#", false)) {
                try {
                    string = new URL(url, string).toString();
                } catch (Exception unused) {
                }
                kotlin.jvm.internal.j.b(string);
                return x5.l.n(string, "http://", false) ? androidx.camera.camera2.internal.k0.a("https://appassets.androidplatform.net/__cleartext_proxy__/?url=", URLEncoder.encode(string, "UTF-8")) : string;
            }
            if (x5.o.o(string, "URI=\"", false)) {
                x5.d dVarA = x5.e.a(new x5.e("URI=\"([^\"]+)\""), string);
                if (dVarA == null) {
                    return string.toString();
                }
                int length = string.length();
                StringBuilder sb = new StringBuilder(length);
                int i6 = 0;
                do {
                    sb.append((CharSequence) string, i6, dVarA.b().s);
                    sb.append(fetchProxyResource$lambda$71$lambda$70(url, dVarA));
                    i6 = dVarA.b().f14720t + 1;
                    CharSequence charSequence = dVarA.f15166b;
                    Matcher matcher = dVarA.f15165a;
                    int iEnd = matcher.end() + (matcher.end() != matcher.start() ? 0 : 1);
                    if (iEnd <= charSequence.length()) {
                        Matcher matcher2 = matcher.pattern().matcher(charSequence);
                        kotlin.jvm.internal.j.d("matcher(...)", matcher2);
                        dVarA = !matcher2.find(iEnd) ? null : new x5.d(matcher2, charSequence);
                    }
                    if (i6 >= length) {
                        break;
                    }
                } while (dVarA != null);
                if (i6 < length) {
                    sb.append((CharSequence) string, i6, length);
                }
                String string2 = sb.toString();
                kotlin.jvm.internal.j.d("toString(...)", string2);
                return string2;
            }
        }
        return str;
    }

    private static final CharSequence fetchProxyResource$lambda$71$lambda$70(URL url, x5.c cVar) {
        kotlin.jvm.internal.j.e("matchResult", cVar);
        String strA = cVar.a().get(1);
        try {
            strA = new URL(url, strA).toString();
        } catch (Exception unused) {
        }
        kotlin.jvm.internal.j.b(strA);
        if (x5.l.n(strA, "http://", false)) {
            strA = androidx.camera.camera2.internal.k0.a("https://appassets.androidplatform.net/__cleartext_proxy__/?url=", URLEncoder.encode(strA, "UTF-8"));
        }
        return androidx.camera.camera2.internal.v0.b("URI=\"", strA, "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void geolocationPermissionLauncher$lambda$7(WebViewActivity webViewActivity, Map map) {
        kotlin.jvm.internal.j.e("<unused var>", map);
        GeolocationPermissions.Callback callback = webViewActivity.pendingGeolocationCallback;
        if (callback == null) {
            return;
        }
        String str = webViewActivity.pendingGeolocationOrigin;
        webViewActivity.pendingGeolocationCallback = null;
        webViewActivity.pendingGeolocationOrigin = null;
        callback.invoke(str, webViewActivity.hasLocationPermission(), false);
    }

    private final int getActionBarHeight() {
        return getTopActionBarHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r3.equals("https") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r3.equals("http") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r3 = r13.getHost();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r3 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r3 = r3.toLowerCase(r4);
        kotlin.jvm.internal.j.d("toLowerCase(...)", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (x5.o.o(r3, "play.google.com", false) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (x5.o.o(r3, "market.android.com", false) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        return launchExternalApp(r13, "com.android.vending");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleExternalNavigation(Uri uri) {
        String scheme;
        if (uri != null && (scheme = uri.getScheme()) != null) {
            Locale locale = Locale.ROOT;
            kotlin.jvm.internal.j.d("ROOT", locale);
            String lowerCase = scheme.toLowerCase(locale);
            kotlin.jvm.internal.j.d("toLowerCase(...)", lowerCase);
            switch (lowerCase.hashCode()) {
                case -1183762788:
                    if (lowerCase.equals("intent")) {
                        String string = uri.toString();
                        kotlin.jvm.internal.j.d("toString(...)", string);
                        return handleIntentUrl(string);
                    }
                    return launchExternalApp$default(this, new Intent("android.intent.action.VIEW", uri), (String) null, 2, (Object) null);
                case -1081572750:
                    if (lowerCase.equals("mailto")) {
                        return launchExternalApp$default(this, new Intent("android.intent.action.SENDTO", uri), (String) null, 2, (Object) null);
                    }
                    return launchExternalApp$default(this, new Intent("android.intent.action.VIEW", uri), (String) null, 2, (Object) null);
                case -1081306052:
                    if (lowerCase.equals("market")) {
                        return launchExternalApp(uri, "com.android.vending");
                    }
                    return launchExternalApp$default(this, new Intent("android.intent.action.VIEW", uri), (String) null, 2, (Object) null);
                case 114715:
                    if (lowerCase.equals("tel")) {
                        return launchExternalApp$default(this, new Intent("android.intent.action.DIAL", uri), (String) null, 2, (Object) null);
                    }
                    return launchExternalApp$default(this, new Intent("android.intent.action.VIEW", uri), (String) null, 2, (Object) null);
                case 3026845:
                    if (lowerCase.equals("blob")) {
                        AndroidAPI androidAPI = this.androidApi;
                        if (androidAPI == null) {
                            kotlin.jvm.internal.j.g("androidApi");
                            throw null;
                        }
                        String string2 = uri.toString();
                        kotlin.jvm.internal.j.d("toString(...)", string2);
                        androidAPI.downloadBlobUrl(string2, "export_" + System.currentTimeMillis(), "application/octet-stream");
                        return true;
                    }
                    return launchExternalApp$default(this, new Intent("android.intent.action.VIEW", uri), (String) null, 2, (Object) null);
                case 3076010:
                    if (lowerCase.equals("data")) {
                        String string3 = uri.toString();
                        kotlin.jvm.internal.j.d("toString(...)", string3);
                        downloadDataUri$default(this, string3, null, null, 6, null);
                        return true;
                    }
                    return launchExternalApp$default(this, new Intent("android.intent.action.VIEW", uri), (String) null, 2, (Object) null);
                case 3213448:
                    break;
                case 99617003:
                    break;
                default:
                    return launchExternalApp$default(this, new Intent("android.intent.action.VIEW", uri), (String) null, 2, (Object) null);
            }
        }
        return false;
    }

    private final boolean handleIntentUrl(String str) throws URISyntaxException {
        Intent uri;
        String str2;
        try {
            uri = Intent.parseUri(str, 1);
            str2 = uri.getPackage();
        } catch (Exception unused) {
        }
        if (str2 != null && isPackageInstalled(str2)) {
            return launchExternalApp$default(this, uri, (String) null, 2, (Object) null);
        }
        String stringExtra = uri.getStringExtra("browser_fallback_url");
        if (stringExtra == null) {
            stringExtra = uri.getStringExtra("S.browser_fallback_url");
        }
        if (stringExtra != null && !x5.o.v(stringExtra)) {
            Uri uri2 = Uri.parse(stringExtra);
            kotlin.jvm.internal.j.d("parse(...)", uri2);
            return launchExternalApp$default(this, uri2, (String) null, 2, (Object) null);
        }
        if (str2 != null) {
            Uri uri3 = Uri.parse("https://play.google.com/store/apps/details?id=".concat(str2));
            kotlin.jvm.internal.j.d("parse(...)", uri3);
            return launchExternalApp(uri3, "com.android.vending");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasLocationPermission() {
        return k0.a.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || k0.a.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideCustomView() {
        View view = this.customVideoView;
        if (view == null) {
            return;
        }
        View viewFindViewById = findViewById(R.id.root_layout);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.main_content_container);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById2);
        ((FrameLayout) viewFindViewById).removeView(view);
        viewFindViewById2.setVisibility(0);
        this.customVideoView = null;
        WebChromeClient.CustomViewCallback customViewCallback = this.customViewCallback;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.customViewCallback = null;
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig.getShowHeader()) {
            Window window = getWindow();
            u0.w wVar = new u0.w(getWindow().getDecorView());
            int i6 = Build.VERSION.SDK_INT;
            (i6 >= 35 ? new u0.x0(window, wVar) : i6 >= 30 ? new u0.w0(window, wVar) : i6 >= 26 ? new u0.v0(window, wVar) : new u0.u0(window, wVar)).n(519);
        }
        applySystemBarScrims(this.lastTopBarInset, this.lastBottomBarInset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSplash() {
        Runnable runnable = this.splashDismissRunnable;
        if (runnable != null) {
            this.splashHandler.removeCallbacks(runnable);
        }
        ImageView imageView = (ImageView) findViewById(R.id.splash_loader_circle);
        Drawable drawable = imageView != null ? imageView.getDrawable() : null;
        CircularProgressDrawable circularProgressDrawable = drawable instanceof CircularProgressDrawable ? (CircularProgressDrawable) drawable : null;
        if (circularProgressDrawable != null) {
            circularProgressDrawable.stop();
        }
        View viewFindViewById = findViewById(R.id.splash_container);
        if (viewFindViewById == null || viewFindViewById.getVisibility() != 0) {
            ImageView imageView2 = this.splashView;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.g("splashView");
                throw null;
            }
        }
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig.getSplashFadeOut()) {
            if (this.displayConfig != null) {
                viewFindViewById.animate().alpha(0.0f).setDuration(u5.d.p(r2.getSplashFadeDuration(), 100, 2000)).withEndAction(new androidx.camera.core.j(3, viewFindViewById, this)).start();
                return;
            } else {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
        }
        viewFindViewById.setVisibility(8);
        ImageView imageView3 = this.splashView;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.g("splashView");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideSplash$lambda$109(View view, WebViewActivity webViewActivity) {
        view.setVisibility(8);
        ImageView imageView = webViewActivity.splashView;
        if (imageView != null) {
            imageView.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.g("splashView");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectBlobDownloadInterceptor() {
        if (this.webView == null) {
            return;
        }
        runOnUiThread(new k1(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void injectBlobDownloadInterceptor$lambda$107(WebViewActivity webViewActivity) {
        webViewActivity.getWebView().evaluateJavascript(WebViewActivityKt.DOWNLOAD_INTERCEPTOR_SCRIPT, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectCleartextInterceptor() {
        if (this.webView == null) {
            return;
        }
        runOnUiThread(new x0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void injectCleartextInterceptor$lambda$106(WebViewActivity webViewActivity) {
        webViewActivity.getWebView().evaluateJavascript(WebViewActivityKt.CLEARTEXT_INTERCEPTOR_SCRIPT, null);
    }

    private final boolean isCameraPermissionDeclared() throws PackageManager.NameNotFoundException {
        try {
            String[] strArr = getPackageManager().getPackageInfo(getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return e5.j.v(strArr, "android.permission.CAMERA");
            }
            return true;
        } catch (Exception e6) {
            Log.w("WebViewActivity", "requestedPermissions lookup failed, assuming CAMERA declared", e6);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLocationPermissionDeclared() {
        return !declaredLocationPermissions().isEmpty();
    }

    private final boolean isNavBarScrimActive() {
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (!displayConfig.getShowHeader() || this.customVideoView != null) {
            return false;
        }
        DisplayConfig displayConfig2 = this.displayConfig;
        if (displayConfig2 != null) {
            return displayConfig2.getNavBarAlpha() > 0;
        }
        kotlin.jvm.internal.j.g("displayConfig");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNetworkConnected() {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = getSystemService("connectivity");
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

    private final boolean isPackageInstalled(String str) throws PackageManager.NameNotFoundException {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean isStatusBarScrimActive() {
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (!displayConfig.getShowHeader() || this.customVideoView != null) {
            return false;
        }
        DisplayConfig displayConfig2 = this.displayConfig;
        if (displayConfig2 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig2.getStatusBarAlpha() <= 0) {
            return false;
        }
        DisplayConfig displayConfig3 = this.displayConfig;
        if (displayConfig3 != null) {
            return (x5.o.v(displayConfig3.getStatusBarColor()) && this.fullBleedUnderStatusBar) ? false : true;
        }
        kotlin.jvm.internal.j.g("displayConfig");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j jsEventEmitter$lambda$0(WebViewActivity webViewActivity, String str, JSONObject jSONObject) {
        kotlin.jvm.internal.j.e("event", str);
        kotlin.jvm.internal.j.e("data", jSONObject);
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            if (androidAPI == null) {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
            androidAPI.emit$template_adsRelease(str, jSONObject);
        }
        return d5.j.f12745a;
    }

    private final boolean launchExternalApp(Uri uri, String str) {
        return launchExternalApp(new Intent("android.intent.action.VIEW", uri), str);
    }

    public static /* synthetic */ boolean launchExternalApp$default(WebViewActivity webViewActivity, Uri uri, String str, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str = null;
        }
        return webViewActivity.launchExternalApp(uri, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void multiplePermissionsLauncher$lambda$8(WebViewActivity webViewActivity, Map map) throws JSONException {
        kotlin.jvm.internal.j.e("results", map);
        String str = webViewActivity.pendingPermissionsCallbackId;
        if (str == null) {
            return;
        }
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI == null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
        androidAPI.onPermissionsResult(str, map);
        webViewActivity.pendingPermissionsCallbackId = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$28(WebViewActivity webViewActivity) {
        AlarmReceiver.Companion.rescheduleAll(webViewActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onCreate$lambda$29(WebViewActivity webViewActivity, d.a aVar) {
        Uri[] uriArr;
        kotlin.jvm.internal.j.e("result", aVar);
        ValueCallback<Uri[]> valueCallback = webViewActivity.filePathCallback;
        Uri[] uriArr2 = null;
        webViewActivity.filePathCallback = null;
        if (valueCallback == null) {
            return;
        }
        File file = webViewActivity.pendingWebCaptureFile;
        webViewActivity.pendingWebCaptureFile = null;
        Intent intent = aVar.f12632t;
        boolean z6 = false;
        boolean z7 = aVar.s == -1;
        if (!z7 || intent == null) {
            uriArr = null;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            kotlin.jvm.internal.j.b(clipData);
            int itemCount = clipData.getItemCount();
            uriArr = new Uri[itemCount];
            for (int i6 = 0; i6 < itemCount; i6++) {
                Uri uri = clipData.getItemAt(i6).getUri();
                kotlin.jvm.internal.j.d("getUri(...)", uri);
                uriArr[i6] = uri;
            }
        } else if (intent.getData() != null) {
            Uri data = intent.getData();
            kotlin.jvm.internal.j.b(data);
            uriArr = new Uri[]{data};
        }
        if (uriArr == null && z7 && file != null && file.exists() && file.length() > 0) {
            try {
                uriArr2 = new Uri[]{FileProvider.getUriForFile(webViewActivity, webViewActivity.getPackageName() + ".fileprovider", file)};
            } catch (Exception e6) {
                Log.e("WebViewActivity", "Captured photo URI failed", e6);
            }
            uriArr = uriArr2;
            z6 = true;
        }
        if (!z6 && file != null) {
            try {
                file.delete();
            } catch (Throwable unused) {
            }
        }
        valueCallback.onReceiveValue(uriArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$32(WebViewActivity webViewActivity) {
        webViewActivity.getWebView().reload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$33(WebViewActivity webViewActivity, SwipeRefreshLayout swipeRefreshLayout, View view) {
        kotlin.jvm.internal.j.e("<unused var>", swipeRefreshLayout);
        return webViewActivity.getWebView().getScrollY() > 0 || webViewActivity.pullRefreshGuard.getBlocked() || webViewActivity.popupWebView != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$34() {
        return kotlin.jvm.internal.j.a(Looper.myLooper(), Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.s0 onCreate$lambda$35(WebViewActivity webViewActivity, View view, u0.s0 s0Var) throws Throwable {
        Throwable th;
        boolean showCameraCutout;
        int iMax;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View view2;
        m0.b bVarF = s0Var.f14553a.f(527);
        s0.l lVar = s0Var.f14553a;
        m0.b bVarF2 = lVar.f(128);
        int i6 = bVarF2.f13855b;
        int i7 = bVarF2.f13856c;
        int i8 = bVarF2.f13854a;
        int i9 = bVarF.f13855b;
        int i10 = bVarF.f13857d;
        int i11 = bVarF.f13856c;
        int i12 = bVarF.f13854a;
        int iMax2 = Math.max(i6, i9);
        DisplayConfig displayConfig = webViewActivity.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        boolean z6 = displayConfig.getShowActionBar() && ((view2 = webViewActivity.toolbar) == null || view2.getVisibility() != 8);
        if (z6) {
            showCameraCutout = false;
            th = null;
        } else {
            th = null;
            DisplayConfig displayConfig2 = webViewActivity.displayConfig;
            if (displayConfig2 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            showCameraCutout = displayConfig2.getShowCameraCutout();
        }
        DisplayConfig displayConfig3 = webViewActivity.displayConfig;
        if (displayConfig3 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw th;
        }
        webViewActivity.fullBleedUnderStatusBar = displayConfig3.getShowHeader() && showCameraCutout;
        if (z6) {
            DisplayConfig displayConfig4 = webViewActivity.displayConfig;
            if (displayConfig4 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw th;
            }
            int i13 = displayConfig4.getShowHeader() ? iMax2 : 0;
            View view3 = webViewActivity.toolbar;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = webViewActivity.toolbar;
            if (view4 != null && (layoutParams2 = view4.getLayoutParams()) != null) {
                layoutParams2.height = -2;
            }
            View view5 = webViewActivity.toolbar;
            if (view5 != null) {
                view5.setPadding(Math.max(i8, i12), i13, Math.max(i7, i11), 0);
            }
            SwipeRefreshLayout swipeRefreshLayout = webViewActivity.swipeRefreshLayout;
            if (swipeRefreshLayout == null) {
                kotlin.jvm.internal.j.g("swipeRefreshLayout");
                throw th;
            }
            swipeRefreshLayout.setPadding(Math.max(i8, i12), webViewActivity.bannerPaddingTop, Math.max(i7, i11), webViewActivity.bannerPaddingBottom + i10);
        } else {
            View view6 = webViewActivity.toolbar;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            View view7 = webViewActivity.toolbar;
            if (view7 != null && (layoutParams = view7.getLayoutParams()) != null) {
                layoutParams.height = 0;
            }
            View view8 = webViewActivity.toolbar;
            if (view8 != null) {
                view8.setPadding(0, 0, 0, 0);
            }
            if (showCameraCutout) {
                iMax = webViewActivity.bannerPaddingTop;
            } else {
                DisplayConfig displayConfig5 = webViewActivity.displayConfig;
                if (displayConfig5 == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw th;
                }
                iMax = (displayConfig5.getShowHeader() ? iMax2 : Math.max(bVarF2.f13855b, bVarF.f13855b)) + webViewActivity.bannerPaddingTop;
            }
            int iMax3 = showCameraCutout ? 0 : Math.max(i8, i12);
            int iMax4 = showCameraCutout ? 0 : Math.max(i7, i11);
            int i14 = webViewActivity.bannerPaddingBottom + i10;
            SwipeRefreshLayout swipeRefreshLayout2 = webViewActivity.swipeRefreshLayout;
            if (swipeRefreshLayout2 == null) {
                kotlin.jvm.internal.j.g("swipeRefreshLayout");
                throw th;
            }
            swipeRefreshLayout2.setPadding(iMax3, iMax, iMax4, i14);
        }
        m0.b bVarC = m0.b.c(Math.max(i8, i12), iMax2, Math.max(i7, i11), i10);
        webViewActivity.popupInsets = bVarC;
        FrameLayout frameLayout = webViewActivity.popupContainer;
        if (frameLayout != null) {
            frameLayout.setPadding(bVarC.f13854a, bVarC.f13855b, bVarC.f13856c, bVarC.f13857d);
        }
        AdMobBridge adMobBridge = webViewActivity.adMobBridge;
        if (adMobBridge != null) {
            if (adMobBridge == null) {
                kotlin.jvm.internal.j.g("adMobBridge");
                throw th;
            }
            adMobBridge.updateBannerMargins();
        }
        webViewActivity.applySystemBarScrims(iMax2, lVar.f(519).f13857d);
        return u0.s0.f14552b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$36(FrameLayout frameLayout) {
        WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
        f0.c.c(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onCreate$lambda$39(WebViewActivity webViewActivity, androidx.activity.f0 f0Var) throws ExecutionException, JSONException, InterruptedException {
        kotlin.jvm.internal.j.e("$this$addCallback", f0Var);
        w2.l0 l0Var = webViewActivity.pdfDocument;
        d5.j jVar = d5.j.f12745a;
        if (l0Var != null && l0Var.f14921v.e()) {
            return jVar;
        }
        if (webViewActivity.customVideoView != null) {
            webViewActivity.hideCustomView();
            return jVar;
        }
        PreviewView previewView = webViewActivity.previewView;
        if (previewView == null) {
            kotlin.jvm.internal.j.g("previewView");
            throw null;
        }
        if (previewView.getVisibility() == 0) {
            webViewActivity.stopCameraPreview();
            return jVar;
        }
        WebView webView = webViewActivity.popupWebView;
        if (webView != null) {
            if (webView.canGoBack()) {
                webView.goBack();
                return jVar;
            }
            webViewActivity.closePopupWebView();
            return jVar;
        }
        DisplayConfig displayConfig = webViewActivity.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig.getBackHistoryNavigation() && webViewActivity.getWebView().canGoBack()) {
            webViewActivity.getWebView().goBack();
            return jVar;
        }
        DisplayConfig displayConfig2 = webViewActivity.displayConfig;
        if (displayConfig2 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig2.getExitConfirmationDialog()) {
            IosDialogHelper.INSTANCE.showExitConfirmation(webViewActivity, new e0(2, webViewActivity));
            return jVar;
        }
        webViewActivity.finish();
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onCreate$lambda$39$lambda$38(WebViewActivity webViewActivity) {
        webViewActivity.finish();
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$47(WebViewActivity webViewActivity, String str, String str2, String str3, String str4, long j6) {
        String strGuessFileName;
        if (str == null || x5.o.v(str)) {
            return;
        }
        if (x5.l.k(str4 != null ? x5.o.G(x5.o.E(str4, ';')).toString() : null, "application/pdf") || PdfActivity.Companion.isPdf(Uri.parse(str))) {
            Uri uri = Uri.parse(str);
            kotlin.jvm.internal.j.d("parse(...)", uri);
            if (webViewActivity.openPdf(uri)) {
                return;
            }
        }
        String string = x5.o.G(str).toString();
        if (x5.l.n(string, "blob:", true)) {
            String strGuessFileName2 = URLUtil.guessFileName(string, str3, str4);
            kotlin.jvm.internal.j.b(strGuessFileName2);
            if (x5.o.v(strGuessFileName2) || strGuessFileName2.equals("downloadfile.bin")) {
                strGuessFileName2 = "export_" + System.currentTimeMillis();
            }
            AndroidAPI androidAPI = webViewActivity.androidApi;
            if (androidAPI == null) {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
            kotlin.jvm.internal.j.b(strGuessFileName2);
            if (str4 == null) {
                str4 = "application/octet-stream";
            }
            androidAPI.downloadBlobUrl(string, strGuessFileName2, str4);
            return;
        }
        if (x5.l.n(string, "data:", true)) {
            webViewActivity.downloadDataUri(string, str3, str4);
            return;
        }
        if (!x5.l.n(string, "http://", true) && !x5.l.n(string, "https://", true)) {
            Log.w("WebViewActivity", "DownloadManager only supports HTTP/HTTPS, skipping scheme: ".concat(string));
            return;
        }
        try {
            String strContentDispositionFileName = WebViewActivityKt.contentDispositionFileName(str3);
            if (strContentDispositionFileName != null) {
                Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
                kotlin.jvm.internal.j.d("compile(...)", patternCompile);
                strGuessFileName = patternCompile.matcher(strContentDispositionFileName).replaceAll("_");
                kotlin.jvm.internal.j.d("replaceAll(...)", strGuessFileName);
            } else {
                strGuessFileName = URLUtil.guessFileName(string, str3, str4);
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(string));
            request.setMimeType(str4);
            request.addRequestHeader("User-Agent", str2);
            try {
                String cookie = CookieManager.getInstance().getCookie(string);
                if (cookie != null) {
                    if (x5.o.v(cookie)) {
                        cookie = null;
                    }
                    if (cookie != null) {
                        request.addRequestHeader("Cookie", cookie);
                    }
                }
            } catch (Exception unused) {
            }
            String url = webViewActivity.getWebView().getUrl();
            if (url != null) {
                String str5 = x5.l.n(url, "http", true) ? url : null;
                if (str5 != null) {
                    request.addRequestHeader("Referer", str5);
                }
            }
            request.setDescription("Downloading file…");
            request.setTitle(strGuessFileName);
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
            Object systemService = webViewActivity.getSystemService("download");
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type android.app.DownloadManager", systemService);
            ((DownloadManager) systemService).enqueue(request);
            Toast.makeText(webViewActivity, R.string.download_started, 0).show();
        } catch (Exception e6) {
            Log.e("WebViewActivity", "DownloadManager enqueue failed", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onCreate$lambda$51(WebViewActivity webViewActivity, w2.n0 n0Var, File file) {
        kotlin.jvm.internal.j.e("file", file);
        webViewActivity.pendingPdfSave = file;
        try {
            d.c<String> cVar = webViewActivity.pdfSaveLauncher;
            Handler handler = w2.y.f15051a;
            cVar.a(w2.y.b(n0Var.f14964m));
        } catch (Exception e6) {
            webViewActivity.pendingPdfSave = null;
            Log.w("WebViewActivity", "No document picker for PDF save", e6);
            Toast.makeText(webViewActivity, R.string.pdf_document_export_failed, 0).show();
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onCreate$lambda$54(WebViewActivity webViewActivity) {
        webViewActivity.pageLoadFinished = true;
        ProgressBar progressBar = webViewActivity.progressBar;
        if (progressBar == null) {
            kotlin.jvm.internal.j.g("progressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        DisplayConfig displayConfig = webViewActivity.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        long jMax = 0;
        if (displayConfig.getHasSplash()) {
            if (webViewActivity.displayConfig == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            jMax = Math.max(0L, (u5.d.p(r1.getSplashDuration(), 1, 15) * 1000) - (System.currentTimeMillis() - webViewActivity.splashStartTime));
        }
        Runnable runnable = webViewActivity.splashDismissRunnable;
        if (runnable != null) {
            webViewActivity.splashHandler.removeCallbacks(runnable);
        }
        androidx.activity.d dVar = new androidx.activity.d(2, webViewActivity);
        webViewActivity.splashDismissRunnable = dVar;
        webViewActivity.splashHandler.postDelayed(dVar, jMax);
        AdMobBridge adMobBridge = webViewActivity.adMobBridge;
        if (adMobBridge != null) {
            adMobBridge.onPageLoaded();
            return d5.j.f12745a;
        }
        kotlin.jvm.internal.j.g("adMobBridge");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j onCreate$lambda$55(WebViewActivity webViewActivity) {
        ProgressBar progressBar = webViewActivity.progressBar;
        if (progressBar == null) {
            kotlin.jvm.internal.j.g("progressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        webViewActivity.hideSplash();
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$56(WebViewActivity webViewActivity, String str) {
        webViewActivity.getWebView().loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPageLoadFailed(String str) {
        this.pageLoadFinished = true;
        this.pageLoadHandler.removeCallbacks(this.pageLoadTimeoutRunnable);
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            kotlin.jvm.internal.j.g("progressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        hideSplash();
        Log.e("WebViewActivity", str);
        Toast.makeText(this, str, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPageLoadTimedOut() {
        if (this.pageLoadFinished) {
            return;
        }
        this.lastPageLoadFailed = true;
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (kotlin.jvm.internal.j.a(displayConfig.getMode(), "url")) {
            DisplayConfig displayConfig2 = this.displayConfig;
            if (displayConfig2 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            if (displayConfig2.getNoInternetDialog()) {
                showNoInternetDialog();
                return;
            }
        }
        String string = getString(R.string.page_load_timeout);
        kotlin.jvm.internal.j.d("getString(...)", string);
        onPageLoadFailed(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean openPdf(Uri uri) {
        PdfActivity.Companion companion = PdfActivity.Companion;
        int iPdfAccentColor = pdfAccentColor();
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig != null) {
            return companion.open(this, uri, iPdfAccentColor, displayConfig.getColorMode());
        }
        kotlin.jvm.internal.j.g("displayConfig");
        throw null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final WebView openPopupWebView() {
        closePopupWebView();
        WebSettings settings = getWebView().getSettings();
        kotlin.jvm.internal.j.d("getSettings(...)", settings);
        final WebView webView = new WebView(this);
        WebSettings settings2 = webView.getSettings();
        settings2.setJavaScriptEnabled(settings.getJavaScriptEnabled());
        settings2.setDomStorageEnabled(settings.getDomStorageEnabled());
        settings2.setJavaScriptCanOpenWindowsAutomatically(true);
        settings2.setSupportMultipleWindows(true);
        settings2.setMixedContentMode(settings.getMixedContentMode());
        boolean z6 = false;
        settings2.setMediaPlaybackRequiresUserGesture(false);
        settings2.setUseWideViewPort(true);
        settings2.setLoadWithOverviewMode(true);
        settings2.setSupportZoom(true);
        settings2.setBuiltInZoomControls(true);
        settings2.setDisplayZoomControls(false);
        settings2.setUserAgentString(settings.getUserAgentString());
        if (settings.getJavaScriptEnabled() && isLocationPermissionDeclared()) {
            z6 = true;
        }
        settings2.setGeolocationEnabled(z6);
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        } catch (Exception unused) {
        }
        webView.setWebViewClient(new AnonymousClass2());
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.htmltoapk.template.WebViewActivity.openPopupWebView.3
            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView2) {
                if (WebViewActivity.this.popupWebView == webView2) {
                    WebViewActivity.this.closePopupWebView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView2, boolean z7, boolean z8, Message message) {
                return WebViewActivity.this.attachPopupWindow(z8, message);
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                WebChromeClient webChromeClient = WebViewActivity.this.mainChromeClient;
                if (webChromeClient != null) {
                    webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    kotlin.jvm.internal.j.g("mainChromeClient");
                    throw null;
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                WebChromeClient webChromeClient = WebViewActivity.this.mainChromeClient;
                if (webChromeClient != null) {
                    webChromeClient.onHideCustomView();
                } else {
                    kotlin.jvm.internal.j.g("mainChromeClient");
                    throw null;
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                WebChromeClient webChromeClient = WebViewActivity.this.mainChromeClient;
                if (webChromeClient != null) {
                    webChromeClient.onPermissionRequest(permissionRequest);
                } else {
                    kotlin.jvm.internal.j.g("mainChromeClient");
                    throw null;
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                WebChromeClient webChromeClient = WebViewActivity.this.mainChromeClient;
                if (webChromeClient != null) {
                    webChromeClient.onShowCustomView(view, customViewCallback);
                } else {
                    kotlin.jvm.internal.j.g("mainChromeClient");
                    throw null;
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                WebChromeClient webChromeClient = WebViewActivity.this.mainChromeClient;
                if (webChromeClient != null) {
                    return webChromeClient.onShowFileChooser(webView2, valueCallback, fileChooserParams);
                }
                kotlin.jvm.internal.j.g("mainChromeClient");
                throw null;
            }
        });
        AndroidAPI androidAPI = this.androidApi;
        if (androidAPI == null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
        webView.addJavascriptInterface(new PopupDownloadBridge(this, androidAPI, webView), PopupDownloadBridge.NAME);
        if (androidx.activity.c0.f("DOCUMENT_START_SCRIPT")) {
            try {
                h2.c.a(webView, WebViewActivityKt.DOWNLOAD_INTERCEPTOR_SCRIPT, j3.b.d("*"));
            } catch (Exception e6) {
                Log.w("WebViewActivity", "Popup download script failed: " + e6.getMessage());
            }
        }
        webView.setDownloadListener(new DownloadListener() { // from class: com.htmltoapk.template.w0
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
                WebViewActivity.openPopupWebView$lambda$123(this.s, webView, str, str2, str3, str4, j6);
            }
        });
        float f6 = getResources().getDisplayMetrics().density;
        ImageButton imageButton = new ImageButton(this);
        imageButton.setImageResource(android.R.drawable.ic_menu_close_clear_cancel);
        imageButton.setContentDescription(getString(android.R.string.cancel));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#99000000"));
        imageButton.setBackground(gradientDrawable);
        imageButton.setColorFilter(-1);
        imageButton.setOnClickListener(new com.google.android.material.datepicker.t(1, this));
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-1);
        frameLayout.setClickable(true);
        m0.b bVar = this.popupInsets;
        frameLayout.setPadding(bVar.f13854a, bVar.f13855b, bVar.f13856c, bVar.f13857d);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        int i6 = (int) (40 * f6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i6, 8388661);
        int i7 = (int) (8 * f6);
        layoutParams.setMargins(i7, i7, i7, i7);
        frameLayout.addView(imageButton, layoutParams);
        View viewFindViewById = findViewById(R.id.root_layout);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById);
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById;
        frameLayout2.addView(frameLayout, frameLayout2.indexOfChild(findViewById(R.id.main_content_container)) + 1, new FrameLayout.LayoutParams(-1, -1));
        this.popupContainer = frameLayout;
        this.popupWebView = webView;
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openPopupWebView$lambda$123(WebViewActivity webViewActivity, WebView webView, String str, String str2, String str3, String str4, long j6) {
        String string = str != null ? x5.o.G(str).toString() : null;
        if (string == null) {
            string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (!x5.l.n(string, "blob:", true)) {
            DownloadListener downloadListener = webViewActivity.downloadListener;
            if (downloadListener != null) {
                downloadListener.onDownloadStart(str, str2, str3, str4, j6);
                return;
            } else {
                kotlin.jvm.internal.j.g("downloadListener");
                throw null;
            }
        }
        String strGuessFileName = URLUtil.guessFileName(string, str3, str4);
        kotlin.jvm.internal.j.b(strGuessFileName);
        if (x5.o.v(strGuessFileName) || strGuessFileName.equals("downloadfile.bin")) {
            strGuessFileName = null;
        }
        if (strGuessFileName == null) {
            strGuessFileName = "export_" + System.currentTimeMillis();
        }
        String str5 = strGuessFileName;
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI == null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
        if (str4 == null) {
            str4 = "application/octet-stream";
        }
        androidAPI.downloadBlobUrlIn(webView, PopupDownloadBridge.NAME, string, str5, str4);
    }

    private final Integer parseBarColor(String str) {
        if (!x5.l.n(str, "#", false)) {
            str = "#".concat(str);
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    private final List<String> parsePermissions(JSONArray jSONArray) {
        if (jSONArray == null) {
            return e5.s.s;
        }
        int i6 = 0;
        u5.c cVarQ = u5.d.q(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = cVarQ.iterator();
        while (it.hasNext()) {
            String strOptString = jSONArray.optString(((e5.v) it).nextInt());
            if (strOptString != null) {
                arrayList.add(strOptString);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            if (!x5.o.v((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final List<String> parseTestDeviceIds(JSONArray jSONArray) {
        if (jSONArray == null) {
            return e5.s.s;
        }
        int i6 = 0;
        u5.c cVarQ = u5.d.q(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = cVarQ.iterator();
        while (it.hasNext()) {
            String strOptString = jSONArray.optString(((e5.v) it).nextInt());
            if (strOptString != null) {
                arrayList.add(strOptString);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            if (!x5.o.v((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final WebViewSettings parseWebViewSettings(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, null, 0, false, 32767, null);
        }
        boolean zOptBoolean = jSONObject.optBoolean("javaScriptEnabled", true);
        boolean zOptBoolean2 = jSONObject.optBoolean("domStorageEnabled", true);
        boolean zOptBoolean3 = jSONObject.optBoolean("allowFileAccess", false);
        boolean zOptBoolean4 = jSONObject.optBoolean("allowContentAccess", false);
        boolean zOptBoolean5 = jSONObject.optBoolean("allowUniversalAccessFromFileURLs", true);
        boolean zOptBoolean6 = jSONObject.optBoolean("allowFileAccessFromFileURLs", true);
        boolean zOptBoolean7 = jSONObject.optBoolean("builtInZoomControls", true);
        boolean zOptBoolean8 = jSONObject.optBoolean("displayZoomControls", false);
        boolean zOptBoolean9 = jSONObject.optBoolean("useWideViewPort", true);
        boolean zOptBoolean10 = jSONObject.optBoolean("loadWithOverviewMode", true);
        int iOptInt = jSONObject.optInt("cacheMode", -1);
        int iOptInt2 = jSONObject.optInt("mixedContentMode", 0);
        String strOptString = jSONObject.optString("userAgent");
        kotlin.jvm.internal.j.b(strOptString);
        if (x5.o.v(strOptString)) {
            strOptString = null;
        }
        return new WebViewSettings(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, zOptBoolean9, zOptBoolean10, iOptInt, iOptInt2, strOptString, jSONObject.optInt("textZoom", 100), jSONObject.optBoolean("geolocationEnabled", false));
    }

    private final int pdfAccentColor() {
        Object objA;
        DisplayConfig displayConfig;
        try {
            displayConfig = this.displayConfig;
        } catch (Throwable th) {
            objA = d5.e.a(th);
        }
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        objA = Integer.valueOf(Color.parseColor(displayConfig.getPrimaryColor()));
        if (objA instanceof d.a) {
            objA = -14575885;
        }
        return ((Number) objA).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pdfSaveLauncher$lambda$21(WebViewActivity webViewActivity, Uri uri) {
        File file = webViewActivity.pendingPdfSave;
        webViewActivity.pendingPdfSave = null;
        if (uri == null || file == null) {
            return;
        }
        w2.y.c(webViewActivity, file, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void permissionLauncher$lambda$3(WebViewActivity webViewActivity, boolean z6) throws JSONException, CameraAccessException {
        String str = webViewActivity.pendingCameraCallbackId;
        if (str == null || !kotlin.jvm.internal.j.a(webViewActivity.pendingPermission, "android.permission.CAMERA")) {
            String str2 = webViewActivity.pendingPermissionCallbackId;
            if (str2 == null) {
                return;
            }
            AndroidAPI androidAPI = webViewActivity.androidApi;
            if (androidAPI == null) {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
            String str3 = webViewActivity.pendingPermission;
            if (str3 == null) {
                str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            androidAPI.onPermissionResult(str2, str3, z6);
            webViewActivity.pendingPermissionCallbackId = null;
            webViewActivity.pendingPermission = null;
            return;
        }
        webViewActivity.pendingPermission = null;
        boolean z7 = webViewActivity.pendingCameraFront;
        webViewActivity.pendingCameraCallbackId = null;
        if (z6) {
            if (z7) {
                webViewActivity.captureFrontPhoto(str);
                return;
            } else {
                webViewActivity.launchCameraIntent(str);
                return;
            }
        }
        AndroidAPI androidAPI2 = webViewActivity.androidApi;
        if (androidAPI2 != null) {
            androidAPI2.onCameraResult(str, false, null, "permission_denied");
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickFileLauncher$lambda$20(WebViewActivity webViewActivity, Uri uri) throws JSONException {
        String str = webViewActivity.pendingFileCallbackId;
        webViewActivity.pendingFileCallbackId = null;
        if (str == null) {
            return;
        }
        if (uri != null) {
            new Thread(new androidx.camera.core.processing.concurrent.d(webViewActivity, uri, str, 3)).start();
            return;
        }
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            androidAPI.onFilePicked(str, null, "cancelled");
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickFileLauncher$lambda$20$lambda$19(WebViewActivity webViewActivity, Uri uri, String str) throws IOException {
        UriReadResult uriContentResult = webViewActivity.readUriContentResult(uri);
        if (uriContentResult instanceof UriReadResult.Content) {
            webViewActivity.runOnUiThread(new androidx.camera.core.processing.concurrent.d(webViewActivity, str, (UriReadResult.Content) uriContentResult, 2));
        } else {
            if (!(uriContentResult instanceof UriReadResult.Error)) {
                throw new yy1();
            }
            webViewActivity.runOnUiThread(new x(webViewActivity, str, (UriReadResult.Error) uriContentResult));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickFileLauncher$lambda$20$lambda$19$lambda$17(WebViewActivity webViewActivity, String str, UriReadResult uriReadResult) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            androidAPI.onFilePicked(str, ((UriReadResult.Content) uriReadResult).getBase64(), null);
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickFileLauncher$lambda$20$lambda$19$lambda$18(WebViewActivity webViewActivity, String str, UriReadResult uriReadResult) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI != null) {
            androidAPI.onFilePicked(str, null, ((UriReadResult.Error) uriReadResult).getCode());
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri prepareWebCaptureUri() {
        try {
            File file = new File(getCacheDir(), "web_capture_" + System.currentTimeMillis() + ".jpg");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            this.pendingWebCaptureFile = file;
            return FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", file);
        } catch (Exception e6) {
            Log.e("WebViewActivity", "File provider setup failed for <input capture>", e6);
            this.pendingWebCaptureFile = null;
            return null;
        }
    }

    private final String readConfigJson(Context context) throws IOException {
        try {
            InputStream inputStreamOpen = context.getAssets().open("www/runtime.cache");
            try {
                ConfigCrypto configCrypto = ConfigCrypto.INSTANCE;
                kotlin.jvm.internal.j.b(inputStreamOpen);
                byte[] bArrDecryptConfig = configCrypto.decryptConfig(inputStreamOpen);
                androidx.activity.c0.d(inputStreamOpen, null);
                return new String(bArrDecryptConfig, x5.a.f15157a);
            } finally {
            }
        } catch (Exception unused) {
            InputStream inputStreamOpen2 = context.getAssets().open("www/config.json");
            kotlin.jvm.internal.j.d("open(...)", inputStreamOpen2);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen2, x5.a.f15157a), 8192);
            try {
                String strC = j3.b.c(bufferedReader);
                bufferedReader.close();
                return strC;
            } finally {
            }
        }
    }

    public static /* synthetic */ String readConfigJson$default(WebViewActivity webViewActivity, Context context, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            context = webViewActivity;
        }
        return webViewActivity.readConfigJson(context);
    }

    private final DisplayConfig readDisplayConfig() {
        try {
            JSONObject jSONObject = new JSONObject(readConfigJson$default(this, null, 1, null));
            String strOptString = jSONObject.optString("mode", "local");
            kotlin.jvm.internal.j.d("optString(...)", strOptString);
            String strOptString2 = jSONObject.optString("url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            kotlin.jvm.internal.j.d("optString(...)", strOptString2);
            boolean zOptBoolean = jSONObject.optBoolean("showHeader", true);
            boolean zOptBoolean2 = jSONObject.optBoolean("showActionBar", false);
            boolean zOptBoolean3 = jSONObject.optBoolean("keepScreenOn", false);
            boolean zOptBoolean4 = jSONObject.optBoolean("showCameraCutout", false);
            boolean zOptBoolean5 = jSONObject.optBoolean("desktopMode", false);
            boolean zOptBoolean6 = jSONObject.optBoolean("pullToRefresh", true);
            boolean zOptBoolean7 = jSONObject.optBoolean("noInternetDialog", true);
            boolean zOptBoolean8 = jSONObject.optBoolean("loadingIndicator", false);
            boolean zOptBoolean9 = jSONObject.optBoolean("backHistoryNavigation", true);
            boolean zOptBoolean10 = jSONObject.optBoolean("exitConfirmationDialog", false);
            boolean zOptBoolean11 = jSONObject.optBoolean("bridgeOwnOriginOnly", true);
            String strOptString3 = jSONObject.optString("orientation", "portrait");
            kotlin.jvm.internal.j.d("optString(...)", strOptString3);
            String strOptString4 = jSONObject.optString("primaryColor", "#00E5CC");
            kotlin.jvm.internal.j.d("optString(...)", strOptString4);
            boolean zOptBoolean12 = jSONObject.optBoolean("hasSplash", false);
            String strOptString5 = jSONObject.optString("splashBgColor", "#0F1318");
            kotlin.jvm.internal.j.d("optString(...)", strOptString5);
            boolean zOptBoolean13 = jSONObject.optBoolean("splashFadeOut", true);
            String strOptString6 = jSONObject.optString("splashLoaderStyle", "circle");
            kotlin.jvm.internal.j.d("optString(...)", strOptString6);
            int iOptInt = jSONObject.optInt("splashIconSize", 120);
            int iOptInt2 = jSONObject.optInt("splashIconRadius", 16);
            int iOptInt3 = jSONObject.optInt("splashLoaderSize", 48);
            int iOptInt4 = jSONObject.optInt("splashSpacing", 28);
            int iOptInt5 = jSONObject.optInt("splashDuration", 2);
            int iOptInt6 = jSONObject.optInt("splashLoaderThickness", 4);
            int iOptInt7 = jSONObject.optInt("splashFadeDuration", 400);
            String strOptString7 = jSONObject.optString("splashLoaderColor", "#00E5CC");
            kotlin.jvm.internal.j.d("optString(...)", strOptString7);
            boolean zOptBoolean14 = jSONObject.optBoolean("splashFullScreen", false);
            boolean zOptBoolean15 = jSONObject.optBoolean("splashHideLoader", false);
            String strOptString8 = jSONObject.optString("colorMode", "auto");
            kotlin.jvm.internal.j.d("optString(...)", strOptString8);
            String strOptString9 = jSONObject.optString("webBackgroundColor", "#000000");
            kotlin.jvm.internal.j.d("optString(...)", strOptString9);
            String strOptString10 = jSONObject.optString("statusBarColor", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            kotlin.jvm.internal.j.d("optString(...)", strOptString10);
            int iP = u5.d.p(jSONObject.optInt("statusBarAlpha", 100), 0, 100);
            String strOptString11 = jSONObject.optString("statusBarIcons", "auto");
            kotlin.jvm.internal.j.d("optString(...)", strOptString11);
            String strOptString12 = jSONObject.optString("navBarColor", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            kotlin.jvm.internal.j.d("optString(...)", strOptString12);
            int iP2 = u5.d.p(jSONObject.optInt("navBarAlpha", 100), 0, 100);
            String strOptString13 = jSONObject.optString("navBarIcons", "auto");
            kotlin.jvm.internal.j.d("optString(...)", strOptString13);
            boolean zOptBoolean16 = jSONObject.optBoolean("showWatermark", false);
            boolean zOptBoolean17 = jSONObject.optBoolean("isPro", false);
            List<String> permissions = parsePermissions(jSONObject.optJSONArray("permissions"));
            WebViewSettings webViewSettings = parseWebViewSettings(jSONObject.optJSONObject("webViewSettings"));
            Integer numValueOf = Integer.valueOf(jSONObject.optInt("admobChildDirectedTreatment", -1));
            int iIntValue = numValueOf.intValue();
            if (-1 > iIntValue || iIntValue >= 2) {
                numValueOf = null;
            }
            int iIntValue2 = numValueOf != null ? numValueOf.intValue() : -1;
            Integer numValueOf2 = Integer.valueOf(jSONObject.optInt("admobUnderAgeOfConsent", -1));
            int i6 = iIntValue2;
            int iIntValue3 = numValueOf2.intValue();
            if (-1 > iIntValue3 || iIntValue3 >= 2) {
                numValueOf2 = null;
            }
            int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : -1;
            String strOptString14 = jSONObject.optString("admobMaxAdContentRating", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            if (!e5.l.c(RequestConfiguration.MAX_AD_CONTENT_RATING_G, RequestConfiguration.MAX_AD_CONTENT_RATING_PG, RequestConfiguration.MAX_AD_CONTENT_RATING_T, RequestConfiguration.MAX_AD_CONTENT_RATING_MA).contains(strOptString14)) {
                strOptString14 = null;
            }
            if (strOptString14 == null) {
                strOptString14 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            boolean z6 = jSONObject.optBoolean("admobUseTestAds", false) && jSONObject.optBoolean("umpDebugEnabled", false);
            String strOptString15 = jSONObject.optString("umpDebugGeography", "DISABLED");
            kotlin.jvm.internal.j.d("optString(...)", strOptString15);
            List<String> testDeviceIds = parseTestDeviceIds(jSONObject.optJSONArray("umpTestDeviceIds"));
            boolean zOptBoolean18 = jSONObject.optBoolean("admobEnabled", false);
            String strOptString16 = jSONObject.optString("admobAppId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            kotlin.jvm.internal.j.d("optString(...)", strOptString16);
            String strOptString17 = jSONObject.optString("admobBannerUnitId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            kotlin.jvm.internal.j.d("optString(...)", strOptString17);
            String strOptString18 = jSONObject.optString("admobInterstitialUnitId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            kotlin.jvm.internal.j.d("optString(...)", strOptString18);
            String str = strOptString14;
            String strOptString19 = jSONObject.optString("admobRewardedUnitId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            kotlin.jvm.internal.j.d("optString(...)", strOptString19);
            String strOptString20 = jSONObject.optString("admobBannerPosition", "bottom");
            kotlin.jvm.internal.j.d("optString(...)", strOptString20);
            boolean zOptBoolean19 = jSONObject.optBoolean("admobShowBannerOnStart", false);
            List<String> testDeviceIds2 = parseTestDeviceIds(jSONObject.optJSONArray("admobTestDeviceIds"));
            boolean zOptBoolean20 = jSONObject.optBoolean("admobAutoLoadInterstitial", false);
            boolean zOptBoolean21 = jSONObject.optBoolean("admobAutoLoadRewarded", false);
            boolean zOptBoolean22 = jSONObject.optBoolean("admobUseTestAds", false);
            boolean zOptBoolean23 = jSONObject.optBoolean("admobBannerEnabled", false);
            boolean zOptBoolean24 = jSONObject.optBoolean("admobInterstitialEnabled", false);
            boolean zOptBoolean25 = jSONObject.optBoolean("admobRewardedEnabled", false);
            int iOptInt8 = jSONObject.optInt("admobInterstitialIntervalSeconds", 0);
            int iOptInt9 = jSONObject.optInt("admobInterstitialPageCount", 0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pdfReader");
            String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
            return new DisplayConfig(strOptString, strOptString2, zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, zOptBoolean9, zOptBoolean10, zOptBoolean11, strOptString3, strOptString4, zOptBoolean12, strOptString5, zOptBoolean13, strOptString6, iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt5, iOptInt6, iOptInt7, strOptString7, zOptBoolean14, zOptBoolean15, strOptString8, strOptString9, strOptString10, iP, strOptString11, strOptString12, iP2, strOptString13, zOptBoolean16, zOptBoolean17, permissions, webViewSettings, i6, iIntValue4, str, z6, strOptString15, testDeviceIds, zOptBoolean18, strOptString16, strOptString17, strOptString18, strOptString19, strOptString20, zOptBoolean19, testDeviceIds2, zOptBoolean20, zOptBoolean21, zOptBoolean22, zOptBoolean23, zOptBoolean24, zOptBoolean25, iOptInt8, iOptInt9, string == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : string);
        } catch (Exception unused) {
            return new DisplayConfig(null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, 0, 0, 0, 0, 0, 0, 0, null, false, false, null, null, null, 0, null, null, 0, null, false, false, null, null, 0, 0, null, false, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, null, -1, -1, null);
        }
    }

    private final UriReadResult readUriContentResult(Uri uri) throws IOException {
        String path;
        try {
            String scheme = uri.getScheme();
            InputStream fileInputStream = null;
            if (scheme != null) {
                int iHashCode = scheme.hashCode();
                if (iHashCode != 3143036) {
                    if (iHashCode == 951530617 && scheme.equals("content")) {
                        fileInputStream = getContentResolver().openInputStream(uri);
                    }
                } else if (scheme.equals("file") && (path = uri.getPath()) != null) {
                    fileInputStream = new FileInputStream(new File(path));
                }
            }
            if (fileInputStream == null) {
                return new UriReadResult.Error("unreadable_uri");
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[65536];
                while (true) {
                    int i6 = fileInputStream.read(bArr);
                    if (i6 <= 0) {
                        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                        kotlin.jvm.internal.j.d("encodeToString(...)", strEncodeToString);
                        UriReadResult.Content content = new UriReadResult.Content(strEncodeToString);
                        fileInputStream.close();
                        return content;
                    }
                    if (byteArrayOutputStream.size() + i6 > AndroidAPI.MAX_BASE64_FILE_BYTES) {
                        UriReadResult.Error error = new UriReadResult.Error("file_too_large");
                        fileInputStream.close();
                        return error;
                    }
                    byteArrayOutputStream.write(bArr, 0, i6);
                }
            } finally {
            }
        } catch (Exception e6) {
            Log.e("WebViewActivity", "readUriContentResult failed", e6);
            String message = e6.getMessage();
            if (message == null) {
                message = "read_failed";
            }
            return new UriReadResult.Error(message);
        }
    }

    private final void requestLaunchPermissions(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String runtimePermission = toRuntimePermission((String) it.next());
            if (runtimePermission != null) {
                arrayList.add(runtimePermission);
            }
        }
        List listF = e5.q.f(arrayList);
        if (listF.isEmpty()) {
            return;
        }
        this.launchPermissionsLauncher.a(listF.toArray(new String[0]));
    }

    private final int resolveBarColor(String str, boolean z6) {
        Integer barColor = parseBarColor(str);
        if (barColor != null) {
            return barColor.intValue();
        }
        if (!z6) {
            return -16777216;
        }
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (!displayConfig.getShowActionBar()) {
            return -16777216;
        }
        DisplayConfig displayConfig2 = this.displayConfig;
        if (displayConfig2 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        Integer barColor2 = parseBarColor(displayConfig2.getPrimaryColor());
        if (barColor2 != null) {
            return barColor2.intValue();
        }
        return -16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveBytesToDownloads$lambda$101(WebViewActivity webViewActivity, String str) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI == null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
        androidAPI.onDownloadResult(str, true, null);
        Toast.makeText(webViewActivity, webViewActivity.getString(R.string.download_completed, str), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveBytesToDownloads$lambda$102(WebViewActivity webViewActivity, String str) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI == null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
        androidAPI.onDownloadResult(str, true, "saved_to_app_storage");
        Toast.makeText(webViewActivity, webViewActivity.getString(R.string.download_completed, str), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveBytesToDownloads$lambda$103(WebViewActivity webViewActivity, String str, Exception exc, Exception exc2) throws JSONException {
        AndroidAPI androidAPI = webViewActivity.androidApi;
        if (androidAPI == null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
        String message = exc.getMessage();
        if (message == null && (message = exc2.getMessage()) == null) {
            message = "save_failed";
        }
        androidAPI.onDownloadResult(str, false, message);
        int i6 = R.string.download_failed;
        String message2 = exc2.getMessage();
        if (message2 == null) {
            message2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        Toast.makeText(webViewActivity, webViewActivity.getString(i6, message2), 0).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0254 A[Catch: Exception -> 0x017a, TryCatch #12 {Exception -> 0x017a, blocks: (B:96:0x016d, B:99:0x0175, B:102:0x017f, B:104:0x0183, B:107:0x0189, B:158:0x0248, B:160:0x0254, B:161:0x0259, B:118:0x01a9, B:120:0x01b1, B:121:0x01b5, B:125:0x01c6, B:90:0x0160, B:128:0x01ce, B:129:0x01d3, B:135:0x01e7, B:137:0x01ef, B:138:0x01f3, B:140:0x020b, B:141:0x0213, B:166:0x0274, B:167:0x0275, B:168:0x027a, B:169:0x027b, B:170:0x0280, B:171:0x0281, B:172:0x0286, B:173:0x0287, B:174:0x028e, B:177:0x0293, B:178:0x029a, B:179:0x029b, B:180:0x02a2, B:61:0x0119, B:72:0x013f, B:88:0x015c, B:89:0x015f, B:86:0x015a), top: B:240:0x00c1, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0314  */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setupSplash() throws Throwable {
        ?? splashFullScreen;
        ?? r02;
        int color;
        int color2;
        InputStream inputStreamOpen;
        Runnable runnable;
        int i6;
        InputStream inputStreamOpen2;
        Drawable drawableCreateFromStream;
        ImageView imageView;
        DisplayConfig displayConfig;
        DisplayConfig displayConfig2;
        Throwable th;
        ImageView imageView2;
        DisplayConfig displayConfig3 = this.displayConfig;
        if (displayConfig3 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (!displayConfig3.getHasSplash()) {
            View viewFindViewById = findViewById(R.id.splash_container);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            ImageView imageView3 = this.splashView;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.g("splashView");
                throw null;
            }
        }
        this.splashStartTime = System.currentTimeMillis();
        if (this.displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        long jP = 1000 * u5.d.p(r0.getSplashDuration(), 1, 15);
        ?? FindViewById = findViewById(R.id.splash_container);
        ImageView imageView4 = (ImageView) findViewById(R.id.splash_icon_view);
        View viewFindViewById2 = findViewById(R.id.splash_spacing_view);
        ImageView imageView5 = (ImageView) findViewById(R.id.splash_loader_circle);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.splash_loader_bar);
        if (FindViewById != 0) {
            try {
                if (imageView4 != null) {
                    try {
                        displayConfig2 = this.displayConfig;
                    } catch (Exception unused) {
                        color = Color.parseColor("#0F1318");
                    }
                    if (displayConfig2 == null) {
                        kotlin.jvm.internal.j.g("displayConfig");
                        throw null;
                    }
                    color = Color.parseColor(displayConfig2.getSplashBgColor());
                    FindViewById.setBackgroundColor(color);
                    try {
                        try {
                            displayConfig = this.displayConfig;
                        } catch (Exception unused2) {
                            color2 = Color.parseColor("#00E5CC");
                        }
                    } catch (Exception unused3) {
                        DisplayConfig displayConfig4 = this.displayConfig;
                        if (displayConfig4 == null) {
                            kotlin.jvm.internal.j.g("displayConfig");
                            throw null;
                        }
                        color2 = Color.parseColor(displayConfig4.getPrimaryColor());
                    }
                    if (displayConfig == null) {
                        kotlin.jvm.internal.j.g("displayConfig");
                        throw null;
                    }
                    color2 = Color.parseColor(displayConfig.getSplashLoaderColor());
                    float f6 = getResources().getDisplayMetrics().density;
                    try {
                        if (this.displayConfig == null) {
                            kotlin.jvm.internal.j.g("displayConfig");
                            throw null;
                        }
                        int splashIconSize = (int) (r15.getSplashIconSize() * f6);
                        try {
                            if (this.displayConfig == null) {
                                kotlin.jvm.internal.j.g("displayConfig");
                                throw null;
                            }
                            final float splashIconRadius = r8.getSplashIconRadius() * f6;
                            try {
                                if (this.displayConfig == null) {
                                    kotlin.jvm.internal.j.g("displayConfig");
                                    throw null;
                                }
                                int splashSpacing = (int) (r10.getSplashSpacing() * f6);
                                if (this.displayConfig == null) {
                                    kotlin.jvm.internal.j.g("displayConfig");
                                    throw null;
                                }
                                int splashLoaderSize = (int) (r2.getSplashLoaderSize() * f6);
                                if (this.displayConfig == null) {
                                    kotlin.jvm.internal.j.g("displayConfig");
                                    throw null;
                                }
                                int i7 = color2;
                                int iP = (int) (u5.d.p(r2.getSplashLoaderThickness(), 2, 24) * f6);
                                DisplayConfig displayConfig5 = this.displayConfig;
                                if (displayConfig5 == null) {
                                    kotlin.jvm.internal.j.g("displayConfig");
                                    throw null;
                                }
                                splashFullScreen = displayConfig5.getSplashFullScreen();
                                try {
                                    if (splashFullScreen != 0) {
                                        imageView4.setVisibility(8);
                                        if (viewFindViewById2 != null) {
                                            viewFindViewById2.setVisibility(8);
                                        }
                                        try {
                                            inputStreamOpen2 = getAssets().open("www/splash.png");
                                            try {
                                                drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen2, null);
                                                imageView = this.splashView;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (Exception unused4) {
                                            ImageView imageView6 = this.splashView;
                                            if (imageView6 == null) {
                                                kotlin.jvm.internal.j.g("splashView");
                                                throw null;
                                            }
                                            splashFullScreen = 8;
                                            try {
                                                imageView6.setVisibility(8);
                                            } catch (Exception unused5) {
                                                FindViewById.setVisibility(splashFullScreen);
                                                r02 = this.splashView;
                                                if (r02 == 0) {
                                                }
                                            }
                                        }
                                        if (imageView == null) {
                                            kotlin.jvm.internal.j.g("splashView");
                                            throw null;
                                        }
                                        imageView.setImageDrawable(drawableCreateFromStream);
                                        ImageView imageView7 = this.splashView;
                                        if (imageView7 == null) {
                                            kotlin.jvm.internal.j.g("splashView");
                                            throw null;
                                        }
                                        imageView7.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        ImageView imageView8 = this.splashView;
                                        if (imageView8 == null) {
                                            kotlin.jvm.internal.j.g("splashView");
                                            throw null;
                                        }
                                        try {
                                            imageView8.setVisibility(0);
                                            androidx.activity.c0.d(inputStreamOpen2, null);
                                            DisplayConfig displayConfig6 = this.displayConfig;
                                            if (displayConfig6 == null) {
                                                kotlin.jvm.internal.j.g("displayConfig");
                                                throw null;
                                            }
                                            if (displayConfig6.getSplashHideLoader()) {
                                                Drawable drawable = imageView5 != null ? imageView5.getDrawable() : null;
                                                CircularProgressDrawable circularProgressDrawable = drawable instanceof CircularProgressDrawable ? (CircularProgressDrawable) drawable : null;
                                                if (circularProgressDrawable != null) {
                                                    circularProgressDrawable.stop();
                                                }
                                                if (imageView5 != null) {
                                                    i6 = 8;
                                                    imageView5.setVisibility(8);
                                                } else {
                                                    i6 = 8;
                                                }
                                                if (progressBar != null) {
                                                    progressBar.setVisibility(i6);
                                                }
                                                View viewFindViewById3 = findViewById(R.id.splash_content);
                                                if (viewFindViewById3 != null) {
                                                    viewFindViewById3.setVisibility(i6);
                                                }
                                            } else {
                                                View viewFindViewById4 = findViewById(R.id.splash_content);
                                                if (viewFindViewById4 != null) {
                                                    viewFindViewById4.setVisibility(0);
                                                }
                                                setupSplash$configureLoader(this, imageView5, progressBar, splashLoaderSize, iP, i7, viewFindViewById2);
                                            }
                                            FindViewById.setVisibility(0);
                                            FindViewById.setAlpha(1.0f);
                                            runnable = this.splashDismissRunnable;
                                            if (runnable != null) {
                                                this.splashHandler.removeCallbacks(runnable);
                                            }
                                            androidx.camera.lifecycle.a aVar = new androidx.camera.lifecycle.a(3, this);
                                            this.splashDismissRunnable = aVar;
                                            this.splashHandler.postDelayed(aVar, Math.max(jP, 10000L));
                                            return;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Throwable th4 = th;
                                            try {
                                                throw th4;
                                            } catch (Throwable th5) {
                                                androidx.activity.c0.d(inputStreamOpen2, th4);
                                                throw th5;
                                            }
                                        }
                                    }
                                    splashFullScreen = splashLoaderSize;
                                    ImageView imageView9 = this.splashView;
                                    if (imageView9 == null) {
                                        kotlin.jvm.internal.j.g("splashView");
                                        throw null;
                                    }
                                    try {
                                        imageView9.setVisibility(8);
                                        View viewFindViewById5 = findViewById(R.id.splash_content);
                                        if (viewFindViewById5 != null) {
                                            viewFindViewById5.setVisibility(0);
                                        }
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(splashIconSize, splashIconSize);
                                        layoutParams.gravity = 1;
                                        imageView4.setLayoutParams(layoutParams);
                                        imageView4.setOutlineProvider(new ViewOutlineProvider() { // from class: com.htmltoapk.template.WebViewActivity.setupSplash.5
                                            @Override // android.view.ViewOutlineProvider
                                            public void getOutline(View view, Outline outline) {
                                                kotlin.jvm.internal.j.e("view", view);
                                                kotlin.jvm.internal.j.e("outline", outline);
                                                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), splashIconRadius);
                                            }
                                        });
                                        imageView4.setClipToOutline(true);
                                        if (viewFindViewById2 != null) {
                                            viewFindViewById2.setLayoutParams(new LinearLayout.LayoutParams(1, splashSpacing));
                                        }
                                        setupSplash$configureLoader(this, imageView5, progressBar, splashFullScreen, iP, i7, viewFindViewById2);
                                        try {
                                            inputStreamOpen = getAssets().open("www/splash.png");
                                        } catch (Exception unused6) {
                                            imageView4.setVisibility(8);
                                            if (viewFindViewById2 != null) {
                                                viewFindViewById2.setVisibility(8);
                                            }
                                        }
                                        try {
                                            imageView4.setImageDrawable(Drawable.createFromStream(inputStreamOpen, null));
                                            imageView4.setVisibility(0);
                                            androidx.activity.c0.d(inputStreamOpen, null);
                                            FindViewById.setVisibility(0);
                                            FindViewById.setAlpha(1.0f);
                                            runnable = this.splashDismissRunnable;
                                            if (runnable != null) {
                                            }
                                            androidx.camera.lifecycle.a aVar2 = new androidx.camera.lifecycle.a(3, this);
                                            this.splashDismissRunnable = aVar2;
                                            this.splashHandler.postDelayed(aVar2, Math.max(jP, 10000L));
                                            return;
                                        } finally {
                                        }
                                    } catch (Exception unused7) {
                                        splashFullScreen = 8;
                                        FindViewById.setVisibility(splashFullScreen);
                                        r02 = this.splashView;
                                        if (r02 == 0) {
                                        }
                                    }
                                } catch (Exception unused8) {
                                    FindViewById.setVisibility(splashFullScreen);
                                    r02 = this.splashView;
                                    if (r02 == 0) {
                                    }
                                }
                            } catch (Exception unused9) {
                                splashFullScreen = 8;
                                FindViewById.setVisibility(splashFullScreen);
                                r02 = this.splashView;
                                if (r02 == 0) {
                                }
                            }
                        } catch (Exception unused10) {
                            splashFullScreen = 8;
                            FindViewById.setVisibility(splashFullScreen);
                            r02 = this.splashView;
                            if (r02 == 0) {
                                r02.setVisibility(splashFullScreen);
                                return;
                            } else {
                                kotlin.jvm.internal.j.g("splashView");
                                throw null;
                            }
                        }
                    } catch (Exception unused11) {
                        splashFullScreen = 8;
                        FindViewById.setVisibility(splashFullScreen);
                        r02 = this.splashView;
                        if (r02 == 0) {
                        }
                    }
                }
            } catch (Exception unused12) {
            }
        }
        try {
            ImageView imageView10 = this.splashView;
            try {
                try {
                    if (imageView10 == null) {
                        kotlin.jvm.internal.j.g("splashView");
                        throw null;
                    }
                    imageView10.setImageDrawable(null);
                    InputStream inputStreamOpen3 = getAssets().open("www/splash.png");
                    kotlin.jvm.internal.j.d("open(...)", inputStreamOpen3);
                    Drawable drawableCreateFromStream2 = Drawable.createFromStream(inputStreamOpen3, null);
                    ImageView imageView11 = this.splashView;
                    if (imageView11 == null) {
                        kotlin.jvm.internal.j.g("splashView");
                        throw null;
                    }
                    imageView11.setImageDrawable(drawableCreateFromStream2);
                    ImageView imageView12 = this.splashView;
                    if (imageView12 == null) {
                        kotlin.jvm.internal.j.g("splashView");
                        throw null;
                    }
                    imageView12.setVisibility(0);
                    Runnable runnable2 = this.splashDismissRunnable;
                    if (runnable2 != null) {
                        this.splashHandler.removeCallbacks(runnable2);
                    }
                    j1 j1Var = new j1(this, 0);
                    this.splashDismissRunnable = j1Var;
                    this.splashHandler.postDelayed(j1Var, jP);
                } catch (Exception unused13) {
                    imageView2 = this.splashView;
                    if (imageView2 == null) {
                        imageView2.setVisibility(8);
                    } else {
                        kotlin.jvm.internal.j.g("splashView");
                        throw th;
                    }
                }
            } catch (Exception unused14) {
                th = null;
                imageView2 = this.splashView;
                if (imageView2 == null) {
                }
            }
        } catch (Exception unused15) {
            th = null;
        }
    }

    private static final void setupSplash$configureLoader(WebViewActivity webViewActivity, ImageView imageView, ProgressBar progressBar, int i6, int i7, int i8, View view) {
        CircularProgressDrawable circularProgressDrawable;
        DisplayConfig displayConfig = webViewActivity.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        String splashLoaderStyle = displayConfig.getSplashLoaderStyle();
        if (kotlin.jvm.internal.j.a(splashLoaderStyle, "bar")) {
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            circularProgressDrawable = drawable instanceof CircularProgressDrawable ? (CircularProgressDrawable) drawable : null;
            if (circularProgressDrawable != null) {
                circularProgressDrawable.stop();
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            if (progressBar != null) {
                int i9 = (int) (i6 * 2.5f);
                if (i7 < 2) {
                    i7 = 2;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i9, i7);
                layoutParams.gravity = 1;
                progressBar.setLayoutParams(layoutParams);
            }
            if (progressBar != null) {
                progressBar.setIndeterminateTintList(ColorStateList.valueOf(i8));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.j.a(splashLoaderStyle, "none")) {
            Drawable drawable2 = imageView != null ? imageView.getDrawable() : null;
            circularProgressDrawable = drawable2 instanceof CircularProgressDrawable ? (CircularProgressDrawable) drawable2 : null;
            if (circularProgressDrawable != null) {
                circularProgressDrawable.stop();
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (imageView != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
            layoutParams2.gravity = 1;
            imageView.setLayoutParams(layoutParams2);
        }
        float f6 = i6;
        float fO = u5.d.o(i7, 2.0f, f6 / 3.0f);
        float fMax = Math.max(4.0f, ((f6 / 2.0f) - fO) - 4.0f);
        CircularProgressDrawable circularProgressDrawable2 = new CircularProgressDrawable(webViewActivity);
        circularProgressDrawable2.setStrokeWidth(fO);
        circularProgressDrawable2.setCenterRadius(fMax);
        circularProgressDrawable2.setColorSchemeColors(i8);
        circularProgressDrawable2.start();
        if (imageView != null) {
            imageView.setImageDrawable(circularProgressDrawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSplash$lambda$111(WebViewActivity webViewActivity) {
        webViewActivity.hideSplash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNoInternetDialog() {
        Dialog dialog = this.noInternetDialog;
        if ((dialog != null && dialog.isShowing()) || isFinishing() || isDestroyed()) {
            return;
        }
        this.noInternetDialog = IosDialogHelper.INSTANCE.showNoInternet(this, new z0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5.j showNoInternetDialog$lambda$58(WebViewActivity webViewActivity) {
        String url;
        if (webViewActivity.isNetworkConnected()) {
            Dialog dialog = webViewActivity.noInternetDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
            webViewActivity.noInternetDialog = null;
            webViewActivity.lastPageLoadFailed = false;
            DisplayConfig displayConfig = webViewActivity.displayConfig;
            if (displayConfig == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            if (kotlin.jvm.internal.j.a(displayConfig.getMode(), "url")) {
                DisplayConfig displayConfig2 = webViewActivity.displayConfig;
                if (displayConfig2 == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw null;
                }
                url = displayConfig2.getUrl();
            } else {
                url = "https://appassets.androidplatform.net/assets/www/index.html";
            }
            webViewActivity.getWebView().loadUrl(url);
        } else {
            Toast.makeText(webViewActivity, R.string.ios_dialog_no_internet_title, 0).show();
        }
        return d5.j.f12745a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void startCameraPreview$lambda$81(c5.a aVar, WebViewActivity webViewActivity) throws JSONException {
        try {
            ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) aVar.get();
            Preview previewBuild = new Preview.Builder().build();
            PreviewView previewView = webViewActivity.previewView;
            if (previewView == null) {
                kotlin.jvm.internal.j.g("previewView");
                throw null;
            }
            previewBuild.setSurfaceProvider(previewView.getSurfaceProvider());
            CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
            kotlin.jvm.internal.j.d("DEFAULT_BACK_CAMERA", cameraSelector);
            processCameraProvider.unbindAll();
            processCameraProvider.bindToLifecycle(webViewActivity, cameraSelector, previewBuild);
            AndroidAPI androidAPI = webViewActivity.androidApi;
            if (androidAPI != null) {
                androidAPI.onCameraPreviewResult(true, true, null);
            } else {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
        } catch (Exception e6) {
            Log.e("WebViewActivity", "startCameraPreview failed", e6);
            PreviewView previewView2 = webViewActivity.previewView;
            if (previewView2 == null) {
                kotlin.jvm.internal.j.g("previewView");
                throw null;
            }
            previewView2.setVisibility(8);
            AndroidAPI androidAPI2 = webViewActivity.androidApi;
            if (androidAPI2 == null) {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
            String message = e6.getMessage();
            if (message == null) {
                message = "preview_failed";
            }
            androidAPI2.onCameraPreviewResult(false, false, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void takePictureLauncher$lambda$10(WebViewActivity webViewActivity, boolean z6) throws JSONException {
        String str = webViewActivity.pendingCameraCallbackId;
        File file = webViewActivity.pendingPhotoFile;
        webViewActivity.pendingCameraCallbackId = null;
        webViewActivity.pendingPhotoFile = null;
        if (str == null) {
            return;
        }
        if (!z6) {
            if (file != null) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            AndroidAPI androidAPI = webViewActivity.androidApi;
            if (androidAPI != null) {
                androidAPI.onCameraResult(str, false, null, "cancelled");
                return;
            } else {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
        }
        if (file != null && file.exists() && file.length() != 0) {
            webViewActivity.deliverPhotoFile(str, file);
            return;
        }
        AndroidAPI androidAPI2 = webViewActivity.androidApi;
        if (androidAPI2 != null) {
            androidAPI2.onCameraResult(str, false, null, "capture_file_missing");
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r4.equals("android.permission.WRITE_EXTERNAL_STORAGE") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r4.equals("android.permission.READ_EXTERNAL_STORAGE") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (android.os.Build.VERSION.SDK_INT > 28) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String toRuntimePermission(String str) {
        switch (str.hashCode()) {
            case -1925850455:
                if (str.equals("android.permission.POST_NOTIFICATIONS") && Build.VERSION.SDK_INT >= 33) {
                }
                break;
            case -1888586689:
                if (!str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                }
                break;
            case -406040016:
                break;
            case -63024214:
                if (!str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                }
                break;
            case -5573545:
                if (!str.equals("android.permission.READ_PHONE_STATE")) {
                }
                break;
            case 463403621:
                if (!str.equals("android.permission.CAMERA")) {
                }
                break;
            case 1365911975:
                break;
            case 1780337063:
                if (str.equals("android.permission.ACTIVITY_RECOGNITION") && Build.VERSION.SDK_INT >= 29) {
                }
                break;
            case 1831139720:
                if (!str.equals("android.permission.RECORD_AUDIO")) {
                }
                break;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unbindCamera(ProcessCameraProvider processCameraProvider) {
        if (processCameraProvider != null) {
            try {
                processCameraProvider.unbindAll();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBannerPadding$lambda$1(WebViewActivity webViewActivity) {
        View viewFindViewById = webViewActivity.findViewById(R.id.root_layout);
        if (viewFindViewById != null) {
            WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
            f0.c.c(viewFindViewById);
            return;
        }
        View viewFindViewById2 = webViewActivity.findViewById(R.id.main_content_container);
        if (viewFindViewById2 != null) {
            WeakHashMap<View, u0.n0> weakHashMap2 = u0.f0.f14480a;
            f0.c.c(viewFindViewById2);
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = webViewActivity.swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            if (swipeRefreshLayout == null) {
                kotlin.jvm.internal.j.g("swipeRefreshLayout");
                throw null;
            }
            WeakHashMap<View, u0.n0> weakHashMap3 = u0.f0.f14480a;
            f0.c.c(swipeRefreshLayout);
        }
    }

    private final void updateSystemBarsAppearance(boolean z6) {
        boolean zIsStatusBarScrimActive = isStatusBarScrimActive();
        boolean zIsNavBarScrimActive = isNavBarScrimActive();
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        int iResolveBarColor = resolveBarColor(displayConfig.getStatusBarColor(), true);
        DisplayConfig displayConfig2 = this.displayConfig;
        if (displayConfig2 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        int iResolveBarColor2 = resolveBarColor(displayConfig2.getNavBarColor(), false);
        DisplayConfig displayConfig3 = this.displayConfig;
        if (displayConfig3 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        boolean zBarShouldUseDarkIcons = barShouldUseDarkIcons(displayConfig3.getStatusBarIcons(), iResolveBarColor, zIsStatusBarScrimActive, z6);
        DisplayConfig displayConfig4 = this.displayConfig;
        if (displayConfig4 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        boolean zBarShouldUseDarkIcons2 = barShouldUseDarkIcons(displayConfig4.getNavBarIcons(), iResolveBarColor2, zIsNavBarScrimActive, z6);
        DisplayConfig displayConfig5 = this.displayConfig;
        if (displayConfig5 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        List listC = e5.l.c(Boolean.valueOf(displayConfig5.getShowHeader()), Boolean.valueOf(zBarShouldUseDarkIcons), Boolean.valueOf(zBarShouldUseDarkIcons2));
        if (listC.equals(this.appliedBarsSignature)) {
            return;
        }
        this.appliedBarsSignature = listC;
        Window window = getWindow();
        u0.w wVar = new u0.w(getWindow().getDecorView());
        int i6 = Build.VERSION.SDK_INT;
        androidx.work.j x0Var = i6 >= 35 ? new u0.x0(window, wVar) : i6 >= 30 ? new u0.w0(window, wVar) : i6 >= 26 ? new u0.v0(window, wVar) : new u0.u0(window, wVar);
        x0Var.l(zBarShouldUseDarkIcons);
        x0Var.k(zBarShouldUseDarkIcons2);
        DisplayConfig displayConfig6 = this.displayConfig;
        if (displayConfig6 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig6.getShowHeader()) {
            return;
        }
        x0Var.h(3);
        x0Var.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:3:0x0002, B:6:0x0009, B:9:0x0015, B:11:0x0019, B:13:0x0023, B:15:0x0027, B:38:0x0062, B:42:0x006e, B:41:0x006a, B:16:0x002c, B:17:0x002f, B:18:0x0030, B:19:0x0033, B:20:0x0034, B:22:0x0038, B:24:0x003e, B:26:0x0042, B:28:0x004c, B:30:0x0050, B:31:0x0055, B:32:0x0058, B:33:0x0059, B:34:0x005c, B:43:0x0073, B:44:0x0076, B:45:0x0077, B:46:0x007a), top: B:60:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:3:0x0002, B:6:0x0009, B:9:0x0015, B:11:0x0019, B:13:0x0023, B:15:0x0027, B:38:0x0062, B:42:0x006e, B:41:0x006a, B:16:0x002c, B:17:0x002f, B:18:0x0030, B:19:0x0033, B:20:0x0034, B:22:0x0038, B:24:0x003e, B:26:0x0042, B:28:0x004c, B:30:0x0050, B:31:0x0055, B:32:0x0058, B:33:0x0059, B:34:0x005c, B:43:0x0073, B:44:0x0076, B:45:0x0077, B:46:0x007a), top: B:60:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateWebBackgroundColor(boolean z6) {
        int color;
        DisplayConfig displayConfig;
        try {
            displayConfig = this.displayConfig;
        } catch (Exception unused) {
            color = z6 ? -16777216 : -1;
        }
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        String splashBgColor = "#000000";
        if (x5.o.v(displayConfig.getWebBackgroundColor())) {
            DisplayConfig displayConfig2 = this.displayConfig;
            if (displayConfig2 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            if (displayConfig2.getHasSplash()) {
                DisplayConfig displayConfig3 = this.displayConfig;
                if (displayConfig3 == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw null;
                }
                if (!x5.o.v(displayConfig3.getSplashBgColor())) {
                    DisplayConfig displayConfig4 = this.displayConfig;
                    if (displayConfig4 == null) {
                        kotlin.jvm.internal.j.g("displayConfig");
                        throw null;
                    }
                    splashBgColor = displayConfig4.getSplashBgColor();
                }
                if (!x5.l.n(splashBgColor, "#", false)) {
                }
                color = Color.parseColor(splashBgColor);
            } else {
                if (!z6) {
                    splashBgColor = "#FFFFFF";
                }
                if (!x5.l.n(splashBgColor, "#", false)) {
                    splashBgColor = "#".concat(splashBgColor);
                }
                color = Color.parseColor(splashBgColor);
            }
        } else {
            DisplayConfig displayConfig5 = this.displayConfig;
            if (displayConfig5 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            if (!kotlin.jvm.internal.j.a(displayConfig5.getWebBackgroundColor(), "#000000")) {
                DisplayConfig displayConfig6 = this.displayConfig;
                if (displayConfig6 == null) {
                    kotlin.jvm.internal.j.g("displayConfig");
                    throw null;
                }
                splashBgColor = displayConfig6.getWebBackgroundColor();
            }
            if (!x5.l.n(splashBgColor, "#", false)) {
            }
            color = Color.parseColor(splashBgColor);
        }
        this.currentWebBgColor = color;
        if (this.webView != null) {
            getWebView().setBackgroundColor(this.currentWebBgColor);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setBackgroundColor(this.currentWebBgColor);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_content_container);
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(this.currentWebBgColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webPermissionLauncher$lambda$6(WebViewActivity webViewActivity, Map map) {
        kotlin.jvm.internal.j.e("results", map);
        final PermissionRequest permissionRequest = webViewActivity.pendingWebPermissionRequest;
        if (permissionRequest == null) {
            return;
        }
        webViewActivity.pendingWebPermissionRequest = null;
        String[] resources = permissionRequest.getResources();
        kotlin.jvm.internal.j.d("getResources(...)", resources);
        int length = resources.length;
        final boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z6 = true;
                break;
            }
            String str = resources[i6];
            if (!kotlin.jvm.internal.j.a(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                if (kotlin.jvm.internal.j.a(str, "android.webkit.resource.AUDIO_CAPTURE") && !kotlin.jvm.internal.j.a(map.get("android.permission.RECORD_AUDIO"), Boolean.TRUE) && k0.a.a(webViewActivity, "android.permission.RECORD_AUDIO") != 0) {
                    break;
                } else {
                    i6++;
                }
            } else if (!kotlin.jvm.internal.j.a(map.get("android.permission.CAMERA"), Boolean.TRUE) && k0.a.a(webViewActivity, "android.permission.CAMERA") != 0) {
                break;
            } else {
                i6++;
            }
        }
        webViewActivity.runOnUiThread(new Runnable() { // from class: com.htmltoapk.template.y0
            @Override // java.lang.Runnable
            public final void run() {
                WebViewActivity.webPermissionLauncher$lambda$6$lambda$5(z6, permissionRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webPermissionLauncher$lambda$6$lambda$5(boolean z6, PermissionRequest permissionRequest) {
        if (z6) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            permissionRequest.deny();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    @SuppressLint({"SetJavaScriptEnabled"})
    public void attachBaseContext(Context context) {
        Object objA;
        kotlin.jvm.internal.j.e("newBase", context);
        try {
            objA = new JSONObject(readConfigJson(context)).optString("colorMode", "auto");
        } catch (Throwable th) {
            objA = d5.e.a(th);
        }
        String str = (String) (objA instanceof d.a ? "auto" : objA);
        if (kotlin.jvm.internal.j.a(str, "dark") || kotlin.jvm.internal.j.a(str, "light")) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.uiMode = (kotlin.jvm.internal.j.a(str, "dark") ? 32 : 16) | (configuration.uiMode & (-49));
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
    }

    public final void captureFrontPhoto(final String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        final File file = new File(getCacheDir(), "capture_front_" + System.currentTimeMillis() + ".jpg");
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            final c5.a<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(this);
            companion.addListener(new Runnable() { // from class: com.htmltoapk.template.a1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    WebViewActivity.captureFrontPhoto$lambda$77(companion, this, file, str);
                }
            }, k0.a.c(this));
        } catch (Exception e6) {
            Log.e("WebViewActivity", "captureFrontPhoto failed", e6);
            try {
                file.delete();
            } catch (Throwable unused) {
            }
            AndroidAPI androidAPI = this.androidApi;
            if (androidAPI == null) {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
            String message = e6.getMessage();
            if (message == null) {
                message = "front_camera_unavailable";
            }
            androidAPI.onCameraResult(str, false, null, message);
        }
    }

    public final void capturePhoto(String str, boolean z6) throws JSONException, PackageManager.NameNotFoundException {
        kotlin.jvm.internal.j.e("callbackId", str);
        this.pendingCameraFront = z6;
        boolean z7 = k0.a.a(this, "android.permission.CAMERA") == 0;
        if (!z6) {
            if (!isCameraPermissionDeclared() || z7) {
                launchCameraIntent(str);
                return;
            }
            this.pendingCameraCallbackId = str;
            this.pendingPermission = "android.permission.CAMERA";
            this.permissionLauncher.a("android.permission.CAMERA");
            return;
        }
        if (z7) {
            captureFrontPhoto(str);
            return;
        }
        if (isCameraPermissionDeclared()) {
            this.pendingCameraCallbackId = str;
            this.pendingPermission = "android.permission.CAMERA";
            this.permissionLauncher.a("android.permission.CAMERA");
        } else {
            AndroidAPI androidAPI = this.androidApi;
            if (androidAPI != null) {
                androidAPI.onCameraResult(str, false, null, "camera_permission_not_declared");
            } else {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
        }
    }

    public final void createFile(String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.j.e("fileName", str);
        kotlin.jvm.internal.j.e("mimeType", str2);
        kotlin.jvm.internal.j.e("content", str3);
        kotlin.jvm.internal.j.e("callbackId", str4);
        this.pendingWriteCallbackId = str4;
        this.pendingWriteContent = str3;
        this.createDocumentLauncher.a(str);
    }

    public final void downloadDataUri(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("url", str);
        new Thread(new b1(str, this, str3, str2)).start();
    }

    public final String getLaunchDeepLink() {
        return this.launchDeepLink;
    }

    public final m0.b getSystemBarInsets() {
        WebView webView = this.webView;
        m0.b bVar = m0.b.f13853e;
        if (webView == null) {
            return bVar;
        }
        WebView webView2 = getWebView();
        WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
        u0.s0 s0VarA = f0.e.a(webView2);
        if (s0VarA == null) {
            return bVar;
        }
        m0.b bVarF = s0VarA.f14553a.f(647);
        kotlin.jvm.internal.j.d("getInsets(...)", bVarF);
        return bVarF;
    }

    public final int getTopActionBarHeight() {
        View view;
        m0.b bVarF;
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        int i6 = 0;
        if (!displayConfig.getShowActionBar() || (view = this.toolbar) == null || view.getVisibility() != 0) {
            return 0;
        }
        int height = view.getHeight();
        if (height > 0) {
            return height;
        }
        TypedValue typedValue = new TypedValue();
        int iComplexToDimensionPixelSize = getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics()) : (int) (56 * getResources().getDisplayMetrics().density);
        DisplayConfig displayConfig2 = this.displayConfig;
        if (displayConfig2 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig2.getShowHeader()) {
            WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
            u0.s0 s0VarA = f0.e.a(view);
            if (s0VarA != null && (bVarF = s0VarA.f14553a.f(1)) != null) {
                i6 = bVarF.f13855b;
            }
        }
        return iComplexToDimensionPixelSize + i6;
    }

    public final WebView getWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView;
        }
        kotlin.jvm.internal.j.g("webView");
        throw null;
    }

    public final boolean isTrustedPageShown$template_adsRelease() {
        BridgeGate bridgeGate = this.bridgeGate;
        if (bridgeGate == null) {
            return false;
        }
        if (bridgeGate != null) {
            return bridgeGate.isTrustedPage(getWebView().getUrl());
        }
        kotlin.jvm.internal.j.g("bridgeGate");
        throw null;
    }

    public final void launchCameraIntent(String str) throws JSONException {
        kotlin.jvm.internal.j.e("callbackId", str);
        try {
            File file = new File(getCacheDir(), "capture_" + System.currentTimeMillis() + ".jpg");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            this.pendingPhotoFile = file;
            this.pendingCameraCallbackId = str;
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", file);
            d.c<Uri> cVar = this.takePictureLauncher;
            kotlin.jvm.internal.j.b(uriForFile);
            cVar.a(uriForFile);
        } catch (ActivityNotFoundException e6) {
            Log.e("WebViewActivity", "capturePhoto: no camera application available", e6);
            this.pendingCameraCallbackId = null;
            this.pendingPhotoFile = null;
            AndroidAPI androidAPI = this.androidApi;
            if (androidAPI != null) {
                androidAPI.onCameraResult(str, false, null, "no_camera_app");
            } else {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
        } catch (Exception e7) {
            Log.e("WebViewActivity", "capturePhoto launch failed", e7);
            this.pendingCameraCallbackId = null;
            this.pendingPhotoFile = null;
            AndroidAPI androidAPI2 = this.androidApi;
            if (androidAPI2 == null) {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
            String message = e7.getMessage();
            if (message == null) {
                message = "launch_failed";
            }
            androidAPI2.onCameraResult(str, false, null, message);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.j.e("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        DisplayConfig displayConfig = this.displayConfig;
        if (displayConfig == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        String colorMode = displayConfig.getColorMode();
        boolean z6 = true;
        if (!kotlin.jvm.internal.j.a(colorMode, "dark") && (kotlin.jvm.internal.j.a(colorMode, "light") || (configuration.uiMode & 48) != 32)) {
            z6 = false;
        }
        applyDarkMode(z6);
        updateWebBackgroundColor(z6);
        updateSystemBarsAppearance(z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0526 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) throws Throwable {
        int i6;
        int i7;
        int i8;
        ?? r19;
        FrameLayout frameLayout;
        DisplayConfig displayConfig;
        TrustedOrigins trustedOriginsLocal;
        String str;
        String str2;
        AndroidAPI androidAPI;
        boolean z6;
        String url;
        Uri data;
        Object objA;
        JSONObject jSONObject;
        boolean z7;
        w2.n0 n0Var;
        Typeface typefaceA;
        Uri data2;
        int i9 = 1;
        requestWindowFeature(1);
        this.displayConfig = readDisplayConfig();
        List listC = e5.l.c("dark", "light");
        DisplayConfig displayConfig2 = this.displayConfig;
        if (displayConfig2 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (listC.contains(displayConfig2.getColorMode())) {
            DisplayConfig displayConfig3 = this.displayConfig;
            if (displayConfig3 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            setTheme(kotlin.jvm.internal.j.a(displayConfig3.getColorMode(), "dark") ? R.style.Theme_HTMLTemplate_Dark : R.style.Theme_HTMLTemplate_Light);
        }
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        int i10 = androidx.activity.s.f86a;
        androidx.activity.q0 q0Var = androidx.activity.q0.s;
        kotlin.jvm.internal.j.e("detectDarkMode", q0Var);
        androidx.activity.t0 t0Var = new androidx.activity.t0(0, 0, 0, q0Var);
        int i11 = androidx.activity.s.f86a;
        int i12 = androidx.activity.s.f87b;
        kotlin.jvm.internal.j.e("detectDarkMode", q0Var);
        androidx.activity.s.a(this, t0Var, new androidx.activity.t0(i11, i12, 0, q0Var));
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        this.cameraExecutor = Executors.newSingleThreadExecutor();
        int i14 = 2;
        new Thread(new k1(this, i14)).start();
        this.fileChooserLauncher = registerForActivityResult(new e.f(), new f1(this, i14));
        if (kotlin.jvm.internal.j.a(getIntent().getAction(), "android.intent.action.VIEW") && ((kotlin.jvm.internal.j.a(getIntent().getType(), "application/pdf") || PdfActivity.Companion.isPdf(getIntent().getData())) && (data2 = getIntent().getData()) != null)) {
            openPdf(data2);
        }
        DisplayConfig displayConfig4 = this.displayConfig;
        if (displayConfig4 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        String orientation = displayConfig4.getOrientation();
        int iHashCode = orientation.hashCode();
        if (iHashCode != 3005871) {
            if (iHashCode != 729267099) {
                i6 = (iHashCode == 1430647483 && orientation.equals("landscape")) ? 0 : -1;
            } else if (orientation.equals("portrait")) {
                i6 = 1;
            }
        } else if (orientation.equals("auto")) {
            i6 = 4;
        }
        if (i6 != -1) {
            setRequestedOrientation(i6);
        }
        this.configuredOrientation = i6;
        DisplayConfig displayConfig5 = this.displayConfig;
        if (displayConfig5 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig5.getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        DisplayConfig displayConfig6 = this.displayConfig;
        if (displayConfig6 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig6.getShowActionBar()) {
            i7 = 0;
        } else {
            DisplayConfig displayConfig7 = this.displayConfig;
            if (displayConfig7 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            if (displayConfig7.getShowCameraCutout()) {
                i7 = 1;
            }
        }
        if (i13 >= 30) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = i7 != 0 ? 3 : 0;
            getWindow().setAttributes(attributes);
        } else if (i13 >= 28) {
            WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
            attributes2.layoutInDisplayCutoutMode = i7;
            getWindow().setAttributes(attributes2);
        }
        u0.q0.a(getWindow(), false);
        setContentView(R.layout.activity_webview);
        View viewFindViewById = findViewById(R.id.toolbar);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.toolbar_title);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById2);
        TextView textView = (TextView) viewFindViewById2;
        this.toolbar = viewFindViewById;
        this.toolbarTitle = textView;
        DisplayConfig displayConfig8 = this.displayConfig;
        if (displayConfig8 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        if (displayConfig8.getShowActionBar()) {
            viewFindViewById.setVisibility(0);
            viewFindViewById.getLayoutParams().height = -2;
            textView.setText(getApplicationInfo().loadLabel(getPackageManager()));
            DisplayConfig displayConfig9 = this.displayConfig;
            if (displayConfig9 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw null;
            }
            applyPrimaryColor(displayConfig9.getPrimaryColor(), true);
        } else {
            viewFindViewById.setVisibility(8);
            viewFindViewById.getLayoutParams().height = 0;
            viewFindViewById.setPadding(0, 0, 0, 0);
        }
        boolean z8 = (getResources().getConfiguration().uiMode & 48) == 32;
        updateSystemBarsAppearance(z8);
        View viewFindViewById3 = findViewById(R.id.root_layout);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById3);
        FrameLayout frameLayout2 = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.main_content_container);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById4);
        this.statusBarScrim = findViewById(R.id.status_bar_scrim);
        this.navBarScrim = findViewById(R.id.nav_bar_scrim);
        this.swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        this.webView = (WebView) findViewById(R.id.webview);
        updateWebBackgroundColor(z8);
        this.progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.splashView = (ImageView) findViewById(R.id.splash_view);
        this.previewView = (PreviewView) findViewById(R.id.preview_view);
        View viewFindViewById5 = findViewById(R.id.watermark_view);
        kotlin.jvm.internal.j.d("findViewById(...)", viewFindViewById5);
        TextView textView2 = (TextView) viewFindViewById5;
        DisplayConfig displayConfig10 = this.displayConfig;
        if (displayConfig10 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw null;
        }
        textView2.setVisibility(displayConfig10.getShowWatermark() ? 0 : 8);
        try {
            int i15 = R.font.watermark_font;
            ThreadLocal<TypedValue> threadLocal = l0.f.f13795a;
            if (isRestricted()) {
                i8 = 32;
                typefaceA = null;
                r19 = 0;
                frameLayout = frameLayout2;
            } else {
                try {
                    r19 = 0;
                    i8 = 32;
                    frameLayout = frameLayout2;
                    try {
                        typefaceA = l0.f.a(this, i15, new TypedValue(), 0, null, false, false);
                        r19 = r19;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i8 = 32;
                    r19 = 0;
                    frameLayout = frameLayout2;
                    displayConfig = this.displayConfig;
                    if (displayConfig != null) {
                    }
                }
            }
            if (typefaceA != null) {
                textView2.setTypeface(typefaceA);
            }
        } catch (Exception unused3) {
            i8 = 32;
        }
        displayConfig = this.displayConfig;
        if (displayConfig != null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
        boolean zA = kotlin.jvm.internal.j.a(displayConfig.getMode(), "url");
        boolean z9 = !zA;
        String str3 = "swipeRefreshLayout";
        if (zA) {
            DisplayConfig displayConfig11 = this.displayConfig;
            if (displayConfig11 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw r19;
            }
            if (displayConfig11.getPullToRefresh()) {
                SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
                if (swipeRefreshLayout == null) {
                    kotlin.jvm.internal.j.g("swipeRefreshLayout");
                    throw r19;
                }
                swipeRefreshLayout.setEnabled(true);
                SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
                if (swipeRefreshLayout2 == null) {
                    kotlin.jvm.internal.j.g("swipeRefreshLayout");
                    throw r19;
                }
                swipeRefreshLayout2.setOnRefreshListener(new c1(this));
                SwipeRefreshLayout swipeRefreshLayout3 = this.swipeRefreshLayout;
                if (swipeRefreshLayout3 == null) {
                    kotlin.jvm.internal.j.g("swipeRefreshLayout");
                    throw r19;
                }
                swipeRefreshLayout3.setOnChildScrollUpCallback(new d1(this, i14));
            }
        } else {
            SwipeRefreshLayout swipeRefreshLayout4 = this.swipeRefreshLayout;
            if (swipeRefreshLayout4 == null) {
                kotlin.jvm.internal.j.g("swipeRefreshLayout");
                throw r19;
            }
            swipeRefreshLayout4.setEnabled(false);
        }
        DisplayConfig displayConfig12 = this.displayConfig;
        if (displayConfig12 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
        this.adMobBridge = new AdMobBridge(this, displayConfig12, this.jsEventEmitter);
        TrustedOrigins.Companion companion = TrustedOrigins.Companion;
        if (zA) {
            DisplayConfig displayConfig13 = this.displayConfig;
            if (displayConfig13 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw r19;
            }
            trustedOriginsLocal = companion.forUrl(displayConfig13.getUrl());
        } else {
            trustedOriginsLocal = companion.local();
        }
        TrustedOrigins trustedOrigins = trustedOriginsLocal;
        i1 i1Var = new i1();
        DisplayConfig displayConfig14 = this.displayConfig;
        if (displayConfig14 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
        this.bridgeGate = new BridgeGate(trustedOrigins, i1Var, displayConfig14.getBridgeOwnOriginOnly(), null, 8, null);
        DisplayConfig displayConfig15 = this.displayConfig;
        if (displayConfig15 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
        boolean zIsPro = displayConfig15.isPro();
        AdMobBridge adMobBridge = this.adMobBridge;
        if (adMobBridge == null) {
            kotlin.jvm.internal.j.g("adMobBridge");
            throw r19;
        }
        BridgeGate bridgeGate = this.bridgeGate;
        if (bridgeGate == null) {
            kotlin.jvm.internal.j.g("bridgeGate");
            throw r19;
        }
        this.androidApi = new AndroidAPI(this, zIsPro, adMobBridge, bridgeGate);
        e1 e1Var = new e1(this, i14);
        WeakHashMap<View, u0.n0> weakHashMap = u0.f0.f14480a;
        f0.d.k(frameLayout, e1Var);
        frameLayout.post(new e(i14, frameLayout));
        a1.a.a(getOnBackPressedDispatcher(), this, new f1(this, i9));
        DisplayConfig displayConfig16 = this.displayConfig;
        if (displayConfig16 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
        WebViewSettings webViewSettings = displayConfig16.getWebViewSettings();
        WebSettings settings = getWebView().getSettings();
        settings.setJavaScriptEnabled(webViewSettings.getJavaScriptEnabled());
        settings.setDomStorageEnabled(webViewSettings.getDomStorageEnabled());
        settings.setDatabaseEnabled(webViewSettings.getDomStorageEnabled());
        settings.setAllowFileAccess(!zA && webViewSettings.getAllowFileAccess());
        settings.setAllowContentAccess(!zA && webViewSettings.getAllowContentAccess());
        settings.setAllowUniversalAccessFromFileURLs(!zA && webViewSettings.getAllowUniversalAccessFromFileURLs());
        settings.setAllowFileAccessFromFileURLs(!zA && webViewSettings.getAllowFileAccessFromFileURLs());
        settings.setUseWideViewPort(webViewSettings.getUseWideViewPort());
        settings.setLoadWithOverviewMode(webViewSettings.getLoadWithOverviewMode());
        settings.setMixedContentMode(webViewSettings.getMixedContentMode());
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        DisplayConfig displayConfig17 = this.displayConfig;
        if (displayConfig17 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
        boolean desktopMode = displayConfig17.getDesktopMode();
        String str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (desktopMode) {
            String userAgentString = settings.getUserAgentString();
            if (userAgentString == null) {
                userAgentString = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            String string = x5.o.G(x5.l.m(x5.l.m(x5.l.m(userAgentString, "Mobile", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), "Android", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), "; wv", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)).toString();
            if (x5.o.v(string) || x5.o.o(string, "Linux; ;", false)) {
                string = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36";
            }
            settings.setUserAgentString(string);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
        }
        settings.setSupportZoom(webViewSettings.getBuiltInZoomControls());
        settings.setBuiltInZoomControls(webViewSettings.getBuiltInZoomControls());
        settings.setDisplayZoomControls(webViewSettings.getDisplayZoomControls());
        settings.setCacheMode(webViewSettings.getCacheMode());
        String userAgent = webViewSettings.getUserAgent();
        if (userAgent != null && !x5.o.v(userAgent)) {
            settings.setUserAgentString(webViewSettings.getUserAgent());
        }
        if (webViewSettings.getTextZoom() != 100) {
            settings.setTextZoom(webViewSettings.getTextZoom());
        }
        settings.setGeolocationEnabled(webViewSettings.getGeolocationEnabled() || isLocationPermissionDeclared());
        applyDarkMode((getResources().getConfiguration().uiMode & 48) == i8);
        String userAgentString2 = getWebView().getSettings().getUserAgentString();
        if (userAgentString2 == null) {
            userAgentString2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        this.cachedUserAgent = userAgentString2;
        BridgeGate bridgeGate2 = this.bridgeGate;
        if (bridgeGate2 == null) {
            kotlin.jvm.internal.j.g("bridgeGate");
            throw r19;
        }
        String str5 = "DOCUMENT_START_SCRIPT";
        if (bridgeGate2.getEnforced() && androidx.activity.c0.f("DOCUMENT_START_SCRIPT")) {
            try {
                WebView webView = getWebView();
                try {
                    BridgeGate bridgeGate3 = this.bridgeGate;
                    if (bridgeGate3 == null) {
                        kotlin.jvm.internal.j.g("bridgeGate");
                        throw r19;
                    }
                    String documentStartScript = bridgeGate3.getDocumentStartScript();
                    BridgeGate bridgeGate4 = this.bridgeGate;
                    if (bridgeGate4 == null) {
                        kotlin.jvm.internal.j.g("bridgeGate");
                        throw r19;
                    }
                    h2.c.a(webView, documentStartScript, bridgeGate4.getDocumentStartRules());
                    BridgeGate bridgeGate5 = this.bridgeGate;
                    if (bridgeGate5 == null) {
                        kotlin.jvm.internal.j.g("bridgeGate");
                        throw r19;
                    }
                    bridgeGate5.onDocumentStartScriptInstalled();
                } catch (Exception e6) {
                    e = e6;
                    Log.w("WebViewActivity", "Bridge gate script not installed, using main-frame check: " + e.getMessage());
                    if (androidx.activity.c0.f("DOCUMENT_START_SCRIPT")) {
                    }
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.setAcceptCookie(true);
                    cookieManager.setAcceptThirdPartyCookies(getWebView(), true);
                    if (zA) {
                    }
                    WebView webView2 = getWebView();
                    androidAPI = this.androidApi;
                    if (androidAPI != null) {
                    }
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
        if (androidx.activity.c0.f("DOCUMENT_START_SCRIPT")) {
            try {
                h2.c.a(getWebView(), WebViewActivityKt.CLEARTEXT_INTERCEPTOR_SCRIPT, j3.b.d("*"));
            } catch (Exception e8) {
                Log.w("WebViewActivity", "addDocumentStartJavaScript broad origins failed: " + e8.getMessage());
                try {
                    h2.c.a(getWebView(), WebViewActivityKt.CLEARTEXT_INTERCEPTOR_SCRIPT, j3.b.d("https://appassets.androidplatform.net"));
                } catch (Exception e9) {
                    Log.w("WebViewActivity", "addDocumentStartJavaScript fallback failed: " + e9.getMessage());
                }
            }
        }
        try {
            CookieManager cookieManager2 = CookieManager.getInstance();
            cookieManager2.setAcceptCookie(true);
            cookieManager2.setAcceptThirdPartyCookies(getWebView(), true);
        } catch (Exception unused4) {
        }
        if (zA) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new t0.b("/assets/", new b.a(this)));
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                Object obj = arrayList.get(i16);
                i16++;
                ArrayList arrayList3 = arrayList;
                t0.b bVar = (t0.b) obj;
                arrayList2.add(new b.c((String) bVar.f14401a, (b.InterfaceC0065b) bVar.f14402b));
                str3 = str3;
                arrayList = arrayList3;
                str5 = str5;
            }
            str = str3;
            str2 = str5;
            this.assetLoader = new h2.b(arrayList2);
        } else {
            str = "swipeRefreshLayout";
            str2 = "DOCUMENT_START_SCRIPT";
        }
        WebView webView22 = getWebView();
        androidAPI = this.androidApi;
        if (androidAPI != null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw r19;
        }
        webView22.addJavascriptInterface(androidAPI, AndroidAPI.INTERFACE_NAME);
        getWebView().addJavascriptInterface(new WebCompatBridge(), "HtmlToApkWebCompat");
        if (zA) {
            DisplayConfig displayConfig18 = this.displayConfig;
            if (displayConfig18 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw r19;
            }
            if (displayConfig18.getPullToRefresh()) {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        if (z6) {
            getWebView().addJavascriptInterface(this.pullRefreshGuard, "HtmlToApkPullRefresh");
        }
        if (androidx.activity.c0.f(str2)) {
            try {
                h2.c.a(getWebView(), WebViewActivityKt.DOWNLOAD_INTERCEPTOR_SCRIPT, j3.b.d("*"));
                h2.c.a(getWebView(), "window.print = function() { AndroidAPI.printPage(); };", j3.b.d("*"));
                h2.c.a(getWebView(), WebViewActivityKt.WEB_API_SHIM_SCRIPT, j3.b.d("*"));
                if (z6) {
                    h2.c.a(getWebView(), WebViewActivityKt.PULL_REFRESH_GUARD_SCRIPT, j3.b.d("*"));
                }
            } catch (Exception e10) {
                Log.w("WebViewActivity", "Failed to add document start script: " + e10.getMessage());
            }
        }
        this.mainWebViewClient = new AnonymousClass13(zA, z9);
        WebView webView3 = getWebView();
        WebViewClient webViewClient = this.mainWebViewClient;
        if (webViewClient == null) {
            kotlin.jvm.internal.j.g("mainWebViewClient");
            throw r19;
        }
        webView3.setWebViewClient(webViewClient);
        this.mainChromeClient = new AnonymousClass14(zA, webViewSettings);
        WebView webView4 = getWebView();
        WebChromeClient webChromeClient = this.mainChromeClient;
        if (webChromeClient == null) {
            kotlin.jvm.internal.j.g("mainChromeClient");
            throw r19;
        }
        webView4.setWebChromeClient(webChromeClient);
        this.downloadListener = new DownloadListener() { // from class: com.htmltoapk.template.g1
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str6, String str7, String str8, String str9, long j6) {
                WebViewActivity.onCreate$lambda$47(this.s, str6, str7, str8, str9, j6);
            }
        };
        WebView webView5 = getWebView();
        DownloadListener downloadListener = this.downloadListener;
        if (downloadListener == null) {
            kotlin.jvm.internal.j.g("downloadListener");
            throw r19;
        }
        webView5.setDownloadListener(downloadListener);
        setupSplash();
        DisplayConfig displayConfig19 = this.displayConfig;
        if (displayConfig19 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
        if (kotlin.jvm.internal.j.a(displayConfig19.getMode(), "url")) {
            DisplayConfig displayConfig20 = this.displayConfig;
            if (displayConfig20 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw r19;
            }
            url = displayConfig20.getUrl();
        } else {
            url = "https://appassets.androidplatform.net/assets/www/index.html";
        }
        if (zA) {
            DisplayConfig displayConfig21 = this.displayConfig;
            if (displayConfig21 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw r19;
            }
            if (displayConfig21.getNoInternetDialog() && !isNetworkConnected()) {
                showNoInternetDialog();
            }
        }
        DisplayConfig displayConfig22 = this.displayConfig;
        if (displayConfig22 == null) {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
        int i17 = 5;
        if (kotlin.jvm.internal.j.a(displayConfig22.getMode(), "pdf")) {
            SwipeRefreshLayout swipeRefreshLayout5 = this.swipeRefreshLayout;
            if (swipeRefreshLayout5 == null) {
                kotlin.jvm.internal.j.g(str);
                throw r19;
            }
            swipeRefreshLayout5.setEnabled(false);
            DisplayConfig displayConfig23 = this.displayConfig;
            if (displayConfig23 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw r19;
            }
            String pdfReaderJson = displayConfig23.getPdfReaderJson();
            if (x5.o.v(pdfReaderJson)) {
                pdfReaderJson = r19;
            }
            if (pdfReaderJson != null) {
                try {
                    objA = new JSONObject(pdfReaderJson);
                } catch (Throwable th) {
                    objA = d5.e.a(th);
                }
                if (objA instanceof d.a) {
                    objA = r19;
                }
                jSONObject = (JSONObject) objA;
            } else {
                jSONObject = r19;
            }
            int iPdfAccentColor = pdfAccentColor();
            DisplayConfig displayConfig24 = this.displayConfig;
            if (displayConfig24 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw r19;
            }
            String colorMode = displayConfig24.getColorMode();
            String string2 = getApplicationInfo().loadLabel(getPackageManager()).toString();
            kotlin.jvm.internal.j.e("colorMode", colorMode);
            kotlin.jvm.internal.j.e("title", string2);
            String str6 = (8191 & 4) == 0 ? r19 : "auto";
            boolean z10 = (8191 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0;
            int i18 = (8191 & 2048) != 0 ? -14575885 : 0;
            if ((8191 & 4096) == 0) {
                str4 = r19;
            }
            kotlin.jvm.internal.j.e("colorMode", str6);
            kotlin.jvm.internal.j.e("title", str4);
            if (jSONObject == null) {
                n0Var = new w2.n0("vertical", "off", (2043 & 4) != 0 ? str6 : colorMode, true, (2043 & 16) != 0, (2043 & 32) != 0, true, true, true, z10, 1, (2043 & 2048) != 0 ? i18 : iPdfAccentColor, (2043 & 4096) != 0 ? str4 : string2);
                z7 = true;
            } else {
                boolean z11 = z10;
                String str7 = kotlin.jvm.internal.j.a(jSONObject.optString("scrollMode"), "horizontal") ? "horizontal" : "vertical";
                String strOptString = jSONObject.optString("nightMode");
                if (!kotlin.jvm.internal.j.a(strOptString, "on") && !kotlin.jvm.internal.j.a(strOptString, "system")) {
                    strOptString = "off";
                }
                String str8 = strOptString;
                z7 = true;
                boolean zOptBoolean = jSONObject.optBoolean("rememberPage", true);
                boolean zOptBoolean2 = jSONObject.optBoolean("showToolbar", true);
                boolean zOptBoolean3 = jSONObject.optBoolean("showPageIndicator", true);
                boolean zOptBoolean4 = jSONObject.optBoolean("fastScroll", true);
                boolean zOptBoolean5 = jSONObject.optBoolean("zoomEnabled", true);
                boolean zOptBoolean6 = jSONObject.optBoolean("bookmarks", true);
                boolean zOptBoolean7 = jSONObject.optBoolean("allowExport", z11);
                int iOptInt = jSONObject.optInt("startPage", 1);
                n0Var = new w2.n0(str7, str8, colorMode, zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6, zOptBoolean7, iOptInt < 1 ? 1 : iOptInt, iPdfAccentColor, string2);
            }
            DisplayConfig displayConfig25 = this.displayConfig;
            if (displayConfig25 == null) {
                kotlin.jvm.internal.j.g("displayConfig");
                throw r19;
            }
            w2.l0 l0Var = new w2.l0(this, n0Var, displayConfig25.getShowActionBar() ^ z7, 24);
            if (n0Var.f14961j) {
                l0Var.getDocument().u(this, new androidx.camera.core.b0(i17, this, n0Var));
            }
            l0Var.e(bundle);
            this.pdfDocument = l0Var;
            SwipeRefreshLayout swipeRefreshLayout6 = this.swipeRefreshLayout;
            if (swipeRefreshLayout6 == null) {
                kotlin.jvm.internal.j.g(str);
                throw r19;
            }
            swipeRefreshLayout6.removeView(getWebView());
            FrameLayout frameLayout3 = new FrameLayout(this);
            getWebView().setVisibility(8);
            frameLayout3.addView(getWebView(), new FrameLayout.LayoutParams(-1, -1));
            frameLayout3.addView(l0Var, new FrameLayout.LayoutParams(-1, -1));
            SwipeRefreshLayout swipeRefreshLayout7 = this.swipeRefreshLayout;
            if (swipeRefreshLayout7 == null) {
                kotlin.jvm.internal.j.g(str);
                throw r19;
            }
            swipeRefreshLayout7.addView(frameLayout3);
            int i19 = 2;
            l0Var.setOnReady(new h(i19, this));
            l0Var.setOnError(new z0(this, 1));
            w2.t tVar = l0Var.f14921v;
            tVar.getClass();
            w2.a aVar = new w2.a(tVar, i19);
            if (tVar.L) {
                throw new IllegalStateException("Document is already open");
            }
            tVar.L = true;
            tVar.f15025u.execute(new androidx.camera.core.x(8, aVar, tVar));
        } else {
            BridgeGate bridgeGate6 = this.bridgeGate;
            if (bridgeGate6 == null) {
                kotlin.jvm.internal.j.g("bridgeGate");
                throw r19;
            }
            bridgeGate6.onMainFrameUrl(url);
            getWebView().post(new androidx.activity.p(i17, this, url));
        }
        Intent intent = getIntent();
        this.launchDeepLink = (intent == null || (data = intent.getData()) == null) ? r19 : data.toString();
        DisplayConfig displayConfig26 = this.displayConfig;
        if (displayConfig26 != null) {
            requestLaunchPermissions(displayConfig26.getPermissions());
        } else {
            kotlin.jvm.internal.j.g("displayConfig");
            throw r19;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() throws JSONException {
        closePopupWebView();
        this.pendingGeolocationCallback = null;
        this.pendingGeolocationOrigin = null;
        w2.l0 l0Var = this.pdfDocument;
        if (l0Var != null) {
            l0Var.d();
        }
        this.pdfDocument = null;
        super.onDestroy();
        Runnable runnable = this.splashDismissRunnable;
        if (runnable != null) {
            this.splashHandler.removeCallbacks(runnable);
        }
        this.pageLoadHandler.removeCallbacks(this.pageLoadTimeoutRunnable);
        ExecutorService executorService = this.cameraExecutor;
        if (executorService == null) {
            kotlin.jvm.internal.j.g("cameraExecutor");
            throw null;
        }
        executorService.shutdown();
        AdMobBridge adMobBridge = this.adMobBridge;
        if (adMobBridge != null) {
            if (adMobBridge == null) {
                kotlin.jvm.internal.j.g("adMobBridge");
                throw null;
            }
            adMobBridge.destroy();
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.j.e("intent", intent);
        super.onNewIntent(intent);
        setIntent(intent);
        if (kotlin.jvm.internal.j.a(intent.getAction(), "android.intent.action.VIEW") && (kotlin.jvm.internal.j.a(intent.getType(), "application/pdf") || PdfActivity.Companion.isPdf(intent.getData()))) {
            Uri data = intent.getData();
            if (data != null) {
                openPdf(data);
                return;
            }
            return;
        }
        Uri data2 = intent.getData();
        this.launchDeepLink = data2 != null ? data2.toString() : null;
        if (this.webView != null) {
            emitDeepLink();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        AdMobBridge adMobBridge = this.adMobBridge;
        if (adMobBridge != null) {
            if (adMobBridge == null) {
                kotlin.jvm.internal.j.g("adMobBridge");
                throw null;
            }
            adMobBridge.onPause();
        }
        super.onPause();
        if (this.webView != null) {
            getWebView().onPause();
        }
        WebView webView = this.popupWebView;
        if (webView != null) {
            webView.onPause();
        }
        try {
            CookieManager.getInstance().flush();
        } catch (Exception unused) {
        }
        AndroidAPI androidAPI = this.androidApi;
        if (androidAPI == null) {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
        androidAPI.stopAllSensors();
        AndroidAPI androidAPI2 = this.androidApi;
        if (androidAPI2 != null) {
            androidAPI2.stopLocationUpdates();
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onResume() throws JSONException {
        super.onResume();
        if (this.webView != null) {
            getWebView().onResume();
        }
        WebView webView = this.popupWebView;
        if (webView != null) {
            webView.onResume();
        }
        AdMobBridge adMobBridge = this.adMobBridge;
        if (adMobBridge != null) {
            if (adMobBridge != null) {
                adMobBridge.onResume();
            } else {
                kotlin.jvm.internal.j.g("adMobBridge");
                throw null;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.e("outState", bundle);
        w2.l0 l0Var = this.pdfDocument;
        if (l0Var != null) {
            l0Var.g(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    public final void pickFile(String str, String str2) {
        kotlin.jvm.internal.j.e("mimeType", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        this.pendingFileCallbackId = str2;
        this.pickFileLauncher.a(new String[]{str});
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:23:0x003f, B:25:0x004a, B:30:0x0052, B:32:0x005c, B:38:0x0071, B:40:0x008e, B:42:0x0096, B:43:0x009d, B:37:0x0066, B:44:0x009e, B:45:0x00a5), top: B:50:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String printCurrentPage$template_adsRelease() throws Resources.NotFoundException {
        if (isFinishing() || isDestroyed() || this.webView == null || !this.pageLoadFinished || this.lastPageLoadFailed) {
            Log.w("WebViewActivity", "Printing requested before page is ready");
            Toast.makeText(this, R.string.print_launch_failed, 0).show();
            return "page_not_ready";
        }
        PrintJob printJob = this.activePrintJob;
        if (printJob != null && !printJob.isCompleted() && !printJob.isCancelled() && !printJob.isFailed()) {
            Toast.makeText(this, R.string.print_in_progress, 0).show();
            return "print_in_progress";
        }
        try {
            Object systemService = getSystemService("print");
            PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
            if (printManager == null) {
                throw new IllegalStateException("Print service unavailable");
            }
            String title = getWebView().getTitle();
            if (title == null) {
                title = getString(R.string.app_name);
                kotlin.jvm.internal.j.d("getString(...)", title);
            } else {
                if (x5.o.v(title)) {
                    title = null;
                }
                if (title == null) {
                }
            }
            String strI = x5.p.I(120, title);
            PrintJob printJobPrint = printManager.print(strI, getWebView().createPrintDocumentAdapter(strI), new PrintAttributes.Builder().build());
            if (printJobPrint == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.activePrintJob = printJobPrint;
            Log.d("WebViewActivity", "Android print dialog opened");
            return null;
        } catch (Exception e6) {
            Log.w("WebViewActivity", "Unable to open Android printing", e6);
            Toast.makeText(this, R.string.print_launch_failed, 0).show();
            return "launch_failed";
        }
    }

    public final void requestPermission(String str, String str2) {
        kotlin.jvm.internal.j.e("permission", str);
        kotlin.jvm.internal.j.e("callbackId", str2);
        this.pendingPermissionCallbackId = str2;
        this.pendingPermission = str;
        this.permissionLauncher.a(str);
    }

    public final void requestPermissions(String[] strArr, String str) {
        kotlin.jvm.internal.j.e("permissions", strArr);
        kotlin.jvm.internal.j.e("callbackId", str);
        this.pendingPermissionsCallbackId = str;
        this.multiplePermissionsLauncher.a(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: Exception -> 0x0086, TryCatch #1 {Exception -> 0x0086, blocks: (B:3:0x0015, B:26:0x0099, B:25:0x0088, B:22:0x0072, B:6:0x001f, B:8:0x004c, B:11:0x0055, B:20:0x0062, B:18:0x005e, B:19:0x0061, B:10:0x0052, B:16:0x005c), top: B:39:0x0015, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void saveBytesToDownloads(byte[] bArr, final String str, String str2) throws IOException {
        ContentValues contentValues;
        Uri uriInsert;
        kotlin.jvm.internal.j.e("bytes", bArr);
        kotlin.jvm.internal.j.e("fileName", str);
        kotlin.jvm.internal.j.e("mimeType", str2);
        try {
            ContentResolver contentResolver = getContentResolver();
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                    kotlin.jvm.internal.j.d("getContentUri(...)", contentUri);
                    contentValues = new ContentValues();
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", str2);
                    contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                    contentValues.put("is_pending", (Integer) 1);
                    uriInsert = contentResolver.insert(contentUri, contentValues);
                } catch (Exception e6) {
                    Log.w("WebViewActivity", "MediaStore Q insert failed, attempting fallback: " + e6.getMessage());
                }
                if (uriInsert != null) {
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.write(bArr);
                            outputStreamOpenOutputStream.close();
                        } finally {
                        }
                    }
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    contentResolver.update(uriInsert, contentValues, null, null);
                } else {
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    externalStoragePublicDirectory.mkdirs();
                    m5.f.k(new File(externalStoragePublicDirectory, str), bArr);
                }
            }
            runOnUiThread(new u0(0, this, str));
        } catch (Exception e7) {
            Log.e("WebViewActivity", "Failed to save file to downloads", e7);
            try {
                File externalFilesDir = getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                if (externalFilesDir == null) {
                    externalFilesDir = getFilesDir();
                }
                m5.f.k(new File(externalFilesDir, str), bArr);
                runOnUiThread(new androidx.camera.camera2.interop.d(5, this, str));
            } catch (Exception e8) {
                runOnUiThread(new Runnable() { // from class: com.htmltoapk.template.v0
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        WebViewActivity.saveBytesToDownloads$lambda$103(this.s, str, e8, e7);
                    }
                });
            }
        }
    }

    public final void startCameraPreview() throws JSONException {
        if (k0.a.a(this, "android.permission.CAMERA") != 0) {
            AndroidAPI androidAPI = this.androidApi;
            if (androidAPI != null) {
                androidAPI.onCameraPreviewResult(false, false, "permission_denied");
                return;
            } else {
                kotlin.jvm.internal.j.g("androidApi");
                throw null;
            }
        }
        PreviewView previewView = this.previewView;
        if (previewView == null) {
            kotlin.jvm.internal.j.g("previewView");
            throw null;
        }
        previewView.setVisibility(0);
        c5.a<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(this);
        companion.addListener(new androidx.activity.p(4, companion, this), k0.a.c(this));
    }

    public final void stopCameraPreview() throws ExecutionException, JSONException, InterruptedException {
        PreviewView previewView = this.previewView;
        if (previewView == null) {
            kotlin.jvm.internal.j.g("previewView");
            throw null;
        }
        previewView.setVisibility(8);
        try {
            ProcessCameraProvider.Companion.getInstance(this).get().unbindAll();
        } catch (Exception e6) {
            Log.w("WebViewActivity", "stopCameraPreview unbind failed", e6);
        }
        AndroidAPI androidAPI = this.androidApi;
        if (androidAPI != null) {
            androidAPI.onCameraPreviewResult(true, false, null);
        } else {
            kotlin.jvm.internal.j.g("androidApi");
            throw null;
        }
    }

    public final void updateBannerPadding(boolean z6, boolean z7) {
        int i6 = z6 ? (int) (50 * getResources().getDisplayMetrics().density) : 0;
        if (z7) {
            this.bannerPaddingTop = i6;
        } else {
            this.bannerPaddingBottom = i6;
        }
        runOnUiThread(new x0(this, 0));
    }

    private final boolean launchExternalApp(Intent intent, String str) {
        if (str != null) {
            try {
                if (!x5.o.v(str) && isPackageInstalled(str)) {
                    intent.setPackage(str);
                }
            } catch (Exception unused) {
                return false;
            }
        }
        startActivity(intent);
        return true;
    }

    public static /* synthetic */ boolean launchExternalApp$default(WebViewActivity webViewActivity, Intent intent, String str, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            str = null;
        }
        return webViewActivity.launchExternalApp(intent, str);
    }
}
