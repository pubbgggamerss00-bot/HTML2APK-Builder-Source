package org.jf.dexlib2.dexbacked.value;

import org.jf.dexlib2.base.value.BaseMethodTypeEncodedValue;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.reference.DexBackedMethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;

/* loaded from: classes3.dex */
public class DexBackedMethodTypeEncodedValue extends BaseMethodTypeEncodedValue {
    public final DexBackedDexFile dexFile;
    private final int methodProtoIndex;

    public DexBackedMethodTypeEncodedValue(DexBackedDexFile dexBackedDexFile, DexReader dexReader, int i10) {
        this.dexFile = dexBackedDexFile;
        this.methodProtoIndex = dexReader.readSizedSmallUint(i10 + 1);
    }

    @Override // org.jf.dexlib2.iface.value.MethodTypeEncodedValue
    public MethodProtoReference getValue() {
        return new DexBackedMethodProtoReference(this.dexFile, this.methodProtoIndex);
    }
}
