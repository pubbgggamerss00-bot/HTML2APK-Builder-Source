package org.jf.dexlib2.dexbacked.reference;

import java.util.List;
import nc.r;
import nc.u0;
import org.jf.dexlib2.base.reference.BaseMethodProtoReference;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.util.FixedSizeList;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public class DexBackedMethodProtoReference extends BaseMethodProtoReference {
    public final DexBackedDexFile dexFile;
    private final int protoIndex;

    public DexBackedMethodProtoReference(DexBackedDexFile dexBackedDexFile, int i10) {
        this.dexFile = dexBackedDexFile;
        this.protoIndex = i10;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference
    public List<String> getParameterTypes() {
        int smallUint = this.dexFile.getBuffer().readSmallUint(this.dexFile.getProtoSection().getOffset(this.protoIndex) + 8);
        if (smallUint <= 0) {
            r.a aVar = r.f18735b;
            return u0.f18756e;
        }
        final int smallUint2 = this.dexFile.getDataBuffer().readSmallUint(smallUint);
        final int i10 = smallUint + 4;
        return new FixedSizeList<String>() { // from class: org.jf.dexlib2.dexbacked.reference.DexBackedMethodProtoReference.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return smallUint2;
            }

            @Override // org.jf.dexlib2.dexbacked.util.FixedSizeList
            public String readItem(int i11) {
                return DexBackedMethodProtoReference.this.dexFile.getTypeSection().get(DexBackedMethodProtoReference.this.dexFile.getDataBuffer().readUshort((i11 * 2) + i10));
            }
        };
    }

    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference
    public String getReturnType() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readSmallUint(this.dexFile.getProtoSection().getOffset(this.protoIndex) + 4));
    }

    public int getSize() {
        List<String> parameterTypes = getParameterTypes();
        if (parameterTypes.isEmpty()) {
            return 12;
        }
        return (parameterTypes.size() * 2) + 16;
    }

    @Override // org.jf.dexlib2.base.reference.BaseReference, org.jf.dexlib2.iface.reference.Reference
    public void validateReference() throws Reference.InvalidReferenceException {
        int i10 = this.protoIndex;
        if (i10 < 0 || i10 >= this.dexFile.getProtoSection().size()) {
            throw new Reference.InvalidReferenceException("proto@" + this.protoIndex);
        }
    }
}
