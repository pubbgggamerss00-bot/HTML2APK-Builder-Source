package p5;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.z0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class s implements androidx.lifecycle.t, androidx.lifecycle.b1, androidx.lifecycle.i, c6.e {

    /* renamed from: a, reason: collision with root package name */
    public final s5.e f21268a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f21269b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f21270c;

    /* renamed from: d, reason: collision with root package name */
    public final l.b f21271d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f21272e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21273f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f21274g;

    /* renamed from: h, reason: collision with root package name */
    public final s5.c f21275h = new s5.c(this);

    public static final class a {
        public static s a(s5.e eVar, k0 destination, Bundle bundle, l.b hostLifecycleState, z0 z0Var) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.r.d(string, "toString(...)");
            kotlin.jvm.internal.r.e(destination, "destination");
            kotlin.jvm.internal.r.e(hostLifecycleState, "hostLifecycleState");
            return new s(eVar, destination, bundle, hostLifecycleState, z0Var, string, null);
        }
    }

    public s(s5.e eVar, k0 k0Var, Bundle bundle, l.b bVar, z0 z0Var, String str, Bundle bundle2) {
        this.f21268a = eVar;
        this.f21269b = k0Var;
        this.f21270c = bundle;
        this.f21271d = bVar;
        this.f21272e = z0Var;
        this.f21273f = str;
        this.f21274g = bundle2;
        e9.w0.b(new b9.n0(this, 2));
    }

    public final void a(l.b bVar) {
        s5.c cVar = this.f21275h;
        cVar.getClass();
        cVar.f24453k = bVar;
        cVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof s)) {
            s sVar = (s) obj;
            Bundle bundle = sVar.f21270c;
            if (kotlin.jvm.internal.r.a(this.f21273f, sVar.f21273f) && kotlin.jvm.internal.r.a(this.f21269b, sVar.f21269b) && kotlin.jvm.internal.r.a(this.f21275h.f24452j, sVar.f21275h.f24452j) && kotlin.jvm.internal.r.a(getSavedStateRegistry(), sVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.f21270c;
                if (kotlin.jvm.internal.r.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.r.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // androidx.lifecycle.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j5.a getDefaultViewModelCreationExtras() {
        Application application;
        s5.c cVar = this.f21275h;
        cVar.getClass();
        j5.d dVar = new j5.d((Object) null);
        s sVar = cVar.f24443a;
        LinkedHashMap linkedHashMap = dVar.f15158a;
        linkedHashMap.put(androidx.lifecycle.o0.f2335a, sVar);
        linkedHashMap.put(androidx.lifecycle.o0.f2336b, sVar);
        Bundle bundleA = cVar.a();
        if (bundleA != null) {
            linkedHashMap.put(androidx.lifecycle.o0.f2337c, bundleA);
        }
        s5.e eVar = this.f21268a;
        if (eVar == null) {
            application = null;
        } else {
            Context context = eVar.f24461a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(z0.a.f2402d, application2);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.i
    public final z0.c getDefaultViewModelProviderFactory() {
        return this.f21275h.f24454l;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.l getLifecycle() {
        return this.f21275h.f24452j;
    }

    @Override // c6.e
    public final c6.c getSavedStateRegistry() {
        return this.f21275h.f24450h.f4996b;
    }

    @Override // androidx.lifecycle.b1
    public final androidx.lifecycle.a1 getViewModelStore() {
        s5.c cVar = this.f21275h;
        if (!cVar.f24451i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.f24452j.f2361d == l.b.f2319a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        z0 z0Var = cVar.f24447e;
        if (z0Var != null) {
            return z0Var.a(cVar.f24448f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f21269b.hashCode() + (this.f21273f.hashCode() * 31);
        Bundle bundle = this.f21270c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.f21275h.f24452j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f21275h.toString();
    }
}
