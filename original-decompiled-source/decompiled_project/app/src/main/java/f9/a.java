package f9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public static final List a(int i10, eh.a aVar, String text, String query) {
        kotlin.jvm.internal.r.e(text, "text");
        kotlin.jvm.internal.r.e(query, "query");
        if (mh.x.A(query)) {
            return qg.z.f22752a;
        }
        int[] iArr = new int[query.length()];
        int length = query.length();
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (i12 % 4096 == 0) {
                aVar.invoke();
            }
            while (i11 > 0 && !b(query.charAt(i12), query.charAt(i11))) {
                i11 = iArr[i11 - 1];
            }
            if (b(query.charAt(i12), query.charAt(i11))) {
                i11++;
            }
            iArr[i12] = i11;
        }
        ArrayList arrayList = new ArrayList();
        int length2 = text.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length2; i14++) {
            if (i14 % 4096 == 0) {
                aVar.invoke();
            }
            while (i13 > 0 && !b(text.charAt(i14), query.charAt(i13))) {
                i13 = iArr[i13 - 1];
            }
            if (b(text.charAt(i14), query.charAt(i13))) {
                i13++;
            }
            if (i13 == query.length()) {
                arrayList.add(Integer.valueOf((i14 - query.length()) + 1));
                if (arrayList.size() == i10) {
                    break;
                }
                i13 = 0;
            }
        }
        return arrayList;
    }

    public static final boolean b(char c10, char c11) {
        return c10 == c11 || Character.toLowerCase(Character.toUpperCase(c10)) == Character.toLowerCase(Character.toUpperCase(c11));
    }
}
