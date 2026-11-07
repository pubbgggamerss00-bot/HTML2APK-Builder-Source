package com.htmltoapk.template;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AndroidAPIKt {
    public static final boolean isSafeAppFileName(String str) {
        kotlin.jvm.internal.j.e("name", str);
        if (!x5.o.v(str) && str.length() <= 200 && !x5.l.n(str, "/", false) && !x5.o.p(str, '\\')) {
            List<String> listB = x5.o.B(str, new char[]{'/'});
            if (!listB.isEmpty()) {
                for (String str2 : listB) {
                    if (kotlin.jvm.internal.j.a(str2, "..") || str2.length() == 0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final float normalizeScreenBrightness(float f6) {
        if (f6 < 0.0f) {
            return -1.0f;
        }
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    public static final long[] parseVibratePattern(String str) {
        kotlin.jvm.internal.j.e("patternJson", str);
        String string = x5.o.G(str).toString();
        if (!x5.l.n(string, "[", false) || !x5.l.j(string, "]", false)) {
            return null;
        }
        if (string.length() >= 2 && x5.l.n(string, "[", false) && x5.l.j(string, "]", false)) {
            string = string.substring(1, string.length() - 1);
            kotlin.jvm.internal.j.d("substring(...)", string);
        }
        List listB = x5.o.B(string, new char[]{','});
        if (listB.isEmpty() || listB.size() > 32) {
            return null;
        }
        if (!listB.isEmpty()) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                if (x5.o.v((String) it.next())) {
                    return null;
                }
            }
        }
        try {
            int size = listB.size();
            long[] jArr = new long[size];
            for (int i6 = 0; i6 < size; i6++) {
                long j6 = Long.parseLong(x5.o.G((String) listB.get(i6)).toString());
                if (j6 < 0) {
                    return null;
                }
                jArr[i6] = j6;
            }
            return jArr;
        } catch (Exception unused) {
            return null;
        }
    }
}
