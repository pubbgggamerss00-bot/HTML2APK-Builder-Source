package h1;

import a1.d;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w<K, V> implements i0, Map<K, V>, fh.c {

    /* renamed from: a, reason: collision with root package name */
    public a f12187a;

    /* renamed from: b, reason: collision with root package name */
    public final p f12188b;

    /* renamed from: c, reason: collision with root package name */
    public final q f12189c;

    /* renamed from: d, reason: collision with root package name */
    public final s f12190d;

    public static final class a<K, V> extends k0 {

        /* renamed from: c, reason: collision with root package name */
        public a1.d<K, ? extends V> f12191c;

        /* renamed from: d, reason: collision with root package name */
        public int f12192d;

        public a(long j10, a1.d<K, ? extends V> dVar) {
            super(j10);
            this.f12191c = dVar;
        }

        @Override // h1.k0
        public final void a(k0 k0Var) {
            kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) k0Var;
            synchronized (x.f12193a) {
                this.f12191c = aVar.f12191c;
                this.f12192d = aVar.f12192d;
                pg.f0 f0Var = pg.f0.f21461a;
            }
        }

        @Override // h1.k0
        public final k0 b() {
            return new a(n.k().g(), this.f12191c);
        }

        @Override // h1.k0
        public final k0 c(long j10) {
            return new a(j10, this.f12191c);
        }
    }

    public w() {
        c1.d dVar = c1.d.f4556c;
        h hVarK = n.k();
        a aVar = new a(hVarK.g(), dVar);
        if (!(hVarK instanceof b)) {
            aVar.f12134b = new a(1, dVar);
        }
        this.f12187a = aVar;
        this.f12188b = new p(this);
        this.f12189c = new q(this);
        this.f12190d = new s(this);
    }

    public static final boolean e(w wVar, a aVar, int i10, a1.d dVar) {
        boolean z10;
        synchronized (x.f12193a) {
            int i11 = aVar.f12192d;
            if (i11 == i10) {
                aVar.f12191c = dVar;
                z10 = true;
                aVar.f12192d = i11 + 1;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // h1.i0
    public final k0 c() {
        return this.f12187a;
    }

    @Override // java.util.Map
    public final void clear() {
        h hVarK;
        a aVar = this.f12187a;
        kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar2 = (a) n.i(aVar);
        c1.d dVar = c1.d.f4556c;
        if (dVar != aVar2.f12191c) {
            a aVar3 = this.f12187a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                a aVar4 = (a) n.w(aVar3, this, hVarK);
                synchronized (x.f12193a) {
                    aVar4.f12191c = dVar;
                    aVar4.f12192d++;
                }
            }
            n.n(hVarK, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f().f12191c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return f().f12191c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f12188b;
    }

    public final a<K, V> f() {
        a aVar = this.f12187a;
        kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) n.t(aVar, this);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return f().f12191c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return f().f12191c.isEmpty();
    }

    @Override // h1.i0
    public final void k(k0 k0Var) {
        kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f12187a = (a) k0Var;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f12189c;
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        a1.d<K, ? extends V> dVar;
        int i10;
        V v11;
        h hVarK;
        boolean zE;
        do {
            synchronized (x.f12193a) {
                a aVar = this.f12187a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) n.i(aVar);
                dVar = aVar2.f12191c;
                i10 = aVar2.f12192d;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(dVar);
            c1.f fVar = (c1.f) dVar.builder();
            v11 = (V) fVar.put(k10, v10);
            a1.d<K, V> dVarBuild = fVar.build();
            if (kotlin.jvm.internal.r.a(dVarBuild, dVar)) {
                break;
            }
            a aVar3 = this.f12187a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e(this, (a) n.w(aVar3, this, hVarK), i10, dVarBuild);
            }
            n.n(hVarK, this);
        } while (!zE);
        return v11;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        a1.d<K, ? extends V> dVar;
        int i10;
        h hVarK;
        boolean zE;
        do {
            synchronized (x.f12193a) {
                a aVar = this.f12187a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) n.i(aVar);
                dVar = aVar2.f12191c;
                i10 = aVar2.f12192d;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(dVar);
            c1.f fVar = (c1.f) dVar.builder();
            fVar.putAll(map);
            a1.d<K, V> dVarBuild = fVar.build();
            if (kotlin.jvm.internal.r.a(dVarBuild, dVar)) {
                return;
            }
            a aVar3 = this.f12187a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e(this, (a) n.w(aVar3, this, hVarK), i10, dVarBuild);
            }
            n.n(hVarK, this);
        } while (!zE);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        a1.d<K, ? extends V> dVar;
        int i10;
        V vRemove;
        h hVarK;
        boolean zE;
        do {
            synchronized (x.f12193a) {
                a aVar = this.f12187a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) n.i(aVar);
                dVar = aVar2.f12191c;
                i10 = aVar2.f12192d;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(dVar);
            d.a<K, ? extends V> aVarBuilder = dVar.builder();
            vRemove = aVarBuilder.remove(obj);
            a1.d<K, ? extends V> dVarBuild = aVarBuilder.build();
            if (kotlin.jvm.internal.r.a(dVarBuild, dVar)) {
                break;
            }
            a aVar3 = this.f12187a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e(this, (a) n.w(aVar3, this, hVarK), i10, dVarBuild);
            }
            n.n(hVarK, this);
        } while (!zE);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return f().f12191c.size();
    }

    public final String toString() {
        a aVar = this.f12187a;
        kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) n.i(aVar)).f12191c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f12190d;
    }
}
