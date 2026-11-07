package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iv1 extends st1 {

    /* renamed from: u, reason: collision with root package name */
    public final kv1 f5871u;

    /* renamed from: v, reason: collision with root package name */
    public final r32 f5872v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f5873w;

    public iv1(kv1 kv1Var, r32 r32Var, Integer num) {
        super(2);
        this.f5871u = kv1Var;
        this.f5872v = r32Var;
        this.f5873w = num;
    }

    public static iv1 m(kv1 kv1Var, Integer num) throws GeneralSecurityException {
        r32 r32VarA;
        jv1 jv1Var = kv1Var.f6504b;
        if (jv1Var == jv1.f6170u) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            r32VarA = r32.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (jv1Var != jv1.f6171v) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(jv1Var.f6176t));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            r32VarA = r32.a(new byte[0]);
        }
        return new iv1(kv1Var, r32VarA, num);
    }
}
