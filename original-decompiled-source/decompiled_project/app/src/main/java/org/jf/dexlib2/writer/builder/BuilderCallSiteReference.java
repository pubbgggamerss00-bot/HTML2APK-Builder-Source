package org.jf.dexlib2.writer.builder;

import java.util.List;
import nc.r;
import nc.u0;
import org.jf.dexlib2.base.reference.BaseCallSiteReference;
import org.jf.dexlib2.iface.value.StringEncodedValue;
import org.jf.dexlib2.writer.builder.BuilderEncodedValues;

/* loaded from: classes3.dex */
public class BuilderCallSiteReference extends BaseCallSiteReference implements BuilderReference {
    final BuilderEncodedValues.BuilderArrayEncodedValue encodedCallSite;
    int index = -1;
    final String name;

    public BuilderCallSiteReference(String str, BuilderEncodedValues.BuilderArrayEncodedValue builderArrayEncodedValue) {
        this.name = str;
        this.encodedCallSite = builderArrayEncodedValue;
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public List<? extends BuilderEncodedValues.BuilderEncodedValue> getExtraArguments() {
        if (this.encodedCallSite.elements.size() <= 3) {
            r.a aVar = r.f18735b;
            return u0.f18756e;
        }
        List<? extends BuilderEncodedValues.BuilderEncodedValue> list = this.encodedCallSite.elements;
        return list.subList(3, list.size());
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public int getIndex() {
        return this.index;
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public String getMethodName() {
        return ((StringEncodedValue) this.encodedCallSite.elements.get(1)).getValue();
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public String getName() {
        return this.name;
    }

    @Override // org.jf.dexlib2.writer.builder.BuilderReference
    public void setIndex(int i10) {
        this.index = i10;
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public BuilderMethodHandleReference getMethodHandle() {
        return ((BuilderEncodedValues.BuilderMethodHandleEncodedValue) this.encodedCallSite.elements.get(0)).getValue();
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public BuilderMethodProtoReference getMethodProto() {
        return ((BuilderEncodedValues.BuilderMethodTypeEncodedValue) this.encodedCallSite.elements.get(2)).getValue();
    }
}
