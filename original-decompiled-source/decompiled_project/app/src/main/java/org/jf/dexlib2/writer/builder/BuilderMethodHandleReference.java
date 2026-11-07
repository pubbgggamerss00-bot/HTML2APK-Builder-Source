package org.jf.dexlib2.writer.builder;

import org.jf.dexlib2.base.reference.BaseMethodHandleReference;

/* loaded from: classes3.dex */
public class BuilderMethodHandleReference extends BaseMethodHandleReference implements BuilderReference {
    int index = -1;
    final BuilderReference memberReference;
    final int methodHandleType;

    public BuilderMethodHandleReference(int i10, BuilderReference builderReference) {
        this.methodHandleType = i10;
        this.memberReference = builderReference;
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public int getIndex() {
        return this.index;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodHandleReference
    public int getMethodHandleType() {
        return this.methodHandleType;
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public void setIndex(int i10) {
        this.index = i10;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodHandleReference
    public BuilderReference getMemberReference() {
        return this.memberReference;
    }
}
