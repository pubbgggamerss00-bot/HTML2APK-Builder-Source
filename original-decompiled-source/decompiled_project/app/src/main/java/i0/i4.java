package i0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class i4 extends kotlin.jvm.internal.s implements eh.q<g2.o0, g2.k0, f3.b, g2.m0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g4 f13366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(g4 g4Var) {
        super(3);
        this.f13366a = g4Var;
    }

    @Override // eh.q
    public final g2.m0 b(g2.o0 o0Var, g2.k0 k0Var, f3.b bVar) {
        long j10 = bVar.f8811a;
        long j11 = this.f13366a.f13305f;
        g2.g1 g1VarP = k0Var.P(f3.b.b(j10, jh.j.m((int) (j11 >> 32), f3.b.k(j10), f3.b.i(j10)), 0, jh.j.m((int) (j11 & BodyPartID.bodyIdMax), f3.b.j(j10), f3.b.h(j10)), 0, 10));
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new h4(g1VarP));
    }
}
