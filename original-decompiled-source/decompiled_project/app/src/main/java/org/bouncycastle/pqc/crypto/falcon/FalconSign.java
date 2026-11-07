package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes3.dex */
class FalconSign {
    FPREngine fpr = new FPREngine();
    FalconFFT fft = new FalconFFT();
    FalconCommon common = new FalconCommon();

    private static int MKN(int i10) {
        return 1 << i10;
    }

    public int do_sign_dyn(SamplerZ samplerZ, SamplerCtx samplerCtx, short[] sArr, int i10, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, byte[] bArr4, int i14, short[] sArr2, int i15, int i16, FalconFPR[] falconFPRArr, int i17) {
        int iMKN = MKN(i16);
        int i18 = i17 + iMKN;
        int i19 = i18 + iMKN;
        int i20 = i19 + iMKN;
        smallints_to_fpr(falconFPRArr, i18, bArr, i11, i16);
        smallints_to_fpr(falconFPRArr, i17, bArr2, i12, i16);
        smallints_to_fpr(falconFPRArr, i20, bArr3, i13, i16);
        smallints_to_fpr(falconFPRArr, i19, bArr4, i14, i16);
        this.fft.FFT(falconFPRArr, i18, i16);
        this.fft.FFT(falconFPRArr, i17, i16);
        this.fft.FFT(falconFPRArr, i20, i16);
        this.fft.FFT(falconFPRArr, i19, i16);
        this.fft.poly_neg(falconFPRArr, i18, i16);
        this.fft.poly_neg(falconFPRArr, i20, i16);
        int i21 = i20 + iMKN;
        int i22 = i21 + iMKN;
        System.arraycopy(falconFPRArr, i18, falconFPRArr, i21, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i21, i16);
        System.arraycopy(falconFPRArr, i17, falconFPRArr, i22, iMKN);
        this.fft.poly_muladj_fft(falconFPRArr, i22, falconFPRArr, i19, i16);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i17, i16);
        this.fft.poly_add(falconFPRArr, i17, falconFPRArr, i21, i16);
        System.arraycopy(falconFPRArr, i18, falconFPRArr, i21, iMKN);
        this.fft.poly_muladj_fft(falconFPRArr, i18, falconFPRArr, i20, i16);
        this.fft.poly_add(falconFPRArr, i18, falconFPRArr, i22, i16);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i19, i16);
        System.arraycopy(falconFPRArr, i20, falconFPRArr, i22, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr, i22, i16);
        this.fft.poly_add(falconFPRArr, i19, falconFPRArr, i22, i16);
        int i23 = i22 + iMKN;
        for (int i24 = 0; i24 < iMKN; i24++) {
            falconFPRArr[i22 + i24] = this.fpr.fpr_of(sArr2[i15 + i24]);
        }
        this.fft.FFT(falconFPRArr, i22, i16);
        FalconFPR falconFPR = this.fpr.fpr_inverse_of_q;
        System.arraycopy(falconFPRArr, i22, falconFPRArr, i23, iMKN);
        this.fft.poly_mul_fft(falconFPRArr, i23, falconFPRArr, i21, i16);
        this.fft.poly_mulconst(falconFPRArr, i23, this.fpr.fpr_neg(falconFPR), i16);
        this.fft.poly_mul_fft(falconFPRArr, i22, falconFPRArr, i20, i16);
        this.fft.poly_mulconst(falconFPRArr, i22, falconFPR, i16);
        int i25 = iMKN * 2;
        System.arraycopy(falconFPRArr, i22, falconFPRArr, i20, i25);
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr, i20, falconFPRArr, i21, falconFPRArr, i17, falconFPRArr, i18, falconFPRArr, i19, i16, i16, falconFPRArr, i22);
        System.arraycopy(falconFPRArr, i20, falconFPRArr, i21, i25);
        smallints_to_fpr(falconFPRArr, i18, bArr, i11, i16);
        smallints_to_fpr(falconFPRArr, i17, bArr2, i12, i16);
        smallints_to_fpr(falconFPRArr, i20, bArr3, i13, i16);
        smallints_to_fpr(falconFPRArr, i19, bArr4, i14, i16);
        this.fft.FFT(falconFPRArr, i18, i16);
        this.fft.FFT(falconFPRArr, i17, i16);
        this.fft.FFT(falconFPRArr, i20, i16);
        this.fft.FFT(falconFPRArr, i19, i16);
        this.fft.poly_neg(falconFPRArr, i18, i16);
        this.fft.poly_neg(falconFPRArr, i20, i16);
        int i26 = i23 + iMKN;
        System.arraycopy(falconFPRArr, i21, falconFPRArr, i23, iMKN);
        System.arraycopy(falconFPRArr, i22, falconFPRArr, i26, iMKN);
        this.fft.poly_mul_fft(falconFPRArr, i23, falconFPRArr, i17, i16);
        this.fft.poly_mul_fft(falconFPRArr, i26, falconFPRArr, i19, i16);
        this.fft.poly_add(falconFPRArr, i23, falconFPRArr, i26, i16);
        System.arraycopy(falconFPRArr, i21, falconFPRArr, i26, iMKN);
        this.fft.poly_mul_fft(falconFPRArr, i26, falconFPRArr, i18, i16);
        System.arraycopy(falconFPRArr, i23, falconFPRArr, i21, iMKN);
        this.fft.poly_mul_fft(falconFPRArr, i22, falconFPRArr, i20, i16);
        this.fft.poly_add(falconFPRArr, i22, falconFPRArr, i26, i16);
        this.fft.iFFT(falconFPRArr, i21, i16);
        this.fft.iFFT(falconFPRArr, i22, i16);
        short[] sArr3 = new short[iMKN];
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < iMKN; i29++) {
            int iFpr_rint = (sArr2[i15 + i29] & HPKE.aead_EXPORT_ONLY) - ((int) this.fpr.fpr_rint(falconFPRArr[i21 + i29]));
            i27 += iFpr_rint * iFpr_rint;
            i28 |= i27;
            sArr3[i29] = (short) iFpr_rint;
        }
        int i30 = (-(i28 >>> 31)) | i27;
        short[] sArr4 = new short[iMKN];
        for (int i31 = 0; i31 < iMKN; i31++) {
            sArr4[i31] = (short) (-this.fpr.fpr_rint(falconFPRArr[i22 + i31]));
        }
        if (this.common.is_short_half(i30, sArr4, 0, i16) == 0) {
            return 0;
        }
        System.arraycopy(sArr4, 0, sArr, i10, iMKN);
        return 1;
    }

    public int do_sign_tree(SamplerZ samplerZ, SamplerCtx samplerCtx, short[] sArr, int i10, FalconFPR[] falconFPRArr, int i11, short[] sArr2, int i12, int i13, FalconFPR[] falconFPRArr2, int i14) {
        int iMKN = MKN(i13);
        int i15 = i14 + iMKN;
        int iSkoff_b00 = i11 + skoff_b00(i13);
        int iSkoff_b01 = i11 + skoff_b01(i13);
        int iSkoff_b10 = i11 + skoff_b10(i13);
        int iSkoff_b11 = i11 + skoff_b11(i13);
        int iSkoff_tree = i11 + skoff_tree(i13);
        for (int i16 = 0; i16 < iMKN; i16++) {
            falconFPRArr2[i14 + i16] = this.fpr.fpr_of(sArr2[i12 + i16]);
        }
        this.fft.FFT(falconFPRArr2, i14, i13);
        FalconFPR falconFPR = this.fpr.fpr_inverse_of_q;
        System.arraycopy(falconFPRArr2, i14, falconFPRArr2, i15, iMKN);
        this.fft.poly_mul_fft(falconFPRArr2, i15, falconFPRArr, iSkoff_b01, i13);
        this.fft.poly_mulconst(falconFPRArr2, i15, this.fpr.fpr_neg(falconFPR), i13);
        this.fft.poly_mul_fft(falconFPRArr2, i14, falconFPRArr, iSkoff_b11, i13);
        this.fft.poly_mulconst(falconFPRArr2, i14, falconFPR, i13);
        int i17 = i15 + iMKN;
        int i18 = i17 + iMKN;
        ffSampling_fft(samplerZ, samplerCtx, falconFPRArr2, i17, falconFPRArr2, i18, falconFPRArr, iSkoff_tree, falconFPRArr2, i14, falconFPRArr2, i15, i13, falconFPRArr2, i18 + iMKN);
        System.arraycopy(falconFPRArr2, i17, falconFPRArr2, i14, iMKN);
        System.arraycopy(falconFPRArr2, i18, falconFPRArr2, i15, iMKN);
        this.fft.poly_mul_fft(falconFPRArr2, i17, falconFPRArr, iSkoff_b00, i13);
        this.fft.poly_mul_fft(falconFPRArr2, i18, falconFPRArr, iSkoff_b10, i13);
        this.fft.poly_add(falconFPRArr2, i17, falconFPRArr2, i18, i13);
        System.arraycopy(falconFPRArr2, i14, falconFPRArr2, i18, iMKN);
        this.fft.poly_mul_fft(falconFPRArr2, i18, falconFPRArr, iSkoff_b01, i13);
        System.arraycopy(falconFPRArr2, i17, falconFPRArr2, i14, iMKN);
        this.fft.poly_mul_fft(falconFPRArr2, i15, falconFPRArr, iSkoff_b11, i13);
        this.fft.poly_add(falconFPRArr2, i15, falconFPRArr2, i18, i13);
        this.fft.iFFT(falconFPRArr2, i14, i13);
        this.fft.iFFT(falconFPRArr2, i15, i13);
        short[] sArr3 = new short[iMKN];
        int i19 = 0;
        int i20 = 0;
        for (int i21 = 0; i21 < iMKN; i21++) {
            int iFpr_rint = (sArr2[i12 + i21] & HPKE.aead_EXPORT_ONLY) - ((int) this.fpr.fpr_rint(falconFPRArr2[i14 + i21]));
            i19 += iFpr_rint * iFpr_rint;
            i20 |= i19;
            sArr3[i21] = (short) iFpr_rint;
        }
        int i22 = i19 | (-(i20 >>> 31));
        short[] sArr4 = new short[iMKN];
        for (int i23 = 0; i23 < iMKN; i23++) {
            sArr4[i23] = (short) (-this.fpr.fpr_rint(falconFPRArr2[i15 + i23]));
        }
        if (this.common.is_short_half(i22, sArr4, 0, i13) == 0) {
            return 0;
        }
        System.arraycopy(sArr4, 0, sArr, i10, iMKN);
        System.arraycopy(sArr3, 0, falconFPRArr2, i14, iMKN);
        return 1;
    }

    public void expand_privkey(FalconFPR[] falconFPRArr, int i10, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, byte[] bArr4, int i14, int i15, FalconFPR[] falconFPRArr2, int i16) {
        int iMKN = MKN(i15);
        int iSkoff_b00 = i10 + skoff_b00(i15);
        int iSkoff_b01 = i10 + skoff_b01(i15);
        int iSkoff_b10 = i10 + skoff_b10(i15);
        int iSkoff_b11 = i10 + skoff_b11(i15);
        int iSkoff_tree = i10 + skoff_tree(i15);
        smallints_to_fpr(falconFPRArr, iSkoff_b01, bArr, i11, i15);
        smallints_to_fpr(falconFPRArr, iSkoff_b00, bArr2, i12, i15);
        smallints_to_fpr(falconFPRArr, iSkoff_b11, bArr3, i13, i15);
        smallints_to_fpr(falconFPRArr, iSkoff_b10, bArr4, i14, i15);
        this.fft.FFT(falconFPRArr, iSkoff_b01, i15);
        this.fft.FFT(falconFPRArr, iSkoff_b00, i15);
        this.fft.FFT(falconFPRArr, iSkoff_b11, i15);
        this.fft.FFT(falconFPRArr, iSkoff_b10, i15);
        this.fft.poly_neg(falconFPRArr, iSkoff_b01, i15);
        this.fft.poly_neg(falconFPRArr, iSkoff_b11, i15);
        int i17 = i16 + iMKN;
        int i18 = i17 + iMKN;
        int i19 = i18 + iMKN;
        System.arraycopy(falconFPRArr, iSkoff_b00, falconFPRArr2, i16, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i16, i15);
        System.arraycopy(falconFPRArr, iSkoff_b01, falconFPRArr2, i19, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i19, i15);
        this.fft.poly_add(falconFPRArr2, i16, falconFPRArr2, i19, i15);
        System.arraycopy(falconFPRArr, iSkoff_b00, falconFPRArr2, i17, iMKN);
        this.fft.poly_muladj_fft(falconFPRArr2, i17, falconFPRArr, iSkoff_b10, i15);
        System.arraycopy(falconFPRArr, iSkoff_b01, falconFPRArr2, i19, iMKN);
        this.fft.poly_muladj_fft(falconFPRArr2, i19, falconFPRArr, iSkoff_b11, i15);
        this.fft.poly_add(falconFPRArr2, i17, falconFPRArr2, i19, i15);
        System.arraycopy(falconFPRArr, iSkoff_b10, falconFPRArr2, i18, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i18, i15);
        System.arraycopy(falconFPRArr, iSkoff_b11, falconFPRArr2, i19, iMKN);
        this.fft.poly_mulselfadj_fft(falconFPRArr2, i19, i15);
        this.fft.poly_add(falconFPRArr2, i18, falconFPRArr2, i19, i15);
        ffLDL_fft(falconFPRArr, iSkoff_tree, falconFPRArr2, i16, falconFPRArr2, i17, falconFPRArr2, i18, i15, falconFPRArr2, i19);
        ffLDL_binary_normalize(falconFPRArr, iSkoff_tree, i15, i15);
    }

    public void ffLDL_binary_normalize(FalconFPR[] falconFPRArr, int i10, int i11, int i12) {
        int iMKN = MKN(i12);
        if (iMKN == 1) {
            FPREngine fPREngine = this.fpr;
            falconFPRArr[i10] = fPREngine.fpr_mul(fPREngine.fpr_sqrt(falconFPRArr[i10]), this.fpr.fpr_inv_sigma[i11]);
        } else {
            int i13 = i10 + iMKN;
            int i14 = i12 - 1;
            ffLDL_binary_normalize(falconFPRArr, i13, i11, i14);
            ffLDL_binary_normalize(falconFPRArr, i13 + ffLDL_treesize(i14), i11, i14);
        }
    }

    public void ffLDL_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, FalconFPR[] falconFPRArr4, int i13, int i14, FalconFPR[] falconFPRArr5, int i15) {
        int iMKN = MKN(i14);
        if (iMKN == 1) {
            falconFPRArr[i10] = falconFPRArr2[i11];
            return;
        }
        int i16 = iMKN >> 1;
        int i17 = i15 + iMKN;
        int i18 = i15 + (iMKN << 1);
        System.arraycopy(falconFPRArr2, i11, falconFPRArr5, i15, iMKN);
        this.fft.poly_LDLmv_fft(falconFPRArr5, i17, falconFPRArr, i10, falconFPRArr2, i11, falconFPRArr3, i12, falconFPRArr4, i13, i14);
        this.fft.poly_split_fft(falconFPRArr5, i18, falconFPRArr5, i18 + i16, falconFPRArr5, i15, i14);
        int i19 = i15 + i16;
        this.fft.poly_split_fft(falconFPRArr5, i15, falconFPRArr5, i19, falconFPRArr5, i17, i14);
        System.arraycopy(falconFPRArr5, i18, falconFPRArr5, i17, iMKN);
        int i20 = i10 + iMKN;
        int i21 = i14 - 1;
        ffLDL_fft_inner(falconFPRArr, i20, falconFPRArr5, i17, falconFPRArr5, i17 + i16, i21, falconFPRArr5, i18);
        ffLDL_fft_inner(falconFPRArr, i20 + ffLDL_treesize(i21), falconFPRArr5, i15, falconFPRArr5, i19, i21, falconFPRArr5, i18);
    }

    public void ffLDL_fft_inner(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, int i13, FalconFPR[] falconFPRArr4, int i14) {
        int iMKN = MKN(i13);
        if (iMKN == 1) {
            falconFPRArr[i10] = falconFPRArr2[i11];
            return;
        }
        int i15 = iMKN >> 1;
        this.fft.poly_LDLmv_fft(falconFPRArr4, i14, falconFPRArr, i10, falconFPRArr2, i11, falconFPRArr3, i12, falconFPRArr2, i11, i13);
        int i16 = i12 + i15;
        this.fft.poly_split_fft(falconFPRArr3, i12, falconFPRArr3, i16, falconFPRArr2, i11, i13);
        int i17 = i11 + i15;
        this.fft.poly_split_fft(falconFPRArr2, i11, falconFPRArr2, i17, falconFPRArr4, i14, i13);
        int i18 = i10 + iMKN;
        int i19 = i13 - 1;
        ffLDL_fft_inner(falconFPRArr, i18, falconFPRArr3, i12, falconFPRArr3, i16, i19, falconFPRArr4, i14);
        ffLDL_fft_inner(falconFPRArr, i18 + ffLDL_treesize(i19), falconFPRArr2, i11, falconFPRArr2, i17, i19, falconFPRArr4, i14);
    }

    public int ffLDL_treesize(int i10) {
        return (i10 + 1) << i10;
    }

    public void ffSampling_fft(SamplerZ samplerZ, SamplerCtx samplerCtx, FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, FalconFPR[] falconFPRArr4, int i13, FalconFPR[] falconFPRArr5, int i14, int i15, FalconFPR[] falconFPRArr6, int i16) {
        if (i15 != 2) {
            if (i15 != 1) {
                int i17 = 1 << i15;
                int i18 = i17 >> 1;
                int i19 = i12 + i17;
                int i20 = i15 - 1;
                int iFfLDL_treesize = i19 + ffLDL_treesize(i20);
                int i21 = i11 + i18;
                this.fft.poly_split_fft(falconFPRArr2, i11, falconFPRArr2, i21, falconFPRArr5, i14, i15);
                int i22 = i16 + i18;
                int i23 = i16 + i17;
                ffSampling_fft(samplerZ, samplerCtx, falconFPRArr6, i16, falconFPRArr6, i22, falconFPRArr3, iFfLDL_treesize, falconFPRArr2, i11, falconFPRArr2, i21, i20, falconFPRArr6, i23);
                this.fft.poly_merge_fft(falconFPRArr2, i11, falconFPRArr6, i16, falconFPRArr6, i22, i15);
                System.arraycopy(falconFPRArr5, i14, falconFPRArr6, i16, i17);
                this.fft.poly_sub(falconFPRArr6, i16, falconFPRArr2, i11, i15);
                this.fft.poly_mul_fft(falconFPRArr6, i16, falconFPRArr3, i12, i15);
                this.fft.poly_add(falconFPRArr6, i16, falconFPRArr4, i13, i15);
                int i24 = i10 + i18;
                this.fft.poly_split_fft(falconFPRArr, i10, falconFPRArr, i24, falconFPRArr6, i16, i15);
                ffSampling_fft(samplerZ, samplerCtx, falconFPRArr6, i16, falconFPRArr6, i22, falconFPRArr3, i19, falconFPRArr, i10, falconFPRArr, i24, i20, falconFPRArr6, i23);
                this.fft.poly_merge_fft(falconFPRArr, i10, falconFPRArr6, i16, falconFPRArr6, i22, i15);
                return;
            }
            FalconFPR falconFPR = falconFPRArr5[i14];
            FalconFPR falconFPR2 = falconFPRArr5[i14 + 1];
            FalconFPR falconFPR3 = falconFPRArr3[i12 + 3];
            FalconFPR falconFPRFpr_of = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPR, falconFPR3));
            falconFPRArr2[i11] = falconFPRFpr_of;
            FalconFPR falconFPRFpr_of2 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPR2, falconFPR3));
            falconFPRArr2[i11 + 1] = falconFPRFpr_of2;
            FalconFPR falconFPRFpr_sub = this.fpr.fpr_sub(falconFPR, falconFPRFpr_of);
            FalconFPR falconFPRFpr_sub2 = this.fpr.fpr_sub(falconFPR2, falconFPRFpr_of2);
            FalconFPR falconFPR4 = falconFPRArr3[i12];
            FalconFPR falconFPR5 = falconFPRArr3[i12 + 1];
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPRFpr_sub3 = fPREngine.fpr_sub(fPREngine.fpr_mul(falconFPRFpr_sub, falconFPR4), this.fpr.fpr_mul(falconFPRFpr_sub2, falconFPR5));
            FPREngine fPREngine2 = this.fpr;
            FalconFPR falconFPRFpr_add = fPREngine2.fpr_add(fPREngine2.fpr_mul(falconFPRFpr_sub, falconFPR5), this.fpr.fpr_mul(falconFPRFpr_sub2, falconFPR4));
            FalconFPR falconFPRFpr_add2 = this.fpr.fpr_add(falconFPRFpr_sub3, falconFPRArr4[i13]);
            FalconFPR falconFPRFpr_add3 = this.fpr.fpr_add(falconFPRFpr_add, falconFPRArr4[i13 + 1]);
            FalconFPR falconFPR6 = falconFPRArr3[i12 + 2];
            falconFPRArr[i10] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add2, falconFPR6));
            falconFPRArr[i10 + 1] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add3, falconFPR6));
            return;
        }
        FalconFPR falconFPR7 = falconFPRArr5[i14];
        int i25 = i14 + 2;
        FalconFPR falconFPR8 = falconFPRArr5[i25];
        int i26 = i14 + 1;
        FalconFPR falconFPR9 = falconFPRArr5[i26];
        int i27 = i14 + 3;
        FalconFPR falconFPR10 = falconFPRArr5[i27];
        FalconFPR falconFPRFpr_add4 = this.fpr.fpr_add(falconFPR7, falconFPR9);
        FalconFPR falconFPRFpr_add5 = this.fpr.fpr_add(falconFPR8, falconFPR10);
        FalconFPR falconFPRFpr_half = this.fpr.fpr_half(falconFPRFpr_add4);
        FalconFPR falconFPRFpr_half2 = this.fpr.fpr_half(falconFPRFpr_add5);
        FalconFPR falconFPRFpr_sub4 = this.fpr.fpr_sub(falconFPR7, falconFPR9);
        FalconFPR falconFPRFpr_sub5 = this.fpr.fpr_sub(falconFPR8, falconFPR10);
        FPREngine fPREngine3 = this.fpr;
        FalconFPR falconFPRFpr_mul = fPREngine3.fpr_mul(fPREngine3.fpr_add(falconFPRFpr_sub4, falconFPRFpr_sub5), this.fpr.fpr_invsqrt8);
        FPREngine fPREngine4 = this.fpr;
        FalconFPR falconFPRFpr_mul2 = fPREngine4.fpr_mul(fPREngine4.fpr_sub(falconFPRFpr_sub5, falconFPRFpr_sub4), this.fpr.fpr_invsqrt8);
        FalconFPR falconFPR11 = falconFPRArr3[i12 + 11];
        FalconFPR falconFPRFpr_of3 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_mul, falconFPR11));
        FalconFPR falconFPRFpr_of4 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_mul2, falconFPR11));
        FalconFPR falconFPRFpr_sub6 = this.fpr.fpr_sub(falconFPRFpr_mul, falconFPRFpr_of3);
        FalconFPR falconFPRFpr_sub7 = this.fpr.fpr_sub(falconFPRFpr_mul2, falconFPRFpr_of4);
        FalconFPR falconFPR12 = falconFPRArr3[i12 + 8];
        FalconFPR falconFPR13 = falconFPRArr3[i12 + 9];
        FPREngine fPREngine5 = this.fpr;
        FalconFPR falconFPRFpr_sub8 = fPREngine5.fpr_sub(fPREngine5.fpr_mul(falconFPRFpr_sub6, falconFPR12), this.fpr.fpr_mul(falconFPRFpr_sub7, falconFPR13));
        FPREngine fPREngine6 = this.fpr;
        FalconFPR falconFPRFpr_add6 = fPREngine6.fpr_add(fPREngine6.fpr_mul(falconFPRFpr_sub6, falconFPR13), this.fpr.fpr_mul(falconFPRFpr_sub7, falconFPR12));
        FalconFPR falconFPRFpr_add7 = this.fpr.fpr_add(falconFPRFpr_sub8, falconFPRFpr_half);
        FalconFPR falconFPRFpr_add8 = this.fpr.fpr_add(falconFPRFpr_add6, falconFPRFpr_half2);
        FalconFPR falconFPR14 = falconFPRArr3[i12 + 10];
        FalconFPR falconFPRFpr_of5 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add7, falconFPR14));
        FalconFPR falconFPRFpr_of6 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add8, falconFPR14));
        FPREngine fPREngine7 = this.fpr;
        FalconFPR falconFPRFpr_mul3 = fPREngine7.fpr_mul(fPREngine7.fpr_sub(falconFPRFpr_of3, falconFPRFpr_of4), this.fpr.fpr_invsqrt2);
        FPREngine fPREngine8 = this.fpr;
        FalconFPR falconFPRFpr_mul4 = fPREngine8.fpr_mul(fPREngine8.fpr_add(falconFPRFpr_of3, falconFPRFpr_of4), this.fpr.fpr_invsqrt2);
        FalconFPR falconFPRFpr_add9 = this.fpr.fpr_add(falconFPRFpr_of5, falconFPRFpr_mul3);
        falconFPRArr2[i11] = falconFPRFpr_add9;
        FalconFPR falconFPRFpr_add10 = this.fpr.fpr_add(falconFPRFpr_of6, falconFPRFpr_mul4);
        falconFPRArr2[i11 + 2] = falconFPRFpr_add10;
        FalconFPR falconFPRFpr_sub9 = this.fpr.fpr_sub(falconFPRFpr_of5, falconFPRFpr_mul3);
        falconFPRArr2[i11 + 1] = falconFPRFpr_sub9;
        FalconFPR falconFPRFpr_sub10 = this.fpr.fpr_sub(falconFPRFpr_of6, falconFPRFpr_mul4);
        falconFPRArr2[i11 + 3] = falconFPRFpr_sub10;
        FalconFPR falconFPRFpr_sub11 = this.fpr.fpr_sub(falconFPRArr5[i14], falconFPRFpr_add9);
        FalconFPR falconFPRFpr_sub12 = this.fpr.fpr_sub(falconFPRArr5[i26], falconFPRFpr_sub9);
        FalconFPR falconFPRFpr_sub13 = this.fpr.fpr_sub(falconFPRArr5[i25], falconFPRFpr_add10);
        FalconFPR falconFPRFpr_sub14 = this.fpr.fpr_sub(falconFPRArr5[i27], falconFPRFpr_sub10);
        FalconFPR falconFPR15 = falconFPRArr3[i12];
        FalconFPR falconFPR16 = falconFPRArr3[i12 + 2];
        FPREngine fPREngine9 = this.fpr;
        FalconFPR falconFPRFpr_sub15 = fPREngine9.fpr_sub(fPREngine9.fpr_mul(falconFPRFpr_sub11, falconFPR15), this.fpr.fpr_mul(falconFPRFpr_sub13, falconFPR16));
        FPREngine fPREngine10 = this.fpr;
        FalconFPR falconFPRFpr_add11 = fPREngine10.fpr_add(fPREngine10.fpr_mul(falconFPRFpr_sub11, falconFPR16), this.fpr.fpr_mul(falconFPRFpr_sub13, falconFPR15));
        FalconFPR falconFPR17 = falconFPRArr3[i12 + 1];
        FalconFPR falconFPR18 = falconFPRArr3[i12 + 3];
        FPREngine fPREngine11 = this.fpr;
        FalconFPR falconFPRFpr_sub16 = fPREngine11.fpr_sub(fPREngine11.fpr_mul(falconFPRFpr_sub12, falconFPR17), this.fpr.fpr_mul(falconFPRFpr_sub14, falconFPR18));
        FPREngine fPREngine12 = this.fpr;
        FalconFPR falconFPRFpr_add12 = fPREngine12.fpr_add(fPREngine12.fpr_mul(falconFPRFpr_sub12, falconFPR18), this.fpr.fpr_mul(falconFPRFpr_sub14, falconFPR17));
        FalconFPR falconFPRFpr_add13 = this.fpr.fpr_add(falconFPRFpr_sub15, falconFPRArr4[i13]);
        FalconFPR falconFPRFpr_add14 = this.fpr.fpr_add(falconFPRFpr_sub16, falconFPRArr4[i13 + 1]);
        FalconFPR falconFPRFpr_add15 = this.fpr.fpr_add(falconFPRFpr_add11, falconFPRArr4[i13 + 2]);
        FalconFPR falconFPRFpr_add16 = this.fpr.fpr_add(falconFPRFpr_add12, falconFPRArr4[i13 + 3]);
        FalconFPR falconFPRFpr_add17 = this.fpr.fpr_add(falconFPRFpr_add13, falconFPRFpr_add14);
        FalconFPR falconFPRFpr_add18 = this.fpr.fpr_add(falconFPRFpr_add15, falconFPRFpr_add16);
        FalconFPR falconFPRFpr_half3 = this.fpr.fpr_half(falconFPRFpr_add17);
        FalconFPR falconFPRFpr_half4 = this.fpr.fpr_half(falconFPRFpr_add18);
        FalconFPR falconFPRFpr_sub17 = this.fpr.fpr_sub(falconFPRFpr_add13, falconFPRFpr_add14);
        FalconFPR falconFPRFpr_sub18 = this.fpr.fpr_sub(falconFPRFpr_add15, falconFPRFpr_add16);
        FPREngine fPREngine13 = this.fpr;
        FalconFPR falconFPRFpr_mul5 = fPREngine13.fpr_mul(fPREngine13.fpr_add(falconFPRFpr_sub17, falconFPRFpr_sub18), this.fpr.fpr_invsqrt8);
        FPREngine fPREngine14 = this.fpr;
        FalconFPR falconFPRFpr_mul6 = fPREngine14.fpr_mul(fPREngine14.fpr_sub(falconFPRFpr_sub18, falconFPRFpr_sub17), this.fpr.fpr_invsqrt8);
        FalconFPR falconFPR19 = falconFPRArr3[i12 + 7];
        FalconFPR falconFPRFpr_of7 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_mul5, falconFPR19));
        FalconFPR falconFPRFpr_of8 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_mul6, falconFPR19));
        FalconFPR falconFPRFpr_sub19 = this.fpr.fpr_sub(falconFPRFpr_mul5, falconFPRFpr_of7);
        FalconFPR falconFPRFpr_sub20 = this.fpr.fpr_sub(falconFPRFpr_mul6, falconFPRFpr_of8);
        FalconFPR falconFPR20 = falconFPRArr3[i12 + 4];
        FalconFPR falconFPR21 = falconFPRArr3[i12 + 5];
        FPREngine fPREngine15 = this.fpr;
        FalconFPR falconFPRFpr_sub21 = fPREngine15.fpr_sub(fPREngine15.fpr_mul(falconFPRFpr_sub19, falconFPR20), this.fpr.fpr_mul(falconFPRFpr_sub20, falconFPR21));
        FPREngine fPREngine16 = this.fpr;
        FalconFPR falconFPRFpr_add19 = fPREngine16.fpr_add(fPREngine16.fpr_mul(falconFPRFpr_sub19, falconFPR21), this.fpr.fpr_mul(falconFPRFpr_sub20, falconFPR20));
        FalconFPR falconFPRFpr_add20 = this.fpr.fpr_add(falconFPRFpr_sub21, falconFPRFpr_half3);
        FalconFPR falconFPRFpr_add21 = this.fpr.fpr_add(falconFPRFpr_add19, falconFPRFpr_half4);
        FalconFPR falconFPR22 = falconFPRArr3[i12 + 6];
        FalconFPR falconFPRFpr_of9 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add20, falconFPR22));
        FalconFPR falconFPRFpr_of10 = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRFpr_add21, falconFPR22));
        FPREngine fPREngine17 = this.fpr;
        FalconFPR falconFPRFpr_mul7 = fPREngine17.fpr_mul(fPREngine17.fpr_sub(falconFPRFpr_of7, falconFPRFpr_of8), this.fpr.fpr_invsqrt2);
        FPREngine fPREngine18 = this.fpr;
        FalconFPR falconFPRFpr_mul8 = fPREngine18.fpr_mul(fPREngine18.fpr_add(falconFPRFpr_of7, falconFPRFpr_of8), this.fpr.fpr_invsqrt2);
        falconFPRArr[i10] = this.fpr.fpr_add(falconFPRFpr_of9, falconFPRFpr_mul7);
        falconFPRArr[i10 + 2] = this.fpr.fpr_add(falconFPRFpr_of10, falconFPRFpr_mul8);
        falconFPRArr[i10 + 1] = this.fpr.fpr_sub(falconFPRFpr_of9, falconFPRFpr_mul7);
        falconFPRArr[i10 + 3] = this.fpr.fpr_sub(falconFPRFpr_of10, falconFPRFpr_mul8);
    }

    public void ffSampling_fft_dyntree(SamplerZ samplerZ, SamplerCtx samplerCtx, FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, FalconFPR[] falconFPRArr4, int i13, FalconFPR[] falconFPRArr5, int i14, int i15, int i16, FalconFPR[] falconFPRArr6, int i17) {
        if (i16 == 0) {
            FalconFPR falconFPR = falconFPRArr3[i12];
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPRFpr_mul = fPREngine.fpr_mul(fPREngine.fpr_sqrt(falconFPR), this.fpr.fpr_inv_sigma[i15]);
            falconFPRArr[i10] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRArr[i10], falconFPRFpr_mul));
            falconFPRArr2[i11] = this.fpr.fpr_of(samplerZ.sample(samplerCtx, falconFPRArr2[i11], falconFPRFpr_mul));
            return;
        }
        int i18 = 1 << i16;
        int i19 = i18 >> 1;
        this.fft.poly_LDL_fft(falconFPRArr3, i12, falconFPRArr4, i13, falconFPRArr5, i14, i16);
        int i20 = i17 + i19;
        this.fft.poly_split_fft(falconFPRArr6, i17, falconFPRArr6, i20, falconFPRArr3, i12, i16);
        System.arraycopy(falconFPRArr6, i17, falconFPRArr3, i12, i18);
        this.fft.poly_split_fft(falconFPRArr6, i17, falconFPRArr6, i20, falconFPRArr5, i14, i16);
        System.arraycopy(falconFPRArr6, i17, falconFPRArr5, i14, i18);
        System.arraycopy(falconFPRArr4, i13, falconFPRArr6, i17, i18);
        System.arraycopy(falconFPRArr3, i12, falconFPRArr4, i13, i19);
        int i21 = i13 + i19;
        System.arraycopy(falconFPRArr5, i14, falconFPRArr4, i21, i19);
        int i22 = i17 + i18;
        int i23 = i22 + i19;
        this.fft.poly_split_fft(falconFPRArr6, i22, falconFPRArr6, i23, falconFPRArr2, i11, i16);
        int i24 = i16 - 1;
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr6, i22, falconFPRArr6, i23, falconFPRArr5, i14, falconFPRArr5, i14 + i19, falconFPRArr4, i21, i15, i24, falconFPRArr6, i22 + i18);
        int i25 = i17 + (i18 << 1);
        this.fft.poly_merge_fft(falconFPRArr6, i25, falconFPRArr6, i22, falconFPRArr6, i23, i16);
        System.arraycopy(falconFPRArr2, i11, falconFPRArr6, i22, i18);
        this.fft.poly_sub(falconFPRArr6, i22, falconFPRArr6, i25, i16);
        System.arraycopy(falconFPRArr6, i25, falconFPRArr2, i11, i18);
        this.fft.poly_mul_fft(falconFPRArr6, i17, falconFPRArr6, i22, i16);
        this.fft.poly_add(falconFPRArr, i10, falconFPRArr6, i17, i16);
        this.fft.poly_split_fft(falconFPRArr6, i17, falconFPRArr6, i20, falconFPRArr, i10, i16);
        ffSampling_fft_dyntree(samplerZ, samplerCtx, falconFPRArr6, i17, falconFPRArr6, i20, falconFPRArr3, i12, falconFPRArr3, i12 + i19, falconFPRArr4, i13, i15, i24, falconFPRArr6, i22);
        this.fft.poly_merge_fft(falconFPRArr, i10, falconFPRArr6, i17, falconFPRArr6, i20, i16);
    }

    public void sign_dyn(short[] sArr, int i10, SHAKE256 shake256, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, byte[] bArr4, int i14, short[] sArr2, int i15, int i16, FalconFPR[] falconFPRArr, int i17) {
        SamplerCtx samplerCtx;
        SamplerZ samplerZ;
        do {
            samplerCtx = new SamplerCtx();
            samplerZ = new SamplerZ();
            samplerCtx.sigma_min = this.fpr.fpr_sigma_min[i16];
            samplerCtx.f20343p.prng_init(shake256);
        } while (do_sign_dyn(samplerZ, samplerCtx, sArr, i10, bArr, i11, bArr2, i12, bArr3, i13, bArr4, i14, sArr2, i15, i16, falconFPRArr, i17) == 0);
    }

    public void sign_tree(short[] sArr, int i10, SHAKE256 shake256, FalconFPR[] falconFPRArr, int i11, short[] sArr2, int i12, int i13, FalconFPR[] falconFPRArr2, int i14) {
        SamplerCtx samplerCtx;
        SamplerZ samplerZ;
        do {
            samplerCtx = new SamplerCtx();
            samplerZ = new SamplerZ();
            samplerCtx.sigma_min = this.fpr.fpr_sigma_min[i13];
            samplerCtx.f20343p.prng_init(shake256);
        } while (do_sign_tree(samplerZ, samplerCtx, sArr, i10, falconFPRArr, i11, sArr2, i12, i13, falconFPRArr2, i14) == 0);
    }

    public int skoff_b00(int i10) {
        return 0;
    }

    public int skoff_b01(int i10) {
        return MKN(i10);
    }

    public int skoff_b10(int i10) {
        return MKN(i10) * 2;
    }

    public int skoff_b11(int i10) {
        return MKN(i10) * 3;
    }

    public int skoff_tree(int i10) {
        return MKN(i10) * 4;
    }

    public void smallints_to_fpr(FalconFPR[] falconFPRArr, int i10, byte[] bArr, int i11, int i12) {
        int iMKN = MKN(i12);
        for (int i13 = 0; i13 < iMKN; i13++) {
            falconFPRArr[i10 + i13] = this.fpr.fpr_of(bArr[i11 + i13]);
        }
    }
}
