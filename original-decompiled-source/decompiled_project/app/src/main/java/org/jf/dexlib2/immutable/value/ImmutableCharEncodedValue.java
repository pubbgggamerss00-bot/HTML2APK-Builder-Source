package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseCharEncodedValue;
import org.jf.dexlib2.iface.value.CharEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableCharEncodedValue extends BaseCharEncodedValue implements ImmutableEncodedValue {
    protected final char value;

    public ImmutableCharEncodedValue(char c10) {
        this.value = c10;
    }

    public static ImmutableCharEncodedValue of(CharEncodedValue charEncodedValue) {
        return charEncodedValue instanceof ImmutableCharEncodedValue ? (ImmutableCharEncodedValue) charEncodedValue : new ImmutableCharEncodedValue(charEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.CharEncodedValue
    public char getValue() {
        return this.value;
    }
}
