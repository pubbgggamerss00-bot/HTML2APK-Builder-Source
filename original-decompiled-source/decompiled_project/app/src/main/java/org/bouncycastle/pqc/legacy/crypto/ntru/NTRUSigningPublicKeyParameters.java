package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;

/* loaded from: classes3.dex */
public class NTRUSigningPublicKeyParameters extends AsymmetricKeyParameter {

    /* renamed from: h, reason: collision with root package name */
    public IntegerPolynomial f20524h;
    private NTRUSigningParameters params;

    public NTRUSigningPublicKeyParameters(InputStream inputStream, NTRUSigningParameters nTRUSigningParameters) throws IOException {
        super(false);
        this.f20524h = IntegerPolynomial.fromBinary(inputStream, nTRUSigningParameters.N, nTRUSigningParameters.f20521q);
        this.params = nTRUSigningParameters;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = (NTRUSigningPublicKeyParameters) obj;
        IntegerPolynomial integerPolynomial = this.f20524h;
        if (integerPolynomial == null) {
            if (nTRUSigningPublicKeyParameters.f20524h != null) {
                return false;
            }
        } else if (!integerPolynomial.equals(nTRUSigningPublicKeyParameters.f20524h)) {
            return false;
        }
        NTRUSigningParameters nTRUSigningParameters = this.params;
        NTRUSigningParameters nTRUSigningParameters2 = nTRUSigningPublicKeyParameters.params;
        if (nTRUSigningParameters == null) {
            if (nTRUSigningParameters2 != null) {
                return false;
            }
        } else if (!nTRUSigningParameters.equals(nTRUSigningParameters2)) {
            return false;
        }
        return true;
    }

    public byte[] getEncoded() {
        return this.f20524h.toBinary(this.params.f20521q);
    }

    public int hashCode() {
        IntegerPolynomial integerPolynomial = this.f20524h;
        int iHashCode = ((integerPolynomial == null ? 0 : integerPolynomial.hashCode()) + 31) * 31;
        NTRUSigningParameters nTRUSigningParameters = this.params;
        return iHashCode + (nTRUSigningParameters != null ? nTRUSigningParameters.hashCode() : 0);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(getEncoded());
    }

    public NTRUSigningPublicKeyParameters(IntegerPolynomial integerPolynomial, NTRUSigningParameters nTRUSigningParameters) {
        super(false);
        this.f20524h = integerPolynomial;
        this.params = nTRUSigningParameters;
    }

    public NTRUSigningPublicKeyParameters(byte[] bArr, NTRUSigningParameters nTRUSigningParameters) {
        super(false);
        this.f20524h = IntegerPolynomial.fromBinary(bArr, nTRUSigningParameters.N, nTRUSigningParameters.f20521q);
        this.params = nTRUSigningParameters;
    }
}
