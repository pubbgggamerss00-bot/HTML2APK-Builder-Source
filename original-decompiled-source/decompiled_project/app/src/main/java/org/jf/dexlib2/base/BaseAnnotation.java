package org.jf.dexlib2.base;

import i0.u2;
import java.util.Comparator;
import org.jf.dexlib2.iface.Annotation;
import org.jf.util.CollectionUtils;

/* loaded from: classes3.dex */
public abstract class BaseAnnotation implements Annotation {
    public static final Comparator<? super Annotation> BY_TYPE = new Comparator<Annotation>() { // from class: org.jf.dexlib2.base.BaseAnnotation.1
        @Override // java.util.Comparator
        public int compare(Annotation annotation, Annotation annotation2) {
            return annotation.getType().compareTo(annotation2.getType());
        }
    };

    @Override // org.jf.dexlib2.iface.Annotation
    public boolean equals(Object obj) {
        if (obj instanceof Annotation) {
            Annotation annotation = (Annotation) obj;
            if (getVisibility() == annotation.getVisibility() && getType().equals(annotation.getType()) && getElements().equals(annotation.getElements())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.Annotation
    public int hashCode() {
        return getElements().hashCode() + ((getType().hashCode() + (getVisibility() * 31)) * 31);
    }

    @Override // org.jf.dexlib2.iface.Annotation, java.lang.Comparable
    public int compareTo(Annotation annotation) {
        int iC = u2.c(getVisibility(), annotation.getVisibility());
        if (iC != 0) {
            return iC;
        }
        int iCompareTo = getType().compareTo(annotation.getType());
        return iCompareTo != 0 ? iCompareTo : CollectionUtils.compareAsSet(getElements(), annotation.getElements());
    }
}
