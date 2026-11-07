package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.generators.a;
import p5.m0;

/* loaded from: classes3.dex */
class FalconKeyGen {
    private short[] REV10 = {0, 512, 256, 768, 128, 640, 384, 896, 64, 576, 320, 832, 192, 704, 448, 960, 32, 544, 288, 800, 160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 480, 992, 16, 528, 272, 784, 144, 656, 400, 912, 80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 304, 816, 176, 688, 432, 944, 112, 624, 368, 880, 240, 752, 496, 1008, 8, 520, 264, 776, 136, 648, 392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, 260, 772, 132, 644, 388, 900, 68, 580, 324, 836, 196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 500, 1012, 12, 524, 268, 780, 140, 652, 396, 908, 76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 380, 892, 252, 764, 508, 1020, 2, 514, 258, 770, 130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 434, 946, 114, 626, 370, 882, 242, 754, 498, 1010, 10, 522, 266, 778, 138, 650, 394, 906, 74, 586, 330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 250, 762, 506, 1018, 6, 518, 262, 774, 134, 646, 390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, 270, 782, 142, 654, 398, 910, 78, 590, 334, 846, 206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 430, 942, 110, 622, 366, 878, 238, 750, 494, 1006, 30, 542, 286, 798, 158, 670, 414, 926, 94, 606, 350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 510, 1022, 1, 513, 257, 769, 129, 641, 385, 897, 65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 49, 561, 305, 817, 177, 689, 433, 945, 113, 625, 369, 881, 241, 753, 497, 1009, 9, 521, 265, 777, 137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 5, 517, 261, 773, 133, 645, 389, 901, 69, 581, 325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 245, 757, 501, 1013, 13, 525, 269, 781, 141, 653, 397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, 259, 771, 131, 643, 387, 899, 67, 579, 323, 835, 195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 179, 691, 435, 947, 115, 627, 371, 883, 243, 755, 499, 1011, 11, 523, 267, 779, 139, 651, 395, 907, 75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 379, 891, 251, 763, 507, 1019, 7, 519, 263, 775, 135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 15, 527, 271, 783, 143, 655, 399, 911, 79, 591, 335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 175, 687, 431, 943, 111, 623, 367, 879, 239, 751, 495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
    95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 255, 767, 511, 1023};
    final long[] gauss_1024_12289 = {1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950, 86539696, 7062824, 510971, 32764, 1862, 94, 4, 0};
    final int[] MAX_BL_SMALL = {1, 1, 2, 2, 4, 7, 14, 27, 53, 106, 209};
    final int[] MAX_BL_LARGE = {2, 2, 5, 7, 12, 21, 40, 78, 157, 308};
    final int[] bitlength_avg = {4, 11, 24, 50, 102, 202, 401, 794, 1577, 3138, 6308};
    final int[] bitlength_std = {0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 25};
    final int DEPTH_INT_FG = 4;
    FPREngine fpr = new FPREngine();
    FalconSmallPrimeList primes = new FalconSmallPrimeList();
    FalconFFT fft = new FalconFFT();
    FalconCodec codec = new FalconCodec();
    FalconVrfy vrfy = new FalconVrfy();

    private static int mkn(int i10) {
        return 1 << i10;
    }

    private long toUnsignedLong(int i10) {
        return i10 & BodyPartID.bodyIdMax;
    }

    public long get_rng_u64(SHAKE256 shake256) {
        shake256.inner_shake256_extract(new byte[8], 0, 8);
        return ((r1[7] & 255) << 56) | (r1[0] & 255) | ((r1[1] & 255) << 8) | ((r1[2] & 255) << 16) | ((r1[3] & 255) << 24) | ((r1[4] & 255) << 32) | ((r1[5] & 255) << 40) | ((r1[6] & 255) << 48);
    }

    public void keygen(SHAKE256 shake256, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, byte[] bArr4, int i13, short[] sArr, int i14, int i15) {
        FalconKeyGen falconKeyGen;
        int i16;
        int i17;
        short[] sArr2;
        int i18;
        int i19;
        byte b10;
        FalconKeyGen falconKeyGen2 = this;
        byte[] bArr5 = bArr;
        int i20 = i10;
        byte[] bArr6 = bArr2;
        int i21 = i11;
        int i22 = i15;
        int iMkn = mkn(i22);
        short[] sArr3 = sArr;
        while (true) {
            FalconFPR[] falconFPRArr = new FalconFPR[iMkn * 3];
            falconKeyGen2.poly_small_mkgauss(shake256, bArr5, i20, i22);
            falconKeyGen2.poly_small_mkgauss(shake256, bArr6, i21, i22);
            int i23 = 1 << (falconKeyGen2.codec.max_fg_bits[i22] - 1);
            for (int i24 = 0; i24 < iMkn; i24++) {
                byte b11 = bArr5[i20 + i24];
                if (b11 >= i23 || b11 <= (i19 = -i23) || (b10 = bArr6[i21 + i24]) >= i23 || b10 <= i19) {
                    i23 = -1;
                    break;
                }
            }
            if (i23 >= 0) {
                int iPoly_small_sqnorm = falconKeyGen2.poly_small_sqnorm(bArr5, i20, i22);
                int iPoly_small_sqnorm2 = falconKeyGen2.poly_small_sqnorm(bArr6, i21, i22);
                if ((((-((iPoly_small_sqnorm | iPoly_small_sqnorm2) >>> 31)) | (iPoly_small_sqnorm + iPoly_small_sqnorm2)) & BodyPartID.bodyIdMax) < 16823) {
                    int i25 = iMkn + iMkn;
                    falconKeyGen2.poly_small_to_fp(falconFPRArr, 0, bArr5, i20, i22);
                    int i26 = iMkn;
                    falconKeyGen2.poly_small_to_fp(falconFPRArr, i26, bArr6, i21, i22);
                    falconKeyGen = falconKeyGen2;
                    falconKeyGen.fft.FFT(falconFPRArr, 0, i22);
                    falconKeyGen.fft.FFT(falconFPRArr, i26, i22);
                    falconKeyGen.fft.poly_invnorm2_fft(falconFPRArr, i25, falconFPRArr, 0, falconFPRArr, i26, i15);
                    falconKeyGen.fft.poly_adj_fft(falconFPRArr, 0, i15);
                    falconKeyGen.fft.poly_adj_fft(falconFPRArr, i26, i15);
                    falconKeyGen.fft.poly_mulconst(falconFPRArr, 0, falconKeyGen.fpr.fpr_q, i15);
                    falconKeyGen.fft.poly_mulconst(falconFPRArr, i26, falconKeyGen.fpr.fpr_q, i15);
                    falconKeyGen.fft.poly_mul_autoadj_fft(falconFPRArr, 0, falconFPRArr, i25, i15);
                    i22 = i15;
                    falconKeyGen.fft.poly_mul_autoadj_fft(falconFPRArr, i26, falconFPRArr, i25, i22);
                    i16 = i26;
                    falconKeyGen.fft.iFFT(falconFPRArr, 0, i22);
                    falconKeyGen.fft.iFFT(falconFPRArr, i16, i22);
                    FalconFPR falconFPRFpr_add = falconKeyGen.fpr.fpr_zero;
                    for (int i27 = 0; i27 < i16; i27++) {
                        FPREngine fPREngine = falconKeyGen.fpr;
                        FalconFPR falconFPRFpr_add2 = fPREngine.fpr_add(falconFPRFpr_add, fPREngine.fpr_sqr(falconFPRArr[i27]));
                        FPREngine fPREngine2 = falconKeyGen.fpr;
                        falconFPRFpr_add = fPREngine2.fpr_add(falconFPRFpr_add2, fPREngine2.fpr_sqr(falconFPRArr[i16 + i27]));
                    }
                    FPREngine fPREngine3 = falconKeyGen.fpr;
                    if (fPREngine3.fpr_lt(falconFPRFpr_add, fPREngine3.fpr_bnorm_max)) {
                        short[] sArr4 = new short[i16 * 2];
                        if (sArr3 == null) {
                            sArr2 = sArr4;
                            i17 = 0;
                            i18 = i16;
                        } else {
                            i17 = i14;
                            sArr2 = sArr3;
                            i18 = 0;
                        }
                        short[] sArr5 = sArr2;
                        if (falconKeyGen.vrfy.compute_public(sArr2, i17, bArr, i10, bArr2, i11, i22, sArr4, i18) != 0) {
                            if (falconKeyGen.solve_NTRU(i22, bArr3, i12, bArr4, i13, bArr, i10, bArr2, i11, (1 << (falconKeyGen.codec.max_FG_bits[i22] - 1)) - 1, new int[i22 > 2 ? i16 * 28 : i16 * 84], 0) != 0) {
                                return;
                            }
                        }
                        falconKeyGen2 = this;
                        bArr5 = bArr;
                        i20 = i10;
                        bArr6 = bArr2;
                        i21 = i11;
                        i22 = i15;
                        iMkn = i16;
                        sArr3 = sArr5;
                    } else {
                        bArr5 = bArr;
                        i20 = i10;
                        bArr6 = bArr2;
                        i21 = i11;
                        falconKeyGen2 = falconKeyGen;
                        iMkn = i16;
                    }
                }
            }
            falconKeyGen = falconKeyGen2;
            i16 = iMkn;
            bArr5 = bArr;
            i20 = i10;
            bArr6 = bArr2;
            i21 = i11;
            falconKeyGen2 = falconKeyGen;
            iMkn = i16;
        }
    }

    public void make_fg(int[] iArr, int i10, byte[] bArr, int i11, byte[] bArr2, int i12, int i13, int i14, int i15) {
        int i16;
        int[] iArr2;
        int i17;
        FalconKeyGen falconKeyGen;
        int iMkn = mkn(i13);
        int i18 = i10 + iMkn;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i19 = falconSmallPrimeArr[0].f20341p;
        for (int i20 = 0; i20 < iMkn; i20++) {
            iArr[i10 + i20] = modp_set(bArr[i11 + i20], i19);
            iArr[i18 + i20] = modp_set(bArr2[i12 + i20], i19);
        }
        if (i14 == 0 && i15 != 0) {
            int i21 = falconSmallPrimeArr[0].f20341p;
            int iModp_ninv31 = modp_ninv31(i21);
            int i22 = i18 + iMkn;
            modp_mkgm2(iArr, i22, iArr, iMkn + i22, i13, falconSmallPrimeArr[0].f20340g, i21, iModp_ninv31);
            modp_NTT2(iArr, i10, iArr, i22, i13, i21, iModp_ninv31);
            modp_NTT2(iArr, i18, iArr, i22, i13, i21, iModp_ninv31);
            return;
        }
        int i23 = 0;
        while (i23 < i14) {
            int i24 = i13 - i23;
            int i25 = i23 != 0 ? 1 : 0;
            int i26 = i23 + 1;
            if (i26 < i14 || i15 != 0) {
                i16 = 1;
                iArr2 = iArr;
                i17 = i10;
                falconKeyGen = this;
            } else {
                i16 = 0;
                falconKeyGen = this;
                iArr2 = iArr;
                i17 = i10;
            }
            falconKeyGen.make_fg_step(iArr2, i17, i24, i23, i25, i16);
            i23 = i26;
        }
    }

    public void make_fg_step(int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        FalconKeyGen falconKeyGen;
        int i20;
        int i21;
        int i22;
        int i23;
        FalconKeyGen falconKeyGen2;
        int i24;
        int i25;
        FalconKeyGen falconKeyGen3 = this;
        int[] iArr2 = iArr;
        boolean z10 = true;
        int i26 = 1 << i11;
        int i27 = i26 >> 1;
        int[] iArr3 = falconKeyGen3.MAX_BL_SMALL;
        int i28 = iArr3[i12];
        int i29 = iArr3[i12 + 1];
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i30 = i27 * i29;
        int i31 = i10 + i30;
        int i32 = i31 + i30;
        int i33 = i26 * i28;
        int i34 = i32 + i33;
        int i35 = i34 + i33;
        int i36 = i35 + i26;
        int i37 = i36 + i26;
        System.arraycopy(iArr2, i10, iArr2, i32, i26 * 2 * i28);
        int i38 = 0;
        while (i38 < i28) {
            int i39 = falconSmallPrimeArr[i38].f20341p;
            int iModp_ninv31 = falconKeyGen3.modp_ninv31(i39);
            int iModp_R2 = falconKeyGen3.modp_R2(i39, iModp_ninv31);
            boolean z11 = z10;
            int i40 = i38;
            int i41 = i32;
            int i42 = i35;
            int i43 = i36;
            falconKeyGen3.modp_mkgm2(iArr2, i42, iArr, i43, i11, falconSmallPrimeArr[i38].f20340g, i39, iModp_ninv31);
            int i44 = i41 + i40;
            int i45 = 0;
            int i46 = i44;
            while (i45 < i26) {
                iArr[i37 + i45] = iArr[i46];
                i45++;
                i46 += i28;
            }
            if (i13 == 0) {
                int i47 = i37;
                falconKeyGen = this;
                falconKeyGen.modp_NTT2(iArr, i47, iArr, i42, i11, i39, iModp_ninv31);
                i18 = i47;
                i17 = i43;
                i19 = iModp_ninv31;
                i39 = i39;
            } else {
                i17 = i43;
                i18 = i37;
                i19 = iModp_ninv31;
                falconKeyGen = this;
            }
            int i48 = i10 + i40;
            int i49 = 0;
            int i50 = i48;
            while (i49 < i27) {
                int i51 = i18 + (i49 << 1);
                iArr[i50] = falconKeyGen.modp_montymul(falconKeyGen.modp_montymul(iArr[i51], iArr[i51 + 1], i39, i19), iModp_R2, i39, i19);
                i49++;
                i50 += i29;
            }
            if (i13 != 0) {
                int i52 = i28;
                falconKeyGen.modp_iNTT2_ext(iArr, i44, i52, iArr, i17, i11, i39, i19);
                i20 = i19;
                i21 = i52;
            } else {
                i20 = i19;
                i21 = i28;
            }
            int i53 = i17;
            int i54 = i34 + i40;
            int i55 = 0;
            int i56 = i54;
            while (i55 < i26) {
                iArr[i18 + i55] = iArr[i56];
                i55++;
                i56 += i21;
            }
            if (i13 == 0) {
                int i57 = i39;
                int i58 = i20;
                falconKeyGen2 = this;
                falconKeyGen2.modp_NTT2(iArr, i18, iArr, i42, i11, i57, i58);
                i22 = i21;
                i23 = i58;
                i39 = i57;
            } else {
                i22 = i21;
                i23 = i20;
                falconKeyGen2 = this;
            }
            int i59 = i31 + i40;
            int i60 = 0;
            int i61 = i59;
            while (i60 < i27) {
                int i62 = i18 + (i60 << 1);
                iArr[i61] = falconKeyGen2.modp_montymul(falconKeyGen2.modp_montymul(iArr[i62], iArr[i62 + 1], i39, i23), iModp_R2, i39, i23);
                i60++;
                i61 += i29;
            }
            if (i13 != 0) {
                i24 = i53;
                falconKeyGen2.modp_iNTT2_ext(iArr, i54, i22, iArr, i24, i11, i39, i23);
            } else {
                i24 = i53;
            }
            int i63 = i22;
            if (i14 == 0) {
                int i64 = i11 - 1;
                int i65 = i29;
                modp_iNTT2_ext(iArr, i48, i65, iArr, i24, i64, i39, i23);
                modp_iNTT2_ext(iArr, i59, i65, iArr, i24, i64, i39, i23);
                i25 = i65;
            } else {
                i25 = i29;
            }
            i38 = i40 + 1;
            falconKeyGen3 = this;
            iArr2 = iArr;
            i32 = i41;
            i36 = i24;
            i35 = i42;
            z10 = z11;
            i37 = i18;
            i29 = i25;
            i28 = i63;
        }
        int i66 = i28;
        int i67 = i29;
        int i68 = i37;
        int i69 = i32;
        int i70 = i35;
        int i71 = i36;
        FalconKeyGen falconKeyGen4 = this;
        falconKeyGen4.zint_rebuild_CRT(iArr, i32, i66, i66, i26, falconSmallPrimeArr, 1, iArr, i70);
        falconKeyGen4.zint_rebuild_CRT(iArr, i34, i66, i66, i26, falconSmallPrimeArr, 1, iArr, i70);
        int i72 = i70;
        int i73 = i66;
        while (i73 < i67) {
            int i74 = falconSmallPrimeArr[i73].f20341p;
            int iModp_ninv312 = falconKeyGen4.modp_ninv31(i74);
            int iModp_R22 = falconKeyGen4.modp_R2(i74, iModp_ninv312);
            int iModp_Rx = falconKeyGen4.modp_Rx(i66, i74, iModp_ninv312, iModp_R22);
            int i75 = iModp_R22;
            int i76 = i72;
            int i77 = i71;
            int i78 = i73;
            falconKeyGen4.modp_mkgm2(iArr, i76, iArr, i77, i11, falconSmallPrimeArr[i73].f20340g, i74, iModp_ninv312);
            int i79 = i69;
            int i80 = 0;
            while (i80 < i26) {
                int i81 = i74;
                int i82 = i66;
                int i83 = iModp_Rx;
                int i84 = i75;
                int iZint_mod_small_signed = zint_mod_small_signed(iArr, i79, i82, i81, iModp_ninv312, i84, i83);
                i74 = i81;
                iArr[i68 + i80] = iZint_mod_small_signed;
                i80++;
                i79 += i82;
                i66 = i82;
                iModp_Rx = i83;
                i75 = i84;
            }
            int i85 = iModp_Rx;
            int i86 = i75;
            int i87 = i66;
            FalconKeyGen falconKeyGen5 = this;
            int i88 = i86;
            int i89 = i74;
            falconKeyGen5.modp_NTT2(iArr, i68, iArr, i76, i11, i89, iModp_ninv312);
            int i90 = i89;
            int i91 = i10 + i78;
            int i92 = i91;
            int i93 = 0;
            while (i93 < i27) {
                int i94 = i68 + (i93 << 1);
                iArr[i92] = falconKeyGen5.modp_montymul(falconKeyGen5.modp_montymul(iArr[i94], iArr[i94 + 1], i90, iModp_ninv312), i88, i90, iModp_ninv312);
                i93++;
                i92 += i67;
            }
            int i95 = i34;
            int i96 = 0;
            while (i96 < i26) {
                int i97 = i90;
                int i98 = i88;
                int i99 = i87;
                int i100 = i85;
                int iZint_mod_small_signed2 = falconKeyGen5.zint_mod_small_signed(iArr, i95, i99, i97, iModp_ninv312, i98, i100);
                i90 = i97;
                iArr[i68 + i96] = iZint_mod_small_signed2;
                i96++;
                i95 += i99;
                i88 = i98;
                i87 = i99;
                i85 = i100;
                falconKeyGen5 = this;
            }
            int i101 = i87;
            int i102 = i90;
            modp_NTT2(iArr, i68, iArr, i76, i11, i102, iModp_ninv312);
            int i103 = i31 + i78;
            int i104 = 0;
            int i105 = i103;
            while (i104 < i27) {
                int i106 = i68 + (i104 << 1);
                iArr[i105] = modp_montymul(modp_montymul(iArr[i106], iArr[i106 + 1], i102, iModp_ninv312), i88, i102, iModp_ninv312);
                i104++;
                i105 += i67;
            }
            if (i14 == 0) {
                int i107 = i11 - 1;
                i15 = i67;
                i16 = i77;
                modp_iNTT2_ext(iArr, i91, i15, iArr, i16, i107, i102, iModp_ninv312);
                modp_iNTT2_ext(iArr, i103, i15, iArr, i16, i107, i102, iModp_ninv312);
            } else {
                i15 = i67;
                i16 = i77;
            }
            i73 = i78 + 1;
            falconKeyGen4 = this;
            i67 = i15;
            i71 = i16;
            i72 = i76;
            i66 = i101;
        }
    }

    public int mkgauss(SHAKE256 shake256, int i10) {
        int i11 = 1 << (10 - i10);
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = get_rng_u64(shake256);
            int i14 = (int) (j10 >>> 63);
            int i15 = (int) (((j10 & Long.MAX_VALUE) - this.gauss_1024_12289[0]) >>> 63);
            long j11 = Long.MAX_VALUE & get_rng_u64(shake256);
            int i16 = 1;
            int i17 = 0;
            while (true) {
                long[] jArr = this.gauss_1024_12289;
                if (i16 < jArr.length) {
                    int i18 = ((int) ((j11 - jArr[i16]) >>> 63)) ^ 1;
                    i17 |= (-((i15 ^ 1) & i18)) & i16;
                    i15 |= i18;
                    i16++;
                }
            }
            i12 += ((-i14) ^ i17) + i14;
        }
        return i12;
    }

    public void modp_NTT2(int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13, int i14) {
        modp_NTT2_ext(iArr, i10, 1, iArr2, i11, i12, i13, i14);
    }

    public void modp_NTT2_ext(int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14, int i15) {
        if (i13 == 0) {
            return;
        }
        int iMkn = mkn(i13);
        int i16 = 1;
        int i17 = iMkn;
        while (i16 < iMkn) {
            int i18 = i17 >> 1;
            int i19 = 0;
            int i20 = 0;
            while (i19 < i16) {
                int i21 = iArr2[i12 + i16 + i19];
                int i22 = (i20 * i11) + i10;
                int i23 = (i18 * i11) + i22;
                int i24 = 0;
                while (i24 < i18) {
                    int i25 = iArr[i22];
                    int iModp_montymul = modp_montymul(iArr[i23], i21, i14, i15);
                    iArr[i22] = modp_add(i25, iModp_montymul, i14);
                    iArr[i23] = modp_sub(i25, iModp_montymul, i14);
                    i24++;
                    i22 += i11;
                    i23 += i11;
                }
                i19++;
                i20 += i17;
            }
            i16 <<= 1;
            i17 = i18;
        }
    }

    public int modp_R(int i10) {
        return PKIFailureInfo.systemUnavail - i10;
    }

    public int modp_R2(int i10, int i11) {
        int iModp_R = modp_R(i10);
        int iModp_add = modp_add(iModp_R, iModp_R, i10);
        int iModp_montymul = modp_montymul(iModp_add, iModp_add, i10, i11);
        int iModp_montymul2 = modp_montymul(iModp_montymul, iModp_montymul, i10, i11);
        int iModp_montymul3 = modp_montymul(iModp_montymul2, iModp_montymul2, i10, i11);
        int iModp_montymul4 = modp_montymul(iModp_montymul3, iModp_montymul3, i10, i11);
        int iModp_montymul5 = modp_montymul(iModp_montymul4, iModp_montymul4, i10, i11);
        return (iModp_montymul5 + (i10 & (-(iModp_montymul5 & 1)))) >>> 1;
    }

    public int modp_Rx(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 1;
        int iModp_R = modp_R(i11);
        int i15 = 0;
        while (true) {
            int i16 = 1 << i15;
            if (i16 > i14) {
                return iModp_R;
            }
            if ((i16 & i14) != 0) {
                iModp_R = modp_montymul(iModp_R, i13, i11, i12);
            }
            i13 = modp_montymul(i13, i13, i11, i12);
            i15++;
        }
    }

    public int modp_add(int i10, int i11, int i12) {
        int i13 = (i10 + i11) - i12;
        return i13 + ((-(i13 >>> 31)) & i12);
    }

    public int modp_div(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i12 - 2;
        for (int i16 = 30; i16 >= 0; i16--) {
            int iModp_montymul = modp_montymul(i14, i14, i12, i13);
            i14 = iModp_montymul ^ ((-(1 & (i15 >>> i16))) & (modp_montymul(iModp_montymul, i11, i12, i13) ^ iModp_montymul));
        }
        return modp_montymul(i10, modp_montymul(i14, 1, i12, i13), i12, i13);
    }

    public void modp_iNTT2(int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13, int i14) {
        modp_iNTT2_ext(iArr, i10, 1, iArr2, i11, i12, i13, i14);
    }

    public void modp_iNTT2_ext(int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14, int i15) {
        int i16;
        if (i13 == 0) {
            return;
        }
        int iMkn = mkn(i13);
        int i17 = 1;
        int i18 = iMkn;
        int i19 = 1;
        while (true) {
            i16 = 0;
            if (i18 <= i17) {
                break;
            }
            i18 >>= 1;
            int i20 = i19 << 1;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i18) {
                int i23 = iArr2[i12 + i18 + i21];
                int i24 = (i22 * i11) + i10;
                int i25 = (i19 * i11) + i24;
                int i26 = 0;
                while (i26 < i19) {
                    int i27 = iArr[i24];
                    int i28 = i17;
                    int i29 = iArr[i25];
                    iArr[i24] = modp_add(i27, i29, i14);
                    iArr[i25] = modp_montymul(modp_sub(i27, i29, i14), i23, i14, i15);
                    i26++;
                    i24 += i11;
                    i25 += i11;
                    i17 = i28;
                }
                i21++;
                i22 += i20;
            }
            i19 = i20;
        }
        int i30 = i17 << (31 - i13);
        int i31 = i10;
        while (i16 < iMkn) {
            iArr[i31] = modp_montymul(iArr[i31], i30, i14, i15);
            i16++;
            i31 += i11;
        }
    }

    public void modp_mkgm2(int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13, int i14, int i15) {
        int iMkn = mkn(i12);
        int iModp_R2 = modp_R2(i14, i15);
        int iModp_montymul = modp_montymul(i13, iModp_R2, i14, i15);
        for (int i16 = i12; i16 < 10; i16++) {
            iModp_montymul = modp_montymul(iModp_montymul, iModp_montymul, i14, i15);
        }
        int iModp_div = modp_div(iModp_R2, iModp_montymul, i14, i15, modp_R(i14));
        int i17 = 10 - i12;
        int iModp_R = modp_R(i14);
        int iModp_montymul2 = iModp_R;
        for (int i18 = 0; i18 < iMkn; i18++) {
            short s10 = this.REV10[i18 << i17];
            iArr[i10 + s10] = iModp_R;
            iArr2[i11 + s10] = iModp_montymul2;
            iModp_R = modp_montymul(iModp_R, iModp_montymul, i14, i15);
            iModp_montymul2 = modp_montymul(iModp_montymul2, iModp_div, i14, i15);
        }
    }

    public int modp_montymul(int i10, int i11, int i12, int i13) {
        long unsignedLong = toUnsignedLong(i10) * toUnsignedLong(i11);
        int unsignedLong2 = ((int) (((((i13 * unsignedLong) & toUnsignedLong(Integer.MAX_VALUE)) * i12) + unsignedLong) >>> 31)) - i12;
        return unsignedLong2 + ((-(unsignedLong2 >>> 31)) & i12);
    }

    public int modp_ninv31(int i10) {
        int i11 = 2 - i10;
        int i12 = (2 - (i10 * i11)) * i11;
        int i13 = (2 - (i10 * i12)) * i12;
        int i14 = (2 - (i10 * i13)) * i13;
        return (-((2 - (i10 * i14)) * i14)) & Integer.MAX_VALUE;
    }

    public int modp_norm(int i10, int i11) {
        return i10 - (i11 & (((i10 - ((i11 + 1) >>> 1)) >>> 31) - 1));
    }

    public void modp_poly_rec_res(int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        int i15 = 1 << (i11 - 1);
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = (i16 << 1) + i10;
            iArr[i10 + i16] = modp_montymul(modp_montymul(iArr[i17], iArr[i17 + 1], i12, i13), i14, i12, i13);
        }
    }

    public int modp_set(int i10, int i11) {
        return i10 + (i11 & (-(i10 >>> 31)));
    }

    public int modp_sub(int i10, int i11, int i12) {
        int i13 = i10 - i11;
        return i13 + ((-(i13 >>> 31)) & i12);
    }

    public void poly_big_to_fp(FalconFPR[] falconFPRArr, int i10, int[] iArr, int i11, int i12, int i13, int i14) {
        int iMkn = mkn(i14);
        if (i12 == 0) {
            for (int i15 = 0; i15 < iMkn; i15++) {
                falconFPRArr[i10 + i15] = this.fpr.fpr_zero;
            }
            return;
        }
        int i16 = i11;
        int i17 = 0;
        while (i17 < iMkn) {
            int i18 = -(iArr[(i16 + i12) - 1] >>> 30);
            int i19 = i18 >>> 1;
            int i20 = i18 & 1;
            FPREngine fPREngine = this.fpr;
            FalconFPR falconFPRFpr_add = fPREngine.fpr_zero;
            FalconFPR falconFPRFpr_mul = fPREngine.fpr_one;
            int i21 = 0;
            while (i21 < i12) {
                int i22 = (iArr[i16 + i21] ^ i19) + i20;
                i20 = i22 >>> 31;
                int i23 = i22 & Integer.MAX_VALUE;
                FPREngine fPREngine2 = this.fpr;
                falconFPRFpr_add = fPREngine2.fpr_add(falconFPRFpr_add, fPREngine2.fpr_mul(fPREngine2.fpr_of(i23 - ((i23 << 1) & i18)), falconFPRFpr_mul));
                i21++;
                FPREngine fPREngine3 = this.fpr;
                falconFPRFpr_mul = fPREngine3.fpr_mul(falconFPRFpr_mul, fPREngine3.fpr_ptwo31);
            }
            falconFPRArr[i10 + i17] = falconFPRFpr_add;
            i17++;
            i16 += i13;
        }
    }

    public int poly_big_to_small(byte[] bArr, int i10, int[] iArr, int i11, int i12, int i13) {
        int iMkn = mkn(i13);
        for (int i14 = 0; i14 < iMkn; i14++) {
            int iZint_one_to_plain = zint_one_to_plain(iArr, i11 + i14);
            if (iZint_one_to_plain < (-i12) || iZint_one_to_plain > i12) {
                return 0;
            }
            bArr[i10 + i14] = (byte) iZint_one_to_plain;
        }
        return 1;
    }

    public void poly_small_mkgauss(SHAKE256 shake256, byte[] bArr, int i10, int i11) {
        int iMkgauss;
        int iMkn = mkn(i11);
        int i12 = 0;
        for (int i13 = 0; i13 < iMkn; i13++) {
            while (true) {
                iMkgauss = mkgauss(shake256, i11);
                if (iMkgauss >= -127 && iMkgauss <= 127) {
                    if (i13 != iMkn - 1) {
                        i12 ^= iMkgauss & 1;
                        break;
                    } else if (((iMkgauss & 1) ^ i12) == 0) {
                    }
                }
            }
            bArr[i10 + i13] = (byte) iMkgauss;
        }
    }

    public int poly_small_sqnorm(byte[] bArr, int i10, int i11) {
        int iMkn = mkn(i11);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iMkn; i14++) {
            byte b10 = bArr[i10 + i14];
            i12 += b10 * b10;
            i13 |= i12;
        }
        return (-(i13 >>> 31)) | i12;
    }

    public void poly_small_to_fp(FalconFPR[] falconFPRArr, int i10, byte[] bArr, int i11, int i12) {
        int iMkn = mkn(i12);
        for (int i13 = 0; i13 < iMkn; i13++) {
            falconFPRArr[i10 + i13] = this.fpr.fpr_of(bArr[i11 + i13]);
        }
    }

    public void poly_sub_scaled(int[] iArr, int i10, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int[] iArr3, int i16, int i17, int i18, int i19) {
        int iMkn = mkn(i19);
        for (int i20 = 0; i20 < iMkn; i20++) {
            int i21 = i13;
            int i22 = -iArr3[i16 + i20];
            int i23 = (i20 * i12) + i10;
            for (int i24 = 0; i24 < iMkn; i24++) {
                zint_add_scaled_mul_small(iArr, i23, i11, iArr2, i21, i14, i22, i17, i18);
                if (i20 + i24 == iMkn - 1) {
                    i23 = i10;
                    i22 = -i22;
                } else {
                    i23 += i12;
                }
                i21 += i15;
            }
        }
    }

    public void poly_sub_scaled_ntt(int[] iArr, int i10, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int[] iArr3, int i16, int i17, int i18, int i19, int[] iArr4, int i20) {
        FalconKeyGen falconKeyGen = this;
        int i21 = i14;
        int iMkn = mkn(i19);
        int i22 = i21 + 1;
        int iMkn2 = i20 + mkn(i19);
        int iMkn3 = iMkn2 + mkn(i19);
        int i23 = (iMkn * i22) + iMkn3;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i24 = 0;
        int i25 = 0;
        while (i25 < i22) {
            int i26 = falconSmallPrimeArr[i25].f20341p;
            int iModp_ninv31 = falconKeyGen.modp_ninv31(i26);
            int iModp_R2 = falconKeyGen.modp_R2(i26, iModp_ninv31);
            int iModp_Rx = falconKeyGen.modp_Rx(i21, i26, iModp_ninv31, iModp_R2);
            int i27 = i25;
            falconKeyGen.modp_mkgm2(iArr4, i20, iArr4, iMkn2, i19, falconSmallPrimeArr[i25].f20340g, i26, iModp_ninv31);
            int i28 = iMkn2;
            for (int i29 = 0; i29 < iMkn; i29++) {
                iArr4[i23 + i29] = falconKeyGen.modp_set(iArr3[i16 + i29], i26);
            }
            int i30 = i23;
            falconKeyGen.modp_NTT2(iArr4, i30, iArr4, i20, i19, i26, iModp_ninv31);
            int i31 = i26;
            int i32 = iMkn3 + i27;
            int i33 = i13;
            int i34 = i32;
            int i35 = 0;
            while (i35 < iMkn) {
                int i36 = i31;
                int i37 = iModp_ninv31;
                int i38 = iModp_Rx;
                int iZint_mod_small_signed = zint_mod_small_signed(iArr2, i33, i14, i36, i37, iModp_R2, i38);
                i31 = i36;
                iArr4[i34] = iZint_mod_small_signed;
                i33 += i15;
                i34 += i22;
                iModp_Rx = i38;
                i35++;
                iModp_ninv31 = i37;
            }
            int i39 = i22;
            modp_NTT2_ext(iArr4, i32, i39, iArr4, i20, i19, i31, iModp_ninv31);
            int i40 = 0;
            while (i40 < iMkn) {
                iArr4[i32] = modp_montymul(modp_montymul(iArr4[i30 + i40], iArr4[i32], i31, iModp_ninv31), iModp_R2, i31, iModp_ninv31);
                i40++;
                i32 += i39;
            }
            modp_iNTT2_ext(iArr4, i32, i39, iArr4, i28, i19, i31, iModp_ninv31);
            i25 = i27 + 1;
            falconKeyGen = this;
            i22 = i39;
            i23 = i30;
            iMkn2 = i28;
            i21 = i14;
        }
        int i41 = i22;
        zint_rebuild_CRT(iArr4, iMkn3, i41, i41, iMkn, falconSmallPrimeArr, 1, iArr4, i23);
        int i42 = iMkn3;
        int i43 = i10;
        while (i24 < iMkn) {
            int i44 = i41;
            zint_sub_scaled(iArr, i43, i11, iArr4, i42, i44, i17, i18);
            i41 = i44;
            i24++;
            i43 += i12;
            i42 += i41;
        }
    }

    public int solve_NTRU(int i10, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, byte[] bArr4, int i14, int i15, int[] iArr, int i16) {
        byte[] bArr5;
        int i17;
        FalconKeyGen falconKeyGen;
        int i18;
        byte[] bArr6;
        int i19;
        int i20;
        int[] iArr2;
        int i21;
        int iMkn = mkn(i10);
        if (solve_NTRU_deepest(i10, bArr3, i13, bArr4, i14, iArr, i16) == 0) {
            return 0;
        }
        int i22 = i10;
        if (i22 <= 2) {
            int i23 = i22;
            while (true) {
                int i24 = i23 - 1;
                if (i23 <= 0) {
                    break;
                }
                if (solve_NTRU_intermediate(i22, bArr3, i13, bArr4, i14, i24, iArr, i16) == 0) {
                    return 0;
                }
                i22 = i10;
                i23 = i24;
            }
        } else {
            int i25 = i10;
            while (true) {
                int i26 = i25 - 1;
                if (i25 > 2) {
                    if (solve_NTRU_intermediate(i10, bArr3, i13, bArr4, i14, i26, iArr, i16) == 0) {
                        return 0;
                    }
                    i25 = i26;
                } else if (solve_NTRU_binary_depth1(i10, bArr3, i13, bArr4, i14, iArr, i16) == 0 || solve_NTRU_binary_depth0(i10, bArr3, i13, bArr4, i14, iArr, i16) == 0) {
                    return 0;
                }
            }
        }
        if (bArr2 == null) {
            bArr5 = new byte[iMkn];
            i17 = 0;
            i18 = i10;
            bArr6 = bArr;
            i19 = i11;
            i20 = i15;
            iArr2 = iArr;
            i21 = i16;
            falconKeyGen = this;
        } else {
            bArr5 = bArr2;
            i17 = i12;
            falconKeyGen = this;
            i18 = i10;
            bArr6 = bArr;
            i19 = i11;
            i20 = i15;
            iArr2 = iArr;
            i21 = i16;
        }
        if (falconKeyGen.poly_big_to_small(bArr6, i19, iArr2, i21, i20, i18) != 0) {
            int i27 = i16 + iMkn;
            byte[] bArr7 = bArr5;
            int i28 = i17;
            if (poly_big_to_small(bArr7, i28, iArr, i27, i15, i10) != 0) {
                int i29 = i27 + iMkn;
                int i30 = i29 + iMkn;
                int i31 = i30 + iMkn;
                FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
                int i32 = falconSmallPrimeArr[0].f20341p;
                int iModp_ninv31 = modp_ninv31(i32);
                modp_mkgm2(iArr, i31, iArr, i16, i10, falconSmallPrimeArr[0].f20340g, i32, iModp_ninv31);
                for (int i33 = 0; i33 < iMkn; i33++) {
                    iArr[i16 + i33] = modp_set(bArr7[i28 + i33], i32);
                }
                for (int i34 = 0; i34 < iMkn; i34++) {
                    iArr[i27 + i34] = modp_set(bArr3[i13 + i34], i32);
                    iArr[i29 + i34] = modp_set(bArr4[i14 + i34], i32);
                    iArr[i30 + i34] = modp_set(bArr[i11 + i34], i32);
                }
                modp_NTT2(iArr, i27, iArr, i31, i10, i32, iModp_ninv31);
                modp_NTT2(iArr, i29, iArr, i31, i10, i32, iModp_ninv31);
                modp_NTT2(iArr, i30, iArr, i31, i10, i32, iModp_ninv31);
                modp_NTT2(iArr, i16, iArr, i31, i10, i32, iModp_ninv31);
                int iModp_montymul = modp_montymul(12289, 1, i32, iModp_ninv31);
                for (int i35 = 0; i35 < iMkn; i35++) {
                    if (modp_sub(modp_montymul(iArr[i27 + i35], iArr[i16 + i35], i32, iModp_ninv31), modp_montymul(iArr[i29 + i35], iArr[i30 + i35], i32, iModp_ninv31), i32) != iModp_montymul) {
                        return 0;
                    }
                }
                return 1;
            }
        }
        return 0;
    }

    public int solve_NTRU_binary_depth0(int i10, byte[] bArr, int i11, byte[] bArr2, int i12, int[] iArr, int i13) {
        int i14 = 1;
        int i15 = 1 << i10;
        int i16 = i15 >> 1;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i17 = 0;
        int i18 = falconSmallPrimeArr[0].f20341p;
        int iModp_ninv31 = modp_ninv31(i18);
        int iModp_R2 = modp_R2(i18, iModp_ninv31);
        int i19 = i13 + i16;
        int i20 = i19 + i16;
        int i21 = i20 + i15;
        int i22 = i21 + i15;
        int i23 = i22 + i15;
        modp_mkgm2(iArr, i22, iArr, i23, i10, falconSmallPrimeArr[0].f20340g, i18, iModp_ninv31);
        for (int i24 = 0; i24 < i16; i24++) {
            int i25 = i13 + i24;
            iArr[i25] = modp_set(zint_one_to_plain(iArr, i25), i18);
            int i26 = i19 + i24;
            iArr[i26] = modp_set(zint_one_to_plain(iArr, i26), i18);
        }
        int i27 = i10 - 1;
        modp_NTT2(iArr, i13, iArr, i22, i27, i18, iModp_ninv31);
        modp_NTT2(iArr, i19, iArr, i22, i27, i18, iModp_ninv31);
        for (int i28 = 0; i28 < i15; i28++) {
            iArr[i20 + i28] = modp_set(bArr[i11 + i28], i18);
            iArr[i21 + i28] = modp_set(bArr2[i12 + i28], i18);
        }
        modp_NTT2(iArr, i20, iArr, i22, i10, i18, iModp_ninv31);
        modp_NTT2(iArr, i21, iArr, i22, i10, i18, iModp_ninv31);
        int i29 = 0;
        while (i29 < i15) {
            int i30 = i20 + i29;
            int i31 = iArr[i30];
            int i32 = i30 + 1;
            int i33 = iArr[i32];
            int i34 = i21 + i29;
            int i35 = i14;
            int i36 = iArr[i34];
            int i37 = i34 + 1;
            int i38 = i17;
            int i39 = iArr[i37];
            int i40 = i29 >> 1;
            int i41 = i29;
            int iModp_montymul = modp_montymul(iArr[i13 + i40], iModp_R2, i18, iModp_ninv31);
            int iModp_montymul2 = modp_montymul(iArr[i19 + i40], iModp_R2, i18, iModp_ninv31);
            iArr[i30] = modp_montymul(i39, iModp_montymul, i18, iModp_ninv31);
            iArr[i32] = modp_montymul(i36, iModp_montymul, i18, iModp_ninv31);
            iArr[i34] = modp_montymul(i33, iModp_montymul2, i18, iModp_ninv31);
            iArr[i37] = modp_montymul(i31, iModp_montymul2, i18, iModp_ninv31);
            i29 = i41 + 2;
            i14 = i35;
            i17 = i38;
        }
        int i42 = i14;
        int i43 = i17;
        modp_iNTT2(iArr, i20, iArr, i23, i10, i18, iModp_ninv31);
        modp_iNTT2(iArr, i21, iArr, i23, i10, i18, iModp_ninv31);
        int i44 = i13 + i15;
        int i45 = i44 + i15;
        System.arraycopy(iArr, i20, iArr, i13, i15 * 2);
        int i46 = i45 + i15;
        int i47 = i46 + i15;
        int i48 = i47 + i15;
        int i49 = i48 + i15;
        modp_mkgm2(iArr, i45, iArr, i46, i10, FalconSmallPrimeList.PRIMES[i43].f20340g, i18, iModp_ninv31);
        modp_NTT2(iArr, i13, iArr, i45, i10, i18, iModp_ninv31);
        modp_NTT2(iArr, i44, iArr, i45, i10, i18, iModp_ninv31);
        int iModp_set = modp_set(bArr[i11], i18);
        iArr[i49] = iModp_set;
        iArr[i48] = iModp_set;
        for (int i50 = i42; i50 < i15; i50++) {
            int i51 = i11 + i50;
            iArr[i48 + i50] = modp_set(bArr[i51], i18);
            iArr[(i49 + i15) - i50] = modp_set(-bArr[i51], i18);
        }
        modp_NTT2(iArr, i48, iArr, i45, i10, i18, iModp_ninv31);
        modp_NTT2(iArr, i49, iArr, i45, i10, i18, iModp_ninv31);
        for (int i52 = i43; i52 < i15; i52++) {
            int iModp_montymul3 = modp_montymul(iArr[i49 + i52], iModp_R2, i18, iModp_ninv31);
            iArr[i46 + i52] = modp_montymul(iModp_montymul3, iArr[i13 + i52], i18, iModp_ninv31);
            iArr[i47 + i52] = modp_montymul(iModp_montymul3, iArr[i48 + i52], i18, iModp_ninv31);
        }
        int iModp_set2 = modp_set(bArr2[i12], i18);
        iArr[i49] = iModp_set2;
        iArr[i48] = iModp_set2;
        for (int i53 = i42; i53 < i15; i53++) {
            int i54 = i12 + i53;
            iArr[i48 + i53] = modp_set(bArr2[i54], i18);
            iArr[(i49 + i15) - i53] = modp_set(-bArr2[i54], i18);
        }
        modp_NTT2(iArr, i48, iArr, i45, i10, i18, iModp_ninv31);
        modp_NTT2(iArr, i49, iArr, i45, i10, i18, iModp_ninv31);
        for (int i55 = i43; i55 < i15; i55++) {
            int iModp_montymul4 = modp_montymul(iArr[i49 + i55], iModp_R2, i18, iModp_ninv31);
            int i56 = i46 + i55;
            iArr[i56] = modp_add(iArr[i56], modp_montymul(iModp_montymul4, iArr[i44 + i55], i18, iModp_ninv31), i18);
            int i57 = i47 + i55;
            iArr[i57] = modp_add(iArr[i57], modp_montymul(iModp_montymul4, iArr[i48 + i55], i18, iModp_ninv31), i18);
        }
        int i58 = iModp_ninv31;
        modp_mkgm2(iArr, i45, iArr, i48, i10, FalconSmallPrimeList.PRIMES[i43].f20340g, i18, i58);
        modp_iNTT2(iArr, i46, iArr, i48, i10, i18, i58);
        modp_iNTT2(iArr, i47, iArr, i48, i10, i18, i58);
        for (int i59 = i43; i59 < i15; i59++) {
            int i60 = i46 + i59;
            iArr[i45 + i59] = modp_norm(iArr[i60], i18);
            iArr[i60] = modp_norm(iArr[i47 + i59], i18);
        }
        FalconFPR[] falconFPRArr = new FalconFPR[i15 * 3];
        int i61 = i15 + i15;
        for (int i62 = i43; i62 < i15; i62++) {
            falconFPRArr[i61 + i62] = this.fpr.fpr_of(iArr[i46 + i62]);
        }
        this.fft.FFT(falconFPRArr, i61, i10);
        System.arraycopy(falconFPRArr, i61, falconFPRArr, i15, i16);
        int i63 = i15 + i16;
        int i64 = i43;
        while (i64 < i15) {
            falconFPRArr[i63 + i64] = this.fpr.fpr_of(iArr[i45 + i64]);
            i64++;
            i44 = i44;
            i58 = i58;
        }
        int i65 = i58;
        int i66 = i44;
        this.fft.FFT(falconFPRArr, i63, i10);
        this.fft.poly_div_autoadj_fft(falconFPRArr, i63, falconFPRArr, i15, i10);
        this.fft.iFFT(falconFPRArr, i63, i10);
        for (int i67 = i43; i67 < i15; i67++) {
            iArr[i45 + i67] = modp_set((int) this.fpr.fpr_rint(falconFPRArr[i63 + i67]), i18);
        }
        modp_mkgm2(iArr, i46, iArr, i47, i10, FalconSmallPrimeList.PRIMES[i43].f20340g, i18, i65);
        for (int i68 = i43; i68 < i15; i68++) {
            iArr[i48 + i68] = modp_set(bArr[i11 + i68], i18);
            iArr[i49 + i68] = modp_set(bArr2[i12 + i68], i18);
        }
        modp_NTT2(iArr, i45, iArr, i46, i10, i18, i65);
        modp_NTT2(iArr, i48, iArr, i46, i10, i18, i65);
        modp_NTT2(iArr, i49, iArr, i46, i10, i18, i65);
        for (int i69 = i43; i69 < i15; i69++) {
            int iModp_montymul5 = modp_montymul(iArr[i45 + i69], iModp_R2, i18, i65);
            int i70 = i13 + i69;
            iArr[i70] = modp_sub(iArr[i70], modp_montymul(iModp_montymul5, iArr[i48 + i69], i18, i65), i18);
            int i71 = i66 + i69;
            iArr[i71] = modp_sub(iArr[i71], modp_montymul(iModp_montymul5, iArr[i49 + i69], i18, i65), i18);
        }
        modp_iNTT2(iArr, i13, iArr, i47, i10, i18, i65);
        modp_iNTT2(iArr, i66, iArr, i47, i10, i18, i65);
        for (int i72 = i43; i72 < i15; i72++) {
            int i73 = i13 + i72;
            iArr[i73] = modp_norm(iArr[i73], i18);
            int i74 = i66 + i72;
            iArr[i74] = modp_norm(iArr[i74], i18);
        }
        return i42;
    }

    public int solve_NTRU_binary_depth1(int i10, byte[] bArr, int i11, byte[] bArr2, int i12, int[] iArr, int i13) {
        int i14;
        FalconKeyGen falconKeyGen = this;
        int i15 = 1;
        int i16 = 1 << i10;
        int i17 = i10 - 1;
        int i18 = 1 << i17;
        int i19 = i18 >> 1;
        int[] iArr2 = falconKeyGen.MAX_BL_SMALL;
        int i20 = iArr2[1];
        int i21 = iArr2[2];
        int i22 = falconKeyGen.MAX_BL_LARGE[1];
        int i23 = i21 * i19;
        int i24 = i13 + i23;
        int i25 = i24 + i23;
        int i26 = i22 * i18;
        int i27 = i25 + i26;
        int i28 = 0;
        int i29 = 0;
        while (i29 < i22) {
            int i30 = FalconSmallPrimeList.PRIMES[i29].f20341p;
            int i31 = i28;
            int iModp_ninv31 = falconKeyGen.modp_ninv31(i30);
            int i32 = i29;
            int iModp_R2 = falconKeyGen.modp_R2(i30, iModp_ninv31);
            int i33 = i27;
            int iModp_Rx = falconKeyGen.modp_Rx(i21, i30, iModp_ninv31, iModp_R2);
            int i34 = i25 + i32;
            int i35 = i33 + i32;
            int i36 = i26;
            int i37 = i13;
            int i38 = i15;
            int i39 = i24;
            int i40 = i31;
            while (i40 < i19) {
                int i41 = i37;
                iArr[i34] = falconKeyGen.zint_mod_small_signed(iArr, i37, i21, i30, iModp_ninv31, iModp_R2, iModp_Rx);
                falconKeyGen = this;
                int i42 = i39;
                iArr[i35] = falconKeyGen.zint_mod_small_signed(iArr, i42, i21, i30, iModp_ninv31, iModp_R2, iModp_Rx);
                i34 += i22;
                i35 += i22;
                i39 = i42 + i21;
                i37 = i41 + i21;
                i33 = i33;
                i19 = i19;
                i32 = i32;
                i25 = i25;
                i40++;
                i36 = i36;
                i20 = i20;
            }
            i29 = i32 + 1;
            i25 = i25;
            i27 = i33;
            i26 = i36;
            i20 = i20;
            i19 = i19;
            i15 = i38;
            i28 = 0;
        }
        int i43 = i15;
        int i44 = i19;
        int i45 = i20;
        int i46 = i25;
        int i47 = i26;
        int[] iArr3 = iArr;
        System.arraycopy(iArr3, i46, iArr3, i13, i47);
        int i48 = i13 + i47;
        System.arraycopy(iArr3, i27, iArr3, i48, i47);
        int i49 = i48 + i47;
        int i50 = i45 * i18;
        int i51 = i49 + i50;
        int i52 = i51 + i50;
        int i53 = 0;
        while (i53 < i22) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i54 = falconSmallPrimeArr[i53].f20341p;
            int iModp_ninv312 = falconKeyGen.modp_ninv31(i54);
            int iModp_R22 = falconKeyGen.modp_R2(i54, iModp_ninv312);
            int i55 = i53;
            int i56 = i52;
            int i57 = i56 + i16;
            int i58 = i57 + i18;
            int i59 = i58 + i16;
            int i60 = i22;
            falconKeyGen.modp_mkgm2(iArr3, i56, iArr, i57, i10, falconSmallPrimeArr[i55].f20340g, i54, iModp_ninv312);
            int i61 = i54;
            for (int i62 = 0; i62 < i16; i62++) {
                iArr[i58 + i62] = falconKeyGen.modp_set(bArr[i11 + i62], i61);
                iArr[i59 + i62] = falconKeyGen.modp_set(bArr2[i12 + i62], i61);
            }
            falconKeyGen.modp_NTT2(iArr, i58, iArr, i56, i10, i61, iModp_ninv312);
            modp_NTT2(iArr, i59, iArr, i56, i10, i61, iModp_ninv312);
            int i63 = i56;
            int i64 = i10;
            while (i64 > i17) {
                int i65 = i61;
                int i66 = iModp_R22;
                int i67 = i58;
                modp_poly_rec_res(iArr, i67, i64, i65, iModp_ninv312, i66);
                modp_poly_rec_res(iArr, i59, i64, i65, iModp_ninv312, i66);
                i61 = i65;
                i64--;
                i58 = i67;
                i63 = i63;
                iModp_R22 = i66;
            }
            int i68 = iModp_R22;
            int i69 = i63;
            int i70 = i69 + i18;
            System.arraycopy(iArr, i57, iArr, i70, i18);
            int i71 = i70 + i18;
            System.arraycopy(iArr, i58, iArr, i71, i18);
            int i72 = i71 + i18;
            System.arraycopy(iArr, i59, iArr, i72, i18);
            int i73 = i72 + i18;
            int i74 = i73 + i44;
            int i75 = i13 + i55;
            int i76 = i48 + i55;
            int i77 = i44;
            int i78 = i48;
            int i79 = i75;
            int i80 = i76;
            int i81 = 0;
            while (i81 < i77) {
                iArr[i73 + i81] = iArr[i79];
                iArr[i74 + i81] = iArr[i80];
                i81++;
                i79 += i60;
                i80 += i60;
            }
            int i82 = i10 - 2;
            modp_NTT2(iArr, i73, iArr, i69, i82, i61, iModp_ninv312);
            int i83 = i74;
            modp_NTT2(iArr, i83, iArr, i69, i82, i61, iModp_ninv312);
            int i84 = i75;
            int i85 = i76;
            int i86 = 0;
            while (i86 < i77) {
                int i87 = i86 << 1;
                int i88 = i71 + i87;
                int i89 = i84;
                int i90 = iArr[i88];
                int i91 = i83;
                int i92 = iArr[i88 + 1];
                int i93 = i72 + i87;
                int i94 = i85;
                int i95 = iArr[i93];
                int i96 = iArr[i93 + 1];
                int i97 = i86;
                int iModp_montymul = modp_montymul(iArr[i73 + i86], i68, i61, iModp_ninv312);
                int i98 = i16;
                int iModp_montymul2 = modp_montymul(iArr[i91 + i97], i68, i61, iModp_ninv312);
                iArr[i89] = modp_montymul(i96, iModp_montymul, i61, iModp_ninv312);
                iArr[i89 + i60] = modp_montymul(i95, iModp_montymul, i61, iModp_ninv312);
                iArr[i94] = modp_montymul(i92, iModp_montymul2, i61, iModp_ninv312);
                iArr[i94 + i60] = modp_montymul(i90, iModp_montymul2, i61, iModp_ninv312);
                i86 = i97 + 1;
                int i99 = i60 << 1;
                i85 = i94 + i99;
                i84 = i89 + i99;
                i83 = i91;
                i16 = i98;
            }
            int i100 = i16;
            int i101 = i61;
            int i102 = i17;
            modp_iNTT2_ext(iArr, i75, i60, iArr, i70, i102, i101, iModp_ninv312);
            modp_iNTT2_ext(iArr, i76, i60, iArr, i70, i102, i101, iModp_ninv312);
            int i103 = i45;
            if (i55 < i103) {
                modp_iNTT2(iArr, i71, iArr, i70, i102, i101, iModp_ninv312);
                modp_iNTT2(iArr, i72, iArr, i70, i102, i101, iModp_ninv312);
                i14 = i102;
                int i104 = i49 + i55;
                int i105 = i51 + i55;
                int i106 = 0;
                while (i106 < i18) {
                    iArr[i104] = iArr[i71 + i106];
                    iArr[i105] = iArr[i72 + i106];
                    i106++;
                    i104 += i103;
                    i105 += i103;
                }
            } else {
                i14 = i102;
            }
            i53 = i55 + 1;
            i44 = i77;
            i48 = i78;
            falconKeyGen = this;
            iArr3 = iArr;
            i45 = i103;
            i52 = i69;
            i22 = i60;
            i17 = i14;
            i16 = i100;
        }
        int i107 = i52;
        int i108 = i22;
        int i109 = i17;
        int i110 = i45;
        int i111 = i18 << 1;
        FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
        zint_rebuild_CRT(iArr, i13, i108, i108, i111, falconSmallPrimeArr2, 1, iArr, i107);
        zint_rebuild_CRT(iArr, i49, i110, i110, i111, falconSmallPrimeArr2, 1, iArr, i107);
        FalconFPR[] falconFPRArr = new FalconFPR[i18];
        FalconFPR[] falconFPRArr2 = new FalconFPR[i18];
        poly_big_to_fp(falconFPRArr, 0, iArr, i13, i108, i108, i109);
        poly_big_to_fp(falconFPRArr2, 0, iArr, i48, i108, i108, i109);
        System.arraycopy(iArr, i49, iArr, i13, i110 * 2 * i18);
        FalconFPR[] falconFPRArr3 = new FalconFPR[i18];
        FalconFPR[] falconFPRArr4 = new FalconFPR[i18];
        poly_big_to_fp(falconFPRArr3, 0, iArr, i13, i110, i110, i109);
        poly_big_to_fp(falconFPRArr4, 0, iArr, i13 + i50, i110, i110, i109);
        this.fft.FFT(falconFPRArr, 0, i109);
        this.fft.FFT(falconFPRArr2, 0, i109);
        this.fft.FFT(falconFPRArr3, 0, i109);
        this.fft.FFT(falconFPRArr4, 0, i109);
        FalconFPR[] falconFPRArr5 = new FalconFPR[i18];
        FalconFPR[] falconFPRArr6 = new FalconFPR[i44];
        this.fft.poly_add_muladj_fft(falconFPRArr5, 0, falconFPRArr, 0, falconFPRArr2, 0, falconFPRArr3, 0, falconFPRArr4, 0, i109);
        this.fft.poly_invnorm2_fft(falconFPRArr6, 0, falconFPRArr3, 0, falconFPRArr4, 0, i109);
        this.fft.poly_mul_autoadj_fft(falconFPRArr5, 0, falconFPRArr6, 0, i109);
        this.fft.iFFT(falconFPRArr5, 0, i109);
        for (int i112 = 0; i112 < i18; i112++) {
            FalconFPR falconFPR = falconFPRArr5[i112];
            FPREngine fPREngine = this.fpr;
            if (!fPREngine.fpr_lt(falconFPR, fPREngine.fpr_ptwo63m1)) {
                return 0;
            }
            FPREngine fPREngine2 = this.fpr;
            if (!fPREngine2.fpr_lt(fPREngine2.fpr_mtwo63m1, falconFPR)) {
                return 0;
            }
            FPREngine fPREngine3 = this.fpr;
            falconFPRArr5[i112] = fPREngine3.fpr_of(fPREngine3.fpr_rint(falconFPR));
        }
        this.fft.FFT(falconFPRArr5, 0, i109);
        this.fft.poly_mul_fft(falconFPRArr3, 0, falconFPRArr5, 0, i109);
        this.fft.poly_mul_fft(falconFPRArr4, 0, falconFPRArr5, 0, i109);
        this.fft.poly_sub(falconFPRArr, 0, falconFPRArr3, 0, i109);
        this.fft.poly_sub(falconFPRArr2, 0, falconFPRArr4, 0, i109);
        this.fft.iFFT(falconFPRArr, 0, i109);
        this.fft.iFFT(falconFPRArr2, 0, i109);
        int i113 = i13 + i18;
        for (int i114 = 0; i114 < i18; i114++) {
            iArr[i13 + i114] = (int) this.fpr.fpr_rint(falconFPRArr[i114]);
            iArr[i113 + i114] = (int) this.fpr.fpr_rint(falconFPRArr2[i114]);
        }
        return i43;
    }

    public int solve_NTRU_deepest(int i10, byte[] bArr, int i11, byte[] bArr2, int i12, int[] iArr, int i13) {
        int i14 = this.MAX_BL_SMALL[i10];
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i15 = i13 + i14;
        int i16 = i15 + i14;
        int i17 = i16 + i14;
        int i18 = i17 + i14;
        make_fg(iArr, i16, bArr, i11, bArr2, i12, i10, i10, 0);
        zint_rebuild_CRT(iArr, i16, i14, i14, 2, falconSmallPrimeArr, 0, iArr, i18);
        return (zint_bezout(iArr, i15, iArr, i13, iArr, i16, iArr, i17, i14, iArr, i18) != 0 && zint_mul_small(iArr, i13, i14, 12289) == 0 && zint_mul_small(iArr, i15, i14, 12289) == 0) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int solve_NTRU_intermediate(int i10, byte[] bArr, int i11, byte[] bArr2, int i12, int i13, int[] iArr, int i14) {
        FalconFPR falconFPRFpr_sqr;
        int i15;
        int i16;
        int i17;
        int i18;
        FalconFPR[] falconFPRArr;
        int i19;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        FalconSmallPrime[] falconSmallPrimeArr;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        FalconKeyGen falconKeyGen = this;
        int i41 = i10 - i13;
        int i42 = 1 << i41;
        int i43 = i42 >> 1;
        int[] iArr3 = falconKeyGen.MAX_BL_SMALL;
        int i44 = iArr3[i13];
        int i45 = iArr3[i13 + 1];
        int i46 = falconKeyGen.MAX_BL_LARGE[i13];
        FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
        int i47 = i45 * i43;
        int i48 = i14 + i47 + i47;
        int[] iArr4 = iArr;
        int i49 = i42;
        int i50 = i46;
        falconKeyGen.make_fg(iArr4, i48, bArr, i11, bArr2, i12, i10, i13, 1);
        int i51 = i49 * i50;
        int i52 = i14 + i51;
        int i53 = i52 + i51;
        System.arraycopy(iArr4, i48, iArr4, i53, i49 * 2 * i44);
        int i54 = i44 * i49;
        int i55 = i53 + i54;
        int i56 = i55 + i54;
        System.arraycopy(iArr4, i14, iArr4, i56, i43 * 2 * i45);
        int i57 = i56 + i47;
        int i58 = 0;
        int i59 = 0;
        while (i59 < i50) {
            int i60 = falconSmallPrimeArr2[i59].f20341p;
            int iModp_ninv31 = falconKeyGen.modp_ninv31(i60);
            int iModp_R2 = falconKeyGen.modp_R2(i60, iModp_ninv31);
            int iModp_Rx = falconKeyGen.modp_Rx(i45, i60, iModp_ninv31, iModp_R2);
            int i61 = i14 + i59;
            int i62 = i52 + i59;
            int i63 = i58;
            int i64 = i53;
            int i65 = i57;
            int i66 = i63;
            int i67 = i56;
            while (true) {
                i38 = i63;
                i39 = i59;
                i40 = i45;
                if (i66 < i43) {
                    int i68 = i67;
                    iArr[i61] = falconKeyGen.zint_mod_small_signed(iArr4, i67, i40, i60, iModp_ninv31, iModp_R2, iModp_Rx);
                    falconKeyGen = this;
                    int i69 = i65;
                    iArr[i62] = falconKeyGen.zint_mod_small_signed(iArr, i69, i40, i60, iModp_ninv31, iModp_R2, iModp_Rx);
                    i66++;
                    int i70 = i68 + i40;
                    i65 = i69 + i40;
                    i61 += i50;
                    i62 += i50;
                    i45 = i40;
                    i59 = i39;
                    i63 = i38;
                    i67 = i70;
                    iArr4 = iArr;
                }
            }
            i53 = i64;
            i58 = i38;
            i45 = i40;
            i59 = i39 + 1;
            iArr4 = iArr;
        }
        int i71 = i53;
        int i72 = i58;
        while (i72 < i50) {
            int i73 = falconSmallPrimeArr2[i72].f20341p;
            int iModp_ninv312 = falconKeyGen.modp_ninv31(i73);
            int iModp_R22 = falconKeyGen.modp_R2(i73, iModp_ninv312);
            if (i72 == i44) {
                i24 = i72;
                i25 = iModp_ninv312;
                i26 = iModp_R22;
                i28 = i44;
                FalconSmallPrime[] falconSmallPrimeArr3 = falconSmallPrimeArr2;
                int i74 = i49;
                i31 = i73;
                int i75 = i71;
                falconKeyGen.zint_rebuild_CRT(iArr, i75, i28, i44, i74, falconSmallPrimeArr3, 1, iArr, i56);
                i30 = i75;
                zint_rebuild_CRT(iArr, i55, i28, i28, i74, falconSmallPrimeArr3, 1, iArr, i56);
                falconSmallPrimeArr = falconSmallPrimeArr3;
                i27 = i56;
                i29 = i74;
            } else {
                i24 = i72;
                i25 = iModp_ninv312;
                i26 = iModp_R22;
                i27 = i56;
                i28 = i44;
                falconSmallPrimeArr = falconSmallPrimeArr2;
                i29 = i49;
                i30 = i71;
                i31 = i73;
            }
            int i76 = i27 + i29;
            int i77 = i76 + i29;
            int i78 = i77 + i29;
            int i79 = i27;
            int i80 = i41;
            int i81 = i25;
            int i82 = i28;
            int i83 = i31;
            modp_mkgm2(iArr, i79, iArr, i76, i80, falconSmallPrimeArr[i24].f20340g, i83, i81);
            if (i24 < i82) {
                int i84 = i30 + i24;
                int i85 = i55 + i24;
                int i86 = i84;
                int i87 = i85;
                int i88 = 0;
                while (i88 < i29) {
                    iArr[i77 + i88] = iArr[i86];
                    iArr[i78 + i88] = iArr[i87];
                    i88++;
                    i86 += i82;
                    i87 += i82;
                }
                modp_iNTT2_ext(iArr, i84, i82, iArr, i76, i80, i83, i81);
                modp_iNTT2_ext(iArr, i85, i82, iArr, i76, i80, i83, i81);
                i32 = i76;
                i37 = i81;
                i33 = i79;
                i34 = i77;
                i35 = i78;
                i36 = i80;
            } else {
                FalconKeyGen falconKeyGen2 = this;
                i32 = i76;
                int i89 = i83;
                int iModp_Rx2 = falconKeyGen2.modp_Rx(i82, i89, i81, i26);
                int i90 = i30;
                int i91 = i55;
                int i92 = 0;
                while (i92 < i29) {
                    int i93 = i89;
                    int i94 = i81;
                    int i95 = i26;
                    int i96 = i92;
                    int iZint_mod_small_signed = falconKeyGen2.zint_mod_small_signed(iArr, i90, i82, i93, i94, i95, iModp_Rx2);
                    int i97 = i90;
                    int i98 = iModp_Rx2;
                    iArr[i77 + i92] = iZint_mod_small_signed;
                    int i99 = i91;
                    iArr[i78 + i96] = zint_mod_small_signed(iArr, i99, i82, i93, i94, i95, i98);
                    i92 = i96 + 1;
                    i91 = i99 + i82;
                    i90 = i97 + i82;
                    i81 = i94;
                    i26 = i95;
                    i89 = i93;
                    iModp_Rx2 = i98;
                    falconKeyGen2 = this;
                }
                int i100 = i89;
                int i101 = i81;
                i33 = i79;
                i82 = i82;
                modp_NTT2(iArr, i77, iArr, i33, i80, i100, i101);
                i34 = i77;
                modp_NTT2(iArr, i78, iArr, i33, i80, i100, i101);
                i35 = i78;
                i36 = i80;
                i37 = i101;
                i83 = i100;
            }
            int i102 = i35 + i29;
            int i103 = i102 + i43;
            int i104 = i14 + i24;
            int i105 = i52 + i24;
            int i106 = i104;
            int i107 = i105;
            int i108 = 0;
            while (i108 < i43) {
                iArr[i102 + i108] = iArr[i106];
                iArr[i103 + i108] = iArr[i107];
                i108++;
                i106 += i50;
                i107 += i50;
            }
            int i109 = i83;
            int i110 = i37;
            int i111 = i36 - 1;
            modp_NTT2(iArr, i102, iArr, i33, i111, i109, i110);
            int i112 = i103;
            modp_NTT2(iArr, i112, iArr, i33, i111, i109, i110);
            int i113 = i29;
            i56 = i33;
            int i114 = i104;
            int i115 = i105;
            int i116 = 0;
            while (i116 < i43) {
                int i117 = i116 << 1;
                int i118 = i34 + i117;
                int i119 = i116;
                int i120 = iArr[i118];
                int i121 = i112;
                int i122 = iArr[i118 + 1];
                int i123 = i35 + i117;
                int i124 = i114;
                int i125 = iArr[i123];
                int i126 = iArr[i123 + 1];
                int i127 = i115;
                int iModp_montymul = modp_montymul(iArr[i102 + i119], i26, i109, i110);
                int i128 = i36;
                int iModp_montymul2 = modp_montymul(iArr[i121 + i119], i26, i109, i110);
                iArr[i124] = modp_montymul(i126, iModp_montymul, i109, i110);
                iArr[i124 + i50] = modp_montymul(i125, iModp_montymul, i109, i110);
                iArr[i127] = modp_montymul(i122, iModp_montymul2, i109, i110);
                iArr[i127 + i50] = modp_montymul(i120, iModp_montymul2, i109, i110);
                i116 = i119 + 1;
                int i129 = i50 << 1;
                i114 = i124 + i129;
                i115 = i127 + i129;
                i112 = i121;
                i36 = i128;
            }
            int i130 = i36;
            int i131 = i32;
            modp_iNTT2_ext(iArr, i104, i50, iArr, i131, i130, i109, i110);
            falconKeyGen = this;
            falconKeyGen.modp_iNTT2_ext(iArr, i105, i50, iArr, i131, i130, i109, i110);
            i72 = i24 + 1;
            i44 = i82;
            i71 = i30;
            falconSmallPrimeArr2 = falconSmallPrimeArr;
            i49 = i113;
            i41 = i130;
        }
        int i132 = i41;
        int i133 = i44;
        FalconSmallPrime[] falconSmallPrimeArr4 = falconSmallPrimeArr2;
        int i134 = i49;
        int i135 = i71;
        int i136 = i13;
        zint_rebuild_CRT(iArr, i14, i50, i50, i134, falconSmallPrimeArr4, 1, iArr, i56);
        zint_rebuild_CRT(iArr, i52, i50, i50, i134, falconSmallPrimeArr4, 1, iArr, i56);
        int i137 = i52;
        int i138 = i134;
        FalconFPR[] falconFPRArr2 = new FalconFPR[i138];
        FalconFPR[] falconFPRArr3 = new FalconFPR[i138];
        FalconFPR[] falconFPRArr4 = new FalconFPR[i138];
        FalconFPR[] falconFPRArr5 = new FalconFPR[i43];
        FalconFPR[] falconFPRArr6 = new FalconFPR[i138];
        int i139 = i56;
        int[] iArr5 = new int[i138];
        int i140 = i133 > 10 ? 10 : i133;
        int i141 = (i135 + i133) - i140;
        FalconFPR[] falconFPRArr7 = falconFPRArr2;
        poly_big_to_fp(falconFPRArr3, 0, iArr, i141, i140, i133, i132);
        int i142 = i140;
        poly_big_to_fp(falconFPRArr4, 0, iArr, (i55 + i133) - i142, i142, i133, i132);
        int i143 = i133;
        int i144 = (i143 - i142) * 31;
        int i145 = this.bitlength_avg[i136];
        int i146 = this.bitlength_std[i136];
        int i147 = i145 - (i146 * 6);
        int i148 = (i146 * 6) + i145;
        this.fft.FFT(falconFPRArr3, 0, i132);
        this.fft.FFT(falconFPRArr4, 0, i132);
        FalconKeyGen falconKeyGen3 = this;
        this.fft.poly_invnorm2_fft(falconFPRArr5, 0, falconFPRArr3, 0, falconFPRArr4, 0, i132);
        FalconFPR[] falconFPRArr8 = falconFPRArr3;
        FalconFPR[] falconFPRArr9 = falconFPRArr4;
        int i149 = i132;
        falconKeyGen3.fft.poly_adj_fft(falconFPRArr8, 0, i149);
        falconKeyGen3.fft.poly_adj_fft(falconFPRArr9, 0, i149);
        int i150 = i50 * 31;
        int i151 = i150 - i147;
        int i152 = i50;
        int i153 = 10;
        while (true) {
            int i154 = i149;
            int i155 = i152 > i153 ? i153 : i152;
            int i156 = i153;
            FalconKeyGen falconKeyGen4 = falconKeyGen3;
            FalconFPR[] falconFPRArr10 = falconFPRArr8;
            int i157 = i50;
            FalconFPR[] falconFPRArr11 = falconFPRArr9;
            FalconFPR[] falconFPRArr12 = falconFPRArr6;
            int i158 = i150;
            falconKeyGen4.poly_big_to_fp(falconFPRArr12, 0, iArr, (i14 + i152) - i155, i155, i157, i154);
            int i159 = i155;
            FalconFPR[] falconFPRArr13 = falconFPRArr7;
            poly_big_to_fp(falconFPRArr13, 0, iArr, (i137 + i152) - i159, i159, i157, i154);
            this.fft.FFT(falconFPRArr12, 0, i154);
            this.fft.FFT(falconFPRArr13, 0, i154);
            this.fft.poly_mul_fft(falconFPRArr12, 0, falconFPRArr10, 0, i154);
            this.fft.poly_mul_fft(falconFPRArr13, 0, falconFPRArr11, 0, i154);
            this.fft.poly_add(falconFPRArr13, 0, falconFPRArr12, 0, i154);
            this.fft.poly_mul_autoadj_fft(falconFPRArr13, 0, falconFPRArr5, 0, i154);
            this.fft.iFFT(falconFPRArr13, 0, i154);
            int i160 = (i151 - ((i152 - i155) * 31)) + i144;
            if (i160 < 0) {
                i160 = -i160;
                falconFPRFpr_sqr = this.fpr.fpr_two;
            } else {
                falconFPRFpr_sqr = this.fpr.fpr_onehalf;
            }
            FalconFPR falconFPRFpr_mul = this.fpr.fpr_one;
            while (i160 != 0) {
                if ((i160 & 1) != 0) {
                    falconFPRFpr_mul = this.fpr.fpr_mul(falconFPRFpr_mul, falconFPRFpr_sqr);
                }
                i160 >>= 1;
                falconFPRFpr_sqr = this.fpr.fpr_sqr(falconFPRFpr_sqr);
            }
            for (int i161 = 0; i161 < i138; i161++) {
                FalconFPR falconFPRFpr_mul2 = this.fpr.fpr_mul(falconFPRArr13[i161], falconFPRFpr_mul);
                FPREngine fPREngine = this.fpr;
                if (!fPREngine.fpr_lt(fPREngine.fpr_mtwo31m1, falconFPRFpr_mul2)) {
                    return 0;
                }
                FPREngine fPREngine2 = this.fpr;
                if (!fPREngine2.fpr_lt(falconFPRFpr_mul2, fPREngine2.fpr_ptwo31m1)) {
                    return 0;
                }
                iArr5[i161] = (int) this.fpr.fpr_rint(falconFPRFpr_mul2);
            }
            int i162 = i151 / 31;
            int i163 = i152;
            int i164 = i151 % 31;
            if (i136 <= 4) {
                falconFPRArr = falconFPRArr13;
                int i165 = i135;
                i18 = i156;
                i15 = i157;
                int i166 = i143;
                i16 = i138;
                poly_sub_scaled_ntt(iArr, i14, i163, i15, iArr, i165, i166, i143, iArr5, 0, i162, i164, i154, iArr, i139);
                i17 = i165;
                i19 = i154;
                i20 = i137;
                iArr5 = iArr5;
                i21 = i166;
                i22 = i163;
                iArr2 = iArr;
                poly_sub_scaled_ntt(iArr2, i20, i22, i15, iArr, i55, i21, i166, iArr5, 0, i162, i164, i19, iArr, i139);
            } else {
                i15 = i157;
                i16 = i138;
                int i167 = i143;
                i17 = i135;
                i18 = i156;
                falconFPRArr = falconFPRArr13;
                poly_sub_scaled(iArr, i14, i163, i15, iArr, i17, i167, i167, iArr5, 0, i162, i164, i154);
                i19 = i154;
                i20 = i137;
                i21 = i167;
                i22 = i163;
                iArr2 = iArr;
                poly_sub_scaled(iArr2, i20, i22, i15, iArr, i55, i21, i167, iArr5, 0, i162, i164, i19);
            }
            int i168 = i22;
            int i169 = i21;
            i149 = i19;
            int i170 = i151 + i148;
            int i171 = i170 + 10;
            if (i171 < i158) {
                if (i168 * 31 >= i170 + 41) {
                    i152 = i168 - 1;
                }
                if (i151 > 0) {
                    if (i152 < i169) {
                        int i172 = i14;
                        int i173 = i20;
                        int i174 = 0;
                        i23 = i16;
                        while (i174 < i23) {
                            int i175 = (-(iArr2[(i172 + i152) - 1] >>> 30)) >>> 1;
                            for (int i176 = i152; i176 < i169; i176++) {
                                iArr2[i172 + i176] = i175;
                            }
                            int i177 = (-(iArr2[(i173 + i152) - 1] >>> 30)) >>> 1;
                            for (int i178 = i152; i178 < i169; i178++) {
                                iArr2[i173 + i178] = i177;
                            }
                            i174++;
                            i172 += i15;
                            i173 += i15;
                        }
                    } else {
                        i23 = i16;
                    }
                    int i179 = i14;
                    int i180 = i179;
                    int i181 = 0;
                    while (i181 < (i23 << 1)) {
                        System.arraycopy(iArr2, i179, iArr2, i180, i169);
                        i181++;
                        i180 += i169;
                        i179 += i15;
                    }
                    return 1;
                }
                i138 = i16;
                int i182 = i151 - 25;
                i151 = i182 < 0 ? 0 : i182;
                falconKeyGen3 = this;
                i136 = i13;
                i137 = i20;
                i50 = i15;
                falconFPRArr7 = falconFPRArr;
                i153 = i18;
                i135 = i17;
                falconFPRArr8 = falconFPRArr10;
                falconFPRArr9 = falconFPRArr11;
                falconFPRArr6 = falconFPRArr12;
                i143 = i169;
                i150 = i171;
            } else {
                i171 = i158;
            }
            i152 = i168;
            if (i151 > 0) {
            }
        }
    }

    public void zint_add_mul_small(int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13) {
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i10 + i15;
            long unsignedLong = (toUnsignedLong(iArr2[i11 + i15]) * toUnsignedLong(i13)) + toUnsignedLong(iArr[i16]) + toUnsignedLong(i14);
            iArr[i16] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i14 = (int) (unsignedLong >>> 31);
        }
        iArr[i10 + i12] = i14;
    }

    public void zint_add_scaled_mul_small(int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14, int i15, int i16) {
        if (i13 == 0) {
            return;
        }
        int i17 = (-(iArr2[(i12 + i13) - 1] >>> 30)) >>> 1;
        int i18 = 0;
        int i19 = i15;
        int i20 = 0;
        while (i19 < i11) {
            int i21 = i19 - i15;
            int i22 = i21 < i13 ? iArr2[i12 + i21] : i17;
            int i23 = i10 + i19;
            long unsignedLong = (toUnsignedLong(i18 | ((i22 << i16) & Integer.MAX_VALUE)) * i14) + toUnsignedLong(iArr[i23]) + i20;
            iArr[i23] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i20 = (int) (unsignedLong >>> 31);
            i19++;
            i18 = i22 >>> (31 - i16);
        }
    }

    public int zint_bezout(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12, int[] iArr4, int i13, int i14, int[] iArr5, int i15) {
        FalconKeyGen falconKeyGen = this;
        int i16 = i14;
        int[] iArr6 = iArr5;
        if (i16 == 0) {
            return 0;
        }
        int i17 = i15 + i16;
        int i18 = i17 + i16;
        int i19 = i18 + i16;
        int iModp_ninv31 = falconKeyGen.modp_ninv31(iArr3[i12]);
        int iModp_ninv312 = falconKeyGen.modp_ninv31(iArr4[i13]);
        System.arraycopy(iArr3, i12, iArr6, i18, i16);
        System.arraycopy(iArr4, i13, iArr6, i19, i16);
        iArr[i10] = 1;
        iArr2[i11] = 0;
        for (int i20 = 1; i20 < i16; i20++) {
            iArr[i10 + i20] = 0;
            iArr2[i11 + i20] = 0;
        }
        System.arraycopy(iArr4, i13, iArr6, i15, i16);
        System.arraycopy(iArr3, i12, iArr6, i17, i16);
        iArr6[i17] = iArr6[i17] - 1;
        int i21 = 30;
        int i22 = (i16 * 62) + 30;
        while (i22 >= i21) {
            int i23 = -1;
            int i24 = i16;
            int i25 = -1;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (true) {
                int i30 = i24 - 1;
                if (i24 <= 0) {
                    break;
                }
                int i31 = iArr6[i18 + i30];
                int i32 = iArr6[i19 + i30];
                i27 ^= (i27 ^ i31) & i25;
                i26 ^= (i26 ^ i31) & i23;
                i29 ^= (i29 ^ i32) & i25;
                i28 ^= (i28 ^ i32) & i23;
                int i33 = ((((i31 | i32) + Integer.MAX_VALUE) >>> 31) - 1) & i25;
                int i34 = i25;
                i25 = i33;
                i23 = i34;
                i24 = i30;
            }
            int i35 = ~i23;
            int i36 = i27 & i35;
            long unsignedLong = (falconKeyGen.toUnsignedLong(i36) << 31) + falconKeyGen.toUnsignedLong(i26 | (i27 & i23));
            long unsignedLong2 = (falconKeyGen.toUnsignedLong(i29 & i35) << 31) + falconKeyGen.toUnsignedLong(i28 | (i29 & i23));
            int i37 = iArr6[i18];
            int i38 = iArr6[i19];
            long j10 = 0;
            int i39 = i18;
            int i40 = 0;
            long j11 = 0;
            long j12 = 1;
            long j13 = 1;
            for (int i41 = 31; i40 < i41; i41 = 31) {
                long j14 = unsignedLong2 - unsignedLong;
                int i42 = i40;
                int i43 = (int) ((j14 ^ ((unsignedLong ^ unsignedLong2) & (unsignedLong ^ j14))) >>> 63);
                int i44 = (i37 >> i42) & 1;
                int i45 = i44 & (i38 >> i42) & 1;
                int i46 = i45 & i43;
                int i47 = i45 & (~i43);
                int i48 = i46 | (i44 ^ 1);
                int i49 = i37 - ((-i46) & i38);
                long j15 = unsignedLong - ((-falconKeyGen.toUnsignedLong(i46)) & unsignedLong2);
                long j16 = -i46;
                long j17 = j12 - (j11 & j16);
                long j18 = j10 - (j13 & j16);
                int i50 = i38 - ((-i47) & i49);
                long j19 = unsignedLong2 - (j15 & (-falconKeyGen.toUnsignedLong(i47)));
                long j20 = -i47;
                long j21 = j11 - (j17 & j20);
                long j22 = j13 - (j18 & j20);
                i37 = i49 + ((i48 - 1) & i49);
                long j23 = i48;
                long j24 = j23 - 1;
                j12 = j17 + (j17 & j24);
                j10 = j18 + (j18 & j24);
                unsignedLong = j15 ^ ((j15 ^ (j15 >> 1)) & (-falconKeyGen.toUnsignedLong(i48)));
                i38 = i50 + ((-i48) & i50);
                long j25 = -j23;
                j11 = j21 + (j21 & j25);
                j13 = j22 + (j22 & j25);
                unsignedLong2 = j19 ^ (((j19 >> 1) ^ j19) & (falconKeyGen.toUnsignedLong(i48) - 1));
                i40 = i42 + 1;
                i17 = i17;
            }
            int i51 = i17;
            int i52 = i19;
            long j26 = j10;
            long j27 = j11;
            long j28 = j13;
            int iZint_co_reduce = falconKeyGen.zint_co_reduce(iArr5, i39, iArr5, i52, i14, j12, j26, j27, j28);
            long j29 = -(iZint_co_reduce & 1);
            long j30 = j12 - ((j12 + j12) & j29);
            long j31 = j26 - ((j26 + j26) & j29);
            long j32 = -(iZint_co_reduce >>> 1);
            long j33 = j27 - ((j27 + j27) & j32);
            long j34 = j28 - ((j28 + j28) & j32);
            falconKeyGen = this;
            iArr6 = iArr5;
            int i53 = iModp_ninv312;
            i16 = i14;
            falconKeyGen.zint_co_reduce_mod(iArr, i10, iArr6, i15, iArr4, i13, i16, i53, j30, j31, j33, j34);
            int i54 = iModp_ninv31;
            falconKeyGen.zint_co_reduce_mod(iArr2, i11, iArr6, i51, iArr3, i12, i16, i54, j30, j31, j33, j34);
            i22 -= 30;
            iModp_ninv312 = i53;
            i21 = 30;
            i18 = i39;
            i17 = i51;
            iModp_ninv31 = i54;
            i19 = i52;
        }
        int i55 = i18;
        int i56 = iArr5[i55] ^ 1;
        for (int i57 = 1; i57 < i16; i57++) {
            i56 |= iArr5[i55 + i57];
        }
        return (1 - ((i56 | (-i56)) >>> 31)) & iArr3[i12] & iArr4[i13];
    }

    public int zint_co_reduce(int[] iArr, int i10, int[] iArr2, int i11, int i12, long j10, long j11, long j12, long j13) {
        long j14 = 0;
        int i13 = 0;
        long j15 = 0;
        while (i13 < i12) {
            int i14 = i10 + i13;
            int i15 = i11 + i13;
            long j16 = iArr[i14];
            long j17 = iArr2[i15];
            long jA = a.a(j17, j11, j16 * j10, j15);
            int i16 = i13;
            long jA2 = a.a(j17, j13, j16 * j12, j14);
            if (i16 > 0) {
                iArr[i14 - 1] = ((int) jA) & Integer.MAX_VALUE;
                iArr2[i15 - 1] = ((int) jA2) & Integer.MAX_VALUE;
            }
            j14 = jA2 >> 31;
            i13 = i16 + 1;
            j15 = jA >> 31;
        }
        long j18 = j14;
        long j19 = j15;
        iArr[(i10 + i12) - 1] = (int) j19;
        iArr2[(i11 + i12) - 1] = (int) j18;
        int i17 = (int) (j19 >>> 63);
        int i18 = (int) (j18 >>> 63);
        zint_negate(iArr, i10, i12, i17);
        zint_negate(iArr2, i11, i12, i18);
        return (i18 << 1) | i17;
    }

    public void zint_co_reduce_mod(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12, int i13, int i14, long j10, long j11, long j12, long j13) {
        FalconKeyGen falconKeyGen = this;
        int i15 = iArr[i10];
        int i16 = iArr2[i11];
        int i17 = Integer.MAX_VALUE;
        int iA = m0.a(i16, (int) j11, ((int) j10) * i15, i14) & Integer.MAX_VALUE;
        int iA2 = m0.a(i16, (int) j13, i15 * ((int) j12), i14) & Integer.MAX_VALUE;
        int i18 = 0;
        long j14 = 0;
        long j15 = 0;
        while (i18 < i13) {
            int i19 = i10 + i18;
            int i20 = i11 + i18;
            int i21 = i17;
            long j16 = iArr[i19];
            long j17 = j16 * j10;
            long j18 = iArr2[i20];
            long jA = a.a(iArr3[r14], falconKeyGen.toUnsignedLong(iA), (j18 * j11) + j17, j14);
            long jA2 = a.a(iArr3[i12 + i18], falconKeyGen.toUnsignedLong(iA2), (j18 * j13) + (j16 * j12), j15);
            if (i18 > 0) {
                iArr[i19 - 1] = ((int) jA) & i21;
                iArr2[i20 - 1] = ((int) jA2) & i21;
            }
            j14 = jA >> 31;
            j15 = jA2 >> 31;
            i18++;
            falconKeyGen = this;
            i17 = i21;
        }
        long j19 = j14;
        long j20 = j15;
        iArr[(i10 + i13) - 1] = (int) j19;
        iArr2[(i11 + i13) - 1] = (int) j20;
        zint_finish_mod(iArr, i10, i13, iArr3, i12, (int) (j19 >>> 63));
        zint_finish_mod(iArr2, i11, i13, iArr3, i12, (int) (j20 >>> 63));
    }

    public void zint_finish_mod(int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13) {
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = ((iArr[i10 + i15] - iArr2[i12 + i15]) - i14) >>> 31;
        }
        int i16 = (-i13) >>> 1;
        int i17 = -((1 - i14) | i13);
        for (int i18 = 0; i18 < i11; i18++) {
            int i19 = i10 + i18;
            int i20 = (iArr[i19] - ((iArr2[i12 + i18] ^ i16) & i17)) - i13;
            iArr[i19] = Integer.MAX_VALUE & i20;
            i13 = i20 >>> 31;
        }
    }

    public int zint_mod_small_signed(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i11 == 0) {
            return 0;
        }
        return modp_sub(zint_mod_small_unsigned(iArr, i10, i11, i12, i13, i14), (-(iArr[(i10 + i11) - 1] >>> 30)) & i15, i12);
    }

    public int zint_mod_small_unsigned(int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        int iModp_add = 0;
        while (true) {
            int i15 = i11 - 1;
            if (i11 <= 0) {
                return iModp_add;
            }
            int iModp_montymul = modp_montymul(iModp_add, i14, i12, i13);
            int i16 = iArr[i10 + i15] - i12;
            iModp_add = modp_add(iModp_montymul, i16 + ((-(i16 >>> 31)) & i12), i12);
            i11 = i15;
        }
    }

    public int zint_mul_small(int[] iArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i10 + i14;
            long unsignedLong = (toUnsignedLong(iArr[i15]) * toUnsignedLong(i12)) + i13;
            iArr[i15] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i13 = (int) (unsignedLong >> 31);
        }
        return i13;
    }

    public void zint_negate(int[] iArr, int i10, int i11, int i12) {
        int i13 = (-i12) >>> 1;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i10 + i14;
            int i16 = (iArr[i15] ^ i13) + i12;
            iArr[i15] = Integer.MAX_VALUE & i16;
            i12 = i16 >>> 31;
        }
    }

    public void zint_norm_zero(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        int i13 = 0;
        int i14 = i12;
        int i15 = 0;
        while (true) {
            int i16 = i14 - 1;
            if (i14 <= 0) {
                zint_sub(iArr, i10, iArr2, i11, i12, i13 >>> 31);
                return;
            }
            int i17 = iArr[i10 + i16];
            int i18 = iArr2[i11 + i16];
            int i19 = ((i15 << 30) | (i18 >>> 1)) - i17;
            i13 |= ((-(i19 >>> 31)) | ((-i19) >>> 31)) & ((i13 & 1) - 1);
            i14 = i16;
            i15 = i18 & 1;
        }
    }

    public int zint_one_to_plain(int[] iArr, int i10) {
        int i11 = iArr[i10];
        return i11 | ((1073741824 & i11) << 1);
    }

    public void zint_rebuild_CRT(int[] iArr, int i10, int i11, int i12, int i13, FalconSmallPrime[] falconSmallPrimeArr, int i14, int[] iArr2, int i15) {
        FalconKeyGen falconKeyGen = this;
        int i16 = 0;
        iArr2[i15] = falconSmallPrimeArr[0].f20341p;
        int i17 = 1;
        int i18 = i11;
        while (true) {
            int i19 = i17;
            if (i19 >= i18) {
                break;
            }
            FalconSmallPrime falconSmallPrime = falconSmallPrimeArr[i19];
            int i20 = falconSmallPrime.f20341p;
            int i21 = falconSmallPrime.f20342s;
            int iModp_ninv31 = falconKeyGen.modp_ninv31(i20);
            int iModp_R2 = falconKeyGen.modp_R2(i20, iModp_ninv31);
            int i22 = i10;
            int i23 = 0;
            while (i23 < i13) {
                int i24 = i20;
                int i25 = iModp_ninv31;
                int i26 = iModp_R2;
                int iModp_montymul = falconKeyGen.modp_montymul(i21, falconKeyGen.modp_sub(iArr[i22 + i19], falconKeyGen.zint_mod_small_unsigned(iArr, i22, i19, i20, iModp_ninv31, iModp_R2), i24), i24, i25);
                int i27 = i19;
                falconKeyGen.zint_add_mul_small(iArr, i22, iArr2, i15, i27, iModp_montymul);
                i23++;
                i22 += i12;
                i19 = i27;
                i20 = i24;
                iModp_ninv31 = i25;
                iModp_R2 = i26;
            }
            int i28 = i19;
            iArr2[i15 + i28] = falconKeyGen.zint_mul_small(iArr2, i15, i28, i20);
            i17 = i28 + 1;
        }
        int[] iArr3 = iArr2;
        int i29 = i15;
        if (i14 != 0) {
            int i30 = i10;
            while (i16 < i13) {
                falconKeyGen.zint_norm_zero(iArr, i30, iArr3, i29, i18);
                i16++;
                i30 += i12;
                falconKeyGen = this;
                i18 = i11;
                iArr3 = iArr2;
                i29 = i15;
            }
        }
    }

    public int zint_sub(int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13) {
        int i14 = -i13;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = i10 + i16;
            int i18 = iArr[i17];
            int i19 = (i18 - iArr2[i11 + i16]) - i15;
            i15 = i19 >>> 31;
            iArr[i17] = i18 ^ (((i19 & Integer.MAX_VALUE) ^ i18) & i14);
        }
        return i15;
    }

    public void zint_sub_scaled(int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14, int i15) {
        if (i13 == 0) {
            return;
        }
        int i16 = (-(iArr2[(i12 + i13) - 1] >>> 30)) >>> 1;
        int i17 = 0;
        int i18 = i14;
        int i19 = 0;
        while (i18 < i11) {
            int i20 = i18 - i14;
            int i21 = i20 < i13 ? iArr2[i20 + i12] : i16;
            int i22 = i10 + i18;
            int i23 = (iArr[i22] - (i17 | ((i21 << i15) & Integer.MAX_VALUE))) - i19;
            iArr[i22] = i23 & Integer.MAX_VALUE;
            i19 = i23 >>> 31;
            i18++;
            i17 = i21 >>> (31 - i15);
        }
    }
}
