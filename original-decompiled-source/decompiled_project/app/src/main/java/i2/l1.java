package i2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class l1 extends g2.g1 {
    public l1(int i10, int i11) {
        o0((i11 & BodyPartID.bodyIdMax) | (i10 << 32));
    }

    @Override // g2.p0
    public final int Q(g2.a aVar) {
        return PKIFailureInfo.systemUnavail;
    }

    @Override // g2.g1
    public final void l0(float f10, long j10, eh.l lVar) {
    }
}
