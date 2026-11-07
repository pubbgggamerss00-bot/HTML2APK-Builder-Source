package h3;

import eh.l;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public static String a(List list, String str, l lVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb.append((CharSequence) str);
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
