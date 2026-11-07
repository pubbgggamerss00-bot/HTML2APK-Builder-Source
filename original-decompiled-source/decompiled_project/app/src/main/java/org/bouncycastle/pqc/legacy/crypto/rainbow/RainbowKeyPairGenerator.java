package org.bouncycastle.pqc.legacy.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field;

/* loaded from: classes3.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private short[][] A1;
    private short[][] A1inv;
    private short[][] A2;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f20525b1;

    /* renamed from: b2, reason: collision with root package name */
    private short[] f20526b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;
    private SecureRandom sr;
    private int[] vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length, ((length2 + 1) * length2) / 2);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < length2; i12++) {
                for (int i13 = i12; i13 < length2; i13++) {
                    short[][] sArr2 = this.pub_quadratic;
                    if (i13 == i12) {
                        sArr2[i10][i11] = sArr[i10][i12][i13];
                    } else {
                        short[] sArr3 = sArr2[i10];
                        short[][] sArr4 = sArr[i10];
                        sArr3[i11] = GF2Field.addElem(sArr4[i12][i13], sArr4[i13][i12]);
                    }
                    i11++;
                }
            }
        }
    }

    private void computePublicKey() {
        int i10;
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.vi;
        boolean z10 = true;
        int i11 = 0;
        int i12 = iArr[iArr.length - 1] - iArr[0];
        int i13 = iArr[iArr.length - 1];
        int i14 = 3;
        int i15 = 2;
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i12, i13, i13);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) cls, i12, i13);
        this.pub_scalar = new short[i12];
        short[] sArr2 = new short[i13];
        int i16 = 0;
        int i17 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i16 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i16].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i16].getCoeffBeta();
            short[][] coeffGamma = this.layers[i16].getCoeffGamma();
            short[] coeffEta = this.layers[i16].getCoeffEta();
            boolean z11 = z10;
            int length = coeffAlpha[i11].length;
            int i18 = i11;
            int length2 = coeffBeta[i18].length;
            int i19 = i15;
            int i20 = i18;
            while (i20 < length) {
                int i21 = i18;
                while (true) {
                    i10 = i13;
                    if (i21 >= length) {
                        break;
                    }
                    int i22 = i18;
                    while (i22 < length2) {
                        int i23 = i22;
                        int i24 = length;
                        int i25 = i21 + length2;
                        short[] sArrMultVect = computeInField.multVect(coeffAlpha[i20][i21][i23], this.A2[i25]);
                        int i26 = i17 + i20;
                        int i27 = i21;
                        sArr[i26] = computeInField.addSquareMatrix(sArr[i26], computeInField.multVects(sArrMultVect, this.A2[i23]));
                        short[] sArrMultVect2 = computeInField.multVect(this.f20526b2[i23], sArrMultVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i26] = computeInField.addVect(sArrMultVect2, sArr3[i26]);
                        short[] sArrMultVect3 = computeInField.multVect(this.f20526b2[i25], computeInField.multVect(coeffAlpha[i20][i27][i23], this.A2[i23]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i26] = computeInField.addVect(sArrMultVect3, sArr4[i26]);
                        short sMultElem = GF2Field.multElem(coeffAlpha[i20][i27][i23], this.f20526b2[i25]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i26] = GF2Field.addElem(sArr5[i26], GF2Field.multElem(sMultElem, this.f20526b2[i23]));
                        i22 = i23 + 1;
                        length = i24;
                        i21 = i27;
                    }
                    i21++;
                    i13 = i10;
                }
                int i28 = length;
                int i29 = i18;
                while (i29 < length2) {
                    int i30 = i18;
                    while (i30 < length2) {
                        int i31 = i29;
                        short[] sArrMultVect4 = computeInField.multVect(coeffBeta[i20][i29][i30], this.A2[i31]);
                        int i32 = i17 + i20;
                        int i33 = i30;
                        sArr[i32] = computeInField.addSquareMatrix(sArr[i32], computeInField.multVects(sArrMultVect4, this.A2[i33]));
                        short[] sArrMultVect5 = computeInField.multVect(this.f20526b2[i33], sArrMultVect4);
                        short[][] sArr6 = this.pub_singular;
                        sArr6[i32] = computeInField.addVect(sArrMultVect5, sArr6[i32]);
                        short[] sArrMultVect6 = computeInField.multVect(this.f20526b2[i31], computeInField.multVect(coeffBeta[i20][i31][i33], this.A2[i33]));
                        short[][] sArr7 = this.pub_singular;
                        sArr7[i32] = computeInField.addVect(sArrMultVect6, sArr7[i32]);
                        short sMultElem2 = GF2Field.multElem(coeffBeta[i20][i31][i33], this.f20526b2[i31]);
                        short[] sArr8 = this.pub_scalar;
                        sArr8[i32] = GF2Field.addElem(sArr8[i32], GF2Field.multElem(sMultElem2, this.f20526b2[i33]));
                        i30 = i33 + 1;
                        i29 = i31;
                        length2 = length2;
                    }
                    i29++;
                }
                int i34 = length2;
                int i35 = i18;
                while (i35 < i34 + i28) {
                    short[] sArrMultVect7 = computeInField.multVect(coeffGamma[i20][i35], this.A2[i35]);
                    short[][] sArr9 = this.pub_singular;
                    int i36 = i17 + i20;
                    int i37 = i35;
                    sArr9[i36] = computeInField.addVect(sArrMultVect7, sArr9[i36]);
                    short[] sArr10 = this.pub_scalar;
                    sArr10[i36] = GF2Field.addElem(sArr10[i36], GF2Field.multElem(coeffGamma[i20][i37], this.f20526b2[i37]));
                    i35 = i37 + 1;
                }
                short[] sArr11 = this.pub_scalar;
                int i38 = i17 + i20;
                sArr11[i38] = GF2Field.addElem(sArr11[i38], coeffEta[i20]);
                i20++;
                i13 = i10;
                length = i28;
                length2 = i34;
            }
            i17 += length;
            i16++;
            z10 = z11;
            i11 = i18;
            i15 = i19;
            i14 = 3;
        }
        int i39 = i13;
        boolean z12 = z10;
        int i40 = i11;
        int i41 = i15;
        int[] iArr2 = new int[i14];
        iArr2[i41] = i39;
        iArr2[z12 ? 1 : 0] = i39;
        iArr2[i40] = i12;
        short[][][] sArr12 = (short[][][]) Array.newInstance((Class<?>) cls, iArr2);
        int[] iArr3 = new int[i41];
        iArr3[z12 ? 1 : 0] = i39;
        iArr3[i40] = i12;
        short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) cls, iArr3);
        short[] sArr14 = new short[i12];
        for (int i42 = i40; i42 < i12; i42++) {
            int i43 = i40;
            while (true) {
                short[][] sArr15 = this.A1;
                if (i43 < sArr15.length) {
                    sArr12[i42] = computeInField.addSquareMatrix(sArr12[i42], computeInField.multMatrix(sArr15[i42][i43], sArr[i43]));
                    sArr13[i42] = computeInField.addVect(sArr13[i42], computeInField.multVect(this.A1[i42][i43], this.pub_singular[i43]));
                    sArr14[i42] = GF2Field.addElem(sArr14[i42], GF2Field.multElem(this.A1[i42][i43], this.pub_scalar[i43]));
                    i43++;
                }
            }
            sArr14[i42] = GF2Field.addElem(sArr14[i42], this.f20525b1[i42]);
        }
        this.pub_singular = sArr13;
        this.pub_scalar = sArr14;
        compactPublicKey(sArr12);
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i10 = 0;
        while (i10 < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.vi;
            int i11 = i10 + 1;
            layerArr[i10] = new Layer(iArr[i10], iArr[i11], this.sr);
            i10 = i11;
        }
    }

    private void generateL1() {
        int[] iArr = this.vi;
        int i10 = iArr[iArr.length - 1] - iArr[0];
        this.A1 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i10, i10);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < i10; i12++) {
                    this.A1[i11][i12] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.A1);
        }
        this.f20525b1 = new short[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            this.f20525b1[i13] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.vi;
        int i10 = iArr[iArr.length - 1];
        this.A2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i10, i10);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < i10; i12++) {
                    this.A2[i11][i12] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.A2);
        }
        this.f20526b2 = new short[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            this.f20526b2[i13] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f20525b1, this.A2inv, this.f20526b2, this.vi, this.layers);
        int[] iArr = this.vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        RainbowKeyGenerationParameters rainbowKeyGenerationParameters = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.rainbowParams = rainbowKeyGenerationParameters;
        this.sr = rainbowKeyGenerationParameters.getRandom();
        this.vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }
}
