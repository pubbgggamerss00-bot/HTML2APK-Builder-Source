package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class aw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f2864a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f2865b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f2866c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f2867d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f2864a = new by1(mu1.class, new rj1(10));
        f2865b = new yx1(r32VarB, new sj1(8));
        f2866c = new cx1(hu1.class, new fo(25));
        f2867d = new zw1(r32VarB, new ih1(4));
    }

    public static lu1 a(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return lu1.f6856u;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return lu1.f6858w;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return lu1.f6857v;
    }

    public static q22 b(lu1 lu1Var) throws GeneralSecurityException {
        if (lu1.f6856u.equals(lu1Var)) {
            return q22.TINK;
        }
        if (lu1.f6857v.equals(lu1Var)) {
            return q22.CRUNCHY;
        }
        if (lu1.f6858w.equals(lu1Var)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(lu1Var)));
    }
}
