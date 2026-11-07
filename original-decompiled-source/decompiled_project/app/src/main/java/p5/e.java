package p5;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class e extends y0<Boolean> {
    @Override // p5.y0
    public final Boolean a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        if (!bundle.containsKey(str) || c6.b.i(bundle, str)) {
            return null;
        }
        boolean z10 = bundle.getBoolean(str, false);
        if (z10 || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z10);
        }
        b3.l.c(str);
        throw null;
    }

    @Override // p5.y0
    public final String b() {
        return "boolean";
    }

    @Override // p5.y0
    /* renamed from: d */
    public final Boolean g(String str) {
        boolean z10;
        if (str.equals("true")) {
            z10 = true;
        } else {
            if (!str.equals("false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        kotlin.jvm.internal.r.e(key, "key");
        bundle.putBoolean(key, zBooleanValue);
    }
}
