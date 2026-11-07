package f5;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends e5.f<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return ((d) this).s.e((Map.Entry) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        c<K, V> cVar = ((d) this).s;
        cVar.getClass();
        cVar.b();
        int iG = cVar.g(entry.getKey());
        if (iG >= 0) {
            V[] vArr = cVar.f13063t;
            j.b(vArr);
            if (j.a(vArr[iG], entry.getValue())) {
                cVar.k(iG);
                return true;
            }
        }
        return false;
    }
}
