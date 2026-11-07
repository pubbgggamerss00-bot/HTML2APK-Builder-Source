package m0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g2 extends kotlin.jvm.internal.s implements eh.l<f3.k, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3.d f17337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<f3.p> f17338b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(f3.d dVar, x0.n1<f3.p> n1Var) {
        super(1);
        this.f17337a = dVar;
        this.f17338b = n1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(f3.k kVar) {
        float fB = f3.k.b(kVar.f8819a);
        f3.d dVar = this.f17337a;
        this.f17338b.setValue(new f3.p((dVar.b1(fB) << 32) | (dVar.b1(f3.k.a(r0)) & BodyPartID.bodyIdMax)));
        return pg.f0.f21461a;
    }
}
