package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseLongEncodedValue;
import org.jf.dexlib2.iface.value.LongEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableLongEncodedValue extends BaseLongEncodedValue implements ImmutableEncodedValue {
    protected final long value;

    public ImmutableLongEncodedValue(long j10) {
        this.value = j10;
    }

    public static ImmutableLongEncodedValue of(LongEncodedValue longEncodedValue) {
        return longEncodedValue instanceof ImmutableLongEncodedValue ? (ImmutableLongEncodedValue) longEncodedValue : new ImmutableLongEncodedValue(longEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.LongEncodedValue
    public long getValue() {
        return this.value;
    }
}
