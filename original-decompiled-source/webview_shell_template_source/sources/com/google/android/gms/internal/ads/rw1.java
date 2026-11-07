package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f8722a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f8723b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f8724c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f8725d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f8722a = new by1(tv1.class, new ih1(7));
        f8723b = new yx1(r32VarB, new iu1(6));
        f8724c = new cx1(rv1.class, new ov1(4));
        f8725d = new zw1(r32VarB, new aa1(14));
    }

    public static jv1 a(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return jv1.f6172w;
        }
        if (iOrdinal == 3) {
            return jv1.f6173x;
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static q22 b(jv1 jv1Var) throws GeneralSecurityException {
        if (Objects.equals(jv1Var, jv1.f6172w)) {
            return q22.TINK;
        }
        if (Objects.equals(jv1Var, jv1.f6173x)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(jv1Var.f6176t));
    }
}
