package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f5509a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f5510b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f5511c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f5512d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f5509a = new by1(cv1.class, new rj1(12));
        f5510b = new yx1(r32VarB, new sj1(10));
        f5511c = new cx1(av1.class, new fo(27));
        f5512d = new zw1(r32VarB, new ih1(6));
    }

    public static tu1 a(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return tu1.f9378x;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return tu1.f9380z;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return tu1.f9379y;
    }

    public static q22 b(tu1 tu1Var) throws GeneralSecurityException {
        if (tu1.f9378x.equals(tu1Var)) {
            return q22.TINK;
        }
        if (tu1.f9379y.equals(tu1Var)) {
            return q22.CRUNCHY;
        }
        if (tu1.f9380z.equals(tu1Var)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(tu1Var.f9381t));
    }
}
