package org.jf.dexlib2.dexbacked.value;

import org.jf.dexlib2.base.value.BaseTypeEncodedValue;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;

/* loaded from: classes3.dex */
public class DexBackedTypeEncodedValue extends BaseTypeEncodedValue {
    public final DexBackedDexFile dexFile;
    private final int typeIndex;

    public DexBackedTypeEncodedValue(DexBackedDexFile dexBackedDexFile, DexReader dexReader, int i10) {
        this.dexFile = dexBackedDexFile;
        this.typeIndex = dexReader.readSizedSmallUint(i10 + 1);
    }

    @Override // org.jf.dexlib2.iface.value.TypeEncodedValue
    public String getValue() {
        return this.dexFile.getTypeSection().get(this.typeIndex);
    }
}
