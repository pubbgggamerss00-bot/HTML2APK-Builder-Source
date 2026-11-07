package r;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.s implements eh.l<f3.p, f3.m> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, Integer> f22911a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q1(eh.l<? super Integer, Integer> lVar) {
        super(1);
        this.f22911a = lVar;
    }

    @Override // eh.l
    public final f3.m invoke(f3.p pVar) {
        return new f3.m((0 << 32) | (BodyPartID.bodyIdMax & this.f22911a.invoke(Integer.valueOf((int) (pVar.f8826a & BodyPartID.bodyIdMax))).intValue()));
    }
}
