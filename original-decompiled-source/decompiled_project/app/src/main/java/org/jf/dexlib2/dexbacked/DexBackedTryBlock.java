package org.jf.dexlib2.dexbacked;

import java.util.List;
import org.jf.dexlib2.base.BaseTryBlock;
import org.jf.dexlib2.dexbacked.util.VariableSizeList;

/* loaded from: classes3.dex */
public class DexBackedTryBlock extends BaseTryBlock<DexBackedExceptionHandler> {
    public final DexBackedDexFile dexFile;
    private final int handlersStartOffset;
    private final int tryItemOffset;

    public DexBackedTryBlock(DexBackedDexFile dexBackedDexFile, int i10, int i11) {
        this.dexFile = dexBackedDexFile;
        this.tryItemOffset = i10;
        this.handlersStartOffset = i11;
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public int getCodeUnitCount() {
        return this.dexFile.getDataBuffer().readUshort(this.tryItemOffset + 4);
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public List<? extends DexBackedExceptionHandler> getExceptionHandlers() {
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(this.dexFile.getDataBuffer().readUshort(this.tryItemOffset + 6) + this.handlersStartOffset);
        int sleb128 = dexReader.readSleb128();
        if (sleb128 > 0) {
            return new VariableSizeList<DexBackedTypedExceptionHandler>(this.dexFile.getDataBuffer(), dexReader.getOffset(), sleb128) { // from class: org.jf.dexlib2.dexbacked.DexBackedTryBlock.1
                @Override // org.jf.dexlib2.dexbacked.util.VariableSizeList
                public DexBackedTypedExceptionHandler readNextItem(DexReader dexReader2, int i10) {
                    return new DexBackedTypedExceptionHandler(DexBackedTryBlock.this.dexFile, dexReader2);
                }
            };
        }
        final int i10 = (sleb128 * (-1)) + 1;
        return new VariableSizeList<DexBackedExceptionHandler>(this.dexFile.getDataBuffer(), dexReader.getOffset(), i10) { // from class: org.jf.dexlib2.dexbacked.DexBackedTryBlock.2
            @Override // org.jf.dexlib2.dexbacked.util.VariableSizeList
            public DexBackedExceptionHandler readNextItem(DexReader dexReader2, int i11) {
                return i11 == i10 + (-1) ? new DexBackedCatchAllExceptionHandler(dexReader2) : new DexBackedTypedExceptionHandler(DexBackedTryBlock.this.dexFile, dexReader2);
            }
        };
    }

    @Override // org.jf.dexlib2.iface.TryBlock
    public int getStartCodeAddress() {
        return this.dexFile.getDataBuffer().readSmallUint(this.tryItemOffset);
    }
}
