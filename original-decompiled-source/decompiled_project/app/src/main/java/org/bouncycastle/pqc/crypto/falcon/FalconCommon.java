package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
class FalconCommon {
    static final int[] l2bound = {0, 101498, 208714, 428865, 892039, 1852696, 3842630, 7959734, 16468416, 34034726, 70265242};

    /* JADX WARN: Multi-variable type inference failed */
    public void hash_to_point_ct(SHAKE256 shake256, short[] sArr, int i10, int i11, short[] sArr2, int i12) {
        int i13;
        short s10;
        char c10;
        int i14;
        boolean z10;
        short s11;
        short[] sArr3 = new short[63];
        int i15 = 1 << i11;
        int i16 = i15 << 1;
        short s12 = new short[]{0, 65, 67, 71, 77, 86, 100, 122, 154, 205, 287}[i11];
        int i17 = i15 + s12;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            byte[] bArr = new byte[2];
            shake256.inner_shake256_extract(bArr, 0, 2);
            int i20 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i21 = i20 - ((((i20 - 24578) >>> 31) - 1) & 24578);
            int i22 = i21 - ((((i21 - 24578) >>> 31) - 1) & 24578);
            int i23 = (((i20 - 61445) >>> 31) - 1) | (i22 - ((((i22 - 12289) >>> 31) - 1) & 12289));
            if (i19 < i15) {
                sArr[i10 + i19] = (short) i23;
            } else if (i19 < i16) {
                sArr2[(i12 + i19) - i15] = (short) i23;
            } else {
                sArr3[i19 - i16] = (short) i23;
            }
        }
        int i24 = 1;
        while (i24 <= s12) {
            int i25 = i18;
            int i26 = i25;
            while (i25 < i17) {
                if (i25 < i15) {
                    i13 = i10 + i25;
                    s10 = sArr[i13];
                    c10 = 1;
                } else if (i25 < i16) {
                    i13 = (i12 + i25) - i15;
                    s10 = sArr2[i13];
                    c10 = 2;
                } else {
                    i13 = i25 - i16;
                    s10 = sArr3[i13];
                    c10 = 3;
                }
                int i27 = i25 - i26;
                int i28 = (s10 >>> 15) - 1;
                i26 -= i28;
                if (i25 >= i24) {
                    int i29 = i25 - i24;
                    if (i29 < i15) {
                        i14 = (i10 + i25) - i24;
                        s11 = sArr[i14];
                        z10 = true;
                    } else if (i29 < i16) {
                        i14 = (i12 + i29) - i15;
                        s11 = sArr2[i14];
                        z10 = 2;
                    } else {
                        i14 = i29 - i16;
                        z10 = 3;
                        s11 = sArr3[i14];
                    }
                    int i30 = i28 & (-(((i27 & i24) + 511) >> 9));
                    if (c10 == 1) {
                        sArr[i13] = (short) (((s10 ^ s11) & i30) ^ s10);
                    } else if (c10 == 2) {
                        sArr2[i13] = (short) (((s10 ^ s11) & i30) ^ s10);
                    } else {
                        sArr3[i13] = (short) (((s10 ^ s11) & i30) ^ s10);
                    }
                    boolean z11 = z10;
                    if (z11 == 1) {
                        sArr[i14] = (short) (s11 ^ ((s10 ^ s11) & i30));
                    } else if (z11 == 2) {
                        sArr2[i14] = (short) (s11 ^ ((s10 ^ s11) & i30));
                    } else {
                        sArr3[i14] = (short) (s11 ^ ((s10 ^ s11) & i30));
                    }
                }
                i25++;
            }
            i24 <<= 1;
            i18 = 0;
        }
    }

    public void hash_to_point_vartime(SHAKE256 shake256, short[] sArr, int i10, int i11) {
        int i12 = 1 << i11;
        while (i12 > 0) {
            byte[] bArr = new byte[2];
            shake256.inner_shake256_extract(bArr, 0, 2);
            int i13 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            if (i13 < 61445) {
                while (i13 >= 12289) {
                    i13 -= 12289;
                }
                sArr[i10] = (short) i13;
                i12--;
                i10++;
            }
        }
    }

    public int is_short(short[] sArr, int i10, short[] sArr2, int i11, int i12) {
        int i13 = 1 << i12;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i13) {
            short s10 = sArr[i10 + i14];
            int i17 = (s10 * s10) + i15;
            int i18 = i16 | i17;
            short s11 = sArr2[i11 + i14];
            int i19 = (s11 * s11) + i17;
            i14++;
            i16 = i18 | i19;
            i15 = i19;
        }
        return (((long) ((-(i16 >>> 31)) | i15)) & BodyPartID.bodyIdMax) <= ((long) l2bound[i12]) ? 1 : 0;
    }

    public int is_short_half(int i10, short[] sArr, int i11, int i12) {
        int i13 = 1 << i12;
        int i14 = -(i10 >>> 31);
        for (int i15 = 0; i15 < i13; i15++) {
            short s10 = sArr[i11 + i15];
            i10 += s10 * s10;
            i14 |= i10;
        }
        return (((long) (i10 | (-(i14 >>> 31)))) & BodyPartID.bodyIdMax) <= ((long) l2bound[i12]) ? 1 : 0;
    }
}
