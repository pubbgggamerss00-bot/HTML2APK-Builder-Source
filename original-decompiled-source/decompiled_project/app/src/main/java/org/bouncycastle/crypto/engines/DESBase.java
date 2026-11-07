package org.bouncycastle.crypto.engines;

import android.R;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Pack;
import org.jf.dexlib2.analysis.RegisterType;
import org.jf.dexlib2.dexbacked.raw.ItemType;

/* loaded from: classes2.dex */
class DESBase {
    protected static final int BLOCK_SIZE = 8;
    private static final short[] bytebit = {128, 64, 32, 16, 8, 4, 2, 1};
    private static final int[] bigbyte = {8388608, 4194304, PKIFailureInfo.badSenderNonce, PKIFailureInfo.badCertTemplate, PKIFailureInfo.signerNotTrusted, PKIFailureInfo.transactionIdInUse, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
    private static final byte[] pc1 = {56, 48, 40, 32, 24, RegisterType.UNINIT_REF, 8, 0, 57, 49, 41, 33, 25, RegisterType.UNINIT_THIS, 9, 1, 58, 50, 42, 34, 26, RegisterType.REFERENCE, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, 30, 22, RegisterType.DOUBLE_LO, 6, 61, 53, 45, 37, 29, 21, RegisterType.LONG_HI, 5, 60, 52, 44, 36, 28, 20, 12, 4, 27, RegisterType.CONFLICTED, RegisterType.FLOAT, 3};
    private static final byte[] totrot = {1, 2, 4, 6, 8, 10, 12, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, RegisterType.UNINIT_THIS, RegisterType.CONFLICTED, 21, 23, 25, 27, 28};
    private static final byte[] pc2 = {RegisterType.LONG_HI, RegisterType.UNINIT_REF, 10, 23, 0, 4, 2, 27, RegisterType.DOUBLE_LO, 5, 20, 9, 22, RegisterType.REFERENCE, RegisterType.FLOAT, 3, 25, 7, RegisterType.DOUBLE_HI, 6, 26, RegisterType.CONFLICTED, 12, 1, 40, 51, 30, 36, 46, 54, 29, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, 28, 31};
    private static final int[] SP1 = {R.attr.transitionName, 0, 65536, R.attr.fillColor, R.attr.manageSpaceActivity, 66564, 4, 65536, 1024, R.attr.transitionName, R.attr.fillColor, 1024, 16778244, R.attr.manageSpaceActivity, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, R.attr.theme, R.attr.theme, 16778244, 65540, 16777220, 16777220, 65540, 0, 1028, 66564, 16777216, 65536, R.attr.fillColor, 4, R.attr.theme, R.attr.transitionName, 16777216, 16777216, 1024, R.attr.manageSpaceActivity, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, R.attr.fillColor, 65540, R.attr.theme, 16778244, 16777220, 1028, 66564, R.attr.transitionName, 1028, 16778240, 16778240, 0, 65540, 66560, 0, R.attr.manageSpaceActivity};
    private static final int[] SP2 = {-2146402272, -2147450880, 32768, 1081376, PKIFailureInfo.badCertTemplate, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, PKIFailureInfo.systemUnavail, -2147450880, PKIFailureInfo.badCertTemplate, 32, -2146435040, 1081344, 1048608, -2147450848, 0, PKIFailureInfo.systemUnavail, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, PKIFailureInfo.badCertTemplate, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, PKIFailureInfo.systemUnavail, 32800, -2146402304, PKIFailureInfo.badCertTemplate, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, PKIFailureInfo.systemUnavail, -2146435040, -2146402272, 1081344};
    private static final int[] SP3 = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};
    private static final int[] SP4 = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, ItemType.CODE_ITEM, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, ItemType.CODE_ITEM, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, ItemType.CODE_ITEM, 8396928, 8388737, ItemType.CODE_ITEM, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};
    private static final int[] SP5 = {256, 34078976, 34078720, 1107296512, PKIFailureInfo.signerNotTrusted, 256, 1073741824, 34078720, 1074266368, PKIFailureInfo.signerNotTrusted, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, PKIFailureInfo.signerNotTrusted, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, PKIFailureInfo.signerNotTrusted, 0, 1074266112, 34078976, 1073742080};
    private static final int[] SP6 = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, PKIFailureInfo.duplicateCertReq, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, PKIFailureInfo.duplicateCertReq, 4194320, 536887312};
    private static final int[] SP7 = {PKIFailureInfo.badSenderNonce, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, PKIFailureInfo.badSenderNonce, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, PKIFailureInfo.badSenderNonce, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, PKIFailureInfo.badSenderNonce, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
    private static final int[] SP8 = {268439616, 4096, PKIFailureInfo.transactionIdInUse, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, PKIFailureInfo.transactionIdInUse, 266304, PKIFailureInfo.transactionIdInUse, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, PKIFailureInfo.transactionIdInUse, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    public void desFunc(int[] iArr, byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i10);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i10 + 4);
        int i12 = ((iBigEndianToInt >>> 4) ^ iBigEndianToInt2) & 252645135;
        int i13 = iBigEndianToInt2 ^ i12;
        int i14 = iBigEndianToInt ^ (i12 << 4);
        int i15 = ((i14 >>> 16) ^ i13) & 65535;
        int i16 = i13 ^ i15;
        int i17 = i14 ^ (i15 << 16);
        int i18 = ((i16 >>> 2) ^ i17) & 858993459;
        int i19 = i17 ^ i18;
        int i20 = i16 ^ (i18 << 2);
        int i21 = ((i20 >>> 8) ^ i19) & 16711935;
        int i22 = i19 ^ i21;
        int i23 = i20 ^ (i21 << 8);
        int i24 = (i23 >>> 31) | (i23 << 1);
        int i25 = (i22 ^ i24) & (-1431655766);
        int i26 = i22 ^ i25;
        int i27 = i24 ^ i25;
        int i28 = (i26 >>> 31) | (i26 << 1);
        for (int i29 = 0; i29 < 8; i29++) {
            int i30 = i29 * 4;
            int i31 = ((i27 << 28) | (i27 >>> 4)) ^ iArr[i30];
            int[] iArr2 = SP7;
            int i32 = iArr2[i31 & 63];
            int[] iArr3 = SP5;
            int i33 = i32 | iArr3[(i31 >>> 8) & 63];
            int[] iArr4 = SP3;
            int i34 = i33 | iArr4[(i31 >>> 16) & 63];
            int[] iArr5 = SP1;
            int i35 = iArr5[(i31 >>> 24) & 63] | i34;
            int i36 = iArr[i30 + 1] ^ i27;
            int[] iArr6 = SP8;
            int i37 = i35 | iArr6[i36 & 63];
            int[] iArr7 = SP6;
            int i38 = i37 | iArr7[(i36 >>> 8) & 63];
            int[] iArr8 = SP4;
            int i39 = i38 | iArr8[(i36 >>> 16) & 63];
            int[] iArr9 = SP2;
            i28 ^= i39 | iArr9[(i36 >>> 24) & 63];
            int i40 = ((i28 << 28) | (i28 >>> 4)) ^ iArr[i30 + 2];
            int i41 = iArr5[(i40 >>> 24) & 63] | iArr2[i40 & 63] | iArr3[(i40 >>> 8) & 63] | iArr4[(i40 >>> 16) & 63];
            int i42 = iArr[i30 + 3] ^ i28;
            i27 ^= (((i41 | iArr6[i42 & 63]) | iArr7[(i42 >>> 8) & 63]) | iArr8[(i42 >>> 16) & 63]) | iArr9[(i42 >>> 24) & 63];
        }
        int i43 = (i27 >>> 1) | (i27 << 31);
        int i44 = (i28 ^ i43) & (-1431655766);
        int i45 = i28 ^ i44;
        int i46 = i43 ^ i44;
        int i47 = (i45 >>> 1) | (i45 << 31);
        int i48 = ((i47 >>> 8) ^ i46) & 16711935;
        int i49 = i46 ^ i48;
        int i50 = i47 ^ (i48 << 8);
        int i51 = ((i50 >>> 2) ^ i49) & 858993459;
        int i52 = i49 ^ i51;
        int i53 = i50 ^ (i51 << 2);
        int i54 = ((i52 >>> 16) ^ i53) & 65535;
        int i55 = i53 ^ i54;
        int i56 = i52 ^ (i54 << 16);
        int i57 = ((i56 >>> 4) ^ i55) & 252645135;
        Pack.intToBigEndian(i56 ^ (i57 << 4), bArr2, i11);
        Pack.intToBigEndian(i55 ^ i57, bArr2, i11 + 4);
    }

    public int[] generateWorkingKey(boolean z10, byte[] bArr) {
        int i10;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= 56) {
                break;
            }
            byte b10 = pc1[i11];
            if ((bytebit[b10 & 7] & bArr[b10 >>> 3]) == 0) {
                z11 = false;
            }
            zArr[i11] = z11;
            i11++;
        }
        for (int i12 = 0; i12 < 16; i12++) {
            int i13 = z10 ? i12 << 1 : (15 - i12) << 1;
            int i14 = i13 + 1;
            iArr[i14] = 0;
            iArr[i13] = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= 28) {
                    break;
                }
                int i16 = totrot[i12] + i15;
                if (i16 < 28) {
                    zArr2[i15] = zArr[i16];
                } else {
                    zArr2[i15] = zArr[i16 - 28];
                }
                i15++;
            }
            for (i10 = 28; i10 < 56; i10++) {
                int i17 = totrot[i12] + i10;
                if (i17 < 56) {
                    zArr2[i10] = zArr[i17];
                } else {
                    zArr2[i10] = zArr[i17 - 28];
                }
            }
            for (int i18 = 0; i18 < 24; i18++) {
                byte[] bArr2 = pc2;
                if (zArr2[bArr2[i18]]) {
                    iArr[i13] = iArr[i13] | bigbyte[i18];
                }
                if (zArr2[bArr2[i18 + 24]]) {
                    iArr[i14] = iArr[i14] | bigbyte[i18];
                }
            }
        }
        for (int i19 = 0; i19 != 32; i19 += 2) {
            int i20 = iArr[i19];
            int i21 = i19 + 1;
            int i22 = iArr[i21];
            iArr[i19] = ((16515072 & i22) >>> 10) | ((i20 & 16515072) << 6) | ((i20 & 4032) << 10) | ((i22 & 4032) >>> 6);
            iArr[i21] = ((i20 & 63) << 16) | ((i20 & 258048) << 12) | ((258048 & i22) >>> 4) | (i22 & 63);
        }
        return iArr;
    }
}
