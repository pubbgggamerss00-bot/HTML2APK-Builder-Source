package org.jf.dexlib2;

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
public final class ReferenceType {
    public static final int CALL_SITE = 5;
    public static final int FIELD = 2;
    public static final int METHOD = 3;
    public static final int METHOD_HANDLE = 6;
    public static final int METHOD_PROTO = 4;
    public static final int NONE = 7;
    public static final int STRING = 0;
    public static final int TYPE = 1;

    private ReferenceType() {
    }

    public static int getReferenceType(Reference reference) {
        if (reference instanceof StringReference) {
            return 0;
        }
        if (reference instanceof TypeReference) {
            return 1;
        }
        if (reference instanceof FieldReference) {
            return 2;
        }
        if (reference instanceof MethodReference) {
            return 3;
        }
        if (reference instanceof MethodProtoReference) {
            return 4;
        }
        if (reference instanceof CallSiteReference) {
            return 5;
        }
        if (reference instanceof MethodHandleReference) {
            return 6;
        }
        throw new IllegalStateException("Invalid reference");
    }

    public static void validateReferenceType(int i10) {
        if (i10 < 0 || i10 > 4) {
            throw new InvalidReferenceTypeException(i10);
        }
    }

    public static class InvalidReferenceTypeException extends ExceptionWithContext {
        private final int referenceType;

        public InvalidReferenceTypeException(int i10) {
            super("Invalid reference type: %d", Integer.valueOf(i10));
            this.referenceType = i10;
        }

        public int getReferenceType() {
            return this.referenceType;
        }

        public InvalidReferenceTypeException(int i10, String str, Object... objArr) {
            super(str, objArr);
            this.referenceType = i10;
        }
    }
}
