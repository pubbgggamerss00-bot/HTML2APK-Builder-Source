package x5;

import androidx.activity.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import x5.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class o extends l {
    public static String A(String str, String str2) {
        kotlin.jvm.internal.j.e("<this>", str);
        if (!l.j(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.j.d("substring(...)", strSubstring);
        return strSubstring;
    }

    public static List B(String str, char[] cArr) {
        kotlin.jvm.internal.j.e("<this>", str);
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iR = r(str, strValueOf, 0, false);
            if (iR == -1) {
                return e5.k.a(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iR).toString());
                length = strValueOf.length() + iR;
                iR = r(str, strValueOf, length, false);
            } while (iR != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        w5.k kVar = new w5.k(new b(str, new h0(cArr)));
        ArrayList arrayList2 = new ArrayList(e5.m.d(kVar));
        Iterator<Object> it = kVar.iterator();
        while (true) {
            b.a aVar = (b.a) it;
            if (!aVar.hasNext()) {
                return arrayList2;
            }
            u5.c cVar = (u5.c) aVar.next();
            kotlin.jvm.internal.j.e("range", cVar);
            arrayList2.add(str.subSequence(cVar.s, cVar.f14720t + 1).toString());
        }
    }

    public static String C(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("<this>", str);
        kotlin.jvm.internal.j.e("missingDelimiterValue", str3);
        int iT = t(str, str2, 0, false, 6);
        if (iT == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iT, str.length());
        kotlin.jvm.internal.j.d("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String D(String str, char c7, String str2) {
        kotlin.jvm.internal.j.e("<this>", str);
        kotlin.jvm.internal.j.e("missingDelimiterValue", str2);
        int iW = w(str, c7);
        if (iW == -1) {
            return str2;
        }
        String strSubstring = str.substring(iW + 1, str.length());
        kotlin.jvm.internal.j.d("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String E(String str, char c7) {
        int iS = s(str, c7, 6);
        if (iS == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iS);
        kotlin.jvm.internal.j.d("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String F(String str, String str2) {
        kotlin.jvm.internal.j.e("<this>", str);
        kotlin.jvm.internal.j.e("missingDelimiterValue", str);
        int iT = t(str, str2, 0, false, 6);
        if (iT == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iT);
        kotlin.jvm.internal.j.d("substring(...)", strSubstring);
        return strSubstring;
    }

    public static CharSequence G(CharSequence charSequence) {
        kotlin.jvm.internal.j.e("<this>", charSequence);
        int length = charSequence.length() - 1;
        int i6 = 0;
        boolean z6 = false;
        while (i6 <= length) {
            char cCharAt = charSequence.charAt(!z6 ? i6 : length);
            boolean z7 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z6) {
                if (!z7) {
                    break;
                }
                length--;
            } else if (z7) {
                i6++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i6, length + 1);
    }

    public static String H(String str, char... cArr) {
        kotlin.jvm.internal.j.e("<this>", str);
        int length = str.length() - 1;
        int i6 = 0;
        boolean z6 = false;
        while (i6 <= length) {
            boolean zU = e5.j.u(cArr, str.charAt(!z6 ? i6 : length));
            if (z6) {
                if (!zU) {
                    break;
                }
                length--;
            } else if (zU) {
                i6++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i6, length + 1).toString();
    }

    public static boolean o(CharSequence charSequence, String str, boolean z6) {
        kotlin.jvm.internal.j.e("<this>", charSequence);
        return t(charSequence, str, 0, z6, 2) >= 0;
    }

    public static boolean p(String str, char c7) {
        kotlin.jvm.internal.j.e("<this>", str);
        return s(str, c7, 2) >= 0;
    }

    public static final int q(CharSequence charSequence) {
        kotlin.jvm.internal.j.e("<this>", charSequence);
        return charSequence.length() - 1;
    }

    public static final int r(CharSequence charSequence, String str, int i6, boolean z6) {
        kotlin.jvm.internal.j.e("<this>", charSequence);
        kotlin.jvm.internal.j.e("string", str);
        if (!z6 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i6);
        }
        int length = charSequence.length();
        if (i6 < 0) {
            i6 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        u5.c cVar = new u5.c(i6, length, 1);
        boolean z7 = charSequence instanceof String;
        int i7 = cVar.f14721u;
        int i8 = cVar.f14720t;
        int i9 = cVar.s;
        if (!z7 || !(str instanceof String)) {
            boolean z8 = z6;
            if ((i7 <= 0 || i9 > i8) && (i7 >= 0 || i8 > i9)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z9 = z8;
                z8 = z9;
                if (y(str, 0, charSequence2, i9, str.length(), z9)) {
                    return i9;
                }
                if (i9 == i8) {
                    return -1;
                }
                i9 += i7;
                charSequence = charSequence2;
            }
        } else {
            if ((i7 <= 0 || i9 > i8) && (i7 >= 0 || i8 > i9)) {
                return -1;
            }
            int i10 = i9;
            while (true) {
                String str2 = str;
                boolean z10 = z6;
                if (l.l(0, i10, str.length(), str2, (String) charSequence, z10)) {
                    return i10;
                }
                if (i10 == i8) {
                    return -1;
                }
                i10 += i7;
                str = str2;
                z6 = z10;
            }
        }
    }

    public static int s(CharSequence charSequence, char c7, int i6) {
        kotlin.jvm.internal.j.e("<this>", charSequence);
        return !(charSequence instanceof String) ? u(charSequence, new char[]{c7}, 0, false) : ((String) charSequence).indexOf(c7, 0);
    }

    public static /* synthetic */ int t(CharSequence charSequence, String str, int i6, boolean z6, int i7) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return r(charSequence, str, i6, z6);
    }

    public static final int u(CharSequence charSequence, char[] cArr, int i6, boolean z6) {
        kotlin.jvm.internal.j.e("<this>", charSequence);
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i6);
        }
        if (i6 < 0) {
            i6 = 0;
        }
        int iQ = q(charSequence);
        if (i6 > iQ) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i6);
            for (char c7 : cArr) {
                if (j3.b.a(c7, cCharAt, z6)) {
                    return i6;
                }
            }
            if (i6 == iQ) {
                return -1;
            }
            i6++;
        }
    }

    public static boolean v(CharSequence charSequence) {
        kotlin.jvm.internal.j.e("<this>", charSequence);
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            char cCharAt = charSequence.charAt(i6);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static int w(String str, char c7) {
        int iQ = q(str);
        kotlin.jvm.internal.j.e("<this>", str);
        return str.lastIndexOf(c7, iQ);
    }

    public static w5.l x(String str) {
        kotlin.jvm.internal.j.e("<this>", str);
        List listAsList = Arrays.asList("\r\n", "\n", "\r");
        kotlin.jvm.internal.j.d("asList(...)", listAsList);
        return new w5.l(new b(str, new m(listAsList)), new n(str));
    }

    public static final boolean y(CharSequence charSequence, int i6, CharSequence charSequence2, int i7, int i8, boolean z6) {
        kotlin.jvm.internal.j.e("<this>", charSequence);
        kotlin.jvm.internal.j.e("other", charSequence2);
        if (i7 < 0 || i6 < 0 || i6 > charSequence.length() - i8 || i7 > charSequence2.length() - i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!j3.b.a(charSequence.charAt(i6 + i9), charSequence2.charAt(i7 + i9), z6)) {
                return false;
            }
        }
        return true;
    }

    public static String z(String str, String str2) {
        if (!l.n(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        kotlin.jvm.internal.j.d("substring(...)", strSubstring);
        return strSubstring;
    }
}
