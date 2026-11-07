package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.NullEncodedValue;

/* loaded from: classes3.dex */
public abstract class BaseNullEncodedValue implements NullEncodedValue {
    @Override // org.jf.dexlib2.iface.value.NullEncodedValue
    public boolean equals(Object obj) {
        return obj instanceof NullEncodedValue;
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 30;
    }

    @Override // org.jf.dexlib2.iface.value.NullEncodedValue
    public int hashCode() {
        return 0;
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.NullEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        return u2.c(getValueType(), encodedValue.getValueType());
    }
}
