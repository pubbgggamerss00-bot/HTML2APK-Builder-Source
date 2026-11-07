package c5;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<h> f4914a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, h0> f4915b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, g0> f4916c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public e0 f4917d;

    public final void a(h hVar) {
        if (this.f4914a.contains(hVar)) {
            throw new IllegalStateException("Fragment already added: " + hVar);
        }
        synchronized (this.f4914a) {
            this.f4914a.add(hVar);
        }
        hVar.f4882l = true;
    }

    public final h b(String str) {
        h0 h0Var = this.f4915b.get(str);
        if (h0Var != null) {
            return h0Var.f4910c;
        }
        return null;
    }

    public final h c(String str) {
        for (h0 h0Var : this.f4915b.values()) {
            if (h0Var != null) {
                h hVarC = h0Var.f4910c;
                if (!str.equals(hVarC.f4876e)) {
                    hVarC = hVarC.f4891w.f4780c.c(str);
                }
                if (hVarC != null) {
                    return hVarC;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f4915b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f4915b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var.f4910c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<h> f() {
        ArrayList arrayList;
        if (this.f4914a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f4914a) {
            arrayList = new ArrayList(this.f4914a);
        }
        return arrayList;
    }

    public final void g(h0 h0Var) {
        h hVar = h0Var.f4910c;
        String str = hVar.f4876e;
        HashMap<String, h0> map = this.f4915b;
        if (map.get(str) != null) {
            return;
        }
        map.put(hVar.f4876e, h0Var);
        if (b0.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + hVar);
        }
    }

    public final void h(h0 h0Var) {
        h hVar = h0Var.f4910c;
        if (hVar.D) {
            this.f4917d.h(hVar);
        }
        if (this.f4915b.put(hVar.f4876e, null) != null && b0.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + hVar);
        }
    }
}
