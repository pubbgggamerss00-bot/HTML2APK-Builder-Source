package org.jf.dexlib2.analysis;

import b.o;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class RegisterType {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final byte BOOLEAN = 4;
    public static final byte BYTE = 5;
    public static final byte CHAR = 9;
    public static final byte INTEGER = 10;
    public static final byte LONG_LO = 12;
    public static final byte NULL = 2;
    public static final byte ONE = 3;
    public static final byte POS_BYTE = 6;
    public static final byte POS_SHORT = 8;
    public static final byte SHORT = 7;
    public static final byte UNINIT = 1;
    public static final byte UNKNOWN = 0;
    public final byte category;
    public final TypeProto type;
    public static final String[] CATEGORY_NAMES = {"Unknown", "Uninit", "Null", "One", "Boolean", "Byte", "PosByte", "Short", "PosShort", "Char", "Integer", "Float", "LongLo", "LongHi", "DoubleLo", "DoubleHi", "UninitRef", "UninitThis", i.I, "Conflicted"};
    public static final byte FLOAT = 11;
    public static final byte LONG_HI = 13;
    public static final byte DOUBLE_LO = 14;
    public static final byte DOUBLE_HI = 15;
    public static final byte UNINIT_REF = 16;
    public static final byte UNINIT_THIS = 17;
    public static final byte REFERENCE = 18;
    public static final byte CONFLICTED = 19;
    protected static byte[][] mergeTable = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, FLOAT, 12, LONG_HI, DOUBLE_LO, DOUBLE_HI, UNINIT_REF, UNINIT_THIS, REFERENCE, CONFLICTED}, new byte[]{1, 1, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{2, CONFLICTED, 2, 4, 4, 5, 6, 7, 8, 9, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, REFERENCE, CONFLICTED}, new byte[]{3, CONFLICTED, 4, 3, 4, 5, 6, 7, 8, 9, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{4, CONFLICTED, 4, 4, 4, 5, 6, 7, 8, 9, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{5, CONFLICTED, 5, 5, 5, 5, 5, 7, 7, 10, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{6, CONFLICTED, 6, 6, 6, 5, 6, 7, 8, 9, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{7, CONFLICTED, 7, 7, 7, 7, 7, 7, 7, 10, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{8, CONFLICTED, 8, 8, 8, 7, 8, 7, 8, 9, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{9, CONFLICTED, 9, 9, 9, 10, 9, 10, 9, 9, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{10, CONFLICTED, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{FLOAT, CONFLICTED, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, 10, FLOAT, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{12, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, 12, CONFLICTED, 12, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{LONG_HI, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, LONG_HI, CONFLICTED, LONG_HI, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{DOUBLE_LO, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, 12, CONFLICTED, DOUBLE_LO, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{DOUBLE_HI, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, LONG_HI, CONFLICTED, DOUBLE_HI, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{UNINIT_REF, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}, new byte[]{UNINIT_THIS, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, UNINIT_THIS, CONFLICTED, CONFLICTED}, new byte[]{REFERENCE, CONFLICTED, REFERENCE, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, REFERENCE, CONFLICTED}, new byte[]{CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED, CONFLICTED}};
    public static final RegisterType UNKNOWN_TYPE = new RegisterType((byte) 0, null);
    public static final RegisterType UNINIT_TYPE = new RegisterType((byte) 1, null);
    public static final RegisterType NULL_TYPE = new RegisterType((byte) 2, null);
    public static final RegisterType ONE_TYPE = new RegisterType((byte) 3, null);
    public static final RegisterType BOOLEAN_TYPE = new RegisterType((byte) 4, null);
    public static final RegisterType BYTE_TYPE = new RegisterType((byte) 5, null);
    public static final RegisterType POS_BYTE_TYPE = new RegisterType((byte) 6, null);
    public static final RegisterType SHORT_TYPE = new RegisterType((byte) 7, null);
    public static final RegisterType POS_SHORT_TYPE = new RegisterType((byte) 8, null);
    public static final RegisterType CHAR_TYPE = new RegisterType((byte) 9, null);
    public static final RegisterType INTEGER_TYPE = new RegisterType((byte) 10, null);
    public static final RegisterType FLOAT_TYPE = new RegisterType(FLOAT, null);
    public static final RegisterType LONG_LO_TYPE = new RegisterType((byte) 12, null);
    public static final RegisterType LONG_HI_TYPE = new RegisterType(LONG_HI, null);
    public static final RegisterType DOUBLE_LO_TYPE = new RegisterType(DOUBLE_LO, null);
    public static final RegisterType DOUBLE_HI_TYPE = new RegisterType(DOUBLE_HI, null);
    public static final RegisterType CONFLICTED_TYPE = new RegisterType(CONFLICTED, null);

    private RegisterType(byte b10, TypeProto typeProto) {
        this.category = b10;
        this.type = typeProto;
    }

    public static RegisterType getRegisterType(ClassPath classPath, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        if (cCharAt == 'F') {
            return FLOAT_TYPE;
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return SHORT_TYPE;
            }
            if (cCharAt == 'I') {
                return INTEGER_TYPE;
            }
            if (cCharAt == 'J') {
                return LONG_LO_TYPE;
            }
            if (cCharAt == 'Z') {
                return BOOLEAN_TYPE;
            }
            if (cCharAt != '[') {
                switch (cCharAt) {
                    case EACTags.ADDRESS /* 66 */:
                        return BYTE_TYPE;
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        return CHAR_TYPE;
                    case 'D':
                        return DOUBLE_LO_TYPE;
                    default:
                        throw new AnalysisException("Invalid type: " + ((Object) charSequence), new Object[0]);
                }
            }
        }
        return getRegisterType(REFERENCE, classPath.getClass(charSequence));
    }

    public static RegisterType getRegisterTypeForLiteral(int i10) {
        return i10 < -32768 ? INTEGER_TYPE : i10 < -128 ? SHORT_TYPE : i10 < 0 ? BYTE_TYPE : i10 == 0 ? NULL_TYPE : i10 == 1 ? ONE_TYPE : i10 < 128 ? POS_BYTE_TYPE : i10 < 32768 ? POS_SHORT_TYPE : i10 < 65536 ? CHAR_TYPE : INTEGER_TYPE;
    }

    public static RegisterType getWideRegisterType(CharSequence charSequence, boolean z10) {
        char cCharAt = charSequence.charAt(0);
        if (cCharAt == 'D') {
            return z10 ? getRegisterType(DOUBLE_LO, (TypeProto) null) : getRegisterType(DOUBLE_HI, (TypeProto) null);
        }
        if (cCharAt == 'J') {
            return z10 ? getRegisterType((byte) 12, (TypeProto) null) : getRegisterType(LONG_HI, (TypeProto) null);
        }
        throw new ExceptionWithContext("Cannot use this method for narrow register type: %s", charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RegisterType registerType = (RegisterType) obj;
            byte b10 = this.category;
            if (b10 == registerType.category && b10 != 16 && b10 != 17) {
                TypeProto typeProto = this.type;
                TypeProto typeProto2 = registerType.type;
                if (typeProto != null) {
                    return typeProto.equals(typeProto2);
                }
                if (typeProto2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.category * 31;
        TypeProto typeProto = this.type;
        return i10 + (typeProto != null ? typeProto.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r1.equals(r4.type) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RegisterType merge(RegisterType registerType) {
        TypeProto commonSuperclass;
        if (!registerType.equals(this)) {
            byte[][] bArr = mergeTable;
            byte b10 = this.category;
            byte b11 = bArr[b10][registerType.category];
            if (b11 == 18) {
                commonSuperclass = this.type;
                if (commonSuperclass != null) {
                    TypeProto typeProto = registerType.type;
                    if (typeProto != null) {
                        commonSuperclass = commonSuperclass.getCommonSuperclass(typeProto);
                    }
                } else {
                    commonSuperclass = registerType.type;
                }
            } else {
                if (b11 == 16 || b11 == 17) {
                    return b10 == 0 ? registerType : this;
                }
                commonSuperclass = null;
            }
            if (commonSuperclass != null) {
                if (!commonSuperclass.equals(this.type)) {
                }
            }
            return getRegisterType(b11, commonSuperclass);
        }
        return this;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("(");
        sb.append(CATEGORY_NAMES[this.category]);
        if (this.type == null) {
            str = "";
        } else {
            str = "," + this.type;
        }
        return o.a(sb, str, ")");
    }

    public void writeTo(Writer writer) throws IOException {
        writer.write(40);
        writer.write(CATEGORY_NAMES[this.category]);
        if (this.type != null) {
            writer.write(44);
            writer.write(this.type.getType());
        }
        writer.write(41);
    }

    public static RegisterType getRegisterType(byte b10, TypeProto typeProto) {
        if (b10 != 19) {
            switch (b10) {
                case 0:
                    return UNKNOWN_TYPE;
                case 1:
                    return UNINIT_TYPE;
                case 2:
                    return NULL_TYPE;
                case 3:
                    return ONE_TYPE;
                case 4:
                    return BOOLEAN_TYPE;
                case 5:
                    return BYTE_TYPE;
                case 6:
                    return POS_BYTE_TYPE;
                case 7:
                    return SHORT_TYPE;
                case 8:
                    return POS_SHORT_TYPE;
                case 9:
                    return CHAR_TYPE;
                case 10:
                    return INTEGER_TYPE;
                case 11:
                    return FLOAT_TYPE;
                case 12:
                    return LONG_LO_TYPE;
                case 13:
                    return LONG_HI_TYPE;
                case 14:
                    return DOUBLE_LO_TYPE;
                case 15:
                    return DOUBLE_HI_TYPE;
                default:
                    return new RegisterType(b10, typeProto);
            }
        }
        return CONFLICTED_TYPE;
    }
}
