package b6;

import java.util.Collection;
import mh.x;

/* loaded from: classes.dex */
public final class s {
    public static final boolean a(String current, String str) {
        kotlin.jvm.internal.r.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < current.length()) {
                    char cCharAt = current.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != current.length() - 1) {
                        break;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    String strSubstring = current.substring(1, current.length() - 1);
                    kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                    return kotlin.jvm.internal.r.a(x.W(strSubstring).toString(), str);
                }
            }
        }
        return false;
    }

    public static final String b(Collection<?> collection) {
        kotlin.jvm.internal.r.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return mh.p.b(qg.x.I(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }
}
