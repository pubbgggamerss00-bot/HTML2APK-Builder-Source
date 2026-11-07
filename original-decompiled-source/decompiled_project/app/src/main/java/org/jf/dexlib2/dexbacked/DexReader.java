package org.jf.dexlib2.dexbacked;

import org.jf.dexlib2.analysis.RegisterType;
import org.jf.dexlib2.dexbacked.DexBuffer;
import org.jf.util.ExceptionWithContext;
import org.jf.util.Utf8Utils;

/* loaded from: classes3.dex */
public class DexReader<T extends DexBuffer> {
    public final T dexBuf;
    private int offset;

    public DexReader(T t3, int i10) {
        this.dexBuf = t3;
        this.offset = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[PHI: r5
      0x005e: PHI (r5v3 int) = (r5v2 int), (r5v6 int) binds: [B:5:0x001a, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekUleb128Size(boolean z10) {
        T t3 = this.dexBuf;
        int i10 = t3.baseOffset;
        int i11 = this.offset;
        int i12 = i10 + i11;
        byte[] bArr = t3.buf;
        int i13 = i12 + 1;
        if ((bArr[i12] & 255) > 127) {
            int i14 = i12 + 2;
            if ((bArr[i13] & 255) > 127) {
                i13 = i12 + 3;
                if ((bArr[i14] & 255) > 127) {
                    i14 = i12 + 4;
                    if ((bArr[i13] & 255) > 127) {
                        i13 = i12 + 5;
                        byte b10 = bArr[i14];
                        if (b10 < 0) {
                            throw new ExceptionWithContext("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.offset));
                        }
                        if ((b10 & RegisterType.DOUBLE_HI) > 7 && !z10) {
                            throw new ExceptionWithContext("Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.offset));
                        }
                    } else {
                        i13 = i14;
                    }
                }
            }
        }
        return i13 - (i10 + i11);
    }

    private int readUleb128(boolean z10) {
        T t3 = this.dexBuf;
        int i10 = t3.baseOffset;
        int i11 = this.offset + i10;
        byte[] bArr = t3.buf;
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        int i13 = b10 & 255;
        if (i13 > 127) {
            int i14 = i11 + 2;
            byte b11 = bArr[i12];
            int i15 = b11 & 255;
            int i16 = ((b11 & Byte.MAX_VALUE) << 7) | (b10 & Byte.MAX_VALUE);
            if (i15 > 127) {
                int i17 = i11 + 3;
                byte b12 = bArr[i14];
                int i18 = b12 & 255;
                i13 = ((b12 & Byte.MAX_VALUE) << 14) | i16;
                if (i18 > 127) {
                    i12 = i11 + 4;
                    byte b13 = bArr[i17];
                    i13 |= (b13 & Byte.MAX_VALUE) << 21;
                    if ((b13 & 255) > 127) {
                        int i19 = i11 + 5;
                        byte b14 = bArr[i12];
                        if (b14 < 0) {
                            throw new ExceptionWithContext("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.offset));
                        }
                        if ((b14 & RegisterType.DOUBLE_HI) > 7 && !z10) {
                            throw new ExceptionWithContext("Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.offset));
                        }
                        i13 |= b14 << 28;
                        i12 = i19;
                    }
                } else {
                    i12 = i17;
                }
            } else {
                i13 = i16;
                i12 = i14;
            }
        }
        this.offset = i12 - i10;
        return i13;
    }

    public int getOffset() {
        return this.offset;
    }

    public void moveRelative(int i10) {
        this.offset += i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[PHI: r5
      0x0045: PHI (r5v3 int) = (r5v2 int), (r5v6 int) binds: [B:5:0x001a, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int peekBigUleb128Size() {
        T t3 = this.dexBuf;
        int i10 = t3.baseOffset;
        int i11 = this.offset;
        int i12 = i10 + i11;
        byte[] bArr = t3.buf;
        int i13 = i12 + 1;
        if ((bArr[i12] & 255) > 127) {
            int i14 = i12 + 2;
            if ((bArr[i13] & 255) > 127) {
                i13 = i12 + 3;
                if ((bArr[i14] & 255) > 127) {
                    i14 = i12 + 4;
                    if ((bArr[i13] & 255) > 127) {
                        i13 = i12 + 5;
                        if (bArr[i14] < 0) {
                            throw new ExceptionWithContext("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.offset));
                        }
                    } else {
                        i13 = i14;
                    }
                }
            }
        }
        return i13 - (i10 + i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[PHI: r5
      0x0047: PHI (r5v3 int) = (r5v2 int), (r5v6 int) binds: [B:5:0x001a, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int peekSleb128Size() {
        T t3 = this.dexBuf;
        int i10 = t3.baseOffset;
        int i11 = this.offset;
        int i12 = i10 + i11;
        byte[] bArr = t3.buf;
        int i13 = i12 + 1;
        if ((bArr[i12] & 255) > 127) {
            int i14 = i12 + 2;
            if ((bArr[i13] & 255) > 127) {
                i13 = i12 + 3;
                if ((bArr[i14] & 255) > 127) {
                    i14 = i12 + 4;
                    if ((bArr[i13] & 255) > 127) {
                        i13 = i12 + 5;
                        if ((bArr[i14] & 255) > 127) {
                            throw new ExceptionWithContext("Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.offset));
                        }
                    } else {
                        i13 = i14;
                    }
                }
            }
        }
        return i13 - (i10 + i11);
    }

    public int peekSmallUleb128Size() {
        return peekUleb128Size(false);
    }

    public int peekStringLength(int i10) {
        int[] iArr = new int[1];
        T t3 = this.dexBuf;
        Utf8Utils.utf8BytesWithUtf16LengthToString(t3.buf, t3.baseOffset + this.offset, i10, iArr);
        return iArr[0];
    }

    public int peekUbyte() {
        return this.dexBuf.readUbyte(this.offset);
    }

    public int peekUshort() {
        return this.dexBuf.readUshort(this.offset);
    }

    public int readBigUleb128() {
        T t3 = this.dexBuf;
        int i10 = t3.baseOffset;
        int i11 = this.offset + i10;
        byte[] bArr = t3.buf;
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        int i13 = b10 & 255;
        if (i13 > 127) {
            int i14 = i11 + 2;
            byte b11 = bArr[i12];
            int i15 = b11 & 255;
            int i16 = ((b11 & Byte.MAX_VALUE) << 7) | (b10 & Byte.MAX_VALUE);
            if (i15 > 127) {
                int i17 = i11 + 3;
                byte b12 = bArr[i14];
                int i18 = b12 & 255;
                i13 = ((b12 & Byte.MAX_VALUE) << 14) | i16;
                if (i18 > 127) {
                    i12 = i11 + 4;
                    byte b13 = bArr[i17];
                    i13 |= (b13 & Byte.MAX_VALUE) << 21;
                    if ((b13 & 255) > 127) {
                        int i19 = i11 + 5;
                        byte b14 = bArr[i12];
                        if (b14 < 0) {
                            throw new ExceptionWithContext("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.offset));
                        }
                        i13 |= b14 << 28;
                        i12 = i19;
                    }
                } else {
                    i12 = i17;
                }
            } else {
                i13 = i16;
                i12 = i14;
            }
        }
        this.offset = i12 - i10;
        return i13;
    }

    public int readByte() {
        int i10 = this.offset;
        int i11 = this.dexBuf.readByte(i10);
        this.offset = i10 + 1;
        return i11;
    }

    public int readInt() {
        int i10 = this.offset;
        int i11 = this.dexBuf.readInt(i10);
        this.offset = i10 + 4;
        return i11;
    }

    public int readLargeUleb128() {
        return readUleb128(true);
    }

    public long readLong() {
        int i10 = this.offset;
        long j10 = this.dexBuf.readLong(i10);
        this.offset = i10 + 8;
        return j10;
    }

    public int readOptionalUint() {
        int i10 = this.offset;
        int optionalUint = this.dexBuf.readOptionalUint(i10);
        this.offset = i10 + 4;
        return optionalUint;
    }

    public int readShort() {
        int i10 = this.offset;
        int i11 = this.dexBuf.readShort(i10);
        this.offset = i10 + 2;
        return i11;
    }

    public int readSizedInt(int i10) {
        int i11;
        int i12;
        int i13;
        T t3 = this.dexBuf;
        int i14 = t3.baseOffset;
        int i15 = this.offset + i14;
        byte[] bArr = t3.buf;
        if (i10 != 1) {
            if (i10 == 2) {
                i12 = bArr[i15] & 255;
                i13 = bArr[i15 + 1] << 8;
            } else if (i10 == 3) {
                i12 = (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8);
                i13 = bArr[i15 + 2] << 16;
            } else {
                if (i10 != 4) {
                    throw new ExceptionWithContext("Invalid size %d for sized int at offset 0x%x", Integer.valueOf(i10), Integer.valueOf(this.offset));
                }
                i12 = (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
                i13 = bArr[i15 + 3] << 24;
            }
            i11 = i13 | i12;
        } else {
            i11 = bArr[i15];
        }
        this.offset = (i15 + i10) - i14;
        return i11;
    }

    public long readSizedLong(int i10) {
        int i11;
        int i12;
        int i13;
        long j10;
        long j11;
        long j12;
        T t3 = this.dexBuf;
        int i14 = t3.baseOffset;
        int i15 = this.offset + i14;
        byte[] bArr = t3.buf;
        switch (i10) {
            case 1:
                i11 = bArr[i15];
                j10 = i11;
                this.offset = (i15 + i10) - i14;
                return j10;
            case 2:
                i12 = bArr[i15] & 255;
                i13 = bArr[i15 + 1] << 8;
                i11 = i13 | i12;
                j10 = i11;
                this.offset = (i15 + i10) - i14;
                return j10;
            case 3:
                i12 = (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8);
                i13 = bArr[i15 + 2] << 16;
                i11 = i13 | i12;
                j10 = i11;
                this.offset = (i15 + i10) - i14;
                return j10;
            case 4:
                j11 = (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16);
                j12 = bArr[i15 + 3] << 24;
                j10 = j11 | j12;
                this.offset = (i15 + i10) - i14;
                return j10;
            case 5:
                j11 = (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16) | ((255 & bArr[i15 + 3]) << 24);
                j12 = bArr[i15 + 4] << 32;
                j10 = j11 | j12;
                this.offset = (i15 + i10) - i14;
                return j10;
            case 6:
                j10 = (bArr[i15 + 5] << 40) | ((bArr[i15 + 4] & 255) << 32) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16) | ((bArr[i15 + 3] & 255) << 24);
                this.offset = (i15 + i10) - i14;
                return j10;
            case 7:
                j10 = ((bArr[i15 + 4] & 255) << 32) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16) | ((bArr[i15 + 3] & 255) << 24) | ((255 & bArr[i15 + 5]) << 40) | (bArr[i15 + 6] << 48);
                this.offset = (i15 + i10) - i14;
                return j10;
            case 8:
                j11 = ((bArr[i15 + 4] & 255) << 32) | (bArr[i15] & 255) | ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15 + 2] & 255) << 16) | ((bArr[i15 + 3] & 255) << 24) | ((bArr[i15 + 5] & 255) << 40) | ((bArr[i15 + 6] & 255) << 48);
                j12 = bArr[i15 + 7] << 56;
                j10 = j11 | j12;
                this.offset = (i15 + i10) - i14;
                return j10;
            default:
                throw new ExceptionWithContext("Invalid size %d for sized long at offset 0x%x", Integer.valueOf(i10), Integer.valueOf(this.offset));
        }
    }

    public int readSizedRightExtendedInt(int i10) {
        int i11;
        int i12;
        byte b10;
        T t3 = this.dexBuf;
        int i13 = t3.baseOffset;
        int i14 = this.offset + i13;
        byte[] bArr = t3.buf;
        if (i10 != 1) {
            if (i10 == 2) {
                i12 = (bArr[i14] & 255) << 16;
                b10 = bArr[i14 + 1];
            } else if (i10 == 3) {
                i12 = ((bArr[i14] & 255) << 8) | ((bArr[i14 + 1] & 255) << 16);
                b10 = bArr[i14 + 2];
            } else {
                if (i10 != 4) {
                    throw new ExceptionWithContext("Invalid size %d for sized, right extended int at offset 0x%x", Integer.valueOf(i10), Integer.valueOf(this.offset));
                }
                i12 = (bArr[i14] & 255) | ((bArr[i14 + 1] & 255) << 8) | ((bArr[i14 + 2] & 255) << 16);
                b10 = bArr[i14 + 3];
            }
            i11 = (b10 << 24) | i12;
        } else {
            i11 = bArr[i14] << 24;
        }
        this.offset = (i14 + i10) - i13;
        return i11;
    }

    public long readSizedRightExtendedLong(int i10) {
        long j10;
        long j11;
        byte b10;
        T t3 = this.dexBuf;
        int i11 = t3.baseOffset;
        int i12 = this.offset + i11;
        byte[] bArr = t3.buf;
        switch (i10) {
            case 1:
                j10 = bArr[i12] << 56;
                this.offset = (i12 + i10) - i11;
                return j10;
            case 2:
                j11 = (bArr[i12] & 255) << 48;
                b10 = bArr[i12 + 1];
                j10 = j11 | (b10 << 56);
                this.offset = (i12 + i10) - i11;
                return j10;
            case 3:
                j11 = ((bArr[i12] & 255) << 40) | ((255 & bArr[i12 + 1]) << 48);
                b10 = bArr[i12 + 2];
                j10 = j11 | (b10 << 56);
                this.offset = (i12 + i10) - i11;
                return j10;
            case 4:
                j11 = ((bArr[i12] & 255) << 32) | ((bArr[i12 + 1] & 255) << 40) | ((255 & bArr[i12 + 2]) << 48);
                b10 = bArr[i12 + 3];
                j10 = j11 | (b10 << 56);
                this.offset = (i12 + i10) - i11;
                return j10;
            case 5:
                j11 = ((bArr[i12 + 1] & 255) << 32) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 2] & 255) << 40) | ((255 & bArr[i12 + 3]) << 48);
                b10 = bArr[i12 + 4];
                j10 = j11 | (b10 << 56);
                this.offset = (i12 + i10) - i11;
                return j10;
            case 6:
                j11 = ((bArr[i12 + 2] & 255) << 32) | ((bArr[i12] & 255) << 16) | ((bArr[i12 + 1] & 255) << 24) | ((bArr[i12 + 3] & 255) << 40) | ((255 & bArr[i12 + 4]) << 48);
                b10 = bArr[i12 + 5];
                j10 = j11 | (b10 << 56);
                this.offset = (i12 + i10) - i11;
                return j10;
            case 7:
                j11 = ((bArr[i12 + 3] & 255) << 32) | ((bArr[i12] & 255) << 8) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 24) | ((bArr[i12 + 4] & 255) << 40) | ((255 & bArr[i12 + 5]) << 48);
                b10 = bArr[i12 + 6];
                j10 = j11 | (b10 << 56);
                this.offset = (i12 + i10) - i11;
                return j10;
            case 8:
                j11 = ((bArr[i12 + 4] & 255) << 32) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 5] & 255) << 40) | ((255 & bArr[i12 + 6]) << 48);
                b10 = bArr[i12 + 7];
                j10 = j11 | (b10 << 56);
                this.offset = (i12 + i10) - i11;
                return j10;
            default:
                throw new ExceptionWithContext("Invalid size %d for sized, right extended long at offset 0x%x", Integer.valueOf(i10), Integer.valueOf(this.offset));
        }
    }

    public int readSizedSmallUint(int i10) {
        T t3 = this.dexBuf;
        int i11 = t3.baseOffset;
        int i12 = this.offset + i11;
        byte[] bArr = t3.buf;
        int i13 = 0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new ExceptionWithContext("Invalid size %d for sized uint at offset 0x%x", Integer.valueOf(i10), Integer.valueOf(this.offset));
                    }
                    byte b10 = bArr[i12 + 3];
                    if (b10 < 0) {
                        throw new ExceptionWithContext("Encountered valid sized uint that is out of range at offset 0x%x", Integer.valueOf(this.offset));
                    }
                    i13 = b10 << 24;
                }
                i13 |= (bArr[i12 + 2] & 255) << 16;
            }
            i13 |= (bArr[i12 + 1] & 255) << 8;
        }
        int i14 = (bArr[i12] & 255) | i13;
        this.offset = (i12 + i10) - i11;
        return i14;
    }

    public int readSleb128() {
        int i10;
        T t3 = this.dexBuf;
        int i11 = t3.baseOffset;
        int i12 = this.offset + i11;
        byte[] bArr = t3.buf;
        int i13 = i12 + 1;
        byte b10 = bArr[i12];
        int i14 = b10 & 255;
        if (i14 <= 127) {
            i10 = (i14 << 25) >> 25;
        } else {
            int i15 = i12 + 2;
            byte b11 = bArr[i13];
            int i16 = b11 & 255;
            int i17 = ((b11 & Byte.MAX_VALUE) << 7) | (b10 & Byte.MAX_VALUE);
            if (i16 <= 127) {
                i10 = (i17 << 18) >> 18;
            } else {
                int i18 = i12 + 3;
                byte b12 = bArr[i15];
                int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 14);
                if ((b12 & 255) <= 127) {
                    i10 = (i19 << 11) >> 11;
                    i13 = i18;
                } else {
                    i15 = i12 + 4;
                    byte b13 = bArr[i18];
                    int i20 = i19 | ((b13 & Byte.MAX_VALUE) << 21);
                    if ((b13 & 255) <= 127) {
                        i10 = (i20 << 4) >> 4;
                    } else {
                        int i21 = i12 + 5;
                        int i22 = bArr[i15] & 255;
                        if (i22 > 127) {
                            throw new ExceptionWithContext("Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.offset));
                        }
                        i10 = (i22 << 28) | i20;
                        i13 = i21;
                    }
                }
            }
            i13 = i15;
        }
        this.offset = i13 - i11;
        return i10;
    }

    public int readSmallUint() {
        int i10 = this.offset;
        int smallUint = this.dexBuf.readSmallUint(i10);
        this.offset = i10 + 4;
        return smallUint;
    }

    public int readSmallUleb128() {
        return readUleb128(false);
    }

    public String readString(int i10) {
        int[] iArr = new int[1];
        T t3 = this.dexBuf;
        String strUtf8BytesWithUtf16LengthToString = Utf8Utils.utf8BytesWithUtf16LengthToString(t3.buf, t3.baseOffset + this.offset, i10, iArr);
        this.offset += iArr[0];
        return strUtf8BytesWithUtf16LengthToString;
    }

    public int readUbyte() {
        int i10 = this.offset;
        int ubyte = this.dexBuf.readUbyte(i10);
        this.offset = i10 + 1;
        return ubyte;
    }

    public int readUshort() {
        int i10 = this.offset;
        int ushort = this.dexBuf.readUshort(i10);
        this.offset = i10 + 2;
        return ushort;
    }

    public void setOffset(int i10) {
        this.offset = i10;
    }

    public void skipByte() {
        this.offset++;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r4
      0x003a: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:5:0x0013, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void skipUleb128() {
        T t3 = this.dexBuf;
        int i10 = t3.baseOffset;
        int i11 = this.offset + i10;
        byte[] bArr = t3.buf;
        int i12 = i11 + 1;
        if (bArr[i11] < 0) {
            int i13 = i11 + 2;
            if (bArr[i12] < 0) {
                i12 = i11 + 3;
                if (bArr[i13] < 0) {
                    i13 = i11 + 4;
                    if (bArr[i12] < 0) {
                        i12 = i11 + 5;
                        if (bArr[i13] < 0) {
                            throw new ExceptionWithContext("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.offset));
                        }
                    } else {
                        i12 = i13;
                    }
                }
            }
        }
        this.offset = i12 - i10;
    }

    public int readByte(int i10) {
        return this.dexBuf.readByte(i10);
    }

    public int readInt(int i10) {
        return this.dexBuf.readInt(i10);
    }

    public long readLong(int i10) {
        return this.dexBuf.readLong(i10);
    }

    public int readShort(int i10) {
        return this.dexBuf.readShort(i10);
    }

    public int readSmallUint(int i10) {
        return this.dexBuf.readSmallUint(i10);
    }

    public int readUbyte(int i10) {
        return this.dexBuf.readUbyte(i10);
    }

    public int readUshort(int i10) {
        return this.dexBuf.readUshort(i10);
    }
}
