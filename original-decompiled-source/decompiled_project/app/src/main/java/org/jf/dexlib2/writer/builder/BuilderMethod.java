package org.jf.dexlib2.writer.builder;

import java.util.List;
import java.util.Set;
import org.jf.dexlib2.HiddenApiRestriction;
import org.jf.dexlib2.base.reference.BaseMethodReference;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.MethodImplementation;

/* loaded from: classes3.dex */
public class BuilderMethod extends BaseMethodReference implements Method {
    final int accessFlags;
    final BuilderAnnotationSet annotations;
    final Set<HiddenApiRestriction> hiddenApiRestrictions;
    final MethodImplementation methodImplementation;
    final BuilderMethodReference methodReference;
    final List<? extends BuilderMethodParameter> parameters;
    int annotationSetRefListOffset = 0;
    int codeItemOffset = 0;

    public BuilderMethod(BuilderMethodReference builderMethodReference, List<? extends BuilderMethodParameter> list, int i10, BuilderAnnotationSet builderAnnotationSet, Set<HiddenApiRestriction> set, MethodImplementation methodImplementation) {
        this.methodReference = builderMethodReference;
        this.parameters = list;
        this.accessFlags = i10;
        this.annotations = builderAnnotationSet;
        this.hiddenApiRestrictions = set;
        this.methodImplementation = methodImplementation;
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public int getAccessFlags() {
        return this.accessFlags;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.methodReference.definingClass.getType();
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public Set<HiddenApiRestriction> getHiddenApiRestrictions() {
        return this.hiddenApiRestrictions;
    }

    @Override // org.jf.dexlib2.iface.Method
    public MethodImplementation getImplementation() {
        return this.methodImplementation;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.methodReference.name.getString();
    }

    @Override // org.jf.dexlib2.iface.Method
    public List<? extends BuilderMethodParameter> getParameters() {
        return this.parameters;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method
    public String getReturnType() {
        return this.methodReference.proto.returnType.getType();
    }

    @Override // org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Annotatable
    public BuilderAnnotationSet getAnnotations() {
        return this.annotations;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference
    public BuilderTypeList getParameterTypes() {
        return this.methodReference.proto.parameterTypes;
    }
}
