package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f20169a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f20170p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f20171q;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f20172y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f20172y = bigInteger;
        this.f20170p = bigInteger2;
        this.f20171q = bigInteger3;
        this.f20169a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f20169a;
    }

    public BigInteger getP() {
        return this.f20170p;
    }

    public BigInteger getQ() {
        return this.f20171q;
    }

    public BigInteger getY() {
        return this.f20172y;
    }
}
