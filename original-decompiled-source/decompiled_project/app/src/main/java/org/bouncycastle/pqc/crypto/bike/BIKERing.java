package org.bouncycastle.pqc.crypto.bike;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class BIKERing {
    private static final int PERMUTATION_CUTOFF = 64;
    private final int bits;
    private final Map<Integer, Integer> halfPowers;
    private final int size;
    private final int sizeExt;

    public BIKERing(int i10) {
        HashMap map = new HashMap();
        this.halfPowers = map;
        if (((-65535) & i10) != 1) {
            throw new IllegalArgumentException();
        }
        this.bits = i10;
        int i11 = (i10 + 63) >>> 6;
        this.size = i11;
        this.sizeExt = i11 * 2;
        generateHalfPowersInv(map, i10);
    }

    private static int generateHalfPower(int i10, int i11, int i12) {
        int i13 = 1;
        while (i12 >= 32) {
            i13 = (int) ((((BodyPartID.bodyIdMax & (i11 * i13)) * i10) + i13) >>> 32);
            i12 -= 32;
        }
        if (i12 <= 0) {
            return i13;
        }
        return (int) ((((BodyPartID.bodyIdMax & ((i11 * i13) & ((-1) >>> (-i12)))) * i10) + i13) >>> i12);
    }

    private static void generateHalfPowersInv(Map<Integer, Integer> map, int i10) {
        int i11;
        int i12 = i10 - 2;
        int iNumberOfLeadingZeros = 32 - Integers.numberOfLeadingZeros(i12);
        int iInverse32 = Mod.inverse32(-i10);
        for (int i13 = 1; i13 < iNumberOfLeadingZeros; i13++) {
            int i14 = 1 << (i13 - 1);
            if (i14 >= 64 && !map.containsKey(Integers.valueOf(i14))) {
                map.put(Integers.valueOf(i14), Integers.valueOf(generateHalfPower(i10, iInverse32, i14)));
            }
            int i15 = 1 << i13;
            if ((i12 & i15) != 0 && (i11 = (i15 - 1) & i12) >= 64 && !map.containsKey(Integers.valueOf(i11))) {
                map.put(Integers.valueOf(i11), Integers.valueOf(generateHalfPower(i10, iInverse32, i11)));
            }
        }
    }

    private static int implModAdd(int i10, int i11, int i12) {
        int i13 = (i11 + i12) - i10;
        return i13 + (i10 & (i13 >> 31));
    }

    private static void implMulwAcc(long[] jArr, long j10, long j11, long[] jArr2, int i10) {
        long j12 = j10;
        jArr[1] = j11;
        for (int i11 = 2; i11 < 16; i11 += 2) {
            long j13 = jArr[i11 >>> 1] << 1;
            jArr[i11] = j13;
            jArr[i11 + 1] = j13 ^ j11;
        }
        int i12 = (int) j12;
        long j14 = jArr[i12 & 15] ^ (jArr[(i12 >>> 4) & 15] << 4);
        long j15 = 0;
        int i13 = 56;
        do {
            int i14 = (int) (j12 >>> i13);
            long j16 = jArr[i14 & 15] ^ (jArr[(i14 >>> 4) & 15] << 4);
            j14 ^= j16 << i13;
            j15 ^= j16 >>> (-i13);
            i13 -= 8;
        } while (i13 > 0);
        for (int i15 = 0; i15 < 7; i15++) {
            j12 = (j12 & (-72340172838076674L)) >>> 1;
            j15 ^= ((j11 << i15) >> 63) & j12;
        }
        jArr2[i10] = jArr2[i10] ^ j14;
        int i16 = i10 + 1;
        jArr2[i16] = jArr2[i16] ^ j15;
    }

    private void implPermute(long[] jArr, int i10, long[] jArr2) {
        int i11 = this.bits;
        int iIntValue = this.halfPowers.get(Integers.valueOf(i10)).intValue();
        int iImplModAdd = implModAdd(i11, iIntValue, iIntValue);
        int iImplModAdd2 = implModAdd(i11, iImplModAdd, iImplModAdd);
        int iImplModAdd3 = implModAdd(i11, iImplModAdd2, iImplModAdd2);
        int iImplModAdd4 = i11 - iImplModAdd3;
        int iImplModAdd5 = implModAdd(i11, iImplModAdd4, iIntValue);
        int iImplModAdd6 = implModAdd(i11, iImplModAdd4, iImplModAdd);
        int iImplModAdd7 = implModAdd(i11, iImplModAdd5, iImplModAdd);
        int iImplModAdd8 = implModAdd(i11, iImplModAdd4, iImplModAdd2);
        int iImplModAdd9 = implModAdd(i11, iImplModAdd5, iImplModAdd2);
        int iImplModAdd10 = implModAdd(i11, iImplModAdd6, iImplModAdd2);
        int iImplModAdd11 = implModAdd(i11, iImplModAdd7, iImplModAdd2);
        int i12 = 0;
        while (true) {
            int i13 = this.size;
            if (i12 >= i13) {
                int i14 = i13 - 1;
                jArr2[i14] = jArr2[i14] & ((-1) >>> (-i11));
                return;
            }
            long j10 = 0;
            for (int i15 = 0; i15 < 64; i15 += 8) {
                iImplModAdd4 = implModAdd(i11, iImplModAdd4, iImplModAdd3);
                iImplModAdd5 = implModAdd(i11, iImplModAdd5, iImplModAdd3);
                iImplModAdd6 = implModAdd(i11, iImplModAdd6, iImplModAdd3);
                iImplModAdd7 = implModAdd(i11, iImplModAdd7, iImplModAdd3);
                iImplModAdd8 = implModAdd(i11, iImplModAdd8, iImplModAdd3);
                iImplModAdd9 = implModAdd(i11, iImplModAdd9, iImplModAdd3);
                iImplModAdd10 = implModAdd(i11, iImplModAdd10, iImplModAdd3);
                iImplModAdd11 = implModAdd(i11, iImplModAdd11, iImplModAdd3);
                j10 = j10 | (((jArr[iImplModAdd4 >>> 6] >>> iImplModAdd4) & 1) << i15) | (((jArr[iImplModAdd5 >>> 6] >>> iImplModAdd5) & 1) << (i15 + 1)) | (((jArr[iImplModAdd6 >>> 6] >>> iImplModAdd6) & 1) << (i15 + 2)) | (((jArr[iImplModAdd7 >>> 6] >>> iImplModAdd7) & 1) << (i15 + 3)) | (((jArr[iImplModAdd8 >>> 6] >>> iImplModAdd8) & 1) << (i15 + 4)) | (((jArr[iImplModAdd9 >>> 6] >>> iImplModAdd9) & 1) << (i15 + 5)) | (((jArr[iImplModAdd10 >>> 6] >>> iImplModAdd10) & 1) << (i15 + 6)) | (((jArr[iImplModAdd11 >>> 6] >>> iImplModAdd11) & 1) << (i15 + 7));
            }
            jArr2[i12] = j10;
            i12++;
        }
    }

    private void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, this.size, jArr2, 0);
    }

    public void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < this.size; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public void addTo(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < this.size; i10++) {
            jArr2[i10] = jArr2[i10] ^ jArr[i10];
        }
    }

    public void copy(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < this.size; i10++) {
            jArr2[i10] = jArr[i10];
        }
    }

    public long[] create() {
        return new long[this.size];
    }

    public long[] createExt() {
        return new long[this.sizeExt];
    }

    public void decodeBytes(byte[] bArr, long[] jArr) {
        int i10 = this.bits & 63;
        Pack.littleEndianToLong(bArr, 0, jArr, 0, this.size - 1);
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, (this.size - 1) << 3, bArr2, 0, (i10 + 7) >>> 3);
        jArr[this.size - 1] = Pack.littleEndianToLong(bArr2, 0);
    }

    public byte[] encodeBitsTransposed(long[] jArr) {
        byte[] bArr = new byte[this.bits];
        bArr[0] = (byte) (jArr[0] & 1);
        int i10 = 1;
        while (true) {
            int i11 = this.bits;
            if (i10 >= i11) {
                return bArr;
            }
            bArr[i11 - i10] = (byte) ((jArr[i10 >>> 6] >>> (i10 & 63)) & 1);
            i10++;
        }
    }

    public void encodeBytes(long[] jArr, byte[] bArr) {
        int i10 = this.bits & 63;
        Pack.longToLittleEndian(jArr, 0, this.size - 1, bArr, 0);
        byte[] bArr2 = new byte[8];
        Pack.longToLittleEndian(jArr[this.size - 1], bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, (this.size - 1) << 3, (i10 + 7) >>> 3);
    }

    public int getSize() {
        return this.size;
    }

    public int getSizeExt() {
        return this.sizeExt;
    }

    public void implMultiplyAcc(long[] jArr, long[] jArr2, long[] jArr3) {
        int i10;
        long[] jArr4 = new long[16];
        int i11 = 0;
        for (int i12 = 0; i12 < this.size; i12++) {
            implMulwAcc(jArr4, jArr[i12], jArr2[i12], jArr3, i12 << 1);
        }
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        for (int i13 = 1; i13 < this.size; i13++) {
            int i14 = i13 << 1;
            j10 ^= jArr3[i14];
            jArr3[i13] = j10 ^ j11;
            j11 ^= jArr3[i14 + 1];
        }
        long j12 = j10 ^ j11;
        while (true) {
            i10 = this.size;
            if (i11 >= i10) {
                break;
            }
            jArr3[i10 + i11] = jArr3[i11] ^ j12;
            i11++;
        }
        int i15 = i10 - 1;
        for (int i16 = 1; i16 < i15 * 2; i16++) {
            int iMin = Math.min(i15, i16);
            int i17 = i16 - iMin;
            while (i17 < iMin) {
                implMulwAcc(jArr4, jArr[i17] ^ jArr[iMin], jArr2[i17] ^ jArr2[iMin], jArr3, i16);
                i17++;
                iMin--;
            }
        }
    }

    public void inv(long[] jArr, long[] jArr2) {
        long[] jArrCreate = create();
        long[] jArrCreate2 = create();
        long[] jArrCreate3 = create();
        copy(jArr, jArrCreate);
        copy(jArr, jArrCreate3);
        int i10 = this.bits - 2;
        int iNumberOfLeadingZeros = 32 - Integers.numberOfLeadingZeros(i10);
        for (int i11 = 1; i11 < iNumberOfLeadingZeros; i11++) {
            squareN(jArrCreate, 1 << (i11 - 1), jArrCreate2);
            multiply(jArrCreate, jArrCreate2, jArrCreate);
            int i12 = 1 << i11;
            if ((i10 & i12) != 0) {
                squareN(jArrCreate, (i12 - 1) & i10, jArrCreate2);
                multiply(jArrCreate3, jArrCreate2, jArrCreate3);
            }
        }
        square(jArrCreate3, jArr2);
    }

    public void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt = createExt();
        implMultiplyAcc(jArr, jArr2, jArrCreateExt);
        reduce(jArrCreateExt, jArr3);
    }

    public void reduce(long[] jArr, long[] jArr2) {
        int i10 = 64 - (this.bits & 63);
        int i11 = this.size;
        Nat.shiftUpBits64(i11, jArr, i11, i10, jArr[i11 - 1], jArr2, 0);
        addTo(jArr, jArr2);
        int i12 = this.size - 1;
        jArr2[i12] = jArr2[i12] & ((-1) >>> i10);
    }

    public void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt = createExt();
        implSquare(jArr, jArrCreateExt);
        reduce(jArrCreateExt, jArr2);
    }

    public void squareN(long[] jArr, int i10, long[] jArr2) {
        if (i10 >= 64) {
            implPermute(jArr, i10, jArr2);
            return;
        }
        long[] jArrCreateExt = createExt();
        implSquare(jArr, jArrCreateExt);
        while (true) {
            reduce(jArrCreateExt, jArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt);
            }
        }
    }
}
