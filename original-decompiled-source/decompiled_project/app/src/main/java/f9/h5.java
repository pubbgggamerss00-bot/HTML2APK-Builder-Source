package f9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.WebViewSettings;
import com.basitce.htmltoapk.domain.model.WebViewSettingsKt;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import x0.j;

/* loaded from: classes.dex */
public final class h5 {
    public static final void a(final String str, final boolean z10, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-1673525383);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), false, null, new q2.i(3), aVar, 3), CropImageView.DEFAULT_ASPECT_RATIO, 2, 1);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            t0.ea.a(z10, aVar, null, false, null, kVarP, (i11 >> 3) & 126);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 4), kVarP);
            t0.ff.b(str, null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(t0.of.f26647a)).f26548k, kVarP, i11 & 14, 0, 65530);
            kVar = kVarP;
            kVar.T(true);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, z10, aVar, i10) { // from class: f9.y4

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f11005a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f11006b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f11007c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    h5.a(this.f11005a, this.f11006b, this.f11007c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0598  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(WebViewSettings settings, final eh.l<? super WebViewSettings, pg.f0> onSettingsChange, x0.j jVar, final int i10) {
        WebViewSettings webViewSettings;
        int i11;
        final WebViewSettings webViewSettings2;
        Object obj;
        boolean z10;
        Object objG;
        boolean z11;
        Object objG2;
        boolean z12;
        Object objG3;
        boolean z13;
        Object objG4;
        boolean z14;
        Object objG5;
        boolean z15;
        Object objG6;
        boolean z16;
        Object objG7;
        boolean zI;
        Object objG8;
        final x0.n1 n1Var;
        boolean zK;
        Object objG9;
        kotlin.jvm.internal.r.e(settings, "settings");
        kotlin.jvm.internal.r.e(onSettingsChange, "onSettingsChange");
        x0.k kVarP = jVar.p(-1895172929);
        int i12 = i10 | (kVarP.K(settings) ? 4 : 2) | (kVarP.l(onSettingsChange) ? 32 : 16);
        if ((i12 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            webViewSettings2 = settings;
        } else {
            z.q qVarA = z.o.a(z.b.h(4), d.a.f14614m, kVarP, 6);
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            String strC = f3.q.c(R.string.pdf_reader_settings_title, kVarP);
            x0.s3 s3Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) kVarP.f(s3Var)).f26545h;
            x2.p pVar = x2.p.f32033f;
            x0.s3 s3Var2 = t0.f2.f25858a;
            t0.ff.b(strC, null, ((t0.e2) kVarP.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 196608, 0, 65498);
            t0.ff.b(f3.q.c(R.string.pdf_reader_settings_desc, kVarP), null, ((t0.e2) kVarP.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26549l, kVarP, 0, 0, 65530);
            c(f3.q.c(R.string.pdf_scroll_mode, kVarP), kVarP, 0);
            String strC2 = f3.q.c(R.string.pdf_scroll_vertical, kVarP);
            boolean z17 = !kotlin.jvm.internal.r.a(settings.getPdfScrollMode(), "horizontal");
            kVarP.L(315499984);
            int i14 = i12 & 112;
            int i15 = i12 & 14;
            boolean z18 = (i14 == 32) | (i15 == 4);
            Object objG10 = kVarP.g();
            Object obj2 = j.a.f31715a;
            if (z18 || objG10 == obj2) {
                webViewSettings = settings;
                objG10 = new c9.m0(onSettingsChange, webViewSettings);
                kVarP.C(objG10);
            } else {
                webViewSettings = settings;
            }
            kVarP.T(false);
            a(strC2, z17, (eh.a) objG10, kVarP, 0);
            String strC3 = f3.q.c(R.string.pdf_scroll_horizontal, kVarP);
            boolean zA = kotlin.jvm.internal.r.a(webViewSettings.getPdfScrollMode(), "horizontal");
            kVarP.L(315506066);
            boolean z19 = (i14 == 32) | (i15 == 4);
            Object objG11 = kVarP.g();
            if (z19 || objG11 == obj2) {
                objG11 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.g(2, onSettingsChange, webViewSettings);
                kVarP.C(objG11);
            }
            kVarP.T(false);
            a(strC3, zA, (eh.a) objG11, kVarP, 0);
            c(f3.q.c(R.string.pdf_night_mode, kVarP), kVarP, 0);
            String strC4 = f3.q.c(R.string.pdf_night_off, kVarP);
            boolean z20 = !qg.p.j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6996m, "system").contains(webViewSettings.getPdfNightMode());
            kVarP.L(315514282);
            boolean z21 = (i14 == 32) | (i15 == 4);
            Object objG12 = kVarP.g();
            if (z21 || objG12 == obj2) {
                objG12 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.h(1, onSettingsChange, webViewSettings);
                kVarP.C(objG12);
            }
            kVarP.T(false);
            a(strC4, z20, (eh.a) objG12, kVarP, 0);
            String strC5 = f3.q.c(R.string.pdf_night_system, kVarP);
            boolean zA2 = kotlin.jvm.internal.r.a(webViewSettings.getPdfNightMode(), "system");
            kVarP.L(315519853);
            boolean z22 = (i14 == 32) | (i15 == 4);
            Object objG13 = kVarP.g();
            if (z22 || objG13 == obj2) {
                objG13 = new b9.q2(1, onSettingsChange, webViewSettings);
                kVarP.C(objG13);
            }
            kVarP.T(false);
            a(strC5, zA2, (eh.a) objG13, kVarP, 0);
            String strC6 = f3.q.c(R.string.pdf_night_on, kVarP);
            boolean zA3 = kotlin.jvm.internal.r.a(webViewSettings.getPdfNightMode(), com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f6996m);
            kVarP.L(315525257);
            boolean z23 = (i15 == 4) | (i14 == 32);
            Object objG14 = kVarP.g();
            if (z23 || objG14 == obj2) {
                i11 = 1;
                objG14 = new c9.h1(1, onSettingsChange, webViewSettings);
                kVarP.C(objG14);
            } else {
                i11 = 1;
            }
            kVarP.T(false);
            a(strC6, zA3, (eh.a) objG14, kVarP, 0);
            int i16 = i11;
            webViewSettings2 = settings;
            t0.ff.b(f3.q.c(R.string.pdf_night_desc, kVarP), null, ((t0.e2) kVarP.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26549l, kVarP, 0, 0, 65530);
            float f10 = 8;
            t0.v2.a(androidx.compose.foundation.layout.f.j(aVar, CropImageView.DEFAULT_ASPECT_RATIO, f10, i16), CropImageView.DEFAULT_ASPECT_RATIO, 0L, kVarP, 6, 6);
            String strC7 = f3.q.c(R.string.pdf_remember_page, kVarP);
            String strC8 = f3.q.c(R.string.pdf_remember_page_desc, kVarP);
            boolean pdfRememberPage = webViewSettings2.getPdfRememberPage();
            kVarP.L(315540746);
            int i17 = (i14 == 32 ? i16 : 0) | (i15 == 4 ? i16 : 0);
            Object objG15 = kVarP.g();
            if (i17 == 0) {
                obj = obj2;
                if (objG15 == obj) {
                }
                kVarP.T(false);
                Object obj3 = obj;
                d(strC7, strC8, pdfRememberPage, false, (eh.l) objG15, kVarP, 0, 8);
                String strC9 = f3.q.c(R.string.pdf_show_toolbar, kVarP);
                String strC10 = f3.q.c(R.string.pdf_show_toolbar_desc, kVarP);
                boolean pdfShowToolbar = webViewSettings2.getPdfShowToolbar();
                kVarP.L(315547529);
                z10 = (i14 != 32) | (i15 != 4);
                objG = kVarP.g();
                if (!z10 || objG == obj3) {
                    objG = new b9.s1(1, onSettingsChange, webViewSettings2);
                    kVarP.C(objG);
                }
                kVarP.T(false);
                d(strC9, strC10, pdfShowToolbar, false, (eh.l) objG, kVarP, 0, 8);
                String strC11 = f3.q.c(R.string.pdf_show_page_indicator, kVarP);
                String strC12 = f3.q.c(R.string.pdf_show_page_indicator_desc, kVarP);
                boolean pdfShowPageIndicator = webViewSettings2.getPdfShowPageIndicator();
                kVarP.L(315554927);
                z11 = (i14 != 32) | (i15 != 4);
                objG2 = kVarP.g();
                if (!z11 || objG2 == obj3) {
                    objG2 = new eh.l() { // from class: f9.v4
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            WebViewSettings webViewSettings3 = webViewSettings2;
                            onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : zBooleanValue, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG2);
                }
                kVarP.T(false);
                d(strC11, strC12, pdfShowPageIndicator, false, (eh.l) objG2, kVarP, 0, 8);
                String strC13 = f3.q.c(R.string.pdf_fast_scroll, kVarP);
                String strC14 = f3.q.c(R.string.pdf_fast_scroll_desc, kVarP);
                boolean pdfFastScroll = webViewSettings2.getPdfFastScroll();
                boolean z24 = !kotlin.jvm.internal.r.a(webViewSettings2.getPdfScrollMode(), "horizontal");
                kVarP.L(315564456);
                z12 = (i14 != 32) | (i15 != 4);
                objG3 = kVarP.g();
                if (!z12 || objG3 == obj3) {
                    objG3 = new eh.l() { // from class: f9.w4
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            WebViewSettings webViewSettings3 = webViewSettings2;
                            onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : zBooleanValue, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG3);
                }
                kVarP.T(false);
                d(strC13, strC14, pdfFastScroll, z24, (eh.l) objG3, kVarP, 0, 0);
                String strC15 = f3.q.c(R.string.pdf_zoom, kVarP);
                String strC16 = f3.q.c(R.string.pdf_zoom_desc, kVarP);
                boolean pdfZoomEnabled = webViewSettings2.getPdfZoomEnabled();
                kVarP.L(315570665);
                z13 = (i14 != 32) | (i15 != 4);
                objG4 = kVarP.g();
                if (!z13 || objG4 == obj3) {
                    objG4 = new eh.l() { // from class: f9.x4
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            WebViewSettings webViewSettings3 = webViewSettings2;
                            onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : zBooleanValue, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG4);
                }
                kVarP.T(false);
                d(strC15, strC16, pdfZoomEnabled, false, (eh.l) objG4, kVarP, 0, 8);
                String strC17 = f3.q.c(R.string.pdf_bookmarks, kVarP);
                String strC18 = f3.q.c(R.string.pdf_bookmarks_desc, kVarP);
                boolean pdfBookmarks = webViewSettings2.getPdfBookmarks();
                kVarP.L(315577159);
                z14 = (i14 != 32) | (i15 != 4);
                objG5 = kVarP.g();
                if (!z14 || objG5 == obj3) {
                    objG5 = new eh.l() { // from class: f9.c5
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            WebViewSettings webViewSettings3 = webViewSettings2;
                            onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : zBooleanValue, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG5);
                }
                kVarP.T(false);
                d(strC17, strC18, pdfBookmarks, false, (eh.l) objG5, kVarP, 0, 8);
                String strC19 = f3.q.c(R.string.editor_open_external_pdfs, kVarP);
                String strC20 = f3.q.c(R.string.editor_open_external_pdfs_desc, kVarP);
                boolean zOpensExternalPdfs = WebViewSettingsKt.opensExternalPdfs(webViewSettings2, true);
                kVarP.L(315586283);
                z15 = (i14 != 32) | (i15 != 4);
                objG6 = kVarP.g();
                if (!z15 || objG6 == obj3) {
                    objG6 = new eh.l() { // from class: f9.d5
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            Boolean bool = (Boolean) obj4;
                            bool.booleanValue();
                            WebViewSettings webViewSettings3 = webViewSettings2;
                            onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : bool, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG6);
                }
                kVarP.T(false);
                d(strC19, strC20, zOpensExternalPdfs, false, (eh.l) objG6, kVarP, 0, 8);
                String strC21 = f3.q.c(R.string.pdf_allow_export, kVarP);
                String strC22 = f3.q.c(R.string.pdf_allow_export_desc, kVarP);
                boolean pdfAllowExport = webViewSettings2.getPdfAllowExport();
                kVarP.L(315593097);
                z16 = (i14 != 32) | (i15 != 4);
                objG7 = kVarP.g();
                if (!z16 || objG7 == obj3) {
                    objG7 = new eh.l() { // from class: f9.e5
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            WebViewSettings webViewSettings3 = webViewSettings2;
                            onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : zBooleanValue, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG7);
                }
                kVarP.T(false);
                d(strC21, strC22, pdfAllowExport, false, (eh.l) objG7, kVarP, 0, 8);
                t0.v2.a(androidx.compose.foundation.layout.f.j(aVar, CropImageView.DEFAULT_ASPECT_RATIO, f10, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, kVarP, 6, 6);
                int pdfStartPage = webViewSettings2.getPdfStartPage();
                kVarP.L(315598865);
                zI = kVarP.i(pdfStartPage);
                objG8 = kVarP.g();
                if (!zI || objG8 == obj3) {
                    objG8 = bg.b.h(String.valueOf(webViewSettings2.getPdfStartPage()));
                    kVarP.C(objG8);
                }
                n1Var = (x0.n1) objG8;
                kVarP.T(false);
                String str = (String) n1Var.getValue();
                i0.h2 h2Var = new i0.h2(3, 0, 123);
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                kVarP.L(315604628);
                zK = (i15 != 4) | (i14 != 32) | kVarP.K(n1Var);
                objG9 = kVarP.g();
                if (!zK || objG9 == obj3) {
                    objG9 = new eh.l() { // from class: f9.f5
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            String input = (String) obj4;
                            kotlin.jvm.internal.r.e(input, "input");
                            StringBuilder sb = new StringBuilder();
                            int length = input.length();
                            for (int i18 = 0; i18 < length; i18++) {
                                char cCharAt = input.charAt(i18);
                                if (Character.isDigit(cCharAt)) {
                                    sb.append(cCharAt);
                                }
                            }
                            String strB0 = mh.y.b0(5, sb.toString());
                            n1Var.setValue(strB0);
                            Integer numG = mh.s.g(strB0);
                            if (numG != null) {
                                if (numG.intValue() < 1) {
                                    numG = null;
                                }
                                if (numG != null) {
                                    int iIntValue = numG.intValue();
                                    WebViewSettings webViewSettings3 = webViewSettings2;
                                    onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : iIntValue));
                                }
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG9);
                }
                kVarP.T(false);
                t0.w9.a(str, (eh.l) objG9, dVarD, false, false, null, d.f9261a, null, null, null, null, d.f9262b, false, null, h2Var, null, true, 0, 0, null, null, kVarP, 1573248, 12779904, 8220600);
                kVarP = kVarP;
                kVarP.T(true);
            } else {
                obj = obj2;
            }
            objG15 = new c9.n0(i16, onSettingsChange, webViewSettings2);
            kVarP.C(objG15);
            kVarP.T(false);
            Object obj32 = obj;
            d(strC7, strC8, pdfRememberPage, false, (eh.l) objG15, kVarP, 0, 8);
            String strC92 = f3.q.c(R.string.pdf_show_toolbar, kVarP);
            String strC102 = f3.q.c(R.string.pdf_show_toolbar_desc, kVarP);
            boolean pdfShowToolbar2 = webViewSettings2.getPdfShowToolbar();
            kVarP.L(315547529);
            z10 = (i14 != 32) | (i15 != 4);
            objG = kVarP.g();
            if (!z10) {
                objG = new b9.s1(1, onSettingsChange, webViewSettings2);
                kVarP.C(objG);
                kVarP.T(false);
                d(strC92, strC102, pdfShowToolbar2, false, (eh.l) objG, kVarP, 0, 8);
                String strC112 = f3.q.c(R.string.pdf_show_page_indicator, kVarP);
                String strC122 = f3.q.c(R.string.pdf_show_page_indicator_desc, kVarP);
                boolean pdfShowPageIndicator2 = webViewSettings2.getPdfShowPageIndicator();
                kVarP.L(315554927);
                z11 = (i14 != 32) | (i15 != 4);
                objG2 = kVarP.g();
                if (!z11) {
                    objG2 = new eh.l() { // from class: f9.v4
                        @Override // eh.l
                        public final Object invoke(Object obj4) {
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            WebViewSettings webViewSettings3 = webViewSettings2;
                            onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : zBooleanValue, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG2);
                    kVarP.T(false);
                    d(strC112, strC122, pdfShowPageIndicator2, false, (eh.l) objG2, kVarP, 0, 8);
                    String strC132 = f3.q.c(R.string.pdf_fast_scroll, kVarP);
                    String strC142 = f3.q.c(R.string.pdf_fast_scroll_desc, kVarP);
                    boolean pdfFastScroll2 = webViewSettings2.getPdfFastScroll();
                    boolean z242 = !kotlin.jvm.internal.r.a(webViewSettings2.getPdfScrollMode(), "horizontal");
                    kVarP.L(315564456);
                    z12 = (i14 != 32) | (i15 != 4);
                    objG3 = kVarP.g();
                    if (!z12) {
                        objG3 = new eh.l() { // from class: f9.w4
                            @Override // eh.l
                            public final Object invoke(Object obj4) {
                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                WebViewSettings webViewSettings3 = webViewSettings2;
                                onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : zBooleanValue, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                                return pg.f0.f21461a;
                            }
                        };
                        kVarP.C(objG3);
                        kVarP.T(false);
                        d(strC132, strC142, pdfFastScroll2, z242, (eh.l) objG3, kVarP, 0, 0);
                        String strC152 = f3.q.c(R.string.pdf_zoom, kVarP);
                        String strC162 = f3.q.c(R.string.pdf_zoom_desc, kVarP);
                        boolean pdfZoomEnabled2 = webViewSettings2.getPdfZoomEnabled();
                        kVarP.L(315570665);
                        z13 = (i14 != 32) | (i15 != 4);
                        objG4 = kVarP.g();
                        if (!z13) {
                            objG4 = new eh.l() { // from class: f9.x4
                                @Override // eh.l
                                public final Object invoke(Object obj4) {
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    WebViewSettings webViewSettings3 = webViewSettings2;
                                    onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : zBooleanValue, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                                    return pg.f0.f21461a;
                                }
                            };
                            kVarP.C(objG4);
                            kVarP.T(false);
                            d(strC152, strC162, pdfZoomEnabled2, false, (eh.l) objG4, kVarP, 0, 8);
                            String strC172 = f3.q.c(R.string.pdf_bookmarks, kVarP);
                            String strC182 = f3.q.c(R.string.pdf_bookmarks_desc, kVarP);
                            boolean pdfBookmarks2 = webViewSettings2.getPdfBookmarks();
                            kVarP.L(315577159);
                            z14 = (i14 != 32) | (i15 != 4);
                            objG5 = kVarP.g();
                            if (!z14) {
                                objG5 = new eh.l() { // from class: f9.c5
                                    @Override // eh.l
                                    public final Object invoke(Object obj4) {
                                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                        WebViewSettings webViewSettings3 = webViewSettings2;
                                        onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : zBooleanValue, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                                        return pg.f0.f21461a;
                                    }
                                };
                                kVarP.C(objG5);
                                kVarP.T(false);
                                d(strC172, strC182, pdfBookmarks2, false, (eh.l) objG5, kVarP, 0, 8);
                                String strC192 = f3.q.c(R.string.editor_open_external_pdfs, kVarP);
                                String strC202 = f3.q.c(R.string.editor_open_external_pdfs_desc, kVarP);
                                boolean zOpensExternalPdfs2 = WebViewSettingsKt.opensExternalPdfs(webViewSettings2, true);
                                kVarP.L(315586283);
                                z15 = (i14 != 32) | (i15 != 4);
                                objG6 = kVarP.g();
                                if (!z15) {
                                    objG6 = new eh.l() { // from class: f9.d5
                                        @Override // eh.l
                                        public final Object invoke(Object obj4) {
                                            Boolean bool = (Boolean) obj4;
                                            bool.booleanValue();
                                            WebViewSettings webViewSettings3 = webViewSettings2;
                                            onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : bool, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                                            return pg.f0.f21461a;
                                        }
                                    };
                                    kVarP.C(objG6);
                                    kVarP.T(false);
                                    d(strC192, strC202, zOpensExternalPdfs2, false, (eh.l) objG6, kVarP, 0, 8);
                                    String strC212 = f3.q.c(R.string.pdf_allow_export, kVarP);
                                    String strC222 = f3.q.c(R.string.pdf_allow_export_desc, kVarP);
                                    boolean pdfAllowExport2 = webViewSettings2.getPdfAllowExport();
                                    kVarP.L(315593097);
                                    z16 = (i14 != 32) | (i15 != 4);
                                    objG7 = kVarP.g();
                                    if (!z16) {
                                        objG7 = new eh.l() { // from class: f9.e5
                                            @Override // eh.l
                                            public final Object invoke(Object obj4) {
                                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                                WebViewSettings webViewSettings3 = webViewSettings2;
                                                onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : zBooleanValue, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : 0));
                                                return pg.f0.f21461a;
                                            }
                                        };
                                        kVarP.C(objG7);
                                        kVarP.T(false);
                                        d(strC212, strC222, pdfAllowExport2, false, (eh.l) objG7, kVarP, 0, 8);
                                        t0.v2.a(androidx.compose.foundation.layout.f.j(aVar, CropImageView.DEFAULT_ASPECT_RATIO, f10, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, kVarP, 6, 6);
                                        int pdfStartPage2 = webViewSettings2.getPdfStartPage();
                                        kVarP.L(315598865);
                                        zI = kVarP.i(pdfStartPage2);
                                        objG8 = kVarP.g();
                                        if (!zI) {
                                            objG8 = bg.b.h(String.valueOf(webViewSettings2.getPdfStartPage()));
                                            kVarP.C(objG8);
                                            n1Var = (x0.n1) objG8;
                                            kVarP.T(false);
                                            String str2 = (String) n1Var.getValue();
                                            i0.h2 h2Var2 = new i0.h2(3, 0, 123);
                                            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                                            kVarP.L(315604628);
                                            zK = (i15 != 4) | (i14 != 32) | kVarP.K(n1Var);
                                            objG9 = kVarP.g();
                                            if (!zK) {
                                                objG9 = new eh.l() { // from class: f9.f5
                                                    @Override // eh.l
                                                    public final Object invoke(Object obj4) {
                                                        String input = (String) obj4;
                                                        kotlin.jvm.internal.r.e(input, "input");
                                                        StringBuilder sb = new StringBuilder();
                                                        int length = input.length();
                                                        for (int i18 = 0; i18 < length; i18++) {
                                                            char cCharAt = input.charAt(i18);
                                                            if (Character.isDigit(cCharAt)) {
                                                                sb.append(cCharAt);
                                                            }
                                                        }
                                                        String strB0 = mh.y.b0(5, sb.toString());
                                                        n1Var.setValue(strB0);
                                                        Integer numG = mh.s.g(strB0);
                                                        if (numG != null) {
                                                            if (numG.intValue() < 1) {
                                                                numG = null;
                                                            }
                                                            if (numG != null) {
                                                                int iIntValue = numG.intValue();
                                                                WebViewSettings webViewSettings3 = webViewSettings2;
                                                                onSettingsChange.invoke(webViewSettings3.copy(((-131073) & 1) != 0 ? webViewSettings3.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings3.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings3.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings3.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings3.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings3.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings3.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings3.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings3.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings3.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings3.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings3.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings3.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings3.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings3.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings3.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings3.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings3.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings3.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings3.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings3.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings3.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings3.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings3.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings3.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings3.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings3.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings3.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings3.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings3.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings3.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings3.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings3.colorMode : null, (4194303 & 32) != 0 ? webViewSettings3.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings3.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings3.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings3.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings3.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings3.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings3.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings3.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings3.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings3.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings3.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings3.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings3.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings3.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings3.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings3.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings3.pdfStartPage : iIntValue));
                                                            }
                                                        }
                                                        return pg.f0.f21461a;
                                                    }
                                                };
                                                kVarP.C(objG9);
                                                kVarP.T(false);
                                                t0.w9.a(str2, (eh.l) objG9, dVarD2, false, false, null, d.f9261a, null, null, null, null, d.f9262b, false, null, h2Var2, null, true, 0, 0, null, null, kVarP, 1573248, 12779904, 8220600);
                                                kVarP = kVarP;
                                                kVarP.T(true);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(onSettingsChange, i10) { // from class: f9.g5

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f9668b;

                @Override // eh.p
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iN = f3.i.n(1);
                    h5.b(this.f9667a, this.f9668b, (x0.j) obj4, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final String str, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(1739976083);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2);
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            t0.ff.b(str, androidx.compose.foundation.layout.f.l(d.a.f1143b, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, 2, 5), ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(t0.of.f26647a)).f26550m, kVar, (i11 & 14) | 48, 0, 65528);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, i10) { // from class: f9.b5

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f9011a;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    h5.c(this.f9011a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final String str, final String str2, final boolean z10, boolean z11, final eh.l<? super Boolean, pg.f0> lVar, x0.j jVar, final int i10, final int i11) {
        boolean z12;
        int i12;
        final boolean z13;
        x0.k kVarP = jVar.p(1102241870);
        int i13 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.K(str2) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128);
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 = i13 | 3072;
            z12 = z11;
        } else {
            z12 = z11;
            i12 = i13 | (kVarP.c(z12) ? 2048 : 1024);
        }
        int i15 = i12 | (kVarP.l(lVar) ? 16384 : 8192);
        if ((i15 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            z13 = z12;
        } else {
            boolean z14 = i14 != 0 ? true : z12;
            float f10 = z14 ? 1.0f : 0.38f;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            q2.i iVar = new q2.i(2);
            kVarP.L(313779871);
            boolean z15 = ((i15 & 896) == 256) | ((i15 & 57344) == 16384);
            Object objG = kVarP.g();
            if (z15 || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: f9.z4
                    @Override // eh.a
                    public final Object invoke() {
                        lVar.invoke(Boolean.valueOf(!z10));
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            boolean z16 = z14;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD, z14, null, iVar, (eh.a) objG, 2), CropImageView.DEFAULT_ASPECT_RATIO, 6, 1);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i16 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, m1VarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(new LayoutWeightElement(1.0f, true), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i17 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, qVarA, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i17))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            x0.s3 s3Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) kVarP.f(s3Var)).f26548k;
            x0.s3 s3Var2 = t0.f2.f25858a;
            t0.ff.b(str, null, q1.b1.c(f10, ((t0.e2) kVarP.f(s3Var2)).f25771q), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, i15 & 14, 0, 65530);
            t0.ff.b(str2, null, q1.b1.c(f10, ((t0.e2) kVarP.f(s3Var2)).f25773s), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26549l, kVarP, (i15 >> 3) & 14, 0, 65530);
            kVarP = kVarP;
            kVarP.T(true);
            androidx.compose.material3.a.a(z10 && z16, lVar, null, z16, null, kVarP, ((i15 >> 9) & 112) | ((i15 << 3) & 57344), HeaderItem.DATA_START_OFFSET);
            kVarP.T(true);
            z13 = z16;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, str2, z10, z13, lVar, i10, i11) { // from class: f9.a5

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f8943a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f8944b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f8945c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f8946d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.l f8947e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f8948f;

                {
                    this.f8948f = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    h5.d(this.f8943a, this.f8944b, this.f8945c, this.f8946d, this.f8947e, (x0.j) obj, iN, this.f8948f);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
