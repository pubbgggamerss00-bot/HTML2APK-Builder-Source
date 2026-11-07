package c1;

import java.util.Map;
import java.util.Map.Entry;

/* loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends qg.i<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        f<K, V> fVar = ((h) this).f4572a;
        Object obj2 = fVar.get(key);
        return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && fVar.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((h) this).f4572a.remove(entry.getKey(), entry.getValue());
    }
}
