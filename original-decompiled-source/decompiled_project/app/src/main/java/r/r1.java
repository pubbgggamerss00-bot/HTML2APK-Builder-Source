package r;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.s implements eh.l<f3.p, f3.m> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f22917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(eh.l<? super Integer, Integer> lVar) {
        super(1);
        this.f22917a = (kotlin.jvm.internal.s) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // eh.l
    public final f3.m invoke(f3.p pVar) {
        return new f3.m((((Number) this.f22917a.invoke(Integer.valueOf((int) (pVar.f8826a >> 32)))).intValue() << 32) | (0 & BodyPartID.bodyIdMax));
    }
}
