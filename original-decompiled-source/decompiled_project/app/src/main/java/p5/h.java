package p5;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class h extends y0<Float> {
    @Override // p5.y0
    public final Float a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        return Float.valueOf(c6.b.a(bundle, str));
    }

    @Override // p5.y0
    public final String b() {
        return "float";
    }

    @Override // p5.y0
    /* renamed from: d */
    public final Float g(String str) {
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Float f10) {
        float fFloatValue = f10.floatValue();
        kotlin.jvm.internal.r.e(key, "key");
        bundle.putFloat(key, fFloatValue);
    }
}
