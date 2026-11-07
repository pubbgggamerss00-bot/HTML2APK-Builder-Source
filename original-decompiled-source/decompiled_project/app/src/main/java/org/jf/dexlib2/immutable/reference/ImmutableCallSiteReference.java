package org.jf.dexlib2.immutable.reference;

import java.util.List;
import nc.r;
import org.jf.dexlib2.base.reference.BaseCallSiteReference;
import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableEncodedValueFactory;
import org.jf.util.ImmutableUtils;

/* loaded from: classes3.dex */
public class ImmutableCallSiteReference extends BaseCallSiteReference implements ImmutableReference {
    protected final r<? extends ImmutableEncodedValue> extraArguments;
    protected final ImmutableMethodHandleReference methodHandle;
    protected final String methodName;
    protected final ImmutableMethodProtoReference methodProto;
    protected final String name;

    public ImmutableCallSiteReference(String str, MethodHandleReference methodHandleReference, String str2, MethodProtoReference methodProtoReference, Iterable<? extends EncodedValue> iterable) {
        this.name = str;
        this.methodHandle = ImmutableMethodHandleReference.of(methodHandleReference);
        this.methodName = str2;
        this.methodProto = ImmutableMethodProtoReference.of(methodProtoReference);
        this.extraArguments = ImmutableEncodedValueFactory.immutableListOf(iterable);
    }

    public static ImmutableCallSiteReference of(CallSiteReference callSiteReference) {
        return callSiteReference instanceof ImmutableCallSiteReference ? (ImmutableCallSiteReference) callSiteReference : new ImmutableCallSiteReference(callSiteReference.getName(), ImmutableMethodHandleReference.of(callSiteReference.getMethodHandle()), callSiteReference.getMethodName(), ImmutableMethodProtoReference.of(callSiteReference.getMethodProto()), (r<? extends ImmutableEncodedValue>) ImmutableEncodedValueFactory.immutableListOf(callSiteReference.getExtraArguments()));
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public List<? extends EncodedValue> getExtraArguments() {
        return this.extraArguments;
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public MethodHandleReference getMethodHandle() {
        return this.methodHandle;
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public String getMethodName() {
        return this.methodName;
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public MethodProtoReference getMethodProto() {
        return this.methodProto;
    }

    @Override // org.jf.dexlib2.iface.reference.CallSiteReference
    public String getName() {
        return this.name;
    }

    public ImmutableCallSiteReference(String str, ImmutableMethodHandleReference immutableMethodHandleReference, String str2, ImmutableMethodProtoReference immutableMethodProtoReference, r<? extends ImmutableEncodedValue> rVar) {
        this.name = str;
        this.methodHandle = immutableMethodHandleReference;
        this.methodName = str2;
        this.methodProto = immutableMethodProtoReference;
        this.extraArguments = ImmutableUtils.nullToEmptyList(rVar);
    }
}
