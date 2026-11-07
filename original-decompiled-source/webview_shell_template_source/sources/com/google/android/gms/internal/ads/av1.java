package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class av1 extends st1 {

    /* renamed from: u, reason: collision with root package name */
    public final cv1 f2857u;

    /* renamed from: v, reason: collision with root package name */
    public final xj1 f2858v;

    /* renamed from: w, reason: collision with root package name */
    public final r32 f2859w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f2860x;

    public av1(cv1 cv1Var, xj1 xj1Var, r32 r32Var, Integer num) {
        super(2);
        this.f2857u = cv1Var;
        this.f2858v = xj1Var;
        this.f2859w = r32Var;
        this.f2860x = num;
    }

    public static av1 m(tu1 tu1Var, xj1 xj1Var, Integer num) throws GeneralSecurityException {
        r32 r32VarB;
        r32 r32Var = (r32) xj1Var.f10619t;
        tu1 tu1Var2 = tu1.f9380z;
        if (tu1Var != tu1Var2 && num == null) {
            throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("For given Variant ", tu1Var.f9381t, " the value of idRequirement must be non-null"));
        }
        if (tu1Var == tu1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (r32Var.f8536a.length != 32) {
            throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(r32Var.f8536a.length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        cv1 cv1Var = new cv1(tu1Var);
        tu1 tu1Var3 = cv1Var.f3674a;
        if (tu1Var3 == tu1Var2) {
            r32VarB = xx1.f10742a;
        } else if (tu1Var3 == tu1.f9379y) {
            r32VarB = xx1.a(num.intValue());
        } else {
            if (tu1Var3 != tu1.f9378x) {
                throw new IllegalStateException("Unknown Variant: ".concat(tu1Var3.f9381t));
            }
            r32VarB = xx1.b(num.intValue());
        }
        return new av1(cv1Var, xj1Var, r32VarB, num);
    }
}
