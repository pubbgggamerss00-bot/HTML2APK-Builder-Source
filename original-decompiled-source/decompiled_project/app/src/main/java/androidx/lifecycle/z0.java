package androidx.lifecycle;

import android.app.Application;
import j5.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f2399b = new f();

    /* renamed from: a, reason: collision with root package name */
    public final j5.f f2400a;

    public static class a extends d {

        /* renamed from: c, reason: collision with root package name */
        public static a f2401c;

        /* renamed from: d, reason: collision with root package name */
        public static final C0034a f2402d = new C0034a();

        /* renamed from: b, reason: collision with root package name */
        public final Application f2403b;

        /* renamed from: androidx.lifecycle.z0$a$a, reason: collision with other inner class name */
        public static final class C0034a implements a.b<Application> {
        }

        public a(Application application) {
            this.f2403b = application;
        }

        @Override // androidx.lifecycle.z0.d, androidx.lifecycle.z0.c
        public final <T extends w0> T a(Class<T> cls) {
            Application application = this.f2403b;
            if (application != null) {
                return (T) d(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.z0.d, androidx.lifecycle.z0.c
        public final w0 b(Class cls, j5.d dVar) {
            if (this.f2403b != null) {
                return a(cls);
            }
            Application application = (Application) dVar.f15158a.get(f2402d);
            if (application != null) {
                return d(cls, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return l5.c.b(cls);
        }

        public final <T extends w0> T d(Class<T> cls, Application application) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return (T) l5.c.b(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.r.b(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
    }

    public static final class b {
        public static z0 a(b1 owner, c factory, int i10) {
            if ((i10 & 2) != 0) {
                kotlin.jvm.internal.r.e(owner, "owner");
                factory = owner instanceof i ? ((i) owner).getDefaultViewModelProviderFactory() : l5.b.f16726a;
            }
            kotlin.jvm.internal.r.e(owner, "owner");
            j5.a extras = owner instanceof i ? ((i) owner).getDefaultViewModelCreationExtras() : a.C0143a.f15159b;
            kotlin.jvm.internal.r.e(owner, "owner");
            kotlin.jvm.internal.r.e(factory, "factory");
            kotlin.jvm.internal.r.e(extras, "extras");
            return new z0(owner.getViewModelStore(), factory, extras);
        }
    }

    public interface c {
        default <T extends w0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        default w0 b(Class cls, j5.d dVar) {
            return a(cls);
        }

        default w0 c(kotlin.jvm.internal.h hVar, j5.d dVar) {
            return b(b3.e.c(hVar), dVar);
        }
    }

    public static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public static d f2404a;

        @Override // androidx.lifecycle.z0.c
        public <T extends w0> T a(Class<T> cls) {
            return (T) l5.c.b(cls);
        }

        @Override // androidx.lifecycle.z0.c
        public w0 b(Class cls, j5.d dVar) {
            return a(cls);
        }

        @Override // androidx.lifecycle.z0.c
        public final w0 c(kotlin.jvm.internal.h hVar, j5.d dVar) {
            return b(b3.e.c(hVar), dVar);
        }
    }

    public static class e {
        public void d(w0 w0Var) {
        }
    }

    public static final class f implements a.b<String> {
    }

    public z0(a1 store, c factory, j5.a defaultCreationExtras) {
        kotlin.jvm.internal.r.e(store, "store");
        kotlin.jvm.internal.r.e(factory, "factory");
        kotlin.jvm.internal.r.e(defaultCreationExtras, "defaultCreationExtras");
        this.f2400a = new j5.f(store, factory, defaultCreationExtras);
    }

    public final w0 a(kotlin.jvm.internal.h hVar) {
        String strA = hVar.a();
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.f2400a.a(hVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
    }
}
