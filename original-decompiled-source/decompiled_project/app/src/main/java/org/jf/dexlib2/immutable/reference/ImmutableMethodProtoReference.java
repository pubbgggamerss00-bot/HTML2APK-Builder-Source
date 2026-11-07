package org.jf.dexlib2.immutable.reference;

import java.util.List;
import nc.r;
import org.jf.dexlib2.base.reference.BaseMethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.immutable.util.CharSequenceConverter;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableMethodProtoReference extends BaseMethodProtoReference implements ImmutableReference {
    protected final r<String> parameters;
    protected final String returnType;

    public ImmutableMethodProtoReference(r<String> rVar, String str) {
        this.parameters = ImmutableUtils.nullToEmptyList(rVar);
        this.returnType = str;
    }

    public static ImmutableMethodProtoReference of(MethodProtoReference methodProtoReference) {
        return methodProtoReference instanceof ImmutableMethodProtoReference ? (ImmutableMethodProtoReference) methodProtoReference : new ImmutableMethodProtoReference(methodProtoReference.getParameterTypes(), methodProtoReference.getReturnType());
    }

    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference
    public List<? extends CharSequence> getParameterTypes() {
        return this.parameters;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference
    public String getReturnType() {
        return this.returnType;
    }

    public ImmutableMethodProtoReference(Iterable<? extends CharSequence> iterable, String str) {
        this.parameters = CharSequenceConverter.immutableStringList(iterable);
        this.returnType = str;
    }
}
