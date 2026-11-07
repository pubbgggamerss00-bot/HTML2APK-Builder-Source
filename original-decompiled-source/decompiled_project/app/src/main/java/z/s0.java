package z;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class s0 implements g2.b0, h2.d, h2.g<u1> {

    /* renamed from: b, reason: collision with root package name */
    public final u1 f34625b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.x1 f34626c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.x1 f34627d;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34628a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34629b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f34630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, g2.g1 g1Var) {
            super(1);
            this.f34628a = g1Var;
            this.f34629b = i10;
            this.f34630c = i11;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            aVar.d(this.f34628a, this.f34629b, this.f34630c, CropImageView.DEFAULT_ASPECT_RATIO);
            return pg.f0.f21461a;
        }
    }

    public s0(u1 u1Var) {
        this.f34625b = u1Var;
        this.f34626c = bg.b.h(u1Var);
        this.f34627d = bg.b.h(u1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return kotlin.jvm.internal.r.a(((s0) obj).f34625b, this.f34625b);
        }
        return false;
    }

    @Override // h2.g
    public final h2.i<u1> getKey() {
        return y1.f34693a;
    }

    public final int hashCode() {
        return this.f34625b.hashCode();
    }

    @Override // h2.g
    public final u1 i() {
        return (u1) this.f34627d.getValue();
    }

    @Override // g2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        x0.x1 x1Var = this.f34626c;
        int iA = ((u1) x1Var.getValue()).a(o0Var, o0Var.getLayoutDirection());
        int iB = ((u1) x1Var.getValue()).b(o0Var);
        int iD = ((u1) x1Var.getValue()).d(o0Var, o0Var.getLayoutDirection()) + iA;
        int iC = ((u1) x1Var.getValue()).c(o0Var) + iB;
        g2.g1 g1VarP = k0Var.P(f3.c.i(-iD, -iC, j10));
        return o0Var.i0(f3.c.g(g1VarP.f11382a + iD, j10), f3.c.f(g1VarP.f11383b + iC, j10), qg.a0.f22708a, new a(iA, iB, g1VarP));
    }

    @Override // h2.d
    public final void p(h2.h hVar) {
        u1 u1Var = (u1) hVar.y(y1.f34693a);
        u1 u1Var2 = this.f34625b;
        this.f34626c.setValue(new x(u1Var2, u1Var));
        this.f34627d.setValue(new r1(u1Var, u1Var2));
    }
}
