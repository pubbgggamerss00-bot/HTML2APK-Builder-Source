package org.jf.dexlib2.dexbacked.value;

import org.jf.dexlib2.base.value.BaseMethodEncodedValue;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.reference.DexBackedMethodReference;
import org.jf.dexlib2.iface.reference.MethodReference;

/* loaded from: classes3.dex */
public class DexBackedMethodEncodedValue extends BaseMethodEncodedValue {
    public final DexBackedDexFile dexFile;
    private final int methodIndex;

    public DexBackedMethodEncodedValue(DexBackedDexFile dexBackedDexFile, DexReader dexReader, int i10) {
        this.dexFile = dexBackedDexFile;
        this.methodIndex = dexReader.readSizedSmallUint(i10 + 1);
    }

    @Override // org.jf.dexlib2.iface.value.MethodEncodedValue
    public MethodReference getValue() {
        return new DexBackedMethodReference(this.dexFile, this.methodIndex);
    }
}
