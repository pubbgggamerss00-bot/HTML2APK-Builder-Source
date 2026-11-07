package org.jf.dexlib2.writer.builder;

import org.jf.dexlib2.base.reference.BaseFieldReference;

/* loaded from: classes3.dex */
public class BuilderFieldReference extends BaseFieldReference implements BuilderReference {
    final BuilderTypeReference definingClass;
    final BuilderTypeReference fieldType;
    int index = -1;
    final BuilderStringReference name;

    public BuilderFieldReference(BuilderTypeReference builderTypeReference, BuilderStringReference builderStringReference, BuilderTypeReference builderTypeReference2) {
        this.definingClass = builderTypeReference;
        this.name = builderStringReference;
        this.fieldType = builderTypeReference2;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.definingClass.getType();
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public int getIndex() {
        return this.index;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.name.getString();
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, org.jf.dexlib2.iface.Field
    public String getType() {
        return this.fieldType.getType();
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public void setIndex(int i10) {
        this.index = i10;
    }
}
