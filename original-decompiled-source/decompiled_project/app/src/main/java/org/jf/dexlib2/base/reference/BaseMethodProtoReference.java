package org.jf.dexlib2.base.reference;

import nc.f1;
import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.util.CharSequenceUtils;
import org.jf.util.CollectionUtils;

/* loaded from: classes3.dex */
public abstract class BaseMethodProtoReference extends BaseReference implements MethodProtoReference {
    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference
    public boolean equals(Object obj) {
        if (obj instanceof MethodProtoReference) {
            MethodProtoReference methodProtoReference = (MethodProtoReference) obj;
            if (getReturnType().equals(methodProtoReference.getReturnType()) && CharSequenceUtils.listEquals(getParameterTypes(), methodProtoReference.getParameterTypes())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference
    public int hashCode() {
        return getParameterTypes().hashCode() + (getReturnType().hashCode() * 31);
    }

    public String toString() {
        return DexFormatter.INSTANCE.getMethodProtoDescriptor(this);
    }

    @Override // org.jf.dexlib2.iface.reference.MethodProtoReference, java.lang.Comparable
    public int compareTo(MethodProtoReference methodProtoReference) {
        int iCompareTo = getReturnType().compareTo(methodProtoReference.getReturnType());
        return iCompareTo != 0 ? iCompareTo : CollectionUtils.compareAsIterable(f1.f18680a, getParameterTypes(), methodProtoReference.getParameterTypes());
    }
}
