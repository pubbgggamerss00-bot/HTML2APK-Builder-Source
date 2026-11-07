package mh;

/* loaded from: classes2.dex */
public class t extends s {
    public static boolean i(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : k(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean j(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean k(int i10, int i11, int i12, String str, String other, boolean z10) {
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static String l(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.b(string);
        return string;
    }

    public static String m(String str, char c10, char c11) {
        kotlin.jvm.internal.r.e(str, "<this>");
        String strReplace = str.replace(c10, c11);
        kotlin.jvm.internal.r.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static String n(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(oldValue, "oldValue");
        kotlin.jvm.internal.r.e(newValue, "newValue");
        int iV = x.v(str, oldValue, 0, false);
        if (iV < 0) {
            return str;
        }
        int length = oldValue.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb.append((CharSequence) str, i11, iV);
            sb.append(newValue);
            i11 = iV + length;
            if (iV >= str.length()) {
                break;
            }
            iV = x.v(str, oldValue, iV + i10, false);
        } while (iV > 0);
        sb.append((CharSequence) str, i11, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    public static boolean o(String str, String str2, int i10, boolean z10) {
        kotlin.jvm.internal.r.e(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : k(i10, 0, str2.length(), str, str2, z10);
    }

    public static boolean p(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.r.e(str, "<this>");
        kotlin.jvm.internal.r.e(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : k(0, 0, prefix.length(), str, prefix, z10);
    }
}
