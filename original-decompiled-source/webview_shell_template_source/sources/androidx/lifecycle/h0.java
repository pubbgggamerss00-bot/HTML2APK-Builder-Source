package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import k1.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1306a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1307b;

    /* renamed from: c, reason: collision with root package name */
    public final k1.a f1308c;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public static a f1309c;

        /* renamed from: b, reason: collision with root package name */
        public final Application f1310b;

        public a(Application application) {
            this.f1310b = application;
        }

        @Override // androidx.lifecycle.h0.c, androidx.lifecycle.h0.b
        public final <T extends f0> T a(Class<T> cls) {
            Application application = this.f1310b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.h0.b
        public final f0 b(Class cls, k1.c cVar) {
            if (this.f1310b != null) {
                return a(cls);
            }
            Application application = (Application) cVar.f13533a.get(g0.f1299a);
            if (application != null) {
                return c(cls, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        public final <T extends f0> T c(Class<T> cls, Application application) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.j.d("{\n                try {\n…          }\n            }", tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        default <T extends f0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default f0 b(Class cls, k1.c cVar) {
            return a(cls);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static c f1311a;

        @Override // androidx.lifecycle.h0.b
        public <T extends f0> T a(Class<T> cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            try {
                T tNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                kotlin.jvm.internal.j.d("{\n                modelC…wInstance()\n            }", tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            }
        }
    }

    public h0(j0 j0Var, b bVar, k1.a aVar) {
        kotlin.jvm.internal.j.e("store", j0Var);
        kotlin.jvm.internal.j.e("defaultCreationExtras", aVar);
        this.f1306a = j0Var;
        this.f1307b = bVar;
        this.f1308c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0 a(Class cls, String str) {
        f0 f0VarA;
        kotlin.jvm.internal.j.e("key", str);
        j0 j0Var = this.f1306a;
        j0Var.getClass();
        LinkedHashMap linkedHashMap = j0Var.f1314a;
        f0 f0Var = (f0) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(f0Var);
        b bVar = this.f1307b;
        if (zIsInstance) {
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                kotlin.jvm.internal.j.b(f0Var);
                dVar.c(f0Var);
            }
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", f0Var);
            return f0Var;
        }
        k1.c cVar = new k1.c(this.f1308c);
        cVar.f13533a.put(i0.f1312a, str);
        try {
            f0VarA = bVar.b(cls, cVar);
        } catch (AbstractMethodError unused) {
            f0VarA = bVar.a(cls);
        }
        kotlin.jvm.internal.j.e("viewModel", f0VarA);
        f0 f0Var2 = (f0) linkedHashMap.put(str, f0VarA);
        if (f0Var2 != null) {
            f0Var2.b();
        }
        return f0VarA;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, b bVar) {
        this(j0Var, bVar, a.C0072a.f13534b);
        kotlin.jvm.internal.j.e("store", j0Var);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {
        public void c(f0 f0Var) {
        }
    }
}
