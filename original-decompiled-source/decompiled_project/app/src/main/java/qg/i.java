package qg;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class i<E> extends AbstractSet<E> implements Set<E>, fh.d {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
