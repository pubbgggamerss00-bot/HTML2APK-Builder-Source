package androidx.lifecycle;

import androidx.lifecycle.l;
import c6.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class j {

    public static final class a implements c.a {
        @Override // c6.c.a
        public final void a(c6.e eVar) throws NoSuchMethodException, SecurityException {
            if (!(eVar instanceof b1)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
            }
            a1 viewModelStore = ((b1) eVar).getViewModelStore();
            c6.c savedStateRegistry = eVar.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f2249a;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                kotlin.jvm.internal.r.e(key, "key");
                w0 w0Var = (w0) linkedHashMap.get(key);
                if (w0Var != null) {
                    j.a(w0Var, savedStateRegistry, eVar.getLifecycle());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final void a(w0 w0Var, c6.c registry, l lifecycle) throws NoSuchMethodException, SecurityException {
        kotlin.jvm.internal.r.e(registry, "registry");
        kotlin.jvm.internal.r.e(lifecycle, "lifecycle");
        n0 n0Var = (n0) w0Var.d("androidx.lifecycle.savedstate.vm.tag");
        if (n0Var == null || n0Var.f2332c) {
            return;
        }
        n0Var.p(lifecycle, registry);
        l.b bVarB = lifecycle.b();
        if (bVarB == l.b.f2320b || bVarB.compareTo(l.b.f2322d) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new k(lifecycle, registry));
        }
    }
}
