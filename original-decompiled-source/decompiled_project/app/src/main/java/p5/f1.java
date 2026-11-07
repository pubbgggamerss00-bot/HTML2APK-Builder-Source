package p5;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f1 extends f<String[]> {
    @Override // p5.y0
    public final Object a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        if (!bundle.containsKey(str) || c6.b.i(bundle, str)) {
            return null;
        }
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        b3.l.c(str);
        throw null;
    }

    @Override // p5.y0
    public final String b() {
        return "string[]";
    }

    @Override // p5.y0
    public final Object c(Object obj, String str) {
        String[] strArr = (String[]) obj;
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length + 1);
        System.arraycopy(new String[]{str}, 0, objArrCopyOf, length, 1);
        kotlin.jvm.internal.r.b(objArrCopyOf);
        return (String[]) objArrCopyOf;
    }

    @Override // p5.y0
    /* renamed from: d */
    public final Object g(String str) {
        return new String[]{str};
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Object obj) {
        String[] strArr = (String[]) obj;
        kotlin.jvm.internal.r.e(key, "key");
        if (strArr != null) {
            bundle.putStringArray(key, strArr);
        } else {
            b4.a.c(bundle, key);
        }
    }

    @Override // p5.y0
    public final boolean f(Object obj, Object obj2) {
        return qg.m.b((String[]) obj, (String[]) obj2);
    }

    @Override // p5.f
    public final String[] g() {
        return new String[0];
    }
}
