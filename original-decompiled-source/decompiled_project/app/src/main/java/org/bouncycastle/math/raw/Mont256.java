package org.bouncycastle.math.raw;

/* loaded from: classes3.dex */
public abstract class Mont256 {
    private static final long M = 4294967295L;

    public static int inverse32(int i10) {
        int i11 = (2 - (i10 * i10)) * i10;
        int i12 = (2 - (i10 * i11)) * i11;
        int i13 = (2 - (i10 * i12)) * i12;
        return (2 - (i10 * i13)) * i13;
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i10) {
        char c10 = 0;
        long j10 = 4294967295L;
        long j11 = iArr2[0] & 4294967295L;
        int i11 = 0;
        int i12 = 0;
        while (i11 < 8) {
            long j12 = iArr[i11] & j10;
            long j13 = j12 * j11;
            long j14 = (j13 & j10) + (iArr3[c10] & j10);
            char c11 = c10;
            long j15 = j10;
            long j16 = (((int) j14) * i10) & j15;
            long j17 = (iArr4[c11] & j15) * j16;
            char c12 = ' ';
            long j18 = ((j14 + (j17 & j15)) >>> 32) + (j13 >>> 32) + (j17 >>> 32);
            int i13 = 1;
            while (i13 < 8) {
                long j19 = (iArr2[i13] & j15) * j12;
                char c13 = c12;
                long j20 = (iArr4[i13] & j15) * j16;
                long j21 = (j19 & j15) + (j20 & j15) + (iArr3[i13] & j15) + j18;
                iArr3[i13 - 1] = (int) j21;
                j18 = (j21 >>> c13) + (j19 >>> c13) + (j20 >>> c13);
                i13++;
                c12 = c13;
                j11 = j11;
                j16 = j16;
            }
            char c14 = c12;
            long j22 = j18 + (i12 & j15);
            iArr3[7] = (int) j22;
            i12 = (int) (j22 >>> c14);
            i11++;
            c10 = c11;
            j10 = j15;
            j11 = j11;
        }
        if (i12 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c10 = 0;
        long j10 = 4294967295L;
        long j11 = iArr2[0] & 4294967295L;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= 8) {
                break;
            }
            long j12 = iArr[i10] & j10;
            long j13 = (j12 * j11) + (iArr3[c10] & j10);
            long j14 = j13 & j10;
            long j15 = (j13 >>> 32) + j14;
            int i12 = 1;
            for (int i13 = 8; i12 < i13; i13 = 8) {
                long j16 = j10;
                long j17 = (iArr2[i12] & j16) * j12;
                int i14 = i12;
                long j18 = (iArr4[i12] & j16) * j14;
                long j19 = (j17 & j16) + (j18 & j16) + (iArr3[i14] & j16) + j15;
                iArr3[i14 - 1] = (int) j19;
                j15 = (j19 >>> 32) + (j17 >>> 32) + (j18 >>> 32);
                i12 = i14 + 1;
                j10 = j16;
                j11 = j11;
            }
            long j20 = j15 + (i11 & j10);
            iArr3[7] = (int) j20;
            i11 = (int) (j20 >>> 32);
            i10++;
            j11 = j11;
            c10 = 0;
        }
        if (i11 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i10) {
        char c10 = 0;
        int i11 = 0;
        while (i11 < 8) {
            long j10 = (r5 * i10) & 4294967295L;
            long j11 = (((iArr2[c10] & 4294967295L) * j10) + (iArr[c10] & 4294967295L)) >>> 32;
            int i12 = 1;
            while (i12 < 8) {
                long j12 = ((iArr2[i12] & 4294967295L) * j10) + (iArr[i12] & 4294967295L) + j11;
                iArr[i12 - 1] = (int) j12;
                j11 = j12 >>> 32;
                i12++;
                i11 = i11;
            }
            iArr[7] = (int) j11;
            i11++;
            c10 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i10 = 0; i10 < 8; i10++) {
            long j10 = iArr[0] & 4294967295L;
            long j11 = j10;
            for (int i11 = 1; i11 < 8; i11++) {
                long j12 = ((iArr2[i11] & 4294967295L) * j10) + (iArr[i11] & 4294967295L) + j11;
                iArr[i11 - 1] = (int) j12;
                j11 = j12 >>> 32;
            }
            iArr[7] = (int) j11;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
