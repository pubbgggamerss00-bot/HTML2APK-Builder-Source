package z;

import j1.f;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.s implements eh.p<f3.p, f3.r, f3.m> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f34547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(f.a aVar) {
        super(2);
        this.f34547a = aVar;
    }

    @Override // eh.p
    public final f3.m invoke(f3.p pVar, f3.r rVar) {
        int i10 = (int) (pVar.f8826a >> 32);
        return new f3.m((this.f34547a.a(0, i10, rVar) << 32) | (0 & BodyPartID.bodyIdMax));
    }
}
