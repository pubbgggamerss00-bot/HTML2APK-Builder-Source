package t0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class le extends kotlin.jvm.internal.s implements eh.l<f3.d, f3.m> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.r3<f3.h> f26393a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(x0.r3<f3.h> r3Var) {
        super(1);
        this.f26393a = r3Var;
    }

    @Override // eh.l
    public final f3.m invoke(f3.d dVar) {
        return new f3.m((dVar.b1(this.f26393a.getValue().f8817a) << 32) | (0 & BodyPartID.bodyIdMax));
    }
}
