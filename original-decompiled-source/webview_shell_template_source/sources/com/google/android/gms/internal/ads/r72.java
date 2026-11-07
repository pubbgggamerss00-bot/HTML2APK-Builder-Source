package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r72 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f8572a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f8573b;

    /* renamed from: c, reason: collision with root package name */
    public static final q72 f8574c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8575d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f8576e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f8577f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f8578g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        boolean z6;
        boolean z7;
        q72 q72Var;
        Unsafe unsafeK = k();
        f8572a = unsafeK;
        int i6 = w32.f10030a;
        f8573b = Memory.class;
        Class cls = Long.TYPE;
        boolean zR = r(cls);
        Class cls2 = Integer.TYPE;
        boolean zR2 = r(cls2);
        q72 o72Var = null;
        if (unsafeK != null) {
            if (zR) {
                o72Var = new p72(unsafeK);
            } else if (zR2) {
                o72Var = new o72(unsafeK);
            }
        }
        f8574c = o72Var;
        if (o72Var == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls3 = ((Unsafe) o72Var.s).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (c() != null) {
                    z6 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(r72.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f8575d = z6;
        q72 q72Var2 = f8574c;
        if (q72Var2 == null) {
            z7 = false;
        } else {
            try {
                Class<?> cls4 = ((Unsafe) q72Var2.s).getClass();
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
                Logger.getLogger(r72.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        f8576e = z7;
        f8577f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        long jObjectFieldOffset = -1;
        if (fieldC != null && (q72Var = f8574c) != null) {
            jObjectFieldOffset = ((Unsafe) q72Var.s).objectFieldOffset(fieldC);
        }
        f8578g = jObjectFieldOffset;
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (f8576e) {
            return ((Unsafe) f8574c.s).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f8576e) {
            ((Unsafe) f8574c.s).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        int i6 = w32.f10030a;
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

    public static void d(Object obj, long j6, byte b7) {
        q72 q72Var = f8574c;
        long j7 = (-4) & j6;
        int i6 = ((Unsafe) q72Var.s).getInt(obj, j7);
        int i7 = ((~((int) j6)) & 3) << 3;
        ((Unsafe) q72Var.s).putInt(obj, j7, ((255 & b7) << i7) | (i6 & (~(255 << i7))));
    }

    public static void e(Object obj, long j6, byte b7) {
        q72 q72Var = f8574c;
        long j7 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        ((Unsafe) q72Var.s).putInt(obj, j7, ((255 & b7) << i6) | (((Unsafe) q72Var.s).getInt(obj, j7) & (~(255 << i6))));
    }

    public static int f(long j6, Object obj) {
        return ((Unsafe) f8574c.s).getInt(obj, j6);
    }

    public static long g(ByteBuffer byteBuffer) {
        return ((Unsafe) f8574c.s).getLong(byteBuffer, f8578g);
    }

    public static long h(long j6, Object obj) {
        return ((Unsafe) f8574c.s).getLong(obj, j6);
    }

    public static Object i(Class cls) {
        try {
            return f8572a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static Object j(long j6, Object obj) {
        return ((Unsafe) f8574c.s).getObject(obj, j6);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new n72());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void l(byte[] bArr, long j6, byte b7) {
        f8574c.m(bArr, f8577f + j6, b7);
    }

    public static void m(Object obj, long j6, int i6) {
        ((Unsafe) f8574c.s).putInt(obj, j6, i6);
    }

    public static void n(Object obj, long j6, long j7) {
        ((Unsafe) f8574c.s).putLong(obj, j6, j7);
    }

    public static void o(Object obj, long j6, Object obj2) {
        ((Unsafe) f8574c.s).putObject(obj, j6, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean p(long j6, Object obj) {
        return ((byte) ((((Unsafe) f8574c.s).getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean q(long j6, Object obj) {
        return ((byte) ((((Unsafe) f8574c.s).getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0;
    }

    public static boolean r(Class cls) {
        int i6 = w32.f10030a;
        try {
            Class cls2 = f8573b;
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
}
