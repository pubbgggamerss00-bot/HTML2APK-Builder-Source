package qg;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g<E> extends AbstractList<E> implements List<E>, fh.b {
    public abstract int c();

    public abstract E e(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
