package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* renamed from: q, reason: collision with root package name */
    private ECPoint f20157q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f20157q = eCPoint.normalize();
        } else {
            this.f20157q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f20157q;
    }
}
