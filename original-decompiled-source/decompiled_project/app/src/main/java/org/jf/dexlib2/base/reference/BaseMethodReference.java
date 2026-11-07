package org.jf.dexlib2.base.reference;

import nc.f1;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.util.CharSequenceUtils;
import org.jf.util.CollectionUtils;

/* loaded from: classes3.dex */
public abstract class BaseMethodReference extends BaseReference implements MethodReference {
    @Override // org.jf.dexlib2.iface.reference.MethodReference
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof MethodReference)) {
            MethodReference methodReference = (MethodReference) obj;
            if (getDefiningClass().equals(methodReference.getDefiningClass()) && getName().equals(methodReference.getName()) && getReturnType().equals(methodReference.getReturnType()) && CharSequenceUtils.listEquals(getParameterTypes(), methodReference.getParameterTypes())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference
    public int hashCode() {
        return getParameterTypes().hashCode() + ((getReturnType().hashCode() + ((getName().hashCode() + (getDefiningClass().hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return DexFormatter.INSTANCE.getMethodDescriptor(this);
    }

    @Override // org.jf.dexlib2.iface.reference.MethodReference, java.lang.Comparable
    public int compareTo(MethodReference methodReference) {
        int iCompareTo = getDefiningClass().compareTo(methodReference.getDefiningClass());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(methodReference.getName());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = getReturnType().compareTo(methodReference.getReturnType());
        return iCompareTo3 != 0 ? iCompareTo3 : CollectionUtils.compareAsIterable(f1.f18680a, getParameterTypes(), methodReference.getParameterTypes());
    }
}
