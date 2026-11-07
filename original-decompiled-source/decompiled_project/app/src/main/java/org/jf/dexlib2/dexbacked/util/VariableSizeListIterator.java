package org.jf.dexlib2.dexbacked.util;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;

/* loaded from: classes3.dex */
public abstract class VariableSizeListIterator<T> implements ListIterator<T> {
    private int index;
    private DexReader<? extends DexBuffer> reader;
    protected final int size;
    private final int startOffset;

    public VariableSizeListIterator(DexBuffer dexBuffer, int i10, int i11) {
        this.reader = dexBuffer.readerAt(i10);
        this.startOffset = i10;
        this.size = i11;
    }

    @Override // java.util.ListIterator
    public void add(T t3) {
        throw new UnsupportedOperationException();
    }

    public int getReaderOffset() {
        return this.reader.getOffset();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        int i10 = this.index;
        if (i10 >= this.size) {
            throw new NoSuchElementException();
        }
        DexReader<? extends DexBuffer> dexReader = this.reader;
        this.index = i10 + 1;
        return readNextItem(dexReader, i10);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public T previous() {
        int i10 = this.index - 1;
        this.reader.setOffset(this.startOffset);
        this.index = 0;
        while (true) {
            int i11 = this.index;
            if (i11 >= i10) {
                DexReader<? extends DexBuffer> dexReader = this.reader;
                this.index = i11 + 1;
                return readNextItem(dexReader, i11);
            }
            DexReader<? extends DexBuffer> dexReader2 = this.reader;
            this.index = i11 + 1;
            readNextItem(dexReader2, i11);
        }
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index - 1;
    }

    public abstract T readNextItem(DexReader<? extends DexBuffer> dexReader, int i10);

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(T t3) {
        throw new UnsupportedOperationException();
    }
}
