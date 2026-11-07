package r;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.s implements eh.q<g2.o0, g2.k0, f3.b, g2.m0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Object, Boolean> f22812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.y1<Object> f22813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(eh.l<Object, Boolean> lVar, s.y1<Object> y1Var) {
        super(3);
        this.f22812a = lVar;
        this.f22813b = y1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2.m0 b(g2.o0 o0Var, g2.k0 k0Var, f3.b bVar) {
        long j10;
        g2.o0 o0Var2 = o0Var;
        g2.g1 g1VarP = k0Var.P(bVar.f8811a);
        if (o0Var2.I0()) {
            if (this.f22812a.invoke(this.f22813b.f24004d.getValue()).booleanValue()) {
                j10 = (g1VarP.f11382a << 32) | (g1VarP.f11383b & BodyPartID.bodyIdMax);
            } else {
                j10 = 0;
            }
        }
        return o0Var2.i0((int) (j10 >> 32), (int) (BodyPartID.bodyIdMax & j10), qg.a0.f22708a, new d0(g1VarP));
    }
}
