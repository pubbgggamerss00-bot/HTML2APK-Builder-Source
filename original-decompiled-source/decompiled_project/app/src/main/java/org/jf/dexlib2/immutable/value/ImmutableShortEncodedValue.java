package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseShortEncodedValue;
import org.jf.dexlib2.iface.value.ShortEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableShortEncodedValue extends BaseShortEncodedValue implements ImmutableEncodedValue {
    protected final short value;

    public ImmutableShortEncodedValue(short s10) {
        this.value = s10;
    }

    public static ImmutableShortEncodedValue of(ShortEncodedValue shortEncodedValue) {
        return shortEncodedValue instanceof ImmutableShortEncodedValue ? (ImmutableShortEncodedValue) shortEncodedValue : new ImmutableShortEncodedValue(shortEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.ShortEncodedValue
    public short getValue() {
        return this.value;
    }
}
