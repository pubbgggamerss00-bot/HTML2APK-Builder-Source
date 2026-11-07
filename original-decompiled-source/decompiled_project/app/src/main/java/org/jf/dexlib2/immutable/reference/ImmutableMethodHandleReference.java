package org.jf.dexlib2.immutable.reference;

import org.jf.dexlib2.base.reference.BaseMethodHandleReference;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class ImmutableMethodHandleReference extends BaseMethodHandleReference implements ImmutableReference {
    protected final ImmutableReference memberReference;
    protected final int methodHandleType;

    public ImmutableMethodHandleReference(int i10, ImmutableReference immutableReference) {
        this.methodHandleType = i10;
        this.memberReference = immutableReference;
    }

    public static ImmutableMethodHandleReference of(MethodHandleReference methodHandleReference) {
        ImmutableReference immutableReferenceOf;
        if (methodHandleReference instanceof ImmutableMethodHandleReference) {
            return (ImmutableMethodHandleReference) methodHandleReference;
        }
        int methodHandleType = methodHandleReference.getMethodHandleType();
        switch (methodHandleType) {
            case 0:
            case 1:
            case 2:
            case 3:
                immutableReferenceOf = ImmutableFieldReference.of((FieldReference) methodHandleReference.getMemberReference());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                immutableReferenceOf = ImmutableMethodReference.of((MethodReference) methodHandleReference.getMemberReference());
                break;
            default:
                throw new ExceptionWithContext("Invalid method handle type: %d", Integer.valueOf(methodHandleType));
        }
        return new ImmutableMethodHandleReference(methodHandleType, immutableReferenceOf);
    }

    @Override // org.jf.dexlib2.iface.reference.MethodHandleReference
    public Reference getMemberReference() {
        return this.memberReference;
    }

    @Override // org.jf.dexlib2.iface.reference.MethodHandleReference
    public int getMethodHandleType() {
        return this.methodHandleType;
    }

    public ImmutableMethodHandleReference(int i10, Reference reference) {
        this.methodHandleType = i10;
        this.memberReference = ImmutableReferenceFactory.of(reference);
    }
}
