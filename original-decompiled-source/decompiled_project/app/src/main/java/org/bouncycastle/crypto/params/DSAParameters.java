package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f20071g;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f20072p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f20073q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f20071g = bigInteger3;
        this.f20072p = bigInteger;
        this.f20073q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f20072p) && dSAParameters.getQ().equals(this.f20073q) && dSAParameters.getG().equals(this.f20071g);
    }

    public BigInteger getG() {
        return this.f20071g;
    }

    public BigInteger getP() {
        return this.f20072p;
    }

    public BigInteger getQ() {
        return this.f20073q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f20071g = bigInteger3;
        this.f20072p = bigInteger;
        this.f20073q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}
