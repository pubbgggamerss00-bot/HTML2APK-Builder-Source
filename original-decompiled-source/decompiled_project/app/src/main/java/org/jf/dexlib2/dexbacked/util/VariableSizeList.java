package org.jf.dexlib2.dexbacked.util;

import java.util.AbstractSequentialList;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;

/* loaded from: classes3.dex */
public abstract class VariableSizeList<T> extends AbstractSequentialList<T> {
    private final DexBuffer buffer;
    private final int offset;
    private final int size;

    public VariableSizeList(DexBuffer dexBuffer, int i10, int i11) {
        this.buffer = dexBuffer;
        this.offset = i10;
        this.size = i11;
    }

    public abstract T readNextItem(DexReader dexReader, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public VariableSizeListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public VariableSizeListIterator<T> listIterator(int i10) {
        VariableSizeListIterator<T> variableSizeListIterator = new VariableSizeListIterator<T>(this.buffer, this.offset, this.size) { // from class: org.jf.dexlib2.dexbacked.util.VariableSizeList.1
            @Override // org.jf.dexlib2.dexbacked.util.VariableSizeListIterator
            public T readNextItem(DexReader dexReader, int i11) {
                return (T) VariableSizeList.this.readNextItem(dexReader, i11);
            }
        };
        for (int i11 = 0; i11 < i10; i11++) {
            variableSizeListIterator.next();
        }
        return variableSizeListIterator;
    }
}
