package org.jf.dexlib2.iface.reference;

import java.util.List;

/* loaded from: classes3.dex */
public interface MethodReference extends Reference, Comparable<MethodReference> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(MethodReference methodReference);

    boolean equals(Object obj);

    String getDefiningClass();

    String getName();

    List<? extends CharSequence> getParameterTypes();

    String getReturnType();

    int hashCode();
}
