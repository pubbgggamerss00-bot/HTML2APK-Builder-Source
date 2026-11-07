package p5;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends f<int[]> {
    public static int[] h(String str) {
        return new int[]{((Number) y0.f21315a.g(str)).intValue()};
    }

    @Override // p5.y0
    public final Object a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        if (!bundle.containsKey(str) || c6.b.i(bundle, str)) {
            return null;
        }
        return c6.b.c(bundle, str);
    }

    @Override // p5.y0
    public final String b() {
        return "integer[]";
    }

    @Override // p5.y0
    public final Object c(Object obj, String str) {
        int[] iArr = (int[]) obj;
        if (iArr == null) {
            return h(str);
        }
        int[] iArrH = h(str);
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        System.arraycopy(iArrH, 0, iArrCopyOf, length, 1);
        kotlin.jvm.internal.r.b(iArrCopyOf);
        return iArrCopyOf;
    }

    @Override // p5.y0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return h(str);
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Object obj) {
        int[] iArr = (int[]) obj;
        kotlin.jvm.internal.r.e(key, "key");
        if (iArr != null) {
            b4.a.b(bundle, key, iArr);
        } else {
            b4.a.c(bundle, key);
        }
    }

    @Override // p5.y0
    public final boolean f(Object obj, Object obj2) {
        Integer[] numArr;
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        Integer[] numArr2 = null;
        if (iArr != null) {
            numArr = new Integer[iArr.length];
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                numArr[i10] = Integer.valueOf(iArr[i10]);
            }
        } else {
            numArr = null;
        }
        if (iArr2 != null) {
            numArr2 = new Integer[iArr2.length];
            int length2 = iArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                numArr2[i11] = Integer.valueOf(iArr2[i11]);
            }
        }
        return qg.m.b(numArr, numArr2);
    }

    @Override // p5.f
    public final int[] g() {
        return new int[0];
    }
}
