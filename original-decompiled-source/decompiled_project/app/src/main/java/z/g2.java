package z;

import j1.f;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g2 extends kotlin.jvm.internal.s implements eh.p<f3.p, f3.r, f3.m> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.b f34522a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(f.b bVar) {
        super(2);
        this.f34522a = bVar;
    }

    @Override // eh.p
    public final f3.m invoke(f3.p pVar, f3.r rVar) {
        return new f3.m((BodyPartID.bodyIdMax & this.f34522a.a(0, (int) (pVar.f8826a & BodyPartID.bodyIdMax))) | (0 << 32));
    }
}
