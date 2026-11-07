package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.nio.ByteBuffer;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import x0.a;

/* loaded from: classes3.dex */
public class NTRUSigner {
    private Digest hashAlg;
    private NTRUSigningParameters params;
    private NTRUSigningPrivateKeyParameters signingKeyPair;
    private NTRUSigningPublicKeyParameters verificationKey;

    public NTRUSigner(NTRUSigningParameters nTRUSigningParameters) {
        this.params = nTRUSigningParameters;
    }

    private IntegerPolynomial sign(IntegerPolynomial integerPolynomial, NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i10 = nTRUSigningParameters.N;
        int i11 = nTRUSigningParameters.f20521q;
        int i12 = nTRUSigningParameters.B;
        NTRUSigningPublicKeyParameters publicKey = nTRUSigningPrivateKeyParameters.getPublicKey();
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i10);
        while (i12 >= 1) {
            Polynomial polynomial = nTRUSigningPrivateKeyParameters.getBasis(i12).f20522f;
            Polynomial polynomial2 = nTRUSigningPrivateKeyParameters.getBasis(i12).fPrime;
            IntegerPolynomial integerPolynomialMult = polynomial.mult(integerPolynomial);
            integerPolynomialMult.div(i11);
            IntegerPolynomial integerPolynomialMult2 = polynomial2.mult(integerPolynomialMult);
            IntegerPolynomial integerPolynomialMult3 = polynomial2.mult(integerPolynomial);
            integerPolynomialMult3.div(i11);
            integerPolynomialMult2.sub(polynomial.mult(integerPolynomialMult3));
            integerPolynomial2.add(integerPolynomialMult2);
            IntegerPolynomial integerPolynomial3 = (IntegerPolynomial) nTRUSigningPrivateKeyParameters.getBasis(i12).f20523h.clone();
            integerPolynomial3.sub(i12 > 1 ? nTRUSigningPrivateKeyParameters.getBasis(i12 - 1).f20523h : publicKey.f20524h);
            integerPolynomial = integerPolynomialMult2.mult(integerPolynomial3, i11);
            i12--;
        }
        Polynomial polynomial3 = nTRUSigningPrivateKeyParameters.getBasis(0).f20522f;
        Polynomial polynomial4 = nTRUSigningPrivateKeyParameters.getBasis(0).fPrime;
        IntegerPolynomial integerPolynomialMult4 = polynomial3.mult(integerPolynomial);
        integerPolynomialMult4.div(i11);
        IntegerPolynomial integerPolynomialMult5 = polynomial4.mult(integerPolynomialMult4);
        IntegerPolynomial integerPolynomialMult6 = polynomial4.mult(integerPolynomial);
        integerPolynomialMult6.div(i11);
        integerPolynomialMult5.sub(polynomial3.mult(integerPolynomialMult6));
        integerPolynomial2.add(integerPolynomialMult5);
        integerPolynomial2.modPositive(i11);
        return integerPolynomial2;
    }

    private byte[] signHash(byte[] bArr, NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters) {
        IntegerPolynomial integerPolynomialCreateMsgRep;
        IntegerPolynomial integerPolynomialSign;
        NTRUSigningPublicKeyParameters publicKey = nTRUSigningPrivateKeyParameters.getPublicKey();
        int i10 = 0;
        do {
            i10++;
            if (i10 > this.params.signFailTolerance) {
                throw new IllegalStateException(a.a(new StringBuilder("Signing failed: too many retries (max="), this.params.signFailTolerance, ")"));
            }
            integerPolynomialCreateMsgRep = createMsgRep(bArr, i10);
            integerPolynomialSign = sign(integerPolynomialCreateMsgRep, nTRUSigningPrivateKeyParameters);
        } while (!verify(integerPolynomialCreateMsgRep, integerPolynomialSign, publicKey.f20524h));
        byte[] binary = integerPolynomialSign.toBinary(this.params.f20521q);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(binary.length + 4);
        byteBufferAllocate.put(binary);
        byteBufferAllocate.putInt(i10);
        return byteBufferAllocate.array();
    }

    private boolean verify(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i10 = nTRUSigningParameters.f20521q;
        double d10 = nTRUSigningParameters.normBoundSq;
        double d11 = nTRUSigningParameters.betaSq;
        IntegerPolynomial integerPolynomialMult = integerPolynomial3.mult(integerPolynomial2, i10);
        integerPolynomialMult.sub(integerPolynomial);
        return ((double) ((long) ((d11 * ((double) integerPolynomialMult.centeredNormSq(i10))) + ((double) integerPolynomial2.centeredNormSq(i10))))) <= d10;
    }

    private boolean verifyHash(byte[] bArr, byte[] bArr2, NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        byte[] bArr3 = new byte[bArr2.length - 4];
        byteBufferWrap.get(bArr3);
        NTRUSigningParameters nTRUSigningParameters = this.params;
        return verify(createMsgRep(bArr, byteBufferWrap.getInt()), IntegerPolynomial.fromBinary(bArr3, nTRUSigningParameters.N, nTRUSigningParameters.f20521q), nTRUSigningPublicKeyParameters.f20524h);
    }

    public IntegerPolynomial createMsgRep(byte[] bArr, int i10) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i11 = nTRUSigningParameters.N;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(nTRUSigningParameters.f20521q);
        int i12 = 31 - iNumberOfLeadingZeros;
        int i13 = (38 - iNumberOfLeadingZeros) / 8;
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i11);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 4);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.putInt(i10);
        NTRUSignerPrng nTRUSignerPrng = new NTRUSignerPrng(byteBufferAllocate.array(), this.params.hashAlg);
        for (int i14 = 0; i14 < i11; i14++) {
            byte[] bArrNextBytes = nTRUSignerPrng.nextBytes(i13);
            int i15 = (i13 * 8) - i12;
            bArrNextBytes[bArrNextBytes.length - 1] = (byte) ((bArrNextBytes[bArrNextBytes.length - 1] >> i15) << i15);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.put(bArrNextBytes);
            integerPolynomial.coeffs[i14] = Integer.reverseBytes(byteBufferAllocate2.getInt());
        }
        return integerPolynomial;
    }

    public byte[] generateSignature() {
        Digest digest = this.hashAlg;
        if (digest == null || this.signingKeyPair == null) {
            throw new IllegalStateException("Call initSign first!");
        }
        byte[] bArr = new byte[digest.getDigestSize()];
        this.hashAlg.doFinal(bArr, 0);
        return signHash(bArr, this.signingKeyPair);
    }

    public void init(boolean z10, CipherParameters cipherParameters) {
        if (z10) {
            this.signingKeyPair = (NTRUSigningPrivateKeyParameters) cipherParameters;
        } else {
            this.verificationKey = (NTRUSigningPublicKeyParameters) cipherParameters;
        }
        Digest digest = this.params.hashAlg;
        this.hashAlg = digest;
        digest.reset();
    }

    public void update(byte b10) {
        Digest digest = this.hashAlg;
        if (digest == null) {
            throw new IllegalStateException("Call initSign or initVerify first!");
        }
        digest.update(b10);
    }

    public boolean verifySignature(byte[] bArr) {
        Digest digest = this.hashAlg;
        if (digest == null || this.verificationKey == null) {
            throw new IllegalStateException("Call initVerify first!");
        }
        byte[] bArr2 = new byte[digest.getDigestSize()];
        this.hashAlg.doFinal(bArr2, 0);
        return verifyHash(bArr2, bArr, this.verificationKey);
    }

    public void update(byte[] bArr, int i10, int i11) {
        Digest digest = this.hashAlg;
        if (digest == null) {
            throw new IllegalStateException("Call initSign or initVerify first!");
        }
        digest.update(bArr, i10, i11);
    }
}
