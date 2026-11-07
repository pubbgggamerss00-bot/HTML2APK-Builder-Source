package org.jf.dexlib2.iface.reference;

/* loaded from: classes3.dex */
public interface TypeReference extends Reference, CharSequence, Comparable<CharSequence> {
    @Override // java.lang.Comparable
    int compareTo(CharSequence charSequence);

    boolean equals(Object obj);

    String getType();

    int hashCode();
}
