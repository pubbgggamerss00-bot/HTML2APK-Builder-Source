package org.bouncycastle.math.ec.rfc8032;

/* loaded from: classes3.dex */
abstract class Wnaf {
    public static void getSignedVar(int[] iArr, int i10, byte[] bArr) {
        int length = iArr.length * 2;
        int[] iArr2 = new int[length];
        int i11 = iArr[iArr.length - 1] >> 31;
        int length2 = iArr.length;
        int i12 = length;
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            int i13 = iArr[length2];
            iArr2[i12 - 1] = (i11 << 16) | (i13 >>> 16);
            i12 -= 2;
            iArr2[i12] = i13;
            i11 = i13;
        }
        int i14 = 32 - i10;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            int i18 = iArr2[i15];
            while (i16 < 16) {
                int i19 = i18 >>> i16;
                if ((i19 & 1) == i17) {
                    i16++;
                } else {
                    int i20 = (i19 | 1) << i14;
                    bArr[(i15 << 4) + i16] = (byte) (i20 >> i14);
                    i16 += i10;
                    i17 = i20 >>> 31;
                }
            }
            i15++;
            i16 -= 16;
        }
    }
}
