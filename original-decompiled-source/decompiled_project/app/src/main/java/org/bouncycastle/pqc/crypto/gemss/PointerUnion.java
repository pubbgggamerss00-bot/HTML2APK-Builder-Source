package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
class PointerUnion extends Pointer {
    protected int remainder;

    public PointerUnion(int i10) {
        super((i10 >>> 3) + ((i10 & 7) != 0 ? 1 : 0));
        this.remainder = 0;
    }

    public void changeIndex(PointerUnion pointerUnion) {
        this.array = pointerUnion.array;
        this.cp = pointerUnion.cp;
        this.remainder = pointerUnion.remainder;
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void fill(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.remainder;
        if (i13 != 0) {
            int i14 = this.cp + i10;
            long[] jArr = this.array;
            jArr[i14] = jArr[i14] & (~((-1) << (i13 << 3)));
            int i15 = 0;
            while (i13 < 8 && i15 < i12) {
                long[] jArr2 = this.array;
                jArr2[i14] = jArr2[i14] | ((bArr[i11] & 255) << (i13 << 3));
                i11++;
                i15++;
                i13++;
            }
            i10++;
            i12 -= 8 - this.remainder;
        }
        super.fill(i10, bArr, i11, i12);
    }

    public void fillBytes(int i10, byte[] bArr, int i11, int i12) {
        int i13 = i10 + this.remainder;
        int i14 = this.cp + (i13 >>> 3);
        int i15 = i13 & 7;
        if (i15 != 0) {
            long[] jArr = this.array;
            jArr[i14] = jArr[i14] & (~((-1) << (i15 << 3)));
            int i16 = 0;
            while (i15 < 8 && i16 < i12) {
                long[] jArr2 = this.array;
                jArr2[i14] = jArr2[i14] | ((bArr[i11] & 255) << (i15 << 3));
                i11++;
                i16++;
                i15++;
            }
            i14++;
            i12 -= i16;
        }
        super.fill(i14 - this.cp, bArr, i11, i12);
    }

    public void fillRandomBytes(int i10, SecureRandom secureRandom, int i11) {
        byte[] bArr = new byte[i11];
        secureRandom.nextBytes(bArr);
        fillBytes(i10, bArr, 0, i11);
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public long get() {
        int i10 = this.remainder;
        if (i10 == 0) {
            return this.array[this.cp];
        }
        long[] jArr = this.array;
        int i11 = this.cp;
        return (jArr[i11 + 1] << ((8 - i10) << 3)) | (jArr[i11] >>> (i10 << 3));
    }

    public byte getByte() {
        return (byte) (this.array[this.cp] >>> (this.remainder << 3));
    }

    public long getWithCheck() {
        int i10 = this.cp;
        long[] jArr = this.array;
        if (i10 >= jArr.length) {
            return 0L;
        }
        int i11 = this.remainder;
        if (i11 == 0) {
            return jArr[i10];
        }
        if (i10 == jArr.length - 1) {
            return jArr[i10] >>> (i11 << 3);
        }
        return (jArr[i10 + 1] << ((8 - i11) << 3)) | (jArr[i10] >>> (i11 << 3));
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void indexReset() {
        this.cp = 0;
        this.remainder = 0;
    }

    public void moveNextByte() {
        int i10 = this.remainder + 1;
        this.cp += i10 >>> 3;
        this.remainder = i10 & 7;
    }

    public void moveNextBytes(int i10) {
        int i11 = this.remainder + i10;
        this.cp += i11 >>> 3;
        this.remainder = i11 & 7;
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void set(int i10, long j10) {
        int i11 = this.remainder;
        if (i11 == 0) {
            super.setXor(i10, j10);
            return;
        }
        int i12 = i11 << 3;
        int i13 = (8 - i11) << 3;
        long[] jArr = this.array;
        int i14 = this.cp;
        jArr[i14 + i10] = (j10 << i12) | (jArr[i14 + i10] & ((-1) >>> i13));
        jArr[i14 + i10 + 1] = (((-1) << i12) & jArr[i14 + i10 + 1]) | (j10 >>> i13);
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setAnd(int i10, long j10) {
        int i11 = this.remainder;
        if (i11 == 0) {
            super.setAnd(i10, j10);
            return;
        }
        int i12 = i11 << 3;
        int i13 = (8 - i11) << 3;
        long[] jArr = this.array;
        int i14 = this.cp;
        int i15 = i14 + i10;
        jArr[i15] = jArr[i15] & ((j10 << i12) | ((-1) >>> i13));
        int i16 = i14 + i10 + 1;
        jArr[i16] = (((-1) << i12) | (j10 >>> i13)) & jArr[i16];
    }

    public void setAndByte(int i10, long j10) {
        int i11 = i10 + this.remainder + (this.cp << 3);
        int i12 = i11 >>> 3;
        long[] jArr = this.array;
        int i13 = (i11 & 7) << 3;
        jArr[i12] = (((j10 & 255) << i13) | (~(255 << i13))) & jArr[i12];
    }

    public void setAndThenXorByte(int i10, long j10, long j11) {
        int i11 = i10 + this.remainder + (this.cp << 3);
        int i12 = i11 >>> 3;
        long[] jArr = this.array;
        int i13 = (i11 & 7) << 3;
        long j12 = (((j10 & 255) << i13) | (~(255 << i13))) & jArr[i12];
        jArr[i12] = j12;
        jArr[i12] = j12 ^ ((j11 & 255) << i13);
    }

    public void setByte(int i10) {
        long[] jArr = this.array;
        int i11 = this.cp;
        long j10 = i10 & 255;
        int i12 = this.remainder;
        jArr[i11] = (j10 << (i12 << 3)) | (jArr[i11] & ((-1) >>> ((8 - i12) << 3)));
    }

    public void setByteIndex(int i10) {
        this.remainder = i10 & 7;
        this.cp = i10 >>> 3;
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setRangeClear(int i10, int i11) {
        int i12 = this.remainder;
        if (i12 == 0) {
            super.setRangeClear(i10, i11);
            return;
        }
        long[] jArr = this.array;
        int i13 = this.cp + i10;
        jArr[i13] = jArr[i13] & ((-1) >>> ((8 - i12) << 3));
        super.setRangeClear(i10 + 1, i11);
        long[] jArr2 = this.array;
        int i14 = this.cp + i11 + 1;
        jArr2[i14] = jArr2[i14] & ((-1) << (this.remainder << 3));
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setXor(int i10, long j10) {
        int i11 = this.remainder;
        if (i11 == 0) {
            super.setXor(i10, j10);
            return;
        }
        long[] jArr = this.array;
        int i12 = this.cp;
        int i13 = i12 + i10;
        jArr[i13] = jArr[i13] ^ (j10 << (i11 << 3));
        int i14 = i12 + i10 + 1;
        jArr[i14] = (j10 >>> ((8 - i11) << 3)) ^ jArr[i14];
    }

    public void setXorByte(int i10) {
        long[] jArr = this.array;
        int i11 = this.cp;
        jArr[i11] = jArr[i11] ^ ((i10 & 255) << (this.remainder << 3));
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setXorRangeAndMask(Pointer pointer, int i10, long j10) {
        int i11 = this.remainder;
        if (i11 == 0) {
            super.setXorRangeAndMask(pointer, i10, j10);
            return;
        }
        int i12 = this.cp;
        int i13 = pointer.cp;
        int i14 = i11 << 3;
        int i15 = (8 - i11) << 3;
        int i16 = 0;
        while (i16 < i10) {
            int i17 = i13 + 1;
            long j11 = pointer.array[i13] & j10;
            long[] jArr = this.array;
            jArr[i12] = jArr[i12] ^ (j11 << i14);
            i12++;
            jArr[i12] = (j11 >>> i15) ^ jArr[i12];
            i16++;
            i13 = i17;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public byte[] toBytes(int i10) {
        byte[] bArr = new byte[i10];
        int i11 = this.remainder;
        while (true) {
            int i12 = this.remainder;
            if (i11 >= i10 + i12) {
                return bArr;
            }
            bArr[i11 - i12] = (byte) (this.array[this.cp + (i11 >>> 3)] >>> ((i11 & 7) << 3));
            i11++;
        }
    }

    public int toBytesMove(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i10 + 1;
            long[] jArr = this.array;
            int i14 = this.cp;
            long j10 = jArr[i14];
            int i15 = this.remainder + 1;
            this.remainder = i15;
            bArr[i10] = (byte) (j10 >>> (r3 << 3));
            if (i15 == 8) {
                this.remainder = 0;
                this.cp = i14 + 1;
            }
            i12++;
            i10 = i13;
        }
        return i10;
    }

    public PointerUnion(Pointer pointer) {
        super(pointer);
        this.remainder = 0;
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public long get(int i10) {
        int i11 = this.remainder;
        if (i11 == 0) {
            return this.array[this.cp + i10];
        }
        long[] jArr = this.array;
        int i12 = this.cp;
        return (jArr[(i12 + i10) + 1] << ((8 - i11) << 3)) | (jArr[i12 + i10] >>> (i11 << 3));
    }

    public byte getByte(int i10) {
        int i11 = this.cp;
        int i12 = this.remainder;
        return (byte) (this.array[i11 + ((i10 + i12) >>> 3)] >>> (((i12 + i10) & 7) << 3));
    }

    public long getWithCheck(int i10) {
        int i11 = i10 + this.cp;
        long[] jArr = this.array;
        if (i11 >= jArr.length) {
            return 0L;
        }
        int i12 = this.remainder;
        if (i12 == 0) {
            return jArr[i11];
        }
        if (i11 == jArr.length - 1) {
            return jArr[i11] >>> (i12 << 3);
        }
        return (jArr[i11 + 1] << ((8 - i12) << 3)) | (jArr[i11] >>> (i12 << 3));
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setXor(long j10) {
        int i10 = this.remainder;
        if (i10 == 0) {
            super.setXor(j10);
            return;
        }
        long[] jArr = this.array;
        int i11 = this.cp;
        jArr[i11] = jArr[i11] ^ (j10 << (i10 << 3));
        int i12 = i11 + 1;
        jArr[i12] = (j10 >>> ((8 - i10) << 3)) ^ jArr[i12];
    }

    public PointerUnion(PointerUnion pointerUnion) {
        super(pointerUnion);
        this.remainder = pointerUnion.remainder;
    }

    public PointerUnion(byte[] bArr) {
        super((bArr.length >> 3) + ((bArr.length & 7) != 0 ? 1 : 0));
        int i10 = 0;
        for (int i11 = 0; i10 < bArr.length && i11 < this.array.length; i11++) {
            int i12 = 0;
            while (i12 < 8 && i10 < bArr.length) {
                long[] jArr = this.array;
                jArr[i11] = jArr[i11] | ((bArr[i10] & 255) << (i12 << 3));
                i12++;
                i10++;
            }
        }
        this.remainder = 0;
    }
}
