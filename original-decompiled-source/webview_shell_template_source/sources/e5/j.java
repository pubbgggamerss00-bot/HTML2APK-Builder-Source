package e5;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class j extends i {
    public static boolean u(char[] cArr, char c7) {
        int length = cArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            }
            if (c7 == cArr[i6]) {
                break;
            }
            i6++;
        }
        return i6 >= 0;
    }

    public static <T> boolean v(T[] tArr, T t6) {
        int i6;
        if (t6 == null) {
            int length = tArr.length;
            i6 = 0;
            while (i6 < length) {
                if (tArr[i6] == null) {
                    break;
                }
                i6++;
            }
            i6 = -1;
        } else {
            int length2 = tArr.length;
            for (int i7 = 0; i7 < length2; i7++) {
                if (t6.equals(tArr[i7])) {
                    i6 = i7;
                    break;
                }
            }
            i6 = -1;
        }
        return i6 >= 0;
    }

    public static <T> Set<T> w(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return u.s;
        }
        if (length == 1) {
            return j3.b.d(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.i(tArr.length));
        for (T t6 : tArr) {
            linkedHashSet.add(t6);
        }
        return linkedHashSet;
    }
}
