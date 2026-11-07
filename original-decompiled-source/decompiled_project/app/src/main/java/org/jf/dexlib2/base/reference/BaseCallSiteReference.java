package org.jf.dexlib2.base.reference;

import org.jf.dexlib2.formatter.DexFormatter;
import org.jf.dexlib2.iface.reference.CallSiteReference;

/* loaded from: classes3.dex */
public abstract class BaseCallSiteReference extends BaseReference implements CallSiteReference {
    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof CallSiteReference)) {
            CallSiteReference callSiteReference = (CallSiteReference) obj;
            if (getMethodHandle().equals(callSiteReference.getMethodHandle()) && getMethodName().equals(callSiteReference.getMethodName()) && getMethodProto().equals(callSiteReference.getMethodProto()) && getExtraArguments().equals(callSiteReference.getExtraArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public int hashCode() {
        return getExtraArguments().hashCode() + ((getMethodProto().hashCode() + ((getMethodName().hashCode() + ((getMethodHandle().hashCode() + (getName().hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return DexFormatter.INSTANCE.getCallSite(this);
    }
}
