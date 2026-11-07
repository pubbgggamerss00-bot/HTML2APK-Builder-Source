package org.jf.dexlib2.iface.value;

import org.jf.dexlib2.iface.reference.FieldReference;

/* loaded from: classes3.dex */
public interface EnumEncodedValue extends EncodedValue {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(EncodedValue encodedValue);

    boolean equals(Object obj);

    FieldReference getValue();

    int hashCode();
}
