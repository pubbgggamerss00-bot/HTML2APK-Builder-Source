package nc;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class t<K, V> extends v<Map.Entry<K, V>> {
    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = w.this.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // nc.p
    public final boolean f() {
        w wVar = w.this;
        return wVar.f18776d.f18788g.f() || wVar.f18777e.f();
    }

    @Override // nc.v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return w.this.hashCode();
    }

    @Override // nc.v
    public final boolean n() {
        w.this.getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return w.this.size();
    }
}
