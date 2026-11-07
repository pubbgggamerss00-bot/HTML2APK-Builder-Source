package org.jf.dexlib2.util;

import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.io.Writer;
import org.jf.dexlib2.iface.AnnotationElement;
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
import org.jf.util.StringUtils;

/* loaded from: classes3.dex */
public final class EncodedValueUtils {
    private EncodedValueUtils() {
    }

    public static boolean isDefaultValue(EncodedValue encodedValue) {
        int valueType = encodedValue.getValueType();
        if (valueType == 0) {
            return ((ByteEncodedValue) encodedValue).getValue() == 0;
        }
        if (valueType == 6) {
            return ((LongEncodedValue) encodedValue).getValue() == 0;
        }
        if (valueType == 2) {
            return ((ShortEncodedValue) encodedValue).getValue() == 0;
        }
        if (valueType == 3) {
            return ((CharEncodedValue) encodedValue).getValue() == 0;
        }
        if (valueType == 4) {
            return ((IntEncodedValue) encodedValue).getValue() == 0;
        }
        if (valueType == 16) {
            return ((FloatEncodedValue) encodedValue).getValue() == CropImageView.DEFAULT_ASPECT_RATIO;
        }
        if (valueType == 17) {
            return ((DoubleEncodedValue) encodedValue).getValue() == 0.0d;
        }
        if (valueType == 30) {
            return true;
        }
        if (valueType != 31) {
            return false;
        }
        return !((BooleanEncodedValue) encodedValue).getValue();
    }

    private static void writeAnnotation(Writer writer, AnnotationEncodedValue annotationEncodedValue) throws IOException {
        writer.write("Annotation[");
        writer.write(annotationEncodedValue.getType());
        for (AnnotationElement annotationElement : annotationEncodedValue.getElements()) {
            writer.write(", ");
            writer.write(annotationElement.getName());
            writer.write(61);
            writeEncodedValue(writer, annotationElement.getValue());
        }
        writer.write(93);
    }

    private static void writeArray(Writer writer, ArrayEncodedValue arrayEncodedValue) throws IOException {
        writer.write("Array[");
        boolean z10 = true;
        for (EncodedValue encodedValue : arrayEncodedValue.getValue()) {
            if (z10) {
                z10 = false;
            } else {
                writer.write(", ");
            }
            writeEncodedValue(writer, encodedValue);
        }
        writer.write(93);
    }

    @Deprecated
    public static void writeEncodedValue(Writer writer, EncodedValue encodedValue) throws IOException {
        int valueType = encodedValue.getValueType();
        if (valueType == 0) {
            writer.write(Byte.toString(((ByteEncodedValue) encodedValue).getValue()));
            return;
        }
        if (valueType == 6) {
            writer.write(Long.toString(((LongEncodedValue) encodedValue).getValue()));
            return;
        }
        if (valueType == 2) {
            writer.write(Short.toString(((ShortEncodedValue) encodedValue).getValue()));
            return;
        }
        if (valueType == 3) {
            writer.write(Integer.toString(((CharEncodedValue) encodedValue).getValue()));
            return;
        }
        if (valueType == 4) {
            writer.write(Integer.toString(((IntEncodedValue) encodedValue).getValue()));
            return;
        }
        if (valueType == 16) {
            writer.write(Float.toString(((FloatEncodedValue) encodedValue).getValue()));
            return;
        }
        if (valueType == 17) {
            writer.write(Double.toString(((DoubleEncodedValue) encodedValue).getValue()));
            return;
        }
        switch (valueType) {
            case 21:
                ReferenceUtil.writeMethodProtoDescriptor(writer, ((MethodTypeEncodedValue) encodedValue).getValue());
                return;
            case 22:
                ReferenceUtil.writeMethodHandle(writer, ((MethodHandleEncodedValue) encodedValue).getValue());
                return;
            case 23:
                writer.write(34);
                StringUtils.writeEscapedString(writer, ((StringEncodedValue) encodedValue).getValue());
                writer.write(34);
                return;
            case 24:
                writer.write(((TypeEncodedValue) encodedValue).getValue());
                return;
            case 25:
                ReferenceUtil.writeFieldDescriptor(writer, ((FieldEncodedValue) encodedValue).getValue());
                return;
            case 26:
                ReferenceUtil.writeMethodDescriptor(writer, ((MethodEncodedValue) encodedValue).getValue());
                return;
            case 27:
                ReferenceUtil.writeFieldDescriptor(writer, ((EnumEncodedValue) encodedValue).getValue());
                return;
            case 28:
                writeArray(writer, (ArrayEncodedValue) encodedValue);
                return;
            case 29:
                writeAnnotation(writer, (AnnotationEncodedValue) encodedValue);
                return;
            case 30:
                writer.write("null");
                return;
            case 31:
                writer.write(Boolean.toString(((BooleanEncodedValue) encodedValue).getValue()));
                return;
            default:
                throw new IllegalArgumentException("Unknown encoded value type");
        }
    }
}
