package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;
import org.jf.dexlib2.analysis.RegisterType;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

/* loaded from: classes2.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f19954m1 = -2139062144;

    /* renamed from: m2, reason: collision with root package name */
    private static final int f19955m2 = 2139062143;

    /* renamed from: m3, reason: collision with root package name */
    private static final int f19956m3 = 27;

    /* renamed from: m4, reason: collision with root package name */
    private static final int f19957m4 = -1061109568;

    /* renamed from: m5, reason: collision with root package name */
    private static final int f19958m5 = 1061109567;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, RegisterType.REFERENCE, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, RegisterType.UNINIT_REF, -1, -13, -46, -51, 12, RegisterType.CONFLICTED, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, RegisterType.FLOAT, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, RegisterType.DOUBLE_LO, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, RegisterType.UNINIT_THIS, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, RegisterType.LONG_HI, -65, -26, 66, 104, 65, -103, 45, RegisterType.DOUBLE_HI, -80, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, RegisterType.FLOAT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, RegisterType.DOUBLE_HI, 2, -63, -81, -67, 3, 1, RegisterType.CONFLICTED, -118, 107, 58, -111, RegisterType.UNINIT_THIS, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, RegisterType.DOUBLE_LO, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, RegisterType.REFERENCE, RegisterType.UNINIT_REF, 89, 39, Byte.MIN_VALUE, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, RegisterType.LONG_HI, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, HeaderItem.DATA_START_OFFSET, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};

    public AESLightEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity()));
    }

    private static int FFmulX(int i10) {
        return (((i10 & f19954m1) >>> 7) * 27) ^ ((f19955m2 & i10) << 1);
    }

    private static int FFmulX2(int i10) {
        int i11 = (f19958m5 & i10) << 2;
        int i12 = i10 & f19957m4;
        int i13 = i12 ^ (i12 >>> 1);
        return (i13 >>> 5) ^ (i11 ^ (i13 >>> 2));
    }

    private int bitsOfSecurity() {
        if (this.WorkingKey == null) {
            return 256;
        }
        return (r0.length - 7) << 5;
    }

    private void decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i10);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i10 + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i10 + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i10 + 12);
        int i12 = this.ROUNDS;
        int[] iArr2 = iArr[i12];
        char c10 = 0;
        int i13 = iLittleEndianToInt ^ iArr2[0];
        int i14 = 1;
        int i15 = iLittleEndianToInt2 ^ iArr2[1];
        int i16 = iLittleEndianToInt3 ^ iArr2[2];
        int i17 = i12 - 1;
        int iInv_mcol = iLittleEndianToInt4 ^ iArr2[3];
        while (i17 > i14) {
            byte[] bArr3 = Si;
            int iInv_mcol2 = inv_mcol((((bArr3[i13 & 255] & 255) ^ ((bArr3[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i16 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i15 >> 24) & 255] << 24)) ^ iArr[i17][c10];
            int iInv_mcol3 = inv_mcol((((bArr3[i15 & 255] & 255) ^ ((bArr3[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iInv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr3[(i16 >> 24) & 255] << 24)) ^ iArr[i17][i14];
            char c11 = c10;
            int iInv_mcol4 = inv_mcol(((((bArr3[(i15 >> 8) & 255] & 255) << 8) ^ (bArr3[i16 & 255] & 255)) ^ ((bArr3[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iInv_mcol >> 24) & 255] << 24)) ^ iArr[i17][2];
            int iInv_mcol5 = inv_mcol((((bArr3[iInv_mcol & 255] & 255) ^ ((bArr3[(i16 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i13 >> 24) & 255] << 24));
            int i18 = i17 - 1;
            int i19 = iInv_mcol5 ^ iArr[i17][3];
            int iInv_mcol6 = inv_mcol((((bArr3[iInv_mcol2 & 255] & 255) ^ ((bArr3[(i19 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iInv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iInv_mcol3 >> 24) & 255] << 24)) ^ iArr[i18][c11];
            int iInv_mcol7 = inv_mcol((((bArr3[iInv_mcol3 & 255] & 255) ^ ((bArr3[(iInv_mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i19 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iInv_mcol4 >> 24) & 255] << 24)) ^ iArr[i18][i14];
            int i20 = i14;
            int iInv_mcol8 = inv_mcol(((((bArr3[(iInv_mcol3 >> 8) & 255] & 255) << 8) ^ (bArr3[iInv_mcol4 & 255] & 255)) ^ ((bArr3[(iInv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i19 >> 24) & 255] << 24)) ^ iArr[i18][2];
            i17 -= 2;
            iInv_mcol = inv_mcol((((bArr3[i19 & 255] & 255) ^ ((bArr3[(iInv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iInv_mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iInv_mcol2 >> 24) & 255] << 24)) ^ iArr[i18][3];
            c10 = c11;
            i13 = iInv_mcol6;
            i15 = iInv_mcol7;
            i16 = iInv_mcol8;
            i14 = i20;
        }
        char c12 = c10;
        int i21 = i14;
        byte[] bArr4 = Si;
        int iInv_mcol9 = inv_mcol((((bArr4[i13 & 255] & 255) ^ ((bArr4[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i16 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i15 >> 24) & 255] << 24)) ^ iArr[i17][c12];
        int iInv_mcol10 = inv_mcol((((bArr4[i15 & 255] & 255) ^ ((bArr4[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr4[(i16 >> 24) & 255] << 24)) ^ iArr[i17][i21];
        int iInv_mcol11 = inv_mcol((((bArr4[i16 & 255] & 255) ^ ((bArr4[(i15 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol >> 24) & 255] << 24)) ^ iArr[i17][2];
        int iInv_mcol12 = inv_mcol((((bArr4[iInv_mcol & 255] & 255) ^ ((bArr4[(i16 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i13 >> 24) & 255] << 24)) ^ iArr[i17][3];
        int i22 = (((bArr4[iInv_mcol9 & 255] & 255) ^ ((bArr4[(iInv_mcol12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol10 >> 24) & 255] << 24);
        int[] iArr3 = iArr[c12];
        int i23 = i22 ^ iArr3[c12];
        int i24 = ((((bArr4[iInv_mcol10 & 255] & 255) ^ ((bArr4[(iInv_mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol11 >> 24) & 255] << 24)) ^ iArr3[i21];
        int i25 = ((((bArr4[iInv_mcol11 & 255] & 255) ^ ((bArr4[(iInv_mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol12 >> 24) & 255] << 24)) ^ iArr3[2];
        int i26 = ((((bArr4[iInv_mcol12 & 255] & 255) ^ ((bArr4[(iInv_mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iInv_mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iInv_mcol9 >> 24) & 255] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i23, bArr2, i11);
        Pack.intToLittleEndian(i24, bArr2, i11 + 4);
        Pack.intToLittleEndian(i25, bArr2, i11 + 8);
        Pack.intToLittleEndian(i26, bArr2, i11 + 12);
    }

    private void encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11, int[][] iArr) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i10);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i10 + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i10 + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i10 + 12);
        char c10 = 0;
        int[] iArr2 = iArr[0];
        int i12 = iLittleEndianToInt ^ iArr2[0];
        int i13 = 1;
        int i14 = iLittleEndianToInt2 ^ iArr2[1];
        int i15 = iLittleEndianToInt3 ^ iArr2[2];
        int iMcol = iLittleEndianToInt4 ^ iArr2[3];
        int i16 = 1;
        while (i16 < this.ROUNDS - i13) {
            byte[] bArr3 = S;
            int iMcol2 = mcol((((bArr3[i12 & 255] & 255) ^ ((bArr3[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iMcol >> 24) & 255] << 24)) ^ iArr[i16][c10];
            int iMcol3 = mcol((((bArr3[i14 & 255] & 255) ^ ((bArr3[(i15 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iMcol >> 16) & 255] & 255) << 16)) ^ (bArr3[(i12 >> 24) & 255] << 24)) ^ iArr[i16][i13];
            char c11 = c10;
            int iMcol4 = mcol(((((bArr3[(iMcol >> 8) & 255] & 255) << 8) ^ (bArr3[i15 & 255] & 255)) ^ ((bArr3[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i14 >> 24) & 255] << 24)) ^ iArr[i16][2];
            int iMcol5 = mcol((((bArr3[iMcol & 255] & 255) ^ ((bArr3[(i12 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i15 >> 24) & 255] << 24));
            int i17 = i16 + 1;
            int i18 = iMcol5 ^ iArr[i16][3];
            int iMcol6 = mcol((((bArr3[iMcol2 & 255] & 255) ^ ((bArr3[(iMcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iMcol4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i18 >> 24) & 255] << 24)) ^ iArr[i17][c11];
            int iMcol7 = mcol((((bArr3[iMcol3 & 255] & 255) ^ ((bArr3[(iMcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i18 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iMcol2 >> 24) & 255] << 24)) ^ iArr[i17][i13];
            int i19 = i13;
            int iMcol8 = mcol(((((bArr3[(i18 >> 8) & 255] & 255) << 8) ^ (bArr3[iMcol4 & 255] & 255)) ^ ((bArr3[(iMcol2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iMcol3 >> 24) & 255] << 24)) ^ iArr[i17][2];
            i16 += 2;
            iMcol = mcol((((bArr3[i18 & 255] & 255) ^ ((bArr3[(iMcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iMcol3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iMcol4 >> 24) & 255] << 24)) ^ iArr[i17][3];
            c10 = c11;
            i12 = iMcol6;
            i14 = iMcol7;
            i15 = iMcol8;
            i13 = i19;
        }
        char c12 = c10;
        int i20 = i13;
        byte[] bArr4 = S;
        int iMcol9 = mcol((((bArr4[i12 & 255] & 255) ^ ((bArr4[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol >> 24) & 255] << 24)) ^ iArr[i16][c12];
        int iMcol10 = mcol((((bArr4[i14 & 255] & 255) ^ ((bArr4[(i15 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol >> 16) & 255] & 255) << 16)) ^ (bArr4[(i12 >> 24) & 255] << 24)) ^ iArr[i16][i20];
        int iMcol11 = mcol((((bArr4[i15 & 255] & 255) ^ ((bArr4[(iMcol >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i14 >> 24) & 255] << 24)) ^ iArr[i16][2];
        int iMcol12 = mcol((((bArr4[iMcol & 255] & 255) ^ ((bArr4[(i12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr4[(i15 >> 24) & 255] << 24)) ^ iArr[i16][3];
        int i21 = (((bArr4[iMcol9 & 255] & 255) ^ ((bArr4[(iMcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol12 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i16 + 1];
        int i22 = i21 ^ iArr3[c12];
        int i23 = ((((bArr4[iMcol10 & 255] & 255) ^ ((bArr4[(iMcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol9 >> 24) & 255] << 24)) ^ iArr3[i20];
        int i24 = iArr3[2] ^ ((((bArr4[iMcol11 & 255] & 255) ^ ((bArr4[(iMcol12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol10 >> 24) & 255] << 24));
        int i25 = ((((bArr4[iMcol12 & 255] & 255) ^ ((bArr4[(iMcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iMcol10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iMcol11 >> 24) & 255] << 24)) ^ iArr3[3];
        Pack.intToLittleEndian(i22, bArr2, i11);
        Pack.intToLittleEndian(i23, bArr2, i11 + 4);
        Pack.intToLittleEndian(i24, bArr2, i11 + 8);
        Pack.intToLittleEndian(i25, bArr2, i11 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z10) {
        int i10;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i11 = length >>> 2;
        this.ROUNDS = i11 + 6;
        int i12 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11 + 7, 4);
        char c10 = 3;
        if (i11 == 4) {
            i10 = 1;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i13 = 1; i13 <= 10; i13++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i13 - 1];
                int[] iArr2 = iArr[i13];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i11 == 6) {
            i10 = 1;
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i14 = 1;
            int i15 = 1;
            while (true) {
                int[] iArr3 = iArr[i14];
                iArr3[0] = iLittleEndianToInt9;
                iArr3[1] = iLittleEndianToInt10;
                int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ i15);
                int[] iArr4 = iArr[i14];
                iArr4[2] = iSubWord;
                int i16 = iLittleEndianToInt6 ^ iSubWord;
                iArr4[3] = i16;
                int i17 = iLittleEndianToInt7 ^ i16;
                int[] iArr5 = iArr[i14 + 1];
                iArr5[0] = i17;
                int i18 = iLittleEndianToInt8 ^ i17;
                iArr5[1] = i18;
                int i19 = iLittleEndianToInt9 ^ i18;
                iArr5[2] = i19;
                int i20 = iLittleEndianToInt10 ^ i19;
                iArr5[3] = i20;
                int iSubWord2 = subWord(shift(i20, 8)) ^ (i15 << 1);
                i15 <<= 2;
                iLittleEndianToInt5 = iSubWord ^ iSubWord2;
                int[] iArr6 = iArr[i14 + 2];
                iArr6[0] = iLittleEndianToInt5;
                iLittleEndianToInt6 = i16 ^ iLittleEndianToInt5;
                iArr6[1] = iLittleEndianToInt6;
                iLittleEndianToInt7 = i17 ^ iLittleEndianToInt6;
                iArr6[2] = iLittleEndianToInt7;
                iLittleEndianToInt8 = i18 ^ iLittleEndianToInt7;
                iArr6[3] = iLittleEndianToInt8;
                i14 += 3;
                if (i14 >= 13) {
                    break;
                }
                iLittleEndianToInt9 = i19 ^ iLittleEndianToInt8;
                iLittleEndianToInt10 = i20 ^ iLittleEndianToInt9;
            }
        } else {
            if (i11 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i21 = 1;
            int i22 = 2;
            while (true) {
                int iSubWord3 = subWord(shift(iLittleEndianToInt18, 8)) ^ i21;
                i21 <<= i12;
                iLittleEndianToInt11 ^= iSubWord3;
                int[] iArr7 = iArr[i22];
                iArr7[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr7[i12] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr7[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr7[c10] = iLittleEndianToInt14;
                i10 = i12;
                int i23 = i22 + 1;
                char c11 = c10;
                if (i23 >= 15) {
                    break;
                }
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr8 = iArr[i23];
                iArr8[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr8[i10] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr8[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr8[c11] = iLittleEndianToInt18;
                i22 += 2;
                i12 = i10;
                c10 = c11;
            }
        }
        if (!z10) {
            for (int i24 = i10; i24 < this.ROUNDS; i24++) {
                for (int i25 = 0; i25 < 4; i25++) {
                    int[] iArr9 = iArr[i24];
                    iArr9[i25] = inv_mcol(iArr9[i25]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i10) {
        int iShift = shift(i10, 8) ^ i10;
        int iFFmulX = i10 ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    private static int mcol(int i10) {
        int iShift = shift(i10, 8);
        int i11 = i10 ^ iShift;
        return FFmulX(i11) ^ (iShift ^ shift(i11, 16));
    }

    private static int shift(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private static int subWord(int i10) {
        byte[] bArr = S;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 8) & 255] & 255) << 8) | ((bArr[(i10 >> 16) & 255] & 255) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.a("invalid parameter passed to AES init - ", cipherParameters));
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z10);
        this.forEncryption = z10;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), bitsOfSecurity(), cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i10 > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i10, bArr2, i11, iArr);
        } else {
            decryptBlock(bArr, i10, bArr2, i11, iArr);
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
