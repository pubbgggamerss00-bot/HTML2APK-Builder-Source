package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseIntEncodedValue;
import org.jf.dexlib2.iface.value.IntEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableIntEncodedValue extends BaseIntEncodedValue implements ImmutableEncodedValue {
    protected final int value;

    public ImmutableIntEncodedValue(int i10) {
        this.value = i10;
    }

    public static ImmutableIntEncodedValue of(IntEncodedValue intEncodedValue) {
        return intEncodedValue instanceof ImmutableIntEncodedValue ? (ImmutableIntEncodedValue) intEncodedValue : new ImmutableIntEncodedValue(intEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.IntEncodedValue
    public int getValue() {
        return this.value;
    }
}
