package org.jf.dexlib2.iface.value;

import org.jf.dexlib2.iface.reference.MethodProtoReference;

/* loaded from: classes3.dex */
public interface MethodTypeEncodedValue extends EncodedValue {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(EncodedValue encodedValue);

    boolean equals(Object obj);

    MethodProtoReference getValue();

    int hashCode();
}
