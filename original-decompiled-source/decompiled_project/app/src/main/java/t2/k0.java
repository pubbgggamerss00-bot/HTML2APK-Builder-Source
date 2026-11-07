package t2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class k0 {
    public static final long a(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            z2.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j10 = (i11 & BodyPartID.bodyIdMax) | (i10 << 32);
        int i12 = j0.f27838c;
        return j10;
    }

    public static final long b(int i10, long j10) {
        int i11 = j0.f27838c;
        int i12 = (int) (j10 >> 32);
        int i13 = i12 < 0 ? 0 : i12;
        if (i13 > i10) {
            i13 = i10;
        }
        int i14 = (int) (BodyPartID.bodyIdMax & j10);
        int i15 = i14 >= 0 ? i14 : 0;
        if (i15 <= i10) {
            i10 = i15;
        }
        return (i13 == i12 && i10 == i14) ? j10 : a(i13, i10);
    }
}
