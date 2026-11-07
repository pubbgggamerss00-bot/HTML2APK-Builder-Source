package r;

import g2.g1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h2 extends d2 {

    /* renamed from: q, reason: collision with root package name */
    public s.l<f3.p> f22834q;

    /* renamed from: r, reason: collision with root package name */
    public j1.d f22835r;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22838v;

    /* renamed from: s, reason: collision with root package name */
    public long f22836s = androidx.compose.animation.e.f769a;

    /* renamed from: t, reason: collision with root package name */
    public long f22837t = f3.c.b(0, 0, 15);

    /* renamed from: w, reason: collision with root package name */
    public final x0.x1 f22839w = bg.b.h(null);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final s.b<f3.p, s.p> f22840a;

        /* renamed from: b, reason: collision with root package name */
        public long f22841b;

        public a() {
            throw null;
        }

        public a(s.b bVar, long j10) {
            this.f22840a = bVar;
            this.f22841b = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f22840a, aVar.f22840a) && f3.p.b(this.f22841b, aVar.f22841b);
        }

        public final int hashCode() {
            return Long.hashCode(this.f22841b) + (this.f22840a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimData(anim=" + this.f22840a + ", startSize=" + ((Object) f3.p.c(this.f22841b)) + ')';
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f22843b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22844c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f22845d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f22846e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f22847f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, int i10, int i11, g2.o0 o0Var, g2.g1 g1Var) {
            super(1);
            this.f22843b = j10;
            this.f22844c = i10;
            this.f22845d = i11;
            this.f22846e = o0Var;
            this.f22847f = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.f(aVar, this.f22847f, h2.this.f22835r.a(this.f22843b, (this.f22845d & BodyPartID.bodyIdMax) | (this.f22844c << 32), this.f22846e.getLayoutDirection()));
            return pg.f0.f21461a;
        }
    }

    public h2(s.l1 l1Var, j1.f fVar) {
        this.f22834q = l1Var;
        this.f22835r = fVar;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        this.f22836s = androidx.compose.animation.e.f769a;
        this.f22838v = false;
    }

    @Override // androidx.compose.ui.d.c
    public final void N1() {
        this.f22839w.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP;
        char c10;
        long j11;
        a aVar;
        long jD;
        a aVar2;
        if (o0Var.I0()) {
            this.f22837t = j10;
            this.f22838v = true;
            g1VarP = k0Var.P(j10);
        } else {
            g1VarP = k0Var.P(this.f22838v ? this.f22837t : j10);
        }
        g2.g1 g1Var = g1VarP;
        long j12 = (g1Var.f11383b & BodyPartID.bodyIdMax) | (g1Var.f11382a << 32);
        if (o0Var.I0()) {
            this.f22836s = j12;
            c10 = ' ';
            jD = j12;
            j11 = jD;
        } else {
            long j13 = !f3.p.b(this.f22836s, androidx.compose.animation.e.f769a) ? this.f22836s : j12;
            x0.x1 x1Var = this.f22839w;
            a aVar3 = (a) x1Var.getValue();
            if (aVar3 != null) {
                s.b<f3.p, s.p> bVar = aVar3.f22840a;
                c10 = ' ';
                j11 = j12;
                boolean z10 = (f3.p.b(j13, bVar.d().f8826a) || bVar.e()) ? false : true;
                if (!f3.p.b(j13, ((f3.p) bVar.f23656e.getValue()).f8826a) || z10) {
                    aVar3.f22841b = bVar.d().f8826a;
                    aVar2 = aVar3;
                    ph.h.c(H1(), null, null, new i2(aVar2, j13, this, null), 3);
                } else {
                    aVar2 = aVar3;
                }
                aVar = aVar2;
            } else {
                c10 = ' ';
                j11 = j12;
                long j14 = 1;
                aVar = new a(new s.b(new f3.p(j13), s.p2.f23875h, new f3.p((j14 << 32) | (j14 & BodyPartID.bodyIdMax)), 8), j13);
            }
            x1Var.setValue(aVar);
            jD = f3.c.d(j10, aVar.f22840a.d().f8826a);
        }
        int i10 = (int) (jD >> c10);
        int i11 = (int) (jD & BodyPartID.bodyIdMax);
        return o0Var.i0(i10, i11, qg.a0.f22708a, new b(j11, i10, i11, o0Var, g1Var));
    }
}
