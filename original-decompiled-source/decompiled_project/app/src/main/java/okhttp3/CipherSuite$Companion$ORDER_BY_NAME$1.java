package okhttp3;

import java.util.Comparator;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String a10 = str;
        String b10 = str2;
        r.e(a10, "a");
        r.e(b10, "b");
        int iMin = Math.min(a10.length(), b10.length());
        for (int i10 = 4; i10 < iMin; i10++) {
            char cCharAt = a10.charAt(i10);
            char cCharAt2 = b10.charAt(i10);
            if (cCharAt != cCharAt2) {
                return r.f(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a10.length();
        int length2 = b10.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
