package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;

    /* renamed from: gf, reason: collision with root package name */
    private GF f20319gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i10, int i11, int i12, int[] iArr, boolean z10, int i13) {
        BENES benes13;
        this.usePivots = z10;
        this.SYS_N = i11;
        this.SYS_T = i12;
        this.GFBITS = i10;
        this.poly = iArr;
        this.defaultKeySize = i13;
        this.IRR_BYTES = i12 * 2;
        this.COND_BYTES = ((i10 * 2) - 1) * (1 << (i10 - 4));
        int i14 = i12 * i10;
        this.PK_NROWS = i14;
        int i15 = i11 - i14;
        this.PK_NCOLS = i15;
        this.PK_ROW_BYTES = (i15 + 7) / 8;
        this.SYND_BYTES = (i14 + 7) / 8;
        this.GFMASK = (1 << i10) - 1;
        if (i10 == 12) {
            this.f20319gf = new GF12();
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.f20319gf = new GF13();
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private void bm(short[] sArr, short[] sArr2) {
        int i10;
        int i11 = this.SYS_T;
        short[] sArr3 = new short[i11 + 1];
        short[] sArr4 = new short[i11 + 1];
        short s10 = 1;
        short[] sArr5 = new short[i11 + 1];
        int i12 = 0;
        for (int i13 = 0; i13 < this.SYS_T + 1; i13++) {
            sArr5[i13] = 0;
            sArr4[i13] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s11 = 1;
        short s12 = 0;
        short s13 = 0;
        while (s12 < this.SYS_T * 2) {
            int iGf_mul_ext = 0;
            for (int i14 = 0; i14 <= min(s12, this.SYS_T); i14++) {
                iGf_mul_ext ^= this.f20319gf.gf_mul_ext(sArr4[i14], sArr2[s12 - i14]);
            }
            short sGf_reduce = this.f20319gf.gf_reduce(iGf_mul_ext);
            short s14 = (short) (((short) (((short) (((short) (sGf_reduce - 1)) >> 15)) & s10)) - s10);
            short s15 = (short) (((short) (((short) (((short) (((short) (s12 - (s13 * 2))) >> 15)) & s10)) - s10)) & s14);
            for (int i15 = 0; i15 <= this.SYS_T; i15++) {
                sArr3[i15] = sArr4[i15];
            }
            short sGf_frac = this.f20319gf.gf_frac(s11, sGf_reduce);
            int i16 = 0;
            while (true) {
                i10 = this.SYS_T;
                if (i16 > i10) {
                    break;
                }
                sArr4[i16] = (short) ((this.f20319gf.gf_mul(sGf_frac, sArr5[i16]) & s14) ^ sArr4[i16]);
                i16++;
            }
            int i17 = ~s15;
            int i18 = s12 + 1;
            s13 = (short) (((i18 - s13) & s15) | (s13 & i17));
            for (int i19 = i10 - 1; i19 >= 0; i19--) {
                sArr5[i19 + 1] = (short) ((sArr5[i19] & i17) | (sArr3[i19] & s15));
            }
            sArr5[0] = 0;
            s11 = (short) ((i17 & s11) | (sGf_reduce & s15));
            s12 = (short) i18;
            s10 = 1;
        }
        while (true) {
            int i20 = this.SYS_T;
            if (i12 > i20) {
                return;
            }
            sArr[i12] = sArr4[i20 - i12];
            i12++;
        }
    }

    public static void cbrecursion(byte[] bArr, long j10, long j11, short[] sArr, int i10, long j12, long j13, int[] iArr) {
        long j14;
        int i11;
        int i12;
        int i13;
        char c10;
        long j15;
        long j16;
        long j17;
        long j18 = j13;
        long j19 = 1;
        long j20 = 7;
        char c11 = 3;
        if (j12 == 1) {
            int i14 = (int) (j10 >> 3);
            bArr[i14] = (byte) ((get_q_short(iArr, i10) << ((int) (j10 & 7))) ^ bArr[i14]);
            return;
        }
        if (sArr != null) {
            long j21 = 0;
            while (j21 < j18) {
                int i15 = (int) j21;
                long j22 = j19;
                iArr[i15] = sArr[(int) (j21 ^ j22)] | ((sArr[i15] ^ 1) << 16);
                j21 += j22;
                j19 = j22;
            }
            j14 = j19;
        } else {
            j14 = 1;
            long j23 = 0;
            while (j23 < j18) {
                long j24 = i10;
                iArr[(int) j23] = ((get_q_short(iArr, (int) (j24 + j23)) ^ 1) << 16) | get_q_short(iArr, (int) (j24 + (j23 ^ 1)));
                j23++;
                j20 = j20;
            }
        }
        long j25 = j20;
        int i16 = (int) j18;
        sort32(iArr, 0, i16);
        long j26 = 0;
        while (true) {
            i11 = 65535;
            if (j26 >= j18) {
                break;
            }
            int i17 = (int) j26;
            int i18 = 65535 & iArr[i17];
            if (j26 >= i18) {
                i17 = i18;
            }
            iArr[(int) (j18 + j26)] = i17 | (i18 << 16);
            j26 += j14;
        }
        for (long j27 = 0; j27 < j18; j27 += j14) {
            iArr[(int) j27] = (int) ((iArr[r7] << 16) | j27);
        }
        sort32(iArr, 0, i16);
        long j28 = 0;
        while (j28 < j18) {
            int i19 = (int) j28;
            iArr[i19] = (iArr[i19] << 16) + (iArr[(int) (j18 + j28)] >> 16);
            j28 += j14;
            c11 = c11;
        }
        char c12 = c11;
        sort32(iArr, 0, i16);
        if (j12 <= 10) {
            for (long j29 = 0; j29 < j18; j29 += j14) {
                int i20 = (int) (j18 + j29);
                iArr[i20] = ((iArr[(int) j29] & 65535) << 10) | (iArr[i20] & 1023);
            }
            long j30 = j14;
            while (j30 < j12 - j14) {
                long j31 = 0;
                while (j31 < j18) {
                    iArr[(int) j31] = (int) (((iArr[(int) (j18 + j31)] & (-1024)) << 6) | j31);
                    j31 += j14;
                    j30 = j30;
                }
                long j32 = j30;
                sort32(iArr, 0, i16);
                for (long j33 = 0; j33 < j18; j33 += j14) {
                    int i21 = (int) j33;
                    iArr[i21] = (iArr[i21] << 20) | iArr[(int) (j18 + j33)];
                }
                sort32(iArr, 0, i16);
                for (long j34 = 0; j34 < j18; j34 += j14) {
                    int i22 = iArr[(int) j34];
                    int i23 = 1048575 & i22;
                    int i24 = (int) (j18 + j34);
                    int i25 = (i22 & 1047552) | (iArr[i24] & 1023);
                    if (i23 >= i25) {
                        i23 = i25;
                    }
                    iArr[i24] = i23;
                }
                j30 = j32 + j14;
            }
            for (long j35 = 0; j35 < j18; j35 += j14) {
                int i26 = (int) (j18 + j35);
                iArr[i26] = iArr[i26] & 1023;
            }
            i12 = 65535;
            i13 = -65536;
            c10 = c12;
            j15 = j14;
        } else {
            int i27 = -65536;
            for (long j36 = 0; j36 < j18; j36 += j14) {
                int i28 = (int) (j18 + j36);
                iArr[i28] = (iArr[(int) j36] << 16) | (iArr[i28] & 65535);
            }
            long j37 = j14;
            while (j37 < j12 - j14) {
                long j38 = 0;
                while (j38 < j18) {
                    iArr[(int) j38] = (int) ((iArr[(int) (j18 + j38)] & r23) | j38);
                    j38 += j14;
                    i11 = i11;
                    i27 = i27;
                }
                int i29 = i11;
                int i30 = i27;
                sort32(iArr, 0, i16);
                long j39 = 0;
                while (j39 < j18) {
                    int i31 = (int) j39;
                    long j40 = j14;
                    iArr[i31] = (iArr[i31] << 16) | (iArr[(int) (j18 + j39)] & i29);
                    j39 += j40;
                    c12 = c12;
                    j14 = j40;
                }
                char c13 = c12;
                long j41 = j14;
                if (j37 < j12 - 2) {
                    for (long j42 = 0; j42 < j18; j42 += j41) {
                        int i32 = (int) (j18 + j42);
                        iArr[i32] = (iArr[(int) j42] & i30) | (iArr[i32] >> 16);
                    }
                    sort32(iArr, i16, (int) (j18 * 2));
                    for (long j43 = 0; j43 < j18; j43 += j41) {
                        int i33 = (int) (j18 + j43);
                        iArr[i33] = (iArr[i33] << 16) | (iArr[(int) j43] & i29);
                    }
                }
                sort32(iArr, 0, i16);
                for (long j44 = 0; j44 < j18; j44 += j41) {
                    int i34 = (int) (j18 + j44);
                    int i35 = iArr[i34];
                    int i36 = (i35 & i30) | (iArr[(int) j44] & i29);
                    if (i36 < i35) {
                        iArr[i34] = i36;
                    }
                }
                j37 += j41;
                i11 = i29;
                c12 = c13;
                i27 = i30;
                j14 = j41;
            }
            i12 = i11;
            i13 = i27;
            c10 = c12;
            j15 = j14;
            for (long j45 = 0; j45 < j18; j45 += j15) {
                int i37 = (int) (j18 + j45);
                iArr[i37] = iArr[i37] & i12;
            }
        }
        long j46 = 0;
        if (sArr != null) {
            while (j46 < j18) {
                iArr[(int) j46] = (int) ((sArr[r0] << 16) + j46);
                j46 += j15;
            }
        } else {
            while (j46 < j18) {
                iArr[(int) j46] = (int) ((get_q_short(iArr, (int) (i10 + j46)) << 16) + j46);
                j46 += j15;
            }
        }
        sort32(iArr, 0, i16);
        long j47 = j10;
        int i38 = i12;
        long j48 = 0;
        while (true) {
            j16 = j18 / 2;
            if (j48 >= j16) {
                break;
            }
            long j49 = j48 * 2;
            long j50 = j18 + j49;
            int i39 = (int) j50;
            int i40 = i38;
            int i41 = iArr[i39] & 1;
            char c14 = c10;
            int i42 = (int) (i41 + j49);
            long j51 = j47;
            int i43 = (int) (j51 >> c14);
            bArr[i43] = (byte) ((i41 << ((int) (j51 & j25))) ^ bArr[i43]);
            j47 = j51 + j11;
            iArr[i39] = (iArr[(int) j49] << 16) | i42;
            iArr[(int) (j50 + j15)] = (iArr[(int) (j49 + j15)] << 16) | (i42 ^ 1);
            j48 += j15;
            i38 = i40;
            j18 = j13;
            c10 = c14;
        }
        int i44 = i38;
        char c15 = c10;
        long j52 = j13 * 2;
        sort32(iArr, i16, (int) j52);
        long j53 = j12 * 2;
        long j54 = ((j53 - 3) * j11 * j16) + j47;
        long j55 = 0;
        while (true) {
            j17 = j52;
            if (j55 >= j16) {
                break;
            }
            long j56 = j55 * 2;
            long j57 = j53;
            long j58 = j13 + j56;
            int i45 = iArr[(int) j58];
            int i46 = i45 & 1;
            int i47 = (int) (i46 + j56);
            int i48 = i47 ^ 1;
            int i49 = (int) (j54 >> c15);
            bArr[i49] = (byte) (bArr[i49] ^ (i46 << ((int) (j54 & j25))));
            j54 += j11;
            iArr[(int) j56] = (i45 & i44) | (i47 << 16);
            iArr[(int) (j56 + j15)] = (i48 << 16) | (iArr[(int) (j58 + j15)] & i44);
            j55 += j15;
            j52 = j17;
            j53 = j57;
        }
        sort32(iArr, 0, i16);
        long j59 = j54 - (((j53 - 2) * j11) * j16);
        short[] sArr2 = new short[i16 * 4];
        for (long j60 = 0; j60 < j17; j60 += j15) {
            long j61 = j60 * 2;
            int i50 = iArr[(int) j60];
            sArr2[(int) j61] = (short) i50;
            sArr2[(int) (j61 + j15)] = (short) ((i50 & i13) >> 16);
        }
        for (long j62 = 0; j62 < j16; j62 += j15) {
            long j63 = j62 * 2;
            sArr2[(int) j62] = (short) ((iArr[(int) j63] & i44) >>> 1);
            sArr2[(int) (j62 + j16)] = (short) ((iArr[(int) (j63 + j15)] & i44) >>> 1);
        }
        for (long j64 = 0; j64 < j16; j64 += j15) {
            long j65 = j64 * 2;
            iArr[(int) ((j13 / 4) + j13 + j64)] = sArr2[(int) j65] | (sArr2[(int) (j65 + j15)] << 16);
        }
        long j66 = j11 * 2;
        long j67 = (j13 / 4) + j13;
        long j68 = j12 - j15;
        cbrecursion(bArr, j59, j66, null, ((int) j67) * 2, j68, j16, iArr);
        cbrecursion(bArr, j59 + j11, j66, null, (int) ((j67 * 2) + j16), j68, j16, iArr);
    }

    private static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j10, long j11) {
        long j12 = j11;
        int[] iArr = new int[(int) (j12 * 2)];
        int i10 = (int) j12;
        short[] sArr2 = new short[i10];
        while (true) {
            short s10 = 0;
            for (int i11 = 0; i11 < (((((j10 * 2) - 1) * j12) / 2) + 7) / 8; i11++) {
                bArr[i11] = 0;
            }
            cbrecursion(bArr, 0L, 1L, sArr, 0, j10, j12, iArr);
            for (int i12 = 0; i12 < j11; i12++) {
                sArr2[i12] = (short) i12;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < j10; i14++) {
                layer(sArr2, bArr, i13, i14, i10);
                i13 = (int) (i13 + (j11 >> 4));
            }
            for (int i15 = (int) (j10 - 2); i15 >= 0; i15--) {
                layer(sArr2, bArr, i13, i15, i10);
                i13 = (int) (i13 + (j11 >> 4));
            }
            int i16 = 0;
            while (i16 < j11) {
                short s11 = (short) (s10 | (sArr[i16] ^ sArr2[i16]));
                i16++;
                s10 = s11;
            }
            if (s10 == 0) {
                return;
            } else {
                j12 = j11;
            }
        }
    }

    private static int ctz(long j10) {
        long j11 = ~j10;
        long j12 = 72340172838076673L;
        long j13 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j12 &= j11 >>> i10;
            j13 += j12;
        }
        long j14 = 578721382704613384L & j13;
        long j15 = j14 | (j14 >>> 1);
        long j16 = j15 | (j15 >>> 2);
        long j17 = j13 >>> 8;
        long j18 = j13 + (j17 & j16);
        for (int i11 = 2; i11 < 8; i11++) {
            j16 &= j16 >>> 8;
            j17 >>>= 8;
            j18 += j17 & j16;
        }
        return ((int) j18) & 255;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10;
        int i11;
        int i12 = this.SYS_T;
        short[] sArr = new short[i12 + 1];
        int i13 = this.SYS_N;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i12 * 2];
        short[] sArr4 = new short[i12 * 2];
        short[] sArr5 = new short[i12 + 1];
        short[] sArr6 = new short[i13];
        byte[] bArr4 = new byte[i13 / 8];
        int i14 = 0;
        while (true) {
            i10 = this.SYND_BYTES;
            if (i14 >= i10) {
                break;
            }
            bArr4[i14] = bArr3[i14];
            i14++;
        }
        while (i10 < this.SYS_N / 8) {
            bArr4[i10] = 0;
            i10++;
        }
        int i15 = 0;
        while (true) {
            i11 = this.SYS_T;
            if (i15 >= i11) {
                break;
            }
            sArr[i15] = Utils.load_gf(bArr2, (i15 * 2) + 40, this.GFMASK);
            i15++;
        }
        sArr[i11] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i16 = 0; i16 < this.SYS_N / 8; i16++) {
            bArr[i16] = 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.SYS_N; i18++) {
            short sGf_iszero = (short) (this.f20319gf.gf_iszero(sArr6[i18]) & 1);
            int i19 = i18 / 8;
            bArr[i19] = (byte) (bArr[i19] | (sGf_iszero << (i18 % 8)));
            i17 += sGf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i20 = this.SYS_T ^ i17;
        for (int i21 = 0; i21 < this.SYS_T * 2; i21++) {
            i20 |= sArr3[i21] ^ sArr4[i21];
        }
        return (((i20 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s10) {
        int i10 = this.SYS_T;
        short sGf_mul = sArr[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            sGf_mul = (short) (this.f20319gf.gf_mul(sGf_mul, s10) ^ sArr[i11]);
        }
        return sGf_mul;
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i10;
        int i11 = this.SYS_T;
        short[] sArr = new short[i11 * 2];
        short[] sArr2 = new short[i11];
        byte[] bArr2 = new byte[i11];
        while (true) {
            if (this.countErrorIndices) {
                byte[] bArr3 = new byte[this.SYS_T * 4];
                secureRandom.nextBytes(bArr3);
                for (int i12 = 0; i12 < this.SYS_T * 2; i12++) {
                    sArr[i12] = Utils.load_gf(bArr3, i12 * 2, this.GFMASK);
                }
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i10 = this.SYS_T;
                    if (i13 >= i10 * 2 || i14 >= i10) {
                        break;
                    }
                    short s10 = sArr[i13];
                    if (s10 < this.SYS_N) {
                        sArr2[i14] = s10;
                        i14++;
                    }
                    i13++;
                }
                if (i14 < i10) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[this.SYS_T * 2];
                secureRandom.nextBytes(bArr4);
                for (int i15 = 0; i15 < this.SYS_T; i15++) {
                    sArr2[i15] = Utils.load_gf(bArr4, i15 * 2, this.GFMASK);
                }
            }
            boolean z10 = false;
            for (int i16 = 1; i16 < this.SYS_T && !z10; i16++) {
                int i17 = 0;
                while (true) {
                    if (i17 >= i16) {
                        break;
                    }
                    if (sArr2[i16] == sArr2[i17]) {
                        z10 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (!z10) {
                break;
            }
        }
        for (int i18 = 0; i18 < this.SYS_T; i18++) {
            bArr2[i18] = (byte) (1 << (sArr2[i18] & 7));
        }
        for (short s11 = 0; s11 < this.SYS_N / 8; s11 = (short) (s11 + 1)) {
            bArr[s11] = 0;
            for (int i19 = 0; i19 < this.SYS_T; i19++) {
                bArr[s11] = (byte) ((((short) (same_mask32(s11, (short) (sArr2[i19] >> 3)) & 255)) & bArr2[i19]) | bArr[s11]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i10;
        int i11 = this.SYS_T;
        int i12 = 2;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i11 + 1, i11);
        sArr2[0][0] = 1;
        System.arraycopy(sArr, 0, sArr2[1], 0, this.SYS_T);
        int[] iArr = new int[(this.SYS_T * 2) - 1];
        while (true) {
            i10 = this.SYS_T;
            if (i12 >= i10) {
                break;
            }
            this.f20319gf.gf_sqr_poly(i10, this.poly, sArr2[i12], sArr2[i12 >>> 1], iArr);
            int[] iArr2 = iArr;
            this.f20319gf.gf_mul_poly(this.SYS_T, this.poly, sArr2[i12 + 1], sArr2[i12], sArr, iArr2);
            iArr = iArr2;
            i12 += 2;
        }
        if (i12 == i10) {
            this.f20319gf.gf_sqr_poly(i10, this.poly, sArr2[i12], sArr2[i12 >>> 1], iArr);
        }
        int i13 = 0;
        while (true) {
            int i14 = this.SYS_T;
            if (i13 >= i14) {
                System.arraycopy(sArr2[i14], 0, sArr, 0, i14);
                return 0;
            }
            int i15 = i13 + 1;
            for (int i16 = i15; i16 < this.SYS_T; i16++) {
                short sGf_iszero = this.f20319gf.gf_iszero(sArr2[i13][i13]);
                for (int i17 = i13; i17 < this.SYS_T + 1; i17++) {
                    short[] sArr3 = sArr2[i17];
                    sArr3[i13] = (short) (sArr3[i13] ^ ((short) (sArr3[i16] & sGf_iszero)));
                }
            }
            short s10 = sArr2[i13][i13];
            if (s10 == 0) {
                return -1;
            }
            short sGf_inv = this.f20319gf.gf_inv(s10);
            for (int i18 = i13; i18 < this.SYS_T + 1; i18++) {
                short[] sArr4 = sArr2[i18];
                sArr4[i13] = this.f20319gf.gf_mul(sArr4[i13], sGf_inv);
            }
            for (int i19 = 0; i19 < this.SYS_T; i19++) {
                if (i19 != i13) {
                    short s11 = sArr2[i13][i19];
                    for (int i20 = i13; i20 <= this.SYS_T; i20++) {
                        short[] sArr5 = sArr2[i20];
                        sArr5[i19] = (short) (sArr5[i19] ^ this.f20319gf.gf_mul(sArr5[i13], s11));
                    }
                }
            }
            i13 = i15;
        }
    }

    public static short get_q_short(int[] iArr, int i10) {
        int i11 = i10 / 2;
        return (short) (i10 % 2 == 0 ? iArr[i11] : (iArr[i11] & (-65536)) >> 16);
    }

    private static void layer(short[] sArr, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 1 << i11;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15 += i13 * 2) {
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = i15 + i16;
                short s10 = sArr[i17];
                int i18 = i17 + i13;
                int i19 = (sArr[i18] ^ s10) & (-((bArr[(i14 >> 3) + i10] >> (i14 & 7)) & 1));
                sArr[i17] = (short) (s10 ^ i19);
                sArr[i18] = (short) (sArr[i18] ^ i19);
                i14++;
            }
        }
    }

    private static int min(short s10, int i10) {
        return s10 < i10 ? s10 : i10;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        long jLoad8;
        int i10 = 64;
        long[] jArr2 = new long[64];
        int i11 = 32;
        long[] jArr3 = new long[32];
        byte[] bArr2 = new byte[9];
        int i12 = this.PK_NROWS - 32;
        int i13 = i12 / 8;
        int i14 = i12 % 8;
        boolean z10 = false;
        if (this.usePadding) {
            for (int i15 = 0; i15 < 32; i15++) {
                for (int i16 = 0; i16 < 9; i16++) {
                    bArr2[i16] = bArr[i12 + i15][i13 + i16];
                }
                int i17 = 0;
                while (i17 < 8) {
                    int i18 = i17 + 1;
                    bArr2[i17] = (byte) (((bArr2[i17] & 255) >> i14) | (bArr2[i18] << (8 - i14)));
                    i17 = i18;
                }
                jArr2[i15] = Utils.load8(bArr2, 0);
            }
        } else {
            for (int i19 = 0; i19 < 32; i19++) {
                jArr2[i19] = Utils.load8(bArr[i12 + i19], i13);
            }
        }
        long j10 = 0;
        jArr[0] = 0;
        int i20 = 0;
        while (true) {
            long j11 = 1;
            if (i20 >= 32) {
                int i21 = 0;
                while (i21 < i11) {
                    int i22 = i21 + 1;
                    int i23 = i22;
                    while (i23 < i10) {
                        long jSame_mask64 = (sArr[r11] ^ sArr[r15]) & same_mask64((short) i23, (short) r19[i21]);
                        sArr[i12 + i21] = (short) (sArr[r11] ^ jSame_mask64);
                        sArr[i12 + i23] = (short) (jSame_mask64 ^ sArr[r15]);
                        i23++;
                        i22 = i22;
                        jArr3 = jArr3;
                        i10 = 64;
                        i11 = 32;
                    }
                    i21 = i22;
                }
                long[] jArr4 = jArr3;
                for (int i24 = 0; i24 < this.PK_NROWS; i24++) {
                    if (this.usePadding) {
                        for (int i25 = 0; i25 < 9; i25++) {
                            bArr2[i25] = bArr[i24][i13 + i25];
                        }
                        int i26 = 0;
                        while (i26 < 8) {
                            int i27 = i26 + 1;
                            bArr2[i26] = (byte) (((bArr2[i26] & 255) >> i14) | (bArr2[i27] << (8 - i14)));
                            i26 = i27;
                        }
                        jLoad8 = Utils.load8(bArr2, 0);
                    } else {
                        jLoad8 = Utils.load8(bArr[i24], i13);
                    }
                    for (int i28 = 0; i28 < 32; i28++) {
                        long j12 = jArr4[i28];
                        long j13 = ((jLoad8 >> i28) ^ (jLoad8 >> ((int) j12))) & 1;
                        jLoad8 = (jLoad8 ^ (j13 << ((int) j12))) ^ (j13 << i28);
                    }
                    if (this.usePadding) {
                        Utils.store8(bArr2, 0, jLoad8);
                        byte[] bArr3 = bArr[i24];
                        int i29 = i13 + 8;
                        int i30 = 8 - i14;
                        bArr3[i29] = (byte) ((((bArr3[i29] & 255) >>> i14) << i14) | ((bArr2[7] & 255) >>> i30));
                        bArr3[i13] = (byte) (((bArr2[0] & 255) << i14) | (((bArr3[i13] & 255) << i30) >>> i30));
                        for (int i31 = 7; i31 >= 1; i31--) {
                            bArr[i24][i13 + i31] = (byte) (((bArr2[i31] & 255) << i14) | ((bArr2[i31 - 1] & 255) >>> i30));
                        }
                    } else {
                        Utils.store8(bArr[i24], i13, jLoad8);
                    }
                }
                return 0;
            }
            long j14 = jArr2[i20];
            int i32 = i20 + 1;
            long j15 = j10;
            for (int i33 = i32; i33 < 32; i33++) {
                j14 |= jArr2[i33];
            }
            if (j14 == j15) {
                return -1;
            }
            int iCtz = ctz(j14);
            boolean z11 = z10;
            long j16 = iCtz;
            jArr3[i20] = j16;
            jArr[z11 ? 1 : 0] = jArr[z11 ? 1 : 0] | (1 << ((int) j16));
            for (int i34 = i32; i34 < 32; i34++) {
                long j17 = jArr2[i20];
                jArr2[i20] = j17 ^ (jArr2[i34] & (((j17 >> iCtz) & 1) - 1));
            }
            int i35 = i32;
            while (i35 < 32) {
                long j18 = jArr2[i35];
                long j19 = j11;
                jArr2[i35] = j18 ^ (jArr2[i20] & (-((j18 >> iCtz) & j19)));
                i35++;
                j11 = j19;
                z11 = false;
            }
            z10 = z11;
            i20 = i32;
            j10 = j15;
        }
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i10;
        int i11;
        int i12 = this.SYS_T;
        short[] sArr2 = new short[i12 + 1];
        byte b10 = 1;
        sArr2[i12] = 1;
        for (int i13 = 0; i13 < this.SYS_T; i13++) {
            sArr2[i13] = Utils.load_gf(bArr2, (i13 * 2) + 40, this.GFMASK);
        }
        int i14 = 1 << this.GFBITS;
        long[] jArr2 = new long[i14];
        for (int i15 = 0; i15 < (1 << this.GFBITS); i15++) {
            long j10 = iArr[i15];
            jArr2[i15] = j10;
            long j11 = j10 << 31;
            jArr2[i15] = j11;
            long j12 = j11 | i15;
            jArr2[i15] = j12;
            jArr2[i15] = j12 & Long.MAX_VALUE;
        }
        sort64(jArr2, 0, i14);
        for (int i16 = 1; i16 < (1 << this.GFBITS); i16++) {
            if ((jArr2[i16 - 1] >> 31) == (jArr2[i16] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i17 = 0; i17 < (1 << this.GFBITS); i17++) {
            sArr[i17] = (short) (jArr2[i17] & this.GFMASK);
        }
        int i18 = 0;
        while (true) {
            i10 = this.SYS_N;
            if (i18 >= i10) {
                break;
            }
            sArr3[i18] = Utils.bitrev(sArr[i18], this.GFBITS);
            i18++;
        }
        short[] sArr4 = new short[i10];
        root(sArr4, sArr2, sArr3);
        int i19 = 0;
        while (true) {
            i11 = this.SYS_N;
            if (i19 >= i11) {
                break;
            }
            sArr4[i19] = this.f20319gf.gf_inv(sArr4[i19]);
            i19++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i11 / 8);
        for (int i20 = 0; i20 < this.PK_NROWS; i20++) {
            for (int i21 = 0; i21 < this.SYS_N / 8; i21++) {
                bArr3[i20][i21] = 0;
            }
        }
        int i22 = 0;
        while (i22 < this.SYS_T) {
            for (int i23 = 0; i23 < this.SYS_N; i23 += 8) {
                int i24 = 0;
                while (true) {
                    int i25 = this.GFBITS;
                    if (i24 < i25) {
                        bArr3[(i25 * i22) + i24][i23 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i23 + 7] >>> i24) & 1)) << 1)) | ((sArr4[i23 + 6] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 5] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 4] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 3] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 2] >>> i24) & 1))) << 1)) | ((sArr4[i23 + 1] >>> i24) & 1))) << 1)) | ((sArr4[i23] >>> i24) & 1));
                        i24++;
                    }
                }
            }
            for (int i26 = 0; i26 < this.SYS_N; i26++) {
                sArr4[i26] = this.f20319gf.gf_mul(sArr4[i26], sArr3[i26]);
            }
            i22++;
        }
        int i27 = 0;
        while (true) {
            int i28 = this.PK_NROWS;
            if (i27 >= i28) {
                if (bArr != null) {
                    if (!this.usePadding) {
                        int i29 = ((this.SYS_N - i28) + 7) / 8;
                        int i30 = 0;
                        while (true) {
                            int i31 = this.PK_NROWS;
                            if (i30 >= i31) {
                                break;
                            }
                            System.arraycopy(bArr3[i30], i31 / 8, bArr, i29 * i30, i29);
                            i30++;
                        }
                    } else {
                        int i32 = i28 % 8;
                        if (i32 != 0) {
                            int i33 = 0;
                            int i34 = 0;
                            while (true) {
                                int i35 = this.PK_NROWS;
                                if (i33 >= i35) {
                                    break;
                                }
                                int i36 = (i35 - 1) / 8;
                                while (i36 < (this.SYS_N / 8) - 1) {
                                    byte[] bArr4 = bArr3[i33];
                                    int i37 = (bArr4[i36] & 255) >>> i32;
                                    i36++;
                                    bArr[i34] = (byte) ((bArr4[i36] << (8 - i32)) | i37);
                                    i34++;
                                }
                                bArr[i34] = (byte) ((bArr3[i33][i36] & 255) >>> i32);
                                i33++;
                                i34++;
                            }
                        } else {
                            System.arraycopy(bArr3[i22], (i28 - 1) / 8, bArr, 0, this.SYS_N / 8);
                        }
                    }
                }
                return 0;
            }
            i22 = i27 >>> 3;
            int i38 = i27 & 7;
            if (this.usePivots && i27 == i28 - 32) {
                if (mov_columns(bArr3, sArr, jArr) != 0) {
                    return -1;
                }
            }
            int i39 = i27 + 1;
            for (int i40 = i39; i40 < this.PK_NROWS; i40++) {
                byte b11 = (byte) (-((byte) (((byte) (((byte) (bArr3[i27][i22] ^ bArr3[i40][i22])) >> i38)) & b10)));
                int i41 = 0;
                while (i41 < this.SYS_N / 8) {
                    byte[] bArr5 = bArr3[i27];
                    bArr5[i41] = (byte) (bArr5[i41] ^ (bArr3[i40][i41] & b11));
                    i41++;
                    b10 = b10;
                }
            }
            byte b12 = b10;
            if (((bArr3[i27][i22] >> i38) & 1) == 0) {
                return -1;
            }
            for (int i42 = 0; i42 < this.PK_NROWS; i42++) {
                if (i42 != i27) {
                    byte b13 = (byte) (-((byte) (((byte) (bArr3[i42][i22] >> i38)) & 1)));
                    for (int i43 = 0; i43 < this.SYS_N / 8; i43++) {
                        byte[] bArr6 = bArr3[i42];
                        bArr6[i43] = (byte) (bArr6[i43] ^ (bArr3[i27][i43] & b13));
                    }
                }
            }
            i27 = i39;
            b10 = b12;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i10 = 0; i10 < this.SYS_N; i10++) {
            sArr[i10] = eval(sArr2, sArr3[i10]);
        }
    }

    private static byte same_mask32(short s10, short s11) {
        return (byte) ((-(((s10 ^ s11) - 1) >>> 31)) & 255);
    }

    private static long same_mask64(short s10, short s11) {
        return -(((s10 ^ s11) - 1) >>> 63);
    }

    private static void sort32(int[] iArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 < 2) {
            return;
        }
        int i13 = 1;
        while (i13 < i12 - i13) {
            i13 += i13;
        }
        for (int i14 = i13; i14 > 0; i14 >>>= 1) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12 - i14; i16++) {
                if ((i16 & i14) == 0) {
                    int i17 = i10 + i16;
                    int i18 = i17 + i14;
                    int i19 = iArr[i18];
                    int i20 = iArr[i17];
                    int i21 = i19 ^ i20;
                    int i22 = i19 - i20;
                    int i23 = ((((i19 ^ i22) & i21) ^ i22) >> 31) & i21;
                    iArr[i17] = i20 ^ i23;
                    iArr[i18] = iArr[i18] ^ i23;
                }
            }
            for (int i24 = i13; i24 > i14; i24 >>>= 1) {
                while (i15 < i12 - i24) {
                    if ((i15 & i14) == 0) {
                        int i25 = i10 + i15;
                        int i26 = i25 + i14;
                        int i27 = iArr[i26];
                        for (int i28 = i24; i28 > i14; i28 >>>= 1) {
                            int i29 = i25 + i28;
                            int i30 = iArr[i29];
                            int i31 = i30 ^ i27;
                            int i32 = i30 - i27;
                            int i33 = i31 & ((i32 ^ ((i32 ^ i30) & i31)) >> 31);
                            i27 ^= i33;
                            iArr[i29] = i30 ^ i33;
                        }
                        iArr[i26] = i27;
                    }
                    i15++;
                }
            }
        }
    }

    private static void sort64(long[] jArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 < 2) {
            return;
        }
        int i13 = 1;
        while (i13 < i12 - i13) {
            i13 += i13;
        }
        for (int i14 = i13; i14 > 0; i14 >>>= 1) {
            int i15 = 0;
            for (int i16 = 0; i16 < i12 - i14; i16++) {
                if ((i16 & i14) == 0) {
                    int i17 = i10 + i16;
                    int i18 = i17 + i14;
                    long j10 = jArr[i18];
                    long j11 = jArr[i17];
                    long j12 = (j10 ^ j11) & (-((j10 - j11) >>> 63));
                    jArr[i17] = j11 ^ j12;
                    jArr[i18] = jArr[i18] ^ j12;
                }
            }
            for (int i19 = i13; i19 > i14; i19 >>>= 1) {
                while (i15 < i12 - i19) {
                    if ((i15 & i14) == 0) {
                        int i20 = i10 + i15;
                        int i21 = i20 + i14;
                        long j13 = jArr[i21];
                        for (int i22 = i19; i22 > i14; i22 >>>= 1) {
                            int i23 = i20 + i22;
                            long j14 = jArr[i23];
                            long j15 = (-((j14 - j13) >>> 63)) & (j13 ^ j14);
                            j13 ^= j15;
                            jArr[i23] = j14 ^ j15;
                        }
                        jArr[i21] = j13;
                    }
                    i15++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        short s10 = (short) (bArr[0] & 1);
        short s11 = sArr3[0];
        short sEval = eval(sArr2, s11);
        GF gf2 = this.f20319gf;
        short sGf_inv = (short) ((-s10) & gf2.gf_inv(gf2.gf_sq(sEval)));
        sArr[0] = sGf_inv;
        for (int i10 = 1; i10 < this.SYS_T * 2; i10++) {
            sGf_inv = this.f20319gf.gf_mul(sGf_inv, s11);
            sArr[i10] = sGf_inv;
        }
        for (int i11 = 1; i11 < this.SYS_N; i11++) {
            short s12 = (short) ((bArr[i11 / 8] >> (i11 % 8)) & 1);
            short s13 = sArr3[i11];
            short sEval2 = eval(sArr2, s13);
            GF gf3 = this.f20319gf;
            short sGf_mul = this.f20319gf.gf_mul(gf3.gf_inv(gf3.gf_sq(sEval2)), s12);
            sArr[0] = (short) (sArr[0] ^ sGf_mul);
            for (int i12 = 1; i12 < this.SYS_T * 2; i12++) {
                sGf_mul = this.f20319gf.gf_mul(sGf_mul, s13);
                sArr[i12] = (short) (sArr[i12] ^ sGf_mul);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i10 = this.PK_NROWS % 8;
        for (int i11 = 0; i11 < this.SYND_BYTES; i11++) {
            bArr[i11] = 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.PK_NROWS; i13++) {
            for (int i14 = 0; i14 < this.SYS_N / 8; i14++) {
                sArr[i14] = 0;
            }
            int i15 = 0;
            while (true) {
                int i16 = this.PK_ROW_BYTES;
                if (i15 >= i16) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i16) + i15] = bArr2[i12 + i15];
                i15++;
            }
            if (this.usePadding) {
                for (int i17 = (this.SYS_N / 8) - 1; i17 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i17--) {
                    sArr[i17] = (short) ((((sArr[i17] & 255) << i10) | ((sArr[i17 - 1] & 255) >>> (8 - i10))) & 255);
                }
            }
            int i18 = i13 / 8;
            int i19 = i13 % 8;
            sArr[i18] = (short) (sArr[i18] | (1 << i19));
            byte b10 = 0;
            for (int i20 = 0; i20 < this.SYS_N / 8; i20++) {
                b10 = (byte) (b10 ^ (sArr[i20] & bArr3[i20]));
            }
            byte b11 = (byte) ((b10 >>> 4) ^ b10);
            byte b12 = (byte) (b11 ^ (b11 >>> 2));
            bArr[i18] = (byte) ((((byte) (1 & ((byte) (b12 ^ (b12 >>> 1))))) << i19) | bArr[i18]);
            i12 += this.PK_ROW_BYTES;
        }
    }

    public int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & 255) >>> (this.PK_NROWS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public int check_pk_padding(byte[] bArr) {
        byte b10 = 0;
        for (int i10 = 0; i10 < this.PK_NROWS; i10++) {
            int i11 = this.PK_ROW_BYTES;
            b10 = (byte) (b10 | bArr[((i10 * i11) + i11) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b10 & 255) >>> (this.PK_NCOLS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i10;
        short[] sArr;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i11 = ((1 << this.GFBITS) * 4) + (this.SYS_N / 8) + this.IRR_BYTES;
        int i12 = i11 + 32;
        byte[] bArr3 = new byte[i12];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i12);
        if (bArr.length <= 40) {
            short[] sArr2 = new short[this.SYS_T];
            int i13 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i13];
            int i14 = i11 - i13;
            for (int i15 = 0; i15 < this.SYS_T; i15++) {
                sArr2[i15] = Utils.load_gf(bArr3, (i15 * 2) + i14, this.GFMASK);
            }
            generate_irr_poly(sArr2);
            for (int i16 = 0; i16 < this.SYS_T; i16++) {
                Utils.store_gf(bArr4, i16 * 2, sArr2[i16]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i17 = this.IRR_BYTES;
        if (length <= i17 + 40) {
            int i18 = this.GFBITS;
            int[] iArr = new int[1 << i18];
            short[] sArr3 = new short[1 << i18];
            int i19 = (i11 - i17) - ((1 << i18) * 4);
            int i20 = 0;
            while (true) {
                i10 = this.GFBITS;
                if (i20 >= (1 << i10)) {
                    break;
                }
                iArr[i20] = Utils.load4(bArr3, (i20 * 4) + i19);
                i20++;
            }
            if (this.usePivots) {
                sArr = sArr3;
                pk_gen(null, bArr2, iArr, sArr, new long[]{0});
            } else {
                sArr = sArr3;
                int i21 = 1 << i10;
                long[] jArr = new long[i21];
                for (int i22 = 0; i22 < (1 << this.GFBITS); i22++) {
                    long j10 = iArr[i22];
                    jArr[i22] = j10;
                    long j11 = j10 << 31;
                    jArr[i22] = j11;
                    long j12 = j11 | i22;
                    jArr[i22] = j12;
                    jArr[i22] = j12 & Long.MAX_VALUE;
                }
                sort64(jArr, 0, i21);
                for (int i23 = 0; i23 < (1 << this.GFBITS); i23++) {
                    sArr[i23] = (short) (jArr[i23] & this.GFMASK);
                }
            }
            int i24 = this.COND_BYTES;
            byte[] bArr5 = new byte[i24];
            controlbitsfrompermutation(bArr5, sArr, this.GFBITS, 1 << r3);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i24);
        }
        int privateKeySize = getPrivateKeySize();
        int i25 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i25 / 8), i25 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i10 = this.GFBITS;
        short[] sArr = new short[1 << i10];
        long[] jArr = {0};
        int[] iArr = new int[1 << i10];
        int i11 = ((1 << i10) * 4) + (this.SYS_N / 8);
        byte[] bArr3 = new byte[i11];
        int i12 = ((i11 - 32) - this.IRR_BYTES) - ((1 << i10) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i11);
        for (int i13 = 0; i13 < (1 << this.GFBITS); i13++) {
            iArr[i13] = Utils.load4(bArr3, (i13 * 4) + i12);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return (this.SYS_N / 8) + this.COND_BYTES + this.IRR_BYTES + 40;
    }

    public int getPublicKeySize() {
        if (!this.usePadding) {
            return (this.PK_NROWS * this.PK_NCOLS) / 8;
        }
        int i10 = this.PK_NROWS;
        return ((this.SYS_N / 8) - ((i10 - 1) / 8)) * i10;
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10 = this.SYS_N;
        byte[] bArr4 = new byte[i10 / 8];
        int i11 = (i10 / 8) + 1 + this.SYND_BYTES;
        byte[] bArr5 = new byte[i11];
        int iCheck_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        short sDecrypt = (short) (((short) (((short) (((byte) decrypt(bArr4, bArr3, bArr2)) - 1)) >> 8)) & 255);
        bArr5[0] = (byte) (sDecrypt & 1);
        int i12 = 0;
        while (i12 < this.SYS_N / 8) {
            int i13 = i12 + 1;
            bArr5[i13] = (byte) ((bArr4[i12] & sDecrypt) | ((~sDecrypt) & bArr3[i12 + 40 + this.IRR_BYTES + this.COND_BYTES]));
            i12 = i13;
        }
        for (int i14 = 0; i14 < this.SYND_BYTES; i14++) {
            bArr5[(this.SYS_N / 8) + 1 + i14] = bArr2[i14];
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, i11);
        sHAKEDigest.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b10 = (byte) iCheck_c_padding;
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr[i15] = (byte) (bArr[i15] | b10);
        }
        return iCheck_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i10 = this.SYS_N / 8;
        byte[] bArr4 = new byte[i10];
        int iCheck_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i10);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b10 = (byte) (((byte) iCheck_pk_padding) ^ 255);
        for (int i11 = 0; i11 < this.SYND_BYTES; i11++) {
            bArr[i11] = (byte) (bArr[i11] & b10);
        }
        for (int i12 = 0; i12 < 32; i12++) {
            bArr2[i12] = (byte) (bArr2[i12] & b10);
        }
        return iCheck_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i10;
        int i11;
        int i12;
        short[] sArr;
        int i13;
        long j10;
        int i14 = 32;
        byte[] bArr3 = new byte[32];
        int i15 = 1;
        int i16 = 0;
        byte[] bArr4 = {64};
        secureRandom.nextBytes(bArr3);
        int i17 = (this.SYS_T * 2) + ((1 << this.GFBITS) * 4) + (this.SYS_N / 8);
        int i18 = i17 + 32;
        byte[] bArr5 = new byte[i18];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        byte[] bArr6 = bArr3;
        while (true) {
            sHAKEDigest.update(bArr4, i16, i15);
            sHAKEDigest.update(bArr3, i16, bArr3.length);
            sHAKEDigest.doFinal(bArr5, i16, i18);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr5, i17, i17 + 32);
            System.arraycopy(bArr6, i16, bArr2, i16, i14);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, i16, i14);
            int i19 = this.SYS_T;
            short[] sArr2 = new short[i19];
            int i20 = i17 - (i19 * 2);
            i10 = i15;
            for (int i21 = i16; i21 < this.SYS_T; i21++) {
                sArr2[i21] = Utils.load_gf(bArr5, (i21 * 2) + i20, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i22 = i16; i22 < this.SYS_T; i22++) {
                    Utils.store_gf(bArr2, (i22 * 2) + 40, sArr2[i22]);
                }
                int i23 = this.GFBITS;
                int[] iArr = new int[i10 << i23];
                i11 = i20 - ((i10 << i23) * 4);
                int i24 = 0;
                while (true) {
                    i12 = this.GFBITS;
                    if (i24 >= (i10 << i12)) {
                        break;
                    }
                    iArr[i24] = Utils.load4(bArr5, (i24 * 4) + i11);
                    i24++;
                }
                sArr = new short[i10 << i12];
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            }
            bArr3 = bArrCopyOfRange;
            bArr6 = bArrCopyOfRange2;
            i15 = i10;
            i14 = 32;
            i16 = 0;
        }
        int i25 = this.COND_BYTES;
        byte[] bArr7 = new byte[i25];
        controlbitsfrompermutation(bArr7, sArr, this.GFBITS, i10 << r6);
        System.arraycopy(bArr7, 0, bArr2, this.IRR_BYTES + 40, i25);
        int i26 = this.SYS_N;
        System.arraycopy(bArr5, i11 - (i26 / 8), bArr2, bArr2.length - (i26 / 8), i26 / 8);
        if (this.usePivots) {
            i13 = 32;
            j10 = jArr[0];
        } else {
            j10 = BodyPartID.bodyIdMax;
            i13 = 32;
        }
        Utils.store8(bArr2, i13, j10);
    }
}
