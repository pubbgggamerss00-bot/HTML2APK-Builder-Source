package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.IntEncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseIntEncodedValue implements IntEncodedValue {
    @Override // org.jf.dexlib2.iface.value.IntEncodedValue
    public boolean equals(Object obj) {
        return (obj instanceof IntEncodedValue) && getValue() == ((IntEncodedValue) obj).getValue();
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 4;
    }

    @Override // org.jf.dexlib2.iface.value.IntEncodedValue
    public int hashCode() {
        return getValue();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.IntEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : u2.c(getValue(), ((IntEncodedValue) encodedValue).getValue());
    }
}
