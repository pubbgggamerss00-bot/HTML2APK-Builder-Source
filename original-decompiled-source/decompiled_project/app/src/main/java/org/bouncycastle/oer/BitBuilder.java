package org.bouncycastle.oer;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
public class BitBuilder {
    private static final byte[] bits = {Byte.MIN_VALUE, 64, 32, RegisterType.UNINIT_REF, 8, 4, 2, 1};
    byte[] buf = new byte[1];
    int pos = 0;

    public void pad() {
        int i10 = this.pos;
        this.pos = (i10 % 8) + i10;
    }

    public int write(OutputStream outputStream) throws IOException {
        int i10 = this.pos;
        int i11 = ((i10 % 8) + i10) / 8;
        outputStream.write(this.buf, 0, i11);
        outputStream.flush();
        return i11;
    }

    public void write7BitBytes(int i10) {
        boolean z10 = false;
        for (int i11 = 4; i11 >= 0; i11--) {
            if (!z10 && ((-33554432) & i10) != 0) {
                z10 = true;
            }
            if (z10) {
                writeBit(i11).writeBits(i10, 32, 7);
            }
            i10 <<= 7;
        }
    }

    public int writeAndClear(OutputStream outputStream) throws IOException {
        int i10 = this.pos;
        int i11 = ((i10 % 8) + i10) / 8;
        outputStream.write(this.buf, 0, i11);
        outputStream.flush();
        zero();
        return i11;
    }

    public BitBuilder writeBit(int i10) {
        int i11 = this.pos;
        int i12 = i11 / 8;
        byte[] bArr = this.buf;
        if (i12 >= bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, i11 / 8);
            Arrays.clear(this.buf);
            this.buf = bArr2;
        }
        if (i10 == 0) {
            byte[] bArr3 = this.buf;
            int i13 = this.pos;
            int i14 = i13 / 8;
            bArr3[i14] = (byte) ((~bits[i13 % 8]) & bArr3[i14]);
        } else {
            byte[] bArr4 = this.buf;
            int i15 = this.pos;
            int i16 = i15 / 8;
            bArr4[i16] = (byte) (bits[i15 % 8] | bArr4[i16]);
        }
        this.pos++;
        return this;
    }

    public BitBuilder writeBits(long j10, int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            writeBit(((1 << i11) & j10) > 0 ? 1 : 0);
        }
        return this;
    }

    public void zero() {
        Arrays.clear(this.buf);
        this.pos = 0;
    }

    public void write7BitBytes(BigInteger bigInteger) {
        int iBitLength = ((bigInteger.bitLength() % 8) + bigInteger.bitLength()) / 8;
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(254L).shiftLeft(iBitLength * 8);
        boolean z10 = false;
        while (iBitLength >= 0) {
            if (!z10 && bigInteger.and(bigIntegerShiftLeft).compareTo(BigInteger.ZERO) != 0) {
                z10 = true;
            }
            if (z10) {
                writeBit(iBitLength).writeBits(bigInteger.and(bigIntegerShiftLeft).shiftRight(r3 - 8).intValue(), 8, 7);
            }
            bigInteger = bigInteger.shiftLeft(7);
            iBitLength--;
        }
    }

    public BitBuilder writeBits(long j10, int i10, int i11) {
        for (int i12 = i10 - 1; i12 >= i10 - i11; i12--) {
            writeBit(((1 << i12) & j10) != 0 ? 1 : 0);
        }
        return this;
    }
}
