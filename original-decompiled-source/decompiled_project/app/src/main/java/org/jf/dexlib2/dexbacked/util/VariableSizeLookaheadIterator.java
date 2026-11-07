package org.jf.dexlib2.dexbacked.util;

import java.util.Iterator;
import nc.b;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;

/* loaded from: classes3.dex */
public abstract class VariableSizeLookaheadIterator<T> extends b<T> implements Iterator<T> {
    private final DexReader reader;

    public VariableSizeLookaheadIterator(DexBuffer dexBuffer, int i10) {
        this.reader = dexBuffer.readerAt(i10);
    }

    @Override // nc.b
    public T computeNext() {
        return readNextItem(this.reader);
    }

    public final int getReaderOffset() {
        return this.reader.getOffset();
    }

    public abstract T readNextItem(DexReader dexReader);
}
