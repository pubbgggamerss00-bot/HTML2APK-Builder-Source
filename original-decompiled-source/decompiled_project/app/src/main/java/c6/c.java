package c6;

import android.os.Bundle;
import androidx.lifecycle.j;
import c6.a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e6.b f4993a;

    /* renamed from: b, reason: collision with root package name */
    public a.C0060a f4994b;

    public interface a {
        void a(e eVar);
    }

    public interface b {
        Bundle a();
    }

    public c(e6.b bVar) {
        this.f4993a = bVar;
    }

    public final Bundle a(String key) {
        r.e(key, "key");
        e6.b bVar = this.f4993a;
        if (!bVar.f8395g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = bVar.f8394f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleF = bundle.containsKey(key) ? c6.b.f(bundle, key) : null;
        bundle.remove(key);
        if (bundle.isEmpty()) {
            bVar.f8394f = null;
        }
        return bundleF;
    }

    public final b b() {
        b bVar;
        e6.b bVar2 = this.f4993a;
        synchronized (bVar2.f8391c) {
            Iterator it = bVar2.f8392d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                b bVar3 = (b) entry.getValue();
                if (r.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    bVar = bVar3;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final void c(String str, b provider) {
        r.e(provider, "provider");
        e6.b bVar = this.f4993a;
        synchronized (bVar.f8391c) {
            if (bVar.f8392d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            bVar.f8392d.put(str, provider);
            f0 f0Var = f0.f21461a;
        }
    }

    public final void d() throws NoSuchMethodException, SecurityException {
        if (!this.f4993a.f8396h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a.C0060a c0060a = this.f4994b;
        if (c0060a == null) {
            c0060a = new a.C0060a(this);
        }
        this.f4994b = c0060a;
        try {
            j.a.class.getDeclaredConstructor(null);
            a.C0060a c0060a2 = this.f4994b;
            if (c0060a2 != null) {
                c0060a2.f4991a.add(j.a.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + j.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
