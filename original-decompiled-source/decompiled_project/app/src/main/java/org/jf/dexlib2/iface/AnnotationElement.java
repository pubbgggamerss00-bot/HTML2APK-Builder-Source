package org.jf.dexlib2.iface;

import org.jf.dexlib2.iface.value.EncodedValue;

/* loaded from: classes3.dex */
public interface AnnotationElement extends Comparable<AnnotationElement> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(AnnotationElement annotationElement);

    boolean equals(Object obj);

    String getName();

    EncodedValue getValue();

    int hashCode();
}
