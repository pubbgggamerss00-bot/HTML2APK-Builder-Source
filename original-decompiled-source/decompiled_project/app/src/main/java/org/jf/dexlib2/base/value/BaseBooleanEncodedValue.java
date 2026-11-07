package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.BooleanEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseBooleanEncodedValue implements BooleanEncodedValue {
    @Override // org.jf.dexlib2.iface.value.BooleanEncodedValue
    public boolean equals(Object obj) {
        return (obj instanceof BooleanEncodedValue) && getValue() == ((BooleanEncodedValue) obj).getValue();
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 31;
    }

    @Override // org.jf.dexlib2.iface.value.BooleanEncodedValue
    public int hashCode() {
        return getValue() ? 1 : 0;
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.BooleanEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        if (iC != 0) {
            return iC;
        }
        boolean value = getValue();
        if (value == ((BooleanEncodedValue) encodedValue).getValue()) {
            return 0;
        }
        return value ? 1 : -1;
    }
}
