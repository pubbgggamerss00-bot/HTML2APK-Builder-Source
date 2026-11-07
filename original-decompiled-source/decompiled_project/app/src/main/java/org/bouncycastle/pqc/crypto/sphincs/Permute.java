package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Permute {
    private static final int CHACHA_ROUNDS = 12;

    public static void permute(int i10, int[] iArr) {
        int i11 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i10 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        char c10 = 3;
        int i15 = iArr[3];
        char c11 = 4;
        int i16 = iArr[4];
        char c12 = 5;
        int i17 = iArr[5];
        char c13 = 6;
        int i18 = iArr[6];
        int i19 = 7;
        int i20 = iArr[7];
        int i21 = 8;
        int i22 = iArr[8];
        int i23 = iArr[9];
        int i24 = iArr[10];
        int i25 = iArr[11];
        int i26 = iArr[12];
        int i27 = iArr[13];
        int i28 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i28;
        int iRotl3 = i27;
        int iRotl4 = i26;
        int i29 = i25;
        int i30 = i24;
        int i31 = i23;
        int i32 = i22;
        int iRotl5 = i20;
        int iRotl6 = i18;
        int iRotl7 = i17;
        int iRotl8 = i16;
        int i33 = i15;
        int i34 = i14;
        int i35 = i13;
        int i36 = i12;
        int i37 = i10;
        while (i37 > 0) {
            int i38 = i36 + iRotl8;
            char c14 = c10;
            int iRotl9 = rotl(iRotl4 ^ i38, i11);
            int i39 = i32 + iRotl9;
            int iRotl10 = rotl(iRotl8 ^ i39, 12);
            int i40 = i38 + iRotl10;
            int iRotl11 = rotl(iRotl9 ^ i40, i21);
            int i41 = i39 + iRotl11;
            int iRotl12 = rotl(iRotl10 ^ i41, i19);
            int i42 = i35 + iRotl7;
            char c15 = c11;
            int iRotl13 = rotl(iRotl3 ^ i42, i11);
            int i43 = i31 + iRotl13;
            int iRotl14 = rotl(iRotl7 ^ i43, 12);
            int i44 = i42 + iRotl14;
            int iRotl15 = rotl(iRotl13 ^ i44, i21);
            int i45 = i43 + iRotl15;
            int iRotl16 = rotl(iRotl14 ^ i45, i19);
            int i46 = i34 + iRotl6;
            char c16 = c12;
            int iRotl17 = rotl(iRotl2 ^ i46, i11);
            int i47 = i30 + iRotl17;
            char c17 = c13;
            int iRotl18 = rotl(iRotl6 ^ i47, 12);
            int i48 = i46 + iRotl18;
            int iRotl19 = rotl(iRotl17 ^ i48, i21);
            int i49 = i47 + iRotl19;
            int iRotl20 = rotl(iRotl18 ^ i49, i19);
            int i50 = i33 + iRotl5;
            int iRotl21 = rotl(iRotl ^ i50, i11);
            int i51 = i29 + iRotl21;
            int iRotl22 = rotl(iRotl5 ^ i51, 12);
            int i52 = i50 + iRotl22;
            int iRotl23 = rotl(iRotl21 ^ i52, i21);
            int i53 = i51 + iRotl23;
            int iRotl24 = rotl(iRotl22 ^ i53, 7);
            int i54 = i40 + iRotl16;
            int iRotl25 = rotl(iRotl23 ^ i54, 16);
            int i55 = i49 + iRotl25;
            int iRotl26 = rotl(iRotl16 ^ i55, 12);
            i36 = i54 + iRotl26;
            iRotl = rotl(iRotl25 ^ i36, 8);
            i30 = i55 + iRotl;
            iRotl7 = rotl(iRotl26 ^ i30, 7);
            int i56 = i44 + iRotl20;
            int iRotl27 = rotl(iRotl11 ^ i56, 16);
            int i57 = i53 + iRotl27;
            int iRotl28 = rotl(iRotl20 ^ i57, 12);
            i35 = i56 + iRotl28;
            iRotl4 = rotl(iRotl27 ^ i35, 8);
            i29 = i57 + iRotl4;
            iRotl6 = rotl(iRotl28 ^ i29, 7);
            int i58 = i48 + iRotl24;
            int iRotl29 = rotl(iRotl15 ^ i58, 16);
            int i59 = i41 + iRotl29;
            int iRotl30 = rotl(iRotl24 ^ i59, 12);
            i34 = i58 + iRotl30;
            iRotl3 = rotl(iRotl29 ^ i34, 8);
            i32 = i59 + iRotl3;
            iRotl5 = rotl(iRotl30 ^ i32, 7);
            int i60 = i52 + iRotl12;
            int iRotl31 = rotl(iRotl19 ^ i60, 16);
            int i61 = i45 + iRotl31;
            int iRotl32 = rotl(iRotl12 ^ i61, 12);
            i33 = i60 + iRotl32;
            iRotl2 = rotl(iRotl31 ^ i33, 8);
            i31 = i61 + iRotl2;
            iRotl8 = rotl(iRotl32 ^ i31, 7);
            i37 -= 2;
            i19 = 7;
            i11 = 16;
            c10 = c14;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            i21 = 8;
        }
        iArr[0] = i36;
        iArr[1] = i35;
        iArr[2] = i34;
        iArr[c10] = i33;
        iArr[c11] = iRotl8;
        iArr[c12] = iRotl7;
        iArr[c13] = iRotl6;
        iArr[i19] = iRotl5;
        iArr[8] = i32;
        iArr[9] = i31;
        iArr[10] = i30;
        iArr[11] = i29;
        iArr[12] = iRotl4;
        iArr[13] = iRotl3;
        iArr[14] = iRotl2;
        iArr[15] = iRotl;
    }

    public static int rotl(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i10 = 0; i10 < 16; i10++) {
            iArr[i10] = Pack.littleEndianToInt(bArr2, i10 * 4);
        }
        permute(12, iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            Pack.intToLittleEndian(iArr[i11], bArr, i11 * 4);
        }
    }
}
