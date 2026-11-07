package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f20095g;
    int lowerSigmaBound;

    /* renamed from: n, reason: collision with root package name */
    private BigInteger f20096n;

    public NaccacheSternKeyParameters(boolean z10, BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        super(z10);
        this.f20095g = bigInteger;
        this.f20096n = bigInteger2;
        this.lowerSigmaBound = i10;
    }

    public BigInteger getG() {
        return this.f20095g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f20096n;
    }
}
