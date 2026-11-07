package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseFieldEncodedValue;
import org.jf.dexlib2.iface.value.FieldEncodedValue;
import org.jf.dexlib2.immutable.reference.ImmutableFieldReference;

/* loaded from: classes3.dex */
public class ImmutableFieldEncodedValue extends BaseFieldEncodedValue implements ImmutableEncodedValue {
    protected final ImmutableFieldReference value;

    public ImmutableFieldEncodedValue(ImmutableFieldReference immutableFieldReference) {
        this.value = immutableFieldReference;
    }

    public static ImmutableFieldEncodedValue of(FieldEncodedValue fieldEncodedValue) {
        return fieldEncodedValue instanceof ImmutableFieldEncodedValue ? (ImmutableFieldEncodedValue) fieldEncodedValue : new ImmutableFieldEncodedValue(ImmutableFieldReference.of(fieldEncodedValue.getValue()));
    }

    @Override // org.jf.dexlib2.iface.value.FieldEncodedValue
    public ImmutableFieldReference getValue() {
        return this.value;
    }
}
