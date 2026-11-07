package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o7 implements z8 {

    /* renamed from: t, reason: collision with root package name */
    public static final e1 f11859t = new e1();
    public Object s;

    public o7(int i6) {
        switch (i6) {
            case 1:
                break;
            default:
                int i7 = a6.f11630a;
                n7 n7Var = new n7(v6.f11917a, f11859t);
                Charset charset = e7.f11716a;
                this.s = n7Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public Object zzb() {
        y8 y8Var = (y8) this.s;
        if (y8Var != null) {
            return y8Var.zzb();
        }
        throw new IllegalStateException();
    }
}
