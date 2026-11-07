package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;
    private long[] kw;

    /* renamed from: t, reason: collision with root package name */
    private long[] f19993t;

    public static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f19994t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            int i11 = 9;
            long j19 = jArr[9];
            long j20 = jArr[10];
            long j21 = jArr[11];
            long j22 = jArr[12];
            long j23 = jArr[13];
            long j24 = jArr[14];
            long jXorRotr = jArr[15];
            int i12 = 19;
            while (i12 >= i10) {
                int i13 = iArr[i12];
                int i14 = iArr2[i12];
                int i15 = i13 + 1;
                long j25 = j10 - jArr3[i15];
                int i16 = i13 + 2;
                long j26 = j11 - jArr3[i16];
                int i17 = i13 + 3;
                long j27 = j12 - jArr3[i17];
                int i18 = i13 + 4;
                long j28 = j13 - jArr3[i18];
                int i19 = i13 + 5;
                int i20 = i10;
                long j29 = j14 - jArr3[i19];
                int i21 = i13 + 6;
                long[] jArr5 = jArr3;
                long j30 = j15 - jArr3[i21];
                int i22 = i13 + 7;
                long[] jArr6 = jArr4;
                long j31 = j16 - jArr5[i22];
                int i23 = i13 + 8;
                int[] iArr3 = iArr2;
                long j32 = j17 - jArr5[i23];
                int i24 = i13 + 9;
                long j33 = j18 - jArr5[i24];
                int i25 = i13 + 10;
                long j34 = j19 - jArr5[i25];
                int i26 = i13 + 11;
                long j35 = j20 - jArr5[i26];
                int i27 = i13 + 12;
                long j36 = j21 - jArr5[i27];
                int i28 = i13 + 13;
                long j37 = j22 - jArr5[i28];
                int i29 = i13 + 14;
                int i30 = i14 + 1;
                long j38 = j23 - (jArr5[i29] + jArr6[i30]);
                int i31 = i13 + 15;
                long j39 = j24 - (jArr5[i31] + jArr6[i14 + 2]);
                long j40 = i12;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr5[i13 + 16] + j40) + 1), i11, j25);
                long j41 = j25 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(j36, 48, j27);
                long j42 = j27 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j38, 35, j31);
                long j43 = j31 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j34, 52, j29);
                long j44 = j29 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j26, 23, j39);
                long j45 = j39 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j30, 31, j33);
                long j46 = j33 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j28, 37, j35);
                long j47 = j35 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j32, 20, j37);
                long j48 = j37 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9, 31, j41);
                long j49 = j41 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 44, j42);
                long j50 = j42 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 47, j44);
                long j51 = j44 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr6, 46, j43);
                long j52 = j43 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr2, 19, j48);
                long j53 = j48 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr4, 42, j45);
                long j54 = j45 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr3, 44, j46);
                long j55 = j46 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr5, 25, j47);
                long j56 = j47 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr17, 16, j49);
                long j57 = j49 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 34, j50);
                long j58 = j50 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr16, 56, j52);
                long j59 = j52 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr14, 51, j51);
                long j60 = j51 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr10, 4, j56);
                long j61 = j56 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr12, 53, j53);
                long j62 = j53 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr11, 42, j54);
                long j63 = j54 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr13, 41, j55);
                long j64 = j55 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr25, 41, j57);
                long j65 = j57 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 9, j58);
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 37, j60);
                long j66 = j60 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr22, 31, j59);
                long j67 = j59 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr18, 12, j64);
                long j68 = j64 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr20, 47, j61);
                long j69 = j61 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr19, 44, j62);
                long j70 = j62 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr21, 30, j63);
                long j71 = j63 - jXorRotr33;
                long j72 = j65 - jArr5[i13];
                long j73 = jXorRotr26 - jArr5[i15];
                long j74 = (j58 - jXorRotr27) - jArr5[i16];
                long j75 = jXorRotr27 - jArr5[i17];
                long j76 = j66 - jArr5[i18];
                long j77 = jXorRotr28 - jArr5[i19];
                long j78 = j67 - jArr5[i21];
                long j79 = jXorRotr29 - jArr5[i22];
                long j80 = j68 - jArr5[i23];
                long j81 = jXorRotr30 - jArr5[i24];
                long j82 = j69 - jArr5[i25];
                long j83 = jXorRotr31 - jArr5[i26];
                long j84 = j70 - jArr5[i27];
                long j85 = jXorRotr32 - (jArr5[i28] + jArr6[i14]);
                long j86 = j71 - (jArr5[i29] + jArr6[i30]);
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr33 - (jArr5[i31] + j40), 5, j72);
                long j87 = j72 - jXorRotr34;
                long jXorRotr35 = ThreefishEngine.xorRotr(j83, 20, j74);
                long j88 = j74 - jXorRotr35;
                long jXorRotr36 = ThreefishEngine.xorRotr(j85, 48, j78);
                long j89 = j78 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(j81, 41, j76);
                long j90 = j76 - jXorRotr37;
                long jXorRotr38 = ThreefishEngine.xorRotr(j73, 47, j86);
                long j91 = j86 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(j77, 28, j80);
                long j92 = j80 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(j75, 16, j82);
                long j93 = j82 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(j79, 25, j84);
                long j94 = j84 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(jXorRotr41, 33, j87);
                long j95 = j87 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(jXorRotr39, 4, j88);
                long j96 = j88 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr40, 51, j90);
                long j97 = j90 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr38, 13, j89);
                long j98 = j89 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr34, 34, j94);
                long j99 = j94 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr36, 41, j91);
                long j100 = j91 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr35, 59, j92);
                long j101 = j92 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr37, 17, j93);
                long j102 = j93 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr49, 38, j95);
                long j103 = j95 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr47, 19, j96);
                long j104 = j96 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr48, 10, j98);
                long j105 = j98 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr46, 55, j97);
                long j106 = j97 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr42, ROTATION_1_4, j102);
                long j107 = j102 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr44, 18, j99);
                long j108 = j99 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr43, 23, j100);
                long j109 = j100 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr45, 52, j101);
                long j110 = j101 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr57, 24, j103);
                long j111 = j103 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr55, 13, j104);
                j12 = j104 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr56, 8, j106);
                long j112 = j106 - jXorRotr60;
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr54, 47, j105);
                long j113 = j105 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr50, 8, j110);
                long j114 = j110 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr52, 17, j107);
                long j115 = j107 - jXorRotr63;
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr51, 22, j108);
                j22 = j108 - jXorRotr64;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr53, 37, j109);
                j24 = j109 - jXorRotr;
                j21 = jXorRotr63;
                j20 = j115;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                j16 = j113;
                j15 = jXorRotr60;
                j10 = j111;
                i11 = 9;
                j13 = jXorRotr59;
                j23 = jXorRotr64;
                j17 = jXorRotr61;
                i12 -= 2;
                j19 = jXorRotr62;
                j14 = j112;
                j11 = jXorRotr58;
                i10 = i20;
                j18 = j114;
                iArr2 = iArr3;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i32 = i10;
            long j116 = j10 - jArr7[0];
            long j117 = j11 - jArr7[i32];
            long j118 = j12 - jArr7[2];
            long j119 = j13 - jArr7[3];
            long j120 = j14 - jArr7[4];
            long j121 = j15 - jArr7[5];
            long j122 = j16 - jArr7[6];
            long j123 = j17 - jArr7[7];
            long j124 = j18 - jArr7[8];
            long j125 = j19 - jArr7[9];
            long j126 = j20 - jArr7[10];
            long j127 = j21 - jArr7[11];
            long j128 = j22 - jArr7[12];
            long j129 = j23 - (jArr7[13] + jArr8[0]);
            long j130 = j24 - (jArr7[14] + jArr8[i32]);
            long j131 = jXorRotr - jArr7[15];
            jArr2[0] = j116;
            jArr2[i32] = j117;
            jArr2[2] = j118;
            jArr2[3] = j119;
            jArr2[4] = j120;
            jArr2[5] = j121;
            jArr2[6] = j122;
            jArr2[7] = j123;
            jArr2[8] = j124;
            jArr2[9] = j125;
            jArr2[10] = j126;
            jArr2[11] = j127;
            jArr2[12] = j128;
            jArr2[13] = j129;
            jArr2[14] = j130;
            jArr2[15] = j131;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f19994t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            long j19 = jArr[9];
            long j20 = jArr[10];
            long j21 = jArr[11];
            int i10 = 9;
            long j22 = jArr[12];
            int i11 = 12;
            int i12 = 13;
            long j23 = jArr[13];
            long j24 = jArr[14];
            long j25 = jArr[15];
            long j26 = j10 + jArr3[0];
            long j27 = j11 + jArr3[1];
            long j28 = j12 + jArr3[2];
            long j29 = j13 + jArr3[3];
            long j30 = j14 + jArr3[4];
            long j31 = j15 + jArr3[5];
            long j32 = j16 + jArr3[6];
            long j33 = j17 + jArr3[7];
            long j34 = j18 + jArr3[8];
            long j35 = j19 + jArr3[9];
            long j36 = j20 + jArr3[10];
            long j37 = j21 + jArr3[11];
            long j38 = j22 + jArr3[12];
            long j39 = jArr3[13] + jArr4[0] + j23;
            long j40 = jArr3[14] + jArr4[1] + j24;
            long j41 = j31;
            long j42 = j33;
            long j43 = j35;
            long j44 = j37;
            long j45 = j25 + jArr3[15];
            long j46 = j39;
            long j47 = j30;
            long j48 = j26;
            long j49 = j29;
            int i13 = 1;
            while (i13 < 20) {
                int i14 = iArr[i13];
                int i15 = iArr2[i13];
                long j50 = j49;
                long j51 = j48 + j27;
                long jRotlXor = ThreefishEngine.rotlXor(j27, 24, j51);
                long j52 = j28 + j50;
                long jRotlXor2 = ThreefishEngine.rotlXor(j50, i12, j52);
                int i16 = i13;
                long j53 = j41;
                long j54 = j47 + j53;
                long jRotlXor3 = ThreefishEngine.rotlXor(j53, 8, j54);
                long[] jArr5 = jArr3;
                long j55 = j42;
                long j56 = j32 + j55;
                long[] jArr6 = jArr4;
                long jRotlXor4 = ThreefishEngine.rotlXor(j55, 47, j56);
                long j57 = j43;
                long j58 = j34 + j57;
                int[] iArr3 = iArr2;
                long jRotlXor5 = ThreefishEngine.rotlXor(j57, 8, j58);
                long j59 = j44;
                long j60 = j36 + j59;
                long jRotlXor6 = ThreefishEngine.rotlXor(j59, 17, j60);
                long j61 = j46;
                long j62 = j38 + j61;
                long jRotlXor7 = ThreefishEngine.rotlXor(j61, 22, j62);
                long j63 = j45;
                long j64 = j40 + j63;
                long jRotlXor8 = ThreefishEngine.rotlXor(j63, 37, j64);
                long j65 = j51 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 38, j65);
                long j66 = j52 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j66);
                long j67 = j56 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j67);
                long j68 = j54 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, 55, j68);
                long j69 = j60 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, ROTATION_1_4, j69);
                long j70 = j62 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j70);
                long j71 = j64 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j71);
                long j72 = j58 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j72);
                long j73 = j65 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j73);
                long j74 = j66 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j74);
                long j75 = j68 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j75);
                long j76 = j67 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j76);
                long j77 = j70 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j77);
                long j78 = j71 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j78);
                long j79 = j72 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, 59, j79);
                long j80 = j69 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j80);
                long j81 = j73 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j81);
                long j82 = j74 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j82);
                long j83 = j76 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j83);
                long j84 = j75 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j84);
                long j85 = j78 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j85);
                long j86 = j79 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j86);
                long j87 = j80 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j87);
                long j88 = j77 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j88);
                long j89 = j81 + jArr5[i14];
                int i17 = i14 + 1;
                long j90 = jRotlXor29 + jArr5[i17];
                int i18 = i14 + 2;
                long j91 = j82 + jArr5[i18];
                int i19 = i14 + 3;
                long j92 = jRotlXor31 + jArr5[i19];
                int i20 = i14 + 4;
                long j93 = j84 + jArr5[i20];
                int i21 = i14 + 5;
                long j94 = jRotlXor30 + jArr5[i21];
                int i22 = i14 + 6;
                long j95 = j83 + jArr5[i22];
                int i23 = i14 + 7;
                long j96 = jRotlXor32 + jArr5[i23];
                int i24 = i14 + 8;
                long j97 = j86 + jArr5[i24];
                int i25 = i14 + 9;
                long j98 = jRotlXor28 + jArr5[i25];
                int i26 = i14 + 10;
                long j99 = j87 + jArr5[i26];
                int i27 = i14 + 11;
                long j100 = jRotlXor26 + jArr5[i27];
                int i28 = i14 + 12;
                long j101 = j88 + jArr5[i28];
                int i29 = i14 + 13;
                long j102 = jArr5[i29] + jArr6[i15] + jRotlXor27;
                int i30 = i14 + 14;
                int i31 = i15 + 1;
                long j103 = jArr5[i30] + jArr6[i31] + j85;
                int i32 = i14 + 15;
                long j104 = i16;
                long j105 = jArr5[i32] + j104 + jRotlXor25;
                long j106 = j89 + j90;
                long jRotlXor33 = ThreefishEngine.rotlXor(j90, 41, j106);
                long j107 = j91 + j92;
                long jRotlXor34 = ThreefishEngine.rotlXor(j92, i10, j107);
                long j108 = j93 + j94;
                long jRotlXor35 = ThreefishEngine.rotlXor(j94, 37, j108);
                long j109 = j95 + j96;
                long jRotlXor36 = ThreefishEngine.rotlXor(j96, 31, j109);
                long j110 = j97 + j98;
                long jRotlXor37 = ThreefishEngine.rotlXor(j98, i11, j110);
                long j111 = j99 + j100;
                long jRotlXor38 = ThreefishEngine.rotlXor(j100, 47, j111);
                long j112 = j101 + j102;
                long jRotlXor39 = ThreefishEngine.rotlXor(j102, 44, j112);
                long j113 = j103 + j105;
                long jRotlXor40 = ThreefishEngine.rotlXor(j105, 30, j113);
                long j114 = j106 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j114);
                long j115 = j107 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j115);
                long j116 = j109 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j116);
                long j117 = j108 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j117);
                long j118 = j111 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j118);
                long j119 = j112 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, 53, j119);
                long j120 = j113 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j120);
                long j121 = j110 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j121);
                long j122 = j114 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j122);
                long j123 = j115 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j123);
                long j124 = j117 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j124);
                long j125 = j116 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, 46, j125);
                long j126 = j119 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j126);
                long j127 = j120 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j127);
                long j128 = j121 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j128);
                long j129 = j118 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j129);
                long j130 = j122 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j130);
                long j131 = j123 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j131);
                long j132 = j125 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j132);
                long j133 = j124 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j133);
                long j134 = j127 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j134);
                long j135 = j128 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j135);
                long j136 = j129 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j136);
                long j137 = j126 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j137);
                long j138 = jArr5[i17] + j130;
                long j139 = jRotlXor61 + jArr5[i18];
                long j140 = j131 + jArr5[i19];
                long j141 = jRotlXor63 + jArr5[i20];
                long j142 = j133 + jArr5[i21];
                long j143 = jRotlXor62 + jArr5[i22];
                long j144 = j132 + jArr5[i23];
                long j145 = jRotlXor64 + jArr5[i24];
                long j146 = j135 + jArr5[i25];
                j43 = jRotlXor60 + jArr5[i26];
                long j147 = j136 + jArr5[i27];
                long j148 = jRotlXor58 + jArr5[i28];
                j38 = j137 + jArr5[i29];
                j46 = jArr5[i30] + jArr6[i31] + jRotlXor59;
                long j149 = jArr5[i32] + jArr6[i15 + 2] + j134;
                j45 = jArr5[i14 + 16] + j104 + 1 + jRotlXor57;
                j32 = j144;
                j34 = j146;
                j47 = j142;
                j27 = j139;
                j28 = j140;
                i13 = i16 + 2;
                j49 = j141;
                j36 = j147;
                j44 = j148;
                j41 = j143;
                i12 = 13;
                i10 = 9;
                i11 = 12;
                j42 = j145;
                j48 = j138;
                j40 = j149;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
            }
            jArr2[0] = j48;
            jArr2[1] = j27;
            jArr2[2] = j28;
            jArr2[3] = j49;
            jArr2[4] = j47;
            jArr2[5] = j41;
            jArr2[6] = j32;
            jArr2[7] = j42;
            jArr2[8] = j34;
            jArr2[9] = j43;
            jArr2[10] = j36;
            jArr2[11] = j44;
            jArr2[12] = j38;
            jArr2[13] = j46;
            jArr2[14] = j40;
            jArr2[15] = j45;
        }
    }

    public static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f19994t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            char c10 = 2;
            long j12 = jArr[2];
            long jXorRotr = jArr[3];
            int i11 = 17;
            while (i11 >= i10) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j13 = j10 - jArr3[i14];
                int i15 = i12 + 2;
                int i16 = i13 + 1;
                long j14 = j11 - (jArr3[i15] + jArr4[i16]);
                int i17 = i12 + 3;
                long j15 = j12 - (jArr3[i17] + jArr4[i13 + 2]);
                int i18 = i10;
                long j16 = i11;
                char c11 = c10;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr3[i12 + 4] + j16) + 1), 32, j13);
                long j17 = j13 - jXorRotr2;
                long[] jArr5 = jArr3;
                long jXorRotr3 = ThreefishEngine.xorRotr(j14, 32, j15);
                long j18 = j15 - jXorRotr3;
                long[] jArr6 = jArr4;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr3, 58, j17);
                long j19 = j17 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr2, 22, j18);
                long j20 = j18 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr5, 46, j19);
                long j21 = j19 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr4, 12, j20);
                long j22 = j20 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr7, 25, j21);
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr6, 33, j22);
                long j23 = (j21 - jXorRotr8) - jArr5[i12];
                long j24 = jXorRotr8 - (jArr5[i14] + jArr6[i13]);
                long j25 = (j22 - jXorRotr9) - (jArr5[i15] + jArr6[i16]);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9 - (jArr5[i17] + j16), 5, j23);
                long j26 = j23 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j24, 37, j25);
                long j27 = j25 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr11, 23, j26);
                long j28 = j26 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr10, 40, j27);
                long j29 = j27 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr13, 52, j28);
                long j30 = j28 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr12, 57, j29);
                long j31 = j29 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr15, 14, j30);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr14, 16, j31);
                j12 = j31 - jXorRotr;
                i11 -= 2;
                j11 = jXorRotr16;
                i10 = i18;
                jArr3 = jArr5;
                c10 = c11;
                j10 = j30 - jXorRotr16;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i19 = i10;
            char c12 = c10;
            long j32 = j10 - jArr7[0];
            long j33 = j11 - (jArr7[i19] + jArr8[0]);
            long j34 = j12 - (jArr7[c12] + jArr8[i19]);
            long j35 = jXorRotr - jArr7[3];
            jArr2[0] = j32;
            jArr2[i19] = j33;
            jArr2[c12] = j34;
            jArr2[3] = j35;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f19994t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            char c10 = 2;
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = j10 + jArr3[0];
            long j15 = jArr3[1] + jArr4[0] + j11;
            long j16 = jArr3[2] + jArr4[1] + j12;
            long j17 = j13 + jArr3[3];
            long j18 = j16;
            long j19 = j15;
            int i10 = 1;
            while (i10 < 18) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                long j20 = j14 + j19;
                char c11 = c10;
                long jRotlXor = ThreefishEngine.rotlXor(j19, 14, j20);
                long j21 = j18 + j17;
                long jRotlXor2 = ThreefishEngine.rotlXor(j17, 16, j21);
                long[] jArr5 = jArr3;
                long j22 = j20 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, 52, j22);
                long j23 = j21 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j23);
                long j24 = j22 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j24);
                long j25 = j23 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j25);
                long j26 = j24 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j26);
                long j27 = j25 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, 37, j27);
                long j28 = j26 + jArr5[i11];
                int i13 = i11 + 1;
                long j29 = jArr5[i13] + jArr4[i12] + jRotlXor8;
                int i14 = i11 + 2;
                int i15 = i12 + 1;
                long j30 = jArr5[i14] + jArr4[i15] + j27;
                int i16 = i11 + 3;
                long j31 = i10;
                long j32 = jArr5[i16] + j31 + jRotlXor7;
                long[] jArr6 = jArr4;
                long j33 = j28 + j29;
                long jRotlXor9 = ThreefishEngine.rotlXor(j29, 25, j33);
                long j34 = j30 + j32;
                long jRotlXor10 = ThreefishEngine.rotlXor(j32, 33, j34);
                long j35 = j33 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, 46, j35);
                long j36 = j34 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j36);
                long j37 = j35 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, 58, j37);
                long j38 = j36 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j38);
                long j39 = j37 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j39);
                long j40 = j38 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j40);
                long j41 = j39 + jArr5[i13];
                j19 = jArr5[i14] + jArr6[i15] + jRotlXor16;
                j18 = jArr5[i16] + jArr6[i12 + 2] + j40;
                j17 = jArr5[i11 + 4] + j31 + 1 + jRotlXor15;
                i10 += 2;
                j14 = j41;
                c10 = c11;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
            }
            jArr2[0] = j14;
            jArr2[1] = j19;
            jArr2[c10] = j18;
            jArr2[3] = j17;
        }
    }

    public static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f19994t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            char c10 = 5;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            char c11 = 2;
            long j12 = jArr[2];
            long jXorRotr = jArr[3];
            long j13 = jArr[4];
            long jXorRotr2 = jArr[5];
            long j14 = jArr[6];
            long jXorRotr3 = jArr[7];
            int i11 = 17;
            while (i11 >= i10) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j15 = j10 - jArr3[i14];
                int i15 = i12 + 2;
                long j16 = j11 - jArr3[i15];
                int i16 = i12 + 3;
                long j17 = j12 - jArr3[i16];
                int i17 = i12 + 4;
                long j18 = jXorRotr - jArr3[i17];
                int i18 = i12 + 5;
                char c12 = c11;
                long j19 = j13 - jArr3[i18];
                int i19 = i12 + 6;
                int i20 = i13 + 1;
                int i21 = i10;
                long j20 = jXorRotr2 - (jArr3[i19] + jArr4[i20]);
                int i22 = i12 + 7;
                long[] jArr5 = jArr3;
                long j21 = j14 - (jArr3[i22] + jArr4[i13 + 2]);
                long[] jArr6 = jArr4;
                long j22 = i11;
                long j23 = jXorRotr3 - ((jArr5[i12 + 8] + j22) + 1);
                int[] iArr3 = iArr2;
                long jXorRotr4 = ThreefishEngine.xorRotr(j16, 8, j21);
                long j24 = j21 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j23, 35, j15);
                long j25 = j15 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j20, 56, j17);
                long j26 = j17 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j18, 22, j19);
                long j27 = j19 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr4, 25, j27);
                long j28 = j27 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr7, 29, j24);
                long j29 = j24 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr6, 39, j25);
                long j30 = j25 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr5, 43, j26);
                long j31 = j26 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 13, j31);
                long j32 = j31 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr11, 50, j28);
                long j33 = j28 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 10, j29);
                long j34 = j29 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr9, 17, j30);
                long j35 = j30 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr12, 39, j35);
                long j36 = j35 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr15, 30, j32);
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 34, j33);
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr13, 24, j34);
                long j37 = j34 - jXorRotr19;
                long j38 = j36 - jArr5[i12];
                long j39 = jXorRotr16 - jArr5[i14];
                long j40 = (j32 - jXorRotr17) - jArr5[i15];
                long j41 = jXorRotr17 - jArr5[i16];
                long j42 = (j33 - jXorRotr18) - jArr5[i17];
                long j43 = jXorRotr18 - (jArr5[i18] + jArr6[i13]);
                long j44 = j37 - (jArr5[i19] + jArr6[i20]);
                long j45 = jXorRotr19 - (jArr5[i22] + j22);
                long jXorRotr20 = ThreefishEngine.xorRotr(j39, 44, j44);
                long j46 = j44 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(j45, 9, j38);
                long j47 = j38 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j43, 54, j40);
                long j48 = j40 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(j41, 56, j42);
                long j49 = j42 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr20, 17, j49);
                long j50 = j49 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr23, ROTATION_2_1, j46);
                long j51 = j46 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 36, j47);
                long j52 = j47 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr21, 39, j48);
                long j53 = j48 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 33, j53);
                long j54 = j53 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr27, 27, j50);
                long j55 = j50 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 14, j51);
                long j56 = j51 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr25, 42, j52);
                long j57 = j52 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr28, 46, j57);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr31, 36, j54);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr30, 19, j55);
                long j58 = j55 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr29, 37, j56);
                j14 = j56 - jXorRotr3;
                j12 = j54 - jXorRotr;
                j11 = jXorRotr32;
                i11 -= 2;
                j10 = j57 - jXorRotr32;
                i10 = i21;
                jArr3 = jArr5;
                c10 = c10;
                c11 = c12;
                iArr2 = iArr3;
                j13 = j58;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            char c13 = c10;
            int i23 = i10;
            char c14 = c11;
            long j59 = j10 - jArr7[0];
            long j60 = j11 - jArr7[i23];
            long j61 = j12 - jArr7[c14];
            long j62 = jXorRotr - jArr7[3];
            long j63 = j13 - jArr7[4];
            long j64 = jXorRotr2 - (jArr7[c13] + jArr8[0]);
            long j65 = j14 - (jArr7[6] + jArr8[i23]);
            long j66 = jXorRotr3 - jArr7[7];
            jArr2[0] = j59;
            jArr2[i23] = j60;
            jArr2[c14] = j61;
            jArr2[3] = j62;
            jArr2[4] = j63;
            jArr2[c13] = j64;
            jArr2[6] = j65;
            jArr2[7] = j66;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f19994t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = j10 + jArr3[0];
            long j19 = j11 + jArr3[1];
            long j20 = j12 + jArr3[2];
            long j21 = j13 + jArr3[3];
            long j22 = j14 + jArr3[4];
            long j23 = jArr3[5] + jArr4[0] + j15;
            long j24 = jArr3[6] + jArr4[1] + j16;
            long j25 = j17 + jArr3[7];
            long j26 = j24;
            long j27 = j22;
            long j28 = j18;
            int i10 = 1;
            long j29 = j21;
            long j30 = j23;
            long j31 = j20;
            long j32 = j25;
            while (i10 < 18) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                long j33 = j29;
                long j34 = j28 + j19;
                long jRotlXor = ThreefishEngine.rotlXor(j19, 46, j34);
                long[] jArr5 = jArr3;
                long j35 = j31 + j33;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long jRotlXor2 = ThreefishEngine.rotlXor(j33, 36, j35);
                long j36 = j27 + j30;
                long jRotlXor3 = ThreefishEngine.rotlXor(j30, 19, j36);
                long j37 = j26 + j32;
                long jRotlXor4 = ThreefishEngine.rotlXor(j32, 37, j37);
                long j38 = j35 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j38);
                long j39 = j36 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j39);
                long j40 = j37 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j40);
                long j41 = j34 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, 42, j41);
                long j42 = j39 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j42);
                long j43 = j40 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, ROTATION_2_1, j43);
                long j44 = j41 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j44);
                long j45 = j38 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j45);
                int i13 = i10;
                long j46 = j43 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, 44, j46);
                long j47 = j44 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j47);
                long j48 = j45 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, 54, j48);
                long j49 = j42 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j49);
                long j50 = j47 + jArr5[i11];
                int i14 = i11 + 1;
                long j51 = jRotlXor13 + jArr5[i14];
                int i15 = i11 + 2;
                long j52 = j48 + jArr5[i15];
                int i16 = i11 + 3;
                long j53 = jRotlXor16 + jArr5[i16];
                int i17 = i11 + 4;
                long j54 = j49 + jArr5[i17];
                int i18 = i11 + 5;
                long j55 = jArr5[i18] + jArr6[i12] + jRotlXor15;
                int i19 = i11 + 6;
                int i20 = i12 + 1;
                long j56 = jArr5[i19] + jArr6[i20] + j46;
                int i21 = i11 + 7;
                long j57 = i13;
                long j58 = jArr5[i21] + j57 + jRotlXor14;
                long j59 = j50 + j51;
                long jRotlXor17 = ThreefishEngine.rotlXor(j51, 39, j59);
                long j60 = j52 + j53;
                long jRotlXor18 = ThreefishEngine.rotlXor(j53, 30, j60);
                long j61 = j54 + j55;
                long jRotlXor19 = ThreefishEngine.rotlXor(j55, 34, j61);
                long j62 = j56 + j58;
                long jRotlXor20 = ThreefishEngine.rotlXor(j58, 24, j62);
                long j63 = j60 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j63);
                long j64 = j61 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j64);
                long j65 = j62 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j65);
                long j66 = j59 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j66);
                long j67 = j64 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j67);
                long j68 = j65 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j68);
                long j69 = j66 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j69);
                long j70 = j63 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, 43, j70);
                long j71 = j68 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j71);
                long j72 = j69 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j72);
                long j73 = j70 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j73);
                long j74 = j67 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j74);
                long j75 = j72 + jArr5[i14];
                long j76 = jRotlXor29 + jArr5[i15];
                long j77 = j73 + jArr5[i16];
                long j78 = jRotlXor32 + jArr5[i17];
                long j79 = j74 + jArr5[i18];
                long j80 = jArr5[i19] + jArr6[i20] + jRotlXor31;
                j26 = jArr5[i21] + jArr6[i12 + 2] + j71;
                j27 = j79;
                j28 = j75;
                j31 = j77;
                jArr4 = jArr6;
                iArr = iArr3;
                j19 = j76;
                j32 = jArr5[i11 + 8] + j57 + 1 + jRotlXor30;
                j29 = j78;
                jArr3 = jArr5;
                i10 = i13 + 2;
                j30 = j80;
                iArr2 = iArr4;
            }
            jArr2[0] = j28;
            jArr2[1] = j19;
            jArr2[2] = j31;
            jArr2[3] = j29;
            jArr2[4] = j27;
            jArr2[5] = j30;
            jArr2[6] = j26;
            jArr2[7] = j32;
        }
    }

    public static abstract class ThreefishCipher {
        protected final long[] kw;

        /* renamed from: t, reason: collision with root package name */
        protected final long[] f19994t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.f19994t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i10 >= iArr2.length) {
                return;
            }
            MOD17[i10] = i10 % 17;
            iArr2[i10] = i10 % 9;
            MOD5[i10] = i10 % 5;
            MOD3[i10] = i10 % 3;
            i10++;
        }
    }

    public ThreefishEngine(int i10) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.f19993t = jArr;
        int i11 = i10 / 8;
        this.blocksizeBytes = i11;
        int i12 = i11 / 8;
        this.blocksizeWords = i12;
        this.currentBlock = new long[i12];
        long[] jArr2 = new long[(i12 * 2) + 1];
        this.kw = jArr2;
        if (i10 == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i10 == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i10 != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i10) {
        return Pack.littleEndianToLong(bArr, i10);
    }

    public static long rotlXor(long j10, int i10, long j11) {
        return ((j10 >>> (-i10)) | (j10 << i10)) ^ j11;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException(x0.a.a(new StringBuilder("Threefish key must be same size as block ("), this.blocksizeWords, " words)"));
        }
        long j10 = C_240;
        int i10 = 0;
        while (true) {
            int i11 = this.blocksizeWords;
            if (i10 >= i11) {
                long[] jArr2 = this.kw;
                jArr2[i11] = j10;
                System.arraycopy(jArr2, 0, jArr2, i11 + 1, i11);
                return;
            } else {
                long[] jArr3 = this.kw;
                long j11 = jArr[i10];
                jArr3[i10] = j11;
                j10 ^= j11;
                i10++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f19993t;
        long j10 = jArr[0];
        jArr2[0] = j10;
        long j11 = jArr[1];
        jArr2[1] = j11;
        jArr2[2] = j10 ^ j11;
        jArr2[3] = j10;
        jArr2[4] = j11;
    }

    public static void wordToBytes(long j10, byte[] bArr, int i10) {
        Pack.longToLittleEndian(j10, bArr, i10);
    }

    public static long xorRotr(long j10, int i10, long j11) {
        long j12 = j10 ^ j11;
        return (j12 << (-i10)) | (j12 >>> i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.a("Invalid parameter passed to Threefish init - ", cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException(x0.a.a(new StringBuilder("Threefish key must be same size as block ("), this.blocksizeBytes, " bytes)"));
            }
            jArr = new long[this.blocksizeWords];
            Pack.littleEndianToLong(key, 0, jArr);
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[2];
            Pack.littleEndianToLong(tweak, 0, jArr2);
        }
        init(z10, jArr, jArr2);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12 = this.blocksizeBytes;
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        Pack.littleEndianToLong(bArr, i10, this.currentBlock);
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        Pack.longToLittleEndian(this.currentBlock, bArr2, i11);
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public int processBlock(long[] jArr, long[] jArr2) throws IllegalStateException, DataLengthException {
        long[] jArr3 = this.kw;
        int i10 = this.blocksizeWords;
        if (jArr3[i10] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i10) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i10) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    public void init(boolean z10, long[] jArr, long[] jArr2) {
        this.forEncryption = z10;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }
}
