package org.jf.dexlib2.iface.reference;

/* loaded from: classes3.dex */
public interface FieldReference extends Reference, Comparable<FieldReference> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(FieldReference fieldReference);

    boolean equals(Object obj);

    String getDefiningClass();

    String getName();

    String getType();

    int hashCode();
}
