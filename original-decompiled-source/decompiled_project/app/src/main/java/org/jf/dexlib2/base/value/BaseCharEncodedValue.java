package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.CharEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseCharEncodedValue implements CharEncodedValue {
    @Override // org.jf.dexlib2.iface.value.CharEncodedValue
    public boolean equals(Object obj) {
        return (obj instanceof CharEncodedValue) && getValue() == ((CharEncodedValue) obj).getValue();
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 3;
    }

    @Override // org.jf.dexlib2.iface.value.CharEncodedValue
    public int hashCode() {
        return getValue();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.CharEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : getValue() - ((CharEncodedValue) encodedValue).getValue();
    }
}
