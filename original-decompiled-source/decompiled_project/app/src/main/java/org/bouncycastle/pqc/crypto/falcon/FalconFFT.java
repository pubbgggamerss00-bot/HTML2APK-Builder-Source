package org.bouncycastle.pqc.crypto.falcon;

/* loaded from: classes3.dex */
class FalconFFT {
    FPREngine fpr = new FPREngine();

    public void FFT(FalconFPR[] falconFPRArr, int i10, int i11) {
        int i12 = i11;
        int i13 = 1;
        int i14 = (1 << i12) >> 1;
        int i15 = 2;
        int i16 = 1;
        int i17 = i14;
        while (i16 < i12) {
            int i18 = i17 >> 1;
            int i19 = i15 >> 1;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i19) {
                int i22 = i21 + i18;
                FalconFPR[] falconFPRArr2 = this.fpr.fpr_gm_tab;
                int i23 = (i15 + i20) << i13;
                FalconFPR falconFPR = falconFPRArr2[i23];
                FalconFPR falconFPR2 = falconFPRArr2[i23 + i13];
                int i24 = i21;
                while (i24 < i22) {
                    int i25 = i10 + i24;
                    FalconFPR falconFPR3 = falconFPRArr[i25];
                    int i26 = i25 + i14;
                    FalconFPR falconFPR4 = falconFPRArr[i26];
                    int i27 = i25 + i18;
                    int i28 = i14;
                    int i29 = i27 + i28;
                    int i30 = i15;
                    ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPRArr[i27], falconFPRArr[i29], falconFPR, falconFPR2);
                    FalconFPR falconFPR5 = complexNumberWrapperFPC_MUL.f20334re;
                    FalconFPR falconFPR6 = complexNumberWrapperFPC_MUL.im;
                    int i31 = i16;
                    ComplexNumberWrapper complexNumberWrapperFPC_ADD = FPC_ADD(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
                    falconFPRArr[i25] = complexNumberWrapperFPC_ADD.f20334re;
                    falconFPRArr[i26] = complexNumberWrapperFPC_ADD.im;
                    ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
                    falconFPRArr[i27] = complexNumberWrapperFPC_SUB.f20334re;
                    falconFPRArr[i29] = complexNumberWrapperFPC_SUB.im;
                    i24++;
                    i14 = i28;
                    i15 = i30;
                    i16 = i31;
                    i17 = i17;
                }
                i20++;
                i21 += i17;
                i13 = 1;
            }
            i16++;
            i15 <<= 1;
            i12 = i11;
            i17 = i18;
            i13 = 1;
        }
    }

    public ComplexNumberWrapper FPC_ADD(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        return new ComplexNumberWrapper(this.fpr.fpr_add(falconFPR, falconFPR3), this.fpr.fpr_add(falconFPR2, falconFPR4));
    }

    public ComplexNumberWrapper FPC_DIV(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        FPREngine fPREngine = this.fpr;
        FalconFPR falconFPRFpr_inv = this.fpr.fpr_inv(fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR3), this.fpr.fpr_sqr(falconFPR4)));
        FalconFPR falconFPRFpr_mul = this.fpr.fpr_mul(falconFPR3, falconFPRFpr_inv);
        FPREngine fPREngine2 = this.fpr;
        FalconFPR falconFPRFpr_mul2 = fPREngine2.fpr_mul(fPREngine2.fpr_neg(falconFPR4), falconFPRFpr_inv);
        FPREngine fPREngine3 = this.fpr;
        FalconFPR falconFPRFpr_sub = fPREngine3.fpr_sub(fPREngine3.fpr_mul(falconFPR, falconFPRFpr_mul), this.fpr.fpr_mul(falconFPR2, falconFPRFpr_mul2));
        FPREngine fPREngine4 = this.fpr;
        return new ComplexNumberWrapper(falconFPRFpr_sub, fPREngine4.fpr_add(fPREngine4.fpr_mul(falconFPR, falconFPRFpr_mul2), this.fpr.fpr_mul(falconFPR2, falconFPRFpr_mul)));
    }

    public ComplexNumberWrapper FPC_INV(FalconFPR falconFPR, FalconFPR falconFPR2) {
        FPREngine fPREngine = this.fpr;
        FalconFPR falconFPRFpr_inv = this.fpr.fpr_inv(fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2)));
        FalconFPR falconFPRFpr_mul = this.fpr.fpr_mul(falconFPR, falconFPRFpr_inv);
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(falconFPRFpr_mul, fPREngine2.fpr_mul(fPREngine2.fpr_neg(falconFPR2), falconFPRFpr_inv));
    }

    public ComplexNumberWrapper FPC_MUL(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        FPREngine fPREngine = this.fpr;
        FalconFPR falconFPRFpr_sub = fPREngine.fpr_sub(fPREngine.fpr_mul(falconFPR, falconFPR3), this.fpr.fpr_mul(falconFPR2, falconFPR4));
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(falconFPRFpr_sub, fPREngine2.fpr_add(fPREngine2.fpr_mul(falconFPR, falconFPR4), this.fpr.fpr_mul(falconFPR2, falconFPR3)));
    }

    public ComplexNumberWrapper FPC_SQR(FalconFPR falconFPR, FalconFPR falconFPR2) {
        FPREngine fPREngine = this.fpr;
        FalconFPR falconFPRFpr_sub = fPREngine.fpr_sub(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
        FPREngine fPREngine2 = this.fpr;
        return new ComplexNumberWrapper(falconFPRFpr_sub, fPREngine2.fpr_double(fPREngine2.fpr_mul(falconFPR, falconFPR2)));
    }

    public ComplexNumberWrapper FPC_SUB(FalconFPR falconFPR, FalconFPR falconFPR2, FalconFPR falconFPR3, FalconFPR falconFPR4) {
        return new ComplexNumberWrapper(this.fpr.fpr_sub(falconFPR, falconFPR3), this.fpr.fpr_sub(falconFPR2, falconFPR4));
    }

    public void iFFT(FalconFPR[] falconFPRArr, int i10, int i11) {
        int i12;
        int i13 = 1;
        int i14 = 1 << i11;
        int i15 = i14 >> 1;
        int i16 = i11;
        int i17 = 1;
        int i18 = i14;
        while (true) {
            i12 = 0;
            if (i16 <= i13) {
                break;
            }
            i18 >>= i13;
            int i19 = i17 << 1;
            int i20 = 0;
            while (i12 < i15) {
                int i21 = i12 + i17;
                FPREngine fPREngine = this.fpr;
                FalconFPR[] falconFPRArr2 = fPREngine.fpr_gm_tab;
                int i22 = (i18 + i20) << i13;
                FalconFPR falconFPR = falconFPRArr2[i22];
                FalconFPR falconFPRFpr_neg = fPREngine.fpr_neg(falconFPRArr2[i22 + i13]);
                int i23 = i12;
                while (i23 < i21) {
                    int i24 = i10 + i23;
                    FalconFPR falconFPR2 = falconFPRArr[i24];
                    int i25 = i24 + i15;
                    FalconFPR falconFPR3 = falconFPRArr[i25];
                    int i26 = i24 + i17;
                    int i27 = i15;
                    FalconFPR falconFPR4 = falconFPRArr[i26];
                    int i28 = i26 + i27;
                    int i29 = i16;
                    FalconFPR falconFPR5 = falconFPRArr[i28];
                    int i30 = i18;
                    ComplexNumberWrapper complexNumberWrapperFPC_ADD = FPC_ADD(falconFPR2, falconFPR3, falconFPR4, falconFPR5);
                    falconFPRArr[i24] = complexNumberWrapperFPC_ADD.f20334re;
                    falconFPRArr[i25] = complexNumberWrapperFPC_ADD.im;
                    ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR2, falconFPR3, falconFPR4, falconFPR5);
                    ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(complexNumberWrapperFPC_SUB.f20334re, complexNumberWrapperFPC_SUB.im, falconFPR, falconFPRFpr_neg);
                    falconFPRArr[i26] = complexNumberWrapperFPC_MUL.f20334re;
                    falconFPRArr[i28] = complexNumberWrapperFPC_MUL.im;
                    i23++;
                    i15 = i27;
                    i16 = i29;
                    i18 = i30;
                    i17 = i17;
                }
                i20++;
                i12 += i19;
                i13 = 1;
            }
            i16--;
            i17 = i19;
            i13 = 1;
        }
        if (i11 > 0) {
            FalconFPR falconFPR6 = this.fpr.fpr_p2_tab[i11];
            while (i12 < i14) {
                int i31 = i10 + i12;
                falconFPRArr[i31] = this.fpr.fpr_mul(falconFPRArr[i31], falconFPR6);
                i12++;
            }
        }
    }

    public void poly_LDL_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i10 + i15;
            FalconFPR falconFPR = falconFPRArr[i16];
            FalconFPR falconFPR2 = falconFPRArr[i16 + i14];
            int i17 = i11 + i15;
            FalconFPR falconFPR3 = falconFPRArr2[i17];
            int i18 = i17 + i14;
            FalconFPR falconFPR4 = falconFPRArr2[i18];
            int i19 = i12 + i15;
            FalconFPR falconFPR5 = falconFPRArr3[i19];
            int i20 = i19 + i14;
            FalconFPR falconFPR6 = falconFPRArr3[i20];
            ComplexNumberWrapper complexNumberWrapperFPC_DIV = FPC_DIV(falconFPR3, falconFPR4, falconFPR, falconFPR2);
            FalconFPR falconFPR7 = complexNumberWrapperFPC_DIV.f20334re;
            FalconFPR falconFPR8 = complexNumberWrapperFPC_DIV.im;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPR3, this.fpr.fpr_neg(falconFPR4));
            ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR5, falconFPR6, complexNumberWrapperFPC_MUL.f20334re, complexNumberWrapperFPC_MUL.im);
            falconFPRArr3[i19] = complexNumberWrapperFPC_SUB.f20334re;
            falconFPRArr3[i20] = complexNumberWrapperFPC_SUB.im;
            falconFPRArr2[i17] = falconFPR7;
            falconFPRArr2[i18] = this.fpr.fpr_neg(falconFPR8);
        }
    }

    public void poly_LDLmv_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, FalconFPR[] falconFPRArr4, int i13, FalconFPR[] falconFPRArr5, int i14, int i15) {
        int i16 = (1 << i15) >> 1;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i12 + i17;
            FalconFPR falconFPR = falconFPRArr3[i18];
            FalconFPR falconFPR2 = falconFPRArr3[i18 + i16];
            int i19 = i13 + i17;
            FalconFPR falconFPR3 = falconFPRArr4[i19];
            FalconFPR falconFPR4 = falconFPRArr4[i19 + i16];
            int i20 = i14 + i17;
            FalconFPR falconFPR5 = falconFPRArr5[i20];
            FalconFPR falconFPR6 = falconFPRArr5[i20 + i16];
            ComplexNumberWrapper complexNumberWrapperFPC_DIV = FPC_DIV(falconFPR3, falconFPR4, falconFPR, falconFPR2);
            FalconFPR falconFPR7 = complexNumberWrapperFPC_DIV.f20334re;
            FalconFPR falconFPR8 = complexNumberWrapperFPC_DIV.im;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPR3, this.fpr.fpr_neg(falconFPR4));
            ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR5, falconFPR6, complexNumberWrapperFPC_MUL.f20334re, complexNumberWrapperFPC_MUL.im);
            int i21 = i10 + i17;
            falconFPRArr[i21] = complexNumberWrapperFPC_SUB.f20334re;
            falconFPRArr[i21 + i16] = complexNumberWrapperFPC_SUB.im;
            int i22 = i11 + i17;
            falconFPRArr2[i22] = falconFPR7;
            falconFPRArr2[i22 + i16] = this.fpr.fpr_neg(falconFPR8);
        }
    }

    public void poly_add(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i10 + i14;
            falconFPRArr[i15] = this.fpr.fpr_add(falconFPRArr[i15], falconFPRArr2[i11 + i14]);
        }
    }

    public void poly_add_muladj_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, FalconFPR[] falconFPRArr4, int i13, FalconFPR[] falconFPRArr5, int i14, int i15) {
        int i16 = (1 << i15) >> 1;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i11 + i17;
            FalconFPR falconFPR = falconFPRArr2[i18];
            FalconFPR falconFPR2 = falconFPRArr2[i18 + i16];
            int i19 = i12 + i17;
            FalconFPR falconFPR3 = falconFPRArr3[i19];
            FalconFPR falconFPR4 = falconFPRArr3[i19 + i16];
            int i20 = i13 + i17;
            FalconFPR falconFPR5 = falconFPRArr4[i20];
            FalconFPR falconFPR6 = falconFPRArr4[i20 + i16];
            int i21 = i14 + i17;
            FalconFPR falconFPR7 = falconFPRArr5[i21];
            FalconFPR falconFPR8 = falconFPRArr5[i21 + i16];
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR, falconFPR2, falconFPR5, this.fpr.fpr_neg(falconFPR6));
            FalconFPR falconFPR9 = complexNumberWrapperFPC_MUL.f20334re;
            FalconFPR falconFPR10 = complexNumberWrapperFPC_MUL.im;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL2 = FPC_MUL(falconFPR3, falconFPR4, falconFPR7, this.fpr.fpr_neg(falconFPR8));
            FalconFPR falconFPR11 = complexNumberWrapperFPC_MUL2.f20334re;
            FalconFPR falconFPR12 = complexNumberWrapperFPC_MUL2.im;
            int i22 = i10 + i17;
            falconFPRArr[i22] = this.fpr.fpr_add(falconFPR9, falconFPR11);
            falconFPRArr[i22 + i16] = this.fpr.fpr_add(falconFPR10, falconFPR12);
        }
    }

    public void poly_adj_fft(FalconFPR[] falconFPRArr, int i10, int i11) {
        int i12 = 1 << i11;
        for (int i13 = i12 >> 1; i13 < i12; i13++) {
            int i14 = i10 + i13;
            falconFPRArr[i14] = this.fpr.fpr_neg(falconFPRArr[i14]);
        }
    }

    public void poly_div_autoadj_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            FalconFPR falconFPRFpr_inv = this.fpr.fpr_inv(falconFPRArr2[i11 + i14]);
            int i15 = i10 + i14;
            falconFPRArr[i15] = this.fpr.fpr_mul(falconFPRArr[i15], falconFPRFpr_inv);
            int i16 = i15 + i13;
            falconFPRArr[i16] = this.fpr.fpr_mul(falconFPRArr[i16], falconFPRFpr_inv);
        }
    }

    public void poly_div_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i10 + i14;
            int i16 = i15 + i13;
            int i17 = i11 + i14;
            ComplexNumberWrapper complexNumberWrapperFPC_DIV = FPC_DIV(falconFPRArr[i15], falconFPRArr[i16], falconFPRArr2[i17], falconFPRArr2[i17 + i13]);
            falconFPRArr[i15] = complexNumberWrapperFPC_DIV.f20334re;
            falconFPRArr[i16] = complexNumberWrapperFPC_DIV.im;
        }
    }

    public void poly_invnorm2_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            FalconFPR falconFPR = falconFPRArr2[i16];
            FalconFPR falconFPR2 = falconFPRArr2[i16 + i14];
            int i17 = i12 + i15;
            FalconFPR falconFPR3 = falconFPRArr3[i17];
            FalconFPR falconFPR4 = falconFPRArr3[i17 + i14];
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPRFpr_add = fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
            FPREngine fPREngine2 = this.fpr;
            falconFPRArr[i10 + i15] = fPREngine.fpr_inv(fPREngine.fpr_add(falconFPRFpr_add, fPREngine2.fpr_add(fPREngine2.fpr_sqr(falconFPR3), this.fpr.fpr_sqr(falconFPR4))));
        }
    }

    public void poly_merge_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, int i13) {
        int i14 = 1 << i13;
        int i15 = i14 >> 1;
        int i16 = i14 >> 2;
        falconFPRArr[i10] = falconFPRArr2[i11];
        falconFPRArr[i10 + i15] = falconFPRArr3[i12];
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i11 + i17;
            FalconFPR falconFPR = falconFPRArr2[i18];
            FalconFPR falconFPR2 = falconFPRArr2[i18 + i16];
            int i19 = i12 + i17;
            FalconFPR falconFPR3 = falconFPRArr3[i19];
            FalconFPR falconFPR4 = falconFPRArr3[i19 + i16];
            FalconFPR[] falconFPRArr4 = this.fpr.fpr_gm_tab;
            int i20 = (i17 + i15) << 1;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR3, falconFPR4, falconFPRArr4[i20], falconFPRArr4[i20 + 1]);
            FalconFPR falconFPR5 = complexNumberWrapperFPC_MUL.f20334re;
            FalconFPR falconFPR6 = complexNumberWrapperFPC_MUL.im;
            ComplexNumberWrapper complexNumberWrapperFPC_ADD = FPC_ADD(falconFPR, falconFPR2, falconFPR5, falconFPR6);
            FalconFPR falconFPR7 = complexNumberWrapperFPC_ADD.f20334re;
            FalconFPR falconFPR8 = complexNumberWrapperFPC_ADD.im;
            int i21 = (i17 << 1) + i10;
            falconFPRArr[i21] = falconFPR7;
            falconFPRArr[i21 + i15] = falconFPR8;
            ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR, falconFPR2, falconFPR5, falconFPR6);
            FalconFPR falconFPR9 = complexNumberWrapperFPC_SUB.f20334re;
            FalconFPR falconFPR10 = complexNumberWrapperFPC_SUB.im;
            int i22 = i21 + 1;
            falconFPRArr[i22] = falconFPR9;
            falconFPRArr[i22 + i15] = falconFPR10;
        }
    }

    public void poly_mul_autoadj_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i10 + i14;
            int i16 = i11 + i14;
            falconFPRArr[i15] = this.fpr.fpr_mul(falconFPRArr[i15], falconFPRArr2[i16]);
            int i17 = i15 + i13;
            falconFPRArr[i17] = this.fpr.fpr_mul(falconFPRArr[i17], falconFPRArr2[i16]);
        }
    }

    public void poly_mul_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i10 + i14;
            int i16 = i15 + i13;
            int i17 = i11 + i14;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPRArr[i15], falconFPRArr[i16], falconFPRArr2[i17], falconFPRArr2[i17 + i13]);
            falconFPRArr[i15] = complexNumberWrapperFPC_MUL.f20334re;
            falconFPRArr[i16] = complexNumberWrapperFPC_MUL.im;
        }
    }

    public void poly_muladj_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i10 + i14;
            int i16 = i15 + i13;
            int i17 = i11 + i14;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPRArr[i15], falconFPRArr[i16], falconFPRArr2[i17], this.fpr.fpr_neg(falconFPRArr2[i17 + i13]));
            falconFPRArr[i15] = complexNumberWrapperFPC_MUL.f20334re;
            falconFPRArr[i16] = complexNumberWrapperFPC_MUL.im;
        }
    }

    public void poly_mulconst(FalconFPR[] falconFPRArr, int i10, FalconFPR falconFPR, int i11) {
        int i12 = 1 << i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + i13;
            falconFPRArr[i14] = this.fpr.fpr_mul(falconFPRArr[i14], falconFPR);
        }
    }

    public void poly_mulselfadj_fft(FalconFPR[] falconFPRArr, int i10, int i11) {
        int i12 = (1 << i11) >> 1;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + i13;
            FalconFPR falconFPR = falconFPRArr[i14];
            int i15 = i14 + i12;
            FalconFPR falconFPR2 = falconFPRArr[i15];
            FPREngine fPREngine = this.fpr;
            falconFPRArr[i14] = fPREngine.fpr_add(fPREngine.fpr_sqr(falconFPR), this.fpr.fpr_sqr(falconFPR2));
            falconFPRArr[i15] = this.fpr.fpr_zero;
        }
    }

    public void poly_neg(FalconFPR[] falconFPRArr, int i10, int i11) {
        int i12 = 1 << i11;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + i13;
            falconFPRArr[i14] = this.fpr.fpr_neg(falconFPRArr[i14]);
        }
    }

    public void poly_split_fft(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, FalconFPR[] falconFPRArr3, int i12, int i13) {
        int i14 = 1 << i13;
        int i15 = i14 >> 1;
        int i16 = i14 >> 2;
        falconFPRArr[i10] = falconFPRArr3[i12];
        falconFPRArr2[i11] = falconFPRArr3[i12 + i15];
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i12 + (i17 << 1);
            FalconFPR falconFPR = falconFPRArr3[i18];
            FalconFPR falconFPR2 = falconFPRArr3[i18 + i15];
            int i19 = i18 + 1;
            FalconFPR falconFPR3 = falconFPRArr3[i19];
            FalconFPR falconFPR4 = falconFPRArr3[i19 + i15];
            ComplexNumberWrapper complexNumberWrapperFPC_ADD = FPC_ADD(falconFPR, falconFPR2, falconFPR3, falconFPR4);
            FalconFPR falconFPR5 = complexNumberWrapperFPC_ADD.f20334re;
            FalconFPR falconFPR6 = complexNumberWrapperFPC_ADD.im;
            int i20 = i10 + i17;
            falconFPRArr[i20] = this.fpr.fpr_half(falconFPR5);
            falconFPRArr[i20 + i16] = this.fpr.fpr_half(falconFPR6);
            ComplexNumberWrapper complexNumberWrapperFPC_SUB = FPC_SUB(falconFPR, falconFPR2, falconFPR3, falconFPR4);
            FalconFPR falconFPR7 = complexNumberWrapperFPC_SUB.f20334re;
            FalconFPR falconFPR8 = complexNumberWrapperFPC_SUB.im;
            FPREngine fPREngine = this.fpr;
            FalconFPR[] falconFPRArr4 = fPREngine.fpr_gm_tab;
            int i21 = (i17 + i15) << 1;
            ComplexNumberWrapper complexNumberWrapperFPC_MUL = FPC_MUL(falconFPR7, falconFPR8, falconFPRArr4[i21], fPREngine.fpr_neg(falconFPRArr4[i21 + 1]));
            FalconFPR falconFPR9 = complexNumberWrapperFPC_MUL.f20334re;
            FalconFPR falconFPR10 = complexNumberWrapperFPC_MUL.im;
            int i22 = i11 + i17;
            falconFPRArr2[i22] = this.fpr.fpr_half(falconFPR9);
            falconFPRArr2[i22 + i16] = this.fpr.fpr_half(falconFPR10);
        }
    }

    public void poly_sub(FalconFPR[] falconFPRArr, int i10, FalconFPR[] falconFPRArr2, int i11, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i10 + i14;
            falconFPRArr[i15] = this.fpr.fpr_sub(falconFPRArr[i15], falconFPRArr2[i11 + i14]);
        }
    }
}
