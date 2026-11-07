package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zz1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f11608a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f11609b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f11610c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f11611d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f11608a = new by1(gz1.class, new yz1(0));
        f11609b = new yx1(r32VarB, new ih1(11));
        f11610c = new cx1(bz1.class, new iu1(9));
        f11611d = new zw1(r32VarB, new ov1(5));
    }

    public static jv1 a(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return jv1.f6174y;
        }
        if (iOrdinal == 2) {
            return jv1.A;
        }
        if (iOrdinal == 3) {
            return jv1.B;
        }
        if (iOrdinal == 4) {
            return jv1.f6175z;
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static q22 b(jv1 jv1Var) throws GeneralSecurityException {
        if (jv1.f6174y.equals(jv1Var)) {
            return q22.TINK;
        }
        if (jv1.f6175z.equals(jv1Var)) {
            return q22.CRUNCHY;
        }
        if (jv1.B.equals(jv1Var)) {
            return q22.RAW;
        }
        if (jv1.A.equals(jv1Var)) {
            return q22.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(jv1Var)));
    }
}
