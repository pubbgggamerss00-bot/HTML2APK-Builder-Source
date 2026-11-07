package org.jf.dexlib2.base.value;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.value.AnnotationEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.util.CollectionUtils;

/* loaded from: classes3.dex */
public abstract class BaseAnnotationEncodedValue implements AnnotationEncodedValue {
    @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue
    public boolean equals(Object obj) {
        if (obj instanceof AnnotationEncodedValue) {
            AnnotationEncodedValue annotationEncodedValue = (AnnotationEncodedValue) obj;
            if (getType().equals(annotationEncodedValue.getType()) && getElements().equals(annotationEncodedValue.getElements())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.value.EncodedValue
    public int getValueType() {
        return 29;
    }

    @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue
    public int hashCode() {
        return getElements().hashCode() + (getType().hashCode() * 31);
    }

    public String toString() {
        return DexFormatter.INSTANCE.getEncodedValue(this);
    }

    @Override // org.jf.dexlib2.iface.value.AnnotationEncodedValue, java.lang.Comparable
    public int compareTo(EncodedValue encodedValue) {
        int iC = u2.c(getValueType(), encodedValue.getValueType());
        if (iC != 0) {
            return iC;
        }
        AnnotationEncodedValue annotationEncodedValue = (AnnotationEncodedValue) encodedValue;
        int iCompareTo = getType().compareTo(annotationEncodedValue.getType());
        return iCompareTo != 0 ? iCompareTo : CollectionUtils.compareAsSet(getElements(), annotationEncodedValue.getElements());
    }
}
