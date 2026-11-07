package org.jf.dexlib2.dexbacked.value;

import org.jf.dexlib2.base.value.BaseMethodHandleEncodedValue;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.reference.DexBackedMethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;

/* loaded from: classes3.dex */
public class DexBackedMethodHandleEncodedValue extends BaseMethodHandleEncodedValue {
    public final DexBackedDexFile dexFile;
    private final int methodHandleIndex;

    public DexBackedMethodHandleEncodedValue(DexBackedDexFile dexBackedDexFile, DexReader dexReader, int i10) {
        this.dexFile = dexBackedDexFile;
        this.methodHandleIndex = dexReader.readSizedSmallUint(i10 + 1);
    }

    @Override // org.jf.dexlib2.iface.value.MethodHandleEncodedValue
    public MethodHandleReference getValue() {
        return new DexBackedMethodHandleReference(this.dexFile, this.methodHandleIndex);
    }
}
