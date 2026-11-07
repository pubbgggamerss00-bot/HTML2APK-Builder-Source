package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class SRP6GroupParameters {
    private BigInteger N;

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f20101g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.N = bigInteger;
        this.f20101g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f20101g;
    }

    public BigInteger getN() {
        return this.N;
    }
}
