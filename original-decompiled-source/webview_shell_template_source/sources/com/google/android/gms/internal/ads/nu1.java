package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nu1 {

    /* renamed from: a, reason: collision with root package name */
    public uu1 f7511a = null;

    /* renamed from: b, reason: collision with root package name */
    public xj1 f7512b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f7513c = null;

    public final ou1 a() throws GeneralSecurityException {
        xj1 xj1Var;
        r32 r32VarB;
        uu1 uu1Var = this.f7511a;
        if (uu1Var == null || (xj1Var = this.f7512b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (uu1Var.f9634a != ((r32) xj1Var.f10619t).f8536a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (uu1Var.a() && this.f7513c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f7511a.a() && this.f7513c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        tu1 tu1Var = this.f7511a.f9635b;
        if (tu1Var == tu1.f9377w) {
            r32VarB = xx1.f10742a;
        } else if (tu1Var == tu1.f9376v) {
            r32VarB = xx1.a(this.f7513c.intValue());
        } else {
            if (tu1Var != tu1.f9375u) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f7511a.f9635b)));
            }
            r32VarB = xx1.b(this.f7513c.intValue());
        }
        return new ou1(this.f7511a, this.f7512b, r32VarB, this.f7513c);
    }
}
