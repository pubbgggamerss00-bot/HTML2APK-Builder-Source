package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class WotsPlus {
    private final SPHINCSPlusEngine engine;

    /* renamed from: w, reason: collision with root package name */
    private final int f20447w;

    public WotsPlus(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
        this.f20447w = sPHINCSPlusEngine.WOTS_W;
    }

    public void base_w(byte[] bArr, int i10, int i11, int[] iArr, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i13) {
            if (i15 == 0) {
                i15 += 8;
                i16 = bArr[i10];
                i10++;
            }
            i15 -= this.engine.WOTS_LOGW;
            iArr[i12] = (i16 >>> i15) & (i11 - 1);
            i14++;
            i12++;
        }
    }

    public byte[] chain(byte[] bArr, int i10, int i11, byte[] bArr2, ADRS adrs) {
        if (i11 == 0) {
            return Arrays.clone(bArr);
        }
        if (i10 + i11 > this.f20447w - 1) {
            return null;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            adrs.setHashAddress(i10 + i12);
            bArr = this.engine.F(bArr2, adrs, bArr);
        }
        return bArr;
    }

    public byte[] pkFromSig(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = adrs;
        ADRS adrs3 = new ADRS(adrs2);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr2, 0, this.f20447w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i10 >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i11 += (this.f20447w - 1) - iArr[i10];
            i10++;
        }
        int i12 = sPHINCSPlusEngine.WOTS_LEN2;
        int i13 = sPHINCSPlusEngine.WOTS_LOGW;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i11 << (8 - ((i12 * i13) % 8)));
        int i14 = 4 - (((i12 * i13) + 7) / 8);
        int i15 = this.f20447w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i14, i15, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        SPHINCSPlusEngine sPHINCSPlusEngine4 = this.engine;
        byte[] bArr4 = new byte[sPHINCSPlusEngine4.N];
        byte[][] bArr5 = new byte[sPHINCSPlusEngine4.WOTS_LEN][];
        int i16 = 0;
        while (i16 < this.engine.WOTS_LEN) {
            adrs2.setChainAddress(i16);
            int i17 = this.engine.N;
            System.arraycopy(bArr, i16 * i17, bArr4, 0, i17);
            byte[] bArr6 = bArr4;
            int i18 = iArr[i16];
            bArr5[i16] = chain(bArr6, i18, (this.f20447w - 1) - i18, bArr3, adrs2);
            i16++;
            adrs2 = adrs;
            bArr4 = bArr6;
        }
        adrs3.setType(1);
        adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr3, adrs3, Arrays.concatenate(bArr5));
    }

    public byte[] pkGen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        byte[][] bArr3 = new byte[this.engine.WOTS_LEN][];
        int i10 = 0;
        while (i10 < this.engine.WOTS_LEN) {
            ADRS adrs3 = new ADRS(adrs);
            adrs3.setType(5);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i10);
            adrs3.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs3);
            adrs3.setType(0);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i10);
            adrs3.setHashAddress(0);
            byte[] bArr4 = bArr2;
            bArr3[i10] = chain(bArrPRF, 0, this.f20447w - 1, bArr4, adrs3);
            i10++;
            bArr2 = bArr4;
        }
        adrs2.setType(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr3));
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr, 0, this.f20447w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i10 >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i11 += (this.f20447w - 1) - iArr[i10];
            i10++;
        }
        int i12 = sPHINCSPlusEngine.WOTS_LOGW;
        if (i12 % 8 != 0) {
            i11 <<= 8 - ((sPHINCSPlusEngine.WOTS_LEN2 * i12) % 8);
        }
        int i13 = ((sPHINCSPlusEngine.WOTS_LEN2 * i12) + 7) / 8;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i11);
        int i14 = 4 - i13;
        int i15 = this.f20447w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i14, i15, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        byte[][] bArr4 = new byte[this.engine.WOTS_LEN][];
        for (int i16 = 0; i16 < this.engine.WOTS_LEN; i16++) {
            adrs2.setType(5);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i16);
            adrs2.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr3, bArr2, adrs2);
            adrs2.setType(0);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i16);
            adrs2.setHashAddress(0);
            bArr4[i16] = chain(bArrPRF, 0, iArr[i16], bArr3, adrs2);
        }
        return Arrays.concatenate(bArr4);
    }
}
