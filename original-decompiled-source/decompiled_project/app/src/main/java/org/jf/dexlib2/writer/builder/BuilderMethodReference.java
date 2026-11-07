package org.jf.dexlib2.writer.builder;

import org.jf.dexlib2.base.reference.BaseMethodReference;

/* loaded from: classes3.dex */
public class BuilderMethodReference extends BaseMethodReference implements BuilderReference {
    final BuilderTypeReference definingClass;
    int index = -1;
    final BuilderStringReference name;
    final BuilderMethodProtoReference proto;

    public BuilderMethodReference(BuilderTypeReference builderTypeReference, BuilderStringReference builderStringReference, BuilderMethodProtoReference builderMethodProtoReference) {
        this.definingClass = builderTypeReference;
        this.name = builderStringReference;
        this.proto = builderMethodProtoReference;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.definingClass.getType();
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public int getIndex() {
        return this.index;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.name.getString();
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method
    public String getReturnType() {
        return this.proto.returnType.getType();
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public void setIndex(int i10) {
        this.index = i10;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference
    public BuilderTypeList getParameterTypes() {
        return this.proto.parameterTypes;
    }
}
