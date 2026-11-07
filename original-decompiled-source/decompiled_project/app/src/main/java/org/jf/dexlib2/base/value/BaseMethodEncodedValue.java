package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.MethodEncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseMethodEncodedValue implements MethodEncodedValue {
    @Override // org.jf.dexlib2.iface.value.MethodEncodedValue
    public boolean equals(Object obj) {
        if (obj instanceof MethodEncodedValue) {
            return getValue().equals(((MethodEncodedValue) obj).getValue());
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 26;
    }

    @Override // org.jf.dexlib2.iface.value.MethodEncodedValue
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.MethodEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : getValue().compareTo(((MethodEncodedValue) encodedValue).getValue());
    }
}
