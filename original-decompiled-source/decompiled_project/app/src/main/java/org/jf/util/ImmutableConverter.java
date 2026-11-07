package org.jf.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import nc.r;
import nc.u0;
import nc.v;
import nc.w0;
import nc.x0;
import nc.y;

/* loaded from: classes3.dex */
public abstract class ImmutableConverter<ImmutableItem, Item> {
    public abstract boolean isImmutable(Item item);

    public abstract ImmutableItem makeImmutable(Item item);

    public r<ImmutableItem> toList(Iterable<? extends Item> iterable) {
        if (iterable == null) {
            r.a aVar = r.f18735b;
            return u0.f18756e;
        }
        if (iterable instanceof r) {
            Iterator<? extends Item> it = iterable.iterator();
            while (it.hasNext()) {
                if (!isImmutable(it.next())) {
                }
            }
            return (r) iterable;
        }
        final Iterator<? extends Item> it2 = iterable.iterator();
        return r.m(new Iterator<ImmutableItem>() { // from class: org.jf.util.ImmutableConverter.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public ImmutableItem next() {
                return (ImmutableItem) ImmutableConverter.this.makeImmutable(it2.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                it2.remove();
            }
        });
    }

    public v<ImmutableItem> toSet(Iterable<? extends Item> iterable) {
        if (iterable == null) {
            int i10 = v.f18759c;
            return w0.f18781j;
        }
        if (iterable instanceof v) {
            Iterator<? extends Item> it = iterable.iterator();
            while (it.hasNext()) {
                if (!isImmutable(it.next())) {
                }
            }
            return (v) iterable;
        }
        final Iterator<? extends Item> it2 = iterable.iterator();
        return v.k(new Iterator<ImmutableItem>() { // from class: org.jf.util.ImmutableConverter.2
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public ImmutableItem next() {
                return (ImmutableItem) ImmutableConverter.this.makeImmutable(it2.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                it2.remove();
            }
        });
    }

    public y<ImmutableItem> toSortedSet(Comparator<? super ImmutableItem> comparator, Iterable<? extends Item> iterable) {
        if (iterable == null) {
            int i10 = y.f18789f;
            return x0.f18787h;
        }
        if (iterable instanceof y) {
            y<ImmutableItem> yVar = (y) iterable;
            if (yVar.f18790d.equals(comparator)) {
                Iterator<? extends Item> it = iterable.iterator();
                while (it.hasNext()) {
                    if (!isImmutable(it.next())) {
                    }
                }
                return yVar;
            }
        }
        final Iterator<? extends Item> it2 = iterable.iterator();
        Iterator<ImmutableItem> it3 = new Iterator<ImmutableItem>() { // from class: org.jf.util.ImmutableConverter.3
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public ImmutableItem next() {
                return (ImmutableItem) ImmutableConverter.this.makeImmutable(it2.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                it2.remove();
            }
        };
        int i11 = y.f18789f;
        y.a aVar = new y.a(comparator);
        while (it3.hasNext()) {
            aVar.c(it3.next());
        }
        x0 x0VarO = y.o(aVar.f18792d, aVar.f18726b, aVar.f18725a);
        aVar.f18726b = x0VarO.f18788g.size();
        aVar.f18727c = true;
        return x0VarO;
    }

    public SortedSet<ImmutableItem> toSortedSet(Comparator<? super ImmutableItem> comparator, SortedSet<? extends Item> sortedSet) {
        if (sortedSet != null && sortedSet.size() != 0) {
            Object[] objArr = new Object[sortedSet.size()];
            Iterator<? extends Item> it = sortedSet.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                objArr[i10] = makeImmutable(it.next());
                i10++;
            }
            return ArraySortedSet.of((Comparator) comparator, objArr);
        }
        int i11 = y.f18789f;
        return x0.f18787h;
    }
}
