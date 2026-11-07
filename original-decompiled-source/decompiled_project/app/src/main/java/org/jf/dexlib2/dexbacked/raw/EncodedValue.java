package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.ValueType;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.dexbacked.value.DexBackedEncodedValue;
import org.jf.dexlib2.util.AnnotatedBytes;

/* loaded from: classes3.dex */
public class EncodedValue {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void annotateEncodedAnnotation(DexBackedDexFile dexBackedDexFile, AnnotatedBytes annotatedBytes, DexReader dexReader) {
        annotatedBytes.annotateTo(dexReader.getOffset(), TypeIdItem.getReferenceAnnotation(dexBackedDexFile, dexReader.readSmallUleb128()), new Object[0]);
        int smallUleb128 = dexReader.readSmallUleb128();
        annotatedBytes.annotateTo(dexReader.getOffset(), "size: %d", Integer.valueOf(smallUleb128));
        for (int i10 = 0; i10 < smallUleb128; i10++) {
            annotatedBytes.annotate(0, "element[%d]", Integer.valueOf(i10));
            annotatedBytes.indent();
            annotatedBytes.annotateTo(dexReader.getOffset(), "name = %s", StringIdItem.getReferenceAnnotation(dexBackedDexFile, dexReader.readSmallUleb128()));
            annotateEncodedValue(dexBackedDexFile, annotatedBytes, dexReader);
            annotatedBytes.deindent();
        }
    }

    public static void annotateEncodedArray(DexBackedDexFile dexBackedDexFile, AnnotatedBytes annotatedBytes, DexReader dexReader) {
        int smallUleb128 = dexReader.readSmallUleb128();
        annotatedBytes.annotateTo(dexReader.getOffset(), "size: %d", Integer.valueOf(smallUleb128));
        for (int i10 = 0; i10 < smallUleb128; i10++) {
            annotatedBytes.annotate(0, "element[%d]", Integer.valueOf(i10));
            annotatedBytes.indent();
            annotateEncodedValue(dexBackedDexFile, annotatedBytes, dexReader);
            annotatedBytes.deindent();
        }
    }

    public static void annotateEncodedValue(DexBackedDexFile dexBackedDexFile, AnnotatedBytes annotatedBytes, DexReader dexReader) {
        int ubyte = dexReader.readUbyte();
        int i10 = ubyte >>> 5;
        int i11 = ubyte & 31;
        if (i11 != 0 && i11 != 6 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 16 && i11 != 17) {
            switch (i11) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                case 28:
                    annotatedBytes.annotate(1, "valueArg = %d, valueType = 0x%x: array", Integer.valueOf(i10), Integer.valueOf(i11));
                    annotateEncodedArray(dexBackedDexFile, annotatedBytes, dexReader);
                    return;
                case 29:
                    annotatedBytes.annotate(1, "valueArg = %d, valueType = 0x%x: annotation", Integer.valueOf(i10), Integer.valueOf(i11));
                    annotateEncodedAnnotation(dexBackedDexFile, annotatedBytes, dexReader);
                    return;
                case 30:
                    annotatedBytes.annotate(1, "valueArg = %d, valueType = 0x%x: null", Integer.valueOf(i10), Integer.valueOf(i11));
                    return;
                case 31:
                    annotatedBytes.annotate(1, "valueArg = %d, valueType = 0x%x: boolean, value=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(i10 == 1));
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Invalid encoded value type 0x%x at offset 0x%x", Integer.valueOf(i11), Integer.valueOf(dexReader.getOffset())));
            }
        }
        annotatedBytes.annotate(1, "valueArg = %d, valueType = 0x%x: %s", Integer.valueOf(i10), Integer.valueOf(i11), ValueType.getValueTypeName(i11));
        dexReader.setOffset(dexReader.getOffset() - 1);
        annotatedBytes.annotate(i10 + 1, "value = %s", asString(dexBackedDexFile, dexReader));
    }

    public static String asString(DexBackedDexFile dexBackedDexFile, DexReader dexReader) {
        int ubyte = dexReader.readUbyte();
        int i10 = ubyte >>> 5;
        int i11 = ubyte & 31;
        if (i11 == 0) {
            return String.format("0x%x", Integer.valueOf(dexReader.readByte()));
        }
        if (i11 == 6) {
            return String.format("0x%x", Long.valueOf(dexReader.readSizedLong(i10 + 1)));
        }
        if (i11 == 2) {
            return String.format("0x%x", Integer.valueOf(dexReader.readSizedInt(i10 + 1)));
        }
        if (i11 == 3) {
            return String.format("0x%x", Integer.valueOf(dexReader.readSizedSmallUint(i10 + 1)));
        }
        if (i11 == 4) {
            return String.format("0x%x", Integer.valueOf(dexReader.readSizedInt(i10 + 1)));
        }
        if (i11 == 16) {
            return String.format("%f", Float.valueOf(Float.intBitsToFloat(dexReader.readSizedRightExtendedInt(i10 + 1))));
        }
        if (i11 == 17) {
            return String.format("%f", Double.valueOf(Double.longBitsToDouble(dexReader.readSizedRightExtendedLong(i10 + 1))));
        }
        switch (i11) {
            case 21:
                return ProtoIdItem.getReferenceAnnotation(dexBackedDexFile, dexReader.readSizedSmallUint(i10 + 1));
            case 22:
            case 28:
            case 29:
                dexReader.setOffset(dexReader.getOffset() - 1);
                return DexBackedEncodedValue.readFrom(dexBackedDexFile, dexReader).toString();
            case 23:
                return StringIdItem.getReferenceAnnotation(dexBackedDexFile, dexReader.readSizedSmallUint(i10 + 1), true);
            case 24:
                return TypeIdItem.getReferenceAnnotation(dexBackedDexFile, dexReader.readSizedSmallUint(i10 + 1));
            case 25:
                return FieldIdItem.getReferenceAnnotation(dexBackedDexFile, dexReader.readSizedSmallUint(i10 + 1));
            case 26:
                return MethodIdItem.getReferenceAnnotation(dexBackedDexFile, dexReader.readSizedSmallUint(i10 + 1));
            case 27:
                return FieldIdItem.getReferenceAnnotation(dexBackedDexFile, dexReader.readSizedSmallUint(i10 + 1));
            case 30:
                return "null";
            case 31:
                return Boolean.toString(i10 == 1);
            default:
                throw new IllegalArgumentException(String.format("Invalid encoded value type 0x%x at offset 0x%x", Integer.valueOf(i11), Integer.valueOf(dexReader.getOffset())));
        }
    }
}
