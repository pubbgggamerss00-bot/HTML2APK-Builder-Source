package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes2.dex */
public class DualECPoints {
    private final int cofactor;

    /* renamed from: p, reason: collision with root package name */
    private final ECPoint f20104p;

    /* renamed from: q, reason: collision with root package name */
    private final ECPoint f20105q;
    private final int securityStrength;

    public DualECPoints(int i10, ECPoint eCPoint, ECPoint eCPoint2, int i11) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.securityStrength = i10;
        this.f20104p = eCPoint;
        this.f20105q = eCPoint2;
        this.cofactor = i11;
    }

    private static int log2(int i10) {
        int i11 = 0;
        while (true) {
            i10 >>= 1;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f20104p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f20104p;
    }

    public ECPoint getQ() {
        return this.f20105q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f20104p.getCurve().getFieldSize();
    }
}
