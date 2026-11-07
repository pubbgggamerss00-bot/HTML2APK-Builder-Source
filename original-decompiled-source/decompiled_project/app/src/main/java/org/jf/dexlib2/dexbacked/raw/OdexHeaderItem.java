package org.jf.dexlib2.dexbacked.raw;

import org.jf.dexlib2.dexbacked.DexBuffer;

/* loaded from: classes3.dex */
public class OdexHeaderItem {
    public static final int AUX_LENGTH_OFFSET = 28;
    public static final int AUX_OFFSET = 24;
    public static final int DEPENDENCIES_LENGTH_OFFSET = 20;
    public static final int DEPENDENCIES_OFFSET = 16;
    public static final int DEX_LENGTH_OFFSET = 12;
    public static final int DEX_OFFSET = 8;
    public static final int FLAGS_OFFSET = 32;
    public static final int ITEM_SIZE = 40;
    public static final int MAGIC_LENGTH = 8;
    public static final int MAGIC_OFFSET = 0;
    private static final byte[] MAGIC_VALUE = {100, 101, 121, 10, 0, 0, 0, 0};
    private static final int[] SUPPORTED_ODEX_VERSIONS = {35, 36};

    public static int getDependenciesOffset(byte[] bArr) {
        return new DexBuffer(bArr).readSmallUint(16);
    }

    public static int getDexOffset(byte[] bArr) {
        return new DexBuffer(bArr).readSmallUint(8);
    }

    public static int getVersion(byte[] bArr, int i10) {
        if (verifyMagic(bArr, i10)) {
            return getVersionUnchecked(bArr, i10);
        }
        return -1;
    }

    private static int getVersionUnchecked(byte[] bArr, int i10) {
        return (bArr[i10 + 6] - 48) + ((bArr[i10 + 5] - 48) * 10) + ((bArr[i10 + 4] - 48) * 100);
    }

    public static boolean isSupportedOdexVersion(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = SUPPORTED_ODEX_VERSIONS;
            if (i11 >= iArr.length) {
                return false;
            }
            if (iArr[i11] == i10) {
                return true;
            }
            i11++;
        }
    }

    public static boolean verifyMagic(byte[] bArr, int i10) {
        if (bArr.length - i10 < 8) {
            return false;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                for (int i12 = 4; i12 < 7; i12++) {
                    byte b10 = bArr[i10 + i12];
                    if (b10 < 48 || b10 > 57) {
                        return false;
                    }
                }
                return bArr[i10 + 7] == MAGIC_VALUE[7];
            }
            if (bArr[i10 + i11] != MAGIC_VALUE[i11]) {
                return false;
            }
            i11++;
        }
    }
}
