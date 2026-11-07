package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uv1 extends st1 {

    /* renamed from: u, reason: collision with root package name */
    public final xv1 f9638u;

    /* renamed from: v, reason: collision with root package name */
    public final xj1 f9639v;

    /* renamed from: w, reason: collision with root package name */
    public final r32 f9640w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f9641x;

    public uv1(xv1 xv1Var, xj1 xj1Var, r32 r32Var, Integer num) {
        super(2);
        this.f9638u = xv1Var;
        this.f9639v = xj1Var;
        this.f9640w = r32Var;
        this.f9641x = num;
    }

    public static uv1 m(du1 du1Var, xj1 xj1Var, Integer num) throws GeneralSecurityException {
        r32 r32VarB;
        r32 r32Var = (r32) xj1Var.f10619t;
        du1 du1Var2 = du1.f4037j;
        if (du1Var != du1Var2 && num == null) {
            throw new GeneralSecurityException(androidx.camera.camera2.internal.v0.b("For given Variant ", du1Var.f4039b, " the value of idRequirement must be non-null"));
        }
        if (du1Var == du1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (r32Var.f8536a.length != 32) {
            throw new GeneralSecurityException(androidx.camera.camera2.internal.compat.workaround.c.d(r32Var.f8536a.length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        xv1 xv1Var = new xv1(du1Var);
        du1 du1Var3 = xv1Var.f10720a;
        if (du1Var3 == du1Var2) {
            r32VarB = xx1.f10742a;
        } else if (du1Var3 == du1.f4036i) {
            r32VarB = xx1.a(num.intValue());
        } else {
            if (du1Var3 != du1.h) {
                throw new IllegalStateException("Unknown Variant: ".concat(du1Var3.f4039b));
            }
            r32VarB = xx1.b(num.intValue());
        }
        return new uv1(xv1Var, xj1Var, r32VarB, num);
    }
}
