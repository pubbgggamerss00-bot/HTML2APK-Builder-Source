package org.jf.dexlib2.iface.value;

/* loaded from: classes3.dex */
public interface NullEncodedValue extends EncodedValue {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(EncodedValue encodedValue);

    boolean equals(Object obj);

    int hashCode();
}
