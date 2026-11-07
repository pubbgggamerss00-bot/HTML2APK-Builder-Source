package org.jf.util;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class AbstractForwardSequentialList<T> extends AbstractSequentialList<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<T> iterator(int i10) {
        if (i10 < 0) {
            throw new NoSuchElementException();
        }
        Iterator<T> it = iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            it.next();
        }
        return it;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator<T> iterator();

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i10) {
        try {
            return new AbstractListIterator<T>(i10, iterator(i10)) { // from class: org.jf.util.AbstractForwardSequentialList.1
                private Iterator<T> forwardIterator;
                private int index;
                final /* synthetic */ int val$initialIndex;
                final /* synthetic */ Iterator val$initialIterator;

                {
                    this.val$initialIndex = i10;
                    this.val$initialIterator = it;
                    this.index = i10 - 1;
                    this.forwardIterator = it;
                }

                private Iterator<T> getForwardIterator() {
                    if (this.forwardIterator == null) {
                        try {
                            this.forwardIterator = AbstractForwardSequentialList.this.iterator(this.index + 1);
                        } catch (IndexOutOfBoundsException unused) {
                            throw new NoSuchElementException();
                        }
                    }
                    return this.forwardIterator;
                }

                @Override // org.jf.util.AbstractListIterator, java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return getForwardIterator().hasNext();
                }

                @Override // org.jf.util.AbstractListIterator, java.util.ListIterator
                public boolean hasPrevious() {
                    return this.index >= 0;
                }

                @Override // org.jf.util.AbstractListIterator, java.util.ListIterator, java.util.Iterator
                public T next() {
                    T next = getForwardIterator().next();
                    this.index++;
                    return next;
                }

                @Override // org.jf.util.AbstractListIterator, java.util.ListIterator
                public int nextIndex() {
                    return this.index + 1;
                }

                @Override // org.jf.util.AbstractListIterator, java.util.ListIterator
                public T previous() {
                    this.forwardIterator = null;
                    try {
                        AbstractForwardSequentialList abstractForwardSequentialList = AbstractForwardSequentialList.this;
                        int i11 = this.index;
                        this.index = i11 - 1;
                        return (T) abstractForwardSequentialList.iterator(i11).next();
                    } catch (IndexOutOfBoundsException unused) {
                        throw new NoSuchElementException();
                    }
                }

                @Override // org.jf.util.AbstractListIterator, java.util.ListIterator
                public int previousIndex() {
                    return this.index;
                }
            };
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }
}
