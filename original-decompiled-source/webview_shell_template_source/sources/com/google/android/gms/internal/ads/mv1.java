package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mv1 extends st1 {

    /* renamed from: u, reason: collision with root package name */
    public final nv1 f7225u;

    /* renamed from: v, reason: collision with root package name */
    public final r32 f7226v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f7227w;

    public mv1(nv1 nv1Var, r32 r32Var, Integer num) {
        super(2);
        this.f7225u = nv1Var;
        this.f7226v = r32Var;
        this.f7227w = num;
    }

    public static mv1 m(nv1 nv1Var, Integer num) throws GeneralSecurityException {
        r32 r32VarB;
        dt1 dt1Var = nv1Var.f7523a;
        if (dt1Var == dt1.f4024y) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            r32VarB = xx1.f10742a;
        } else {
            if (dt1Var != dt1.f4023x) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(dt1Var)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            r32VarB = xx1.b(num.intValue());
        }
        return new mv1(nv1Var, r32VarB, num);
    }
}
