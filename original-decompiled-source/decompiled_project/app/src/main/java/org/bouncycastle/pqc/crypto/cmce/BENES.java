package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
abstract class BENES {
    private static final long[] TRANSPOSE_MASKS = {6148914691236517205L, 3689348814741910323L, 1085102592571150095L, 71777214294589695L, 281470681808895L, BodyPartID.bodyIdMax};
    protected final int GFBITS;
    protected final int SYS_N;
    protected final int SYS_T;

    public BENES(int i10, int i11, int i12) {
        this.SYS_N = i10;
        this.SYS_T = i11;
        this.GFBITS = i12;
    }

    public static void transpose_64x64(long[] jArr, long[] jArr2) {
        transpose_64x64(jArr, jArr2, 0);
    }

    public abstract void support_gen(short[] sArr, byte[] bArr);

    public static void transpose_64x64(long[] jArr, long[] jArr2, int i10) {
        int i11;
        System.arraycopy(jArr2, i10, jArr, i10, 64);
        int i12 = 5;
        do {
            long j10 = TRANSPOSE_MASKS[i12];
            int i13 = 1 << i12;
            int i14 = i10;
            while (true) {
                i11 = i10 + 64;
                if (i14 >= i11) {
                    break;
                }
                for (int i15 = i14; i15 < i14 + i13; i15 += 4) {
                    long j11 = jArr[i15];
                    int i16 = i15 + 1;
                    long j12 = jArr[i16];
                    int i17 = i15 + 2;
                    long j13 = jArr[i17];
                    int i18 = i15 + 3;
                    long j14 = jArr[i18];
                    int i19 = i15 + i13;
                    long j15 = jArr[i19];
                    int i20 = i19 + 1;
                    long j16 = jArr[i20];
                    int i21 = i19 + 2;
                    long j17 = jArr[i21];
                    int i22 = i19 + 3;
                    long j18 = jArr[i22];
                    long j19 = ((j11 >>> i13) ^ j15) & j10;
                    long j20 = ((j12 >>> i13) ^ j16) & j10;
                    long j21 = ((j13 >>> i13) ^ j17) & j10;
                    long j22 = ((j14 >>> i13) ^ j18) & j10;
                    jArr[i15] = j11 ^ (j19 << i13);
                    jArr[i16] = (j20 << i13) ^ j12;
                    jArr[i17] = (j21 << i13) ^ j13;
                    jArr[i18] = j14 ^ (j22 << i13);
                    jArr[i19] = j15 ^ j19;
                    jArr[i20] = j16 ^ j20;
                    jArr[i21] = j17 ^ j21;
                    jArr[i22] = j18 ^ j22;
                }
                i14 += i13 * 2;
            }
            i12--;
        } while (i12 >= 2);
        do {
            long j23 = TRANSPOSE_MASKS[i12];
            int i23 = 1 << i12;
            for (int i24 = i10; i24 < i11; i24 += i23 * 2) {
                for (int i25 = i24; i25 < i24 + i23; i25++) {
                    long j24 = jArr[i25];
                    int i26 = i25 + i23;
                    long j25 = jArr[i26];
                    long j26 = ((j24 >>> i23) ^ j25) & j23;
                    jArr[i25] = j24 ^ (j26 << i23);
                    jArr[i26] = j25 ^ j26;
                }
            }
            i12--;
        } while (i12 >= 0);
    }
}
