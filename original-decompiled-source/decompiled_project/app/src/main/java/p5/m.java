package p5;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m extends y0<Long> {
    @Override // p5.y0
    public final Long a(Bundle bundle, String str) {
        kotlin.jvm.internal.r.e(bundle, "bundle");
        return Long.valueOf(c6.b.d(bundle, str));
    }

    @Override // p5.y0
    public final String b() {
        return "long";
    }

    @Override // p5.y0
    /* renamed from: d */
    public final Long g(String str) throws NumberFormatException {
        String strSubstring;
        long j10;
        if (mh.t.i(str, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7029u, false)) {
            strSubstring = str.substring(0, str.length() - 1);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        } else {
            strSubstring = str;
        }
        if (mh.t.p(str, "0x", false)) {
            String strSubstring2 = strSubstring.substring(2);
            kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
            g8.w.h(16);
            j10 = Long.parseLong(strSubstring2, 16);
        } else {
            j10 = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j10);
    }

    @Override // p5.y0
    public final void e(Bundle bundle, String key, Long l10) {
        long jLongValue = l10.longValue();
        kotlin.jvm.internal.r.e(key, "key");
        bundle.putLong(key, jLongValue);
    }
}
