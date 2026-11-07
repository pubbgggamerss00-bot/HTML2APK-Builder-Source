package cf;

import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public abstract class n extends b {
    static {
        i[] iVarArr = i.f5440d;
    }

    public static n i0(String str) throws IOException {
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            if ('0' <= cCharAt && cCharAt <= '9') {
                return i.q0(cCharAt - 48);
            }
            if (cCharAt == '-' || cCharAt == '.') {
                return i.f5441e;
            }
            throw new IOException("Not a number: ".concat(str));
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 == '.' || cCharAt2 == 'e') {
                f fVar = new f();
                try {
                    fVar.f5436c = str;
                    fVar.f5435b = new BigDecimal(fVar.f5436c);
                    fVar.q0();
                    return fVar;
                } catch (NumberFormatException e10) {
                    if (str.startsWith("--")) {
                        fVar.f5436c = str.substring(1);
                    } else {
                        if (!str.matches("^0\\.0*\\-\\d+")) {
                            throw new IOException(i8.n.d("Error expected floating point number actual='", str, "'"), e10);
                        }
                        fVar.f5436c = "-" + fVar.f5436c.replaceFirst("\\-", "");
                    }
                    try {
                        fVar.f5435b = new BigDecimal(fVar.f5436c);
                        fVar.q0();
                        return fVar;
                    } catch (NumberFormatException e11) {
                        throw new IOException(i8.n.d("Error expected floating point number actual='", str, "'"), e11);
                    }
                }
            }
        }
        try {
            return str.charAt(0) == '+' ? i.q0(Long.parseLong(str.substring(1))) : i.q0(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            if (((str.startsWith("+") || str.startsWith("-")) ? str.substring(1) : str).matches("[0-9]*")) {
                return str.startsWith("-") ? i.f5444h : i.f5443g;
            }
            throw new IOException("Not a number: ".concat(str));
        }
    }

    public abstract float g0();

    public abstract int k0();

    public abstract long l0();
}
