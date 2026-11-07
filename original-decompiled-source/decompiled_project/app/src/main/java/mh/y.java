package mh;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class y extends x {
    public static String Z(int i10, String str) {
        kotlin.jvm.internal.r.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static char a0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(x.u(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String b0(int i10, String str) {
        kotlin.jvm.internal.r.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
