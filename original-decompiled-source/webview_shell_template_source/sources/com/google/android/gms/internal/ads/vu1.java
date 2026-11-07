package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vu1 {

    /* renamed from: a, reason: collision with root package name */
    public zu1 f9941a = null;

    /* renamed from: b, reason: collision with root package name */
    public xj1 f9942b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f9943c = null;

    public final wu1 a() throws GeneralSecurityException {
        xj1 xj1Var;
        r32 r32VarB;
        zu1 zu1Var = this.f9941a;
        if (zu1Var == null || (xj1Var = this.f9942b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zu1Var.f11583a != ((r32) xj1Var.f10619t).f8536a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zu1Var.a() && this.f9943c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f9941a.a() && this.f9943c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        eu1 eu1Var = this.f9941a.f11584b;
        if (eu1Var == eu1.f4406z) {
            r32VarB = xx1.f10742a;
        } else if (eu1Var == eu1.f4405y) {
            r32VarB = xx1.a(this.f9943c.intValue());
        } else {
            if (eu1Var != eu1.f4404x) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f9941a.f11584b)));
            }
            r32VarB = xx1.b(this.f9943c.intValue());
        }
        return new wu1(this.f9941a, this.f9942b, r32VarB, this.f9943c);
    }
}
