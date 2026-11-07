package b1;

import a1.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class b<E> extends qg.c<E> implements a1.c<E> {

    public static final class a extends s implements eh.l<E, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f3479a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends E> collection) {
            super(1);
            this.f3479a = collection;
        }

        @Override // eh.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f3479a.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, a1.c
    public a1.c<E> addAll(Collection<? extends E> collection) {
        f fVarBuilder = builder();
        fVarBuilder.addAll(collection);
        return fVarBuilder.f();
    }

    @Override // qg.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // qg.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // qg.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // qg.c, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, a1.c
    public final a1.c<E> remove(E e10) {
        int iIndexOf = indexOf(e10);
        return iIndexOf != -1 ? E(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, a1.c
    public final a1.c<E> removeAll(Collection<? extends E> collection) {
        return l(new a(collection));
    }

    @Override // qg.c, java.util.List
    public final List subList(int i10, int i11) {
        return new a.C0000a(this, i10, i11);
    }
}
