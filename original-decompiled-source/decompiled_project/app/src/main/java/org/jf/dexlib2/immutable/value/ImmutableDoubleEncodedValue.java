package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseDoubleEncodedValue;
import org.jf.dexlib2.iface.value.DoubleEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableDoubleEncodedValue extends BaseDoubleEncodedValue implements ImmutableEncodedValue {
    protected final double value;

    public ImmutableDoubleEncodedValue(double d10) {
        this.value = d10;
    }

    public static ImmutableDoubleEncodedValue of(DoubleEncodedValue doubleEncodedValue) {
        return doubleEncodedValue instanceof ImmutableDoubleEncodedValue ? (ImmutableDoubleEncodedValue) doubleEncodedValue : new ImmutableDoubleEncodedValue(doubleEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.DoubleEncodedValue
    public double getValue() {
        return this.value;
    }
}
