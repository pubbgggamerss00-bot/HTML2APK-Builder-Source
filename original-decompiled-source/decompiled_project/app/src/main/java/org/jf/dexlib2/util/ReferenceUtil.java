package org.jf.dexlib2.util;

import i8.n;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import org.jf.dexlib2.MethodHandleType;
import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.util.StringUtils;

@Deprecated
/* loaded from: classes3.dex */
public final class ReferenceUtil {
    private ReferenceUtil() {
    }

    public static String getCallSiteString(CallSiteReference callSiteReference) {
        StringWriter stringWriter = new StringWriter();
        try {
            writeCallSite(stringWriter, callSiteReference);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String getFieldDescriptor(FieldReference fieldReference) {
        return getFieldDescriptor(fieldReference, false);
    }

    public static String getMethodDescriptor(MethodReference methodReference) {
        return getMethodDescriptor(methodReference, false);
    }

    public static String getMethodHandleString(MethodHandleReference methodHandleReference) {
        StringWriter stringWriter = new StringWriter();
        try {
            writeMethodHandle(stringWriter, methodHandleReference);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String getMethodProtoDescriptor(MethodProtoReference methodProtoReference) {
        StringWriter stringWriter = new StringWriter();
        try {
            writeMethodProtoDescriptor(stringWriter, methodProtoReference);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String getReferenceString(Reference reference) {
        return getReferenceString(reference, null);
    }

    public static String getShortFieldDescriptor(FieldReference fieldReference) {
        return fieldReference.getName() + ':' + fieldReference.getType();
    }

    public static void writeCallSite(Writer writer, CallSiteReference callSiteReference) throws IOException {
        writer.write(callSiteReference.getName());
        writer.write(40);
        writer.write(34);
        StringUtils.writeEscapedString(writer, callSiteReference.getMethodName());
        writer.write(34);
        writer.write(", ");
        writeMethodProtoDescriptor(writer, callSiteReference.getMethodProto());
        for (EncodedValue encodedValue : callSiteReference.getExtraArguments()) {
            writer.write(", ");
            EncodedValueUtils.writeEncodedValue(writer, encodedValue);
        }
        writer.write(")@");
        if (callSiteReference.getMethodHandle().getMethodHandleType() != 4) {
            throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
        }
        writeMethodDescriptor(writer, (MethodReference) callSiteReference.getMethodHandle().getMemberReference());
    }

    public static void writeFieldDescriptor(Writer writer, FieldReference fieldReference) throws IOException {
        writeFieldDescriptor(writer, fieldReference, false);
    }

    public static void writeMethodDescriptor(Writer writer, MethodReference methodReference) throws IOException {
        writeMethodDescriptor(writer, methodReference, false);
    }

    public static void writeMethodHandle(Writer writer, MethodHandleReference methodHandleReference) throws IOException {
        writer.write(MethodHandleType.toString(methodHandleReference.getMethodHandleType()));
        writer.write(64);
        Reference memberReference = methodHandleReference.getMemberReference();
        if (memberReference instanceof MethodReference) {
            writeMethodDescriptor(writer, (MethodReference) memberReference);
        } else {
            writeFieldDescriptor(writer, (FieldReference) memberReference);
        }
    }

    public static void writeMethodProtoDescriptor(Writer writer, MethodProtoReference methodProtoReference) throws IOException {
        writer.write(40);
        Iterator<? extends CharSequence> it = methodProtoReference.getParameterTypes().iterator();
        while (it.hasNext()) {
            writer.write(it.next().toString());
        }
        writer.write(41);
        writer.write(methodProtoReference.getReturnType());
    }

    public static String getFieldDescriptor(FieldReference fieldReference, boolean z10) {
        StringBuilder sb = new StringBuilder();
        if (!z10) {
            sb.append(fieldReference.getDefiningClass());
            sb.append("->");
        }
        sb.append(fieldReference.getName());
        sb.append(':');
        sb.append(fieldReference.getType());
        return sb.toString();
    }

    public static String getMethodDescriptor(MethodReference methodReference, boolean z10) {
        StringBuilder sb = new StringBuilder();
        if (!z10) {
            sb.append(methodReference.getDefiningClass());
            sb.append("->");
        }
        sb.append(methodReference.getName());
        sb.append('(');
        Iterator<? extends CharSequence> it = methodReference.getParameterTypes().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        sb.append(')');
        sb.append(methodReference.getReturnType());
        return sb.toString();
    }

    public static String getReferenceString(Reference reference, String str) {
        if (reference instanceof StringReference) {
            return n.d("\"", StringUtils.escapeString(((StringReference) reference).getString()), "\"");
        }
        if (reference instanceof TypeReference) {
            return ((TypeReference) reference).getType();
        }
        if (reference instanceof FieldReference) {
            FieldReference fieldReference = (FieldReference) reference;
            return getFieldDescriptor(fieldReference, fieldReference.getDefiningClass().equals(str));
        }
        if (reference instanceof MethodReference) {
            MethodReference methodReference = (MethodReference) reference;
            return getMethodDescriptor(methodReference, methodReference.getDefiningClass().equals(str));
        }
        if (reference instanceof MethodProtoReference) {
            return getMethodProtoDescriptor((MethodProtoReference) reference);
        }
        if (reference instanceof MethodHandleReference) {
            return getMethodHandleString((MethodHandleReference) reference);
        }
        if (reference instanceof CallSiteReference) {
            return getCallSiteString((CallSiteReference) reference);
        }
        return null;
    }

    public static void writeFieldDescriptor(Writer writer, FieldReference fieldReference, boolean z10) throws IOException {
        if (!z10) {
            writer.write(fieldReference.getDefiningClass());
            writer.write("->");
        }
        writer.write(fieldReference.getName());
        writer.write(58);
        writer.write(fieldReference.getType());
    }

    public static void writeMethodDescriptor(Writer writer, MethodReference methodReference, boolean z10) throws IOException {
        if (!z10) {
            writer.write(methodReference.getDefiningClass());
            writer.write("->");
        }
        writer.write(methodReference.getName());
        writer.write(40);
        Iterator<? extends CharSequence> it = methodReference.getParameterTypes().iterator();
        while (it.hasNext()) {
            writer.write(it.next().toString());
        }
        writer.write(41);
        writer.write(methodReference.getReturnType());
    }
}
