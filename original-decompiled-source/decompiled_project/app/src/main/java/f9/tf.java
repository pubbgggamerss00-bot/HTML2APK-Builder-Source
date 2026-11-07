package f9;

import com.basitce.htmltoapk.domain.model.WebViewSettings;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class tf implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<pg.n<Integer, String>> f10644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<WebViewSettings, pg.f0> f10646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebViewSettings f10647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10648e;

    public tf(WebViewSettings webViewSettings, eh.l lVar, List list, x0.n1 n1Var, boolean z10) {
        this.f10644a = list;
        this.f10645b = z10;
        this.f10646c = lVar;
        this.f10647d = webViewSettings;
        this.f10648e = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r AppExposedDropdownMenu = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(AppExposedDropdownMenu, "$this$AppExposedDropdownMenu");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            Iterator<T> it = this.f10644a.iterator();
            while (it.hasNext()) {
                pg.n nVar = (pg.n) it.next();
                final int iIntValue2 = ((Number) nVar.f21469a).intValue();
                f1.b bVarB = f1.c.b(658987492, new sf((String) nVar.f21470b), jVar2);
                jVar2.L(-1381414190);
                final boolean z10 = this.f10645b;
                boolean zC = jVar2.c(z10);
                final eh.l<WebViewSettings, pg.f0> lVar = this.f10646c;
                boolean zK = zC | jVar2.K(lVar);
                final WebViewSettings webViewSettings = this.f10647d;
                boolean zK2 = zK | jVar2.K(webViewSettings) | jVar2.i(iIntValue2);
                Object objG = jVar2.g();
                if (zK2 || objG == j.a.f31715a) {
                    final x0.n1<Boolean> n1Var = this.f10648e;
                    eh.a aVar = new eh.a() { // from class: f9.rf
                        @Override // eh.a
                        public final Object invoke() {
                            if (z10) {
                                WebViewSettings webViewSettings2 = webViewSettings;
                                lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : iIntValue2, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                                n1Var.setValue(Boolean.FALSE);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(aVar);
                    objG = aVar;
                }
                jVar2.B();
                q8.g.b(bVarB, (eh.a) objG, null, jVar2, 6, 4);
            }
        }
        return pg.f0.f21461a;
    }
}
