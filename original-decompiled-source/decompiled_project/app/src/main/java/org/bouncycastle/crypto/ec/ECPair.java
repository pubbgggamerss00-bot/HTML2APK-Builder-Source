package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes2.dex */
public class ECPair {

    /* renamed from: x, reason: collision with root package name */
    private final ECPoint f19941x;

    /* renamed from: y, reason: collision with root package name */
    private final ECPoint f19942y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f19941x = eCPoint;
        this.f19942y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f19941x;
    }

    public ECPoint getY() {
        return this.f19942y;
    }

    public int hashCode() {
        return (this.f19942y.hashCode() * 37) + this.f19941x.hashCode();
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
