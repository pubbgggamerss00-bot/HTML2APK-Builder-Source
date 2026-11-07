package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f20074x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f20074x = bigInteger;
    }

    public BigInteger getX() {
        return this.f20074x;
    }
}
