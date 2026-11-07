package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
class SSHBuffer {
    private final byte[] buffer;
    private int pos = 0;

    public SSHBuffer(byte[] bArr) {
        this.buffer = bArr;
    }

    public byte[] getBuffer() {
        return Arrays.clone(this.buffer);
    }

    public boolean hasRemaining() {
        return this.pos < this.buffer.length;
    }

    public BigInteger readBigNumPositive() {
        int u32 = readU32();
        int i10 = this.pos;
        int i11 = i10 + u32;
        byte[] bArr = this.buffer;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        int i12 = u32 + i10;
        this.pos = i12;
        return new BigInteger(1, Arrays.copyOfRange(bArr, i10, i12));
    }

    public byte[] readBlock() {
        int u32 = readU32();
        if (u32 == 0) {
            return new byte[0];
        }
        int i10 = this.pos;
        byte[] bArr = this.buffer;
        if (i10 > bArr.length - u32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i11 = u32 + i10;
        this.pos = i11;
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public byte[] readPaddedBlock() {
        return readPaddedBlock(8);
    }

    public String readString() {
        return Strings.fromByteArray(readBlock());
    }

    public int readU32() {
        int i10 = this.pos;
        byte[] bArr = this.buffer;
        if (i10 > bArr.length - 4) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        int i11 = i10 + 1;
        this.pos = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.pos = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.pos = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.pos = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public void skipBlock() {
        int u32 = readU32();
        int i10 = this.pos;
        if (i10 > this.buffer.length - u32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.pos = i10 + u32;
    }

    public SSHBuffer(byte[] bArr, byte[] bArr2) {
        this.buffer = bArr2;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.pos += bArr.length;
    }

    public byte[] readPaddedBlock(int i10) {
        int i11;
        int u32 = readU32();
        if (u32 == 0) {
            return new byte[0];
        }
        int i12 = this.pos;
        byte[] bArr = this.buffer;
        if (i12 > bArr.length - u32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        if (u32 % i10 != 0) {
            throw new IllegalArgumentException("missing padding");
        }
        int i13 = i12 + u32;
        this.pos = i13;
        if (u32 > 0 && (i11 = bArr[i13 - 1] & 255) > 0 && i11 < i10) {
            i13 -= i11;
            int i14 = 1;
            int i15 = i13;
            while (i14 <= i11) {
                if (i14 != (this.buffer[i15] & 255)) {
                    throw new IllegalArgumentException("incorrect padding");
                }
                i14++;
                i15++;
            }
        }
        return Arrays.copyOfRange(this.buffer, i12, i13);
    }
}
