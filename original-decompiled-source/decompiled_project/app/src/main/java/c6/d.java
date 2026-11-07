package c6;

import android.os.Bundle;
import androidx.lifecycle.l;
import c6.c;
import java.util.Arrays;
import java.util.Map;
import pg.f0;
import pg.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e6.b f4995a;

    /* renamed from: b, reason: collision with root package name */
    public final c f4996b;

    public d(e6.b bVar) {
        this.f4995a = bVar;
        this.f4996b = new c(bVar);
    }

    public final void a(Bundle bundle) {
        e6.b bVar = this.f4995a;
        e eVar = bVar.f8389a;
        if (!bVar.f8393e) {
            bVar.a();
        }
        if (eVar.getLifecycle().b().compareTo(l.b.f2322d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.getLifecycle().b()).toString());
        }
        if (bVar.f8395g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleF = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleF = b.f(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        bVar.f8394f = bundleF;
        bVar.f8395g = true;
    }

    public final void b(Bundle bundle) {
        e6.b bVar = this.f4995a;
        Bundle bundleA = u3.d.a((n[]) Arrays.copyOf(new n[0], 0));
        Bundle bundle2 = bVar.f8394f;
        if (bundle2 != null) {
            bundleA.putAll(bundle2);
        }
        synchronized (bVar.f8391c) {
            try {
                for (Map.Entry entry : bVar.f8392d.entrySet()) {
                    b4.a.d(bundleA, (String) entry.getKey(), ((c.b) entry.getValue()).a());
                }
                f0 f0Var = f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        b4.a.d(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }
}
