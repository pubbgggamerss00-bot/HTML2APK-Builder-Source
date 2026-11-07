package org.bouncycastle.pqc.legacy.crypto.ntru;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class IndexGenerator {
    private int N;
    private BitString buf;

    /* renamed from: c, reason: collision with root package name */
    private int f20500c;
    private int hLen;
    private Digest hashAlg;
    private boolean initialized;
    private int minCallsR;
    private byte[] seed;
    private int totLen = 0;
    private int remLen = 0;
    private int counter = 0;

    public static class BitString {
        byte[] bytes = new byte[4];
        int lastByteBits;
        int numBytes;

        public void appendBits(byte b10) {
            int i10 = this.numBytes;
            byte[] bArr = this.bytes;
            if (i10 == bArr.length) {
                this.bytes = IndexGenerator.copyOf(bArr, bArr.length * 2);
            }
            int i11 = this.numBytes;
            if (i11 == 0) {
                this.numBytes = 1;
                this.bytes[0] = b10;
                this.lastByteBits = 8;
                return;
            }
            int i12 = this.lastByteBits;
            if (i12 == 8) {
                byte[] bArr2 = this.bytes;
                this.numBytes = i11 + 1;
                bArr2[i11] = b10;
                return;
            }
            byte[] bArr3 = this.bytes;
            int i13 = i11 - 1;
            int i14 = b10 & 255;
            bArr3[i13] = (byte) ((i14 << i12) | bArr3[i13]);
            this.numBytes = i11 + 1;
            bArr3[i11] = (byte) (i14 >> (8 - i12));
        }

        public byte[] getBytes() {
            return Arrays.clone(this.bytes);
        }

        public int getLeadingAsInt(int i10) {
            int i11 = (((this.numBytes - 1) * 8) + this.lastByteBits) - i10;
            int i12 = i11 / 8;
            int i13 = i11 % 8;
            int i14 = (this.bytes[i12] & 255) >>> i13;
            int i15 = 8 - i13;
            while (true) {
                i12++;
                if (i12 >= this.numBytes) {
                    return i14;
                }
                i14 |= (this.bytes[i12] & 255) << i15;
                i15 += 8;
            }
        }

        public BitString getTrailing(int i10) {
            int i11;
            BitString bitString = new BitString();
            int i12 = (i10 + 7) / 8;
            bitString.numBytes = i12;
            bitString.bytes = new byte[i12];
            int i13 = 0;
            while (true) {
                i11 = bitString.numBytes;
                if (i13 >= i11) {
                    break;
                }
                bitString.bytes[i13] = this.bytes[i13];
                i13++;
            }
            int i14 = i10 % 8;
            bitString.lastByteBits = i14;
            if (i14 == 0) {
                bitString.lastByteBits = 8;
                return bitString;
            }
            int i15 = 32 - i14;
            byte[] bArr = bitString.bytes;
            bArr[i11 - 1] = (byte) ((bArr[i11 - 1] << i15) >>> i15);
            return bitString;
        }

        public void appendBits(byte[] bArr) {
            for (int i10 = 0; i10 != bArr.length; i10++) {
                appendBits(bArr[i10]);
            }
        }
    }

    public IndexGenerator(byte[] bArr, NTRUEncryptionParameters nTRUEncryptionParameters) {
        this.seed = bArr;
        this.N = nTRUEncryptionParameters.N;
        this.f20500c = nTRUEncryptionParameters.f20505c;
        this.minCallsR = nTRUEncryptionParameters.minCallsR;
        Digest digest = nTRUEncryptionParameters.hashAlg;
        this.hashAlg = digest;
        this.hLen = digest.getDigestSize();
        this.initialized = false;
    }

    private void appendHash(BitString bitString, byte[] bArr) {
        Digest digest = this.hashAlg;
        byte[] bArr2 = this.seed;
        digest.update(bArr2, 0, bArr2.length);
        putInt(this.hashAlg, this.counter);
        this.hashAlg.doFinal(bArr, 0);
        bitString.appendBits(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] copyOf(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        if (i10 >= bArr.length) {
            i10 = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    private void putInt(Digest digest, int i10) {
        digest.update((byte) (i10 >> 24));
        digest.update((byte) (i10 >> 16));
        digest.update((byte) (i10 >> 8));
        digest.update((byte) i10);
    }

    public int nextIndex() {
        int leadingAsInt;
        int i10;
        int i11;
        int i12;
        if (!this.initialized) {
            this.buf = new BitString();
            byte[] bArr = new byte[this.hashAlg.getDigestSize()];
            while (true) {
                int i13 = this.counter;
                i12 = this.minCallsR;
                if (i13 >= i12) {
                    break;
                }
                appendHash(this.buf, bArr);
                this.counter++;
            }
            int i14 = i12 * 8 * this.hLen;
            this.totLen = i14;
            this.remLen = i14;
            this.initialized = true;
        }
        do {
            this.totLen += this.f20500c;
            BitString trailing = this.buf.getTrailing(this.remLen);
            int i15 = this.remLen;
            int i16 = this.f20500c;
            if (i15 < i16) {
                int i17 = i16 - i15;
                int i18 = this.counter;
                int i19 = this.hLen;
                int i20 = (((i17 + i19) - 1) / i19) + i18;
                byte[] bArr2 = new byte[this.hashAlg.getDigestSize()];
                while (this.counter < i20) {
                    appendHash(trailing, bArr2);
                    this.counter++;
                    int i21 = this.hLen;
                    if (i17 > i21 * 8) {
                        i17 -= i21 * 8;
                    }
                }
                this.remLen = (this.hLen * 8) - i17;
                BitString bitString = new BitString();
                this.buf = bitString;
                bitString.appendBits(bArr2);
            } else {
                this.remLen = i15 - i16;
            }
            leadingAsInt = trailing.getLeadingAsInt(this.f20500c);
            i10 = this.f20500c;
            i11 = this.N;
        } while (leadingAsInt >= (1 << i10) - ((1 << i10) % i11));
        return leadingAsInt % i11;
    }
}
