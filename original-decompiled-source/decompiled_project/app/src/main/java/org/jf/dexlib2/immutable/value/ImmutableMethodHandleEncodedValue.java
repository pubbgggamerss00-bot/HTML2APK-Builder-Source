package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseMethodHandleEncodedValue;
import org.jf.dexlib2.iface.value.MethodHandleEncodedValue;
import org.jf.dexlib2.immutable.reference.ImmutableMethodHandleReference;

/* loaded from: classes3.dex */
public class ImmutableMethodHandleEncodedValue extends BaseMethodHandleEncodedValue implements ImmutableEncodedValue {
    protected final ImmutableMethodHandleReference methodHandleReference;

    public ImmutableMethodHandleEncodedValue(ImmutableMethodHandleReference immutableMethodHandleReference) {
        this.methodHandleReference = immutableMethodHandleReference;
    }

    public static ImmutableMethodHandleEncodedValue of(MethodHandleEncodedValue methodHandleEncodedValue) {
        return methodHandleEncodedValue instanceof ImmutableMethodHandleEncodedValue ? (ImmutableMethodHandleEncodedValue) methodHandleEncodedValue : new ImmutableMethodHandleEncodedValue(ImmutableMethodHandleReference.of(methodHandleEncodedValue.getValue()));
    }

    @Override // org.jf.dexlib2.iface.value.MethodHandleEncodedValue
    public ImmutableMethodHandleReference getValue() {
        return this.methodHandleReference;
    }
}
