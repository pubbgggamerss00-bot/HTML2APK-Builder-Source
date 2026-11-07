package com.basitce.htmltoapk.domain.model;

import androidx.datastore.preferences.protobuf.a1;
import androidx.room.z0;
import bi.f;
import ci.c;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.v0;
import l0.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import r.o2;
import zh.b;
import zh.g;

@g
/* loaded from: classes.dex */
public final class WebViewSettings {
    public static final int $stable = 0;
    public static final int CACHE_LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int CACHE_LOAD_CACHE_ONLY = 3;
    public static final int CACHE_LOAD_DEFAULT = 0;
    public static final int CACHE_LOAD_NO_CACHE = 2;
    public static final Companion Companion = new Companion(null);
    public static final int MIXED_ALWAYS_ALLOW = 1;
    public static final int MIXED_COMPATIBILITY_MODE = 2;
    public static final int MIXED_NEVER_ALLOW = 0;
    private final boolean allowContentAccess;
    private final boolean allowFileAccess;
    private final boolean allowFileAccessFromFileURLs;
    private final boolean allowUniversalAccessFromFileURLs;
    private final boolean backHistoryNavigation;
    private final boolean bridgeOwnOriginOnly;
    private final boolean builtInZoomControls;
    private final int cacheMode;
    private final String colorMode;
    private final boolean displayZoomControls;
    private final boolean domStorageEnabled;
    private final boolean exitConfirmationDialog;
    private final boolean geolocationEnabled;
    private final boolean javaScriptEnabled;
    private final boolean loadWithOverviewMode;
    private final boolean loadingIndicator;
    private final int mixedContentMode;
    private final int navBarAlpha;
    private final String navBarColor;
    private final String navBarIcons;
    private final boolean noInternetDialog;
    private final Boolean openExternalPdfs;
    private final boolean pdfAllowExport;
    private final boolean pdfBookmarks;
    private final boolean pdfFastScroll;
    private final String pdfNightMode;
    private final boolean pdfRememberPage;
    private final String pdfScrollMode;
    private final boolean pdfShowPageIndicator;
    private final boolean pdfShowToolbar;
    private final int pdfStartPage;
    private final boolean pdfZoomEnabled;
    private final boolean pullToRefresh;
    private final String splashBgColor;
    private final int splashDuration;
    private final boolean splashEnabled;
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
    private final int textZoom;
    private final boolean useWideViewPort;
    private final String userAgent;
    private final String webBackgroundColor;

    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<WebViewSettings> serializer() {
            return WebViewSettings$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WebViewSettings() {
        this(false, false, false, false, false, false, false, false, false, false, 0, 0, (String) null, 0, false, false, false, false, false, false, false, (Boolean) null, false, (String) null, false, (String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, false, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, -1, 4194303, (j) null);
    }

    public static /* synthetic */ WebViewSettings copy$default(WebViewSettings webViewSettings, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10, int i11, String str, int i12, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, Boolean bool, boolean z27, String str2, boolean z28, String str3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, String str4, boolean z29, boolean z30, String str5, String str6, String str7, int i20, String str8, String str9, int i21, String str10, String str11, String str12, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, int i22, int i23, int i24, Object obj) {
        return webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : z10, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : z11, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : z12, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : z13, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : z14, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : z15, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : z16, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : z17, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : z18, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : z19, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : i10, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : i11, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : str, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : i12, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : z20, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : z21, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : z22, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : z23, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : z24, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : z25, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : z26, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : bool, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : z27, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : str2, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : z28, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : str3, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : i13, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : i14, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : i15, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : i16, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : i17, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : i18, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : i19, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : str4, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : z29, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : z30, (4194303 & 16) != 0 ? webViewSettings.colorMode : str5, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : str6, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : str7, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : i20, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : str8, (4194303 & 512) != 0 ? webViewSettings.navBarColor : str9, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : i21, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : str10, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : str11, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : str12, (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : z31, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : z32, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : z33, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : z34, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : z35, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : z36, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : z37, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : i22);
    }

    public static final /* synthetic */ void write$Self$app_release(WebViewSettings webViewSettings, c cVar, f fVar) {
        if (cVar.i(fVar) || !webViewSettings.javaScriptEnabled) {
            cVar.L(fVar, 0, webViewSettings.javaScriptEnabled);
        }
        if (cVar.i(fVar) || !webViewSettings.domStorageEnabled) {
            cVar.L(fVar, 1, webViewSettings.domStorageEnabled);
        }
        if (cVar.i(fVar) || webViewSettings.allowFileAccess) {
            cVar.L(fVar, 2, webViewSettings.allowFileAccess);
        }
        if (cVar.i(fVar) || webViewSettings.allowContentAccess) {
            cVar.L(fVar, 3, webViewSettings.allowContentAccess);
        }
        if (cVar.i(fVar) || !webViewSettings.allowUniversalAccessFromFileURLs) {
            cVar.L(fVar, 4, webViewSettings.allowUniversalAccessFromFileURLs);
        }
        if (cVar.i(fVar) || !webViewSettings.allowFileAccessFromFileURLs) {
            cVar.L(fVar, 5, webViewSettings.allowFileAccessFromFileURLs);
        }
        if (cVar.i(fVar) || !webViewSettings.builtInZoomControls) {
            cVar.L(fVar, 6, webViewSettings.builtInZoomControls);
        }
        if (cVar.i(fVar) || webViewSettings.displayZoomControls) {
            cVar.L(fVar, 7, webViewSettings.displayZoomControls);
        }
        if (cVar.i(fVar) || !webViewSettings.useWideViewPort) {
            cVar.L(fVar, 8, webViewSettings.useWideViewPort);
        }
        if (cVar.i(fVar) || !webViewSettings.loadWithOverviewMode) {
            cVar.L(fVar, 9, webViewSettings.loadWithOverviewMode);
        }
        if (cVar.i(fVar) || webViewSettings.cacheMode != 0) {
            cVar.O(10, webViewSettings.cacheMode, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.mixedContentMode != 1) {
            cVar.O(11, webViewSettings.mixedContentMode, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.userAgent != null) {
            cVar.g(fVar, 12, StringSerializer.INSTANCE, webViewSettings.userAgent);
        }
        if (cVar.i(fVar) || webViewSettings.textZoom != 100) {
            cVar.O(13, webViewSettings.textZoom, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.geolocationEnabled) {
            cVar.L(fVar, 14, webViewSettings.geolocationEnabled);
        }
        if (cVar.i(fVar) || !webViewSettings.pullToRefresh) {
            cVar.L(fVar, 15, webViewSettings.pullToRefresh);
        }
        if (cVar.i(fVar) || !webViewSettings.noInternetDialog) {
            cVar.L(fVar, 16, webViewSettings.noInternetDialog);
        }
        if (cVar.i(fVar) || webViewSettings.loadingIndicator) {
            cVar.L(fVar, 17, webViewSettings.loadingIndicator);
        }
        if (cVar.i(fVar) || !webViewSettings.backHistoryNavigation) {
            cVar.L(fVar, 18, webViewSettings.backHistoryNavigation);
        }
        if (cVar.i(fVar) || webViewSettings.exitConfirmationDialog) {
            cVar.L(fVar, 19, webViewSettings.exitConfirmationDialog);
        }
        if (cVar.i(fVar) || !webViewSettings.bridgeOwnOriginOnly) {
            cVar.L(fVar, 20, webViewSettings.bridgeOwnOriginOnly);
        }
        if (cVar.i(fVar) || webViewSettings.openExternalPdfs != null) {
            cVar.g(fVar, 21, BooleanSerializer.INSTANCE, webViewSettings.openExternalPdfs);
        }
        if (cVar.i(fVar) || webViewSettings.splashEnabled) {
            cVar.L(fVar, 22, webViewSettings.splashEnabled);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.splashBgColor, "#0F1318")) {
            cVar.M(fVar, 23, webViewSettings.splashBgColor);
        }
        if (cVar.i(fVar) || !webViewSettings.splashFadeOut) {
            cVar.L(fVar, 24, webViewSettings.splashFadeOut);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.splashLoaderStyle, "circle")) {
            cVar.M(fVar, 25, webViewSettings.splashLoaderStyle);
        }
        if (cVar.i(fVar) || webViewSettings.splashIconSize != 120) {
            cVar.O(26, webViewSettings.splashIconSize, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.splashIconRadius != 16) {
            cVar.O(27, webViewSettings.splashIconRadius, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.splashLoaderSize != 48) {
            cVar.O(28, webViewSettings.splashLoaderSize, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.splashSpacing != 28) {
            cVar.O(29, webViewSettings.splashSpacing, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.splashDuration != 2) {
            cVar.O(30, webViewSettings.splashDuration, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.splashLoaderThickness != 4) {
            cVar.O(31, webViewSettings.splashLoaderThickness, fVar);
        }
        if (cVar.i(fVar) || webViewSettings.splashFadeDuration != 400) {
            cVar.O(32, webViewSettings.splashFadeDuration, fVar);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.splashLoaderColor, "#00E5CC")) {
            cVar.M(fVar, 33, webViewSettings.splashLoaderColor);
        }
        if (cVar.i(fVar) || webViewSettings.splashFullScreen) {
            cVar.L(fVar, 34, webViewSettings.splashFullScreen);
        }
        if (cVar.i(fVar) || webViewSettings.splashHideLoader) {
            cVar.L(fVar, 35, webViewSettings.splashHideLoader);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.colorMode, "auto")) {
            cVar.M(fVar, 36, webViewSettings.colorMode);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.webBackgroundColor, "#000000")) {
            cVar.M(fVar, 37, webViewSettings.webBackgroundColor);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.statusBarColor, "")) {
            cVar.M(fVar, 38, webViewSettings.statusBarColor);
        }
        if (cVar.i(fVar) || webViewSettings.statusBarAlpha != 100) {
            cVar.O(39, webViewSettings.statusBarAlpha, fVar);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.statusBarIcons, "auto")) {
            cVar.M(fVar, 40, webViewSettings.statusBarIcons);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.navBarColor, "")) {
            cVar.M(fVar, 41, webViewSettings.navBarColor);
        }
        if (cVar.i(fVar) || webViewSettings.navBarAlpha != 100) {
            cVar.O(42, webViewSettings.navBarAlpha, fVar);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.navBarIcons, "auto")) {
            cVar.M(fVar, 43, webViewSettings.navBarIcons);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.pdfScrollMode, "vertical")) {
            cVar.M(fVar, 44, webViewSettings.pdfScrollMode);
        }
        if (cVar.i(fVar) || !r.a(webViewSettings.pdfNightMode, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6997n)) {
            cVar.M(fVar, 45, webViewSettings.pdfNightMode);
        }
        if (cVar.i(fVar) || !webViewSettings.pdfRememberPage) {
            cVar.L(fVar, 46, webViewSettings.pdfRememberPage);
        }
        if (cVar.i(fVar) || !webViewSettings.pdfShowToolbar) {
            cVar.L(fVar, 47, webViewSettings.pdfShowToolbar);
        }
        if (cVar.i(fVar) || !webViewSettings.pdfShowPageIndicator) {
            cVar.L(fVar, 48, webViewSettings.pdfShowPageIndicator);
        }
        if (cVar.i(fVar) || !webViewSettings.pdfFastScroll) {
            cVar.L(fVar, 49, webViewSettings.pdfFastScroll);
        }
        if (cVar.i(fVar) || !webViewSettings.pdfZoomEnabled) {
            cVar.L(fVar, 50, webViewSettings.pdfZoomEnabled);
        }
        if (cVar.i(fVar) || !webViewSettings.pdfBookmarks) {
            cVar.L(fVar, 51, webViewSettings.pdfBookmarks);
        }
        if (cVar.i(fVar) || webViewSettings.pdfAllowExport) {
            cVar.L(fVar, 52, webViewSettings.pdfAllowExport);
        }
        if (!cVar.i(fVar) && webViewSettings.pdfStartPage == 1) {
            return;
        }
        cVar.O(53, webViewSettings.pdfStartPage, fVar);
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

    public final boolean component16() {
        return this.pullToRefresh;
    }

    public final boolean component17() {
        return this.noInternetDialog;
    }

    public final boolean component18() {
        return this.loadingIndicator;
    }

    public final boolean component19() {
        return this.backHistoryNavigation;
    }

    public final boolean component2() {
        return this.domStorageEnabled;
    }

    public final boolean component20() {
        return this.exitConfirmationDialog;
    }

    public final boolean component21() {
        return this.bridgeOwnOriginOnly;
    }

    public final Boolean component22() {
        return this.openExternalPdfs;
    }

    public final boolean component23() {
        return this.splashEnabled;
    }

    public final String component24() {
        return this.splashBgColor;
    }

    public final boolean component25() {
        return this.splashFadeOut;
    }

    public final String component26() {
        return this.splashLoaderStyle;
    }

    public final int component27() {
        return this.splashIconSize;
    }

    public final int component28() {
        return this.splashIconRadius;
    }

    public final int component29() {
        return this.splashLoaderSize;
    }

    public final boolean component3() {
        return this.allowFileAccess;
    }

    public final int component30() {
        return this.splashSpacing;
    }

    public final int component31() {
        return this.splashDuration;
    }

    public final int component32() {
        return this.splashLoaderThickness;
    }

    public final int component33() {
        return this.splashFadeDuration;
    }

    public final String component34() {
        return this.splashLoaderColor;
    }

    public final boolean component35() {
        return this.splashFullScreen;
    }

    public final boolean component36() {
        return this.splashHideLoader;
    }

    public final String component37() {
        return this.colorMode;
    }

    public final String component38() {
        return this.webBackgroundColor;
    }

    public final String component39() {
        return this.statusBarColor;
    }

    public final boolean component4() {
        return this.allowContentAccess;
    }

    public final int component40() {
        return this.statusBarAlpha;
    }

    public final String component41() {
        return this.statusBarIcons;
    }

    public final String component42() {
        return this.navBarColor;
    }

    public final int component43() {
        return this.navBarAlpha;
    }

    public final String component44() {
        return this.navBarIcons;
    }

    public final String component45() {
        return this.pdfScrollMode;
    }

    public final String component46() {
        return this.pdfNightMode;
    }

    public final boolean component47() {
        return this.pdfRememberPage;
    }

    public final boolean component48() {
        return this.pdfShowToolbar;
    }

    public final boolean component49() {
        return this.pdfShowPageIndicator;
    }

    public final boolean component5() {
        return this.allowUniversalAccessFromFileURLs;
    }

    public final boolean component50() {
        return this.pdfFastScroll;
    }

    public final boolean component51() {
        return this.pdfZoomEnabled;
    }

    public final boolean component52() {
        return this.pdfBookmarks;
    }

    public final boolean component53() {
        return this.pdfAllowExport;
    }

    public final int component54() {
        return this.pdfStartPage;
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

    public final WebViewSettings copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10, int i11, String str, int i12, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, Boolean bool, boolean z27, String splashBgColor, boolean z28, String splashLoaderStyle, int i13, int i14, int i15, int i16, int i17, int i18, int i19, String splashLoaderColor, boolean z29, boolean z30, String colorMode, String webBackgroundColor, String statusBarColor, int i20, String statusBarIcons, String navBarColor, int i21, String navBarIcons, String pdfScrollMode, String pdfNightMode, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, int i22) {
        r.e(splashBgColor, "splashBgColor");
        r.e(splashLoaderStyle, "splashLoaderStyle");
        r.e(splashLoaderColor, "splashLoaderColor");
        r.e(colorMode, "colorMode");
        r.e(webBackgroundColor, "webBackgroundColor");
        r.e(statusBarColor, "statusBarColor");
        r.e(statusBarIcons, "statusBarIcons");
        r.e(navBarColor, "navBarColor");
        r.e(navBarIcons, "navBarIcons");
        r.e(pdfScrollMode, "pdfScrollMode");
        r.e(pdfNightMode, "pdfNightMode");
        return new WebViewSettings(z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, i10, i11, str, i12, z20, z21, z22, z23, z24, z25, z26, bool, z27, splashBgColor, z28, splashLoaderStyle, i13, i14, i15, i16, i17, i18, i19, splashLoaderColor, z29, z30, colorMode, webBackgroundColor, statusBarColor, i20, statusBarIcons, navBarColor, i21, navBarIcons, pdfScrollMode, pdfNightMode, z31, z32, z33, z34, z35, z36, z37, i22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewSettings)) {
            return false;
        }
        WebViewSettings webViewSettings = (WebViewSettings) obj;
        return this.javaScriptEnabled == webViewSettings.javaScriptEnabled && this.domStorageEnabled == webViewSettings.domStorageEnabled && this.allowFileAccess == webViewSettings.allowFileAccess && this.allowContentAccess == webViewSettings.allowContentAccess && this.allowUniversalAccessFromFileURLs == webViewSettings.allowUniversalAccessFromFileURLs && this.allowFileAccessFromFileURLs == webViewSettings.allowFileAccessFromFileURLs && this.builtInZoomControls == webViewSettings.builtInZoomControls && this.displayZoomControls == webViewSettings.displayZoomControls && this.useWideViewPort == webViewSettings.useWideViewPort && this.loadWithOverviewMode == webViewSettings.loadWithOverviewMode && this.cacheMode == webViewSettings.cacheMode && this.mixedContentMode == webViewSettings.mixedContentMode && r.a(this.userAgent, webViewSettings.userAgent) && this.textZoom == webViewSettings.textZoom && this.geolocationEnabled == webViewSettings.geolocationEnabled && this.pullToRefresh == webViewSettings.pullToRefresh && this.noInternetDialog == webViewSettings.noInternetDialog && this.loadingIndicator == webViewSettings.loadingIndicator && this.backHistoryNavigation == webViewSettings.backHistoryNavigation && this.exitConfirmationDialog == webViewSettings.exitConfirmationDialog && this.bridgeOwnOriginOnly == webViewSettings.bridgeOwnOriginOnly && r.a(this.openExternalPdfs, webViewSettings.openExternalPdfs) && this.splashEnabled == webViewSettings.splashEnabled && r.a(this.splashBgColor, webViewSettings.splashBgColor) && this.splashFadeOut == webViewSettings.splashFadeOut && r.a(this.splashLoaderStyle, webViewSettings.splashLoaderStyle) && this.splashIconSize == webViewSettings.splashIconSize && this.splashIconRadius == webViewSettings.splashIconRadius && this.splashLoaderSize == webViewSettings.splashLoaderSize && this.splashSpacing == webViewSettings.splashSpacing && this.splashDuration == webViewSettings.splashDuration && this.splashLoaderThickness == webViewSettings.splashLoaderThickness && this.splashFadeDuration == webViewSettings.splashFadeDuration && r.a(this.splashLoaderColor, webViewSettings.splashLoaderColor) && this.splashFullScreen == webViewSettings.splashFullScreen && this.splashHideLoader == webViewSettings.splashHideLoader && r.a(this.colorMode, webViewSettings.colorMode) && r.a(this.webBackgroundColor, webViewSettings.webBackgroundColor) && r.a(this.statusBarColor, webViewSettings.statusBarColor) && this.statusBarAlpha == webViewSettings.statusBarAlpha && r.a(this.statusBarIcons, webViewSettings.statusBarIcons) && r.a(this.navBarColor, webViewSettings.navBarColor) && this.navBarAlpha == webViewSettings.navBarAlpha && r.a(this.navBarIcons, webViewSettings.navBarIcons) && r.a(this.pdfScrollMode, webViewSettings.pdfScrollMode) && r.a(this.pdfNightMode, webViewSettings.pdfNightMode) && this.pdfRememberPage == webViewSettings.pdfRememberPage && this.pdfShowToolbar == webViewSettings.pdfShowToolbar && this.pdfShowPageIndicator == webViewSettings.pdfShowPageIndicator && this.pdfFastScroll == webViewSettings.pdfFastScroll && this.pdfZoomEnabled == webViewSettings.pdfZoomEnabled && this.pdfBookmarks == webViewSettings.pdfBookmarks && this.pdfAllowExport == webViewSettings.pdfAllowExport && this.pdfStartPage == webViewSettings.pdfStartPage;
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

    public final boolean getBackHistoryNavigation() {
        return this.backHistoryNavigation;
    }

    public final boolean getBridgeOwnOriginOnly() {
        return this.bridgeOwnOriginOnly;
    }

    public final boolean getBuiltInZoomControls() {
        return this.builtInZoomControls;
    }

    public final int getCacheMode() {
        return this.cacheMode;
    }

    public final String getColorMode() {
        return this.colorMode;
    }

    public final boolean getDisplayZoomControls() {
        return this.displayZoomControls;
    }

    public final boolean getDomStorageEnabled() {
        return this.domStorageEnabled;
    }

    public final boolean getExitConfirmationDialog() {
        return this.exitConfirmationDialog;
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

    public final boolean getLoadingIndicator() {
        return this.loadingIndicator;
    }

    public final int getMixedContentMode() {
        return this.mixedContentMode;
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

    public final Boolean getOpenExternalPdfs() {
        return this.openExternalPdfs;
    }

    public final boolean getPdfAllowExport() {
        return this.pdfAllowExport;
    }

    public final boolean getPdfBookmarks() {
        return this.pdfBookmarks;
    }

    public final boolean getPdfFastScroll() {
        return this.pdfFastScroll;
    }

    public final String getPdfNightMode() {
        return this.pdfNightMode;
    }

    public final boolean getPdfRememberPage() {
        return this.pdfRememberPage;
    }

    public final String getPdfScrollMode() {
        return this.pdfScrollMode;
    }

    public final boolean getPdfShowPageIndicator() {
        return this.pdfShowPageIndicator;
    }

    public final boolean getPdfShowToolbar() {
        return this.pdfShowToolbar;
    }

    public final int getPdfStartPage() {
        return this.pdfStartPage;
    }

    public final boolean getPdfZoomEnabled() {
        return this.pdfZoomEnabled;
    }

    public final boolean getPullToRefresh() {
        return this.pullToRefresh;
    }

    public final String getSplashBgColor() {
        return this.splashBgColor;
    }

    public final int getSplashDuration() {
        return this.splashDuration;
    }

    public final boolean getSplashEnabled() {
        return this.splashEnabled;
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

    public final int getTextZoom() {
        return this.textZoom;
    }

    public final boolean getUseWideViewPort() {
        return this.useWideViewPort;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getWebBackgroundColor() {
        return this.webBackgroundColor;
    }

    public int hashCode() {
        int iA = a1.a(this.mixedContentMode, a1.a(this.cacheMode, o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(Boolean.hashCode(this.javaScriptEnabled) * 31, 31, this.domStorageEnabled), 31, this.allowFileAccess), 31, this.allowContentAccess), 31, this.allowUniversalAccessFromFileURLs), 31, this.allowFileAccessFromFileURLs), 31, this.builtInZoomControls), 31, this.displayZoomControls), 31, this.useWideViewPort), 31, this.loadWithOverviewMode), 31), 31);
        String str = this.userAgent;
        int iA2 = o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(a1.a(this.textZoom, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.geolocationEnabled), 31, this.pullToRefresh), 31, this.noInternetDialog), 31, this.loadingIndicator), 31, this.backHistoryNavigation), 31, this.exitConfirmationDialog), 31, this.bridgeOwnOriginOnly);
        Boolean bool = this.openExternalPdfs;
        return Integer.hashCode(this.pdfStartPage) + o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(o2.a(k.a(k.a(k.a(a1.a(this.navBarAlpha, k.a(k.a(a1.a(this.statusBarAlpha, k.a(k.a(k.a(o2.a(o2.a(k.a(a1.a(this.splashFadeDuration, a1.a(this.splashLoaderThickness, a1.a(this.splashDuration, a1.a(this.splashSpacing, a1.a(this.splashLoaderSize, a1.a(this.splashIconRadius, a1.a(this.splashIconSize, k.a(o2.a(k.a(o2.a((iA2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.splashEnabled), 31, this.splashBgColor), 31, this.splashFadeOut), 31, this.splashLoaderStyle), 31), 31), 31), 31), 31), 31), 31), 31, this.splashLoaderColor), 31, this.splashFullScreen), 31, this.splashHideLoader), 31, this.colorMode), 31, this.webBackgroundColor), 31, this.statusBarColor), 31), 31, this.statusBarIcons), 31, this.navBarColor), 31), 31, this.navBarIcons), 31, this.pdfScrollMode), 31, this.pdfNightMode), 31, this.pdfRememberPage), 31, this.pdfShowToolbar), 31, this.pdfShowPageIndicator), 31, this.pdfFastScroll), 31, this.pdfZoomEnabled), 31, this.pdfBookmarks), 31, this.pdfAllowExport);
    }

    public String toString() {
        boolean z10 = this.javaScriptEnabled;
        boolean z11 = this.domStorageEnabled;
        boolean z12 = this.allowFileAccess;
        boolean z13 = this.allowContentAccess;
        boolean z14 = this.allowUniversalAccessFromFileURLs;
        boolean z15 = this.allowFileAccessFromFileURLs;
        boolean z16 = this.builtInZoomControls;
        boolean z17 = this.displayZoomControls;
        boolean z18 = this.useWideViewPort;
        boolean z19 = this.loadWithOverviewMode;
        int i10 = this.cacheMode;
        int i11 = this.mixedContentMode;
        String str = this.userAgent;
        int i12 = this.textZoom;
        boolean z20 = this.geolocationEnabled;
        boolean z21 = this.pullToRefresh;
        boolean z22 = this.noInternetDialog;
        boolean z23 = this.loadingIndicator;
        boolean z24 = this.backHistoryNavigation;
        boolean z25 = this.exitConfirmationDialog;
        boolean z26 = this.bridgeOwnOriginOnly;
        Boolean bool = this.openExternalPdfs;
        boolean z27 = this.splashEnabled;
        String str2 = this.splashBgColor;
        boolean z28 = this.splashFadeOut;
        String str3 = this.splashLoaderStyle;
        int i13 = this.splashIconSize;
        int i14 = this.splashIconRadius;
        int i15 = this.splashLoaderSize;
        int i16 = this.splashSpacing;
        int i17 = this.splashDuration;
        int i18 = this.splashLoaderThickness;
        int i19 = this.splashFadeDuration;
        String str4 = this.splashLoaderColor;
        boolean z29 = this.splashFullScreen;
        boolean z30 = this.splashHideLoader;
        String str5 = this.colorMode;
        String str6 = this.webBackgroundColor;
        String str7 = this.statusBarColor;
        int i20 = this.statusBarAlpha;
        String str8 = this.statusBarIcons;
        String str9 = this.navBarColor;
        int i21 = this.navBarAlpha;
        String str10 = this.navBarIcons;
        String str11 = this.pdfScrollMode;
        String str12 = this.pdfNightMode;
        boolean z31 = this.pdfRememberPage;
        boolean z32 = this.pdfShowToolbar;
        boolean z33 = this.pdfShowPageIndicator;
        boolean z34 = this.pdfFastScroll;
        boolean z35 = this.pdfZoomEnabled;
        boolean z36 = this.pdfBookmarks;
        boolean z37 = this.pdfAllowExport;
        int i22 = this.pdfStartPage;
        StringBuilder sb = new StringBuilder("WebViewSettings(javaScriptEnabled=");
        sb.append(z10);
        sb.append(", domStorageEnabled=");
        sb.append(z11);
        sb.append(", allowFileAccess=");
        sb.append(z12);
        sb.append(", allowContentAccess=");
        sb.append(z13);
        sb.append(", allowUniversalAccessFromFileURLs=");
        sb.append(z14);
        sb.append(", allowFileAccessFromFileURLs=");
        sb.append(z15);
        sb.append(", builtInZoomControls=");
        sb.append(z16);
        sb.append(", displayZoomControls=");
        sb.append(z17);
        sb.append(", useWideViewPort=");
        sb.append(z18);
        sb.append(", loadWithOverviewMode=");
        sb.append(z19);
        sb.append(", cacheMode=");
        sb.append(i10);
        sb.append(", mixedContentMode=");
        sb.append(i11);
        sb.append(", userAgent=");
        sb.append(str);
        sb.append(", textZoom=");
        sb.append(i12);
        sb.append(", geolocationEnabled=");
        sb.append(z20);
        sb.append(", pullToRefresh=");
        sb.append(z21);
        sb.append(", noInternetDialog=");
        sb.append(z22);
        sb.append(", loadingIndicator=");
        sb.append(z23);
        sb.append(", backHistoryNavigation=");
        sb.append(z24);
        sb.append(", exitConfirmationDialog=");
        sb.append(z25);
        sb.append(", bridgeOwnOriginOnly=");
        sb.append(z26);
        sb.append(", openExternalPdfs=");
        sb.append(bool);
        sb.append(", splashEnabled=");
        sb.append(z27);
        sb.append(", splashBgColor=");
        sb.append(str2);
        sb.append(", splashFadeOut=");
        sb.append(z28);
        sb.append(", splashLoaderStyle=");
        sb.append(str3);
        sb.append(", splashIconSize=");
        sb.append(i13);
        sb.append(", splashIconRadius=");
        sb.append(i14);
        sb.append(", splashLoaderSize=");
        sb.append(i15);
        sb.append(", splashSpacing=");
        sb.append(i16);
        sb.append(", splashDuration=");
        sb.append(i17);
        sb.append(", splashLoaderThickness=");
        sb.append(i18);
        sb.append(", splashFadeDuration=");
        sb.append(i19);
        sb.append(", splashLoaderColor=");
        sb.append(str4);
        sb.append(", splashFullScreen=");
        sb.append(z29);
        sb.append(", splashHideLoader=");
        sb.append(z30);
        sb.append(", colorMode=");
        z0.a(sb, str5, ", webBackgroundColor=", str6, ", statusBarColor=");
        sb.append(str7);
        sb.append(", statusBarAlpha=");
        sb.append(i20);
        sb.append(", statusBarIcons=");
        z0.a(sb, str8, ", navBarColor=", str9, ", navBarAlpha=");
        sb.append(i21);
        sb.append(", navBarIcons=");
        sb.append(str10);
        sb.append(", pdfScrollMode=");
        z0.a(sb, str11, ", pdfNightMode=", str12, ", pdfRememberPage=");
        sb.append(z31);
        sb.append(", pdfShowToolbar=");
        sb.append(z32);
        sb.append(", pdfShowPageIndicator=");
        sb.append(z33);
        sb.append(", pdfFastScroll=");
        sb.append(z34);
        sb.append(", pdfZoomEnabled=");
        sb.append(z35);
        sb.append(", pdfBookmarks=");
        sb.append(z36);
        sb.append(", pdfAllowExport=");
        sb.append(z37);
        sb.append(", pdfStartPage=");
        sb.append(i22);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ WebViewSettings(int i10, int i11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i12, int i13, String str, int i14, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, Boolean bool, boolean z27, String str2, boolean z28, String str3, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str4, boolean z29, boolean z30, String str5, String str6, String str7, int i22, String str8, String str9, int i23, String str10, String str11, String str12, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, int i24, v0 v0Var) {
        if ((i10 & 1) == 0) {
            this.javaScriptEnabled = true;
        } else {
            this.javaScriptEnabled = z10;
        }
        if ((i10 & 2) == 0) {
            this.domStorageEnabled = true;
        } else {
            this.domStorageEnabled = z11;
        }
        if ((i10 & 4) == 0) {
            this.allowFileAccess = false;
        } else {
            this.allowFileAccess = z12;
        }
        if ((i10 & 8) == 0) {
            this.allowContentAccess = false;
        } else {
            this.allowContentAccess = z13;
        }
        if ((i10 & 16) == 0) {
            this.allowUniversalAccessFromFileURLs = true;
        } else {
            this.allowUniversalAccessFromFileURLs = z14;
        }
        if ((i10 & 32) == 0) {
            this.allowFileAccessFromFileURLs = true;
        } else {
            this.allowFileAccessFromFileURLs = z15;
        }
        if ((i10 & 64) == 0) {
            this.builtInZoomControls = true;
        } else {
            this.builtInZoomControls = z16;
        }
        if ((i10 & 128) == 0) {
            this.displayZoomControls = false;
        } else {
            this.displayZoomControls = z17;
        }
        if ((i10 & 256) == 0) {
            this.useWideViewPort = true;
        } else {
            this.useWideViewPort = z18;
        }
        if ((i10 & 512) == 0) {
            this.loadWithOverviewMode = true;
        } else {
            this.loadWithOverviewMode = z19;
        }
        if ((i10 & 1024) == 0) {
            this.cacheMode = 0;
        } else {
            this.cacheMode = i12;
        }
        if ((i10 & 2048) == 0) {
            this.mixedContentMode = 1;
        } else {
            this.mixedContentMode = i13;
        }
        if ((i10 & 4096) == 0) {
            this.userAgent = null;
        } else {
            this.userAgent = str;
        }
        if ((i10 & 8192) == 0) {
            this.textZoom = 100;
        } else {
            this.textZoom = i14;
        }
        if ((i10 & 16384) == 0) {
            this.geolocationEnabled = false;
        } else {
            this.geolocationEnabled = z20;
        }
        if ((i10 & 32768) == 0) {
            this.pullToRefresh = true;
        } else {
            this.pullToRefresh = z21;
        }
        if ((i10 & 65536) == 0) {
            this.noInternetDialog = true;
        } else {
            this.noInternetDialog = z22;
        }
        if ((i10 & 131072) == 0) {
            this.loadingIndicator = false;
        } else {
            this.loadingIndicator = z23;
        }
        if ((262144 & i10) == 0) {
            this.backHistoryNavigation = true;
        } else {
            this.backHistoryNavigation = z24;
        }
        if ((524288 & i10) == 0) {
            this.exitConfirmationDialog = false;
        } else {
            this.exitConfirmationDialog = z25;
        }
        if ((1048576 & i10) == 0) {
            this.bridgeOwnOriginOnly = true;
        } else {
            this.bridgeOwnOriginOnly = z26;
        }
        this.openExternalPdfs = (2097152 & i10) != 0 ? bool : null;
        if ((4194304 & i10) == 0) {
            this.splashEnabled = false;
        } else {
            this.splashEnabled = z27;
        }
        this.splashBgColor = (8388608 & i10) == 0 ? "#0F1318" : str2;
        if ((16777216 & i10) == 0) {
            this.splashFadeOut = true;
        } else {
            this.splashFadeOut = z28;
        }
        this.splashLoaderStyle = (33554432 & i10) == 0 ? "circle" : str3;
        this.splashIconSize = (67108864 & i10) == 0 ? CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET : i15;
        this.splashIconRadius = (134217728 & i10) == 0 ? 16 : i16;
        this.splashLoaderSize = (268435456 & i10) == 0 ? 48 : i17;
        this.splashSpacing = (536870912 & i10) == 0 ? 28 : i18;
        this.splashDuration = (1073741824 & i10) == 0 ? 2 : i19;
        this.splashLoaderThickness = (i10 & PKIFailureInfo.systemUnavail) == 0 ? 4 : i20;
        this.splashFadeDuration = (i11 & 1) == 0 ? 400 : i21;
        this.splashLoaderColor = (i11 & 2) == 0 ? "#00E5CC" : str4;
        if ((i11 & 4) == 0) {
            this.splashFullScreen = false;
        } else {
            this.splashFullScreen = z29;
        }
        if ((i11 & 8) == 0) {
            this.splashHideLoader = false;
        } else {
            this.splashHideLoader = z30;
        }
        if ((i11 & 16) == 0) {
            this.colorMode = "auto";
        } else {
            this.colorMode = str5;
        }
        this.webBackgroundColor = (i11 & 32) == 0 ? "#000000" : str6;
        this.statusBarColor = (i11 & 64) == 0 ? "" : str7;
        if ((i11 & 128) == 0) {
            this.statusBarAlpha = 100;
        } else {
            this.statusBarAlpha = i22;
        }
        if ((i11 & 256) == 0) {
            this.statusBarIcons = "auto";
        } else {
            this.statusBarIcons = str8;
        }
        this.navBarColor = (i11 & 512) == 0 ? "" : str9;
        if ((i11 & 1024) == 0) {
            this.navBarAlpha = 100;
        } else {
            this.navBarAlpha = i23;
        }
        if ((i11 & 2048) == 0) {
            this.navBarIcons = "auto";
        } else {
            this.navBarIcons = str10;
        }
        this.pdfScrollMode = (i11 & 4096) == 0 ? "vertical" : str11;
        this.pdfNightMode = (i11 & 8192) == 0 ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6997n : str12;
        if ((i11 & 16384) == 0) {
            this.pdfRememberPage = true;
        } else {
            this.pdfRememberPage = z31;
        }
        if ((i11 & 32768) == 0) {
            this.pdfShowToolbar = true;
        } else {
            this.pdfShowToolbar = z32;
        }
        if ((i11 & 65536) == 0) {
            this.pdfShowPageIndicator = true;
        } else {
            this.pdfShowPageIndicator = z33;
        }
        if ((i11 & 131072) == 0) {
            this.pdfFastScroll = true;
        } else {
            this.pdfFastScroll = z34;
        }
        if ((262144 & i11) == 0) {
            this.pdfZoomEnabled = true;
        } else {
            this.pdfZoomEnabled = z35;
        }
        if ((524288 & i11) == 0) {
            this.pdfBookmarks = true;
        } else {
            this.pdfBookmarks = z36;
        }
        if ((1048576 & i11) == 0) {
            this.pdfAllowExport = false;
        } else {
            this.pdfAllowExport = z37;
        }
        if ((2097152 & i11) == 0) {
            this.pdfStartPage = 1;
        } else {
            this.pdfStartPage = i24;
        }
    }

    public WebViewSettings(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10, int i11, String str, int i12, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, Boolean bool, boolean z27, String splashBgColor, boolean z28, String splashLoaderStyle, int i13, int i14, int i15, int i16, int i17, int i18, int i19, String splashLoaderColor, boolean z29, boolean z30, String colorMode, String webBackgroundColor, String statusBarColor, int i20, String statusBarIcons, String navBarColor, int i21, String navBarIcons, String pdfScrollMode, String pdfNightMode, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, int i22) {
        r.e(splashBgColor, "splashBgColor");
        r.e(splashLoaderStyle, "splashLoaderStyle");
        r.e(splashLoaderColor, "splashLoaderColor");
        r.e(colorMode, "colorMode");
        r.e(webBackgroundColor, "webBackgroundColor");
        r.e(statusBarColor, "statusBarColor");
        r.e(statusBarIcons, "statusBarIcons");
        r.e(navBarColor, "navBarColor");
        r.e(navBarIcons, "navBarIcons");
        r.e(pdfScrollMode, "pdfScrollMode");
        r.e(pdfNightMode, "pdfNightMode");
        this.javaScriptEnabled = z10;
        this.domStorageEnabled = z11;
        this.allowFileAccess = z12;
        this.allowContentAccess = z13;
        this.allowUniversalAccessFromFileURLs = z14;
        this.allowFileAccessFromFileURLs = z15;
        this.builtInZoomControls = z16;
        this.displayZoomControls = z17;
        this.useWideViewPort = z18;
        this.loadWithOverviewMode = z19;
        this.cacheMode = i10;
        this.mixedContentMode = i11;
        this.userAgent = str;
        this.textZoom = i12;
        this.geolocationEnabled = z20;
        this.pullToRefresh = z21;
        this.noInternetDialog = z22;
        this.loadingIndicator = z23;
        this.backHistoryNavigation = z24;
        this.exitConfirmationDialog = z25;
        this.bridgeOwnOriginOnly = z26;
        this.openExternalPdfs = bool;
        this.splashEnabled = z27;
        this.splashBgColor = splashBgColor;
        this.splashFadeOut = z28;
        this.splashLoaderStyle = splashLoaderStyle;
        this.splashIconSize = i13;
        this.splashIconRadius = i14;
        this.splashLoaderSize = i15;
        this.splashSpacing = i16;
        this.splashDuration = i17;
        this.splashLoaderThickness = i18;
        this.splashFadeDuration = i19;
        this.splashLoaderColor = splashLoaderColor;
        this.splashFullScreen = z29;
        this.splashHideLoader = z30;
        this.colorMode = colorMode;
        this.webBackgroundColor = webBackgroundColor;
        this.statusBarColor = statusBarColor;
        this.statusBarAlpha = i20;
        this.statusBarIcons = statusBarIcons;
        this.navBarColor = navBarColor;
        this.navBarAlpha = i21;
        this.navBarIcons = navBarIcons;
        this.pdfScrollMode = pdfScrollMode;
        this.pdfNightMode = pdfNightMode;
        this.pdfRememberPage = z31;
        this.pdfShowToolbar = z32;
        this.pdfShowPageIndicator = z33;
        this.pdfFastScroll = z34;
        this.pdfZoomEnabled = z35;
        this.pdfBookmarks = z36;
        this.pdfAllowExport = z37;
        this.pdfStartPage = i22;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WebViewSettings(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10, int i11, String str, int i12, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, Boolean bool, boolean z27, String str2, boolean z28, String str3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, String str4, boolean z29, boolean z30, String str5, String str6, String str7, int i20, String str8, String str9, int i21, String str10, String str11, String str12, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, int i22, int i23, int i24, j jVar) {
        boolean z38 = (i23 & 1) != 0 ? true : z10;
        this(z38, (i23 & 2) != 0 ? true : z11, (i23 & 4) != 0 ? false : z12, (i23 & 8) != 0 ? false : z13, (i23 & 16) != 0 ? true : z14, (i23 & 32) != 0 ? true : z15, (i23 & 64) != 0 ? true : z16, (i23 & 128) != 0 ? false : z17, (i23 & 256) != 0 ? true : z18, (i23 & 512) != 0 ? true : z19, (i23 & 1024) != 0 ? 0 : i10, (i23 & 2048) != 0 ? 1 : i11, (i23 & 4096) != 0 ? null : str, (i23 & 8192) != 0 ? 100 : i12, (i23 & 16384) != 0 ? false : z20, (i23 & 32768) != 0 ? true : z21, (i23 & 65536) != 0 ? true : z22, (i23 & 131072) != 0 ? false : z23, (i23 & PKIFailureInfo.transactionIdInUse) != 0 ? true : z24, (i23 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z25, (i23 & PKIFailureInfo.badCertTemplate) != 0 ? true : z26, (i23 & PKIFailureInfo.badSenderNonce) == 0 ? bool : null, (i23 & 4194304) != 0 ? false : z27, (i23 & 8388608) != 0 ? "#0F1318" : str2, (i23 & 16777216) != 0 ? true : z28, (i23 & 33554432) != 0 ? "circle" : str3, (i23 & 67108864) != 0 ? CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET : i13, (i23 & 134217728) != 0 ? 16 : i14, (i23 & 268435456) != 0 ? 48 : i15, (i23 & PKIFailureInfo.duplicateCertReq) != 0 ? 28 : i16, (i23 & 1073741824) != 0 ? 2 : i17, (i23 & PKIFailureInfo.systemUnavail) != 0 ? 4 : i18, (i24 & 1) != 0 ? 400 : i19, (i24 & 2) != 0 ? "#00E5CC" : str4, (i24 & 4) != 0 ? false : z29, (i24 & 8) != 0 ? false : z30, (i24 & 16) != 0 ? "auto" : str5, (i24 & 32) != 0 ? "#000000" : str6, (i24 & 64) != 0 ? "" : str7, (i24 & 128) != 0 ? 100 : i20, (i24 & 256) != 0 ? "auto" : str8, (i24 & 512) != 0 ? "" : str9, (i24 & 1024) == 0 ? i21 : 100, (i24 & 2048) == 0 ? str10 : "auto", (i24 & 4096) != 0 ? "vertical" : str11, (i24 & 8192) != 0 ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6997n : str12, (i24 & 16384) != 0 ? true : z31, (i24 & 32768) != 0 ? true : z32, (i24 & 65536) != 0 ? true : z33, (i24 & 131072) != 0 ? true : z34, (i24 & PKIFailureInfo.transactionIdInUse) != 0 ? true : z35, (i24 & PKIFailureInfo.signerNotTrusted) != 0 ? true : z36, (i24 & PKIFailureInfo.badCertTemplate) != 0 ? false : z37, (i24 & PKIFailureInfo.badSenderNonce) != 0 ? 1 : i22);
    }
}
