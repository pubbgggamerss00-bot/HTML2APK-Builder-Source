package org.jf.dexlib2.dexbacked.reference;

import org.jf.dexlib2.base.reference.BaseTypeReference;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public class DexBackedTypeReference extends BaseTypeReference {
    public final DexBackedDexFile dexFile;
    public final int typeIndex;

    public DexBackedTypeReference(DexBackedDexFile dexBackedDexFile, int i10) {
        this.dexFile = dexBackedDexFile;
        this.typeIndex = i10;
    }

    public int getSize() {
        return 4;
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.dexFile.getTypeSection().get(this.typeIndex);
    }

    @Override // org.jf.dexlib2.base.reference.BaseReference, org.jf.dexlib2.iface.reference.Reference
    public void validateReference() throws Reference.InvalidReferenceException {
        int i10 = this.typeIndex;
        if (i10 < 0 || i10 >= this.dexFile.getTypeSection().size()) {
            throw new Reference.InvalidReferenceException("type@" + this.typeIndex);
        }
    }
}
