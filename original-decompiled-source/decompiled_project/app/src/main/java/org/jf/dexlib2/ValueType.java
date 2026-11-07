package org.jf.dexlib2;

import j2.y;

/* loaded from: classes3.dex */
public final class ValueType {
    public static final int ANNOTATION = 29;
    public static final int ARRAY = 28;
    public static final int BOOLEAN = 31;
    public static final int BYTE = 0;
    public static final int CHAR = 3;
    public static final int DOUBLE = 17;
    public static final int ENUM = 27;
    public static final int FIELD = 25;
    public static final int FLOAT = 16;
    public static final int INT = 4;
    public static final int LONG = 6;
    public static final int METHOD = 26;
    public static final int METHOD_HANDLE = 22;
    public static final int METHOD_TYPE = 21;
    public static final int NULL = 30;
    public static final int SHORT = 2;
    public static final int STRING = 23;
    public static final int TYPE = 24;

    private ValueType() {
    }

    public static String getValueTypeName(int i10) {
        if (i10 == 0) {
            return "byte";
        }
        if (i10 == 6) {
            return "long";
        }
        if (i10 == 2) {
            return "short";
        }
        if (i10 == 3) {
            return "char";
        }
        if (i10 == 4) {
            return "int";
        }
        if (i10 == 16) {
            return "float";
        }
        if (i10 == 17) {
            return "double";
        }
        switch (i10) {
            case 21:
                return "method_type";
            case 22:
                return "method_handle";
            case 23:
                return "string";
            case 24:
                return "type";
            case 25:
                return "field";
            case 26:
                return "method";
            case 27:
                return "enum";
            case 28:
                return "array";
            case 29:
                return "annotation";
            case 30:
                return "null";
            case 31:
                return "boolean";
            default:
                throw new IllegalArgumentException(y.a(i10, "Unknown encoded value type: "));
        }
    }
}
