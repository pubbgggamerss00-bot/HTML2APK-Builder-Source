package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class RainbowKeyComputation {

    /* renamed from: cf, reason: collision with root package name */
    ComputeInField f20404cf;
    private short[][][] l1_F1;
    private short[][][] l1_F2;
    private short[][][] l1_Q1;
    private short[][][] l1_Q2;
    private short[][][] l1_Q3;
    private short[][][] l1_Q5;
    private short[][][] l1_Q6;
    private short[][][] l1_Q9;
    private short[][][] l2_F1;
    private short[][][] l2_F2;
    private short[][][] l2_F3;
    private short[][][] l2_F5;
    private short[][][] l2_F6;
    private short[][][] l2_Q1;
    private short[][][] l2_Q2;
    private short[][][] l2_Q3;
    private short[][][] l2_Q5;
    private short[][][] l2_Q6;
    private short[][][] l2_Q9;

    /* renamed from: o1, reason: collision with root package name */
    private int f20405o1;

    /* renamed from: o2, reason: collision with root package name */
    private int f20406o2;
    private byte[] pk_seed;
    private RainbowParameters rainbowParams;
    private SecureRandom random;

    /* renamed from: s1, reason: collision with root package name */
    private short[][] f20407s1;
    private byte[] sk_seed;

    /* renamed from: t1, reason: collision with root package name */
    private short[][] f20408t1;

    /* renamed from: t2, reason: collision with root package name */
    private short[][] f20409t2;
    private short[][] t3;

    /* renamed from: t4, reason: collision with root package name */
    private short[][] f20410t4;

    /* renamed from: v1, reason: collision with root package name */
    private int f20411v1;
    private Version version;

    public RainbowKeyComputation(RainbowParameters rainbowParameters, SecureRandom secureRandom) {
        this.f20404cf = new ComputeInField();
        this.rainbowParams = rainbowParameters;
        this.random = secureRandom;
        this.version = rainbowParameters.getVersion();
        this.f20411v1 = this.rainbowParams.getV1();
        this.f20405o1 = this.rainbowParams.getO1();
        this.f20406o2 = this.rainbowParams.getO2();
    }

    private void calculate_F_from_Q() throws RuntimeException {
        this.l1_F1 = RainbowUtil.cloneArray(this.l1_Q1);
        this.l1_F2 = new short[this.f20405o1][][];
        for (int i10 = 0; i10 < this.f20405o1; i10++) {
            this.l1_F2[i10] = this.f20404cf.addMatrixTranspose(this.l1_Q1[i10]);
            short[][][] sArr = this.l1_F2;
            sArr[i10] = this.f20404cf.multiplyMatrix(sArr[i10], this.f20408t1);
            short[][][] sArr2 = this.l1_F2;
            sArr2[i10] = this.f20404cf.addMatrix(sArr2[i10], this.l1_Q2[i10]);
        }
        int i11 = this.f20406o2;
        this.l2_F2 = new short[i11][][];
        this.l2_F3 = new short[i11][][];
        this.l2_F5 = new short[i11][][];
        this.l2_F6 = new short[i11][][];
        this.l2_F1 = RainbowUtil.cloneArray(this.l2_Q1);
        for (int i12 = 0; i12 < this.f20406o2; i12++) {
            short[][] sArrAddMatrixTranspose = this.f20404cf.addMatrixTranspose(this.l2_Q1[i12]);
            this.l2_F2[i12] = this.f20404cf.multiplyMatrix(sArrAddMatrixTranspose, this.f20408t1);
            short[][][] sArr3 = this.l2_F2;
            sArr3[i12] = this.f20404cf.addMatrix(sArr3[i12], this.l2_Q2[i12]);
            this.l2_F3[i12] = this.f20404cf.multiplyMatrix(sArrAddMatrixTranspose, this.f20410t4);
            short[][] sArrMultiplyMatrix = this.f20404cf.multiplyMatrix(this.l2_Q2[i12], this.t3);
            short[][][] sArr4 = this.l2_F3;
            sArr4[i12] = this.f20404cf.addMatrix(sArr4[i12], sArrMultiplyMatrix);
            short[][][] sArr5 = this.l2_F3;
            sArr5[i12] = this.f20404cf.addMatrix(sArr5[i12], this.l2_Q3[i12]);
            short[][] sArrAddMatrix = this.f20404cf.addMatrix(this.f20404cf.multiplyMatrix(this.l2_Q1[i12], this.f20408t1), this.l2_Q2[i12]);
            short[][] sArrTranspose = this.f20404cf.transpose(this.f20408t1);
            this.l2_F5[i12] = this.f20404cf.multiplyMatrix(sArrTranspose, sArrAddMatrix);
            short[][][] sArr6 = this.l2_F5;
            sArr6[i12] = this.f20404cf.addMatrix(sArr6[i12], this.l2_Q5[i12]);
            short[][][] sArr7 = this.l2_F5;
            sArr7[i12] = this.f20404cf.to_UT(sArr7[i12]);
            this.l2_F6[i12] = this.f20404cf.multiplyMatrix(sArrTranspose, this.l2_F3[i12]);
            ComputeInField computeInField = this.f20404cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l2_Q2[i12]), this.f20410t4);
            short[][][] sArr8 = this.l2_F6;
            sArr8[i12] = this.f20404cf.addMatrix(sArr8[i12], sArrMultiplyMatrix2);
            short[][] sArrMultiplyMatrix3 = this.f20404cf.multiplyMatrix(this.f20404cf.addMatrixTranspose(this.l2_Q5[i12]), this.t3);
            short[][][] sArr9 = this.l2_F6;
            sArr9[i12] = this.f20404cf.addMatrix(sArr9[i12], sArrMultiplyMatrix3);
            short[][][] sArr10 = this.l2_F6;
            sArr10[i12] = this.f20404cf.addMatrix(sArr10[i12], this.l2_Q6[i12]);
        }
    }

    private void calculate_Q_from_F() throws RuntimeException {
        short[][] sArrTranspose = this.f20404cf.transpose(this.f20408t1);
        short[][] sArrTranspose2 = this.f20404cf.transpose(this.f20409t2);
        this.l1_Q1 = RainbowUtil.cloneArray(this.l1_F1);
        this.l1_Q2 = new short[this.f20405o1][][];
        for (int i10 = 0; i10 < this.f20405o1; i10++) {
            this.l1_Q2[i10] = this.f20404cf.addMatrixTranspose(this.l1_F1[i10]);
            short[][][] sArr = this.l1_Q2;
            sArr[i10] = this.f20404cf.multiplyMatrix(sArr[i10], this.f20408t1);
            short[][][] sArr2 = this.l1_Q2;
            sArr2[i10] = this.f20404cf.addMatrix(sArr2[i10], this.l1_F2[i10]);
        }
        calculate_l1_Q3569(sArrTranspose, sArrTranspose2);
        int i11 = this.f20406o2;
        this.l2_Q2 = new short[i11][][];
        this.l2_Q3 = new short[i11][][];
        this.l2_Q5 = new short[i11][][];
        this.l2_Q6 = new short[i11][][];
        this.l2_Q1 = RainbowUtil.cloneArray(this.l2_F1);
        for (int i12 = 0; i12 < this.f20406o2; i12++) {
            short[][] sArrAddMatrixTranspose = this.f20404cf.addMatrixTranspose(this.l2_F1[i12]);
            this.l2_Q2[i12] = this.f20404cf.multiplyMatrix(sArrAddMatrixTranspose, this.f20408t1);
            short[][][] sArr3 = this.l2_Q2;
            sArr3[i12] = this.f20404cf.addMatrix(sArr3[i12], this.l2_F2[i12]);
            this.l2_Q3[i12] = this.f20404cf.multiplyMatrix(sArrAddMatrixTranspose, this.f20409t2);
            short[][] sArrMultiplyMatrix = this.f20404cf.multiplyMatrix(this.l2_F2[i12], this.t3);
            short[][][] sArr4 = this.l2_Q3;
            sArr4[i12] = this.f20404cf.addMatrix(sArr4[i12], sArrMultiplyMatrix);
            short[][][] sArr5 = this.l2_Q3;
            sArr5[i12] = this.f20404cf.addMatrix(sArr5[i12], this.l2_F3[i12]);
            this.l2_Q5[i12] = this.f20404cf.multiplyMatrix(sArrTranspose, this.f20404cf.addMatrix(this.f20404cf.multiplyMatrix(this.l2_F1[i12], this.f20408t1), this.l2_F2[i12]));
            short[][][] sArr6 = this.l2_Q5;
            sArr6[i12] = this.f20404cf.addMatrix(sArr6[i12], this.l2_F5[i12]);
            short[][][] sArr7 = this.l2_Q5;
            sArr7[i12] = this.f20404cf.to_UT(sArr7[i12]);
            this.l2_Q6[i12] = this.f20404cf.multiplyMatrix(sArrTranspose, this.l2_Q3[i12]);
            ComputeInField computeInField = this.f20404cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l2_F2[i12]), this.f20409t2);
            short[][][] sArr8 = this.l2_Q6;
            sArr8[i12] = this.f20404cf.addMatrix(sArr8[i12], sArrMultiplyMatrix2);
            short[][] sArrMultiplyMatrix3 = this.f20404cf.multiplyMatrix(this.f20404cf.addMatrixTranspose(this.l2_F5[i12]), this.t3);
            short[][][] sArr9 = this.l2_Q6;
            sArr9[i12] = this.f20404cf.addMatrix(sArr9[i12], sArrMultiplyMatrix3);
            short[][][] sArr10 = this.l2_Q6;
            sArr10[i12] = this.f20404cf.addMatrix(sArr10[i12], this.l2_F6[i12]);
        }
        calculate_l2_Q9(sArrTranspose2);
    }

    private void calculate_Q_from_F_cyclic() throws RuntimeException {
        short[][] sArrTranspose = this.f20404cf.transpose(this.f20408t1);
        short[][] sArrTranspose2 = this.f20404cf.transpose(this.f20409t2);
        calculate_l1_Q3569(sArrTranspose, sArrTranspose2);
        calculate_l2_Q9(sArrTranspose2);
    }

    private void calculate_l1_Q3569(short[][] sArr, short[][] sArr2) throws RuntimeException {
        int i10 = this.f20405o1;
        this.l1_Q3 = new short[i10][][];
        this.l1_Q5 = new short[i10][][];
        this.l1_Q6 = new short[i10][][];
        this.l1_Q9 = new short[i10][][];
        for (int i11 = 0; i11 < this.f20405o1; i11++) {
            short[][] sArrMultiplyMatrix = this.f20404cf.multiplyMatrix(this.l1_F2[i11], this.t3);
            this.l1_Q3[i11] = this.f20404cf.addMatrixTranspose(this.l1_F1[i11]);
            short[][][] sArr3 = this.l1_Q3;
            sArr3[i11] = this.f20404cf.multiplyMatrix(sArr3[i11], this.f20409t2);
            short[][][] sArr4 = this.l1_Q3;
            sArr4[i11] = this.f20404cf.addMatrix(sArr4[i11], sArrMultiplyMatrix);
            this.l1_Q5[i11] = this.f20404cf.multiplyMatrix(this.l1_F1[i11], this.f20408t1);
            short[][][] sArr5 = this.l1_Q5;
            sArr5[i11] = this.f20404cf.addMatrix(sArr5[i11], this.l1_F2[i11]);
            short[][][] sArr6 = this.l1_Q5;
            sArr6[i11] = this.f20404cf.multiplyMatrix(sArr, sArr6[i11]);
            short[][][] sArr7 = this.l1_Q5;
            sArr7[i11] = this.f20404cf.to_UT(sArr7[i11]);
            ComputeInField computeInField = this.f20404cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l1_F2[i11]), this.f20409t2);
            this.l1_Q6[i11] = this.f20404cf.multiplyMatrix(sArr, this.l1_Q3[i11]);
            short[][][] sArr8 = this.l1_Q6;
            sArr8[i11] = this.f20404cf.addMatrix(sArr8[i11], sArrMultiplyMatrix2);
            this.l1_Q9[i11] = this.f20404cf.addMatrix(this.f20404cf.multiplyMatrix(this.l1_F1[i11], this.f20409t2), sArrMultiplyMatrix);
            short[][][] sArr9 = this.l1_Q9;
            sArr9[i11] = this.f20404cf.multiplyMatrix(sArr2, sArr9[i11]);
            short[][][] sArr10 = this.l1_Q9;
            sArr10[i11] = this.f20404cf.to_UT(sArr10[i11]);
        }
    }

    private void calculate_l2_Q9(short[][] sArr) throws RuntimeException {
        this.l2_Q9 = new short[this.f20406o2][][];
        for (int i10 = 0; i10 < this.f20406o2; i10++) {
            this.l2_Q9[i10] = this.f20404cf.multiplyMatrix(this.l2_F1[i10], this.f20409t2);
            short[][] sArrMultiplyMatrix = this.f20404cf.multiplyMatrix(this.l2_F2[i10], this.t3);
            short[][][] sArr2 = this.l2_Q9;
            sArr2[i10] = this.f20404cf.addMatrix(sArr2[i10], sArrMultiplyMatrix);
            short[][][] sArr3 = this.l2_Q9;
            sArr3[i10] = this.f20404cf.addMatrix(sArr3[i10], this.l2_F3[i10]);
            short[][][] sArr4 = this.l2_Q9;
            sArr4[i10] = this.f20404cf.multiplyMatrix(sArr, sArr4[i10]);
            short[][] sArrAddMatrix = this.f20404cf.addMatrix(this.f20404cf.multiplyMatrix(this.l2_F5[i10], this.t3), this.l2_F6[i10]);
            ComputeInField computeInField = this.f20404cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.t3), sArrAddMatrix);
            short[][][] sArr5 = this.l2_Q9;
            sArr5[i10] = this.f20404cf.addMatrix(sArr5[i10], sArrMultiplyMatrix2);
            short[][][] sArr6 = this.l2_Q9;
            sArr6[i10] = this.f20404cf.to_UT(sArr6[i10]);
        }
    }

    private void calculate_t4() throws RuntimeException {
        this.f20410t4 = this.f20404cf.addMatrix(this.f20404cf.multiplyMatrix(this.f20408t1, this.t3), this.f20409t2);
    }

    private void genKeyMaterial() throws RuntimeException {
        byte[] bArr = new byte[this.rainbowParams.getLen_skseed()];
        this.sk_seed = bArr;
        this.random.nextBytes(bArr);
        RainbowDRBG rainbowDRBG = new RainbowDRBG(this.sk_seed, this.rainbowParams.getHash_algo());
        generate_S_and_T(rainbowDRBG);
        int i10 = this.f20405o1;
        int i11 = this.f20411v1;
        this.l1_F1 = RainbowUtil.generate_random(rainbowDRBG, i10, i11, i11, true);
        int i12 = this.f20405o1;
        this.l1_F2 = RainbowUtil.generate_random(rainbowDRBG, i12, this.f20411v1, i12, false);
        int i13 = this.f20406o2;
        int i14 = this.f20411v1;
        this.l2_F1 = RainbowUtil.generate_random(rainbowDRBG, i13, i14, i14, true);
        this.l2_F2 = RainbowUtil.generate_random(rainbowDRBG, this.f20406o2, this.f20411v1, this.f20405o1, false);
        int i15 = this.f20406o2;
        this.l2_F3 = RainbowUtil.generate_random(rainbowDRBG, i15, this.f20411v1, i15, false);
        int i16 = this.f20406o2;
        int i17 = this.f20405o1;
        this.l2_F5 = RainbowUtil.generate_random(rainbowDRBG, i16, i17, i17, true);
        int i18 = this.f20406o2;
        this.l2_F6 = RainbowUtil.generate_random(rainbowDRBG, i18, this.f20405o1, i18, false);
        calculate_Q_from_F();
        calculate_t4();
        this.l1_Q1 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q1, this.l1_Q1);
        this.l1_Q2 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q2, this.l1_Q2);
        this.l1_Q3 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q3, this.l1_Q3);
        this.l1_Q5 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q5, this.l1_Q5);
        this.l1_Q6 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q6, this.l1_Q6);
        this.l1_Q9 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q9, this.l1_Q9);
    }

    private void genKeyMaterial_cyclic() throws RuntimeException {
        byte[] bArr = new byte[this.rainbowParams.getLen_skseed()];
        this.sk_seed = bArr;
        this.random.nextBytes(bArr);
        byte[] bArr2 = new byte[this.rainbowParams.getLen_pkseed()];
        this.pk_seed = bArr2;
        this.random.nextBytes(bArr2);
        genPrivateKeyMaterial_cyclic();
        calculate_Q_from_F_cyclic();
        this.l1_Q3 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q3, this.l1_Q3);
        this.l1_Q5 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q5, this.l1_Q5);
        this.l1_Q6 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q6, this.l1_Q6);
        this.l1_Q9 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q9, this.l1_Q9);
    }

    private void genPrivateKeyMaterial_cyclic() throws RuntimeException {
        RainbowDRBG rainbowDRBG = new RainbowDRBG(this.sk_seed, this.rainbowParams.getHash_algo());
        RainbowDRBG rainbowDRBG2 = new RainbowDRBG(this.pk_seed, this.rainbowParams.getHash_algo());
        generate_S_and_T(rainbowDRBG);
        calculate_t4();
        generate_B1_and_B2(rainbowDRBG2);
        this.l1_Q1 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q1, this.l1_Q1);
        this.l1_Q2 = this.f20404cf.obfuscate_l1_polys(this.f20407s1, this.l2_Q2, this.l1_Q2);
        calculate_F_from_Q();
    }

    private void generate_B1_and_B2(SecureRandom secureRandom) {
        int i10 = this.f20405o1;
        int i11 = this.f20411v1;
        this.l1_Q1 = RainbowUtil.generate_random(secureRandom, i10, i11, i11, true);
        int i12 = this.f20405o1;
        this.l1_Q2 = RainbowUtil.generate_random(secureRandom, i12, this.f20411v1, i12, false);
        int i13 = this.f20406o2;
        int i14 = this.f20411v1;
        this.l2_Q1 = RainbowUtil.generate_random(secureRandom, i13, i14, i14, true);
        this.l2_Q2 = RainbowUtil.generate_random(secureRandom, this.f20406o2, this.f20411v1, this.f20405o1, false);
        int i15 = this.f20406o2;
        this.l2_Q3 = RainbowUtil.generate_random(secureRandom, i15, this.f20411v1, i15, false);
        int i16 = this.f20406o2;
        int i17 = this.f20405o1;
        this.l2_Q5 = RainbowUtil.generate_random(secureRandom, i16, i17, i17, true);
        int i18 = this.f20406o2;
        this.l2_Q6 = RainbowUtil.generate_random(secureRandom, i18, this.f20405o1, i18, false);
    }

    private void generate_S_and_T(SecureRandom secureRandom) {
        this.f20407s1 = RainbowUtil.generate_random_2d(secureRandom, this.f20405o1, this.f20406o2);
        this.f20408t1 = RainbowUtil.generate_random_2d(secureRandom, this.f20411v1, this.f20405o1);
        this.f20409t2 = RainbowUtil.generate_random_2d(secureRandom, this.f20411v1, this.f20406o2);
        this.t3 = RainbowUtil.generate_random_2d(secureRandom, this.f20405o1, this.f20406o2);
    }

    public AsymmetricCipherKeyPair genKeyPairCircumzenithal() throws RuntimeException {
        genKeyMaterial_cyclic();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.pk_seed, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f20407s1, this.f20408t1, this.t3, this.f20410t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, rainbowPublicKeyParameters.getEncoded()));
    }

    public AsymmetricCipherKeyPair genKeyPairClassical() throws RuntimeException {
        genKeyMaterial();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.l1_Q1, this.l1_Q2, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q1, this.l2_Q2, this.l2_Q3, this.l2_Q5, this.l2_Q6, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f20407s1, this.f20408t1, this.t3, this.f20410t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, rainbowPublicKeyParameters.getEncoded()));
    }

    public AsymmetricCipherKeyPair genKeyPairCompressed() throws RuntimeException {
        genKeyMaterial_cyclic();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.pk_seed, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.pk_seed, this.sk_seed, rainbowPublicKeyParameters.getEncoded()));
    }

    public RainbowPrivateKeyParameters generatePrivateKey() {
        this.sk_seed = Arrays.clone(this.sk_seed);
        this.pk_seed = Arrays.clone(this.pk_seed);
        genPrivateKeyMaterial_cyclic();
        return new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f20407s1, this.f20408t1, this.t3, this.f20410t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, null);
    }

    public RainbowKeyComputation(RainbowParameters rainbowParameters, byte[] bArr, byte[] bArr2) {
        this.f20404cf = new ComputeInField();
        this.rainbowParams = rainbowParameters;
        this.random = null;
        this.version = rainbowParameters.getVersion();
        this.pk_seed = bArr;
        this.sk_seed = bArr2;
        this.f20411v1 = this.rainbowParams.getV1();
        this.f20405o1 = this.rainbowParams.getO1();
        this.f20406o2 = this.rainbowParams.getO2();
    }
}
