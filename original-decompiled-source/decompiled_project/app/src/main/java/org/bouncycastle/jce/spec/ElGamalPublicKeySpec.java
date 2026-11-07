package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f20161y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f20161y = bigInteger;
    }

    public BigInteger getY() {
        return this.f20161y;
    }
}
