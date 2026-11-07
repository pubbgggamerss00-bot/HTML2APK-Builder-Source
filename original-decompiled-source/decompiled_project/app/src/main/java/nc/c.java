package nc;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class c<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        q qVar = (q) this;
        return lc.i.a(qVar.f18728a, entry.getKey()) && lc.i.a(qVar.f18729b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        q qVar = (q) this;
        K k10 = qVar.f18728a;
        return qVar.f18729b.hashCode() ^ (k10 == null ? 0 : k10.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        q qVar = (q) this;
        sb.append(qVar.f18728a);
        sb.append("=");
        sb.append(qVar.f18729b);
        return sb.toString();
    }
}
