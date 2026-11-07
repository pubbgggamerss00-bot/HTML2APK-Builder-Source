package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ew1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f4408a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f4409b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f4410c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f4411d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f4408a = new by1(zu1.class, new fo(26));
        f4409b = new yx1(r32VarB, new ih1(5));
        f4410c = new cx1(wu1.class, new iu1(5));
        f4411d = new zw1(r32VarB, new ov1(3));
    }

    public static eu1 a(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return eu1.f4404x;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return eu1.f4406z;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return eu1.f4405y;
    }

    public static q22 b(eu1 eu1Var) throws GeneralSecurityException {
        if (eu1.f4404x.equals(eu1Var)) {
            return q22.TINK;
        }
        if (eu1.f4405y.equals(eu1Var)) {
            return q22.CRUNCHY;
        }
        if (eu1.f4406z.equals(eu1Var)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(eu1Var)));
    }
}
