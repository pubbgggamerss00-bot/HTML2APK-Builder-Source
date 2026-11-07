package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e52;
import com.google.android.gms.internal.ads.j52;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class j52<MessageType extends j52<MessageType, BuilderType>, BuilderType extends e52<MessageType, BuilderType>> extends t32<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, j52<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected m72 zzt = m72.f6958f;

    public static final <T extends j52<T, ?>> boolean A(T t6, boolean z6) {
        byte bByteValue = ((Byte) t6.x(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = u62.f9474c.a(t6.getClass()).g(t6);
        if (z6) {
            t6.x(2, true == zG ? t6 : null);
        }
        return zG;
    }

    public static Object n(Method method, j52 j52Var, Object... objArr) {
        try {
            return method.invoke(j52Var, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends j52> void q(Class<T> cls, T t6) {
        t6.p();
        zzc.put(cls, t6);
    }

    public static <T extends j52> T s(Class<T> cls) throws ClassNotFoundException {
        j52<?, ?> j52Var = zzc.get(cls);
        if (j52Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                j52Var = zzc.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (j52Var != null) {
            return j52Var;
        }
        j52<?, ?> j52Var2 = (j52) ((j52) r72.i(cls)).x(6, null);
        if (j52Var2 == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, j52Var2);
        return j52Var2;
    }

    public static <T extends j52<T, ?>> T u(T t6, g42 g42Var, u42 u42Var) throws u52 {
        k42 k42VarM = g42Var.m();
        T t7 = (T) v(t6, k42VarM, u42Var);
        k42VarM.y();
        y(t7);
        return t7;
    }

    public static <T extends j52<T, ?>> T v(T t6, k42 k42Var, u42 u42Var) throws u52 {
        T t7 = (T) t6.t();
        try {
            b72 b72VarA = u62.f9474c.a(t7.getClass());
            l42 l42Var = k42Var.f6238b;
            if (l42Var == null) {
                l42Var = new l42(k42Var);
            }
            b72VarA.c(t7, l42Var, u42Var);
            b72VarA.a(t7);
            return t7;
        } catch (l72 e6) {
            throw new u52(e6.getMessage());
        } catch (u52 e7) {
            if (e7.s) {
                throw new u52(e7.getMessage(), e7);
            }
            throw e7;
        } catch (IOException e8) {
            if (e8.getCause() instanceof u52) {
                throw ((u52) e8.getCause());
            }
            throw new u52(e8.getMessage(), e8);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof u52) {
                throw ((u52) e9.getCause());
            }
            throw e9;
        }
    }

    public static void y(j52 j52Var) throws u52 {
        if (j52Var != null && !A(j52Var, true)) {
            throw new u52(new l72().getMessage());
        }
    }

    public static j52 z(j52 j52Var, byte[] bArr, int i6, u42 u42Var) throws u52 {
        if (i6 == 0) {
            return j52Var;
        }
        j52 j52VarT = j52Var.t();
        try {
            b72 b72VarA = u62.f9474c.a(j52VarT.getClass());
            b72VarA.f(j52VarT, bArr, 0, i6, new x32(u42Var));
            b72VarA.a(j52VarT);
            return j52VarT;
        } catch (l72 e6) {
            throw new u52(e6.getMessage());
        } catch (u52 e7) {
            if (e7.s) {
                throw new u52(e7.getMessage(), e7);
            }
            throw e7;
        } catch (IOException e8) {
            if (e8.getCause() instanceof u52) {
                throw ((u52) e8.getCause());
            }
            throw new u52(e8.getMessage(), e8);
        } catch (IndexOutOfBoundsException unused) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final j52 a() {
        return (j52) x(6, null);
    }

    @Override // com.google.android.gms.internal.ads.m62
    public final l62 b() {
        return (e52) x(5, null);
    }

    @Override // com.google.android.gms.internal.ads.m62
    public final int c() {
        return f(null);
    }

    @Override // com.google.android.gms.internal.ads.m62
    public final void d(p42 p42Var) {
        b72 b72VarA = u62.f9474c.a(getClass());
        q42 q42Var = p42Var.f7935t;
        if (q42Var == null) {
            q42Var = new q42(p42Var);
        }
        b72VarA.e(this, q42Var);
    }

    @Override // com.google.android.gms.internal.ads.t32
    public final int e() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return u62.f9474c.a(getClass()).b(this, (j52) obj);
    }

    @Override // com.google.android.gms.internal.ads.t32
    public final int f(b72 b72Var) {
        int iH;
        int iH2;
        if (w()) {
            if (b72Var == null) {
                iH2 = u62.f9474c.a(getClass()).h(this);
            } else {
                iH2 = b72Var.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(iH2, "serialized size must be non-negative, was "));
        }
        if (e() != Integer.MAX_VALUE) {
            return e();
        }
        if (b72Var == null) {
            iH = u62.f9474c.a(getClass()).h(this);
        } else {
            iH = b72Var.h(this);
        }
        k(iH);
        return iH;
    }

    public final int hashCode() {
        if (w()) {
            return u62.f9474c.a(getClass()).d(this);
        }
        if (this.zzq == 0) {
            this.zzq = u62.f9474c.a(getClass()).d(this);
        }
        return this.zzq;
    }

    public final void k(int i6) {
        if (i6 < 0) {
            throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "serialized size must be non-negative, was "));
        }
        this.zzd = i6 | (this.zzd & zza);
    }

    public final <MessageType extends j52<MessageType, BuilderType>, BuilderType extends e52<MessageType, BuilderType>> BuilderType l() {
        return (BuilderType) x(5, null);
    }

    public final s62<MessageType> m() {
        return (s62) x(7, null);
    }

    public final void o() {
        u62.f9474c.a(getClass()).a(this);
        p();
    }

    public final void p() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final BuilderType r() {
        BuilderType buildertype = (BuilderType) x(5, null);
        if (buildertype.s.equals(this)) {
            return buildertype;
        }
        buildertype.i();
        MessageType messagetype = buildertype.f4126t;
        u62.f9474c.a(messagetype.getClass()).i(messagetype, this);
        return buildertype;
    }

    public final MessageType t() {
        return (MessageType) x(4, null);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = o62.f7622a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        o62.c(this, sb, 0);
        return sb.toString();
    }

    public final boolean w() {
        return (this.zzd & zza) != 0;
    }

    public abstract Object x(int i6, j52 j52Var);
}
