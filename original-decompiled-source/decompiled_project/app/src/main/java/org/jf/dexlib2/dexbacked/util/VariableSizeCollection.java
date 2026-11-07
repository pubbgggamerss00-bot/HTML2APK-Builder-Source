package org.jf.dexlib2.dexbacked.util;

import java.util.AbstractCollection;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;

/* loaded from: classes3.dex */
public abstract class VariableSizeCollection<T> extends AbstractCollection<T> {
    private final DexBuffer buffer;
    private final int offset;
    private final int size;

    public VariableSizeCollection(DexBuffer dexBuffer, int i10, int i11) {
        this.buffer = dexBuffer;
        this.offset = i10;
        this.size = i11;
    }

    public abstract T readNextItem(DexReader dexReader, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public VariableSizeIterator<T> iterator() {
        return new VariableSizeIterator<T>(this.buffer, this.offset, this.size) { // from class: org.jf.dexlib2.dexbacked.util.VariableSizeCollection.1
            @Override // org.jf.dexlib2.dexbacked.util.VariableSizeIterator
            public T readNextItem(DexReader dexReader, int i10) {
                return (T) VariableSizeCollection.this.readNextItem(dexReader, i10);
            }
        };
    }
}
