package org.jf.dexlib2.base;

import java.util.Comparator;
import org.jf.dexlib2.iface.AnnotationElement;

/* loaded from: classes3.dex */
public abstract class BaseAnnotationElement implements AnnotationElement {
    public static final Comparator<AnnotationElement> BY_NAME = new Comparator<AnnotationElement>() { // from class: org.jf.dexlib2.base.BaseAnnotationElement.1
        @Override // java.util.Comparator
        public int compare(AnnotationElement annotationElement, AnnotationElement annotationElement2) {
            return annotationElement.getName().compareTo(annotationElement2.getName());
        }
    };

    @Override // org.jf.dexlib2.iface.AnnotationElement
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnnotationElement)) {
            AnnotationElement annotationElement = (AnnotationElement) obj;
            if (getName().equals(annotationElement.getName()) && getValue().equals(annotationElement.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.AnnotationElement
    public int hashCode() {
        return getValue().hashCode() + (getName().hashCode() * 31);
    }

    @Override // org.jf.dexlib2.iface.AnnotationElement, java.lang.Comparable
    public int compareTo(AnnotationElement annotationElement) {
        int iCompareTo = getName().compareTo(annotationElement.getName());
        return iCompareTo != 0 ? iCompareTo : getValue().compareTo(annotationElement.getValue());
    }
}
