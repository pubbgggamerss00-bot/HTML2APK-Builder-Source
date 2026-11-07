package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p32 implements kt1 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f7926e = {0};

    /* renamed from: a, reason: collision with root package name */
    public final e02 f7927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7928b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7929c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7930d;

    public p32(bz1 bz1Var) {
        this.f7927a = new m32(((r32) bz1Var.f3333v.f10619t).b());
        gz1 gz1Var = bz1Var.f3332u;
        this.f7928b = gz1Var.f5192b;
        this.f7929c = bz1Var.f3334w.b();
        if (gz1Var.f5193c.equals(jv1.A)) {
            this.f7930d = Arrays.copyOf(f7926e, 1);
        } else {
            this.f7930d = new byte[0];
        }
    }

    public p32(lz1 lz1Var) {
        qz1 qz1Var = lz1Var.f6885u;
        String strValueOf = String.valueOf(qz1Var.f8491d);
        this.f7927a = new o32("HMAC".concat(strValueOf), new SecretKeySpec(((r32) lz1Var.f6886v.f10619t).b(), "HMAC"));
        this.f7928b = qz1Var.f8489b;
        this.f7929c = lz1Var.f6887w.b();
        if (qz1Var.f8490c.equals(pz1.f8184d)) {
            this.f7930d = Arrays.copyOf(f7926e, 1);
        } else {
            this.f7930d = new byte[0];
        }
    }

    public p32(o32 o32Var, int i6) throws IllegalStateException, InvalidAlgorithmParameterException {
        this.f7927a = o32Var;
        this.f7928b = i6;
        this.f7929c = new byte[0];
        this.f7930d = new byte[0];
        o32Var.a(i6, new byte[0]);
    }
}
