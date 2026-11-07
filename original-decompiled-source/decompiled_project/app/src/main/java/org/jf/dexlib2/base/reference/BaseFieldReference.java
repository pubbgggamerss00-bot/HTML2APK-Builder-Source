package org.jf.dexlib2.base.reference;

import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.reference.FieldReference;

/* loaded from: classes3.dex */
public abstract class BaseFieldReference extends BaseReference implements FieldReference {
    @Override // org.jf.dexlib2.iface.reference.FieldReference
    public boolean equals(Object obj) {
        if (obj instanceof FieldReference) {
            FieldReference fieldReference = (FieldReference) obj;
            if (getDefiningClass().equals(fieldReference.getDefiningClass()) && getName().equals(fieldReference.getName()) && getType().equals(fieldReference.getType())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference
    public int hashCode() {
        return getType().hashCode() + ((getName().hashCode() + (getDefiningClass().hashCode() * 31)) * 31);
    }

    public String toString() {
        return DexFormatter.INSTANCE.getFieldDescriptor(this);
    }

    @Override // org.jf.dexlib2.iface.reference.FieldReference, java.lang.Comparable
    public int compareTo(FieldReference fieldReference) {
        int iCompareTo = getDefiningClass().compareTo(fieldReference.getDefiningClass());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(fieldReference.getName());
        return iCompareTo2 != 0 ? iCompareTo2 : getType().compareTo(fieldReference.getType());
    }
}
