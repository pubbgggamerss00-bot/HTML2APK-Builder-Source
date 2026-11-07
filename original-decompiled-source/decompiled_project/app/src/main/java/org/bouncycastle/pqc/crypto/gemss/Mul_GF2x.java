package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
abstract class Mul_GF2x {

    public static class Mul12 extends Mul_GF2x {
        private long[] Buffer = new long[12];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul384_no_simd_gf2x(pointer.array, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul384_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 8, jArr2, i10 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    public static class Mul13 extends Mul_GF2x {
        private long[] Buffer = new long[13];
        private long[] Buffer2 = new long[4];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul416_no_simd_gf2x(pointer.array, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul416_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.Buffer, this.Buffer2);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            jArr[12] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i10 + 6]);
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 8, jArr2, i10 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    public static class Mul17 extends Mul_GF2x {
        private long[] AA = new long[5];
        private long[] BB = new long[5];
        private long[] Buffer1 = new long[17];
        private long[] Buffer2 = new long[4];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul544_no_simd_gf2x(pointer.array, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.AA, this.BB, this.Buffer1);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul544_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.AA, this.BB, this.Buffer1, this.Buffer2);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            jArr[16] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i10 + 8]);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 8, jArr2, i10 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    public static class Mul6 extends Mul_GF2x {
        private long[] Buffer = new long[6];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul192_no_simd_gf2x(pointer.array, 0, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul192_no_simd_gf2x_xor(pointer.array, pointer.cp, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            Mul_GF2x.SQR64_NO_SIMD_GF2X(jArr, 4, jArr2[i10 + 2]);
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    public static class Mul9 extends Mul_GF2x {
        private long[] Buffer = new long[9];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul288_no_simd_gf2x(pointer.array, 0, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul288_no_simd_gf2x_xor(pointer.array, pointer.cp, pointer2.array, pointer2.cp, pointer3.array, pointer3.cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i10) {
            jArr[8] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i10 + 4]);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i10);
        }
    }

    private static long MUL32_NO_SIMD_GF2X(long j10, long j11) {
        return ((j10 & (-((j11 >>> 31) & 1))) << 31) ^ ((((((((((((((((((((((((((((((((-(j11 & 1)) & j10) ^ (((-((j11 >>> 1) & 1)) & j10) << 1)) ^ (((-((j11 >>> 2) & 1)) & j10) << 2)) ^ (((-((j11 >>> 3) & 1)) & j10) << 3)) ^ (((-((j11 >>> 4) & 1)) & j10) << 4)) ^ (((-((j11 >>> 5) & 1)) & j10) << 5)) ^ (((-((j11 >>> 6) & 1)) & j10) << 6)) ^ (((-((j11 >>> 7) & 1)) & j10) << 7)) ^ (((-((j11 >>> 8) & 1)) & j10) << 8)) ^ (((-((j11 >>> 9) & 1)) & j10) << 9)) ^ (((-((j11 >>> 10) & 1)) & j10) << 10)) ^ (((-((j11 >>> 11) & 1)) & j10) << 11)) ^ (((-((j11 >>> 12) & 1)) & j10) << 12)) ^ (((-((j11 >>> 13) & 1)) & j10) << 13)) ^ (((-((j11 >>> 14) & 1)) & j10) << 14)) ^ (((-((j11 >>> 15) & 1)) & j10) << 15)) ^ (((-((j11 >>> 16) & 1)) & j10) << 16)) ^ (((-((j11 >>> 17) & 1)) & j10) << 17)) ^ (((-((j11 >>> 18) & 1)) & j10) << 18)) ^ (((-((j11 >>> 19) & 1)) & j10) << 19)) ^ (((-((j11 >>> 20) & 1)) & j10) << 20)) ^ (((-((j11 >>> 21) & 1)) & j10) << 21)) ^ (((-((j11 >>> 22) & 1)) & j10) << 22)) ^ (((-((j11 >>> 23) & 1)) & j10) << 23)) ^ (((-((j11 >>> 24) & 1)) & j10) << 24)) ^ (((-((j11 >>> 25) & 1)) & j10) << 25)) ^ (((-((j11 >>> 26) & 1)) & j10) << 26)) ^ (((-((j11 >>> 27) & 1)) & j10) << 27)) ^ (((-((j11 >>> 28) & 1)) & j10) << 28)) ^ (((-((j11 >>> 29) & 1)) & j10) << 29)) ^ (((-((j11 >>> 30) & 1)) & j10) << 30));
    }

    private static void MUL64_NO_SIMD_GF2X(long[] jArr, int i10, long j10, long j11) {
        long j12 = (-(j11 >>> 63)) & j10;
        long j13 = (-((j11 >>> 1) & 1)) & j10;
        long j14 = (((-(j11 & 1)) & j10) ^ (j12 << 63)) ^ (j13 << 1);
        long j15 = (j12 >>> 1) ^ (j13 >>> 63);
        long j16 = (-((j11 >>> 2) & 1)) & j10;
        long j17 = (-((j11 >>> 3) & 1)) & j10;
        long j18 = (-((j11 >>> 4) & 1)) & j10;
        long j19 = (-((j11 >>> 5) & 1)) & j10;
        long j20 = (((j14 ^ (j16 << 2)) ^ (j17 << 3)) ^ (j18 << 4)) ^ (j19 << 5);
        long j21 = (j19 >>> 59) ^ (((j15 ^ (j16 >>> 62)) ^ (j17 >>> 61)) ^ (j18 >>> 60));
        long j22 = (-((j11 >>> 6) & 1)) & j10;
        long j23 = j20 ^ (j22 << 6);
        long j24 = j21 ^ (j22 >>> 58);
        long j25 = (-((j11 >>> 7) & 1)) & j10;
        long j26 = j23 ^ (j25 << 7);
        long j27 = j24 ^ (j25 >>> 57);
        long j28 = (-((j11 >>> 8) & 1)) & j10;
        long j29 = j26 ^ (j28 << 8);
        long j30 = j27 ^ (j28 >>> 56);
        long j31 = (-((j11 >>> 9) & 1)) & j10;
        long j32 = j29 ^ (j31 << 9);
        long j33 = j30 ^ (j31 >>> 55);
        long j34 = (-((j11 >>> 10) & 1)) & j10;
        long j35 = j32 ^ (j34 << 10);
        long j36 = j33 ^ (j34 >>> 54);
        long j37 = (-((j11 >>> 11) & 1)) & j10;
        long j38 = j35 ^ (j37 << 11);
        long j39 = j36 ^ (j37 >>> 53);
        long j40 = (-((j11 >>> 12) & 1)) & j10;
        long j41 = j38 ^ (j40 << 12);
        long j42 = j39 ^ (j40 >>> 52);
        long j43 = (-((j11 >>> 13) & 1)) & j10;
        long j44 = j41 ^ (j43 << 13);
        long j45 = j42 ^ (j43 >>> 51);
        long j46 = (-((j11 >>> 14) & 1)) & j10;
        long j47 = j44 ^ (j46 << 14);
        long j48 = j45 ^ (j46 >>> 50);
        long j49 = (-((j11 >>> 15) & 1)) & j10;
        long j50 = j47 ^ (j49 << 15);
        long j51 = j48 ^ (j49 >>> 49);
        long j52 = (-((j11 >>> 16) & 1)) & j10;
        long j53 = j50 ^ (j52 << 16);
        long j54 = j51 ^ (j52 >>> 48);
        long j55 = (-((j11 >>> 17) & 1)) & j10;
        long j56 = j53 ^ (j55 << 17);
        long j57 = j54 ^ (j55 >>> 47);
        long j58 = (-((j11 >>> 18) & 1)) & j10;
        long j59 = j56 ^ (j58 << 18);
        long j60 = j57 ^ (j58 >>> 46);
        long j61 = (-((j11 >>> 19) & 1)) & j10;
        long j62 = j59 ^ (j61 << 19);
        long j63 = j60 ^ (j61 >>> 45);
        long j64 = (-((j11 >>> 20) & 1)) & j10;
        long j65 = j62 ^ (j64 << 20);
        long j66 = j63 ^ (j64 >>> 44);
        long j67 = (-((j11 >>> 21) & 1)) & j10;
        long j68 = j65 ^ (j67 << 21);
        long j69 = j66 ^ (j67 >>> 43);
        long j70 = (-((j11 >>> 22) & 1)) & j10;
        long j71 = j68 ^ (j70 << 22);
        long j72 = j69 ^ (j70 >>> 42);
        long j73 = (-((j11 >>> 23) & 1)) & j10;
        long j74 = j71 ^ (j73 << 23);
        long j75 = j72 ^ (j73 >>> 41);
        long j76 = (-((j11 >>> 24) & 1)) & j10;
        long j77 = j74 ^ (j76 << 24);
        long j78 = j75 ^ (j76 >>> 40);
        long j79 = (-((j11 >>> 25) & 1)) & j10;
        long j80 = j77 ^ (j79 << 25);
        long j81 = j78 ^ (j79 >>> 39);
        long j82 = (-((j11 >>> 26) & 1)) & j10;
        long j83 = j80 ^ (j82 << 26);
        long j84 = j81 ^ (j82 >>> 38);
        long j85 = (-((j11 >>> 27) & 1)) & j10;
        long j86 = j83 ^ (j85 << 27);
        long j87 = j84 ^ (j85 >>> 37);
        long j88 = (-((j11 >>> 28) & 1)) & j10;
        long j89 = j86 ^ (j88 << 28);
        long j90 = j87 ^ (j88 >>> 36);
        long j91 = (-((j11 >>> 29) & 1)) & j10;
        long j92 = j89 ^ (j91 << 29);
        long j93 = j90 ^ (j91 >>> 35);
        long j94 = (-((j11 >>> 30) & 1)) & j10;
        long j95 = j92 ^ (j94 << 30);
        long j96 = j93 ^ (j94 >>> 34);
        long j97 = (-((j11 >>> 31) & 1)) & j10;
        long j98 = j95 ^ (j97 << 31);
        long j99 = j96 ^ (j97 >>> 33);
        long j100 = (-((j11 >>> 32) & 1)) & j10;
        long j101 = j98 ^ (j100 << 32);
        long j102 = j99 ^ (j100 >>> 32);
        long j103 = (-((j11 >>> 33) & 1)) & j10;
        long j104 = j101 ^ (j103 << 33);
        long j105 = j102 ^ (j103 >>> 31);
        long j106 = (-((j11 >>> 34) & 1)) & j10;
        long j107 = j104 ^ (j106 << 34);
        long j108 = j105 ^ (j106 >>> 30);
        long j109 = (-((j11 >>> 35) & 1)) & j10;
        long j110 = j107 ^ (j109 << 35);
        long j111 = j108 ^ (j109 >>> 29);
        long j112 = (-((j11 >>> 36) & 1)) & j10;
        long j113 = j110 ^ (j112 << 36);
        long j114 = j111 ^ (j112 >>> 28);
        long j115 = (-((j11 >>> 37) & 1)) & j10;
        long j116 = j113 ^ (j115 << 37);
        long j117 = j114 ^ (j115 >>> 27);
        long j118 = (-((j11 >>> 38) & 1)) & j10;
        long j119 = j116 ^ (j118 << 38);
        long j120 = j117 ^ (j118 >>> 26);
        long j121 = (-((j11 >>> 39) & 1)) & j10;
        long j122 = j119 ^ (j121 << 39);
        long j123 = j120 ^ (j121 >>> 25);
        long j124 = (-((j11 >>> 40) & 1)) & j10;
        long j125 = j122 ^ (j124 << 40);
        long j126 = j123 ^ (j124 >>> 24);
        long j127 = (-((j11 >>> 41) & 1)) & j10;
        long j128 = j125 ^ (j127 << 41);
        long j129 = j126 ^ (j127 >>> 23);
        long j130 = (-((j11 >>> 42) & 1)) & j10;
        long j131 = j128 ^ (j130 << 42);
        long j132 = j129 ^ (j130 >>> 22);
        long j133 = (-((j11 >>> 43) & 1)) & j10;
        long j134 = j131 ^ (j133 << 43);
        long j135 = j132 ^ (j133 >>> 21);
        long j136 = (-((j11 >>> 44) & 1)) & j10;
        long j137 = j134 ^ (j136 << 44);
        long j138 = j135 ^ (j136 >>> 20);
        long j139 = (-((j11 >>> 45) & 1)) & j10;
        long j140 = j137 ^ (j139 << 45);
        long j141 = j138 ^ (j139 >>> 19);
        long j142 = (-((j11 >>> 46) & 1)) & j10;
        long j143 = j140 ^ (j142 << 46);
        long j144 = j141 ^ (j142 >>> 18);
        long j145 = (-((j11 >>> 47) & 1)) & j10;
        long j146 = j143 ^ (j145 << 47);
        long j147 = j144 ^ (j145 >>> 17);
        long j148 = (-((j11 >>> 48) & 1)) & j10;
        long j149 = j146 ^ (j148 << 48);
        long j150 = j147 ^ (j148 >>> 16);
        long j151 = (-((j11 >>> 49) & 1)) & j10;
        long j152 = j149 ^ (j151 << 49);
        long j153 = j150 ^ (j151 >>> 15);
        long j154 = (-((j11 >>> 50) & 1)) & j10;
        long j155 = j152 ^ (j154 << 50);
        long j156 = j153 ^ (j154 >>> 14);
        long j157 = (-((j11 >>> 51) & 1)) & j10;
        long j158 = j155 ^ (j157 << 51);
        long j159 = j156 ^ (j157 >>> 13);
        long j160 = (-((j11 >>> 52) & 1)) & j10;
        long j161 = j158 ^ (j160 << 52);
        long j162 = j159 ^ (j160 >>> 12);
        long j163 = (-((j11 >>> 53) & 1)) & j10;
        long j164 = j161 ^ (j163 << 53);
        long j165 = j162 ^ (j163 >>> 11);
        long j166 = (-((j11 >>> 54) & 1)) & j10;
        long j167 = j164 ^ (j166 << 54);
        long j168 = j165 ^ (j166 >>> 10);
        long j169 = (-((j11 >>> 55) & 1)) & j10;
        long j170 = j167 ^ (j169 << 55);
        long j171 = j168 ^ (j169 >>> 9);
        long j172 = (-((j11 >>> 56) & 1)) & j10;
        long j173 = j170 ^ (j172 << 56);
        long j174 = j171 ^ (j172 >>> 8);
        long j175 = (-((j11 >>> 57) & 1)) & j10;
        long j176 = j173 ^ (j175 << 57);
        long j177 = j174 ^ (j175 >>> 7);
        long j178 = (-((j11 >>> 58) & 1)) & j10;
        long j179 = j176 ^ (j178 << 58);
        long j180 = j177 ^ (j178 >>> 6);
        long j181 = (-((j11 >>> 59) & 1)) & j10;
        long j182 = j179 ^ (j181 << 59);
        long j183 = j180 ^ (j181 >>> 5);
        long j184 = (-((j11 >>> 60) & 1)) & j10;
        long j185 = j182 ^ (j184 << 60);
        long j186 = j183 ^ (j184 >>> 4);
        long j187 = (-((j11 >>> 61) & 1)) & j10;
        long j188 = j185 ^ (j187 << 61);
        long j189 = j186 ^ (j187 >>> 3);
        long j190 = (-((j11 >>> 62) & 1)) & j10;
        jArr[i10] = j188 ^ (j190 << 62);
        jArr[i10 + 1] = j189 ^ (j190 >>> 2);
    }

    private static void MUL64_NO_SIMD_GF2X_XOR(long[] jArr, int i10, long j10, long j11) {
        long j12 = (-(j11 >>> 63)) & j10;
        long j13 = (-((j11 >>> 1) & 1)) & j10;
        long j14 = (((-(j11 & 1)) & j10) ^ (j12 << 63)) ^ (j13 << 1);
        long j15 = (j12 >>> 1) ^ (j13 >>> 63);
        long j16 = (-((j11 >>> 2) & 1)) & j10;
        long j17 = (-((j11 >>> 3) & 1)) & j10;
        long j18 = (-((j11 >>> 4) & 1)) & j10;
        long j19 = (-((j11 >>> 5) & 1)) & j10;
        long j20 = (((j14 ^ (j16 << 2)) ^ (j17 << 3)) ^ (j18 << 4)) ^ (j19 << 5);
        long j21 = (j19 >>> 59) ^ (((j15 ^ (j16 >>> 62)) ^ (j17 >>> 61)) ^ (j18 >>> 60));
        long j22 = (-((j11 >>> 6) & 1)) & j10;
        long j23 = j20 ^ (j22 << 6);
        long j24 = j21 ^ (j22 >>> 58);
        long j25 = (-((j11 >>> 7) & 1)) & j10;
        long j26 = j23 ^ (j25 << 7);
        long j27 = j24 ^ (j25 >>> 57);
        long j28 = (-((j11 >>> 8) & 1)) & j10;
        long j29 = j26 ^ (j28 << 8);
        long j30 = j27 ^ (j28 >>> 56);
        long j31 = (-((j11 >>> 9) & 1)) & j10;
        long j32 = j29 ^ (j31 << 9);
        long j33 = j30 ^ (j31 >>> 55);
        long j34 = (-((j11 >>> 10) & 1)) & j10;
        long j35 = j32 ^ (j34 << 10);
        long j36 = j33 ^ (j34 >>> 54);
        long j37 = (-((j11 >>> 11) & 1)) & j10;
        long j38 = j35 ^ (j37 << 11);
        long j39 = j36 ^ (j37 >>> 53);
        long j40 = (-((j11 >>> 12) & 1)) & j10;
        long j41 = j38 ^ (j40 << 12);
        long j42 = j39 ^ (j40 >>> 52);
        long j43 = (-((j11 >>> 13) & 1)) & j10;
        long j44 = j41 ^ (j43 << 13);
        long j45 = j42 ^ (j43 >>> 51);
        long j46 = (-((j11 >>> 14) & 1)) & j10;
        long j47 = j44 ^ (j46 << 14);
        long j48 = j45 ^ (j46 >>> 50);
        long j49 = (-((j11 >>> 15) & 1)) & j10;
        long j50 = j47 ^ (j49 << 15);
        long j51 = j48 ^ (j49 >>> 49);
        long j52 = (-((j11 >>> 16) & 1)) & j10;
        long j53 = j50 ^ (j52 << 16);
        long j54 = j51 ^ (j52 >>> 48);
        long j55 = (-((j11 >>> 17) & 1)) & j10;
        long j56 = j53 ^ (j55 << 17);
        long j57 = j54 ^ (j55 >>> 47);
        long j58 = (-((j11 >>> 18) & 1)) & j10;
        long j59 = j56 ^ (j58 << 18);
        long j60 = j57 ^ (j58 >>> 46);
        long j61 = (-((j11 >>> 19) & 1)) & j10;
        long j62 = j59 ^ (j61 << 19);
        long j63 = j60 ^ (j61 >>> 45);
        long j64 = (-((j11 >>> 20) & 1)) & j10;
        long j65 = j62 ^ (j64 << 20);
        long j66 = j63 ^ (j64 >>> 44);
        long j67 = (-((j11 >>> 21) & 1)) & j10;
        long j68 = j65 ^ (j67 << 21);
        long j69 = j66 ^ (j67 >>> 43);
        long j70 = (-((j11 >>> 22) & 1)) & j10;
        long j71 = j68 ^ (j70 << 22);
        long j72 = j69 ^ (j70 >>> 42);
        long j73 = (-((j11 >>> 23) & 1)) & j10;
        long j74 = j71 ^ (j73 << 23);
        long j75 = j72 ^ (j73 >>> 41);
        long j76 = (-((j11 >>> 24) & 1)) & j10;
        long j77 = j74 ^ (j76 << 24);
        long j78 = j75 ^ (j76 >>> 40);
        long j79 = (-((j11 >>> 25) & 1)) & j10;
        long j80 = j77 ^ (j79 << 25);
        long j81 = j78 ^ (j79 >>> 39);
        long j82 = (-((j11 >>> 26) & 1)) & j10;
        long j83 = j80 ^ (j82 << 26);
        long j84 = j81 ^ (j82 >>> 38);
        long j85 = (-((j11 >>> 27) & 1)) & j10;
        long j86 = j83 ^ (j85 << 27);
        long j87 = j84 ^ (j85 >>> 37);
        long j88 = (-((j11 >>> 28) & 1)) & j10;
        long j89 = j86 ^ (j88 << 28);
        long j90 = j87 ^ (j88 >>> 36);
        long j91 = (-((j11 >>> 29) & 1)) & j10;
        long j92 = j89 ^ (j91 << 29);
        long j93 = j90 ^ (j91 >>> 35);
        long j94 = (-((j11 >>> 30) & 1)) & j10;
        long j95 = j92 ^ (j94 << 30);
        long j96 = j93 ^ (j94 >>> 34);
        long j97 = (-((j11 >>> 31) & 1)) & j10;
        long j98 = j95 ^ (j97 << 31);
        long j99 = j96 ^ (j97 >>> 33);
        long j100 = (-((j11 >>> 32) & 1)) & j10;
        long j101 = j98 ^ (j100 << 32);
        long j102 = j99 ^ (j100 >>> 32);
        long j103 = (-((j11 >>> 33) & 1)) & j10;
        long j104 = j101 ^ (j103 << 33);
        long j105 = j102 ^ (j103 >>> 31);
        long j106 = (-((j11 >>> 34) & 1)) & j10;
        long j107 = j104 ^ (j106 << 34);
        long j108 = j105 ^ (j106 >>> 30);
        long j109 = (-((j11 >>> 35) & 1)) & j10;
        long j110 = j107 ^ (j109 << 35);
        long j111 = j108 ^ (j109 >>> 29);
        long j112 = (-((j11 >>> 36) & 1)) & j10;
        long j113 = j110 ^ (j112 << 36);
        long j114 = j111 ^ (j112 >>> 28);
        long j115 = (-((j11 >>> 37) & 1)) & j10;
        long j116 = j113 ^ (j115 << 37);
        long j117 = j114 ^ (j115 >>> 27);
        long j118 = (-((j11 >>> 38) & 1)) & j10;
        long j119 = j116 ^ (j118 << 38);
        long j120 = j117 ^ (j118 >>> 26);
        long j121 = (-((j11 >>> 39) & 1)) & j10;
        long j122 = j119 ^ (j121 << 39);
        long j123 = j120 ^ (j121 >>> 25);
        long j124 = (-((j11 >>> 40) & 1)) & j10;
        long j125 = j122 ^ (j124 << 40);
        long j126 = j123 ^ (j124 >>> 24);
        long j127 = (-((j11 >>> 41) & 1)) & j10;
        long j128 = j125 ^ (j127 << 41);
        long j129 = j126 ^ (j127 >>> 23);
        long j130 = (-((j11 >>> 42) & 1)) & j10;
        long j131 = j128 ^ (j130 << 42);
        long j132 = j129 ^ (j130 >>> 22);
        long j133 = (-((j11 >>> 43) & 1)) & j10;
        long j134 = j131 ^ (j133 << 43);
        long j135 = j132 ^ (j133 >>> 21);
        long j136 = (-((j11 >>> 44) & 1)) & j10;
        long j137 = j134 ^ (j136 << 44);
        long j138 = j135 ^ (j136 >>> 20);
        long j139 = (-((j11 >>> 45) & 1)) & j10;
        long j140 = j137 ^ (j139 << 45);
        long j141 = j138 ^ (j139 >>> 19);
        long j142 = (-((j11 >>> 46) & 1)) & j10;
        long j143 = j140 ^ (j142 << 46);
        long j144 = j141 ^ (j142 >>> 18);
        long j145 = (-((j11 >>> 47) & 1)) & j10;
        long j146 = j143 ^ (j145 << 47);
        long j147 = j144 ^ (j145 >>> 17);
        long j148 = (-((j11 >>> 48) & 1)) & j10;
        long j149 = j146 ^ (j148 << 48);
        long j150 = j147 ^ (j148 >>> 16);
        long j151 = (-((j11 >>> 49) & 1)) & j10;
        long j152 = j149 ^ (j151 << 49);
        long j153 = j150 ^ (j151 >>> 15);
        long j154 = (-((j11 >>> 50) & 1)) & j10;
        long j155 = j152 ^ (j154 << 50);
        long j156 = j153 ^ (j154 >>> 14);
        long j157 = (-((j11 >>> 51) & 1)) & j10;
        long j158 = j155 ^ (j157 << 51);
        long j159 = j156 ^ (j157 >>> 13);
        long j160 = (-((j11 >>> 52) & 1)) & j10;
        long j161 = j158 ^ (j160 << 52);
        long j162 = j159 ^ (j160 >>> 12);
        long j163 = (-((j11 >>> 53) & 1)) & j10;
        long j164 = j161 ^ (j163 << 53);
        long j165 = j162 ^ (j163 >>> 11);
        long j166 = (-((j11 >>> 54) & 1)) & j10;
        long j167 = j164 ^ (j166 << 54);
        long j168 = j165 ^ (j166 >>> 10);
        long j169 = (-((j11 >>> 55) & 1)) & j10;
        long j170 = j167 ^ (j169 << 55);
        long j171 = j168 ^ (j169 >>> 9);
        long j172 = (-((j11 >>> 56) & 1)) & j10;
        long j173 = j170 ^ (j172 << 56);
        long j174 = j171 ^ (j172 >>> 8);
        long j175 = (-((j11 >>> 57) & 1)) & j10;
        long j176 = j173 ^ (j175 << 57);
        long j177 = j174 ^ (j175 >>> 7);
        long j178 = (-((j11 >>> 58) & 1)) & j10;
        long j179 = j176 ^ (j178 << 58);
        long j180 = j177 ^ (j178 >>> 6);
        long j181 = (-((j11 >>> 59) & 1)) & j10;
        long j182 = j179 ^ (j181 << 59);
        long j183 = j180 ^ (j181 >>> 5);
        long j184 = (-((j11 >>> 60) & 1)) & j10;
        long j185 = j182 ^ (j184 << 60);
        long j186 = j183 ^ (j184 >>> 4);
        long j187 = (-((j11 >>> 61) & 1)) & j10;
        long j188 = j185 ^ (j187 << 61);
        long j189 = j186 ^ (j187 >>> 3);
        long j190 = (-((j11 >>> 62) & 1)) & j10;
        jArr[i10] = (j188 ^ (j190 << 62)) ^ jArr[i10];
        int i11 = i10 + 1;
        jArr[i11] = (j189 ^ (j190 >>> 2)) ^ jArr[i11];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR128_NO_SIMD_GF2X(long[] jArr, int i10, long[] jArr2, int i11) {
        SQR64_NO_SIMD_GF2X(jArr, i10 + 2, jArr2[i11 + 1]);
        SQR64_NO_SIMD_GF2X(jArr, i10, jArr2[i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR256_NO_SIMD_GF2X(long[] jArr, int i10, long[] jArr2, int i11) {
        SQR128_NO_SIMD_GF2X(jArr, i10 + 4, jArr2, i11 + 2);
        SQR128_NO_SIMD_GF2X(jArr, i10, jArr2, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long SQR32_NO_SIMD_GF2X(long j10) {
        long j11 = (j10 ^ (j10 << 16)) & 281470681808895L;
        long j12 = (j11 ^ (j11 << 8)) & 71777214294589695L;
        long j13 = (j12 ^ (j12 << 4)) & 1085102592571150095L;
        long j14 = (j13 ^ (j13 << 2)) & 3689348814741910323L;
        return (j14 ^ (j14 << 1)) & 6148914691236517205L;
    }

    private static long SQR64LOW_NO_SIMD_GF2X(long j10) {
        long j11 = ((j10 << 16) ^ (BodyPartID.bodyIdMax & j10)) & 281470681808895L;
        long j12 = (j11 ^ (j11 << 8)) & 71777214294589695L;
        long j13 = (j12 ^ (j12 << 4)) & 1085102592571150095L;
        long j14 = (j13 ^ (j13 << 2)) & 3689348814741910323L;
        return (j14 ^ (j14 << 1)) & 6148914691236517205L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR64_NO_SIMD_GF2X(long[] jArr, int i10, long j10) {
        jArr[i10 + 1] = SQR32_NO_SIMD_GF2X(j10 >>> 32);
        jArr[i10] = SQR64LOW_NO_SIMD_GF2X(j10);
    }

    private static void mul128_no_simd_gf2x(long[] jArr, int i10, long j10, long j11, long j12, long j13) {
        MUL64_NO_SIMD_GF2X(jArr, i10, j10, j12);
        int i11 = i10 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i11, j11, j13);
        int i12 = i10 + 1;
        long j14 = jArr[i11] ^ jArr[i12];
        jArr[i11] = j14;
        jArr[i12] = j14 ^ jArr[i10];
        jArr[i11] = jArr[i11] ^ jArr[i10 + 3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i12, j10 ^ j11, j12 ^ j13);
    }

    private static void mul128_no_simd_gf2x_xor(long[] jArr, int i10, long j10, long j11, long j12, long j13, long[] jArr2) {
        MUL64_NO_SIMD_GF2X(jArr2, 0, j10, j12);
        MUL64_NO_SIMD_GF2X(jArr2, 2, j11, j13);
        jArr[i10] = jArr[i10] ^ jArr2[0];
        long j14 = jArr2[2] ^ jArr2[1];
        jArr2[2] = j14;
        int i11 = i10 + 1;
        jArr[i11] = (jArr2[0] ^ j14) ^ jArr[i11];
        int i12 = i10 + 2;
        jArr[i12] = jArr[i12] ^ (jArr2[2] ^ jArr2[3]);
        int i13 = i10 + 3;
        jArr[i13] = jArr[i13] ^ jArr2[3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i11, j10 ^ j11, j12 ^ j13);
    }

    public static void mul192_no_simd_gf2x(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        MUL64_NO_SIMD_GF2X(jArr, i10, jArr2[i11], jArr3[i12]);
        int i13 = i10 + 4;
        int i14 = i11 + 2;
        int i15 = i12 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i13, jArr2[i14], jArr3[i15]);
        int i16 = i10 + 2;
        int i17 = i11 + 1;
        int i18 = i12 + 1;
        MUL64_NO_SIMD_GF2X(jArr, i16, jArr2[i17], jArr3[i18]);
        int i19 = i10 + 1;
        jArr[i19] = jArr[i19] ^ jArr[i16];
        int i20 = i10 + 3;
        long j10 = jArr[i20] ^ jArr[i13];
        jArr[i20] = j10;
        jArr[i13] = j10 ^ jArr[i10 + 5];
        jArr[i16] = (jArr[i20] ^ jArr[i19]) ^ jArr[i10];
        jArr[i20] = jArr[i19] ^ jArr[i13];
        jArr[i19] = jArr[i19] ^ jArr[i10];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i19, jArr2[i11] ^ jArr2[i17], jArr3[i12] ^ jArr3[i18]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i20, jArr2[i17] ^ jArr2[i14], jArr3[i18] ^ jArr3[i15]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i16, jArr2[i11] ^ jArr2[i14], jArr3[i12] ^ jArr3[i15]);
    }

    public static void mul192_no_simd_gf2x_xor(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        MUL64_NO_SIMD_GF2X(jArr4, 0, jArr2[i11], jArr3[i12]);
        int i13 = i11 + 2;
        int i14 = i12 + 2;
        MUL64_NO_SIMD_GF2X(jArr4, 4, jArr2[i13], jArr3[i14]);
        int i15 = i11 + 1;
        int i16 = i12 + 1;
        MUL64_NO_SIMD_GF2X(jArr4, 2, jArr2[i15], jArr3[i16]);
        jArr[i10] = jArr[i10] ^ jArr4[0];
        long j10 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j10;
        long j11 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j11;
        jArr4[4] = j11 ^ jArr4[5];
        long j12 = j10 ^ jArr4[0];
        jArr4[0] = j12;
        int i17 = i10 + 1;
        jArr[i17] = j12 ^ jArr[i17];
        int i18 = i10 + 2;
        jArr[i18] = (jArr4[0] ^ jArr4[3]) ^ jArr[i18];
        int i19 = i10 + 3;
        jArr[i19] = jArr[i19] ^ (jArr4[1] ^ jArr4[4]);
        int i20 = i10 + 4;
        jArr[i20] = jArr[i20] ^ jArr4[4];
        int i21 = i10 + 5;
        jArr[i21] = jArr[i21] ^ jArr4[5];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i17, jArr2[i11] ^ jArr2[i15], jArr3[i12] ^ jArr3[i16]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i19, jArr2[i15] ^ jArr2[i13], jArr3[i16] ^ jArr3[i14]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i18, jArr2[i11] ^ jArr2[i13], jArr3[i14] ^ jArr3[i12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul288_no_simd_gf2x(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        int i13 = i11 + 1;
        int i14 = i12 + 1;
        mul128_no_simd_gf2x(jArr, i10, jArr2[i11], jArr2[i13], jArr3[i12], jArr3[i14]);
        int i15 = i10 + 4;
        int i16 = i11 + 2;
        int i17 = i12 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i15, jArr2[i16], jArr3[i17]);
        int i18 = i10 + 7;
        int i19 = i11 + 3;
        int i20 = i12 + 3;
        MUL64_NO_SIMD_GF2X(jArr, i18, jArr2[i19], jArr3[i20]);
        long j10 = jArr[i18];
        int i21 = i10 + 5;
        jArr[i18] = j10 ^ jArr[i21];
        int i22 = i10 + 8;
        int i23 = i11 + 4;
        int i24 = i12 + 4;
        jArr[i22] = MUL32_NO_SIMD_GF2X(jArr2[i23], jArr3[i24]) ^ jArr[i22];
        jArr[i21] = jArr[i18] ^ jArr[i15];
        long j11 = jArr[i18] ^ jArr[i22];
        jArr[i18] = j11;
        int i25 = i10 + 6;
        jArr[i25] = j11 ^ jArr[i15];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i21, jArr2[i19] ^ jArr2[i16], jArr3[i17] ^ jArr3[i20]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i18, jArr2[i23] ^ jArr2[i19], jArr3[i20] ^ jArr3[i24]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i25, jArr2[i23] ^ jArr2[i16], jArr3[i17] ^ jArr3[i24]);
        int i26 = i10 + 2;
        jArr[i15] = jArr[i15] ^ jArr[i26];
        long j12 = jArr[i21];
        int i27 = i10 + 3;
        jArr[i21] = j12 ^ jArr[i27];
        long j13 = jArr2[i11] ^ jArr2[i16];
        long j14 = jArr2[i13] ^ jArr2[i19];
        long j15 = jArr3[i12] ^ jArr3[i17];
        long j16 = jArr3[i14] ^ jArr3[i20];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j13, j15);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j14, j16);
        jArr4[2] = jArr4[2] ^ jArr4[1];
        jArr4[3] = MUL32_NO_SIMD_GF2X(jArr2[i23], jArr3[i24]) ^ jArr4[3];
        jArr[i26] = (jArr[i15] ^ jArr[i10]) ^ jArr4[0];
        jArr[i27] = ((jArr[i21] ^ jArr[i10 + 1]) ^ jArr4[2]) ^ jArr4[0];
        long j17 = jArr4[2] ^ jArr4[3];
        jArr4[2] = j17;
        jArr[i15] = ((jArr[i25] ^ j17) ^ jArr4[0]) ^ jArr[i15];
        jArr[i21] = jArr[i21] ^ (jArr[i18] ^ jArr4[2]);
        jArr[i25] = (jArr[i22] ^ jArr4[3]) ^ jArr[i25];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i27, j13 ^ j14, j15 ^ j16);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i21, j14 ^ jArr2[i23], j16 ^ jArr3[i24]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i15, j13 ^ jArr2[i23], j15 ^ jArr3[i24]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul288_no_simd_gf2x_xor(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        int i13 = i11 + 1;
        int i14 = i12 + 1;
        mul128_no_simd_gf2x(jArr4, 0, jArr2[i11], jArr2[i13], jArr3[i12], jArr3[i14]);
        int i15 = i11 + 2;
        int i16 = i12 + 2;
        MUL64_NO_SIMD_GF2X(jArr4, 4, jArr2[i15], jArr3[i16]);
        int i17 = i11 + 3;
        int i18 = i12 + 3;
        MUL64_NO_SIMD_GF2X(jArr4, 7, jArr2[i17], jArr3[i18]);
        jArr4[7] = jArr4[7] ^ jArr4[5];
        int i19 = i11 + 4;
        int i20 = i12 + 4;
        long jMUL32_NO_SIMD_GF2X = jArr4[8] ^ MUL32_NO_SIMD_GF2X(jArr2[i19], jArr3[i20]);
        jArr4[8] = jMUL32_NO_SIMD_GF2X;
        long j10 = jArr4[7];
        long j11 = jArr4[4];
        long j12 = j10 ^ j11;
        jArr4[5] = j12;
        long j13 = jMUL32_NO_SIMD_GF2X ^ j10;
        jArr4[7] = j13;
        jArr4[6] = j13 ^ j11;
        jArr4[4] = jArr4[2] ^ j11;
        jArr4[5] = j12 ^ jArr4[3];
        jArr[i10] = jArr[i10] ^ jArr4[0];
        int i21 = i10 + 1;
        jArr[i21] = jArr[i21] ^ jArr4[1];
        int i22 = i10 + 2;
        jArr[i22] = jArr[i22] ^ (jArr4[4] ^ jArr4[0]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, jArr2[i17] ^ jArr2[i15], jArr3[i16] ^ jArr3[i18]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 7, jArr2[i19] ^ jArr2[i17], jArr3[i18] ^ jArr3[i20]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 6, jArr2[i19] ^ jArr2[i15], jArr3[i16] ^ jArr3[i20]);
        int i23 = i10 + 3;
        jArr[i23] = jArr[i23] ^ (jArr4[5] ^ jArr4[1]);
        int i24 = i10 + 4;
        jArr[i24] = jArr[i24] ^ (jArr4[4] ^ jArr4[6]);
        int i25 = i10 + 5;
        jArr[i25] = jArr[i25] ^ (jArr4[5] ^ jArr4[7]);
        int i26 = i10 + 6;
        jArr[i26] = jArr[i26] ^ (jArr4[6] ^ jArr4[8]);
        int i27 = i10 + 7;
        jArr[i27] = jArr[i27] ^ jArr4[7];
        int i28 = i10 + 8;
        jArr[i28] = jArr[i28] ^ jArr4[8];
        long j14 = jArr2[i11] ^ jArr2[i15];
        long j15 = jArr2[i13] ^ jArr2[i17];
        long j16 = jArr3[i12] ^ jArr3[i16];
        long j17 = jArr3[i14] ^ jArr3[i18];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j14, j16);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j15, j17);
        jArr4[2] = jArr4[2] ^ jArr4[1];
        jArr4[3] = MUL32_NO_SIMD_GF2X(jArr2[i19], jArr3[i20]) ^ jArr4[3];
        jArr[i22] = jArr[i22] ^ jArr4[0];
        jArr[i23] = jArr[i23] ^ (jArr4[2] ^ jArr4[0]);
        long j18 = jArr4[2] ^ jArr4[3];
        jArr4[2] = j18;
        jArr[i24] = (j18 ^ jArr4[0]) ^ jArr[i24];
        jArr[i25] = jArr[i25] ^ jArr4[2];
        jArr[i26] = jArr[i26] ^ jArr4[3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i23, j14 ^ j15, j16 ^ j17);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i25, j15 ^ jArr2[i19], j17 ^ jArr3[i20]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i24, jArr2[i19] ^ j14, jArr3[i20] ^ j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul384_no_simd_gf2x(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4) {
        mul192_no_simd_gf2x(jArr, 0, jArr2, i10, jArr3, i11);
        int i12 = i10 + 3;
        int i13 = i11 + 3;
        mul192_no_simd_gf2x(jArr, 6, jArr2, i12, jArr3, i13);
        long j10 = jArr2[i10] ^ jArr2[i12];
        long j11 = jArr2[i10 + 1] ^ jArr2[i10 + 4];
        long j12 = jArr2[i10 + 2] ^ jArr2[i10 + 5];
        long j13 = jArr3[i11] ^ jArr3[i13];
        long j14 = jArr3[i11 + 1] ^ jArr3[i11 + 4];
        long j15 = jArr3[i11 + 2] ^ jArr3[i11 + 5];
        jArr[6] = jArr[6] ^ jArr[3];
        jArr[7] = jArr[7] ^ jArr[4];
        jArr[8] = jArr[8] ^ jArr[5];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j10, j13);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j12, j15);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j11, j14);
        long j16 = jArr[6];
        long j17 = j16 ^ jArr[0];
        long j18 = jArr4[0];
        jArr[3] = j17 ^ j18;
        long j19 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j19;
        long j20 = j18 ^ j19;
        jArr4[0] = j20;
        long j21 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j21;
        long j22 = j21 ^ jArr4[5];
        jArr4[4] = j22;
        long j23 = jArr[8];
        jArr[5] = ((j23 ^ jArr[2]) ^ j21) ^ j20;
        jArr[6] = j16 ^ ((jArr[9] ^ j19) ^ j22);
        long j24 = jArr[7];
        jArr[4] = (jArr[1] ^ j24) ^ j20;
        jArr[7] = j24 ^ (jArr4[4] ^ jArr[10]);
        jArr[8] = j23 ^ (jArr[11] ^ jArr4[5]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 4, j10 ^ j11, j13 ^ j14);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 6, j11 ^ j12, j14 ^ j15);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 5, j10 ^ j12, j13 ^ j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul384_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4) {
        mul192_no_simd_gf2x(jArr4, 0, jArr2, i10, jArr3, i11);
        int i12 = i10 + 3;
        int i13 = i11 + 3;
        mul192_no_simd_gf2x(jArr4, 6, jArr2, i12, jArr3, i13);
        long j10 = jArr2[i12] ^ jArr2[i10];
        long j11 = jArr2[i10 + 1] ^ jArr2[i10 + 4];
        long j12 = jArr2[i10 + 2] ^ jArr2[i10 + 5];
        long j13 = jArr3[i13] ^ jArr3[i11];
        long j14 = jArr3[i11 + 4] ^ jArr3[i11 + 1];
        long j15 = jArr3[i11 + 5] ^ jArr3[i11 + 2];
        long j16 = jArr4[6] ^ jArr4[3];
        jArr4[6] = j16;
        long j17 = jArr4[7] ^ jArr4[4];
        jArr4[7] = j17;
        long j18 = jArr4[8] ^ jArr4[5];
        jArr4[8] = j18;
        jArr[0] = jArr[0] ^ jArr4[0];
        jArr[1] = jArr[1] ^ jArr4[1];
        jArr[2] = jArr[2] ^ jArr4[2];
        jArr[3] = jArr[3] ^ (j16 ^ jArr4[0]);
        jArr[5] = jArr[5] ^ (j18 ^ jArr4[2]);
        long j19 = jArr[6];
        long j20 = jArr4[9];
        jArr[6] = j19 ^ (j16 ^ j20);
        jArr[4] = jArr[4] ^ (j17 ^ jArr4[1]);
        long j21 = jArr[7];
        long j22 = jArr4[10];
        jArr[7] = j21 ^ (j17 ^ j22);
        long j23 = jArr[8];
        long j24 = jArr4[11];
        jArr[8] = j23 ^ (j18 ^ j24);
        jArr[9] = jArr[9] ^ j20;
        jArr[10] = jArr[10] ^ j22;
        jArr[11] = jArr[11] ^ j24;
        MUL64_NO_SIMD_GF2X(jArr4, 0, j10, j13);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j12, j15);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j11, j14);
        long j25 = jArr[3];
        long j26 = jArr4[0];
        jArr[3] = j25 ^ j26;
        long j27 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j27;
        long j28 = j26 ^ j27;
        jArr4[0] = j28;
        long j29 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j29;
        long j30 = j29 ^ jArr4[5];
        jArr4[4] = j30;
        jArr[5] = jArr[5] ^ (j29 ^ j28);
        jArr[6] = (j27 ^ j30) ^ jArr[6];
        jArr[4] = jArr[4] ^ j28;
        jArr[7] = jArr[7] ^ jArr4[4];
        jArr[8] = jArr[8] ^ jArr4[5];
        MUL64_NO_SIMD_GF2X_XOR(jArr, 4, j10 ^ j11, j13 ^ j14);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 6, j11 ^ j12, j14 ^ j15);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 5, j10 ^ j12, j13 ^ j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul416_no_simd_gf2x(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4) {
        mul192_no_simd_gf2x(jArr, 0, jArr2, i10, jArr3, i11);
        int i12 = i10 + 3;
        int i13 = i10 + 4;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        mul128_no_simd_gf2x(jArr, 6, jArr2[i12], jArr2[i13], jArr3[i14], jArr3[i15]);
        int i16 = i10 + 5;
        int i17 = i11 + 5;
        MUL64_NO_SIMD_GF2X(jArr, 10, jArr2[i16], jArr3[i17]);
        int i18 = i10 + 6;
        int i19 = i11 + 6;
        long jMUL32_NO_SIMD_GF2X = MUL32_NO_SIMD_GF2X(jArr2[i18], jArr3[i19]) ^ jArr[11];
        jArr[12] = jMUL32_NO_SIMD_GF2X;
        jArr[11] = jMUL32_NO_SIMD_GF2X ^ jArr[10];
        MUL64_NO_SIMD_GF2X_XOR(jArr, 11, jArr2[i18] ^ jArr2[i16], jArr3[i19] ^ jArr3[i17]);
        long j10 = jArr[8] ^ jArr[10];
        jArr[8] = j10;
        long j11 = jArr[11] ^ jArr[9];
        jArr[11] = j11;
        jArr[10] = jArr[12] ^ j10;
        jArr[8] = j10 ^ jArr[6];
        jArr[9] = jArr[7] ^ j11;
        mul128_no_simd_gf2x_xor(jArr, 8, jArr2[i16] ^ jArr2[i12], jArr2[i18] ^ jArr2[i13], jArr3[i17] ^ jArr3[i14], jArr3[i19] ^ jArr3[i15], jArr4);
        long j12 = jArr2[i12] ^ jArr2[i10];
        long j13 = jArr2[i10 + 1] ^ jArr2[i13];
        long j14 = jArr2[i10 + 2] ^ jArr2[i16];
        long j15 = jArr2[i18];
        long j16 = jArr3[i11] ^ jArr3[i14];
        long j17 = jArr3[i11 + 1] ^ jArr3[i15];
        long j18 = jArr3[i11 + 2] ^ jArr3[i17];
        long j19 = jArr3[i19];
        jArr[6] = jArr[6] ^ jArr[3];
        jArr[7] = jArr[7] ^ jArr[4];
        jArr[8] = jArr[8] ^ jArr[5];
        mul128_no_simd_gf2x(jArr4, 0, j12, j13, j16, j17);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j14, j18);
        long jMUL32_NO_SIMD_GF2X2 = MUL32_NO_SIMD_GF2X(j15, j19) ^ jArr4[5];
        jArr4[6] = jMUL32_NO_SIMD_GF2X2;
        jArr4[5] = jMUL32_NO_SIMD_GF2X2 ^ jArr4[4];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, j14 ^ j15, j18 ^ j19);
        long j20 = jArr[6];
        long j21 = jArr[0] ^ j20;
        long j22 = jArr4[0];
        jArr[3] = j21 ^ j22;
        long j23 = jArr[7];
        long j24 = j23 ^ jArr[1];
        long j25 = jArr4[1];
        jArr[4] = j24 ^ j25;
        long j26 = jArr4[2] ^ jArr4[4];
        jArr4[2] = j26;
        long j27 = jArr4[3] ^ jArr4[5];
        jArr4[3] = j27;
        long j28 = jArr[8];
        jArr[5] = ((j28 ^ jArr[2]) ^ j26) ^ j22;
        long j29 = jArr[9];
        jArr[6] = j20 ^ ((j29 ^ j27) ^ j25);
        long j30 = jArr[10] ^ j26;
        long j31 = jArr4[6];
        jArr[7] = (j30 ^ j31) ^ j23;
        jArr[8] = j28 ^ (jArr[11] ^ j27);
        jArr[9] = j29 ^ (jArr[12] ^ j31);
        mul128_no_simd_gf2x_xor(jArr, 5, j12 ^ j14, j13 ^ j15, j16 ^ j18, j17 ^ j19, jArr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul416_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4, long[] jArr5) {
        mul192_no_simd_gf2x(jArr4, 0, jArr2, i10, jArr3, i11);
        int i12 = i10 + 3;
        int i13 = i10 + 4;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        mul128_no_simd_gf2x(jArr4, 6, jArr2[i12], jArr2[i13], jArr3[i14], jArr3[i15]);
        int i16 = i10 + 5;
        int i17 = i11 + 5;
        MUL64_NO_SIMD_GF2X(jArr4, 10, jArr2[i16], jArr3[i17]);
        int i18 = i10 + 6;
        int i19 = i11 + 6;
        long jMUL32_NO_SIMD_GF2X = MUL32_NO_SIMD_GF2X(jArr2[i18], jArr3[i19]) ^ jArr4[11];
        jArr4[12] = jMUL32_NO_SIMD_GF2X;
        jArr4[11] = jMUL32_NO_SIMD_GF2X ^ jArr4[10];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 11, jArr2[i18] ^ jArr2[i16], jArr3[i19] ^ jArr3[i17]);
        long j10 = jArr4[8] ^ jArr4[10];
        jArr4[8] = j10;
        long j11 = jArr4[11] ^ jArr4[9];
        jArr4[11] = j11;
        jArr4[10] = jArr4[12] ^ j10;
        long j12 = jArr4[6];
        long j13 = j10 ^ j12;
        jArr4[8] = j13;
        long j14 = jArr4[7];
        jArr4[9] = j11 ^ j14;
        jArr4[6] = jArr4[3] ^ j12;
        jArr4[7] = jArr4[4] ^ j14;
        jArr4[8] = j13 ^ jArr4[5];
        mul128_no_simd_gf2x_xor(jArr4, 8, jArr2[i16] ^ jArr2[i12], jArr2[i18] ^ jArr2[i13], jArr3[i17] ^ jArr3[i14], jArr3[i19] ^ jArr3[i15], jArr5);
        jArr[0] = jArr[0] ^ jArr4[0];
        jArr[1] = jArr[1] ^ jArr4[1];
        jArr[2] = jArr[2] ^ jArr4[2];
        long j15 = jArr[3];
        long j16 = jArr4[6];
        jArr[3] = j15 ^ (jArr4[0] ^ j16);
        long j17 = jArr[4];
        long j18 = jArr4[7];
        jArr[4] = j17 ^ (jArr4[1] ^ j18);
        long j19 = jArr[5];
        long j20 = jArr4[8];
        jArr[5] = j19 ^ (jArr4[2] ^ j20);
        long j21 = jArr[6];
        long j22 = jArr4[9];
        jArr[6] = j21 ^ (j16 ^ j22);
        long j23 = jArr[7];
        long j24 = jArr4[10];
        jArr[7] = j23 ^ (j18 ^ j24);
        long j25 = jArr[8];
        long j26 = jArr4[11];
        jArr[8] = j25 ^ (j20 ^ j26);
        long j27 = jArr[9];
        long j28 = jArr4[12];
        jArr[9] = j27 ^ (j22 ^ j28);
        jArr[10] = jArr[10] ^ j24;
        jArr[11] = jArr[11] ^ j26;
        jArr[12] = jArr[12] ^ j28;
        long j29 = jArr2[i12] ^ jArr2[i10];
        long j30 = jArr2[i13] ^ jArr2[i10 + 1];
        long j31 = jArr2[i10 + 2] ^ jArr2[i16];
        long j32 = jArr2[i18];
        long j33 = jArr3[i11] ^ jArr3[i14];
        long j34 = jArr3[i11 + 1] ^ jArr3[i15];
        long j35 = jArr3[i11 + 2] ^ jArr3[i17];
        long j36 = jArr3[i19];
        mul128_no_simd_gf2x(jArr4, 0, j29, j30, j33, j34);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j31, j35);
        long jMUL32_NO_SIMD_GF2X2 = MUL32_NO_SIMD_GF2X(j32, j36) ^ jArr4[5];
        jArr4[6] = jMUL32_NO_SIMD_GF2X2;
        jArr4[5] = jMUL32_NO_SIMD_GF2X2 ^ jArr4[4];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, j31 ^ j32, j35 ^ j36);
        long j37 = jArr[3];
        long j38 = jArr4[0];
        jArr[3] = j37 ^ j38;
        long j39 = jArr[4];
        long j40 = jArr4[1];
        jArr[4] = j39 ^ j40;
        long j41 = jArr4[2] ^ jArr4[4];
        jArr4[2] = j41;
        long j42 = jArr4[3] ^ jArr4[5];
        jArr4[3] = j42;
        jArr[5] = jArr[5] ^ (j38 ^ j41);
        jArr[6] = jArr[6] ^ (j42 ^ j40);
        long j43 = jArr[7];
        long j44 = jArr4[6];
        jArr[7] = (j41 ^ j44) ^ j43;
        jArr[8] = jArr[8] ^ j42;
        jArr[9] = jArr[9] ^ j44;
        mul128_no_simd_gf2x_xor(jArr, 5, j29 ^ j31, j30 ^ j32, j33 ^ j35, j34 ^ j36, jArr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul544_no_simd_gf2x(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4, long[] jArr5, long[] jArr6) {
        int i12 = i10 + 1;
        int i13 = i11 + 1;
        mul128_no_simd_gf2x(jArr, 0, jArr2[i10], jArr2[i12], jArr3[i11], jArr3[i13]);
        int i14 = i10 + 2;
        int i15 = i10 + 3;
        int i16 = i11 + 2;
        int i17 = i11 + 3;
        mul128_no_simd_gf2x(jArr, 4, jArr2[i14], jArr2[i15], jArr3[i16], jArr3[i17]);
        long j10 = jArr[4] ^ jArr[2];
        jArr[4] = j10;
        long j11 = jArr[5] ^ jArr[3];
        jArr[5] = j11;
        jArr[2] = jArr[0] ^ j10;
        jArr[3] = jArr[1] ^ j11;
        jArr[4] = j10 ^ jArr[6];
        jArr[5] = j11 ^ jArr[7];
        mul128_no_simd_gf2x_xor(jArr, 2, jArr2[i14] ^ jArr2[i10], jArr2[i12] ^ jArr2[i15], jArr3[i11] ^ jArr3[i16], jArr3[i13] ^ jArr3[i17], jArr6);
        int i18 = i10 + 4;
        int i19 = i11 + 4;
        mul288_no_simd_gf2x(jArr, 8, jArr2, i18, jArr3, i19, jArr6);
        long j12 = jArr[8] ^ jArr[4];
        jArr[8] = j12;
        long j13 = jArr[9] ^ jArr[5];
        jArr[9] = j13;
        long j14 = jArr[10] ^ jArr[6];
        jArr[10] = j14;
        long j15 = jArr[11] ^ jArr[7];
        jArr[11] = j15;
        jArr[4] = j12 ^ jArr[0];
        jArr[5] = j13 ^ jArr[1];
        jArr[6] = j14 ^ jArr[2];
        jArr[7] = j15 ^ jArr[3];
        long j16 = jArr[12];
        jArr[8] = j12 ^ j16;
        jArr[9] = j13 ^ jArr[13];
        jArr[10] = j14 ^ jArr[14];
        jArr[11] = j15 ^ jArr[15];
        jArr[12] = j16 ^ jArr[16];
        jArr4[0] = jArr2[i10] ^ jArr2[i18];
        jArr4[1] = jArr2[i12] ^ jArr2[i10 + 5];
        jArr4[2] = jArr2[i14] ^ jArr2[i10 + 6];
        jArr4[3] = jArr2[i15] ^ jArr2[i10 + 7];
        jArr4[4] = jArr2[i10 + 8];
        jArr5[0] = jArr3[i11] ^ jArr3[i19];
        jArr5[1] = jArr3[i13] ^ jArr3[i11 + 5];
        jArr5[2] = jArr3[i16] ^ jArr3[i11 + 6];
        jArr5[3] = jArr3[i17] ^ jArr3[i11 + 7];
        jArr5[4] = jArr3[i11 + 8];
        mul288_no_simd_gf2x_xor(jArr, 4, jArr4, 0, jArr5, 0, jArr6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul544_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i10, long[] jArr3, int i11, long[] jArr4, long[] jArr5, long[] jArr6, long[] jArr7) {
        int i12 = i10 + 1;
        int i13 = i11 + 1;
        mul128_no_simd_gf2x(jArr6, 0, jArr2[i10], jArr2[i12], jArr3[i11], jArr3[i13]);
        int i14 = i10 + 2;
        int i15 = i10 + 3;
        int i16 = i11 + 2;
        int i17 = i11 + 3;
        mul128_no_simd_gf2x(jArr6, 4, jArr2[i14], jArr2[i15], jArr3[i16], jArr3[i17]);
        long j10 = jArr6[4] ^ jArr6[2];
        jArr6[4] = j10;
        long j11 = jArr6[5] ^ jArr6[3];
        jArr6[5] = j11;
        jArr6[2] = jArr6[0] ^ j10;
        jArr6[3] = jArr6[1] ^ j11;
        jArr6[4] = j10 ^ jArr6[6];
        jArr6[5] = j11 ^ jArr6[7];
        mul128_no_simd_gf2x_xor(jArr6, 2, jArr2[i14] ^ jArr2[i10], jArr2[i12] ^ jArr2[i15], jArr3[i11] ^ jArr3[i16], jArr3[i13] ^ jArr3[i17], jArr7);
        int i18 = i10 + 4;
        int i19 = i11 + 4;
        mul288_no_simd_gf2x(jArr6, 8, jArr2, i18, jArr3, i19, jArr7);
        long j12 = jArr6[8] ^ jArr6[4];
        jArr6[8] = j12;
        long j13 = jArr6[9] ^ jArr6[5];
        jArr6[9] = j13;
        long j14 = jArr6[10] ^ jArr6[6];
        jArr6[10] = j14;
        long j15 = jArr6[11] ^ jArr6[7];
        jArr6[11] = j15;
        jArr[0] = jArr[0] ^ jArr6[0];
        jArr[1] = jArr[1] ^ jArr6[1];
        jArr[2] = jArr[2] ^ jArr6[2];
        jArr[3] = jArr[3] ^ jArr6[3];
        jArr[4] = jArr[4] ^ (j12 ^ jArr6[0]);
        jArr[5] = jArr[5] ^ (j13 ^ jArr6[1]);
        jArr[6] = jArr[6] ^ (j14 ^ jArr6[2]);
        jArr[7] = jArr[7] ^ (j15 ^ jArr6[3]);
        long j16 = jArr[8];
        long j17 = jArr6[12];
        jArr[8] = j16 ^ (j12 ^ j17);
        long j18 = jArr[9];
        long j19 = jArr6[13];
        jArr[9] = j18 ^ (j13 ^ j19);
        long j20 = jArr[10];
        long j21 = jArr6[14];
        jArr[10] = j20 ^ (j14 ^ j21);
        long j22 = jArr[11];
        long j23 = jArr6[15];
        jArr[11] = j22 ^ (j15 ^ j23);
        long j24 = jArr[12];
        long j25 = jArr6[16];
        jArr[12] = j24 ^ (j17 ^ j25);
        jArr[13] = jArr[13] ^ j19;
        jArr[14] = jArr[14] ^ j21;
        jArr[15] = jArr[15] ^ j23;
        jArr[16] = jArr[16] ^ j25;
        jArr4[0] = jArr2[i10] ^ jArr2[i18];
        jArr4[1] = jArr2[i12] ^ jArr2[i10 + 5];
        jArr4[2] = jArr2[i14] ^ jArr2[i10 + 6];
        jArr4[3] = jArr2[i15] ^ jArr2[i10 + 7];
        jArr4[4] = jArr2[i10 + 8];
        jArr5[0] = jArr3[i11] ^ jArr3[i19];
        jArr5[1] = jArr3[i13] ^ jArr3[i11 + 5];
        jArr5[2] = jArr3[i16] ^ jArr3[i11 + 6];
        jArr5[3] = jArr3[i17] ^ jArr3[i11 + 7];
        jArr5[4] = jArr3[i11 + 8];
        mul288_no_simd_gf2x_xor(jArr, 4, jArr4, 0, jArr5, 0, jArr6);
    }

    public abstract void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3);

    public abstract void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3);

    public abstract void sqr_gf2x(long[] jArr, long[] jArr2, int i10);

    private static void mul128_no_simd_gf2x(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        MUL64_NO_SIMD_GF2X(jArr, i10, jArr2[i11], jArr3[i12]);
        int i13 = i10 + 2;
        int i14 = i11 + 1;
        int i15 = i12 + 1;
        MUL64_NO_SIMD_GF2X(jArr, i13, jArr2[i14], jArr3[i15]);
        long j10 = jArr[i13];
        int i16 = i10 + 1;
        long j11 = j10 ^ jArr[i16];
        jArr[i13] = j11;
        jArr[i16] = j11 ^ jArr[i10];
        jArr[i13] = jArr[i13] ^ jArr[i10 + 3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i16, jArr2[i11] ^ jArr2[i14], jArr3[i12] ^ jArr3[i15]);
    }
}
