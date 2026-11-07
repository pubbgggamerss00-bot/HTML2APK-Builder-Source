package qg;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class j<E> extends a<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
