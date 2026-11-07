package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.HRSSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class NTRUSampling {
    private final NTRUParameterSet params;

    public NTRUSampling(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
    }

    private static int mod3(int i10) {
        return i10 % 3;
    }

    public PolynomialPair sampleFg(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair(sampleIidPlus(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleIidPlus(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException("Invalid polynomial type");
    }

    public HPSPolynomial sampleFixedType(byte[] bArr) {
        int i10;
        int i11;
        int iN = this.params.n();
        int iWeight = ((NTRUHPSParameterSet) this.params).weight();
        HPSPolynomial hPSPolynomial = new HPSPolynomial((NTRUHPSParameterSet) this.params);
        int i12 = iN - 1;
        int[] iArr = new int[i12];
        int i13 = 0;
        while (true) {
            i10 = i12 / 4;
            if (i13 >= i10) {
                break;
            }
            int i14 = i13 * 4;
            int i15 = i13 * 15;
            iArr[i14] = ((bArr[i15] & 255) << 2) + ((bArr[i15 + 1] & 255) << 10) + ((bArr[i15 + 2] & 255) << 18) + ((bArr[i15 + 3] & 255) << 26);
            iArr[i14 + 1] = ((bArr[(i13 * 3) + 15] & 192) >> 4) + ((bArr[i15 + 4] & 255) << 4) + ((bArr[i15 + 5] & 255) << 12) + ((bArr[i15 + 6] & 255) << 20) + ((bArr[i15 + 7] & 255) << 28);
            int i16 = ((bArr[(i13 * 7) + 15] & 240) >> 2) + ((bArr[i15 + 8] & 255) << 6) + ((bArr[i15 + 9] & 255) << 14) + ((bArr[i15 + 10] & 255) << 22);
            byte b10 = bArr[i15 + 11];
            iArr[i14 + 2] = i16 + ((b10 & 255) << 30);
            iArr[i14 + 3] = (b10 & 252) + ((bArr[i15 + 12] & 255) << 8) + ((bArr[i15 + 13] & 255) << 16) + ((bArr[i15 + 14] & 255) << 24);
            i13++;
        }
        int i17 = i10 * 4;
        if (i12 > i17) {
            int i18 = i10 * 15;
            iArr[i17] = ((bArr[i18] & 255) << 2) + ((bArr[i18 + 1] & 255) << 10) + ((bArr[i18 + 2] & 255) << 18) + ((bArr[i18 + 3] & 255) << 26);
            iArr[i17 + 1] = ((bArr[(i10 * 3) + 15] & 192) >> 4) + ((bArr[i18 + 4] & 255) << 4) + ((bArr[i18 + 5] & 255) << 12) + ((bArr[i18 + 6] & 255) << 20) + ((bArr[i18 + 7] & 255) << 28);
        }
        int i19 = 0;
        while (true) {
            i11 = iWeight / 2;
            if (i19 >= i11) {
                break;
            }
            iArr[i19] = iArr[i19] | 1;
            i19++;
        }
        while (i11 < iWeight) {
            iArr[i11] = iArr[i11] | 2;
            i11++;
        }
        java.util.Arrays.sort(iArr);
        for (int i20 = 0; i20 < i12; i20++) {
            hPSPolynomial.coeffs[i20] = (short) (iArr[i20] & 3);
        }
        hPSPolynomial.coeffs[i12] = 0;
        return hPSPolynomial;
    }

    public Polynomial sampleIid(byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        for (int i10 = 0; i10 < this.params.n() - 1; i10++) {
            polynomialCreatePolynomial.coeffs[i10] = (short) mod3(bArr[i10] & 255);
        }
        polynomialCreatePolynomial.coeffs[this.params.n() - 1] = 0;
        return polynomialCreatePolynomial;
    }

    public HRSSPolynomial sampleIidPlus(byte[] bArr) {
        int i10;
        int iN = this.params.n();
        HRSSPolynomial hRSSPolynomial = (HRSSPolynomial) sampleIid(bArr);
        int i11 = 0;
        while (true) {
            i10 = iN - 1;
            if (i11 >= i10) {
                break;
            }
            short[] sArr = hRSSPolynomial.coeffs;
            short s10 = sArr[i11];
            sArr[i11] = (short) (s10 | (-(s10 >>> 1)));
            i11++;
        }
        int i12 = 0;
        short s11 = 0;
        while (i12 < i10) {
            short[] sArr2 = hRSSPolynomial.coeffs;
            int i13 = i12 + 1;
            s11 = (short) (s11 + ((short) (sArr2[i13] * sArr2[i12])));
            i12 = i13;
        }
        short s12 = (short) ((-((s11 & HPKE.aead_EXPORT_ONLY) >>> 15)) | 1);
        for (int i14 = 0; i14 < i10; i14 += 2) {
            short[] sArr3 = hRSSPolynomial.coeffs;
            sArr3[i14] = (short) (sArr3[i14] * s12);
        }
        for (int i15 = 0; i15 < i10; i15++) {
            short[] sArr4 = hRSSPolynomial.coeffs;
            short s13 = sArr4[i15];
            sArr4[i15] = (short) ((((s13 & HPKE.aead_EXPORT_ONLY) >>> 15) ^ (s13 & HPKE.aead_EXPORT_ONLY)) & 3);
        }
        return hRSSPolynomial;
    }

    public PolynomialPair sampleRm(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params;
        if (nTRUParameterSet instanceof NTRUHRSSParameterSet) {
            return new PolynomialPair((HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), (HRSSPolynomial) sampleIid(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        if (nTRUParameterSet instanceof NTRUHPSParameterSet) {
            return new PolynomialPair((HPSPolynomial) sampleIid(Arrays.copyOfRange(bArr, 0, nTRUParameterSet.sampleIidBytes())), sampleFixedType(Arrays.copyOfRange(bArr, this.params.sampleIidBytes(), bArr.length)));
        }
        throw new IllegalArgumentException("Invalid polynomial type");
    }
}
