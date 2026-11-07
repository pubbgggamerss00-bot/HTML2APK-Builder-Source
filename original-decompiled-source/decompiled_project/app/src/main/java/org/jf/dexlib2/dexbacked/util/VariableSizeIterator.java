package org.jf.dexlib2.dexbacked.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;

/* loaded from: classes3.dex */
public abstract class VariableSizeIterator<T> implements Iterator<T> {
    private int index;
    private final DexReader reader;
    protected final int size;

    public VariableSizeIterator(DexBuffer dexBuffer, int i10, int i11) {
        this.reader = dexBuffer.readerAt(i10);
        this.size = i11;
    }

    public int getReaderOffset() {
        return this.reader.getOffset();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.index;
        if (i10 >= this.size) {
            throw new NoSuchElementException();
        }
        DexReader dexReader = this.reader;
        this.index = i10 + 1;
        return readNextItem(dexReader, i10);
    }

    public abstract T readNextItem(DexReader dexReader, int i10);

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public VariableSizeIterator(DexReader dexReader, int i10) {
        this.reader = dexReader;
        this.size = i10;
    }
}
