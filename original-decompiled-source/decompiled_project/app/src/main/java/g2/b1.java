package g2;

import androidx.compose.ui.d;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class b1 extends d.c implements i2.a0 {

    /* renamed from: q, reason: collision with root package name */
    public eh.l<? super f3.p, pg.f0> f11318q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f11319r = true;

    /* renamed from: s, reason: collision with root package name */
    public long f11320s;

    public b1(eh.l<? super f3.p, pg.f0> lVar) {
        this.f11318q = lVar;
        long j10 = PKIFailureInfo.systemUnavail;
        this.f11320s = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return this.f11319r;
    }

    @Override // i2.a0
    public final void O(long j10) {
        if (f3.p.b(this.f11320s, j10)) {
            return;
        }
        this.f11318q.invoke(new f3.p(j10));
        this.f11320s = j10;
    }
}
