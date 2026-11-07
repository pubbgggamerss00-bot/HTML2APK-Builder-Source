package org.jf.dexlib2.dexbacked.reference;

import java.util.List;
import nc.r;
import nc.u0;
import org.jf.dexlib2.base.reference.BaseMethodReference;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.util.FixedSizeList;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public class DexBackedMethodReference extends BaseMethodReference {
    public final DexBackedDexFile dexFile;
    private final int methodIndex;
    private int protoIdItemOffset;

    public DexBackedMethodReference(DexBackedDexFile dexBackedDexFile, int i10) {
        this.dexFile = dexBackedDexFile;
        this.methodIndex = i10;
    }

    private int getProtoIdItemOffset() {
        if (this.protoIdItemOffset == 0) {
            this.protoIdItemOffset = this.dexFile.getProtoSection().getOffset(this.dexFile.getBuffer().readUshort(this.dexFile.getMethodSection().getOffset(this.methodIndex) + 2));
        }
        return this.protoIdItemOffset;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readUshort(this.dexFile.getMethodSection().getOffset(this.methodIndex)));
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.dexFile.getStringSection().get(this.dexFile.getBuffer().readSmallUint(this.dexFile.getMethodSection().getOffset(this.methodIndex) + 4));
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference
    public List<String> getParameterTypes() {
        int smallUint = this.dexFile.getBuffer().readSmallUint(getProtoIdItemOffset() + 8);
        if (smallUint <= 0) {
            r.a aVar = r.f18735b;
            return u0.f18756e;
        }
        final int smallUint2 = this.dexFile.getDataBuffer().readSmallUint(smallUint);
        final int i10 = smallUint + 4;
        return new FixedSizeList<String>() { // from class: org.jf.dexlib2.dexbacked.reference.DexBackedMethodReference.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return smallUint2;
            }

            @Override // org.jf.dexlib2.dexbacked.util.FixedSizeList
            public String readItem(int i11) {
                return DexBackedMethodReference.this.dexFile.getTypeSection().get(DexBackedMethodReference.this.dexFile.getDataBuffer().readUshort((i11 * 2) + i10));
            }
        };
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method
    public String getReturnType() {
        return this.dexFile.getTypeSection().get(this.dexFile.getBuffer().readSmallUint(getProtoIdItemOffset() + 4));
    }

    public int getSize() {
        return 8;
    }

    @Override // org.jf.dexlib2.base.reference.BaseReference, org.jf.dexlib2.iface.reference.Reference
    public void validateReference() throws Reference.InvalidReferenceException {
        int i10 = this.methodIndex;
        if (i10 < 0 || i10 >= this.dexFile.getMethodSection().size()) {
            throw new Reference.InvalidReferenceException("method@" + this.methodIndex);
        }
    }
}
