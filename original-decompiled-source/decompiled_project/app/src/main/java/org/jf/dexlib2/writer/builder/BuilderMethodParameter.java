package org.jf.dexlib2.writer.builder;

import org.jf.dexlib2.base.BaseMethodParameter;

/* loaded from: classes3.dex */
public class BuilderMethodParameter extends BaseMethodParameter {
    final BuilderAnnotationSet annotations;
    final BuilderStringReference name;
    final BuilderTypeReference type;

    public BuilderMethodParameter(BuilderTypeReference builderTypeReference, BuilderStringReference builderStringReference, BuilderAnnotationSet builderAnnotationSet) {
        this.type = builderTypeReference;
        this.name = builderStringReference;
        this.annotations = builderAnnotationSet;
    }

    @Override // org.jf.dexlib2.iface.MethodParameter, org.jf.dexlib2.iface.debug.LocalInfo
    public String getName() {
        BuilderStringReference builderStringReference = this.name;
        if (builderStringReference == null) {
            return null;
        }
        return builderStringReference.getString();
    }

    @Override // org.jf.dexlib2.iface.reference.TypeReference, org.jf.dexlib2.iface.ClassDef
    public String getType() {
        return this.type.getType();
    }

    @Override // org.jf.dexlib2.iface.MethodParameter
    public BuilderAnnotationSet getAnnotations() {
        return this.annotations;
    }
}
