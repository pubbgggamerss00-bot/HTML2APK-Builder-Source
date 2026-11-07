package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f20084y;

    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.f20084y = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof ElGamalPublicKeyParameters) && ((ElGamalPublicKeyParameters) obj).getY().equals(this.f20084y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f20084y;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return this.f20084y.hashCode() ^ super.hashCode();
    }
}
