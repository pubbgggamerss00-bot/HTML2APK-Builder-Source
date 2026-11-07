package p5;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends f<float[]> {
    public static float[] h(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    @Override // p5.y0
    public final Object a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        if (!bundle.containsKey(str) || c6.b.i(bundle, str)) {
            return null;
        }
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        b3.l.c(str);
        throw null;
    }

    @Override // p5.y0
    public final String b() {
        return "float[]";
    }

    @Override // p5.y0
    public final Object c(Object obj, String str) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return h(str);
        }
        float[] fArrH = h(str);
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        System.arraycopy(fArrH, 0, fArrCopyOf, length, 1);
        kotlin.jvm.internal.r.b(fArrCopyOf);
        return fArrCopyOf;
    }

    @Override // p5.y0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object g(String str) {
        return h(str);
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Object obj) {
        float[] fArr = (float[]) obj;
        kotlin.jvm.internal.r.e(key, "key");
        if (fArr != null) {
            bundle.putFloatArray(key, fArr);
        } else {
            b4.a.c(bundle, key);
        }
    }

    @Override // p5.y0
    public final boolean f(Object obj, Object obj2) {
        Float[] fArr;
        float[] fArr2 = (float[]) obj;
        float[] fArr3 = (float[]) obj2;
        Float[] fArr4 = null;
        if (fArr2 != null) {
            fArr = new Float[fArr2.length];
            int length = fArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                fArr[i10] = Float.valueOf(fArr2[i10]);
            }
        } else {
            fArr = null;
        }
        if (fArr3 != null) {
            fArr4 = new Float[fArr3.length];
            int length2 = fArr3.length;
            for (int i11 = 0; i11 < length2; i11++) {
                fArr4[i11] = Float.valueOf(fArr3[i11]);
            }
        }
        return qg.m.b(fArr, fArr4);
    }

    @Override // p5.f
    public final float[] g() {
        return new float[0];
    }
}
