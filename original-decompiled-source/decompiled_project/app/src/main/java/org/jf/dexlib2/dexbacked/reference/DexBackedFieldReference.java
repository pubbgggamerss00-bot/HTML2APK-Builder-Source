package org.jf.dexlib2.dexbacked.reference;

import org.jf.dexlib2.base.reference.BaseFieldReference;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public class DexBackedFieldReference extends BaseFieldReference {
    public final DexBackedDexFile dexFile;
    private final int fieldIndex;

    public DexBackedFieldReference(DexBackedDexFile dexBackedDexFile, int i10) {
        this.dexFile = dexBackedDexFile;
        this.fieldIndex = i10;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readUshort(this.dexFile.getFieldSection().getOffset(this.fieldIndex)));
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.dexFile.getStringSection().get(this.dexFile.getBuffer().readSmallUint(this.dexFile.getFieldSection().getOffset(this.fieldIndex) + 4));
    }

    public int getSize() {
        return 8;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
    public String getType() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readUshort(this.dexFile.getFieldSection().getOffset(this.fieldIndex) + 2));
    }

    @Override // org.jf.dexlib2.base.reference.BaseReference, org.jf.dexlib2.iface.reference.Reference
    public void validateReference() throws Reference.InvalidReferenceException {
        int i10 = this.fieldIndex;
        if (i10 < 0 || i10 >= this.dexFile.getFieldSection().size()) {
            throw new Reference.InvalidReferenceException("field@" + this.fieldIndex);
        }
    }
}
