package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes3.dex */
class Rounding {
    public static int[] decompose(int i10, int i11) {
        int i12;
        int i13 = (i10 + CertificateBody.profileType) >> 7;
        if (i11 == 261888) {
            i12 = (((i13 * 1025) + PKIFailureInfo.badSenderNonce) >> 22) & 15;
        } else {
            if (i11 != 95232) {
                throw new RuntimeException("Wrong Gamma2!");
            }
            int i14 = ((i13 * 11275) + 8388608) >> 24;
            i12 = i14 ^ (((43 - i14) >> 31) & i14);
        }
        int i15 = i10 - ((i12 * 2) * i11);
        return new int[]{i15 - (((4190208 - i15) >> 31) & DilithiumEngine.DilithiumQ), i12};
    }

    public static int makeHint(int i10, int i11, DilithiumEngine dilithiumEngine) {
        int i12;
        int dilithiumGamma2 = dilithiumEngine.getDilithiumGamma2();
        if (i10 <= dilithiumGamma2 || i10 > (i12 = DilithiumEngine.DilithiumQ - dilithiumGamma2)) {
            return 0;
        }
        return (i10 == i12 && i11 == 0) ? 0 : 1;
    }

    public static int[] power2Round(int i10) {
        int i11 = (i10 + 4095) >> 13;
        return new int[]{i11, i10 - (i11 << 13)};
    }

    public static int useHint(int i10, int i11, int i12) {
        int[] iArrDecompose = decompose(i10, i12);
        int i13 = iArrDecompose[0];
        int i14 = iArrDecompose[1];
        if (i11 == 0) {
            return i14;
        }
        if (i12 == 261888) {
            return (i13 > 0 ? i14 + 1 : i14 - 1) & 15;
        }
        if (i12 != 95232) {
            throw new RuntimeException("Wrong Gamma2!");
        }
        if (i13 > 0) {
            if (i14 == 43) {
                return 0;
            }
            return i14 + 1;
        }
        if (i14 == 0) {
            return 43;
        }
        return i14 - 1;
    }
}
