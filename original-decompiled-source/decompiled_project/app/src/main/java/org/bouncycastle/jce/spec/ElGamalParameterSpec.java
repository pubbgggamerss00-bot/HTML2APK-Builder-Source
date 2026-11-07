package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f20158g;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f20159p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f20159p = bigInteger;
        this.f20158g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f20158g;
    }

    public BigInteger getP() {
        return this.f20159p;
    }
}
