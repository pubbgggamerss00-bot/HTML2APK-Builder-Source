package x5;

import androidx.camera.camera2.internal.s0;
import com.google.android.gms.ads.RequestConfiguration;
import e5.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class h extends a1.a {
    public static String h(String str) {
        Comparable comparable;
        String strSubstring;
        kotlin.jvm.internal.j.e("<this>", str);
        List listO = w5.g.o(o.x(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (!o.v((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e5.m.d(arrayList));
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                char cCharAt = str2.charAt(length2);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listO.size();
        int iB = e5.l.b(listO);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listO) {
            int i8 = i6 + 1;
            if (i6 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str3 = (String) obj3;
            if ((i6 == 0 || i6 == iB) && o.v(str3)) {
                strSubstring = null;
            } else {
                kotlin.jvm.internal.j.e("<this>", str3);
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(s0.a(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                kotlin.jvm.internal.j.d("substring(...)", strSubstring);
                g.s.getClass();
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            i6 = i8;
        }
        StringBuilder sb = new StringBuilder(length3);
        q.g(arrayList3, sb, "\n", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "...", null);
        String string = sb.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        return string;
    }
}
