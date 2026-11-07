package org.bouncycastle.pqc.legacy.math.ntru.euclid;

/* loaded from: classes3.dex */
public class IntEuclidean {
    public int gcd;

    /* renamed from: x, reason: collision with root package name */
    public int f20541x;

    /* renamed from: y, reason: collision with root package name */
    public int f20542y;

    private IntEuclidean() {
    }

    public static IntEuclidean calculate(int i10, int i11) {
        int i12 = 0;
        int i13 = i10;
        int i14 = i11;
        int i15 = 1;
        int i16 = 1;
        int i17 = 0;
        while (i14 != 0) {
            int i18 = i13 / i14;
            int i19 = i13 % i14;
            int i20 = i16 - (i18 * i17);
            i13 = i14;
            i14 = i19;
            int i21 = i15;
            i15 = i12 - (i18 * i15);
            i12 = i21;
            i16 = i17;
            i17 = i20;
        }
        IntEuclidean intEuclidean = new IntEuclidean();
        intEuclidean.f20541x = i16;
        intEuclidean.f20542y = i12;
        intEuclidean.gcd = i13;
        return intEuclidean;
    }
}
