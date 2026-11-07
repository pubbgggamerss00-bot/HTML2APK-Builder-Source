package u;

import b0.a0;
import j3.o0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f28896a;

    public l(long j10) {
        this.f28896a = j10;
    }

    @Override // j3.o0
    public final long a(f3.n nVar, long j10, f3.r rVar, long j11) {
        int i10 = nVar.f8822a;
        long j12 = this.f28896a;
        return (a0.a(i10 + ((int) (j12 >> 32)), (int) (j11 >> 32), (int) (j10 >> 32), rVar == f3.r.f8828a) << 32) | (a0.a(nVar.f8823b + ((int) (j12 & BodyPartID.bodyIdMax)), (int) (j11 & BodyPartID.bodyIdMax), (int) (j10 & BodyPartID.bodyIdMax), true) & BodyPartID.bodyIdMax);
    }
}
