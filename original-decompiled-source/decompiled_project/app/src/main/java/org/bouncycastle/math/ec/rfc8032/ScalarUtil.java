package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
abstract class ScalarUtil {
    private static final long M = 4294967295L;

    public static void addShifted_NP(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i12 = i10;
        int[] iArr5 = iArr3;
        char c10 = ' ';
        int i13 = 0;
        long j10 = 4294967295L;
        long j11 = 0;
        if (i11 == 0) {
            long j12 = 0;
            while (i13 <= i12) {
                long j13 = iArr5[i13] & 4294967295L;
                long j14 = j12 + j13 + (iArr2[i13] & 4294967295L);
                int i14 = (int) j14;
                j12 = j14 >>> 32;
                iArr5[i13] = i14;
                long j15 = j11 + (iArr[i13] & 4294967295L) + j13 + (i14 & 4294967295L);
                iArr[i13] = (int) j15;
                j11 = j15 >>> 32;
                i13++;
            }
            return;
        }
        if (i11 < 32) {
            int i15 = 0;
            long j16 = 0;
            long j17 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i13 <= i12) {
                int i18 = iArr5[i13];
                char c11 = c10;
                int i19 = -i11;
                long j18 = j10;
                long j19 = j16 + (iArr[i13] & j18) + (((i15 >>> i19) | (i18 << i11)) & j18);
                int i20 = iArr2[i13];
                long j20 = j17 + (i18 & j18) + (((i20 << i11) | (i16 >>> i19)) & j18);
                int i21 = (int) j20;
                j17 = j20 >>> c11;
                iArr5[i13] = i21;
                long j21 = j19 + (((i17 >>> i19) | (i21 << i11)) & j18);
                iArr[i13] = (int) j21;
                j16 = j21 >>> c11;
                i13++;
                i16 = i20;
                i17 = i21;
                i15 = i18;
                c10 = c11;
                j10 = j18;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i12);
        int i22 = i11 >>> 5;
        int i23 = i11 & 31;
        if (i23 == 0) {
            long j22 = 0;
            for (int i24 = i22; i24 <= i12; i24++) {
                int i25 = i24 - i22;
                long j23 = j22 + (iArr5[i24] & 4294967295L) + (iArr2[i25] & 4294967295L);
                iArr5[i24] = (int) j23;
                j22 = j23 >>> 32;
                long j24 = j11 + (iArr[i24] & 4294967295L) + (iArr4[i25] & 4294967295L) + (iArr5[i25] & 4294967295L);
                iArr[i24] = (int) j24;
                j11 = j24 >>> 32;
            }
            return;
        }
        int i26 = i22;
        int i27 = 0;
        int i28 = 0;
        long j25 = 0;
        while (i26 <= i12) {
            int i29 = i26 - i22;
            int i30 = iArr4[i29];
            int i31 = -i23;
            long j26 = j11 + (iArr[i26] & 4294967295L) + (((i13 >>> i31) | (i30 << i23)) & 4294967295L);
            int i32 = iArr2[i29];
            long j27 = j25 + (iArr5[i26] & 4294967295L) + (((i32 << r21) | (i27 >>> i31)) & 4294967295L);
            iArr3[i26] = (int) j27;
            j25 = j27 >>> 32;
            int i33 = iArr3[i29];
            long j28 = j26 + (((i33 << r21) | (i28 >>> i31)) & 4294967295L);
            iArr[i26] = (int) j28;
            j11 = j28 >>> 32;
            i26++;
            i23 = i23;
            iArr5 = iArr3;
            i28 = i33;
            i27 = i32;
            i13 = i30;
            i12 = i10;
        }
    }

    public static void addShifted_UV(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        char c10 = ' ';
        long j10 = 4294967295L;
        long j11 = 0;
        if (i13 == 0) {
            long j12 = 0;
            for (int i14 = i12; i14 <= i10; i14++) {
                int i15 = i14 - i12;
                long j13 = j11 + (iArr[i14] & 4294967295L) + (iArr3[i15] & 4294967295L);
                long j14 = j12 + (iArr2[i14] & 4294967295L) + (iArr4[i15] & 4294967295L);
                iArr[i14] = (int) j13;
                j11 = j13 >>> 32;
                iArr2[i14] = (int) j14;
                j12 = j14 >>> 32;
            }
            return;
        }
        int i16 = i12;
        int i17 = 0;
        int i18 = 0;
        long j15 = 0;
        while (i16 <= i10) {
            int i19 = i16 - i12;
            int i20 = iArr3[i19];
            int i21 = iArr4[i19];
            char c11 = c10;
            long j16 = j10;
            long j17 = j11 + (iArr[i16] & j16);
            long j18 = j17 + (((i17 >>> (-i13)) | (i20 << i13)) & j16);
            long j19 = j15 + (iArr2[i16] & j16) + (((i18 >>> r3) | (i21 << i13)) & j16);
            iArr[i16] = (int) j18;
            j11 = j18 >>> c11;
            iArr2[i16] = (int) j19;
            j15 = j19 >>> c11;
            i16++;
            c10 = c11;
            i18 = i21;
            i17 = i20;
            j10 = j16;
        }
    }

    public static int getBitLength(int i10, int[] iArr) {
        int i11 = iArr[i10] >> 31;
        while (i10 > 0 && iArr[i10] == i11) {
            i10--;
        }
        return ((i10 * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i10] ^ i11);
    }

    public static int getBitLengthPositive(int i10, int[] iArr) {
        while (i10 > 0 && iArr[i10] == 0) {
            i10--;
        }
        return ((i10 * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i10]);
    }

    public static boolean lessThan(int i10, int[] iArr, int[] iArr2) {
        do {
            int i11 = iArr[i10] + PKIFailureInfo.systemUnavail;
            int i12 = iArr2[i10] + PKIFailureInfo.systemUnavail;
            if (i11 < i12) {
                return true;
            }
            if (i11 > i12) {
                return false;
            }
            i10--;
        } while (i10 >= 0);
        return false;
    }

    public static void subShifted_NP(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i12 = i10;
        int[] iArr5 = iArr3;
        char c10 = ' ';
        int i13 = 0;
        long j10 = 4294967295L;
        long j11 = 0;
        if (i11 == 0) {
            long j12 = 0;
            while (i13 <= i12) {
                long j13 = iArr5[i13] & 4294967295L;
                long j14 = (j12 + j13) - (iArr2[i13] & 4294967295L);
                int i14 = (int) j14;
                j12 = j14 >> 32;
                iArr5[i13] = i14;
                long j15 = ((j11 + (iArr[i13] & 4294967295L)) - j13) - (i14 & 4294967295L);
                iArr[i13] = (int) j15;
                j11 = j15 >> 32;
                i13++;
            }
            return;
        }
        if (i11 < 32) {
            int i15 = 0;
            long j16 = 0;
            long j17 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i13 <= i12) {
                int i18 = iArr5[i13];
                char c11 = c10;
                int i19 = -i11;
                long j18 = j10;
                long j19 = (j16 + (iArr[i13] & j18)) - (((i15 >>> i19) | (i18 << i11)) & j18);
                int i20 = iArr2[i13];
                long j20 = (j17 + (i18 & j18)) - (((i20 << i11) | (i16 >>> i19)) & j18);
                int i21 = (int) j20;
                j17 = j20 >> c11;
                iArr5[i13] = i21;
                long j21 = j19 - (((i17 >>> i19) | (i21 << i11)) & j18);
                iArr[i13] = (int) j21;
                j16 = j21 >> c11;
                i13++;
                i16 = i20;
                i17 = i21;
                i15 = i18;
                c10 = c11;
                j10 = j18;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i12);
        int i22 = i11 >>> 5;
        int i23 = i11 & 31;
        if (i23 == 0) {
            long j22 = 0;
            for (int i24 = i22; i24 <= i12; i24++) {
                int i25 = i24 - i22;
                long j23 = (j22 + (iArr5[i24] & 4294967295L)) - (iArr2[i25] & 4294967295L);
                iArr5[i24] = (int) j23;
                j22 = j23 >> 32;
                long j24 = ((j11 + (iArr[i24] & 4294967295L)) - (iArr4[i25] & 4294967295L)) - (iArr5[i25] & 4294967295L);
                iArr[i24] = (int) j24;
                j11 = j24 >> 32;
            }
            return;
        }
        int i26 = i22;
        int i27 = 0;
        int i28 = 0;
        long j25 = 0;
        while (i26 <= i12) {
            int i29 = i26 - i22;
            int i30 = iArr4[i29];
            int i31 = -i23;
            long j26 = (j11 + (iArr[i26] & 4294967295L)) - (((i13 >>> i31) | (i30 << i23)) & 4294967295L);
            int i32 = iArr2[i29];
            long j27 = (j25 + (iArr5[i26] & 4294967295L)) - (((i32 << r21) | (i27 >>> i31)) & 4294967295L);
            iArr3[i26] = (int) j27;
            j25 = j27 >> 32;
            int i33 = iArr3[i29];
            long j28 = j26 - (((i33 << r21) | (i28 >>> i31)) & 4294967295L);
            iArr[i26] = (int) j28;
            j11 = j28 >> 32;
            i26++;
            i23 = i23;
            iArr5 = iArr3;
            i28 = i33;
            i27 = i32;
            i13 = i30;
            i12 = i10;
        }
    }

    public static void subShifted_UV(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        char c10 = ' ';
        long j10 = 4294967295L;
        long j11 = 0;
        if (i13 == 0) {
            long j12 = 0;
            for (int i14 = i12; i14 <= i10; i14++) {
                int i15 = i14 - i12;
                long j13 = (j11 + (iArr[i14] & 4294967295L)) - (iArr3[i15] & 4294967295L);
                long j14 = (j12 + (iArr2[i14] & 4294967295L)) - (iArr4[i15] & 4294967295L);
                iArr[i14] = (int) j13;
                j11 = j13 >> 32;
                iArr2[i14] = (int) j14;
                j12 = j14 >> 32;
            }
            return;
        }
        int i16 = i12;
        int i17 = 0;
        int i18 = 0;
        long j15 = 0;
        while (i16 <= i10) {
            int i19 = i16 - i12;
            int i20 = iArr3[i19];
            int i21 = iArr4[i19];
            char c11 = c10;
            long j16 = j10;
            long j17 = j11 + (iArr[i16] & j16);
            long j18 = j17 - (((i17 >>> (-i13)) | (i20 << i13)) & j16);
            long j19 = (j15 + (iArr2[i16] & j16)) - (((i18 >>> r3) | (i21 << i13)) & j16);
            iArr[i16] = (int) j18;
            j11 = j18 >> c11;
            iArr2[i16] = (int) j19;
            j15 = j19 >> c11;
            i16++;
            c10 = c11;
            i18 = i21;
            i17 = i20;
            j10 = j16;
        }
    }
}
