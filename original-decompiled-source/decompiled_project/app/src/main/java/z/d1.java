package z;

import androidx.compose.ui.d;
import g2.g1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class d1 extends d.c implements i2.b0 {

    /* renamed from: q, reason: collision with root package name */
    public eh.l<? super f3.d, f3.m> f34486q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34487r;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f34489b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g2.g1 f34490c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g2.o0 o0Var, g2.g1 g1Var) {
            super(1);
            this.f34489b = o0Var;
            this.f34490c = g1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            d1 d1Var = d1.this;
            long j10 = d1Var.f34486q.invoke(this.f34489b).f8820a;
            boolean z10 = d1Var.f34487r;
            g2.g1 g1Var = this.f34490c;
            if (z10) {
                g1.a.h(aVar2, g1Var, (int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax));
            } else {
                g1.a.k(aVar2, g1Var, (int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax), null, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public d1() {
        throw null;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        g2.g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new a(o0Var, g1VarP));
    }
}
