package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: classes3.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g, reason: collision with root package name */
    private GF2Matrix f20497g;

    /* renamed from: n, reason: collision with root package name */
    private int f20498n;

    /* renamed from: t, reason: collision with root package name */
    private int f20499t;

    public McEliecePublicKeyParameters(int i10, int i11, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f20498n = i10;
        this.f20499t = i11;
        this.f20497g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f20497g;
    }

    public int getK() {
        return this.f20497g.getNumRows();
    }

    public int getN() {
        return this.f20498n;
    }

    public int getT() {
        return this.f20499t;
    }
}
