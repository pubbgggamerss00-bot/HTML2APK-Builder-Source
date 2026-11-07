package org.bouncycastle.crypto.params;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes2.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* renamed from: q, reason: collision with root package name */
    private final ECPoint f20079q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f20079q = eCDomainParameters.validatePublicPoint(eCPoint);
    }

    public ECPoint getQ() {
        return this.f20079q;
    }
}
