package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.ByteEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseByteEncodedValue implements ByteEncodedValue {
    @Override // org.jf.dexlib2.iface.value.ByteEncodedValue
    public boolean equals(Object obj) {
        return (obj instanceof ByteEncodedValue) && getValue() == ((ByteEncodedValue) obj).getValue();
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 0;
    }

    @Override // org.jf.dexlib2.iface.value.ByteEncodedValue
    public int hashCode() {
        return getValue();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.ByteEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : u2.c(getValue(), ((ByteEncodedValue) encodedValue).getValue());
    }
}
