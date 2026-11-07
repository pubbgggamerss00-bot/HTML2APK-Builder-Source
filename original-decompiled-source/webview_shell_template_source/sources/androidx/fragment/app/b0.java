package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.h0;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b0 extends androidx.lifecycle.f0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f1075j = new a();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1079g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, k> f1076d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, b0> f1077e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<String, androidx.lifecycle.j0> f1078f = new HashMap<>();
    public boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1080i = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements h0.b {
        @Override // androidx.lifecycle.h0.b
        public final <T extends androidx.lifecycle.f0> T a(Class<T> cls) {
            return new b0(true);
        }
    }

    public b0(boolean z6) {
        this.f1079g = z6;
    }

    @Override // androidx.lifecycle.f0
    public final void b() {
        if (y.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void c(k kVar) {
        if (y.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + kVar);
        }
        d(kVar.f1196w);
    }

    public final void d(String str) {
        HashMap<String, b0> map = this.f1077e;
        b0 b0Var = map.get(str);
        if (b0Var != null) {
            b0Var.b();
            map.remove(str);
        }
        HashMap<String, androidx.lifecycle.j0> map2 = this.f1078f;
        androidx.lifecycle.j0 j0Var = map2.get(str);
        if (j0Var != null) {
            j0Var.a();
            map2.remove(str);
        }
    }

    public final void e(k kVar) {
        if (this.f1080i) {
            if (y.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1076d.remove(kVar.f1196w) == null || !y.H(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + kVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f1076d.equals(b0Var.f1076d) && this.f1077e.equals(b0Var.f1077e) && this.f1078f.equals(b0Var.f1078f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1078f.hashCode() + ((this.f1077e.hashCode() + (this.f1076d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<k> it = this.f1076d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1077e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1078f.keySet().iterator();
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
