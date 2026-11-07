package mh;

import c0.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import mh.b;

/* loaded from: classes2.dex */
public class x extends t {
    public static boolean A(CharSequence charSequence) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!g8.w.j(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int B(int i10, String str, String string) {
        int iU = (i10 & 2) != 0 ? u(str) : 0;
        boolean z10 = (i10 & 4) == 0;
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(string, "string");
        return !z10 ? str.lastIndexOf(string, iU) : w(str, string, iU, 0, z10, true);
    }

    public static int C(String str, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = u(str);
        }
        kotlin.jvm.internal.r.e(str, "<this>");
        return str.lastIndexOf(c10, i10);
    }

    public static w D(CharSequence charSequence) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        return new w(charSequence);
    }

    public static List E(String str) {
        kotlin.jvm.internal.r.e(str, "<this>");
        return lh.j.k(D(str));
    }

    public static String F(int i10, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.r.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            sb.append((CharSequence) str);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String G(int i10, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.r.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean H(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        kotlin.jvm.internal.r.e(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!g8.w.i(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String I(String str, String prefix) {
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(prefix, "prefix");
        if (!Q(prefix, str)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String J(String str, String str2) {
        kotlin.jvm.internal.r.e(str, "<this>");
        if (!t(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String K(String str, String str2) {
        kotlin.jvm.internal.r.e(str, "<this>");
        return L(str, str2, str2);
    }

    public static String L(String str, String str2, String str3) {
        kotlin.jvm.internal.r.e(str, "<this>");
        if (str.length() < str3.length() + str2.length() || !Q(str2, str) || !t(str, str3)) {
            return str;
        }
        String strSubstring = str.substring(str2.length(), str.length() - str3.length());
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder M(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        kotlin.jvm.internal.r.e(replacement, "replacement");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(r1.f.a(i11, i10, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i10);
        sb.append(replacement);
        sb.append(charSequence, i11, charSequence.length());
        return sb;
    }

    public static final List N(CharSequence charSequence, String str) {
        int iV = v(charSequence, str, 0, false);
        if (iV == -1) {
            return g0.c(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iV).toString());
            length = str.length() + iV;
            iV = v(charSequence, str, length, false);
        } while (iV != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List O(CharSequence charSequence, String[] strArr) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return N(charSequence, str);
            }
        }
        final List listA = qg.m.a(strArr);
        lh.n nVar = new lh.n(new b(charSequence, new eh.p() { // from class: mh.v
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x002b A[EDGE_INSN: B:53:0x002b->B:6:0x002b BREAK  A[LOOP:0: B:18:0x0057->B:29:0x0088]] */
            @Override // eh.p
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj, Object obj2) {
                int i10;
                Object next;
                pg.n nVar2;
                Object next2;
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.r.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = listA;
                if (list.size() == 1) {
                    String str2 = (String) qg.x.S(list);
                    int iY = x.y(DelimitedRangesSequence, str2, iIntValue, false, 4);
                    nVar2 = iY < 0 ? null : new pg.n(Integer.valueOf(iY), str2);
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    jh.g gVar = new jh.g(iIntValue, DelimitedRangesSequence.length(), 1);
                    boolean z10 = DelimitedRangesSequence instanceof String;
                    int i11 = gVar.f15746c;
                    int i12 = gVar.f15745b;
                    if (z10) {
                        if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                            int i13 = iIntValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it.next();
                                    String str3 = (String) next2;
                                    if (t.k(0, i13, str3.length(), str3, (String) DelimitedRangesSequence, false)) {
                                        break;
                                    }
                                }
                                String str4 = (String) next2;
                                if (str4 == null) {
                                    if (i13 == i12) {
                                        break;
                                    }
                                    i13 += i11;
                                } else {
                                    nVar2 = new pg.n(Integer.valueOf(i13), str4);
                                    break;
                                }
                            }
                        }
                    } else if ((i11 > 0 && iIntValue <= i12) || (i11 < 0 && i12 <= iIntValue)) {
                        int i14 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    i10 = i12;
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                String str5 = (String) next;
                                i10 = i12;
                                if (x.H(str5, 0, DelimitedRangesSequence, i14, str5.length(), false)) {
                                    break;
                                }
                                i12 = i10;
                            }
                            String str6 = (String) next;
                            if (str6 == null) {
                                if (i14 == i10) {
                                    break;
                                }
                                i14 += i11;
                                i12 = i10;
                            } else {
                                nVar2 = new pg.n(Integer.valueOf(i14), str6);
                                break;
                            }
                        }
                    }
                }
                if (nVar2 != null) {
                    return new pg.n(nVar2.f21469a, Integer.valueOf(((String) nVar2.f21470b).length()));
                }
                return null;
            }
        }));
        ArrayList arrayList = new ArrayList(qg.p.h(nVar, 10));
        Iterator<Object> it = nVar.iterator();
        while (true) {
            b.a aVar = (b.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            jh.g range = (jh.g) aVar.next();
            kotlin.jvm.internal.r.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f15744a, range.f15745b + 1).toString());
        }
    }

    public static List P(String str, final char[] cArr) {
        kotlin.jvm.internal.r.e(str, "<this>");
        if (cArr.length == 1) {
            return N(str, String.valueOf(cArr[0]));
        }
        lh.n nVar = new lh.n(new b(str, new eh.p() { // from class: mh.u
            @Override // eh.p
            public final Object invoke(Object obj, Object obj2) {
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.r.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iZ = x.z(DelimitedRangesSequence, cArr, iIntValue, false);
                if (iZ < 0) {
                    return null;
                }
                return new pg.n(Integer.valueOf(iZ), 1);
            }
        }));
        ArrayList arrayList = new ArrayList(qg.p.h(nVar, 10));
        Iterator<Object> it = nVar.iterator();
        while (true) {
            b.a aVar = (b.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            jh.g range = (jh.g) aVar.next();
            kotlin.jvm.internal.r.e(range, "range");
            arrayList.add(str.subSequence(range.f15744a, range.f15745b + 1).toString());
        }
    }

    public static boolean Q(CharSequence prefix, String str) {
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(prefix, "prefix");
        return prefix instanceof String ? t.p(str, (String) prefix, false) : H(str, 0, prefix, 0, prefix.length(), false);
    }

    public static String R(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(missingDelimiterValue, "missingDelimiterValue");
        int iX = x(str, c10, 0, 6);
        if (iX == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iX + 1, str.length());
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S(String str, String delimiter, String str2) {
        kotlin.jvm.internal.r.e(delimiter, "delimiter");
        int iY = y(str, delimiter, 0, false, 6);
        if (iY == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iY, str.length());
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String T(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(missingDelimiterValue, "missingDelimiterValue");
        int iC = C(str, c10, 0, 6);
        if (iC == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iC + 1, str.length());
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String U(String missingDelimiterValue, char c10) {
        kotlin.jvm.internal.r.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.r.e(missingDelimiterValue, "missingDelimiterValue");
        int iX = x(missingDelimiterValue, c10, 0, 6);
        if (iX == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iX);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String V(String missingDelimiterValue, char c10) {
        kotlin.jvm.internal.r.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.r.e(missingDelimiterValue, "missingDelimiterValue");
        int iC = C(missingDelimiterValue, c10, 0, 6);
        if (iC == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iC);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence W(CharSequence charSequence) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zJ = g8.w.j(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zJ) {
                    break;
                }
                length--;
            } else if (zJ) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static String X(String str, char... cArr) {
        kotlin.jvm.internal.r.e(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zQ = qg.o.q(cArr, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zQ) {
                    break;
                }
                length--;
            } else if (zQ) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static String Y(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!qg.o.q(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean r(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        kotlin.jvm.internal.r.e(other, "other");
        if (other instanceof String) {
            if (y(charSequence, (String) other, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (w(charSequence, other, 0, charSequence.length(), z10, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean s(CharSequence charSequence, char c10) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        return x(charSequence, c10, 0, 2) >= 0;
    }

    public static boolean t(CharSequence charSequence, String str) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        return charSequence instanceof String ? t.i((String) charSequence, str, false) : H(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int u(CharSequence charSequence) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int v(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        kotlin.jvm.internal.r.e(string, "string");
        return (z10 || !(charSequence instanceof String)) ? w(charSequence, string, i10, charSequence.length(), z10, false) : ((String) charSequence).indexOf(string, i10);
    }

    public static final int w(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        jh.e eVar;
        if (z11) {
            int iU = u(charSequence);
            if (i10 > iU) {
                i10 = iU;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            eVar = new jh.e(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            eVar = new jh.g(i10, i11, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = eVar.f15746c;
        int i13 = eVar.f15745b;
        int i14 = eVar.f15744a;
        if (!z12 || !(charSequence2 instanceof String)) {
            boolean z13 = z10;
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z14 = z13;
                    z13 = z14;
                    if (!H(charSequence4, 0, charSequence3, i14, charSequence2.length(), z14)) {
                        if (i14 == i13) {
                            break;
                        }
                        i14 += i12;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i14;
                    }
                }
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            int i15 = i14;
            while (true) {
                String str = (String) charSequence2;
                boolean z15 = z10;
                if (!t.k(0, i15, str.length(), str, (String) charSequence, z15)) {
                    if (i15 == i13) {
                        break;
                    }
                    i15 += i12;
                    z10 = z15;
                } else {
                    return i15;
                }
            }
        }
        return -1;
    }

    public static int x(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? z(charSequence, new char[]{c10}, i10, false) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ int y(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return v(charSequence, str, i10, z10);
    }

    public static final int z(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iU = u(charSequence);
        if (i10 > iU) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c10 : cArr) {
                if (g8.w.i(c10, cCharAt, z10)) {
                    return i10;
                }
            }
            if (i10 == iU) {
                return -1;
            }
            i10++;
        }
    }
}
