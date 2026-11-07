package org.jf.dexlib2.dexbacked.value;

import org.jf.dexlib2.base.value.BaseStringEncodedValue;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;

/* loaded from: classes3.dex */
public class DexBackedStringEncodedValue extends BaseStringEncodedValue {
    public final DexBackedDexFile dexFile;
    private final int stringIndex;

    public DexBackedStringEncodedValue(DexBackedDexFile dexBackedDexFile, DexReader dexReader, int i10) {
        this.dexFile = dexBackedDexFile;
        this.stringIndex = dexReader.readSizedSmallUint(i10 + 1);
    }

    @Override // org.jf.dexlib2.iface.value.StringEncodedValue
    public String getValue() {
        return this.dexFile.getStringSection().get(this.stringIndex);
    }
}
