package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: classes3.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* renamed from: n, reason: collision with root package name */
    private int f20472n;

    /* renamed from: t, reason: collision with root package name */
    private int f20473t;

    public McElieceCCA2PublicKeyParameters(int i10, int i11, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f20472n = i10;
        this.f20473t = i11;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f20472n;
    }

    public int getT() {
        return this.f20473t;
    }
}
