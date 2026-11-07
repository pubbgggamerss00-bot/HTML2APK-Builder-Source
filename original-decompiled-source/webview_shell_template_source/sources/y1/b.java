package y1;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import java.util.Map;
import kotlin.jvm.internal.j;
import n.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f15218a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.savedstate.a f15219b = new androidx.savedstate.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f15220c;

    public b(c cVar) {
        this.f15218a = cVar;
    }

    public final void a() {
        c cVar = this.f15218a;
        h lifecycle = cVar.getLifecycle();
        if (lifecycle.b() != h.b.f1301t) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(cVar));
        final androidx.savedstate.a aVar = this.f15219b;
        aVar.getClass();
        if (aVar.f1732b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new k() { // from class: y1.a
            @Override // androidx.lifecycle.k
            public final void a(m mVar, h.a aVar2) {
                androidx.savedstate.a aVar3 = aVar;
                j.e("this$0", aVar3);
                if (aVar2 == h.a.ON_START) {
                    aVar3.f1736f = true;
                } else if (aVar2 == h.a.ON_STOP) {
                    aVar3.f1736f = false;
                }
            }
        });
        aVar.f1732b = true;
        this.f15220c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f15220c) {
            a();
        }
        h lifecycle = this.f15218a.getLifecycle();
        if (lifecycle.b().compareTo(h.b.f1303v) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
        androidx.savedstate.a aVar = this.f15219b;
        if (!aVar.f1732b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (aVar.f1734d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        aVar.f1733c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        aVar.f1734d = true;
    }

    public final void c(Bundle bundle) {
        androidx.savedstate.a aVar = this.f15219b;
        aVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f1733c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.b<String, a.b> bVar = aVar.f1731a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f13904u.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
