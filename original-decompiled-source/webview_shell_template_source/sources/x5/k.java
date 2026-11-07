package x5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class k extends j {
    public static Integer i(String str) {
        boolean z6;
        int i6;
        int i7;
        kotlin.jvm.internal.j.e("<this>", str);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char cCharAt = str.charAt(0);
        int i9 = -2147483647;
        if (cCharAt < '0') {
            i6 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i9 = Integer.MIN_VALUE;
                z6 = true;
            }
        } else {
            z6 = false;
            i6 = 0;
        }
        int i10 = -59652323;
        while (i6 < length) {
            int iDigit = Character.digit((int) str.charAt(i6), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i8 < i10 && (i10 != -59652323 || i8 < (i10 = i9 / 10))) || (i7 = i8 * 10) < i9 + iDigit) {
                return null;
            }
            i8 = i7 - iDigit;
            i6++;
        }
        return z6 ? Integer.valueOf(i8) : Integer.valueOf(-i8);
    }
}
