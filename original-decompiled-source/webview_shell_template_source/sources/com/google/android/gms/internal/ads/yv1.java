package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yv1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f11090a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f11091b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f11092c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f11093d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f11090a = new by1(fu1.class, new ih1(3));
        f11091b = new yx1(r32VarB, new iu1(4));
        f11092c = new cx1(yt1.class, new ov1(1));
        f11093d = new zw1(r32VarB, new aa1(12));
    }

    public static du1 a(n12 n12Var) throws GeneralSecurityException {
        int iOrdinal = n12Var.ordinal();
        if (iOrdinal == 1) {
            return du1.f4031c;
        }
        if (iOrdinal == 2) {
            return du1.f4034f;
        }
        if (iOrdinal == 3) {
            return du1.f4033e;
        }
        if (iOrdinal == 4) {
            return du1.f4035g;
        }
        if (iOrdinal == 5) {
            return du1.f4032d;
        }
        throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(n12Var.zza(), "Unable to parse HashType: "));
    }

    public static eu1 b(q22 q22Var) throws GeneralSecurityException {
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            return eu1.f4401u;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return eu1.f4403w;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return eu1.f4402v;
    }

    public static t12 c(fu1 fu1Var) {
        n12 n12Var;
        s12 s12VarD = t12.D();
        int i6 = fu1Var.f4784d;
        s12VarD.i();
        ((t12) s12VarD.f4126t).zzd = i6;
        du1 du1Var = fu1Var.f4786f;
        if (du1.f4031c.equals(du1Var)) {
            n12Var = n12.SHA1;
        } else if (du1.f4032d.equals(du1Var)) {
            n12Var = n12.SHA224;
        } else if (du1.f4033e.equals(du1Var)) {
            n12Var = n12.SHA256;
        } else if (du1.f4034f.equals(du1Var)) {
            n12Var = n12.SHA384;
        } else {
            if (!du1.f4035g.equals(du1Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(du1Var)));
            }
            n12Var = n12.SHA512;
        }
        s12VarD.i();
        ((t12) s12VarD.f4126t).zzc = n12Var.zza();
        return (t12) s12VarD.g();
    }

    public static q22 d(eu1 eu1Var) throws GeneralSecurityException {
        if (eu1.f4401u.equals(eu1Var)) {
            return q22.TINK;
        }
        if (eu1.f4402v.equals(eu1Var)) {
            return q22.CRUNCHY;
        }
        if (eu1.f4403w.equals(eu1Var)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(eu1Var)));
    }
}
