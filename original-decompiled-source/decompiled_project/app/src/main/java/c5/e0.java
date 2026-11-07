package c5;

import android.util.Log;
import androidx.lifecycle.a1;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e0 extends w0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f4832h = new a();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4836e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, h> f4833b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, e0> f4834c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, a1> f4835d = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f4837f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4838g = false;

    public class a implements z0.c {
        @Override // androidx.lifecycle.z0.c
        public final <T extends w0> T a(Class<T> cls) {
            return new e0(true);
        }
    }

    public e0(boolean z10) {
        this.f4836e = z10;
    }

    @Override // androidx.lifecycle.w0
    public final void e() {
        if (b0.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4837f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.f4833b.equals(e0Var.f4833b) && this.f4834c.equals(e0Var.f4834c) && this.f4835d.equals(e0Var.f4835d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(h hVar) {
        if (b0.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + hVar);
        }
        g(hVar.f4876e);
    }

    public final void g(String str) {
        HashMap<String, e0> map = this.f4834c;
        e0 e0Var = map.get(str);
        if (e0Var != null) {
            e0Var.e();
            map.remove(str);
        }
        HashMap<String, a1> map2 = this.f4835d;
        a1 a1Var = map2.get(str);
        if (a1Var != null) {
            a1Var.a();
            map2.remove(str);
        }
    }

    public final void h(h hVar) {
        if (this.f4838g) {
            if (b0.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4833b.remove(hVar.f4876e) == null || !b0.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + hVar);
        }
    }

    public final int hashCode() {
        return this.f4835d.hashCode() + ((this.f4834c.hashCode() + (this.f4833b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<h> it = this.f4833b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f4834c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4835d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
