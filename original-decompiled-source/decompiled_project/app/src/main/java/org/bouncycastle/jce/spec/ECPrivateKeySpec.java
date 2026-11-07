package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class ECPrivateKeySpec extends ECKeySpec {

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f20156d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f20156d = bigInteger;
    }

    public BigInteger getD() {
        return this.f20156d;
    }
}
