package j9;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import f9.f8;
import f9.y7;
import i2.e0;
import i2.g;
import j1.d;
import j5.a;
import j9.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p0.va;
import q8.p2;
import s8.e2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.ra;
import t0.t4;
import t0.uc;
import x0.h2;
import x0.j;
import x0.r3;
import x0.s3;

/* loaded from: classes.dex */
public final class d0 {

    public static final class a implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f15321a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f15322b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f15323c;

        public a(boolean z10, String str, eh.a<pg.f0> aVar) {
            this.f15321a = z10;
            this.f15322b = str;
            this.f15323c = aVar;
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
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 16);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
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
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26549l;
                x2.r rVar2 = x2.f.f32016c;
                jVar2.L(1448694179);
                long jC = this.f15321a ? ((e2) jVar2.f(f2.f25858a)).f25751a : c2.n0.c(4279179050L);
                jVar2.B();
                ff.b(this.f15322b, androidx.compose.foundation.layout.g.d(aVar, 1.0f), jC, 0L, null, rVar2, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 48, 0, 65464);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 12), jVar2);
                t0.x0.d(this.f15323c, new HorizontalAlignElement(d.a.f14616o), false, null, null, null, j9.f.f15367h, jVar2, 805306368, 508);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f15324a;

        public b(eh.a<pg.f0> aVar) {
            this.f15324a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f15324a, null, false, null, null, null, j9.f.f15368i, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f15325a;

        public c(eh.a<pg.f0> aVar) {
            this.f15325a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f15325a, null, false, null, null, null, j9.f.f15369j, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f15326a;

        public d(eh.a<pg.f0> aVar) {
            this.f15326a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f15326a, null, false, null, null, null, j9.f.f15372m, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f15327a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f15328b;

        public e(long j10, boolean z10) {
            this.f15327a = j10;
            this.f15328b = z10;
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
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 16);
                z.m1 m1VarA = z.k1.a(z.b.h(14), d.a.f14612k, jVar2, 54);
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
                ph.v1.j(bVar, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.n(aVar, 42), h0.f.a(12));
                boolean z10 = this.f15328b;
                float f10 = z10 ? 0.18f : 0.14f;
                long j10 = this.f15327a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, q1.b1.c(f10, j10), q1.y1.f21750a);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
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
                ph.v1.j(bVar, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                t4.b(va.a(), f3.q.c(R.string.common_pro, jVar2), androidx.compose.foundation.layout.g.n(aVar, 24), j10, jVar2, 384, 0);
                jVar2.H();
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD3 = jVar2.D();
                x0.a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
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
                ph.v1.j(bVar, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar2);
                String strC = f3.q.c(R.string.template_premium_banner_title, jVar2);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26546i;
                x2.p pVar = x2.p.f32033f;
                jVar2.L(872010235);
                long jC = z10 ? ((e2) jVar2.f(f2.f25858a)).f25757d : c2.n0.c(4287774734L);
                jVar2.B();
                ff.b(strC, null, jC, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                String strC2 = f3.q.c(R.string.template_premium_banner_body, jVar2);
                t2.l0 l0Var2 = ((nf) jVar2.f(s3Var)).f26549l;
                jVar2.L(872019663);
                long jC2 = z10 ? q1.b1.c(0.85f, ((e2) jVar2.f(f2.f25858a)).f25757d) : c2.n0.c(4290007817L);
                jVar2.B();
                ff.b(strC2, null, jC2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar2, 0, 0, 65530);
                jVar2.H();
                w1.d dVarA = n0.e.a();
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 22);
                jVar2.L(2023430876);
                long jC3 = z10 ? ((e2) jVar2.f(f2.f25858a)).f25757d : c2.n0.c(4287774734L);
                jVar2.B();
                t4.b(dVarA, null, dVarN, jC3, jVar2, 432, 0);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesScreenKt$TemplatesCategoryListScreen$1$1", f = "TemplatesScreen.kt", l = {}, m = "invokeSuspend")
    public static final class f extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x1 f15329a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f15330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(x1 x1Var, Context context, tg.e<? super f> eVar) {
            super(2, eVar);
            this.f15329a = x1Var;
            this.f15330b = context;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new f(this.f15329a, this.f15330b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            this.f15329a.j(this.f15330b);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesScreenKt$TemplatesCategoryListScreen$2$1", f = "TemplatesScreen.kt", l = {111}, m = "invokeSuspend")
    public static final class g extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15331a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f15332b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x1 f15333c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p5.x f15334d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.t f15335e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(x0.n1 n1Var, x1 x1Var, p5.x xVar, androidx.lifecycle.t tVar, tg.e eVar) {
            super(2, eVar);
            this.f15332b = n1Var;
            this.f15333c = x1Var;
            this.f15334d = xVar;
            this.f15335e = tVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new g(this.f15332b, this.f15333c, this.f15334d, this.f15335e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f15331a;
            if (i10 == 0) {
                pg.q.b(obj);
                Long l10 = (Long) this.f15332b.getValue();
                if (l10 != null) {
                    long jLongValue = l10.longValue();
                    this.f15333c.f15623f.setValue(null);
                    String strA = e2.v.a(e2.v.f24652c, jLongValue, true, null, 4);
                    this.f15331a = 1;
                    if (s8.b2.b(this.f15334d, this.f15335e, strA, new s8.b(), this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.q<z.f1, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f15336a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r3<List<x1.a>> f15337b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q8.d0 f15338c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f15339d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p5.x f15340e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x1 f15341f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ r3<Boolean> f15342g;

        public h(float f10, x0.n1 n1Var, q8.d0 d0Var, long j10, p5.x xVar, x1 x1Var, x0.n1 n1Var2) {
            this.f15336a = f10;
            this.f15337b = n1Var;
            this.f15338c = d0Var;
            this.f15339d = j10;
            this.f15340e = xVar;
            this.f15341f = x1Var;
            this.f15342g = n1Var2;
        }

        @Override // eh.q
        public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
            z.f1 padding = f1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(padding, "padding");
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.K(padding) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                q8.i.a(null, null, f1.c.b(717039035, new v1(padding, this.f15336a, this.f15337b, this.f15338c, this.f15339d, this.f15340e, this.f15341f, this.f15342g), jVar2), jVar2, 384);
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final x1.a aVar, final boolean z10, final eh.a aVar2, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1108884074);
        int i11 = i10 | (kVarP.l(aVar) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(aVar2) ? 256 : 128) | (kVarP.K(dVar) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            int i12 = i11 << 6;
            j9.e.a(aVar.f15636a, aVar.f15637b, aVar.f15638c, z10, aVar2, androidx.compose.foundation.layout.g.d(dVar, 1.0f), 0, null, true, kVarP, (i12 & V4Signature.MAX_SIGNING_INFOS_SIZE) | 100663296 | (i12 & 57344), 192);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, aVar2, dVar, i10) { // from class: j9.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f15519b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f15520c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f15521d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d0.a(this.f15518a, this.f15519b, this.f15520c, this.f15521d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final boolean z10, final eh.a aVar, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        Integer numValueOf;
        x0.k kVarP = jVar.p(2030803999);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128) | (kVarP.K(dVar) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            String strConcat = "category_".concat(str);
            String strK = k(str, kVarP);
            kVarP.L(1592892381);
            switch (str.hashCode()) {
                case -1897185137:
                    if (!str.equals("starter")) {
                        numValueOf = null;
                        break;
                    } else {
                        numValueOf = Integer.valueOf(R.string.template_category_starter_desc);
                        break;
                    }
                case -1335157162:
                    if (str.equals("device")) {
                        numValueOf = Integer.valueOf(R.string.template_category_device_desc);
                        break;
                    }
                    break;
                case -1047860588:
                    if (str.equals("dashboard")) {
                        numValueOf = Integer.valueOf(R.string.template_category_dashboard_desc);
                        break;
                    }
                    break;
                case -887328209:
                    if (str.equals("system")) {
                        numValueOf = Integer.valueOf(R.string.template_category_system_desc);
                        break;
                    }
                    break;
                case 96432:
                    if (str.equals("ads")) {
                        numValueOf = Integer.valueOf(R.string.template_category_ads_desc);
                        break;
                    }
                    break;
                case 1431160553:
                    if (str.equals("starter_libraries")) {
                        numValueOf = Integer.valueOf(R.string.template_category_starter_libraries_desc);
                        break;
                    }
                    break;
                case 1844104722:
                    if (str.equals("interaction")) {
                        numValueOf = Integer.valueOf(R.string.template_category_interaction_desc);
                        break;
                    }
                    break;
                case 1980376057:
                    if (str.equals("sensors")) {
                        numValueOf = Integer.valueOf(R.string.template_category_sensors_desc);
                        break;
                    }
                    break;
            }
            String strC = numValueOf != null ? f3.q.c(numValueOf.intValue(), kVarP) : null;
            if (strC == null) {
                strC = "";
            }
            kVarP.T(false);
            int i12 = i11 << 6;
            j9.e.a(strConcat, strK, strC, z10, aVar, androidx.compose.foundation.layout.g.d(dVar, 1.0f), 100, null, true, kVarP, (i12 & V4Signature.MAX_SIGNING_INFOS_SIZE) | 102236160 | (i12 & 57344), 128);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, z10, aVar, dVar, i10) { // from class: j9.v

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f15558a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f15559b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f15560c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f15561d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d0.b(this.f15558a, this.f15559b, this.f15560c, this.f15561d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final String str, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(96779195);
        if ((((kVarP.K(str) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            boolean zA = ((k9.e) kVarP.f(k9.c.f16178b)).a();
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(16);
            kVarP.L(2007945267);
            long jC = zA ? q1.b1.c(0.85f, ((t0.e2) kVarP.f(f2.f25858a)).f25770p) : q1.b1.c(0.95f, q1.b1.f21650d);
            kVarP.T(false);
            t0.d1.a(dVarD, eVarA, t0.z0.a(jC, kVarP, 0), t0.z0.b(0, 62), null, f1.c.b(156756781, new a(zA, str, aVar), kVarP), kVarP, 196614, 16);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, aVar, str) { // from class: j9.w

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f15571a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f15572b;

                {
                    this.f15571a = str;
                    this.f15572b = aVar;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d0.c(this.f15571a, this.f15572b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final boolean z10, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, final boolean z11, final eh.a<pg.f0> aVar3, eh.a<pg.f0> aVar4, final boolean z12, final eh.a<pg.f0> aVar5, x0.j jVar, final int i10) {
        eh.a<pg.f0> aVar6;
        eh.a<pg.f0> aVar7;
        x0.k kVar;
        x0.k kVar2;
        x0.k kVarP = jVar.p(-1462116393);
        int i11 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.l(aVar) ? 32 : 16) | (kVarP.l(aVar2) ? 256 : 128) | (kVarP.c(z11) ? 2048 : 1024) | (kVarP.l(aVar3) ? 16384 : 8192) | (kVarP.l(aVar4) ? 131072 : 65536);
        if ((i10 & 1572864) == 0) {
            i11 |= kVarP.c(z12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= kVarP.l(aVar5) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((i12 & 4793491) == 4793490 && kVarP.s()) {
            kVarP.v();
            aVar7 = aVar4;
            kVar2 = kVarP;
        } else {
            kVarP.L(-742331333);
            if (z10) {
                aVar6 = aVar3;
                aVar7 = aVar4;
                t0.r.a(aVar, f1.c.b(1714563556, new b(aVar2), kVarP), null, f1.c.b(-10278682, new c(aVar), kVarP), null, j9.f.f15370k, j9.f.f15371l, null, ((t0.e2) kVarP.f(f2.f25858a)).f25770p, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, ((i12 >> 3) & 14) | 1772592, 0, 16020);
                kVar = kVarP;
            } else {
                aVar6 = aVar3;
                aVar7 = aVar4;
                kVar = kVarP;
            }
            kVar.T(false);
            kVar.L(-742302089);
            if (z11) {
                q8.o1.a(ProjectKind.APK, aVar7, aVar6, kVar, ((i12 >> 12) & 112) | 6 | ((i12 >> 6) & 896));
            }
            kVar.T(false);
            if (z12) {
                kVar2 = kVar;
                t0.r.a(aVar5, f1.c.b(71524908, new d(aVar5), kVar), null, null, null, j9.f.f15373n, j9.f.f15375p, null, ((t0.e2) kVar.f(f2.f25858a)).f25770p, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar2, ((i12 >> 21) & 14) | 1769520, 0, 16028);
            } else {
                kVar2 = kVar;
            }
        }
        h2 h2VarV = kVar2.V();
        if (h2VarV != null) {
            final eh.a<pg.f0> aVar8 = aVar7;
            h2VarV.f31703d = new eh.p() { // from class: j9.r
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d0.d(z10, aVar, aVar2, z11, aVar3, aVar8, z12, aVar5, (x0.j) obj, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(int i10, eh.a aVar, x0.j jVar) {
        eh.a aVar2;
        x0.k kVarP = jVar.p(-1475038026);
        int i11 = (kVarP.l(aVar) ? 4 : 2) | i10;
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            aVar2 = aVar;
        } else {
            boolean zA = ((k9.e) kVarP.f(k9.c.f16178b)).a();
            long jC = c2.n0.c(zA ? 4294956800L : 4292441862L);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(16);
            kVarP.L(1390067728);
            long jC2 = zA ? q1.b1.c(0.85f, ((t0.e2) kVarP.f(f2.f25858a)).f25755c) : c2.n0.c(4294966251L);
            kVarP.T(false);
            aVar2 = aVar;
            t0.d1.b(aVar2, dVarD, false, eVarA, t0.z0.a(jC2, kVarP, 0), t0.z0.b(0, 62), null, null, f1.c.b(-1594411157, new e(jC, zA), kVarP), kVarP, (i11 & 14) | 100663344, 196);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new y7(i10, 1, aVar2);
        }
    }

    public static final void f(final String str, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(-952613351);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2);
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            ff.b(str, null, ((t0.e2) kVarP.f(f2.f25858a)).f25751a, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26550m, kVar, (i11 & 14) | 196608, 0, 65498);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, i10) { // from class: j9.t

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f15533a;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d0.f(this.f15533a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final p5.x navController, final String str, a9.b2 b2Var, x1 x1Var, x0.j jVar, final int i10) {
        int i11;
        a9.b2 b2Var2;
        final x1 x1Var2;
        Object next;
        Object f0Var;
        Context context;
        x1.a aVar;
        a9.b2 b2Var3;
        final p5.x xVar;
        final x1 x1Var3;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(1113896736);
        int i12 = i10 | (kVarP.l(navController) ? 4 : 2) | (kVarP.K(str) ? 32 : 16) | 1152;
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            b2Var3 = b2Var;
            x1Var3 = x1Var;
            xVar = navController;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(a9.b2.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                a9.b2 b2Var4 = (a9.b2) w0VarB;
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA2 = k5.b.a(kVarP);
                if (b1VarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA2 = f5.a.a(b1VarA2, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB2 = k5.c.b(x1.class, b1VarA2, bVarA2, b1VarA2 instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA2).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                i11 = i12 & (-8065);
                b2Var2 = b2Var4;
                x1Var2 = (x1) w0VarB2;
            } else {
                kVarP.v();
                i11 = i12 & (-8065);
                b2Var2 = b2Var;
                x1Var2 = x1Var;
            }
            kVarP.U();
            x0.n1 n1VarB = bg.b.b(b2Var2.f142f, kVarP);
            x0.n1 n1VarB2 = bg.b.b(x1Var2.f15622e, kVarP);
            Object obj = (List) n1VarB2.getValue();
            kVarP.L(-1978487669);
            boolean zK = ((i11 & 112) == 32) | kVarP.K(obj);
            Object objG = kVarP.g();
            Object obj2 = j.a.f31715a;
            if (zK || objG == obj2) {
                Iterator it = ((List) n1VarB2.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (kotlin.jvm.internal.r.a(((x1.a) next).f15636a, str)) {
                            break;
                        }
                    }
                }
                objG = (x1.a) next;
                kVarP.C(objG);
            }
            x1.a aVar2 = (x1.a) objG;
            kVarP.T(false);
            x0.n1 n1VarB3 = bg.b.b(x1Var2.f15626i, kVarP);
            x0.n1 n1VarB4 = bg.b.b(x1Var2.f15624g, kVarP);
            x0.n1 n1VarB5 = bg.b.b(x1Var2.f15632o, kVarP);
            kVarP.L(-1978476835);
            Object objG2 = kVarP.g();
            if (objG2 == obj2) {
                objG2 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG2);
            }
            x0.n1 n1Var = (x0.n1) objG2;
            Object objA = p0.h.a(kVarP, false, -1978474916);
            if (objA == obj2) {
                objA = bg.b.h(Boolean.TRUE);
                kVarP.C(objA);
            }
            x0.n1 n1Var2 = (x0.n1) objA;
            kVarP.T(false);
            x0.n1 n1VarB6 = bg.b.b(x1Var2.f15635r, kVarP);
            Context context2 = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            pg.f0 f0Var2 = pg.f0.f21461a;
            kVarP.L(-1978469516);
            boolean zL = kVarP.l(x1Var2) | kVarP.l(context2);
            Object objG3 = kVarP.g();
            if (zL || objG3 == obj2) {
                objG3 = new e0(x1Var2, context2, null);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG3, f0Var2, kVarP);
            androidx.lifecycle.t tVar = (androidx.lifecycle.t) kVarP.f(h5.k.f12264a);
            Long l10 = (Long) n1VarB4.getValue();
            kVarP.L(-1978464547);
            boolean zK2 = kVarP.K(n1VarB4) | kVarP.l(x1Var2) | kVarP.l(navController) | kVarP.l(tVar) | kVarP.l(aVar2);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == obj2) {
                context = context2;
                x1 x1Var4 = x1Var2;
                f0Var = new f0(n1VarB4, x1Var4, navController, tVar, aVar2, null);
                x1Var2 = x1Var4;
                aVar = aVar2;
                kVarP.C(f0Var);
            } else {
                aVar = aVar2;
                f0Var = objG4;
                context = context2;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) f0Var, l10, kVarP);
            String str2 = (String) n1VarB5.getValue();
            kVarP.L(-1978455241);
            boolean zK3 = kVarP.K(n1VarB5) | kVarP.l(x1Var2);
            Object objG5 = kVarP.g();
            if (zK3 || objG5 == obj2) {
                objG5 = new g0(n1VarB5, x1Var2, null);
                kVarP.C(objG5);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG5, str2, kVarP);
            kVarP.L(-1978449852);
            if (aVar == null) {
                FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int i13 = kVarP.P;
                x0.a2 a2VarP = kVarP.P();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar3);
                } else {
                    kVarP.z();
                }
                ph.v1.j(g.a.f13867f, l0VarD, kVarP);
                ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                g.a.C0128a c0128a = g.a.f13868g;
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, kVarP);
                final a9.b2 b2Var5 = b2Var2;
                ff.b(f3.q.c(R.string.common_empty, kVarP), null, ((t0.e2) kVarP.f(f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26547j, kVarP, 0, 0, 65530);
                kVarP.T(true);
                kVarP.T(false);
                h2 h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new eh.p(str, b2Var5, x1Var2, i10) { // from class: j9.a0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ String f15286b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ a9.b2 f15287c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ x1 f15288d;

                        @Override // eh.p
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iN = f3.i.n(1);
                            d0.g(this.f15285a, this.f15286b, this.f15287c, this.f15288d, (x0.j) obj3, iN);
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            b2Var3 = b2Var2;
            kVarP.T(false);
            final x1 x1Var5 = x1Var2;
            ra.a(null, f1.c.b(380894692, new k0(aVar, navController), kVarP), null, null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(1388318255, new t0(aVar, x1.i(aVar, ((Boolean) n1VarB.getValue()).booleanValue()), navController, x1Var2, context, n1Var2, n1Var, n1VarB6), kVarP), kVarP, 806879280, 189);
            if (((Boolean) n1VarB3.getValue()).booleanValue()) {
                kVarP.L(-1978190561);
                xVar = navController;
                boolean zL2 = kVarP.l(x1Var5) | kVarP.l(xVar);
                Object objG6 = kVarP.g();
                if (zL2 || objG6 == obj2) {
                    objG6 = new eh.a() { // from class: j9.b0
                        @Override // eh.a
                        public final Object invoke() {
                            x1Var5.g();
                            p5.x.c(e2.r.f24648c.f24627a, xVar);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG6);
                }
                eh.a aVar4 = (eh.a) objG6;
                kVarP.T(false);
                kVarP.L(-1978185594);
                boolean zL3 = kVarP.l(x1Var5);
                Object objG7 = kVarP.g();
                if (zL3 || objG7 == obj2) {
                    objG7 = new f9.s(x1Var5, 1);
                    kVarP.C(objG7);
                }
                kVarP.T(false);
                q8.o1.a(ProjectKind.APK, aVar4, (eh.a) objG7, kVarP, 6);
            } else {
                xVar = navController;
            }
            x1Var3 = x1Var5;
        }
        h2 h2VarV2 = kVarP.V();
        if (h2VarV2 != null) {
            final p5.x xVar2 = xVar;
            final a9.b2 b2Var6 = b2Var3;
            h2VarV2.f31703d = new eh.p(str, b2Var6, x1Var3, i10) { // from class: j9.c0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f15310b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a9.b2 f15311c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ x1 f15312d;

                @Override // eh.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iN = f3.i.n(1);
                    d0.g(this.f15309a, this.f15310b, this.f15311c, this.f15312d, (x0.j) obj3, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(p5.x xVar, final String str, a9.b2 b2Var, x1 x1Var, x0.j jVar, final int i10) {
        final x1 x1Var2;
        int i11;
        a9.b2 b2Var2;
        x0.k kVar;
        final a9.b2 b2Var3;
        final x1 x1Var3;
        final p5.x navController = xVar;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(-1393396948);
        int i12 = i10 | (kVarP.l(navController) ? 4 : 2) | (kVarP.K(str) ? 32 : 16) | 1152;
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            b2Var3 = b2Var;
            x1Var3 = x1Var;
            kVar = kVarP;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(a9.b2.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                a9.b2 b2Var4 = (a9.b2) w0VarB;
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA2 = k5.b.a(kVarP);
                if (b1VarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA2 = f5.a.a(b1VarA2, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB2 = k5.c.b(x1.class, b1VarA2, bVarA2, b1VarA2 instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA2).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                x1Var2 = (x1) w0VarB2;
                i11 = i12 & (-8065);
                b2Var2 = b2Var4;
            } else {
                kVarP.v();
                i11 = i12 & (-8065);
                b2Var2 = b2Var;
                x1Var2 = x1Var;
            }
            kVarP.U();
            x0.n1 n1VarB = bg.b.b(b2Var2.f142f, kVarP);
            x0.n1 n1VarB2 = bg.b.b(x1Var2.f15622e, kVarP);
            List list = (List) n1VarB2.getValue();
            kVarP.L(-959824925);
            boolean zK = ((i11 & 112) == 32) | kVarP.K(list);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            Object obj = objG;
            if (zK || objG == c0321a) {
                List list2 = (List) n1VarB2.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (kotlin.jvm.internal.r.a(((x1.a) obj2).f15639d, str)) {
                        arrayList.add(obj2);
                    }
                }
                kVarP.C(arrayList);
                obj = arrayList;
            }
            List list3 = (List) obj;
            kVarP.T(false);
            x0.n1 n1VarB3 = bg.b.b(x1Var2.f15628k, kVarP);
            x0.n1 n1VarB4 = bg.b.b(x1Var2.f15626i, kVarP);
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            q8.d0 d0VarE = q8.p0.e(kVarP);
            kVarP.L(1600122571);
            long j10 = j9.e.c((k9.e) kVarP.f(k9.c.f16178b)).f21469a.f21656a;
            kVarP.B();
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-959812344);
            boolean zL = kVarP.l(x1Var2) | kVarP.l(context);
            Object objG2 = kVarP.g();
            if (zL || objG2 == c0321a) {
                objG2 = new u0(x1Var2, context, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, f0Var, kVarP);
            f1.b bVarB = f1.c.b(-1433724688, new y0(str, navController), kVarP);
            long j11 = q1.b1.f21653g;
            z.z zVar = new z.z();
            i1 i1Var = new i1(list3, x1Var2, n1VarB, d0VarE, j10, navController);
            navController = navController;
            a9.b2 b2Var5 = b2Var2;
            ra.a(null, bVarB, null, null, null, 0, j11, 0L, zVar, f1.c.b(332677755, i1Var, kVarP), kVarP, 806879280, 189);
            boolean zBooleanValue = ((Boolean) n1VarB3.getValue()).booleanValue();
            kVarP.L(-959745764);
            boolean zL2 = kVarP.l(x1Var2);
            Object objG3 = kVarP.g();
            if (zL2 || objG3 == c0321a) {
                objG3 = new d9.s(x1Var2, 1);
                kVarP.C(objG3);
            }
            eh.a aVar = (eh.a) objG3;
            kVarP.T(false);
            kVarP.L(-959743543);
            boolean zL3 = kVarP.l(x1Var2) | kVarP.l(navController);
            Object objG4 = kVarP.g();
            if (zL3 || objG4 == c0321a) {
                objG4 = new d9.v(x1Var2, navController, 1);
                kVarP.C(objG4);
            }
            eh.a aVar2 = (eh.a) objG4;
            kVarP.T(false);
            boolean zBooleanValue2 = ((Boolean) n1VarB4.getValue()).booleanValue();
            kVarP.L(-959737286);
            boolean zL4 = kVarP.l(x1Var2);
            Object objG5 = kVarP.g();
            if (zL4 || objG5 == c0321a) {
                objG5 = new f8.n(x1Var2, 1);
                kVarP.C(objG5);
            }
            eh.a aVar3 = (eh.a) objG5;
            kVarP.T(false);
            kVarP.L(-959734841);
            boolean zL5 = kVarP.l(x1Var2) | kVarP.l(navController);
            Object objG6 = kVarP.g();
            if (zL5 || objG6 == c0321a) {
                objG6 = new eh.a() { // from class: j9.o
                    @Override // eh.a
                    public final Object invoke() {
                        x1Var2.g();
                        p5.x.c(e2.r.f24648c.f24627a, navController);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG6);
            }
            eh.a aVar4 = (eh.a) objG6;
            Object objA = p0.h.a(kVarP, false, -959729391);
            if (objA == c0321a) {
                objA = new p(0);
                kVarP.C(objA);
            }
            kVarP.T(false);
            kVar = kVarP;
            d(zBooleanValue, aVar, aVar2, zBooleanValue2, aVar3, aVar4, false, (eh.a) objA, kVar, 14155776);
            b2Var3 = b2Var5;
            x1Var3 = x1Var2;
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, b2Var3, x1Var3, i10) { // from class: j9.q

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f15496b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a9.b2 f15497c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ x1 f15498d;

                @Override // eh.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iN = f3.i.n(1);
                    d0.h(this.f15495a, this.f15496b, this.f15497c, this.f15498d, (x0.j) obj3, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(p5.x navController, a9.b2 b2Var, x1 x1Var, float f10, x0.j jVar, final int i10, final int i11) {
        float f11;
        int i12;
        x1 x1Var2;
        float f12;
        a9.b2 b2Var2;
        x0.k kVar;
        final p5.x xVar;
        final x1 x1Var3;
        final float f13;
        final a9.b2 b2Var3;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(1129104529);
        int i13 = i10 | (kVarP.l(navController) ? 4 : 2);
        int i14 = i13 | 144;
        int i15 = i11 & 8;
        if (i15 != 0) {
            i12 = i13 | 3216;
            f11 = f10;
        } else {
            f11 = f10;
            i12 = i14 | (kVarP.h(f11) ? 2048 : 1024);
        }
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            b2Var3 = b2Var;
            x1Var3 = x1Var;
            f13 = f11;
            xVar = navController;
            kVar = kVarP;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(a9.b2.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                a9.b2 b2Var4 = (a9.b2) w0VarB;
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA2 = k5.b.a(kVarP);
                if (b1VarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA2 = f5.a.a(b1VarA2, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB2 = k5.c.b(x1.class, b1VarA2, bVarA2, b1VarA2 instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA2).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                x1Var2 = (x1) w0VarB2;
                if (i15 != 0) {
                    f11 = 0;
                }
                f12 = f11;
                b2Var2 = b2Var4;
            } else {
                kVarP.v();
                b2Var2 = b2Var;
                x1Var2 = x1Var;
                f12 = f11;
            }
            kVarP.U();
            x0.n1 n1VarB = bg.b.b(b2Var2.f142f, kVarP);
            x0.n1 n1VarB2 = bg.b.b(x1Var2.f15622e, kVarP);
            x0.n1 n1VarB3 = bg.b.b(x1Var2.f15630m, kVarP);
            x0.n1 n1VarB4 = bg.b.b(x1Var2.f15628k, kVarP);
            x0.n1 n1VarB5 = bg.b.b(x1Var2.f15626i, kVarP);
            x0.n1 n1VarB6 = bg.b.b(x1Var2.f15624g, kVarP);
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            q8.d0 d0VarE = q8.p0.e(kVarP);
            kVarP.L(1600122571);
            long j10 = j9.e.c((k9.e) kVarP.f(k9.c.f16178b)).f21469a.f21656a;
            kVarP.B();
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-431153450);
            boolean zL = kVarP.l(x1Var2) | kVarP.l(context);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new f(x1Var2, context, null);
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG, f0Var, kVarP);
            androidx.lifecycle.t tVar = (androidx.lifecycle.t) kVarP.f(h5.k.f12264a);
            Long l10 = (Long) n1VarB6.getValue();
            kVarP.L(-431148504);
            boolean zK = kVarP.K(n1VarB6) | kVarP.l(x1Var2) | kVarP.l(navController) | kVarP.l(tVar);
            Object objG2 = kVarP.g();
            if (zK || objG2 == c0321a) {
                g gVar = new g(n1VarB6, x1Var2, navController, tVar, null);
                kVarP.C(gVar);
                objG2 = gVar;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, l10, kVarP);
            long j11 = q1.b1.f21653g;
            a9.b2 b2Var5 = b2Var2;
            z.z zVar = new z.z();
            final x1 x1Var4 = x1Var2;
            float f14 = f12;
            f1.b bVarB = f1.c.b(-1197154526, new h(f14, n1VarB2, d0VarE, j10, navController, x1Var4, n1VarB), kVarP);
            kVar = kVarP;
            ra.a(null, null, null, null, null, 0, j11, 0L, zVar, bVarB, kVar, 806879232, 191);
            boolean zBooleanValue = ((Boolean) n1VarB4.getValue()).booleanValue();
            kVar.L(-431024086);
            boolean zL2 = kVar.l(x1Var4);
            Object objG3 = kVar.g();
            if (zL2 || objG3 == c0321a) {
                objG3 = new d9.r(x1Var4, 1);
                kVar.C(objG3);
            }
            eh.a aVar = (eh.a) objG3;
            kVar.T(false);
            kVar.L(-431021865);
            xVar = navController;
            boolean zL3 = kVar.l(x1Var4) | kVar.l(xVar);
            Object objG4 = kVar.g();
            if (zL3 || objG4 == c0321a) {
                objG4 = new eh.a() { // from class: j9.u
                    @Override // eh.a
                    public final Object invoke() {
                        x1Var4.h();
                        p5.x.c(e2.r.f24648c.f24627a, xVar);
                        return pg.f0.f21461a;
                    }
                };
                kVar.C(objG4);
            }
            eh.a aVar2 = (eh.a) objG4;
            kVar.T(false);
            boolean zBooleanValue2 = ((Boolean) n1VarB5.getValue()).booleanValue();
            kVar.L(-431015608);
            boolean zL4 = kVar.l(x1Var4);
            Object objG5 = kVar.g();
            if (zL4 || objG5 == c0321a) {
                objG5 = new f8(x1Var4, 1);
                kVar.C(objG5);
            }
            eh.a aVar3 = (eh.a) objG5;
            kVar.T(false);
            kVar.L(-431013163);
            boolean zL5 = kVar.l(x1Var4) | kVar.l(xVar);
            Object objG6 = kVar.g();
            if (zL5 || objG6 == c0321a) {
                objG6 = new eh.a() { // from class: j9.x
                    @Override // eh.a
                    public final Object invoke() {
                        x1Var4.g();
                        p5.x.c(e2.r.f24648c.f24627a, xVar);
                        return pg.f0.f21461a;
                    }
                };
                kVar.C(objG6);
            }
            eh.a aVar4 = (eh.a) objG6;
            kVar.T(false);
            boolean zBooleanValue3 = ((Boolean) n1VarB3.getValue()).booleanValue();
            kVar.L(-431007552);
            boolean zL6 = kVar.l(x1Var4);
            Object objG7 = kVar.g();
            if (zL6 || objG7 == c0321a) {
                objG7 = new y(x1Var4, 0);
                kVar.C(objG7);
            }
            kVar.T(false);
            d(zBooleanValue, aVar, aVar2, zBooleanValue2, aVar3, aVar4, zBooleanValue3, (eh.a) objG7, kVar, 0);
            x1Var3 = x1Var4;
            f13 = f14;
            b2Var3 = b2Var5;
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            final p5.x xVar2 = xVar;
            h2VarV.f31703d = new eh.p(b2Var3, x1Var3, f13, i10, i11) { // from class: j9.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a9.b2 f15655b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ x1 f15656c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f15657d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f15658e;

                {
                    this.f15658e = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    d0.i(this.f15654a, this.f15655b, this.f15656c, this.f15657d, (x0.j) obj, iN, this.f15658e);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void j(Context context, String str) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("copied", str));
        uc ucVar = p2.f22362a;
        String string = context.getString(R.string.template_detail_copy);
        kotlin.jvm.internal.r.d(string, "getString(...)");
        p2.a(string, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String k(String str, x0.j jVar) {
        Integer numValueOf;
        jVar.L(-1425466139);
        switch (str.hashCode()) {
            case -1897185137:
                if (!str.equals("starter")) {
                    numValueOf = null;
                    break;
                } else {
                    numValueOf = Integer.valueOf(R.string.template_category_starter);
                    break;
                }
            case -1335157162:
                if (str.equals("device")) {
                    numValueOf = Integer.valueOf(R.string.template_category_device);
                    break;
                }
                break;
            case -1047860588:
                if (str.equals("dashboard")) {
                    numValueOf = Integer.valueOf(R.string.template_category_dashboard);
                    break;
                }
                break;
            case -887328209:
                if (str.equals("system")) {
                    numValueOf = Integer.valueOf(R.string.template_category_system);
                    break;
                }
                break;
            case 96432:
                if (str.equals("ads")) {
                    numValueOf = Integer.valueOf(R.string.template_category_ads);
                    break;
                }
                break;
            case 1431160553:
                if (str.equals("starter_libraries")) {
                    numValueOf = Integer.valueOf(R.string.template_category_starter_libraries);
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    numValueOf = Integer.valueOf(R.string.template_category_interaction);
                    break;
                }
                break;
            case 1980376057:
                if (str.equals("sensors")) {
                    numValueOf = Integer.valueOf(R.string.template_category_sensors);
                    break;
                }
                break;
        }
        String strC = numValueOf != null ? f3.q.c(numValueOf.intValue(), jVar) : null;
        if (strC != null) {
            str = strC;
        } else if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(str.charAt(0));
            kotlin.jvm.internal.r.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.r.d(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String strSubstring = str.substring(1);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            sb.append(strSubstring);
            str = sb.toString();
        }
        jVar.B();
        return str;
    }
}
