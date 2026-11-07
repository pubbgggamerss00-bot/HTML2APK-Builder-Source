package org.jf.dexlib2.base.reference;

import i0.u2;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;

/* loaded from: classes3.dex */
public abstract class BaseMethodHandleReference extends BaseReference implements MethodHandleReference {
    @Override // org.jf.dexlib2.iface.reference.MethodHandleReference
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof MethodHandleReference)) {
            MethodHandleReference methodHandleReference = (MethodHandleReference) obj;
            if (getMethodHandleType() == methodHandleReference.getMethodHandleType() && getMemberReference().equals(methodHandleReference.getMemberReference())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodHandleReference
    public int hashCode() {
        return getMemberReference().hashCode() + (getMethodHandleType() * 31);
    }

    public String toString() {
        return DexFormatter.INSTANCE.getMethodHandle(this);
    }

    @Override // org.jf.dexlib2.iface.reference.MethodHandleReference, java.lang.Comparable
    public int compareTo(MethodHandleReference methodHandleReference) {
        int iC = u2.c(getMethodHandleType(), methodHandleReference.getMethodHandleType());
        if (iC != 0) {
            return iC;
        }
        Reference memberReference = getMemberReference();
        if (memberReference instanceof FieldReference) {
            if (methodHandleReference.getMemberReference() instanceof FieldReference) {
                return ((FieldReference) memberReference).compareTo((FieldReference) methodHandleReference.getMemberReference());
            }
            return -1;
        }
        if (methodHandleReference.getMemberReference() instanceof MethodReference) {
            return ((MethodReference) memberReference).compareTo((MethodReference) methodHandleReference.getMemberReference());
        }
        return 1;
    }
}
