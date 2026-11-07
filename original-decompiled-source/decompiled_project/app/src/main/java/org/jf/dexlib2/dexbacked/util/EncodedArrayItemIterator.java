package org.jf.dexlib2.dexbacked.util;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.value.DexBackedEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public abstract class EncodedArrayItemIterator {
    public static final EncodedArrayItemIterator EMPTY = new EncodedArrayItemIterator() { // from class: org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator.1
        @Override // org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator
        public int getItemCount() {
            return 0;
        }

        @Override // org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator
        public EncodedValue getNextOrNull() {
            return null;
        }

        @Override // org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator
        public int getReaderOffset() {
            return 0;
        }

        @Override // org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator
        public void skipNext() {
        }
    };

    public static class EncodedArrayItemIteratorImpl extends EncodedArrayItemIterator {
        private final DexBackedDexFile dexFile;
        private int index = 0;
        private final DexReader reader;
        private final int size;

        public EncodedArrayItemIteratorImpl(DexBackedDexFile dexBackedDexFile, int i10) {
            this.dexFile = dexBackedDexFile;
            DexReader<? extends DexBuffer> dexReader = dexBackedDexFile.getDataBuffer().readerAt(i10);
            this.reader = dexReader;
            this.size = dexReader.readSmallUleb128();
        }

        @Override // org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator
        public int getItemCount() {
            return this.size;
        }

        @Override // org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator
        public EncodedValue getNextOrNull() {
            int i10 = this.index;
            if (i10 >= this.size) {
                return null;
            }
            this.index = i10 + 1;
            return DexBackedEncodedValue.readFrom(this.dexFile, this.reader);
        }

        @Override // org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator
        public int getReaderOffset() {
            return this.reader.getOffset();
        }

        @Override // org.jf.dexlib2.dexbacked.util.EncodedArrayItemIterator
        public void skipNext() {
            int i10 = this.index;
            if (i10 < this.size) {
                this.index = i10 + 1;
                DexBackedEncodedValue.skipFrom(this.reader);
            }
        }
    }

    public static EncodedArrayItemIterator newOrEmpty(DexBackedDexFile dexBackedDexFile, int i10) {
        return i10 == 0 ? EMPTY : new EncodedArrayItemIteratorImpl(dexBackedDexFile, i10);
    }

    public abstract int getItemCount();

    public abstract EncodedValue getNextOrNull();

    public abstract int getReaderOffset();

    public abstract void skipNext();
}
