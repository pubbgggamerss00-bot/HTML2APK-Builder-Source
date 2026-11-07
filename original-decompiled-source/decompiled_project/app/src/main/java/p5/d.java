package p5;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends f<boolean[]> {
    public static boolean[] h(String str) {
        return new boolean[]{((Boolean) y0.f21321g.g(str)).booleanValue()};
    }

    @Override // p5.y0
    public final Object a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        if (!bundle.containsKey(str) || c6.b.i(bundle, str)) {
            return null;
        }
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        b3.l.c(str);
        throw null;
    }

    @Override // p5.y0
    public final String b() {
        return "boolean[]";
    }

    @Override // p5.y0
    public final Object c(Object obj, String str) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return h(str);
        }
        boolean[] zArrH = h(str);
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(zArrH, 0, zArrCopyOf, length, 1);
        kotlin.jvm.internal.r.b(zArrCopyOf);
        return zArrCopyOf;
    }

    @Override // p5.y0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return h(str);
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.r.e(key, "key");
        if (zArr != null) {
            bundle.putBooleanArray(key, zArr);
        } else {
            b4.a.c(bundle, key);
        }
    }

    @Override // p5.y0
    public final boolean f(Object obj, Object obj2) {
        Boolean[] boolArr;
        boolean[] zArr = (boolean[]) obj;
        boolean[] zArr2 = (boolean[]) obj2;
        Boolean[] boolArr2 = null;
        if (zArr != null) {
            boolArr = new Boolean[zArr.length];
            int length = zArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                boolArr[i10] = Boolean.valueOf(zArr[i10]);
            }
        } else {
            boolArr = null;
        }
        if (zArr2 != null) {
            boolArr2 = new Boolean[zArr2.length];
            int length2 = zArr2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                boolArr2[i11] = Boolean.valueOf(zArr2[i11]);
            }
        }
        return qg.m.b(boolArr, boolArr2);
    }

    @Override // p5.f
    public final boolean[] g() {
        return new boolean[0];
    }
}
