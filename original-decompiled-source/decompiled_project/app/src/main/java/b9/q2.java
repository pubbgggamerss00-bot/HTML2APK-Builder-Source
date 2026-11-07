package b9;

import com.basitce.htmltoapk.domain.model.WebViewSettings;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4070c;

    public /* synthetic */ q2(int i10, Object obj, Object obj2) {
        this.f4068a = i10;
        this.f4069b = obj;
        this.f4070c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4068a;
        Object obj = this.f4070c;
        Object obj2 = this.f4069b;
        switch (i10) {
            case 0:
                q1.d1 d1Var = o1.f3960b;
                ((eh.l) obj2).invoke(((y2.c0) ((x0.n1) obj).getValue()).f33682a.f27761b);
                break;
            case 1:
                WebViewSettings webViewSettings = (WebViewSettings) obj;
                ((eh.l) obj2).invoke(webViewSettings.copy(((-131073) & 1) != 0 ? webViewSettings.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings.colorMode : null, (4194303 & 32) != 0 ? webViewSettings.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings.pdfNightMode : "system", (4194303 & 16384) != 0 ? webViewSettings.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings.pdfStartPage : 0));
                break;
            default:
                ((x0.l1) obj2).f(2);
                u8.y.c((x0.n1) obj, true);
                break;
        }
        return pg.f0.f21461a;
    }
}
