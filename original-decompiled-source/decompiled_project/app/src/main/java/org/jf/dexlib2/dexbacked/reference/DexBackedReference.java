package org.jf.dexlib2.dexbacked.reference;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public abstract class DexBackedReference {
    public static Reference makeReference(DexBackedDexFile dexBackedDexFile, int i10, int i11) {
        switch (i10) {
            case 0:
                return new DexBackedStringReference(dexBackedDexFile, i11);
            case 1:
                return new DexBackedTypeReference(dexBackedDexFile, i11);
            case 2:
                return new DexBackedFieldReference(dexBackedDexFile, i11);
            case 3:
                return new DexBackedMethodReference(dexBackedDexFile, i11);
            case 4:
                return new DexBackedMethodProtoReference(dexBackedDexFile, i11);
            case 5:
                return new DexBackedCallSiteReference(dexBackedDexFile, i11);
            case 6:
                return new DexBackedMethodHandleReference(dexBackedDexFile, i11);
            default:
                throw new ExceptionWithContext("Invalid reference type: %d", Integer.valueOf(i10));
        }
    }
}
