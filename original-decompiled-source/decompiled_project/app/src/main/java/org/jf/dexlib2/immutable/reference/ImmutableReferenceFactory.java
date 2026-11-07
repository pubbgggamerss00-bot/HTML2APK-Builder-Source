package org.jf.dexlib2.immutable.reference;

import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class ImmutableReferenceFactory {
    public static ImmutableReference of(Reference reference) {
        if (reference instanceof StringReference) {
            return ImmutableStringReference.of((StringReference) reference);
        }
        if (reference instanceof TypeReference) {
            return ImmutableTypeReference.of((TypeReference) reference);
        }
        if (reference instanceof FieldReference) {
            return ImmutableFieldReference.of((FieldReference) reference);
        }
        if (reference instanceof MethodReference) {
            return ImmutableMethodReference.of((MethodReference) reference);
        }
        if (reference instanceof MethodProtoReference) {
            return ImmutableMethodProtoReference.of((MethodProtoReference) reference);
        }
        if (reference instanceof CallSiteReference) {
            return ImmutableCallSiteReference.of((CallSiteReference) reference);
        }
        if (reference instanceof MethodHandleReference) {
            return ImmutableMethodHandleReference.of((MethodHandleReference) reference);
        }
        throw new ExceptionWithContext("Invalid reference type", new Object[0]);
    }

    public static ImmutableReference of(int i10, Reference reference) {
        switch (i10) {
            case 0:
                return ImmutableStringReference.of((StringReference) reference);
            case 1:
                return ImmutableTypeReference.of((TypeReference) reference);
            case 2:
                return ImmutableFieldReference.of((FieldReference) reference);
            case 3:
                return ImmutableMethodReference.of((MethodReference) reference);
            case 4:
                return ImmutableMethodProtoReference.of((MethodProtoReference) reference);
            case 5:
                return ImmutableCallSiteReference.of((CallSiteReference) reference);
            case 6:
                return ImmutableMethodHandleReference.of((MethodHandleReference) reference);
            default:
                throw new ExceptionWithContext("Invalid reference type: %d", Integer.valueOf(i10));
        }
    }
}
