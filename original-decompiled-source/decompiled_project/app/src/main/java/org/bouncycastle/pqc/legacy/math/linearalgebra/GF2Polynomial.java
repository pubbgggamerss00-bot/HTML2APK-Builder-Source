package org.bouncycastle.pqc.legacy.math.linearalgebra;

import i8.n;
import java.math.BigInteger;
import java.util.Random;
import k1.q;
import k3.a;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
public class GF2Polynomial {
    private int blocks;
    private int len;
    private int[] value;
    private static Random rand = new Random();
    private static final boolean[] parity = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private static final short[] squaringTable = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    private static final int[] bitMask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, PKIFailureInfo.transactionIdInUse, PKIFailureInfo.signerNotTrusted, PKIFailureInfo.badCertTemplate, PKIFailureInfo.badSenderNonce, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, PKIFailureInfo.duplicateCertReq, 1073741824, PKIFailureInfo.systemUnavail, 0};
    private static final int[] reverseRightMask = {0, 1, 3, 7, 15, 31, 63, CertificateBody.profileType, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

    public GF2Polynomial(int i10) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.blocks = i11;
        this.value = new int[i11];
        this.len = i10;
    }

    private void doShiftBlocksLeft(int i10) {
        int i11 = this.blocks;
        int[] iArr = this.value;
        if (i11 > iArr.length) {
            int[] iArr2 = new int[i11];
            System.arraycopy(iArr, 0, iArr2, i10, i11 - i10);
            this.value = iArr2;
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            int[] iArr3 = this.value;
            iArr3[i12] = iArr3[i12 - i10];
        }
        for (int i13 = 0; i13 < i10; i13++) {
            this.value[i13] = 0;
        }
    }

    private GF2Polynomial karaMult(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len << 1);
        int i10 = this.len;
        if (i10 <= 32) {
            gF2Polynomial2.value = mult32(this.value[0], gF2Polynomial.value[0]);
            return gF2Polynomial2;
        }
        if (i10 <= 64) {
            gF2Polynomial2.value = mult64(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i10 <= 128) {
            gF2Polynomial2.value = mult128(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i10 <= 256) {
            gF2Polynomial2.value = mult256(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i10 <= 512) {
            gF2Polynomial2.value = mult512(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        int i11 = bitMask[IntegerFunctions.floorLog(i10 - 1)];
        int i12 = ((i11 - 1) >> 5) + 1;
        GF2Polynomial gF2PolynomialLower = lower(i12);
        GF2Polynomial gF2PolynomialUpper = upper(i12);
        GF2Polynomial gF2PolynomialLower2 = gF2Polynomial.lower(i12);
        GF2Polynomial gF2PolynomialUpper2 = gF2Polynomial.upper(i12);
        GF2Polynomial gF2PolynomialKaraMult = gF2PolynomialUpper.karaMult(gF2PolynomialUpper2);
        GF2Polynomial gF2PolynomialKaraMult2 = gF2PolynomialLower.karaMult(gF2PolynomialLower2);
        gF2PolynomialLower.addToThis(gF2PolynomialUpper);
        gF2PolynomialLower2.addToThis(gF2PolynomialUpper2);
        GF2Polynomial gF2PolynomialKaraMult3 = gF2PolynomialLower.karaMult(gF2PolynomialLower2);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult, i11 << 1);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult, i11);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult3, i11);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult2, i11);
        gF2Polynomial2.addToThis(gF2PolynomialKaraMult2);
        return gF2Polynomial2;
    }

    private GF2Polynomial lower(int i10) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(i10 << 5);
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, Math.min(i10, this.blocks));
        return gF2Polynomial;
    }

    private static int[] mult128(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[2];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(2, iArr.length));
        int[] iArr5 = new int[2];
        if (iArr.length > 2) {
            System.arraycopy(iArr, 2, iArr5, 0, Math.min(2, iArr.length - 2));
        }
        int[] iArr6 = new int[2];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(2, iArr2.length));
        int[] iArr7 = new int[2];
        if (iArr2.length > 2) {
            System.arraycopy(iArr2, 2, iArr7, 0, Math.min(2, iArr2.length - 2));
        }
        if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i10 = iArr5[0];
            if (i10 != 0 || iArr7[0] != 0) {
                int[] iArrMult32 = mult32(i10, iArr7[0]);
                int i11 = iArr3[5];
                int i12 = iArrMult32[1];
                iArr3[5] = i11 ^ i12;
                int i13 = iArr3[4];
                int i14 = iArrMult32[0];
                iArr3[4] = i13 ^ i14;
                iArr3[3] = iArr3[3] ^ i12;
                iArr3[2] = i14 ^ iArr3[2];
            }
        } else {
            int[] iArrMult64 = mult64(iArr5, iArr7);
            int i15 = iArr3[7];
            int i16 = iArrMult64[3];
            iArr3[7] = i15 ^ i16;
            int i17 = iArr3[6];
            int i18 = iArrMult64[2];
            iArr3[6] = i17 ^ i18;
            int i19 = iArr3[5];
            int i20 = iArrMult64[1];
            iArr3[5] = i19 ^ (i16 ^ i20);
            int i21 = iArr3[4];
            int i22 = iArrMult64[0];
            iArr3[4] = i21 ^ (i22 ^ i18);
            iArr3[3] = iArr3[3] ^ i20;
            iArr3[2] = i22 ^ iArr3[2];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        int i23 = iArr7[0] ^ iArr6[0];
        iArr7[0] = i23;
        int i24 = iArr7[1] ^ iArr6[1];
        iArr7[1] = i24;
        if (iArr5[1] == 0 && i24 == 0) {
            int[] iArrMult322 = mult32(iArr5[0], i23);
            iArr3[3] = iArr3[3] ^ iArrMult322[1];
            iArr3[2] = iArrMult322[0] ^ iArr3[2];
        } else {
            int[] iArrMult642 = mult64(iArr5, iArr7);
            iArr3[5] = iArr3[5] ^ iArrMult642[3];
            iArr3[4] = iArr3[4] ^ iArrMult642[2];
            iArr3[3] = iArr3[3] ^ iArrMult642[1];
            iArr3[2] = iArrMult642[0] ^ iArr3[2];
        }
        if (iArr4[1] == 0 && iArr6[1] == 0) {
            int[] iArrMult323 = mult32(iArr4[0], iArr6[0]);
            int i25 = iArr3[3];
            int i26 = iArrMult323[1];
            iArr3[3] = i25 ^ i26;
            int i27 = iArr3[2];
            int i28 = iArrMult323[0];
            iArr3[2] = i27 ^ i28;
            iArr3[1] = iArr3[1] ^ i26;
            iArr3[0] = i28 ^ iArr3[0];
            return iArr3;
        }
        int[] iArrMult643 = mult64(iArr4, iArr6);
        int i29 = iArr3[5];
        int i30 = iArrMult643[3];
        iArr3[5] = i29 ^ i30;
        int i31 = iArr3[4];
        int i32 = iArrMult643[2];
        iArr3[4] = i31 ^ i32;
        int i33 = iArr3[3];
        int i34 = iArrMult643[1];
        iArr3[3] = i33 ^ (i30 ^ i34);
        int i35 = iArr3[2];
        int i36 = iArrMult643[0];
        iArr3[2] = i35 ^ (i36 ^ i32);
        iArr3[1] = iArr3[1] ^ i34;
        iArr3[0] = i36 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult256(int[] iArr, int[] iArr2) {
        char c10;
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[4];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(4, iArr.length));
        int[] iArr5 = new int[4];
        if (iArr.length > 4) {
            System.arraycopy(iArr, 4, iArr5, 0, Math.min(4, iArr.length - 4));
        }
        int[] iArr6 = new int[4];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(4, iArr2.length));
        int[] iArr7 = new int[4];
        if (iArr2.length > 4) {
            System.arraycopy(iArr2, 4, iArr7, 0, Math.min(4, iArr2.length - 4));
        }
        if (iArr5[3] != 0 || iArr5[2] != 0 || iArr7[3] != 0 || iArr7[2] != 0) {
            c10 = 3;
            int[] iArrMult128 = mult128(iArr5, iArr7);
            int i10 = iArr3[15];
            int i11 = iArrMult128[7];
            iArr3[15] = i10 ^ i11;
            int i12 = iArr3[14];
            int i13 = iArrMult128[6];
            iArr3[14] = i12 ^ i13;
            int i14 = iArr3[13];
            int i15 = iArrMult128[5];
            iArr3[13] = i14 ^ i15;
            int i16 = iArr3[12];
            int i17 = iArrMult128[4];
            iArr3[12] = i16 ^ i17;
            int i18 = iArr3[11];
            int i19 = iArrMult128[3];
            iArr3[11] = i18 ^ (i19 ^ i11);
            int i20 = iArr3[10];
            int i21 = iArrMult128[2];
            iArr3[10] = i20 ^ (i21 ^ i13);
            int i22 = iArr3[9];
            int i23 = iArrMult128[1];
            iArr3[9] = i22 ^ (i23 ^ i15);
            int i24 = iArr3[8];
            int i25 = iArrMult128[0];
            iArr3[8] = i24 ^ (i25 ^ i17);
            iArr3[7] = iArr3[7] ^ i19;
            iArr3[6] = iArr3[6] ^ i21;
            iArr3[5] = iArr3[5] ^ i23;
            iArr3[4] = i25 ^ iArr3[4];
        } else if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i26 = iArr5[0];
            if (i26 == 0 && iArr7[0] == 0) {
                c10 = 3;
            } else {
                c10 = 3;
                int[] iArrMult32 = mult32(i26, iArr7[0]);
                int i27 = iArr3[9];
                int i28 = iArrMult32[1];
                iArr3[9] = i27 ^ i28;
                int i29 = iArr3[8];
                int i30 = iArrMult32[0];
                iArr3[8] = i29 ^ i30;
                iArr3[5] = iArr3[5] ^ i28;
                iArr3[4] = i30 ^ iArr3[4];
            }
        } else {
            c10 = 3;
            int[] iArrMult64 = mult64(iArr5, iArr7);
            int i31 = iArr3[11];
            int i32 = iArrMult64[3];
            iArr3[11] = i31 ^ i32;
            int i33 = iArr3[10];
            int i34 = iArrMult64[2];
            iArr3[10] = i33 ^ i34;
            int i35 = iArr3[9];
            int i36 = iArrMult64[1];
            iArr3[9] = i35 ^ i36;
            int i37 = iArr3[8];
            int i38 = iArrMult64[0];
            iArr3[8] = i37 ^ i38;
            iArr3[7] = iArr3[7] ^ i32;
            iArr3[6] = iArr3[6] ^ i34;
            iArr3[5] = iArr3[5] ^ i36;
            iArr3[4] = i38 ^ iArr3[4];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[c10] = iArr5[c10] ^ iArr4[c10];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[c10] = iArr7[c10] ^ iArr6[c10];
        int[] iArrMult1282 = mult128(iArr5, iArr7);
        iArr3[11] = iArr3[11] ^ iArrMult1282[7];
        iArr3[10] = iArr3[10] ^ iArrMult1282[6];
        iArr3[9] = iArr3[9] ^ iArrMult1282[5];
        iArr3[8] = iArr3[8] ^ iArrMult1282[4];
        iArr3[7] = iArr3[7] ^ iArrMult1282[c10];
        iArr3[6] = iArr3[6] ^ iArrMult1282[2];
        iArr3[5] = iArr3[5] ^ iArrMult1282[1];
        iArr3[4] = iArrMult1282[0] ^ iArr3[4];
        int[] iArrMult1283 = mult128(iArr4, iArr6);
        int i39 = iArr3[11];
        int i40 = iArrMult1283[7];
        iArr3[11] = i39 ^ i40;
        int i41 = iArr3[10];
        int i42 = iArrMult1283[6];
        iArr3[10] = i41 ^ i42;
        int i43 = iArr3[9];
        int i44 = iArrMult1283[5];
        iArr3[9] = i43 ^ i44;
        int i45 = iArr3[8];
        int i46 = iArrMult1283[4];
        iArr3[8] = i45 ^ i46;
        int i47 = iArr3[7];
        int i48 = iArrMult1283[c10];
        iArr3[7] = i47 ^ (i40 ^ i48);
        int i49 = iArr3[6];
        int i50 = iArrMult1283[2];
        iArr3[6] = i49 ^ (i42 ^ i50);
        int i51 = iArr3[5];
        int i52 = iArrMult1283[1];
        iArr3[5] = i51 ^ (i44 ^ i52);
        int i53 = iArr3[4];
        int i54 = iArrMult1283[0];
        iArr3[4] = i53 ^ (i54 ^ i46);
        iArr3[c10] = iArr3[c10] ^ i48;
        iArr3[2] = iArr3[2] ^ i50;
        iArr3[1] = iArr3[1] ^ i52;
        iArr3[0] = i54 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult32(int i10, int i11) {
        int[] iArr = new int[2];
        if (i10 != 0 && i11 != 0) {
            long j10 = i11 & BodyPartID.bodyIdMax;
            long j11 = 0;
            for (int i12 = 1; i12 <= 32; i12++) {
                if ((bitMask[i12 - 1] & i10) != 0) {
                    j11 ^= j10;
                }
                j10 <<= 1;
            }
            iArr[1] = (int) (j11 >>> 32);
            iArr[0] = (int) (j11 & BodyPartID.bodyIdMax);
        }
        return iArr;
    }

    private static int[] mult512(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[32];
        int[] iArr4 = new int[8];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(8, iArr.length));
        int[] iArr5 = new int[8];
        if (iArr.length > 8) {
            System.arraycopy(iArr, 8, iArr5, 0, Math.min(8, iArr.length - 8));
        }
        int[] iArr6 = new int[8];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(8, iArr2.length));
        int[] iArr7 = new int[8];
        if (iArr2.length > 8) {
            System.arraycopy(iArr2, 8, iArr7, 0, Math.min(8, iArr2.length - 8));
        }
        int[] iArrMult256 = mult256(iArr5, iArr7);
        int i10 = iArr3[31];
        int i11 = iArrMult256[15];
        iArr3[31] = i10 ^ i11;
        int i12 = iArr3[30];
        int i13 = iArrMult256[14];
        iArr3[30] = i12 ^ i13;
        int i14 = iArr3[29];
        int i15 = iArrMult256[13];
        iArr3[29] = i14 ^ i15;
        int i16 = iArr3[28];
        int i17 = iArrMult256[12];
        iArr3[28] = i16 ^ i17;
        int i18 = iArr3[27];
        int i19 = iArrMult256[11];
        iArr3[27] = i18 ^ i19;
        int i20 = iArr3[26];
        int i21 = iArrMult256[10];
        iArr3[26] = i20 ^ i21;
        int i22 = iArr3[25];
        int i23 = iArrMult256[9];
        iArr3[25] = i22 ^ i23;
        int i24 = iArr3[24];
        int i25 = iArrMult256[8];
        iArr3[24] = i24 ^ i25;
        int i26 = iArr3[23];
        int i27 = iArrMult256[7];
        iArr3[23] = i26 ^ (i27 ^ i11);
        int i28 = iArr3[22];
        int i29 = iArrMult256[6];
        iArr3[22] = i28 ^ (i29 ^ i13);
        int i30 = iArr3[21];
        int i31 = iArrMult256[5];
        iArr3[21] = i30 ^ (i31 ^ i15);
        int i32 = iArr3[20];
        int i33 = iArrMult256[4];
        iArr3[20] = i32 ^ (i33 ^ i17);
        int i34 = iArr3[19];
        int i35 = iArrMult256[3];
        iArr3[19] = i34 ^ (i35 ^ i19);
        int i36 = iArr3[18];
        int i37 = iArrMult256[2];
        iArr3[18] = i36 ^ (i37 ^ i21);
        int i38 = iArr3[17];
        int i39 = iArrMult256[1];
        iArr3[17] = i38 ^ (i39 ^ i23);
        int i40 = iArr3[16];
        int i41 = iArrMult256[0];
        iArr3[16] = i40 ^ (i41 ^ i25);
        iArr3[15] = iArr3[15] ^ i27;
        iArr3[14] = iArr3[14] ^ i29;
        iArr3[13] = iArr3[13] ^ i31;
        iArr3[12] = iArr3[12] ^ i33;
        iArr3[11] = iArr3[11] ^ i35;
        iArr3[10] = iArr3[10] ^ i37;
        iArr3[9] = iArr3[9] ^ i39;
        iArr3[8] = iArr3[8] ^ i41;
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr5[4] = iArr5[4] ^ iArr4[4];
        iArr5[5] = iArr5[5] ^ iArr4[5];
        iArr5[6] = iArr5[6] ^ iArr4[6];
        iArr5[7] = iArr5[7] ^ iArr4[7];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        iArr7[4] = iArr7[4] ^ iArr6[4];
        iArr7[5] = iArr7[5] ^ iArr6[5];
        iArr7[6] = iArr7[6] ^ iArr6[6];
        iArr7[7] = iArr7[7] ^ iArr6[7];
        int[] iArrMult2562 = mult256(iArr5, iArr7);
        iArr3[23] = iArr3[23] ^ iArrMult2562[15];
        iArr3[22] = iArr3[22] ^ iArrMult2562[14];
        iArr3[21] = iArr3[21] ^ iArrMult2562[13];
        iArr3[20] = iArr3[20] ^ iArrMult2562[12];
        iArr3[19] = iArr3[19] ^ iArrMult2562[11];
        iArr3[18] = iArr3[18] ^ iArrMult2562[10];
        iArr3[17] = iArr3[17] ^ iArrMult2562[9];
        iArr3[16] = iArr3[16] ^ iArrMult2562[8];
        iArr3[15] = iArr3[15] ^ iArrMult2562[7];
        iArr3[14] = iArr3[14] ^ iArrMult2562[6];
        iArr3[13] = iArr3[13] ^ iArrMult2562[5];
        iArr3[12] = iArr3[12] ^ iArrMult2562[4];
        iArr3[11] = iArr3[11] ^ iArrMult2562[3];
        iArr3[10] = iArr3[10] ^ iArrMult2562[2];
        iArr3[9] = iArr3[9] ^ iArrMult2562[1];
        iArr3[8] = iArrMult2562[0] ^ iArr3[8];
        int[] iArrMult2563 = mult256(iArr4, iArr6);
        int i42 = iArr3[23];
        int i43 = iArrMult2563[15];
        iArr3[23] = i42 ^ i43;
        int i44 = iArr3[22];
        int i45 = iArrMult2563[14];
        iArr3[22] = i44 ^ i45;
        int i46 = iArr3[21];
        int i47 = iArrMult2563[13];
        iArr3[21] = i46 ^ i47;
        int i48 = iArr3[20];
        int i49 = iArrMult2563[12];
        iArr3[20] = i48 ^ i49;
        int i50 = iArr3[19];
        int i51 = iArrMult2563[11];
        iArr3[19] = i50 ^ i51;
        int i52 = iArr3[18];
        int i53 = iArrMult2563[10];
        iArr3[18] = i52 ^ i53;
        int i54 = iArr3[17];
        int i55 = iArrMult2563[9];
        iArr3[17] = i54 ^ i55;
        int i56 = iArr3[16];
        int i57 = iArrMult2563[8];
        iArr3[16] = i56 ^ i57;
        int i58 = iArr3[15];
        int i59 = iArrMult2563[7];
        iArr3[15] = i58 ^ (i43 ^ i59);
        int i60 = iArr3[14];
        int i61 = iArrMult2563[6];
        iArr3[14] = i60 ^ (i45 ^ i61);
        int i62 = iArr3[13];
        int i63 = iArrMult2563[5];
        iArr3[13] = i62 ^ (i47 ^ i63);
        int i64 = iArr3[12];
        int i65 = iArrMult2563[4];
        iArr3[12] = i64 ^ (i49 ^ i65);
        int i66 = iArr3[11];
        int i67 = iArrMult2563[3];
        iArr3[11] = i66 ^ (i51 ^ i67);
        int i68 = iArr3[10];
        int i69 = iArrMult2563[2];
        iArr3[10] = i68 ^ (i69 ^ i53);
        int i70 = iArr3[9];
        int i71 = iArrMult2563[1];
        iArr3[9] = i70 ^ (i71 ^ i55);
        int i72 = iArr3[8];
        int i73 = iArrMult2563[0];
        iArr3[8] = i72 ^ (i73 ^ i57);
        iArr3[7] = iArr3[7] ^ i59;
        iArr3[6] = iArr3[6] ^ i61;
        iArr3[5] = iArr3[5] ^ i63;
        iArr3[4] = iArr3[4] ^ i65;
        iArr3[3] = iArr3[3] ^ i67;
        iArr3[2] = iArr3[2] ^ i69;
        iArr3[1] = iArr3[1] ^ i71;
        iArr3[0] = i73 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult64(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[4];
        int i10 = iArr[0];
        int i11 = iArr.length > 1 ? iArr[1] : 0;
        int i12 = iArr2[0];
        int i13 = iArr2.length > 1 ? iArr2[1] : 0;
        if (i11 != 0 || i13 != 0) {
            int[] iArrMult32 = mult32(i11, i13);
            int i14 = iArr3[3];
            int i15 = iArrMult32[1];
            iArr3[3] = i14 ^ i15;
            int i16 = iArr3[2];
            int i17 = iArrMult32[0];
            iArr3[2] = i16 ^ (i17 ^ i15);
            iArr3[1] = i17 ^ iArr3[1];
        }
        int[] iArrMult322 = mult32(i11 ^ i10, i13 ^ i12);
        iArr3[2] = iArr3[2] ^ iArrMult322[1];
        iArr3[1] = iArrMult322[0] ^ iArr3[1];
        int[] iArrMult323 = mult32(i10, i12);
        int i18 = iArr3[2];
        int i19 = iArrMult323[1];
        iArr3[2] = i18 ^ i19;
        int i20 = iArr3[1];
        int i21 = iArrMult323[0];
        iArr3[1] = i20 ^ (i19 ^ i21);
        iArr3[0] = i21 ^ iArr3[0];
        return iArr3;
    }

    private GF2Polynomial upper(int i10) {
        int iMin = Math.min(i10, this.blocks - i10);
        GF2Polynomial gF2Polynomial = new GF2Polynomial(iMin << 5);
        if (this.blocks >= i10) {
            System.arraycopy(this.value, i10, gF2Polynomial.value, 0, iMin);
        }
        return gF2Polynomial;
    }

    private void zeroUnusedBits() {
        int i10 = this.len;
        if ((i10 & 31) != 0) {
            int[] iArr = this.value;
            int i11 = this.blocks - 1;
            iArr[i11] = reverseRightMask[i10 & 31] & iArr[i11];
        }
    }

    public GF2Polynomial add(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void addToThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public void assignAll() {
        for (int i10 = 0; i10 < this.blocks; i10++) {
            this.value[i10] = -1;
        }
        zeroUnusedBits();
    }

    public void assignOne() {
        for (int i10 = 1; i10 < this.blocks; i10++) {
            this.value[i10] = 0;
        }
        this.value[0] = 1;
    }

    public void assignX() {
        for (int i10 = 1; i10 < this.blocks; i10++) {
            this.value[i10] = 0;
        }
        this.value[0] = 2;
    }

    public void assignZero() {
        for (int i10 = 0; i10 < this.blocks; i10++) {
            this.value[i10] = 0;
        }
    }

    public Object clone() {
        return new GF2Polynomial(this);
    }

    public GF2Polynomial[] divide(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[2];
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i10 = gF2Polynomial3.len;
        int i11 = gF2Polynomial4.len;
        if (i10 < i11) {
            gF2PolynomialArr[0] = new GF2Polynomial(0);
            gF2PolynomialArr[1] = gF2Polynomial3;
            return gF2PolynomialArr;
        }
        int i12 = i10 - i11;
        gF2Polynomial2.expandN(i12 + 1);
        while (i12 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i12));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i12);
            i12 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        gF2PolynomialArr[0] = gF2Polynomial2;
        gF2PolynomialArr[1] = gF2Polynomial3;
        return gF2PolynomialArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2Polynomial)) {
            return false;
        }
        GF2Polynomial gF2Polynomial = (GF2Polynomial) obj;
        if (this.len != gF2Polynomial.len) {
            return false;
        }
        for (int i10 = 0; i10 < this.blocks; i10++) {
            if (this.value[i10] != gF2Polynomial.value[i10]) {
                return false;
            }
        }
        return true;
    }

    public void expandN(int i10) {
        if (this.len >= i10) {
            return;
        }
        this.len = i10;
        int i11 = ((i10 - 1) >>> 5) + 1;
        int i12 = this.blocks;
        if (i12 >= i11) {
            return;
        }
        int[] iArr = this.value;
        if (iArr.length >= i11) {
            while (i12 < i11) {
                this.value[i12] = 0;
                i12++;
            }
            this.blocks = i11;
            return;
        }
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i12);
        this.blocks = i11;
        this.value = iArr2;
    }

    public GF2Polynomial gcd(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (isZero() && gF2Polynomial.isZero()) {
            throw new ArithmeticException("Both operands of gcd equal zero.");
        }
        if (isZero()) {
            return new GF2Polynomial(gF2Polynomial);
        }
        if (gF2Polynomial.isZero()) {
            return new GF2Polynomial(this);
        }
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
        GF2Polynomial gF2PolynomialRemainder = gF2Polynomial3;
        while (!gF2PolynomialRemainder.isZero()) {
            GF2Polynomial gF2Polynomial5 = gF2PolynomialRemainder;
            gF2PolynomialRemainder = gF2Polynomial4.remainder(gF2PolynomialRemainder);
            gF2Polynomial4 = gF2Polynomial5;
        }
        return gF2Polynomial4;
    }

    public int getBit(int i10) {
        if (i10 < 0) {
            throw new RuntimeException();
        }
        if (i10 > this.len - 1) {
            return 0;
        }
        return (bitMask[i10 & 31] & this.value[i10 >>> 5]) != 0 ? 1 : 0;
    }

    public int getLength() {
        return this.len;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value) + this.len;
    }

    public GF2Polynomial increase() throws RuntimeException {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.increaseThis();
        return gF2Polynomial;
    }

    public void increaseThis() throws RuntimeException {
        xorBit(0);
    }

    public boolean isIrreducible() throws RuntimeException {
        if (isZero()) {
            return false;
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.reduceN();
        int i10 = gF2Polynomial.len;
        int i11 = i10 - 1;
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(i10, "X");
        for (int i12 = 1; i12 <= (i11 >> 1); i12++) {
            gF2Polynomial2.squareThisPreCalc();
            gF2Polynomial2 = gF2Polynomial2.remainder(gF2Polynomial);
            GF2Polynomial gF2PolynomialAdd = gF2Polynomial2.add(new GF2Polynomial(32, "X"));
            if (gF2PolynomialAdd.isZero() || !gF2Polynomial.gcd(gF2PolynomialAdd).isOne()) {
                return false;
            }
        }
        return true;
    }

    public boolean isOne() {
        for (int i10 = 1; i10 < this.blocks; i10++) {
            if (this.value[i10] != 0) {
                return false;
            }
        }
        return this.value[0] == 1;
    }

    public boolean isZero() {
        if (this.len == 0) {
            return true;
        }
        for (int i10 = 0; i10 < this.blocks; i10++) {
            if (this.value[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public GF2Polynomial multiply(GF2Polynomial gF2Polynomial) {
        int iMax = Math.max(this.len, gF2Polynomial.len);
        expandN(iMax);
        gF2Polynomial.expandN(iMax);
        return karaMult(gF2Polynomial);
    }

    public GF2Polynomial multiplyClassic(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(Math.max(this.len, gF2Polynomial.len) << 1);
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[32];
        gF2PolynomialArr[0] = new GF2Polynomial(this);
        for (int i10 = 1; i10 <= 31; i10++) {
            gF2PolynomialArr[i10] = gF2PolynomialArr[i10 - 1].shiftLeft();
        }
        for (int i11 = 0; i11 < gF2Polynomial.blocks; i11++) {
            for (int i12 = 0; i12 <= 31; i12++) {
                if ((gF2Polynomial.value[i11] & bitMask[i12]) != 0) {
                    gF2Polynomial2.xorThisBy(gF2PolynomialArr[i12]);
                }
            }
            for (int i13 = 0; i13 <= 31; i13++) {
                gF2PolynomialArr[i13].shiftBlocksLeft();
            }
        }
        return gF2Polynomial2;
    }

    public GF2Polynomial quotient(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i10 = gF2Polynomial3.len;
        int i11 = gF2Polynomial4.len;
        if (i10 < i11) {
            return new GF2Polynomial(0);
        }
        int i12 = i10 - i11;
        gF2Polynomial2.expandN(i12 + 1);
        while (i12 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i12));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i12);
            i12 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        return gF2Polynomial2;
    }

    public void randomize() {
        for (int i10 = 0; i10 < this.blocks; i10++) {
            this.value[i10] = rand.nextInt();
        }
        zeroUnusedBits();
    }

    public void reduceN() {
        int i10;
        int i11 = this.blocks;
        do {
            i11--;
            i10 = this.value[i11];
            if (i10 != 0) {
                break;
            }
        } while (i11 > 0);
        int i12 = 0;
        while (i10 != 0) {
            i10 >>>= 1;
            i12++;
        }
        this.len = (i11 << 5) + i12;
        this.blocks = i11 + 1;
    }

    public void reducePentanomial(int i10, int[] iArr) {
        int i11 = i10 >>> 5;
        int i12 = i10 & 31;
        int i13 = 32 - i12;
        int i14 = 0;
        int i15 = iArr[0];
        int i16 = (i10 - i15) >>> 5;
        int i17 = 32 - ((i10 - i15) & 31);
        boolean z10 = true;
        int i18 = iArr[1];
        int i19 = (i10 - i18) >>> 5;
        int i20 = 32 - ((i10 - i18) & 31);
        int i21 = iArr[2];
        int i22 = (i10 - i21) >>> 5;
        int i23 = 32 - ((i10 - i21) & 31);
        int i24 = ((i10 << 1) - 2) >>> 5;
        while (i24 > i11) {
            int i25 = i14;
            int[] iArr2 = this.value;
            boolean z11 = z10;
            long j10 = iArr2[i24] & BodyPartID.bodyIdMax;
            int i26 = i24 - i11;
            int i27 = i26 - 1;
            int i28 = i11;
            int i29 = i12;
            iArr2[i27] = iArr2[i27] ^ ((int) (j10 << i13));
            iArr2[i26] = (int) (iArr2[i26] ^ (j10 >>> (32 - i13)));
            int i30 = i24 - i16;
            int i31 = i30 - 1;
            iArr2[i31] = ((int) (j10 << i17)) ^ iArr2[i31];
            iArr2[i30] = (int) (iArr2[i30] ^ (j10 >>> (32 - i17)));
            int i32 = i24 - i19;
            int i33 = i32 - 1;
            iArr2[i33] = ((int) (j10 << i20)) ^ iArr2[i33];
            iArr2[i32] = (int) (iArr2[i32] ^ (j10 >>> (32 - i20)));
            int i34 = i24 - i22;
            int i35 = i34 - 1;
            iArr2[i35] = ((int) (j10 << i23)) ^ iArr2[i35];
            iArr2[i34] = (int) (iArr2[i34] ^ (j10 >>> (32 - i23)));
            iArr2[i24] = i25;
            i24--;
            i14 = i25;
            z10 = z11;
            i11 = i28;
            i12 = i29;
        }
        int i36 = i11;
        int i37 = i12;
        int[] iArr3 = this.value;
        long j11 = iArr3[i36] & BodyPartID.bodyIdMax & (BodyPartID.bodyIdMax << i37);
        iArr3[i14] = (int) (iArr3[r16] ^ (j11 >>> (32 - i13)));
        int i38 = i36 - i16;
        int i39 = i38 - 1;
        if (i39 >= 0) {
            iArr3[i39] = iArr3[i39] ^ ((int) (j11 << i17));
        }
        iArr3[i38] = (int) (iArr3[i38] ^ (j11 >>> (32 - i17)));
        int i40 = i36 - i19;
        int i41 = i40 - 1;
        if (i41 >= 0) {
            iArr3[i41] = iArr3[i41] ^ ((int) (j11 << i20));
        }
        iArr3[i40] = (int) (iArr3[i40] ^ (j11 >>> (32 - i20)));
        int i42 = i36 - i22;
        int i43 = i42 - 1;
        if (i43 >= 0) {
            iArr3[i43] = iArr3[i43] ^ ((int) (j11 << i23));
        }
        iArr3[i42] = (int) (iArr3[i42] ^ (j11 >>> (32 - i23)));
        iArr3[i36] = iArr3[i36] & reverseRightMask[i37];
        this.blocks = ((i10 - 1) >>> 5) + 1;
        this.len = i10;
    }

    public void reduceTrinomial(int i10, int i11) {
        int i12 = i10 >>> 5;
        int i13 = i10 & 31;
        int i14 = 32 - i13;
        int i15 = i10 - i11;
        int i16 = i15 >>> 5;
        int i17 = 32 - (i15 & 31);
        for (int i18 = ((i10 << 1) - 2) >>> 5; i18 > i12; i18--) {
            int[] iArr = this.value;
            long j10 = BodyPartID.bodyIdMax & iArr[i18];
            int i19 = i18 - i12;
            int i20 = i19 - 1;
            iArr[i20] = ((int) (j10 << i14)) ^ iArr[i20];
            iArr[i19] = (int) (iArr[i19] ^ (j10 >>> (32 - i14)));
            int i21 = i18 - i16;
            int i22 = i21 - 1;
            iArr[i22] = iArr[i22] ^ ((int) (j10 << i17));
            iArr[i21] = (int) (iArr[i21] ^ (j10 >>> (32 - i17)));
            iArr[i18] = 0;
        }
        int[] iArr2 = this.value;
        long j11 = (BodyPartID.bodyIdMax << i13) & iArr2[i12] & BodyPartID.bodyIdMax;
        iArr2[0] = (int) (iArr2[0] ^ (j11 >>> (32 - i14)));
        int i23 = i12 - i16;
        int i24 = i23 - 1;
        if (i24 >= 0) {
            iArr2[i24] = iArr2[i24] ^ ((int) (j11 << i17));
        }
        iArr2[i23] = (int) ((j11 >>> (32 - i17)) ^ iArr2[i23]);
        iArr2[i12] = reverseRightMask[i13] & iArr2[i12];
        this.blocks = ((i10 - 1) >>> 5) + 1;
        this.len = i10;
    }

    public GF2Polynomial remainder(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial3.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial2.reduceN();
        gF2Polynomial3.reduceN();
        int i10 = gF2Polynomial2.len;
        int i11 = gF2Polynomial3.len;
        if (i10 >= i11) {
            while (true) {
                int i12 = i10 - i11;
                if (i12 < 0) {
                    break;
                }
                gF2Polynomial2.subtractFromThis(gF2Polynomial3.shiftLeft(i12));
                gF2Polynomial2.reduceN();
                i10 = gF2Polynomial2.len;
                i11 = gF2Polynomial3.len;
            }
        }
        return gF2Polynomial2;
    }

    public void resetBit(int i10) throws RuntimeException {
        if (i10 < 0) {
            throw new RuntimeException();
        }
        if (i10 > this.len - 1) {
            return;
        }
        int[] iArr = this.value;
        int i11 = i10 >>> 5;
        iArr[i11] = (~bitMask[i10 & 31]) & iArr[i11];
    }

    public void setBit(int i10) throws RuntimeException {
        if (i10 < 0 || i10 > this.len - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.value;
        int i11 = i10 >>> 5;
        iArr[i11] = bitMask[i10 & 31] | iArr[i11];
    }

    public void shiftBlocksLeft() {
        int i10 = this.blocks;
        int i11 = i10 + 1;
        this.blocks = i11;
        this.len += 32;
        int[] iArr = this.value;
        if (i11 > iArr.length) {
            int[] iArr2 = new int[i11];
            System.arraycopy(iArr, 0, iArr2, 1, i10);
            this.value = iArr2;
        } else {
            while (i10 >= 1) {
                int[] iArr3 = this.value;
                iArr3[i10] = iArr3[i10 - 1];
                i10--;
            }
            this.value[0] = 0;
        }
    }

    public GF2Polynomial shiftLeft() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + 1, this.value);
        for (int i10 = gF2Polynomial.blocks - 1; i10 >= 1; i10--) {
            int[] iArr = gF2Polynomial.value;
            int i11 = iArr[i10] << 1;
            iArr[i10] = i11;
            iArr[i10] = i11 | (iArr[i10 - 1] >>> 31);
        }
        int[] iArr2 = gF2Polynomial.value;
        iArr2[0] = iArr2[0] << 1;
        return gF2Polynomial;
    }

    public void shiftLeftAddThis(GF2Polynomial gF2Polynomial, int i10) {
        int i11;
        if (i10 == 0) {
            addToThis(gF2Polynomial);
            return;
        }
        expandN(gF2Polynomial.len + i10);
        int i12 = i10 >>> 5;
        for (int i13 = gF2Polynomial.blocks - 1; i13 >= 0; i13--) {
            int i14 = i13 + i12;
            int i15 = i14 + 1;
            if (i15 < this.blocks && (i11 = i10 & 31) != 0) {
                int[] iArr = this.value;
                iArr[i15] = (gF2Polynomial.value[i13] >>> (32 - i11)) ^ iArr[i15];
            }
            int[] iArr2 = this.value;
            iArr2[i14] = iArr2[i14] ^ (gF2Polynomial.value[i13] << (i10 & 31));
        }
    }

    public void shiftLeftThis() {
        int i10 = this.len;
        int i11 = i10 & 31;
        this.len = i10 + 1;
        int i12 = this.blocks;
        if (i11 != 0) {
            for (int i13 = i12 - 1; i13 >= 1; i13--) {
                int[] iArr = this.value;
                int i14 = iArr[i13] << 1;
                iArr[i13] = i14;
                iArr[i13] = i14 | (iArr[i13 - 1] >>> 31);
            }
            int[] iArr2 = this.value;
            iArr2[0] = iArr2[0] << 1;
            return;
        }
        int i15 = i12 + 1;
        this.blocks = i15;
        int[] iArr3 = this.value;
        if (i15 > iArr3.length) {
            int[] iArr4 = new int[i15];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            this.value = iArr4;
        }
        for (int i16 = this.blocks - 1; i16 >= 1; i16--) {
            int[] iArr5 = this.value;
            int i17 = i16 - 1;
            iArr5[i16] = iArr5[i16] | (iArr5[i17] >>> 31);
            iArr5[i17] = iArr5[i17] << 1;
        }
    }

    public GF2Polynomial shiftRight() {
        int i10;
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len - 1);
        int i11 = 0;
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, gF2Polynomial.blocks);
        while (true) {
            i10 = gF2Polynomial.blocks;
            if (i11 > i10 - 2) {
                break;
            }
            int[] iArr = gF2Polynomial.value;
            int i12 = iArr[i11] >>> 1;
            iArr[i11] = i12;
            int i13 = i11 + 1;
            iArr[i11] = i12 | (iArr[i13] << 31);
            i11 = i13;
        }
        int[] iArr2 = gF2Polynomial.value;
        int i14 = i10 - 1;
        iArr2[i14] = iArr2[i14] >>> 1;
        if (i10 < this.blocks) {
            int i15 = i10 - 1;
            iArr2[i15] = (this.value[i10] << 31) | iArr2[i15];
        }
        return gF2Polynomial;
    }

    public void shiftRightThis() {
        int i10;
        int i11 = this.len;
        this.len = i11 - 1;
        this.blocks = ((i11 - 2) >>> 5) + 1;
        int i12 = 0;
        while (true) {
            i10 = this.blocks;
            if (i12 > i10 - 2) {
                break;
            }
            int[] iArr = this.value;
            int i13 = iArr[i12] >>> 1;
            iArr[i12] = i13;
            int i14 = i12 + 1;
            iArr[i12] = i13 | (iArr[i14] << 31);
            i12 = i14;
        }
        int[] iArr2 = this.value;
        int i15 = i10 - 1;
        iArr2[i15] = iArr2[i15] >>> 1;
        if ((this.len & 31) == 0) {
            int i16 = i10 - 1;
            iArr2[i16] = (iArr2[i10] << 31) | iArr2[i16];
        }
    }

    public void squareThisBitwise() {
        if (isZero()) {
            return;
        }
        int i10 = this.blocks;
        int i11 = i10 << 1;
        int[] iArr = new int[i11];
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            int i13 = this.value[i12];
            int i14 = 1;
            for (int i15 = 0; i15 < 16; i15++) {
                if ((i13 & 1) != 0) {
                    int i16 = i12 << 1;
                    iArr[i16] = iArr[i16] | i14;
                }
                if ((65536 & i13) != 0) {
                    int i17 = (i12 << 1) + 1;
                    iArr[i17] = iArr[i17] | i14;
                }
                i14 <<= 2;
                i13 >>>= 1;
            }
        }
        this.value = iArr;
        this.blocks = i11;
        this.len = (this.len << 1) - 1;
    }

    public void squareThisPreCalc() {
        int i10;
        int i11;
        if (isZero()) {
            return;
        }
        int length = this.value.length;
        int i12 = this.blocks;
        if (length >= (i12 << 1)) {
            for (int i13 = i12 - 1; i13 >= 0; i13--) {
                int[] iArr = this.value;
                int i14 = i13 << 1;
                short[] sArr = squaringTable;
                int i15 = iArr[i13];
                iArr[i14 + 1] = (sArr[(i15 & (-16777216)) >>> 24] << 16) | sArr[(i15 & 16711680) >>> 16];
                int i16 = iArr[i13];
                iArr[i14] = (sArr[(i16 & 65280) >>> 8] << 16) | sArr[i16 & 255];
            }
            i11 = this.blocks << 1;
        } else {
            int[] iArr2 = new int[i12 << 1];
            int i17 = 0;
            while (true) {
                i10 = this.blocks;
                if (i17 >= i10) {
                    break;
                }
                int i18 = i17 << 1;
                short[] sArr2 = squaringTable;
                int[] iArr3 = this.value;
                int i19 = iArr3[i17];
                iArr2[i18] = (sArr2[(i19 & 65280) >>> 8] << 16) | sArr2[i19 & 255];
                int i20 = iArr3[i17];
                iArr2[i18 + 1] = (sArr2[(i20 & (-16777216)) >>> 24] << 16) | sArr2[(i20 & 16711680) >>> 16];
                i17++;
            }
            this.value = iArr2;
            i11 = i10 << 1;
        }
        this.blocks = i11;
        this.len = (this.len << 1) - 1;
    }

    public GF2Polynomial subtract(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void subtractFromThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public boolean testBit(int i10) {
        if (i10 < 0) {
            throw new RuntimeException();
        }
        if (i10 > this.len - 1) {
            return false;
        }
        return (bitMask[i10 & 31] & this.value[i10 >>> 5]) != 0;
    }

    public byte[] toByteArray() {
        int i10 = ((this.len - 1) >> 3) + 1;
        int i11 = i10 & 3;
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < (i10 >> 2); i12++) {
            int i13 = i10 - (i12 << 2);
            int i14 = this.value[i12];
            bArr[i13 - 1] = (byte) (i14 & 255);
            bArr[i13 - 2] = (byte) ((65280 & i14) >>> 8);
            bArr[i13 - 3] = (byte) ((16711680 & i14) >>> 16);
            bArr[i13 - 4] = (byte) (((-16777216) & i14) >>> 24);
        }
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = ((i11 - i15) - 1) << 3;
            bArr[i15] = (byte) ((this.value[this.blocks - 1] & (255 << i16)) >>> i16);
        }
        return bArr;
    }

    public BigInteger toFlexiBigInt() {
        return (this.len == 0 || isZero()) ? new BigInteger(0, new byte[0]) : new BigInteger(1, toByteArray());
    }

    public int[] toIntegerArray() {
        int i10 = this.blocks;
        int[] iArr = new int[i10];
        System.arraycopy(this.value, 0, iArr, 0, i10);
        return iArr;
    }

    public String toString(int i10) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String[] strArr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String str = new String();
        if (i10 == 16) {
            for (int i11 = this.blocks - 1; i11 >= 0; i11--) {
                StringBuilder sbA = q.a(str);
                sbA.append(cArr[(this.value[i11] >>> 28) & 15]);
                StringBuilder sbA2 = q.a(sbA.toString());
                sbA2.append(cArr[(this.value[i11] >>> 24) & 15]);
                StringBuilder sbA3 = q.a(sbA2.toString());
                sbA3.append(cArr[(this.value[i11] >>> 20) & 15]);
                StringBuilder sbA4 = q.a(sbA3.toString());
                sbA4.append(cArr[(this.value[i11] >>> 16) & 15]);
                StringBuilder sbA5 = q.a(sbA4.toString());
                sbA5.append(cArr[(this.value[i11] >>> 12) & 15]);
                StringBuilder sbA6 = q.a(sbA5.toString());
                sbA6.append(cArr[(this.value[i11] >>> 8) & 15]);
                StringBuilder sbA7 = q.a(sbA6.toString());
                sbA7.append(cArr[(this.value[i11] >>> 4) & 15]);
                StringBuilder sbA8 = q.a(sbA7.toString());
                sbA8.append(cArr[this.value[i11] & 15]);
                str = a.a(sbA8.toString(), " ");
            }
            return str;
        }
        for (int i12 = this.blocks - 1; i12 >= 0; i12--) {
            StringBuilder sbA9 = q.a(str);
            sbA9.append(strArr[(this.value[i12] >>> 28) & 15]);
            StringBuilder sbA10 = q.a(sbA9.toString());
            sbA10.append(strArr[(this.value[i12] >>> 24) & 15]);
            StringBuilder sbA11 = q.a(sbA10.toString());
            sbA11.append(strArr[(this.value[i12] >>> 20) & 15]);
            StringBuilder sbA12 = q.a(sbA11.toString());
            sbA12.append(strArr[(this.value[i12] >>> 16) & 15]);
            StringBuilder sbA13 = q.a(sbA12.toString());
            sbA13.append(strArr[(this.value[i12] >>> 12) & 15]);
            StringBuilder sbA14 = q.a(sbA13.toString());
            sbA14.append(strArr[(this.value[i12] >>> 8) & 15]);
            StringBuilder sbA15 = q.a(sbA14.toString());
            sbA15.append(strArr[(this.value[i12] >>> 4) & 15]);
            StringBuilder sbA16 = q.a(sbA15.toString());
            sbA16.append(strArr[this.value[i12] & 15]);
            str = a.a(sbA16.toString(), " ");
        }
        return str;
    }

    public boolean vectorMult(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (this.len != gF2Polynomial.len) {
            throw new RuntimeException();
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < this.blocks; i10++) {
            int i11 = this.value[i10] & gF2Polynomial.value[i10];
            boolean[] zArr = parity;
            z10 = (((z10 ^ zArr[i11 & 255]) ^ zArr[(i11 >>> 8) & 255]) ^ zArr[(i11 >>> 16) & 255]) ^ zArr[(i11 >>> 24) & 255];
        }
        return z10;
    }

    public GF2Polynomial xor(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2;
        int iMin = Math.min(this.blocks, gF2Polynomial.blocks);
        int i10 = 0;
        if (this.len >= gF2Polynomial.len) {
            gF2Polynomial2 = new GF2Polynomial(this);
            while (i10 < iMin) {
                int[] iArr = gF2Polynomial2.value;
                iArr[i10] = iArr[i10] ^ gF2Polynomial.value[i10];
                i10++;
            }
        } else {
            gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
            while (i10 < iMin) {
                int[] iArr2 = gF2Polynomial2.value;
                iArr2[i10] = iArr2[i10] ^ this.value[i10];
                i10++;
            }
        }
        gF2Polynomial2.zeroUnusedBits();
        return gF2Polynomial2;
    }

    public void xorBit(int i10) throws RuntimeException {
        if (i10 < 0 || i10 > this.len - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.value;
        int i11 = i10 >>> 5;
        iArr[i11] = bitMask[i10 & 31] ^ iArr[i11];
    }

    public void xorThisBy(GF2Polynomial gF2Polynomial) {
        for (int i10 = 0; i10 < Math.min(this.blocks, gF2Polynomial.blocks); i10++) {
            int[] iArr = this.value;
            iArr[i10] = iArr[i10] ^ gF2Polynomial.value[i10];
        }
        zeroUnusedBits();
    }

    public GF2Polynomial(int i10, String str) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.blocks = i11;
        this.value = new int[i11];
        this.len = i10;
        if (str.equalsIgnoreCase("ZERO")) {
            assignZero();
            return;
        }
        if (str.equalsIgnoreCase("ONE")) {
            assignOne();
            return;
        }
        if (str.equalsIgnoreCase("RANDOM")) {
            randomize();
        } else if (str.equalsIgnoreCase("X")) {
            assignX();
        } else {
            if (!str.equalsIgnoreCase("ALL")) {
                throw new IllegalArgumentException(n.d("Error: GF2Polynomial was called using ", str, " as value!"));
            }
            assignAll();
        }
    }

    public void randomize(Random random) {
        for (int i10 = 0; i10 < this.blocks; i10++) {
            this.value[i10] = random.nextInt();
        }
        zeroUnusedBits();
    }

    public GF2Polynomial shiftLeft(int i10) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + i10, this.value);
        if (i10 >= 32) {
            gF2Polynomial.doShiftBlocksLeft(i10 >>> 5);
        }
        int i11 = i10 & 31;
        if (i11 != 0) {
            for (int i12 = gF2Polynomial.blocks - 1; i12 >= 1; i12--) {
                int[] iArr = gF2Polynomial.value;
                int i13 = iArr[i12] << i11;
                iArr[i12] = i13;
                iArr[i12] = i13 | (iArr[i12 - 1] >>> (32 - i11));
            }
            int[] iArr2 = gF2Polynomial.value;
            iArr2[0] = iArr2[0] << i11;
        }
        return gF2Polynomial;
    }

    public GF2Polynomial(int i10, BigInteger bigInteger) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.blocks = i11;
        this.value = new int[i11];
        this.len = i10;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        int length2 = byteArray.length & 3;
        int length3 = (byteArray.length - 1) >> 2;
        for (int i12 = 0; i12 < length2; i12++) {
            int[] iArr = this.value;
            iArr[length3] = iArr[length3] | ((byteArray[i12] & 255) << (((length2 - 1) - i12) << 3));
        }
        for (int i13 = 0; i13 <= ((byteArray.length - 4) >> 2); i13++) {
            int length4 = (byteArray.length - 1) - (i13 << 2);
            int[] iArr2 = this.value;
            int i14 = byteArray[length4] & 255;
            iArr2[i13] = i14;
            int i15 = i14 | ((byteArray[length4 - 1] << 8) & 65280);
            iArr2[i13] = i15;
            int i16 = i15 | ((byteArray[length4 - 2] << RegisterType.UNINIT_REF) & 16711680);
            iArr2[i13] = i16;
            iArr2[i13] = ((byteArray[length4 - 3] << 24) & (-16777216)) | i16;
        }
        int i17 = this.len;
        if ((i17 & 31) != 0) {
            int[] iArr3 = this.value;
            int i18 = this.blocks - 1;
            iArr3[i18] = reverseRightMask[i17 & 31] & iArr3[i18];
        }
        reduceN();
    }

    public GF2Polynomial(int i10, Random random) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.blocks = i11;
        this.value = new int[i11];
        this.len = i10;
        randomize(random);
    }

    public GF2Polynomial(int i10, byte[] bArr) {
        int i11;
        i10 = i10 < 1 ? 1 : i10;
        int i12 = ((i10 - 1) >> 5) + 1;
        this.blocks = i12;
        this.value = new int[i12];
        this.len = i10;
        int iMin = Math.min(((bArr.length - 1) >> 2) + 1, i12);
        int i13 = 0;
        while (true) {
            i11 = iMin - 1;
            if (i13 >= i11) {
                break;
            }
            int length = bArr.length - (i13 << 2);
            int[] iArr = this.value;
            int i14 = bArr[length - 1] & 255;
            iArr[i13] = i14;
            int i15 = (65280 & (bArr[length - 2] << 8)) | i14;
            iArr[i13] = i15;
            int i16 = (16711680 & (bArr[length - 3] << RegisterType.UNINIT_REF)) | i15;
            iArr[i13] = i16;
            iArr[i13] = ((bArr[length - 4] << 24) & (-16777216)) | i16;
            i13++;
        }
        int length2 = bArr.length - (i11 << 2);
        int i17 = length2 - 1;
        int[] iArr2 = this.value;
        int i18 = bArr[i17] & 255;
        iArr2[i11] = i18;
        if (i17 > 0) {
            iArr2[i11] = (65280 & (bArr[length2 - 2] << 8)) | i18;
        }
        if (i17 > 1) {
            iArr2[i11] = iArr2[i11] | (16711680 & (bArr[length2 - 3] << RegisterType.UNINIT_REF));
        }
        if (i17 > 2) {
            iArr2[i11] = ((bArr[length2 - 4] << 24) & (-16777216)) | iArr2[i11];
        }
        zeroUnusedBits();
        reduceN();
    }

    public GF2Polynomial(int i10, int[] iArr) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.blocks = i11;
        this.value = new int[i11];
        this.len = i10;
        System.arraycopy(iArr, 0, this.value, 0, Math.min(i11, iArr.length));
        zeroUnusedBits();
    }

    public GF2Polynomial(GF2Polynomial gF2Polynomial) {
        this.len = gF2Polynomial.len;
        this.blocks = gF2Polynomial.blocks;
        this.value = IntUtils.clone(gF2Polynomial.value);
    }
}
