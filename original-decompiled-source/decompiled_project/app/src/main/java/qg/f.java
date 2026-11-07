package qg;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class f<E> extends AbstractCollection<E> implements Collection<E>, fh.b {
    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }
}
