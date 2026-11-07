package mh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

/* loaded from: classes2.dex */
public class p extends o {
    public static String b(String str) {
        kotlin.jvm.internal.r.e(str, "<this>");
        return lh.j.j(new lh.p(x.D(str), new b9.u("    ", 3)), "\n");
    }

    public static String c(String str) {
        kotlin.jvm.internal.r.e(str, "<this>");
        List listE = x.E(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (!x.A((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!g8.w.j(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Integer num = (Integer) qg.x.M(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listE.size();
        int i12 = qg.p.i(listE);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listE.iterator();
        while (true) {
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                qg.x.H(arrayList3, sb, "\n", null, CdexHeaderItem.DEBUG_INFO_BASE);
                return sb.toString();
            }
            Object next = it.next();
            int i13 = i10 + 1;
            if (i10 < 0) {
                qg.p.o();
                throw null;
            }
            String str3 = (String) next;
            String strZ = ((i10 == 0 || i10 == i12) && x.A(str3)) ? null : y.Z(iIntValue, str3);
            if (strZ != null) {
                arrayList3.add(strZ);
            }
            i10 = i13;
        }
    }

    public static String d(String str) {
        kotlin.jvm.internal.r.e(str, "<this>");
        if (x.A("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listE = x.E(str);
        int length = str.length();
        listE.size();
        int i10 = qg.p.i(listE);
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        int i11 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                qg.x.H(arrayList, sb, "\n", null, CdexHeaderItem.DEBUG_INFO_BASE);
                return sb.toString();
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                qg.p.o();
                throw null;
            }
            String str2 = (String) next;
            if ((i11 != 0 && i11 != i10) || !x.A(str2)) {
                int length2 = str2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i13 = -1;
                        break;
                    }
                    if (!g8.w.j(str2.charAt(i13))) {
                        break;
                    }
                    i13++;
                }
                if (i13 != -1 && t.o(str2, "|", i13, false)) {
                    strSubstring = str2.substring("|".length() + i13);
                    kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i11 = i12;
        }
    }
}
