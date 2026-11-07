package org.jf.dexlib2.util;

import java.util.List;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.analysis.RegisterType;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.iface.instruction.OneRegisterInstruction;
import org.jf.dexlib2.iface.instruction.WideLiteralInstruction;

/* loaded from: classes3.dex */
public class SyntheticAccessorFSM {
    public static final int ADD = 7;
    public static final int AND = 12;
    public static final int DIV = 10;
    public static final int DOUBLE = 3;
    public static final int FLOAT = 2;
    public static final int INT = 0;
    public static final int LONG = 1;
    public static final int MUL = 9;
    public static final int NEGATIVE_ONE = -1;
    public static final int OR = 13;
    public static final int OTHER = 0;
    public static final int POSITIVE_ONE = 1;
    public static final int REM = 11;
    public static final int SHL = 15;
    public static final int SHR = 16;
    public static final int SUB = 8;
    static final int SyntheticAccessorFSM_en_main = 1;
    static final int SyntheticAccessorFSM_error = 0;
    static final int SyntheticAccessorFSM_first_final = 17;
    static final int SyntheticAccessorFSM_start = 1;
    public static final int USHR = 17;
    public static final int XOR = 14;
    private final Opcodes opcodes;
    private static final byte[] _SyntheticAccessorFSM_actions = init__SyntheticAccessorFSM_actions_0();
    private static final short[] _SyntheticAccessorFSM_key_offsets = init__SyntheticAccessorFSM_key_offsets_0();
    private static final short[] _SyntheticAccessorFSM_trans_keys = init__SyntheticAccessorFSM_trans_keys_0();
    private static final byte[] _SyntheticAccessorFSM_single_lengths = init__SyntheticAccessorFSM_single_lengths_0();
    private static final byte[] _SyntheticAccessorFSM_range_lengths = init__SyntheticAccessorFSM_range_lengths_0();
    private static final short[] _SyntheticAccessorFSM_index_offsets = init__SyntheticAccessorFSM_index_offsets_0();
    private static final byte[] _SyntheticAccessorFSM_indicies = init__SyntheticAccessorFSM_indicies_0();
    private static final byte[] _SyntheticAccessorFSM_trans_targs = init__SyntheticAccessorFSM_trans_targs_0();
    private static final byte[] _SyntheticAccessorFSM_trans_actions = init__SyntheticAccessorFSM_trans_actions_0();

    public SyntheticAccessorFSM(Opcodes opcodes) {
        this.opcodes = opcodes;
    }

    private static int getIncrementType(int i10, int i11, long j10, int i12, int i13) {
        boolean z10;
        boolean z11 = false;
        boolean z12 = i12 == i13;
        if (i11 == 0 || i11 == 1) {
            if (j10 != 1) {
                if (j10 != -1) {
                    return -1;
                }
                z10 = true;
            }
            z10 = false;
        } else if (i11 != 2) {
            if (i11 == 3) {
                double dLongBitsToDouble = Double.longBitsToDouble(j10);
                if (dLongBitsToDouble != 1.0d) {
                    if (dLongBitsToDouble != -1.0d) {
                        return -1;
                    }
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) j10);
            if (fIntBitsToFloat != 1.0f) {
                if (fIntBitsToFloat != -1.0f) {
                    return -1;
                }
                z10 = true;
            }
            z10 = false;
        }
        if ((i10 == 7 && !z10) || (i10 == 8 && z10)) {
            z11 = true;
        }
        return z12 ? z11 ? 4 : 6 : z11 ? 3 : 5;
    }

    private static byte[] init__SyntheticAccessorFSM_actions_0() {
        return new byte[]{0, 1, 0, 1, 1, 1, 2, 1, RegisterType.LONG_HI, 1, RegisterType.DOUBLE_LO, 1, RegisterType.DOUBLE_HI, 1, RegisterType.UNINIT_REF, 1, RegisterType.UNINIT_THIS, 1, RegisterType.REFERENCE, 1, RegisterType.CONFLICTED, 1, 20, 1, 21, 1, 25, 2, 3, 7, 2, 4, 7, 2, 5, 7, 2, 6, 7, 2, 8, 12, 2, 9, 12, 2, 10, 12, 2, RegisterType.FLOAT, 12, 2, 22, 23, 2, 22, 24, 2, 22, 25, 2, 22, 26, 2, 22, 27, 2, 22, 28};
    }

    private static short[] init__SyntheticAccessorFSM_index_offsets_0() {
        return new short[]{0, 0, 7, 73, 90, 93, 95, 156, 160, 162, 166, 169, 173, 175, 178, 180, 183, 185};
    }

    private static byte[] init__SyntheticAccessorFSM_indicies_0() {
        return new byte[]{0, 2, 0, 2, 3, 3, 1, 8, 9, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, RegisterType.REFERENCE, RegisterType.CONFLICTED, 9, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, 20, 21, 9, 10, RegisterType.FLOAT, 22, 23, 9, 10, RegisterType.FLOAT, 8, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, RegisterType.REFERENCE, RegisterType.CONFLICTED, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, 20, 21, 10, RegisterType.FLOAT, 22, 23, 10, RegisterType.FLOAT, 24, 24, 4, 5, 6, 7, 9, 1, 25, 26, 27, 28, 29, 30, 31, 32, 25, 26, 27, 28, 29, 30, 31, 32, 1, 33, 33, 1, 34, 1, 8, 9, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, RegisterType.REFERENCE, RegisterType.CONFLICTED, 9, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, 20, 21, 9, 10, RegisterType.FLOAT, 22, 23, 9, 10, RegisterType.FLOAT, 8, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, RegisterType.REFERENCE, RegisterType.CONFLICTED, 10, RegisterType.FLOAT, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, 20, 21, 10, RegisterType.FLOAT, 22, 23, 10, RegisterType.FLOAT, 7, 9, 1, 35, 35, 36, 1, 37, 1, 35, 35, 38, 1, 35, 35, 1, 39, 39, 40, 1, 41, 1, 39, 39, 1, 42, 1, 44, 43, 1, 45, 1, 1, 0};
    }

    private static short[] init__SyntheticAccessorFSM_key_offsets_0() {
        return new short[]{0, 0, 12, 82, 98, 102, 104, 166, 172, 174, 180, 184, 190, 192, 196, 198, 201, 203};
    }

    private static byte[] init__SyntheticAccessorFSM_range_lengths_0() {
        return new byte[]{0, 6, 5, 0, 2, 1, 2, 3, 1, 3, 2, 3, 1, 2, 1, 1, 1, 0};
    }

    private static byte[] init__SyntheticAccessorFSM_single_lengths_0() {
        return new byte[]{0, 0, 60, RegisterType.UNINIT_REF, 0, 0, 58, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
    }

    private static byte[] init__SyntheticAccessorFSM_trans_actions_0() {
        return new byte[]{0, 0, 1, 0, 51, 3, 0, 27, 39, 7, 9, RegisterType.FLOAT, RegisterType.LONG_HI, RegisterType.DOUBLE_HI, RegisterType.UNINIT_THIS, RegisterType.CONFLICTED, 21, 23, 30, 42, 33, 45, 36, 48, 5, 27, 39, 30, 42, 33, 45, 36, 48, 1, 63, 1, 0, 66, 0, 1, 0, 60, 54, 0, 25, 57};
    }

    private static short[] init__SyntheticAccessorFSM_trans_keys_0() {
        return new short[]{82, 88, 89, 95, 96, 102, 103, 109, 110, 114, 116, 120, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 177, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 201, 202, 203, 204, 206, 207, 208, 216, 15, 17, 18, 25, 129, 143, 144, 176, 178, 205, 144, 145, 155, 156, 166, 167, 171, 172, 176, 177, 187, 188, 198, 199, 203, 204, 89, 95, 103, 109, 15, 17, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 177, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 201, 202, 203, 204, 206, 207, 144, 176, 178, 205, 89, 95, 103, 109, 129, 143, 15, 17, 89, 95, 103, 109, 129, 143, 89, 95, 103, 109, 89, 95, 103, 109, 129, 143, 15, 17, 89, 95, 103, 109, 15, 17, 14, 10, 12, 15, 17, 0};
    }

    private static byte[] init__SyntheticAccessorFSM_trans_targs_0() {
        return new byte[]{2, 0, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_THIS, 3, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, RegisterType.FLOAT, 4, 4, 4, 4, 4, 4, 4, 4, 5, RegisterType.UNINIT_THIS, 8, 9, RegisterType.UNINIT_THIS, 10, 12, RegisterType.LONG_HI, RegisterType.UNINIT_THIS, RegisterType.UNINIT_THIS, RegisterType.UNINIT_REF, RegisterType.UNINIT_THIS, RegisterType.UNINIT_THIS};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r16v3, types: [int] */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int test(List<? extends Instruction> list) {
        int i10;
        int i11;
        short s10;
        int i12;
        int i13;
        byte b10;
        int incrementType;
        int size = list.size();
        int i14 = -1;
        int i15 = 1;
        int registerA = -1;
        int registerA2 = -1;
        long wideLiteral = 0;
        byte b11 = 1;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        int i19 = -1;
        while (true) {
            if (i16 != 0) {
                if (i16 != i15) {
                    if (i16 != 2) {
                        return i14;
                    }
                    i10 = i15;
                }
                if (b11 == 0) {
                    i15 = i10;
                    i16 = 5;
                } else {
                    i17++;
                    if (i17 == size) {
                        return i14;
                    }
                    i15 = i10;
                    i16 = i15;
                }
            } else if (i17 == size) {
                i16 = 4;
            } else if (b11 == 0) {
                i16 = 5;
            }
            short s11 = _SyntheticAccessorFSM_key_offsets[b11];
            short s12 = _SyntheticAccessorFSM_index_offsets[b11];
            byte b12 = _SyntheticAccessorFSM_single_lengths[b11];
            if (b12 > 0) {
                ?? r18 = s11 + b12;
                i11 = 2;
                int i20 = r18 - 1;
                i10 = i15;
                int i21 = s11;
                while (i20 >= i21) {
                    int i22 = i21 + ((i20 - i21) >> 1);
                    i12 = i14;
                    short sShortValue = this.opcodes.getOpcodeValue(list.get(i17).getOpcode()).shortValue();
                    short[] sArr = _SyntheticAccessorFSM_trans_keys;
                    int i23 = i20;
                    if (sShortValue < sArr[i22]) {
                        i20 = i22 - 1;
                    } else if (this.opcodes.getOpcodeValue(list.get(i17).getOpcode()).shortValue() > sArr[i22]) {
                        i21 = i22 + 1;
                        i20 = i23;
                    } else {
                        i13 = (i22 - s11) + s12;
                        byte b13 = _SyntheticAccessorFSM_indicies[i13];
                        b11 = _SyntheticAccessorFSM_trans_targs[b13];
                        b10 = _SyntheticAccessorFSM_trans_actions[b13];
                        if (b10 == 0) {
                            int i24 = b10 + 1;
                            byte b14 = _SyntheticAccessorFSM_actions[b10];
                            int i25 = i18;
                            int i26 = i19;
                            while (true) {
                                ?? r12 = b14 - 1;
                                if (b14 > 0) {
                                    int i27 = i24 + 1;
                                    switch (_SyntheticAccessorFSM_actions[i24]) {
                                        case 0:
                                            registerA = ((OneRegisterInstruction) list.get(i17)).getRegisterA();
                                            b14 = r12;
                                            i24 = i27;
                                        case 1:
                                            wideLiteral = ((WideLiteralInstruction) list.get(i17)).getWideLiteral();
                                            b14 = r12;
                                            i24 = i27;
                                        case 2:
                                            wideLiteral = ((WideLiteralInstruction) list.get(i17)).getWideLiteral();
                                            i25 = 7;
                                        case 3:
                                        case 8:
                                            i26 = 0;
                                            b14 = r12;
                                            i24 = i27;
                                        case 4:
                                        case 9:
                                            i26 = i10;
                                            b14 = r12;
                                            i24 = i27;
                                        case 5:
                                        case 10:
                                            i26 = i11;
                                            b14 = r12;
                                            i24 = i27;
                                        case 6:
                                        case 11:
                                            i26 = 3;
                                            b14 = r12;
                                            i24 = i27;
                                        case 7:
                                            i25 = 7;
                                            b14 = r12;
                                            i24 = i27;
                                        case 12:
                                            i25 = 8;
                                            b14 = r12;
                                            i24 = i27;
                                        case 13:
                                            i25 = 9;
                                            b14 = r12;
                                            i24 = i27;
                                        case 14:
                                            i25 = 10;
                                            b14 = r12;
                                            i24 = i27;
                                        case 15:
                                            i25 = 11;
                                            b14 = r12;
                                            i24 = i27;
                                        case 16:
                                            i25 = 12;
                                            b14 = r12;
                                            i24 = i27;
                                        case 17:
                                            i25 = 13;
                                            b14 = r12;
                                            i24 = i27;
                                        case 18:
                                            i25 = 14;
                                            b14 = r12;
                                            i24 = i27;
                                        case 19:
                                            i25 = 15;
                                            b14 = r12;
                                            i24 = i27;
                                        case 20:
                                            i25 = 16;
                                            b14 = r12;
                                            i24 = i27;
                                        case 21:
                                            i25 = 17;
                                            b14 = r12;
                                            i24 = i27;
                                        case 22:
                                            registerA2 = ((OneRegisterInstruction) list.get(i17)).getRegisterA();
                                            b14 = r12;
                                            i24 = i27;
                                        case 23:
                                            i17++;
                                            i19 = i26;
                                            i14 = i10;
                                            i15 = i14;
                                            break;
                                        case 24:
                                            i17++;
                                            i19 = i26;
                                            i15 = i10;
                                            i14 = i11;
                                            break;
                                        case 25:
                                            i17++;
                                            i19 = i26;
                                            i15 = i10;
                                            i14 = 0;
                                            break;
                                        case 26:
                                            incrementType = getIncrementType(i25, i26, wideLiteral, registerA, registerA2);
                                            i12 = incrementType;
                                            b14 = r12;
                                            i24 = i27;
                                        case 27:
                                            incrementType = getIncrementType(i25, i26, wideLiteral, registerA, registerA2);
                                            i12 = incrementType;
                                            b14 = r12;
                                            i24 = i27;
                                        case 28:
                                            i17++;
                                            i14 = i25;
                                            i19 = i26;
                                            i15 = i10;
                                            i16 = 5;
                                            i18 = i14;
                                            break;
                                        default:
                                            b14 = r12;
                                            i24 = i27;
                                    }
                                    return i14;
                                }
                                i19 = i26;
                                i14 = i12;
                                i18 = i25;
                            }
                            i16 = 5;
                            i18 = i25;
                        } else {
                            i14 = i12;
                        }
                        if (b11 == 0) {
                        }
                    }
                    i14 = i12;
                }
                s11 = r18;
                s10 = s12 + b12;
            } else {
                i11 = 2;
                i10 = i15;
                s10 = s12;
            }
            i12 = i14;
            byte b15 = _SyntheticAccessorFSM_range_lengths[b11];
            if (b15 > 0) {
                int i28 = ((b15 << 1) + s11) - 2;
                int i29 = s11;
                int i30 = b15;
                while (true) {
                    if (i28 >= i29) {
                        int i31 = (((i28 - i29) >> 1) & (-2)) + i29;
                        int i32 = i30;
                        short sShortValue2 = this.opcodes.getOpcodeValue(list.get(i17).getOpcode()).shortValue();
                        short[] sArr2 = _SyntheticAccessorFSM_trans_keys;
                        int i33 = i28;
                        if (sShortValue2 < sArr2[i31]) {
                            i28 = i31 - 2;
                        } else if (this.opcodes.getOpcodeValue(list.get(i17).getOpcode()).shortValue() > sArr2[i31 + 1]) {
                            i29 = i31 + 2;
                            i28 = i33;
                        } else {
                            i30 = (i31 - s11) >> 1;
                        }
                        i30 = i32;
                    }
                }
                i13 = s10 + i30;
            } else {
                i13 = s10;
            }
            byte b132 = _SyntheticAccessorFSM_indicies[i13];
            b11 = _SyntheticAccessorFSM_trans_targs[b132];
            b10 = _SyntheticAccessorFSM_trans_actions[b132];
            if (b10 == 0) {
            }
            if (b11 == 0) {
            }
        }
    }
}
