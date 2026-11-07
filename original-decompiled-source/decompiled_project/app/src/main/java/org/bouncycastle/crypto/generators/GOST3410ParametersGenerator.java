package org.bouncycastle.crypto.generators;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i10, int i11, BigInteger[] bigIntegerArr, int i12) {
        int i13;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i14;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int iNextInt = i10;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            }
            iNextInt = this.init_random.nextInt() / 32768;
        }
        int iNextInt2 = i11;
        while (true) {
            i13 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            }
            iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger5 = new BigInteger("19381");
        BigInteger bigInteger6 = new BigInteger(Integer.toString(iNextInt));
        int i15 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr = {i12};
        int i16 = 0;
        int i17 = 0;
        while (iArr[i16] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i17 = i16 + 1;
            iArr[i17] = iArr[i16] / 2;
            i16 = i17;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i17 + 1];
        int i18 = 16;
        bigIntegerArr4[i17] = new BigInteger("8003", 16);
        int i19 = i17 - 1;
        int i20 = 0;
        while (true) {
            if (i20 >= i17) {
                bigInteger = bigIntegerArr3[i15];
                break;
            }
            int i21 = iArr[i19] / i18;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i15, bigIntegerArr5, i15, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i21 + 1];
                System.arraycopy(bigIntegerArr5, i15, bigIntegerArr2, i15, length2);
                int i22 = i15;
                while (i22 < i21) {
                    int i23 = i22 + 1;
                    bigIntegerArr2[i23] = bigIntegerArr2[i22].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i18));
                    i22 = i23;
                }
                BigInteger bigInteger7 = new BigInteger(d.L0);
                int i24 = i15;
                while (i24 < i21) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i24].multiply(TWO.pow(i24 * 16)));
                    i24++;
                    i15 = i15;
                }
                i14 = i15;
                bigIntegerArr2[i14] = bigIntegerArr2[i21];
                BigInteger bigInteger8 = TWO;
                int i25 = i19 + 1;
                BigInteger bigIntegerAdd = bigInteger8.pow(iArr[i19] - i13).divide(bigIntegerArr4[i25]).add(bigInteger8.pow(iArr[i19] - i13).multiply(bigInteger7).divide(bigIntegerArr4[i25].multiply(bigInteger8.pow(i21 * 16))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger8);
                BigInteger bigInteger9 = ONE;
                if (bigIntegerMod.compareTo(bigInteger9) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger9);
                }
                BigInteger bigInteger10 = bigIntegerAdd;
                int i26 = i14;
                while (true) {
                    bigInteger2 = bigInteger4;
                    bigInteger3 = bigInteger5;
                    long j10 = i26;
                    BigInteger bigIntegerMultiply = bigIntegerArr4[i25].multiply(bigInteger10.add(BigInteger.valueOf(j10)));
                    BigInteger bigInteger11 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger11);
                    bigIntegerArr4[i19] = bigIntegerAdd2;
                    BigInteger bigInteger12 = TWO;
                    int i27 = i26;
                    if (bigIntegerAdd2.compareTo(bigInteger12.pow(iArr[i19])) != 1) {
                        if (bigInteger12.modPow(bigIntegerArr4[i25].multiply(bigInteger10.add(BigInteger.valueOf(j10))), bigIntegerArr4[i19]).compareTo(bigInteger11) == 0 && bigInteger12.modPow(bigInteger10.add(BigInteger.valueOf(j10)), bigIntegerArr4[i19]).compareTo(bigInteger11) != 0) {
                            break;
                        }
                        i26 = i27 + 2;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                    } else {
                        break;
                    }
                }
                i15 = i14;
                i13 = 1;
                bigInteger4 = bigInteger2;
                bigInteger5 = bigInteger3;
                bigIntegerArr3 = bigIntegerArr2;
                i18 = 16;
            }
            i19--;
            if (i19 < 0) {
                bigIntegerArr[i14] = bigIntegerArr4[i14];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i14];
                break;
            }
            i20++;
            i15 = i14;
            bigInteger4 = bigInteger2;
            bigInteger5 = bigInteger3;
            bigIntegerArr3 = bigIntegerArr2;
            i13 = 1;
            i18 = 16;
        }
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j10, long j11, BigInteger[] bigIntegerArr, int i10) {
        int i11;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i12;
        int[] iArr;
        BigInteger bigInteger2;
        long jNextInt = j10;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L) {
                break;
            }
            jNextInt = this.init_random.nextInt() * 2;
        }
        long jNextInt2 = j11;
        while (true) {
            i11 = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                break;
            }
            jNextInt2 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger4 = new BigInteger("97781173");
        BigInteger bigInteger5 = new BigInteger(Long.toString(jNextInt));
        int i13 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr2 = {i10};
        int i14 = 0;
        int i15 = 0;
        while (iArr2[i14] >= 33) {
            int length = iArr2.length + 1;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = new int[length];
            System.arraycopy(iArr3, 0, iArr2, 0, length);
            i15 = i14 + 1;
            iArr2[i15] = iArr2[i14] / 2;
            i14 = i15;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i15 + 1];
        bigIntegerArr4[i15] = new BigInteger("8000000B", 16);
        int i16 = i15 - 1;
        int i17 = 0;
        while (true) {
            if (i17 >= i15) {
                bigInteger = bigIntegerArr3[i13];
                break;
            }
            int i18 = 32;
            int i19 = iArr2[i16] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i13, bigIntegerArr5, i13, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i19 + 1];
                System.arraycopy(bigIntegerArr5, i13, bigIntegerArr2, i13, length2);
                int i20 = i13;
                while (i20 < i19) {
                    int i21 = i20 + 1;
                    bigIntegerArr2[i21] = bigIntegerArr2[i20].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i18));
                    i20 = i21;
                }
                BigInteger bigInteger6 = new BigInteger(d.L0);
                int i22 = i13;
                while (i22 < i19) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i22].multiply(TWO.pow(i22 * 32)));
                    i22++;
                    i13 = i13;
                }
                i12 = i13;
                bigIntegerArr2[i12] = bigIntegerArr2[i19];
                BigInteger bigInteger7 = TWO;
                int i23 = i16 + 1;
                BigInteger bigIntegerAdd = bigInteger7.pow(iArr2[i16] - i11).divide(bigIntegerArr4[i23]).add(bigInteger7.pow(iArr2[i16] - i11).multiply(bigInteger6).divide(bigIntegerArr4[i23].multiply(bigInteger7.pow(i19 * 32))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (bigIntegerMod.compareTo(bigInteger8) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger8);
                }
                BigInteger bigInteger9 = bigIntegerAdd;
                int i24 = i12;
                while (true) {
                    iArr = iArr2;
                    bigInteger2 = bigInteger3;
                    long j12 = i24;
                    BigInteger bigIntegerMultiply = bigIntegerArr4[i23].multiply(bigInteger9.add(BigInteger.valueOf(j12)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger10);
                    bigIntegerArr4[i16] = bigIntegerAdd2;
                    BigInteger bigInteger11 = TWO;
                    if (bigIntegerAdd2.compareTo(bigInteger11.pow(iArr[i16])) != 1) {
                        if (bigInteger11.modPow(bigIntegerArr4[i23].multiply(bigInteger9.add(BigInteger.valueOf(j12))), bigIntegerArr4[i16]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(bigInteger9.add(BigInteger.valueOf(j12)), bigIntegerArr4[i16]).compareTo(bigInteger10) != 0) {
                            break;
                        }
                        i24 += 2;
                        bigInteger3 = bigInteger2;
                        iArr2 = iArr;
                    } else {
                        break;
                    }
                }
                i13 = i12;
                iArr2 = iArr;
                i11 = 1;
                bigIntegerArr3 = bigIntegerArr2;
                i18 = 32;
                bigInteger3 = bigInteger2;
            }
            i16--;
            if (i16 < 0) {
                bigIntegerArr[i12] = bigIntegerArr4[i12];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i12];
                break;
            }
            i17++;
            i13 = i12;
            bigInteger3 = bigInteger2;
            iArr2 = iArr;
            bigIntegerArr3 = bigIntegerArr2;
            i11 = 1;
        }
        return bigInteger.longValue();
    }

    private void procedure_B(int i10, int i11, BigInteger[] bigIntegerArr) {
        int i12;
        int i13;
        int iNextInt = i10;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            } else {
                iNextInt = this.init_random.nextInt() / 32768;
            }
        }
        int iNextInt2 = i11;
        while (true) {
            i12 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            } else {
                iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger2 = new BigInteger("19381");
        int iProcedure_A = procedure_A(iNextInt, iNextInt2, bigIntegerArr2, 256);
        int i14 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int iProcedure_A2 = procedure_A(iProcedure_A, iNextInt2, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(iProcedure_A2));
        while (true) {
            int i15 = i14;
            while (i15 < 64) {
                int i16 = i15 + 1;
                bigIntegerArr3[i16] = bigIntegerArr3[i15].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i15 = i16;
            }
            BigInteger bigInteger5 = new BigInteger(d.L0);
            for (int i17 = i14; i17 < 64; i17++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i17].multiply(TWO.pow(i17 * 16)));
            }
            bigIntegerArr3[i14] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            BigInteger bigInteger8 = bigIntegerAdd;
            int i18 = i14;
            while (true) {
                long j10 = i18;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j10)));
                BigInteger bigInteger9 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                i13 = i14;
                if (bigIntegerAdd2.compareTo(bigInteger10.pow(1024)) == i12) {
                    break;
                }
                int i19 = i12;
                if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j10))), bigIntegerAdd2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j10))), bigIntegerAdd2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[i13] = bigIntegerAdd2;
                    bigIntegerArr[i19] = bigInteger3;
                    return;
                } else {
                    i18 += 2;
                    i14 = i13;
                    i12 = i19;
                }
            }
            i14 = i13;
        }
    }

    private void procedure_Bb(long j10, long j11, BigInteger[] bigIntegerArr) {
        int i10;
        int i11;
        long jNextInt = j10;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L) {
                break;
            } else {
                jNextInt = this.init_random.nextInt() * 2;
            }
        }
        long jNextInt2 = j11;
        while (true) {
            i10 = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                break;
            }
            long j12 = jNextInt;
            jNextInt2 = (this.init_random.nextInt() * 2) + 1;
            jNextInt = j12;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long jProcedure_Aa = procedure_Aa(jNextInt, jNextInt2, bigIntegerArr2, 256);
        int i12 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long jProcedure_Aa2 = procedure_Aa(jProcedure_Aa, jNextInt2, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(jProcedure_Aa2));
        while (true) {
            int i13 = i12;
            while (i13 < 32) {
                int i14 = i13 + 1;
                bigIntegerArr3[i14] = bigIntegerArr3[i13].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i13 = i14;
            }
            BigInteger bigInteger5 = new BigInteger(d.L0);
            for (int i15 = i12; i15 < 32; i15++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i15].multiply(TWO.pow(i15 * 32)));
            }
            bigIntegerArr3[i12] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            int i16 = i12;
            while (true) {
                long j13 = i16;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j13)));
                BigInteger bigInteger8 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                i11 = i12;
                if (bigIntegerAdd2.compareTo(bigInteger9.pow(1024)) == i10) {
                    break;
                }
                int i17 = i10;
                if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j13))), bigIntegerAdd2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(bigIntegerAdd.add(BigInteger.valueOf(j13))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[i11] = bigIntegerAdd2;
                    bigIntegerArr[i17] = bigInteger3;
                    return;
                } else {
                    i16 += 2;
                    i12 = i11;
                    i10 = i17;
                }
            }
            i12 = i11;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigInteger2);
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.init_random);
            BigInteger bigInteger3 = ONE;
            if (bigIntegerCreateRandomBigInteger.compareTo(bigInteger3) > 0 && bigIntegerCreateRandomBigInteger.compareTo(bigIntegerSubtract) < 0) {
                BigInteger bigIntegerModPow = bigIntegerCreateRandomBigInteger.modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(bigInteger3) != 0) {
                    return bigIntegerModPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        long j10;
        long j11;
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int iNextInt = this.init_random.nextInt();
            int iNextInt2 = this.init_random.nextInt();
            int i10 = this.size;
            if (i10 == 512) {
                procedure_A(iNextInt, iNextInt2, bigIntegerArr, 512);
            } else {
                if (i10 != 1024) {
                    throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
                }
                procedure_B(iNextInt, iNextInt2, bigIntegerArr);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(iNextInt, iNextInt2));
        }
        long jNextLong = this.init_random.nextLong();
        long jNextLong2 = this.init_random.nextLong();
        int i11 = this.size;
        if (i11 == 512) {
            j10 = jNextLong;
            j11 = jNextLong2;
            procedure_Aa(j10, j11, bigIntegerArr, 512);
        } else {
            if (i11 != 1024) {
                throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            j10 = jNextLong;
            j11 = jNextLong2;
            procedure_Bb(j10, j11, bigIntegerArr);
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(j10, j11));
    }

    public void init(int i10, int i11, SecureRandom secureRandom) {
        this.size = i10;
        this.typeproc = i11;
        this.init_random = secureRandom;
    }
}
