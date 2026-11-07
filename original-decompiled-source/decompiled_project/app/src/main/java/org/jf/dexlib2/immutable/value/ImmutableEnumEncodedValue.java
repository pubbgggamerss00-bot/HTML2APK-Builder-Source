package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseEnumEncodedValue;
import org.jf.dexlib2.iface.value.EnumEncodedValue;
import org.jf.dexlib2.immutable.reference.ImmutableFieldReference;

/* loaded from: classes3.dex */
public class ImmutableEnumEncodedValue extends BaseEnumEncodedValue implements ImmutableEncodedValue {
    protected final ImmutableFieldReference value;

    public ImmutableEnumEncodedValue(ImmutableFieldReference immutableFieldReference) {
        this.value = immutableFieldReference;
    }

    public static ImmutableEnumEncodedValue of(EnumEncodedValue enumEncodedValue) {
        return enumEncodedValue instanceof ImmutableEnumEncodedValue ? (ImmutableEnumEncodedValue) enumEncodedValue : new ImmutableEnumEncodedValue(ImmutableFieldReference.of(enumEncodedValue.getValue()));
    }

    @Override // org.jf.dexlib2.iface.value.EnumEncodedValue
    public ImmutableFieldReference getValue() {
        return this.value;
    }
}
