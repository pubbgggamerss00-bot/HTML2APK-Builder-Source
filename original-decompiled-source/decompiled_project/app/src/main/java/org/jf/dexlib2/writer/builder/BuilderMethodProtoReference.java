package org.jf.dexlib2.writer.builder;

import java.util.List;
import org.jf.dexlib2.base.reference.BaseMethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;

/* loaded from: classes3.dex */
public class BuilderMethodProtoReference extends BaseMethodProtoReference implements MethodProtoReference, BuilderReference {
    int index = -1;
    final BuilderTypeList parameterTypes;
    final BuilderTypeReference returnType;
    final BuilderStringReference shorty;

    public BuilderMethodProtoReference(BuilderStringReference builderStringReference, BuilderTypeList builderTypeList, BuilderTypeReference builderTypeReference) {
        this.shorty = builderStringReference;
        this.parameterTypes = builderTypeList;
        this.returnType = builderTypeReference;
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public int getIndex() {
        return this.index;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference
    public List<? extends CharSequence> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference
    public String getReturnType() {
        return this.returnType.getType();
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public void setIndex(int i10) {
        this.index = i10;
    }
}
