package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: c, reason: collision with root package name */
    public static final b8 f11644c = new b8();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11646b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final o7 f11645a = new o7(0);

    public final e8 a(Class cls) {
        Charset charset = e7.f11716a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f11646b;
        e8 z7Var = (e8) concurrentHashMap.get(cls);
        if (z7Var == null) {
            o7 o7Var = this.f11645a;
            o7Var.getClass();
            p1 p1Var = f8.f11738a;
            if (!z6.class.isAssignableFrom(cls)) {
                int i6 = a6.f11630a;
            }
            t7 t7VarA = ((n7) o7Var.s).a(cls);
            if (t7VarA.zzb()) {
                int i7 = a6.f11630a;
                p1 p1Var2 = f8.f11738a;
                p6 p6Var = q6.f11870a;
                z7Var = new z7(p1Var2, t7VarA.zza());
            } else {
                int i8 = a6.f11630a;
                int i9 = a8.f11635a;
                int i10 = l7.f11817a;
                p1 p1Var3 = f8.f11738a;
                p6 p6Var2 = t7VarA.zzc() + (-1) != 1 ? q6.f11870a : null;
                int i11 = s7.f11887a;
                z7Var = y7.j(t7VarA, p1Var3, p6Var2);
            }
            e8 e8Var = (e8) concurrentHashMap.putIfAbsent(cls, z7Var);
            if (e8Var != null) {
                return e8Var;
            }
        }
        return z7Var;
    }
}
