package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.j;
import n.b;
import y1.c;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1732b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1733c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1734d;

    /* renamed from: e, reason: collision with root package name */
    public Recreator.a f1735e;

    /* renamed from: a, reason: collision with root package name */
    public final n.b<String, b> f1731a = new n.b<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1736f = true;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0019a {
        void a(c cVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (!this.f1734d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f1733c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f1733c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f1733c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1733c = null;
        return bundle2;
    }

    public final b b() {
        String str;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f1731a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            j.d("components", entry);
            str = (String) entry.getKey();
            bVar = (b) entry.getValue();
        } while (!j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b bVar) {
        j.e("provider", bVar);
        if (this.f1731a.d(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f1736f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.a aVar = this.f1735e;
        if (aVar == null) {
            aVar = new Recreator.a(this);
        }
        this.f1735e = aVar;
        try {
            g.a.class.getDeclaredConstructor(null);
            Recreator.a aVar2 = this.f1735e;
            if (aVar2 != null) {
                aVar2.f1730a.add(g.a.class.getName());
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + g.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }
}
