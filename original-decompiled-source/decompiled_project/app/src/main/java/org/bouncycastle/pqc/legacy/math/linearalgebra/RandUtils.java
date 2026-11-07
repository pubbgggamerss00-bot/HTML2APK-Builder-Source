package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public class RandUtils {
    public static int nextInt(SecureRandom secureRandom, int i10) {
        int iNextInt;
        int i11;
        if (((-i10) & i10) == i10) {
            return (int) ((i10 * (secureRandom.nextInt() >>> 1)) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() >>> 1;
            i11 = iNextInt % i10;
        } while ((i10 - 1) + (iNextInt - i11) < 0);
        return i11;
    }
}
