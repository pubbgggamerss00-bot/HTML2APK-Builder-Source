package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.DoubleEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseDoubleEncodedValue implements DoubleEncodedValue {
    @Override // org.jf.dexlib2.iface.value.DoubleEncodedValue
    public boolean equals(Object obj) {
        return (obj instanceof DoubleEncodedValue) && Double.doubleToRawLongBits(getValue()) == Double.doubleToRawLongBits(((DoubleEncodedValue) obj).getValue());
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 17;
    }

    @Override // org.jf.dexlib2.iface.value.DoubleEncodedValue
    public int hashCode() {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(getValue());
        return (int) (jDoubleToRawLongBits ^ (jDoubleToRawLongBits >>> 32));
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.DoubleEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : Double.compare(getValue(), ((DoubleEncodedValue) encodedValue).getValue());
    }
}
