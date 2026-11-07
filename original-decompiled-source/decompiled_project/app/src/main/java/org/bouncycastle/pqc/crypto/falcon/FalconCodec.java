package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.hpke.HPKE;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
class FalconCodec {
    final byte[] max_fg_bits = {0, 8, 8, 8, 8, 8, 7, 7, 6, 6, 5};
    final byte[] max_FG_bits = {0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    final byte[] max_sig_bits = {0, 10, RegisterType.FLOAT, RegisterType.FLOAT, 12, 12, 12, 12, 12, 12, 12};

    public int comp_decode(short[] sArr, int i10, int i11, byte[] bArr, int i12, int i13) {
        int i14 = 1 << i11;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            if (i17 >= i13) {
                return 0;
            }
            i15 = (i15 << 8) | (bArr[i12 + i17] & 255);
            i17++;
            int i19 = i15 >>> i16;
            int i20 = i19 & 128;
            int i21 = i19 & CertificateBody.profileType;
            do {
                if (i16 == 0) {
                    if (i17 >= i13) {
                        return 0;
                    }
                    i15 = (i15 << 8) | (bArr[i12 + i17] & 255);
                    i17++;
                    i16 = 8;
                }
                i16--;
                if (((i15 >>> i16) & 1) == 0) {
                    i21 += 128;
                } else {
                    if (i20 != 0 && i21 == 0) {
                        return 0;
                    }
                    int i22 = i10 + i18;
                    if (i20 != 0) {
                        i21 = -i21;
                    }
                    sArr[i22] = (short) i21;
                }
            } while (i21 <= 2047);
            return 0;
        }
        if ((((1 << i16) - 1) & i15) != 0) {
            return 0;
        }
        return i17;
    }

    public int comp_encode(byte[] bArr, int i10, int i11, short[] sArr, int i12, int i13) {
        int i14 = 1 << i13;
        for (int i15 = 0; i15 < i14; i15++) {
            short s10 = sArr[i12 + i15];
            if (s10 < -2047 || s10 > 2047) {
                return 0;
            }
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i14; i19++) {
            int i20 = i17 << 1;
            short s11 = sArr[i12 + i19];
            int i21 = s11;
            if (s11 < 0) {
                i20 |= 1;
                i21 = -s11;
            }
            int i22 = (i20 << 7) | (i21 & CertificateBody.profileType);
            int i23 = (i21 >>> 7) + 1;
            i17 = (i22 << i23) | 1;
            i16 = i16 + 8 + i23;
            while (i16 >= 8) {
                i16 -= 8;
                if (bArr != null) {
                    if (i18 >= i11) {
                        return 0;
                    }
                    bArr[i10 + i18] = (byte) (i17 >>> i16);
                }
                i18++;
            }
        }
        if (i16 <= 0) {
            return i18;
        }
        if (bArr != null) {
            if (i18 >= i11) {
                return 0;
            }
            bArr[i10 + i18] = (byte) (i17 << (8 - i16));
        }
        return i18 + 1;
    }

    public int modq_decode(short[] sArr, int i10, int i11, byte[] bArr, int i12, int i13) {
        int i14 = 1 << i11;
        int i15 = ((i14 * 14) + 7) >> 3;
        if (i15 > i13) {
            return 0;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i14) {
            int i19 = i12 + 1;
            i17 = (i17 << 8) | (bArr[i12] & 255);
            int i20 = i18 + 8;
            if (i20 >= 14) {
                i18 -= 6;
                int i21 = (i17 >>> i18) & 16383;
                if (i21 >= 12289) {
                    return 0;
                }
                sArr[i10 + i16] = (short) i21;
                i16++;
            } else {
                i18 = i20;
            }
            i12 = i19;
        }
        if ((((1 << i18) - 1) & i17) != 0) {
            return 0;
        }
        return i15;
    }

    public int modq_encode(byte[] bArr, int i10, int i11, short[] sArr, int i12, int i13) {
        int i14 = 1 << i13;
        for (int i15 = 0; i15 < i14; i15++) {
            if ((65535 & sArr[i12 + i15]) >= 12289) {
                return 0;
            }
        }
        int i16 = ((i14 * 14) + 7) >> 3;
        if (bArr != null) {
            if (i16 > i11) {
                return 0;
            }
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                i18 = (i18 << 14) | (sArr[i12 + i19] & HPKE.aead_EXPORT_ONLY);
                i17 += 14;
                while (i17 >= 8) {
                    i17 -= 8;
                    bArr[i10] = (byte) (i18 >> i17);
                    i10++;
                }
            }
            if (i17 > 0) {
                bArr[i10] = (byte) (i18 << (8 - i17));
            }
        }
        return i16;
    }

    public int trim_i16_decode(short[] sArr, int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        int i15 = 1 << i11;
        int i16 = ((i15 * i12) + 7) >> 3;
        if (i16 > i14) {
            return 0;
        }
        int i17 = (1 << i12) - 1;
        int i18 = 1 << (i12 - 1);
        int i19 = i13;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < i15) {
            int i23 = i19 + 1;
            i21 = (i21 << 8) | (bArr[i19] & 255);
            i22 += 8;
            while (i22 >= i12 && i20 < i15) {
                i22 -= i12;
                int i24 = (i21 >>> i22) & i17;
                int i25 = i24 | (-(i24 & i18));
                if (i25 == (-i18)) {
                    return 0;
                }
                sArr[i10 + i20] = (short) (i25 | (-(i25 & i18)));
                i20++;
            }
            i19 = i23;
        }
        if ((((1 << i22) - 1) & i21) != 0) {
            return 0;
        }
        return i16;
    }

    public int trim_i16_encode(byte[] bArr, int i10, int i11, short[] sArr, int i12, int i13, int i14) {
        int i15 = 1 << i13;
        int i16 = (1 << (i14 - 1)) - 1;
        int i17 = -i16;
        for (int i18 = 0; i18 < i15; i18++) {
            short s10 = sArr[i12 + i18];
            if (s10 < i17 || s10 > i16) {
                return 0;
            }
        }
        int i19 = ((i15 * i14) + 7) >> 3;
        if (bArr != null) {
            if (i19 > i11) {
                return 0;
            }
            int i20 = (1 << i14) - 1;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < i15; i23++) {
                i22 = (i22 << i14) | (sArr[i12 + i23] & 4095 & i20);
                i21 += i14;
                while (i21 >= 8) {
                    i21 -= 8;
                    bArr[i10] = (byte) (i22 >> i21);
                    i10++;
                }
            }
            if (i21 > 0) {
                bArr[i10] = (byte) (i22 << (8 - i21));
            }
        }
        return i19;
    }

    public int trim_i8_decode(byte[] bArr, int i10, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15 = 1 << i11;
        int i16 = ((i15 * i12) + 7) >> 3;
        if (i16 > i14) {
            return 0;
        }
        int i17 = (1 << i12) - 1;
        int i18 = 1 << (i12 - 1);
        int i19 = i13;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < i15) {
            int i23 = i19 + 1;
            i21 = (i21 << 8) | (bArr2[i19] & 255);
            i22 += 8;
            while (i22 >= i12 && i20 < i15) {
                i22 -= i12;
                int i24 = (i21 >>> i22) & i17;
                int i25 = i24 | (-(i24 & i18));
                if (i25 == (-i18)) {
                    return 0;
                }
                bArr[i10 + i20] = (byte) i25;
                i20++;
            }
            i19 = i23;
        }
        if ((((1 << i22) - 1) & i21) != 0) {
            return 0;
        }
        return i16;
    }

    public int trim_i8_encode(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13, int i14) {
        int i15 = 1 << i13;
        int i16 = (1 << (i14 - 1)) - 1;
        int i17 = -i16;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = bArr2[i12 + i18];
            if (i19 < i17 || i19 > i16) {
                return 0;
            }
        }
        int i20 = ((i15 * i14) + 7) >> 3;
        if (bArr != null) {
            if (i20 > i11) {
                return 0;
            }
            int i21 = (1 << i14) - 1;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < i15; i24++) {
                i23 = (i23 << i14) | (bArr2[i12 + i24] & 65535 & i21);
                i22 += i14;
                while (i22 >= 8) {
                    i22 -= 8;
                    bArr[i10] = (byte) (i23 >>> i22);
                    i10++;
                }
            }
            if (i22 > 0) {
                bArr[i10] = (byte) (i23 << (8 - i22));
            }
        }
        return i20;
    }
}
