package b9;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.l;
import b9.e3;
import b9.p3;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j5.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import p0.o5;
import p6.b;
import pg.p;
import q6.a;
import t0.ff;
import t0.mf;
import t0.nf;
import t0.of;
import t0.ra;
import t0.t4;
import t0.z9;
import x0.j;
import x8.j6;

/* loaded from: classes.dex */
public final class p3 {

    public static final class a implements eh.q<r.h0, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4024a;

        public a(int i10) {
            this.f4024a = i10;
        }

        @Override // eh.q
        public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
            r.h0 AnimatedVisibility = h0Var;
            x0.j jVar2 = jVar;
            num.intValue();
            kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
            jVar2.L(428152050);
            final int i10 = this.f4024a;
            boolean zI = jVar2.i(i10);
            Object objG = jVar2.g();
            if (zI || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: b9.o3
                    @Override // eh.a
                    public final Object invoke() {
                        return Float.valueOf(i10 / 100.0f);
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 3);
            x0.s3 s3Var = t0.f2.f25858a;
            z9.b((eh.a) objG, dVarF, ((t0.e2) jVar2.f(s3Var)).f25751a, ((t0.e2) jVar2.f(s3Var)).H, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, jVar2, 48, 112);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PreviewScreenKt$PreviewScreen$1$1", f = "PreviewScreen.kt", l = {101}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public x0.n1 f4025a;

        /* renamed from: b, reason: collision with root package name */
        public int f4026b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f4027c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f4028d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f4029e;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PreviewScreenKt$PreviewScreen$1$1$1", f = "PreviewScreen.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super String>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f4030a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f4031b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f4032c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, Uri uri, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f4031b = context;
                this.f4032c = uri;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f4031b, this.f4032c, eVar);
                aVar.f4030a = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super String> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                Object objA;
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                try {
                    Cursor cursorQuery = this.f4031b.getContentResolver().query(this.f4032c, new String[]{"_display_name"}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            objA = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                            cursorQuery.close();
                        } finally {
                        }
                    } else {
                        objA = null;
                    }
                } catch (Throwable th2) {
                    objA = pg.q.a(th2);
                }
                if (objA instanceof p.a) {
                    return null;
                }
                return objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, Context context, x0.n1<String> n1Var, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f4027c = uri;
            this.f4028d = context;
            this.f4029e = n1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f4027c, this.f4028d, this.f4029e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            x0.n1<String> n1Var;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f4026b;
            if (i10 == 0) {
                pg.q.b(obj);
                Uri uri = this.f4027c;
                if (kotlin.jvm.internal.r.a(uri != null ? uri.getScheme() : null, "content")) {
                    wh.c cVar = ph.z0.f21632a;
                    wh.b bVar = wh.b.f31563c;
                    a aVar2 = new a(this.f4028d, uri, null);
                    x0.n1<String> n1Var2 = this.f4029e;
                    this.f4025a = n1Var2;
                    this.f4026b = 1;
                    Object objE = ph.h.e(bVar, aVar2, this);
                    if (objE == aVar) {
                        return aVar;
                    }
                    n1Var = n1Var2;
                    obj = objE;
                }
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n1Var = this.f4025a;
            pg.q.b(obj);
            n1Var.setValue((String) obj);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PreviewScreenKt$PreviewScreen$4$1", f = "PreviewScreen.kt", l = {129}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f4033a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e3.a f4034b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f4035c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1<e3.a> f4036d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4037e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4038f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e3.a aVar, Context context, x0.n1<e3.a> n1Var, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f4034b = aVar;
            this.f4035c = context;
            this.f4036d = n1Var;
            this.f4037e = n1Var2;
            this.f4038f = n1Var3;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f4034b, this.f4035c, this.f4036d, this.f4037e, this.f4038f, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f4033a;
            e3.a aVar2 = this.f4034b;
            try {
            } catch (IOException unused) {
                this.f4037e.setValue(Boolean.TRUE);
                p3.c(this.f4038f, false);
            } catch (CancellationException e10) {
                throw e10;
            }
            if (i10 == 0) {
                pg.q.b(obj);
                if ((aVar2 != null ? aVar2.f3798b : null) == e3.b.f3811a) {
                    Context context = this.f4035c;
                    this.f4033a = 1;
                    wh.c cVar = ph.z0.f21632a;
                    obj = ph.h.e(wh.b.f31563c, new f3(context, aVar2, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            e3.a data = (e3.a) obj;
            if (e3.f3796a == aVar2) {
                kotlin.jvm.internal.r.e(data, "data");
                e3.f3796a = data;
            }
            this.f4036d.setValue(data);
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4039a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p5.x f4040b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<WebView> f4041c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e3.a f4042d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Uri f4043e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Boolean> f4044f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f4045g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4046h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4047j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4048k;

        public d(String str, p5.x xVar, x0.n1 n1Var, e3.a aVar, Uri uri, x0.n1 n1Var2, Context context, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5) {
            this.f4039a = str;
            this.f4040b = xVar;
            this.f4041c = n1Var;
            this.f4042d = aVar;
            this.f4043e = uri;
            this.f4044f = n1Var2;
            this.f4045g = context;
            this.f4046h = n1Var3;
            this.f4047j = n1Var4;
            this.f4048k = n1Var5;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                f1.b bVarB = f1.c.b(581172887, new q3(this.f4039a), jVar2);
                f1.b bVarB2 = f1.c.b(1053512533, new s3(this.f4040b, this.f4041c), jVar2);
                f1.b bVarB3 = f1.c.b(1374335244, new y3(this.f4042d, this.f4043e, this.f4044f, this.f4040b, this.f4045g, this.f4039a, this.f4046h, this.f4047j, this.f4048k, this.f4041c), jVar2);
                float f10 = mf.f26477a;
                t0.g0.b(bVarB, null, bVarB2, bVarB3, CropImageView.DEFAULT_ASPECT_RATIO, null, mf.a(((t0.e2) jVar2.f(t0.f2.f25858a)).f25770p, 0L, 0L, jVar2, 30), jVar2, 3462, 178);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.q<z.f1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e3.a f4049a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f4050b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4051c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f4052d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4053e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.n1<WebView> f4054f;

        public e(e3.a aVar, x0.l1 l1Var, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4) {
            this.f4049a = aVar;
            this.f4050b = n1Var;
            this.f4051c = n1Var2;
            this.f4052d = l1Var;
            this.f4053e = n1Var3;
            this.f4054f = n1Var4;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x01ed  */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
        @Override // eh.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
            x0.n1<Boolean> n1Var;
            g.a.c cVar;
            e3.a aVar;
            x0.l1 l1Var;
            FillElement fillElement;
            ?? r12;
            e0.a aVar2;
            g.a.b bVar;
            g.a.d dVar;
            g.a.C0128a c0128a;
            x0.j jVar2;
            x0.n1<WebView> n1Var2;
            e3.b bVar2;
            z.f1 padding = f1Var;
            x0.j jVar3 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(padding, "padding");
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar3.K(padding) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && jVar3.s()) {
                jVar3.v();
            } else {
                FillElement fillElement2 = androidx.compose.foundation.layout.g.f976c;
                androidx.compose.ui.d dVarF = d0.h.f(androidx.compose.foundation.layout.f.g(fillElement2, padding));
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar3, 0);
                int iD = jVar3.D();
                x0.a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarF, jVar3);
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
                g.a.b bVar3 = g.a.f13867f;
                ph.v1.j(bVar3, qVarA, jVar3);
                g.a.d dVar2 = g.a.f13866e;
                ph.v1.j(dVar2, a2VarY, jVar3);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a2);
                }
                g.a.c cVar2 = g.a.f13865d;
                ph.v1.j(cVar2, dVarC, jVar3);
                x0.n1<Boolean> n1Var3 = this.f4051c;
                boolean zBooleanValue = n1Var3.getValue().booleanValue();
                x0.l1 l1Var2 = this.f4052d;
                p3.a(zBooleanValue, l1Var2.g(), jVar3, 0);
                jVar3.L(311225851);
                e3.a aVar4 = this.f4049a;
                if (aVar4 != null) {
                    boolean z10 = aVar4.f3805i;
                    if (!aVar4.f3809m || z10 || (bVar2 = aVar4.f3798b) == e3.b.f3812b || bVar2 == e3.b.f3815e) {
                        n1Var = n1Var3;
                        cVar = cVar2;
                        aVar = aVar4;
                        l1Var = l1Var2;
                        fillElement = fillElement2;
                        r12 = 0;
                        aVar2 = aVar3;
                        bVar = bVar3;
                        dVar = dVar2;
                        c0128a = c0128a2;
                    } else {
                        d.a aVar5 = d.a.f1143b;
                        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
                        x0.s3 s3Var = t0.f2.f25858a;
                        float f10 = 8;
                        androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.a.b(dVarD, ((t0.e2) jVar3.f(s3Var)).f25762h, q1.y1.f21750a), 14, f10);
                        n1Var = n1Var3;
                        z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar3, 48);
                        int iD2 = jVar3.D();
                        x0.a2 a2VarY2 = jVar3.y();
                        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, jVar3);
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
                        ph.v1.j(bVar3, m1VarA, jVar3);
                        ph.v1.j(dVar2, a2VarY2, jVar3);
                        if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                            l9.i.a(iD2, jVar3, iD2, c0128a2);
                        }
                        ph.v1.j(cVar2, dVarC2, jVar3);
                        fillElement = fillElement2;
                        aVar = aVar4;
                        l1Var = l1Var2;
                        t4.b(o5.a(), null, androidx.compose.foundation.layout.g.n(aVar5, 16), ((t0.e2) jVar3.f(s3Var)).f25763i, jVar3, 432, 0);
                        cVar = cVar2;
                        aVar2 = aVar3;
                        bVar = bVar3;
                        dVar = dVar2;
                        c0128a = c0128a2;
                        r12 = 0;
                        ff.b(f3.q.c(z10 ? R.string.html_single_file_note : R.string.preview_no_bridge_note, jVar3), androidx.compose.foundation.layout.f.l(aVar5, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), ((t0.e2) jVar3.f(s3Var)).f25763i, 0L, null, null, 0L, null, 0L, 0, false, 3, 0, ((nf) jVar3.f(of.f26647a)).f26551n, jVar3, 48, 3072, 57336);
                        jVar3 = jVar3;
                        jVar3.H();
                    }
                    jVar3.B();
                    j1.f fVar = d.a.f14606e;
                    final x0.n1<Boolean> n1Var4 = this.f4053e;
                    final e3.a aVar6 = aVar;
                    if (aVar6 == null || n1Var4.getValue().booleanValue()) {
                        FillElement fillElement3 = fillElement;
                        g.a.c cVar3 = cVar;
                        e0.a aVar7 = aVar2;
                        g.a.b bVar4 = bVar;
                        g.a.d dVar3 = dVar;
                        g.a.C0128a c0128a3 = c0128a;
                        jVar3.L(1059392568);
                        g2.l0 l0VarD = z.g.d(fVar, r12);
                        int iD3 = jVar3.D();
                        x0.a2 a2VarY3 = jVar3.y();
                        androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(fillElement3, jVar3);
                        if (jVar3.t() == null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar3.r();
                        if (jVar3.m()) {
                            jVar3.w(aVar7);
                        } else {
                            jVar3.z();
                        }
                        ph.v1.j(bVar4, l0VarD, jVar3);
                        ph.v1.j(dVar3, a2VarY3, jVar3);
                        if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                            l9.i.a(iD3, jVar3, iD3, c0128a3);
                        }
                        ph.v1.j(cVar3, dVarC3, jVar3);
                        jVar2 = jVar3;
                        ff.b(f3.q.c(n1Var4.getValue().booleanValue() ? R.string.html_open_failed : R.string.preview_empty, jVar3), null, ((t0.e2) jVar3.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(of.f26647a)).f26547j, jVar2, 0, 0, 65530);
                        jVar2.H();
                        jVar2.B();
                    } else {
                        if (aVar6.f3798b == e3.b.f3811a) {
                            jVar3.L(1059938726);
                            g2.l0 l0VarD2 = z.g.d(fVar, r12);
                            int iD4 = jVar3.D();
                            x0.a2 a2VarY4 = jVar3.y();
                            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(fillElement, jVar3);
                            if (jVar3.t() == null) {
                                c9.u1.d();
                                throw null;
                            }
                            jVar3.r();
                            if (jVar3.m()) {
                                jVar3.w(aVar2);
                            } else {
                                jVar3.z();
                            }
                            ph.v1.j(bVar, l0VarD2, jVar3);
                            ph.v1.j(dVar, a2VarY4, jVar3);
                            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                                l9.i.a(iD4, jVar3, iD4, c0128a);
                            }
                            ph.v1.j(cVar, dVarC4, jVar3);
                            x0.j jVar4 = jVar3;
                            z9.a(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 31, 0L, 0L, null, jVar4);
                            jVar3 = jVar4;
                            jVar3.H();
                            jVar3.B();
                        } else {
                            FillElement fillElement4 = fillElement;
                            jVar3.L(1060470221);
                            jVar3.L(311306717);
                            boolean zL = jVar3.l(aVar6);
                            final x0.n1<String> n1Var5 = this.f4050b;
                            boolean zK = zL | jVar3.K(n1Var5);
                            Object objG = jVar3.g();
                            j.a.C0321a c0321a = j.a.f31715a;
                            final x0.n1<WebView> n1Var6 = this.f4054f;
                            if (zK || objG == c0321a) {
                                final x0.n1<Boolean> n1Var7 = n1Var;
                                final x0.l1 l1Var3 = l1Var;
                                objG = new eh.l() { // from class: b9.z3
                                    @Override // eh.l
                                    public final Object invoke(Object obj) {
                                        Object objA;
                                        WebView webView;
                                        p6.b bVar5;
                                        String strI;
                                        Context ctx = (Context) obj;
                                        kotlin.jvm.internal.r.e(ctx, "ctx");
                                        e3.a aVar8 = aVar6;
                                        String str = aVar8.f3807k;
                                        String str2 = aVar8.f3804h;
                                        e3.b bVar6 = aVar8.f3798b;
                                        File file = aVar8.f3802f;
                                        String strConcat = aVar8.f3800d;
                                        boolean z11 = kotlin.jvm.internal.r.a(str, "dark") || (!kotlin.jvm.internal.r.a(str, "light") && (ctx.getResources().getConfiguration().uiMode & 48) == 32);
                                        WebView webView2 = new WebView(new ContextThemeWrapper(ctx, z11 ? android.R.style.Theme.Material.NoActionBar : android.R.style.Theme.Material.Light.NoActionBar));
                                        webView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                        WebSettings settings = webView2.getSettings();
                                        settings.setJavaScriptEnabled(true);
                                        settings.setDomStorageEnabled(true);
                                        settings.setDatabaseEnabled(true);
                                        settings.setUseWideViewPort(true);
                                        settings.setLoadWithOverviewMode(true);
                                        settings.setSupportZoom(true);
                                        settings.setBuiltInZoomControls(true);
                                        settings.setDisplayZoomControls(false);
                                        settings.setAllowFileAccess(true);
                                        settings.setAllowContentAccess(true);
                                        settings.setMixedContentMode(aVar8.f3808l);
                                        try {
                                            if (gd.m.c("ALGORITHMIC_DARKENING")) {
                                                if (!q6.i.f22068a.d()) {
                                                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                                }
                                                ((WebSettingsBoundaryInterface) p6.a.a(settings).f22067a).setAlgorithmicDarkeningAllowed(z11);
                                            } else if (gd.m.c("FORCE_DARK")) {
                                                int i10 = z11 ? 2 : 0;
                                                a.h hVar = q6.i.f22070c;
                                                if (hVar.c()) {
                                                    settings.setForceDark(i10);
                                                } else {
                                                    if (!hVar.d()) {
                                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                                    }
                                                    ((WebSettingsBoundaryInterface) p6.a.a(settings).f22067a).setForceDark(i10);
                                                }
                                            }
                                            if (gd.m.c("FORCE_DARK_STRATEGY")) {
                                                if (!q6.i.f22071d.d()) {
                                                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                                }
                                                ((WebSettingsBoundaryInterface) p6.a.a(settings).f22067a).setForceDarkBehavior(2);
                                            }
                                        } catch (Exception unused) {
                                        }
                                        x0.n1 n1Var8 = n1Var7;
                                        x0.n1 n1Var9 = n1Var4;
                                        WebView webView3 = webView2;
                                        webView3.addJavascriptInterface(new e(new c4(ctx, webView2, aVar8, n1Var8, n1Var9, n1Var5)), "HtmlPrint");
                                        if (gd.m.c("DOCUMENT_START_SCRIPT")) {
                                            try {
                                                objA = p6.c.a(webView3, qg.n0.g("*"));
                                            } catch (Throwable th2) {
                                                objA = pg.q.a(th2);
                                            }
                                            Throwable thA = pg.p.a(objA);
                                            if (thA != null) {
                                                Log.w("HtmlPrinting", "Using page-finished print hook", thA);
                                            }
                                        }
                                        String strConcat2 = (str2 == null ? "preview" : str2).concat(".templates.htmltoapk.local");
                                        if (bVar6 == e3.b.f3815e) {
                                            ArrayList arrayList = new ArrayList();
                                            if (str2 == null) {
                                                str2 = "preview";
                                            }
                                            String strConcat3 = str2.concat(".templates.htmltoapk.local");
                                            arrayList.add(new x3.b(new b.a(ctx)));
                                            ArrayList arrayList2 = new ArrayList();
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj2 = arrayList.get(i11);
                                                i11++;
                                                x3.b bVar7 = (x3.b) obj2;
                                                bVar7.getClass();
                                                arrayList2.add(new b.d(strConcat3, bVar7.f32052a));
                                                webView3 = webView3;
                                            }
                                            webView = webView3;
                                            bVar5 = new p6.b(arrayList2);
                                        } else {
                                            webView = webView3;
                                            if (bVar6 != e3.b.f3814d || file == null) {
                                                bVar5 = null;
                                            } else {
                                                ArrayList arrayList3 = new ArrayList();
                                                arrayList3.add(new x3.b(new b.C0245b(ctx, file)));
                                                ArrayList arrayList4 = new ArrayList();
                                                int size2 = arrayList3.size();
                                                int i12 = 0;
                                                while (i12 < size2) {
                                                    Object obj3 = arrayList3.get(i12);
                                                    i12++;
                                                    x3.b bVar8 = (x3.b) obj3;
                                                    bVar8.getClass();
                                                    arrayList4.add(new b.d("appassets.androidplatform.net", bVar8.f32052a));
                                                }
                                                bVar5 = new p6.b(arrayList4);
                                            }
                                        }
                                        x0.n1 n1Var10 = n1Var6;
                                        WebView webView4 = webView;
                                        webView4.setWebViewClient(new i4(aVar8, bVar5, ctx, n1Var9, n1Var8, n1Var10));
                                        webView4.setWebChromeClient(new j4(l1Var3, n1Var8));
                                        int iOrdinal = bVar6.ordinal();
                                        if (iOrdinal != 0) {
                                            if (iOrdinal == 1) {
                                                if (!mh.t.p(strConcat, "http://", false) && !mh.t.p(strConcat, "https://", false)) {
                                                    strConcat = "https://".concat(strConcat);
                                                }
                                                webView4.loadUrl(strConcat);
                                            } else if (iOrdinal == 2) {
                                                webView4.loadUrl("https://document.htmltoapk.local/index.html");
                                            } else if (iOrdinal == 3) {
                                                String str3 = "index.html";
                                                if ((file == null || !new File(file, "index.html").exists()) && file != null) {
                                                    Set<String> set = l9.o0.f16861a;
                                                    String strA = l9.o0.a(lh.j.k(new lh.p(lh.j.i(ah.l.p(file), new d4(0)), new e4(file, 0))));
                                                    if (strA != null && (strI = qg.x.I(mh.x.P(strA, new char[]{'/'}), "/", null, null, new f4(0), 30)) != null) {
                                                        str3 = strI;
                                                    }
                                                }
                                                webView4.loadUrl("https://appassets.androidplatform.net/assets/".concat(str3));
                                            } else {
                                                if (iOrdinal != 4) {
                                                    throw new pg.l();
                                                }
                                                webView4.loadUrl("https://" + strConcat2 + "/assets/" + aVar8.f3803g);
                                            }
                                        }
                                        n1Var10.setValue(webView4);
                                        return webView4;
                                    }
                                };
                                n1Var2 = n1Var6;
                                jVar3.C(objG);
                            } else {
                                n1Var2 = n1Var6;
                            }
                            eh.l lVar = (eh.l) objG;
                            jVar3.B();
                            jVar3.L(311639389);
                            Object objG2 = jVar3.g();
                            if (objG2 == c0321a) {
                                objG2 = new a4(n1Var2, r12);
                                jVar3.C(objG2);
                            }
                            eh.l lVar2 = (eh.l) objG2;
                            jVar3.B();
                            jVar3.L(311638048);
                            Object objG3 = jVar3.g();
                            if (objG3 == c0321a) {
                                objG3 = new b4(r12);
                                jVar3.C(objG3);
                            }
                            jVar3.B();
                            androidx.compose.ui.viewinterop.a.a(lVar, fillElement4, lVar2, (eh.l) objG3, jVar3, 27696, 4);
                            jVar3.B();
                        }
                        jVar2 = jVar3;
                    }
                    jVar2.H();
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements x0.k0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f4055a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f4056b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f4057c;

        public f(Context context, x0.n1 n1Var, x0.n1 n1Var2) {
            this.f4055a = context;
            this.f4056b = n1Var;
            this.f4057c = n1Var2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x0.k0
        public final void a() {
            this.f4056b.setValue(null);
            Activity activityB = k9.j.b(this.f4055a);
            if (activityB == null || !activityB.isChangingConfigurations()) {
                x0.n1 n1Var = this.f4057c;
                e3.a aVar = (e3.a) n1Var.getValue();
                if ((aVar != null ? aVar.f3798b : null) == e3.b.f3811a && e3.f3796a == ((e3.a) n1Var.getValue())) {
                    e3.f3796a = null;
                }
            }
        }
    }

    public static final class g implements x0.k0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.t f4058a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3 f4059b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f4060c;

        public g(androidx.lifecycle.t tVar, m3 m3Var, x0.n1 n1Var) {
            this.f4058a = tVar;
            this.f4059b = m3Var;
            this.f4060c = n1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x0.k0
        public final void a() {
            this.f4058a.getLifecycle().c(this.f4059b);
            WebView webView = (WebView) this.f4060c.getValue();
            if (webView != null) {
                webView.resumeTimers();
            }
        }
    }

    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4061a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4061a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z10, final int i10, x0.j jVar, final int i11) {
        x0.k kVarP = jVar.p(1568131979);
        if ((((kVarP.c(z10) ? 4 : 2) | i11 | (kVarP.i(i10) ? 32 : 16)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else if (z10) {
            boolean z11 = 1 <= i10 && i10 < 100;
            androidx.compose.animation.d.c(z11, null, r.w0.c(null, 3), r.w0.d(null, 3), null, f1.c.b(-213037469, new a(i10), kVarP), kVarP, 200064, 18);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, i11, z10) { // from class: b9.n3

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f3953a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f3954b;

                {
                    this.f3953a = z10;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    p3.a(this.f3953a, this.f3954b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0271  */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final p5.x navController, Uri uri, j6 j6Var, x0.j jVar, final int i10, final int i11) {
        Uri uri2;
        int i12;
        j6 j6Var2;
        Uri uri3;
        e3.a aVar;
        Object obj;
        String str;
        boolean zL;
        Object obj2;
        androidx.lifecycle.t tVar;
        boolean zL2;
        boolean z10;
        Object obj3;
        boolean zL3;
        ?? r92;
        Object obj4;
        final j6 j6Var3;
        final Uri uri4;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(587299863);
        int i13 = i10 | (kVarP.l(navController) ? 4 : 2);
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 = i13 | 48;
            uri2 = uri;
        } else {
            uri2 = uri;
            i12 = i13 | (kVarP.l(uri2) ? 32 : 16);
        }
        if (((i12 | 128) & 147) == 146 && kVarP.s()) {
            kVarP.v();
            uri4 = uri2;
            j6Var3 = j6Var;
        } else {
            kVarP.r0();
            int i15 = 0;
            if ((i10 & 1) == 0 || kVarP.a0()) {
                if (i14 != 0) {
                    uri2 = null;
                }
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB = k5.c.b(j6.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                j6Var2 = (j6) w0VarB;
            } else {
                kVarP.v();
                j6Var2 = j6Var;
            }
            kVarP.U();
            final Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(2041559819);
            boolean zK = kVarP.K(uri2);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK || objG == c0321a) {
                if (uri2 != null) {
                    String lastPathSegment = uri2.getLastPathSegment();
                    String strT = lastPathSegment != null ? mh.x.T(lastPathSegment, '/', lastPathSegment) : null;
                    if (strT == null) {
                        strT = "";
                    }
                    Uri uri5 = uri2;
                    aVar = new e3.a(strT, e3.b.f3813c, null, null, uri5, null, null, null, null, 0, false, null, 16108);
                    uri3 = uri5;
                } else {
                    uri3 = uri2;
                    aVar = e3.f3796a;
                }
                x0.x1 x1VarH = bg.b.h(aVar);
                kVarP.C(x1VarH);
                obj = x1VarH;
            } else {
                uri3 = uri2;
                obj = objG;
            }
            final x0.n1 n1Var = (x0.n1) obj;
            kVarP.T(false);
            e3.a aVar2 = (e3.a) n1Var.getValue();
            x0.n1 n1VarB = bg.b.b(j6Var2.f32786m, kVarP);
            kVarP.L(2041577313);
            Object objG2 = kVarP.g();
            Object obj5 = objG2;
            if (objG2 == c0321a) {
                x0.x1 x1VarH2 = bg.b.h(Boolean.FALSE);
                kVarP.C(x1VarH2);
                obj5 = x1VarH2;
            }
            x0.n1 n1Var2 = (x0.n1) obj5;
            kVarP.T(false);
            Uri uri6 = aVar2 != null ? aVar2.f3801e : null;
            kVarP.L(2041580566);
            boolean zK2 = kVarP.K(uri3);
            Object objG3 = kVarP.g();
            Object obj6 = objG3;
            if (zK2 || objG3 == c0321a) {
                x0.x1 x1VarH3 = bg.b.h(null);
                kVarP.C(x1VarH3);
                obj6 = x1VarH3;
            }
            x0.n1 n1Var3 = (x0.n1) obj6;
            kVarP.T(false);
            kVarP.L(2041584600);
            boolean zL4 = kVarP.l(uri3) | kVarP.K(n1Var3) | kVarP.l(context);
            Object objG4 = kVarP.g();
            Object obj7 = objG4;
            if (zL4 || objG4 == c0321a) {
                b bVar = new b(uri3, context, n1Var3, null);
                kVarP.C(bVar);
                obj7 = bVar;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) obj7, uri3, kVarP);
            kVarP.L(2041599829);
            if (((Boolean) n1Var2.getValue()).booleanValue()) {
                kVarP.L(2041605432);
                boolean zL5 = kVarP.l(navController);
                Object objG5 = kVarP.g();
                Object obj8 = objG5;
                if (zL5 || objG5 == c0321a) {
                    g3 g3Var = new g3(0, navController, n1Var2);
                    kVarP.C(g3Var);
                    obj8 = g3Var;
                }
                eh.a aVar3 = (eh.a) obj8;
                Object objA = p0.h.a(kVarP, false, 2041611035);
                Object obj9 = objA;
                if (objA == c0321a) {
                    h3 h3Var = new h3(n1Var2, i15);
                    kVarP.C(h3Var);
                    obj9 = h3Var;
                }
                kVarP.T(false);
                str = null;
                q8.o1.a(ProjectKind.APK, aVar3, (eh.a) obj9, kVarP, 390);
            } else {
                str = null;
            }
            Object objA2 = p0.h.a(kVarP, false, 2041613386);
            Object obj10 = objA2;
            if (objA2 == c0321a) {
                x0.x1 x1VarH4 = bg.b.h(str);
                kVarP.C(x1VarH4);
                obj10 = x1VarH4;
            }
            final x0.n1 n1Var4 = (x0.n1) obj10;
            Object objA3 = p0.h.a(kVarP, false, 2041615424);
            Object obj11 = objA3;
            if (objA3 == c0321a) {
                x0.v1 v1Var = new x0.v1(0);
                kVarP.C(v1Var);
                obj11 = v1Var;
            }
            x0.l1 l1Var = (x0.l1) obj11;
            Object objA4 = p0.h.a(kVarP, false, 2041617184);
            Object obj12 = objA4;
            if (objA4 == c0321a) {
                x0.x1 x1VarH5 = bg.b.h(Boolean.TRUE);
                kVarP.C(x1VarH5);
                obj12 = x1VarH5;
            }
            x0.n1 n1Var5 = (x0.n1) obj12;
            Object objA5 = p0.h.a(kVarP, false, 2041618945);
            Object obj13 = objA5;
            if (objA5 == c0321a) {
                x0.x1 x1VarH6 = bg.b.h(Boolean.FALSE);
                kVarP.C(x1VarH6);
                obj13 = x1VarH6;
            }
            x0.n1 n1Var6 = (x0.n1) obj13;
            kVarP.T(false);
            kVarP.L(2041622445);
            boolean zL6 = kVarP.l(aVar2) | kVarP.l(context) | kVarP.K(n1Var);
            Object objG6 = kVarP.g();
            if (zL6 || objG6 == c0321a) {
                c cVar = new c(aVar2, context, n1Var, n1Var6, n1Var5, null);
                n1Var6 = n1Var6;
                n1Var5 = n1Var5;
                n1Var = n1Var;
                kVarP.C(cVar);
                objG6 = cVar;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG6, aVar2, kVarP);
            String strC = (String) n1Var3.getValue();
            if (strC == null) {
                if (aVar2 == null || (strC = aVar2.f3797a) == null || mh.x.A(strC)) {
                    strC = str;
                }
                kVarP.L(2041640620);
                if (strC == null) {
                    strC = f3.q.c(R.string.preview_title, kVarP);
                }
                kVarP.T(false);
                pg.f0 f0Var = pg.f0.f21461a;
                kVarP.L(2041646609);
                zL = kVarP.l(context) | kVarP.K(n1Var);
                Object objG7 = kVarP.g();
                obj2 = objG7;
                if (!zL || objG7 == c0321a) {
                    eh.l lVar = new eh.l() { // from class: b9.i3
                        @Override // eh.l
                        public final Object invoke(Object obj14) {
                            x0.l0 DisposableEffect = (x0.l0) obj14;
                            kotlin.jvm.internal.r.e(DisposableEffect, "$this$DisposableEffect");
                            return new p3.f(context, n1Var4, n1Var);
                        }
                    };
                    kVarP.C(lVar);
                    obj2 = lVar;
                }
                kVarP.T(false);
                x0.o0.a(f0Var, (eh.l) obj2, kVarP);
                tVar = (androidx.lifecycle.t) kVarP.f(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                kVarP.L(2041681058);
                zL2 = kVarP.l(tVar);
                Object objG8 = kVarP.g();
                if (!zL2 || objG8 == c0321a) {
                    z10 = false;
                    j3 j3Var = new j3(0, tVar, n1Var4);
                    kVarP.C(j3Var);
                    obj3 = j3Var;
                } else {
                    z10 = false;
                    obj3 = objG8;
                }
                kVarP.T(z10);
                x0.o0.a(tVar, (eh.l) obj3, kVarP);
                kVarP.L(2041702248);
                zL3 = kVarP.l(navController);
                Object objG9 = kVarP.g();
                if (!zL3 || objG9 == c0321a) {
                    r92 = 0;
                    k3 k3Var = new k3(navController, n1Var4, false ? 1 : 0);
                    kVarP.C(k3Var);
                    obj4 = k3Var;
                } else {
                    r92 = 0;
                    obj4 = objG9;
                }
                kVarP.T(r92);
                c.e.a(6, r92, (eh.a) obj4, kVarP, true);
                ra.a(null, f1.c.b(77518043, new d(strC, navController, n1Var4, aVar2, uri6, n1VarB, context, n1Var6, n1Var5, n1Var2), kVarP), null, null, null, 0, 0L, 0L, new z.z(), f1.c.b(332312230, new e(aVar2, l1Var, n1Var3, n1Var5, n1Var6, n1Var4), kVarP), kVarP, 805306416, 253);
                j6Var3 = j6Var2;
                uri4 = uri3;
            } else {
                if (mh.x.A(strC)) {
                    strC = str;
                }
                if (strC == null) {
                }
                kVarP.L(2041640620);
                if (strC == null) {
                }
                kVarP.T(false);
                pg.f0 f0Var2 = pg.f0.f21461a;
                kVarP.L(2041646609);
                zL = kVarP.l(context) | kVarP.K(n1Var);
                Object objG72 = kVarP.g();
                obj2 = objG72;
                if (!zL) {
                    eh.l lVar2 = new eh.l() { // from class: b9.i3
                        @Override // eh.l
                        public final Object invoke(Object obj14) {
                            x0.l0 DisposableEffect = (x0.l0) obj14;
                            kotlin.jvm.internal.r.e(DisposableEffect, "$this$DisposableEffect");
                            return new p3.f(context, n1Var4, n1Var);
                        }
                    };
                    kVarP.C(lVar2);
                    obj2 = lVar2;
                    kVarP.T(false);
                    x0.o0.a(f0Var2, (eh.l) obj2, kVarP);
                    tVar = (androidx.lifecycle.t) kVarP.f(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    kVarP.L(2041681058);
                    zL2 = kVarP.l(tVar);
                    Object objG82 = kVarP.g();
                    if (zL2) {
                        z10 = false;
                        j3 j3Var2 = new j3(0, tVar, n1Var4);
                        kVarP.C(j3Var2);
                        obj3 = j3Var2;
                        kVarP.T(z10);
                        x0.o0.a(tVar, (eh.l) obj3, kVarP);
                        kVarP.L(2041702248);
                        zL3 = kVarP.l(navController);
                        Object objG92 = kVarP.g();
                        if (zL3) {
                            r92 = 0;
                            k3 k3Var2 = new k3(navController, n1Var4, false ? 1 : 0);
                            kVarP.C(k3Var2);
                            obj4 = k3Var2;
                            kVarP.T(r92);
                            c.e.a(6, r92, (eh.a) obj4, kVarP, true);
                            ra.a(null, f1.c.b(77518043, new d(strC, navController, n1Var4, aVar2, uri6, n1VarB, context, n1Var6, n1Var5, n1Var2), kVarP), null, null, null, 0, 0L, 0L, new z.z(), f1.c.b(332312230, new e(aVar2, l1Var, n1Var3, n1Var5, n1Var6, n1Var4), kVarP), kVarP, 805306416, 253);
                            j6Var3 = j6Var2;
                            uri4 = uri3;
                        }
                    }
                }
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(uri4, j6Var3, i10, i11) { // from class: b9.l3

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Uri f3931b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j6 f3932c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f3933d;

                {
                    this.f3933d = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj14, Object obj15) {
                    ((Integer) obj15).getClass();
                    int iN = f3.i.n(1);
                    p3.b(this.f3930a, this.f3931b, this.f3932c, (x0.j) obj14, iN, this.f3933d);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(x0.n1 n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    public static final void d(WebView webView) {
        Object tag = webView.getTag(R.id.preview_webview_destroyed);
        Boolean bool = Boolean.TRUE;
        if (kotlin.jvm.internal.r.a(tag, bool)) {
            return;
        }
        webView.setTag(R.id.preview_webview_destroyed, bool);
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.removeJavascriptInterface("HtmlPrint");
        webView.stopLoading();
        webView.setWebChromeClient(null);
        webView.destroy();
    }
}
