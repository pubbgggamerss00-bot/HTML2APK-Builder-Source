package org.jf.dexlib2.util;

import b6.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.VerificationError;
import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.dexlib2.iface.reference.FieldReference;
import org.jf.dexlib2.iface.reference.MethodReference;
import org.jf.dexlib2.iface.reference.Reference;
import org.jf.dexlib2.iface.reference.StringReference;
import org.jf.dexlib2.iface.reference.TypeReference;

/* loaded from: classes3.dex */
public class Preconditions {
    public static int check35cAnd45ccRegisterCount(int i10) {
        if (i10 < 0 || i10 > 5) {
            throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 5, inclusive.", Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int checkArrayPayloadElementWidth(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 8) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("Not a valid element width: %d", Integer.valueOf(i10)));
    }

    public static <L extends List<? extends Number>> L checkArrayPayloadElements(int i10, L l10) {
        long j10 = (1 << ((i10 * 8) - 1)) - 1;
        long j11 = (-j10) - 1;
        Iterator it = l10.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (number.longValue() < j11 || number.longValue() > j10) {
                throw new IllegalArgumentException(String.format("%d does not fit into a %d-byte signed integer", Long.valueOf(number.longValue()), Integer.valueOf(i10)));
            }
        }
        return l10;
    }

    public static int checkByteCodeOffset(int i10) {
        if (i10 < -128 || i10 > 127) {
            throw new IllegalArgumentException(String.format("Invalid code offset: %d. Must be between -128 and 127, inclusive.", Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int checkByteLiteral(int i10) {
        if (i10 < -128 || i10 > 127) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -128 and 127, inclusive.", Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int checkByteRegister(int i10) {
        if ((i10 & (-256)) == 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v255, inclusive.", Integer.valueOf(i10)));
    }

    public static int checkFieldOffset(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException(String.format("Invalid field offset: 0x%x. Must be between 0x0000 and 0xFFFF inclusive", Integer.valueOf(i10)));
        }
        return i10;
    }

    public static void checkFormat(Opcode opcode, Format format) {
        if (opcode.format != format) {
            throw new IllegalArgumentException(a.b("Invalid opcode ", opcode.name, " for ", format.name()));
        }
    }

    public static int checkInlineIndex(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException(String.format("Invalid inline index: %d. Must be between 0 and 65535, inclusive", Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int checkIntegerHatLiteral(int i10) {
        if ((65535 & i10) == 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 16 bits must be zeroed out.", Integer.valueOf(i10)));
    }

    public static long checkLongHatLiteral(long j10) {
        if ((281474976710655L & j10) == 0) {
            return j10;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 48 bits must be zeroed out.", Long.valueOf(j10)));
    }

    public static int checkNibbleLiteral(int i10) {
        if (i10 < -8 || i10 > 7) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -8 and 7, inclusive.", Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int checkNibbleRegister(int i10) {
        if ((i10 & (-16)) == 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v15, inclusive.", Integer.valueOf(i10)));
    }

    public static <T extends Reference> T checkReference(int i10, T t3) {
        if (i10 == 0) {
            if (t3 instanceof StringReference) {
                return t3;
            }
            throw new IllegalArgumentException("Invalid reference type, expecting a string reference");
        }
        if (i10 == 1) {
            if (t3 instanceof TypeReference) {
                return t3;
            }
            throw new IllegalArgumentException("Invalid reference type, expecting a type reference");
        }
        if (i10 == 2) {
            if (t3 instanceof FieldReference) {
                return t3;
            }
            throw new IllegalArgumentException("Invalid reference type, expecting a field reference");
        }
        if (i10 != 3) {
            throw new IllegalArgumentException(String.format("Not a valid reference type: %d", Integer.valueOf(i10)));
        }
        if (t3 instanceof MethodReference) {
            return t3;
        }
        throw new IllegalArgumentException("Invalid reference type, expecting a method reference");
    }

    public static int checkRegisterRangeCount(int i10) {
        if ((i10 & (-256)) == 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("Invalid register count: %d. Must be between 0 and 255, inclusive.", Integer.valueOf(i10)));
    }

    public static <C extends Collection<? extends SwitchElement>> C checkSequentialOrderedKeys(C c10) {
        Iterator it = c10.iterator();
        Integer numValueOf = null;
        while (it.hasNext()) {
            int key = ((SwitchElement) it.next()).getKey();
            if (numValueOf != null && numValueOf.intValue() + 1 != key) {
                throw new IllegalArgumentException("SwitchElement set is not sequential and ordered");
            }
            numValueOf = Integer.valueOf(key);
        }
        return c10;
    }

    public static int checkShortCodeOffset(int i10) {
        if (i10 < -32768 || i10 > 32767) {
            throw new IllegalArgumentException(String.format("Invalid code offset: %d. Must be between -32768 and 32767, inclusive.", Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int checkShortLiteral(int i10) {
        if (i10 < -32768 || i10 > 32767) {
            throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -32768 and 32767, inclusive.", Integer.valueOf(i10)));
        }
        return i10;
    }

    public static int checkShortRegister(int i10) {
        if (((-65536) & i10) == 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("Invalid register: v%d. Must be between v0 and v65535, inclusive.", Integer.valueOf(i10)));
    }

    public static void checkValueArg(int i10, int i11) {
        if (i10 > i11) {
            if (i11 != 0) {
                throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0..%d, inclusive", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            throw new IllegalArgumentException(String.format("Invalid value_arg value %d for an encoded_value. Expecting 0", Integer.valueOf(i10)));
        }
    }

    public static int checkVerificationError(int i10) {
        if (VerificationError.isValidVerificationError(i10)) {
            return i10;
        }
        throw new IllegalArgumentException(String.format("Invalid verification error value: %d. Must be between 1 and 9, inclusive", Integer.valueOf(i10)));
    }

    public static int checkVtableIndex(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException(String.format("Invalid vtable index: %d. Must be between 0 and 65535, inclusive", Integer.valueOf(i10)));
        }
        return i10;
    }
}
