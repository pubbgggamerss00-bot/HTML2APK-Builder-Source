package x5;

import androidx.camera.camera2.internal.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class p extends o {
    public static String I(int i6, String str) {
        kotlin.jvm.internal.j.e("<this>", str);
        if (i6 < 0) {
            throw new IllegalArgumentException(s0.a(i6, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i6 > length) {
            i6 = length;
        }
        String strSubstring = str.substring(0, i6);
        kotlin.jvm.internal.j.d("substring(...)", strSubstring);
        return strSubstring;
    }
}
