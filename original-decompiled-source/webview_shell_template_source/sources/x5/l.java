package x5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class l extends k {
    public static boolean j(String str, String str2, boolean z6) {
        kotlin.jvm.internal.j.e("<this>", str);
        kotlin.jvm.internal.j.e("suffix", str2);
        return !z6 ? str.endsWith(str2) : l(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean k(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final boolean l(int i6, int i7, int i8, String str, String str2, boolean z6) {
        kotlin.jvm.internal.j.e("<this>", str);
        kotlin.jvm.internal.j.e("other", str2);
        return !z6 ? str.regionMatches(i6, str2, i7, i8) : str.regionMatches(z6, i6, str2, i7, i8);
    }

    public static String m(String str, String str2, String str3) {
        kotlin.jvm.internal.j.e("<this>", str);
        int iR = o.r(str, str2, 0, false);
        if (iR < 0) {
            return str;
        }
        int length = str2.length();
        int i6 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i7 = 0;
        do {
            sb.append((CharSequence) str, i7, iR);
            sb.append(str3);
            i7 = iR + length;
            if (iR >= str.length()) {
                break;
            }
            iR = o.r(str, str2, iR + i6, false);
        } while (iR > 0);
        sb.append((CharSequence) str, i7, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.j.d("toString(...)", string);
        return string;
    }

    public static boolean n(String str, String str2, boolean z6) {
        kotlin.jvm.internal.j.e("<this>", str);
        return !z6 ? str.startsWith(str2) : l(0, 0, str2.length(), str, str2, z6);
    }
}
