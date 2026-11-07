package fd;

import ed.a0;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class h {
    public static String a(a0 a0Var) throws NoSuchAlgorithmException {
        int iOrdinal = a0Var.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 2) {
            return "HmacSha384";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        if (iOrdinal == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + a0Var);
    }
}
