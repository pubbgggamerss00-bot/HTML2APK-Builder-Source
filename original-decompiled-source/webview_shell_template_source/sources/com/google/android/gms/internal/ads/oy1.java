package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oy1 implements ty1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7885a;

    /* renamed from: b, reason: collision with root package name */
    public final r32 f7886b;

    /* renamed from: c, reason: collision with root package name */
    public final g42 f7887c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7888d;

    /* renamed from: e, reason: collision with root package name */
    public final q22 f7889e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f7890f;

    public oy1(String str, r32 r32Var, g42 g42Var, int i6, q22 q22Var, Integer num) {
        this.f7885a = str;
        this.f7886b = r32Var;
        this.f7887c = g42Var;
        this.f7888d = i6;
        this.f7889e = q22Var;
        this.f7890f = num;
    }

    public static oy1 a(String str, g42 g42Var, int i6, q22 q22Var, Integer num) {
        if (q22Var == q22.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new oy1(str, zy1.a(str), g42Var, i6, q22Var, num);
    }
}
