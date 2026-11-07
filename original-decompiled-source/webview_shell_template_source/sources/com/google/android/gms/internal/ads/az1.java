package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class az1 {

    /* renamed from: a, reason: collision with root package name */
    public gz1 f2876a = null;

    /* renamed from: b, reason: collision with root package name */
    public xj1 f2877b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f2878c = null;

    public final bz1 a() throws GeneralSecurityException {
        xj1 xj1Var;
        r32 r32VarA;
        gz1 gz1Var = this.f2876a;
        if (gz1Var == null || (xj1Var = this.f2877b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (gz1Var.f5191a != ((r32) xj1Var.f10619t).f8536a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (gz1Var.a() && this.f2878c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f2876a.a() && this.f2878c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        jv1 jv1Var = this.f2876a.f5193c;
        if (jv1Var == jv1.B) {
            r32VarA = xx1.f10742a;
        } else if (jv1Var == jv1.A || jv1Var == jv1.f6175z) {
            r32VarA = xx1.a(this.f2878c.intValue());
        } else {
            if (jv1Var != jv1.f6174y) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f2876a.f5193c)));
            }
            r32VarA = xx1.b(this.f2878c.intValue());
        }
        return new bz1(this.f2876a, this.f2877b, r32VarA, this.f2878c);
    }
}
