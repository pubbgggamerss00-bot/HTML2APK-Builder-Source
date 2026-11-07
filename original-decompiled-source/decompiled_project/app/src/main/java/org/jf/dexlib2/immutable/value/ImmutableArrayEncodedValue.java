package org.jf.dexlib2.immutable.value;

import java.util.Collection;
import nc.r;
import org.jf.dexlib2.base.value.BaseArrayEncodedValue;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public class ImmutableArrayEncodedValue extends BaseArrayEncodedValue implements ImmutableEncodedValue {
    protected final r<? extends ImmutableEncodedValue> value;

    public ImmutableArrayEncodedValue(Collection<? extends EncodedValue> collection) {
        this.value = ImmutableEncodedValueFactory.immutableListOf(collection);
    }

    public static ImmutableArrayEncodedValue of(ArrayEncodedValue arrayEncodedValue) {
        return arrayEncodedValue instanceof ImmutableArrayEncodedValue ? (ImmutableArrayEncodedValue) arrayEncodedValue : new ImmutableArrayEncodedValue(arrayEncodedValue.getValue());
    }

    @Override // org.jf.dexlib2.iface.value.ArrayEncodedValue
    public r<? extends ImmutableEncodedValue> getValue() {
        return this.value;
    }

    public ImmutableArrayEncodedValue(r<ImmutableEncodedValue> rVar) {
        this.value = rVar;
    }
}
