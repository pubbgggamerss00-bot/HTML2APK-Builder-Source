package org.jf.dexlib2.writer.util;

import java.util.ArrayList;
import java.util.List;
import org.jf.dexlib2.base.value.BaseArrayEncodedValue;
import org.jf.dexlib2.base.value.BaseMethodHandleEncodedValue;
import org.jf.dexlib2.base.value.BaseMethodTypeEncodedValue;
import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableStringEncodedValue;

/* loaded from: classes3.dex */
public class CallSiteUtil {
    public static ArrayEncodedValue getEncodedCallSite(final CallSiteReference callSiteReference) {
        return new BaseArrayEncodedValue() { // from class: org.jf.dexlib2.writer.util.CallSiteUtil.1
            @Override // org.jf.dexlib2.iface.value.ArrayEncodedValue
            public List<? extends EncodedValue> getValue() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new BaseMethodHandleEncodedValue() { // from class: org.jf.dexlib2.writer.util.CallSiteUtil.1.1
                    @Override // org.jf.dexlib2.iface.value.MethodHandleEncodedValue
                    public MethodHandleReference getValue() {
                        return callSiteReference.getMethodHandle();
                    }
                });
                arrayList.add(new ImmutableStringEncodedValue(callSiteReference.getMethodName()));
                arrayList.add(new BaseMethodTypeEncodedValue() { // from class: org.jf.dexlib2.writer.util.CallSiteUtil.1.2
                    @Override // org.jf.dexlib2.iface.value.MethodTypeEncodedValue
                    public MethodProtoReference getValue() {
                        return callSiteReference.getMethodProto();
                    }
                });
                arrayList.addAll(callSiteReference.getExtraArguments());
                return arrayList;
            }
        };
    }
}
