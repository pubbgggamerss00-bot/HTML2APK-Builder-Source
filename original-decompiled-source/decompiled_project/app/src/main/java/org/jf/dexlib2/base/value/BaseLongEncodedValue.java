package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.LongEncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseLongEncodedValue implements LongEncodedValue {
    @Override // org.jf.dexlib2.iface.value.LongEncodedValue
    public boolean equals(Object obj) {
        return (obj instanceof LongEncodedValue) && getValue() == ((LongEncodedValue) obj).getValue();
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 6;
    }

    @Override // org.jf.dexlib2.iface.value.LongEncodedValue
    public int hashCode() {
        long value = getValue();
        return (((int) value) * 31) + ((int) (value >>> 32));
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.LongEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        if (iC != 0) {
            return iC;
        }
        long value = getValue();
        long value2 = ((LongEncodedValue) encodedValue).getValue();
        if (value < value2) {
            return -1;
        }
        return value > value2 ? 1 : 0;
    }
}
