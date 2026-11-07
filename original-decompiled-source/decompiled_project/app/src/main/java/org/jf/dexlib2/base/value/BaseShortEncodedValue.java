package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.ShortEncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseShortEncodedValue implements ShortEncodedValue {
    @Override // org.jf.dexlib2.iface.value.ShortEncodedValue
    public boolean equals(Object obj) {
        return (obj instanceof ShortEncodedValue) && getValue() == ((ShortEncodedValue) obj).getValue();
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 2;
    }

    @Override // org.jf.dexlib2.iface.value.ShortEncodedValue
    public int hashCode() {
        return getValue();
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.ShortEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        return iC != 0 ? iC : getValue() - ((ShortEncodedValue) encodedValue).getValue();
    }
}
