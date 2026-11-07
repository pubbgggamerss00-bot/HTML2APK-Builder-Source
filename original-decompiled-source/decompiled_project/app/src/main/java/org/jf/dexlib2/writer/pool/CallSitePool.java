package org.jf.dexlib2.writer.pool;

import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.writer.CallSiteSection;
import org.jf.dexlib2.writer.util.CallSiteUtil;

/* loaded from: classes3.dex */
public class CallSitePool extends BaseIndexPool<CallSiteReference> implements CallSiteSection<CallSiteReference, ArrayEncodedValue> {
    public CallSitePool(DexPool dexPool) {
        super(dexPool);
    }

    public void intern(CallSiteReference callSiteReference) {
        if (((Integer) this.internedItems.put(callSiteReference, 0)) == null) {
            ((EncodedArrayPool) this.dexPool.encodedArraySection).intern(getEncodedCallSite(callSiteReference));
        }
    }

    @Override // org.jf.dexlib2.writer.CallSiteSection
    public ArrayEncodedValue getEncodedCallSite(CallSiteReference callSiteReference) {
        return CallSiteUtil.getEncodedCallSite(callSiteReference);
    }
}
