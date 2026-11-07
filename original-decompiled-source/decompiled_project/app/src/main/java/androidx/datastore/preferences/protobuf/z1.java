package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f2184a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f2185b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f2186c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2187d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2188e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2189f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f2190g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f2191h;

    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    public static final class b extends e {
        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void c(long j10, byte[] bArr, long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final boolean d(Object obj, long j10) {
            return z1.f2191h ? z1.h(obj, j10) != 0 : z1.i(obj, j10) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final byte f(Object obj, long j10) {
            return z1.f2191h ? z1.h(obj, j10) : z1.i(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final double g(Object obj, long j10) {
            return Double.longBitsToDouble(j(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void m(Object obj, long j10, boolean z10) {
            if (z1.f2191h) {
                z1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                z1.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void n(Object obj, long j10, byte b10) {
            if (z1.f2191h) {
                z1.l(obj, j10, b10);
            } else {
                z1.m(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void o(Object obj, long j10, double d10) {
            r(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void p(Object obj, long j10, float f10) {
            q(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final boolean u() {
            return false;
        }
    }

    public static final class c extends e {
        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void c(long j10, byte[] bArr, long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final boolean d(Object obj, long j10) {
            return z1.f2191h ? z1.h(obj, j10) != 0 : z1.i(obj, j10) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final byte f(Object obj, long j10) {
            return z1.f2191h ? z1.h(obj, j10) : z1.i(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final double g(Object obj, long j10) {
            return Double.longBitsToDouble(j(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void m(Object obj, long j10, boolean z10) {
            if (z1.f2191h) {
                z1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                z1.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void n(Object obj, long j10, byte b10) {
            if (z1.f2191h) {
                z1.l(obj, j10, b10);
            } else {
                z1.m(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void o(Object obj, long j10, double d10) {
            r(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void p(Object obj, long j10, float f10) {
            q(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final boolean u() {
            return false;
        }
    }

    public static final class d extends e {
        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void c(long j10, byte[] bArr, long j11) {
            this.f2192a.copyMemory((Object) null, j10, bArr, z1.f2189f, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final boolean d(Object obj, long j10) {
            return this.f2192a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final byte e(long j10) {
            return this.f2192a.getByte(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final byte f(Object obj, long j10) {
            return this.f2192a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final double g(Object obj, long j10) {
            return this.f2192a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final float h(Object obj, long j10) {
            return this.f2192a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void m(Object obj, long j10, boolean z10) {
            this.f2192a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void n(Object obj, long j10, byte b10) {
            this.f2192a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void o(Object obj, long j10, double d10) {
            this.f2192a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final void p(Object obj, long j10, float f10) {
            this.f2192a.putFloat(obj, j10, f10);
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final boolean t() {
            if (!super.t()) {
                return false;
            }
            try {
                Class<?> cls = this.f2192a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                z1.a(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z1.e
        public final boolean u() {
            Unsafe unsafe = this.f2192a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (z1.e() != null) {
                        try {
                            Class<?> cls3 = this.f2192a.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th2) {
                            z1.a(th2);
                            return false;
                        }
                    }
                } catch (Throwable th3) {
                    z1.a(th3);
                }
            }
            return false;
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f2192a;

        public e(Unsafe unsafe) {
            this.f2192a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f2192a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f2192a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f2192a.getInt(obj, j10);
        }

        public final long j(Object obj, long j10) {
            return this.f2192a.getLong(obj, j10);
        }

        public final Object k(Object obj, long j10) {
            return this.f2192a.getObject(obj, j10);
        }

        public final long l(java.lang.reflect.Field field) {
            return this.f2192a.objectFieldOffset(field);
        }

        public abstract void m(Object obj, long j10, boolean z10);

        public abstract void n(Object obj, long j10, byte b10);

        public abstract void o(Object obj, long j10, double d10);

        public abstract void p(Object obj, long j10, float f10);

        public final void q(Object obj, long j10, int i10) {
            this.f2192a.putInt(obj, j10, i10);
        }

        public final void r(Object obj, long j10, long j11) {
            this.f2192a.putLong(obj, j10, j11);
        }

        public final void s(Object obj, long j10, Object obj2) {
            this.f2192a.putObject(obj, j10, obj2);
        }

        public boolean t() {
            Unsafe unsafe = this.f2192a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                z1.a(th2);
                return false;
            }
        }

        public abstract boolean u();
    }

    static {
        Unsafe unsafeJ = j();
        f2184a = unsafeJ;
        f2185b = androidx.datastore.preferences.protobuf.c.f1991a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        e dVar = null;
        if (unsafeJ != null) {
            if (!androidx.datastore.preferences.protobuf.c.a()) {
                dVar = new d(unsafeJ);
            } else if (zF) {
                dVar = new c(unsafeJ);
            } else if (zF2) {
                dVar = new b(unsafeJ);
            }
        }
        f2186c = dVar;
        f2187d = dVar == null ? false : dVar.u();
        f2188e = dVar == null ? false : dVar.t();
        f2189f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        java.lang.reflect.Field fieldE = e();
        f2190g = (fieldE == null || dVar == null) ? -1L : dVar.l(fieldE);
        f2191h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(z1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f2184a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class<?> cls) {
        if (f2188e) {
            return f2186c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f2188e) {
            f2186c.b(cls);
        }
    }

    public static java.lang.reflect.Field e() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (androidx.datastore.preferences.protobuf.c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.c.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f2185b;
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

    public static byte g(byte[] bArr, long j10) {
        return f2186c.f(bArr, f2189f + j10);
    }

    public static byte h(Object obj, long j10) {
        return (byte) ((f2186c.i(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j10) {
        return (byte) ((f2186c.i(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j10, byte b10) {
        f2186c.n(bArr, f2189f + j10, b10);
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = f2186c.i(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        n(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void m(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        n(obj, j11, ((255 & b10) << i10) | (f2186c.i(obj, j11) & (~(255 << i10))));
    }

    public static void n(Object obj, long j10, int i10) {
        f2186c.q(obj, j10, i10);
    }

    public static void o(Object obj, long j10, long j11) {
        f2186c.r(obj, j10, j11);
    }

    public static void p(Object obj, long j10, Object obj2) {
        f2186c.s(obj, j10, obj2);
    }
}
