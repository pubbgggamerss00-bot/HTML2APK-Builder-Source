package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* loaded from: classes3.dex */
public class SNTRUPrimeParameters implements KEMParameters {
    private final String name;

    /* renamed from: p, reason: collision with root package name */
    private final int f20399p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;

    /* renamed from: q, reason: collision with root package name */
    private final int f20400q;
    private final int roundedPolynomialBytes;
    private final int rqPolynomialBytes;
    private final int sharedKeyBytes;

    /* renamed from: w, reason: collision with root package name */
    private final int f20401w;
    public static final SNTRUPrimeParameters sntrup653 = new SNTRUPrimeParameters("sntrup653", 653, 4621, 288, 994, 865, 994, 1518, 32);
    public static final SNTRUPrimeParameters sntrup761 = new SNTRUPrimeParameters("sntrup761", 761, 4591, 286, 1158, 1007, 1158, 1763, 32);
    public static final SNTRUPrimeParameters sntrup857 = new SNTRUPrimeParameters("sntrup857", 857, 5167, 322, 1322, 1152, 1322, 1999, 32);
    public static final SNTRUPrimeParameters sntrup953 = new SNTRUPrimeParameters("sntrup953", 953, 6343, 396, 1505, 1317, 1505, 2254, 32);
    public static final SNTRUPrimeParameters sntrup1013 = new SNTRUPrimeParameters("sntrup1013", 1013, 7177, 448, 1623, 1423, 1623, 2417, 32);
    public static final SNTRUPrimeParameters sntrup1277 = new SNTRUPrimeParameters("sntrup1277", 1277, 7879, 492, 2067, 1815, 2067, 3059, 32);

    private SNTRUPrimeParameters(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.name = str;
        this.f20399p = i10;
        this.f20400q = i11;
        this.f20401w = i12;
        this.rqPolynomialBytes = i13;
        this.roundedPolynomialBytes = i14;
        this.publicKeyBytes = i15;
        this.privateKeyBytes = i16;
        this.sharedKeyBytes = i17;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.f20399p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.f20400q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getRqPolynomialBytes() {
        return this.rqPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getW() {
        return this.f20401w;
    }
}
