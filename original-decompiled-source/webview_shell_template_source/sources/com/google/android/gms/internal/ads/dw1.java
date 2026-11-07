package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f4053a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f4054b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f4055c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f4056d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f4053a = new by1(uu1.class, new ov1(2));
        f4054b = new yx1(r32VarB, new aa1(13));
        f4055c = new cx1(ou1.class, new rj1(11));
        f4056d = new zw1(r32VarB, new sj1(9));
    }

    public static tu1 a(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return tu1.f9375u;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return tu1.f9377w;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return tu1.f9376v;
    }

    public static q22 b(tu1 tu1Var) throws GeneralSecurityException {
        if (tu1.f9375u.equals(tu1Var)) {
            return q22.TINK;
        }
        if (tu1.f9376v.equals(tu1Var)) {
            return q22.CRUNCHY;
        }
        if (tu1.f9377w.equals(tu1Var)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(tu1Var)));
    }
}
