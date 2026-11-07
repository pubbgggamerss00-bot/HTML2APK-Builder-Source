package org.jf.dexlib2.writer.builder;

import org.jf.dexlib2.base.reference.BaseTypeReference;

/* loaded from: classes3.dex */
public class BuilderTypeReference extends BaseTypeReference implements BuilderReference {
    int index = -1;
    final BuilderStringReference stringReference;

    public BuilderTypeReference(BuilderStringReference builderStringReference) {
        this.stringReference = builderStringReference;
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public int getIndex() {
        return this.index;
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.stringReference.getString();
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public void setIndex(int i10) {
        this.index = i10;
    }
}
