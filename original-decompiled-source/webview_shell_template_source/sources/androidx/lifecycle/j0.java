package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1314a = new LinkedHashMap();

    public final void a() {
        for (f0 f0Var : this.f1314a.values()) {
            f0Var.f1298c = true;
            HashMap map = f0Var.f1296a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = f0Var.f1296a.values().iterator();
                        while (it.hasNext()) {
                            f0.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = f0Var.f1297b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = f0Var.f1297b.iterator();
                        while (it2.hasNext()) {
                            f0.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            f0Var.b();
        }
        this.f1314a.clear();
    }
}
