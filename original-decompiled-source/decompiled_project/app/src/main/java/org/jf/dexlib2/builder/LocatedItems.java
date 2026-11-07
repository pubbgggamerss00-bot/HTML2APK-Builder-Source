package org.jf.dexlib2.builder;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nc.r;
import nc.u0;
import org.jf.dexlib2.builder.ItemWithLocation;

/* loaded from: classes3.dex */
public abstract class LocatedItems<T extends ItemWithLocation> {
    private List<T> items = null;

    /* JADX INFO: Access modifiers changed from: private */
    public void addItem(T t3) {
        if (this.items == null) {
            this.items = new ArrayList(1);
        }
        this.items.add(t3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<T> getItems() {
        List<T> list = this.items;
        if (list != null) {
            return list;
        }
        r.a aVar = r.f18735b;
        return u0.f18756e;
    }

    public abstract String getAddLocatedItemError();

    public Set<T> getModifiableItems(final MethodLocation methodLocation) {
        return new AbstractSet<T>() { // from class: org.jf.dexlib2.builder.LocatedItems.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<T> iterator() {
                final Iterator it = LocatedItems.this.getItems().iterator();
                return (Iterator<T>) new Iterator<T>() { // from class: org.jf.dexlib2.builder.LocatedItems.1.1
                    private T currentItem = null;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        T t3 = this.currentItem;
                        if (t3 != null) {
                            t3.setLocation(null);
                        }
                        it.remove();
                    }

                    @Override // java.util.Iterator
                    public T next() {
                        T t3 = (T) it.next();
                        this.currentItem = t3;
                        return t3;
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return LocatedItems.this.getItems().size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean add(T t3) {
                if (t3.isPlaced()) {
                    throw new IllegalArgumentException(LocatedItems.this.getAddLocatedItemError());
                }
                t3.setLocation(methodLocation);
                LocatedItems.this.addItem(t3);
                return true;
            }
        };
    }

    public void mergeItemsIntoNext(MethodLocation methodLocation, LocatedItems<T> locatedItems) {
        List<T> list;
        if (locatedItems == this || (list = this.items) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next().setLocation(methodLocation);
        }
        List<T> list2 = this.items;
        list2.addAll(locatedItems.getItems());
        locatedItems.items = list2;
        this.items = null;
    }
}
