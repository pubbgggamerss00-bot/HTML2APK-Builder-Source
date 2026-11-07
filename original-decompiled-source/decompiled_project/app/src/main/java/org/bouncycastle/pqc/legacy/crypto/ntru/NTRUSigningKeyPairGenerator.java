package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.ntru.NTRUSigningPrivateKeyParameters;
import org.bouncycastle.pqc.legacy.math.ntru.euclid.BigIntEuclidean;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.BigDecimalPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.BigIntPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Resultant;

/* loaded from: classes3.dex */
public class NTRUSigningKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUSigningKeyGenerationParameters params;

    public class BasisGenerationTask implements Callable<NTRUSigningPrivateKeyParameters.Basis> {
        private BasisGenerationTask() {
        }

        @Override // java.util.concurrent.Callable
        public NTRUSigningPrivateKeyParameters.Basis call() throws Exception {
            return NTRUSigningKeyPairGenerator.this.generateBoundedBasis();
        }
    }

    public static class FGBasis extends NTRUSigningPrivateKeyParameters.Basis {
        public IntegerPolynomial F;
        public IntegerPolynomial G;

        public FGBasis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            super(polynomial, polynomial2, integerPolynomial, nTRUSigningKeyGenerationParameters);
            this.F = integerPolynomial2;
            this.G = integerPolynomial3;
        }

        public boolean isNormOk() {
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            double d10 = nTRUSigningKeyGenerationParameters.keyNormBoundSq;
            int i10 = nTRUSigningKeyGenerationParameters.f20516q;
            return ((double) this.F.centeredNormSq(i10)) < d10 && ((double) this.G.centeredNormSq(i10)) < d10;
        }
    }

    private FGBasis generateBasis() {
        boolean z10;
        Polynomial polynomialGenerateRandom;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial integerPolynomialInvertFq;
        int i10;
        Resultant resultant;
        Polynomial polynomialGenerateRandom2;
        IntegerPolynomial integerPolynomial2;
        int i11;
        Resultant resultant2;
        BigIntEuclidean bigIntEuclideanCalculate;
        BigIntPolynomial bigIntPolynomialRound;
        IntegerPolynomial integerPolynomialMult;
        Polynomial polynomial;
        NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
        int i12 = nTRUSigningKeyGenerationParameters.N;
        int i13 = nTRUSigningKeyGenerationParameters.f20516q;
        int i14 = nTRUSigningKeyGenerationParameters.f20512d;
        int i15 = nTRUSigningKeyGenerationParameters.f20513d1;
        int i16 = nTRUSigningKeyGenerationParameters.f20514d2;
        int i17 = nTRUSigningKeyGenerationParameters.f20515d3;
        int i18 = nTRUSigningKeyGenerationParameters.basisType;
        int i19 = 1;
        int i20 = (i12 * 2) + 1;
        boolean z11 = nTRUSigningKeyGenerationParameters.primeCheck;
        while (true) {
            z10 = z11;
            polynomialGenerateRandom = this.params.polyType == 0 ? DenseTernaryPolynomial.generateRandom(i12, i14 + 1, i14, CryptoServicesRegistrar.getSecureRandom()) : ProductFormPolynomial.generateRandom(i12, i15, i16, i17 + 1, i17, CryptoServicesRegistrar.getSecureRandom());
            integerPolynomial = polynomialGenerateRandom.toIntegerPolynomial();
            if ((!z10 || !integerPolynomial.resultant(i20).res.equals(BigInteger.ZERO)) && (integerPolynomialInvertFq = integerPolynomial.invertFq(i13)) != null) {
                break;
            }
            z11 = z10;
        }
        Resultant resultant3 = integerPolynomial.resultant();
        while (true) {
            if (this.params.polyType == 0) {
                i10 = i19;
                polynomialGenerateRandom2 = DenseTernaryPolynomial.generateRandom(i12, i14 + 1, i14, CryptoServicesRegistrar.getSecureRandom());
                resultant = resultant3;
            } else {
                i10 = i19;
                resultant = resultant3;
                polynomialGenerateRandom2 = ProductFormPolynomial.generateRandom(i12, i15, i16, i17 + 1, i17, CryptoServicesRegistrar.getSecureRandom());
            }
            integerPolynomial2 = polynomialGenerateRandom2.toIntegerPolynomial();
            int i21 = i15;
            if (z10) {
                i11 = i16;
                if (!integerPolynomial2.resultant(i20).res.equals(BigInteger.ZERO)) {
                }
                resultant3 = resultant;
                i19 = i10;
                i15 = i21;
                i16 = i11;
            } else {
                i11 = i16;
            }
            if (integerPolynomial2.invertFq(i13) != null) {
                resultant2 = integerPolynomial2.resultant();
                int i22 = i17;
                bigIntEuclideanCalculate = BigIntEuclidean.calculate(resultant.res, resultant2.res);
                int i23 = i14;
                if (bigIntEuclideanCalculate.gcd.equals(BigInteger.ONE)) {
                    break;
                }
                resultant3 = resultant;
                i19 = i10;
                i15 = i21;
                i16 = i11;
                i17 = i22;
                i14 = i23;
            } else {
                resultant3 = resultant;
                i19 = i10;
                i15 = i21;
                i16 = i11;
            }
        }
        BigIntPolynomial bigIntPolynomial = (BigIntPolynomial) resultant.rho.clone();
        bigIntPolynomial.mult(bigIntEuclideanCalculate.f20539x.multiply(BigInteger.valueOf(i13)));
        BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial) resultant2.rho.clone();
        bigIntPolynomial2.mult(bigIntEuclideanCalculate.f20540y.multiply(BigInteger.valueOf(-i13)));
        int i24 = 0;
        if (this.params.keyGenAlg == 0) {
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            iArr[0] = integerPolynomial.coeffs[0];
            iArr2[0] = integerPolynomial2.coeffs[0];
            for (int i25 = i10; i25 < i12; i25++) {
                int i26 = i12 - i25;
                iArr[i25] = integerPolynomial.coeffs[i26];
                iArr2[i25] = integerPolynomial2.coeffs[i26];
            }
            IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(iArr);
            IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(iArr2);
            IntegerPolynomial integerPolynomialMult2 = polynomialGenerateRandom.mult(integerPolynomial3);
            integerPolynomialMult2.add(polynomialGenerateRandom2.mult(integerPolynomial4));
            Resultant resultant4 = integerPolynomialMult2.resultant();
            BigIntPolynomial bigIntPolynomialMult = integerPolynomial3.mult(bigIntPolynomial2);
            bigIntPolynomialMult.add(integerPolynomial4.mult(bigIntPolynomial));
            bigIntPolynomialRound = bigIntPolynomialMult.mult(resultant4.rho);
            bigIntPolynomialRound.div(resultant4.res);
        } else {
            for (int i27 = i10; i27 < i12; i27 *= 10) {
                i24++;
            }
            BigDecimalPolynomial bigDecimalPolynomialDiv = resultant.rho.div(new BigDecimal(resultant.res), bigIntPolynomial2.getMaxCoeffLength() + 1 + i24);
            BigDecimalPolynomial bigDecimalPolynomialDiv2 = resultant2.rho.div(new BigDecimal(resultant2.res), bigIntPolynomial.getMaxCoeffLength() + 1 + i24);
            BigDecimalPolynomial bigDecimalPolynomialMult = bigDecimalPolynomialDiv.mult(bigIntPolynomial2);
            bigDecimalPolynomialMult.add(bigDecimalPolynomialDiv2.mult(bigIntPolynomial));
            bigDecimalPolynomialMult.halve();
            bigIntPolynomialRound = bigDecimalPolynomialMult.round();
        }
        BigIntPolynomial bigIntPolynomial3 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial3.sub(polynomialGenerateRandom.mult(bigIntPolynomialRound));
        BigIntPolynomial bigIntPolynomial4 = (BigIntPolynomial) bigIntPolynomial.clone();
        bigIntPolynomial4.sub(polynomialGenerateRandom2.mult(bigIntPolynomialRound));
        IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(bigIntPolynomial3);
        IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(bigIntPolynomial4);
        minimizeFG(integerPolynomial, integerPolynomial2, integerPolynomial5, integerPolynomial6, i12);
        if (i18 == 0) {
            integerPolynomialMult = polynomialGenerateRandom2.mult(integerPolynomialInvertFq, i13);
            polynomial = integerPolynomial5;
        } else {
            integerPolynomialMult = integerPolynomial5.mult(integerPolynomialInvertFq, i13);
            polynomial = polynomialGenerateRandom2;
        }
        integerPolynomialMult.modPositive(i13);
        return new FGBasis(polynomialGenerateRandom, polynomial, integerPolynomialMult, integerPolynomial5, integerPolynomial6, this.params);
    }

    private void minimizeFG(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, IntegerPolynomial integerPolynomial4, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = integerPolynomial.coeffs[i12];
            int i14 = integerPolynomial2.coeffs[i12];
            i11 += ((i14 * i14) + (i13 * i13)) * i10 * 2;
        }
        int i15 = i11 - 4;
        IntegerPolynomial integerPolynomial5 = (IntegerPolynomial) integerPolynomial.clone();
        IntegerPolynomial integerPolynomial6 = (IntegerPolynomial) integerPolynomial2.clone();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i10 && i17 < i10) {
            int i18 = 0;
            for (int i19 = 0; i19 < i10; i19++) {
                i18 += ((integerPolynomial3.coeffs[i19] * integerPolynomial.coeffs[i19]) + (integerPolynomial4.coeffs[i19] * integerPolynomial2.coeffs[i19])) * i10 * 4;
            }
            int iSumCoeffs = i18 - ((integerPolynomial4.sumCoeffs() + integerPolynomial3.sumCoeffs()) * 4);
            if (iSumCoeffs > i15) {
                integerPolynomial3.sub(integerPolynomial5);
                integerPolynomial4.sub(integerPolynomial6);
            } else if (iSumCoeffs < (-i15)) {
                integerPolynomial3.add(integerPolynomial5);
                integerPolynomial4.add(integerPolynomial6);
            } else {
                i17++;
                integerPolynomial5.rotate1();
                integerPolynomial6.rotate1();
            }
            i16++;
            i17 = 0;
            i17++;
            integerPolynomial5.rotate1();
            integerPolynomial6.rotate1();
        }
    }

    public NTRUSigningPrivateKeyParameters.Basis generateBoundedBasis() {
        FGBasis fGBasisGenerateBasis;
        do {
            fGBasisGenerateBasis = generateBasis();
        } while (!fGBasisGenerateBasis.isNormOk());
        return fGBasisGenerateBasis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        int i10 = this.params.B;
        while (true) {
            nTRUSigningPublicKeyParameters = null;
            Object[] objArr = 0;
            if (i10 < 0) {
                break;
            }
            arrayList.add(executorServiceNewCachedThreadPool.submit(new BasisGenerationTask()));
            i10--;
        }
        executorServiceNewCachedThreadPool.shutdown();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = this.params.B; i11 >= 0; i11--) {
            Future future = (Future) arrayList.get(i11);
            try {
                arrayList2.add((NTRUSigningPrivateKeyParameters.Basis) future.get());
                if (i11 == this.params.B) {
                    nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(((NTRUSigningPrivateKeyParameters.Basis) future.get()).f20523h, this.params.getSigningParameters());
                }
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList2, nTRUSigningPublicKeyParameters));
    }

    public AsymmetricCipherKeyPair generateKeyPairSingleThread() {
        ArrayList arrayList = new ArrayList();
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
        for (int i10 = this.params.B; i10 >= 0; i10--) {
            NTRUSigningPrivateKeyParameters.Basis basisGenerateBoundedBasis = generateBoundedBasis();
            arrayList.add(basisGenerateBoundedBasis);
            if (i10 == 0) {
                nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(basisGenerateBoundedBasis.f20523h, this.params.getSigningParameters());
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList, nTRUSigningPublicKeyParameters));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUSigningKeyGenerationParameters) keyGenerationParameters;
    }
}
