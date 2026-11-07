package org.jf.dexlib2.writer.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import nc.j0;
import nc.k0;
import org.jf.dexlib2.base.BaseTryBlock;
import org.jf.dexlib2.iface.ExceptionHandler;
import org.jf.dexlib2.iface.TryBlock;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class TryListBuilder<EH extends ExceptionHandler> {
    private final MutableTryBlock<EH> listEnd;
    private final MutableTryBlock<EH> listStart;

    public static class InvalidTryException extends ExceptionWithContext {
        public InvalidTryException(Throwable th2) {
            super(th2);
        }

        public InvalidTryException(Throwable th2, String str, Object... objArr) {
            super(th2, str, objArr);
        }

        public InvalidTryException(String str, Object... objArr) {
            super(str, objArr);
        }
    }

    public static class TryBounds<EH extends ExceptionHandler> {
        public final MutableTryBlock<EH> end;
        public final MutableTryBlock<EH> start;

        public TryBounds(MutableTryBlock<EH> mutableTryBlock, MutableTryBlock<EH> mutableTryBlock2) {
            this.start = mutableTryBlock;
            this.end = mutableTryBlock2;
        }
    }

    public TryListBuilder() {
        MutableTryBlock<EH> mutableTryBlock = new MutableTryBlock<>(0, 0);
        this.listStart = mutableTryBlock;
        MutableTryBlock<EH> mutableTryBlock2 = new MutableTryBlock<>(0, 0);
        this.listEnd = mutableTryBlock2;
        mutableTryBlock.next = mutableTryBlock2;
        mutableTryBlock2.prev = mutableTryBlock;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r0 = new org.jf.dexlib2.writer.util.TryListBuilder.MutableTryBlock<>(r4, r5);
        r3.listEnd.prepend(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return new org.jf.dexlib2.writer.util.TryListBuilder.TryBounds<>(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r1 = r3.listEnd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r4 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r1 = r4.startCodeAddress;
        r2 = r4.endCodeAddress;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r5 != r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        return new org.jf.dexlib2.writer.util.TryListBuilder.TryBounds<>(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r5 <= r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r5 >= r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        r4.split(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        return new org.jf.dexlib2.writer.util.TryListBuilder.TryBounds<>(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r5 > r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        r1 = new org.jf.dexlib2.writer.util.TryListBuilder.MutableTryBlock<>(r4.prev.endCodeAddress, r5);
        r4.prepend(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        return new org.jf.dexlib2.writer.util.TryListBuilder.TryBounds<>(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        r4 = r4.next;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r4 = new org.jf.dexlib2.writer.util.TryListBuilder.MutableTryBlock<>(r1.prev.endCodeAddress, r5);
        r3.listEnd.prepend(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        return new org.jf.dexlib2.writer.util.TryListBuilder.TryBounds<>(r0, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TryBounds<EH> getBoundingRanges(int i10, int i11) {
        MutableTryBlock<EH> mutableTryBlockSplit = this.listStart.next;
        while (true) {
            if (mutableTryBlockSplit == this.listEnd) {
                mutableTryBlockSplit = null;
                break;
            }
            int i12 = mutableTryBlockSplit.startCodeAddress;
            int i13 = mutableTryBlockSplit.endCodeAddress;
            if (i10 == i12) {
                break;
            }
            if (i10 > i12 && i10 < i13) {
                mutableTryBlockSplit = mutableTryBlockSplit.split(i10);
                break;
            }
            if (i10 >= i12) {
                mutableTryBlockSplit = mutableTryBlockSplit.next;
            } else {
                if (i11 <= i12) {
                    MutableTryBlock<EH> mutableTryBlock = new MutableTryBlock<>(i10, i11);
                    mutableTryBlockSplit.prepend(mutableTryBlock);
                    return new TryBounds<>(mutableTryBlock, mutableTryBlock);
                }
                MutableTryBlock<EH> mutableTryBlock2 = new MutableTryBlock<>(i10, i12);
                mutableTryBlockSplit.prepend(mutableTryBlock2);
                mutableTryBlockSplit = mutableTryBlock2;
            }
        }
    }

    public static <EH extends ExceptionHandler> List<TryBlock<EH>> massageTryBlocks(List<? extends TryBlock<? extends EH>> list) {
        TryListBuilder tryListBuilder = new TryListBuilder();
        for (TryBlock<? extends EH> tryBlock : list) {
            int startCodeAddress = tryBlock.getStartCodeAddress();
            int codeUnitCount = tryBlock.getCodeUnitCount() + startCodeAddress;
            Iterator<? extends EH> it = tryBlock.getExceptionHandlers().iterator();
            while (it.hasNext()) {
                tryListBuilder.addHandler(startCodeAddress, codeUnitCount, it.next());
            }
        }
        return tryListBuilder.getTryBlocks();
    }

    public void addHandler(int i10, int i11, EH eh2) {
        TryBounds<EH> boundingRanges = getBoundingRanges(i10, i11);
        MutableTryBlock<EH> mutableTryBlock = boundingRanges.start;
        MutableTryBlock<EH> mutableTryBlock2 = boundingRanges.end;
        do {
            int i12 = mutableTryBlock.startCodeAddress;
            if (i12 > i10) {
                MutableTryBlock<EH> mutableTryBlock3 = new MutableTryBlock<>(i10, i12);
                mutableTryBlock.prepend(mutableTryBlock3);
                mutableTryBlock = mutableTryBlock3;
            }
            mutableTryBlock.addHandler(eh2);
            i10 = mutableTryBlock.endCodeAddress;
            mutableTryBlock = mutableTryBlock.next;
        } while (mutableTryBlock.prev != mutableTryBlock2);
    }

    public List<TryBlock<EH>> getTryBlocks() {
        Iterator<TryBlock<EH>> it = new Iterator<TryBlock<EH>>() { // from class: org.jf.dexlib2.writer.util.TryListBuilder.1
            private MutableTryBlock<EH> next;

            {
                this.next = TryListBuilder.this.listStart;
                this.next = readNextItem();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.next != null;
            }

            public MutableTryBlock<EH> readNextItem() {
                MutableTryBlock<EH> mutableTryBlock = this.next.next;
                if (mutableTryBlock == TryListBuilder.this.listEnd) {
                    return null;
                }
                while (mutableTryBlock.next != TryListBuilder.this.listEnd && mutableTryBlock.endCodeAddress == mutableTryBlock.next.startCodeAddress && mutableTryBlock.getExceptionHandlers().equals(mutableTryBlock.next.getExceptionHandlers())) {
                    mutableTryBlock.mergeNext();
                }
                return mutableTryBlock;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public TryBlock<EH> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                MutableTryBlock<EH> mutableTryBlock = this.next;
                this.next = readNextItem();
                return mutableTryBlock;
            }
        };
        ArrayList arrayList = new ArrayList();
        j0.a(arrayList, it);
        return arrayList;
    }

    public static class MutableTryBlock<EH extends ExceptionHandler> extends BaseTryBlock<EH> {
        public int endCodeAddress;
        public List<EH> exceptionHandlers;
        public MutableTryBlock<EH> next;
        public MutableTryBlock<EH> prev;
        public int startCodeAddress;

        public MutableTryBlock(int i10, int i11) {
            this.prev = null;
            this.next = null;
            this.exceptionHandlers = new ArrayList();
            this.startCodeAddress = i10;
            this.endCodeAddress = i11;
        }

        public void addHandler(EH eh2) {
            for (EH eh3 : this.exceptionHandlers) {
                String exceptionType = eh3.getExceptionType();
                String exceptionType2 = eh2.getExceptionType();
                if (exceptionType == null) {
                    if (exceptionType2 == null) {
                        if (eh3.getHandlerCodeAddress() != eh2.getHandlerCodeAddress()) {
                            throw new InvalidTryException("Multiple overlapping catch all handlers with different handlers", new Object[0]);
                        }
                        return;
                    }
                } else if (exceptionType.equals(exceptionType2)) {
                    return;
                }
            }
            this.exceptionHandlers.add(eh2);
        }

        public void append(MutableTryBlock<EH> mutableTryBlock) {
            MutableTryBlock<EH> mutableTryBlock2 = this.next;
            mutableTryBlock2.prev = mutableTryBlock;
            mutableTryBlock.next = mutableTryBlock2;
            mutableTryBlock.prev = this;
            this.next = mutableTryBlock;
        }

        public void delete() {
            MutableTryBlock<EH> mutableTryBlock = this.next;
            mutableTryBlock.prev = this.prev;
            this.prev.next = mutableTryBlock;
        }

        @Override // org.jf.dexlib2.iface.TryBlock
        public int getCodeUnitCount() {
            return this.endCodeAddress - this.startCodeAddress;
        }

        @Override // org.jf.dexlib2.iface.TryBlock
        public List<EH> getExceptionHandlers() {
            return this.exceptionHandlers;
        }

        @Override // org.jf.dexlib2.iface.TryBlock
        public int getStartCodeAddress() {
            return this.startCodeAddress;
        }

        public void mergeNext() {
            MutableTryBlock<EH> mutableTryBlock = this.next;
            this.endCodeAddress = mutableTryBlock.endCodeAddress;
            mutableTryBlock.delete();
        }

        public void prepend(MutableTryBlock<EH> mutableTryBlock) {
            MutableTryBlock<EH> mutableTryBlock2 = this.prev;
            mutableTryBlock2.next = mutableTryBlock;
            mutableTryBlock.prev = mutableTryBlock2;
            mutableTryBlock.next = this;
            this.prev = mutableTryBlock;
        }

        public MutableTryBlock<EH> split(int i10) {
            MutableTryBlock<EH> mutableTryBlock = new MutableTryBlock<>(i10, this.endCodeAddress, this.exceptionHandlers);
            this.endCodeAddress = i10;
            append(mutableTryBlock);
            return mutableTryBlock;
        }

        public MutableTryBlock(int i10, int i11, List<EH> list) {
            this.prev = null;
            this.next = null;
            this.exceptionHandlers = new ArrayList();
            this.startCodeAddress = i10;
            this.endCodeAddress = i11;
            this.exceptionHandlers = k0.a(list);
        }
    }
}
