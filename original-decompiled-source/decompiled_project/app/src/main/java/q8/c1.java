package q8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f22151a = new int[128];

    /* renamed from: b, reason: collision with root package name */
    public int f22152b;

    public final void a(int i10) {
        int i11 = this.f22152b;
        int[] iArr = this.f22151a;
        if (i11 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11 * 2);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f22151a = iArrCopyOf;
        }
        int[] iArr2 = this.f22151a;
        int i12 = this.f22152b;
        this.f22152b = i12 + 1;
        iArr2[i12] = i10;
    }
}
