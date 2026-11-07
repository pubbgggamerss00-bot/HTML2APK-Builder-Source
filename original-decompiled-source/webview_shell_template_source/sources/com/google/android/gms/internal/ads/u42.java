package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u42 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile u42 f9458b;

    /* renamed from: c, reason: collision with root package name */
    public static final u42 f9459c = new u42(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map f9460a;

    public u42() {
        this.f9460a = new HashMap();
    }

    public static u42 a() {
        u62 u62Var = u62.f9474c;
        return f9459c;
    }

    public static u42 b() {
        u42 u42Var = f9458b;
        if (u42Var != null) {
            return u42Var;
        }
        synchronized (u42.class) {
            try {
                u42 u42Var2 = f9458b;
                if (u42Var2 != null) {
                    return u42Var2;
                }
                u62 u62Var = u62.f9474c;
                u42 u42VarB = c52.b();
                f9458b = u42VarB;
                return u42VarB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public u42(int i6) {
        this.f9460a = Collections.EMPTY_MAP;
    }
}
