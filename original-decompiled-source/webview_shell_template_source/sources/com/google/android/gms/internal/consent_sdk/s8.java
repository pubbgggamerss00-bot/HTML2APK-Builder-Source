package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f11888a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f11889b;

    /* renamed from: c, reason: collision with root package name */
    public static final r8 f11890c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11891d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f11892e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f11893f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f11894g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        boolean z6;
        boolean z7;
        r8 r8Var;
        Unsafe unsafeI = i();
        f11888a = unsafeI;
        int i6 = a6.f11630a;
        f11889b = Memory.class;
        Class cls = Long.TYPE;
        boolean zP = p(cls);
        Class cls2 = Integer.TYPE;
        boolean zP2 = p(cls2);
        r8 p8Var = null;
        if (unsafeI != null) {
            if (zP) {
                p8Var = new q8(unsafeI);
            } else if (zP2) {
                p8Var = new p8(unsafeI);
            }
        }
        f11890c = p8Var;
        if (p8Var == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls3 = p8Var.f11880a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (b() != null) {
                    z6 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(s8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f11891d = z6;
        r8 r8Var2 = f11890c;
        if (r8Var2 == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls4 = r8Var2.f11880a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z7 = true;
            } catch (Throwable th2) {
                Logger.getLogger(s8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        f11892e = z7;
        f11893f = q(byte[].class);
        q(boolean[].class);
        a(boolean[].class);
        q(int[].class);
        a(int[].class);
        q(long[].class);
        a(long[].class);
        q(float[].class);
        a(float[].class);
        q(double[].class);
        a(double[].class);
        q(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (r8Var = f11890c) != null) {
            r8Var.f11880a.objectFieldOffset(fieldB);
        }
        f11894g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (f11892e) {
            f11890c.f11880a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i6 = a6.f11630a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void c(Object obj, long j6, byte b7) {
        Unsafe unsafe = f11890c.f11880a;
        long j7 = (-4) & j6;
        int i6 = unsafe.getInt(obj, j7);
        int i7 = ((~((int) j6)) & 3) << 3;
        unsafe.putInt(obj, j7, ((255 & b7) << i7) | (i6 & (~(255 << i7))));
    }

    public static void d(Object obj, long j6, byte b7) {
        Unsafe unsafe = f11890c.f11880a;
        long j7 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        unsafe.putInt(obj, j7, ((255 & b7) << i6) | (unsafe.getInt(obj, j7) & (~(255 << i6))));
    }

    public static int e(long j6, Object obj) {
        return f11890c.f11880a.getInt(obj, j6);
    }

    public static long f(long j6, Object obj) {
        return f11890c.f11880a.getLong(obj, j6);
    }

    public static Object g(Class cls) {
        try {
            return f11888a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static Object h(long j6, Object obj) {
        return f11890c.f11880a.getObject(obj, j6);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o8());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j6, byte b7) {
        f11890c.d(bArr, f11893f + j6, b7);
    }

    public static void k(Object obj, long j6, int i6) {
        f11890c.f11880a.putInt(obj, j6, i6);
    }

    public static void l(Object obj, long j6, long j7) {
        f11890c.f11880a.putLong(obj, j6, j7);
    }

    public static void m(Object obj, long j6, Object obj2) {
        f11890c.f11880a.putObject(obj, j6, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean n(long j6, Object obj) {
        return ((byte) ((f11890c.f11880a.getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean o(long j6, Object obj) {
        return ((byte) ((f11890c.f11880a.getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0;
    }

    public static boolean p(Class cls) {
        int i6 = a6.f11630a;
        try {
            Class cls2 = f11889b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int q(Class cls) {
        if (f11892e) {
            return f11890c.f11880a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
