package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* loaded from: classes3.dex */
public class BIKEParameters implements KEMParameters {
    public static final BIKEParameters bike128 = new BIKEParameters("bike128", 12323, 142, 134, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters("bike192", 24659, 206, 199, 256, 5, 3, 192);
    public static final BIKEParameters bike256 = new BIKEParameters("bike256", 40973, 274, 264, 256, 5, 3, 256);
    private BIKEEngine bikeEngine;
    private final int defaultKeySize;

    /* renamed from: l, reason: collision with root package name */
    private int f20313l;
    private String name;
    private int nbIter;

    /* renamed from: r, reason: collision with root package name */
    private int f20314r;

    /* renamed from: t, reason: collision with root package name */
    private int f20315t;
    private int tau;

    /* renamed from: w, reason: collision with root package name */
    private int f20316w;

    private BIKEParameters(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.name = str;
        this.f20314r = i10;
        this.f20316w = i11;
        this.f20315t = i12;
        this.f20313l = i13;
        this.nbIter = i14;
        this.tau = i15;
        this.defaultKeySize = i16;
        this.bikeEngine = new BIKEEngine(i10, i11, i12, i13, i14, i15);
    }

    public BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.f20313l;
    }

    public int getLByte() {
        return this.f20313l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.f20314r;
    }

    public int getRByte() {
        return (this.f20314r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f20315t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.f20316w;
    }
}
