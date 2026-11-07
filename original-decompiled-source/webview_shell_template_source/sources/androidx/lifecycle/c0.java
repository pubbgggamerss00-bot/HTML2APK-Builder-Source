package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.h0;
import androidx.lifecycle.y;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c0 extends h0.d implements h0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1284a;

    /* renamed from: b, reason: collision with root package name */
    public final h0.a f1285b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1286c;

    /* renamed from: d, reason: collision with root package name */
    public final h f1287d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.savedstate.a f1288e;

    @SuppressLint({"LambdaLast"})
    public c0(Application application, y1.c cVar, Bundle bundle) {
        h0.a aVar;
        this.f1288e = cVar.getSavedStateRegistry();
        this.f1287d = cVar.getLifecycle();
        this.f1286c = bundle;
        this.f1284a = application;
        if (application != null) {
            if (h0.a.f1309c == null) {
                h0.a.f1309c = new h0.a(application);
            }
            aVar = h0.a.f1309c;
            kotlin.jvm.internal.j.b(aVar);
        } else {
            aVar = new h0.a(null);
        }
        this.f1285b = aVar;
    }

    @Override // androidx.lifecycle.h0.b
    public final <T extends f0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.h0.b
    public final f0 b(Class cls, k1.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f13533a;
        String str = (String) linkedHashMap.get(i0.f1312a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(z.f1345a) == null || linkedHashMap.get(z.f1346b) == null) {
            if (this.f1287d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(g0.f1299a);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? d0.a(d0.f1290b, cls) : d0.a(d0.f1289a, cls);
        return constructorA == null ? this.f1285b.b(cls, cVar) : (!zIsAssignableFrom || application == null) ? d0.b(cls, constructorA, z.a(cVar)) : d0.b(cls, constructorA, application, z.a(cVar));
    }

    @Override // androidx.lifecycle.h0.d
    public final void c(f0 f0Var) {
        h hVar = this.f1287d;
        if (hVar != null) {
            androidx.savedstate.a aVar = this.f1288e;
            kotlin.jvm.internal.j.b(aVar);
            g.a(f0Var, aVar, hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0 d(Class cls, String str) throws IOException {
        Object obj;
        Application application;
        h hVar = this.f1287d;
        if (hVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f1284a == null) ? d0.a(d0.f1290b, cls) : d0.a(d0.f1289a, cls);
        if (constructorA == null) {
            if (this.f1284a != null) {
                return this.f1285b.a(cls);
            }
            if (h0.c.f1311a == null) {
                h0.c.f1311a = new h0.c();
            }
            h0.c cVar = h0.c.f1311a;
            kotlin.jvm.internal.j.b(cVar);
            return cVar.a(cls);
        }
        androidx.savedstate.a aVar = this.f1288e;
        kotlin.jvm.internal.j.b(aVar);
        Bundle bundle = this.f1286c;
        Bundle bundleA = aVar.a(str);
        Class<? extends Object>[] clsArr = y.f1339f;
        y yVarA = y.a.a(bundleA, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, yVarA);
        savedStateHandleController.b(hVar, aVar);
        h.b bVarB = hVar.b();
        if (bVarB == h.b.f1301t || bVarB.compareTo(h.b.f1303v) >= 0) {
            aVar.d();
        } else {
            hVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(hVar, aVar));
        }
        f0 f0VarB = (!zIsAssignableFrom || (application = this.f1284a) == null) ? d0.b(cls, constructorA, yVarA) : d0.b(cls, constructorA, application, yVarA);
        synchronized (f0VarB.f1296a) {
            try {
                obj = f0VarB.f1296a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    f0VarB.f1296a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            savedStateHandleController = obj;
        }
        if (f0VarB.f1298c) {
            f0.a(savedStateHandleController);
        }
        return f0VarB;
    }
}
