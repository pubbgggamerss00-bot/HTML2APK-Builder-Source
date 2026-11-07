package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* loaded from: classes3.dex */
public class CMCEParameters implements KEMParameters {
    public static final CMCEParameters mceliece348864fr3;
    public static final CMCEParameters mceliece348864r3;
    private static int[] poly3488;
    private final int defaultKeySize;
    private final CMCEEngine engine;

    /* renamed from: m, reason: collision with root package name */
    private final int f20320m;

    /* renamed from: n, reason: collision with root package name */
    private final int f20321n;
    private final String name;

    /* renamed from: t, reason: collision with root package name */
    private final int f20322t;
    private final boolean usePivots;
    private static int[] poly4608 = {10, 9, 6, 0};
    private static int[] poly6688 = {7, 2, 1, 0};
    private static int[] poly6960 = {8, 0};
    private static int[] poly8192 = {7, 2, 1, 0};
    public static final CMCEParameters mceliece460896r3 = new CMCEParameters("mceliece460896", 13, 4608, 96, poly4608, false, 192);
    public static final CMCEParameters mceliece460896fr3 = new CMCEParameters("mceliece460896f", 13, 4608, 96, poly4608, true, 192);
    public static final CMCEParameters mceliece6688128r3 = new CMCEParameters("mceliece6688128", 13, 6688, 128, poly6688, false, 256);
    public static final CMCEParameters mceliece6688128fr3 = new CMCEParameters("mceliece6688128f", 13, 6688, 128, poly6688, true, 256);
    public static final CMCEParameters mceliece6960119r3 = new CMCEParameters("mceliece6960119", 13, 6960, 119, poly6960, false, 256);
    public static final CMCEParameters mceliece6960119fr3 = new CMCEParameters("mceliece6960119f", 13, 6960, 119, poly6960, true, 256);
    public static final CMCEParameters mceliece8192128r3 = new CMCEParameters("mceliece8192128", 13, 8192, 128, poly8192, false, 256);
    public static final CMCEParameters mceliece8192128fr3 = new CMCEParameters("mceliece8192128f", 13, 8192, 128, poly8192, true, 256);

    static {
        int[] iArr = {3, 1, 0};
        poly3488 = iArr;
        mceliece348864r3 = new CMCEParameters("mceliece348864", 12, 3488, 64, iArr, false, 128);
        mceliece348864fr3 = new CMCEParameters("mceliece348864f", 12, 3488, 64, poly3488, true, 128);
    }

    private CMCEParameters(String str, int i10, int i11, int i12, int[] iArr, boolean z10, int i13) {
        this.name = str;
        this.f20320m = i10;
        this.f20321n = i11;
        this.f20322t = i12;
        this.usePivots = z10;
        this.defaultKeySize = i13;
        this.engine = new CMCEEngine(i10, i11, i12, iArr, z10, i13);
    }

    public CMCEEngine getEngine() {
        return this.engine;
    }

    public int getM() {
        return this.f20320m;
    }

    public int getMu() {
        return this.usePivots ? 32 : 0;
    }

    public int getN() {
        return this.f20321n;
    }

    public String getName() {
        return this.name;
    }

    public int getNu() {
        return this.usePivots ? 64 : 0;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f20322t;
    }
}
