package org.jf.dexlib2.dexbacked.value;

import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexReader;
import org.jf.dexlib2.iface.value.EncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableBooleanEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableByteEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableCharEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableDoubleEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableFloatEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableIntEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableLongEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableNullEncodedValue;
import org.jf.dexlib2.immutable.value.ImmutableShortEncodedValue;
import org.jf.dexlib2.util.Preconditions;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public abstract class DexBackedEncodedValue {
    public static EncodedValue readFrom(DexBackedDexFile dexBackedDexFile, DexReader dexReader) {
        int offset = dexReader.getOffset();
        try {
            int ubyte = dexReader.readUbyte();
            int i10 = ubyte & 31;
            int i11 = ubyte >>> 5;
            if (i10 == 0) {
                Preconditions.checkValueArg(i11, 0);
                return new ImmutableByteEncodedValue((byte) dexReader.readByte());
            }
            if (i10 == 6) {
                Preconditions.checkValueArg(i11, 7);
                return new ImmutableLongEncodedValue(dexReader.readSizedLong(i11 + 1));
            }
            if (i10 == 2) {
                Preconditions.checkValueArg(i11, 1);
                return new ImmutableShortEncodedValue((short) dexReader.readSizedInt(i11 + 1));
            }
            if (i10 == 3) {
                Preconditions.checkValueArg(i11, 1);
                return new ImmutableCharEncodedValue((char) dexReader.readSizedSmallUint(i11 + 1));
            }
            if (i10 == 4) {
                Preconditions.checkValueArg(i11, 3);
                return new ImmutableIntEncodedValue(dexReader.readSizedInt(i11 + 1));
            }
            if (i10 == 16) {
                Preconditions.checkValueArg(i11, 3);
                return new ImmutableFloatEncodedValue(Float.intBitsToFloat(dexReader.readSizedRightExtendedInt(i11 + 1)));
            }
            if (i10 == 17) {
                Preconditions.checkValueArg(i11, 7);
                return new ImmutableDoubleEncodedValue(Double.longBitsToDouble(dexReader.readSizedRightExtendedLong(i11 + 1)));
            }
            switch (i10) {
                case 21:
                    Preconditions.checkValueArg(i11, 3);
                    return new DexBackedMethodTypeEncodedValue(dexBackedDexFile, dexReader, i11);
                case 22:
                    Preconditions.checkValueArg(i11, 3);
                    return new DexBackedMethodHandleEncodedValue(dexBackedDexFile, dexReader, i11);
                case 23:
                    Preconditions.checkValueArg(i11, 3);
                    return new DexBackedStringEncodedValue(dexBackedDexFile, dexReader, i11);
                case 24:
                    Preconditions.checkValueArg(i11, 3);
                    return new DexBackedTypeEncodedValue(dexBackedDexFile, dexReader, i11);
                case 25:
                    Preconditions.checkValueArg(i11, 3);
                    return new DexBackedFieldEncodedValue(dexBackedDexFile, dexReader, i11);
                case 26:
                    Preconditions.checkValueArg(i11, 3);
                    return new DexBackedMethodEncodedValue(dexBackedDexFile, dexReader, i11);
                case 27:
                    Preconditions.checkValueArg(i11, 3);
                    return new DexBackedEnumEncodedValue(dexBackedDexFile, dexReader, i11);
                case 28:
                    Preconditions.checkValueArg(i11, 0);
                    return new DexBackedArrayEncodedValue(dexBackedDexFile, dexReader);
                case 29:
                    Preconditions.checkValueArg(i11, 0);
                    return new DexBackedAnnotationEncodedValue(dexBackedDexFile, dexReader);
                case 30:
                    Preconditions.checkValueArg(i11, 0);
                    return ImmutableNullEncodedValue.INSTANCE;
                case 31:
                    Preconditions.checkValueArg(i11, 1);
                    return ImmutableBooleanEncodedValue.forBoolean(i11 == 1);
                default:
                    throw new ExceptionWithContext("Invalid encoded_value type: 0x%x", Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            throw ExceptionWithContext.withContext(e10, "Error while reading encoded value at offset 0x%x", Integer.valueOf(offset));
        }
    }

    public static void skipFrom(DexReader dexReader) {
        int offset = dexReader.getOffset();
        try {
            int ubyte = dexReader.readUbyte();
            int i10 = ubyte & 31;
            if (i10 == 0) {
                dexReader.skipByte();
                return;
            }
            if (i10 != 6 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 16 && i10 != 17) {
                switch (i10) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        break;
                    case 28:
                        DexBackedArrayEncodedValue.skipFrom(dexReader);
                        return;
                    case 29:
                        DexBackedAnnotationEncodedValue.skipFrom(dexReader);
                        return;
                    case 30:
                    case 31:
                        return;
                    default:
                        throw new ExceptionWithContext("Invalid encoded_value type: 0x%x", Integer.valueOf(i10));
                }
            }
            dexReader.moveRelative((ubyte >>> 5) + 1);
        } catch (Exception e10) {
            throw ExceptionWithContext.withContext(e10, "Error while skipping encoded value at offset 0x%x", Integer.valueOf(offset));
        }
    }
}
