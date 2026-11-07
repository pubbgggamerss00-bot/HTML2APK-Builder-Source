package c5;

import android.content.Context;
import android.view.View;
import androidx.work.WorkerParameters;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p implements ci.e, ci.c, v2.f, ye.b {
    @Override // ci.c
    public void B(bi.f descriptor, int i10, byte b10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (S(descriptor, i10)) {
            n(b10);
        }
    }

    @Override // ci.e
    public void C(bi.f enumDescriptor, int i10) {
        kotlin.jvm.internal.r.e(enumDescriptor, "enumDescriptor");
        T(Integer.valueOf(i10));
    }

    @Override // ci.c
    public void D(bi.f descriptor, int i10, float f10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (S(descriptor, i10)) {
            r(f10);
        }
    }

    @Override // v2.f
    public int E(int i10) {
        return a0(i10);
    }

    @Override // v2.f
    public int F(int i10) {
        return X(i10);
    }

    @Override // ci.e
    public void H(int i10) {
        T(Integer.valueOf(i10));
    }

    @Override // ci.c
    public ci.e I(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return S(descriptor, i10) ? f(descriptor.h(i10)) : kotlinx.serialization.internal.g0.f16367a;
    }

    @Override // ci.e
    public void K(long j10) {
        T(Long.valueOf(j10));
    }

    @Override // ci.c
    public void L(bi.f descriptor, int i10, boolean z10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (S(descriptor, i10)) {
            o(z10);
        }
    }

    @Override // ci.c
    public void M(bi.f descriptor, int i10, String value) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(value, "value");
        if (S(descriptor, i10)) {
            N(value);
        }
    }

    @Override // ci.e
    public void N(String value) {
        kotlin.jvm.internal.r.e(value, "value");
        T(value);
    }

    @Override // ci.c
    public void O(int i10, int i11, bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (S(descriptor, i10)) {
            H(i11);
        }
    }

    public abstract boolean P(h2.c cVar);

    public abstract void Q(Context context, String str, WorkerParameters workerParameters);

    public androidx.work.c R(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        kotlin.jvm.internal.r.e(appContext, "appContext");
        kotlin.jvm.internal.r.e(workerClassName, "workerClassName");
        kotlin.jvm.internal.r.e(workerParameters, "workerParameters");
        Q(appContext, workerClassName, workerParameters);
        try {
            Class<? extends U> clsAsSubclass = Class.forName(workerClassName).asSubclass(androidx.work.c.class);
            kotlin.jvm.internal.r.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                kotlin.jvm.internal.r.d(objNewInstance, "{\n                val co…Parameters)\n            }");
                androidx.work.c cVar = (androidx.work.c) objNewInstance;
                if (!cVar.f3136d) {
                    return cVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th2) {
                t6.s.d().c(t6.g0.f28019a, "Could not instantiate ".concat(workerClassName), th2);
                throw th2;
            }
        } catch (Throwable th3) {
            t6.s.d().c(t6.g0.f28019a, "Invalid class: ".concat(workerClassName), th3);
            throw th3;
        }
    }

    public boolean S(bi.f descriptor, int i10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return true;
    }

    public void T(Object value) {
        kotlin.jvm.internal.r.e(value, "value");
        throw new zh.h("Non-serializable " + kotlin.jvm.internal.h0.a(value.getClass()) + " is not supported by " + kotlin.jvm.internal.h0.a(getClass()) + " encoder");
    }

    public abstract Object U(h2.c cVar);

    public abstract int V(int i10);

    public abstract String[] W();

    public abstract int X(int i10);

    public abstract View Y(int i10);

    public abstract boolean Z();

    public abstract int a0(int i10);

    @Override // ci.c
    public void b(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
    }

    @Override // ci.e
    public ci.c c(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return this;
    }

    @Override // ci.c
    public void e(bi.f descriptor, int i10, long j10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (S(descriptor, i10)) {
            K(j10);
        }
    }

    @Override // ci.e
    public ci.e f(bi.f descriptor) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        return this;
    }

    @Override // ci.c
    public void g(bi.f descriptor, int i10, zh.i serializer, Object obj) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(serializer, "serializer");
        if (S(descriptor, i10)) {
            m(serializer, obj);
        }
    }

    @Override // ci.e
    public void h() {
        throw new zh.h("'null' is not supported by default");
    }

    @Override // ye.b
    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (String str : W()) {
            File file = new File(str);
            try {
                if (file.exists() && file.canRead()) {
                    arrayList.add(file);
                }
            } catch (SecurityException unused) {
            }
        }
        return arrayList;
    }

    @Override // ci.e
    public void k(double d10) {
        T(Double.valueOf(d10));
    }

    @Override // ci.e
    public void l(short s10) {
        T(Short.valueOf(s10));
    }

    @Override // ci.e
    public void n(byte b10) {
        T(Byte.valueOf(b10));
    }

    @Override // ci.e
    public void o(boolean z10) {
        T(Boolean.valueOf(z10));
    }

    @Override // ci.c
    public void p(bi.f descriptor, int i10, double d10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (S(descriptor, i10)) {
            k(d10);
        }
    }

    @Override // ci.c
    public void q(bi.f descriptor, int i10, short s10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (S(descriptor, i10)) {
            l(s10);
        }
    }

    @Override // ci.e
    public void r(float f10) {
        T(Float.valueOf(f10));
    }

    @Override // ci.e
    public void t(char c10) {
        T(Character.valueOf(c10));
    }

    @Override // v2.f
    public int w(int i10) {
        int iX = X(i10);
        if (iX == -1 || X(iX) == -1) {
            return -1;
        }
        return iX;
    }

    @Override // v2.f
    public int x(int i10) {
        int iA0 = a0(i10);
        if (iA0 == -1 || a0(iA0) == -1) {
            return -1;
        }
        return iA0;
    }

    @Override // ci.c
    public void y(bi.f descriptor, int i10, zh.i serializer, Object obj) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        kotlin.jvm.internal.r.e(serializer, "serializer");
        if (S(descriptor, i10)) {
            J(serializer, obj);
        }
    }

    @Override // ci.c
    public void z(bi.f descriptor, int i10, char c10) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        if (S(descriptor, i10)) {
            t(c10);
        }
    }
}
