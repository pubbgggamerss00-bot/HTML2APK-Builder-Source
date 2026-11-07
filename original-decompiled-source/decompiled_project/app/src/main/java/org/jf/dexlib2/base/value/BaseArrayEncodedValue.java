package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.util.CollectionUtils;

/* loaded from: classes3.dex */
public abstract class BaseArrayEncodedValue implements ArrayEncodedValue {
    @Override // org.jf.dexlib2.iface.value.ArrayEncodedValue
    public boolean equals(Object obj) {
        if (obj instanceof ArrayEncodedValue) {
            return getValue().equals(((ArrayEncodedValue) obj).getValue());
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 28;
    }

    @Override // org.jf.dexlib2.iface.value.ArrayEncodedValue
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.ArrayEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : CollectionUtils.compareAsList(getValue(), ((ArrayEncodedValue) encodedValue).getValue());
    }
}
