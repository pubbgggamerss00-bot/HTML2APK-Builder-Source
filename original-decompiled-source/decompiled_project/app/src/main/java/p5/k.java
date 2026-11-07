package p5;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class k extends y0<Integer> {
    @Override // p5.y0
    public final Integer a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        return Integer.valueOf(c6.b.b(bundle, str));
    }

    @Override // p5.y0
    public final String b() {
        return "integer";
    }

    @Override // p5.y0
    /* renamed from: d */
    public final Integer g(String str) throws NumberFormatException {
        int i10;
        if (mh.t.p(str, "0x", false)) {
            String strSubstring = str.substring(2);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            g8.w.h(16);
            i10 = Integer.parseInt(strSubstring, 16);
        } else {
            i10 = Integer.parseInt(str);
        }
        return Integer.valueOf(i10);
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Integer num) {
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(key, "key");
        bundle.putInt(key, iIntValue);
    }
}
