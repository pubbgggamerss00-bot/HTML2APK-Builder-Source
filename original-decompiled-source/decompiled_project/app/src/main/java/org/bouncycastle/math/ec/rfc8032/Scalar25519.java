package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes3.dex */
abstract class Scalar25519 {
    private static final int L0 = -50998291;
    private static final int L1 = 19280294;
    private static final int L2 = 127719000;
    private static final int L3 = -6428113;
    private static final int L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 32;
    static final int SIZE = 8;
    private static final int TARGET_LENGTH = 254;
    private static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    public static void getOrderWnafVar(int i10, byte[] bArr) {
        Wnaf.getSignedVar(L, i10, bArr);
    }

    public static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    public static byte[] reduce384(byte[] bArr) {
        long jDecode24 = Codec.decode24(bArr, 32) << 4;
        long j10 = jDecode24 & 4294967295L;
        long jDecode32 = Codec.decode32(bArr, 35);
        long j11 = jDecode32 & 4294967295L;
        long jDecode242 = Codec.decode24(bArr, 39) << 4;
        long j12 = jDecode242 & 4294967295L;
        long jDecode322 = Codec.decode32(bArr, 42);
        long jDecode16 = ((Codec.decode16(bArr, 46) << 4) & 4294967295L) + ((jDecode322 & 4294967295L) >> 28);
        long jDecode323 = (Codec.decode32(bArr, 28) & 4294967295L) - (jDecode16 * 5343);
        long j13 = (jDecode322 & M28L) + (j12 >> 28);
        long jDecode324 = ((Codec.decode32(bArr, 14) & 4294967295L) - (jDecode16 * (-50998291))) - (j13 * 19280294);
        long jDecode243 = (((Codec.decode24(bArr, 18) << 4) & 4294967295L) - (jDecode16 * 19280294)) - (j13 * 127719000);
        long jDecode325 = ((Codec.decode32(bArr, 21) & 4294967295L) - (jDecode16 * 127719000)) - (j13 * (-6428113));
        long jDecode244 = (((Codec.decode24(bArr, 25) << 4) & 4294967295L) - (jDecode16 * (-6428113))) - (j13 * 5343);
        long j14 = (jDecode242 & M28L) + (j11 >> 28);
        long jDecode326 = (Codec.decode32(bArr, 7) & 4294967295L) - (j14 * (-50998291));
        long jDecode245 = (((Codec.decode24(bArr, 11) << 4) & 4294967295L) - (j13 * (-50998291))) - (j14 * 19280294);
        long j15 = jDecode324 - (j14 * 127719000);
        long j16 = jDecode243 - (j14 * (-6428113));
        long j17 = jDecode325 - (j14 * 5343);
        long j18 = (jDecode32 & M28L) + (j10 >> 28);
        long j19 = jDecode24 & M28L;
        long jDecode246 = ((Codec.decode24(bArr, 4) << 4) & 4294967295L) - (j18 * (-50998291));
        long j20 = jDecode326 - (j18 * 19280294);
        long j21 = jDecode245 - (j18 * 127719000);
        long j22 = j15 - (j18 * (-6428113));
        long j23 = j16 - (j18 * 5343);
        long j24 = jDecode323 + (jDecode244 >> 28);
        long j25 = jDecode244 & M28L;
        long j26 = j19 + (j24 >> 28);
        long j27 = j24 & M28L;
        long j28 = j27 >>> 27;
        long j29 = j26 + j28;
        long jDecode327 = (Codec.decode32(bArr, 0) & 4294967295L) - (j29 * (-50998291));
        long j30 = j20 - (j29 * 127719000);
        long j31 = j21 - (j29 * (-6428113));
        long j32 = j22 - (j29 * 5343);
        long j33 = (jDecode246 - (j29 * 19280294)) + (jDecode327 >> 28);
        long j34 = jDecode327 & M28L;
        long j35 = j30 + (j33 >> 28);
        long j36 = j33 & M28L;
        long j37 = j31 + (j35 >> 28);
        long j38 = j35 & M28L;
        long j39 = j32 + (j37 >> 28);
        long j40 = j37 & M28L;
        long j41 = j23 + (j39 >> 28);
        long j42 = j39 & M28L;
        long j43 = j17 + (j41 >> 28);
        long j44 = j41 & M28L;
        long j45 = j25 + (j43 >> 28);
        long j46 = j43 & M28L;
        long j47 = j27 + (j45 >> 28);
        long j48 = j45 & M28L;
        long j49 = j47 >> 28;
        long j50 = j47 & M28L;
        long j51 = j49 - j28;
        long j52 = j34 + (j51 & (-50998291));
        long j53 = j36 + (j51 & 19280294) + (j52 >> 28);
        long j54 = j52 & M28L;
        long j55 = j38 + (j51 & 127719000) + (j53 >> 28);
        long j56 = j53 & M28L;
        long j57 = j40 + (j51 & (-6428113)) + (j55 >> 28);
        long j58 = j55 & M28L;
        long j59 = j42 + (j51 & 5343) + (j57 >> 28);
        long j60 = j57 & M28L;
        long j61 = j44 + (j59 >> 28);
        long j62 = j59 & M28L;
        long j63 = j46 + (j61 >> 28);
        long j64 = j61 & M28L;
        long j65 = j48 + (j63 >> 28);
        long j66 = j63 & M28L;
        long j67 = j50 + (j65 >> 28);
        long j68 = M28L & j65;
        byte[] bArr2 = new byte[64];
        Codec.encode56(j54 | (j56 << 28), bArr2, 0);
        Codec.encode56(j58 | (j60 << 28), bArr2, 7);
        Codec.encode56((j64 << 28) | j62, bArr2, 14);
        Codec.encode56((j68 << 28) | j66, bArr2, 21);
        Codec.encode32((int) j67, bArr2, 28);
        return bArr2;
    }

    public static byte[] reduce512(byte[] bArr) {
        long jDecode32 = Codec.decode32(bArr, 49);
        long j10 = jDecode32 & 4294967295L;
        long jDecode322 = Codec.decode32(bArr, 56);
        long j11 = bArr[63] & M08L;
        long jDecode24 = ((Codec.decode24(bArr, 60) << 4) & 4294967295L) + ((jDecode322 & 4294967295L) >> 28);
        long j12 = jDecode322 & M28L;
        long jDecode323 = ((Codec.decode32(bArr, 42) & 4294967295L) - (j11 * (-6428113))) - (jDecode24 * 5343);
        long jDecode324 = ((Codec.decode32(bArr, 28) & 4294967295L) - (jDecode24 * (-50998291))) - (j12 * 19280294);
        long jDecode242 = ((((Codec.decode24(bArr, 32) << 4) & 4294967295L) - (j11 * (-50998291))) - (jDecode24 * 19280294)) - (j12 * 127719000);
        long jDecode325 = (((Codec.decode32(bArr, 35) & 4294967295L) - (j11 * 19280294)) - (jDecode24 * 127719000)) - (j12 * (-6428113));
        long jDecode243 = ((((Codec.decode24(bArr, 39) << 4) & 4294967295L) - (j11 * 127719000)) - (jDecode24 * (-6428113))) - (j12 * 5343);
        long jDecode244 = ((Codec.decode24(bArr, 53) << 4) & 4294967295L) + (j10 >> 28);
        long j13 = jDecode32 & M28L;
        long j14 = jDecode325 - (jDecode244 * 5343);
        long j15 = (jDecode242 - (jDecode244 * (-6428113))) - (j13 * 5343);
        long jDecode245 = (((Codec.decode24(bArr, 46) << 4) & 4294967295L) - (j11 * 5343)) + (jDecode323 >> 28);
        long jDecode326 = (((Codec.decode32(bArr, 21) & 4294967295L) - (jDecode244 * (-50998291))) - (j13 * 19280294)) - (jDecode245 * 127719000);
        long jDecode246 = (((((Codec.decode24(bArr, 25) << 4) & 4294967295L) - (j12 * (-50998291))) - (jDecode244 * 19280294)) - (j13 * 127719000)) - (jDecode245 * (-6428113));
        long j16 = ((jDecode324 - (jDecode244 * 127719000)) - (j13 * (-6428113))) - (jDecode245 * 5343);
        long j17 = (jDecode323 & M28L) + (jDecode243 >> 28);
        long jDecode327 = ((Codec.decode32(bArr, 14) & 4294967295L) - (jDecode245 * (-50998291))) - (j17 * 19280294);
        long jDecode247 = ((((Codec.decode24(bArr, 18) << 4) & 4294967295L) - (j13 * (-50998291))) - (jDecode245 * 19280294)) - (j17 * 127719000);
        long j18 = jDecode246 - (j17 * 5343);
        long j19 = (jDecode243 & M28L) + (j14 >> 28);
        long jDecode328 = (Codec.decode32(bArr, 7) & 4294967295L) - (j19 * (-50998291));
        long jDecode248 = (((Codec.decode24(bArr, 11) << 4) & 4294967295L) - (j17 * (-50998291))) - (j19 * 19280294);
        long j20 = jDecode327 - (j19 * 127719000);
        long j21 = jDecode247 - (j19 * (-6428113));
        long j22 = (jDecode326 - (j17 * (-6428113))) - (j19 * 5343);
        long j23 = (j14 & M28L) + (j15 >> 28);
        long j24 = j15 & M28L;
        long jDecode249 = ((Codec.decode24(bArr, 4) << 4) & 4294967295L) - (j23 * (-50998291));
        long j25 = jDecode328 - (j23 * 19280294);
        long j26 = jDecode248 - (j23 * 127719000);
        long j27 = j20 - (j23 * (-6428113));
        long j28 = j21 - (j23 * 5343);
        long j29 = j16 + (j18 >> 28);
        long j30 = j18 & M28L;
        long j31 = j24 + (j29 >> 28);
        long j32 = j29 & M28L;
        long j33 = j32 >>> 27;
        long j34 = j31 + j33;
        long jDecode329 = (Codec.decode32(bArr, 0) & 4294967295L) - (j34 * (-50998291));
        long j35 = j25 - (j34 * 127719000);
        long j36 = j26 - (j34 * (-6428113));
        long j37 = j27 - (j34 * 5343);
        long j38 = (jDecode249 - (j34 * 19280294)) + (jDecode329 >> 28);
        long j39 = jDecode329 & M28L;
        long j40 = j35 + (j38 >> 28);
        long j41 = j38 & M28L;
        long j42 = j36 + (j40 >> 28);
        long j43 = j40 & M28L;
        long j44 = j37 + (j42 >> 28);
        long j45 = j42 & M28L;
        long j46 = j28 + (j44 >> 28);
        long j47 = j44 & M28L;
        long j48 = j22 + (j46 >> 28);
        long j49 = j46 & M28L;
        long j50 = j30 + (j48 >> 28);
        long j51 = j48 & M28L;
        long j52 = j32 + (j50 >> 28);
        long j53 = j50 & M28L;
        long j54 = j52 >> 28;
        long j55 = j52 & M28L;
        long j56 = j54 - j33;
        long j57 = j39 + (j56 & (-50998291));
        long j58 = j41 + (j56 & 19280294) + (j57 >> 28);
        long j59 = j57 & M28L;
        long j60 = j43 + (j56 & 127719000) + (j58 >> 28);
        long j61 = j58 & M28L;
        long j62 = j45 + (j56 & (-6428113)) + (j60 >> 28);
        long j63 = j60 & M28L;
        long j64 = j47 + (j56 & 5343) + (j62 >> 28);
        long j65 = j62 & M28L;
        long j66 = j49 + (j64 >> 28);
        long j67 = j64 & M28L;
        long j68 = j51 + (j66 >> 28);
        long j69 = j66 & M28L;
        long j70 = j53 + (j68 >> 28);
        long j71 = j68 & M28L;
        long j72 = j55 + (j70 >> 28);
        long j73 = j70 & M28L;
        byte[] bArr2 = new byte[32];
        Codec.encode56(j59 | (j61 << 28), bArr2, 0);
        Codec.encode56(j63 | (j65 << 28), bArr2, 7);
        Codec.encode56((j69 << 28) | j67, bArr2, 14);
        Codec.encode56((j73 << 28) | j71, bArr2, 21);
        Codec.encode32((int) j72, bArr2, 28);
        return bArr2;
    }

    public static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[4];
        System.arraycopy(iArr7, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        System.arraycopy(iArr, 0, iArr10, 0, 4);
        int[] iArr11 = new int[4];
        iArr11[0] = 1;
        int i10 = 1016;
        int[] iArr12 = iArr11;
        int[] iArr13 = new int[4];
        int[] iArr14 = iArr9;
        int[] iArr15 = iArr10;
        int i11 = 15;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr5;
        while (bitLengthPositive > TARGET_LENGTH) {
            i10--;
            if (i10 < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i11, iArr6) - bitLengthPositive;
            int i12 = bitLength & (~(bitLength >> 31));
            if (iArr6[i11] < 0) {
                ScalarUtil.addShifted_NP(i11, i12, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.addShifted_UV(3, i12, iArr14, iArr13, iArr15, iArr12);
            } else {
                ScalarUtil.subShifted_NP(i11, i12, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.subShifted_UV(3, i12, iArr14, iArr13, iArr15, iArr12);
            }
            int[] iArr18 = iArr15;
            int[] iArr19 = iArr12;
            if (ScalarUtil.lessThan(i11, iArr16, iArr17)) {
                int i13 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i13, iArr16);
                int[] iArr20 = iArr17;
                iArr17 = iArr16;
                iArr16 = iArr20;
                i11 = i13;
                bitLengthPositive = bitLengthPositive2;
                iArr15 = iArr14;
                iArr12 = iArr13;
                iArr13 = iArr19;
                iArr14 = iArr18;
            } else {
                iArr12 = iArr19;
                iArr15 = iArr18;
            }
        }
        System.arraycopy(iArr15, 0, iArr2, 0, 4);
        System.arraycopy(iArr12, 0, iArr3, 0, 4);
        return true;
    }

    public static void toSignedDigits(int i10, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
