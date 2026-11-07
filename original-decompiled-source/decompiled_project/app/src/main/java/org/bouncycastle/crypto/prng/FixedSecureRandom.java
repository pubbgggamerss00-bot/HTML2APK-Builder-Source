package org.bouncycastle.crypto.prng;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class FixedSecureRandom extends SecureRandom {
    private byte[] _data;
    private int _index;
    private int _intPad;

    public FixedSecureRandom(boolean z10, byte[] bArr) {
        this(z10, new byte[][]{bArr});
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i10 = this._index;
        this._index = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i10) {
        byte[] bArr = new byte[i10];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        int iNextValue = (nextValue() << 24) | (nextValue() << 16);
        int i10 = this._intPad;
        if (i10 == 2) {
            this._intPad = i10 - 1;
        } else {
            iNextValue |= nextValue() << 8;
        }
        int i11 = this._intPad;
        if (i11 != 1) {
            return iNextValue | nextValue();
        }
        this._intPad = i11 - 1;
        return iNextValue;
    }

    @Override // java.util.Random
    public long nextLong() {
        return (nextValue() << 56) | (nextValue() << 48) | (nextValue() << 40) | (nextValue() << 32) | (nextValue() << 24) | (nextValue() << 16) | (nextValue() << 8) | nextValue();
    }

    public FixedSecureRandom(boolean z10, byte[][] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != bArr.length; i10++) {
            try {
                byteArrayOutputStream.write(bArr[i10]);
            } catch (IOException unused) {
                throw new IllegalArgumentException("can't save value array.");
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this._data = byteArray;
        if (z10) {
            this._intPad = byteArray.length % 4;
        }
    }

    public FixedSecureRandom(byte[] bArr) {
        this(false, new byte[][]{bArr});
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(false, bArr);
    }
}
