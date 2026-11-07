package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f6749a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f6750b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f6751c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f6752d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f6753e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f6754f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f6755g;

    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
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
        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final boolean c(Object obj, long j10) {
            return r1.f6755g ? r1.h(obj, j10) != 0 : r1.i(obj, j10) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final byte d(Object obj, long j10) {
            return r1.f6755g ? r1.h(obj, j10) : r1.i(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void k(Object obj, long j10, boolean z10) {
            if (r1.f6755g) {
                r1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                r1.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void l(Object obj, long j10, byte b10) {
            if (r1.f6755g) {
                r1.l(obj, j10, b10);
            } else {
                r1.m(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final boolean s() {
            return false;
        }
    }

    public static final class c extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final boolean c(Object obj, long j10) {
            return r1.f6755g ? r1.h(obj, j10) != 0 : r1.i(obj, j10) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final byte d(Object obj, long j10) {
            return r1.f6755g ? r1.h(obj, j10) : r1.i(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void k(Object obj, long j10, boolean z10) {
            if (r1.f6755g) {
                r1.l(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                r1.m(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void l(Object obj, long j10, byte b10) {
            if (r1.f6755g) {
                r1.l(obj, j10, b10);
            } else {
                r1.m(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final boolean s() {
            return false;
        }
    }

    public static final class d extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final boolean c(Object obj, long j10) {
            return this.f6756a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final byte d(Object obj, long j10) {
            return this.f6756a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final double e(Object obj, long j10) {
            return this.f6756a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final float f(Object obj, long j10) {
            return this.f6756a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void k(Object obj, long j10, boolean z10) {
            this.f6756a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void l(Object obj, long j10, byte b10) {
            this.f6756a.putByte(obj, j10, b10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void m(Object obj, long j10, double d10) {
            this.f6756a.putDouble(obj, j10, d10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final void n(Object obj, long j10, float f10) {
            this.f6756a.putFloat(obj, j10, f10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f6756a.getClass();
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
                r1.a(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.e
        public final boolean s() {
            Unsafe unsafe = this.f6756a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (r1.e() != null) {
                        try {
                            Class<?> cls3 = this.f6756a.getClass();
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
                            r1.a(th2);
                            return false;
                        }
                    }
                } catch (Throwable th3) {
                    r1.a(th3);
                }
            }
            return false;
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f6756a;

        public e(Unsafe unsafe) {
            this.f6756a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f6756a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f6756a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f6756a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f6756a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f6756a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f6756a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f6756a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f6756a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f6756a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f6756a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
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
                r1.a(th2);
                return false;
            }
        }

        public abstract boolean s();
    }

    static {
        Unsafe unsafeJ = j();
        f6749a = unsafeJ;
        f6750b = com.google.crypto.tink.shaded.protobuf.d.f6641a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        e dVar = null;
        if (unsafeJ != null) {
            if (!com.google.crypto.tink.shaded.protobuf.d.a()) {
                dVar = new d(unsafeJ);
            } else if (zF) {
                dVar = new c(unsafeJ);
            } else if (zF2) {
                dVar = new b(unsafeJ);
            }
        }
        f6751c = dVar;
        f6752d = dVar == null ? false : dVar.s();
        f6753e = dVar == null ? false : dVar.r();
        f6754f = c(byte[].class);
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
        Field fieldE = e();
        if (fieldE != null && dVar != null) {
            dVar.j(fieldE);
        }
        f6755g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f6749a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class<?> cls) {
        if (f6753e) {
            return f6751c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f6753e) {
            f6751c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (com.google.crypto.tink.shaded.protobuf.d.a()) {
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
        if (!com.google.crypto.tink.shaded.protobuf.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f6750b;
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
        return f6751c.d(bArr, f6754f + j10);
    }

    public static byte h(Object obj, long j10) {
        return (byte) ((f6751c.g(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j10) {
        return (byte) ((f6751c.g(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j10, byte b10) {
        f6751c.l(bArr, f6754f + j10, b10);
    }

    public static void l(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iG = f6751c.g(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        n(obj, j11, ((255 & b10) << i10) | (iG & (~(255 << i10))));
    }

    public static void m(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        n(obj, j11, ((255 & b10) << i10) | (f6751c.g(obj, j11) & (~(255 << i10))));
    }

    public static void n(Object obj, long j10, int i10) {
        f6751c.o(obj, j10, i10);
    }

    public static void o(Object obj, long j10, long j11) {
        f6751c.p(obj, j10, j11);
    }

    public static void p(Object obj, long j10, Object obj2) {
        f6751c.q(obj, j10, obj2);
    }
}
