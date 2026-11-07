package androidx.lifecycle;

import androidx.lifecycle.h;
import androidx.savedstate.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements a.InterfaceC0019a {
        @Override // androidx.savedstate.a.InterfaceC0019a
        public final void a(y1.c cVar) {
            if (!(cVar instanceof k0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            j0 viewModelStore = ((k0) cVar).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = cVar.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f1314a;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                kotlin.jvm.internal.j.e("key", str);
                f0 f0Var = (f0) linkedHashMap.get(str);
                kotlin.jvm.internal.j.b(f0Var);
                g.a(f0Var, savedStateRegistry, cVar.getLifecycle());
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final void a(f0 f0Var, androidx.savedstate.a aVar, h hVar) {
        Object obj;
        kotlin.jvm.internal.j.e("registry", aVar);
        kotlin.jvm.internal.j.e("lifecycle", hVar);
        HashMap map = f0Var.f1296a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = f0Var.f1296a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f1271u) {
            return;
        }
        savedStateHandleController.b(hVar, aVar);
        h.b bVarB = hVar.b();
        if (bVarB == h.b.f1301t || bVarB.compareTo(h.b.f1303v) >= 0) {
            aVar.d();
        } else {
            hVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(hVar, aVar));
        }
    }
}
