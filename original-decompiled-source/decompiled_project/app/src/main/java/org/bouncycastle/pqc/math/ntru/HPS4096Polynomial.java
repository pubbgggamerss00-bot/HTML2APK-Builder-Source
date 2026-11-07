package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* loaded from: classes3.dex */
public class HPS4096Polynomial extends HPSPolynomial {
    public HPS4096Polynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        for (int i10 = 0; i10 < this.params.packDegree() / 2; i10++) {
            short[] sArr = this.coeffs;
            int i11 = i10 * 2;
            int i12 = i10 * 3;
            int i13 = bArr[i12] & 255;
            byte b10 = bArr[i12 + 1];
            sArr[i11] = (short) (i13 | ((((short) (b10 & 255)) & 15) << 8));
            sArr[i11 + 1] = (short) (((((short) (bArr[i12 + 2] & 255)) & 255) << 4) | ((b10 & 255) >>> 4));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i10) {
        byte[] bArr = new byte[i10];
        int iQ = this.params.q();
        for (int i11 = 0; i11 < this.params.packDegree() / 2; i11++) {
            int i12 = i11 * 3;
            int i13 = i11 * 2;
            bArr[i12] = (byte) (Polynomial.modQ(this.coeffs[i13] & HPKE.aead_EXPORT_ONLY, iQ) & 255);
            int iModQ = Polynomial.modQ(this.coeffs[i13] & HPKE.aead_EXPORT_ONLY, iQ) >>> 8;
            int i14 = i13 + 1;
            bArr[i12 + 1] = (byte) (iModQ | ((Polynomial.modQ(this.coeffs[i14] & HPKE.aead_EXPORT_ONLY, iQ) & 15) << 4));
            bArr[i12 + 2] = (byte) (Polynomial.modQ(this.coeffs[i14] & HPKE.aead_EXPORT_ONLY, iQ) >>> 4);
        }
        return bArr;
    }
}
