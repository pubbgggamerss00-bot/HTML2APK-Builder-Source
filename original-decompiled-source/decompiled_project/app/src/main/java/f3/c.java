package f3;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            l.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(0, i10, 0, i11);
    }

    public static final int c(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    public static final long d(long j10, long j11) {
        int i10 = (int) (j11 >> 32);
        int iK = b.k(j10);
        int i11 = b.i(j10);
        if (i10 < iK) {
            i10 = iK;
        }
        if (i10 <= i11) {
            i11 = i10;
        }
        int i12 = (int) (j11 & BodyPartID.bodyIdMax);
        int iJ = b.j(j10);
        int iH = b.h(j10);
        if (i12 < iJ) {
            i12 = iJ;
        }
        if (i12 <= iH) {
            iH = i12;
        }
        return (i11 << 32) | (iH & BodyPartID.bodyIdMax);
    }

    public static final long e(long j10, long j11) {
        int iK = b.k(j10);
        int i10 = b.i(j10);
        int iJ = b.j(j10);
        int iH = b.h(j10);
        int iK2 = b.k(j11);
        if (iK2 < iK) {
            iK2 = iK;
        }
        if (iK2 > i10) {
            iK2 = i10;
        }
        int i11 = b.i(j11);
        if (i11 >= iK) {
            iK = i11;
        }
        if (iK <= i10) {
            i10 = iK;
        }
        int iJ2 = b.j(j11);
        if (iJ2 < iJ) {
            iJ2 = iJ;
        }
        if (iJ2 > iH) {
            iJ2 = iH;
        }
        int iH2 = b.h(j11);
        if (iH2 >= iJ) {
            iJ = iH2;
        }
        if (iJ <= iH) {
            iH = iJ;
        }
        return a(iK2, i10, iJ2, iH);
    }

    public static final int f(int i10, long j10) {
        int iJ = b.j(j10);
        int iH = b.h(j10);
        if (i10 < iJ) {
            i10 = iJ;
        }
        return i10 > iH ? iH : i10;
    }

    public static final int g(int i10, long j10) {
        int iK = b.k(j10);
        int i11 = b.i(j10);
        if (i10 < iK) {
            i10 = iK;
        }
        return i10 > i11 ? i11 : i10;
    }

    public static final long h(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iC = c(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iC2 = c(i15);
        if (iC + iC2 > 31) {
            k(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iC2 - 13;
        return ((i16 & (~(i16 >> 31))) << 33) | ((i18 >> 1) + (i18 & 1)) | (i10 << 2) | (i12 << (iC2 + 2)) | ((i17 & (~(i17 >> 31))) << (iC2 + 33));
    }

    public static final long i(int i10, int i11, long j10) {
        int iK = b.k(j10) + i10;
        if (iK < 0) {
            iK = 0;
        }
        int i12 = b.i(j10);
        if (i12 != Integer.MAX_VALUE && (i12 = i12 + i10) < 0) {
            i12 = 0;
        }
        int iJ = b.j(j10) + i11;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = b.h(j10);
        return a(iK, i12, iJ, (iH == Integer.MAX_VALUE || (iH = iH + i11) >= 0) ? iH : 0);
    }

    public static /* synthetic */ long j(int i10, int i11, int i12, long j10) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return i(i10, i11, j10);
    }

    public static final void k(int i10, int i11) {
        throw new IllegalArgumentException(r1.f.a(i10, i11, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static final Void l(int i10) {
        throw new IllegalArgumentException(ad.b.b(i10, "Can't represent a size of ", " in Constraints"));
    }
}
