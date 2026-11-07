package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.z0;
import c6.c;
import j5.a;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2335a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final c f2336b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final d f2337c = new d();

    public static final class a implements z0.c {
        @Override // androidx.lifecycle.z0.c
        public final w0 c(kotlin.jvm.internal.h hVar, j5.d dVar) {
            return new r0();
        }
    }

    public static final class b implements a.b<c6.e> {
    }

    public static final class c implements a.b<b1> {
    }

    public static final class d implements a.b<Bundle> {
    }

    public static final l0 a(j5.a aVar) {
        l0 l0Var;
        kotlin.jvm.internal.r.e(aVar, "<this>");
        c6.e eVar = (c6.e) aVar.a(f2335a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        b1 b1Var = (b1) aVar.a(f2336b);
        if (b1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f2337c);
        String str = (String) aVar.a(z0.f2399b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        c.b bVarB = eVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        q0 q0Var = bVarB instanceof q0 ? (q0) bVarB : null;
        if (q0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = c(b1Var).f2345b;
        l0 l0Var2 = (l0) linkedHashMap.get(str);
        if (l0Var2 != null) {
            return l0Var2;
        }
        q0Var.b();
        Bundle bundle3 = q0Var.f2343c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                q0Var.f2343c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            l0Var = new l0();
        } else {
            ClassLoader classLoader = l0.class.getClassLoader();
            kotlin.jvm.internal.r.b(classLoader);
            bundle.setClassLoader(classLoader);
            rg.c cVar = new rg.c(bundle.size());
            for (String str2 : bundle.keySet()) {
                kotlin.jvm.internal.r.b(str2);
                cVar.put(str2, bundle.get(str2));
            }
            l0Var = new l0(cVar.e());
        }
        linkedHashMap.put(str, l0Var);
        return l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends c6.e & b1> void b(T t3) {
        l.b bVarB = t3.getLifecycle().b();
        if (bVarB != l.b.f2320b && bVarB != l.b.f2321c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t3.getSavedStateRegistry().b() == null) {
            q0 q0Var = new q0(t3.getSavedStateRegistry(), t3);
            t3.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", q0Var);
            t3.getLifecycle().a(new m0(q0Var));
        }
    }

    public static final r0 c(b1 b1Var) {
        z0 z0VarA = z0.b.a(b1Var, new a(), 4);
        return (r0) z0VarA.f2400a.a(kotlin.jvm.internal.h0.a(r0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
