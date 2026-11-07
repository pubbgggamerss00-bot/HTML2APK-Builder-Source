package h1;

import a1.d;
import fh.c;
import h1.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class p<K, V> extends r<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        x.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        x.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if ((obj instanceof fh.a) && !(obj instanceof c.a)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.r.a(this.f12178a.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        w<K, V> wVar = this.f12178a;
        return new e0(wVar, ((a1.b) wVar.f().f12191c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof fh.a) || (obj instanceof c.a)) && this.f12178a.remove(((Map.Entry) obj).getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (this.f12178a.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        a1.d<K, ? extends V> dVar;
        int i10;
        h hVarK;
        boolean zE;
        Collection<? extends Object> collection2 = collection;
        int iA = qg.j0.a(qg.p.h(collection2, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        w<K, V> wVar = this.f12178a;
        boolean z10 = false;
        do {
            synchronized (x.f12193a) {
                w.a aVar = wVar.f12187a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                w.a aVar2 = (w.a) n.i(aVar);
                dVar = aVar2.f12191c;
                i10 = aVar2.f12192d;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(dVar);
            d.a<K, ? extends V> aVarBuilder = dVar.builder();
            Object it2 = wVar.f12188b.iterator();
            while (((f0) it2).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((e0) it2).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !kotlin.jvm.internal.r.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarBuilder.remove(entry2.getKey());
                    z10 = true;
                }
            }
            pg.f0 f0Var2 = pg.f0.f21461a;
            a1.d<K, ? extends V> dVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.r.a(dVarBuild, dVar)) {
                break;
            }
            w.a aVar3 = wVar.f12187a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = w.e(wVar, (w.a) n.w(aVar3, wVar, hVarK), i10, dVarBuild);
            }
            n.n(hVarK, wVar);
        } while (!zE);
        return z10;
    }
}
