package x0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f31915a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int f31916b;

    public final int a(int i10) {
        int i11 = this.f31916b - 1;
        return i11 >= 0 ? this.f31915a[i11] : i10;
    }

    public final int b() {
        int[] iArr = this.f31915a;
        int i10 = this.f31916b - 1;
        this.f31916b = i10;
        return iArr[i10];
    }

    public final void c(int i10) {
        int[] iArrCopyOf = this.f31915a;
        if (this.f31916b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f31915a = iArrCopyOf;
        }
        int i11 = this.f31916b;
        this.f31916b = i11 + 1;
        iArrCopyOf[i11] = i10;
    }
}
