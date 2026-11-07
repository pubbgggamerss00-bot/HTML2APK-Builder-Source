package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseBooleanEncodedValue;
import org.jf.dexlib2.iface.value.BooleanEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableBooleanEncodedValue extends BaseBooleanEncodedValue implements ImmutableEncodedValue {
    protected final boolean value;
    public static final ImmutableBooleanEncodedValue TRUE_VALUE = new ImmutableBooleanEncodedValue(true);
    public static final ImmutableBooleanEncodedValue FALSE_VALUE = new ImmutableBooleanEncodedValue(false);

    private ImmutableBooleanEncodedValue(boolean z10) {
        this.value = z10;
    }

    public static ImmutableBooleanEncodedValue forBoolean(boolean z10) {
        return z10 ? TRUE_VALUE : FALSE_VALUE;
    }

    public static ImmutableBooleanEncodedValue of(BooleanEncodedValue booleanEncodedValue) {
        return forBoolean(booleanEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.BooleanEncodedValue
    public boolean getValue() {
        return this.value;
    }
}
