package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f20162a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f20163p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f20164q;

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f20165x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f20165x = bigInteger;
        this.f20163p = bigInteger2;
        this.f20164q = bigInteger3;
        this.f20162a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f20162a;
    }

    public BigInteger getP() {
        return this.f20163p;
    }

    public BigInteger getQ() {
        return this.f20164q;
    }

    public BigInteger getX() {
        return this.f20165x;
    }
}
