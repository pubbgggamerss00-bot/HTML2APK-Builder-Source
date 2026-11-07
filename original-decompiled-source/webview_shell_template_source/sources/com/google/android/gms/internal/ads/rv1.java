package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rv1 extends st1 {

    /* renamed from: u, reason: collision with root package name */
    public final tv1 f8715u;

    /* renamed from: v, reason: collision with root package name */
    public final xj1 f8716v;

    /* renamed from: w, reason: collision with root package name */
    public final r32 f8717w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f8718x;

    public rv1(tv1 tv1Var, xj1 xj1Var, r32 r32Var, Integer num) {
        super(2);
        this.f8715u = tv1Var;
        this.f8716v = xj1Var;
        this.f8717w = r32Var;
        this.f8718x = num;
    }

    public static rv1 m(tv1 tv1Var, xj1 xj1Var, Integer num) throws GeneralSecurityException {
        r32 r32VarB;
        r32 r32Var = (r32) xj1Var.f10619t;
        jv1 jv1Var = tv1Var.f9389a;
        jv1 jv1Var2 = jv1.f6173x;
        if (jv1Var != jv1Var2 && num == null) {
            throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("For given Variant ", jv1Var.f6176t, " the value of idRequirement must be non-null"));
        }
        if (jv1Var == jv1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (r32Var.f8536a.length != 32) {
            throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(r32Var.f8536a.length, "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (jv1Var == jv1Var2) {
            r32VarB = xx1.f10742a;
        } else {
            if (jv1Var != jv1.f6172w) {
                throw new IllegalStateException("Unknown Variant: ".concat(jv1Var.f6176t));
            }
            r32VarB = xx1.b(num.intValue());
        }
        return new rv1(tv1Var, xj1Var, r32VarB, num);
    }
}
