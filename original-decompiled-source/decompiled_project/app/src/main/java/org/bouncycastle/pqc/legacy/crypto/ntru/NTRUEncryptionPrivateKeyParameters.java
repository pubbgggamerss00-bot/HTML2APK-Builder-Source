package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.SparseTernaryPolynomial;

/* loaded from: classes3.dex */
public class NTRUEncryptionPrivateKeyParameters extends NTRUEncryptionKeyParameters {
    public IntegerPolynomial fp;

    /* renamed from: h, reason: collision with root package name */
    public IntegerPolynomial f20509h;

    /* renamed from: t, reason: collision with root package name */
    public Polynomial f20510t;

    public NTRUEncryptionPrivateKeyParameters(InputStream inputStream, NTRUEncryptionParameters nTRUEncryptionParameters) throws IOException {
        super(true, nTRUEncryptionParameters);
        if (nTRUEncryptionParameters.polyType == 1) {
            int i10 = nTRUEncryptionParameters.N;
            int i11 = nTRUEncryptionParameters.df1;
            int i12 = nTRUEncryptionParameters.df2;
            int i13 = nTRUEncryptionParameters.df3;
            int i14 = nTRUEncryptionParameters.fastFp ? i13 : i13 - 1;
            this.f20509h = IntegerPolynomial.fromBinary(inputStream, i10, nTRUEncryptionParameters.f20508q);
            this.f20510t = ProductFormPolynomial.fromBinary(inputStream, i10, i11, i12, i13, i14);
        } else {
            this.f20509h = IntegerPolynomial.fromBinary(inputStream, nTRUEncryptionParameters.N, nTRUEncryptionParameters.f20508q);
            IntegerPolynomial integerPolynomialFromBinary3Tight = IntegerPolynomial.fromBinary3Tight(inputStream, nTRUEncryptionParameters.N);
            this.f20510t = nTRUEncryptionParameters.sparse ? new SparseTernaryPolynomial(integerPolynomialFromBinary3Tight) : new DenseTernaryPolynomial(integerPolynomialFromBinary3Tight);
        }
        init();
    }

    private void init() {
        if (!this.params.fastFp) {
            this.fp = this.f20510t.toIntegerPolynomial().invertF3();
            return;
        }
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(this.params.N);
        this.fp = integerPolynomial;
        integerPolynomial.coeffs[0] = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NTRUEncryptionPrivateKeyParameters)) {
            return false;
        }
        NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters) obj;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        if (nTRUEncryptionParameters == null) {
            if (nTRUEncryptionPrivateKeyParameters.params != null) {
                return false;
            }
        } else if (!nTRUEncryptionParameters.equals(nTRUEncryptionPrivateKeyParameters.params)) {
            return false;
        }
        Polynomial polynomial = this.f20510t;
        if (polynomial == null) {
            if (nTRUEncryptionPrivateKeyParameters.f20510t != null) {
                return false;
            }
        } else if (!polynomial.equals(nTRUEncryptionPrivateKeyParameters.f20510t)) {
            return false;
        }
        return this.f20509h.equals(nTRUEncryptionPrivateKeyParameters.f20509h);
    }

    public byte[] getEncoded() {
        byte[] binary = this.f20509h.toBinary(this.params.f20508q);
        Polynomial polynomial = this.f20510t;
        byte[] binary2 = polynomial instanceof ProductFormPolynomial ? ((ProductFormPolynomial) polynomial).toBinary() : polynomial.toIntegerPolynomial().toBinary3Tight();
        byte[] bArr = new byte[binary.length + binary2.length];
        System.arraycopy(binary, 0, bArr, 0, binary.length);
        System.arraycopy(binary2, 0, bArr, binary.length, binary2.length);
        return bArr;
    }

    public int hashCode() {
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int iHashCode = ((nTRUEncryptionParameters == null ? 0 : nTRUEncryptionParameters.hashCode()) + 31) * 31;
        Polynomial polynomial = this.f20510t;
        int iHashCode2 = (iHashCode + (polynomial == null ? 0 : polynomial.hashCode())) * 31;
        IntegerPolynomial integerPolynomial = this.f20509h;
        return iHashCode2 + (integerPolynomial != null ? integerPolynomial.hashCode() : 0);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(getEncoded());
    }

    public NTRUEncryptionPrivateKeyParameters(IntegerPolynomial integerPolynomial, Polynomial polynomial, IntegerPolynomial integerPolynomial2, NTRUEncryptionParameters nTRUEncryptionParameters) {
        super(true, nTRUEncryptionParameters);
        this.f20509h = integerPolynomial;
        this.f20510t = polynomial;
        this.fp = integerPolynomial2;
    }

    public NTRUEncryptionPrivateKeyParameters(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) throws IOException {
        this(new ByteArrayInputStream(bArr), nTRUEncryptionParameters);
    }
}
