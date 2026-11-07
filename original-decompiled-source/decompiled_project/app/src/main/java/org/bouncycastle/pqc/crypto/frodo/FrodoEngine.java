package org.bouncycastle.pqc.crypto.frodo;

import ad.k;
import androidx.datastore.preferences.protobuf.e;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import p5.m0;

/* loaded from: classes3.dex */
class FrodoEngine {
    private static final int len_chi = 16;
    private static final int len_chi_bytes = 2;
    private static final int len_seedA = 128;
    private static final int len_seedA_bytes = 16;
    private static final int len_z = 128;
    private static final int len_z_bytes = 16;
    private static final int mbar = 8;
    static final int nbar = 8;
    private final int B;
    private final int D;
    private final short[] T_chi;
    private final Xof digest;
    private final FrodoMatrixGenerator gen;
    private final int len_ct_bytes;
    private final int len_k;
    private final int len_k_bytes;
    private final int len_mu;
    private final int len_mu_bytes;
    private final int len_pk_bytes;
    private final int len_pkh;
    private final int len_pkh_bytes;
    private final int len_s;
    private final int len_s_bytes;
    private final int len_seedSE;
    private final int len_seedSE_bytes;
    private final int len_sk_bytes;
    private final int len_ss;
    private final int len_ss_bytes;

    /* renamed from: n, reason: collision with root package name */
    private final int f20344n;

    /* renamed from: q, reason: collision with root package name */
    private final int f20345q;

    public FrodoEngine(int i10, int i11, int i12, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.f20344n = i10;
        this.D = i11;
        this.f20345q = 1 << i11;
        this.B = i12;
        int i13 = i12 * 64;
        this.len_mu = i13;
        this.len_seedSE = i13;
        this.len_s = i13;
        this.len_k = i13;
        this.len_pkh = i13;
        this.len_ss = i13;
        this.len_mu_bytes = i13 / 8;
        this.len_seedSE_bytes = i13 / 8;
        int i14 = i13 / 8;
        this.len_s_bytes = i14;
        this.len_k_bytes = i13 / 8;
        int i15 = i13 / 8;
        this.len_pkh_bytes = i15;
        this.len_ss_bytes = i13 / 8;
        int i16 = ((i11 * i10) * 8) / 8;
        this.len_ct_bytes = e.a(i11, 64, 8, i16);
        int i17 = i16 + 16;
        this.len_pk_bytes = i17;
        this.len_sk_bytes = k.b(i10, 16, i15, i14 + i17);
        this.T_chi = sArr;
        this.digest = xof;
        this.gen = frodoMatrixGenerator;
    }

    private byte[] ctselect(byte[] bArr, byte[] bArr2, short s10) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (((~s10) & bArr[i10] & 255) | (bArr2[i10] & s10 & 255));
        }
        return bArr3;
    }

    private short ctverify(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        short s10 = 0;
        for (short s11 = 0; s11 < sArr.length; s11 = (short) (s11 + 1)) {
            s10 = (short) (s10 | (sArr[s11] ^ sArr3[s11]));
        }
        for (short s12 = 0; s12 < sArr2.length; s12 = (short) (s12 + 1)) {
            s10 = (short) ((sArr2[s12] ^ sArr4[s12]) | s10);
        }
        return s10 == 0 ? (short) 0 : (short) -1;
    }

    private byte[] decode(short[] sArr) {
        int i10 = this.B;
        short s10 = (short) ((1 << i10) - 1);
        short s11 = (short) ((1 << this.D) - 1);
        byte[] bArr = new byte[i10 * 8];
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            long j10 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = sArr[i11] & s11;
                int i15 = this.D;
                j10 |= (((short) ((i14 + (1 << ((i15 - r14) - 1))) >> (i15 - r14))) & s10) << (this.B * i13);
                i11++;
            }
            int i16 = 0;
            while (true) {
                int i17 = this.B;
                if (i16 < i17) {
                    bArr[(i17 * i12) + i16] = (byte) ((j10 >> (i16 * 8)) & 255);
                    i16++;
                }
            }
        }
        return bArr;
    }

    private short[] encode(byte[] bArr) {
        int i10;
        short[] sArr = new short[64];
        int i11 = 0;
        byte b10 = 1;
        for (int i12 = 0; i12 < 8; i12++) {
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    i10 = this.B;
                    if (i14 < i10) {
                        i15 += (1 << i14) * ((bArr[i11] & b10) == b10 ? 1 : 0);
                        b10 = (byte) (b10 << 1);
                        if (b10 == 0) {
                            i11++;
                            b10 = 1;
                        }
                        i14++;
                    }
                }
                sArr[(i12 * 8) + i13] = (short) ((this.f20345q / (1 << i10)) * i15);
            }
        }
        return sArr;
    }

    private short[] matrix_add(short[] sArr, short[] sArr2, int i10, int i11) {
        int i12 = this.f20345q - 1;
        short[] sArr3 = new short[i10 * i11];
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = (i13 * i11) + i14;
                sArr3[i15] = (short) ((sArr[i15] + sArr2[i15]) & i12);
            }
        }
        return sArr3;
    }

    private short[] matrix_mul(short[] sArr, int i10, int i11, short[] sArr2, int i12, int i13) {
        int i14 = this.f20345q - 1;
        short[] sArr3 = new short[i10 * i13];
        for (int i15 = 0; i15 < i10; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = 0;
                for (int i18 = 0; i18 < i11; i18++) {
                    i17 += sArr[(i15 * i11) + i18] * sArr2[(i18 * i13) + i16];
                }
                sArr3[(i15 * i13) + i16] = (short) (i17 & i14);
            }
        }
        return sArr3;
    }

    private short[] matrix_sub(short[] sArr, short[] sArr2, int i10, int i11) {
        int i12 = this.f20345q - 1;
        short[] sArr3 = new short[i10 * i11];
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = (i13 * i11) + i14;
                sArr3[i15] = (short) ((sArr[i15] - sArr2[i15]) & i12);
            }
        }
        return sArr3;
    }

    private short[] matrix_transpose(short[] sArr, int i10, int i11) {
        short[] sArr2 = new short[i10 * i11];
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sArr2[(i12 * i10) + i13] = sArr[(i13 * i11) + i12];
            }
        }
        return sArr2;
    }

    private byte[] pack(short[] sArr) {
        int length = sArr.length;
        int i10 = (this.D * length) / 8;
        byte[] bArr = new byte[i10];
        short s10 = 0;
        short s11 = 0;
        byte b10 = 0;
        short s12 = 0;
        while (s10 < i10 && (s11 < length || (s11 == length && b10 > 0))) {
            byte b11 = 0;
            while (b11 < 8) {
                int i11 = 8 - b11;
                int iMin = Math.min(i11, (int) b10);
                int i12 = b10 - iMin;
                bArr[s10] = (byte) (bArr[s10] + (((byte) (((short) ((1 << iMin) - 1)) & (s12 >> i12))) << (i11 - iMin)));
                b11 = (byte) (b11 + iMin);
                b10 = (byte) i12;
                if (b10 == 0) {
                    if (s11 >= length) {
                        break;
                    }
                    short s13 = sArr[s11];
                    s11 = (short) (s11 + 1);
                    s12 = s13;
                    b10 = (byte) this.D;
                }
            }
            if (b11 == 8) {
                s10 = (short) (s10 + 1);
            }
        }
        return bArr;
    }

    private short sample(short s10) {
        int i10 = s10 & HPKE.aead_EXPORT_ONLY;
        short s11 = (short) (i10 >>> 1);
        int i11 = 0;
        short s12 = 0;
        while (true) {
            short[] sArr = this.T_chi;
            if (i11 >= sArr.length) {
                break;
            }
            if (s11 > sArr[i11]) {
                s12 = (short) (s12 + 1);
            }
            i11++;
        }
        return i10 % 2 == 1 ? (short) ((s12 * (-1)) & 65535) : s12;
    }

    private short[] sample_matrix(short[] sArr, int i10, int i11, int i12) {
        short[] sArr2 = new short[i11 * i12];
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = (i13 * i12) + i14;
                sArr2[i15] = sample(sArr[i15 + i10]);
            }
        }
        return sArr2;
    }

    private short[] unpack(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        short[] sArr = new short[i12];
        short s10 = 0;
        short s11 = 0;
        byte b10 = 0;
        byte b11 = 0;
        while (s10 < i12 && (s11 < bArr.length || (s11 == bArr.length && b10 > 0))) {
            byte b12 = 0;
            while (true) {
                int i13 = this.D;
                if (b12 >= i13) {
                    break;
                }
                int iMin = Math.min(i13 - b12, (int) b10);
                short s12 = (short) (((1 << iMin) - 1) & 65535);
                sArr[s10] = (short) (((sArr[s10] & HPKE.aead_EXPORT_ONLY) + ((((byte) ((((b11 & 255) >>> ((b10 & 255) - iMin)) & (s12 & HPKE.aead_EXPORT_ONLY)) & 255)) & 255) << ((this.D - (b12 & 255)) - iMin))) & 65535);
                b12 = (byte) (b12 + iMin);
                byte b13 = (byte) (b10 - iMin);
                byte b14 = (byte) ((~(s12 << b13)) & b11);
                if (b13 != 0) {
                    b11 = b14;
                    b10 = b13;
                } else {
                    if (s11 >= bArr.length) {
                        b11 = b14;
                        b10 = b13;
                        break;
                    }
                    byte b15 = bArr[s11];
                    s11 = (short) (s11 + 1);
                    b10 = 8;
                    b11 = b15;
                }
            }
            if (b12 == this.D) {
                s10 = (short) (s10 + 1);
            }
        }
        return sArr;
    }

    public int getCipherTextSize() {
        return this.len_ct_bytes;
    }

    public int getPrivateKeySize() {
        return this.len_sk_bytes;
    }

    public int getPublicKeySize() {
        return this.len_pk_bytes;
    }

    public int getSessionKeySize() {
        return this.len_ss_bytes;
    }

    public void kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10 = ((this.f20344n * 8) * this.D) / 8;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i10, e.a(this.D, 64, 8, i10));
        int i11 = this.len_s_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, 0, i11);
        int i12 = i11 + 16;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr3, i11, i12);
        int i13 = (((this.D * this.f20344n) * 8) / 8) + i12;
        byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArr3, i12, i13);
        int iA = e.a(this.f20344n, 128, 8, i13);
        byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArr3, i13, iA);
        short[] sArr = new short[this.f20344n * 8];
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f20344n;
                if (i15 < i16) {
                    sArr[(i14 * i16) + i15] = Pack.littleEndianToShort(bArrCopyOfRange6, (i15 * 2) + (i16 * i14 * 2));
                    i15++;
                }
            }
        }
        short[] sArrMatrix_transpose = matrix_transpose(sArr, 8, this.f20344n);
        byte[] bArrCopyOfRange7 = Arrays.copyOfRange(bArr3, iA, this.len_pkh_bytes + iA);
        short[] sArrUnpack = unpack(bArrCopyOfRange, 8, this.f20344n);
        short[] sArrUnpack2 = unpack(bArrCopyOfRange2, 8, 8);
        int i17 = this.f20344n;
        byte[] bArrDecode = decode(matrix_sub(sArrUnpack2, matrix_mul(sArrUnpack, 8, i17, sArrMatrix_transpose, i17, 8), 8, 8));
        byte[] bArr4 = new byte[this.len_seedSE_bytes + this.len_k_bytes];
        this.digest.update(bArrCopyOfRange7, 0, this.len_pkh_bytes);
        this.digest.update(bArrDecode, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr4, 0, this.len_seedSE_bytes + this.len_k_bytes);
        int i18 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange8 = Arrays.copyOfRange(bArr4, i18, this.len_k_bytes + i18);
        int iA2 = m0.a(this.f20344n, 16, 64, 2);
        byte[] bArr5 = new byte[iA2];
        this.digest.update((byte) -106);
        this.digest.update(bArr4, 0, this.len_seedSE_bytes);
        this.digest.doFinal(bArr5, 0, iA2);
        int i19 = (this.f20344n * 16) + 64;
        short[] sArr2 = new short[i19];
        for (int i20 = 0; i20 < i19; i20++) {
            sArr2[i20] = Pack.littleEndianToShort(bArr5, i20 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr2, 0, 8, this.f20344n);
        int i21 = this.f20344n;
        short[] sArrSample_matrix2 = sample_matrix(sArr2, i21 * 8, 8, i21);
        short[] sArrGenMatrix = this.gen.genMatrix(bArrCopyOfRange4);
        int i22 = this.f20344n;
        short[] sArrMatrix_add = matrix_add(matrix_mul(sArrSample_matrix, 8, i22, sArrGenMatrix, i22, i22), sArrSample_matrix2, 8, this.f20344n);
        short[] sArrSample_matrix3 = sample_matrix(sArr2, this.f20344n * 16, 8, 8);
        short[] sArrUnpack3 = unpack(bArrCopyOfRange5, this.f20344n, 8);
        int i23 = this.f20344n;
        byte[] bArrCtselect = ctselect(bArrCopyOfRange8, bArrCopyOfRange3, ctverify(sArrUnpack, sArrUnpack2, sArrMatrix_add, matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, i23, sArrUnpack3, i23, 8), sArrSample_matrix3, 8, 8), encode(bArrDecode), 8, 8)));
        this.digest.update(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.update(bArrCtselect, 0, bArrCtselect.length);
        this.digest.doFinal(bArr, 0, this.len_ss_bytes);
    }

    public void kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, 16);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, 16, this.len_pk_bytes);
        byte[] bArr4 = new byte[this.len_mu_bytes];
        secureRandom.nextBytes(bArr4);
        byte[] bArr5 = new byte[this.len_pkh_bytes];
        this.digest.update(bArr3, 0, this.len_pk_bytes);
        this.digest.doFinal(bArr5, 0, this.len_pkh_bytes);
        byte[] bArr6 = new byte[this.len_seedSE + this.len_k];
        this.digest.update(bArr5, 0, this.len_pkh_bytes);
        this.digest.update(bArr4, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr6, 0, this.len_seedSE_bytes + this.len_k_bytes);
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr6, 0, this.len_seedSE_bytes);
        int i10 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr6, i10, this.len_k_bytes + i10);
        int iA = m0.a(this.f20344n, 16, 64, 2);
        byte[] bArr7 = new byte[iA];
        this.digest.update((byte) -106);
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr7, 0, iA);
        int i11 = iA / 2;
        short[] sArr = new short[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i12] = Pack.littleEndianToShort(bArr7, i12 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr, 0, 8, this.f20344n);
        int i13 = this.f20344n;
        short[] sArrSample_matrix2 = sample_matrix(sArr, i13 * 8, 8, i13);
        short[] sArrGenMatrix = this.gen.genMatrix(bArrCopyOfRange);
        int i14 = this.f20344n;
        byte[] bArrPack = pack(matrix_add(matrix_mul(sArrSample_matrix, 8, i14, sArrGenMatrix, i14, i14), sArrSample_matrix2, 8, this.f20344n));
        short[] sArrSample_matrix3 = sample_matrix(sArr, this.f20344n * 16, 8, 8);
        short[] sArrUnpack = unpack(bArrCopyOfRange2, this.f20344n, 8);
        int i15 = this.f20344n;
        byte[] bArrPack2 = pack(matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, i15, sArrUnpack, i15, 8), sArrSample_matrix3, 8, 8), encode(bArr4), 8, 8));
        System.arraycopy(Arrays.concatenate(bArrPack, bArrPack2), 0, bArr, 0, this.len_ct_bytes);
        this.digest.update(bArrPack, 0, bArrPack.length);
        this.digest.update(bArrPack2, 0, bArrPack2.length);
        this.digest.update(bArrCopyOfRange4, 0, this.len_k_bytes);
        this.digest.doFinal(bArr2, 0, this.len_s_bytes);
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[this.len_s_bytes + this.len_seedSE_bytes + 16];
        secureRandom.nextBytes(bArr3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, this.len_s_bytes);
        int i10 = this.len_s_bytes;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, i10, this.len_seedSE_bytes + i10);
        int i11 = this.len_s_bytes;
        int i12 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, i11 + i12, i11 + i12 + 16);
        byte[] bArr4 = new byte[16];
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr4, 0, 16);
        short[] sArrGenMatrix = this.gen.genMatrix(bArr4);
        int i13 = this.f20344n * 32;
        byte[] bArr5 = new byte[i13];
        this.digest.update((byte) 95);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.doFinal(bArr5, 0, i13);
        int i14 = this.f20344n * 16;
        short[] sArr = new short[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            sArr[i15] = Pack.littleEndianToShort(bArr5, i15 * 2);
        }
        short[] sArrSample_matrix = sample_matrix(sArr, 0, 8, this.f20344n);
        short[] sArrMatrix_transpose = matrix_transpose(sArrSample_matrix, 8, this.f20344n);
        int i16 = this.f20344n;
        short[] sArrSample_matrix2 = sample_matrix(sArr, i16 * 8, i16, 8);
        int i17 = this.f20344n;
        System.arraycopy(Arrays.concatenate(bArr4, pack(matrix_add(matrix_mul(sArrGenMatrix, i17, i17, sArrMatrix_transpose, i17, 8), sArrSample_matrix2, this.f20344n, 8))), 0, bArr, 0, this.len_pk_bytes);
        int i18 = this.len_pkh_bytes;
        byte[] bArr6 = new byte[i18];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.doFinal(bArr6, 0, i18);
        System.arraycopy(Arrays.concatenate(bArrCopyOfRange, bArr), 0, bArr2, 0, this.len_s_bytes + this.len_pk_bytes);
        for (int i19 = 0; i19 < 8; i19++) {
            int i20 = 0;
            while (true) {
                int i21 = this.f20344n;
                if (i20 < i21) {
                    System.arraycopy(Pack.shortToLittleEndian(sArrSample_matrix[(i21 * i19) + i20]), 0, bArr2, (i20 * 2) + (this.f20344n * i19 * 2) + this.len_s_bytes + this.len_pk_bytes, 2);
                    i20++;
                }
            }
        }
        int i22 = this.len_sk_bytes;
        int i23 = this.len_pkh_bytes;
        System.arraycopy(bArr6, 0, bArr2, i22 - i23, i23);
    }
}
