package org.bouncycastle.crypto.params;

import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class DESParameters extends KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    private static byte[] DES_weak_keys = {1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_LO, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, RegisterType.DOUBLE_LO, -15, RegisterType.DOUBLE_LO, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, RegisterType.DOUBLE_LO, -2, RegisterType.DOUBLE_LO, -2, 1, 31, 1, 31, 1, RegisterType.DOUBLE_LO, 1, RegisterType.DOUBLE_LO, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, RegisterType.DOUBLE_LO, -15, RegisterType.DOUBLE_LO, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, RegisterType.DOUBLE_LO, -2, RegisterType.DOUBLE_LO, 31, 1, 31, 1, RegisterType.DOUBLE_LO, 1, RegisterType.DOUBLE_LO, 1, -2, -32, -2, -32, -2, -15, -2, -15};
    private static final int N_DES_WEAK_KEYS = 16;

    public DESParameters(byte[] bArr) {
        super(bArr);
        if (isWeakKey(bArr, 0)) {
            throw new IllegalArgumentException("attempt to create weak DES key");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isWeakKey(byte[] bArr, int i10) {
        if (bArr.length - i10 < 8) {
            throw new IllegalArgumentException("key material too short.");
        }
        int i11 = 0;
        while (i11 < 16) {
            for (int i12 = 0; i12 < 8; i12++) {
                if (bArr[i12 + i10] != DES_weak_keys[(i11 * 8) + i12]) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public static void setOddParity(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = (byte) (((((b10 >> 7) ^ ((((((b10 >> 1) ^ (b10 >> 2)) ^ (b10 >> 3)) ^ (b10 >> 4)) ^ (b10 >> 5)) ^ (b10 >> 6))) ^ 1) & 1) | (b10 & 254));
        }
    }
}
