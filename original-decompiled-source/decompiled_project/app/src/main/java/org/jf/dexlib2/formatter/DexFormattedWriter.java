package org.jf.dexlib2.formatter;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import org.jf.dexlib2.MethodHandleType;
import org.jf.dexlib2.iface.AnnotationElement;
import org.jf.dexlib2.iface.reference.CallSiteReference;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodHandleReference;
import org.jf.dexlib2.iface.reference.MethodProtoReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;
import org.jf.dexlib2.iface.value.AnnotationEncodedValue;
import org.jf.dexlib2.iface.value.ArrayEncodedValue;
import org.jf.dexlib2.iface.value.BooleanEncodedValue;
import org.jf.dexlib2.iface.value.ByteEncodedValue;
import org.jf.dexlib2.iface.value.CharEncodedValue;
import org.jf.dexlib2.iface.value.DoubleEncodedValue;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.iface.value.EnumEncodedValue;
import org.jf.dexlib2.iface.value.FieldEncodedValue;
import org.jf.dexlib2.iface.value.FloatEncodedValue;
import org.jf.dexlib2.iface.value.IntEncodedValue;
import org.jf.dexlib2.iface.value.LongEncodedValue;
import org.jf.dexlib2.iface.value.MethodEncodedValue;
import org.jf.dexlib2.iface.value.MethodHandleEncodedValue;
import org.jf.dexlib2.iface.value.MethodTypeEncodedValue;
import org.jf.dexlib2.iface.value.ShortEncodedValue;
import org.jf.dexlib2.iface.value.StringEncodedValue;
import org.jf.dexlib2.iface.value.TypeEncodedValue;

/* loaded from: classes3.dex */
public class DexFormattedWriter extends Writer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final Writer writer;

    public DexFormattedWriter(Writer writer) {
        this.writer = writer;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.writer.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.writer.flush();
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        this.writer.write(i10);
    }

    public void writeAnnotation(AnnotationEncodedValue annotationEncodedValue) throws IOException {
        this.writer.write("Annotation[");
        writeType(annotationEncodedValue.getType());
        for (AnnotationElement annotationElement : annotationEncodedValue.getElements()) {
            this.writer.write(", ");
            writeSimpleName(annotationElement.getName());
            this.writer.write(61);
            writeEncodedValue(annotationElement.getValue());
        }
        this.writer.write(93);
    }

    public void writeArray(ArrayEncodedValue arrayEncodedValue) throws IOException {
        this.writer.write("Array[");
        boolean z10 = true;
        for (EncodedValue encodedValue : arrayEncodedValue.getValue()) {
            if (z10) {
                z10 = false;
            } else {
                this.writer.write(", ");
            }
            writeEncodedValue(encodedValue);
        }
        this.writer.write(93);
    }

    public void writeCallSite(CallSiteReference callSiteReference) throws IOException {
        writeSimpleName(callSiteReference.getName());
        this.writer.write(40);
        writeQuotedString(callSiteReference.getMethodName());
        this.writer.write(", ");
        writeMethodProtoDescriptor(callSiteReference.getMethodProto());
        for (EncodedValue encodedValue : callSiteReference.getExtraArguments()) {
            this.writer.write(", ");
            writeEncodedValue(encodedValue);
        }
        this.writer.write(")@");
        if (callSiteReference.getMethodHandle().getMethodHandleType() != 4) {
            throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
        }
        writeMethodDescriptor((MethodReference) callSiteReference.getMethodHandle().getMemberReference());
    }

    public void writeClass(CharSequence charSequence) throws IOException {
        this.writer.write(charSequence.charAt(0));
        int i10 = 1;
        int i11 = 1;
        while (true) {
            if (i10 >= charSequence.length()) {
                break;
            }
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '/') {
                if (i10 == i11) {
                    throw new IllegalArgumentException(String.format("Invalid type string: %s", charSequence));
                }
                writeSimpleName(charSequence.subSequence(i11, i10));
                this.writer.write(charSequence.charAt(i10));
                i11 = i10 + 1;
            } else if (cCharAt == ';') {
                if (i10 == i11) {
                    throw new IllegalArgumentException(String.format("Invalid type string: %s", charSequence));
                }
                writeSimpleName(charSequence.subSequence(i11, i10));
                this.writer.write(charSequence.charAt(i10));
            }
            i10++;
        }
        if (i10 != charSequence.length() - 1 || charSequence.charAt(i10) != ';') {
            throw new IllegalArgumentException(String.format("Invalid type string: %s", charSequence));
        }
    }

    public void writeEncodedValue(EncodedValue encodedValue) throws IOException {
        int valueType = encodedValue.getValueType();
        if (valueType == 0) {
            this.writer.write(String.format("0x%x", Byte.valueOf(((ByteEncodedValue) encodedValue).getValue())));
            return;
        }
        if (valueType == 6) {
            this.writer.write(String.format("0x%x", Long.valueOf(((LongEncodedValue) encodedValue).getValue())));
            return;
        }
        if (valueType == 2) {
            this.writer.write(String.format("0x%x", Short.valueOf(((ShortEncodedValue) encodedValue).getValue())));
            return;
        }
        if (valueType == 3) {
            this.writer.write(String.format("0x%x", Integer.valueOf(((CharEncodedValue) encodedValue).getValue())));
            return;
        }
        if (valueType == 4) {
            this.writer.write(String.format("0x%x", Integer.valueOf(((IntEncodedValue) encodedValue).getValue())));
            return;
        }
        if (valueType == 16) {
            this.writer.write(Float.toString(((FloatEncodedValue) encodedValue).getValue()));
            return;
        }
        if (valueType == 17) {
            this.writer.write(Double.toString(((DoubleEncodedValue) encodedValue).getValue()));
            return;
        }
        switch (valueType) {
            case 21:
                writeMethodProtoDescriptor(((MethodTypeEncodedValue) encodedValue).getValue());
                return;
            case 22:
                writeMethodHandle(((MethodHandleEncodedValue) encodedValue).getValue());
                return;
            case 23:
                writeQuotedString(((StringEncodedValue) encodedValue).getValue());
                return;
            case 24:
                writeType(((TypeEncodedValue) encodedValue).getValue());
                return;
            case 25:
                writeFieldDescriptor(((FieldEncodedValue) encodedValue).getValue());
                return;
            case 26:
                writeMethodDescriptor(((MethodEncodedValue) encodedValue).getValue());
                return;
            case 27:
                writeFieldDescriptor(((EnumEncodedValue) encodedValue).getValue());
                return;
            case 28:
                writeArray((ArrayEncodedValue) encodedValue);
                return;
            case 29:
                writeAnnotation((AnnotationEncodedValue) encodedValue);
                return;
            case 30:
                this.writer.write("null");
                return;
            case 31:
                this.writer.write(Boolean.toString(((BooleanEncodedValue) encodedValue).getValue()));
                return;
            default:
                throw new IllegalArgumentException("Unknown encoded value type");
        }
    }

    public void writeFieldDescriptor(FieldReference fieldReference) throws IOException {
        writeType(fieldReference.getDefiningClass());
        this.writer.write("->");
        writeSimpleName(fieldReference.getName());
        this.writer.write(58);
        writeType(fieldReference.getType());
    }

    public void writeMethodDescriptor(MethodReference methodReference) throws IOException {
        writeType(methodReference.getDefiningClass());
        this.writer.write("->");
        writeSimpleName(methodReference.getName());
        this.writer.write(40);
        Iterator<? extends CharSequence> it = methodReference.getParameterTypes().iterator();
        while (it.hasNext()) {
            writeType(it.next());
        }
        this.writer.write(41);
        writeType(methodReference.getReturnType());
    }

    public void writeMethodHandle(MethodHandleReference methodHandleReference) throws IOException {
        this.writer.write(MethodHandleType.toString(methodHandleReference.getMethodHandleType()));
        this.writer.write(64);
        Reference memberReference = methodHandleReference.getMemberReference();
        if (memberReference instanceof MethodReference) {
            writeMethodDescriptor((MethodReference) memberReference);
        } else {
            writeFieldDescriptor((FieldReference) memberReference);
        }
    }

    public void writeMethodProtoDescriptor(MethodProtoReference methodProtoReference) throws IOException {
        this.writer.write(40);
        Iterator<? extends CharSequence> it = methodProtoReference.getParameterTypes().iterator();
        while (it.hasNext()) {
            writeType(it.next());
        }
        this.writer.write(41);
        writeType(methodProtoReference.getReturnType());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeQuotedString(CharSequence charSequence) throws IOException {
        this.writer.write(34);
        String string = charSequence.toString();
        for (int i10 = 0; i10 < string.length(); i10++) {
            char cCharAt = string.charAt(i10);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    this.writer.write(92);
                }
                this.writer.write(cCharAt);
            } else if (cCharAt > 127) {
                this.writer.write("\\u");
                this.writer.write(Character.forDigit(cCharAt >> '\f', 16));
                this.writer.write(Character.forDigit((cCharAt >> '\b') & 15, 16));
                this.writer.write(Character.forDigit((cCharAt >> 4) & 15, 16));
                this.writer.write(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                this.writer.write("\\t");
            } else if (cCharAt == '\n') {
                this.writer.write("\\n");
            } else if (cCharAt == '\r') {
                this.writer.write("\\r");
            }
        }
        this.writer.write(34);
    }

    public void writeReference(Reference reference) throws IOException {
        if (reference instanceof StringReference) {
            writeQuotedString((StringReference) reference);
            return;
        }
        if (reference instanceof TypeReference) {
            writeType((TypeReference) reference);
            return;
        }
        if (reference instanceof FieldReference) {
            writeFieldDescriptor((FieldReference) reference);
            return;
        }
        if (reference instanceof MethodReference) {
            writeMethodDescriptor((MethodReference) reference);
            return;
        }
        if (reference instanceof MethodProtoReference) {
            writeMethodProtoDescriptor((MethodProtoReference) reference);
            return;
        }
        if (reference instanceof MethodHandleReference) {
            writeMethodHandle((MethodHandleReference) reference);
        } else {
            if (reference instanceof CallSiteReference) {
                writeCallSite((CallSiteReference) reference);
                return;
            }
            throw new IllegalArgumentException("Not a known reference type: " + reference.getClass());
        }
    }

    public void writeShortFieldDescriptor(FieldReference fieldReference) throws IOException {
        writeSimpleName(fieldReference.getName());
        this.writer.write(58);
        writeType(fieldReference.getType());
    }

    public void writeShortMethodDescriptor(MethodReference methodReference) throws IOException {
        writeSimpleName(methodReference.getName());
        this.writer.write(40);
        Iterator<? extends CharSequence> it = methodReference.getParameterTypes().iterator();
        while (it.hasNext()) {
            writeType(it.next());
        }
        this.writer.write(41);
        writeType(methodReference.getReturnType());
    }

    public void writeSimpleName(CharSequence charSequence) throws IOException {
        this.writer.append(charSequence);
    }

    public void writeType(CharSequence charSequence) throws IOException {
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == 'L') {
                writeClass(charSequence.subSequence(i10, charSequence.length()));
                return;
            }
            if (cCharAt != '[') {
                if (cCharAt != 'Z' && cCharAt != 'B' && cCharAt != 'S' && cCharAt != 'C' && cCharAt != 'I' && cCharAt != 'J' && cCharAt != 'F' && cCharAt != 'D' && cCharAt != 'V') {
                    throw new IllegalArgumentException(String.format("Invalid type string: %s", charSequence));
                }
                this.writer.write(cCharAt);
                if (i10 != charSequence.length() - 1) {
                    throw new IllegalArgumentException(String.format("Invalid type string: %s", charSequence));
                }
                return;
            }
            this.writer.write(cCharAt);
        }
        throw new IllegalArgumentException(String.format("Invalid type string: %s", charSequence));
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.writer.write(cArr);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        this.writer.write(cArr, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        return this.writer.append(charSequence);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.writer.write(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        return this.writer.append(charSequence, i10, i11);
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        this.writer.write(str, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        return this.writer.append(c10);
    }
}
