package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import f3.b;
import g2.g1;
import g2.k0;
import g2.m0;
import g2.o0;
import g2.p;
import i0.a3;
import i2.b0;
import i2.k;
import i2.k2;
import i2.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.i;
import kotlin.jvm.internal.s;
import l0.c;
import l0.g;
import l0.j;
import m0.x;
import m0.z;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import q1.b1;
import q1.e1;
import q1.e2;
import q1.j0;
import q1.u0;
import q1.w0;
import q2.a0;
import q2.c0;
import q2.d0;
import q2.w;
import qg.z;
import r.o2;
import s1.a;
import s1.h;
import t2.b;
import t2.g0;
import t2.h0;
import t2.l0;
import t2.u;
import x2.f;

/* loaded from: classes.dex */
public final class b extends d.c implements b0, r, k2 {
    public l<? super List<p1.e>, f0> A;
    public g B;
    public e1 C;
    public l<? super a, f0> D;
    public Map<g2.a, Integer> E;
    public l0.e F;
    public C0016b G;
    public a H;

    /* renamed from: q, reason: collision with root package name */
    public t2.b f1102q;

    /* renamed from: r, reason: collision with root package name */
    public l0 f1103r;

    /* renamed from: s, reason: collision with root package name */
    public f.a f1104s;

    /* renamed from: t, reason: collision with root package name */
    public l<? super h0, f0> f1105t;

    /* renamed from: v, reason: collision with root package name */
    public int f1106v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1107w;

    /* renamed from: x, reason: collision with root package name */
    public int f1108x;

    /* renamed from: y, reason: collision with root package name */
    public int f1109y;

    /* renamed from: z, reason: collision with root package name */
    public List<b.c<u>> f1110z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final t2.b f1111a;

        /* renamed from: b, reason: collision with root package name */
        public t2.b f1112b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1113c = false;

        /* renamed from: d, reason: collision with root package name */
        public l0.e f1114d = null;

        public a(t2.b bVar, t2.b bVar2) {
            this.f1111a = bVar;
            this.f1112b = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f1111a, aVar.f1111a) && kotlin.jvm.internal.r.a(this.f1112b, aVar.f1112b) && this.f1113c == aVar.f1113c && kotlin.jvm.internal.r.a(this.f1114d, aVar.f1114d);
        }

        public final int hashCode() {
            int iA = o2.a((this.f1112b.hashCode() + (this.f1111a.hashCode() * 31)) * 31, 31, this.f1113c);
            l0.e eVar = this.f1114d;
            return iA + (eVar == null ? 0 : eVar.hashCode());
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.f1111a) + ", substitution=" + ((Object) this.f1112b) + ", isShowingSubstitution=" + this.f1113c + ", layoutCache=" + this.f1114d + ')';
        }
    }

    /* renamed from: androidx.compose.foundation.text.modifiers.b$b, reason: collision with other inner class name */
    public static final class C0016b extends s implements l<List<h0>, Boolean> {
        public C0016b() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(List<h0> list) {
            h0 h0Var;
            List<h0> list2 = list;
            b bVar = b.this;
            h0 h0Var2 = bVar.V1().f16588n;
            if (h0Var2 != null) {
                g0 g0Var = h0Var2.f27819a;
                t2.b bVar2 = g0Var.f27809a;
                l0 l0Var = bVar.f1103r;
                e1 e1Var = bVar.C;
                h0Var = new h0(new g0(bVar2, l0.e(l0Var, e1Var != null ? e1Var.a() : b1.f21654h, 0L, null, null, 0L, 0, 0L, 16777214), g0Var.f27811c, g0Var.f27812d, g0Var.f27813e, g0Var.f27814f, g0Var.f27815g, g0Var.f27816h, g0Var.f27817i, g0Var.f27818j), h0Var2.f27820b, h0Var2.f27821c);
                list2.add(h0Var);
            } else {
                h0Var = null;
            }
            return Boolean.valueOf(h0Var != null);
        }
    }

    public static final class c extends s implements l<t2.b, Boolean> {
        public c() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(t2.b bVar) {
            t2.b bVar2 = bVar;
            b bVar3 = b.this;
            a aVar = bVar3.H;
            z zVar = z.f22752a;
            if (aVar == null) {
                a aVar2 = new a(bVar3.f1102q, bVar2);
                l0.e eVar = new l0.e(bVar2, bVar3.f1103r, bVar3.f1104s, bVar3.f1106v, bVar3.f1107w, bVar3.f1108x, bVar3.f1109y, zVar);
                eVar.c(bVar3.V1().f16584j);
                aVar2.f1114d = eVar;
                bVar3.H = aVar2;
            } else if (!kotlin.jvm.internal.r.a(bVar2, aVar.f1112b)) {
                aVar.f1112b = bVar2;
                l0.e eVar2 = aVar.f1114d;
                if (eVar2 != null) {
                    eVar2.f(bVar2, bVar3.f1103r, bVar3.f1104s, bVar3.f1106v, bVar3.f1107w, bVar3.f1108x, bVar3.f1109y, zVar);
                    f0 f0Var = f0.f21461a;
                }
            }
            b.T1(bVar3);
            return Boolean.TRUE;
        }
    }

    public static final class d extends s implements l<Boolean, Boolean> {
        public d() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = b.this;
            a aVar = bVar.H;
            if (aVar == null) {
                return Boolean.FALSE;
            }
            l<? super a, f0> lVar = bVar.D;
            if (lVar != null) {
                lVar.invoke(aVar);
            }
            a aVar2 = bVar.H;
            if (aVar2 != null) {
                aVar2.f1113c = zBooleanValue;
            }
            b.T1(bVar);
            return Boolean.TRUE;
        }
    }

    public static final class e extends s implements eh.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // eh.a
        public final Boolean invoke() {
            b bVar = b.this;
            bVar.H = null;
            b.T1(bVar);
            return Boolean.TRUE;
        }
    }

    public static final class f extends s implements l<g1.a, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1 f1119a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(g1 g1Var) {
            super(1);
            this.f1119a = g1Var;
        }

        @Override // eh.l
        public final f0 invoke(g1.a aVar) {
            aVar.d(this.f1119a, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
            return f0.f21461a;
        }
    }

    public b() {
        throw null;
    }

    public b(t2.b bVar, l0 l0Var, f.a aVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, g gVar, e1 e1Var, l lVar3) {
        this.f1102q = bVar;
        this.f1103r = l0Var;
        this.f1104s = aVar;
        this.f1105t = lVar;
        this.f1106v = i10;
        this.f1107w = z10;
        this.f1108x = i11;
        this.f1109y = i12;
        this.f1110z = list;
        this.A = lVar2;
        this.B = gVar;
        this.C = e1Var;
        this.D = lVar3;
    }

    public static final void T1(b bVar) {
        k.f(bVar).P();
        k.f(bVar).O();
        i2.s.a(bVar);
    }

    @Override // i2.b0
    public final int F(i2.l0 l0Var, p pVar, int i10) {
        return a3.a(W1(l0Var).d(l0Var.getLayoutDirection()).c());
    }

    @Override // i2.b0
    public final int G(i2.l0 l0Var, p pVar, int i10) {
        return a3.a(W1(l0Var).d(l0Var.getLayoutDirection()).b());
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    public final void U1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 || z12 || z13) {
            V1().f(this.f1102q, this.f1103r, this.f1104s, this.f1106v, this.f1107w, this.f1108x, this.f1109y, this.f1110z);
        }
        if (this.f1157p) {
            if (z11 || (z10 && this.G != null)) {
                k.f(this).P();
            }
            if (z11 || z12 || z13) {
                k.f(this).O();
                i2.s.a(this);
            }
            if (z10) {
                i2.s.a(this);
            }
        }
    }

    public final l0.e V1() {
        if (this.F == null) {
            this.F = new l0.e(this.f1102q, this.f1103r, this.f1104s, this.f1106v, this.f1107w, this.f1108x, this.f1109y, this.f1110z);
        }
        l0.e eVar = this.F;
        kotlin.jvm.internal.r.b(eVar);
        return eVar;
    }

    public final l0.e W1(f3.d dVar) {
        l0.e eVar;
        a aVar = this.H;
        if (aVar != null && aVar.f1113c && (eVar = aVar.f1114d) != null) {
            eVar.c(dVar);
            return eVar;
        }
        l0.e eVarV1 = V1();
        eVarV1.c(dVar);
        return eVarV1;
    }

    @Override // i2.k2
    public final void X(d0 d0Var) {
        C0016b c0016b = this.G;
        if (c0016b == null) {
            c0016b = new C0016b();
            this.G = c0016b;
        }
        t2.b bVar = this.f1102q;
        i<Object>[] iVarArr = a0.f21754a;
        d0Var.c(w.f21845z, c0.g0.c(bVar));
        a aVar = this.H;
        if (aVar != null) {
            t2.b bVar2 = aVar.f1112b;
            c0<t2.b> c0Var = w.A;
            i<Object>[] iVarArr2 = a0.f21754a;
            i<Object> iVar = iVarArr2[14];
            c0Var.getClass();
            d0Var.c(c0Var, bVar2);
            boolean z10 = aVar.f1113c;
            c0<Boolean> c0Var2 = w.B;
            i<Object> iVar2 = iVarArr2[15];
            Boolean boolValueOf = Boolean.valueOf(z10);
            c0Var2.getClass();
            d0Var.c(c0Var2, boolValueOf);
        }
        d0Var.c(q2.k.f21783k, new q2.a(null, new c()));
        d0Var.c(q2.k.f21784l, new q2.a(null, new d()));
        d0Var.c(q2.k.f21785m, new q2.a(null, new e()));
        a0.c(d0Var, c0016b);
    }

    public final boolean X1(l<? super h0, f0> lVar, l<? super List<p1.e>, f0> lVar2, g gVar, l<? super a, f0> lVar3) {
        boolean z10;
        if (this.f1105t != lVar) {
            this.f1105t = lVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.A != lVar2) {
            this.A = lVar2;
            z10 = true;
        }
        if (!kotlin.jvm.internal.r.a(this.B, gVar)) {
            this.B = gVar;
            z10 = true;
        }
        if (this.D == lVar3) {
            return z10;
        }
        this.D = lVar3;
        return true;
    }

    public final boolean Y1(l0 l0Var, List list, int i10, int i11, boolean z10, f.a aVar, int i12) {
        boolean z11 = !this.f1103r.c(l0Var);
        this.f1103r = l0Var;
        if (!kotlin.jvm.internal.r.a(this.f1110z, list)) {
            this.f1110z = list;
            z11 = true;
        }
        if (this.f1109y != i10) {
            this.f1109y = i10;
            z11 = true;
        }
        if (this.f1108x != i11) {
            this.f1108x = i11;
            z11 = true;
        }
        if (this.f1107w != z10) {
            this.f1107w = z10;
            z11 = true;
        }
        if (!kotlin.jvm.internal.r.a(this.f1104s, aVar)) {
            this.f1104s = aVar;
            z11 = true;
        }
        if (this.f1106v == i12) {
            return z11;
        }
        this.f1106v = i12;
        return true;
    }

    public final boolean Z1(t2.b bVar) {
        boolean zA = kotlin.jvm.internal.r.a(this.f1102q.f27761b, bVar.f27761b);
        boolean z10 = (zA && kotlin.jvm.internal.r.a(this.f1102q.f27760a, bVar.f27760a)) ? false : true;
        if (z10) {
            this.f1102q = bVar;
        }
        if (!zA) {
            this.H = null;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // i2.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m0 m(o0 o0Var, k0 k0Var, long j10) {
        boolean z10;
        l0.e eVarW1 = W1(o0Var);
        f3.r layoutDirection = o0Var.getLayoutDirection();
        if (eVarW1.f16580f > 1) {
            l0.c cVar = eVarW1.f16582h;
            l0 l0Var = eVarW1.f16585k;
            f3.d dVar = eVarW1.f16584j;
            kotlin.jvm.internal.r.b(dVar);
            l0.c cVarA = c.a.a(cVar, layoutDirection, l0Var, dVar, eVarW1.f16576b);
            eVarW1.f16582h = cVarA;
            j10 = cVarA.a(eVarW1.f16580f, j10);
        }
        h0 h0Var = eVarW1.f16588n;
        if (h0Var == null) {
            eVarW1.f16588n = eVarW1.e(layoutDirection, j10, eVarW1.b(j10, layoutDirection));
            z10 = true;
        } else {
            t2.l lVar = h0Var.f27820b;
            g0 g0Var = h0Var.f27819a;
            if (!lVar.f27843a.a()) {
                f3.r rVar = g0Var.f27816h;
                long j11 = g0Var.f27818j;
                if (layoutDirection == rVar && (f3.b.c(j10, j11) || (f3.b.i(j10) == f3.b.i(j11) && f3.b.k(j10) == f3.b.k(j11) && f3.b.h(j10) >= lVar.f27847e && !lVar.f27845c))) {
                    h0 h0Var2 = eVarW1.f16588n;
                    kotlin.jvm.internal.r.b(h0Var2);
                    if (f3.b.c(j10, h0Var2.f27819a.f27818j)) {
                        z10 = false;
                    } else {
                        h0 h0Var3 = eVarW1.f16588n;
                        kotlin.jvm.internal.r.b(h0Var3);
                        eVarW1.f16588n = eVarW1.e(layoutDirection, j10, h0Var3.f27820b);
                    }
                }
                z10 = true;
            }
        }
        h0 h0Var4 = eVarW1.f16588n;
        if (h0Var4 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        long j12 = h0Var4.f27821c;
        h0Var4.f27820b.f27843a.a();
        if (z10) {
            k.d(this, 2).x1();
            l<? super h0, f0> lVar2 = this.f1105t;
            if (lVar2 != null) {
                lVar2.invoke(h0Var4);
            }
            g gVar = this.B;
            if (gVar != null) {
                h0 h0Var5 = gVar.f16612d.f16628b;
                if (h0Var5 != null && !kotlin.jvm.internal.r.a(h0Var5.f27819a.f27809a, h0Var4.f27819a.f27809a)) {
                    gVar.f16610b.a(gVar.f16609a);
                }
                gVar.f16612d = j.a(gVar.f16612d, null, h0Var4, 1);
            }
            Map<g2.a, Integer> linkedHashMap = this.E;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(g2.b.f11314a, Integer.valueOf(Math.round(h0Var4.f27822d)));
            linkedHashMap.put(g2.b.f11315b, Integer.valueOf(Math.round(h0Var4.f27823e)));
            this.E = linkedHashMap;
        }
        l<? super List<p1.e>, f0> lVar3 = this.A;
        if (lVar3 != null) {
            lVar3.invoke(h0Var4.f27824f);
        }
        int i10 = (int) (j12 >> 32);
        int i11 = (int) (j12 & BodyPartID.bodyIdMax);
        g1 g1VarP = k0Var.P(b.a.b(i10, i10, i11, i11));
        Map<g2.a, Integer> map = this.E;
        kotlin.jvm.internal.r.b(map);
        return o0Var.i0(i10, i11, map, new f(g1VarP));
    }

    @Override // i2.b0
    public final int r(i2.l0 l0Var, p pVar, int i10) {
        return W1(l0Var).a(i10, l0Var.getLayoutDirection());
    }

    @Override // i2.b0
    public final int w(i2.l0 l0Var, p pVar, int i10) {
        return W1(l0Var).a(i10, l0Var.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    @Override // i2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(i2.h0 h0Var) throws Throwable {
        long j10;
        m0.z zVarB;
        a.b bVar;
        long j11;
        s1.a aVar = h0Var.f13901a;
        if (this.f1157p) {
            g gVar = this.B;
            if (gVar == null || (zVarB = gVar.f16610b.f().b(gVar.f16609a)) == null) {
                j10 = 4294967295L;
            } else {
                z.a aVar2 = zVarB.f17594b;
                z.a aVar3 = zVarB.f17593a;
                boolean z10 = zVarB.f17595c;
                int i10 = !z10 ? aVar3.f17597b : aVar2.f17597b;
                int i11 = !z10 ? aVar2.f17597b : aVar3.f17597b;
                if (i10 != i11) {
                    x xVar = gVar.f16613e;
                    int iA = xVar != null ? xVar.a() : 0;
                    if (i10 > iA) {
                        i10 = iA;
                    }
                    if (i11 > iA) {
                        i11 = iA;
                    }
                    h0 h0Var2 = gVar.f16612d.f16628b;
                    j0 j0VarI = h0Var2 != null ? h0Var2.i(i10, i11) : null;
                    if (j0VarI != null) {
                        h0 h0Var3 = gVar.f16612d.f16628b;
                        if (h0Var3 == null || h0Var3.f27819a.f27814f == 3 || !h0Var3.d()) {
                            j10 = 4294967295L;
                            s1.e.P0(h0Var, j0VarI, gVar.f16611c, null, 0, 60);
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (aVar.i() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aVar.i() & BodyPartID.bodyIdMax));
                            a.b bVar2 = aVar.f24173b;
                            long jD = bVar2.d();
                            bVar2.a().d();
                            try {
                                bVar2.f24180a.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                bVar = bVar2;
                                try {
                                    j10 = 4294967295L;
                                    j11 = jD;
                                    try {
                                        s1.e.P0(h0Var, j0VarI, gVar.f16611c, null, 0, 60);
                                        t.r.a(bVar, j11);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        t.r.a(bVar, j11);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    j11 = jD;
                                    t.r.a(bVar, j11);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                bVar = bVar2;
                            }
                        }
                    }
                }
            }
            w0 w0VarA = aVar.f24173b.a();
            h0 h0Var4 = W1(h0Var).f16588n;
            if (h0Var4 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            t2.l lVar = h0Var4.f27820b;
            boolean z11 = h0Var4.d() && this.f1106v != 3;
            if (z11) {
                long j12 = h0Var4.f27821c;
                p1.e eVarA = p1.f.a(0L, (Float.floatToRawIntBits((int) (j12 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j12 & j10)) & j10));
                w0VarA.d();
                w0VarA.h(eVarA);
            }
            try {
                t2.b0 b0Var = this.f1103r.f27852a;
                e3.i iVar = b0Var.f27787m;
                if (iVar == null) {
                    iVar = e3.i.f8364b;
                }
                e3.i iVar2 = iVar;
                e2 e2Var = b0Var.f27788n;
                if (e2Var == null) {
                    e2Var = e2.f21687d;
                }
                e2 e2Var2 = e2Var;
                s1.f fVar = b0Var.f27790p;
                if (fVar == null) {
                    fVar = h.f24186a;
                }
                s1.f fVar2 = fVar;
                u0 u0VarL = b0Var.f27775a.l();
                if (u0VarL != null) {
                    t2.l.j(lVar, w0VarA, u0VarL, this.f1103r.f27852a.f27775a.i(), e2Var2, iVar2, fVar2);
                } else {
                    e1 e1Var = this.C;
                    long jA = e1Var != null ? e1Var.a() : b1.f21654h;
                    if (jA == 16) {
                        jA = this.f1103r.b() != 16 ? this.f1103r.b() : b1.f21648b;
                    }
                    t2.l.i(lVar, w0VarA, jA, e2Var2, iVar2, fVar2);
                }
                if (z11) {
                    w0VarA.o();
                }
                a aVar4 = this.H;
                if (!((aVar4 == null || !aVar4.f1113c) ? c1.x.f(this.f1102q) : false)) {
                    List<b.c<u>> list = this.f1110z;
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                }
                h0Var.z1();
            } catch (Throwable th5) {
                if (z11) {
                    w0VarA.o();
                }
                throw th5;
            }
        }
    }
}
