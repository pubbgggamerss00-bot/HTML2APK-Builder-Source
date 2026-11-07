package org.jf.dexlib2.iface.value;

import org.jf.dexlib2.iface.reference.MethodHandleReference;

/* loaded from: classes3.dex */
public interface MethodHandleEncodedValue extends EncodedValue {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(EncodedValue encodedValue);

    boolean equals(Object obj);

    MethodHandleReference getValue();

    int hashCode();
}
