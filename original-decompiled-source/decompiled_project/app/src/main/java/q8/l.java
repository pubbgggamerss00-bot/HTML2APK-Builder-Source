package q8;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f22283a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f22284b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f22285c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f22286d;

    /* renamed from: e, reason: collision with root package name */
    public final double[] f22287e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22288f;

    public static final class a {
        public static final void a(c1 c1Var, kotlin.jvm.internal.e0 e0Var, c1 c1Var2, c1 c1Var3, kotlin.jvm.internal.e0 e0Var2, kotlin.jvm.internal.d0 d0Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, int i10) {
            c1Var.a(e0Var.f16324a);
            c1Var2.a(i10);
            c1Var3.a(e0Var2.f16324a);
            d0Var.f16322a = Math.max(d0Var.f16322a, (float) (c0Var.f16320a - c0Var2.f16320a));
        }
    }

    public l(String text, int[] iArr, int[] iArr2, int[] iArr3, double[] dArr, float f10) {
        kotlin.jvm.internal.r.e(text, "text");
        this.f22283a = text;
        this.f22284b = iArr;
        this.f22285c = iArr2;
        this.f22286d = iArr3;
        this.f22287e = dArr;
        this.f22288f = f10;
    }

    public final int a(float f10, int i10) {
        int[] iArr = this.f22284b;
        int i11 = iArr[i10];
        int i12 = this.f22285c[i10];
        double[] dArr = this.f22287e;
        double d10 = dArr[i11];
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = 0.0f;
        }
        double d11 = d10 + f10;
        while (i11 < i12) {
            int i13 = (i11 + i12) >>> 1;
            if (dArr[i13] < d11) {
                i11 = i13 + 1;
            } else {
                i12 = i13;
            }
        }
        int i14 = iArr[i10];
        if (i11 > i14) {
            int i15 = i11 - 1;
            if (d11 - dArr[i15] < dArr[i11] - d11) {
                i11 = i15;
            }
        }
        if (i11 <= i14) {
            return i11;
        }
        String str = this.f22283a;
        return (i11 >= str.length() || !Character.isLowSurrogate(str.charAt(i11))) ? i11 : i11 - 1;
    }

    public final int b(int i10) {
        int iM = jh.j.m(i10, 0, this.f22283a.length());
        int[] iArr = this.f22284b;
        int length = iArr.length;
        kotlin.jvm.internal.r.e(iArr, "<this>");
        int iBinarySearch = Arrays.binarySearch(iArr, 0, length, iM);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        int i11 = (-iBinarySearch) - 2;
        if (i11 < 0) {
            return 0;
        }
        return i11;
    }

    public final float c(int i10, int i11) {
        int[] iArr = this.f22284b;
        int iM = jh.j.m(i11, iArr[i10], this.f22285c[i10]);
        double[] dArr = this.f22287e;
        return (float) (dArr[iM] - dArr[iArr[i10]]);
    }
}
