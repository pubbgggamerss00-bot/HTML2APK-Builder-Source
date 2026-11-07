package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFCounterParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes2.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputDataCtrPrefix;
    private byte[] fixedInputData_afterCtr;
    private int generatedBytes;

    /* renamed from: h, reason: collision with root package name */
    private final int f19998h;
    private byte[] ios;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f19999k;
    private int maxSizeExcl;
    private final Mac prf;

    public KDFCounterBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f19998h = macSize;
        this.f19999k = new byte[macSize];
    }

    private void generateNext() throws IllegalStateException, DataLengthException {
        int i10 = (this.generatedBytes / this.f19998h) + 1;
        byte[] bArr = this.ios;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                    bArr[0] = (byte) (i10 >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i10 >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i10 >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i10;
        Mac mac = this.prf;
        byte[] bArr2 = this.fixedInputDataCtrPrefix;
        mac.update(bArr2, 0, bArr2.length);
        Mac mac2 = this.prf;
        byte[] bArr3 = this.ios;
        mac2.update(bArr3, 0, bArr3.length);
        Mac mac3 = this.prf;
        byte[] bArr4 = this.fixedInputData_afterCtr;
        mac3.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f19999k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        int i12 = this.generatedBytes;
        int i13 = i12 + i11;
        if (i13 < 0 || i13 >= this.maxSizeExcl) {
            throw new DataLengthException(x0.a.a(new StringBuilder("Current KDFCTR may only be used for "), this.maxSizeExcl, " bytes"));
        }
        if (i12 % this.f19998h == 0) {
            generateNext();
        }
        int i14 = this.generatedBytes;
        int i15 = this.f19998h;
        int i16 = i14 % i15;
        int iMin = Math.min(i15 - (i14 % i15), i11);
        System.arraycopy(this.f19999k, i16, bArr, i10, iMin);
        this.generatedBytes += iMin;
        int i17 = i11 - iMin;
        while (true) {
            i10 += iMin;
            if (i17 <= 0) {
                return i11;
            }
            generateNext();
            iMin = Math.min(this.f19998h, i17);
            System.arraycopy(this.f19999k, 0, bArr, i10, iMin);
            this.generatedBytes += iMin;
            i17 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) throws IllegalArgumentException {
        if (!(derivationParameters instanceof KDFCounterParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.fixedInputDataCtrPrefix = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.fixedInputData_afterCtr = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r10 = kDFCounterParameters.getR();
        this.ios = new byte[r10 / 8];
        BigInteger bigIntegerMultiply = TWO.pow(r10).multiply(BigInteger.valueOf(this.f19998h));
        this.maxSizeExcl = bigIntegerMultiply.compareTo(INTEGER_MAX) == 1 ? Integer.MAX_VALUE : bigIntegerMultiply.intValue();
        this.generatedBytes = 0;
    }
}
