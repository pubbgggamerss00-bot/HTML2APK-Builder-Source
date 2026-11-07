package h1;

import a1.d;
import h1.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class s<K, V> extends r<K, V, V> {
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
        return this.f12178a.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f12178a.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        w<K, V> wVar = this.f12178a;
        return new h0(wVar, ((a1.b) wVar.f().f12191c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        w<K, V> wVar = this.f12178a;
        Object it = wVar.f12188b.iterator();
        while (true) {
            if (!((f0) it).hasNext()) {
                next = null;
                break;
            }
            next = ((e0) it).next();
            if (kotlin.jvm.internal.r.a(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        wVar.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        a1.d<K, ? extends V> dVar;
        int i10;
        h hVarK;
        boolean zE;
        Set setH0 = qg.x.h0(collection);
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
            Object it = wVar.f12188b.iterator();
            while (((f0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((e0) it).next();
                if (setH0.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        a1.d<K, ? extends V> dVar;
        int i10;
        h hVarK;
        boolean zE;
        Set setH0 = qg.x.h0(collection);
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
            Object it = wVar.f12188b.iterator();
            while (((f0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((e0) it).next();
                if (!setH0.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
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
