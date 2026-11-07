package org.jf.dexlib2.dexbacked;

import java.util.Arrays;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class DexBuffer {
    final int baseOffset;
    final byte[] buf;

    public DexBuffer(byte[] bArr) {
        this(bArr, 0);
    }

    public int getBaseOffset() {
        return this.baseOffset;
    }

    public byte[] getBuf() {
        return this.buf;
    }

    public int readByte(int i10) {
        return this.buf[this.baseOffset + i10];
    }

    public byte[] readByteRange(int i10, int i11) {
        byte[] bArr = this.buf;
        int i12 = this.baseOffset;
        return Arrays.copyOfRange(bArr, i12 + i10, i12 + i10 + i11);
    }

    public int readInt(int i10) {
        byte[] bArr = this.buf;
        int i11 = i10 + this.baseOffset;
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public long readLong(int i10) {
        byte[] bArr = this.buf;
        int i11 = i10 + this.baseOffset;
        return (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48) | (bArr[i11 + 7] << 56);
    }

    public int readLongAsSmallUint(int i10) {
        byte[] bArr = this.buf;
        int i11 = i10 + this.baseOffset;
        long j10 = (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48) | (bArr[i11 + 7] << 56);
        if (j10 < 0 || j10 > 2147483647L) {
            throw new ExceptionWithContext("Encountered out-of-range ulong at offset 0x%x", Integer.valueOf(i11));
        }
        return (int) j10;
    }

    public int readOptionalUint(int i10) {
        byte[] bArr = this.buf;
        int i11 = i10 + this.baseOffset;
        int i12 = (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        if (i12 >= -1) {
            return i12;
        }
        throw new ExceptionWithContext("Encountered optional uint that is out of range at offset 0x%x", Integer.valueOf(i11));
    }

    public int readShort(int i10) {
        byte[] bArr = this.buf;
        int i11 = i10 + this.baseOffset;
        return (bArr[i11 + 1] << 8) | (bArr[i11] & 255);
    }

    public int readSmallUint(int i10) {
        byte[] bArr = this.buf;
        int i11 = i10 + this.baseOffset;
        int i12 = (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        if (i12 >= 0) {
            return i12;
        }
        throw new ExceptionWithContext("Encountered small uint that is out of range at offset 0x%x", Integer.valueOf(i11));
    }

    public int readUbyte(int i10) {
        return this.buf[i10 + this.baseOffset] & 255;
    }

    public int readUshort(int i10) {
        byte[] bArr = this.buf;
        int i11 = i10 + this.baseOffset;
        return ((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255);
    }

    public DexReader<? extends DexBuffer> readerAt(int i10) {
        return new DexReader<>(this, i10);
    }

    public DexBuffer(byte[] bArr, int i10) {
        this.buf = bArr;
        this.baseOffset = i10;
    }
}
