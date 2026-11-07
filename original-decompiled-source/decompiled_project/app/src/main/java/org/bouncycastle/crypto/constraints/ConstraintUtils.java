package org.bouncycastle.crypto.constraints;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: classes2.dex */
public class ConstraintUtils {
    public static int bitsOfSecurityFor(BigInteger bigInteger) {
        return bitsOfSecurityForFF(bigInteger.bitLength());
    }

    public static int bitsOfSecurityForFF(int i10) {
        if (i10 < 2048) {
            return i10 >= 1024 ? 80 : 20;
        }
        if (i10 < 3072) {
            return 112;
        }
        if (i10 >= 7680) {
            return i10 >= 15360 ? 256 : 192;
        }
        return 128;
    }

    public static int bitsOfSecurityFor(ECCurve eCCurve) {
        int fieldSize = (eCCurve.getFieldSize() + 1) / 2;
        if (fieldSize > 256) {
            return 256;
        }
        return fieldSize;
    }
}
