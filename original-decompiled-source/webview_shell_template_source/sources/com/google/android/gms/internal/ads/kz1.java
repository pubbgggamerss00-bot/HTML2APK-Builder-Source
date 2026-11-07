package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kz1 {

    /* renamed from: a, reason: collision with root package name */
    public qz1 f6536a = null;

    /* renamed from: b, reason: collision with root package name */
    public xj1 f6537b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f6538c = null;

    public final lz1 a() throws GeneralSecurityException {
        xj1 xj1Var;
        r32 r32VarA;
        qz1 qz1Var = this.f6536a;
        if (qz1Var == null || (xj1Var = this.f6537b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qz1Var.f8488a != ((r32) xj1Var.f10619t).f8536a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (qz1Var.a() && this.f6538c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f6536a.a() && this.f6538c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        pz1 pz1Var = this.f6536a.f8490c;
        if (pz1Var == pz1.f8185e) {
            r32VarA = xx1.f10742a;
        } else if (pz1Var == pz1.f8184d || pz1Var == pz1.f8183c) {
            r32VarA = xx1.a(this.f6538c.intValue());
        } else {
            if (pz1Var != pz1.f8182b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f6536a.f8490c)));
            }
            r32VarA = xx1.b(this.f6538c.intValue());
        }
        return new lz1(this.f6536a, this.f6537b, r32VarA, this.f6538c);
    }
}
