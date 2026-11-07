package f9;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.AdMobTestIds;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.domain.model.ProjectFile;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.WebViewSettings;
import com.basitce.htmltoapk.domain.model.WebViewSettingsKt;
import com.basitce.htmltoapk.ui.crop.CropActivity;
import com.yalantis.ucrop.view.CropImageView;
import f9.fg;
import g2.j;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j5.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import l9.f0;
import l9.p0;
import l9.w;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import q1.b1;
import x0.j;
import x2.p;
import z.b;

/* loaded from: classes.dex */
public final class b8 {

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9021a;

        public a(eh.a<pg.f0> aVar) {
            this.f9021a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f9021a, null, false, null, null, null, f9.e.f9373r0, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class a0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<Integer, pg.f0> f9022a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9023b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9024c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9025d;

        /* JADX WARN: Multi-variable type inference failed */
        public a0(eh.l<? super Integer, pg.f0> lVar, int i10, String str, String str2) {
            this.f9022a = lVar;
            this.f9023b = i10;
            this.f9024c = str;
            this.f9025d = str2;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(d.a.f1143b, 16, 12);
                z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14612k, jVar2, 54);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                x0.e2 e2Var = t0.of.f26647a;
                t2.l0 l0Var = ((t0.nf) jVar2.f(e2Var)).f26552o;
                x0.e2 e2Var2 = t0.f2.f25858a;
                t0.ff.b(this.f9024c, null, ((t0.e2) jVar2.f(e2Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65530);
                t0.ff.b(this.f9025d, null, ((t0.e2) jVar2.f(e2Var2)).f25771q, 0L, x2.p.f32031d, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(e2Var)).f26548k, jVar2, 196608, 0, 65498);
                jVar2.H();
                jVar2.L(-605516276);
                final eh.l<Integer, pg.f0> lVar = this.f9022a;
                boolean zK = jVar2.K(lVar);
                final int i10 = this.f9023b;
                boolean zI = zK | jVar2.i(i10);
                Object objG = jVar2.g();
                if (zI || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: f9.ve
                        @Override // eh.a
                        public final Object invoke() {
                            lVar.invoke(Integer.valueOf(i10));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.s4.c((eh.a) objG, null, false, null, f9.e.M, jVar2, 196608, 30);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<z.o0, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<String> f9026a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9027b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f9028c;

        public b(eh.l lVar, String str, List list) {
            this.f9026a = list;
            this.f9027b = str;
            this.f9028c = lVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.o0 o0Var, x0.j jVar, Integer num) {
            Iterator it;
            long j10;
            b bVar = this;
            z.o0 FlowRow = o0Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(FlowRow, "$this$FlowRow");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                Iterator it2 = bVar.f9026a.iterator();
                while (it2.hasNext()) {
                    final String str = (String) it2.next();
                    boolean zJ = mh.t.j(str, bVar.f9027b, true);
                    long jB = c2.n0.b(Color.parseColor(str));
                    String strD = f3.q.d(R.string.editor_color_option, new Object[]{str}, jVar2);
                    d.a aVar = d.a.f1143b;
                    androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 48);
                    q2.i iVar = new q2.i(3);
                    jVar2.L(957541811);
                    final eh.l<String, pg.f0> lVar = bVar.f9028c;
                    boolean zK = jVar2.K(lVar) | jVar2.K(str);
                    Object objG = jVar2.g();
                    j.a.C0321a c0321a = j.a.f31715a;
                    if (zK || objG == c0321a) {
                        objG = new eh.a() { // from class: f9.u8
                            @Override // eh.a
                            public final Object invoke() {
                                lVar.invoke(str);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    androidx.compose.ui.d dVarA = androidx.compose.ui.c.a(dVarN, j2.c3.f14686a, new g0.b(zJ, iVar, (eh.a) objG));
                    jVar2.L(957543769);
                    boolean zK2 = jVar2.K(strD);
                    Object objG2 = jVar2.g();
                    if (zK2 || objG2 == c0321a) {
                        objG2 = new v8(strD, 0);
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    androidx.compose.ui.d dVarA2 = q2.q.a(dVarA, false, (eh.l) objG2);
                    j1.f fVar = d.a.f14606e;
                    g2.l0 l0VarD = z.g.d(fVar, false);
                    int iD = jVar2.D();
                    x0.a2 a2VarY = jVar2.y();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA2, jVar2);
                    i2.g.f13861o.getClass();
                    e0.a aVar2 = g.a.f13863b;
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar2);
                    } else {
                        jVar2.z();
                    }
                    g.a.b bVar2 = g.a.f13867f;
                    ph.v1.j(bVar2, l0VarD, jVar2);
                    g.a.d dVar = g.a.f13866e;
                    ph.v1.j(dVar, a2VarY, jVar2);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                        l9.i.a(iD, jVar2, iD, c0128a);
                    }
                    g.a.c cVar = g.a.f13865d;
                    ph.v1.j(cVar, dVarC, jVar2);
                    androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(aVar, 34);
                    h0.e eVar = h0.f.f12083a;
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(e1.d.d(dVarN2, eVar), jB, q1.y1.f21750a);
                    float f10 = zJ ? 2 : 1;
                    if (zJ) {
                        jVar2.L(2052834371);
                        it = it2;
                        j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q;
                        jVar2.B();
                    } else {
                        it = it2;
                        jVar2.L(2052836712);
                        j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).B;
                        jVar2.B();
                    }
                    androidx.compose.ui.d dVarA3 = t.o.a(dVarB, f10, j10, eVar);
                    g2.l0 l0VarD2 = z.g.d(fVar, false);
                    int iD2 = jVar2.D();
                    x0.a2 a2VarY2 = jVar2.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA3, jVar2);
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar2);
                    } else {
                        jVar2.z();
                    }
                    ph.v1.j(bVar2, l0VarD2, jVar2);
                    ph.v1.j(dVar, a2VarY2, jVar2);
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar2, iD2, c0128a);
                    }
                    ph.v1.j(cVar, dVarC2, jVar2);
                    jVar2.L(-910476681);
                    if (zJ) {
                        t0.t4.b(p0.n1.a(), null, androidx.compose.foundation.layout.g.n(aVar, 20), c2.n0.h(jB) > 0.5f ? q1.b1.f21648b : q1.b1.f21650d, jVar2, 432, 0);
                    }
                    jVar2.B();
                    jVar2.H();
                    jVar2.H();
                    bVar = this;
                    it2 = it;
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebViewSettings f9029a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<WebViewSettings, pg.f0> f9030b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f9031c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9032d;

        public b0(WebViewSettings webViewSettings, eh.a aVar, eh.l lVar, boolean z10) {
            this.f9029a = webViewSettings;
            this.f9030b = lVar;
            this.f9031c = z10;
            this.f9032d = aVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r EditorCard = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                String strC = f3.q.c(R.string.editor_section_webview_experience, jVar2);
                t2.l0 l0Var = ((t0.nf) jVar2.f(t0.of.f26647a)).f26545h;
                t0.ff.b(strC, null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                String strC2 = f3.q.c(R.string.editor_pull_to_refresh, jVar2);
                String strC3 = f3.q.c(R.string.editor_pull_to_refresh_desc, jVar2);
                final WebViewSettings webViewSettings = this.f9029a;
                boolean pullToRefresh = webViewSettings.getPullToRefresh();
                jVar2.L(724024670);
                final eh.l<WebViewSettings, pg.f0> lVar = this.f9030b;
                boolean zK = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK || objG == obj) {
                    objG = new eh.l() { // from class: f9.xe
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : zBooleanValue, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                b8.G(strC2, strC3, pullToRefresh, (eh.l) objG, this.f9031c, false, this.f9032d, jVar2, 196608);
                String strC4 = f3.q.c(R.string.editor_no_internet_dialog, jVar2);
                String strC5 = f3.q.c(R.string.editor_no_internet_dialog_desc, jVar2);
                boolean noInternetDialog = webViewSettings.getNoInternetDialog();
                jVar2.L(724040353);
                boolean zK2 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG2 = jVar2.g();
                if (zK2 || objG2 == obj) {
                    objG2 = new ye(0, lVar, webViewSettings);
                    jVar2.C(objG2);
                }
                jVar2.B();
                b8.G(strC4, strC5, noInternetDialog, (eh.l) objG2, this.f9031c, false, this.f9032d, jVar2, 196608);
                String strC6 = f3.q.c(R.string.editor_loading_indicator, jVar2);
                String strC7 = f3.q.c(R.string.editor_loading_indicator_desc, jVar2);
                boolean loadingIndicator = webViewSettings.getLoadingIndicator();
                jVar2.L(724056033);
                boolean zK3 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG3 = jVar2.g();
                if (zK3 || objG3 == obj) {
                    objG3 = new ze(0, lVar, webViewSettings);
                    jVar2.C(objG3);
                }
                jVar2.B();
                b8.G(strC6, strC7, loadingIndicator, (eh.l) objG3, this.f9031c, false, this.f9032d, jVar2, 196608);
                String strC8 = f3.q.c(R.string.editor_back_history, jVar2);
                String strC9 = f3.q.c(R.string.editor_back_history_desc, jVar2);
                boolean backHistoryNavigation = webViewSettings.getBackHistoryNavigation();
                jVar2.L(724071526);
                boolean zK4 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG4 = jVar2.g();
                if (zK4 || objG4 == obj) {
                    objG4 = new af(0, lVar, webViewSettings);
                    jVar2.C(objG4);
                }
                jVar2.B();
                b8.G(strC8, strC9, backHistoryNavigation, (eh.l) objG4, this.f9031c, true, this.f9032d, jVar2, 196608);
                String strC10 = f3.q.c(R.string.editor_exit_confirmation, jVar2);
                String strC11 = f3.q.c(R.string.editor_exit_confirmation_desc, jVar2);
                boolean exitConfirmationDialog = webViewSettings.getExitConfirmationDialog();
                jVar2.L(724087271);
                boolean zK5 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG5 = jVar2.g();
                if (zK5 || objG5 == obj) {
                    objG5 = new eh.l() { // from class: f9.bf
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : zBooleanValue, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG5);
                }
                jVar2.B();
                b8.G(strC10, strC11, exitConfirmationDialog, (eh.l) objG5, this.f9031c, true, this.f9032d, jVar2, 196608);
                String strC12 = f3.q.c(R.string.editor_bridge_own_origin, jVar2);
                String strC13 = f3.q.c(R.string.editor_bridge_own_origin_desc, jVar2);
                boolean bridgeOwnOriginOnly = webViewSettings.getBridgeOwnOriginOnly();
                jVar2.L(724103876);
                boolean zK6 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG6 = jVar2.g();
                if (zK6 || objG6 == obj) {
                    objG6 = new cf(0, lVar, webViewSettings);
                    jVar2.C(objG6);
                }
                jVar2.B();
                b8.G(strC12, strC13, bridgeOwnOriginOnly, (eh.l) objG6, this.f9031c, true, this.f9032d, jVar2, 196608);
                String strC14 = f3.q.c(R.string.editor_open_external_pdfs, jVar2);
                String strC15 = f3.q.c(R.string.editor_open_external_pdfs_desc, jVar2);
                boolean zOpensExternalPdfs = WebViewSettingsKt.opensExternalPdfs(webViewSettings, false);
                jVar2.L(724121633);
                boolean zK7 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG7 = jVar2.g();
                if (zK7 || objG7 == obj) {
                    objG7 = new x6(lVar, webViewSettings, 1);
                    jVar2.C(objG7);
                }
                jVar2.B();
                b8.G(strC14, strC15, zOpensExternalPdfs, (eh.l) objG7, this.f9031c, true, this.f9032d, jVar2, 196608);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$HtmlIntegrityCard$1$1", f = "ProjectEditorScreen.kt", l = {1342, 1348, 1372}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public x0.n1 f9033a;

        /* renamed from: b, reason: collision with root package name */
        public int f9034b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9035c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9036d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<ProjectFile> f9037e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Uri f9038f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f9039g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f9040h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ x0.n1<w.a> f9041j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9042k;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$HtmlIntegrityCard$1$1$1", f = "ProjectEditorScreen.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super w.a>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f9043a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f9043a = str;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f9043a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super w.a> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                Set<String> set = l9.w.f16906a;
                return l9.w.c(this.f9043a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, List<ProjectFile> list, Uri uri, Context context, x0.n1<String> n1Var, x0.n1<w.a> n1Var2, x0.n1<Boolean> n1Var3, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f9035c = str;
            this.f9036d = str2;
            this.f9037e = list;
            this.f9038f = uri;
            this.f9039g = context;
            this.f9040h = n1Var;
            this.f9041j = n1Var2;
            this.f9042k = n1Var3;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f9035c, this.f9036d, this.f9037e, this.f9038f, this.f9039g, this.f9040h, this.f9041j, this.f9042k, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
        
            if (r11 == r0) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            u4 u4Var;
            boolean zA;
            x0.n1<w.a> n1Var;
            x0.n1<w.a> n1Var2;
            w.a aVar;
            ug.a aVar2 = ug.a.f29706a;
            int i10 = this.f9034b;
            x0.n1<Boolean> n1Var3 = this.f9042k;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f9034b = 1;
                if (ph.t0.b(350L, this) != aVar2) {
                }
                return aVar2;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n1Var2 = this.f9033a;
                    pg.q.b(obj);
                    aVar = (w.a) obj;
                    n1Var = n1Var2;
                    n1Var.setValue(aVar);
                    n1Var3.setValue(Boolean.FALSE);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
                u4Var = (u4) obj;
                if (u4Var == null) {
                    u4Var = new u4("", true);
                }
                String str = u4Var.f10690a;
                this.f9040h.setValue(str);
                zA = mh.x.A(str);
                n1Var = this.f9041j;
                if (zA) {
                    n1Var.setValue(null);
                    n1Var3.setValue(Boolean.FALSE);
                    return pg.f0.f21461a;
                }
                n1Var3.setValue(Boolean.TRUE);
                if (!u4Var.f10691b) {
                    aVar = new w.a((ArrayList) null, c0.g0.c("File is larger than the preview limit, so tag balance was not checked. The build itself is unaffected."), 1);
                    n1Var.setValue(aVar);
                    n1Var3.setValue(Boolean.FALSE);
                    return pg.f0.f21461a;
                }
                wh.c cVar = ph.z0.f21632a;
                a aVar3 = new a(str, null);
                this.f9033a = n1Var;
                this.f9034b = 3;
                obj = ph.h.e(cVar, aVar3, this);
                if (obj != aVar2) {
                    n1Var2 = n1Var;
                    aVar = (w.a) obj;
                    n1Var = n1Var2;
                    n1Var.setValue(aVar);
                    n1Var3.setValue(Boolean.FALSE);
                    return pg.f0.f21461a;
                }
                return aVar2;
            }
            pg.q.b(obj);
            String str2 = this.f9035c;
            int iHashCode = str2.hashCode();
            if (iHashCode != -1268966290) {
                if (iHashCode != 103145323) {
                    if (iHashCode == 106438291 && str2.equals("paste")) {
                        u4Var = new u4(this.f9036d, true);
                    }
                    String str3 = u4Var.f10690a;
                    this.f9040h.setValue(str3);
                    zA = mh.x.A(str3);
                    n1Var = this.f9041j;
                    if (zA) {
                    }
                } else {
                    if (str2.equals("local")) {
                        Iterator<T> it = this.f9037e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((ProjectFile) next).getType() == ProjectFile.Type.HTML) {
                                break;
                            }
                        }
                        ProjectFile projectFile = (ProjectFile) next;
                        String content = projectFile != null ? projectFile.getContent() : null;
                        if (content == null || content.length() == 0) {
                            Uri uri = this.f9038f;
                            if (uri != null) {
                                this.f9034b = 2;
                                wh.c cVar2 = ph.z0.f21632a;
                                obj = ph.h.e(wh.b.f31563c, new bg(this.f9039g, uri, null), this);
                            }
                            u4Var = new u4("", true);
                        } else {
                            u4Var = new u4(content, true);
                        }
                    }
                    String str32 = u4Var.f10690a;
                    this.f9040h.setValue(str32);
                    zA = mh.x.A(str32);
                    n1Var = this.f9041j;
                    if (zA) {
                    }
                }
                u4Var = new u4("", true);
                String str322 = u4Var.f10690a;
                this.f9040h.setValue(str322);
                zA = mh.x.A(str322);
                n1Var = this.f9041j;
                if (zA) {
                }
            } else {
                if (!str2.equals("folder")) {
                    u4Var = new u4("", true);
                }
                String str3222 = u4Var.f10690a;
                this.f9040h.setValue(str3222);
                zA = mh.x.A(str3222);
                n1Var = this.f9041j;
                if (zA) {
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f9044a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9045b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WebViewSettings f9046c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.l<WebViewSettings, pg.f0> f9047d;

        public c0(WebViewSettings webViewSettings, eh.a aVar, eh.l lVar, boolean z10) {
            this.f9044a = z10;
            this.f9045b = aVar;
            this.f9046c = webViewSettings;
            this.f9047d = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r EditorCard = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                String strC = f3.q.c(R.string.editor_section_webview, jVar2);
                x0.e2 e2Var = t0.of.f26647a;
                t2.l0 l0Var = ((t0.nf) jVar2.f(e2Var)).f26545h;
                x2.p pVar = x2.p.f32033f;
                x0.e2 e2Var2 = t0.f2.f25858a;
                t0.ff.b(strC, null, ((t0.e2) jVar2.f(e2Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                jVar2.L(724136495);
                final boolean z10 = this.f9044a;
                if (!z10) {
                    b8.s(0, this.f9045b, jVar2);
                }
                jVar2.B();
                String strC2 = f3.q.c(R.string.editor_webview_js, jVar2);
                final WebViewSettings webViewSettings = this.f9046c;
                boolean javaScriptEnabled = webViewSettings.getJavaScriptEnabled();
                jVar2.L(724144034);
                final eh.l<WebViewSettings, pg.f0> lVar = this.f9047d;
                boolean zK = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK || objG == obj) {
                    objG = new eh.l() { // from class: f9.df
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : zBooleanValue, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                b8.F(strC2, javaScriptEnabled, (eh.l) objG, this.f9044a, jVar2, 0, 0);
                String strC3 = f3.q.c(R.string.editor_webview_dom, jVar2);
                boolean domStorageEnabled = webViewSettings.getDomStorageEnabled();
                jVar2.L(724152578);
                boolean zK2 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG2 = jVar2.g();
                if (zK2 || objG2 == obj) {
                    objG2 = new eh.l() { // from class: f9.hf
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : zBooleanValue, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                b8.F(strC3, domStorageEnabled, (eh.l) objG2, this.f9044a, jVar2, 0, 0);
                String strC4 = f3.q.c(R.string.editor_webview_file_access, jVar2);
                boolean allowFileAccess = webViewSettings.getAllowFileAccess();
                jVar2.L(724161312);
                boolean zK3 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG3 = jVar2.g();
                if (zK3 || objG3 == obj) {
                    objG3 = new eh.l() { // from class: f9.jf
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : zBooleanValue, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG3);
                }
                jVar2.B();
                b8.F(strC4, allowFileAccess, (eh.l) objG3, this.f9044a, jVar2, 0, 0);
                String strC5 = f3.q.c(R.string.editor_webview_content_access, jVar2);
                boolean allowContentAccess = webViewSettings.getAllowContentAccess();
                jVar2.L(724170179);
                boolean zK4 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG4 = jVar2.g();
                if (zK4 || objG4 == obj) {
                    objG4 = new d9.b(1, lVar, webViewSettings);
                    jVar2.C(objG4);
                }
                jVar2.B();
                b8.F(strC5, allowContentAccess, (eh.l) objG4, this.f9044a, jVar2, 0, 0);
                String strC6 = f3.q.c(R.string.editor_webview_universal_access, jVar2);
                boolean allowUniversalAccessFromFileURLs = webViewSettings.getAllowUniversalAccessFromFileURLs();
                jVar2.L(724179665);
                boolean zK5 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG5 = jVar2.g();
                if (zK5 || objG5 == obj) {
                    objG5 = new eh.l() { // from class: f9.kf
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : zBooleanValue, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG5);
                }
                jVar2.B();
                b8.F(strC6, allowUniversalAccessFromFileURLs, (eh.l) objG5, this.f9044a, jVar2, 0, 0);
                String strC7 = f3.q.c(R.string.editor_webview_file_access_from_file, jVar2);
                boolean allowFileAccessFromFileURLs = webViewSettings.getAllowFileAccessFromFileURLs();
                jVar2.L(724189580);
                boolean zK6 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG6 = jVar2.g();
                if (zK6 || objG6 == obj) {
                    objG6 = new eh.l() { // from class: f9.lf
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : zBooleanValue, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG6);
                }
                jVar2.B();
                b8.F(strC7, allowFileAccessFromFileURLs, (eh.l) objG6, this.f9044a, jVar2, 0, 0);
                String strC8 = f3.q.c(R.string.editor_webview_zoom, jVar2);
                boolean builtInZoomControls = webViewSettings.getBuiltInZoomControls();
                jVar2.L(724198532);
                boolean zK7 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG7 = jVar2.g();
                if (zK7 || objG7 == obj) {
                    objG7 = new mf(0, lVar, webViewSettings);
                    jVar2.C(objG7);
                }
                jVar2.B();
                b8.F(strC8, builtInZoomControls, (eh.l) objG7, this.f9044a, jVar2, 0, 0);
                String strC9 = f3.q.c(R.string.editor_webview_viewport, jVar2);
                boolean useWideViewPort = webViewSettings.getUseWideViewPort();
                jVar2.L(724207232);
                boolean zK8 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG8 = jVar2.g();
                if (zK8 || objG8 == obj) {
                    objG8 = new eh.l() { // from class: f9.nf
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : zBooleanValue, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : false, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG8);
                }
                jVar2.B();
                b8.F(strC9, useWideViewPort, (eh.l) objG8, this.f9044a, jVar2, 0, 0);
                String strC10 = f3.q.c(R.string.editor_webview_overview, jVar2);
                boolean loadWithOverviewMode = webViewSettings.getLoadWithOverviewMode();
                jVar2.L(724215973);
                boolean zK9 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG9 = jVar2.g();
                if (zK9 || objG9 == obj) {
                    objG9 = new z6(lVar, webViewSettings, 1);
                    jVar2.C(objG9);
                }
                jVar2.B();
                b8.F(strC10, loadWithOverviewMode, (eh.l) objG9, this.f9044a, jVar2, 0, 0);
                String strC11 = f3.q.c(R.string.editor_webview_geolocation, jVar2);
                boolean geolocationEnabled = webViewSettings.getGeolocationEnabled();
                jVar2.L(724224899);
                boolean zK10 = jVar2.K(lVar) | jVar2.K(webViewSettings);
                Object objG10 = jVar2.g();
                if (zK10 || objG10 == obj) {
                    objG10 = new eh.l() { // from class: f9.ef
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            WebViewSettings webViewSettings2 = webViewSettings;
                            lVar.invoke(webViewSettings2.copy(((-131073) & 1) != 0 ? webViewSettings2.javaScriptEnabled : false, ((-131073) & 2) != 0 ? webViewSettings2.domStorageEnabled : false, ((-131073) & 4) != 0 ? webViewSettings2.allowFileAccess : false, ((-131073) & 8) != 0 ? webViewSettings2.allowContentAccess : false, ((-131073) & 16) != 0 ? webViewSettings2.allowUniversalAccessFromFileURLs : false, ((-131073) & 32) != 0 ? webViewSettings2.allowFileAccessFromFileURLs : false, ((-131073) & 64) != 0 ? webViewSettings2.builtInZoomControls : false, ((-131073) & 128) != 0 ? webViewSettings2.displayZoomControls : false, ((-131073) & 256) != 0 ? webViewSettings2.useWideViewPort : false, ((-131073) & 512) != 0 ? webViewSettings2.loadWithOverviewMode : false, ((-131073) & 1024) != 0 ? webViewSettings2.cacheMode : 0, ((-131073) & 2048) != 0 ? webViewSettings2.mixedContentMode : 0, ((-131073) & 4096) != 0 ? webViewSettings2.userAgent : null, ((-131073) & 8192) != 0 ? webViewSettings2.textZoom : 0, ((-131073) & 16384) != 0 ? webViewSettings2.geolocationEnabled : zBooleanValue, ((-131073) & 32768) != 0 ? webViewSettings2.pullToRefresh : false, ((-131073) & 65536) != 0 ? webViewSettings2.noInternetDialog : false, ((-131073) & 131072) != 0 ? webViewSettings2.loadingIndicator : false, ((-131073) & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.backHistoryNavigation : false, ((-131073) & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.exitConfirmationDialog : false, ((-131073) & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.bridgeOwnOriginOnly : false, ((-131073) & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.openExternalPdfs : null, ((-131073) & 4194304) != 0 ? webViewSettings2.splashEnabled : false, ((-131073) & 8388608) != 0 ? webViewSettings2.splashBgColor : null, ((-131073) & 16777216) != 0 ? webViewSettings2.splashFadeOut : false, ((-131073) & 33554432) != 0 ? webViewSettings2.splashLoaderStyle : null, ((-131073) & 67108864) != 0 ? webViewSettings2.splashIconSize : 0, ((-131073) & 134217728) != 0 ? webViewSettings2.splashIconRadius : 0, ((-131073) & 268435456) != 0 ? webViewSettings2.splashLoaderSize : 0, ((-131073) & PKIFailureInfo.duplicateCertReq) != 0 ? webViewSettings2.splashSpacing : 0, ((-131073) & 1073741824) != 0 ? webViewSettings2.splashDuration : 0, ((-131073) & PKIFailureInfo.systemUnavail) != 0 ? webViewSettings2.splashLoaderThickness : 0, (4194303 & 1) != 0 ? webViewSettings2.splashFadeDuration : 0, (4194303 & 2) != 0 ? webViewSettings2.splashLoaderColor : null, (4194303 & 4) != 0 ? webViewSettings2.splashFullScreen : false, (4194303 & 8) != 0 ? webViewSettings2.splashHideLoader : false, (4194303 & 16) != 0 ? webViewSettings2.colorMode : null, (4194303 & 32) != 0 ? webViewSettings2.webBackgroundColor : null, (4194303 & 64) != 0 ? webViewSettings2.statusBarColor : null, (4194303 & 128) != 0 ? webViewSettings2.statusBarAlpha : 0, (4194303 & 256) != 0 ? webViewSettings2.statusBarIcons : null, (4194303 & 512) != 0 ? webViewSettings2.navBarColor : null, (4194303 & 1024) != 0 ? webViewSettings2.navBarAlpha : 0, (4194303 & 2048) != 0 ? webViewSettings2.navBarIcons : null, (4194303 & 4096) != 0 ? webViewSettings2.pdfScrollMode : null, (4194303 & 8192) != 0 ? webViewSettings2.pdfNightMode : null, (4194303 & 16384) != 0 ? webViewSettings2.pdfRememberPage : false, (4194303 & 32768) != 0 ? webViewSettings2.pdfShowToolbar : false, (4194303 & 65536) != 0 ? webViewSettings2.pdfShowPageIndicator : false, (4194303 & 131072) != 0 ? webViewSettings2.pdfFastScroll : false, (4194303 & PKIFailureInfo.transactionIdInUse) != 0 ? webViewSettings2.pdfZoomEnabled : false, (4194303 & PKIFailureInfo.signerNotTrusted) != 0 ? webViewSettings2.pdfBookmarks : false, (4194303 & PKIFailureInfo.badCertTemplate) != 0 ? webViewSettings2.pdfAllowExport : false, (4194303 & PKIFailureInfo.badSenderNonce) != 0 ? webViewSettings2.pdfStartPage : 0));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG10);
                }
                jVar2.B();
                b8.F(strC11, geolocationEnabled, (eh.l) objG10, this.f9044a, jVar2, 0, 0);
                String strC12 = f3.q.c(R.string.editor_label_cache_mode, jVar2);
                t2.l0 l0Var2 = ((t0.nf) jVar2.f(e2Var)).f26548k;
                long j10 = ((t0.e2) jVar2.f(e2Var2)).f25771q;
                float f10 = 8;
                d.a aVar = d.a.f1143b;
                t0.ff.b(strC12, androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar2, 48, 0, 65528);
                List listJ = qg.p.j(new pg.n(0, f3.q.c(R.string.editor_cache_default, jVar2)), new pg.n(1, f3.q.c(R.string.editor_cache_else_network, jVar2)), new pg.n(2, f3.q.c(R.string.editor_cache_no_cache, jVar2)), new pg.n(3, f3.q.c(R.string.editor_cache_only, jVar2)));
                jVar2.L(724251593);
                Object objG11 = jVar2.g();
                if (objG11 == obj) {
                    objG11 = bg.b.h(Boolean.FALSE);
                    jVar2.C(objG11);
                }
                final x0.n1 n1Var = (x0.n1) objG11;
                jVar2.B();
                boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
                jVar2.L(724255960);
                boolean zC = jVar2.c(z10);
                Object objG12 = jVar2.g();
                if (zC || objG12 == obj) {
                    objG12 = new eh.l() { // from class: f9.ff
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            ((Boolean) obj2).getClass();
                            if (z10) {
                                n1Var.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG12);
                }
                jVar2.B();
                t0.o3.a(zBooleanValue, (eh.l) objG12, null, f1.c.b(-2137790638, new uf(this.f9046c, this.f9047d, listJ, n1Var, this.f9044a), jVar2), jVar2, 3072);
                t0.ff.b(f3.q.c(R.string.editor_label_mixed_content, jVar2), androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((t0.e2) jVar2.f(e2Var2)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(e2Var)).f26548k, jVar2, 48, 0, 65528);
                List listJ2 = qg.p.j(new pg.n(0, f3.q.c(R.string.editor_mixed_never, jVar2)), new pg.n(1, f3.q.c(R.string.editor_mixed_always, jVar2)), new pg.n(2, f3.q.c(R.string.editor_mixed_compatibility, jVar2)));
                jVar2.L(724312905);
                Object objG13 = jVar2.g();
                if (objG13 == obj) {
                    objG13 = bg.b.h(Boolean.FALSE);
                    jVar2.C(objG13);
                }
                final x0.n1 n1Var2 = (x0.n1) objG13;
                jVar2.B();
                boolean zBooleanValue2 = ((Boolean) n1Var2.getValue()).booleanValue();
                jVar2.L(724317272);
                boolean zC2 = jVar2.c(z10);
                Object objG14 = jVar2.g();
                if (zC2 || objG14 == obj) {
                    objG14 = new eh.l() { // from class: f9.gf
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            ((Boolean) obj2).getClass();
                            if (z10) {
                                n1Var2.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG14);
                }
                jVar2.B();
                t0.o3.a(zBooleanValue2, (eh.l) objG14, null, f1.c.b(-1919462405, new ag(this.f9046c, this.f9047d, listJ2, n1Var2, this.f9044a), jVar2), jVar2, 3072);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w.a f9048a;

        public d(w.a aVar) {
            this.f9048a = aVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(d.a.f1143b, 12);
                z.q qVarA = z.o.a(z.b.h(6), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                t0.ff.b(f3.q.c(R.string.editor_html_integrity_title, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26546i, jVar2, 196608, 0, 65498);
                jVar2.L(1248964394);
                w.a aVar2 = this.f9048a;
                Iterator<T> it = aVar2.f16909a.iterator();
                while (it.hasNext()) {
                    b8.o((String) it.next(), true, jVar2, 48);
                }
                jVar2.B();
                jVar2.L(1248968107);
                Iterator<T> it2 = aVar2.f16910b.iterator();
                while (it2.hasNext()) {
                    b8.o((String) it2.next(), false, jVar2, 48);
                }
                jVar2.B();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public /* synthetic */ class d0 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9049a;

        static {
            int[] iArr = new int[ProjectFile.Type.values().length];
            try {
                iArr[ProjectFile.Type.HTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProjectFile.Type.CSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProjectFile.Type.JS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProjectFile.Type.ASSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9049a = iArr;
        }
    }

    public static final class e implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9050a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f9051b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9052c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9053d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f9054e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9055f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9056g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f9057h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ eh.l<Long, pg.f0> f9058j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List<KeystoreEntity> f9059k;

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, boolean z10, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, eh.l<? super String, pg.f0> lVar, eh.a<pg.f0> aVar3, x0.n1<Boolean> n1Var, String str2, eh.l<? super Long, pg.f0> lVar2, List<KeystoreEntity> list) {
            this.f9050a = str;
            this.f9051b = z10;
            this.f9052c = aVar;
            this.f9053d = aVar2;
            this.f9054e = lVar;
            this.f9055f = aVar3;
            this.f9056g = n1Var;
            this.f9057h = str2;
            this.f9058j = lVar2;
            this.f9059k = list;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            Object obj;
            d.a aVar;
            float f10;
            String str;
            z.r EditorCard = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.ff.b(f3.q.c(R.string.editor_section_output, jVar2), null, b3.l.a(jVar2).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).f26545h, jVar2, 196608, 0, 65498);
                String strC = f3.q.c(R.string.editor_label_format, jVar2);
                t2.l0 l0Var = b3.l.b(jVar2).f26548k;
                x2.p pVar = x2.p.f32031d;
                t0.ff.b(strC, null, b3.l.a(jVar2).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                x0.j jVar3 = jVar2;
                d.a aVar2 = d.a.f1143b;
                float f11 = 12;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), h0.f.a(f11)), b3.l.a(jVar3).G, q1.y1.f21750a);
                z.m1 m1VarA = z.k1.a(z.b.f34449f, d.a.f14611j, jVar3, 6);
                int iD = jVar3.D();
                x0.a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar3);
                } else {
                    jVar3.z();
                }
                ph.v1.j(g.a.f13867f, m1VarA, jVar3);
                ph.v1.j(g.a.f13866e, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar3);
                String strC2 = f3.q.c(R.string.editor_format_apk, jVar3);
                String str2 = this.f9050a;
                boolean zA = kotlin.jvm.internal.r.a(str2, ProjectKind.APK);
                jVar3.L(-1355528223);
                final eh.l<String, pg.f0> lVar = this.f9054e;
                boolean zK = jVar3.K(lVar);
                Object objG = jVar3.g();
                Object obj2 = j.a.f31715a;
                if (zK || objG == obj2) {
                    objG = new pa(lVar, 0);
                    jVar3.C(objG);
                }
                eh.a aVar4 = (eh.a) objG;
                jVar3.B();
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                b8.k(strC2, zA, aVar4, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, jVar3, 0, 16);
                String strC3 = f3.q.c(R.string.editor_format_aab, jVar3);
                boolean zA2 = kotlin.jvm.internal.r.a(str2, "aab");
                jVar3.L(-1355520987);
                final boolean z10 = this.f9051b;
                boolean zC = jVar3.c(z10) | jVar3.K(lVar);
                final eh.a<pg.f0> aVar5 = this.f9055f;
                boolean zK2 = zC | jVar3.K(aVar5);
                Object objG2 = jVar3.g();
                if (zK2 || objG2 == obj2) {
                    objG2 = new eh.a() { // from class: f9.qa
                        @Override // eh.a
                        public final Object invoke() {
                            if (z10) {
                                lVar.invoke("aab");
                            } else {
                                aVar5.invoke();
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar3.C(objG2);
                }
                eh.a aVar6 = (eh.a) objG2;
                jVar3.B();
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                b8.k(strC3, zA2, aVar6, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true, jVar3, 24576, 0);
                jVar3.H();
                jVar3.L(674504879);
                if (!kotlin.jvm.internal.r.a(str2, "aab") || z10) {
                    obj = obj2;
                    aVar = aVar2;
                    f10 = f11;
                    str = str2;
                } else {
                    f10 = f11;
                    obj = obj2;
                    str = str2;
                    aVar = aVar2;
                    t0.ff.b(f3.q.c(R.string.editor_aab_pro_hint, jVar3), null, b3.l.a(jVar3).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26549l, jVar3, 0, 0, 65530);
                    jVar3 = jVar3;
                }
                jVar3.B();
                float f12 = 8;
                x0.j jVar4 = jVar3;
                t0.ff.b(pd.d.a(aVar, f12, jVar3, R.string.editor_label_keystore, jVar3), null, b3.l.a(jVar3).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar3).f26548k, jVar4, 196608, 0, 65498);
                x0.n1<Boolean> n1Var = this.f9056g;
                boolean zBooleanValue = n1Var.getValue().booleanValue();
                jVar4.L(674524641);
                Object objG3 = jVar4.g();
                if (objG3 == obj) {
                    objG3 = new ra(n1Var, 0);
                    jVar4.C(objG3);
                }
                jVar4.B();
                t0.o3.a(zBooleanValue, (eh.l) objG3, null, f1.c.b(150681861, new ya(this.f9058j, this.f9057h, this.f9059k, n1Var), jVar4), jVar4, 3120);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f12), jVar4);
                t0.x0.c(this.f9052c, androidx.compose.foundation.layout.g.d(aVar, 1.0f), false, h0.f.a(f10), null, null, null, f9.e.P, jVar4, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f12), jVar4);
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 54);
                h0.e eVarA = h0.f.a(16);
                z.g1 g1Var = t0.m0.f26400a;
                t0.x0.a(this.f9053d, dVarF, false, eVarA, t0.m0.a(b3.l.a(jVar4).f25751a, 0L, 0L, jVar4, 14), null, null, null, f1.c.b(1202476651, new za(str), jVar4), jVar4, 805306416, 484);
                t0.ff.b(f3.q.c(R.string.editor_build_time_warning, jVar4), androidx.compose.foundation.layout.g.d(aVar, 1.0f), b3.l.a(jVar4).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, b3.l.b(jVar4).f26549l, jVar4, 48, 0, 65016);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map<String, Set<String>> f9060a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f9061b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<i5> f9062c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9063d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f9064e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ eh.p<String, Boolean, pg.f0> f9065f;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Map<String, ? extends Set<String>> map, List<String> list, List<i5> list2, eh.a<pg.f0> aVar, Context context, eh.p<? super String, ? super Boolean, pg.f0> pVar) {
            this.f9060a = map;
            this.f9061b = list;
            this.f9062c = list2;
            this.f9063d = aVar;
            this.f9064e = context;
            this.f9065f = pVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            d.a aVar;
            Map<String, Set<String>> map;
            List<String> list;
            Object obj;
            final boolean z10;
            final boolean z11;
            final i5 i5Var;
            boolean z12;
            eh.l lVar;
            t0.i1 i1VarA;
            long jC;
            long jC2;
            Map<String, Set<String>> map2;
            int i10;
            long jC3;
            long j10;
            long j11;
            int i11;
            int i12;
            long j12;
            z.r EditorCard = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                String strC = f3.q.c(R.string.editor_section_permissions, jVar2);
                x0.s3 s3Var = t0.of.f26647a;
                t2.l0 l0Var = ((t0.nf) jVar2.f(s3Var)).f26545h;
                x2.p pVar = x2.p.f32033f;
                x0.s3 s3Var2 = t0.f2.f25858a;
                t0.ff.b(strC, null, ((t0.e2) jVar2.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                t0.ff.b(f3.q.c(R.string.editor_permissions_description, jVar2), null, ((t0.e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 0, 65530);
                f fVar = this;
                x0.j jVar3 = jVar2;
                Map<String, Set<String>> map3 = fVar.f9060a;
                Set<String> setKeySet = map3.keySet();
                List<String> list2 = fVar.f9061b;
                Set setC = qg.n0.c(setKeySet, qg.x.h0(list2));
                jVar3.L(-1836586234);
                boolean zIsEmpty = setC.isEmpty();
                d.a aVar2 = d.a.f1143b;
                if (zIsEmpty) {
                    aVar = aVar2;
                    map = map3;
                    list = list2;
                } else {
                    aVar = aVar2;
                    map = map3;
                    list = list2;
                    t0.md.a(androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), h0.f.a(14), q1.b1.c(0.12f, ((t0.e2) jVar3.f(s3Var2)).f25751a), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-585188741, new cb(setC, fVar.f9063d), jVar3), jVar3, 12582918, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                }
                jVar3.B();
                for (final i5 i5Var2 : fVar.f9062c) {
                    final boolean z13 = i5Var2.f9790d;
                    String str = i5Var2.f9787a;
                    boolean z14 = list.contains(str) || z13;
                    androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                    jVar3.L(-242401030);
                    boolean zC = jVar3.c(z13);
                    final Context context = fVar.f9064e;
                    boolean zL = zC | jVar3.l(context);
                    final eh.p<String, Boolean, pg.f0> pVar2 = fVar.f9065f;
                    boolean zK = zL | jVar3.K(pVar2) | jVar3.K(i5Var2) | jVar3.c(z14);
                    Object objG = jVar3.g();
                    j.a.C0321a c0321a = j.a.f31715a;
                    if (zK || objG == c0321a) {
                        z10 = z14;
                        obj = new eh.a() { // from class: f9.ab
                            @Override // eh.a
                            public final Object invoke() {
                                if (z13) {
                                    Context context2 = context;
                                    org.bouncycastle.crypto.engines.a.b(context2, R.string.editor_permission_url_required_toast, context2, 0);
                                } else {
                                    pVar2.invoke(i5Var2.f9787a, Boolean.valueOf(!z10));
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        z11 = z13;
                        i5Var = i5Var2;
                        jVar3.C(obj);
                    } else {
                        i5Var = i5Var2;
                        obj = objG;
                        z10 = z14;
                        z11 = z13;
                    }
                    jVar3.B();
                    androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD, false, null, null, (eh.a) obj, 7), CropImageView.DEFAULT_ASPECT_RATIO, 6, 1);
                    z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar3, 48);
                    int iD = jVar3.D();
                    x0.a2 a2VarY = jVar3.y();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar3);
                    i2.g.f13861o.getClass();
                    e0.a aVar3 = g.a.f13863b;
                    if (jVar3.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        jVar3.w(aVar3);
                    } else {
                        jVar3.z();
                    }
                    boolean z15 = z10;
                    g.a.b bVar = g.a.f13867f;
                    ph.v1.j(bVar, m1VarA, jVar3);
                    g.a.d dVar = g.a.f13866e;
                    ph.v1.j(dVar, a2VarY, jVar3);
                    g.a.C0128a c0128a = g.a.f13868g;
                    d.a aVar4 = aVar;
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                        l9.i.a(iD, jVar3, iD, c0128a);
                    }
                    g.a.c cVar = g.a.f13865d;
                    ph.v1.j(cVar, dVarC, jVar3);
                    jVar3.L(1967959891);
                    boolean zC2 = jVar3.c(z11) | jVar3.l(context) | jVar3.K(pVar2) | jVar3.K(i5Var);
                    Object objG2 = jVar3.g();
                    if (zC2 || objG2 == c0321a) {
                        objG2 = new eh.l() { // from class: f9.bb
                            @Override // eh.l
                            public final Object invoke(Object obj2) {
                                Boolean bool = (Boolean) obj2;
                                bool.booleanValue();
                                if (z11) {
                                    Context context2 = context;
                                    org.bouncycastle.crypto.engines.a.b(context2, R.string.editor_permission_url_required_toast, context2, 0);
                                } else {
                                    pVar2.invoke(i5Var.f9787a, bool);
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        jVar3.C(objG2);
                    }
                    eh.l lVar2 = (eh.l) objG2;
                    jVar3.B();
                    boolean z16 = !z11;
                    if (z11) {
                        jVar3.L(877740301);
                        x0.s3 s3Var3 = t0.f2.f25858a;
                        z12 = z11;
                        lVar = lVar2;
                        long jC4 = q1.b1.c(0.5f, ((t0.e2) jVar3.f(s3Var3)).f25751a);
                        long j13 = q1.b1.f21654h;
                        t0.i1 i1VarA2 = t0.j1.a((t0.e2) jVar3.f(s3Var3));
                        long j14 = q1.b1.f21653g;
                        if (j13 != 16) {
                            j10 = jC4;
                            j11 = j13;
                        } else {
                            j10 = jC4;
                            j11 = i1VarA2.f26043a;
                        }
                        int i13 = (j14 > 16L ? 1 : (j14 == 16L ? 0 : -1));
                        long j15 = i13 != 0 ? j14 : i1VarA2.f26044b;
                        long j16 = j13 != 16 ? j13 : i1VarA2.f26045c;
                        long j17 = i13 != 0 ? j14 : i1VarA2.f26046d;
                        int i14 = (j10 > 16L ? 1 : (j10 == 16L ? 0 : -1));
                        if (i14 != 0) {
                            i11 = i13;
                            i12 = i14;
                            j12 = j10;
                        } else {
                            i11 = i13;
                            i12 = i14;
                            j12 = i1VarA2.f26047e;
                        }
                        i1VarA = new t0.i1(j11, j15, j16, j17, j12, i11 != 0 ? j14 : i1VarA2.f26048f, j13 != 16 ? j13 : i1VarA2.f26049g, j13 != 16 ? j13 : i1VarA2.f26050h, j13 != 16 ? j13 : i1VarA2.f26051i, i12 != 0 ? j10 : i1VarA2.f26052j, j13 != 16 ? j13 : i1VarA2.f26053k, j13 != 16 ? j13 : i1VarA2.f26054l);
                        jVar3.B();
                    } else {
                        z12 = z11;
                        lVar = lVar2;
                        jVar3.L(1967985560);
                        i1VarA = t0.j1.a((t0.e2) jVar3.f(t0.f2.f25858a));
                        jVar3.B();
                    }
                    boolean z17 = z12;
                    x0.j jVar4 = jVar3;
                    t0.m1.a(z15, lVar, null, z16, i1VarA, jVar4, 0, 36);
                    if (1.0f <= 0.0d) {
                        a0.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(new LayoutWeightElement(1.0f, true), 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar4, 0);
                    int iD2 = jVar4.D();
                    x0.a2 a2VarY2 = jVar4.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, jVar4);
                    if (jVar4.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar4.r();
                    if (jVar4.m()) {
                        jVar4.w(aVar3);
                    } else {
                        jVar4.z();
                    }
                    ph.v1.j(bVar, qVarA, jVar4);
                    ph.v1.j(dVar, a2VarY2, jVar4);
                    if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar4, iD2, c0128a);
                    }
                    ph.v1.j(cVar, dVarC2, jVar4);
                    String str2 = i5Var.f9788b;
                    t2.l0 l0Var2 = b3.l.b(jVar4).f26548k;
                    if (z17) {
                        jVar4.L(-986248603);
                        jC = q1.b1.c(0.5f, b3.l.a(jVar4).f25771q);
                        jVar4.B();
                    } else {
                        jVar4.L(-986134120);
                        jC = b3.l.a(jVar4).f25771q;
                        jVar4.B();
                    }
                    List<String> list3 = list;
                    Map<String, Set<String>> map4 = map;
                    t0.ff.b(str2, null, jC, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar4, 0, 0, 65530);
                    String str3 = i5Var.f9789c;
                    t2.l0 l0Var3 = b3.l.b(jVar4).f26549l;
                    if (z17) {
                        jVar4.L(-985832738);
                        jC2 = q1.b1.c(0.5f, b3.l.a(jVar4).f25773s);
                        jVar4.B();
                    } else {
                        jVar4.L(-985711311);
                        jC2 = b3.l.a(jVar4).f25773s;
                        jVar4.B();
                    }
                    t0.ff.b(str3, null, jC2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var3, jVar4, 0, 0, 65530);
                    x0.j jVar5 = jVar4;
                    Set<String> set = map4.get(str);
                    jVar5.L(106755953);
                    if (set == null) {
                        map2 = map4;
                        i10 = 2;
                    } else {
                        map2 = map4;
                        i10 = 2;
                        t0.ff.b(f3.q.d(R.string.editor_permission_detected, new Object[]{qg.x.I(set, ", ", null, null, null, 62)}, jVar5), androidx.compose.foundation.layout.f.l(aVar4, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), b3.l.a(jVar5).f25751a, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar5).f26552o, jVar5, 196656, 0, 65496);
                        jVar5 = jVar5;
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                    jVar5.B();
                    String strD = f3.q.d(R.string.editor_permission_full_name_label, new Object[]{str}, jVar5);
                    t2.l0 l0Var4 = b3.l.b(jVar5).f26552o;
                    if (z17) {
                        jVar5.L(-984818201);
                        jC3 = q1.b1.c(0.4f, b3.l.a(jVar5).f25751a);
                        jVar5.B();
                    } else {
                        jVar5.L(-984705113);
                        jC3 = q1.b1.c(0.8f, b3.l.a(jVar5).f25751a);
                        jVar5.B();
                    }
                    x0.j jVar6 = jVar5;
                    t0.ff.b(strD, androidx.compose.foundation.layout.f.l(aVar4, CropImageView.DEFAULT_ASPECT_RATIO, i10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), jC3, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var4, jVar6, 48, 0, 65528);
                    jVar6.H();
                    jVar6.H();
                    fVar = this;
                    jVar3 = jVar6;
                    aVar = aVar4;
                    list = list3;
                    map = map2;
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.q<z.n1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<pg.n<String, String>> f9066a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9067b;

        public g(List<pg.n<String, String>> list, String str) {
            this.f9066a = list;
            this.f9067b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.q
        public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            Object next;
            String str;
            z.n1 OutlinedButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                List<pg.n<String, String>> list = this.f9066a;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.r.a(((pg.n) next).f21469a, this.f9067b)) {
                        break;
                    }
                }
                pg.n nVar = (pg.n) next;
                if (nVar == null || (str = (String) nVar.f21470b) == null) {
                    str = (String) ((pg.n) qg.x.B(list)).f21470b;
                }
                t0.ff.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<pg.n<String, String>> f9068a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f9069b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9070c;

        public h(eh.l lVar, List list, x0.n1 n1Var) {
            this.f9068a = list;
            this.f9069b = lVar;
            this.f9070c = n1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r AppDropdownMenu = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(AppDropdownMenu, "$this$AppDropdownMenu");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                Iterator<T> it = this.f9068a.iterator();
                while (it.hasNext()) {
                    pg.n nVar = (pg.n) it.next();
                    final String str = (String) nVar.f21469a;
                    f1.b bVarB = f1.c.b(1486426201, new eb((String) nVar.f21470b), jVar2);
                    jVar2.L(-299834918);
                    final eh.l<String, pg.f0> lVar = this.f9069b;
                    boolean zK = jVar2.K(lVar) | jVar2.K(str);
                    Object objG = jVar2.g();
                    if (zK || objG == j.a.f31715a) {
                        final x0.n1<Boolean> n1Var = this.f9070c;
                        objG = new eh.a() { // from class: f9.db
                            @Override // eh.a
                            public final Object invoke() {
                                n1Var.setValue(Boolean.FALSE);
                                lVar.invoke(str);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    q8.g.b(bVarB, (eh.a) objG, null, jVar2, 6, 4);
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class i implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9071a;

        public i(eh.a<pg.f0> aVar) {
            this.f9071a = aVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                float f10 = 12;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), f10);
                z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, jVar2, 54);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                w1.d dVarA = p0.t6.a();
                x0.s3 s3Var = t0.f2.f25858a;
                t0.t4.b(dVarA, null, null, ((t0.e2) jVar2.f(s3Var)).f25751a, jVar2, 48, 4);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                String strC = f3.q.c(R.string.editor_pro_feature_title, jVar2);
                x0.s3 s3Var2 = t0.of.f26647a;
                t0.ff.b(strC, null, ((t0.e2) jVar2.f(s3Var)).f25751a, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(s3Var2)).f26548k, jVar2, 196608, 0, 65498);
                t0.ff.b(f3.q.c(R.string.editor_pro_feature_body, jVar2), null, ((t0.e2) jVar2.f(s3Var)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(s3Var2)).f26549l, jVar2, 0, 0, 65530);
                jVar2.H();
                t0.x0.a(this.f9071a, null, false, null, null, null, null, null, f9.e.f9381v0, jVar2, 805306368, 510);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.d f9072a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f9073b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ProjectFile f9074c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9075d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9076e;

        public j(w1.d dVar, long j10, ProjectFile projectFile, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2) {
            this.f9072a = dVar;
            this.f9073b = j10;
            this.f9074c = projectFile;
            this.f9075d = aVar;
            this.f9076e = aVar2;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            j jVar2;
            d.a aVar;
            z.r Card = rVar;
            x0.j jVar3 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar3.s()) {
                jVar3.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                float f10 = 10;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 12, f10);
                z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, jVar3, 54);
                int iD = jVar3.D();
                x0.a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar3);
                } else {
                    jVar3.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, m1VarA, jVar3);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar3);
                t0.t4.b(this.f9072a, null, androidx.compose.foundation.layout.g.n(aVar2, 22), this.f9073b, jVar3, 432, 0);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar3, 0);
                int iD2 = jVar3.D();
                x0.a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar3);
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar3);
                } else {
                    jVar3.z();
                }
                ph.v1.j(bVar, qVarA, jVar3);
                ph.v1.j(dVar, a2VarY2, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar3, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar3);
                ProjectFile projectFile = this.f9074c;
                String name = projectFile.getName();
                x0.s3 s3Var = t0.of.f26647a;
                t2.l0 l0Var = ((t0.nf) jVar3.f(s3Var)).f26548k;
                x2.p pVar = x2.p.f32031d;
                x0.s3 s3Var2 = t0.f2.f25858a;
                t0.ff.b(name, null, ((t0.e2) jVar3.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 1, 0, l0Var, jVar3, 196608, 3072, 57306);
                t0.ff.b(projectFile.getRelativePath(), null, ((t0.e2) jVar3.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((t0.nf) jVar3.f(s3Var)).f26552o, jVar3, 0, 3072, 57338);
                jVar3.H();
                jVar3.L(-1624424157);
                if (projectFile.isEditable()) {
                    aVar = aVar2;
                    jVar2 = this;
                    t0.s4.c(jVar2.f9075d, androidx.compose.foundation.layout.g.n(aVar, 32), false, null, f9.e.B0, jVar3, 196656, 28);
                } else {
                    jVar2 = this;
                    aVar = aVar2;
                }
                jVar3.B();
                t0.s4.c(jVar2.f9076e, androidx.compose.foundation.layout.g.n(aVar, 32), false, null, f9.e.C0, jVar3, 196656, 28);
                jVar3.H();
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$ProjectFileEditDialog$1$1", f = "ProjectEditorScreen.kt", l = {4729}, m = "invokeSuspend")
    public static final class k extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f9077a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9078b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f9079c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ProjectFile f9080d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f9081e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9082f;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$ProjectFileEditDialog$1$1$text$1", f = "ProjectEditorScreen.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super String>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f9083a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProjectFile f9084b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, ProjectFile projectFile, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f9083a = context;
                this.f9084b = projectFile;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f9083a, this.f9084b, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super String> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InputStream inputStreamOpenInputStream;
                String string;
                int i10;
                ProjectFile projectFile = this.f9084b;
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                try {
                    inputStreamOpenInputStream = this.f9083a.getContentResolver().openInputStream(projectFile.getUri());
                } catch (Throwable unused) {
                }
                if (inputStreamOpenInputStream == null) {
                    String path = projectFile.getUri().getPath();
                    if (path != null) {
                        File file = new File(path);
                        if (!file.isFile()) {
                            file = null;
                        }
                        inputStreamOpenInputStream = file != null ? new FileInputStream(file) : null;
                    }
                    return null;
                }
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, mh.a.f18238b), 8192);
                try {
                    char[] cArr = new char[16384];
                    StringBuilder sb = new StringBuilder();
                    while (sb.length() <= 2097152 && (i10 = bufferedReader.read(cArr)) > 0) {
                        sb.append(cArr, 0, i10);
                        if (sb.length() > 2097152) {
                            string = null;
                            break;
                        }
                    }
                    string = sb.toString();
                    bufferedReader.close();
                    return string;
                } finally {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(x0.n1<Boolean> n1Var, Context context, ProjectFile projectFile, x0.n1<String> n1Var2, x0.n1<Boolean> n1Var3, tg.e<? super k> eVar) {
            super(2, eVar);
            this.f9078b = n1Var;
            this.f9079c = context;
            this.f9080d = projectFile;
            this.f9081e = n1Var2;
            this.f9082f = n1Var3;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new k(this.f9078b, this.f9079c, this.f9080d, this.f9081e, this.f9082f, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f9077a;
            x0.n1<Boolean> n1Var = this.f9078b;
            if (i10 == 0) {
                pg.q.b(obj);
                if (n1Var.getValue().booleanValue()) {
                    return pg.f0.f21461a;
                }
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(this.f9079c, this.f9080d, null);
                this.f9077a = 1;
                obj = ph.h.e(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            String str = (String) obj;
            if (str != null) {
                this.f9081e.setValue(str);
                n1Var.setValue(Boolean.TRUE);
            } else {
                this.f9082f.setValue(Boolean.TRUE);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class l implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f9085a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f9086b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9087c;

        /* JADX WARN: Multi-variable type inference failed */
        public l(eh.l<? super String, pg.f0> lVar, x0.n1<String> n1Var, x0.n1<Boolean> n1Var2) {
            this.f9085a = lVar;
            this.f9086b = n1Var;
            this.f9087c = n1Var2;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(121381116);
                eh.l<String, pg.f0> lVar = this.f9085a;
                boolean zK = jVar2.K(lVar);
                x0.n1<String> n1Var = this.f9086b;
                boolean zK2 = zK | jVar2.K(n1Var);
                Object objG = jVar2.g();
                if (zK2 || objG == j.a.f31715a) {
                    objG = new androidx.credentials.playservices.controllers.identitycredentials.getcredential.b(1, lVar, n1Var);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, this.f9087c.getValue().booleanValue(), null, null, null, f9.e.D0, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class m implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9088a;

        public m(eh.a<pg.f0> aVar) {
            this.f9088a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f9088a, null, false, null, null, null, f9.e.E0, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class n implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ProjectFile f9089a;

        public n(ProjectFile projectFile) {
            this.f9089a = projectFile;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.ff.b(this.f9089a.getName(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class o implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f9090a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9091b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9092c;

        public o(x0.n1<String> n1Var, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3) {
            this.f9090a = n1Var;
            this.f9091b = n1Var2;
            this.f9092c = n1Var3;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else if (this.f9091b.getValue().booleanValue()) {
                jVar2.L(-533106537);
                t0.ff.b(f3.q.c(R.string.editor_file_too_large, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26548k, jVar2, 0, 0, 65534);
                jVar2.B();
            } else {
                boolean zBooleanValue = this.f9092c.getValue().booleanValue();
                d.a aVar = d.a.f1143b;
                if (zBooleanValue) {
                    jVar2.L(-532579289);
                    x0.n1<String> n1Var = this.f9090a;
                    String value = n1Var.getValue();
                    androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.g.g(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 180, 400);
                    jVar2.L(121370521);
                    boolean zK = jVar2.K(n1Var);
                    Object objG = jVar2.g();
                    if (zK || objG == j.a.f31715a) {
                        objG = new vd(n1Var, 0);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    t0.w9.a(value, (eh.l) objG, dVarG, false, false, null, null, null, null, null, null, null, false, null, null, null, false, 16, 6, null, null, jVar2, 384, 905969664, 7602168);
                    jVar2.B();
                } else {
                    jVar2.L(-532891738);
                    androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.g.h(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                    int iD = jVar2.D();
                    x0.a2 a2VarY = jVar2.y();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                    i2.g.f13861o.getClass();
                    e0.a aVar2 = g.a.f13863b;
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar2);
                    } else {
                        jVar2.z();
                    }
                    ph.v1.j(g.a.f13867f, l0VarD, jVar2);
                    ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                        l9.i.a(iD, jVar2, iD, c0128a);
                    }
                    ph.v1.j(g.a.f13865d, dVarC, jVar2);
                    t0.z9.a(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 31, 0L, 0L, null, jVar2);
                    jVar2.H();
                    jVar2.B();
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class p implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<ProjectFile> f9093a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f9094b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f0.b f9095c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9096d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.l<ProjectFile, pg.f0> f9097e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ eh.l<ProjectFile, pg.f0> f9098f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9099g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9100h;

        /* JADX WARN: Multi-variable type inference failed */
        public p(List<ProjectFile> list, boolean z10, f0.b bVar, String str, eh.l<? super ProjectFile, pg.f0> lVar, eh.l<? super ProjectFile, pg.f0> lVar2, eh.a<pg.f0> aVar, x0.n1<Boolean> n1Var) {
            this.f9093a = list;
            this.f9094b = z10;
            this.f9095c = bVar;
            this.f9096d = str;
            this.f9097e = lVar;
            this.f9098f = lVar2;
            this.f9099g = aVar;
            this.f9100h = n1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            g.a.d dVar;
            String str;
            long j10;
            boolean z10;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 16);
                float f10 = 12;
                b.i iVarH = z.b.h(f10);
                f.a aVar2 = d.a.f14614m;
                z.q qVarA = z.o.a(iVarH, aVar2, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar2);
                g.a.d dVar2 = g.a.f13866e;
                ph.v1.j(dVar2, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                b.g gVar = z.b.f34450g;
                f.b bVar2 = d.a.f14612k;
                z.m1 m1VarA = z.k1.a(gVar, bVar2, jVar2, 54);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA, jVar2);
                ph.v1.j(dVar2, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                float f11 = 8;
                z.m1 m1VarA2 = z.k1.a(z.b.h(f11), bVar2, jVar2, 54);
                int iD3 = jVar2.D();
                x0.a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA2, jVar2);
                ph.v1.j(dVar2, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar2);
                w1.d dVarA = p0.k4.a();
                x0.s3 s3Var = t0.f2.f25858a;
                t0.t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, 20), ((t0.e2) jVar2.f(s3Var)).f25751a, jVar2, 432, 0);
                x0.s3 s3Var2 = t0.of.f26647a;
                t0.ff.b(this.f9096d, null, ((t0.e2) jVar2.f(s3Var)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(s3Var2)).f26546i, jVar2, 196608, 0, 65498);
                jVar2.H();
                List<ProjectFile> list = this.f9093a;
                t0.ff.b(f3.q.d(R.string.editor_file_count, new Object[]{Integer.valueOf(list.size())}, jVar2), null, ((t0.e2) jVar2.f(s3Var)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(s3Var2)).f26552o, jVar2, 0, 0, 65530);
                jVar2.H();
                jVar2.L(-1099006409);
                boolean zK = jVar2.K(list);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK || objG == obj) {
                    Set<String> set = l9.o0.f16861a;
                    ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ProjectFile) it.next()).getRelativePath());
                    }
                    objG = l9.o0.a(arrayList);
                    jVar2.C(objG);
                }
                String str2 = (String) objG;
                jVar2.B();
                z.q qVarA2 = z.o.a(z.b.h(2), aVar2, jVar2, 6);
                int iD4 = jVar2.D();
                x0.a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar4 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar4);
                } else {
                    jVar2.z();
                }
                g.a.b bVar3 = g.a.f13867f;
                ph.v1.j(bVar3, qVarA2, jVar2);
                g.a.d dVar3 = g.a.f13866e;
                ph.v1.j(dVar3, a2VarY4, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a2);
                }
                g.a.c cVar2 = g.a.f13865d;
                ph.v1.j(cVar2, dVarC4, jVar2);
                jVar2.L(-385630588);
                String strD = str2 == null ? null : f3.q.d(R.string.editor_folder_entry_page, new Object[]{str2}, jVar2);
                jVar2.B();
                jVar2.L(-385630854);
                if (strD == null) {
                    strD = f3.q.c(R.string.editor_folder_no_entry, jVar2);
                }
                jVar2.B();
                x0.s3 s3Var3 = t0.of.f26647a;
                t2.l0 l0Var = ((t0.nf) jVar2.f(s3Var3)).f26548k;
                x2.p pVar = x2.p.f32031d;
                if (str2 == null) {
                    jVar2.L(-385620020);
                    dVar = dVar3;
                    str = str2;
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25777w;
                } else {
                    dVar = dVar3;
                    str = str2;
                    jVar2.L(-385618832);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q;
                }
                jVar2.B();
                g.a.d dVar4 = dVar;
                String str3 = str;
                t0.ff.b(strD, null, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                x0.j jVar3 = jVar2;
                jVar3.L(-385617085);
                if (str3 != null && !str3.equals("index.html")) {
                    t0.ff.b(f3.q.c(R.string.editor_folder_entry_redirect, jVar3), null, ((t0.e2) jVar3.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar3.f(s3Var3)).f26549l, jVar3, 0, 0, 65530);
                    jVar3 = jVar3;
                }
                jVar3.B();
                jVar3.H();
                jVar3.L(-1098974470);
                boolean z11 = this.f9094b;
                if (z11) {
                    b8.j(this.f9095c, jVar3, 0);
                }
                jVar3.B();
                int size = list.size();
                jVar3.L(-1098963132);
                boolean zI = jVar3.i(size);
                Object objG2 = jVar3.g();
                if (zI || objG2 == obj) {
                    objG2 = bg.b.h(50);
                    jVar3.C(objG2);
                }
                x0.n1 n1Var = (x0.n1) objG2;
                jVar3.B();
                List<ProjectFile> listW = qg.x.W(list, ((Number) n1Var.getValue()).intValue());
                z.q qVarA3 = z.o.a(z.b.h(f11), aVar2, jVar3, 6);
                int iD5 = jVar3.D();
                x0.a2 a2VarY5 = jVar3.y();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar, jVar3);
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar4);
                } else {
                    jVar3.z();
                }
                ph.v1.j(bVar3, qVarA3, jVar3);
                ph.v1.j(dVar4, a2VarY5, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD5))) {
                    l9.i.a(iD5, jVar3, iD5, c0128a2);
                }
                ph.v1.j(cVar2, dVarC5, jVar3);
                jVar3.L(-385587045);
                for (final ProjectFile projectFile : listW) {
                    jVar3.L(-125987110);
                    eh.l<ProjectFile, pg.f0> lVar = this.f9097e;
                    boolean zK2 = jVar3.K(lVar) | jVar3.l(projectFile);
                    Object objG3 = jVar3.g();
                    if (zK2 || objG3 == obj) {
                        objG3 = new b9.g3(1, lVar, projectFile);
                        jVar3.C(objG3);
                    }
                    eh.a aVar5 = (eh.a) objG3;
                    jVar3.B();
                    jVar3.L(-125985284);
                    final eh.l<ProjectFile, pg.f0> lVar2 = this.f9098f;
                    boolean zK3 = jVar3.K(lVar2) | jVar3.l(projectFile);
                    Object objG4 = jVar3.g();
                    if (zK3 || objG4 == obj) {
                        objG4 = new eh.a() { // from class: f9.wd
                            @Override // eh.a
                            public final Object invoke() {
                                lVar2.invoke(projectFile);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar3.C(objG4);
                    }
                    jVar3.B();
                    b8.u(projectFile, aVar5, (eh.a) objG4, jVar3, ProjectFile.$stable);
                }
                jVar3.B();
                int size2 = list.size() - listW.size();
                jVar3.L(-385576532);
                if (size2 > 0) {
                    jVar3.L(-385574354);
                    boolean zK4 = jVar3.K(n1Var);
                    Object objG5 = jVar3.g();
                    if (zK4 || objG5 == obj) {
                        objG5 = new xd(n1Var, 0);
                        jVar3.C(objG5);
                    }
                    jVar3.B();
                    x0.j jVar4 = jVar3;
                    z10 = true;
                    t0.x0.d((eh.a) objG5, androidx.compose.foundation.layout.g.d(aVar, 1.0f), false, null, null, null, f1.c.b(-1105148451, new zd(size2), jVar3), jVar4, 805306416, 508);
                    jVar3 = jVar4;
                } else {
                    z10 = true;
                }
                jVar3.B();
                jVar3.H();
                androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                z.m1 m1VarA3 = z.k1.a(z.b.h(f11), d.a.f14611j, jVar3, 6);
                int iD6 = jVar3.D();
                x0.a2 a2VarY6 = jVar3.y();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarD2, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar6 = g.a.f13863b;
                if (jVar3.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar6);
                } else {
                    jVar3.z();
                }
                ph.v1.j(g.a.f13867f, m1VarA3, jVar3);
                ph.v1.j(g.a.f13866e, a2VarY6, jVar3);
                g.a.C0128a c0128a3 = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD6))) {
                    l9.i.a(iD6, jVar3, iD6, c0128a3);
                }
                ph.v1.j(g.a.f13865d, dVarC6, jVar3);
                boolean z12 = !z11;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                t0.x0.c(this.f9099g, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z10), z12, h0.f.a(f10), null, null, null, f9.e.f9383w0, jVar3, 805306368, 496);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z10);
                h0.e eVarA = h0.f.a(f10);
                jVar3.L(-385536001);
                Object objG6 = jVar3.g();
                if (objG6 == obj) {
                    final x0.n1<Boolean> n1Var2 = this.f9100h;
                    objG6 = new eh.a() { // from class: f9.yd
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var2.setValue(Boolean.TRUE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar3.C(objG6);
                }
                jVar3.B();
                t0.x0.c((eh.a) objG6, layoutWeightElement, z12, eVarA, null, null, null, f9.e.f9385x0, jVar3, 805306374, 496);
                x0.j jVar5 = jVar3;
                jVar5.H();
                jVar5.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class q implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9101a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9102b;

        public q(eh.a<pg.f0> aVar, x0.n1<Boolean> n1Var) {
            this.f9101a = aVar;
            this.f9102b = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(402228746);
                eh.a<pg.f0> aVar = this.f9101a;
                boolean zK = jVar2.K(aVar);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new b9.k3(aVar, this.f9102b, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, f9.e.f9387y0, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class r implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f9103a;

        public r(x0.n1<Boolean> n1Var) {
            this.f9103a = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(402238722);
                Object objG = jVar2.g();
                if (objG == j.a.f31715a) {
                    objG = new z5(this.f9103a, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, f9.e.f9389z0, jVar2, 805306374, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<ProjectFile> f9104a;

        public s(List<ProjectFile> list) {
            this.f9104a = list;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.ff.b(f3.q.d(R.string.editor_folder_remove_message, new Object[]{Integer.valueOf(this.f9104a.size())}, jVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class t implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p0.b f9105a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9106b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f9107c;

        public t(p0.b bVar, int i10, Context context) {
            this.f9105a = bVar;
            this.f9106b = i10;
            this.f9107c = context;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            long j10;
            Context context;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 12);
                float f10 = 8;
                z.q qVarA = z.o.a(z.b.h(f10), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, jVar2, 54);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                int i10 = this.f9106b;
                w1.d dVarA = i10 > 0 ? p0.gc.a() : p0.m1.a();
                if (i10 > 0) {
                    jVar2.L(958124017);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25777w;
                } else {
                    jVar2.L(958125204);
                    j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25764j;
                }
                jVar2.B();
                t0.t4.b(dVarA, null, androidx.compose.foundation.layout.g.n(aVar, 20), j10, jVar2, 432, 0);
                t0.ff.b(f3.q.c(R.string.editor_quality_title, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26546i, jVar2, 196608, 0, 65498);
                jVar2.H();
                jVar2.L(-1626734040);
                p0.b bVar2 = this.f9105a;
                ArrayList arrayListA = bVar2.a();
                int size = arrayListA.size();
                int i11 = 0;
                while (true) {
                    context = this.f9107c;
                    if (i11 >= size) {
                        break;
                    }
                    Object obj = arrayListA.get(i11);
                    i11++;
                    b8.x(((p0.a) obj).a(context), true, jVar2, 48);
                }
                jVar2.B();
                jVar2.L(-1626729175);
                ArrayList arrayListB = bVar2.b();
                int size2 = arrayListB.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayListB.get(i12);
                    i12++;
                    b8.x(((p0.a) obj2).a(context), false, jVar2, 48);
                }
                jVar2.B();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class u implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f9108a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9109b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f9110c;

        /* JADX WARN: Multi-variable type inference failed */
        public u(eh.l<? super String, pg.f0> lVar, eh.a<pg.f0> aVar, x0.n1<String> n1Var) {
            this.f9108a = lVar;
            this.f9109b = aVar;
            this.f9110c = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(1198156443);
                final eh.l<String, pg.f0> lVar = this.f9108a;
                boolean zK = jVar2.K(lVar);
                final eh.a<pg.f0> aVar = this.f9109b;
                boolean zK2 = zK | jVar2.K(aVar);
                Object objG = jVar2.g();
                if (zK2 || objG == j.a.f31715a) {
                    final x0.n1<String> n1Var = this.f9110c;
                    objG = new eh.a() { // from class: f9.ae
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            eh.l lVar2 = lVar;
                            String strA = m3.a.a("#", mh.x.W((String) n1Var.getValue()).toString());
                            try {
                                Color.parseColor(strA);
                                lVar2.invoke(strA);
                            } catch (Exception unused) {
                                aVar.invoke();
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.a((eh.a) objG, null, false, null, null, null, null, null, f9.e.U, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class v implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9111a;

        public v(eh.a<pg.f0> aVar) {
            this.f9111a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f9111a, null, false, null, null, null, f9.e.V, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class w implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9112a;

        public w(String str) {
            this.f9112a = str;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.ff.b(this.f9112a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class x implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<String> f9113a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9114b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f9115c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f9116d;

        public x(eh.l lVar, String str, List list, x0.n1 n1Var) {
            this.f9113a = list;
            this.f9114b = str;
            this.f9115c = lVar;
            this.f9116d = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                z.q qVarA = z.o.a(z.b.h(14), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                t0.ff.b(f3.q.c(R.string.editor_label_primary_color, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26551n, jVar2, 0, 0, 65530);
                float f10 = 10;
                z.f0.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), z.b.h(f10), z.b.h(f10), null, 0, 0, f1.c.b(1246298796, new de(this.f9115c, this.f9114b, this.f9113a), jVar2), jVar2, 1573302, 56);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 4), jVar2);
                x0.n1<String> n1Var = this.f9116d;
                String value = n1Var.getValue();
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                jVar2.L(347027533);
                Object objG = jVar2.g();
                if (objG == j.a.f31715a) {
                    objG = new be(n1Var, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.w9.a(value, (eh.l) objG, dVarD, false, false, null, f9.e.W, null, null, f1.c.b(799788506, new ee(n1Var), jVar2), f9.e.X, null, false, null, null, null, true, 0, 0, null, null, jVar2, 806879664, 12582918, 8255928);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class y implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f9117a;

        public y(eh.a<pg.f0> aVar) {
            this.f9117a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f9117a, null, false, null, null, null, f9.e.Y, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class z implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<pg.n<String, String>> f9118a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9119b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f9120c;

        public z(eh.l lVar, String str, List list) {
            this.f9118a = list;
            this.f9119b = str;
            this.f9120c = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                z.q qVarA = z.o.a(z.b.h(8), d.a.f14614m, jVar2, 6);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                jVar2.L(38354489);
                Iterator<T> it = this.f9118a.iterator();
                while (it.hasNext()) {
                    pg.n nVar = (pg.n) it.next();
                    String str = (String) nVar.f21469a;
                    String str2 = (String) nVar.f21470b;
                    boolean zA = kotlin.jvm.internal.r.a(this.f9119b, str);
                    float f10 = 12;
                    androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.d(aVar, 1.0f), h0.f.a(f10));
                    jVar2.L(-58601929);
                    eh.l<String, pg.f0> lVar = this.f9120c;
                    boolean zK = jVar2.K(lVar) | jVar2.K(str);
                    Object objG = jVar2.g();
                    if (zK || objG == j.a.f31715a) {
                        objG = new b9.r3(1, lVar, str);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    androidx.compose.ui.d dVarC2 = androidx.compose.foundation.b.c(dVarD, false, null, null, (eh.a) objG, 7);
                    h0.e eVarA = h0.f.a(f10);
                    jVar2.L(38365980);
                    long jC = zA ? q1.b1.c(0.15f, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a) : q1.b1.f21653g;
                    jVar2.B();
                    jVar2.L(38370031);
                    t.v vVarA = zA ? a9.d2.a(1, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a) : null;
                    jVar2.B();
                    t0.md.a(dVarC2, eVarA, jC, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, vVarA, f1.c.b(509261747, new fe(zA, str2), jVar2), jVar2, 12582912, 56);
                }
                jVar2.B();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final void A(final String str, final eh.l<? super String, pg.f0> lVar, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        int i11;
        x0.k kVar;
        x0.k kVarP = jVar.p(718026804);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(aVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            t0.r.a(aVar, f1.c.b(-1927115028, new y(aVar), kVarP), null, null, null, f9.e.Z, f1.c.b(-972736249, new z(lVar, str, qg.p.j(new pg.n("circle", f3.q.c(R.string.editor_splash_loader_circle, kVarP)), new pg.n("bar", f3.q.c(R.string.editor_splash_loader_bar, kVarP)), new pg.n("none", f3.q.c(R.string.editor_splash_loader_none, kVarP)))), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i11 >> 6) & 14) | 1769520, 0, 16284);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: f9.q7
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    b8.A(str, lVar, aVar, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean A0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a93  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void B(final boolean z10, final eh.l lVar, final String str, final Uri uri, final Uri uri2, final String str2, eh.l lVar2, final boolean z11, final eh.l lVar3, String str3, eh.l lVar4, final int i10, final eh.l lVar5, final int i11, final eh.l lVar6, final int i12, final eh.l lVar7, final int i13, final eh.l lVar8, final int i14, final eh.l lVar9, final int i15, final eh.l lVar10, final int i16, final eh.l lVar11, final String str4, eh.l lVar12, final boolean z12, final eh.l lVar13, final boolean z13, final eh.l lVar14, final eh.a aVar, final eh.a aVar2, final boolean z14, final boolean z15, final eh.a aVar3, x0.j jVar, final int i17) {
        long jC;
        long jC2;
        float f10;
        int i18;
        long j10;
        float f11;
        j.a.C0321a c0321a;
        float f12;
        int i19;
        boolean z16;
        float f13;
        int i20;
        float f14;
        String str5;
        long j11;
        eh.l lVar15;
        String str6;
        x0.k kVar;
        eh.l lVar16;
        j.a.C0321a c0321a2;
        int i21;
        int i22;
        final eh.l lVar17;
        final x0.n1 n1Var;
        x0.n1 n1Var2;
        x0.n1 n1Var3;
        int i23;
        x0.k kVarP = jVar.p(-45603821);
        int i24 = i17 | (kVarP.c(z10) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.K(str) ? 256 : 128) | (kVarP.l(uri) ? 2048 : 1024) | (kVarP.l(uri2) ? 16384 : 8192) | (kVarP.K(str2) ? 131072 : 65536);
        boolean zL = kVarP.l(lVar2);
        int i25 = PKIFailureInfo.signerNotTrusted;
        int i26 = i24 | (zL ? PKIFailureInfo.badCertTemplate : 524288) | (kVarP.c(z11) ? 8388608 : 4194304) | (kVarP.K(str3) ? 536870912 : 268435456);
        int i27 = (kVarP.l(lVar4) ? (char) 4 : (char) 2) | (kVarP.i(i10) ? ' ' : (char) 16) | (kVarP.l(lVar5) ? 256 : 128) | (kVarP.i(i11) ? 2048 : 1024) | (kVarP.l(lVar6) ? 16384 : 8192) | (kVarP.i(i12) ? 131072 : 65536) | (kVarP.l(lVar7) ? PKIFailureInfo.badCertTemplate : 524288) | (kVarP.i(i13) ? 8388608 : 4194304) | (kVarP.l(lVar8) ? 67108864 : 33554432) | (kVarP.i(i14) ? 536870912 : 268435456);
        int i28 = (kVarP.l(lVar9) ? 4 : 2) | (kVarP.i(i15) ? 32 : 16) | (kVarP.l(lVar10) ? 256 : 128) | (kVarP.i(i16) ? 2048 : 1024) | (kVarP.l(lVar11) ? 16384 : 8192) | (kVarP.K(str4) ? 131072 : 65536);
        if (kVarP.l(lVar12)) {
            i25 = PKIFailureInfo.badCertTemplate;
        }
        int i29 = i28 | i25 | (kVarP.c(z12) ? 8388608 : 4194304) | (kVarP.l(lVar13) ? 67108864 : 33554432) | (kVarP.c(z13) ? 536870912 : 268435456);
        int i30 = (kVarP.l(lVar14) ? 4 : 2) | (kVarP.l(aVar) ? 32 : 16) | (kVarP.l(aVar2) ? 256 : 128) | (kVarP.c(z15) ? 16384 : 8192) | (kVarP.l(aVar3) ? 131072 : 65536);
        if ((i26 & 273228947) == 273228946 && (i27 & 306783379) == 306783378 && (i29 & 306783379) == 306783378 && (i30 & 73875) == 73874 && kVarP.s()) {
            kVarP.v();
            lVar16 = lVar2;
            lVar17 = lVar4;
            lVar15 = lVar12;
            kVar = kVarP;
            str6 = str3;
        } else {
            kVarP.L(-1804927534);
            Object objG = kVarP.g();
            j.a.C0321a c0321a3 = j.a.f31715a;
            if (objG == c0321a3) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            x0.n1 n1Var4 = (x0.n1) objG;
            kVarP.B();
            kVarP.L(-1804925358);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a3) {
                objG2 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG2);
            }
            x0.n1 n1Var5 = (x0.n1) objG2;
            kVarP.B();
            kVarP.L(-1804923182);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a3) {
                objG3 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG3);
            }
            x0.n1 n1Var6 = (x0.n1) objG3;
            kVarP.B();
            kVarP.L(-1804921026);
            boolean z17 = (i26 & 458752) == 131072;
            Object objG4 = kVarP.g();
            if (z17 || objG4 == c0321a3) {
                try {
                    jC = c2.n0.b(Color.parseColor(mh.t.p(str2, "#", false) ? str2 : "#".concat(str2)));
                } catch (Exception unused) {
                    jC = c2.n0.c(4279178008L);
                }
                objG4 = q1.b1.a(jC);
                kVarP.C(objG4);
            }
            long j12 = ((q1.b1) objG4).f21656a;
            kVarP.B();
            kVarP.L(-1804911410);
            boolean z18 = (i29 & 458752) == 131072;
            Object objG5 = kVarP.g();
            if (z18 || objG5 == c0321a3) {
                try {
                    jC2 = c2.n0.b(Color.parseColor(mh.t.p(str4, "#", false) ? str4 : "#".concat(str4)));
                } catch (Exception unused2) {
                    jC2 = c2.n0.c(4278248908L);
                }
                objG5 = q1.b1.a(jC2);
                kVarP.C(objG5);
            }
            long j13 = ((q1.b1) objG5).f21656a;
            kVarP.B();
            d.a aVar4 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar4, 1.0f);
            float f15 = 14;
            b.i iVarH = z.b.h(f15);
            f.a aVar5 = d.a.f14614m;
            z.q qVarA = z.o.a(iVarH, aVar5, kVarP, 6);
            int iC = c9.u1.c(kVarP);
            x0.a2 a2VarY = kVarP.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVarA = g.a.a();
            kVarP.r();
            if (kVarP.m()) {
                kVarP.w(aVarA);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.c(), qVarA, kVarP);
            ph.v1.j(g.a.e(), a2VarY, kVarP);
            g.a.C0128a c0128aB = g.a.b();
            if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iC, kVarP, iC, c0128aB);
            }
            ph.v1.j(g.a.d(), dVarC, kVarP);
            float f16 = 4;
            float f17 = 2;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), f16, f17);
            z.q qVarA2 = z.o.a(z.b.f34446c, aVar5, kVarP, 0);
            int iC2 = c9.u1.c(kVarP);
            x0.a2 a2VarY2 = kVarP.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, kVarP);
            e0.a aVarA2 = g.a.a();
            kVarP.r();
            if (kVarP.m()) {
                kVarP.w(aVarA2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.c(), qVarA2, kVarP);
            ph.v1.j(g.a.e(), a2VarY2, kVarP);
            g.a.C0128a c0128aB2 = g.a.b();
            if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC2))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iC2, kVarP, iC2, c0128aB2);
            }
            ph.v1.j(g.a.d(), dVarC2, kVarP);
            String strC = f3.q.c(R.string.editor_section_splash, kVarP);
            t2.l0 l0Var = b3.l.b(kVarP).f26544g;
            x2.p pVar = x2.p.f32029b;
            t0.ff.b(strC, null, b3.l.a(kVarP).a(), 0L, p.a.a(), null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 196608, 0, 65498);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f17), kVarP);
            t0.ff.b(f3.q.c(R.string.editor_splash_subtitle, kVarP), null, b3.l.a(kVarP).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(kVarP).b(), kVarP, 0, 0, 65530);
            kVarP.H();
            kVarP.L(1088523447);
            if (!z15) {
                s((i30 >> 15) & 14, aVar3, kVarP);
            }
            kVarP.B();
            boolean z19 = z10 && z15;
            float f18 = z19 ? 1.0f : 0.4f;
            float f19 = 18;
            float f20 = 1;
            boolean z20 = z19;
            t0.d1.a(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), h0.f.a(f19), t0.z0.a(q1.b1.c(0.85f, b3.l.a(kVarP).I), kVarP, 0), null, a9.d2.a(f20, q1.b1.c(0.35f, b3.l.a(kVarP).c())), f1.c.b(1178384379, new ie(aVar3, lVar, z15, z10), kVarP), kVarP, 196614, 8);
            kVarP.L(1088603948);
            if (z10 && z15) {
                f10 = f20;
            } else {
                f10 = f20;
                t0.d1.a(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), h0.f.a(16), t0.z0.a(q1.b1.c(0.6f, b3.l.a(kVarP).J), kVarP, 0), null, a9.d2.a(f10, q1.b1.c(0.25f, b3.l.a(kVarP).c())), f9.e.Q, kVarP, 196614, 8);
            }
            kVarP.B();
            androidx.compose.ui.d dVarB = c9.g.b(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), f18);
            z.q qVarA3 = z.o.a(z.b.h(f15), aVar5, kVarP, 6);
            int iC3 = c9.u1.c(kVarP);
            x0.a2 a2VarY3 = kVarP.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, kVarP);
            e0.a aVarA3 = g.a.a();
            kVarP.r();
            if (kVarP.m()) {
                kVarP.w(aVarA3);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.c(), qVarA3, kVarP);
            ph.v1.j(g.a.e(), a2VarY3, kVarP);
            g.a.C0128a c0128aB3 = g.a.b();
            if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC3))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iC3, kVarP, iC3, c0128aB3);
            }
            ph.v1.j(g.a.d(), dVarC3, kVarP);
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f16, 1);
            j1.f fVar = d.a.f14606e;
            g2.l0 l0VarD = z.g.d(fVar, false);
            int iC4 = c9.u1.c(kVarP);
            x0.a2 a2VarY4 = kVarP.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarJ, kVarP);
            e0.a aVarA4 = g.a.a();
            kVarP.r();
            if (kVarP.m()) {
                kVarP.w(aVarA4);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.c(), l0VarD, kVarP);
            ph.v1.j(g.a.e(), a2VarY4, kVarP);
            g.a.C0128a c0128aB4 = g.a.b();
            if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC4))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iC4, kVarP, iC4, c0128aB4);
            }
            ph.v1.j(g.a.d(), dVarC4, kVarP);
            float f21 = 32;
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(t.o.a(e1.d.d(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.r(aVar4, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE), 340), h0.f.a(f21)), (float) 2.5d, c2.n0.c(4280627264L), h0.f.a(f21)), j12, q1.y1.f21750a);
            g2.l0 l0VarD2 = z.g.d(d.a.f14603b, false);
            int iC5 = c9.u1.c(kVarP);
            x0.a2 a2VarY5 = kVarP.y();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarB2, kVarP);
            e0.a aVarA5 = g.a.a();
            kVarP.r();
            if (kVarP.m()) {
                kVarP.w(aVarA5);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.c(), l0VarD2, kVarP);
            ph.v1.j(g.a.e(), a2VarY5, kVarP);
            g.a.C0128a c0128aB5 = g.a.b();
            if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC5))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iC5, kVarP, iC5, c0128aB5);
            }
            ph.v1.j(g.a.d(), dVarC5, kVarP);
            z.g.a(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.o(androidx.compose.foundation.layout.f.l(aVar4, CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 60, 5), h0.f.d()), c2.n0.c(4280165939L), q1.y1.f21750a), kVarP, 0);
            j.a.C0100a c0100a = j.a.f11397a;
            if (uri == null || !z12) {
                i18 = i12;
                j10 = j12;
                f11 = f10;
                c0321a = c0321a3;
                kVarP.L(-622574183);
                androidx.compose.ui.d dVarC6 = androidx.compose.foundation.layout.g.c(aVar4);
                f12 = f19;
                z.q qVarA4 = z.o.a(z.b.f34448e, d.a.f14615n, kVarP, 54);
                int iC6 = c9.u1.c(kVarP);
                x0.a2 a2VarY6 = kVarP.y();
                androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarC6, kVarP);
                e0.a aVarA6 = g.a.a();
                kVarP.r();
                if (kVarP.m()) {
                    kVarP.w(aVarA6);
                } else {
                    kVarP.z();
                }
                ph.v1.j(g.a.c(), qVarA4, kVarP);
                ph.v1.j(g.a.e(), a2VarY6, kVarP);
                g.a.C0128a c0128aB6 = g.a.b();
                if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC6))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(iC6, kVarP, iC6, c0128aB6);
                }
                ph.v1.j(g.a.d(), dVarC7, kVarP);
                float f22 = i10 * 0.52f;
                i19 = i11;
                androidx.compose.ui.d dVarB3 = androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.n(aVar4, f22), h0.f.a(i19 * 0.52f)), b3.l.a(kVarP).f(), q1.y1.f21750a);
                kVarP.L(-703487427);
                boolean z21 = (i30 & 112) == 32;
                Object objG6 = kVarP.g();
                if (z21 || objG6 == c0321a) {
                    objG6 = new eh.a() { // from class: f9.v6
                        @Override // eh.a
                        public final Object invoke() {
                            aVar.invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG6);
                }
                kVarP.B();
                z16 = z20;
                androidx.compose.ui.d dVarC8 = androidx.compose.foundation.b.c(dVarB3, z16, null, null, (eh.a) objG6, 6);
                g2.l0 l0VarD3 = z.g.d(fVar, false);
                int iC7 = c9.u1.c(kVarP);
                x0.a2 a2VarY7 = kVarP.y();
                androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(dVarC8, kVarP);
                e0.a aVarA7 = g.a.a();
                kVarP.r();
                if (kVarP.m()) {
                    kVarP.w(aVarA7);
                } else {
                    kVarP.z();
                }
                ph.v1.j(g.a.c(), l0VarD3, kVarP);
                ph.v1.j(g.a.e(), a2VarY7, kVarP);
                g.a.C0128a c0128aB7 = g.a.b();
                if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC7))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(iC7, kVarP, iC7, c0128aB7);
                }
                ph.v1.j(g.a.d(), dVarC9, kVarP);
                if (uri != null) {
                    kVarP.L(-1934884418);
                    h7.r.a(uri.toString(), null, androidx.compose.foundation.layout.g.c(aVar4), c0100a, kVarP, 1573296);
                    kVarP.B();
                } else if (uri2 != null) {
                    kVarP.L(-1934422208);
                    h7.r.a(uri2.toString(), null, androidx.compose.foundation.layout.g.c(aVar4), c0100a, kVarP, 1573296);
                    kVarP.B();
                } else {
                    kVarP.L(-1933955813);
                    androidx.compose.ui.d dVarA = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.g.c(aVar4), new q1.q1(qg.p.j(q1.b1.a(c2.n0.c(4284704497L)), q1.b1.a(c2.n0.c(4278630100L))), null, 0L, 9187343241974906880L));
                    g2.l0 l0VarD4 = z.g.d(fVar, false);
                    int iC8 = c9.u1.c(kVarP);
                    x0.a2 a2VarY8 = kVarP.y();
                    androidx.compose.ui.d dVarC10 = androidx.compose.ui.c.c(dVarA, kVarP);
                    e0.a aVarA8 = g.a.a();
                    kVarP.r();
                    if (kVarP.m()) {
                        kVarP.w(aVarA8);
                    } else {
                        kVarP.z();
                    }
                    ph.v1.j(g.a.c(), l0VarD4, kVarP);
                    ph.v1.j(g.a.e(), a2VarY8, kVarP);
                    g.a.C0128a c0128aB8 = g.a.b();
                    if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC8))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(iC8, kVarP, iC8, c0128aB8);
                    }
                    ph.v1.j(g.a.d(), dVarC10, kVarP);
                    f13 = 0.85f;
                    t0.t4.b(p0.n5.a(), null, androidx.compose.foundation.layout.g.n(aVar4, 0.5f * f22), q1.b1.c(0.85f, b1.a.b()), kVarP, 3120, 0);
                    kVarP.H();
                    kVarP.B();
                    kVarP.H();
                    i20 = i13;
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, i20 * 0.52f), kVarP);
                    float f23 = i18 * 0.52f;
                    f14 = i15 * 0.65f;
                    if (f14 < 2.0f) {
                        f14 = 2.0f;
                    }
                    str5 = str3;
                    if (kotlin.jvm.internal.r.a(str5, "bar")) {
                        j11 = j13;
                        if (kotlin.jvm.internal.r.a(str5, "none")) {
                            kVarP.L(-330055893);
                            kVarP.B();
                        } else {
                            kVarP.L(-329935396);
                            t0.z9.a(f14, 0, 0, 24, j11, 0L, androidx.compose.foundation.layout.g.n(aVar4, f23), kVarP);
                            kVarP.B();
                        }
                    } else {
                        kVarP.L(-330603384);
                        j11 = j13;
                        t0.z9.c(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 24, j11, q1.b1.c(0.25f, j13), e1.d.d(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.r(aVar4, f23 * 1.8f), f14), h0.f.d()), kVarP);
                        kVarP.B();
                    }
                    kVarP.H();
                    kVarP.B();
                }
                f13 = 0.85f;
                kVarP.H();
                i20 = i13;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, i20 * 0.52f), kVarP);
                float f232 = i18 * 0.52f;
                f14 = i15 * 0.65f;
                if (f14 < 2.0f) {
                }
                str5 = str3;
                if (kotlin.jvm.internal.r.a(str5, "bar")) {
                }
                kVarP.H();
                kVarP.B();
            } else {
                kVarP.L(-624680447);
                String string = uri.toString();
                androidx.compose.ui.d dVarC11 = androidx.compose.foundation.layout.g.c(aVar4);
                kVarP.L(-851427682);
                boolean z22 = (i30 & 112) == 32;
                Object objG7 = kVarP.g();
                if (z22) {
                    c0321a = c0321a3;
                } else {
                    c0321a = c0321a3;
                    if (objG7 == c0321a) {
                    }
                    kVarP.B();
                    f11 = f10;
                    z16 = z20;
                    h7.r.a(string, null, androidx.compose.foundation.b.c(dVarC11, z16, null, null, (eh.a) objG7, 6), c0100a, kVarP, 1572912);
                    if (!z13 || kotlin.jvm.internal.r.a(str3, "none")) {
                        i18 = i12;
                        j10 = j12;
                        j11 = j13;
                    } else {
                        androidx.compose.ui.d dVarC12 = androidx.compose.foundation.layout.g.c(aVar4);
                        g2.l0 l0VarD5 = z.g.d(fVar, false);
                        int iC9 = c9.u1.c(kVarP);
                        x0.a2 a2VarY9 = kVarP.y();
                        androidx.compose.ui.d dVarC13 = androidx.compose.ui.c.c(dVarC12, kVarP);
                        j10 = j12;
                        e0.a aVarA9 = g.a.a();
                        kVarP.r();
                        if (kVarP.m()) {
                            kVarP.w(aVarA9);
                        } else {
                            kVarP.z();
                        }
                        ph.v1.j(g.a.c(), l0VarD5, kVarP);
                        ph.v1.j(g.a.e(), a2VarY9, kVarP);
                        g.a.C0128a c0128aB9 = g.a.b();
                        if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC9))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(iC9, kVarP, iC9, c0128aB9);
                        }
                        ph.v1.j(g.a.d(), dVarC13, kVarP);
                        i18 = i12;
                        float f24 = i18 * 0.52f;
                        float f25 = i15 * 0.65f;
                        if (f25 < 2.0f) {
                            f25 = 2.0f;
                        }
                        if (kotlin.jvm.internal.r.a(str3, "bar")) {
                            kVarP.L(-335188284);
                            j11 = j13;
                            t0.z9.c(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 24, j11, q1.b1.c(0.25f, j13), e1.d.d(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.r(aVar4, f24 * 1.8f), f25), h0.f.d()), kVarP);
                            kVarP.B();
                        } else {
                            j11 = j13;
                            if (kotlin.jvm.internal.r.a(str3, "none")) {
                                kVarP.L(-334604523);
                                kVarP.B();
                            } else {
                                kVarP.L(-334550800);
                                t0.z9.a(f25, 0, 0, 24, j11, 0L, androidx.compose.foundation.layout.g.n(aVar4, f24), kVarP);
                                kVarP.B();
                            }
                        }
                        kVarP.H();
                    }
                    kVarP.B();
                    str5 = str3;
                    f12 = f19;
                    f13 = 0.85f;
                    i19 = i11;
                    i20 = i13;
                }
                objG7 = new androidx.room.l(aVar, 2);
                kVarP.C(objG7);
                kVarP.B();
                f11 = f10;
                z16 = z20;
                h7.r.a(string, null, androidx.compose.foundation.b.c(dVarC11, z16, null, null, (eh.a) objG7, 6), c0100a, kVarP, 1572912);
                if (z13) {
                    i18 = i12;
                    j10 = j12;
                    j11 = j13;
                    kVarP.B();
                    str5 = str3;
                    f12 = f19;
                    f13 = 0.85f;
                    i19 = i11;
                    i20 = i13;
                }
            }
            kVarP.H();
            kVarP.H();
            j.a.C0321a c0321a4 = c0321a;
            float f26 = f11;
            boolean z23 = z16;
            lVar15 = lVar12;
            t0.d1.a(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), h0.f.a(f12), t0.z0.a(q1.b1.c(f13, b3.l.a(kVarP).I), kVarP, 0), null, a9.d2.a(f11, q1.b1.c(0.35f, b3.l.a(kVarP).c())), f1.c.b(987300904, new le(z23, str5, n1Var4, str2, j10, n1Var6, n1Var5, str4, j11), kVarP), kVarP, 196614, 8);
            str6 = str3;
            t0.d1.a(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), h0.f.a(f12), t0.z0.a(q1.b1.c(f13, b3.l.a(kVarP).I), kVarP, 0), null, a9.d2.a(f26, q1.b1.c(0.35f, b3.l.a(kVarP).c())), f1.c.b(1624114207, new qe(str3, z11, i10, lVar5, z23, i19, lVar6, i18, lVar7, i20, lVar8, i14, lVar9, i15, lVar10, i16, lVar11), kVarP), kVarP, 196614, 8);
            t0.d1.a(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), h0.f.a(f12), t0.z0.a(q1.b1.c(f13, b3.l.a(kVarP).I), kVarP, 0), null, a9.d2.a(f26, q1.b1.c(0.35f, b3.l.a(kVarP).c())), f1.c.b(-620595424, new ue(uri, z23, lVar13, z12, lVar14, z13, aVar, uri2, str, aVar2), kVarP), kVarP, 196614, 8);
            kVar = kVarP;
            kVar.H();
            kVar.H();
            kVar.L(-1803569189);
            if (((Boolean) n1Var4.getValue()).booleanValue()) {
                String strC2 = f3.q.c(R.string.editor_splash_bg_label, kVar);
                kVar.L(-1803563151);
                boolean z24 = (i26 & 3670016) == 1048576;
                Object objG8 = kVar.g();
                c0321a2 = c0321a4;
                if (z24 || objG8 == c0321a2) {
                    lVar16 = lVar2;
                    n1Var3 = n1Var4;
                    i23 = 0;
                    objG8 = new x6(lVar16, n1Var3, 0);
                    kVar.C(objG8);
                } else {
                    lVar16 = lVar2;
                    n1Var3 = n1Var4;
                    i23 = 0;
                }
                eh.l lVar18 = (eh.l) objG8;
                kVar.B();
                kVar.L(-1803559285);
                Object objG9 = kVar.g();
                if (objG9 == c0321a2) {
                    objG9 = new y6(n1Var3, i23);
                    kVar.C(objG9);
                }
                kVar.B();
                z(strC2, null, str2, lVar18, (eh.a) objG9, kVar, ((i26 >> 9) & 896) | 24576, 2);
            } else {
                lVar16 = lVar2;
                c0321a2 = c0321a4;
            }
            kVar.B();
            kVar.L(-1803557095);
            if (((Boolean) n1Var5.getValue()).booleanValue()) {
                List listJ = qg.p.j("#00E5CC", "#FFA726", "#2196F3", "#10B981", "#8B5CF6", "#EC4899", "#EF4444", "#FACC15", "#FFFFFF", "#6366F1", "#14B8A6", "#F97316");
                String strC3 = f3.q.c(R.string.editor_splash_loader_color_label, kVar);
                kVar.L(-1803542693);
                boolean z25 = (i29 & 3670016) == 1048576;
                Object objG10 = kVar.g();
                if (z25 || objG10 == c0321a2) {
                    n1Var2 = n1Var5;
                    i22 = 0;
                    objG10 = new z6(lVar15, n1Var2, 0);
                    kVar.C(objG10);
                } else {
                    n1Var2 = n1Var5;
                    i22 = 0;
                }
                eh.l lVar19 = (eh.l) objG10;
                kVar.B();
                kVar.L(-1803538511);
                Object objG11 = kVar.g();
                if (objG11 == c0321a2) {
                    i21 = 1;
                    objG11 = new androidx.room.c0(n1Var2, 1);
                    kVar.C(objG11);
                } else {
                    i21 = 1;
                }
                kVar.B();
                z(strC3, listJ, str4, lVar19, (eh.a) objG11, kVar, ((i29 >> 9) & 896) | 24624, 0);
            } else {
                i21 = 1;
                i22 = 0;
            }
            kVar.B();
            if (((Boolean) n1Var6.getValue()).booleanValue()) {
                kVar.L(-1803532261);
                int i31 = (i27 & 14) == 4 ? i21 : i22;
                Object objG12 = kVar.g();
                if (i31 != 0 || objG12 == c0321a2) {
                    lVar17 = lVar4;
                    n1Var = n1Var6;
                    objG12 = new eh.l() { // from class: f9.a7
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            String it = (String) obj;
                            kotlin.jvm.internal.r.e(it, "it");
                            lVar17.invoke(it);
                            n1Var.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(objG12);
                } else {
                    lVar17 = lVar4;
                    n1Var = n1Var6;
                }
                eh.l lVar20 = (eh.l) objG12;
                kVar.B();
                kVar.L(-1803528079);
                Object objG13 = kVar.g();
                if (objG13 == c0321a2) {
                    objG13 = new androidx.room.j(n1Var, i21);
                    kVar.C(objG13);
                }
                kVar.B();
                A(str6, lVar20, (eh.a) objG13, kVar, ((i26 >> 27) & 14) | 384);
            } else {
                lVar17 = lVar4;
            }
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            final eh.l lVar21 = lVar15;
            final eh.l lVar22 = lVar16;
            final String str7 = str6;
            final eh.l lVar23 = lVar17;
            h2VarV.f(new eh.p(z10, lVar, str, uri, uri2, str2, lVar22, z11, lVar3, str7, lVar23, i10, lVar5, i11, lVar6, i12, lVar7, i13, lVar8, i14, lVar9, i15, lVar10, i16, lVar11, str4, lVar21, z12, lVar13, z13, lVar14, aVar, aVar2, z14, z15, aVar3, i17) { // from class: f9.u6
                public final /* synthetic */ int A;
                public final /* synthetic */ eh.l B;
                public final /* synthetic */ String C;
                public final /* synthetic */ eh.l D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ eh.l F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ eh.l H;
                public final /* synthetic */ eh.a I;
                public final /* synthetic */ eh.a K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ eh.a N;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f10696a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f10697b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f10698c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Uri f10699d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Uri f10700e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f10701f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.l f10702g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f10703h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.l f10704j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ String f10705k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ eh.l f10706l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ int f10707m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ eh.l f10708n;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ int f10709p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ eh.l f10710q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ int f10711r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ eh.l f10712s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ int f10713t;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ eh.l f10714v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f10715w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ eh.l f10716x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ int f10717y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ eh.l f10718z;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.B(this.f10696a, this.f10697b, this.f10698c, this.f10699d, this.f10700e, this.f10701f, this.f10702g, this.f10703h, this.f10704j, this.f10705k, this.f10706l, this.f10707m, this.f10708n, this.f10709p, this.f10710q, this.f10711r, this.f10712s, this.f10713t, this.f10714v, this.f10715w, this.f10716x, this.f10717y, this.f10718z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.K, this.L, this.M, this.N, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            });
        }
    }

    public static final String B0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final void C(List<String> list, int i10, x0.j jVar, final int i11) {
        final List<String> list2;
        final int i12;
        x0.k kVarP = jVar.p(579851521);
        int i13 = i11 | (kVarP.l(list) ? 4 : 2) | (kVarP.i(i10) ? 32 : 16);
        if ((i13 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            list2 = list;
            i12 = i10;
        } else {
            d.a aVar = d.a.f1143b;
            float f10 = 8;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i14 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14612k, kVarP, 54);
            int i15 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, m1VarA, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            int i16 = i10 + 1;
            int size = list.size();
            String str = (String) qg.x.E(i10, list);
            if (str == null) {
                str = "";
            }
            String strD = f3.q.d(R.string.editor_step_label, new Object[]{i16 + " / " + size + " · " + str}, kVarP);
            x0.s3 s3Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) kVarP.f(s3Var)).f26551n;
            x2.p pVar = x2.p.f32033f;
            x0.s3 s3Var2 = t0.f2.f25858a;
            t0.ff.b(strD, null, ((t0.e2) kVarP.f(s3Var2)).f25751a, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 196608, 0, 65498);
            t0.ff.b(i8.c.b((int) ((((float) i16) / ((float) list.size())) * ((float) 100)), "%"), null, ((t0.e2) kVarP.f(s3Var2)).f25773s, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26551n, kVarP, 196608, 0, 65498);
            kVarP = kVarP;
            kVarP.T(true);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 6), kVarP);
            kVarP.L(-1827891887);
            list2 = list;
            boolean zL = kVarP.l(list2) | ((i13 & 112) == 32);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                i12 = i10;
                objG = new eh.a() { // from class: f9.o7
                    @Override // eh.a
                    public final Object invoke() {
                        return Float.valueOf((i12 + 1) / list2.size());
                    }
                };
                kVarP.C(objG);
            } else {
                i12 = i10;
            }
            eh.a aVar3 = (eh.a) objG;
            kVarP.T(false);
            androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10), h0.f.a(4));
            long j10 = ((t0.e2) kVarP.f(s3Var2)).f25751a;
            long j11 = ((t0.e2) kVarP.f(s3Var2)).B;
            float f11 = 0;
            kVarP.L(-1827880057);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new p7(0);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            t0.z9.b(aVar3, dVarD2, j10, j11, 0, f11, (eh.l) objG2, kVarP, 1769472, 16);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(list2, i12, i11) { // from class: f9.r7

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f10374a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f10375b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.C(this.f10374a, this.f10375b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean C0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void D(final String str, final String str2, final int i10, final eh.l<? super Integer, pg.f0> lVar, x0.j jVar, final int i11) {
        x0.k kVarP = jVar.p(-1997569607);
        if ((((kVarP.K(str) ? 4 : 2) | i11 | (kVarP.K(str2) ? 32 : 16) | (kVarP.l(lVar) ? 2048 : 1024)) & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(14), t0.z0.a(((t0.e2) kVarP.f(t0.f2.f25858a)).G, kVarP, 0), null, null, f1.c.b(-1310125561, new a0(lVar, i10, str, str2), kVarP), kVarP, 196614, 24);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, str2, i10, lVar, i11) { // from class: f9.u5

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10692a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f10693b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f10694c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f10695d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(385);
                    b8.D(this.f10692a, this.f10693b, this.f10694c, this.f10695d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean D0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void E(final String str, final String str2, final String str3, final String str4, final String str5, final int i10, final String str6, final String str7, final int i11, final boolean z10, final eh.l lVar, x0.j jVar, final int i12) {
        x0.k kVarP = jVar.p(861777073);
        int i13 = i12 | (kVarP.K(str) ? 4 : 2) | (kVarP.K(str2) ? 32 : 16) | (kVarP.K(str3) ? 256 : 128) | (kVarP.K(str4) ? 2048 : 1024) | (kVarP.K(str5) ? 16384 : 8192) | (kVarP.i(i10) ? 131072 : 65536) | (kVarP.K(str6) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.K(str7) ? 8388608 : 4194304) | (kVarP.i(i11) ? 67108864 : 33554432) | (kVarP.c(z10) ? PKIFailureInfo.duplicateCertReq : 268435456);
        char c10 = kVarP.l(lVar) ? (char) 4 : (char) 2;
        if ((i13 & 306783379) == 306783378 && (c10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            i(f1.c.b(1821951723, new we(str, lVar, str2, str3, str4, str5, i10, str6, str7, i11, z10), kVarP), kVarP, 6);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, str2, str3, str4, str5, i10, str6, str7, i11, z10, lVar, i12) { // from class: f9.t6

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10565a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f10566b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f10567c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f10568d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f10569e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f10570f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f10571g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f10572h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ int f10573j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f10574k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ eh.l f10575l;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.E(this.f10565a, this.f10566b, this.f10567c, this.f10568d, this.f10569e, this.f10570f, this.f10571g, this.f10572h, this.f10573j, this.f10574k, this.f10575l, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final String E0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final void F(final String str, final boolean z10, final eh.l<? super Boolean, pg.f0> lVar, boolean z11, x0.j jVar, final int i10, final int i11) {
        boolean z12;
        int i12;
        long jC;
        final boolean z13;
        x0.k kVarP = jVar.p(553143023);
        int i13 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(lVar) ? 256 : 128);
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 = i13 | 3072;
            z12 = z11;
        } else {
            z12 = z11;
            i12 = i13 | (kVarP.c(z12) ? 2048 : 1024);
        }
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            z13 = z12;
        } else {
            boolean z14 = i14 != 0 ? true : z12;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14612k, kVarP, 54);
            int i15 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            t2.l0 l0Var = ((t0.nf) kVarP.f(t0.of.f26647a)).f26548k;
            if (z14) {
                kVarP.L(1712155121);
                jC = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25771q;
            } else {
                kVarP.L(1712156762);
                jC = q1.b1.c(0.5f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25771q);
            }
            kVarP.T(false);
            int i16 = i12;
            t0.ff.b(str, null, jC, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, i12 & 14, 0, 65530);
            kVarP = kVarP;
            boolean z15 = z14;
            androidx.compose.material3.a.a(z10, lVar, null, z15, null, kVarP, ((i16 >> 3) & 126) | (57344 & (i16 << 3)), HeaderItem.DATA_START_OFFSET);
            kVarP.T(true);
            z13 = z15;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, z10, lVar, z13, i10, i11) { // from class: f9.z7

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f11085a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f11086b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f11087c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f11088d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f11089e;

                {
                    this.f11089e = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.F(this.f11085a, this.f11086b, this.f11087c, this.f11088d, (x0.j) obj, iN, this.f11089e);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final String F0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final void G(final String str, final String str2, final boolean z10, final eh.l lVar, final boolean z11, final boolean z12, final eh.a aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1328460922);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.K(str2) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.l(lVar) ? 2048 : 1024) | (kVarP.c(z11) ? 16384 : 8192) | (kVarP.l(aVar) ? 1048576 : PKIFailureInfo.signerNotTrusted);
        if ((599187 & i11) == 599186 && kVarP.s()) {
            kVarP.v();
        } else {
            final boolean z13 = z11 || z12;
            float f10 = z13 ? 1.0f : 0.38f;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            kVarP.L(-194773807);
            boolean zC = kVarP.c(z13);
            int i12 = i11 & V4Signature.MAX_SIGNING_INFOS_SIZE;
            int i13 = 3670016 & i11;
            boolean z14 = ((i11 & 896) == 256) | zC | (i12 == 2048) | (i13 == 1048576);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (z14 || objG == c0321a) {
                objG = new eh.a() { // from class: f9.a8
                    @Override // eh.a
                    public final Object invoke() {
                        if (z13) {
                            lVar.invoke(Boolean.valueOf(!z10));
                        } else {
                            aVar.invoke();
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD, false, null, null, (eh.a) objG, 7), CropImageView.DEFAULT_ASPECT_RATIO, 6, 1);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i14 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
            i2.g.f13861o.getClass();
            float f11 = f10;
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, m1VarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            boolean z15 = z13 ? z10 : false;
            kVarP.L(-1881921398);
            boolean zC2 = kVarP.c(z13) | (i12 == 2048) | (i13 == 1048576);
            Object objG2 = kVarP.g();
            if (zC2 || objG2 == c0321a) {
                objG2 = new eh.l() { // from class: f9.k5
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        if (z13) {
                            lVar.invoke(bool);
                        } else {
                            aVar.invoke();
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG2);
            }
            kVarP.T(false);
            t0.m1.a(z15, (eh.l) objG2, null, z13, null, kVarP, 0, 52);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i15 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, qVarA, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            x0.s3 s3Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) kVarP.f(s3Var)).f26548k;
            x0.s3 s3Var2 = t0.f2.f25858a;
            t0.ff.b(str, null, q1.b1.c(f11, ((t0.e2) kVarP.f(s3Var2)).f25771q), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, i11 & 14, 0, 65530);
            t0.ff.b(str2, null, q1.b1.c(f11, ((t0.e2) kVarP.f(s3Var2)).f25773s), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26549l, kVarP, (i11 >> 3) & 14, 0, 65530);
            kVarP = kVarP;
            kVarP.T(true);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, str2, z10, lVar, z11, z12, aVar, i10) { // from class: f9.l5

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f9976a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f9977b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f9978c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f9979d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f9980e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f9981f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f9982g;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(196609);
                    b8.G(this.f9976a, this.f9977b, this.f9978c, this.f9979d, this.f9980e, this.f9981f, this.f9982g, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean G0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void H(final WebViewSettings webViewSettings, final eh.l<? super WebViewSettings, pg.f0> lVar, final boolean z10, final boolean z11, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1100758087);
        if ((((kVarP.K(webViewSettings) ? 4 : 2) | i10 | (kVarP.l(lVar) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.c(z11) ? 2048 : 1024) | (kVarP.l(aVar) ? 16384 : 8192)) & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(1042797810);
            boolean zL = kVarP.l(context);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: f9.s7
                    @Override // eh.a
                    public final Object invoke() {
                        Toast.makeText(context, R.string.editor_web_only_feature_toast, 0).show();
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            i(f1.c.b(265757375, new b0(webViewSettings, (eh.a) objG, lVar, z10), kVarP), kVarP, 6);
            i(f1.c.b(259960232, new c0(webViewSettings, aVar, lVar, z11), kVarP), kVarP, 6);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(lVar, z10, z11, aVar, i10) { // from class: f9.t7

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f10577b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f10578c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f10579d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f10580e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.H(this.f10576a, this.f10577b, this.f10578c, this.f10579d, this.f10580e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean H0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final boolean I0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean Q(fg fgVar, int i10) {
        sh.z0 z0Var = fgVar.f9582p;
        if (i10 != 0) {
            if (i10 == 1) {
                String str = (String) fgVar.f9600y.getValue();
                switch (str.hashCode()) {
                    case -1268966290:
                        if (str.equals("folder")) {
                            if (((Collection) fgVar.Z.getValue()).isEmpty() || ((Boolean) z0Var.getValue()).booleanValue() || ((Boolean) fgVar.f9557c0.getValue()).booleanValue()) {
                                return false;
                            }
                        } else if (fgVar.F.getValue() == null || ((Boolean) z0Var.getValue()).booleanValue()) {
                            return false;
                        }
                        break;
                    case 110834:
                        if (str.equals(ProjectKind.PDF)) {
                            if (fgVar.D.getValue() == null || ((Boolean) z0Var.getValue()).booleanValue()) {
                                return false;
                            }
                        }
                        break;
                    case 116079:
                        if (str.equals("url")) {
                            if (mh.x.A((CharSequence) fgVar.f9602z.getValue())) {
                                return false;
                            }
                        }
                        break;
                    case 106438291:
                        if (str.equals("paste")) {
                            if (mh.x.A((CharSequence) fgVar.B.getValue())) {
                                return false;
                            }
                        }
                        break;
                }
            } else if (i10 == 7) {
                mh.k kVar = l9.a.f16766a;
                boolean zBooleanValue = ((Boolean) fgVar.f9603z0.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) fgVar.J0.getValue()).booleanValue();
                String appId = (String) fgVar.A0.getValue();
                boolean zBooleanValue3 = ((Boolean) fgVar.K0.getValue()).booleanValue();
                String bannerUnitId = (String) fgVar.B0.getValue();
                boolean zBooleanValue4 = ((Boolean) fgVar.L0.getValue()).booleanValue();
                String interstitialUnitId = (String) fgVar.C0.getValue();
                boolean zBooleanValue5 = ((Boolean) fgVar.M0.getValue()).booleanValue();
                String rewardedUnitId = (String) fgVar.D0.getValue();
                kotlin.jvm.internal.r.e(appId, "appId");
                kotlin.jvm.internal.r.e(bannerUnitId, "bannerUnitId");
                kotlin.jvm.internal.r.e(interstitialUnitId, "interstitialUnitId");
                kotlin.jvm.internal.r.e(rewardedUnitId, "rewardedUnitId");
                if (zBooleanValue) {
                    if (zBooleanValue2) {
                        if (!mh.x.A(appId) && !l9.a.d(appId)) {
                            return false;
                        }
                    } else {
                        if (!l9.a.d(appId) || kotlin.jvm.internal.r.a(mh.x.W(appId).toString(), AdMobTestIds.APP_ID)) {
                            return false;
                        }
                        if (zBooleanValue3 && !l9.a.e(bannerUnitId)) {
                            return false;
                        }
                        if (zBooleanValue4 && !l9.a.e(interstitialUnitId)) {
                            return false;
                        }
                        if (zBooleanValue5 && !l9.a.e(rewardedUnitId)) {
                            return false;
                        }
                    }
                }
            }
        } else {
            if (mh.x.A((CharSequence) fgVar.f9586r.getValue())) {
                return false;
            }
            mh.k kVar2 = fg.X0;
            if (!fg.f.b((String) fgVar.f9588s.getValue())) {
                return false;
            }
        }
        return true;
    }

    public static final String R(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final String S(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final String T(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final String U(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final List V(x0.r3 r3Var) {
        return (List) r3Var.getValue();
    }

    public static final p0.b W(x0.r3 r3Var) {
        return (p0.b) r3Var.getValue();
    }

    public static final int X(x0.l1 l1Var) {
        return l1Var.g();
    }

    public static final boolean Y(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final f0.b Z(x0.r3 r3Var) {
        return (f0.b) r3Var.getValue();
    }

    public static final void a(final String str, final boolean z10, final eh.l lVar, boolean z11, x0.j jVar, final int i10) {
        final boolean z12;
        x0.k kVarP = jVar.p(-1577054762);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(lVar) ? 256 : 128) | 3072;
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            z12 = z11;
        } else {
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i12 = kVarP.P;
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
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            t2.l0 l0Var = ((t0.nf) kVarP.f(t0.of.f26647a)).f26547j;
            kVarP.L(1215289494);
            long j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25771q;
            kVarP.T(false);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            t0.ff.b(str, new LayoutWeightElement(1.0f, true), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, i11 & 14, 0, 65528);
            z12 = true;
            kVarP = kVarP;
            androidx.compose.material3.a.a(z10, lVar, null, true, null, kVarP, ((i11 >> 3) & 126) | 24576, HeaderItem.DATA_START_OFFSET);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, z10, lVar, z12, i10) { // from class: f9.y5

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f11008a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f11009b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f11010c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f11011d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.a(this.f11008a, this.f11009b, this.f11010c, this.f11011d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean a0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void b(int i10, eh.a aVar, x0.j jVar) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-851817744);
        if ((i10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            t0.r.a(aVar, f1.c.b(1752385960, new a(aVar), kVarP), null, null, null, f9.e.f9375s0, f9.e.f9377t0, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, 1769526, 0, 16284);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new y7(i10, 0, aVar);
        }
    }

    public static final Uri b0(x0.r3 r3Var) {
        return (Uri) r3Var.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final fg fgVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(263244120);
        if (((i10 | (kVarP.l(fgVar) ? 4 : 2)) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            x0.n1 n1VarB = bg.b.b(fgVar.P0, kVarP);
            x0.n1 n1VarB2 = bg.b.b(fgVar.Q0, kVarP);
            x0.n1 n1VarB3 = bg.b.b(fgVar.R0, kVarP);
            x0.n1 n1VarB4 = bg.b.b(fgVar.J0, kVarP);
            x0.n1 n1VarB5 = bg.b.b(fgVar.S0, kVarP);
            x0.n1 n1VarB6 = bg.b.b(fgVar.T0, kVarP);
            x0.n1 n1VarB7 = bg.b.b(fgVar.U0, kVarP);
            List listJ = qg.p.j(new pg.n("-1", f3.q.c(R.string.editor_privacy_unspecified, kVarP)), new pg.n("1", f3.q.c(R.string.editor_privacy_true, kVarP)), new pg.n(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0, f3.q.c(R.string.editor_privacy_false, kVarP)));
            String strC = f3.q.c(R.string.editor_privacy_title, kVarP);
            x0.s3 s3Var = t0.of.f26647a;
            t0.ff.b(strC, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26546i, kVarP, 0, 0, 65534);
            t0.ff.b(f3.q.c(R.string.editor_privacy_guidance, kVarP), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26549l, kVarP, 0, 0, 65534);
            kVarP = kVarP;
            String strC2 = f3.q.c(R.string.editor_privacy_tfcd, kVarP);
            String strValueOf = String.valueOf(((Number) n1VarB.getValue()).intValue());
            kVarP.L(-1066195532);
            boolean zL = kVarP.l(fgVar);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new eh.l() { // from class: f9.f7
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        String it = (String) obj;
                        kotlin.jvm.internal.r.e(it, "it");
                        sh.z0 z0Var = fgVar.P0;
                        Integer numValueOf = Integer.valueOf(Integer.parseInt(it));
                        z0Var.getClass();
                        z0Var.j(null, numValueOf);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            r(strC2, strValueOf, listJ, (eh.l) objG, kVarP, 0);
            String strC3 = f3.q.c(R.string.editor_privacy_tfua, kVarP);
            String strValueOf2 = String.valueOf(((Number) n1VarB2.getValue()).intValue());
            kVarP.L(-1066189809);
            boolean zL2 = kVarP.l(fgVar);
            Object objG2 = kVarP.g();
            if (zL2 || objG2 == c0321a) {
                objG2 = new d9.e(fgVar, 1);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            r(strC3, strValueOf2, listJ, (eh.l) objG2, kVarP, 0);
            String strC4 = f3.q.c(R.string.editor_privacy_rating, kVarP);
            String str = (String) n1VarB3.getValue();
            List listJ2 = qg.p.j(new pg.n("", f3.q.c(R.string.editor_privacy_unspecified, kVarP)), new pg.n("G", "G"), new pg.n("PG", "PG"), new pg.n("T", "T"), new pg.n("MA", "MA"));
            kVarP.L(-1066180856);
            boolean zL3 = kVarP.l(fgVar);
            Object objG3 = kVarP.g();
            if (zL3 || objG3 == c0321a) {
                objG3 = new eh.l() { // from class: f9.h7
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        String it = (String) obj;
                        kotlin.jvm.internal.r.e(it, "it");
                        sh.z0 z0Var = fgVar.R0;
                        z0Var.getClass();
                        z0Var.j(null, it);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG3);
            }
            kVarP.T(false);
            r(strC4, str, listJ2, (eh.l) objG3, kVarP, 0);
            if (((Boolean) n1VarB4.getValue()).booleanValue()) {
                String strC5 = f3.q.c(R.string.editor_privacy_debug, kVarP);
                boolean zBooleanValue = ((Boolean) n1VarB5.getValue()).booleanValue();
                kVarP.L(-1066173824);
                boolean zL4 = kVarP.l(fgVar);
                Object objG4 = kVarP.g();
                if (zL4 || objG4 == c0321a) {
                    objG4 = new i7(fgVar, 0);
                    kVarP.C(objG4);
                }
                kVarP.T(false);
                F(strC5, zBooleanValue, (eh.l) objG4, false, kVarP, 0, 8);
                if (((Boolean) n1VarB5.getValue()).booleanValue()) {
                    t0.ff.b(f3.q.c(R.string.editor_privacy_debug_help, kVarP), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26549l, kVarP, 0, 0, 65534);
                    String strC6 = f3.q.c(R.string.editor_privacy_geography, kVarP);
                    String str2 = (String) n1VarB6.getValue();
                    List listJ3 = qg.p.j(new pg.n("DISABLED", f3.q.c(R.string.editor_privacy_geo_disabled, kVarP)), new pg.n("EEA", f3.q.c(R.string.editor_privacy_geo_eea, kVarP)), new pg.n("REGULATED_US_STATE", f3.q.c(R.string.editor_privacy_geo_us, kVarP)), new pg.n("OTHER", f3.q.c(R.string.editor_privacy_geo_other, kVarP)));
                    kVarP.L(-1066151390);
                    boolean zL5 = kVarP.l(fgVar);
                    Object objG5 = kVarP.g();
                    if (zL5 || objG5 == c0321a) {
                        objG5 = new eh.l() { // from class: f9.j7
                            @Override // eh.l
                            public final Object invoke(Object obj) {
                                String it = (String) obj;
                                kotlin.jvm.internal.r.e(it, "it");
                                sh.z0 z0Var = fgVar.T0;
                                z0Var.getClass();
                                z0Var.j(null, it);
                                return pg.f0.f21461a;
                            }
                        };
                        kVarP.C(objG5);
                    }
                    kVarP.T(false);
                    r(strC6, str2, listJ3, (eh.l) objG5, kVarP, 0);
                    String str3 = (String) n1VarB7.getValue();
                    androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
                    kVarP.L(-1066146879);
                    boolean zL6 = kVarP.l(fgVar);
                    Object objG6 = kVarP.g();
                    if (zL6 || objG6 == c0321a) {
                        objG6 = new k7(fgVar, 0);
                        kVarP.C(objG6);
                    }
                    kVarP.T(false);
                    t0.w9.a(str3, (eh.l) objG6, dVarD, false, false, null, f9.e.F0, null, null, null, null, f9.e.G0, false, null, null, null, false, 0, 0, null, null, kVarP, 1573248, 384, 8384440);
                    kVarP = kVarP;
                }
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: f9.l7
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.c(this.f9983a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final String c0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final boolean z10, final eh.l lVar, final boolean z11, final eh.l lVar2, final String str, final eh.l lVar3, final String str2, final eh.l lVar4, final boolean z12, final eh.l lVar5, final String str3, final eh.l lVar6, final String str4, final eh.l lVar7, final boolean z13, final eh.l lVar8, final boolean z14, final eh.l lVar9, final String str5, final eh.l lVar10, final boolean z15, final eh.l lVar11, final String str6, final eh.l lVar12, final String str7, final eh.l lVar13, final boolean z16, final eh.l lVar14, final String str8, final eh.l lVar15, final boolean z17, final eh.l lVar16, final f1.b bVar, final boolean z18, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(398573604);
        int i11 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.c(z11) ? 256 : 128) | (kVarP.l(lVar2) ? 2048 : 1024) | (kVarP.K(str) ? 16384 : 8192) | (kVarP.l(lVar3) ? 131072 : 65536) | (kVarP.K(str2) ? 1048576 : 524288) | (kVarP.l(lVar4) ? 8388608 : 4194304) | (kVarP.c(z12) ? 67108864 : 33554432) | (kVarP.l(lVar5) ? 536870912 : 268435456);
        int i12 = (kVarP.K(str3) ? (char) 4 : (char) 2) | (kVarP.l(lVar6) ? ' ' : (char) 16) | (kVarP.K(str4) ? 256 : 128) | (kVarP.l(lVar7) ? 2048 : 1024) | (kVarP.c(z13) ? 16384 : 8192) | (kVarP.l(lVar8) ? 131072 : 65536) | (kVarP.c(z14) ? 1048576 : 524288) | (kVarP.l(lVar9) ? 8388608 : 4194304) | (kVarP.K(str5) ? 67108864 : 33554432) | (kVarP.l(lVar10) ? 536870912 : 268435456);
        int i13 = (kVarP.c(z15) ? (char) 4 : (char) 2) | (kVarP.l(lVar11) ? ' ' : (char) 16) | (kVarP.K(str6) ? 256 : 128) | (kVarP.l(lVar12) ? 2048 : 1024) | (kVarP.K(str7) ? (char) 16384 : (char) 8192) | (kVarP.l(lVar13) ? (char) 0 : (char) 0) | (kVarP.c(z16) ? (char) 0 : (char) 0) | (kVarP.l(lVar14) ? (char) 0 : (char) 0) | (kVarP.K(str8) ? (char) 0 : (char) 0) | (kVarP.l(lVar15) ? (char) 0 : (char) 0);
        int i14 = 384 | (kVarP.c(z17) ? (char) 4 : (char) 2) | (kVarP.l(lVar16) ? 32 : 16) | (kVarP.c(z18) ? 2048 : 1024);
        if ((i11 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (i14 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(1194419233);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            final x0.n1 n1Var = (x0.n1) objG;
            kVarP.T(false);
            i(f1.c.b(835506730, new m8(z10, lVar, bVar, z11, lVar2, z12, lVar5, str3, z18, lVar6, str4, lVar7, z13, lVar8, z14, lVar9, str5, lVar10, z15, lVar11, str6, lVar12, str7, lVar13, z16, lVar14, str8, lVar15, z17, lVar16, context, str, lVar3, str2, lVar4, n1Var), kVarP), kVarP, 6);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                kVarP.L(1195006932);
                Object objG2 = kVarP.g();
                if (objG2 == c0321a) {
                    objG2 = new eh.a() { // from class: f9.u7
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG2);
                }
                kVarP.T(false);
                b(6, (eh.a) objG2, kVarP);
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, lVar, z11, lVar2, str, lVar3, str2, lVar4, z12, lVar5, str3, lVar6, str4, lVar7, z13, lVar8, z14, lVar9, str5, lVar10, z15, lVar11, str6, lVar12, str7, lVar13, z16, lVar14, str8, lVar15, z17, lVar16, bVar, z18, i10) { // from class: f9.v7
                public final /* synthetic */ eh.l A;
                public final /* synthetic */ String B;
                public final /* synthetic */ eh.l C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ eh.l E;
                public final /* synthetic */ String F;
                public final /* synthetic */ eh.l G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ eh.l I;
                public final /* synthetic */ f1.b K;
                public final /* synthetic */ boolean L;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f10780a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f10781b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f10782c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f10783d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f10784e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.l f10785f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f10786g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.l f10787h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f10788j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ eh.l f10789k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ String f10790l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ eh.l f10791m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ String f10792n;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ eh.l f10793p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ boolean f10794q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ eh.l f10795r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ boolean f10796s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ eh.l f10797t;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f10798v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ eh.l f10799w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ boolean f10800x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ eh.l f10801y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ String f10802z;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.d(this.f10780a, this.f10781b, this.f10782c, this.f10783d, this.f10784e, this.f10785f, this.f10786g, this.f10787h, this.f10788j, this.f10789k, this.f10790l, this.f10791m, this.f10792n, this.f10793p, this.f10794q, this.f10795r, this.f10796s, this.f10797t, this.f10798v, this.f10799w, this.f10800x, this.f10801y, this.f10802z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.K, this.L, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean d0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(String str, eh.l lVar, boolean z10, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(1748341639);
        if ((((kVarP.K(str) ? 4 : 2) | i10 | (kVarP.l(lVar) ? 32 : 16) | 384) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(461556261);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            final x0.n1 n1Var = (x0.n1) objG;
            kVarP.T(false);
            List listJ = qg.p.j(new pg.n("top", f3.q.c(R.string.editor_admob_banner_top, kVarP)), new pg.n("bottom", f3.q.c(R.string.editor_admob_banner_bottom, kVarP)));
            boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
            kVarP.L(461565544);
            Object objG2 = kVarP.g();
            final boolean z11 = true;
            if (objG2 == c0321a) {
                objG2 = new eh.l() { // from class: f9.m5
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        ((Boolean) obj).getClass();
                        if (z11) {
                            n1Var.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG2);
            }
            kVarP.T(false);
            t0.o3.a(zBooleanValue, (eh.l) objG2, null, f1.c.b(76761521, new t8(listJ, str, true, n1Var, lVar), kVarP), kVarP, 3072);
            z10 = true;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new n5(str, lVar, z10, i10);
        }
    }

    public static final String e0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final void f(final String str, final String str2, final String input, final List<String> list, final eh.l<? super String, pg.f0> lVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1894382698);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.K(str2) ? 32 : 16) | (kVarP.K(input) ? 256 : 128) | (kVarP.l(lVar) ? 16384 : 8192);
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(1346849098);
            boolean zK = ((i11 & 896) == 256) | kVarP.K(list);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                Pattern patternCompile = Pattern.compile("^#[0-9A-Fa-f]{6}$");
                kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                kotlin.jvm.internal.r.e(input, "input");
                if (patternCompile.matcher(input).matches()) {
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (mh.t.j((String) it.next(), input, true)) {
                                objG = list;
                                break;
                            }
                        }
                    }
                    objG = qg.x.P(input, list);
                    kVarP.C(objG);
                } else {
                    objG = list;
                    kVarP.C(objG);
                }
            }
            List list2 = (List) objG;
            kVarP.T(false);
            b.i iVarH = z.b.h(8);
            f.a aVar = d.a.f14614m;
            z.q qVarA = z.o.a(iVarH, aVar, kVarP, 6);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar2, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            z.q qVarA2 = z.o.a(z.b.h(2), aVar, kVarP, 6);
            int i13 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, qVarA2, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            x0.s3 s3Var = t0.of.f26647a;
            t0.ff.b(str, null, 0L, 0L, x2.p.f32031d, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26548k, kVarP, (i11 & 14) | 196608, 0, 65502);
            t0.ff.b(str2, null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(s3Var)).f26549l, kVarP, (i11 >> 3) & 14, 0, 65530);
            kVarP = kVarP;
            kVarP.T(true);
            float f10 = 4;
            z.f0.a(q2.q.a(aVar2, false, g0.a.f11258a), z.b.h(f10), z.b.h(f10), null, 0, 0, f1.c.b(708159343, new b(lVar, input, list2), kVarP), kVarP, 1573302, 56);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, str2, input, list, lVar, i10) { // from class: f9.c6

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f9214a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f9215b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f9216c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ List f9217d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.l f9218e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(3073);
                    b8.f(this.f9214a, this.f9215b, this.f9216c, this.f9217d, this.f9218e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final int f0(x0.r3 r3Var) {
        return ((Number) r3Var.getValue()).intValue();
    }

    public static final void g(final String str, final eh.l lVar, final String str2, final eh.l lVar2, final eh.l lVar3, final String str3, final eh.l lVar4, final Uri uri, final String str4, final eh.a aVar, final boolean z10, final eh.a aVar2, final eh.a aVar3, final boolean z11, final List list, final eh.a aVar4, final eh.l lVar5, final eh.l lVar6, final p0.b bVar, final boolean z12, final f0.b bVar2, final eh.a aVar5, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1938330172);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.K(str2) ? 256 : 128) | (kVarP.l(lVar2) ? 2048 : 1024) | (kVarP.l(lVar3) ? 16384 : 8192) | (kVarP.K(str3) ? 131072 : 65536) | (kVarP.l(lVar4) ? 1048576 : 524288) | (kVarP.l(uri) ? 8388608 : 4194304) | (kVarP.K(str4) ? 67108864 : 33554432) | (kVarP.l(aVar) ? 536870912 : 268435456);
        int i12 = (kVarP.c(z10) ? (char) 4 : (char) 2) | (kVarP.l(aVar2) ? ' ' : (char) 16) | (kVarP.l(aVar3) ? 256 : 128) | (kVarP.c(z11) ? 2048 : 1024) | (kVarP.l(list) ? (char) 16384 : (char) 8192) | (kVarP.l(aVar4) ? (char) 0 : (char) 0) | (kVarP.l(lVar5) ? (char) 0 : (char) 0) | (kVarP.l(lVar6) ? (char) 0 : (char) 0) | (kVarP.l(bVar) ? (char) 0 : (char) 0) | (kVarP.c(z12) ? (char) 0 : (char) 0);
        int i13 = (kVarP.K(bVar2) ? (char) 4 : (char) 2) | (kVarP.l(aVar5) ? ' ' : (char) 16);
        if ((i11 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i13 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(991044138);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            kVarP.T(false);
            i(f1.c.b(-939147146, new k9(qg.p.j(new pg.n("local", f3.q.c(R.string.project_source_local, kVarP)), new pg.n("url", f3.q.c(R.string.project_source_url, kVarP)), new pg.n("paste", f3.q.c(R.string.project_source_paste, kVarP)), new pg.n("folder", f3.q.c(R.string.project_source_folder, kVarP)), new pg.n(ProjectKind.PDF, f3.q.c(R.string.pdf_source, kVarP))), str, lVar3, str2, lVar2, aVar3, str3, lVar4, z10, aVar2, aVar, uri, z11, str4, list, z12, bVar2, aVar4, aVar5, lVar5, lVar6, bVar, (x0.n1) objG, lVar, context), kVarP), kVarP, 6);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, lVar, str2, lVar2, lVar3, str3, lVar4, uri, str4, aVar, z10, aVar2, aVar3, z11, list, aVar4, lVar5, lVar6, bVar, z12, bVar2, aVar5, i10) { // from class: f9.x7

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10916a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f10917b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f10918c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f10919d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.l f10920e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f10921f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.l f10922g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Uri f10923h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ String f10924j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ eh.a f10925k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f10926l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ eh.a f10927m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ eh.a f10928n;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ boolean f10929p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ List f10930q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ eh.a f10931r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ eh.l f10932s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ eh.l f10933t;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ p0.b f10934v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f10935w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ f0.b f10936x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ eh.a f10937y;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.g(this.f10916a, this.f10917b, this.f10918c, this.f10919d, this.f10920e, this.f10921f, this.f10922g, this.f10923h, this.f10924j, this.f10925k, this.f10926l, this.f10927m, this.f10928n, this.f10929p, this.f10930q, this.f10931r, this.f10932s, this.f10933t, this.f10934v, this.f10935w, this.f10936x, this.f10937y, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final int g0(x0.r3 r3Var) {
        return ((Number) r3Var.getValue()).intValue();
    }

    public static final void h(final String str, final eh.l lVar, final boolean z10, final eh.l lVar2, final boolean z11, final eh.l lVar3, final boolean z12, final eh.l lVar4, final boolean z13, final eh.l lVar5, final boolean z14, final eh.l lVar6, final boolean z15, final eh.l lVar7, final boolean z16, final eh.a aVar, final String str2, final eh.l lVar8, final String str3, final eh.l lVar9, final String str4, final eh.l lVar10, final String str5, final eh.l lVar11, x0.j jVar, final int i10) {
        boolean z17;
        x0.k kVarP = jVar.p(-332999823);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.l(lVar2) ? 2048 : 1024) | (kVarP.c(z11) ? 16384 : 8192) | (kVarP.l(lVar3) ? 131072 : 65536) | (kVarP.c(z12) ? 1048576 : 524288) | (kVarP.l(lVar4) ? 8388608 : 4194304) | (kVarP.c(z13) ? 67108864 : 33554432) | (kVarP.l(lVar5) ? 536870912 : 268435456);
        int i12 = (kVarP.c(z14) ? (char) 4 : (char) 2) | (kVarP.l(lVar6) ? ' ' : (char) 16) | (kVarP.c(z15) ? 256 : 128) | (kVarP.l(lVar7) ? 2048 : 1024) | (kVarP.c(z16) ? (char) 16384 : (char) 8192) | (kVarP.l(aVar) ? (char) 0 : (char) 0) | (kVarP.K(str2) ? (char) 0 : (char) 0) | (kVarP.l(lVar8) ? (char) 0 : (char) 0) | (kVarP.K(str3) ? (char) 0 : (char) 0) | (kVarP.l(lVar9) ? (char) 0 : (char) 0);
        int i13 = (kVarP.K(str4) ? (char) 4 : (char) 2) | (kVarP.l(lVar10) ? ' ' : (char) 16) | (kVarP.K(str5) ? 256 : 128) | (kVarP.l(lVar11) ? 2048 : 1024);
        if ((i11 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i13 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(-491271149);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            kVarP.T(false);
            Object[] objArr = new Object[0];
            kVarP.L(-491268598);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                z17 = false;
                objG2 = new m7(0);
                kVarP.C(objG2);
            } else {
                z17 = false;
            }
            kVarP.T(z17);
            i(f1.c.b(2053862315, new ga(lVar2, z10, lVar3, z11, lVar4, z12, lVar5, z13, lVar6, z14, z16, lVar7, z15, aVar, (x0.n1) b0.a0.d(objArr, null, (eh.a) objG2, kVarP, 3072, 6), n1Var, qg.p.j(new pg.n("portrait", f3.q.c(R.string.editor_orientation_portrait, kVarP)), new pg.n("landscape", f3.q.c(R.string.editor_orientation_landscape, kVarP)), new pg.n("auto", f3.q.c(R.string.editor_orientation_auto, kVarP))), str, lVar, str5, lVar11, str4, lVar10, str3, lVar9, str2, lVar8), kVarP), kVarP, 6);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, lVar, z10, lVar2, z11, lVar3, z12, lVar4, z13, lVar5, z14, lVar6, z15, lVar7, z16, aVar, str2, lVar8, str3, lVar9, str4, lVar10, str5, lVar11, i10) { // from class: f9.n7
                public final /* synthetic */ eh.l A;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10109a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f10110b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f10111c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f10112d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f10113e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.l f10114f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f10115g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.l f10116h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f10117j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ eh.l f10118k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f10119l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ eh.l f10120m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ boolean f10121n;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ eh.l f10122p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ boolean f10123q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ eh.a f10124r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f10125s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ eh.l f10126t;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f10127v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ eh.l f10128w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ String f10129x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ eh.l f10130y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ String f10131z;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.h(this.f10109a, this.f10110b, this.f10111c, this.f10112d, this.f10113e, this.f10114f, this.f10115g, this.f10116h, this.f10117j, this.f10118k, this.f10119l, this.f10120m, this.f10121n, this.f10122p, this.f10123q, this.f10124r, this.f10125s, this.f10126t, this.f10127v, this.f10128w, this.f10129x, this.f10130y, this.f10131z, this.A, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final int h0(x0.r3 r3Var) {
        return ((Number) r3Var.getValue()).intValue();
    }

    public static final void i(f1.b bVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(525104518);
        if ((i10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), t0.z0.a(q1.b1.c(0.85f, ((t0.e2) kVarP.f(t0.f2.f25858a)).I), kVarP, 0), null, null, f1.c.b(836154744, new ha(bVar), kVarP), kVarP, 196614, 24);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b7(bVar, i10, 0);
        }
    }

    public static final int i0(x0.r3 r3Var) {
        return ((Number) r3Var.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public static final void j(final f0.b bVar, x0.j jVar, final int i10) {
        ?? r22;
        String strD;
        x0.k kVar;
        x0.k kVarP = jVar.p(-1776294036);
        int i11 = (kVarP.K(bVar) ? 4 : 2) | i10;
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            z.q qVarA = z.o.a(z.b.h(6), d.a.f14614m, kVarP, 6);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, kVarP);
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
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            if (bVar == null || bVar.f16802c <= 0) {
                r22 = 0;
                kVarP.L(-572699154);
                t0.z9.c(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 28, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a, 0L, e1.d.d(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 4), h0.f.a(2)), kVarP);
                kVarP.T(false);
            } else {
                kVarP.L(-572991453);
                kVarP.L(-1819597046);
                boolean z10 = (i11 & 14) == 4;
                Object objG = kVarP.g();
                if (z10 || objG == j.a.f31715a) {
                    objG = new xd(bVar, 2);
                    kVarP.C(objG);
                }
                kVarP.T(false);
                r22 = 0;
                t0.z9.b((eh.a) objG, e1.d.d(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 4), h0.f.a(2)), ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a, 0L, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                kVarP.T(false);
            }
            if (bVar == null) {
                kVarP.L(-1819580274);
                strD = f3.q.d(R.string.editor_folder_scanning, new Object[]{Integer.valueOf((int) r22)}, kVarP);
                kVarP.T(r22);
            } else {
                int i13 = bVar.f16802c;
                if (i13 > 0) {
                    kVarP.L(-1819577397);
                    strD = f3.q.d(R.string.editor_folder_copying, new Object[]{Integer.valueOf(bVar.f16801b), Integer.valueOf(i13)}, kVarP);
                    kVarP.T(r22);
                } else {
                    kVarP.L(-1819574085);
                    strD = f3.q.d(R.string.editor_folder_scanning, new Object[]{Integer.valueOf(bVar.f16800a)}, kVarP);
                    kVarP.T(r22);
                }
            }
            t0.ff.b(strD, null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(t0.of.f26647a)).f26549l, kVarP, 0, 0, 65530);
            x0.k kVar2 = kVarP;
            kVar2.T(true);
            kVar = kVar2;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: f9.x5
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.j(this.f10912a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final int j0(x0.r3 r3Var) {
        return ((Number) r3Var.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(final String str, final boolean z10, final eh.a<pg.f0> aVar, final androidx.compose.ui.d dVar, boolean z11, x0.j jVar, final int i10, final int i11) {
        boolean z12;
        boolean z13;
        int i12;
        g.a.C0128a c0128a;
        long j10;
        x0.k kVar;
        final boolean z14;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-1281802292);
        int i13 = (kVarP.K(str) ? 4 : 2) | i10 | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128) | (kVarP.K(dVar) ? 2048 : 1024);
        int i14 = i11 & 16;
        if (i14 == 0) {
            if ((i10 & 24576) == 0) {
                z12 = z11;
                i13 |= kVarP.c(z12) ? 16384 : 8192;
            }
            if ((i13 & 9363) == 9362 || !kVarP.s()) {
                boolean z15 = i14 == 0 ? true : z12;
                float f10 = 12;
                androidx.compose.ui.d dVarD = e1.d.d(dVar, h0.f.a(f10));
                kVarP.L(-390079458);
                long jC = (z10 || !z15) ? q1.b1.f21653g : q1.b1.c(0.2f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a);
                kVarP.T(false);
                z13 = z15;
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(androidx.compose.foundation.a.b(dVarD, jC, q1.y1.f21750a), z15, null, null, aVar, 6), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                i12 = kVarP.P;
                x0.a2 a2VarP = kVarP.P();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar2);
                }
                ph.v1.j(g.a.f13867f, l0VarD, kVarP);
                ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                c0128a = g.a.f13868g;
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, kVarP);
                if (!z10 && z13) {
                    kVarP.L(-873515488);
                    j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a;
                    kVarP.T(false);
                } else if (z13) {
                    kVarP.L(-873513495);
                    j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
                    kVarP.T(false);
                } else {
                    kVarP.L(-873511358);
                    j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25771q;
                    kVarP.T(false);
                }
                t0.ff.b(str, null, j10, 0L, !z10 ? x2.p.f32033f : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, null, kVarP, i13 & 14, 0, 131034);
                kVar = kVarP;
                kVar.T(true);
                z14 = z13;
            } else {
                kVarP.v();
                kVar = kVarP;
                z14 = z12;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: f9.b6
                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b8.k(str, z10, aVar, dVar, z14, (x0.j) obj, f3.i.n(i10 | 1), i11);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        i13 |= 24576;
        z12 = z11;
        if ((i13 & 9363) == 9362) {
            if (i14 == 0) {
            }
            float f102 = 12;
            androidx.compose.ui.d dVarD2 = e1.d.d(dVar, h0.f.a(f102));
            kVarP.L(-390079458);
            if (z10) {
                kVarP.T(false);
                z13 = z15;
                androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(androidx.compose.foundation.a.b(dVarD2, jC, q1.y1.f21750a), z15, null, null, aVar, 6), CropImageView.DEFAULT_ASPECT_RATIO, f102, 1);
                g2.l0 l0VarD2 = z.g.d(d.a.f14606e, false);
                i12 = kVarP.P;
                x0.a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ2, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar22 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                }
                ph.v1.j(g.a.f13867f, l0VarD2, kVarP);
                ph.v1.j(g.a.f13866e, a2VarP2, kVarP);
                c0128a = g.a.f13868g;
                if (!kVarP.O) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                    ph.v1.j(g.a.f13865d, dVarC2, kVarP);
                    if (!z10) {
                        if (z13) {
                        }
                        t0.ff.b(str, null, j10, 0L, !z10 ? x2.p.f32033f : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, null, kVarP, i13 & 14, 0, 131034);
                        kVar = kVarP;
                        kVar.T(true);
                        z14 = z13;
                    }
                }
            }
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    public static final int k0(x0.r3 r3Var) {
        return ((Number) r3Var.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(final String str, final Uri uri, final String str2, List<ProjectFile> list, x0.j jVar, final int i10, final int i11) {
        int i12;
        List<ProjectFile> list2;
        final List<ProjectFile> list3;
        Context context;
        Object objG;
        j.a.C0321a c0321a;
        x0.n1 n1Var;
        Object objA;
        x0.n1 n1Var2;
        Object objA2;
        x0.n1 n1Var3;
        boolean zL;
        Object objG2;
        x0.n1 n1Var4;
        x0.n1 n1Var5;
        x0.k kVar;
        final List<ProjectFile> list4;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(1307077811);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= kVarP.l(uri) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= kVarP.K(str2) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 == 0) {
            if ((i10 & 3072) == 0) {
                list2 = list;
                i12 |= kVarP.l(list2) ? 2048 : 1024;
            }
            if ((i12 & 1171) == 1170 || !kVarP.s()) {
                list3 = i13 == 0 ? qg.z.f22752a : list2;
                context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
                kVarP.L(324438509);
                objG = kVarP.g();
                c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    objG = bg.b.h(null);
                    kVarP.C(objG);
                }
                n1Var = (x0.n1) objG;
                objA = p0.h.a(kVarP, false, 324441044);
                if (objA == c0321a) {
                    objA = bg.b.h("");
                    kVarP.C(objA);
                }
                n1Var2 = (x0.n1) objA;
                objA2 = p0.h.a(kVarP, false, 324442775);
                if (objA2 == c0321a) {
                    objA2 = bg.b.h(Boolean.FALSE);
                    kVarP.C(objA2);
                }
                n1Var3 = (x0.n1) objA2;
                kVarP.T(false);
                Object[] objArr = {str, uri, str2, list3};
                kVarP.L(324447778);
                zL = ((i12 & 14) != 4) | ((i12 & 896) != 256) | kVarP.l(list3) | kVarP.l(uri) | kVarP.l(context);
                objG2 = kVarP.g();
                if (!zL || objG2 == c0321a) {
                    n1Var4 = n1Var2;
                    List<ProjectFile> list5 = list3;
                    n1Var5 = n1Var3;
                    c cVar = new c(str2, str, list5, uri, context, n1Var4, n1Var, n1Var5, null);
                    list3 = list5;
                    kVarP.C(cVar);
                    objG2 = cVar;
                } else {
                    n1Var4 = n1Var2;
                    n1Var5 = n1Var3;
                }
                kVarP.T(false);
                x0.o0.g(objArr, (eh.p) objG2, kVarP);
                if (!mh.x.A((String) n1Var4.getValue())) {
                    x0.h2 h2VarV2 = kVarP.V();
                    if (h2VarV2 != null) {
                        h2VarV2.f31703d = new eh.p() { // from class: f9.r5
                            @Override // eh.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                b8.l(str, uri, str2, list3, (x0.j) obj, f3.i.n(i10 | 1), i11);
                                return pg.f0.f21461a;
                            }
                        };
                        return;
                    }
                    return;
                }
                final List<ProjectFile> list6 = list3;
                kVarP.L(324497421);
                boolean zBooleanValue = ((Boolean) n1Var5.getValue()).booleanValue();
                d.a aVar = d.a.f1143b;
                if (zBooleanValue) {
                    float f10 = 8;
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), kVarP);
                    androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 4, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, kVarP, 54);
                    int i14 = kVarP.P;
                    x0.a2 a2VarP = kVarP.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar2 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.w(aVar2);
                    } else {
                        kVarP.z();
                    }
                    ph.v1.j(g.a.f13867f, m1VarA, kVarP);
                    ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
                    }
                    ph.v1.j(g.a.f13865d, dVarC, kVarP);
                    t0.ff.b(f3.q.c(R.string.editor_html_checking, kVarP), null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(t0.of.f26647a)).f26549l, kVarP, 0, 0, 65530);
                    if (1.0f <= 0.0d) {
                        a0.a.a("invalid weight; must be greater than zero");
                    }
                    t0.z9.c(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 30, 0L, 0L, androidx.compose.foundation.layout.g.f(new LayoutWeightElement(1.0f, true), 2), kVarP);
                    kVarP.T(true);
                    kVarP.T(false);
                    x0.h2 h2VarV3 = kVarP.V();
                    if (h2VarV3 != null) {
                        h2VarV3.f31703d = new eh.p() { // from class: f9.s5
                            @Override // eh.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                b8.l(str, uri, str2, list6, (x0.j) obj, f3.i.n(i10 | 1), i11);
                                return pg.f0.f21461a;
                            }
                        };
                        return;
                    }
                    return;
                }
                boolean z10 = true;
                kVar = kVarP;
                kVar.T(false);
                w.a aVar3 = (w.a) n1Var.getValue();
                if (aVar3 == null) {
                    x0.h2 h2VarV4 = kVar.V();
                    if (h2VarV4 != null) {
                        h2VarV4.f31703d = new eh.p() { // from class: f9.t5
                            @Override // eh.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                b8.l(str, uri, str2, list6, (x0.j) obj, f3.i.n(i10 | 1), i11);
                                return pg.f0.f21461a;
                            }
                        };
                        return;
                    }
                    return;
                }
                if (aVar3.f16909a.isEmpty() && aVar3.f16910b.isEmpty()) {
                    z10 = false;
                }
                kVar.L(324523009);
                if (!z10) {
                    t0.d1.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), h0.f.a(12), t0.z0.a(q1.b1.c(0.7f, ((t0.e2) kVar.f(t0.f2.f25858a)).f25755c), kVar, 0), null, null, f9.e.H, kVar, 196614, 24);
                    kVar.T(false);
                    x0.h2 h2VarV5 = kVar.V();
                    if (h2VarV5 != null) {
                        h2VarV5.f31703d = new eh.p() { // from class: f9.v5
                            @Override // eh.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                b8.l(str, uri, str2, list6, (x0.j) obj, f3.i.n(i10 | 1), i11);
                                return pg.f0.f21461a;
                            }
                        };
                        return;
                    }
                    return;
                }
                kVar.T(false);
                t0.d1.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), h0.f.a(12), t0.z0.a(q1.b1.c(0.6f, ((t0.e2) kVar.f(t0.f2.f25858a)).f25772r), kVar, 0), null, null, f1.c.b(1143006757, new d(aVar3), kVar), kVar, 196614, 24);
                list4 = list6;
            } else {
                kVarP.v();
                list4 = list2;
                kVar = kVarP;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: f9.w5
                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        b8.l(str, uri, str2, list4, (x0.j) obj, f3.i.n(i10 | 1), i11);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        i12 |= 3072;
        list2 = list;
        if ((i12 & 1171) == 1170) {
            if (i13 == 0) {
            }
            context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(324438509);
            objG = kVarP.g();
            c0321a = j.a.f31715a;
            if (objG == c0321a) {
            }
            n1Var = (x0.n1) objG;
            objA = p0.h.a(kVarP, false, 324441044);
            if (objA == c0321a) {
            }
            n1Var2 = (x0.n1) objA;
            objA2 = p0.h.a(kVarP, false, 324442775);
            if (objA2 == c0321a) {
            }
            n1Var3 = (x0.n1) objA2;
            kVarP.T(false);
            Object[] objArr2 = {str, uri, str2, list3};
            kVarP.L(324447778);
            if ((i12 & 896) != 256) {
            }
            zL = ((i12 & 14) != 4) | ((i12 & 896) != 256) | kVarP.l(list3) | kVarP.l(uri) | kVarP.l(context);
            objG2 = kVarP.g();
            if (zL) {
                n1Var4 = n1Var2;
                List<ProjectFile> list52 = list3;
                n1Var5 = n1Var3;
                c cVar2 = new c(str2, str, list52, uri, context, n1Var4, n1Var, n1Var5, null);
                list3 = list52;
                kVarP.C(cVar2);
                objG2 = cVar2;
                kVarP.T(false);
                x0.o0.g(objArr2, (eh.p) objG2, kVarP);
                if (!mh.x.A((String) n1Var4.getValue())) {
                }
            }
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    public static final int l0(x0.r3 r3Var) {
        return ((Number) r3Var.getValue()).intValue();
    }

    public static final void m(Uri uri, String str, eh.a aVar, boolean z10, eh.a aVar2, x0.j jVar, final int i10) {
        String str2;
        final eh.a aVar3;
        boolean z11;
        final eh.a aVar4;
        final Uri uri2;
        x0.k kVarP = jVar.p(-655068165);
        if ((((kVarP.l(uri) ? 4 : 2) | i10 | (kVarP.K(str) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128) | (kVarP.c(z10) ? 2048 : 1024) | (kVarP.l(aVar2) ? 16384 : 8192)) & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            uri2 = uri;
            str2 = str;
            aVar3 = aVar;
            z11 = z10;
            aVar4 = aVar2;
        } else {
            str2 = str;
            aVar3 = aVar;
            z11 = z10;
            aVar4 = aVar2;
            uri2 = uri;
            i(f1.c.b(-635265279, new ia(str2, aVar2, z11, aVar3, uri), kVarP), kVarP, 6);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            final boolean z12 = z11;
            final String str3 = str2;
            h2VarV.f31703d = new eh.p(uri2, str3, aVar3, z12, aVar4, i10) { // from class: f9.d7

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Uri f9313a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f9314b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f9315c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f9316d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f9317e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.m(this.f9313a, this.f9314b, this.f9315c, this.f9316d, this.f9317e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final String m0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final void n(final String str, final eh.l lVar, final String str2, final eh.l lVar2, final boolean z10, final String str3, final eh.l lVar3, final String str4, final eh.l lVar4, final boolean z11, final eh.l lVar5, final String str5, final eh.l lVar6, final String str6, final eh.l lVar7, final String str7, final eh.l lVar8, final String str8, final eh.l lVar9, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-50273148);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.K(str2) ? 256 : 128) | (kVarP.l(lVar2) ? 2048 : 1024) | (kVarP.c(z10) ? 16384 : 8192) | (kVarP.K(str3) ? 131072 : 65536) | (kVarP.l(lVar3) ? 1048576 : 524288) | (kVarP.K(str4) ? 8388608 : 4194304) | (kVarP.l(lVar4) ? 67108864 : 33554432) | (kVarP.c(z11) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i12 = (kVarP.l(lVar5) ? (char) 4 : (char) 2) | (kVarP.K(str5) ? ' ' : (char) 16) | (kVarP.l(lVar6) ? 256 : 128) | (kVarP.K(str6) ? 2048 : 1024) | (kVarP.l(lVar7) ? (char) 16384 : (char) 8192) | (kVarP.K(str7) ? (char) 0 : (char) 0) | (kVarP.l(lVar8) ? (char) 0 : (char) 0) | (kVarP.K(str8) ? (char) 0 : (char) 0) | (kVarP.l(lVar9) ? (char) 0 : (char) 0);
        if ((i11 & 306783379) == 306783378 && (i12 & 38347923) == 38347922 && kVarP.s()) {
            kVarP.v();
        } else {
            i(f1.c.b(-1586770498, new oa(str, lVar, str2, lVar2, z10, lVar5, z11, str7, lVar8, str8, lVar9, str3, lVar3, str4, lVar4, str5, lVar6, str6, lVar7), kVarP), kVarP, 6);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, lVar, str2, lVar2, z10, str3, lVar3, str4, lVar4, z11, lVar5, str5, lVar6, str6, lVar7, str7, lVar8, str8, lVar9, i10) { // from class: f9.c7

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f9219a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f9220b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f9221c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f9222d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f9223e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f9224f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.l f9225g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f9226h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.l f9227j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f9228k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ eh.l f9229l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ String f9230m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ eh.l f9231n;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ String f9232p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ eh.l f9233q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ String f9234r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ eh.l f9235s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ String f9236t;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ eh.l f9237v;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.n(this.f9219a, this.f9220b, this.f9221c, this.f9222d, this.f9223e, this.f9224f, this.f9225g, this.f9226h, this.f9227j, this.f9228k, this.f9229l, this.f9230m, this.f9231n, this.f9232p, this.f9233q, this.f9234r, this.f9235s, this.f9236t, this.f9237v, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean n0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void o(final String str, final boolean z10, x0.j jVar, final int i10) {
        long j10;
        long j11;
        x0.k kVar;
        x0.k kVarP = jVar.p(792128591);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            z.m1 m1VarA = z.k1.a(z.b.h(8), d.a.f14611j, kVarP, 54);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
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
            String str2 = z10 ? "•" : "◦";
            if (z10) {
                kVarP.L(-154395390);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25777w;
            } else {
                kVarP.L(-154394204);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a;
            }
            kVarP.T(false);
            t0.ff.b(str2, null, j10, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, kVarP, 196608, 0, 131034);
            t2.l0 l0Var = ((t0.nf) kVarP.f(t0.of.f26647a)).f26549l;
            if (z10) {
                kVarP.L(-154387358);
                j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25777w;
            } else {
                kVarP.L(-154386163);
                j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
            }
            kVarP.T(false);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            t0.ff.b(str, new LayoutWeightElement(1.0f, true), j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, i11 & 14, 0, 65528);
            kVar = kVarP;
            kVar.T(true);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, z10, i10) { // from class: f9.f6

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f9532a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f9533b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    b8.o(this.f9532a, this.f9533b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean o0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void p(final String str, final eh.l<? super String, pg.f0> lVar, final Long l10, final eh.l<? super Long, pg.f0> lVar2, final List<KeystoreEntity> list, final boolean z10, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, final eh.a<pg.f0> aVar3, x0.j jVar, final int i10) {
        Object next;
        x0.k kVarP = jVar.p(-101858859);
        if (((i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.K(l10) ? 256 : 128) | (kVarP.l(lVar2) ? 2048 : 1024) | (kVarP.l(list) ? 16384 : 8192) | (kVarP.c(z10) ? 131072 : 65536) | (kVarP.l(aVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.l(aVar2) ? 8388608 : 4194304) | (kVarP.l(aVar3) ? 67108864 : 33554432)) & 38347923) == 38347922 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(-84706484);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            kVarP.T(false);
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long id2 = ((KeystoreEntity) next).getId();
                if (l10 != null && id2 == l10.longValue()) {
                    break;
                }
            }
            KeystoreEntity keystoreEntity = (KeystoreEntity) next;
            String alias = keystoreEntity != null ? keystoreEntity.getAlias() : null;
            kVarP.L(-84702187);
            if (alias == null) {
                alias = f3.q.c(R.string.editor_default_keystore, kVarP);
            }
            kVarP.T(false);
            i(f1.c.b(-2010548133, new e(str, z10, aVar3, aVar, lVar, aVar2, n1Var, alias, lVar2, list), kVarP), kVarP, 6);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, lVar, l10, lVar2, list, z10, aVar, aVar2, aVar3, i10) { // from class: f9.w7

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10847a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f10848b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Long f10849c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f10850d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f10851e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f10852f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f10853g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.a f10854h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.a f10855j;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.p(this.f10847a, this.f10848b, this.f10849c, this.f10850d, this.f10851e, this.f10852f, this.f10853g, this.f10854h, this.f10855j, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final String p0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final void q(final List<String> list, final boolean z10, final Map<String, ? extends Set<String>> map, final eh.a<pg.f0> aVar, final eh.p<? super String, ? super Boolean, pg.f0> pVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1396240245);
        if (((i10 | (kVarP.l(list) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(map) ? 256 : 128) | (kVarP.l(aVar) ? 2048 : 1024) | (kVarP.l(pVar) ? 16384 : 8192)) & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            i(f1.c.b(-1560749755, new f(map, list, qg.p.j(new i5("android.permission.INTERNET", f3.q.c(R.string.editor_permission_internet, kVarP), f3.q.c(R.string.editor_permission_internet_desc, kVarP), z10), new i5("android.permission.ACCESS_NETWORK_STATE", f3.q.c(R.string.editor_permission_network_state, kVarP), f3.q.c(R.string.editor_permission_network_state_desc, kVarP), z10), new i5("android.permission.READ_EXTERNAL_STORAGE", f3.q.c(R.string.editor_permission_storage, kVarP), f3.q.c(R.string.editor_permission_storage_desc, kVarP), false), new i5("android.permission.WRITE_EXTERNAL_STORAGE", f3.q.c(R.string.editor_permission_storage, kVarP), f3.q.c(R.string.editor_permission_storage_desc, kVarP), false), new i5("android.permission.READ_MEDIA_IMAGES", f3.q.c(R.string.editor_permission_read_media_images, kVarP), f3.q.c(R.string.editor_permission_read_media_images_desc, kVarP), false), new i5("android.permission.READ_MEDIA_VIDEO", f3.q.c(R.string.editor_permission_read_media_video, kVarP), f3.q.c(R.string.editor_permission_read_media_video_desc, kVarP), false), new i5("android.permission.READ_MEDIA_AUDIO", f3.q.c(R.string.editor_permission_read_media_audio, kVarP), f3.q.c(R.string.editor_permission_read_media_audio_desc, kVarP), false), new i5("android.permission.CAMERA", f3.q.c(R.string.editor_permission_camera, kVarP), f3.q.c(R.string.editor_permission_camera_desc, kVarP), false), new i5("android.permission.RECORD_AUDIO", f3.q.c(R.string.editor_permission_record_audio, kVarP), f3.q.c(R.string.editor_permission_record_audio_desc, kVarP), false), new i5("android.permission.ACCESS_FINE_LOCATION", f3.q.c(R.string.editor_permission_fine_location, kVarP), f3.q.c(R.string.editor_permission_fine_location_desc, kVarP), false), new i5("android.permission.ACCESS_COARSE_LOCATION", f3.q.c(R.string.editor_permission_coarse_location, kVarP), f3.q.c(R.string.editor_permission_coarse_location_desc, kVarP), false), new i5("android.permission.POST_NOTIFICATIONS", f3.q.c(R.string.editor_permission_post_notifications, kVarP), f3.q.c(R.string.editor_permission_post_notifications_desc, kVarP), false), new i5("android.permission.SCHEDULE_EXACT_ALARM", f3.q.c(R.string.editor_permission_schedule_exact_alarm, kVarP), f3.q.c(R.string.editor_permission_schedule_exact_alarm_desc, kVarP), false), new i5("android.permission.ACTIVITY_RECOGNITION", f3.q.c(R.string.editor_permission_activity_recognition, kVarP), f3.q.c(R.string.editor_permission_activity_recognition_desc, kVarP), false), new i5("android.permission.VIBRATE", f3.q.c(R.string.editor_permission_vibrate, kVarP), f3.q.c(R.string.editor_permission_vibrate_desc, kVarP), false), new i5("android.permission.READ_PHONE_STATE", f3.q.c(R.string.editor_permission_phone_state, kVarP), f3.q.c(R.string.editor_permission_phone_state_desc, kVarP), false)), aVar, (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b), pVar), kVarP), kVarP, 6);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(list, z10, map, aVar, pVar, i10) { // from class: f9.e7

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f9487a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f9488b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Map f9489c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f9490d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.p f9491e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.q(this.f9487a, this.f9488b, this.f9489c, this.f9490d, this.f9491e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final Long q0(x0.r3 r3Var) {
        return (Long) r3Var.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final String str, String str2, List<pg.n<String, String>> list, eh.l<? super String, pg.f0> lVar, x0.j jVar, final int i10) {
        int i11;
        int i12;
        Object objG;
        x0.n1 n1Var;
        String str3;
        List<pg.n<String, String>> list2;
        Object objG2;
        eh.l<? super String, pg.f0> lVar2;
        x0.k kVarP = jVar.p(1781842441);
        int i13 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.K(str2) ? 32 : 16) | (kVarP.l(list) ? 256 : 128) | (kVarP.l(lVar) ? 2048 : 1024);
        if ((i13 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            list2 = list;
            str3 = str2;
            lVar2 = lVar;
        } else {
            kVarP.L(-18399240);
            Object objG3 = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG3 == c0321a) {
                objG3 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG3);
            }
            x0.n1 n1Var2 = (x0.n1) objG3;
            kVarP.T(false);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i14 = kVarP.P;
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
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O) {
                i11 = i13;
            } else {
                i11 = i13;
                if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, kVarP);
                t0.ff.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(t0.of.f26647a)).f26550m, kVarP, i11 & 14, 0, 65534);
                kVarP = kVarP;
                g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
                i12 = kVarP.P;
                x0.a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar2);
                }
                ph.v1.j(bVar, l0VarD, kVarP);
                ph.v1.j(dVar, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                kVarP.L(-1799254041);
                objG = kVarP.g();
                if (objG != c0321a) {
                    n1Var = n1Var2;
                    objG = new e6(n1Var, 0);
                    kVarP.C(objG);
                } else {
                    n1Var = n1Var2;
                }
                kVarP.T(false);
                str3 = str2;
                list2 = list;
                t0.x0.c((eh.a) objG, androidx.compose.foundation.layout.g.d(aVar, 1.0f), false, null, null, null, null, f1.c.b(-2067890981, new g(list, str3), kVarP), kVarP, 805306422, 508);
                boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
                kVarP.L(-1799246392);
                objG2 = kVarP.g();
                if (objG2 == c0321a) {
                    objG2 = new androidx.lifecycle.p0(n1Var, 1);
                    kVarP.C(objG2);
                }
                kVarP.T(false);
                lVar2 = lVar;
                q8.g.a(zBooleanValue, (eh.a) objG2, f1.c.b(390761529, new h(lVar2, list2, n1Var), kVarP), kVarP, 432);
                kVarP.T(true);
                kVarP.T(true);
            }
            org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            t0.ff.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) kVarP.f(t0.of.f26647a)).f26550m, kVarP, i11 & 14, 0, 65534);
            kVarP = kVarP;
            g2.l0 l0VarD2 = z.g.d(d.a.f14602a, false);
            i12 = kVarP.P;
            x0.a2 a2VarP22 = kVarP.P();
            androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(aVar, kVarP);
            kVarP.r();
            if (kVarP.O) {
            }
            ph.v1.j(bVar, l0VarD2, kVarP);
            ph.v1.j(dVar, a2VarP22, kVarP);
            if (!kVarP.O) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                ph.v1.j(cVar2, dVarC22, kVarP);
                kVarP.L(-1799254041);
                objG = kVarP.g();
                if (objG != c0321a) {
                }
                kVarP.T(false);
                str3 = str2;
                list2 = list;
                t0.x0.c((eh.a) objG, androidx.compose.foundation.layout.g.d(aVar, 1.0f), false, null, null, null, null, f1.c.b(-2067890981, new g(list, str3), kVarP), kVarP, 805306422, 508);
                boolean zBooleanValue2 = ((Boolean) n1Var.getValue()).booleanValue();
                kVarP.L(-1799246392);
                objG2 = kVarP.g();
                if (objG2 == c0321a) {
                }
                kVarP.T(false);
                lVar2 = lVar;
                q8.g.a(zBooleanValue2, (eh.a) objG2, f1.c.b(390761529, new h(lVar2, list2, n1Var), kVarP), kVarP, 432);
                kVarP.T(true);
                kVarP.T(true);
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            final eh.l<? super String, pg.f0> lVar3 = lVar2;
            final String str4 = str3;
            final List<pg.n<String, String>> list3 = list2;
            h2VarV.f31703d = new eh.p(str, str4, list3, lVar3, i10) { // from class: f9.w6

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10843a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f10844b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f10845c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f10846d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.r(this.f10843a, this.f10844b, this.f10845c, this.f10846d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final List r0(x0.r3 r3Var) {
        return (List) r3Var.getValue();
    }

    public static final void s(final int i10, final eh.a aVar, x0.j jVar) {
        int i11;
        x0.k kVarP = jVar.p(1774886074);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(12), t0.z0.a(q1.b1.c(0.12f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a), kVarP, 0), null, null, f1.c.b(1860755464, new i(aVar), kVarP), kVarP, 196614, 24);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: f9.g7
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    b8.s(f3.i.n(i10 | 1), aVar, (x0.j) obj);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean s0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    public static final void t(final p5.x xVar, final long j10, final boolean z10, final String str, fg fgVar, a9.b2 b2Var, x0.j jVar, final int i10) {
        int i11;
        a9.b2 b2Var2;
        fg fgVar2;
        final fg fgVar3;
        Object gbVar;
        final x0.n1 n1Var;
        Long l10;
        x0.k kVar;
        ?? r02;
        x0.n1 n1Var2;
        ?? r52;
        ?? r53;
        ?? r11;
        final fg fgVar4;
        x0.k kVar2;
        final a9.b2 b2Var3;
        p5.x navController = xVar;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(554869970);
        int i12 = i10 | (kVarP.l(navController) ? 4 : 2) | (kVarP.j(j10) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.K(str) ? 2048 : 1024) | 73728;
        if ((74899 & i12) == 74898 && kVarP.s()) {
            kVarP.v();
            fgVar4 = fgVar;
            kVar2 = kVarP;
            b2Var3 = b2Var;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB = k5.c.b(fg.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                fg fgVar5 = (fg) w0VarB;
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA2 = k5.b.a(kVarP);
                if (b1VarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA2 = f5.a.a(b1VarA2, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB2 = k5.c.b(a9.b2.class, b1VarA2, bVarA2, b1VarA2 instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA2).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                i11 = i12 & (-516097);
                b2Var2 = (a9.b2) w0VarB2;
                fgVar2 = fgVar5;
            } else {
                kVarP.v();
                b2Var2 = b2Var;
                i11 = i12 & (-516097);
                fgVar2 = fgVar;
            }
            kVarP.U();
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            List listJ = qg.p.j(f3.q.c(R.string.editor_step_info, kVarP), f3.q.c(R.string.editor_step_content, kVarP), f3.q.c(R.string.editor_step_display, kVarP), f3.q.c(R.string.editor_step_permissions, kVarP), f3.q.c(R.string.editor_step_icon, kVarP), f3.q.c(R.string.editor_step_splash, kVarP), f3.q.c(kotlin.jvm.internal.r.a((String) bg.b.b(fgVar2.f9600y, kVarP).getValue(), ProjectKind.PDF) ? R.string.editor_step_pdf_reader : R.string.editor_step_webview, kVarP), f3.q.c(R.string.editor_step_ads, kVarP), f3.q.c(R.string.editor_step_summary, kVarP), f3.q.c(R.string.editor_step_output, kVarP));
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                x0.w2 w2Var = new x0.w2(kVarP.x());
                kVarP.C(w2Var);
                objG = w2Var;
            }
            ph.i0 i0Var = (ph.i0) objG;
            x0.n1 n1VarB = bg.b.b(b2Var2.f142f, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(184769005);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new h6();
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.l1 l1Var = (x0.l1) b0.a0.d(objArr, null, (eh.a) objG2, kVarP, 3072, 6);
            kVarP.L(184770647);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG3);
            }
            x0.n1 n1Var3 = (x0.n1) objG3;
            kVarP.T(false);
            Object[] objArr2 = new Object[0];
            kVarP.L(184773166);
            Object objG4 = kVarP.g();
            if (objG4 == c0321a) {
                objG4 = new k6(0);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            x0.n1 n1Var4 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG4, kVarP, 3072, 6);
            Object[] objArr3 = new Object[0];
            kVarP.L(184775534);
            Object objG5 = kVarP.g();
            if (objG5 == c0321a) {
                objG5 = new l6();
                kVarP.C(objG5);
            }
            kVarP.T(false);
            x0.n1 n1Var5 = (x0.n1) b0.a0.d(objArr3, null, (eh.a) objG5, kVarP, 3072, 6);
            kVarP.L(184777212);
            Object objG6 = kVarP.g();
            if (objG6 == c0321a) {
                objG6 = bg.b.h(null);
                kVarP.C(objG6);
            }
            x0.n1 n1Var6 = (x0.n1) objG6;
            kVarP.T(false);
            androidx.lifecycle.t tVar = (androidx.lifecycle.t) kVarP.f(h5.k.f12264a);
            Long lValueOf = Long.valueOf(j10);
            kVarP.L(184782098);
            a9.b2 b2Var4 = b2Var2;
            boolean zL = kVarP.l(fgVar2) | ((i11 & 112) == 32) | ((i11 & V4Signature.MAX_SIGNING_INFOS_SIZE) == 2048) | kVarP.K(n1Var4) | ((i11 & 896) == 256) | kVarP.K(n1Var5) | kVarP.l(navController) | kVarP.l(tVar);
            Object objG7 = kVarP.g();
            if (zL || objG7 == c0321a) {
                fgVar3 = fgVar2;
                n1Var = n1Var6;
                l10 = lValueOf;
                x0.k kVar3 = kVarP;
                gbVar = new gb(fgVar3, j10, str, z10, xVar, tVar, n1Var4, n1Var5, null);
                navController = xVar;
                kVar3.C(gbVar);
                kVar = kVar3;
            } else {
                fgVar3 = fgVar2;
                n1Var = n1Var6;
                kVar = kVarP;
                gbVar = objG7;
                l10 = lValueOf;
            }
            kVar.T(false);
            x0.o0.d((eh.p) gbVar, l10, kVar);
            kVar.L(184812431);
            boolean zL2 = kVar.l(fgVar3) | kVar.l(navController);
            Object objG8 = kVar.g();
            if (zL2 || objG8 == c0321a) {
                r02 = 0;
                objG8 = new m6(0, fgVar3, navController);
                kVar.C(objG8);
            } else {
                r02 = 0;
            }
            kVar.T(r02);
            c.e.a(r02, 1, (eh.a) objG8, kVar, r02);
            x0.n1 n1VarB2 = bg.b.b(fgVar3.f9586r, kVar);
            x0.n1 n1VarB3 = bg.b.b(fgVar3.f9588s, kVar);
            x0.n1 n1VarB4 = bg.b.b(fgVar3.f9590t, kVar);
            x0.n1 n1VarB5 = bg.b.b(fgVar3.f9592u, kVar);
            x0.n1 n1VarB6 = bg.b.b(fgVar3.f9594v, kVar);
            x0.n1 n1VarB7 = bg.b.b(fgVar3.f9596w, kVar);
            x0.n1 n1VarB8 = bg.b.b(fgVar3.f9598x, kVar);
            x0.n1 n1VarB9 = bg.b.b(fgVar3.f9600y, kVar);
            x0.n1 n1VarB10 = bg.b.b(fgVar3.f9602z, kVar);
            x0.n1 n1VarB11 = bg.b.b(fgVar3.B, kVar);
            x0.n1 n1VarB12 = bg.b.b(fgVar3.C, kVar);
            x0.n1 n1VarB13 = bg.b.b(fgVar3.F, kVar);
            x0.n1 n1VarB14 = bg.b.b(fgVar3.D, kVar);
            x0.n1 n1VarB15 = bg.b.b(fgVar3.E, kVar);
            x0.n1 n1VarB16 = bg.b.b(fgVar3.Z, kVar);
            x0.n1 n1VarB17 = bg.b.b(fgVar3.f9553a0, kVar);
            x0.n1 n1VarB18 = bg.b.b(fgVar3.f9555b0, kVar);
            x0.n1 n1VarB19 = bg.b.b(fgVar3.f9557c0, kVar);
            x0.n1 n1VarB20 = bg.b.b(fgVar3.f9559d0, kVar);
            x0.n1 n1VarB21 = bg.b.b(fgVar3.H, kVar);
            x0.n1 n1VarB22 = bg.b.b(fgVar3.I, kVar);
            x0.n1 n1VarB23 = bg.b.b(fgVar3.J, kVar);
            x0.n1 n1VarB24 = bg.b.b(fgVar3.K, kVar);
            x0.n1 n1VarB25 = bg.b.b(fgVar3.L, kVar);
            x0.n1 n1VarB26 = bg.b.b(fgVar3.M, kVar);
            x0.n1 n1VarB27 = bg.b.b(fgVar3.N, kVar);
            x0.n1 n1VarB28 = bg.b.b(fgVar3.O, kVar);
            x0.n1 n1VarB29 = bg.b.b(fgVar3.P, kVar);
            x0.n1 n1VarB30 = bg.b.b(fgVar3.Q, kVar);
            x0.n1 n1VarB31 = bg.b.b(fgVar3.R, kVar);
            x0.n1 n1VarB32 = bg.b.b(fgVar3.S, kVar);
            x0.n1 n1VarB33 = bg.b.b(fgVar3.T, kVar);
            x0.n1 n1VarB34 = bg.b.b(fgVar3.U, kVar);
            x0.n1 n1VarB35 = bg.b.b(fgVar3.V, kVar);
            x0.n1 n1VarB36 = bg.b.b(fgVar3.W, kVar);
            x0.n1 n1VarB37 = bg.b.b(fgVar3.X, kVar);
            x0.n1 n1VarB38 = bg.b.b(fgVar3.Y, kVar);
            x0.n1 n1VarB39 = bg.b.b(fgVar3.f9563f0, kVar);
            x0.n1 n1VarB40 = bg.b.b(fgVar3.f9581o0, kVar);
            x0.n1 n1VarB41 = bg.b.b(fgVar3.f9583p0, kVar);
            x0.n1 n1VarB42 = bg.b.b(fgVar3.f9572k, kVar);
            x0.n1 n1VarB43 = bg.b.b(fgVar3.f9585q0, kVar);
            x0.n1 n1VarB44 = bg.b.b(fgVar3.f9587r0, kVar);
            x0.n1 n1VarB45 = bg.b.b(fgVar3.f9589s0, kVar);
            x0.n1 n1VarB46 = bg.b.b(fgVar3.f9591t0, kVar);
            x0.n1 n1VarB47 = bg.b.b(fgVar3.f9593u0, kVar);
            x0.n1 n1VarB48 = bg.b.b(fgVar3.f9595v0, kVar);
            x0.n1 n1VarB49 = bg.b.b(fgVar3.f9599x0, kVar);
            x0.n1 n1VarB50 = bg.b.b(fgVar3.f9597w0, kVar);
            x0.n1 n1VarB51 = bg.b.b(fgVar3.f9601y0, kVar);
            x0.n1 n1VarB52 = bg.b.b(fgVar3.V0, kVar);
            x0.n1 n1VarB53 = bg.b.b(fgVar3.W0, kVar);
            x0.n1 n1VarB54 = bg.b.b(fgVar3.f9603z0, kVar);
            x0.n1 n1VarB55 = bg.b.b(fgVar3.A0, kVar);
            x0.n1 n1VarB56 = bg.b.b(fgVar3.B0, kVar);
            x0.n1 n1VarB57 = bg.b.b(fgVar3.C0, kVar);
            x0.n1 n1VarB58 = bg.b.b(fgVar3.D0, kVar);
            x0.n1 n1VarB59 = bg.b.b(fgVar3.M0, kVar);
            x0.n1 n1VarB60 = bg.b.b(fgVar3.I0, kVar);
            x0.n1 n1VarB61 = bg.b.b(fgVar3.E0, kVar);
            x0.n1 n1VarB62 = bg.b.b(fgVar3.F0, kVar);
            x0.n1 n1VarB63 = bg.b.b(fgVar3.G0, kVar);
            x0.n1 n1VarB64 = bg.b.b(fgVar3.H0, kVar);
            x0.n1 n1VarB65 = bg.b.b(fgVar3.J0, kVar);
            x0.n1 n1VarB66 = bg.b.b(fgVar3.K0, kVar);
            x0.n1 n1VarB67 = bg.b.b(fgVar3.L0, kVar);
            x0.n1 n1VarB68 = bg.b.b(fgVar3.N0, kVar);
            x0.n1 n1VarB69 = bg.b.b(fgVar3.O0, kVar);
            x0.n1 n1VarB70 = bg.b.b(fgVar3.f9576m, kVar);
            x0.n1 n1VarB71 = bg.b.b(fgVar3.f9580o, kVar);
            x0.n1 n1VarB72 = bg.b.b(fgVar3.f9584q, kVar);
            f.c cVar = new f.c();
            kVar.L(184976597);
            boolean zL3 = kVar.l(fgVar3);
            Object objG9 = kVar.g();
            if (zL3 || objG9 == c0321a) {
                n1Var2 = n1VarB12;
                r52 = 0;
                objG9 = new n6(fgVar3, 0);
                kVar.C(objG9);
            } else {
                n1Var2 = n1VarB12;
                r52 = 0;
            }
            kVar.T(r52);
            c.k kVarA = c.d.a(cVar, (eh.l) objG9, kVar, r52);
            ud udVar = new ud();
            kVar.L(184993718);
            boolean zL4 = kVar.l(fgVar3);
            Object objG10 = kVar.g();
            if (zL4 || objG10 == c0321a) {
                objG10 = new b9.e4(fgVar3, 1);
                kVar.C(objG10);
            }
            kVar.T(false);
            c.k kVarA2 = c.d.a(udVar, (eh.l) objG10, kVar, 0);
            f.e eVar = new f.e();
            kVar.L(184999098);
            boolean zL5 = kVar.l(fgVar3);
            Object objG11 = kVar.g();
            if (zL5 || objG11 == c0321a) {
                objG11 = new eh.l() { // from class: f9.o6
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            fg fgVar6 = fgVar3;
                            fgVar6.f9561e0 = ph.h.c(androidx.lifecycle.x0.a(fgVar6), null, null, new mg(fgVar6.f9561e0, fgVar6, uri, null), 3);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVar.C(objG11);
            }
            kVar.T(false);
            c.k kVarA3 = c.d.a(eVar, (eh.l) objG11, kVar, 0);
            f.g gVar = new f.g();
            kVar.L(185005538);
            boolean zL6 = kVar.l(fgVar3) | kVar.l(context);
            Object objG12 = kVar.g();
            if (zL6 || objG12 == c0321a) {
                objG12 = new eh.l() { // from class: f9.p6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        String message;
                        e.a result = (e.a) obj;
                        kotlin.jvm.internal.r.e(result, "result");
                        Intent intent = result.f8087b;
                        int i13 = result.f8086a;
                        fg fgVar6 = fgVar3;
                        x0.n1 n1Var7 = n1Var;
                        if (i13 == -1) {
                            Uri uri = intent != null ? (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri") : null;
                            if (uri != null) {
                                fgVar6.u(uri);
                            }
                            n1Var7.setValue(null);
                        } else if (i13 == 96) {
                            kotlin.jvm.internal.r.b(intent);
                            Throwable th2 = (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
                            if (th2 == null || (message = th2.getMessage()) == null) {
                                message = "";
                            }
                            Context context2 = context;
                            Toast.makeText(context2, context2.getString(R.string.editor_crop_error, message), 0).show();
                            Uri uri2 = (Uri) n1Var7.getValue();
                            if (uri2 != null) {
                                fgVar6.u(uri2);
                                n1Var7.setValue(null);
                            }
                        } else {
                            n1Var7.setValue(null);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVar.C(objG12);
            }
            kVar.T(false);
            final c.k kVarA4 = c.d.a(gVar, (eh.l) objG12, kVar, 0);
            kVar.L(185028748);
            boolean zL7 = kVar.l(context) | kVar.l(kVarA4) | kVar.l(fgVar3);
            Object objG13 = kVar.g();
            if (zL7 || objG13 == c0321a) {
                objG13 = new eh.l() { // from class: f9.q6
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        Context context2 = context;
                        c.k kVar4 = kVarA4;
                        Uri sourceUri = (Uri) obj;
                        kotlin.jvm.internal.r.e(sourceUri, "sourceUri");
                        x0.n1 n1Var7 = n1Var;
                        n1Var7.setValue(sourceUri);
                        try {
                            Uri uriFromFile = Uri.fromFile(new File(context2.getFilesDir(), "cropped_icon_" + System.currentTimeMillis() + ".png"));
                            int i13 = CropActivity.f5745f;
                            kotlin.jvm.internal.r.b(uriFromFile);
                            hf.a.a(kVar4, context2, CropActivity.a.a(context2, sourceUri, uriFromFile), R.string.launch_no_app);
                        } catch (Exception unused) {
                            org.bouncycastle.crypto.engines.a.b(context2, R.string.editor_crop_fallback, context2, 0);
                            fgVar3.u(sourceUri);
                            n1Var7.setValue(null);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVar.C(objG13);
            }
            eh.l lVar = (eh.l) objG13;
            kVar.T(false);
            f.c cVar2 = new f.c();
            kVar.L(185052387);
            boolean zK = kVar.K(lVar);
            Object objG14 = kVar.g();
            if (zK || objG14 == c0321a) {
                r53 = 0;
                objG14 = new r6(0, lVar);
                kVar.C(objG14);
            } else {
                r53 = 0;
            }
            kVar.T(r53);
            c.k kVarA5 = c.d.a(cVar2, (eh.l) objG14, kVar, r53);
            f.c cVar3 = new f.c();
            kVar.L(185056984);
            boolean zL8 = kVar.l(fgVar3);
            Object objG15 = kVar.g();
            if (zL8 || objG15 == c0321a) {
                r11 = 0;
                objG15 = new i6(fgVar3, 0);
                kVar.C(objG15);
            } else {
                r11 = 0;
            }
            kVar.T(r11);
            x0.k kVar4 = kVar;
            fg fgVar6 = fgVar3;
            t0.ra.a(null, f1.c.b(1254212238, new jb(j10, fgVar3, navController), kVar), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-1810690909, new td(listJ, l1Var, fgVar6, n1VarB9, kVarA, context, kVarA2, j10, navController, n1VarB2, n1VarB14, n1VarB52, n1VarB15, n1VarB53, n1VarB11, n1VarB10, n1VarB13, n1Var2, kVarA3, n1VarB39, kVarA5, i0Var, lVar, c.d.a(cVar3, (eh.l) objG15, kVar, r11), n1VarB40, n1VarB, n1VarB3, n1VarB4, n1VarB5, n1VarB50, n1VarB6, n1VarB7, n1VarB8, n1VarB51, n1VarB72, n1VarB16, n1VarB18, n1VarB19, n1VarB20, n1VarB43, n1VarB44, n1VarB45, n1VarB46, n1VarB47, n1VarB48, n1VarB49, n1VarB22, n1VarB21, n1VarB70, n1VarB23, n1VarB24, n1VarB25, n1VarB26, n1VarB27, n1VarB28, n1VarB29, n1VarB30, n1VarB31, n1VarB32, n1VarB33, n1VarB34, n1VarB35, n1VarB36, n1VarB37, n1VarB38, n1VarB71, n1VarB54, n1VarB65, n1VarB55, n1VarB63, n1VarB66, n1VarB56, n1VarB61, n1VarB62, n1VarB67, n1VarB57, n1VarB64, n1VarB68, n1VarB69, n1VarB59, n1VarB58, n1VarB60, n1Var3, n1VarB41, n1VarB42, n1VarB17), kVar4), kVar4, 806879280, 189);
            fgVar4 = fgVar6;
            kVar2 = kVar4;
            b2Var3 = b2Var4;
        }
        x0.h2 h2VarV = kVar2.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(j10, z10, str, fgVar4, b2Var3, i10) { // from class: f9.j6

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f9875b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f9876c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f9877d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fg f9878e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ a9.b2 f9879f;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.t(this.f9874a, this.f9875b, this.f9876c, this.f9877d, this.f9878e, this.f9879f, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean t0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void u(final ProjectFile projectFile, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        int i11;
        w1.d dVarA;
        long j10;
        x0.k kVarP = jVar.p(-830160391);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? kVarP.K(projectFile) : kVarP.l(projectFile) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(aVar2) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            ProjectFile.Type type = projectFile.getType();
            int[] iArr = d0.f9049a;
            int i12 = iArr[type.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                dVarA = p0.w1.a();
            } else {
                if (i12 != 4) {
                    throw new pg.l();
                }
                dVarA = p0.n5.a();
            }
            int i13 = iArr[projectFile.getType().ordinal()];
            if (i13 == 1) {
                kVarP.L(-34997585);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a;
                kVarP.T(false);
            } else if (i13 == 2) {
                kVarP.L(-34995471);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25760f;
                kVarP.T(false);
            } else if (i13 == 3) {
                kVarP.L(-34993328);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25764j;
                kVarP.T(false);
            } else {
                if (i13 != 4) {
                    kVarP.L(-34999786);
                    kVarP.T(false);
                    throw new pg.l();
                }
                kVarP.L(-34991112);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
                kVarP.T(false);
            }
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(12), t0.z0.a(((t0.e2) kVarP.f(t0.f2.f25858a)).G, kVarP, 0), null, null, f1.c.b(-1714936761, new j(dVarA, j10, projectFile, aVar, aVar2), kVarP), kVarP, 196614, 24);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: f9.g6
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    b8.u(projectFile, aVar, aVar2, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean u0(x0.n1 n1Var) {
        return ((Boolean) n1Var.getValue()).booleanValue();
    }

    public static final void v(final ProjectFile projectFile, eh.a<pg.f0> aVar, final eh.l<? super String, pg.f0> lVar, x0.j jVar, final int i10) {
        int i11;
        Object kVar;
        x0.n1 n1Var;
        ProjectFile projectFile2;
        x0.k kVar2;
        final eh.a<pg.f0> aVar2;
        x0.k kVarP = jVar.p(813519414);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? kVarP.K(projectFile) : kVarP.l(projectFile) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(lVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            aVar2 = aVar;
            kVar2 = kVarP;
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            Uri uri = projectFile.getUri();
            kVarP.L(661779459);
            boolean zK = kVarP.K(uri);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK || objG == c0321a) {
                String content = projectFile.getContent();
                if (content == null) {
                    content = "";
                }
                objG = bg.b.h(content);
                kVarP.C(objG);
            }
            x0.n1 n1Var2 = (x0.n1) objG;
            kVarP.T(false);
            Uri uri2 = projectFile.getUri();
            kVarP.L(661781893);
            boolean zK2 = kVarP.K(uri2);
            Object objG2 = kVarP.g();
            if (zK2 || objG2 == c0321a) {
                objG2 = bg.b.h(Boolean.valueOf(projectFile.getContent() != null));
                kVarP.C(objG2);
            }
            x0.n1 n1Var3 = (x0.n1) objG2;
            kVarP.T(false);
            Uri uri3 = projectFile.getUri();
            kVarP.L(661784438);
            boolean zK3 = kVarP.K(uri3);
            Object objG3 = kVarP.g();
            if (zK3 || objG3 == c0321a) {
                objG3 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG3);
            }
            x0.n1 n1Var4 = (x0.n1) objG3;
            kVarP.T(false);
            Uri uri4 = projectFile.getUri();
            kVarP.L(661788349);
            boolean zK4 = kVarP.K(n1Var3) | kVarP.l(context) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && kVarP.l(projectFile))) | kVarP.K(n1Var2) | kVarP.K(n1Var4);
            Object objG4 = kVarP.g();
            if (zK4 || objG4 == c0321a) {
                n1Var = n1Var4;
                kVar = new k(n1Var3, context, projectFile, n1Var2, n1Var, null);
                n1Var3 = n1Var3;
                projectFile2 = projectFile;
                kVarP.C(kVar);
            } else {
                kVar = objG4;
                projectFile2 = projectFile;
                n1Var = n1Var4;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) kVar, uri4, kVarP);
            kVar2 = kVarP;
            aVar2 = aVar;
            t0.r.a(aVar2, f1.c.b(-841817986, new l(lVar, n1Var2, n1Var3), kVarP), null, f1.c.b(562051200, new m(aVar), kVarP), null, f1.c.b(1965920386, new n(projectFile2), kVarP), f1.c.b(-1627112317, new o(n1Var2, n1Var, n1Var3), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar2, ((i12 >> 3) & 14) | 1772592, 0, 16276);
        }
        x0.h2 h2VarV = kVar2.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: f9.s6
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iN = f3.i.n(i10 | 1);
                    b8.v(projectFile, aVar2, lVar, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean v0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(final String str, List<ProjectFile> list, final boolean z10, final f0.b bVar, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, final eh.l<? super ProjectFile, pg.f0> lVar, final eh.l<? super ProjectFile, pg.f0> lVar2, x0.j jVar, final int i10) {
        x0.k kVar;
        List<ProjectFile> list2 = list;
        x0.k kVarP = jVar.p(-375751376);
        if (((i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(list2) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.K(bVar) ? 2048 : 1024) | (kVarP.l(aVar) ? 16384 : 8192) | (kVarP.l(aVar2) ? 131072 : 65536) | (kVarP.l(lVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.l(lVar2) ? 8388608 : 4194304)) & 4793491) == 4793490 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.L(567824044);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            kVarP.T(false);
            list2 = list;
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(16), t0.z0.a(((t0.e2) kVarP.f(t0.f2.f25858a)).I, kVarP, 0), null, null, f1.c.b(1692633762, new p(list2, z10, bVar, str, lVar, lVar2, aVar, n1Var), kVarP), kVarP, 196614, 24);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                kVarP.L(567996579);
                Object objG2 = kVarP.g();
                if (objG2 == c0321a) {
                    objG2 = new z5(n1Var, 0);
                    kVarP.C(objG2);
                }
                kVarP.T(false);
                kVar = kVarP;
                t0.r.a((eh.a) objG2, f1.c.b(1370501571, new q(aVar2, n1Var), kVarP), null, f1.c.b(515962113, new r(n1Var), kVarP), null, f9.e.A0, f1.c.b(-765847074, new s(list2), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, 1772598, 0, 16276);
            } else {
                kVar = kVarP;
            }
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            final List<ProjectFile> list3 = list2;
            h2VarV.f31703d = new eh.p(str, list3, z10, bVar, aVar, aVar2, lVar, lVar2, i10) { // from class: f9.a6

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f8949a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ List f8950b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f8951c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ f0.b f8952d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f8953e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f8954f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.l f8955g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.l f8956h;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.w(this.f8949a, this.f8950b, this.f8951c, this.f8952d, this.f8953e, this.f8954f, this.f8955g, this.f8956h, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean w0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void x(String str, final boolean z10, x0.j jVar, final int i10) {
        long j10;
        long j11;
        x0.k kVar;
        final String str2 = str;
        x0.k kVarP = jVar.p(2070762450);
        int i11 = i10 | (kVarP.K(str2) ? 4 : 2);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            z.m1 m1VarA = z.k1.a(z.b.h(8), d.a.f14611j, kVarP, 54);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
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
            String str3 = z10 ? "•" : "◦";
            x0.s3 s3Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) kVarP.f(s3Var)).f26548k;
            if (z10) {
                kVarP.L(-1784479673);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25777w;
            } else {
                kVarP.L(-1784478478);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
            }
            kVarP.T(false);
            t0.ff.b(str3, null, j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 0, 0, 65530);
            t2.l0 l0Var2 = ((t0.nf) kVarP.f(s3Var)).f26549l;
            if (z10) {
                kVarP.L(-1784472686);
                j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25780z;
            } else {
                kVarP.L(-1784471150);
                j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
            }
            kVarP.T(false);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            str2 = str;
            t0.ff.b(str2, new LayoutWeightElement(1.0f, true), j11, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, kVarP, i11 & 14, 0, 65528);
            kVar = kVarP;
            kVar.T(true);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str2, z10, i10) { // from class: f9.d6

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f9311a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f9312b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    b8.x(this.f9311a, this.f9312b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final String x0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }

    public static final void y(final p0.b bVar, x0.j jVar, final int i10) {
        long jC;
        x0.k kVarP = jVar.p(-1980969618);
        if ((((kVarP.l(bVar) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            if (bVar == null) {
                x0.h2 h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new eh.p(i10) { // from class: f9.o5
                        @Override // eh.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iN = f3.i.n(1);
                            b8.y(this.f10166a, (x0.j) obj, iN);
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            int size = bVar.a().size();
            int size2 = bVar.b().size();
            if (size == 0 && size2 == 0) {
                x0.h2 h2VarV2 = kVarP.V();
                if (h2VarV2 != null) {
                    h2VarV2.f31703d = new eh.p(i10) { // from class: f9.p5
                        @Override // eh.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iN = f3.i.n(1);
                            b8.y(this.f10236a, (x0.j) obj, iN);
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(12);
            if (size > 0) {
                kVarP.L(1847486839);
                jC = q1.b1.c(0.85f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25779y);
                kVarP.T(false);
            } else {
                kVarP.L(1847584148);
                jC = q1.b1.c(0.85f, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25766l);
                kVarP.T(false);
            }
            t0.d1.a(dVarD, eVarA, t0.z0.a(jC, kVarP, 0), null, null, f1.c.b(-514168096, new t(bVar, size, context), kVarP), kVarP, 196614, 24);
        }
        x0.h2 h2VarV3 = kVarP.V();
        if (h2VarV3 != null) {
            h2VarV3.f31703d = new eh.p(i10) { // from class: f9.q5
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    b8.y(this.f10296a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean y0(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void z(final String str, List<String> list, final String str2, final eh.l<? super String, pg.f0> lVar, final eh.a<pg.f0> aVar, x0.j jVar, final int i10, final int i11) {
        int i12;
        List<String> list2;
        List<String> listJ;
        Object objG;
        x0.k kVar;
        final List<String> list3;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(362183700);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 48) == 0) {
                list2 = list;
                i12 |= kVarP.l(list2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i12 |= kVarP.K(str2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i12 |= kVarP.l(lVar) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i12 |= kVarP.l(aVar) ? 16384 : 8192;
            }
            if ((i12 & 9363) == 9362 || !kVarP.s()) {
                kVarP.r0();
                if ((i10 & 1) != 0 || kVarP.a0()) {
                    if (i13 == 0) {
                        listJ = qg.p.j("#0F1318", "#000000", "#121212", "#1E2530", "#1E1E2E", "#FFFFFF", "#F3F4F6", "#1D4ED8", "#047857", "#B91C1C", "#EA580C", "#7C3AED");
                    }
                    kVarP.U();
                    kVarP.L(506750544);
                    objG = kVarP.g();
                    if (objG == j.a.f31715a) {
                        objG = bg.b.h(mh.x.I(str2, "#"));
                        kVarP.C(objG);
                    }
                    x0.n1 n1Var = (x0.n1) objG;
                    kVarP.T(false);
                    kVar = kVarP;
                    list3 = listJ;
                    t0.r.a(aVar, f1.c.b(424181452, new u(lVar, aVar, n1Var), kVarP), null, f1.c.b(-1078916854, new v(aVar), kVarP), null, f1.c.b(1712952136, new w(str), kVarP), f1.c.b(961402983, new x(lVar, str2, listJ, n1Var), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i12 >> 12) & 14) | 1772592, 0, 16276);
                } else {
                    kVarP.v();
                }
                listJ = list2;
                kVarP.U();
                kVarP.L(506750544);
                objG = kVarP.g();
                if (objG == j.a.f31715a) {
                }
                x0.n1 n1Var2 = (x0.n1) objG;
                kVarP.T(false);
                kVar = kVarP;
                list3 = listJ;
                t0.r.a(aVar, f1.c.b(424181452, new u(lVar, aVar, n1Var2), kVarP), null, f1.c.b(-1078916854, new v(aVar), kVarP), null, f1.c.b(1712952136, new w(str), kVarP), f1.c.b(961402983, new x(lVar, str2, listJ, n1Var2), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i12 >> 12) & 14) | 1772592, 0, 16276);
            } else {
                kVarP.v();
                kVar = kVarP;
                list3 = list2;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: f9.j5
                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b8.z(str, list3, str2, lVar, aVar, (x0.j) obj, f3.i.n(i10 | 1), i11);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        i12 |= 48;
        list2 = list;
        if ((i10 & 384) == 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((i12 & 9363) == 9362) {
            kVarP.r0();
            if ((i10 & 1) != 0) {
                if (i13 == 0) {
                    listJ = list2;
                }
                kVarP.U();
                kVarP.L(506750544);
                objG = kVarP.g();
                if (objG == j.a.f31715a) {
                }
                x0.n1 n1Var22 = (x0.n1) objG;
                kVarP.T(false);
                kVar = kVarP;
                list3 = listJ;
                t0.r.a(aVar, f1.c.b(424181452, new u(lVar, aVar, n1Var22), kVarP), null, f1.c.b(-1078916854, new v(aVar), kVarP), null, f1.c.b(1712952136, new w(str), kVarP), f1.c.b(961402983, new x(lVar, str2, listJ, n1Var22), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i12 >> 12) & 14) | 1772592, 0, 16276);
            }
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    public static final String z0(x0.r3 r3Var) {
        return (String) r3Var.getValue();
    }
}
