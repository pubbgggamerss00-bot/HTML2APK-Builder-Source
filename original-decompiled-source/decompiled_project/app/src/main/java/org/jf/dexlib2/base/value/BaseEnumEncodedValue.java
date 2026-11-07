package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.EnumEncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseEnumEncodedValue implements EnumEncodedValue {
    @Override // org.jf.dexlib2.iface.value.EnumEncodedValue
    public boolean equals(Object obj) {
        if (obj instanceof EnumEncodedValue) {
            return getValue().equals(((EnumEncodedValue) obj).getValue());
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 27;
    }

    @Override // org.jf.dexlib2.iface.value.EnumEncodedValue
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.EnumEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : getValue().compareTo(((EnumEncodedValue) encodedValue).getValue());
    }
}
