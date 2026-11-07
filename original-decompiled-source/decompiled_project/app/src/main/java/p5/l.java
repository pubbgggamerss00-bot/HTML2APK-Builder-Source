package p5;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends f<long[]> {
    public static long[] h(String str) {
        return new long[]{((Number) y0.f21317c.g(str)).longValue()};
    }

    @Override // p5.y0
    public final Object a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        if (!bundle.containsKey(str) || c6.b.i(bundle, str)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        b3.l.c(str);
        throw null;
    }

    @Override // p5.y0
    public final String b() {
        return "long[]";
    }

    @Override // p5.y0
    public final Object c(Object obj, String str) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return h(str);
        }
        long[] jArrH = h(str);
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(jArrH, 0, jArrCopyOf, length, 1);
        kotlin.jvm.internal.r.b(jArrCopyOf);
        return jArrCopyOf;
    }

    @Override // p5.y0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return h(str);
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Object obj) {
        long[] jArr = (long[]) obj;
        kotlin.jvm.internal.r.e(key, "key");
        if (jArr != null) {
            bundle.putLongArray(key, jArr);
        } else {
            b4.a.c(bundle, key);
        }
    }

    @Override // p5.y0
    public final boolean f(Object obj, Object obj2) {
        Long[] lArr;
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        Long[] lArr2 = null;
        if (jArr != null) {
            lArr = new Long[jArr.length];
            int length = jArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                lArr[i10] = Long.valueOf(jArr[i10]);
            }
        } else {
            lArr = null;
        }
        if (jArr2 != null) {
            lArr2 = new Long[jArr2.length];
            int length2 = jArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                lArr2[i11] = Long.valueOf(jArr2[i11]);
            }
        }
        return qg.m.b(lArr, lArr2);
    }

    @Override // p5.f
    public final long[] g() {
        return new long[0];
    }
}
