package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseByteEncodedValue;
import org.jf.dexlib2.iface.value.ByteEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableByteEncodedValue extends BaseByteEncodedValue implements ImmutableEncodedValue {
    protected final byte value;

    public ImmutableByteEncodedValue(byte b10) {
        this.value = b10;
    }

    public static ImmutableByteEncodedValue of(ByteEncodedValue byteEncodedValue) {
        return byteEncodedValue instanceof ImmutableByteEncodedValue ? (ImmutableByteEncodedValue) byteEncodedValue : new ImmutableByteEncodedValue(byteEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.ByteEncodedValue
    public byte getValue() {
        return this.value;
    }
}
