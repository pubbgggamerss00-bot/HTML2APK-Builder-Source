package org.bouncycastle.pqc.legacy.crypto.qtesla;

import j2.y;

/* loaded from: classes3.dex */
public class QTESLASecurityCategory {
    public static final int PROVABLY_SECURE_I = 5;
    public static final int PROVABLY_SECURE_III = 6;

    private QTESLASecurityCategory() {
    }

    public static String getName(int i10) {
        if (i10 == 5) {
            return "qTESLA-p-I";
        }
        if (i10 == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException(y.a(i10, "unknown security category: "));
    }

    public static int getPrivateSize(int i10) {
        if (i10 == 5) {
            return 5224;
        }
        if (i10 == 6) {
            return 12392;
        }
        throw new IllegalArgumentException(y.a(i10, "unknown security category: "));
    }

    public static int getPublicSize(int i10) {
        if (i10 == 5) {
            return 14880;
        }
        if (i10 == 6) {
            return 38432;
        }
        throw new IllegalArgumentException(y.a(i10, "unknown security category: "));
    }

    public static int getSignatureSize(int i10) {
        if (i10 == 5) {
            return 2592;
        }
        if (i10 == 6) {
            return 5664;
        }
        throw new IllegalArgumentException(y.a(i10, "unknown security category: "));
    }

    public static void validate(int i10) {
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(y.a(i10, "unknown security category: "));
        }
    }
}
