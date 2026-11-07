package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.FloatEncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseFloatEncodedValue implements FloatEncodedValue {
    @Override // org.jf.dexlib2.iface.value.FloatEncodedValue
    public boolean equals(Object obj) {
        return obj != null && (obj instanceof FloatEncodedValue) && Float.floatToRawIntBits(getValue()) == Float.floatToRawIntBits(((FloatEncodedValue) obj).getValue());
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 16;
    }

    @Override // org.jf.dexlib2.iface.value.FloatEncodedValue
    public int hashCode() {
        return Float.floatToRawIntBits(getValue());
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.FloatEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : Float.compare(getValue(), ((FloatEncodedValue) encodedValue).getValue());
    }
}
