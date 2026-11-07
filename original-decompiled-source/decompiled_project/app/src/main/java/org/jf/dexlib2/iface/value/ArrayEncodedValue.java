package org.jf.dexlib2.iface.value;

import java.util.List;

/* loaded from: classes3.dex */
public interface ArrayEncodedValue extends EncodedValue {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(EncodedValue encodedValue);

    boolean equals(Object obj);

    List<? extends EncodedValue> getValue();

    int hashCode();
}
