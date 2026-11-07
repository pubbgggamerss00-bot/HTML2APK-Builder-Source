package org.jf.dexlib2.dexbacked.util;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class FixedSizeSet<T> extends AbstractSet<T> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        return new Iterator<T>() { // from class: org.jf.dexlib2.dexbacked.util.FixedSizeSet.1
            int index = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < FixedSizeSet.this.size();
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                FixedSizeSet fixedSizeSet = FixedSizeSet.this;
                int i10 = this.index;
                this.index = i10 + 1;
                return (T) fixedSizeSet.readItem(i10);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public abstract T readItem(int i10);
}
