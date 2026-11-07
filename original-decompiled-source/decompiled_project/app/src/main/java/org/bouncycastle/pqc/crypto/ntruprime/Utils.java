package org.bouncycastle.pqc.crypto.ntruprime;

import ad.k;
import java.security.SecureRandom;
import m.b;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
class Utils {
    public static int bToUnsignedInt(byte b10) {
        return b10 & 255;
    }

    public static void checkForSmallPolynomial(byte[] bArr, byte[] bArr2, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 != bArr2.length; i13++) {
            i12 += bArr2[i13] & 1;
        }
        int iCheckNotEqualToZero = checkNotEqualToZero(i12 - i11);
        for (int i14 = 0; i14 < i11; i14++) {
            bArr[i14] = (byte) (((bArr2[i14] ^ 1) & (~iCheckNotEqualToZero)) ^ 1);
        }
        while (i11 < i10) {
            bArr[i11] = (byte) (bArr2[i11] & (~iCheckNotEqualToZero));
            i11++;
        }
    }

    private static int checkLessThanZero(int i10) {
        return -(i10 >>> 31);
    }

    private static int checkNotEqualToZero(int i10) {
        return -((int) ((-iToUnsignedLong(i10)) >>> 63));
    }

    public static void cryptoSort(int[] iArr, int i10) {
        if (i10 < 2) {
            return;
        }
        int i11 = 1;
        while (i11 < i10 - i11) {
            i11 += i11;
        }
        for (int i12 = i11; i12 > 0; i12 >>>= 1) {
            for (int i13 = 0; i13 < i10 - i12; i13++) {
                if ((i13 & i12) == 0) {
                    minmax(iArr, i13, i13 + i12);
                }
            }
            for (int i14 = i11; i14 > i12; i14 >>>= 1) {
                for (int i15 = 0; i15 < i10 - i14; i15++) {
                    if ((i15 & i12) == 0) {
                        minmax(iArr, i15 + i12, i15 + i14);
                    }
                }
            }
        }
    }

    private static void decode(short[] sArr, byte[] bArr, short[] sArr2, int i10, int i11, int i12) {
        int i13;
        if (i10 == 1) {
            short s10 = sArr2[0];
            if (s10 == 1) {
                sArr[i11] = 0;
            } else if (s10 <= 256) {
                sArr[i11] = (short) getUnsignedMod(bToUnsignedInt(bArr[i12]), sArr2[0]);
            } else {
                sArr[i11] = (short) getUnsignedMod(bToUnsignedInt(bArr[i12]) + (bArr[i12 + 1] << 8), sArr2[0]);
            }
        }
        if (i10 > 1) {
            int i14 = (i10 + 1) / 2;
            short[] sArr3 = new short[i14];
            short[] sArr4 = new short[i14];
            int i15 = i10 / 2;
            short[] sArr5 = new short[i15];
            int[] iArr = new int[i15];
            int i16 = i12;
            int i17 = 0;
            while (true) {
                i13 = i10 - 1;
                if (i17 >= i13) {
                    break;
                }
                int i18 = sArr2[i17] * sArr2[i17 + 1];
                if (i18 > 4194048) {
                    int i19 = i17 / 2;
                    iArr[i19] = 65536;
                    sArr5[i19] = (short) ((bToUnsignedInt(bArr[i16 + 1]) * 256) + bToUnsignedInt(bArr[i16]));
                    i16 += 2;
                    sArr4[i19] = (short) ((((i18 + 255) >>> 8) + 255) >>> 8);
                } else if (i18 >= 16384) {
                    int i20 = i17 / 2;
                    iArr[i20] = 256;
                    sArr5[i20] = (short) bToUnsignedInt(bArr[i16]);
                    i16++;
                    sArr4[i20] = (short) ((i18 + 255) >>> 8);
                } else {
                    int i21 = i17 / 2;
                    iArr[i21] = 1;
                    sArr5[i21] = 0;
                    sArr4[i21] = (short) i18;
                }
                i17 += 2;
            }
            if (i17 < i10) {
                sArr4[i17 / 2] = sArr2[i17];
            }
            decode(sArr3, bArr, sArr4, i14, i11, i16);
            int i22 = i11;
            int i23 = 0;
            while (i23 < i13) {
                int i24 = i23 / 2;
                int[] unsignedDivMod = getUnsignedDivMod((iArr[i24] * sToUnsignedInt(sArr3[i24])) + sToUnsignedInt(sArr5[i24]), sArr2[i23]);
                int i25 = i22 + 1;
                sArr[i22] = (short) unsignedDivMod[1];
                i22 += 2;
                sArr[i25] = (short) getUnsignedMod(unsignedDivMod[0], sArr2[i23 + 1]);
                i23 += 2;
            }
            if (i23 < i10) {
                sArr[i22] = sArr3[i23 / 2];
            }
        }
    }

    private static void encode(byte[] bArr, short[] sArr, short[] sArr2, int i10, int i11) {
        int i12 = 0;
        if (i10 == 1) {
            short s10 = sArr[0];
            short s11 = sArr2[0];
            while (s11 > 1) {
                bArr[i11] = (byte) s10;
                s10 = (short) (s10 >>> 8);
                s11 = (short) ((s11 + 255) >>> 8);
                i11++;
            }
        }
        if (i10 > 1) {
            int i13 = (i10 + 1) / 2;
            short[] sArr3 = new short[i13];
            short[] sArr4 = new short[i13];
            while (i12 < i10 - 1) {
                short s12 = sArr2[i12];
                int i14 = i12 + 1;
                int i15 = (sArr[i14] * s12) + sArr[i12];
                int i16 = sArr2[i14] * s12;
                while (i16 >= 16384) {
                    bArr[i11] = (byte) i15;
                    i15 >>>= 8;
                    i16 = (i16 + 255) >>> 8;
                    i11++;
                }
                int i17 = i12 / 2;
                sArr3[i17] = (short) i15;
                sArr4[i17] = (short) i16;
                i12 += 2;
            }
            if (i12 < i10) {
                int i18 = i12 / 2;
                sArr3[i18] = sArr[i12];
                sArr4[i18] = sArr2[i12];
            }
            encode(bArr, sArr3, sArr4, i13, i11);
        }
    }

    public static void expand(int[] iArr, byte[] bArr) throws DataLengthException, IllegalArgumentException {
        byte[] bArr2 = new byte[iArr.length * 4];
        byte[] bArr3 = new byte[iArr.length * 4];
        generateAES256CTRStream(bArr2, bArr3, new byte[16], bArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = i10 * 4;
            iArr[i10] = bToUnsignedInt(bArr3[i11]) + (bToUnsignedInt(bArr3[i11 + 1]) << 8) + (bToUnsignedInt(bArr3[i11 + 2]) << 16) + (bToUnsignedInt(bArr3[i11 + 3]) << 24);
        }
    }

    private static void generateAES256CTRStream(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws DataLengthException, IllegalArgumentException {
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
        cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(bArr4), bArr3));
        cTRModeCipherNewInstance.processBytes(bArr, 0, bArr2.length, bArr2, 0);
    }

    public static void generatePolynomialInRQFromSeed(short[] sArr, byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        int[] iArr = new int[i10];
        expand(iArr, bArr);
        for (int i12 = 0; i12 < i10; i12++) {
            sArr[i12] = (short) (getUnsignedMod(iArr[i12], i11) - ((i11 - 1) / 2));
        }
    }

    public static void getDecodedPolynomial(short[] sArr, byte[] bArr, int i10, int i11) {
        short[] sArr2 = new short[i10];
        short[] sArr3 = new short[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            sArr3[i12] = (short) i11;
        }
        decode(sArr2, bArr, sArr3, i10, 0, 0);
        for (int i13 = 0; i13 < i10; i13++) {
            sArr[i13] = (short) (sArr2[i13] - ((i11 - 1) / 2));
        }
    }

    public static void getDecodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i10 / 4) {
            int i14 = i12 + 1;
            byte b10 = bArr2[i12];
            bArr[i13] = (byte) ((bToUnsignedInt(b10) & 3) - 1);
            bArr[i13 + 1] = (byte) ((bToUnsignedInt(r1) & 3) - 1);
            byte b11 = (byte) (((byte) (b10 >>> 2)) >>> 2);
            int i15 = i13 + 3;
            bArr[i13 + 2] = (byte) ((bToUnsignedInt(b11) & 3) - 1);
            i13 += 4;
            bArr[i15] = (byte) ((bToUnsignedInt((byte) (b11 >>> 2)) & 3) - 1);
            i11++;
            i12 = i14;
        }
        bArr[i13] = (byte) ((bToUnsignedInt(bArr2[i12]) & 3) - 1);
    }

    public static void getEncodedInputs(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            int i11 = i10 >>> 3;
            bArr[i11] = (byte) (bArr[i11] | (bArr2[i10] << (i10 & 7)));
        }
    }

    public static void getEncodedPolynomial(byte[] bArr, short[] sArr, int i10, int i11) {
        short[] sArr2 = new short[i10];
        short[] sArr3 = new short[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            sArr2[i12] = (short) b.a(i11, 1, 2, sArr[i12]);
        }
        for (int i13 = 0; i13 < i10; i13++) {
            sArr3[i13] = (short) i11;
        }
        encode(bArr, sArr2, sArr3, i10, 0);
    }

    public static void getEncodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i10 / 4) {
            int i14 = i13 + 3;
            byte b10 = (byte) (((byte) (((byte) (bArr2[i13] + 1)) + (((byte) (bArr2[i13 + 1] + 1)) << 2))) + (((byte) (bArr2[i13 + 2] + 1)) << 4));
            i13 += 4;
            bArr[i12] = (byte) (b10 + (((byte) (bArr2[i14] + 1)) << 6));
            i11++;
            i12++;
        }
        bArr[i12] = (byte) (bArr2[i13] + 1);
    }

    public static byte[] getHashWithPrefix(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        int length = bArr.length + bArr2.length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        SHA512Digest sHA512Digest = new SHA512Digest();
        sHA512Digest.update(bArr4, 0, length);
        sHA512Digest.doFinal(bArr3, 0);
        return bArr3;
    }

    public static int getInverseInRQ(int i10, int i11) {
        int modFreeze = i10;
        for (int i12 = 1; i12 < i11 - 2; i12++) {
            modFreeze = getModFreeze(modFreeze * i10, i11);
        }
        return modFreeze;
    }

    public static int getModFreeze(int i10, int i11) {
        int i12 = (i11 - 1) / 2;
        return getSignedDivMod(i10 + i12, i11)[1] - i12;
    }

    public static void getOneThirdInverseInRQ(short[] sArr, byte[] bArr, int i10, int i11) {
        int i12 = i10 + 1;
        short[] sArr2 = new short[i12];
        short[] sArr3 = new short[i12];
        short[] sArr4 = new short[i12];
        short[] sArr5 = new short[i12];
        sArr4[0] = (short) getInverseInRQ(3, i11);
        sArr2[0] = 1;
        int i13 = i10 - 1;
        sArr2[i13] = -1;
        sArr2[i10] = -1;
        for (int i14 = 0; i14 < i10; i14++) {
            sArr3[i13 - i14] = bArr[i14];
        }
        sArr3[i10] = 0;
        int i15 = 1;
        for (int i16 = 0; i16 < (i10 * 2) - 1; i16++) {
            System.arraycopy(sArr5, 0, sArr5, 1, i10);
            sArr5[0] = 0;
            int i17 = -i15;
            int iCheckLessThanZero = checkLessThanZero(i17) & checkNotEqualToZero(sArr3[0]);
            i15 = (i15 ^ ((i17 ^ i15) & iCheckLessThanZero)) + 1;
            for (int i18 = 0; i18 < i12; i18++) {
                short s10 = sArr2[i18];
                int i19 = (sArr3[i18] ^ s10) & iCheckLessThanZero;
                sArr2[i18] = (short) (s10 ^ i19);
                sArr3[i18] = (short) (sArr3[i18] ^ i19);
                short s11 = sArr5[i18];
                int i20 = (sArr4[i18] ^ s11) & iCheckLessThanZero;
                sArr5[i18] = (short) (s11 ^ i20);
                sArr4[i18] = (short) (sArr4[i18] ^ i20);
            }
            short s12 = sArr2[0];
            short s13 = sArr3[0];
            for (int i21 = 0; i21 < i12; i21++) {
                sArr3[i21] = (short) getModFreeze((sArr3[i21] * s12) - (sArr2[i21] * s13), i11);
            }
            for (int i22 = 0; i22 < i12; i22++) {
                sArr4[i22] = (short) getModFreeze((sArr4[i22] * s12) - (sArr5[i22] * s13), i11);
            }
            int i23 = 0;
            while (i23 < i10) {
                int i24 = i23 + 1;
                sArr3[i23] = sArr3[i24];
                i23 = i24;
            }
            sArr3[i10] = 0;
        }
        int inverseInRQ = getInverseInRQ(sArr2[0], i11);
        for (int i25 = 0; i25 < i10; i25++) {
            sArr[i25] = (short) getModFreeze(sArr5[i13 - i25] * inverseInRQ, i11);
        }
    }

    public static void getRandomInputs(SecureRandom secureRandom, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length / 8];
        secureRandom.nextBytes(bArr2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) ((bArr2[i10 >>> 3] >>> (i10 & 7)) & 1);
        }
    }

    public static void getRandomShortPolynomial(SecureRandom secureRandom, byte[] bArr, int i10, int i11) {
        int[] iArr = new int[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            iArr[i12] = getRandomUnsignedInteger(secureRandom);
        }
        sortGenerateShortPolynomial(bArr, iArr, i10, i11);
    }

    public static void getRandomSmallPolynomial(SecureRandom secureRandom, byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) ((((getRandomUnsignedInteger(secureRandom) & 1073741823) * 3) >>> 30) - 1);
        }
    }

    public static int getRandomUnsignedInteger(SecureRandom secureRandom) {
        byte[] bArr = new byte[4];
        secureRandom.nextBytes(bArr);
        return bToUnsignedInt(bArr[0]) + (bToUnsignedInt(bArr[1]) << 8) + (bToUnsignedInt(bArr[2]) << 16) + (bToUnsignedInt(bArr[3]) << 24);
    }

    public static void getRoundedDecodedPolynomial(short[] sArr, byte[] bArr, int i10, int i11) {
        short[] sArr2 = new short[i10];
        short[] sArr3 = new short[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            sArr3[i12] = (short) ((i11 + 2) / 3);
        }
        decode(sArr2, bArr, sArr3, i10, 0, 0);
        for (int i13 = 0; i13 < i10; i13++) {
            sArr[i13] = (short) ((sArr2[i13] * 3) - ((i11 - 1) / 2));
        }
    }

    public static void getRoundedEncodedPolynomial(byte[] bArr, short[] sArr, int i10, int i11) {
        short[] sArr2 = new short[i10];
        short[] sArr3 = new short[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            sArr2[i12] = (short) (((((i11 - 1) / 2) + sArr[i12]) * 10923) >>> 15);
            sArr3[i12] = (short) ((i11 + 2) / 3);
        }
        encode(bArr, sArr2, sArr3, i10, 0);
    }

    private static int[] getSignedDivMod(int i10, int i11) {
        int[] unsignedDivMod = getUnsignedDivMod(toIntExact(iToUnsignedLong(i10) - 2147483648L), i11);
        int[] unsignedDivMod2 = getUnsignedDivMod(PKIFailureInfo.systemUnavail, i11);
        int intExact = toIntExact(iToUnsignedLong(unsignedDivMod[0]) - iToUnsignedLong(unsignedDivMod2[0]));
        int intExact2 = toIntExact(iToUnsignedLong(unsignedDivMod[1]) - iToUnsignedLong(unsignedDivMod2[1]));
        int i12 = -(intExact2 >>> 31);
        return new int[]{intExact + i12, intExact2 + (i11 & i12)};
    }

    public static void getTopDecodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            int i11 = i10 * 2;
            bArr[i11] = (byte) (bArr2[i10] & RegisterType.DOUBLE_HI);
            bArr[i11 + 1] = (byte) (bArr2[i10] >>> 4);
        }
    }

    public static void getTopEncodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (bArr2[i11] + (bArr2[i11 + 1] << 4));
        }
    }

    private static int[] getUnsignedDivMod(int i10, int i11) {
        long jIToUnsignedLong = iToUnsignedLong(i10);
        long j10 = i11;
        long jIToUnsignedLong2 = iToUnsignedLong(PKIFailureInfo.systemUnavail) / j10;
        long j11 = (jIToUnsignedLong * jIToUnsignedLong2) >>> 31;
        long j12 = jIToUnsignedLong - (j11 * j10);
        long j13 = (jIToUnsignedLong2 * j12) >>> 31;
        long j14 = (j12 - (j13 * j10)) - j10;
        long j15 = j11 + j13 + 1;
        long j16 = -(j14 >>> 63);
        return new int[]{toIntExact(j15 + j16), toIntExact(j14 + (j10 & j16))};
    }

    private static int getUnsignedMod(int i10, int i11) {
        return getUnsignedDivMod(i10, i11)[1];
    }

    public static long iToUnsignedLong(int i10) {
        return i10 & BodyPartID.bodyIdMax;
    }

    public static boolean isInvertiblePolynomialInR3(byte[] bArr, byte[] bArr2, int i10) {
        int i11 = i10 + 1;
        byte[] bArr3 = new byte[i11];
        byte[] bArr4 = new byte[i11];
        byte[] bArr5 = new byte[i11];
        byte[] bArr6 = new byte[i11];
        bArr5[0] = 1;
        bArr3[0] = 1;
        int i12 = i10 - 1;
        bArr3[i12] = -1;
        bArr3[i10] = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            bArr4[i12 - i13] = bArr[i13];
        }
        bArr4[i10] = 0;
        int i14 = 1;
        for (int i15 = 0; i15 < (i10 * 2) - 1; i15++) {
            System.arraycopy(bArr6, 0, bArr6, 1, i10);
            bArr6[0] = 0;
            int i16 = (-bArr4[0]) * bArr3[0];
            int i17 = -i14;
            int iCheckLessThanZero = checkLessThanZero(i17) & checkNotEqualToZero(bArr4[0]);
            i14 = (i14 ^ ((i17 ^ i14) & iCheckLessThanZero)) + 1;
            for (int i18 = 0; i18 < i11; i18++) {
                byte b10 = bArr3[i18];
                int i19 = (bArr4[i18] ^ b10) & iCheckLessThanZero;
                bArr3[i18] = (byte) (b10 ^ i19);
                bArr4[i18] = (byte) (bArr4[i18] ^ i19);
                byte b11 = bArr6[i18];
                int i20 = (bArr5[i18] ^ b11) & iCheckLessThanZero;
                bArr6[i18] = (byte) (b11 ^ i20);
                bArr5[i18] = (byte) (bArr5[i18] ^ i20);
            }
            for (int i21 = 0; i21 < i11; i21++) {
                bArr4[i21] = (byte) getModFreeze((bArr3[i21] * i16) + bArr4[i21], 3);
            }
            for (int i22 = 0; i22 < i11; i22++) {
                bArr5[i22] = (byte) getModFreeze((bArr6[i22] * i16) + bArr5[i22], 3);
            }
            int i23 = 0;
            while (i23 < i10) {
                int i24 = i23 + 1;
                bArr4[i23] = bArr4[i24];
                i23 = i24;
            }
            bArr4[i10] = 0;
        }
        byte b12 = bArr3[0];
        for (int i25 = 0; i25 < i10; i25++) {
            bArr2[i25] = (byte) (bArr6[i12 - i25] * b12);
        }
        return i14 == 0;
    }

    public static void minmax(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        int i14 = i12 ^ i13;
        int i15 = i13 - i12;
        int i16 = i14 & (-((i15 ^ (((i15 ^ i13) ^ PKIFailureInfo.systemUnavail) & i14)) >>> 31));
        iArr[i10] = i12 ^ i16;
        iArr[i11] = i13 ^ i16;
    }

    public static void multiplicationInR3(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        int i11 = i10 + i10;
        int i12 = i11 - 1;
        byte[] bArr4 = new byte[i12];
        for (int i13 = 0; i13 < i10; i13++) {
            byte modFreeze = 0;
            for (int i14 = 0; i14 <= i13; i14++) {
                modFreeze = (byte) getModFreeze((bArr2[i14] * bArr3[i13 - i14]) + modFreeze, 3);
            }
            bArr4[i13] = modFreeze;
        }
        for (int i15 = i10; i15 < i12; i15++) {
            byte modFreeze2 = 0;
            for (int i16 = (i15 - i10) + 1; i16 < i10; i16++) {
                modFreeze2 = (byte) getModFreeze((bArr2[i16] * bArr3[i15 - i16]) + modFreeze2, 3);
            }
            bArr4[i15] = modFreeze2;
        }
        for (int i17 = i11 - 2; i17 >= i10; i17--) {
            int i18 = i17 - i10;
            bArr4[i18] = (byte) getModFreeze(bArr4[i18] + bArr4[i17], 3);
            int i19 = i18 + 1;
            bArr4[i19] = (byte) getModFreeze(bArr4[i19] + bArr4[i17], 3);
        }
        for (int i20 = 0; i20 < i10; i20++) {
            bArr[i20] = bArr4[i20];
        }
    }

    public static void multiplicationInRQ(short[] sArr, short[] sArr2, byte[] bArr, int i10, int i11) {
        int i12 = i10 + i10;
        int i13 = i12 - 1;
        short[] sArr3 = new short[i13];
        for (int i14 = 0; i14 < i10; i14++) {
            short modFreeze = 0;
            for (int i15 = 0; i15 <= i14; i15++) {
                modFreeze = (short) getModFreeze((sArr2[i15] * bArr[i14 - i15]) + modFreeze, i11);
            }
            sArr3[i14] = modFreeze;
        }
        for (int i16 = i10; i16 < i13; i16++) {
            short modFreeze2 = 0;
            for (int i17 = (i16 - i10) + 1; i17 < i10; i17++) {
                modFreeze2 = (short) getModFreeze((sArr2[i17] * bArr[i16 - i17]) + modFreeze2, i11);
            }
            sArr3[i16] = modFreeze2;
        }
        for (int i18 = i12 - 2; i18 >= i10; i18--) {
            int i19 = i18 - i10;
            sArr3[i19] = (short) getModFreeze(sArr3[i19] + sArr3[i18], i11);
            int i20 = i19 + 1;
            sArr3[i20] = (short) getModFreeze(sArr3[i20] + sArr3[i18], i11);
        }
        for (int i21 = 0; i21 < i10; i21++) {
            sArr[i21] = sArr3[i21];
        }
    }

    public static void right(byte[] bArr, short[] sArr, byte[] bArr2, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr[i14] = (byte) (-checkLessThanZero(getModFreeze(k.b(i11, 4, getModFreeze((bArr2[i14] * i13) - i12, i10) - sArr[i14], 1), i10)));
        }
    }

    public static void roundPolynomial(short[] sArr, short[] sArr2) {
        for (int i10 = 0; i10 < sArr.length; i10++) {
            short s10 = sArr2[i10];
            sArr[i10] = (short) (s10 - getModFreeze(s10, 3));
        }
    }

    public static int sToUnsignedInt(short s10) {
        return s10 & HPKE.aead_EXPORT_ONLY;
    }

    public static void scalarMultiplicationInRQ(short[] sArr, short[] sArr2, int i10, int i11) {
        for (int i12 = 0; i12 < sArr2.length; i12++) {
            sArr[i12] = (short) getModFreeze(sArr2[i12] * i10, i11);
        }
    }

    public static void sortGenerateShortPolynomial(byte[] bArr, int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = iArr[i12] & (-2);
        }
        while (i11 < i10) {
            iArr[i11] = (iArr[i11] & (-3)) | 1;
            i11++;
        }
        cryptoSort(iArr, i10);
        for (int i13 = 0; i13 < i10; i13++) {
            bArr[i13] = (byte) ((iArr[i13] & 3) - 1);
        }
    }

    public static int toIntExact(long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            return i10;
        }
        throw new IllegalStateException("value out of integer range");
    }

    public static void top(byte[] bArr, short[] sArr, byte[] bArr2, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < bArr.length; i13++) {
            bArr[i13] = (byte) ((((getModFreeze((((i10 - 1) / 2) * bArr2[i13]) + sArr[i13], i10) + i11) * i12) + 16384) >>> 15);
        }
    }

    public static void transformRQToR3(byte[] bArr, short[] sArr) {
        for (int i10 = 0; i10 < sArr.length; i10++) {
            bArr[i10] = (byte) getModFreeze(sArr[i10], 3);
        }
    }

    public static void updateDiffMask(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int i12 = bArr[i11];
            bArr[i11] = (byte) (i12 ^ ((bArr2[i11] ^ i12) & i10));
        }
    }
}
