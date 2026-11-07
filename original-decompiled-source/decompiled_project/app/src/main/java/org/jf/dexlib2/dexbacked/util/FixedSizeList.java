package org.jf.dexlib2.dexbacked.util;

import java.util.AbstractList;

/* loaded from: classes3.dex */
public abstract class FixedSizeList<T> extends AbstractList<T> {
    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        if (i10 < 0 || i10 >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return readItem(i10);
    }

    public abstract T readItem(int i10);
}
