package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* renamed from: d, reason: collision with root package name */
    private final BigInteger f20078d;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f20078d = eCDomainParameters.validatePrivateScalar(bigInteger);
    }

    public BigInteger getD() {
        return this.f20078d;
    }
}
