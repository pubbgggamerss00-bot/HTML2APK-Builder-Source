package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
class BENES13 extends BENES {
    public BENES13(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    public static void layer_ex(long[] jArr, long[] jArr2, int i10) {
        int i11 = 1 << i10;
        int i12 = 0;
        for (int i13 = 0; i13 < 128; i13 += i11 * 2) {
            int i14 = i13;
            while (i14 < i13 + i11) {
                long j10 = jArr[i14];
                int i15 = i14 + i11;
                long j11 = (jArr[i15] ^ j10) & jArr2[i12];
                jArr[i14] = j10 ^ j11;
                jArr[i15] = jArr[i15] ^ j11;
                i14++;
                i12++;
            }
        }
    }

    public static void layer_in(long[] jArr, long[] jArr2, int i10) {
        int i11 = 1 << i10;
        int i12 = 0;
        for (int i13 = 0; i13 < 64; i13 += i11 * 2) {
            for (int i14 = i13; i14 < i13 + i11; i14++) {
                long j10 = jArr[i14];
                int i15 = i14 + i11;
                int i16 = i12 + 1;
                long j11 = (jArr[i15] ^ j10) & jArr2[i12];
                jArr[i14] = j10 ^ j11;
                jArr[i15] = jArr[i15] ^ j11;
                int i17 = i14 + 64;
                long j12 = jArr[i17];
                int i18 = i17 + i11;
                i12 += 2;
                long j13 = jArr2[i16] & (jArr[i18] ^ j12);
                jArr[i17] = j12 ^ j13;
                jArr[i18] = jArr[i18] ^ j13;
            }
        }
    }

    public void apply_benes(byte[] bArr, byte[] bArr2, int i10) {
        int i11;
        int i12;
        int i13;
        long[] jArr = new long[128];
        long[] jArr2 = new long[128];
        long[] jArr3 = new long[64];
        long[] jArr4 = new long[64];
        if (i10 == 0) {
            i11 = (this.SYS_T * 2) + 40;
            i12 = 0;
        } else {
            i11 = (this.SYS_T * 2) + 12328;
            i12 = -1024;
        }
        for (int i14 = 0; i14 < 64; i14++) {
            int i15 = i14 * 16;
            jArr[i14] = Utils.load8(bArr, i15);
            jArr[i14 + 64] = Utils.load8(bArr, i15 + 8);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        int i16 = 0;
        while (true) {
            if (i16 > 6) {
                break;
            }
            for (int i17 = 0; i17 < 64; i17++) {
                jArr3[i17] = Utils.load8(bArr2, i11);
                i11 += 8;
            }
            i11 += i12;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i16);
            i16++;
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i18 = 0; i18 <= 5; i18++) {
            for (int i19 = 0; i19 < 64; i19++) {
                jArr3[i19] = Utils.load8(bArr2, i11);
                i11 += 8;
            }
            i11 += i12;
            layer_in(jArr, jArr3, i18);
        }
        for (int i20 = 4; i20 >= 0; i20--) {
            for (int i21 = 0; i21 < 64; i21++) {
                jArr3[i21] = Utils.load8(bArr2, i11);
                i11 += 8;
            }
            i11 += i12;
            layer_in(jArr, jArr3, i20);
        }
        BENES.transpose_64x64(jArr2, jArr, 0);
        BENES.transpose_64x64(jArr2, jArr, 64);
        for (i13 = 6; i13 >= 0; i13--) {
            for (int i22 = 0; i22 < 64; i22++) {
                jArr3[i22] = Utils.load8(bArr2, i11);
                i11 += 8;
            }
            i11 += i12;
            BENES.transpose_64x64(jArr4, jArr3);
            layer_ex(jArr2, jArr4, i13);
        }
        BENES.transpose_64x64(jArr, jArr2, 0);
        BENES.transpose_64x64(jArr, jArr2, 64);
        for (int i23 = 0; i23 < 64; i23++) {
            int i24 = i23 * 16;
            Utils.store8(bArr, i24, jArr[i23]);
            Utils.store8(bArr, i24 + 8, jArr[i23 + 64]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.BENES
    public void support_gen(short[] sArr, byte[] bArr) {
        int i10 = this.GFBITS;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, (1 << i10) / 8);
        for (int i11 = 0; i11 < this.GFBITS; i11++) {
            for (int i12 = 0; i12 < (1 << this.GFBITS) / 8; i12++) {
                bArr2[i11][i12] = 0;
            }
        }
        int i13 = 0;
        while (true) {
            int i14 = this.GFBITS;
            if (i13 >= (1 << i14)) {
                break;
            }
            short sBitrev = Utils.bitrev((short) i13, i14);
            for (int i15 = 0; i15 < this.GFBITS; i15++) {
                byte[] bArr3 = bArr2[i15];
                int i16 = i13 / 8;
                bArr3[i16] = (byte) (bArr3[i16] | (((sBitrev >> i15) & 1) << (i13 % 8)));
            }
            i13++;
        }
        for (int i17 = 0; i17 < this.GFBITS; i17++) {
            apply_benes(bArr2[i17], bArr, 0);
        }
        for (int i18 = 0; i18 < this.SYS_N; i18++) {
            sArr[i18] = 0;
            for (int i19 = this.GFBITS - 1; i19 >= 0; i19--) {
                short s10 = (short) (sArr[i18] << 1);
                sArr[i18] = s10;
                sArr[i18] = (short) (s10 | ((bArr2[i19][i18 / 8] >> (i18 % 8)) & 1));
            }
        }
    }
}
