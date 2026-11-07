package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ar1 extends rq1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f2830a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2831b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2832c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2833d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2834e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2835f;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e6) {
                throw new RuntimeException("Could not initialize intrinsics", e6.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            f2832c = unsafe.objectFieldOffset(cr1.class.getDeclaredField("u"));
            f2831b = unsafe.objectFieldOffset(cr1.class.getDeclaredField("t"));
            f2833d = unsafe.objectFieldOffset(cr1.class.getDeclaredField("s"));
            f2834e = unsafe.objectFieldOffset(br1.class.getDeclaredField("a"));
            f2835f = unsafe.objectFieldOffset(br1.class.getDeclaredField("b"));
            f2830a = unsafe;
        } catch (NoSuchFieldException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final uq1 a(cr1 cr1Var, uq1 uq1Var) {
        uq1 uq1Var2;
        do {
            uq1Var2 = cr1Var.f3649t;
            if (uq1Var == uq1Var2) {
                break;
            }
        } while (!e(cr1Var, uq1Var2, uq1Var));
        return uq1Var2;
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final br1 b(cr1 cr1Var) {
        br1 br1Var;
        br1 br1Var2 = br1.f3257c;
        do {
            br1Var = cr1Var.f3650u;
            if (br1Var2 == br1Var) {
                break;
            }
        } while (!g(cr1Var, br1Var, br1Var2));
        return br1Var;
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final void c(br1 br1Var, br1 br1Var2) {
        f2830a.putObject(br1Var, f2835f, br1Var2);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final void d(br1 br1Var, Thread thread) {
        f2830a.putObject(br1Var, f2834e, thread);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean e(cr1 cr1Var, uq1 uq1Var, uq1 uq1Var2) {
        return er1.a(f2830a, cr1Var, f2831b, uq1Var, uq1Var2);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean f(cr1 cr1Var, Object obj, Object obj2) {
        return er1.a(f2830a, cr1Var, f2833d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public final boolean g(cr1 cr1Var, br1 br1Var, br1 br1Var2) {
        return er1.a(f2830a, cr1Var, f2832c, br1Var, br1Var2);
    }
}
