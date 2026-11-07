package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pv1 {

    /* renamed from: a, reason: collision with root package name */
    public static final by1 f8160a;

    /* renamed from: b, reason: collision with root package name */
    public static final yx1 f8161b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx1 f8162c;

    /* renamed from: d, reason: collision with root package name */
    public static final zw1 f8163d;

    static {
        r32 r32VarB = zy1.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f8160a = new by1(nv1.class, new ov1(0));
        f8161b = new yx1(r32VarB, new aa1(10));
        f8162c = new cx1(mv1.class, new rj1(9));
        f8163d = new zw1(r32VarB, new sj1(7));
    }

    public static nv1 a(p22 p22Var, q22 q22Var) throws GeneralSecurityException {
        eu1 eu1Var;
        dt1 dt1Var = dt1.f4024y;
        Object obj = eu1.F;
        eu1 eu1Var2 = eu1.E;
        eu1 eu1Var3 = eu1.D;
        eu1 eu1Var4 = eu1.B;
        eu1 eu1Var5 = eu1.C;
        eu1 eu1Var6 = eu1.A;
        w12 w12VarB = x12.B();
        w12VarB.k(p22Var.B().H());
        w12VarB.l(p22Var.B().G());
        w12VarB.j(q22.RAW);
        lt1 lt1VarC = rj1.c(((x12) w12VarB.g()).i());
        if (lt1VarC instanceof uu1) {
            eu1Var = eu1Var6;
        } else if (lt1VarC instanceof cv1) {
            eu1Var = eu1Var5;
        } else if (lt1VarC instanceof xv1) {
            eu1Var = eu1Var4;
        } else if (lt1VarC instanceof fu1) {
            eu1Var = eu1Var3;
        } else if (lt1VarC instanceof mu1) {
            eu1Var = eu1Var2;
        } else {
            if (!(lt1VarC instanceof zu1)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(lt1VarC.toString()));
            }
            eu1Var = obj;
        }
        int iOrdinal = q22Var.ordinal();
        if (iOrdinal == 1) {
            dt1Var = dt1.f4023x;
        } else if (iOrdinal != 3) {
            throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(q22Var.zza(), "Unable to parse OutputPrefixType: "));
        }
        String strF = p22Var.F();
        tt1 tt1Var = (tt1) lt1VarC;
        if (strF == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (tt1Var == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (tt1Var.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((eu1Var.equals(eu1Var6) && (tt1Var instanceof uu1)) || ((eu1Var.equals(eu1Var5) && (tt1Var instanceof cv1)) || ((eu1Var.equals(eu1Var4) && (tt1Var instanceof xv1)) || ((eu1Var.equals(eu1Var3) && (tt1Var instanceof fu1)) || ((eu1Var.equals(eu1Var2) && (tt1Var instanceof mu1)) || (eu1Var.equals(obj) && (tt1Var instanceof zu1))))))) {
            return new nv1(dt1Var, strF, eu1Var, tt1Var);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + eu1Var.f4407t + " when new keys are picked according to " + String.valueOf(tt1Var) + ".");
    }

    public static p22 b(nv1 nv1Var) {
        byte[] bArrN = rj1.n(nv1Var.f7526d);
        try {
            u42 u42Var = u42.f9458b;
            u62 u62Var = u62.f9474c;
            x12 x12VarE = x12.E(bArrN, u42.f9459c);
            o22 o22VarC = p22.C();
            String str = nv1Var.f7524b;
            o22VarC.i();
            p22.H((p22) o22VarC.f4126t, str);
            o22VarC.i();
            p22.G((p22) o22VarC.f4126t, x12VarE);
            return (p22) o22VarC.g();
        } catch (u52 e6) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
        }
    }

    public static q22 c(dt1 dt1Var) throws GeneralSecurityException {
        if (dt1.f4023x.equals(dt1Var)) {
            return q22.TINK;
        }
        if (dt1.f4024y.equals(dt1Var)) {
            return q22.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(dt1Var)));
    }
}
