package org.bouncycastle.crypto.params;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
public class ECDomainParameters implements ECConstants {
    private final ECPoint G;
    private final ECCurve curve;

    /* renamed from: h, reason: collision with root package name */
    private final BigInteger f20076h;
    private BigInteger hInv;

    /* renamed from: n, reason: collision with root package name */
    private final BigInteger f20077n;
    private final byte[] seed;

    public ECDomainParameters(X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }

    public static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCPoint == null) {
            throw new NullPointerException("Point cannot be null");
        }
        ECPoint eCPointNormalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (eCPointNormalize.isValid()) {
            return eCPointNormalize;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.G.equals(eCDomainParameters.G) && this.f20077n.equals(eCDomainParameters.f20077n);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.G;
    }

    public BigInteger getH() {
        return this.f20076h;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.hInv == null) {
                this.hInv = BigIntegers.modOddInverseVar(this.f20077n, this.f20076h);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.f20077n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return ((((this.curve.hashCode() ^ 1028) * BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE) ^ this.G.hashCode()) * BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE) ^ this.f20077n.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("Scalar cannot be null");
        }
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.curve = eCCurve;
        this.G = validatePublicPoint(eCCurve, eCPoint);
        this.f20077n = bigInteger;
        this.f20076h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }
}
