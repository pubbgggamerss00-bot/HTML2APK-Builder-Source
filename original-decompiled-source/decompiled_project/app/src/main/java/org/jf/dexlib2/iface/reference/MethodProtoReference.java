package org.jf.dexlib2.iface.reference;

import java.util.List;

/* loaded from: classes3.dex */
public interface MethodProtoReference extends Reference, Comparable<MethodProtoReference> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(MethodProtoReference methodProtoReference);

    boolean equals(Object obj);

    List<? extends CharSequence> getParameterTypes();

    String getReturnType();

    int hashCode();
}
