package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.w6;
import com.google.android.gms.internal.consent_sdk.z6;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class z6<MessageType extends z6<MessageType, BuilderType>, BuilderType extends w6<MessageType, BuilderType>> extends y5<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected n8 zzc = n8.f11847e;

    public static z6 h(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        z6 z6Var = (z6) map.get(cls);
        if (z6Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                z6Var = (z6) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (z6Var != null) {
            return z6Var;
        }
        z6 z6Var2 = (z6) ((z6) s8.g(cls)).f(6);
        if (z6Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, z6Var2);
        return z6Var2;
    }

    public static Object i(Method method, z6 z6Var, Object... objArr) {
        try {
            return method.invoke(z6Var, objArr);
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

    public static void l(Class cls, z6 z6Var) {
        z6Var.k();
        zzb.put(cls, z6Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.v7
    public final void a(k6 k6Var) {
        e8 e8VarA = b8.f11644c.a(getClass());
        l6 l6Var = k6Var.f11800a;
        if (l6Var == null) {
            l6Var = new l6(k6Var);
        }
        e8VarA.g(this, l6Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.y5
    public final int c(e8 e8Var) {
        if (e()) {
            int iE = e8Var.e(this);
            if (iE >= 0) {
                return iE;
            }
            throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(iE, "serialized size must be non-negative, was "));
        }
        int i6 = this.zzd & Integer.MAX_VALUE;
        if (i6 != Integer.MAX_VALUE) {
            return i6;
        }
        int iE2 = e8Var.e(this);
        if (iE2 < 0) {
            throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(iE2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
        return iE2;
    }

    public final void d() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return b8.f11644c.a(getClass()).c(this, (z6) obj);
    }

    public abstract Object f(int i6);

    public final w6 g() {
        return (w6) f(5);
    }

    public final int hashCode() {
        if (e()) {
            return b8.f11644c.a(getClass()).b(this);
        }
        int i6 = this.zza;
        if (i6 != 0) {
            return i6;
        }
        int iB = b8.f11644c.a(getClass()).b(this);
        this.zza = iB;
        return iB;
    }

    public final void j() {
        b8.f11644c.a(getClass()).a(this);
        k();
    }

    public final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = x7.f11935a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        x7.c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.consent_sdk.w7
    public final /* synthetic */ z6 zzl() {
        return (z6) f(6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.v7
    public final int zzn() {
        if (e()) {
            int iE = b8.f11644c.a(getClass()).e(this);
            if (iE >= 0) {
                return iE;
            }
            throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(iE, "serialized size must be non-negative, was "));
        }
        int i6 = this.zzd & Integer.MAX_VALUE;
        if (i6 != Integer.MAX_VALUE) {
            return i6;
        }
        int iE2 = b8.f11644c.a(getClass()).e(this);
        if (iE2 < 0) {
            throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(iE2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
        return iE2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.v7
    public final /* synthetic */ w6 zzu() {
        return (w6) f(5);
    }
}
