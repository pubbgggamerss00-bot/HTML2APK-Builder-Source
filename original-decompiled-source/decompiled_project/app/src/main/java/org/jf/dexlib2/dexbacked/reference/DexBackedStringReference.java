package org.jf.dexlib2.dexbacked.reference;

import org.jf.dexlib2.base.reference.BaseStringReference;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public class DexBackedStringReference extends BaseStringReference {
    public final DexBackedDexFile dexFile;
    public final int stringIndex;

    public DexBackedStringReference(DexBackedDexFile dexBackedDexFile, int i10) {
        this.dexFile = dexBackedDexFile;
        this.stringIndex = i10;
    }

    public int getSize() {
        DexReader<? extends DexBuffer> dexReader = this.dexFile.getDataBuffer().readerAt(this.dexFile.getBuffer().readSmallUint(this.dexFile.getStringSection().getOffset(this.stringIndex)));
        return dexReader.peekStringLength(dexReader.readSmallUleb128()) + dexReader.peekSmallUleb128Size() + 4;
    }

    @Override // org.jf.dexlib2.iface.reference.StringReference
    public String getString() {
        return this.dexFile.getStringSection().get(this.stringIndex);
    }

    @Override // org.jf.dexlib2.base.reference.BaseReference, org.jf.dexlib2.iface.reference.Reference
    public void validateReference() throws Reference.InvalidReferenceException {
        int i10 = this.stringIndex;
        if (i10 < 0 || i10 >= this.dexFile.getStringSection().size()) {
            throw new Reference.InvalidReferenceException("string@" + this.stringIndex);
        }
    }
}
