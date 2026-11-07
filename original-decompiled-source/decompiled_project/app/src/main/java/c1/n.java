package c1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class n<K, V> extends qg.j<Map.Entry<? extends K, ? extends V>> implements a1.b<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: a, reason: collision with root package name */
    public final d<K, V> f4576a;

    public n(d<K, V> dVar) {
        this.f4576a = dVar;
    }

    @Override // qg.a
    public final int c() {
        d<K, V> dVar = this.f4576a;
        dVar.getClass();
        return dVar.f4558b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qg.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        d<K, V> dVar = this.f4576a;
        Object obj2 = dVar.get(key);
        return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        t<K, V> tVar = this.f4576a.f4557a;
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new v();
        }
        return new o(tVar, uVarArr);
    }
}
