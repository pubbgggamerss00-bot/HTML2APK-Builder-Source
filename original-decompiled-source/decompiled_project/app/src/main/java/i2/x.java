package i2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int[] f14045a;

    /* renamed from: b, reason: collision with root package name */
    public int f14046b;

    public x(int i10) {
        this.f14045a = new int[i10];
    }

    public final void a(int i10, int i11, int i12) {
        int i13 = this.f14046b;
        int[] iArrCopyOf = this.f14045a;
        int i14 = i13 + 3;
        if (i14 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f14045a = iArrCopyOf;
        }
        iArrCopyOf[i13] = i10 + i12;
        iArrCopyOf[i13 + 1] = i11 + i12;
        iArrCopyOf[i13 + 2] = i12;
        this.f14046b = i14;
    }

    public final void b(int i10, int i11, int i12, int i13) {
        int i14 = this.f14046b;
        int[] iArrCopyOf = this.f14045a;
        int i15 = i14 + 4;
        if (i15 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f14045a = iArrCopyOf;
        }
        iArrCopyOf[i14] = i10;
        iArrCopyOf[i14 + 1] = i11;
        iArrCopyOf[i14 + 2] = i12;
        iArrCopyOf[i14 + 3] = i13;
        this.f14046b = i15;
    }

    public final void c(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f14045a;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    d(i12, i13);
                }
            }
            d(i12 + 3, i11);
            c(i10, i12);
            c(i12 + 6, i11);
        }
    }

    public final void d(int i10, int i11) {
        int[] iArr = this.f14045a;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }
}
