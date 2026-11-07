package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Pointer {
    protected long[] array;
    protected int cp;

    public Pointer() {
        this.cp = 0;
    }

    public void changeIndex(int i10) {
        this.cp = i10;
    }

    public void copyFrom(int i10, Pointer pointer, int i11, int i12) {
        System.arraycopy(pointer.array, pointer.cp + i11, this.array, this.cp + i10, i12);
    }

    public void fill(int i10, byte[] bArr, int i11, int i12) {
        long[] jArr;
        int i13;
        int i14 = this.cp + i10;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            jArr = this.array;
            if (i14 >= jArr.length || (i13 = i16 + 8) > i12) {
                break;
            }
            jArr[i14] = Pack.littleEndianToLong(bArr, i11);
            i11 += 8;
            i14++;
            i16 = i13;
        }
        if (i16 >= i12 || i14 >= jArr.length) {
            return;
        }
        jArr[i14] = 0;
        while (i15 < 8 && i16 < i12) {
            long[] jArr2 = this.array;
            jArr2[i14] = jArr2[i14] | ((bArr[i11] & 255) << (i15 << 3));
            i15++;
            i11++;
            i16++;
        }
    }

    public void fillRandom(int i10, SecureRandom secureRandom, int i11) {
        byte[] bArr = new byte[i11];
        secureRandom.nextBytes(bArr);
        fill(i10, bArr, 0, i11);
    }

    public long get() {
        return this.array[this.cp];
    }

    public long[] getArray() {
        return this.array;
    }

    public int getD_for_not0_or_plus(int i10, int i11) {
        int i12 = this.cp;
        int i13 = 0;
        long jORBITS_UINT = 0;
        while (i11 > 0) {
            int i14 = i12 + 1;
            long j10 = this.array[i12];
            int i15 = 1;
            while (i15 < i10) {
                j10 |= this.array[i14];
                i15++;
                i14++;
            }
            jORBITS_UINT |= GeMSSUtils.ORBITS_UINT(j10);
            i13 = (int) (i13 + jORBITS_UINT);
            i11--;
            i12 = i14;
        }
        return i13;
    }

    public long getDotProduct(int i10, Pointer pointer, int i11, int i12) {
        int i13 = i10 + this.cp;
        int i14 = i11 + pointer.cp;
        int i15 = i13 + 1;
        int i16 = i14 + 1;
        long j10 = this.array[i13] & pointer.array[i14];
        int i17 = 1;
        while (i17 < i12) {
            j10 ^= this.array[i15] & pointer.array[i16];
            i17++;
            i16++;
            i15++;
        }
        return j10;
    }

    public int getIndex() {
        return this.cp;
    }

    public int getLength() {
        return this.array.length - this.cp;
    }

    public void indexReset() {
        this.cp = 0;
    }

    public int is0_gf2n(int i10, int i11) {
        long j10 = get(i10);
        for (int i12 = 1; i12 < i11; i12++) {
            j10 |= get(i10 + i12);
        }
        return (int) GeMSSUtils.NORBITS_UINT(j10);
    }

    public int isEqual_nocst_gf2(Pointer pointer, int i10) {
        int i11 = pointer.cp;
        int i12 = this.cp;
        int i13 = 0;
        while (i13 < i10) {
            int i14 = i12 + 1;
            int i15 = i11 + 1;
            if (this.array[i12] != pointer.array[i11]) {
                return 0;
            }
            i13++;
            i11 = i15;
            i12 = i14;
        }
        return 1;
    }

    public void move(int i10) {
        this.cp += i10;
    }

    public void moveIncremental() {
        this.cp++;
    }

    public int searchDegree(int i10, int i11, int i12) {
        while (is0_gf2n(i10 * i12, i12) != 0 && i10 >= i11) {
            i10--;
        }
        return i10;
    }

    public void set(int i10, long j10) {
        this.array[this.cp + i10] = j10;
    }

    public void set1_gf2n(int i10, int i11) {
        int i12 = this.cp + i10;
        int i13 = i12 + 1;
        this.array[i12] = 1;
        int i14 = 1;
        while (i14 < i11) {
            this.array[i13] = 0;
            i14++;
            i13++;
        }
    }

    public void setAnd(int i10, long j10) {
        long[] jArr = this.array;
        int i11 = this.cp + i10;
        jArr[i11] = jArr[i11] & j10;
    }

    public void setClear(int i10) {
        this.array[this.cp + i10] = 0;
    }

    public void setRangeClear(int i10, int i11) {
        int i12 = i10 + this.cp;
        Arrays.fill(this.array, i12, i11 + i12, 0L);
    }

    public void setRangeFromXor(int i10, Pointer pointer, int i11, Pointer pointer2, int i12, int i13) {
        int i14 = i10 + this.cp;
        int i15 = i11 + pointer.cp;
        int i16 = i12 + pointer2.cp;
        int i17 = 0;
        while (i17 < i13) {
            this.array[i14] = pointer.array[i15] ^ pointer2.array[i16];
            i17++;
            i14++;
            i16++;
            i15++;
        }
    }

    public void setRangeFromXorAndMask_xor(Pointer pointer, Pointer pointer2, long j10, int i10) {
        int i11 = this.cp;
        int i12 = pointer.cp;
        int i13 = pointer2.cp;
        int i14 = 0;
        while (i14 < i10) {
            long[] jArr = this.array;
            long[] jArr2 = pointer.array;
            long j11 = jArr2[i12];
            long[] jArr3 = pointer2.array;
            long j12 = (j11 ^ jArr3[i13]) & j10;
            jArr[i11] = j12;
            jArr2[i12] = j12 ^ jArr2[i12];
            jArr3[i13] = jArr3[i13] ^ jArr[i11];
            i14++;
            i13++;
            i11++;
            i12++;
        }
    }

    public void setRangePointerUnion(PointerUnion pointerUnion, int i10) {
        int i11 = pointerUnion.remainder;
        if (i11 == 0) {
            System.arraycopy(pointerUnion.array, pointerUnion.cp, this.array, this.cp, i10);
            return;
        }
        int i12 = (8 - i11) << 3;
        int i13 = i11 << 3;
        int i14 = this.cp;
        int i15 = pointerUnion.cp;
        int i16 = 0;
        while (i16 < i10) {
            long[] jArr = this.array;
            long[] jArr2 = pointerUnion.array;
            long j10 = jArr2[i15] >>> i13;
            i15++;
            jArr[i14] = j10 ^ (jArr2[i15] << i12);
            i16++;
            i14++;
        }
    }

    public void setRangePointerUnion_Check(PointerUnion pointerUnion, int i10, int i11) {
        int i12 = i11 & 63;
        int i13 = 64 - i12;
        int i14 = this.cp;
        int i15 = pointerUnion.cp;
        int i16 = pointerUnion.remainder;
        int i17 = 0;
        if (i16 == 0) {
            while (i17 < i10) {
                long[] jArr = pointerUnion.array;
                if (i15 >= jArr.length - 1) {
                    break;
                }
                long[] jArr2 = this.array;
                long j10 = jArr[i15] >>> i12;
                i15++;
                jArr2[i14] = j10 ^ (jArr[i15] << i13);
                i17++;
                i14++;
            }
            if (i17 < i10) {
                this.array[i14] = pointerUnion.array[i15] >>> i12;
                return;
            }
            return;
        }
        int i18 = i16 << 3;
        int i19 = (8 - i16) << 3;
        while (i17 < i10) {
            long[] jArr3 = pointerUnion.array;
            if (i15 >= jArr3.length - 2) {
                break;
            }
            long[] jArr4 = this.array;
            long j11 = jArr3[i15] >>> i18;
            int i20 = i15 + 1;
            long j12 = jArr3[i20];
            jArr4[i14] = ((j11 | (j12 << i19)) >>> i12) ^ (((j12 >>> i18) | (jArr3[i15 + 2] << i19)) << i13);
            i17++;
            i14++;
            i15 = i20;
        }
        if (i17 < i10) {
            long[] jArr5 = this.array;
            long[] jArr6 = pointerUnion.array;
            long j13 = jArr6[i15] >>> i18;
            long j14 = jArr6[i15 + 1];
            jArr5[i14] = ((j14 >>> i18) << i13) ^ (((j14 << i19) | j13) >>> i12);
        }
    }

    public void setRangeRotate(int i10, Pointer pointer, int i11, int i12, int i13) {
        int i14 = 64 - i13;
        int i15 = i10 + this.cp;
        int i16 = i11 + pointer.cp;
        int i17 = 0;
        while (i17 < i12) {
            long[] jArr = this.array;
            long[] jArr2 = pointer.array;
            long j10 = jArr2[i16] >>> i14;
            i16++;
            jArr[i15] = j10 ^ (jArr2[i16] << i13);
            i17++;
            i15++;
        }
    }

    public int setRange_xi(long j10, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            this.array[this.cp + i10] = -((j10 >>> i12) & 1);
            i12++;
            i10++;
        }
        return i10;
    }

    public void setXor(int i10, long j10) {
        long[] jArr = this.array;
        int i11 = this.cp + i10;
        jArr[i11] = jArr[i11] ^ j10;
    }

    public void setXorMatrix(Pointer pointer, int i10, int i11) {
        int i12 = this.cp;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i12;
            int i15 = 0;
            while (i15 < i10) {
                long[] jArr = this.array;
                long j10 = jArr[i14];
                long[] jArr2 = pointer.array;
                int i16 = pointer.cp;
                pointer.cp = i16 + 1;
                jArr[i14] = j10 ^ jArr2[i16];
                i15++;
                i14++;
            }
        }
        this.cp += i10;
    }

    public void setXorMatrix_NoMove(Pointer pointer, int i10, int i11) {
        int i12 = this.cp;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i12;
            int i15 = 0;
            while (i15 < i10) {
                long[] jArr = this.array;
                long j10 = jArr[i14];
                long[] jArr2 = pointer.array;
                int i16 = pointer.cp;
                pointer.cp = i16 + 1;
                jArr[i14] = j10 ^ jArr2[i16];
                i15++;
                i14++;
            }
        }
    }

    public void setXorRange(int i10, Pointer pointer, int i11, int i12) {
        int i13 = i10 + this.cp;
        int i14 = i11 + pointer.cp;
        int i15 = 0;
        while (i15 < i12) {
            long[] jArr = this.array;
            jArr[i13] = jArr[i13] ^ pointer.array[i14];
            i15++;
            i13++;
            i14++;
        }
    }

    public void setXorRangeAndMask(Pointer pointer, int i10, long j10) {
        int i11 = this.cp;
        int i12 = pointer.cp;
        int i13 = 0;
        while (i13 < i10) {
            long[] jArr = this.array;
            jArr[i11] = jArr[i11] ^ (pointer.array[i12] & j10);
            i13++;
            i11++;
            i12++;
        }
    }

    public void setXorRangeAndMaskMove(Pointer pointer, int i10, long j10) {
        int i11 = this.cp;
        int i12 = 0;
        while (i12 < i10) {
            long[] jArr = this.array;
            long j11 = jArr[i11];
            long[] jArr2 = pointer.array;
            int i13 = pointer.cp;
            pointer.cp = i13 + 1;
            jArr[i11] = j11 ^ (jArr2[i13] & j10);
            i12++;
            i11++;
        }
    }

    public void setXorRangeXor(int i10, Pointer pointer, int i11, Pointer pointer2, int i12, int i13) {
        int i14 = i10 + this.cp;
        int i15 = i11 + pointer.cp;
        int i16 = i12 + pointer2.cp;
        int i17 = 0;
        while (i17 < i13) {
            long[] jArr = this.array;
            jArr[i14] = (pointer2.array[i16] ^ pointer.array[i15]) ^ jArr[i14];
            i17++;
            i14++;
            i16++;
            i15++;
        }
    }

    public void setXorRange_SelfMove(Pointer pointer, int i10) {
        int i11 = pointer.cp;
        int i12 = 0;
        while (i12 < i10) {
            long[] jArr = this.array;
            int i13 = this.cp;
            this.cp = i13 + 1;
            jArr[i13] = jArr[i13] ^ pointer.array[i11];
            i12++;
            i11++;
        }
    }

    public void swap(Pointer pointer) {
        long[] jArr = pointer.array;
        int i10 = pointer.cp;
        pointer.array = this.array;
        pointer.cp = this.cp;
        this.array = jArr;
        this.cp = i10;
    }

    public byte[] toBytes(int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (this.array[this.cp + (i11 >>> 3)] >>> ((i11 & 7) << 3));
        }
        return bArr;
    }

    public Pointer(int i10) {
        this.array = new long[i10];
        this.cp = 0;
    }

    public void changeIndex(Pointer pointer) {
        this.array = pointer.array;
        this.cp = pointer.cp;
    }

    public void copyFrom(Pointer pointer, int i10) {
        System.arraycopy(pointer.array, pointer.cp, this.array, this.cp, i10);
    }

    public long get(int i10) {
        return this.array[this.cp + i10];
    }

    public void set(long j10) {
        this.array[this.cp] = j10;
    }

    public void setAnd(long j10) {
        long[] jArr = this.array;
        int i10 = this.cp;
        jArr[i10] = j10 & jArr[i10];
    }

    public void setRangeFromXor(Pointer pointer, Pointer pointer2, int i10) {
        int i11 = this.cp;
        int i12 = pointer.cp;
        int i13 = pointer2.cp;
        int i14 = 0;
        while (i14 < i10) {
            this.array[i11] = pointer2.array[i13] ^ pointer.array[i12];
            i14++;
            i11++;
            i13++;
            i12++;
        }
    }

    public void setRangePointerUnion(PointerUnion pointerUnion, int i10, int i11) {
        int i12 = i11 & 63;
        int i13 = 64 - i12;
        int i14 = this.cp;
        int i15 = pointerUnion.cp;
        int i16 = pointerUnion.remainder;
        int i17 = 0;
        if (i16 == 0) {
            while (i17 < i10) {
                long[] jArr = this.array;
                long[] jArr2 = pointerUnion.array;
                long j10 = jArr2[i15] >>> i12;
                i15++;
                jArr[i14] = j10 ^ (jArr2[i15] << i13);
                i17++;
                i14++;
            }
            return;
        }
        int i18 = i16 << 3;
        int i19 = (8 - i16) << 3;
        while (i17 < i10) {
            long[] jArr3 = this.array;
            long[] jArr4 = pointerUnion.array;
            long j11 = jArr4[i15] >>> i18;
            int i20 = i15 + 1;
            long j12 = jArr4[i20];
            jArr3[i14] = ((j11 | (j12 << i19)) >>> i12) ^ (((j12 >>> i18) | (jArr4[i15 + 2] << i19)) << i13);
            i17++;
            i14++;
            i15 = i20;
        }
    }

    public void setXor(long j10) {
        long[] jArr = this.array;
        int i10 = this.cp;
        jArr[i10] = j10 ^ jArr[i10];
    }

    public void setXorRange(int i10, PointerUnion pointerUnion, int i11, int i12) {
        int i13 = i10 + this.cp;
        int i14 = i11 + pointerUnion.cp;
        int i15 = pointerUnion.remainder;
        int i16 = 0;
        if (i15 == 0) {
            while (i16 < i12) {
                long[] jArr = this.array;
                jArr[i13] = jArr[i13] ^ pointerUnion.array[i14];
                i16++;
                i13++;
                i14++;
            }
            return;
        }
        int i17 = i15 << 3;
        int i18 = (8 - i15) << 3;
        while (i16 < i12) {
            long[] jArr2 = this.array;
            long j10 = jArr2[i13];
            long[] jArr3 = pointerUnion.array;
            long j11 = jArr3[i14] >>> i17;
            i14++;
            jArr2[i13] = j10 ^ (j11 | (jArr3[i14] << i18));
            i16++;
            i13++;
        }
    }

    public Pointer(Pointer pointer) {
        this.array = pointer.array;
        this.cp = pointer.cp;
    }

    public void changeIndex(Pointer pointer, int i10) {
        this.array = pointer.array;
        this.cp = pointer.cp + i10;
    }

    public void setXorRange(Pointer pointer, int i10) {
        int i11 = this.cp;
        int i12 = pointer.cp;
        int i13 = 0;
        while (i13 < i10) {
            long[] jArr = this.array;
            jArr[i11] = jArr[i11] ^ pointer.array[i12];
            i13++;
            i11++;
            i12++;
        }
    }

    public Pointer(Pointer pointer, int i10) {
        this.array = pointer.array;
        this.cp = pointer.cp + i10;
    }

    public void setXorRange(Pointer pointer, int i10, int i11) {
        int i12 = this.cp;
        int i13 = i10 + pointer.cp;
        int i14 = 0;
        while (i14 < i11) {
            long[] jArr = this.array;
            jArr[i12] = jArr[i12] ^ pointer.array[i13];
            i14++;
            i12++;
            i13++;
        }
    }
}
