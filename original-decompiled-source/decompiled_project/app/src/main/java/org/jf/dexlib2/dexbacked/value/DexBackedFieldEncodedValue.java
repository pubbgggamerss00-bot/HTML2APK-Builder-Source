package org.jf.dexlib2.dexbacked.value;

import org.jf.dexlib2.base.value.BaseFieldEncodedValue;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.reference.DexBackedFieldReference;
import org.jf.dexlib2.iface.reference.FieldReference;

/* loaded from: classes3.dex */
public class DexBackedFieldEncodedValue extends BaseFieldEncodedValue {
    public final DexBackedDexFile dexFile;
    private final int fieldIndex;

    public DexBackedFieldEncodedValue(DexBackedDexFile dexBackedDexFile, DexReader dexReader, int i10) {
        this.dexFile = dexBackedDexFile;
        this.fieldIndex = dexReader.readSizedSmallUint(i10 + 1);
    }

    @Override // org.jf.dexlib2.iface.value.FieldEncodedValue
    public FieldReference getValue() {
        return new DexBackedFieldReference(this.dexFile, this.fieldIndex);
    }
}
