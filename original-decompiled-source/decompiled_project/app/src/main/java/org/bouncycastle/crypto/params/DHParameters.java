package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Properties;

/* loaded from: classes2.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f20061g;

    /* renamed from: j, reason: collision with root package name */
    private BigInteger f20062j;

    /* renamed from: l, reason: collision with root package name */
    private int f20063l;

    /* renamed from: m, reason: collision with root package name */
    private int f20064m;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f20065p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f20066q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    private static int getDefaultMParam(int i10) {
        return (i10 != 0 && i10 < DEFAULT_MINIMUM_LENGTH) ? i10 : DEFAULT_MINIMUM_LENGTH;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f20065p) && dHParameters.getG().equals(this.f20061g);
    }

    public BigInteger getG() {
        return this.f20061g;
    }

    public BigInteger getJ() {
        return this.f20062j;
    }

    public int getL() {
        return this.f20063l;
    }

    public int getM() {
        return this.f20064m;
    }

    public BigInteger getP() {
        return this.f20065p;
    }

    public BigInteger getQ() {
        return this.f20066q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i10), i10, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, i10, i11, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i10 > bigInteger.bitLength() && !Properties.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f20061g = bigInteger2;
        this.f20065p = bigInteger;
        this.f20066q = bigInteger3;
        this.f20064m = i10;
        this.f20063l = i11;
        this.f20062j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, DEFAULT_MINIMUM_LENGTH, 0, bigInteger4, dHValidationParameters);
    }
}
