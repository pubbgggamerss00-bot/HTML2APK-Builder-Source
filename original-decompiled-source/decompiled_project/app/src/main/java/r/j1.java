package r;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.s implements eh.l<f3.p, f3.p> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Integer, Integer> f22864a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j1(eh.l<? super Integer, Integer> lVar) {
        super(1);
        this.f22864a = lVar;
    }

    @Override // eh.l
    public final f3.p invoke(f3.p pVar) {
        long j10 = pVar.f8826a;
        return new f3.p((((int) (j10 >> 32)) << 32) | (BodyPartID.bodyIdMax & this.f22864a.invoke(Integer.valueOf((int) (j10 & BodyPartID.bodyIdMax))).intValue()));
    }
}
