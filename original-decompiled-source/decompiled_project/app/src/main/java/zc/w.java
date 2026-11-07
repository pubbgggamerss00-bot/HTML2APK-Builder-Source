package zc;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35049a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i10;
    }

    public static final hd.a b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new v("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i10] = (byte) cCharAt;
        }
        return hd.a.a(bArr);
    }
}
