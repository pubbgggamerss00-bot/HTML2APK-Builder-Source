package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: classes3.dex */
class PolynomialPair {

    /* renamed from: a, reason: collision with root package name */
    private final Polynomial f20394a;

    /* renamed from: b, reason: collision with root package name */
    private final Polynomial f20395b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f20394a = polynomial;
        this.f20395b = polynomial2;
    }

    public Polynomial f() {
        return this.f20394a;
    }

    public Polynomial g() {
        return this.f20395b;
    }

    public Polynomial m() {
        return this.f20395b;
    }

    public Polynomial r() {
        return this.f20394a;
    }
}
