package org.jf.dexlib2.immutable.reference;

import nc.r;
import org.jf.dexlib2.base.reference.BaseMethodReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.immutable.util.CharSequenceConverter;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableMethodReference extends BaseMethodReference implements ImmutableReference {
    protected final String definingClass;
    protected final String name;
    protected final r<String> parameters;
    protected final String returnType;

    public ImmutableMethodReference(String str, String str2, Iterable<? extends CharSequence> iterable, String str3) {
        this.definingClass = str;
        this.name = str2;
        this.parameters = CharSequenceConverter.immutableStringList(iterable);
        this.returnType = str3;
    }

    public static ImmutableMethodReference of(MethodReference methodReference) {
        return methodReference instanceof ImmutableMethodReference ? (ImmutableMethodReference) methodReference : new ImmutableMethodReference(methodReference.getDefiningClass(), methodReference.getName(), methodReference.getParameterTypes(), methodReference.getReturnType());
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getDefiningClass() {
        return this.definingClass;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method, org.jf.dexlib2.iface.Member
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, org.jf.dexlib2.iface.Method
    public String getReturnType() {
        return this.returnType;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference
    public r<String> getParameterTypes() {
        return this.parameters;
    }

    public ImmutableMethodReference(String str, String str2, r<String> rVar, String str3) {
        this.definingClass = str;
        this.name = str2;
        this.parameters = ImmutableUtils.nullToEmptyList(rVar);
        this.returnType = str3;
    }
}
