package org.jf.dexlib2.dexbacked.util;

import java.util.AbstractSet;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;

/* loaded from: classes3.dex */
public abstract class VariableSizeSet<T> extends AbstractSet<T> {
    private final DexBuffer buffer;
    private final int offset;
    private final int size;

    public VariableSizeSet(DexBuffer dexBuffer, int i10, int i11) {
        this.buffer = dexBuffer;
        this.offset = i10;
        this.size = i11;
    }

    public abstract T readNextItem(DexReader dexReader, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public VariableSizeIterator<T> iterator() {
        return new VariableSizeIterator<T>(this.buffer, this.offset, this.size) { // from class: org.jf.dexlib2.dexbacked.util.VariableSizeSet.1
            @Override // org.jf.dexlib2.dexbacked.util.VariableSizeIterator
            public T readNextItem(DexReader dexReader, int i10) {
                return (T) VariableSizeSet.this.readNextItem(dexReader, i10);
            }
        };
    }
}
