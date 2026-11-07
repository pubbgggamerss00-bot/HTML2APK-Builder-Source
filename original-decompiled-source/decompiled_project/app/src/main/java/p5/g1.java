package p5;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class g1 extends y0<String> {
    @Override // p5.y0
    public final String a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        if (!bundle.containsKey(str) || c6.b.i(bundle, str)) {
            return null;
        }
        return c6.b.g(bundle, str);
    }

    @Override // p5.y0
    public final String b() {
        return "string";
    }

    @Override // p5.y0
    /* renamed from: d */
    public final String g(String str) {
        if (str.equals("null")) {
            return null;
        }
        return str;
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, String str) {
        String str2 = str;
        kotlin.jvm.internal.r.e(key, "key");
        if (str2 != null) {
            b4.a.e(key, str2, bundle);
        } else {
            b4.a.c(bundle, key);
        }
    }
}
