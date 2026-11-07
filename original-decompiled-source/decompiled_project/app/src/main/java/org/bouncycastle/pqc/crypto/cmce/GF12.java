package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;

/* loaded from: classes3.dex */
final class GF12 extends GF {
    private int gf_mul_ext_par(short s10, short s11, short s12, short s13) {
        int i10 = (s11 & 1) * s10;
        int i11 = (s13 & 1) * s12;
        for (int i12 = 1; i12 < 12; i12++) {
            int i13 = 1 << i12;
            i10 ^= (s11 & i13) * s10;
            i11 ^= (i13 & s13) * s12;
        }
        return i10 ^ i11;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_frac(short s10, short s11) {
        return gf_mul(gf_inv(s10), s11);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_inv(short s10) {
        short sGf_mul = gf_mul(gf_sq(s10), s10);
        short sGf_mul2 = gf_mul(gf_sq(gf_sq(sGf_mul)), sGf_mul);
        return gf_sq(gf_mul(gf_sq(gf_mul(gf_sq(gf_sq(gf_mul(gf_sq(gf_sq(gf_sq(gf_sq(sGf_mul2)))), sGf_mul2))), sGf_mul)), s10));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_mul(short s10, short s11) {
        int i10 = (s11 & 1) * s10;
        for (int i11 = 1; i11 < 12; i11++) {
            i10 ^= ((1 << i11) & s11) * s10;
        }
        return gf_reduce(i10);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public int gf_mul_ext(short s10, short s11) {
        int i10 = (s11 & 1) * s10;
        for (int i11 = 1; i11 < 12; i11++) {
            i10 ^= ((1 << i11) & s11) * s10;
        }
        return i10;
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public void gf_mul_poly(int i10, int[] iArr, short[] sArr, short[] sArr2, short[] sArr3, int[] iArr2) {
        iArr2[0] = gf_mul_ext(sArr2[0], sArr3[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            int i12 = i11 + i11;
            iArr2[i12 - 1] = 0;
            short s10 = sArr2[i11];
            short s11 = sArr3[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i11 + i13;
                iArr2[i14] = iArr2[i14] ^ gf_mul_ext_par(s10, sArr3[i13], sArr2[i13], s11);
            }
            iArr2[i12] = gf_mul_ext(s10, s11);
        }
        for (int i15 = (i10 - 1) * 2; i15 >= i10; i15--) {
            int i16 = iArr2[i15];
            for (int i17 = 0; i17 < iArr.length - 1; i17++) {
                int i18 = (i15 - i10) + iArr[i17];
                iArr2[i18] = iArr2[i18] ^ i16;
            }
            int i19 = i15 - i10;
            iArr2[i19] = (i16 << 1) ^ iArr2[i19];
        }
        for (int i20 = 0; i20 < i10; i20++) {
            sArr[i20] = gf_reduce(iArr2[i20]);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_reduce(int i10) {
        return (short) ((i10 >>> 21) ^ ((((i10 & 4095) ^ (i10 >>> 12)) ^ ((2093056 & i10) >>> 9)) ^ ((14680064 & i10) >>> 18)));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public short gf_sq(short s10) {
        return gf_reduce(Interleave.expand16to32(s10));
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public int gf_sq_ext(short s10) {
        return Interleave.expand16to32(s10);
    }

    @Override // org.bouncycastle.pqc.crypto.cmce.GF
    public void gf_sqr_poly(int i10, int[] iArr, short[] sArr, short[] sArr2, int[] iArr2) {
        iArr2[0] = gf_sq_ext(sArr2[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            int i12 = i11 + i11;
            iArr2[i12 - 1] = 0;
            iArr2[i12] = gf_sq_ext(sArr2[i11]);
        }
        for (int i13 = (i10 - 1) * 2; i13 >= i10; i13--) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < iArr.length - 1; i15++) {
                int i16 = (i13 - i10) + iArr[i15];
                iArr2[i16] = iArr2[i16] ^ i14;
            }
            int i17 = i13 - i10;
            iArr2[i17] = (i14 << 1) ^ iArr2[i17];
        }
        for (int i18 = 0; i18 < i10; i18++) {
            sArr[i18] = gf_reduce(iArr2[i18]);
        }
    }
}
