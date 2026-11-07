package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: classes2.dex */
public class PKCS5S2ParametersGenerator extends PBEParametersGenerator {
    private Mac hMac;
    private byte[] state;

    public PKCS5S2ParametersGenerator() {
        this(DigestFactory.createSHA1());
    }

    private void F(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11) throws IllegalStateException, DataLengthException {
        if (i10 == 0) {
            throw new IllegalArgumentException("iteration count must be at least 1.");
        }
        if (bArr != null) {
            this.hMac.update(bArr, 0, bArr.length);
        }
        this.hMac.update(bArr2, 0, bArr2.length);
        this.hMac.doFinal(this.state, 0);
        byte[] bArr4 = this.state;
        System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
        for (int i12 = 1; i12 < i10; i12++) {
            Mac mac = this.hMac;
            byte[] bArr5 = this.state;
            mac.update(bArr5, 0, bArr5.length);
            this.hMac.doFinal(this.state, 0);
            int i13 = 0;
            while (true) {
                byte[] bArr6 = this.state;
                if (i13 != bArr6.length) {
                    int i14 = i11 + i13;
                    bArr3[i14] = (byte) (bArr6[i13] ^ bArr3[i14]);
                    i13++;
                }
            }
        }
    }

    private byte[] generateDerivedKey(int i10) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        int i11;
        int macSize = this.hMac.getMacSize();
        int i12 = ((i10 + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i12 * macSize];
        this.hMac.init(new KeyParameter(this.password));
        int i13 = 0;
        for (int i14 = 1; i14 <= i12; i14++) {
            while (true) {
                byte b10 = (byte) (bArr[i11] + 1);
                bArr[i11] = b10;
                i11 = b10 == 0 ? i11 - 1 : 3;
            }
            F(this.salt, this.iterationCount, bArr, bArr2, i13);
            i13 += macSize;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i10) {
        return generateDerivedParameters(i10);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        return new KeyParameter(generateDerivedKey(i11), 0, i11);
    }

    public PKCS5S2ParametersGenerator(Digest digest) {
        HMac hMac = new HMac(digest);
        this.hMac = hMac;
        this.state = new byte[hMac.getMacSize()];
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10, int i11) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] bArrGenerateDerivedKey = generateDerivedKey(i12 + i13);
        return new ParametersWithIV(new KeyParameter(bArrGenerateDerivedKey, 0, i12), bArrGenerateDerivedKey, i12, i13);
    }
}
