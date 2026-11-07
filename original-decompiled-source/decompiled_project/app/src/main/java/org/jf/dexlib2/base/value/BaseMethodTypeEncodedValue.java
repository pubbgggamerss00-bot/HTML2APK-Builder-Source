package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.MethodTypeEncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseMethodTypeEncodedValue implements MethodTypeEncodedValue {
    @Override // org.jf.dexlib2.iface.value.MethodTypeEncodedValue
    public boolean equals(Object obj) {
        if (obj instanceof MethodTypeEncodedValue) {
            return getValue().equals(((MethodTypeEncodedValue) obj).getValue());
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 21;
    }

    @Override // org.jf.dexlib2.iface.value.MethodTypeEncodedValue
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.MethodTypeEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : getValue().compareTo(((MethodTypeEncodedValue) encodedValue).getValue());
    }
}
