package r;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.s implements eh.l<f3.p, f3.p> {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f22886a = new m1(1);

    @Override // eh.l
    public final f3.p invoke(f3.p pVar) {
        long j10 = pVar.f8826a;
        long j11 = 0;
        return new f3.p((j11 & BodyPartID.bodyIdMax) | (j11 << 32));
    }
}
