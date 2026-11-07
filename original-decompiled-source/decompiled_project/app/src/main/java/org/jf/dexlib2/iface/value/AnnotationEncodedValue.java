package org.jf.dexlib2.iface.value;

import java.util.Set;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.BasicAnnotation;

/* loaded from: classes3.dex */
public interface AnnotationEncodedValue extends EncodedValue, BasicAnnotation {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    int compareTo(EncodedValue encodedValue);

    boolean equals(Object obj);

    Set<? extends AnnotationElement> getElements();

    String getType();

    int hashCode();
}
