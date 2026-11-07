package r;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import j1.d;
import org.bouncycastle.asn1.cmc.BodyPartID;
import s.y1;

/* loaded from: classes.dex */
public final class t1 extends d2 {
    public j1.d A;
    public final h B;
    public final i C;

    /* renamed from: q, reason: collision with root package name */
    public s.y1<u0> f22928q;

    /* renamed from: r, reason: collision with root package name */
    public s.y1<u0>.a<f3.p, s.p> f22929r;

    /* renamed from: s, reason: collision with root package name */
    public s.y1<u0>.a<f3.m, s.p> f22930s;

    /* renamed from: t, reason: collision with root package name */
    public s.y1<u0>.a<f3.m, s.p> f22931t;

    /* renamed from: v, reason: collision with root package name */
    public u1 f22932v;

    /* renamed from: w, reason: collision with root package name */
    public w1 f22933w;

    /* renamed from: x, reason: collision with root package name */
    public eh.a<Boolean> f22934x;

    /* renamed from: y, reason: collision with root package name */
    public c2 f22935y;

    /* renamed from: z, reason: collision with root package name */
    public long f22936z = androidx.compose.animation.e.f769a;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f22937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var) {
            super(1);
            this.f22937a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            aVar.d(this.f22937a, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f22938a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f22939b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f22940c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.l<q1.l1, pg.f0> f22941d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(g2.g1 g1Var, long j10, long j11, eh.l<? super q1.l1, pg.f0> lVar) {
            super(1);
            this.f22938a = g1Var;
            this.f22939b = j10;
            this.f22940c = j11;
            this.f22941d = lVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            long j10 = this.f22939b;
            long j11 = this.f22940c;
            int i10 = ((int) (j10 >> 32)) + ((int) (j11 >> 32));
            int i11 = ((int) (j10 & BodyPartID.bodyIdMax)) + ((int) (j11 & BodyPartID.bodyIdMax));
            aVar2.getClass();
            long j12 = (i10 << 32) | (i11 & BodyPartID.bodyIdMax);
            g2.g1 g1Var = this.f22938a;
            g1.a.a(aVar2, g1Var);
            g1Var.l0(CropImageView.DEFAULT_ASPECT_RATIO, f3.m.d(j12, g1Var.f11386e), this.f22941d);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f22942a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g2.g1 g1Var) {
            super(1);
            this.f22942a = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            aVar.d(this.f22942a, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<u0, f3.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f22944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10) {
            super(1);
            this.f22944b = j10;
        }

        @Override // eh.l
        public final f3.p invoke(u0 u0Var) {
            eh.l<f3.p, f3.p> lVar;
            eh.l<f3.p, f3.p> lVar2;
            int iOrdinal = u0Var.ordinal();
            t1 t1Var = t1.this;
            long j10 = this.f22944b;
            if (iOrdinal == 0) {
                j0 j0Var = t1Var.f22932v.a().f22904c;
                if (j0Var != null && (lVar = j0Var.f22862b) != null) {
                    j10 = lVar.invoke(new f3.p(j10)).f8826a;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new pg.l();
                }
                j0 j0Var2 = t1Var.f22933w.a().f22904c;
                if (j0Var2 != null && (lVar2 = j0Var2.f22862b) != null) {
                    j10 = lVar2.invoke(new f3.p(j10)).f8826a;
                }
            }
            return new f3.p(j10);
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.l<y1.b<u0>, s.e0<f3.m>> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f22945a = new e(1);

        @Override // eh.l
        public final s.e0<f3.m> invoke(y1.b<u0> bVar) {
            return w0.f22975c;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.l<u0, f3.m> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f22947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j10) {
            super(1);
            this.f22947b = j10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
        @Override // eh.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final f3.m invoke(u0 u0Var) {
            long jC;
            int iOrdinal;
            u0 u0Var2 = u0Var;
            t1 t1Var = t1.this;
            if (t1Var.A != null && t1Var.T1() != null && !kotlin.jvm.internal.r.a(t1Var.A, t1Var.T1()) && (iOrdinal = u0Var2.ordinal()) != 0 && iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new pg.l();
                }
                j0 j0Var = t1Var.f22933w.a().f22904c;
                if (j0Var != null) {
                    eh.l<f3.p, f3.p> lVar = j0Var.f22862b;
                    long j10 = this.f22947b;
                    long j11 = lVar.invoke(new f3.p(j10)).f8826a;
                    j1.d dVarT1 = t1Var.T1();
                    kotlin.jvm.internal.r.b(dVarT1);
                    f3.r rVar = f3.r.f8828a;
                    long jA = dVarT1.a(j10, j11, rVar);
                    j1.d dVar = t1Var.A;
                    kotlin.jvm.internal.r.b(dVar);
                    jC = f3.m.c(jA, dVar.a(j10, j11, rVar));
                } else {
                    jC = 0;
                }
            }
            return new f3.m(jC);
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.l<u0, f3.m> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f22949b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j10) {
            super(1);
            this.f22949b = j10;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [eh.l, kotlin.jvm.internal.s] */
        /* JADX WARN: Type inference failed for: r1v4, types: [eh.l, kotlin.jvm.internal.s] */
        @Override // eh.l
        public final f3.m invoke(u0 u0Var) {
            u0 u0Var2 = u0Var;
            t1 t1Var = t1.this;
            l2 l2Var = t1Var.f22932v.a().f22903b;
            long j10 = this.f22949b;
            long j11 = 0;
            long j12 = l2Var != null ? ((f3.m) l2Var.f22881a.invoke(new f3.p(j10))).f8820a : 0L;
            l2 l2Var2 = t1Var.f22933w.a().f22903b;
            long j13 = l2Var2 != null ? ((f3.m) l2Var2.f22881a.invoke(new f3.p(j10))).f8820a : 0L;
            int iOrdinal = u0Var2.ordinal();
            if (iOrdinal == 0) {
                j11 = j12;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new pg.l();
                }
                j11 = j13;
            }
            return new f3.m(j11);
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.l<y1.b<u0>, s.e0<f3.p>> {
        public h() {
            super(1);
        }

        @Override // eh.l
        public final s.e0<f3.p> invoke(y1.b<u0> bVar) {
            y1.b<u0> bVar2 = bVar;
            u0 u0Var = u0.f22955a;
            u0 u0Var2 = u0.f22956b;
            boolean zD = bVar2.d(u0Var, u0Var2);
            s.e0<f3.p> e0Var = null;
            t1 t1Var = t1.this;
            if (zD) {
                j0 j0Var = t1Var.f22932v.a().f22904c;
                if (j0Var != null) {
                    e0Var = j0Var.f22863c;
                }
            } else if (bVar2.d(u0Var2, u0.f22957c)) {
                j0 j0Var2 = t1Var.f22933w.a().f22904c;
                if (j0Var2 != null) {
                    e0Var = j0Var2.f22863c;
                }
            } else {
                e0Var = w0.f22976d;
            }
            return e0Var == null ? w0.f22976d : e0Var;
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.l<y1.b<u0>, s.e0<f3.m>> {
        public i() {
            super(1);
        }

        @Override // eh.l
        public final s.e0<f3.m> invoke(y1.b<u0> bVar) {
            l2 l2Var;
            y1.b<u0> bVar2 = bVar;
            u0 u0Var = u0.f22955a;
            u0 u0Var2 = u0.f22956b;
            boolean zD = bVar2.d(u0Var, u0Var2);
            t1 t1Var = t1.this;
            if (zD) {
                l2 l2Var2 = t1Var.f22932v.a().f22903b;
                return l2Var2 != null ? l2Var2.f22882b : w0.f22975c;
            }
            if (bVar2.d(u0Var2, u0.f22957c) && (l2Var = t1Var.f22933w.a().f22903b) != null) {
                return l2Var.f22882b;
            }
            return w0.f22975c;
        }
    }

    public t1(s.y1<u0> y1Var, s.y1<u0>.a<f3.p, s.p> aVar, s.y1<u0>.a<f3.m, s.p> aVar2, s.y1<u0>.a<f3.m, s.p> aVar3, u1 u1Var, w1 w1Var, eh.a<Boolean> aVar4, c2 c2Var) {
        this.f22928q = y1Var;
        this.f22929r = aVar;
        this.f22930s = aVar2;
        this.f22931t = aVar3;
        this.f22932v = u1Var;
        this.f22933w = w1Var;
        this.f22934x = aVar4;
        this.f22935y = c2Var;
        f3.c.b(0, 0, 15);
        this.B = new h();
        this.C = new i();
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        this.f22936z = androidx.compose.animation.e.f769a;
    }

    public final j1.d T1() {
        j1.d dVar;
        j1.d dVar2;
        if (this.f22928q.f().d(u0.f22955a, u0.f22956b)) {
            j0 j0Var = this.f22932v.a().f22904c;
            if (j0Var != null && (dVar2 = j0Var.f22861a) != null) {
                return dVar2;
            }
            j0 j0Var2 = this.f22933w.a().f22904c;
            if (j0Var2 != null) {
                return j0Var2.f22861a;
            }
            return null;
        }
        j0 j0Var3 = this.f22933w.a().f22904c;
        if (j0Var3 != null && (dVar = j0Var3.f22861a) != null) {
            return dVar;
        }
        j0 j0Var4 = this.f22932v.a().f22904c;
        if (j0Var4 != null) {
            return j0Var4.f22861a;
        }
        return null;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        char c10;
        long j11;
        if (this.f22928q.f24001a.V() == this.f22928q.f24004d.getValue()) {
            this.A = null;
        } else if (this.A == null) {
            j1.d dVarT1 = T1();
            if (dVarT1 == null) {
                dVarT1 = d.a.f14602a;
            }
            this.A = dVarT1;
        }
        boolean zI0 = o0Var.I0();
        qg.a0 a0Var = qg.a0.f22708a;
        if (zI0) {
            g2.g1 g1VarP = k0Var.P(j10);
            long j12 = (g1VarP.f11382a << 32) | (g1VarP.f11383b & BodyPartID.bodyIdMax);
            this.f22936z = j12;
            return o0Var.i0((int) (j12 >> 32), (int) (BodyPartID.bodyIdMax & j12), a0Var, new a(g1VarP));
        }
        if (!this.f22934x.invoke().booleanValue()) {
            g2.g1 g1VarP2 = k0Var.P(j10);
            return o0Var.i0(g1VarP2.f11382a, g1VarP2.f11383b, a0Var, new c(g1VarP2));
        }
        z0 z0VarInit = this.f22935y.init();
        g2.g1 g1VarP3 = k0Var.P(j10);
        long j13 = (g1VarP3.f11382a << 32) | (g1VarP3.f11383b & BodyPartID.bodyIdMax);
        long j14 = !f3.p.b(this.f22936z, androidx.compose.animation.e.f769a) ? this.f22936z : j13;
        s.y1<u0>.a<f3.p, s.p> aVar = this.f22929r;
        y1.a.C0268a c0268aA = aVar != null ? aVar.a(this.B, new d(j14)) : null;
        if (c0268aA != null) {
            j13 = ((f3.p) c0268aA.getValue()).f8826a;
        }
        long jD = f3.c.d(j10, j13);
        s.y1<u0>.a<f3.m, s.p> aVar2 = this.f22930s;
        long j15 = aVar2 != null ? ((f3.m) aVar2.a(e.f22945a, new f(j14)).getValue()).f8820a : 0L;
        s.y1<u0>.a<f3.m, s.p> aVar3 = this.f22931t;
        if (aVar3 != null) {
            c10 = ' ';
            j11 = ((f3.m) aVar3.a(this.C, new g(j14)).getValue()).f8820a;
        } else {
            c10 = ' ';
            j11 = 0;
        }
        j1.d dVar = this.A;
        return o0Var.i0((int) (jD >> c10), (int) (jD & BodyPartID.bodyIdMax), a0Var, new b(g1VarP3, f3.m.d(dVar != null ? dVar.a(j14, jD, f3.r.f8828a) : 0L, j11), j15, z0VarInit));
    }
}
