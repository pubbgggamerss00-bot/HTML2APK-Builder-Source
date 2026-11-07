package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseFloatEncodedValue;
import org.jf.dexlib2.iface.value.FloatEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableFloatEncodedValue extends BaseFloatEncodedValue implements ImmutableEncodedValue {
    protected final float value;

    public ImmutableFloatEncodedValue(float f10) {
        this.value = f10;
    }

    public static ImmutableFloatEncodedValue of(FloatEncodedValue floatEncodedValue) {
        return floatEncodedValue instanceof ImmutableFloatEncodedValue ? (ImmutableFloatEncodedValue) floatEncodedValue : new ImmutableFloatEncodedValue(floatEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.FloatEncodedValue
    public float getValue() {
        return this.value;
    }
}
