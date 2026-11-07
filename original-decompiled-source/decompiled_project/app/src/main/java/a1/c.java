package a1;

import b1.b;
import b1.f;
import java.util.Collection;

/* loaded from: classes.dex */
public interface c<E> extends a<E>, Collection, fh.a {
    c<E> E(int i10);

    @Override // java.util.List
    c<E> add(int i10, E e10);

    @Override // java.util.List, java.util.Collection
    c<E> add(E e10);

    @Override // java.util.List, java.util.Collection
    c<E> addAll(Collection<? extends E> collection);

    f builder();

    c l(b.a aVar);

    @Override // java.util.List, java.util.Collection
    c<E> remove(E e10);

    @Override // java.util.List, java.util.Collection
    c<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    c<E> set(int i10, E e10);
}
