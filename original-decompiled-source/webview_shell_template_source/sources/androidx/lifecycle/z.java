package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.y;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import k1.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1345a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final c f1346b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a f1347c = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d extends kotlin.jvm.internal.k implements p5.l<k1.a, b0> {
        public static final d s = new d(1);

        @Override // p5.l
        public final b0 invoke(k1.a aVar) {
            kotlin.jvm.internal.j.e("$this$initializer", aVar);
            return new b0();
        }
    }

    public static final y a(k1.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f13533a;
        y1.c cVar2 = (y1.c) linkedHashMap.get(f1345a);
        if (cVar2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        k0 k0Var = (k0) linkedHashMap.get(f1346b);
        if (k0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1347c);
        String str = (String) linkedHashMap.get(i0.f1312a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        a.b bVarB = cVar2.getSavedStateRegistry().b();
        a0 a0Var = bVarB instanceof a0 ? (a0) bVarB : null;
        if (a0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = c(k0Var).f1283d;
        y yVar = (y) linkedHashMap2.get(str);
        if (yVar != null) {
            return yVar;
        }
        Class<? extends Object>[] clsArr = y.f1339f;
        a0Var.b();
        Bundle bundle2 = a0Var.f1274c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = a0Var.f1274c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = a0Var.f1274c;
        if (bundle5 != null && bundle5.isEmpty()) {
            a0Var.f1274c = null;
        }
        y yVarA = y.a.a(bundle3, bundle);
        linkedHashMap2.put(str, yVarA);
        return yVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends y1.c & k0> void b(T t6) {
        h.b bVarB = t6.getLifecycle().b();
        if (bVarB != h.b.f1301t && bVarB != h.b.f1302u) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t6.getSavedStateRegistry().b() == null) {
            a0 a0Var = new a0(t6.getSavedStateRegistry(), t6);
            t6.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", a0Var);
            t6.getLifecycle().a(new SavedStateHandleAttacher(a0Var));
        }
    }

    public static final b0 c(k0 k0Var) {
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.q.f13553a.getClass();
        kotlin.jvm.internal.d dVar = new kotlin.jvm.internal.d(b0.class);
        d dVar2 = d.s;
        kotlin.jvm.internal.j.e("initializer", dVar2);
        Class<?> clsA = dVar.a();
        kotlin.jvm.internal.j.c("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsA);
        arrayList.add(new k1.d(clsA, dVar2));
        k1.d[] dVarArr = (k1.d[]) arrayList.toArray(new k1.d[0]);
        return (b0) new h0(k0Var.getViewModelStore(), new k1.b((k1.d[]) Arrays.copyOf(dVarArr, dVarArr.length)), k0Var instanceof f ? ((f) k0Var).getDefaultViewModelCreationExtras() : a.C0072a.f13534b).a(b0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
