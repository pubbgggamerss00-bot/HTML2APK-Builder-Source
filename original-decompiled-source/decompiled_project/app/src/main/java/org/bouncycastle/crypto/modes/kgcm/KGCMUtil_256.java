package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* loaded from: classes2.dex */
public class KGCMUtil_256 {
    public static final int SIZE = 4;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | (((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        boolean z10;
        char c10;
        long j10;
        int i10 = 0;
        long j11 = jArr[0];
        boolean z11 = true;
        long j12 = jArr[1];
        char c11 = 2;
        long j13 = jArr[2];
        char c12 = 3;
        long j14 = jArr[3];
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = jArr2[2];
        long j18 = jArr2[3];
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        while (true) {
            z10 = z11;
            c10 = c11;
            j10 = j13;
            if (i10 >= 64) {
                break;
            }
            long j24 = -(j11 & 1);
            j11 >>>= z10 ? 1L : 0L;
            j19 ^= j15 & j24;
            char c13 = c12;
            long j25 = -(j12 & 1);
            j12 >>>= z10 ? 1L : 0L;
            j20 = (j20 ^ (j16 & j24)) ^ (j15 & j25);
            j21 = (j21 ^ (j17 & j24)) ^ (j16 & j25);
            j22 = (j22 ^ (j18 & j24)) ^ (j17 & j25);
            j23 ^= j18 & j25;
            long j26 = j18 >> 63;
            j18 = (j18 << (z10 ? 1L : 0L)) | (j17 >>> 63);
            j17 = (j17 << (z10 ? 1L : 0L)) | (j16 >>> 63);
            j16 = (j15 >>> 63) | (j16 << (z10 ? 1L : 0L));
            j15 = (j15 << (z10 ? 1L : 0L)) ^ (j26 & 1061);
            i10++;
            c12 = c13;
            z11 = z10 ? 1 : 0;
            c11 = c10;
            j13 = j10;
            j14 = j14;
        }
        char c14 = c12;
        long j27 = j14;
        char c15 = '>';
        long j28 = (((j18 >>> 62) ^ j15) ^ (j18 >>> 59)) ^ (j18 >>> 54);
        long j29 = ((j18 ^ (j18 << c10)) ^ (j18 << 5)) ^ (j18 << 10);
        int i11 = 0;
        while (i11 < 64) {
            long j30 = -(j10 & 1);
            j10 >>>= z10 ? 1L : 0L;
            j19 ^= j29 & j30;
            char c16 = c15;
            long j31 = j28;
            long j32 = -(j27 & 1);
            j27 >>>= z10 ? 1L : 0L;
            long j33 = (j20 ^ (j28 & j30)) ^ (j29 & j32);
            j21 = (j21 ^ (j16 & j30)) ^ (j31 & j32);
            j22 = (j22 ^ (j17 & j30)) ^ (j16 & j32);
            j23 ^= j17 & j32;
            long j34 = j17 >> 63;
            j17 = (j17 << (z10 ? 1L : 0L)) | (j16 >>> 63);
            j16 = (j31 >>> 63) | (j16 << (z10 ? 1L : 0L));
            long j35 = (j31 << (z10 ? 1L : 0L)) | (j29 >>> 63);
            j29 = (j29 << (z10 ? 1L : 0L)) ^ (j34 & 1061);
            i11++;
            c15 = c16;
            j28 = j35;
            j20 = j33;
        }
        jArr3[0] = j19 ^ (((j23 ^ (j23 << c10)) ^ (j23 << 5)) ^ (j23 << 10));
        jArr3[z10 ? 1 : 0] = j20 ^ (((j23 >>> c15) ^ (j23 >>> 59)) ^ (j23 >>> 54));
        jArr3[c10] = j21;
        jArr3[c14] = j22;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = ((j13 >> 63) & 1061) ^ (j10 << 1);
        jArr2[1] = (j10 >>> 63) | (j11 << 1);
        jArr2[2] = (j12 << 1) | (j11 >>> 63);
        jArr2[3] = (j13 << 1) | (j12 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = j13 >>> 56;
        jArr2[0] = ((((j10 << 8) ^ j14) ^ (j14 << 2)) ^ (j14 << 5)) ^ (j14 << 10);
        jArr2[1] = (j10 >>> 56) | (j11 << 8);
        jArr2[2] = (j12 << 8) | (j11 >>> 56);
        jArr2[3] = (j13 << 8) | (j12 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i10 = 8;
        long[] jArr3 = new long[8];
        for (int i11 = 0; i11 < 4; i11++) {
            Interleave.expand64To128(jArr[i11], jArr3, i11 << 1);
        }
        while (true) {
            int i12 = i10 - 1;
            if (i12 < 4) {
                copy(jArr3, jArr2);
                return;
            }
            long j10 = jArr3[i12];
            int i13 = i10 - 5;
            jArr3[i13] = jArr3[i13] ^ ((((j10 << 2) ^ j10) ^ (j10 << 5)) ^ (j10 << 10));
            int i14 = i10 - 4;
            jArr3[i14] = ((j10 >>> 54) ^ ((j10 >>> 62) ^ (j10 >>> 59))) ^ jArr3[i14];
            i10 = i12;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }
}
