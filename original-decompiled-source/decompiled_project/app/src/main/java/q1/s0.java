package q1;

import androidx.compose.ui.d;
import g2.g1;

/* loaded from: classes.dex */
public final class s0 extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public eh.l<? super l1, pg.f0> f21730q;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f21731a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f21732b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.g1 g1Var, s0 s0Var) {
            super(1);
            this.f21731a = g1Var;
            this.f21732b = s0Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a.k(aVar, this.f21731a, 0, 0, this.f21732b.f21730q, 4);
            return pg.f0.f21461a;
        }
    }

    public s0(eh.l<? super l1, pg.f0> lVar) {
        this.f21730q = lVar;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(g1VarP, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f21730q + ')';
    }
}
