package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseMethodTypeEncodedValue;
import org.jf.dexlib2.iface.value.MethodTypeEncodedValue;
import org.jf.dexlib2.immutable.reference.ImmutableMethodProtoReference;

/* loaded from: classes3.dex */
public class ImmutableMethodTypeEncodedValue extends BaseMethodTypeEncodedValue implements ImmutableEncodedValue {
    protected final ImmutableMethodProtoReference methodProtoReference;

    public ImmutableMethodTypeEncodedValue(ImmutableMethodProtoReference immutableMethodProtoReference) {
        this.methodProtoReference = immutableMethodProtoReference;
    }

    public static ImmutableMethodTypeEncodedValue of(MethodTypeEncodedValue methodTypeEncodedValue) {
        return methodTypeEncodedValue instanceof ImmutableMethodTypeEncodedValue ? (ImmutableMethodTypeEncodedValue) methodTypeEncodedValue : new ImmutableMethodTypeEncodedValue(ImmutableMethodProtoReference.of(methodTypeEncodedValue.getValue()));
    }

    @Override // org.jf.dexlib2.iface.value.MethodTypeEncodedValue
    public ImmutableMethodProtoReference getValue() {
        return this.methodProtoReference;
    }
}
