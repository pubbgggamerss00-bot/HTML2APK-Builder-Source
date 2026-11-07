package c1;

import a1.d;
import d0.z1;
import java.util.Map;

/* loaded from: classes.dex */
public class f<K, V> extends qg.h<K, V> implements d.a<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public d<K, V> f4562a;

    /* renamed from: b, reason: collision with root package name */
    public z1 f4563b = new z1();

    /* renamed from: c, reason: collision with root package name */
    public t<K, V> f4564c;

    /* renamed from: d, reason: collision with root package name */
    public V f4565d;

    /* renamed from: e, reason: collision with root package name */
    public int f4566e;

    /* renamed from: f, reason: collision with root package name */
    public int f4567f;

    public f(d<K, V> dVar) {
        this.f4562a = dVar;
        this.f4564c = dVar.f4557a;
        this.f4567f = dVar.f4558b;
    }

    @Override // a1.d.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d<K, V> build() {
        t<K, V> tVar = this.f4564c;
        d<K, V> dVar = this.f4562a;
        if (tVar != dVar.f4557a) {
            this.f4563b = new z1();
            dVar = new d<>(this.f4564c, this.f4567f);
        }
        this.f4562a = dVar;
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f4564c = t.f4579e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k10) {
        return this.f4564c.d(k10, k10 != null ? k10.hashCode() : 0, 0);
    }

    public final void e(int i10) {
        this.f4567f = i10;
        this.f4566e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k10) {
        return (V) this.f4564c.g(k10, k10 != null ? k10.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        this.f4565d = null;
        this.f4564c = this.f4564c.l(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this);
        return this.f4565d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        d<K, V> dVarBuild = null;
        d<K, V> dVar = map instanceof d ? (d) map : null;
        if (dVar == null) {
            f fVar = map instanceof f ? (f) map : null;
            if (fVar != null) {
                dVarBuild = fVar.build();
            }
        } else {
            dVarBuild = dVar;
        }
        if (dVarBuild == null) {
            super.putAll(map);
            return;
        }
        e1.a aVar = new e1.a();
        aVar.f8338a = 0;
        int i10 = this.f4567f;
        t<K, V> tVar = this.f4564c;
        t<K, V> tVar2 = dVarBuild.f4557a;
        kotlin.jvm.internal.r.c(tVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f4564c = tVar.m(tVar2, 0, aVar, this);
        int i11 = (dVarBuild.f4558b + i10) - aVar.f8338a;
        if (i10 != i11) {
            e(i11);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f4567f;
        t<K, V> tVarO = this.f4564c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarO == null) {
            tVarO = t.f4579e;
        }
        this.f4564c = tVarO;
        return i10 != this.f4567f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k10) {
        this.f4565d = null;
        t<K, V> tVarN = this.f4564c.n(k10 != null ? k10.hashCode() : 0, k10, 0, this);
        if (tVarN == null) {
            tVarN = t.f4579e;
        }
        this.f4564c = tVarN;
        return this.f4565d;
    }
}
