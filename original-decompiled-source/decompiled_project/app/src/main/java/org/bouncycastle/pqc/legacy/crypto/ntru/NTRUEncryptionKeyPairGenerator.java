package org.bouncycastle.pqc.legacy.crypto.ntru;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.util.Util;

/* loaded from: classes3.dex */
public class NTRUEncryptionKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUEncryptionKeyGenerationParameters params;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        Polynomial polynomialGenerateRandomTernary;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial integerPolynomialInvertFq;
        DenseTernaryPolynomial denseTernaryPolynomialGenerateRandom;
        NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = this.params;
        int i10 = nTRUEncryptionKeyGenerationParameters.N;
        int i11 = nTRUEncryptionKeyGenerationParameters.f20504q;
        int i12 = nTRUEncryptionKeyGenerationParameters.f20503df;
        int i13 = nTRUEncryptionKeyGenerationParameters.df1;
        int i14 = nTRUEncryptionKeyGenerationParameters.df2;
        int i15 = nTRUEncryptionKeyGenerationParameters.df3;
        int i16 = nTRUEncryptionKeyGenerationParameters.dg;
        boolean z10 = nTRUEncryptionKeyGenerationParameters.fastFp;
        boolean z11 = nTRUEncryptionKeyGenerationParameters.sparse;
        IntegerPolynomial integerPolynomial2 = null;
        while (true) {
            NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters2 = this.params;
            int i17 = nTRUEncryptionKeyGenerationParameters2.polyType;
            if (z10) {
                polynomialGenerateRandomTernary = i17 == 0 ? Util.generateRandomTernary(i10, i12, i12, z11, nTRUEncryptionKeyGenerationParameters2.getRandom()) : ProductFormPolynomial.generateRandom(i10, i13, i14, i15, i15, nTRUEncryptionKeyGenerationParameters2.getRandom());
                integerPolynomial = polynomialGenerateRandomTernary.toIntegerPolynomial();
                integerPolynomial.mult(3);
                int[] iArr = integerPolynomial.coeffs;
                iArr[0] = iArr[0] + 1;
            } else {
                polynomialGenerateRandomTernary = i17 == 0 ? Util.generateRandomTernary(i10, i12, i12 - 1, z11, nTRUEncryptionKeyGenerationParameters2.getRandom()) : ProductFormPolynomial.generateRandom(i10, i13, i14, i15, i15 - 1, nTRUEncryptionKeyGenerationParameters2.getRandom());
                integerPolynomial = polynomialGenerateRandomTernary.toIntegerPolynomial();
                integerPolynomial2 = integerPolynomial.invertF3();
                if (integerPolynomial2 == null) {
                    continue;
                }
            }
            integerPolynomialInvertFq = integerPolynomial.invertFq(i11);
            if (integerPolynomialInvertFq != null) {
                break;
            }
        }
        if (z10) {
            integerPolynomial2 = new IntegerPolynomial(i10);
            integerPolynomial2.coeffs[0] = 1;
        }
        do {
            denseTernaryPolynomialGenerateRandom = DenseTernaryPolynomial.generateRandom(i10, i16, i16 - 1, this.params.getRandom());
        } while (denseTernaryPolynomialGenerateRandom.invertFq(i11) == null);
        IntegerPolynomial integerPolynomialMult = denseTernaryPolynomialGenerateRandom.mult(integerPolynomialInvertFq, i11);
        integerPolynomialMult.mult3(i11);
        integerPolynomialMult.ensurePositive(i11);
        denseTernaryPolynomialGenerateRandom.clear();
        integerPolynomialInvertFq.clear();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NTRUEncryptionPublicKeyParameters(integerPolynomialMult, this.params.getEncryptionParameters()), (AsymmetricKeyParameter) new NTRUEncryptionPrivateKeyParameters(integerPolynomialMult, polynomialGenerateRandomTernary, integerPolynomial2, this.params.getEncryptionParameters()));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUEncryptionKeyGenerationParameters) keyGenerationParameters;
    }
}
