package org.jf.dexlib2.iface.reference;

/* loaded from: classes3.dex */
public interface MethodHandleReference extends Reference, Comparable<MethodHandleReference> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(MethodHandleReference methodHandleReference);

    boolean equals(Object obj);

    Reference getMemberReference();

    int getMethodHandleType();

    int hashCode();
}
