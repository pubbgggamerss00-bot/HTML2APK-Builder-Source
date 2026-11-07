package org.jf.dexlib2.immutable.value;

import org.jf.dexlib2.base.value.BaseTypeEncodedValue;
import org.jf.dexlib2.iface.value.TypeEncodedValue;

/* loaded from: classes3.dex */
public class ImmutableTypeEncodedValue extends BaseTypeEncodedValue implements ImmutableEncodedValue {
    protected final String value;

    public ImmutableTypeEncodedValue(String str) {
        this.value = str;
    }

    public static ImmutableTypeEncodedValue of(TypeEncodedValue typeEncodedValue) {
        return typeEncodedValue instanceof ImmutableTypeEncodedValue ? (ImmutableTypeEncodedValue) typeEncodedValue : new ImmutableTypeEncodedValue(typeEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.TypeEncodedValue
    public String getValue() {
        return this.value;
    }
}
