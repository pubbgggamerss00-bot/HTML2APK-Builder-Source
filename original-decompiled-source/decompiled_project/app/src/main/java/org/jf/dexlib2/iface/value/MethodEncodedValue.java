package org.jf.dexlib2.iface.value;

import org.jf.dexlib2.iface.reference.MethodReference;

/* loaded from: classes3.dex */
public interface MethodEncodedValue extends EncodedValue {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(EncodedValue encodedValue);

    boolean equals(Object obj);

    MethodReference getValue();

    int hashCode();
}
