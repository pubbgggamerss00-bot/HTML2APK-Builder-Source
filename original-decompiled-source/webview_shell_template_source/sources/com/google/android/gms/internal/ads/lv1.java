package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lv1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f6864a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f6865b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f6866c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f6867d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f6864a = new by1(kv1.class, new aa1(9));
        f6865b = new yx1(r32VarB, new rj1(8));
        f6866c = new cx1(iv1.class, new sj1(6));
        f6867d = new zw1(r32VarB, new fo(24));
    }

    public static jv1 a(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return jv1.f6170u;
        }
        if (iOrdinal == 3) {
            return jv1.f6171v;
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static q22 b(jv1 jv1Var) throws GeneralSecurityException {
        if (jv1.f6170u.equals(jv1Var)) {
            return q22.TINK;
        }
        if (jv1.f6171v.equals(jv1Var)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(jv1Var.f6176t));
    }
}
