package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* loaded from: classes3.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private Digest digest;
    private int fieldPoly;

    /* renamed from: m, reason: collision with root package name */
    private int f20486m;

    /* renamed from: n, reason: collision with root package name */
    private int f20487n;

    /* renamed from: t, reason: collision with root package name */
    private int f20488t;

    public McElieceParameters() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f20486m;
    }

    public int getN() {
        return this.f20487n;
    }

    public int getT() {
        return this.f20488t;
    }

    public McElieceParameters(int i10) {
        this(i10, (Digest) null);
    }

    public McElieceParameters(int i10, int i11) {
        this(i10, i11, (Digest) null);
    }

    public McElieceParameters(int i10, int i11, int i12) {
        this(i10, i11, i12, null);
    }

    public McElieceParameters(int i10, int i11, int i12, Digest digest) {
        this.f20486m = i10;
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i13 = 1 << i10;
        this.f20487n = i13;
        this.f20488t = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i13) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i12) != i10 || !PolynomialRingGF2.isIrreducible(i12)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.fieldPoly = i12;
        this.digest = digest;
    }

    public McElieceParameters(int i10, int i11, Digest digest) {
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f20486m = i10;
        int i12 = 1 << i10;
        this.f20487n = i12;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i12) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f20488t = i11;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i10);
        this.digest = digest;
    }

    public McElieceParameters(int i10, Digest digest) {
        if (i10 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f20486m = 0;
        this.f20487n = 1;
        while (true) {
            int i11 = this.f20487n;
            if (i11 >= i10) {
                int i12 = i11 >>> 1;
                this.f20488t = i12;
                int i13 = this.f20486m;
                this.f20488t = i12 / i13;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i13);
                this.digest = digest;
                return;
            }
            this.f20487n = i11 << 1;
            this.f20486m++;
        }
    }

    public McElieceParameters(Digest digest) {
        this(11, 50, digest);
    }
}
