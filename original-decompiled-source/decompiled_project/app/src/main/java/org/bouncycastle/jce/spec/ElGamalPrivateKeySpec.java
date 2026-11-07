package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f20160x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f20160x = bigInteger;
    }

    public BigInteger getX() {
        return this.f20160x;
    }
}
