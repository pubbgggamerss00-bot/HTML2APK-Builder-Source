package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f9402a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f9403b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f9404c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f9405d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f9402a = new by1(xv1.class, new sj1(12));
        f9403b = new yx1(r32VarB, new fo(28));
        f9404c = new cx1(uv1.class, new ih1(8));
        f9405d = new zw1(r32VarB, new iu1(7));
    }

    public static du1 a(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return du1.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return du1.f4037j;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return du1.f4036i;
    }

    public static q22 b(du1 du1Var) throws GeneralSecurityException {
        if (du1.h.equals(du1Var)) {
            return q22.TINK;
        }
        if (du1.f4036i.equals(du1Var)) {
            return q22.CRUNCHY;
        }
        if (du1.f4037j.equals(du1Var)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(du1Var.f4039b));
    }
}
