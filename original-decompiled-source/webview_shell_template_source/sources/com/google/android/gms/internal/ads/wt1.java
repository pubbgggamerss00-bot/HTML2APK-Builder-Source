package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wt1 {

    /* renamed from: a, reason: collision with root package name */
    public fu1 f10270a = null;

    /* renamed from: b, reason: collision with root package name */
    public xj1 f10271b = null;

    /* renamed from: c, reason: collision with root package name */
    public xj1 f10272c = null;

    /* renamed from: d, reason: collision with root package name */
    public Integer f10273d = null;

    public final yt1 a() throws GeneralSecurityException {
        xj1 xj1Var;
        r32 r32VarB;
        fu1 fu1Var = this.f10270a;
        if (fu1Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        xj1 xj1Var2 = this.f10271b;
        if (xj1Var2 == null || (xj1Var = this.f10272c) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (fu1Var.f4781a != ((r32) xj1Var2.f10619t).f8536a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (fu1Var.f4782b != ((r32) xj1Var.f10619t).f8536a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (fu1Var.a() && this.f10273d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f10270a.a() && this.f10273d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        eu1 eu1Var = this.f10270a.f4785e;
        if (eu1Var == eu1.f4403w) {
            r32VarB = xx1.f10742a;
        } else if (eu1Var == eu1.f4402v) {
            r32VarB = xx1.a(this.f10273d.intValue());
        } else {
            if (eu1Var != eu1.f4401u) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f10270a.f4785e)));
            }
            r32VarB = xx1.b(this.f10273d.intValue());
        }
        return new yt1(this.f10270a, this.f10271b, this.f10272c, r32VarB, this.f10273d);
    }
}
