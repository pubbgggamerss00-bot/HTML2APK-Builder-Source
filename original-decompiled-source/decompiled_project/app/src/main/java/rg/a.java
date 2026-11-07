package rg;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.r;
import qg.i;

/* loaded from: classes2.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends i<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return ((d) this).f23571a.i((Map.Entry) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        c<K, V> cVar = ((d) this).f23571a;
        cVar.getClass();
        cVar.f();
        int iK = cVar.k(entry.getKey());
        if (iK >= 0) {
            V[] vArr = cVar.f23552b;
            r.b(vArr);
            if (r.a(vArr[iK], entry.getValue())) {
                cVar.p(iK);
                return true;
            }
        }
        return false;
    }
}
