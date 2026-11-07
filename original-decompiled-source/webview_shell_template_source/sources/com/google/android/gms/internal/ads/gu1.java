package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gu1 {

    /* renamed from: a, reason: collision with root package name */
    public mu1 f5166a = null;

    /* renamed from: b, reason: collision with root package name */
    public xj1 f5167b = null;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5168c = null;

    public final hu1 a() throws GeneralSecurityException {
        xj1 xj1Var;
        r32 r32VarB;
        mu1 mu1Var = this.f5166a;
        if (mu1Var == null || (xj1Var = this.f5167b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (mu1Var.f7222a != ((r32) xj1Var.f10619t).f8536a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (mu1Var.a() && this.f5168c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f5166a.a() && this.f5168c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        lu1 lu1Var = this.f5166a.f7224c;
        if (lu1Var == lu1.f6858w) {
            r32VarB = xx1.f10742a;
        } else if (lu1Var == lu1.f6857v) {
            r32VarB = xx1.a(this.f5168c.intValue());
        } else {
            if (lu1Var != lu1.f6856u) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f5166a.f7224c)));
            }
            r32VarB = xx1.b(this.f5168c.intValue());
        }
        return new hu1(this.f5166a, this.f5167b, r32VarB, this.f5168c);
    }
}
