package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.z0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class s0 extends z0.e implements z0.c {

    /* renamed from: a, reason: collision with root package name */
    public final Application f2346a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.a f2347b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2348c;

    /* renamed from: d, reason: collision with root package name */
    public final l f2349d;

    /* renamed from: e, reason: collision with root package name */
    public final c6.c f2350e;

    public s0() {
        this.f2347b = new z0.a(null);
    }

    @Override // androidx.lifecycle.z0.c
    public final <T extends w0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.z0.c
    public final w0 b(Class cls, j5.d dVar) {
        LinkedHashMap linkedHashMap = dVar.f15158a;
        String str = (String) linkedHashMap.get(z0.f2399b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(o0.f2335a) == null || linkedHashMap.get(o0.f2336b) == null) {
            if (this.f2349d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(z0.a.f2402d);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? t0.a(cls, t0.f2352b) : t0.a(cls, t0.f2351a);
        return constructorA == null ? this.f2347b.b(cls, dVar) : (!zIsAssignableFrom || application == null) ? t0.b(cls, constructorA, o0.a(dVar)) : t0.b(cls, constructorA, application, o0.a(dVar));
    }

    @Override // androidx.lifecycle.z0.c
    public final w0 c(kotlin.jvm.internal.h hVar, j5.d dVar) {
        return b(b3.e.c(hVar), dVar);
    }

    @Override // androidx.lifecycle.z0.e
    public final void d(w0 w0Var) throws NoSuchMethodException, SecurityException {
        l lVar = this.f2349d;
        if (lVar != null) {
            c6.c cVar = this.f2350e;
            kotlin.jvm.internal.r.b(cVar);
            j.a(w0Var, cVar, lVar);
        }
    }

    public final w0 e(Class cls, String str) throws NoSuchMethodException, SecurityException {
        l0 l0Var;
        l lVar = this.f2349d;
        if (lVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f2346a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? t0.a(cls, t0.f2352b) : t0.a(cls, t0.f2351a);
        if (constructorA == null) {
            if (application != null) {
                return this.f2347b.a(cls);
            }
            if (z0.d.f2404a == null) {
                z0.d.f2404a = new z0.d();
            }
            kotlin.jvm.internal.r.b(z0.d.f2404a);
            return l5.c.b(cls);
        }
        c6.c cVar = this.f2350e;
        kotlin.jvm.internal.r.b(cVar);
        Bundle bundleA = cVar.a(str);
        if (bundleA == null) {
            bundleA = this.f2348c;
        }
        if (bundleA == null) {
            l0Var = new l0();
        } else {
            ClassLoader classLoader = l0.class.getClassLoader();
            kotlin.jvm.internal.r.b(classLoader);
            bundleA.setClassLoader(classLoader);
            rg.c cVar2 = new rg.c(bundleA.size());
            for (String str2 : bundleA.keySet()) {
                kotlin.jvm.internal.r.b(str2);
                cVar2.put(str2, bundleA.get(str2));
            }
            l0Var = new l0(cVar2.e());
        }
        n0 n0Var = new n0(l0Var, str);
        n0Var.p(lVar, cVar);
        l.b bVarB = lVar.b();
        if (bVarB == l.b.f2320b || bVarB.compareTo(l.b.f2322d) >= 0) {
            cVar.d();
        } else {
            lVar.a(new k(lVar, cVar));
        }
        w0 w0VarB = (!zIsAssignableFrom || application == null) ? t0.b(cls, constructorA, l0Var) : t0.b(cls, constructorA, application, l0Var);
        w0VarB.b("androidx.lifecycle.savedstate.vm.tag", n0Var);
        return w0VarB;
    }

    public s0(Application application, c6.e eVar, Bundle bundle) {
        z0.a aVar;
        this.f2350e = eVar.getSavedStateRegistry();
        this.f2349d = eVar.getLifecycle();
        this.f2348c = bundle;
        this.f2346a = application;
        if (application != null) {
            if (z0.a.f2401c == null) {
                z0.a.f2401c = new z0.a(application);
            }
            aVar = z0.a.f2401c;
            kotlin.jvm.internal.r.b(aVar);
        } else {
            aVar = new z0.a(null);
        }
        this.f2347b = aVar;
    }
}
