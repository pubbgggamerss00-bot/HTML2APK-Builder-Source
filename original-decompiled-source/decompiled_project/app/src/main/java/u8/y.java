package u8;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b9.j3;
import b9.q2;
import c9.h1;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import d0.d2;
import f9.e6;
import g2.j;
import hh.c;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j5.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import p0.va;
import ph.v1;
import q1.b1;
import q1.q1;
import q1.u0;
import q1.y1;
import q8.s2;
import q8.t2;
import s.m2;
import t0.ff;
import t0.md;
import t0.p7;
import t0.s4;
import t0.t4;
import t8.i3;
import u8.y;
import x0.a2;
import x0.h2;
import x0.j;
import x0.l1;
import x0.n1;
import x2.p;
import z.b;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class y {

    public static final class a implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d1 f29538a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k8.a f29539b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f29540c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f29541d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f29542e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f29543f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f29544g;

        public a(d1 d1Var, k8.a aVar, boolean z10, String str, boolean z11, int i10, long j10) {
            this.f29538a = d1Var;
            this.f29539b = aVar;
            this.f29540c = z10;
            this.f29541d = str;
            this.f29542e = z11;
            this.f29543f = i10;
            this.f29544g = j10;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            e0.a aVar;
            g.a.C0128a c0128a;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                float f10 = 10;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), f10);
                b.g gVar = z.b.f34450g;
                f.b bVar = d.a.f14612k;
                m1 m1VarA = k1.a(gVar, bVar, jVar2, 54);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar2 = g.a.f13867f;
                v1.j(bVar2, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a2);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                b.j jVar3 = z.b.f34444a;
                m1 m1VarA2 = k1.a(jVar3, bVar, jVar2, 48);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, m1VarA2, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a2);
                }
                v1.j(cVar, dVarC2, jVar2);
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar2, 42), c2.n0.c(4281872167L), h0.f.f12083a);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, l0VarD, jVar2);
                v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a2);
                }
                v1.j(cVar, dVarC3, jVar2);
                k8.a aVar4 = this.f29539b;
                ff.b(aVar4.f16059d, null, 0L, f3.u.c(22), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3072, 0, 131062);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f10), jVar2);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar2, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    aVar = aVar3;
                    jVar2.w(aVar);
                } else {
                    aVar = aVar3;
                    jVar2.z();
                }
                v1.j(bVar2, qVarA, jVar2);
                v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    c0128a = c0128a2;
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                v1.j(cVar, dVarC4, jVar2);
                m1 m1VarA3 = k1.a(jVar3, bVar, jVar2, 48);
                int iD5 = jVar2.D();
                a2 a2VarY5 = jVar2.y();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar2, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, m1VarA3, jVar2);
                v1.j(dVar, a2VarY5, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                    l9.i.a(iD5, jVar2, iD5, c0128a);
                }
                v1.j(cVar, dVarC5, jVar2);
                String strC = f3.q.c(aVar4.f16057b, jVar2);
                long j10 = q1.b1.f21650d;
                x2.p pVar = x2.p.f32033f;
                ff.b(strC, null, j10, f3.u.c(14), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                float f11 = 6;
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f11), jVar2);
                ff.b(y.l(R.string.cat_farm_level_count, new Object[]{Integer.valueOf(this.f29543f)}, jVar2), null, c2.n0.c(4294956800L), f3.u.c(11), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                jVar2.H();
                ff.b(f3.q.c(aVar4.f16058c, jVar2), null, c2.n0.c(4288582279L), f3.u.c(11), null, null, 0L, null, 0L, 2, false, 1, 0, null, jVar2, 3456, 3120, 120818);
                x0.j jVar4 = jVar2;
                jVar4.L(1150197161);
                String str = this.f29541d;
                if (!mh.x.A(str)) {
                    ff.b(str, null, c2.n0.c(4283096704L), f3.u.c(10), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar4, 3456, 0, 131058);
                    jVar4 = jVar4;
                }
                jVar4.B();
                jVar4.L(1150207520);
                if (this.f29542e) {
                    x0.j jVar5 = jVar4;
                    ff.b(y.l(R.string.cat_farm_level_required, new Object[]{Integer.valueOf(aVar4.f16066k)}, jVar4), null, c2.n0.c(4293870660L), f3.u.c(10), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar5, 200064, 0, 131026);
                    jVar4 = jVar5;
                }
                jVar4.B();
                jVar4.H();
                jVar4.H();
                jVar4.L(-1877773492);
                d1 d1Var = this.f29538a;
                boolean zL = jVar4.l(d1Var) | jVar4.K(aVar4);
                Object objG = jVar4.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new u8.w(d1Var, aVar4);
                    jVar4.C(objG);
                }
                jVar4.B();
                z.g1 g1Var = t0.m0.f26400a;
                t0.l0 l0VarA = t0.m0.a(c2.n0.c(4293571336L), 0L, c2.n0.c(4282201390L), jVar4, 10);
                float f12 = 12;
                z.g1 g1Var2 = new z.g1(f12, f11, f12, f11);
                long j11 = this.f29544g;
                boolean z10 = this.f29540c;
                x0.j jVar6 = jVar4;
                t0.x0.a((eh.a) objG, null, z10, null, l0VarA, null, null, g1Var2, f1.c.b(-568600941, new u8.x(j11, z10), jVar4), jVar6, 817889280, 362);
                jVar6.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class a0 extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l f29545a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f29546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(eh.l lVar, List list) {
            super(1);
            this.f29545a = lVar;
            this.f29546b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f29545a.invoke(this.f29546b.get(num.intValue()));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29547a = new b(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final class b0 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f29548a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k8.i f29549b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d1 f29550c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(List list, k8.i iVar, d1 d1Var) {
            super(4);
            this.f29548a = list;
            this.f29549b = iVar;
            this.f29550c = d1Var;
        }

        @Override // eh.r
        public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
            int i10;
            b0.e eVar2 = eVar;
            int iIntValue = num.intValue();
            x0.j jVar2 = jVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= jVar2.i(iIntValue) ? 32 : 16;
            }
            if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
                k8.m mVar = (k8.m) this.f29548a.get(iIntValue);
                jVar2.L(-967668313);
                k8.i iVar = this.f29549b;
                Integer num3 = iVar.f16132m.get(mVar.f16158a);
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                boolean z10 = mVar.f16165h > iVar.f16127h;
                d1 d1Var = this.f29550c;
                Integer num4 = ((k8.i) d1Var.f29419c.f25021a.getValue()).f16132m.get(mVar.f16158a);
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                d1Var.f29418b.getClass();
                long jPow = (long) (Math.pow(1.18d, iIntValue4) * mVar.f16162e);
                t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(12), t0.z0.a(c2.n0.c(4280754460L), jVar2, 6), null, null, f1.c.b(-1321824479, new x(d1Var, mVar, !z10 && iVar.f16120a >= jPow, z10, iIntValue3, jPow), jVar2), jVar2, 196614, 24);
                jVar2.B();
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u8.q f29551a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f29552b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u8.q qVar, List list) {
            super(1);
            this.f29551a = qVar;
            this.f29552b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f29551a.invoke(this.f29552b.get(num.intValue()));
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l f29553a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f29554b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(eh.l lVar, List list) {
            super(1);
            this.f29553a = lVar;
            this.f29554b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f29553a.invoke(this.f29554b.get(num.intValue()));
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f29555a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k8.i f29556b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d1 f29557c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list, k8.i iVar, d1 d1Var) {
            super(4);
            this.f29555a = list;
            this.f29556b = iVar;
            this.f29557c = d1Var;
        }

        @Override // eh.r
        public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
            int i10;
            b0.e eVar2 = eVar;
            int iIntValue = num.intValue();
            x0.j jVar2 = jVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= jVar2.i(iIntValue) ? 32 : 16;
            }
            if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
                k8.a aVar = (k8.a) this.f29555a.get(iIntValue);
                jVar2.L(1054928421);
                k8.i iVar = this.f29556b;
                Integer num3 = iVar.f16133n.get(aVar.f16056a);
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                boolean z10 = aVar.f16066k > iVar.f16127h;
                d1 d1Var = this.f29557c;
                Integer num4 = ((k8.i) d1Var.f29419c.f25021a.getValue()).f16133n.get(aVar.f16056a);
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                d1Var.f29418b.getClass();
                long jPow = (long) (Math.pow(1.25d, iIntValue4) * aVar.f16060e);
                boolean z11 = !z10 && iVar.f16120a >= jPow;
                jVar2.L(1142412435);
                long j10 = aVar.f16061f;
                String strL = j10 > 0 ? y.l(R.string.cat_farm_effect_tap, new Object[]{Long.valueOf(j10)}, jVar2) : null;
                jVar2.B();
                jVar2.L(1142416365);
                double d10 = aVar.f16062g;
                String strL2 = d10 > 0.0d ? y.l(R.string.cat_farm_effect_pps, new Object[]{Integer.valueOf((int) (d10 * 100))}, jVar2) : null;
                jVar2.B();
                jVar2.L(1142421094);
                double d11 = aVar.f16063h;
                String strL3 = d11 > 0.0d ? y.l(R.string.cat_farm_effect_crit, new Object[]{Integer.valueOf((int) (d11 * 100))}, jVar2) : null;
                jVar2.B();
                jVar2.L(1142425627);
                double d12 = aVar.f16064i;
                String strL4 = d12 > 0.0d ? y.l(R.string.cat_farm_effect_combo, new Object[]{String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d12)}, 1))}, jVar2) : null;
                jVar2.B();
                jVar2.L(1142430793);
                double d13 = aVar.f16065j;
                String strL5 = d13 > 0.0d ? y.l(R.string.cat_farm_effect_event, new Object[]{Integer.valueOf((int) (d13 * 100))}, jVar2) : null;
                jVar2.B();
                t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(12), t0.z0.a(c2.n0.c(4280754460L), jVar2, 6), null, null, f1.c.b(1321644607, new a(d1Var, aVar, z11, qg.x.I(qg.o.s(new String[]{strL, strL2, strL3, strL4, strL5}), " • ", null, null, null, 62), z10, iIntValue3, jPow), jVar2), jVar2, 196614, 24);
                jVar2.B();
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k8.d f29558a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f29559b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29560c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29561d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ double f29562e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1 f29563f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f29564g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f29565h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f29566j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f29567k;

        public f(k8.d dVar, boolean z10, int i10, int i11, double d10, d1 d1Var, boolean z11, boolean z12, long j10, long j11) {
            this.f29558a = dVar;
            this.f29559b = z10;
            this.f29560c = i10;
            this.f29561d = i11;
            this.f29562e = d10;
            this.f29563f = d1Var;
            this.f29564g = z11;
            this.f29565h = z12;
            this.f29566j = j10;
            this.f29567k = j11;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            e0.a aVar;
            g.a.C0128a c0128a;
            k8.d dVar;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                float f10 = 10;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), f10);
                b.g gVar = z.b.f34450g;
                f.b bVar = d.a.f14612k;
                m1 m1VarA = k1.a(gVar, bVar, jVar2, 54);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar2 = g.a.f13867f;
                v1.j(bVar2, m1VarA, jVar2);
                g.a.d dVar2 = g.a.f13866e;
                v1.j(dVar2, a2VarY, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a2);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                b.j jVar3 = z.b.f34444a;
                m1 m1VarA2 = k1.a(jVar3, bVar, jVar2, 48);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, m1VarA2, jVar2);
                v1.j(dVar2, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a2);
                }
                v1.j(cVar, dVarC2, jVar2);
                androidx.compose.ui.d dVarA = t.o.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar2, 48), c2.n0.c(4281872167L), h0.f.a(f10)), 1, c2.n0.c(4283581496L), h0.f.a(f10));
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarA, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, l0VarD, jVar2);
                v1.j(dVar2, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a2);
                }
                v1.j(cVar, dVarC3, jVar2);
                k8.d dVar3 = this.f29558a;
                int i10 = dVar3.f16081j;
                int i11 = dVar3.f16073b;
                t.t0.b(o2.a.a(i10, jVar2), f3.q.c(i11, jVar2), androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.n(aVar2, 40), 2), null, jVar2, 384, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f10), jVar2);
                b.k kVar = z.b.f34446c;
                z.q qVarA = z.o.a(kVar, d.a.f14614m, jVar2, 0);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar2, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, qVarA, jVar2);
                v1.j(dVar2, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a2);
                }
                v1.j(cVar, dVarC4, jVar2);
                String strC = f3.q.c(i11, jVar2);
                long j10 = q1.b1.f21650d;
                x2.p pVar = x2.p.f32033f;
                ff.b(strC, null, j10, f3.u.c(14), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                ff.b(f3.q.c(dVar3.f16074c, jVar2), null, c2.n0.c(4288582279L), f3.u.c(11), null, null, 0L, null, 0L, 2, false, 1, 0, null, jVar2, 3456, 3120, 120818);
                m1 m1VarA3 = k1.a(jVar3, bVar, jVar2, 48);
                int iD5 = jVar2.D();
                a2 a2VarY5 = jVar2.y();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar2, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    aVar = aVar3;
                    jVar2.w(aVar);
                } else {
                    aVar = aVar3;
                    jVar2.z();
                }
                v1.j(bVar2, m1VarA3, jVar2);
                v1.j(dVar2, a2VarY5, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                    c0128a = c0128a2;
                    l9.i.a(iD5, jVar2, iD5, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                v1.j(cVar, dVarC5, jVar2);
                String strD = f3.q.d(R.string.cat_farm_owned_count, new Object[]{Integer.valueOf(this.f29560c)}, jVar2);
                long jC = c2.n0.c(4294956800L);
                e0.a aVar4 = aVar;
                long jC2 = f3.u.c(11);
                x2.p pVar2 = x2.p.f32032e;
                g.a.C0128a c0128a3 = c0128a;
                ff.b(strD, null, jC, jC2, pVar2, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                float f11 = 8;
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f11), jVar2);
                ff.b(f3.q.d(R.string.cat_farm_level_count, new Object[]{Integer.valueOf(this.f29561d)}, jVar2), null, c2.n0.c(4294210230L), f3.u.c(11), pVar2, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f11), jVar2);
                ff.b(f3.q.d(R.string.cat_farm_pps_format, new Object[]{y.n(this.f29562e)}, jVar2), null, c2.n0.c(4283096704L), f3.u.c(11), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3456, 0, 131058);
                x0.j jVar4 = jVar2;
                jVar4.H();
                jVar4.L(2005631233);
                if (this.f29559b) {
                    dVar = dVar3;
                    ff.b(f3.q.d(R.string.cat_farm_level_required, new Object[]{Integer.valueOf(dVar3.f16080i)}, jVar4), null, c2.n0.c(4293870660L), f3.u.c(10), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar4, 200064, 0, 131026);
                    jVar4 = jVar4;
                } else {
                    dVar = dVar3;
                }
                jVar4.B();
                jVar4.H();
                jVar4.H();
                z.q qVarA2 = z.o.a(kVar, d.a.f14616o, jVar4, 48);
                int iD6 = jVar4.D();
                a2 a2VarY6 = jVar4.y();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(aVar2, jVar4);
                if (jVar4.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar4);
                } else {
                    jVar4.z();
                }
                v1.j(bVar2, qVarA2, jVar4);
                v1.j(dVar2, a2VarY6, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD6))) {
                    l9.i.a(iD6, jVar4, iD6, c0128a3);
                }
                v1.j(cVar, dVarC6, jVar4);
                jVar4.L(855555851);
                d1 d1Var = this.f29563f;
                k8.d dVar4 = dVar;
                boolean zL = jVar4.l(d1Var) | jVar4.K(dVar4);
                Object objG = jVar4.g();
                Object obj = j.a.f31715a;
                if (zL || objG == obj) {
                    objG = new i0(d1Var, dVar4);
                    jVar4.C(objG);
                }
                jVar4.B();
                z.g1 g1Var = t0.m0.f26400a;
                t0.l0 l0VarA = t0.m0.a(c2.n0.c(4293571336L), 0L, c2.n0.c(4282201390L), jVar4, 10);
                float f12 = 4;
                z.g1 g1Var2 = new z.g1(f10, f12, f10, f12);
                long j11 = this.f29566j;
                boolean z10 = this.f29564g;
                x0.j jVar5 = jVar4;
                t0.x0.a((eh.a) objG, null, z10, null, l0VarA, null, null, g1Var2, f1.c.b(-368521058, new j0(j11, z10), jVar4), jVar5, 817889280, 362);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, f12), jVar5);
                jVar5.L(855599535);
                boolean zL2 = jVar5.l(d1Var) | jVar5.K(dVar4);
                Object objG2 = jVar5.g();
                if (zL2 || objG2 == obj) {
                    objG2 = new k0(d1Var, dVar4);
                    jVar5.C(objG2);
                }
                eh.a aVar5 = (eh.a) objG2;
                jVar5.B();
                t0.l0 l0VarA2 = t0.m0.a(c2.n0.c(4293675161L), 0L, c2.n0.c(4282201390L), jVar5, 10);
                z.g1 g1Var3 = new z.g1(f10, f12, f10, f12);
                long j12 = this.f29567k;
                boolean z11 = this.f29565h;
                t0.x0.a(aVar5, null, z11, null, l0VarA2, null, null, g1Var3, f1.c.b(-834965355, new l0(j12, z11), jVar5), jVar5, 817889280, 362);
                jVar5.H();
                jVar5.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.l {

        /* renamed from: a, reason: collision with root package name */
        public static final g f29568a = new g(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i3 f29569a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f29570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(i3 i3Var, List list) {
            super(1);
            this.f29569a = i3Var;
            this.f29570b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f29569a.invoke(this.f29570b.get(num.intValue()));
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l f29571a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f29572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(eh.l lVar, List list) {
            super(1);
            this.f29571a = lVar;
            this.f29572b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f29571a.invoke(this.f29572b.get(num.intValue()));
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f29573a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k8.i f29574b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d1 f29575c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list, k8.i iVar, d1 d1Var) {
            super(4);
            this.f29573a = list;
            this.f29574b = iVar;
            this.f29575c = d1Var;
        }

        @Override // eh.r
        public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
            int i10;
            b0.e eVar2 = eVar;
            int iIntValue = num.intValue();
            x0.j jVar2 = jVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= jVar2.i(iIntValue) ? 32 : 16;
            }
            if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
                k8.d dVar = (k8.d) this.f29573a.get(iIntValue);
                jVar2.L(65679053);
                k8.i iVar = this.f29574b;
                Map<String, Integer> map = iVar.f16130k;
                String str = dVar.f16072a;
                Integer num3 = map.get(str);
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Integer num4 = iVar.f16131l.get(str);
                int iIntValue4 = num4 != null ? num4.intValue() : 1;
                boolean z10 = dVar.f16080i > iVar.f16127h;
                d1 d1Var = this.f29575c;
                k8.h hVar = d1Var.f29418b;
                Integer num5 = ((k8.i) d1Var.f29419c.f25021a.getValue()).f16130k.get(str);
                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                hVar.getClass();
                long jPow = (long) (Math.pow(1.15d, iIntValue5) * dVar.f16076e);
                long jE = hVar.e(str);
                boolean z11 = !z10 && iVar.f16120a >= jPow;
                boolean z12 = iIntValue3 > 0 && iVar.f16121b >= jE;
                t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(12), t0.z0.a(c2.n0.c(4280754460L), jVar2, 6), null, null, f1.c.b(-326554796, new f(dVar, z10, iIntValue3, iIntValue4, (((iIntValue4 - 1) * 0.1d) + 1) * dVar.f16077f, d1Var, z11, z12, jPow, jE), jVar2), jVar2, 196614, 24);
                jVar2.B();
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f29576a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29577b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29578c;

        public k(String str, String str2, boolean z10) {
            this.f29576a = z10;
            this.f29577b = str;
            this.f29578c = str2;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                v1.j(bVar, l0VarD, jVar2);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(aVar, 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, m1VarA, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                ff.b(this.f29577b, null, 0L, f3.u.c(17), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3072, 0, 131062);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 5), jVar2);
                ff.b(this.f29578c, null, c2.n0.c(4294956800L), f3.u.c(12), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                jVar2.H();
                jVar2.L(522425312);
                if (this.f29576a) {
                    z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.b.f961a.b(aVar, d.a.f14604c), 9), c2.n0.c(4293870660L), h0.f.f12083a), jVar2, 0);
                }
                jVar2.B();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.catgame.CatGameScreenKt$FarmStage$1$1", f = "CatGameScreen.kt", l = {}, m = "invokeSuspend")
    public static final class l extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.u<f1> f29579a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k8.i f29580b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(h1.u<f1> uVar, k8.i iVar, tg.e<? super l> eVar) {
            super(2, eVar);
            this.f29579a = uVar;
            this.f29580b = iVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new l(this.f29579a, this.f29580b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = k8.e.f16082a.iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                k8.d dVar = (k8.d) it.next();
                Integer num = this.f29580b.f16130k.get(dVar.f16072a);
                int iIntValue = num != null ? num.intValue() : 0;
                if (iIntValue > 0) {
                    if (iIntValue > 2) {
                        iIntValue = 2;
                    }
                    while (i10 < iIntValue) {
                        arrayList.add(dVar);
                        i10++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(qg.x.B(k8.e.f16082a));
            }
            List listW = qg.x.W(arrayList, 12);
            h1.u<f1> uVar = this.f29579a;
            uVar.clear();
            for (Object obj2 : listW) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    qg.p.o();
                    throw null;
                }
                float f10 = i10;
                uVar.add(new f1((k8.d) obj2, ((45.0f * f10) % 280.0f) + 50.0f, ((f10 * 30.0f) % 180.0f) + 120.0f));
                i10 = i11;
            }
            return pg.f0.f21461a;
        }
    }

    public static final class m implements eh.q<z.n, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.u<f1> f29581a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f29582b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f29583c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f29584d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f29585e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k8.i f29586f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ eh.p<Float, Float, pg.f0> f29587g;

        /* JADX WARN: Multi-variable type inference failed */
        public m(h1.u<f1> uVar, boolean z10, eh.a<pg.f0> aVar, boolean z11, eh.a<pg.f0> aVar2, k8.i iVar, eh.p<? super Float, ? super Float, pg.f0> pVar) {
            this.f29581a = uVar;
            this.f29582b = z10;
            this.f29583c = aVar;
            this.f29584d = z11;
            this.f29585e = aVar2;
            this.f29586f = iVar;
            this.f29587g = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0638  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0659  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x068b  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x06c5  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0902  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x098b  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x084c A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v11, types: [tg.e] */
        @Override // eh.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 b(z.n nVar, x0.j jVar, Integer num) throws Throwable {
            k8.i iVar;
            z.n nVar2;
            d.a aVar;
            f.b bVar;
            j1.f fVar;
            int i10;
            float f10;
            k8.i iVar2;
            Throwable th2;
            Throwable th3;
            z.n nVar3;
            j1.f fVar2;
            d.a aVar2;
            f.b bVar2;
            z.n nVar4;
            d.a aVar3;
            m mVar;
            j1.f fVar3;
            z.n nVar5;
            Object obj;
            boolean z10;
            Object obj2;
            boolean z11;
            int i11;
            int i12;
            int iIntValue;
            boolean z12;
            final float f11;
            int i13;
            boolean zK;
            Object objG;
            Object objG2;
            final eh.p<Float, Float, pg.f0> pVar;
            boolean zK2;
            Object objG3;
            j1.f fVar4;
            androidx.compose.foundation.layout.b bVar3;
            float f12;
            float f13;
            Object obj3;
            j1.f fVar5;
            k8.i iVar3;
            z.n BoxWithConstraints = nVar;
            x0.j jVar2 = jVar;
            int iIntValue2 = num.intValue();
            kotlin.jvm.internal.r.e(BoxWithConstraints, "$this$BoxWithConstraints");
            char c10 = 4;
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= jVar2.K(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue2 & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                float fI = f3.b.i(BoxWithConstraints.c());
                float fH = f3.b.h(BoxWithConstraints.c());
                t.t0.a(o2.c.a(R.drawable.pixel_farm_bg, jVar2), f3.q.c(R.string.cat_farm_stage_desc, jVar2), androidx.compose.foundation.layout.g.f976c, null, j.a.f11397a, CropImageView.DEFAULT_ASPECT_RATIO, null, jVar2, 24960, HeaderItem.DATA_SIZE_OFFSET);
                x0.j jVar3 = jVar2;
                List<k8.n> list = k8.e.f16085d;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    iVar = this.f29586f;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (((k8.n) next).f16170e <= iVar.f16127h) {
                        arrayList.add(next);
                    }
                }
                jVar3.L(-1197826163);
                boolean zIsEmpty = arrayList.isEmpty();
                d.a aVar4 = d.a.f1143b;
                f.b bVar4 = d.a.f14612k;
                char c11 = '\f';
                j1.f fVar6 = d.a.f14602a;
                k8.i iVar4 = iVar;
                if (zIsEmpty) {
                    nVar2 = BoxWithConstraints;
                    aVar = aVar4;
                    bVar = bVar4;
                    fVar = fVar6;
                    i10 = 18;
                    f10 = fI;
                    iVar2 = iVar4;
                    th2 = null;
                } else {
                    float f14 = 8;
                    int i14 = 18;
                    float f15 = 4;
                    androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.f.l(BoxWithConstraints.b(aVar4, fVar6), 10, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), c2.n0.c(2568886034L), h0.f.a(12)), f14, f15);
                    m1 m1VarA = k1.a(z.b.f34444a, bVar4, jVar3, 48);
                    int iD = jVar3.D();
                    a2 a2VarY = jVar3.y();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar3);
                    i2.g.f13861o.getClass();
                    e0.a aVar5 = g.a.f13863b;
                    if (jVar3.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        jVar3.w(aVar5);
                    } else {
                        jVar3.z();
                    }
                    v1.j(g.a.f13867f, m1VarA, jVar3);
                    v1.j(g.a.f13866e, a2VarY, jVar3);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                        l9.i.a(iD, jVar3, iD, c0128a);
                    }
                    v1.j(g.a.f13865d, dVarC, jVar3);
                    jVar3.L(-2002170607);
                    Iterator it2 = qg.x.W(arrayList, 5).iterator();
                    while (it2.hasNext()) {
                        x0.j jVar4 = jVar3;
                        d.a aVar6 = aVar4;
                        float f16 = f15;
                        ff.b(((k8.n) it2.next()).f16169d, androidx.compose.foundation.layout.f.l(aVar6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f16, CropImageView.DEFAULT_ASPECT_RATIO, 11), 0L, f3.u.c(i14), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar4, 3120, 0, 131060);
                        iVar4 = iVar4;
                        jVar3 = jVar4;
                        BoxWithConstraints = BoxWithConstraints;
                        f15 = f16;
                        aVar4 = aVar6;
                        i14 = i14;
                        fI = fI;
                        bVar4 = bVar4;
                        fVar6 = fVar6;
                        c11 = '\f';
                        c10 = 4;
                    }
                    nVar2 = BoxWithConstraints;
                    aVar = aVar4;
                    bVar = bVar4;
                    fVar = fVar6;
                    f10 = fI;
                    iVar2 = iVar4;
                    i10 = i14;
                    th2 = null;
                    jVar3.B();
                    jVar3.H();
                }
                jVar3.B();
                List<k8.a> list2 = k8.e.f16084c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    Integer num2 = iVar2.f16133n.get(((k8.a) obj4).f16056a);
                    if ((num2 != null ? num2.intValue() : 0) > 0) {
                        arrayList2.add(obj4);
                    }
                }
                jVar3.L(-1197799467);
                boolean zIsEmpty2 = arrayList2.isEmpty();
                j1.f fVar7 = d.a.f14604c;
                char c12 = 6;
                if (zIsEmpty2) {
                    z.n nVar6 = nVar2;
                    th3 = th2;
                    nVar3 = nVar6;
                    fVar2 = fVar7;
                    aVar2 = aVar;
                    bVar2 = bVar;
                } else {
                    z.n nVar7 = nVar2;
                    d.a aVar7 = aVar;
                    float f17 = 8;
                    th3 = th2;
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.f.l(nVar7.b(aVar7, fVar7), CropImageView.DEFAULT_ASPECT_RATIO, f17, 10, CropImageView.DEFAULT_ASPECT_RATIO, 9), c2.n0.c(2568886034L), h0.f.a(12));
                    char c13 = 4;
                    float f18 = 4;
                    androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.f.i(dVarB, f17, f18);
                    f.b bVar5 = bVar;
                    m1 m1VarA2 = k1.a(z.b.f34444a, bVar5, jVar3, 48);
                    int iD2 = jVar3.D();
                    a2 a2VarY2 = jVar3.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI2, jVar3);
                    i2.g.f13861o.getClass();
                    e0.a aVar8 = g.a.f13863b;
                    if (jVar3.t() == null) {
                        u1.d();
                        throw th3;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        jVar3.w(aVar8);
                    } else {
                        jVar3.z();
                    }
                    v1.j(g.a.f13867f, m1VarA2, jVar3);
                    v1.j(g.a.f13866e, a2VarY2, jVar3);
                    g.a.C0128a c0128a2 = g.a.f13868g;
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar3, iD2, c0128a2);
                    }
                    v1.j(g.a.f13865d, dVarC2, jVar3);
                    jVar3.L(-2002143973);
                    Iterator it3 = qg.x.W(arrayList2, 6).iterator();
                    while (it3.hasNext()) {
                        x0.j jVar5 = jVar3;
                        d.a aVar9 = aVar7;
                        float f19 = f18;
                        ff.b(((k8.a) it3.next()).f16059d, androidx.compose.foundation.layout.f.l(aVar9, f19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, f3.u.c(i10), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar5, 3120, 0, 131060);
                        nVar7 = nVar7;
                        jVar3 = jVar5;
                        f18 = f19;
                        aVar7 = aVar9;
                        fVar7 = fVar7;
                        bVar5 = bVar5;
                        c12 = 6;
                        c13 = 4;
                    }
                    nVar3 = nVar7;
                    fVar2 = fVar7;
                    aVar2 = aVar7;
                    bVar2 = bVar5;
                    jVar3.B();
                    jVar3.H();
                }
                jVar3.B();
                List<k8.m> list3 = k8.e.f16083b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list3) {
                    Integer num3 = iVar2.f16132m.get(((k8.m) obj5).f16158a);
                    if ((num3 != null ? num3.intValue() : 0) > 0) {
                        arrayList3.add(obj5);
                    }
                }
                jVar3.L(-1197772714);
                if (arrayList3.isEmpty()) {
                    nVar4 = nVar3;
                    aVar3 = aVar2;
                } else {
                    d.a aVar10 = aVar2;
                    char c14 = '\b';
                    float f20 = 4;
                    androidx.compose.ui.d dVarI3 = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.f.l(nVar3.b(aVar10, d.a.f14608g), 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 62, 6), c2.n0.c(2568886034L), h0.f.a(12)), 8, f20);
                    m1 m1VarA3 = k1.a(z.b.f34444a, bVar2, jVar3, 48);
                    int iD3 = jVar3.D();
                    a2 a2VarY3 = jVar3.y();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarI3, jVar3);
                    i2.g.f13861o.getClass();
                    e0.a aVar11 = g.a.f13863b;
                    if (jVar3.t() == null) {
                        u1.d();
                        throw th3;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        jVar3.w(aVar11);
                    } else {
                        jVar3.z();
                    }
                    v1.j(g.a.f13867f, m1VarA3, jVar3);
                    v1.j(g.a.f13866e, a2VarY3, jVar3);
                    g.a.C0128a c0128a3 = g.a.f13868g;
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                        l9.i.a(iD3, jVar3, iD3, c0128a3);
                    }
                    v1.j(g.a.f13865d, dVarC3, jVar3);
                    jVar3.L(-2002117003);
                    char c15 = 6;
                    Iterator it4 = qg.x.W(arrayList3, 6).iterator();
                    while (it4.hasNext()) {
                        float f21 = f20;
                        d.a aVar12 = aVar10;
                        x0.j jVar6 = jVar3;
                        ff.b(((k8.m) it4.next()).f16161d, androidx.compose.foundation.layout.f.l(aVar12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f21, CropImageView.DEFAULT_ASPECT_RATIO, 11), 0L, f3.u.c(20), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar6, 3120, 0, 131060);
                        aVar10 = aVar12;
                        jVar3 = jVar6;
                        f20 = f21;
                        nVar3 = nVar3;
                        c15 = 6;
                        c14 = '\b';
                    }
                    nVar4 = nVar3;
                    aVar3 = aVar10;
                    jVar3.B();
                    jVar3.H();
                }
                jVar3.B();
                Float fValueOf = Float.valueOf(f10);
                Float fValueOf2 = Float.valueOf(fH);
                jVar3.L(-1197747093);
                final float f22 = fH;
                final float f23 = f10;
                boolean zH = jVar3.h(f22) | jVar3.h(f23);
                Object objG4 = jVar3.g();
                m mVar2 = this;
                h1.u<f1> uVar = mVar2.f29581a;
                Object obj6 = j.a.f31715a;
                if (zH || objG4 == obj6) {
                    objG4 = new p0(uVar, f22, f23, th3);
                    jVar3.C(objG4);
                }
                jVar3.B();
                x0.o0.e(fValueOf, fValueOf2, (eh.p) objG4, jVar3);
                pg.f0 f0Var = pg.f0.f21461a;
                jVar3.L(-1197675181);
                Object objG5 = jVar3.g();
                if (objG5 == obj6) {
                    objG5 = new q0(uVar, null);
                    jVar3.C(objG5);
                }
                jVar3.B();
                x0.o0.d((eh.p) objG5, f0Var, jVar3);
                jVar3.L(-1197648938);
                ListIterator<f1> listIterator = uVar.listIterator();
                int i15 = 0;
                while (true) {
                    h1.c0 c0Var = (h1.c0) listIterator;
                    if (c0Var.hasNext()) {
                        Object next2 = c0Var.next();
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            qg.p.o();
                            throw null;
                        }
                        final f1 f1Var = (f1) next2;
                        k8.d dVar = f1Var.f29449a;
                        k8.d dVar2 = f1Var.f29449a;
                        x0.v1 v1Var = f1Var.f29456h;
                        String str = dVar.f16072a;
                        jVar3.L(-2002009161);
                        boolean zK3 = jVar3.K(str);
                        Object objG6 = jVar3.g();
                        if (zK3 || objG6 == obj6) {
                            objG6 = k8.c.a(dVar2.f16072a);
                            jVar3.C(objG6);
                        }
                        k8.b bVar6 = (k8.b) objG6;
                        jVar3.B();
                        boolean z13 = f1Var.a() == u8.a.f29390c;
                        boolean z14 = f1Var.a() == u8.a.f29388a;
                        boolean z15 = f1Var.a() == u8.a.f29391d;
                        int iOrdinal = f1Var.a().ordinal();
                        if (iOrdinal != 0) {
                            i11 = 14;
                            i12 = 1;
                            if (iOrdinal != 1) {
                                z11 = z13;
                                if (iOrdinal == 2) {
                                    iIntValue = bVar6.f16070d.get(v1Var.g() % bVar6.f16070d.size()).intValue();
                                } else {
                                    if (iOrdinal != 3) {
                                        throw new pg.l();
                                    }
                                    iIntValue = bVar6.f16069c.get(v1Var.g() % bVar6.f16069c.size()).intValue();
                                }
                            } else {
                                z11 = z13;
                                iIntValue = bVar6.f16068b.get(v1Var.g() % bVar6.f16068b.size()).intValue();
                            }
                        } else {
                            z11 = z13;
                            i11 = 14;
                            i12 = 1;
                            iIntValue = bVar6.f16067a.get(v1Var.g() % bVar6.f16067a.size()).intValue();
                        }
                        float f24 = dVar2.f16079h;
                        if (z14 && v1Var.g() % 2 == i12) {
                            i13 = -3;
                        } else if (z15) {
                            i13 = -8;
                        } else {
                            z12 = false;
                            f11 = 0;
                            jVar3.L(-2001975209);
                            zK = jVar3.K(f1Var) | jVar3.h(f11);
                            objG = jVar3.g();
                            if (!zK || objG == obj6) {
                                objG = new eh.l() { // from class: u8.m0
                                    @Override // eh.l
                                    public final Object invoke(Object obj7) {
                                        f3.d offset = (f3.d) obj7;
                                        kotlin.jvm.internal.r.e(offset, "$this$offset");
                                        f1 f1Var2 = f1Var;
                                        return new f3.m((((int) f1Var2.f29450b.getFloatValue()) << 32) | (((int) (offset.N0(f11) + f1Var2.f29451c.getFloatValue())) & BodyPartID.bodyIdMax));
                                    }
                                };
                                jVar3.C(objG);
                            }
                            jVar3.B();
                            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.e.a(aVar3, (eh.l) objG), f24);
                            jVar3.L(-2001969352);
                            objG2 = jVar3.g();
                            if (objG2 == obj6) {
                                objG2 = new x.n();
                                jVar3.C(objG2);
                            }
                            x.m mVar3 = (x.m) objG2;
                            jVar3.B();
                            jVar3.L(-2001965285);
                            boolean zH2 = jVar3.h(f22) | jVar3.h(f23) | jVar3.K(f1Var);
                            pVar = mVar2.f29587g;
                            zK2 = zH2 | jVar3.K(pVar);
                            objG3 = jVar3.g();
                            if (!zK2 || objG3 == obj6) {
                                objG3 = new eh.a() { // from class: u8.n0
                                    @Override // eh.a
                                    public final Object invoke() {
                                        f1 f1Var2 = f1Var;
                                        x0.u1 u1Var = f1Var2.f29452d;
                                        float f25 = f22;
                                        float f26 = f25 - 90.0f;
                                        float f27 = f25 * 0.52f;
                                        if (f27 < 60.0f) {
                                            f27 = 60.0f;
                                        }
                                        float f28 = f23 - 80.0f;
                                        if (f28 < 10.0f) {
                                            f28 = 10.0f;
                                        }
                                        float f29 = f26 - f27;
                                        float f30 = f29 >= 10.0f ? f29 : 10.0f;
                                        f1Var2.f29455g.setValue(a.f29390c);
                                        x0.u1 u1Var2 = f1Var2.f29450b;
                                        f1Var2.f29458j.f(10);
                                        c.a aVar13 = hh.c.f13027a;
                                        u1Var.e((aVar13.g() * f28) + 40.0f);
                                        f1Var2.f29453e.e((aVar13.g() * f30) + f27);
                                        f1Var2.b(u1Var.getFloatValue() < u1Var2.getFloatValue());
                                        pVar.invoke(Float.valueOf(u1Var2.getFloatValue()), Float.valueOf(f1Var2.f29451c.getFloatValue()));
                                        return pg.f0.f21461a;
                                    }
                                };
                                jVar3.C(objG3);
                            }
                            jVar3.B();
                            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.b.b(dVarN, mVar3, null, false, null, (eh.a) objG3, 28);
                            j1.f fVar8 = fVar;
                            g2.l0 l0VarD = z.g.d(fVar8, z12);
                            int iD4 = jVar3.D();
                            a2 a2VarY4 = jVar3.y();
                            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarB2, jVar3);
                            i2.g.f13861o.getClass();
                            e0.a aVar13 = g.a.f13863b;
                            if (jVar3.t() != null) {
                                u1.d();
                                throw null;
                            }
                            jVar3.r();
                            if (jVar3.m()) {
                                jVar3.w(aVar13);
                            } else {
                                jVar3.z();
                            }
                            v1.j(g.a.f13867f, l0VarD, jVar3);
                            v1.j(g.a.f13866e, a2VarY4, jVar3);
                            g.a.C0128a c0128a4 = g.a.f13868g;
                            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                                l9.i.a(iD4, jVar3, iD4, c0128a4);
                            }
                            v1.j(g.a.f13865d, dVarC4, jVar3);
                            t.t0.b(o2.a.a(iIntValue, jVar3), f3.q.c(dVar2.f16073b, jVar3), d2.c(androidx.compose.foundation.layout.g.f976c, ((Boolean) f1Var.f29454f.getValue()).booleanValue() ? -1.0f : 1.0f, z11 ? 1.08f : 1.0f), null, jVar3, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                            jVar3.L(-1388445600);
                            j1.f fVar9 = d.a.f14603b;
                            androidx.compose.foundation.layout.b bVar7 = androidx.compose.foundation.layout.b.f961a;
                            if (z11) {
                                x0.j jVar7 = jVar3;
                                f13 = f23;
                                f12 = f22;
                                bVar3 = bVar7;
                                fVar4 = fVar9;
                                obj3 = obj6;
                                fVar5 = fVar8;
                                ff.b("❤️", androidx.compose.foundation.layout.e.c(bVar7.b(aVar3, fVar9), CropImageView.DEFAULT_ASPECT_RATIO, -14, 1), 0L, f3.u.c(i11), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar7, 3078, 0, 131060);
                                jVar3 = jVar7;
                            } else {
                                fVar4 = fVar9;
                                bVar3 = bVar7;
                                f12 = f22;
                                f13 = f23;
                                obj3 = obj6;
                                fVar5 = fVar8;
                            }
                            jVar3.B();
                            jVar3.L(-1388434968);
                            if (i15 != 0) {
                                iVar3 = iVar2;
                            } else if (iVar2.f16124e < 6) {
                                x0.j jVar8 = jVar3;
                                iVar3 = iVar2;
                                ff.b(f3.q.c(R.string.cat_farm_tap_prompt, jVar3), androidx.compose.foundation.layout.f.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.c(bVar3.b(aVar3, fVar4), CropImageView.DEFAULT_ASPECT_RATIO, -24, 1), c2.n0.c(4293571336L), h0.f.a(8)), 6, 2), q1.b1.f21648b, f3.u.c(11), x2.p.f32034g, null, 0L, null, 0L, 0, false, 0, 0, null, jVar8, 200064, 0, 131024);
                                jVar3 = jVar8;
                            } else {
                                iVar3 = iVar2;
                            }
                            jVar3.B();
                            jVar3.H();
                            mVar2 = this;
                            i15 = i16;
                            f22 = f12;
                            iVar2 = iVar3;
                            f23 = f13;
                            fVar = fVar5;
                            obj6 = obj3;
                        }
                        f11 = i13;
                        z12 = false;
                        jVar3.L(-2001975209);
                        zK = jVar3.K(f1Var) | jVar3.h(f11);
                        objG = jVar3.g();
                        if (!zK) {
                            objG = new eh.l() { // from class: u8.m0
                                @Override // eh.l
                                public final Object invoke(Object obj7) {
                                    f3.d offset = (f3.d) obj7;
                                    kotlin.jvm.internal.r.e(offset, "$this$offset");
                                    f1 f1Var2 = f1Var;
                                    return new f3.m((((int) f1Var2.f29450b.getFloatValue()) << 32) | (((int) (offset.N0(f11) + f1Var2.f29451c.getFloatValue())) & BodyPartID.bodyIdMax));
                                }
                            };
                            jVar3.C(objG);
                        }
                        jVar3.B();
                        androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.e.a(aVar3, (eh.l) objG), f24);
                        jVar3.L(-2001969352);
                        objG2 = jVar3.g();
                        if (objG2 == obj6) {
                        }
                        x.m mVar32 = (x.m) objG2;
                        jVar3.B();
                        jVar3.L(-2001965285);
                        boolean zH22 = jVar3.h(f22) | jVar3.h(f23) | jVar3.K(f1Var);
                        pVar = mVar2.f29587g;
                        zK2 = zH22 | jVar3.K(pVar);
                        objG3 = jVar3.g();
                        if (!zK2) {
                            objG3 = new eh.a() { // from class: u8.n0
                                @Override // eh.a
                                public final Object invoke() {
                                    f1 f1Var2 = f1Var;
                                    x0.u1 u1Var = f1Var2.f29452d;
                                    float f25 = f22;
                                    float f26 = f25 - 90.0f;
                                    float f27 = f25 * 0.52f;
                                    if (f27 < 60.0f) {
                                        f27 = 60.0f;
                                    }
                                    float f28 = f23 - 80.0f;
                                    if (f28 < 10.0f) {
                                        f28 = 10.0f;
                                    }
                                    float f29 = f26 - f27;
                                    float f30 = f29 >= 10.0f ? f29 : 10.0f;
                                    f1Var2.f29455g.setValue(a.f29390c);
                                    x0.u1 u1Var2 = f1Var2.f29450b;
                                    f1Var2.f29458j.f(10);
                                    c.a aVar132 = hh.c.f13027a;
                                    u1Var.e((aVar132.g() * f28) + 40.0f);
                                    f1Var2.f29453e.e((aVar132.g() * f30) + f27);
                                    f1Var2.b(u1Var.getFloatValue() < u1Var2.getFloatValue());
                                    pVar.invoke(Float.valueOf(u1Var2.getFloatValue()), Float.valueOf(f1Var2.f29451c.getFloatValue()));
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar3.C(objG3);
                        }
                        jVar3.B();
                        androidx.compose.ui.d dVarB22 = androidx.compose.foundation.b.b(dVarN2, mVar32, null, false, null, (eh.a) objG3, 28);
                        j1.f fVar82 = fVar;
                        g2.l0 l0VarD2 = z.g.d(fVar82, z12);
                        int iD42 = jVar3.D();
                        a2 a2VarY42 = jVar3.y();
                        androidx.compose.ui.d dVarC42 = androidx.compose.ui.c.c(dVarB22, jVar3);
                        i2.g.f13861o.getClass();
                        e0.a aVar132 = g.a.f13863b;
                        if (jVar3.t() != null) {
                        }
                    } else {
                        Object obj7 = obj6;
                        j1.f fVar10 = fVar;
                        jVar3.B();
                        jVar3.L(-1197533719);
                        boolean z16 = this.f29582b;
                        j1.f fVar11 = d.a.f14606e;
                        if (z16) {
                            z.n nVar8 = nVar4;
                            androidx.compose.ui.d dVarN3 = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(nVar8.b(aVar3, fVar10), 14, 48, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 54);
                            long jC = q1.b1.c(0.9f, c2.n0.c(4280468830L));
                            h0.e eVar = h0.f.f12083a;
                            androidx.compose.ui.d dVarA = t.o.a(androidx.compose.foundation.a.b(dVarN3, jC, eVar), 2, c2.n0.c(4287033260L), eVar);
                            jVar3.L(-1197521981);
                            eh.a<pg.f0> aVar14 = this.f29583c;
                            boolean zK4 = jVar3.K(aVar14);
                            Object objG7 = jVar3.g();
                            if (zK4) {
                                obj2 = obj7;
                            } else {
                                obj2 = obj7;
                                if (objG7 == obj2) {
                                }
                                jVar3.B();
                                androidx.compose.ui.d dVarC5 = androidx.compose.foundation.b.c(dVarA, false, null, null, (eh.a) objG7, 7);
                                g2.l0 l0VarD3 = z.g.d(fVar11, false);
                                int iD5 = jVar3.D();
                                a2 a2VarY5 = jVar3.y();
                                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarC5, jVar3);
                                i2.g.f13861o.getClass();
                                e0.a aVar15 = g.a.f13863b;
                                if (jVar3.t() != null) {
                                    u1.d();
                                    throw null;
                                }
                                jVar3.r();
                                if (jVar3.m()) {
                                    jVar3.w(aVar15);
                                } else {
                                    jVar3.z();
                                }
                                v1.j(g.a.f13867f, l0VarD3, jVar3);
                                v1.j(g.a.f13866e, a2VarY5, jVar3);
                                g.a.C0128a c0128a5 = g.a.f13868g;
                                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD5))) {
                                    l9.i.a(iD5, jVar3, iD5, c0128a5);
                                }
                                v1.j(g.a.f13865d, dVarC6, jVar3);
                                x0.j jVar9 = jVar3;
                                mVar = this;
                                fVar3 = fVar11;
                                nVar5 = nVar8;
                                obj = obj2;
                                ff.b("🌿 3X", null, q1.b1.f21650d, f3.u.c(13), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar9, 200070, 0, 131026);
                                jVar3 = jVar9;
                                jVar3.H();
                            }
                            objG7 = new androidx.lifecycle.p0(aVar14, 2);
                            jVar3.C(objG7);
                            jVar3.B();
                            androidx.compose.ui.d dVarC52 = androidx.compose.foundation.b.c(dVarA, false, null, null, (eh.a) objG7, 7);
                            g2.l0 l0VarD32 = z.g.d(fVar11, false);
                            int iD52 = jVar3.D();
                            a2 a2VarY52 = jVar3.y();
                            androidx.compose.ui.d dVarC62 = androidx.compose.ui.c.c(dVarC52, jVar3);
                            i2.g.f13861o.getClass();
                            e0.a aVar152 = g.a.f13863b;
                            if (jVar3.t() != null) {
                            }
                        } else {
                            mVar = this;
                            fVar3 = fVar11;
                            nVar5 = nVar4;
                            obj = obj7;
                        }
                        jVar3.B();
                        if (mVar.f29584d) {
                            androidx.compose.ui.d dVarN4 = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(nVar5.b(aVar3, fVar2), CropImageView.DEFAULT_ASPECT_RATIO, 48, 14, CropImageView.DEFAULT_ASPECT_RATIO, 9), 56);
                            long jC2 = q1.b1.c(0.95f, c2.n0.c(4294956800L));
                            h0.e eVar2 = h0.f.f12083a;
                            androidx.compose.ui.d dVarA2 = t.o.a(androidx.compose.foundation.a.b(dVarN4, jC2, eVar2), 2, c2.n0.c(4294966251L), eVar2);
                            jVar3.L(-1197499418);
                            eh.a<pg.f0> aVar16 = mVar.f29585e;
                            boolean zK5 = jVar3.K(aVar16);
                            Object objG8 = jVar3.g();
                            if (zK5 || objG8 == obj) {
                                z10 = false;
                                objG8 = new o0(aVar16, 0);
                                jVar3.C(objG8);
                            } else {
                                z10 = false;
                            }
                            jVar3.B();
                            androidx.compose.ui.d dVarC7 = androidx.compose.foundation.b.c(dVarA2, false, null, null, (eh.a) objG8, 7);
                            g2.l0 l0VarD4 = z.g.d(fVar3, z10);
                            int iD6 = jVar3.D();
                            a2 a2VarY6 = jVar3.y();
                            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(dVarC7, jVar3);
                            i2.g.f13861o.getClass();
                            e0.a aVar17 = g.a.f13863b;
                            if (jVar3.t() == null) {
                                u1.d();
                                throw null;
                            }
                            jVar3.r();
                            if (jVar3.m()) {
                                jVar3.w(aVar17);
                            } else {
                                jVar3.z();
                            }
                            v1.j(g.a.f13867f, l0VarD4, jVar3);
                            v1.j(g.a.f13866e, a2VarY6, jVar3);
                            g.a.C0128a c0128a6 = g.a.f13868g;
                            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD6))) {
                                l9.i.a(iD6, jVar3, iD6, c0128a6);
                            }
                            v1.j(g.a.f13865d, dVarC8, jVar3);
                            x0.j jVar10 = jVar3;
                            ff.b("✨🐾", null, 0L, f3.u.c(17), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar10, 3078, 0, 131062);
                            jVar10.H();
                        }
                    }
                }
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.catgame.CatGameScreenKt$FloatingTapText$1$1", f = "CatGameScreen.kt", l = {1088}, m = "invokeSuspend")
    public static final class n extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29588a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29589b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f29590c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f29591d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f29592e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g1 f29593f;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.catgame.CatGameScreenKt$FloatingTapText$1$1$1", f = "CatGameScreen.kt", l = {1082}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f29594a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s.b<Float, s.o> f29595b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g1 f29596c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s.b<Float, s.o> bVar, g1 g1Var, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f29595b = bVar;
                this.f29596c = g1Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f29595b, this.f29596c, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f29594a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    Float f10 = new Float(this.f29596c.f29464c - 70.0f);
                    m2 m2VarD = s.m.d(600, 0, s.d0.f23706d, 2);
                    this.f29594a = 1;
                    if (s.b.c(this.f29595b, f10, m2VarD, null, this, 12) == aVar) {
                        return aVar;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(s.b<Float, s.o> bVar, eh.a<pg.f0> aVar, s.b<Float, s.o> bVar2, g1 g1Var, tg.e<? super n> eVar) {
            super(2, eVar);
            this.f29590c = bVar;
            this.f29591d = aVar;
            this.f29592e = bVar2;
            this.f29593f = g1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            n nVar = new n(this.f29590c, this.f29591d, this.f29592e, this.f29593f, eVar);
            nVar.f29589b = obj;
            return nVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            n nVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f29588a;
            if (i10 == 0) {
                pg.q.b(obj);
                ph.h.c((ph.i0) this.f29589b, null, null, new a(this.f29592e, this.f29593f, null), 3);
                Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                m2 m2VarD = s.m.d(600, 0, s.d0.f23706d, 2);
                this.f29588a = 1;
                nVar = this;
                if (s.b.c(this.f29590c, f10, m2VarD, null, nVar, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                nVar = this;
            }
            nVar.f29591d.invoke();
            return pg.f0.f21461a;
        }
    }

    public static final class o implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f29597a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d1 f29598b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k8.k f29599c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f29600d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f29601e;

        public o(boolean z10, d1 d1Var, k8.k kVar, boolean z11, long j10) {
            this.f29597a = z10;
            this.f29598b = d1Var;
            this.f29599c = kVar;
            this.f29600d = z11;
            this.f29601e = j10;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            String str;
            x0.j jVar2;
            z.r Card = rVar;
            x0.j jVar3 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar3.s()) {
                jVar3.v();
            } else {
                d.a aVar = d.a.f1143b;
                float f10 = 10;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10);
                b.g gVar = z.b.f34450g;
                f.b bVar = d.a.f14612k;
                m1 m1VarA = k1.a(gVar, bVar, jVar3, 54);
                int iD = jVar3.D();
                a2 a2VarY = jVar3.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                g.a.b bVar2 = g.a.f13867f;
                v1.j(bVar2, m1VarA, jVar3);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar3);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar3, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar3);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                m1 m1VarA2 = k1.a(z.b.f34444a, bVar, jVar3, 48);
                int iD2 = jVar3.D();
                a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                v1.j(bVar2, m1VarA2, jVar3);
                v1.j(dVar, a2VarY2, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar3, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar3);
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar, 42), c2.n0.c(4281872167L), h0.f.f12083a);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar3.D();
                a2 a2VarY3 = jVar3.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                v1.j(bVar2, l0VarD, jVar3);
                v1.j(dVar, a2VarY3, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar3, iD3, c0128a);
                }
                v1.j(cVar, dVarC3, jVar3);
                k8.k kVar = this.f29599c;
                ff.b(kVar.f16142d, null, 0L, f3.u.c(22), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar3, 3072, 0, 131062);
                jVar3.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar3);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar3, 0);
                int iD4 = jVar3.D();
                a2 a2VarY4 = jVar3.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar3.r();
                if (jVar3.m()) {
                    jVar3.w(aVar2);
                } else {
                    jVar3.z();
                }
                v1.j(bVar2, qVarA, jVar3);
                v1.j(dVar, a2VarY4, jVar3);
                if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar3, iD4, c0128a);
                }
                v1.j(cVar, dVarC4, jVar3);
                ff.b(f3.q.c(kVar.f16140b, jVar3), null, q1.b1.f21650d, f3.u.c(14), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar3, 200064, 0, 131026);
                ff.b(f3.q.c(kVar.f16141c, jVar3), null, c2.n0.c(4288582279L), f3.u.c(11), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar3, 3456, 0, 131058);
                ff.b(this.f29601e + " / " + kVar.f16144f, null, c2.n0.c(4281908728L), f3.u.c(11), x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, null, jVar3, 200064, 0, 131026);
                x0.j jVar4 = jVar3;
                long j10 = kVar.f16145g;
                String strA = j10 > 0 ? k3.a.a(y.m(j10), " 🐾") : null;
                long j11 = kVar.f16146h;
                if (j11 > 0) {
                    str = j11 + " ❤️";
                } else {
                    str = null;
                }
                int i10 = kVar.f16147i;
                String strI = qg.x.I(qg.o.s(new String[]{strA, str, i10 > 0 ? i8.c.b(i10, " 🐟") : null}), " + ", null, null, null, 62);
                jVar4.L(-1323715402);
                if (!mh.x.A(strI)) {
                    ff.b(f3.q.d(R.string.cat_farm_reward_prefix, new Object[]{strI}, jVar4), null, c2.n0.c(4283096704L), f3.u.c(10), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar4, 3456, 0, 131058);
                    jVar4 = jVar4;
                }
                jVar4.B();
                jVar4.H();
                jVar4.H();
                if (this.f29597a) {
                    jVar4.L(-2024513553);
                    md.a(null, h0.f.a(8), c2.n0.c(4279522093L), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, e1.f29440e, jVar4, 12583296, 121);
                    jVar4.B();
                    jVar2 = jVar4;
                } else {
                    jVar4.L(-2023297299);
                    jVar4.L(-203813564);
                    d1 d1Var = this.f29598b;
                    boolean zL = jVar4.l(d1Var) | jVar4.K(kVar);
                    Object objG = jVar4.g();
                    if (zL || objG == j.a.f31715a) {
                        objG = new r0(d1Var, kVar);
                        jVar4.C(objG);
                    }
                    eh.a aVar3 = (eh.a) objG;
                    jVar4.B();
                    z.g1 g1Var = t0.m0.f26400a;
                    t0.l0 l0VarA = t0.m0.a(c2.n0.c(4278355143L), 0L, c2.n0.c(4282201390L), jVar4, 10);
                    float f11 = 6;
                    z.g1 g1Var2 = new z.g1(f10, f11, f10, f11);
                    boolean z10 = this.f29600d;
                    jVar2 = jVar4;
                    t0.x0.a(aVar3, null, z10, null, l0VarA, null, null, g1Var2, f1.c.b(1462910299, new s0(z10), jVar4), jVar2, 817889280, 362);
                    jVar2.B();
                }
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class p extends kotlin.jvm.internal.s implements eh.l {

        /* renamed from: a, reason: collision with root package name */
        public static final p f29602a = new p(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final class q extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u8.b f29603a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f29604b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(u8.b bVar, List list) {
            super(1);
            this.f29603a = bVar;
            this.f29604b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f29603a.invoke(this.f29604b.get(num.intValue()));
        }
    }

    public static final class r extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l f29605a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f29606b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(eh.l lVar, List list) {
            super(1);
            this.f29605a = lVar;
            this.f29606b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f29605a.invoke(this.f29606b.get(num.intValue()));
        }
    }

    public static final class s extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f29607a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d1 f29608b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k8.i f29609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(List list, k8.i iVar, d1 d1Var) {
            super(4);
            this.f29607a = list;
            this.f29608b = d1Var;
            this.f29609c = iVar;
        }

        @Override // eh.r
        public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
            int i10;
            b0.e eVar2 = eVar;
            int iIntValue = num.intValue();
            x0.j jVar2 = jVar;
            int iIntValue2 = num2.intValue();
            d1 d1Var = this.f29608b;
            k8.h hVar = d1Var.f29418b;
            if ((iIntValue2 & 6) == 0) {
                i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= jVar2.i(iIntValue) ? 32 : 16;
            }
            if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
                k8.k quest = (k8.k) this.f29607a.get(iIntValue);
                jVar2.L(1956039765);
                kotlin.jvm.internal.r.e(quest, "quest");
                long jF = hVar.f(quest);
                t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(12), t0.z0.a(c2.n0.c(4280754460L), jVar2, 6), null, null, f1.c.b(1491485539, new o(this.f29609c.f16134o.contains(quest.f16139a), d1Var, quest, hVar.g(quest), Math.min(jF, quest.f16144f)), jVar2), jVar2, 196614, 24);
                jVar2.B();
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class t implements eh.q<b0.e, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k8.i f29610a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d1 f29611b;

        public t(k8.i iVar, d1 d1Var) {
            this.f29610a = iVar;
            this.f29611b = d1Var;
        }

        @Override // eh.q
        public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
            b0.e item = eVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(item, "$this$item");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(12), t0.z0.a(c2.n0.c(4280754460L), jVar2, 6), null, null, f1.c.b(-1875173436, new x0(this.f29610a, this.f29611b), jVar2), jVar2, 196614, 24);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class u implements eh.q<b0.e, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k8.i f29612a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d1 f29613b;

        public u(k8.i iVar, d1 d1Var) {
            this.f29612a = iVar;
            this.f29613b = d1Var;
        }

        @Override // eh.q
        public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
            b0.e item = eVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(item, "$this$item");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                k8.i iVar = this.f29612a;
                t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(12), t0.z0.a(c2.n0.c(4280754460L), jVar2, 6), null, null, f1.c.b(1021809147, new a1(iVar, this.f29613b, !iVar.f16135p && iVar.f16122c >= 50), jVar2), jVar2, 196614, 24);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class v implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k8.i f29614a;

        public v(k8.i iVar) {
            this.f29614a = iVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(d.a.f1143b, 10, 4);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                v1.j(g.a.f13867f, m1VarA, jVar2);
                v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                v1.j(g.a.f13865d, dVarC, jVar2);
                ff.b("🐟 ", null, 0L, f3.u.c(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3078, 0, 131062);
                ff.b(String.valueOf(this.f29614a.f16122c), null, c2.n0.c(4281908728L), f3.u.c(13), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class w implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k8.i f29615a;

        public w(k8.i iVar) {
            this.f29615a = iVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(d.a.f1143b, 10, 4);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                v1.j(g.a.f13867f, m1VarA, jVar2);
                v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                v1.j(g.a.f13865d, dVarC, jVar2);
                ff.b("❤️ ", null, 0L, f3.u.c(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3078, 0, 131062);
                ff.b(y.m(this.f29615a.f16121b), null, c2.n0.c(4294210230L), f3.u.c(13), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class x implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d1 f29616a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k8.m f29617b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f29618c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f29619d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f29620e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f29621f;

        public x(d1 d1Var, k8.m mVar, boolean z10, boolean z11, int i10, long j10) {
            this.f29616a = d1Var;
            this.f29617b = mVar;
            this.f29618c = z10;
            this.f29619d = z11;
            this.f29620e = i10;
            this.f29621f = j10;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            e0.a aVar;
            g.a.C0128a c0128a;
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                float f10 = 10;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), f10);
                b.g gVar = z.b.f34450g;
                f.b bVar = d.a.f14612k;
                m1 m1VarA = k1.a(gVar, bVar, jVar2, 54);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar2 = g.a.f13867f;
                v1.j(bVar2, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a2);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                b.j jVar3 = z.b.f34444a;
                m1 m1VarA2 = k1.a(jVar3, bVar, jVar2, 48);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, m1VarA2, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a2);
                }
                v1.j(cVar, dVarC2, jVar2);
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar2, 42), c2.n0.c(4281872167L), h0.f.f12083a);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, l0VarD, jVar2);
                v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a2);
                }
                v1.j(cVar, dVarC3, jVar2);
                k8.m mVar = this.f29617b;
                ff.b(mVar.f16161d, null, 0L, f3.u.c(22), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3072, 0, 131062);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f10), jVar2);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar2, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    aVar = aVar3;
                    jVar2.w(aVar);
                } else {
                    aVar = aVar3;
                    jVar2.z();
                }
                v1.j(bVar2, qVarA, jVar2);
                v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    c0128a = c0128a2;
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                v1.j(cVar, dVarC4, jVar2);
                String strC = f3.q.c(mVar.f16159b, jVar2);
                e0.a aVar4 = aVar;
                long j10 = q1.b1.f21650d;
                x2.p pVar = x2.p.f32033f;
                g.a.C0128a c0128a3 = c0128a;
                ff.b(strC, null, j10, f3.u.c(14), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                ff.b(f3.q.c(mVar.f16160c, jVar2), null, c2.n0.c(4288582279L), f3.u.c(11), null, null, 0L, null, 0L, 2, false, 1, 0, null, jVar2, 3456, 3120, 120818);
                m1 m1VarA3 = k1.a(jVar3, bVar, jVar2, 48);
                int iD5 = jVar2.D();
                a2 a2VarY5 = jVar2.y();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar2, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar4);
                } else {
                    jVar2.z();
                }
                v1.j(bVar2, m1VarA3, jVar2);
                v1.j(dVar, a2VarY5, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                    l9.i.a(iD5, jVar2, iD5, c0128a3);
                }
                v1.j(cVar, dVarC5, jVar2);
                ff.b(f3.q.d(R.string.cat_farm_owned_count, new Object[]{Integer.valueOf(this.f29620e)}, jVar2), null, c2.n0.c(4294956800L), f3.u.c(11), x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 8), jVar2);
                ff.b(f3.q.d(R.string.cat_farm_pps_format, new Object[]{y.n(mVar.f16163f)}, jVar2), null, c2.n0.c(4283096704L), f3.u.c(11), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3456, 0, 131058);
                x0.j jVar4 = jVar2;
                jVar4.H();
                jVar4.L(-2064530389);
                if (this.f29619d) {
                    ff.b(f3.q.d(R.string.cat_farm_level_required, new Object[]{Integer.valueOf(mVar.f16165h)}, jVar4), null, c2.n0.c(4293870660L), f3.u.c(10), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar4, 200064, 0, 131026);
                    jVar4 = jVar4;
                }
                jVar4.B();
                jVar4.H();
                jVar4.H();
                jVar4.L(180618493);
                d1 d1Var = this.f29616a;
                boolean zL = jVar4.l(d1Var) | jVar4.K(mVar);
                Object objG = jVar4.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new b1(d1Var, mVar);
                    jVar4.C(objG);
                }
                jVar4.B();
                z.g1 g1Var = t0.m0.f26400a;
                t0.l0 l0VarA = t0.m0.a(c2.n0.c(4293571336L), 0L, c2.n0.c(4282201390L), jVar4, 10);
                float f11 = 12;
                float f12 = 6;
                z.g1 g1Var2 = new z.g1(f11, f12, f11, f12);
                long j11 = this.f29621f;
                boolean z10 = this.f29618c;
                x0.j jVar5 = jVar4;
                t0.x0.a((eh.a) objG, null, z10, null, l0VarA, null, null, g1Var2, f1.c.b(-1789248651, new c1(j11, z10), jVar4), jVar5, 817889280, 362);
                jVar5.H();
            }
            return pg.f0.f21461a;
        }
    }

    /* renamed from: u8.y$y, reason: collision with other inner class name */
    public static final class C0301y extends kotlin.jvm.internal.s implements eh.l {

        /* renamed from: a, reason: collision with root package name */
        public static final C0301y f29622a = new C0301y(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final class z extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u8.f f29623a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f29624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(u8.f fVar, List list) {
            super(1);
            this.f29623a = fVar;
            this.f29624b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f29623a.invoke(this.f29624b.get(num.intValue()));
        }
    }

    public static final void a(final k8.i iVar, final d1 d1Var, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-109486355);
        int i11 = (kVarP.l(iVar) ? 4 : 2) | i10 | (kVarP.l(d1Var) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            b.i iVarH = z.b.h(8);
            z.g1 g1VarD = androidx.compose.foundation.layout.f.d(CropImageView.DEFAULT_ASPECT_RATIO, 12, 7);
            kVarP.L(-1695275034);
            boolean zL = ((i11 & 112) == 32 || kVarP.l(d1Var)) | kVarP.l(iVar);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new j3(1, iVar, d1Var);
                kVarP.C(objG);
            }
            kVarP.T(false);
            b0.d.a(fillElement, null, g1VarD, iVarH, null, null, false, null, (eh.l) objG, kVarP, 24966, 490);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(d1Var, i10) { // from class: u8.r

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d1 f29515b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(65);
                    y.a(this.f29514a, this.f29515b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0a4b A[EDGE_INSN: B:262:0x0a4b->B:211:0x0a4b BREAK  A[LOOP:0: B:204:0x0a18->B:210:0x0a41], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b0  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(eh.a onNavigateBack, d1 d1Var, x0.j jVar, final int i10) {
        int i11;
        d1 d1Var2;
        boolean z10;
        s.b bVar;
        Object obj;
        l1 l1Var;
        s.b bVar2;
        tg.e eVar;
        float f10;
        x0.k kVar;
        n1 n1Var;
        final eh.a aVar;
        d.a aVar2;
        d1 d1Var3;
        int i12;
        int i13;
        n1 n1Var2;
        float f11;
        boolean z11;
        ?? r72;
        int i14;
        x0.k kVar2;
        j1.f fVar;
        Object obj2;
        h1.u uVar;
        boolean zL;
        Object objG;
        boolean zL2;
        Object objG2;
        n1 n1Var3;
        int i15;
        final n1 n1Var4;
        Iterator it;
        h1.c0 c0Var;
        int iC;
        g.a.C0128a c0128aB;
        Object objG3;
        final l1 l1Var2;
        Object objG4;
        Object objG5;
        Object objG6;
        Object objG7;
        final d1 d1Var4;
        float f12;
        float f13;
        kotlin.jvm.internal.r.e(onNavigateBack, "onNavigateBack");
        x0.k kVarP = jVar.p(89027507);
        int i16 = (kVarP.l(onNavigateBack) ? 4 : 2) | i10 | 16;
        if ((i16 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            d1Var4 = d1Var;
            aVar = onNavigateBack;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(d1.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                d1 d1Var5 = (d1) w0VarB;
                i11 = i16 & (-113);
                d1Var2 = d1Var5;
            } else {
                kVarP.v();
                i11 = i16 & (-113);
                d1Var2 = d1Var;
            }
            kVarP.U();
            kVarP.L(-1969759245);
            boolean z12 = (i11 & 14) == 4;
            Object objG8 = kVarP.g();
            Object obj3 = j.a.f31715a;
            if (z12 || objG8 == obj3) {
                objG8 = new u8.s(onNavigateBack, 0);
                kVarP.C(objG8);
            }
            kVarP.T(false);
            c.e.a(0, 1, (eh.a) objG8, kVarP, false);
            Activity activity = (Activity) kVarP.f(c.h.f4305a);
            n1 n1VarB = bg.b.b(d1Var2.f29419c, kVarP);
            n1 n1VarB2 = bg.b.b(d1Var2.f29420d, kVarP);
            n1 n1VarB3 = bg.b.b(d1Var2.f29421e, kVarP);
            n1 n1VarB4 = bg.b.b(d1Var2.f29422f, kVarP);
            n1 n1VarB5 = bg.b.b(d1Var2.f29423g, kVarP);
            n1 n1VarB6 = bg.b.b(d1Var2.f29424h, kVarP);
            n1 n1VarB7 = bg.b.b(d1Var2.f29425i, kVarP);
            n1 n1VarB8 = bg.b.b(d1Var2.f29426j, kVarP);
            n1 n1VarB9 = bg.b.b(d1Var2.f29427k, kVarP);
            kVarP.L(-1969735391);
            Object objG9 = kVarP.g();
            if (objG9 == obj3) {
                objG9 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG9);
            }
            n1 n1Var5 = (n1) objG9;
            Object objA = p0.h.a(kVarP, false, -1969733600);
            if (objA == obj3) {
                objA = new x0.v1(0);
                kVarP.C(objA);
            }
            l1 l1Var3 = (l1) objA;
            Object objA2 = p0.h.a(kVarP, false, -1969731481);
            if (objA2 == obj3) {
                objA2 = bg.b.h(null);
                kVarP.C(objA2);
            }
            n1 n1Var6 = (n1) objA2;
            Object objA3 = p0.h.a(kVarP, false, -1969726883);
            if (objA3 == obj3) {
                objA3 = s.d.a(0.08f);
                kVarP.C(objA3);
            }
            s.b bVar3 = (s.b) objA3;
            Object objA4 = p0.h.a(kVarP, false, -1969725158);
            if (objA4 == obj3) {
                objA4 = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objA4);
            }
            s.b bVar4 = (s.b) objA4;
            Object objA5 = p0.h.a(kVarP, false, -1969723462);
            if (objA5 == obj3) {
                objA5 = s.d.a(1.0f);
                kVarP.C(objA5);
            }
            s.b bVar5 = (s.b) objA5;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-1969721293);
            boolean zL3 = kVarP.l(bVar4) | kVarP.l(bVar3) | kVarP.l(bVar5);
            Object objG10 = kVarP.g();
            if (zL3 || objG10 == obj3) {
                objG10 = new u8.z(bVar3, bVar5, bVar4, null);
                kVarP.C(objG10);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG10, f0Var, kVarP);
            double dC = d1Var2.f29418b.c((k8.i) d1Var2.f29419c.f25021a.getValue());
            long jD = d1Var2.f29418b.d((k8.i) d1Var2.f29419c.f25021a.getValue());
            kVarP.L(-1969703507);
            Object objG11 = kVarP.g();
            if (objG11 == obj3) {
                objG11 = new h1.u();
                kVarP.C(objG11);
            }
            h1.u uVar2 = (h1.u) objG11;
            kVarP.B();
            List<k8.k> listA = k8.e.a();
            if (listA == null || !listA.isEmpty()) {
                for (k8.k quest : listA) {
                    kotlin.jvm.internal.r.e(quest, "quest");
                    if (d1Var2.f29418b.g(quest)) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                kVarP.L(-1969696989);
                if (((Long) n1VarB9.getValue()) == null) {
                    Long l10 = (Long) n1VarB9.getValue();
                    kotlin.jvm.internal.r.b(l10);
                    if (l10.longValue() > 0) {
                        kVarP.L(-1969694749);
                        boolean zL4 = kVarP.l(d1Var2);
                        Object objG12 = kVarP.g();
                        if (zL4 || objG12 == obj3) {
                            objG12 = new e6(d1Var2, 1);
                            kVarP.C(objG12);
                        }
                        kVarP.B();
                        f1.b bVarB = f1.c.b(-940967360, new u8.a0(d1Var2), kVarP);
                        f1.b bVar6 = e1.f29437b;
                        bVar = bVar4;
                        f1.b bVarB2 = f1.c.b(-493486011, new u8.b0(n1VarB9, 0), kVarP);
                        f10 = 0.0f;
                        l1Var = l1Var3;
                        obj = obj3;
                        eVar = null;
                        bVar2 = bVar3;
                        n1Var = n1Var6;
                        t0.r.a((eh.a) objG12, bVarB, null, null, null, bVar6, bVarB2, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, 1769520, 0, 16284);
                        kVar = kVarP;
                    } else {
                        bVar = bVar4;
                        obj = obj3;
                        l1Var = l1Var3;
                        bVar2 = bVar3;
                        eVar = null;
                        f10 = CropImageView.DEFAULT_ASPECT_RATIO;
                        kVar = kVarP;
                        n1Var = n1Var6;
                    }
                    kVar.B();
                    kVar.L(-1969657822);
                    if (((Long) n1Var.getValue()) != null) {
                        Long l11 = (Long) n1Var.getValue();
                        kVar.L(-1969655317);
                        Object objG13 = kVar.g();
                        if (objG13 == obj) {
                            objG13 = new c0(n1Var, eVar);
                            kVar.C(objG13);
                        }
                        kVar.B();
                        x0.o0.d((eh.p) objG13, l11, kVar);
                    }
                    kVar.B();
                    d.a aVar3 = d.a.f1143b;
                    l1 l1Var4 = l1Var;
                    androidx.compose.ui.d dVarG = d0.h.g(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.g.c(aVar3), new q1(qg.p.j(q1.b1.a(c2.n0.c(4279767824L)), q1.b1.a(c2.n0.c(4280162066L)), q1.b1.a(c2.n0.c(4279438858L))), null, (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32), (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax))));
                    j1.f fVar2 = d.a.f14602a;
                    g2.l0 l0VarD = z.g.d(fVar2, false);
                    int iC2 = u1.c(kVar);
                    a2 a2VarY = kVar.y();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, kVar);
                    i2.g.f13861o.getClass();
                    e0.a aVarA = g.a.a();
                    kVar.r();
                    if (kVar.m()) {
                        kVar.w(aVarA);
                    } else {
                        kVar.z();
                    }
                    v1.j(g.a.c(), l0VarD, kVar);
                    v1.j(g.a.e(), a2VarY, kVar);
                    g.a.C0128a c0128aB2 = g.a.b();
                    if (kVar.m() || !kotlin.jvm.internal.r.a(kVar.g(), Integer.valueOf(iC2))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(iC2, kVar, iC2, c0128aB2);
                    }
                    v1.j(g.a.d(), dVarC, kVar);
                    androidx.compose.ui.d dVarC2 = androidx.compose.foundation.layout.g.c(aVar3);
                    z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVar, 0);
                    int iC3 = u1.c(kVar);
                    a2 a2VarY2 = kVar.y();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarC2, kVar);
                    e0.a aVarA2 = g.a.a();
                    kVar.r();
                    if (kVar.m()) {
                        kVar.w(aVarA2);
                    } else {
                        kVar.z();
                    }
                    v1.j(g.a.c(), qVarA, kVar);
                    v1.j(g.a.e(), a2VarY2, kVar);
                    g.a.C0128a c0128aB3 = g.a.b();
                    if (kVar.m() || !kotlin.jvm.internal.r.a(kVar.g(), Integer.valueOf(iC3))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(iC3, kVar, iC3, c0128aB3);
                    }
                    v1.j(g.a.d(), dVarC3, kVar);
                    k8.i iVar = (k8.i) n1VarB.getValue();
                    long j10 = ((k8.i) d1Var2.f29418b.f16096c.getValue()).f16127h;
                    n1 n1Var7 = n1Var;
                    Object obj4 = obj;
                    x0.k kVar3 = kVar;
                    d1 d1Var6 = d1Var2;
                    j(iVar, dC, jD, 100 * j10 * j10, onNavigateBack, kVar3, 57344 & (i11 << 12));
                    aVar = onNavigateBack;
                    kVar3.L(-1735252751);
                    int iIntValue = ((Number) n1VarB2.getValue()).intValue();
                    j1.f fVar3 = d.a.f14606e;
                    if (iIntValue > 0) {
                        f11 = f10;
                        r72 = 1;
                        androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), c2.n0.c(4293548044L), y1.f21750a), f11, 4, 1);
                        z11 = false;
                        g2.l0 l0VarD2 = z.g.d(fVar3, false);
                        int iC4 = u1.c(kVar3);
                        i14 = 13;
                        a2 a2VarY3 = kVar3.y();
                        androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarJ, kVar3);
                        e0.a aVarA3 = g.a.a();
                        kVar3.r();
                        if (kVar3.m()) {
                            kVar3.w(aVarA3);
                        } else {
                            kVar3.z();
                        }
                        v1.j(g.a.c(), l0VarD2, kVar3);
                        v1.j(g.a.e(), a2VarY3, kVar3);
                        g.a.C0128a c0128aB4 = g.a.b();
                        if (kVar3.m() || !kotlin.jvm.internal.r.a(kVar3.g(), Integer.valueOf(iC4))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(iC4, kVar3, iC4, c0128aB4);
                        }
                        v1.j(g.a.d(), dVarC4, kVar3);
                        n1Var2 = n1Var5;
                        aVar2 = aVar3;
                        i13 = 12;
                        d1Var3 = d1Var6;
                        fVar = fVar2;
                        i12 = 4;
                        ff.b(f3.q.d(R.string.cat_farm_frenzy_banner, new Object[]{Integer.valueOf(((Number) n1VarB2.getValue()).intValue())}, kVar3), null, b1.a.b(), f3.u.c(13), x2.p.f32034g, null, 0L, null, 0L, 0, false, 0, 0, null, kVar3, 200064, 0, 131026);
                        kVar2 = kVar3;
                        kVar2.H();
                    } else {
                        aVar2 = aVar3;
                        d1Var3 = d1Var6;
                        i12 = 4;
                        i13 = 12;
                        n1Var2 = n1Var5;
                        f11 = f10;
                        z11 = false;
                        r72 = 1;
                        i14 = 13;
                        kVar2 = kVar3;
                        fVar = fVar2;
                    }
                    kVar2.B();
                    kVar2.L(-1735232205);
                    if (((Number) n1VarB3.getValue()).intValue() > 0) {
                        androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), c2.n0.c(4286331629L), y1.f21750a), f11, i12, r72);
                        g2.l0 l0VarD3 = z.g.d(fVar3, z11);
                        int iC5 = u1.c(kVar2);
                        a2 a2VarY4 = kVar2.y();
                        androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarJ2, kVar2);
                        e0.a aVarA4 = g.a.a();
                        kVar2.r();
                        if (kVar2.m()) {
                            kVar2.w(aVarA4);
                        } else {
                            kVar2.z();
                        }
                        v1.j(g.a.c(), l0VarD3, kVar2);
                        v1.j(g.a.e(), a2VarY4, kVar2);
                        g.a.C0128a c0128aB5 = g.a.b();
                        if (kVar2.m() || !kotlin.jvm.internal.r.a(kVar2.g(), Integer.valueOf(iC5))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(iC5, kVar2, iC5, c0128aB5);
                        }
                        v1.j(g.a.d(), dVarC5, kVar2);
                        String strD = f3.q.d(R.string.cat_farm_tap_boost_banner, new Object[]{Integer.valueOf(((Number) n1VarB3.getValue()).intValue())}, kVar2);
                        long jB = b1.a.b();
                        x2.p pVar = x2.p.f32029b;
                        x0.k kVar4 = kVar2;
                        ff.b(strD, null, jB, f3.u.c(i14), p.a.a(), null, 0L, null, 0L, 0, false, 0, 0, null, kVar4, 200064, 0, 131026);
                        kVar2 = kVar4;
                        kVar2.H();
                    }
                    kVar2.B();
                    kVar2.L(-1735211597);
                    if (((Number) n1VarB4.getValue()).intValue() > 0) {
                        androidx.compose.ui.d dVarJ3 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), c2.n0.c(4279150057L), y1.f21750a), f11, i12, r72);
                        g2.l0 l0VarD4 = z.g.d(fVar3, false);
                        int iC6 = u1.c(kVar2);
                        a2 a2VarY5 = kVar2.y();
                        androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarJ3, kVar2);
                        e0.a aVarA5 = g.a.a();
                        kVar2.r();
                        if (kVar2.m()) {
                            kVar2.w(aVarA5);
                        } else {
                            kVar2.z();
                        }
                        v1.j(g.a.c(), l0VarD4, kVar2);
                        v1.j(g.a.e(), a2VarY5, kVar2);
                        g.a.C0128a c0128aB6 = g.a.b();
                        if (kVar2.m() || !kotlin.jvm.internal.r.a(kVar2.g(), Integer.valueOf(iC6))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(iC6, kVar2, iC6, c0128aB6);
                        }
                        v1.j(g.a.d(), dVarC6, kVar2);
                        String strD2 = f3.q.d(R.string.cat_farm_pps_boost_banner, new Object[]{Integer.valueOf(((Number) n1VarB4.getValue()).intValue())}, kVar2);
                        long jB2 = b1.a.b();
                        x2.p pVar2 = x2.p.f32029b;
                        x0.k kVar5 = kVar2;
                        ff.b(strD2, null, jB2, f3.u.c(i14), p.a.a(), null, 0L, null, 0L, 0, false, 0, 0, null, kVar5, 200064, 0, 131026);
                        kVar2 = kVar5;
                        kVar2.H();
                    }
                    kVar2.B();
                    kVar2.L(-1735190806);
                    if (((Number) n1VarB5.getValue()).intValue() > r72 && ((Number) n1VarB6.getValue()).intValue() > 0) {
                        androidx.compose.ui.d dVarJ4 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), c2.n0.c(4279657780L), y1.f21750a), f11, 3, r72);
                        g2.l0 l0VarD5 = z.g.d(fVar3, false);
                        int iC7 = u1.c(kVar2);
                        a2 a2VarY6 = kVar2.y();
                        androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarJ4, kVar2);
                        e0.a aVarA6 = g.a.a();
                        kVar2.r();
                        if (kVar2.m()) {
                            kVar2.w(aVarA6);
                        } else {
                            kVar2.z();
                        }
                        v1.j(g.a.c(), l0VarD5, kVar2);
                        v1.j(g.a.e(), a2VarY6, kVar2);
                        g.a.C0128a c0128aB7 = g.a.b();
                        if (kVar2.m() || !kotlin.jvm.internal.r.a(kVar2.g(), Integer.valueOf(iC7))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(iC7, kVar2, iC7, c0128aB7);
                        }
                        v1.j(g.a.d(), dVarC7, kVar2);
                        String strD3 = f3.q.d(R.string.cat_farm_combo_banner, new Object[]{String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf((((Number) n1VarB5.getValue()).intValue() * 0.02d) + ((double) r72))}, (int) r72)), Integer.valueOf(((Number) n1VarB6.getValue()).intValue())}, kVar2);
                        long jC = c2.n0.c(4290508752L);
                        x2.p pVar3 = x2.p.f32029b;
                        x0.k kVar6 = kVar2;
                        ff.b(strD3, null, jC, f3.u.c(i13), p.a.a(), null, 0L, null, 0L, 0, false, 0, 0, null, kVar6, 200064, 0, 131026);
                        kVar2 = kVar6;
                        kVar2.H();
                    }
                    kVar2.B();
                    kVar2.L(-1735164504);
                    if (((Long) n1Var7.getValue()) != null) {
                        androidx.compose.ui.d dVarJ5 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), c2.n0.c(4294956800L), y1.f21750a), f11, i12, r72);
                        g2.l0 l0VarD6 = z.g.d(fVar3, false);
                        int iC8 = u1.c(kVar2);
                        a2 a2VarY7 = kVar2.y();
                        androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(dVarJ5, kVar2);
                        e0.a aVarA7 = g.a.a();
                        kVar2.r();
                        if (kVar2.m()) {
                            kVar2.w(aVarA7);
                        } else {
                            kVar2.z();
                        }
                        v1.j(g.a.c(), l0VarD6, kVar2);
                        v1.j(g.a.e(), a2VarY7, kVar2);
                        g.a.C0128a c0128aB8 = g.a.b();
                        if (kVar2.m() || !kotlin.jvm.internal.r.a(kVar2.g(), Integer.valueOf(iC8))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(iC8, kVar2, iC8, c0128aB8);
                        }
                        v1.j(g.a.d(), dVarC8, kVar2);
                        Long l12 = (Long) n1Var7.getValue();
                        kotlin.jvm.internal.r.b(l12);
                        String strD4 = f3.q.d(R.string.cat_farm_golden_paw_reward, new Object[]{m(l12.longValue())}, kVar2);
                        long j11 = q1.b1.f21648b;
                        x2.p pVar4 = x2.p.f32029b;
                        x0.k kVar7 = kVar2;
                        ff.b(strD4, null, j11, f3.u.c(i14), p.a.a(), null, 0L, null, 0L, 0, false, 0, 0, null, kVar7, 200064, 0, 131026);
                        kVar2 = kVar7;
                        kVar2.H();
                    }
                    kVar2.B();
                    androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                    if (1.0f <= 0.0d) {
                        a0.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.ui.d dVarH = dVarD.h(new LayoutWeightElement(1.0f, r72));
                    g2.l0 l0VarD7 = z.g.d(fVar, false);
                    int iC9 = u1.c(kVar2);
                    a2 a2VarY8 = kVar2.y();
                    androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(dVarH, kVar2);
                    e0.a aVarA8 = g.a.a();
                    kVar2.r();
                    if (kVar2.m()) {
                        kVar2.w(aVarA8);
                    } else {
                        kVar2.z();
                    }
                    v1.j(g.a.c(), l0VarD7, kVar2);
                    v1.j(g.a.e(), a2VarY8, kVar2);
                    g.a.C0128a c0128aB9 = g.a.b();
                    if (kVar2.m() || !kotlin.jvm.internal.r.a(kVar2.g(), Integer.valueOf(iC9))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(iC9, kVar2, iC9, c0128aB9);
                    }
                    v1.j(g.a.d(), dVarC9, kVar2);
                    k8.i iVar2 = (k8.i) n1VarB.getValue();
                    int iIntValue2 = ((Number) n1VarB5.getValue()).intValue();
                    boolean zBooleanValue = ((Boolean) n1VarB7.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) n1VarB8.getValue()).booleanValue();
                    kVar2.L(1294040285);
                    boolean zL5 = kVar2.l(d1Var3);
                    Object objG14 = kVar2.g();
                    if (zL5) {
                        obj2 = obj4;
                    } else {
                        obj2 = obj4;
                        if (objG14 != obj2) {
                            uVar = uVar2;
                        }
                        eh.p pVar5 = (eh.p) objG14;
                        kVar2.B();
                        kVar2.L(1294055430);
                        zL = kVar2.l(d1Var3);
                        objG = kVar2.g();
                        if (!zL || objG == obj2) {
                            objG = new c9.a1(d1Var3, 1);
                            kVar2.C(objG);
                        }
                        eh.a aVar4 = (eh.a) objG;
                        kVar2.B();
                        kVar2.L(1294059116);
                        zL2 = kVar2.l(d1Var3);
                        d.a aVar5 = aVar2;
                        objG2 = kVar2.g();
                        if (!zL2 || objG2 == obj2) {
                            n1Var3 = n1Var2;
                            i15 = 2;
                            objG2 = new b9.h2(i15, d1Var3, n1Var7);
                            kVar2.C(objG2);
                        } else {
                            n1Var3 = n1Var2;
                            i15 = 2;
                        }
                        kVar2.B();
                        d1 d1Var7 = d1Var3;
                        x0.k kVar8 = kVar2;
                        n1Var4 = n1Var3;
                        f(iVar2, iIntValue2, zBooleanValue, zBooleanValue2, pVar5, aVar4, (eh.a) objG2, kVar8, 0);
                        kVarP = kVar8;
                        kVarP.L(1294065362);
                        it = uVar.iterator();
                        while (true) {
                            c0Var = (h1.c0) it;
                            if (c0Var.hasNext()) {
                                break;
                            }
                            g1 g1Var = (g1) c0Var.next();
                            kVarP.L(1717741500);
                            boolean zK = kVarP.K(g1Var);
                            Object objG15 = kVarP.g();
                            if (zK || objG15 == obj2) {
                                objG15 = new t8.h2(1, uVar, g1Var);
                                kVarP.C(objG15);
                            }
                            kVarP.B();
                            g(g1Var, (eh.a) objG15, kVarP, 0);
                        }
                        kVarP.B();
                        androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(d0.h.f(androidx.compose.foundation.layout.b.f961a.b(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), d.a.f14609h)), 12, 8);
                        m1 m1VarA = k1.a(z.b.f34449f, d.a.f14612k, kVarP, 54);
                        iC = u1.c(kVarP);
                        a2 a2VarY9 = kVarP.y();
                        androidx.compose.ui.d dVarC10 = androidx.compose.ui.c.c(dVarI, kVarP);
                        i2.g.f13861o.getClass();
                        e0.a aVarA9 = g.a.a();
                        kVarP.r();
                        if (kVarP.m()) {
                            kVarP.z();
                        } else {
                            kVarP.w(aVarA9);
                        }
                        v1.j(g.a.c(), m1VarA, kVarP);
                        v1.j(g.a.e(), a2VarY9, kVarP);
                        c0128aB = g.a.b();
                        if (!kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(iC, kVarP, iC, c0128aB);
                        }
                        v1.j(g.a.d(), dVarC10, kVarP);
                        String strC = f3.q.c(R.string.cat_farm_menu_cats, kVarP);
                        kVarP.L(1717763725);
                        objG3 = kVarP.g();
                        if (objG3 != obj2) {
                            l1Var2 = l1Var4;
                            objG3 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.g(3, l1Var2, n1Var4);
                            kVarP.C(objG3);
                        } else {
                            l1Var2 = l1Var4;
                        }
                        kVarP.B();
                        e("🐱", strC, false, (eh.a) objG3, kVarP, 3078, 4);
                        String strC2 = f3.q.c(R.string.cat_farm_menu_workers, kVarP);
                        kVarP.L(1717774253);
                        objG4 = kVarP.g();
                        if (objG4 == obj2) {
                            objG4 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.h(3, l1Var2, n1Var4);
                            kVarP.C(objG4);
                        }
                        kVarP.B();
                        e("🧑\u200d🌾", strC2, false, (eh.a) objG4, kVarP, 3078, 4);
                        String strC3 = f3.q.c(R.string.cat_farm_menu_buildings, kVarP);
                        kVarP.L(1717784749);
                        objG5 = kVarP.g();
                        if (objG5 == obj2) {
                            objG5 = new q2(2, l1Var2, n1Var4);
                            kVarP.C(objG5);
                        }
                        kVarP.B();
                        e("🏠", strC3, false, (eh.a) objG5, kVarP, 3078, 4);
                        String strC4 = f3.q.c(R.string.cat_farm_menu_quests, kVarP);
                        kVarP.L(1717796909);
                        objG6 = kVarP.g();
                        if (objG6 == obj2) {
                            objG6 = new h1(3, l1Var2, n1Var4);
                            kVarP.C(objG6);
                        }
                        kVarP.B();
                        e("📜", strC4, z10, (eh.a) objG6, kVarP, 3078, 0);
                        String strC5 = f3.q.c(R.string.cat_farm_menu_shop, kVarP);
                        kVarP.L(1717807245);
                        objG7 = kVarP.g();
                        if (objG7 == obj2) {
                            objG7 = new eh.a() { // from class: u8.t
                                @Override // eh.a
                                public final Object invoke() {
                                    l1Var2.f(4);
                                    y.c(n1Var4, true);
                                    return pg.f0.f21461a;
                                }
                            };
                            kVarP.C(objG7);
                        }
                        kVarP.B();
                        e("💎", strC5, false, (eh.a) objG7, kVarP, 3078, 4);
                        kVarP.H();
                        kVarP.H();
                        kVarP.H();
                        kVarP.L(480612999);
                        if (((Boolean) n1Var4.getValue()).booleanValue()) {
                            d1Var4 = d1Var7;
                            f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                            f13 = 1.0f;
                        } else {
                            long jC2 = c2.n0.c(4280162581L);
                            float f14 = 24;
                            f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                            h0.e eVarC = h0.f.c(f14, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                            kVarP.L(480611955);
                            Object objG16 = kVarP.g();
                            if (objG16 == obj2) {
                                objG16 = new eh.a() { // from class: u8.u
                                    @Override // eh.a
                                    public final Object invoke() {
                                        y.c(n1Var4, false);
                                        return pg.f0.f21461a;
                                    }
                                };
                                kVarP.C(objG16);
                            }
                            kVarP.B();
                            f13 = 1.0f;
                            d1Var4 = d1Var7;
                            p7.a((eh.a) objG16, null, null, CropImageView.DEFAULT_ASPECT_RATIO, eVarC, jC2, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, f1.c.b(-1680803083, new h0(l1Var2, n1Var4, d1Var7, activity, n1VarB), kVarP), kVarP, 805502982, 3534);
                        }
                        kVarP.B();
                        kVarP.L(480730744);
                        if (((Number) bVar5.d()).floatValue() > 0.01f) {
                            androidx.compose.ui.d dVarC11 = j1.l.c(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.g.c(aVar5), u0.a.c(qg.p.j(q1.b1.a(q1.b1.c(jh.j.l(((Number) bVar5.d()).floatValue(), f12, f13), c2.n0.c(4281211909L))), q1.b1.a(q1.b1.c(jh.j.l(((Number) bVar5.d()).floatValue(), f12, f13), c2.n0.c(4279832322L))), q1.b1.a(q1.b1.c(jh.j.l(((Number) bVar5.d()).floatValue(), f12, f13), c2.n0.c(4278978305L)))), 0L, f12, 14)), 9999.0f);
                            g2.l0 l0VarD8 = z.g.d(fVar3, false);
                            int iC10 = u1.c(kVarP);
                            a2 a2VarY10 = kVarP.y();
                            androidx.compose.ui.d dVarC12 = androidx.compose.ui.c.c(dVarC11, kVarP);
                            e0.a aVarA10 = g.a.a();
                            kVarP.r();
                            if (kVarP.m()) {
                                kVarP.w(aVarA10);
                            } else {
                                kVarP.z();
                            }
                            v1.j(g.a.c(), l0VarD8, kVarP);
                            v1.j(g.a.e(), a2VarY10, kVarP);
                            g.a.C0128a c0128aB10 = g.a.b();
                            if (kVarP.m() || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iC10))) {
                                org.bouncycastle.jcajce.provider.digest.e.a(iC10, kVarP, iC10, c0128aB10);
                            }
                            v1.j(g.a.d(), dVarC12, kVarP);
                            w1.d dVarA = va.a();
                            long jC3 = q1.b1.c(jh.j.l(((Number) bVar5.d()).floatValue(), f12, f13), c2.n0.c(4294956800L));
                            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar5, 100);
                            float fFloatValue = ((Number) bVar2.d()).floatValue();
                            t4.b(dVarA, null, e3.k.b(d2.c(dVarN, fFloatValue, fFloatValue), ((Number) bVar.d()).floatValue()), jC3, kVarP, 48, 0);
                            kVarP = kVarP;
                            kVarP.H();
                        }
                        kVarP.B();
                        kVarP.H();
                    }
                    uVar = uVar2;
                    objG14 = new s2(d1Var3, uVar);
                    kVar2.C(objG14);
                    eh.p pVar52 = (eh.p) objG14;
                    kVar2.B();
                    kVar2.L(1294055430);
                    zL = kVar2.l(d1Var3);
                    objG = kVar2.g();
                    if (!zL) {
                        objG = new c9.a1(d1Var3, 1);
                        kVar2.C(objG);
                        eh.a aVar42 = (eh.a) objG;
                        kVar2.B();
                        kVar2.L(1294059116);
                        zL2 = kVar2.l(d1Var3);
                        d.a aVar52 = aVar2;
                        objG2 = kVar2.g();
                        if (zL2) {
                            n1Var3 = n1Var2;
                            i15 = 2;
                            objG2 = new b9.h2(i15, d1Var3, n1Var7);
                            kVar2.C(objG2);
                            kVar2.B();
                            d1 d1Var72 = d1Var3;
                            x0.k kVar82 = kVar2;
                            n1Var4 = n1Var3;
                            f(iVar2, iIntValue2, zBooleanValue, zBooleanValue2, pVar52, aVar42, (eh.a) objG2, kVar82, 0);
                            kVarP = kVar82;
                            kVarP.L(1294065362);
                            it = uVar.iterator();
                            while (true) {
                                c0Var = (h1.c0) it;
                                if (c0Var.hasNext()) {
                                }
                                kVarP.B();
                                g(g1Var, (eh.a) objG15, kVarP, 0);
                            }
                            kVarP.B();
                            androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.f.i(d0.h.f(androidx.compose.foundation.layout.b.f961a.b(androidx.compose.foundation.layout.g.d(aVar52, 1.0f), d.a.f14609h)), 12, 8);
                            m1 m1VarA2 = k1.a(z.b.f34449f, d.a.f14612k, kVarP, 54);
                            iC = u1.c(kVarP);
                            a2 a2VarY92 = kVarP.y();
                            androidx.compose.ui.d dVarC102 = androidx.compose.ui.c.c(dVarI2, kVarP);
                            i2.g.f13861o.getClass();
                            e0.a aVarA92 = g.a.a();
                            kVarP.r();
                            if (kVarP.m()) {
                            }
                            v1.j(g.a.c(), m1VarA2, kVarP);
                            v1.j(g.a.e(), a2VarY92, kVarP);
                            c0128aB = g.a.b();
                            if (!kVarP.m()) {
                                org.bouncycastle.jcajce.provider.digest.e.a(iC, kVarP, iC, c0128aB);
                                v1.j(g.a.d(), dVarC102, kVarP);
                                String strC6 = f3.q.c(R.string.cat_farm_menu_cats, kVarP);
                                kVarP.L(1717763725);
                                objG3 = kVarP.g();
                                if (objG3 != obj2) {
                                }
                                kVarP.B();
                                e("🐱", strC6, false, (eh.a) objG3, kVarP, 3078, 4);
                                String strC22 = f3.q.c(R.string.cat_farm_menu_workers, kVarP);
                                kVarP.L(1717774253);
                                objG4 = kVarP.g();
                                if (objG4 == obj2) {
                                }
                                kVarP.B();
                                e("🧑\u200d🌾", strC22, false, (eh.a) objG4, kVarP, 3078, 4);
                                String strC32 = f3.q.c(R.string.cat_farm_menu_buildings, kVarP);
                                kVarP.L(1717784749);
                                objG5 = kVarP.g();
                                if (objG5 == obj2) {
                                }
                                kVarP.B();
                                e("🏠", strC32, false, (eh.a) objG5, kVarP, 3078, 4);
                                String strC42 = f3.q.c(R.string.cat_farm_menu_quests, kVarP);
                                kVarP.L(1717796909);
                                objG6 = kVarP.g();
                                if (objG6 == obj2) {
                                }
                                kVarP.B();
                                e("📜", strC42, z10, (eh.a) objG6, kVarP, 3078, 0);
                                String strC52 = f3.q.c(R.string.cat_farm_menu_shop, kVarP);
                                kVarP.L(1717807245);
                                objG7 = kVarP.g();
                                if (objG7 == obj2) {
                                }
                                kVarP.B();
                                e("💎", strC52, false, (eh.a) objG7, kVarP, 3078, 4);
                                kVarP.H();
                                kVarP.H();
                                kVarP.H();
                                kVarP.L(480612999);
                                if (((Boolean) n1Var4.getValue()).booleanValue()) {
                                }
                                kVarP.B();
                                kVarP.L(480730744);
                                if (((Number) bVar5.d()).floatValue() > 0.01f) {
                                }
                                kVarP.B();
                                kVarP.H();
                            }
                        }
                    }
                }
            } else {
                z10 = false;
                kVarP.L(-1969696989);
                if (((Long) n1VarB9.getValue()) == null) {
                }
            }
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f(new eh.p(d1Var4, i10) { // from class: u8.v

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d1 f29529b;

                @Override // eh.p
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iN = f3.i.n(1);
                    y.b(this.f29528a, this.f29529b, (x0.j) obj5, iN);
                    return pg.f0.f21461a;
                }
            });
        }
    }

    public static final void c(n1<Boolean> n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    public static final void d(final k8.i iVar, final d1 d1Var, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(929385639);
        int i11 = (kVarP.l(iVar) ? 4 : 2) | i10 | (kVarP.l(d1Var) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            b.i iVarH = z.b.h(8);
            z.g1 g1VarD = androidx.compose.foundation.layout.f.d(CropImageView.DEFAULT_ASPECT_RATIO, 12, 7);
            kVarP.L(1799472950);
            boolean zL = ((i11 & 112) == 32 || kVarP.l(d1Var)) | kVarP.l(iVar);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: u8.i
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        b0.j0 LazyColumn = (b0.j0) obj;
                        kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                        List<k8.d> list = k8.e.f16082a;
                        LazyColumn.d(list.size(), new y.h(new i3(1), list), new y.i(y.g.f29568a, list), new f1.b(-632812321, true, new y.j(list, iVar, d1Var)));
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            b0.d.a(fillElement, null, g1VarD, iVarH, null, null, false, null, (eh.l) objG, kVarP, 24966, 490);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(d1Var, i10) { // from class: u8.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d1 f29478b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(65);
                    y.d(this.f29477a, this.f29478b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(final String str, final String str2, boolean z10, final eh.a<pg.f0> aVar, x0.j jVar, final int i10, final int i11) {
        boolean z11;
        int i12;
        x0.k kVar;
        final boolean z12;
        x0.k kVarP = jVar.p(987987074);
        int i13 = i10 | (kVarP.K(str2) ? 32 : 16);
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 = i13 | 384;
            z11 = z10;
        } else {
            z11 = z10;
            i12 = i13 | (kVarP.c(z11) ? 256 : 128);
        }
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
            z12 = z11;
        } else {
            boolean z13 = i14 != 0 ? false : z11;
            kVar = kVarP;
            md.b(aVar, androidx.compose.foundation.layout.g.f(d.a.f1143b, 46), false, h0.f.a(20), c2.n0.c(4280951581L), 0L, CropImageView.DEFAULT_ASPECT_RATIO, 6, a9.d2.a(1, c2.n0.c(4283581494L)), null, f1.c.b(960049943, new k(str, str2, z13), kVarP), kVar, 113270838, 612);
            z12 = z13;
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, str2, z12, aVar, i10, i11) { // from class: u8.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f29401a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f29402b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f29403c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f29404d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f29405e;

                {
                    this.f29405e = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(3079);
                    y.e(this.f29401a, this.f29402b, this.f29403c, this.f29404d, (x0.j) obj, iN, this.f29405e);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void f(final k8.i iVar, final int i10, final boolean z10, final boolean z11, final eh.p<? super Float, ? super Float, pg.f0> pVar, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i11) {
        x0.k kVar;
        x0.k kVarP = jVar.p(539314777);
        if (((i11 | (kVarP.l(iVar) ? 4 : 2) | (kVarP.c(z10) ? 256 : 128) | (kVarP.c(z11) ? 2048 : 1024) | (kVarP.l(pVar) ? 16384 : 8192) | (kVarP.l(aVar) ? 131072 : 65536) | (kVarP.l(aVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted)) & 599171) == 599170 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.L(-573039548);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new h1.u();
                kVarP.C(objG);
            }
            h1.u uVar = (h1.u) objG;
            kVarP.T(false);
            Map<String, Integer> map = iVar.f16130k;
            kVarP.L(-573035951);
            boolean zL = kVarP.l(iVar);
            Object objG2 = kVarP.g();
            if (zL || objG2 == c0321a) {
                objG2 = new l(uVar, iVar, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, map, kVarP);
            kVar = kVarP;
            z.m.a(e1.d.d(androidx.compose.foundation.layout.g.f976c, h0.f.a(16)), null, f1.c.b(1133768003, new m(uVar, z10, aVar, z11, aVar2, iVar, pVar), kVarP), kVar, 3072, 6);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, z10, z11, pVar, aVar, aVar2, i11) { // from class: u8.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f29411b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f29412c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f29413d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.p f29414e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f29415f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f29416g;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    y.f(this.f29410a, this.f29411b, this.f29412c, this.f29413d, this.f29414e, this.f29415f, this.f29416g, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void g(final g1 g1Var, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        Object nVar;
        final s.b bVar;
        s.b bVar2;
        x0.k kVar;
        x0.k kVarP = jVar.p(-708356438);
        int i11 = (kVarP.K(g1Var) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.L(-2095139430);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = s.d.a(g1Var.f29464c);
                kVarP.C(objG);
            }
            s.b bVar3 = (s.b) objG;
            Object objA = p0.h.a(kVarP, false, -2095137712);
            if (objA == c0321a) {
                objA = s.d.a(1.0f);
                kVarP.C(objA);
            }
            s.b bVar4 = (s.b) objA;
            kVarP.T(false);
            Long lValueOf = Long.valueOf(g1Var.f29462a);
            kVarP.L(-2095135442);
            int i12 = i11 & 14;
            boolean zL = ((i11 & 112) == 32) | kVarP.l(bVar3) | (i12 == 4) | kVarP.l(bVar4);
            Object objG2 = kVarP.g();
            if (zL || objG2 == c0321a) {
                bVar = bVar3;
                bVar2 = bVar4;
                nVar = new n(bVar2, aVar, bVar, g1Var, null);
                kVarP.C(nVar);
            } else {
                nVar = objG2;
                bVar = bVar3;
                bVar2 = bVar4;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) nVar, lValueOf, kVarP);
            kVarP.L(-2095122710);
            boolean zL2 = (i12 == 4) | kVarP.l(bVar);
            Object objG3 = kVarP.g();
            if (zL2 || objG3 == c0321a) {
                objG3 = new eh.l() { // from class: u8.g
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        f3.d offset = (f3.d) obj;
                        kotlin.jvm.internal.r.e(offset, "$this$offset");
                        return new f3.m(((((int) g1Var.f29463b) + 10) << 32) | (((int) ((Number) bVar.d()).floatValue()) & BodyPartID.bodyIdMax));
                    }
                };
                kVarP.C(objG3);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarB = c9.g.b(androidx.compose.foundation.layout.e.a(d.a.f1143b, (eh.l) objG3), ((Number) bVar2.d()).floatValue());
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, l0VarD, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            ff.b(g1Var.f29465d, null, c2.n0.c(4294956800L), f3.u.c(14), x2.p.f32035h, null, 0L, null, 0L, 0, false, 0, 0, null, kVarP, 200064, 0, 131026);
            kVar = kVarP;
            kVar.T(true);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar, i10) { // from class: u8.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f29467b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    y.g(this.f29466a, this.f29467b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void h(final k8.i iVar, final d1 d1Var, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1039218277);
        int i11 = (kVarP.l(iVar) ? 4 : 2) | i10 | (kVarP.l(d1Var) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            b.i iVarH = z.b.h(8);
            z.g1 g1VarD = androidx.compose.foundation.layout.f.d(CropImageView.DEFAULT_ASPECT_RATIO, 12, 7);
            kVarP.L(-1071848848);
            boolean zL = ((i11 & 112) == 32 || kVarP.l(d1Var)) | kVarP.l(iVar);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: u8.k
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        b0.j0 LazyColumn = (b0.j0) obj;
                        kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                        List<k8.k> list = k8.e.f16086e;
                        LazyColumn.d(list.size(), new y.q(new b(), list), new y.r(y.p.f29602a, list), new f1.b(-632812321, true, new y.s(list, iVar, d1Var)));
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            b0.d.a(fillElement, null, g1VarD, iVarH, null, null, false, null, (eh.l) objG, kVarP, 24966, 490);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(d1Var, i10) { // from class: u8.l

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d1 f29486b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(65);
                    y.h(this.f29485a, this.f29486b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void i(final k8.i iVar, final d1 d1Var, final Activity activity, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1630680957);
        int i11 = (kVarP.l(iVar) ? 4 : 2) | i10 | (kVarP.l(d1Var) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            b.i iVarH = z.b.h(8);
            z.g1 g1VarD = androidx.compose.foundation.layout.f.d(CropImageView.DEFAULT_ASPECT_RATIO, 12, 7);
            kVarP.L(-997329429);
            boolean zL = ((i11 & 112) == 32 || kVarP.l(d1Var)) | kVarP.l(iVar);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: u8.o
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        b0.j0 LazyColumn = (b0.j0) obj;
                        kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                        k8.i iVar2 = iVar;
                        d1 d1Var2 = d1Var;
                        b0.j0.b(LazyColumn, null, new f1.b(-552473134, true, new y.t(iVar2, d1Var2)), 3);
                        b0.j0.b(LazyColumn, null, new f1.b(826479753, true, new y.u(iVar2, d1Var2)), 3);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            b0.d.a(fillElement, null, g1VarD, iVarH, null, null, false, null, (eh.l) objG, kVarP, 24966, 490);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(d1Var, activity, i10) { // from class: u8.p

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d1 f29504b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Activity f29505c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(65);
                    y.i(this.f29503a, this.f29504b, this.f29505c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void j(k8.i iVar, final double d10, final long j10, final long j11, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        int i11;
        boolean z10;
        final k8.i iVar2 = iVar;
        x0.k kVarP = jVar.p(895446771);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(iVar2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            Object objC0 = kVarP.c0();
            if ((objC0 instanceof Double) && d10 == ((Number) objC0).doubleValue()) {
                z10 = false;
            } else {
                kVarP.z0(Double.valueOf(d10));
                z10 = true;
            }
            i11 |= z10 ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.j(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.j(j11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(aVar) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            d.a aVar2 = d.a.f1143b;
            float f10 = 16;
            float f11 = 6;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), f10, f11);
            b.k kVar = z.b.f34446c;
            f.a aVar3 = d.a.f14614m;
            int i12 = i11;
            z.q qVarA = z.o.a(kVar, aVar3, kVarP, 0);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, kVarP);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            b.g gVar = z.b.f34450g;
            f.b bVar2 = d.a.f14612k;
            m1 m1VarA = k1.a(gVar, bVar2, kVarP, 54);
            int i14 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            v1.j(bVar, m1VarA, kVarP);
            v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            v1.j(cVar, dVarC2, kVarP);
            b.j jVar2 = z.b.f34444a;
            m1 m1VarA2 = k1.a(jVar2, bVar2, kVarP, 48);
            int i15 = kVarP.P;
            a2 a2VarP3 = kVarP.P();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            v1.j(bVar, m1VarA2, kVarP);
            v1.j(dVar, a2VarP3, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            v1.j(cVar, dVarC3, kVarP);
            s4.c(aVar, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar2, 36), c2.n0.c(4280951581L), h0.f.f12083a), false, null, e1.f29439d, kVarP, ((i12 >> 12) & 14) | 196608, 28);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 10), kVarP);
            z.q qVarA2 = z.o.a(kVar, aVar3, kVarP, 0);
            int iD = kVarP.D();
            a2 a2VarP4 = kVarP.P();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            v1.j(bVar, qVarA2, kVarP);
            v1.j(dVar, a2VarP4, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iD))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iD, kVarP, iD, c0128a);
            }
            v1.j(cVar, dVarC4, kVarP);
            m1 m1VarA3 = k1.a(jVar2, bVar2, kVarP, 48);
            int iD2 = kVarP.D();
            a2 a2VarP5 = kVarP.P();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(aVar2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            v1.j(bVar, m1VarA3, kVarP);
            v1.j(dVar, a2VarP5, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(iD2))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iD2, kVarP, iD2, c0128a);
            }
            v1.j(cVar, dVarC5, kVarP);
            ff.b(f3.q.c(R.string.cat_farm_title, kVarP), null, c2.n0.c(4294956800L), f3.u.c(16), x2.p.f32035h, null, 0L, null, 0L, 0, false, 0, 0, null, kVarP, 200064, 0, 131026);
            x0.k kVar2 = kVarP;
            kVar2.L(759397900);
            iVar2 = iVar;
            if (iVar2.f16135p) {
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, f11), kVar2);
                ff.b(f3.q.c(R.string.cat_farm_club_badge, kVar2), null, c2.n0.c(4294956800L), f3.u.c(11), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, kVar2, 200064, 0, 131026);
                kVar2 = kVar2;
            }
            kVar2.T(false);
            kVar2.T(true);
            x0.k kVar3 = kVar2;
            ff.b(f3.q.d(R.string.cat_farm_level_xp_format, new Object[]{Integer.valueOf(iVar2.f16127h), m(iVar2.f16128i), m(j11)}, kVar2), null, q1.b1.c(0.8f, c2.n0.c(4292128567L)), f3.u.c(11), null, null, 0L, null, 0L, 0, false, 0, 0, null, kVar3, 3456, 0, 131058);
            kVar3.T(true);
            kVar3.T(true);
            m1 m1VarA4 = k1.a(jVar2, bVar2, kVar3, 48);
            int iD3 = kVar3.D();
            a2 a2VarP6 = kVar3.P();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(aVar2, kVar3);
            kVar3.r();
            if (kVar3.O) {
                kVar3.w(aVar4);
            } else {
                kVar3.z();
            }
            v1.j(bVar, m1VarA4, kVar3);
            v1.j(dVar, a2VarP6, kVar3);
            if (kVar3.O || !kotlin.jvm.internal.r.a(kVar3.g(), Integer.valueOf(iD3))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iD3, kVar3, iD3, c0128a);
            }
            v1.j(cVar, dVarC6, kVar3);
            float f12 = 1;
            md.a(null, h0.f.a(f10), c2.n0.c(4280622873L), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(f12, c2.n0.c(4282529839L)), f1.c.b(-630839453, new v(iVar2), kVar3), kVar3, 14156160, 57);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 8), kVar3);
            md.a(null, h0.f.a(f10), c2.n0.c(4280622873L), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(f12, c2.n0.c(4282529839L)), f1.c.b(-435800180, new w(iVar2), kVar3), kVar3, 14156160, 57);
            kVar3.T(true);
            kVar3.T(true);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 4), kVar3);
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD4 = kVar3.D();
            a2 a2VarP7 = kVar3.P();
            androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarD2, kVar3);
            kVar3.r();
            if (kVar3.O) {
                kVar3.w(aVar4);
            } else {
                kVar3.z();
            }
            v1.j(bVar, l0VarD, kVar3);
            v1.j(dVar, a2VarP7, kVar3);
            if (kVar3.O || !kotlin.jvm.internal.r.a(kVar3.g(), Integer.valueOf(iD4))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iD4, kVar3, iD4, c0128a);
            }
            v1.j(cVar, dVarC7, kVar3);
            z.q qVarA3 = z.o.a(kVar, d.a.f14615n, kVar3, 48);
            int iD5 = kVar3.D();
            a2 a2VarP8 = kVar3.P();
            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(aVar2, kVar3);
            kVar3.r();
            if (kVar3.O) {
                kVar3.w(aVar4);
            } else {
                kVar3.z();
            }
            v1.j(bVar, qVarA3, kVar3);
            v1.j(dVar, a2VarP8, kVar3);
            if (kVar3.O || !kotlin.jvm.internal.r.a(kVar3.g(), Integer.valueOf(iD5))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iD5, kVar3, iD5, c0128a);
            }
            v1.j(cVar, dVarC8, kVar3);
            m1 m1VarA5 = k1.a(jVar2, bVar2, kVar3, 48);
            int iD6 = kVar3.D();
            a2 a2VarP9 = kVar3.P();
            androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(aVar2, kVar3);
            kVar3.r();
            if (kVar3.O) {
                kVar3.w(aVar4);
            } else {
                kVar3.z();
            }
            v1.j(bVar, m1VarA5, kVar3);
            v1.j(dVar, a2VarP9, kVar3);
            if (kVar3.O || !kotlin.jvm.internal.r.a(kVar3.g(), Integer.valueOf(iD6))) {
                org.bouncycastle.jcajce.provider.digest.e.a(iD6, kVar3, iD6, c0128a);
            }
            v1.j(cVar, dVarC9, kVar3);
            ff.b("🐾 ", null, 0L, f3.u.c(24), null, null, 0L, null, 0L, 0, false, 0, 0, null, kVar3, 3078, 0, 131062);
            ff.b(m(iVar2.f16120a), null, c2.n0.c(4294956800L), f3.u.c(28), x2.p.f32034g, null, f3.u.b(0.5d), null, 0L, 0, false, 0, 0, null, kVar3, 12782976, 0, 130898);
            kVar3.T(true);
            ff.b(f3.q.d(R.string.cat_farm_production_tap_format, new Object[]{n(d10), m(j10)}, kVar3), null, c2.n0.c(4283096704L), f3.u.c(13), x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, null, kVar3, 200064, 0, 131026);
            kVarP = kVar3;
            kVarP.T(true);
            kVarP.T(true);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: u8.e
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    y.j(iVar2, d10, j10, j11, aVar, (x0.j) obj, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void k(final k8.i iVar, final d1 d1Var, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1446551523);
        int i11 = (kVarP.l(iVar) ? 4 : 2) | i10 | (kVarP.l(d1Var) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i12 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, kVarP);
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 64), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, 7);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i13 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            v1.j(bVar, l0VarD, kVarP);
            v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            v1.j(cVar, dVarC2, kVarP);
            t2.b(null, false, null, kVarP, 0, 31);
            kVarP.T(true);
            b.i iVarH = z.b.h(8);
            z.g1 g1VarD = androidx.compose.foundation.layout.f.d(CropImageView.DEFAULT_ASPECT_RATIO, 12, 7);
            kVarP.L(1405732400);
            boolean zL = ((i11 & 112) == 32 || kVarP.l(d1Var)) | kVarP.l(iVar);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: u8.m
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        b0.j0 LazyColumn = (b0.j0) obj;
                        kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                        List<k8.m> list = k8.e.f16083b;
                        LazyColumn.d(list.size(), new y.z(new f(), list), new y.a0(y.C0301y.f29622a, list), new f1.b(-632812321, true, new y.b0(list, iVar, d1Var)));
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            b0.d.a(fillElement, null, g1VarD, iVarH, null, null, false, null, (eh.l) objG, kVarP, 24966, 490);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(d1Var, i10) { // from class: u8.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d1 f29494b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(65);
                    y.k(this.f29493a, this.f29494b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final String l(int i10, Object[] objArr, x0.j jVar) {
        String string;
        jVar.L(-2129535998);
        Context context = (Context) jVar.f(AndroidCompositionLocals_androidKt.f1281b);
        kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        Integer numValueOf = Integer.valueOf(i10);
        ArrayList<Object> arrayList = k0Var.f16337a;
        arrayList.add(numValueOf);
        k0Var.a(objArr);
        Object[] array = arrayList.toArray(new Object[arrayList.size()]);
        boolean zK = false;
        for (Object obj : array) {
            zK |= jVar.K(obj);
        }
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            try {
                try {
                    string = objArr.length == 0 ? context.getString(i10) : context.getString(i10, Arrays.copyOf(objArr, objArr.length));
                } catch (Throwable unused) {
                    string = context.getResources().getString(i10);
                }
            } catch (Throwable unused2) {
                string = "";
            }
            objG = string;
            jVar.C(objG);
        }
        kotlin.jvm.internal.r.d(objG, "remember(...)");
        String str = (String) objG;
        jVar.B();
        return str;
    }

    public static final String m(long j10) {
        return j10 < 1000 ? String.valueOf(j10) : j10 < 1000000 ? String.format(Locale.US, "%.1fK", Arrays.copyOf(new Object[]{Double.valueOf(j10 / 1000.0d)}, 1)) : j10 < 1000000000 ? String.format(Locale.US, "%.1fM", Arrays.copyOf(new Object[]{Double.valueOf(j10 / 1000000.0d)}, 1)) : j10 < 1000000000000L ? String.format(Locale.US, "%.1fB", Arrays.copyOf(new Object[]{Double.valueOf(j10 / 1.0E9d)}, 1)) : String.format(Locale.US, "%.1fT", Arrays.copyOf(new Object[]{Double.valueOf(j10 / 1.0E12d)}, 1));
    }

    public static final String n(double d10) {
        return d10 < 1000.0d ? String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1)) : d10 < 1000000.0d ? String.format(Locale.US, "%.1fK", Arrays.copyOf(new Object[]{Double.valueOf(d10 / 1000.0d)}, 1)) : d10 < 1.0E9d ? String.format(Locale.US, "%.1fM", Arrays.copyOf(new Object[]{Double.valueOf(d10 / 1000000.0d)}, 1)) : String.format(Locale.US, "%.1fB", Arrays.copyOf(new Object[]{Double.valueOf(d10 / 1000000.0d)}, 1));
    }
}
