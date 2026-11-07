package org.jf.dexlib2.analysis;

import b6.a;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import org.jf.dexlib2.Opcode;

/* loaded from: classes3.dex */
public class OdexedFieldInstructionMapper {
    private static final int GET = 0;
    private static final int INSTANCE = 0;
    private static final int PRIMITIVE = 0;
    private static final int PUT = 1;
    private static final int REFERENCE = 2;
    private static final int STATIC = 1;
    private static final int WIDE = 1;
    private static final FieldOpcode[] artFieldOpcodes;
    private static final FieldOpcode[] dalvikFieldOpcodes;
    private final FieldOpcode[][][] opcodeMap = (FieldOpcode[][][]) Array.newInstance((Class<?>) FieldOpcode.class, 2, 2, 10);
    private final Map<Opcode, Integer> opcodeValueTypeMap = new HashMap(30);

    static {
        Opcode opcode = Opcode.IGET_BOOLEAN;
        Opcode opcode2 = Opcode.IGET_QUICK;
        Opcode opcode3 = Opcode.IGET_VOLATILE;
        FieldOpcode fieldOpcode = new FieldOpcode(Matrix.MATRIX_TYPE_ZERO, opcode, opcode2, opcode3);
        Opcode opcode4 = Opcode.IGET_BYTE;
        FieldOpcode fieldOpcode2 = new FieldOpcode('B', opcode4, opcode2, opcode3);
        Opcode opcode5 = Opcode.IGET_SHORT;
        FieldOpcode fieldOpcode3 = new FieldOpcode('S', opcode5, opcode2, opcode3);
        Opcode opcode6 = Opcode.IGET_CHAR;
        FieldOpcode fieldOpcode4 = new FieldOpcode('C', opcode6, opcode2, opcode3);
        Opcode opcode7 = Opcode.IGET;
        FieldOpcode fieldOpcode5 = new FieldOpcode('I', opcode7, opcode2, opcode3);
        FieldOpcode fieldOpcode6 = new FieldOpcode('F', opcode7, opcode2, opcode3);
        Opcode opcode8 = Opcode.IGET_WIDE;
        Opcode opcode9 = Opcode.IGET_WIDE_QUICK;
        Opcode opcode10 = Opcode.IGET_WIDE_VOLATILE;
        FieldOpcode fieldOpcode7 = new FieldOpcode('J', opcode8, opcode9, opcode10);
        FieldOpcode fieldOpcode8 = new FieldOpcode('D', opcode8, opcode9, opcode10);
        Opcode opcode11 = Opcode.IGET_OBJECT;
        Opcode opcode12 = Opcode.IGET_OBJECT_QUICK;
        Opcode opcode13 = Opcode.IGET_OBJECT_VOLATILE;
        FieldOpcode fieldOpcode9 = new FieldOpcode(Matrix.MATRIX_TYPE_RANDOM_LT, opcode11, opcode12, opcode13);
        FieldOpcode fieldOpcode10 = new FieldOpcode('[', opcode11, opcode12, opcode13);
        Opcode opcode14 = Opcode.IPUT_BOOLEAN;
        Opcode opcode15 = Opcode.IPUT_QUICK;
        Opcode opcode16 = Opcode.IPUT_VOLATILE;
        FieldOpcode fieldOpcode11 = new FieldOpcode(Matrix.MATRIX_TYPE_ZERO, opcode14, opcode15, opcode16);
        Opcode opcode17 = Opcode.IPUT_BYTE;
        FieldOpcode fieldOpcode12 = new FieldOpcode('B', opcode17, opcode15, opcode16);
        Opcode opcode18 = Opcode.IPUT_SHORT;
        FieldOpcode fieldOpcode13 = new FieldOpcode('S', opcode18, opcode15, opcode16);
        Opcode opcode19 = Opcode.IPUT_CHAR;
        FieldOpcode fieldOpcode14 = new FieldOpcode('C', opcode19, opcode15, opcode16);
        Opcode opcode20 = Opcode.IPUT;
        FieldOpcode fieldOpcode15 = new FieldOpcode('I', opcode20, opcode15, opcode16);
        FieldOpcode fieldOpcode16 = new FieldOpcode('F', opcode20, opcode15, opcode16);
        Opcode opcode21 = Opcode.IPUT_WIDE;
        Opcode opcode22 = Opcode.IPUT_WIDE_QUICK;
        Opcode opcode23 = Opcode.IPUT_WIDE_VOLATILE;
        FieldOpcode fieldOpcode17 = new FieldOpcode('J', opcode21, opcode22, opcode23);
        FieldOpcode fieldOpcode18 = new FieldOpcode('D', opcode21, opcode22, opcode23);
        Opcode opcode24 = Opcode.IPUT_OBJECT;
        Opcode opcode25 = Opcode.IPUT_OBJECT_QUICK;
        Opcode opcode26 = Opcode.IPUT_OBJECT_VOLATILE;
        FieldOpcode fieldOpcode19 = new FieldOpcode(Matrix.MATRIX_TYPE_RANDOM_LT, opcode24, opcode25, opcode26);
        FieldOpcode fieldOpcode20 = new FieldOpcode('[', opcode24, opcode25, opcode26);
        Opcode opcode27 = Opcode.SPUT_BOOLEAN;
        Opcode opcode28 = Opcode.SPUT_VOLATILE;
        FieldOpcode fieldOpcode21 = new FieldOpcode(Matrix.MATRIX_TYPE_ZERO, true, opcode27, opcode28);
        FieldOpcode fieldOpcode22 = new FieldOpcode('B', true, Opcode.SPUT_BYTE, opcode28);
        FieldOpcode fieldOpcode23 = new FieldOpcode('S', true, Opcode.SPUT_SHORT, opcode28);
        FieldOpcode fieldOpcode24 = new FieldOpcode('C', true, Opcode.SPUT_CHAR, opcode28);
        Opcode opcode29 = Opcode.SPUT;
        FieldOpcode fieldOpcode25 = new FieldOpcode('I', true, opcode29, opcode28);
        FieldOpcode fieldOpcode26 = new FieldOpcode('F', true, opcode29, opcode28);
        Opcode opcode30 = Opcode.SPUT_WIDE;
        Opcode opcode31 = Opcode.SPUT_WIDE_VOLATILE;
        FieldOpcode fieldOpcode27 = new FieldOpcode('J', true, opcode30, opcode31);
        FieldOpcode fieldOpcode28 = new FieldOpcode('D', true, opcode30, opcode31);
        Opcode opcode32 = Opcode.SPUT_OBJECT;
        Opcode opcode33 = Opcode.SPUT_OBJECT_VOLATILE;
        FieldOpcode fieldOpcode29 = new FieldOpcode(Matrix.MATRIX_TYPE_RANDOM_LT, true, opcode32, opcode33);
        FieldOpcode fieldOpcode30 = new FieldOpcode('[', true, opcode32, opcode33);
        Opcode opcode34 = Opcode.SGET_BOOLEAN;
        Opcode opcode35 = Opcode.SGET_VOLATILE;
        FieldOpcode fieldOpcode31 = new FieldOpcode(Matrix.MATRIX_TYPE_ZERO, true, opcode34, opcode35);
        FieldOpcode fieldOpcode32 = new FieldOpcode('B', true, Opcode.SGET_BYTE, opcode35);
        FieldOpcode fieldOpcode33 = new FieldOpcode('S', true, Opcode.SGET_SHORT, opcode35);
        FieldOpcode fieldOpcode34 = new FieldOpcode('C', true, Opcode.SGET_CHAR, opcode35);
        Opcode opcode36 = Opcode.SGET;
        FieldOpcode fieldOpcode35 = new FieldOpcode('I', true, opcode36, opcode35);
        FieldOpcode fieldOpcode36 = new FieldOpcode('F', true, opcode36, opcode35);
        Opcode opcode37 = Opcode.SGET_WIDE;
        Opcode opcode38 = Opcode.SGET_WIDE_VOLATILE;
        FieldOpcode fieldOpcode37 = new FieldOpcode('J', true, opcode37, opcode38);
        FieldOpcode fieldOpcode38 = new FieldOpcode('D', true, opcode37, opcode38);
        Opcode opcode39 = Opcode.SGET_OBJECT;
        Opcode opcode40 = Opcode.SGET_OBJECT_VOLATILE;
        dalvikFieldOpcodes = new FieldOpcode[]{fieldOpcode, fieldOpcode2, fieldOpcode3, fieldOpcode4, fieldOpcode5, fieldOpcode6, fieldOpcode7, fieldOpcode8, fieldOpcode9, fieldOpcode10, fieldOpcode11, fieldOpcode12, fieldOpcode13, fieldOpcode14, fieldOpcode15, fieldOpcode16, fieldOpcode17, fieldOpcode18, fieldOpcode19, fieldOpcode20, fieldOpcode21, fieldOpcode22, fieldOpcode23, fieldOpcode24, fieldOpcode25, fieldOpcode26, fieldOpcode27, fieldOpcode28, fieldOpcode29, fieldOpcode30, fieldOpcode31, fieldOpcode32, fieldOpcode33, fieldOpcode34, fieldOpcode35, fieldOpcode36, fieldOpcode37, fieldOpcode38, new FieldOpcode(Matrix.MATRIX_TYPE_RANDOM_LT, true, opcode39, opcode40), new FieldOpcode('[', true, opcode39, opcode40)};
        artFieldOpcodes = new FieldOpcode[]{new FieldOpcode(Matrix.MATRIX_TYPE_ZERO, opcode, Opcode.IGET_BOOLEAN_QUICK), new FieldOpcode('B', opcode4, Opcode.IGET_BYTE_QUICK), new FieldOpcode('S', opcode5, Opcode.IGET_SHORT_QUICK), new FieldOpcode('C', opcode6, Opcode.IGET_CHAR_QUICK), new FieldOpcode('I', opcode7, opcode2), new FieldOpcode('F', opcode7, opcode2), new FieldOpcode('J', opcode8, opcode9), new FieldOpcode('D', opcode8, opcode9), new FieldOpcode(Matrix.MATRIX_TYPE_RANDOM_LT, opcode11, opcode12), new FieldOpcode('[', opcode11, opcode12), new FieldOpcode(Matrix.MATRIX_TYPE_ZERO, opcode14, Opcode.IPUT_BOOLEAN_QUICK), new FieldOpcode('B', opcode17, Opcode.IPUT_BYTE_QUICK), new FieldOpcode('S', opcode18, Opcode.IPUT_SHORT_QUICK), new FieldOpcode('C', opcode19, Opcode.IPUT_CHAR_QUICK), new FieldOpcode('I', opcode20, opcode15), new FieldOpcode('F', opcode20, opcode15), new FieldOpcode('J', opcode21, opcode22), new FieldOpcode('D', opcode21, opcode22), new FieldOpcode(Matrix.MATRIX_TYPE_RANDOM_LT, opcode24, opcode25), new FieldOpcode('[', opcode24, opcode25)};
    }

    public OdexedFieldInstructionMapper(boolean z10) {
        for (FieldOpcode fieldOpcode : z10 ? artFieldOpcodes : dalvikFieldOpcodes) {
            this.opcodeMap[!isGet(fieldOpcode.normalOpcode) ? 1 : 0][isStatic(fieldOpcode.normalOpcode) ? 1 : 0][getTypeIndex(fieldOpcode.type)] = fieldOpcode;
            Opcode opcode = fieldOpcode.quickOpcode;
            if (opcode != null) {
                this.opcodeValueTypeMap.put(opcode, Integer.valueOf(getValueType(fieldOpcode.type)));
            }
            Opcode opcode2 = fieldOpcode.volatileOpcode;
            if (opcode2 != null) {
                this.opcodeValueTypeMap.put(opcode2, Integer.valueOf(getValueType(fieldOpcode.type)));
            }
        }
    }

    private static int getTypeIndex(char c10) {
        if (c10 == 'F') {
            return 5;
        }
        if (c10 == 'L') {
            return 8;
        }
        if (c10 == 'S') {
            return 2;
        }
        if (c10 == 'I') {
            return 4;
        }
        if (c10 == 'J') {
            return 6;
        }
        if (c10 == 'Z') {
            return 0;
        }
        if (c10 == '[') {
            return 9;
        }
        switch (c10) {
            case EACTags.ADDRESS /* 66 */:
                return 1;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return 3;
            case 'D':
                return 7;
            default:
                throw new RuntimeException("Unknown type " + c10 + ": ");
        }
    }

    private static int getValueType(char c10) {
        if (c10 == 'F') {
            return 0;
        }
        if (c10 == 'L') {
            return 2;
        }
        if (c10 == 'S' || c10 == 'I') {
            return 0;
        }
        if (c10 == 'J') {
            return 1;
        }
        if (c10 == 'Z') {
            return 0;
        }
        if (c10 == '[') {
            return 2;
        }
        switch (c10) {
            case EACTags.ADDRESS /* 66 */:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return 0;
            case 'D':
                return 1;
            default:
                throw new RuntimeException("Unknown type " + c10 + ": ");
        }
    }

    private boolean isCompatible(Opcode opcode, char c10) {
        Integer num = this.opcodeValueTypeMap.get(opcode);
        if (num != null) {
            return num.intValue() == getValueType(c10);
        }
        throw new RuntimeException("Unexpected opcode: " + opcode.name);
    }

    private static boolean isGet(Opcode opcode) {
        return (opcode.flags & 16) != 0;
    }

    private static boolean isStatic(Opcode opcode) {
        return (opcode.flags & 256) != 0;
    }

    public Opcode getAndCheckDeodexedOpcode(String str, Opcode opcode) {
        FieldOpcode fieldOpcode = this.opcodeMap[!isGet(opcode) ? 1 : 0][isStatic(opcode) ? 1 : 0][getTypeIndex(str.charAt(0))];
        if (isCompatible(opcode, fieldOpcode.type)) {
            return fieldOpcode.normalOpcode;
        }
        throw new AnalysisException(a.b("Incorrect field type \"", str, "\" for ", opcode.name), new Object[0]);
    }

    public static class FieldOpcode {
        public final boolean isStatic;
        public final Opcode normalOpcode;
        public final Opcode quickOpcode;
        public final char type;
        public final Opcode volatileOpcode;

        public FieldOpcode(char c10, Opcode opcode, Opcode opcode2, Opcode opcode3) {
            this.type = c10;
            this.isStatic = false;
            this.normalOpcode = opcode;
            this.quickOpcode = opcode2;
            this.volatileOpcode = opcode3;
        }

        public FieldOpcode(char c10, boolean z10, Opcode opcode, Opcode opcode2) {
            this.type = c10;
            this.isStatic = z10;
            this.normalOpcode = opcode;
            this.quickOpcode = null;
            this.volatileOpcode = opcode2;
        }

        public FieldOpcode(char c10, Opcode opcode, Opcode opcode2) {
            this.type = c10;
            this.isStatic = false;
            this.normalOpcode = opcode;
            this.quickOpcode = opcode2;
            this.volatileOpcode = null;
        }
    }
}
