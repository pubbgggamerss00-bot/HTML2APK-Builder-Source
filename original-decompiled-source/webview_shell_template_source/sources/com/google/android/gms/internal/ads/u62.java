package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u62 {

    /* renamed from: c, reason: collision with root package name */
    public static final u62 f9474c = new u62();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9476b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final dh0 f9475a = new dh0(1);

    public final b72 a(Class cls) {
        b72 q62Var;
        Charset charset = s52.f8801a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f9476b;
        b72 b72Var = (b72) concurrentHashMap.get(cls);
        if (b72Var != null) {
            return b72Var;
        }
        dh0 dh0Var = this.f9475a;
        dh0Var.getClass();
        ed0 ed0Var = c72.f3456a;
        j52.class.isAssignableFrom(cls);
        i62 i62VarA = ((d62) dh0Var.f3937t).a(cls);
        if (i62VarA.zzb()) {
            ed0 ed0Var2 = c72.f3456a;
            w42 w42Var = x42.f10359a;
            q62Var = new q62(ed0Var2, i62VarA.zza());
        } else {
            int i6 = r62.f8559a;
            int i7 = b62.f2943a;
            ed0 ed0Var3 = c72.f3456a;
            w42 w42Var2 = i62VarA.zzc() + (-1) != 1 ? x42.f10359a : null;
            int i8 = h62.f5284a;
            q62Var = p62.B(i62VarA, ed0Var3, w42Var2);
        }
        b72 b72Var2 = (b72) concurrentHashMap.putIfAbsent(cls, q62Var);
        return b72Var2 == null ? q62Var : b72Var2;
    }
}
