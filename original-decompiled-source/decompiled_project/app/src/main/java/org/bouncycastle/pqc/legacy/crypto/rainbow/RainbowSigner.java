package org.bouncycastle.pqc.legacy.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field;

/* loaded from: classes3.dex */
public class RainbowSigner implements MessageSigner {
    private static final int MAXITS = 65536;

    /* renamed from: cf, reason: collision with root package name */
    private ComputeInField f20529cf = new ComputeInField();
    RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;

    /* renamed from: x, reason: collision with root package name */
    private short[] f20530x;

    private short[] initSign(Layer[] layerArr, short[] sArr) throws RuntimeException {
        short[] sArr2 = new short[sArr.length];
        short[] sArrMultiplyMatrix = this.f20529cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA1(), this.f20529cf.addVect(((RainbowPrivateKeyParameters) this.key).getB1(), sArr));
        for (int i10 = 0; i10 < layerArr[0].getVi(); i10++) {
            this.f20530x[i10] = (short) this.random.nextInt();
            short[] sArr3 = this.f20530x;
            sArr3[i10] = (short) (sArr3[i10] & 255);
        }
        return sArrMultiplyMatrix;
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i10 = this.signableDocumentLength;
        short[] sArr = new short[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            short s10 = bArr[i12];
            sArr[i11] = s10;
            sArr[i11] = (short) (s10 & 255);
            i12++;
            i11++;
            if (i11 >= i10) {
                break;
            }
        }
        return sArr;
    }

    private short[] verifySignatureIntern(short[] sArr) {
        short[][] coeffQuadratic = ((RainbowPublicKeyParameters) this.key).getCoeffQuadratic();
        short[][] coeffSingular = ((RainbowPublicKeyParameters) this.key).getCoeffSingular();
        short[] coeffScalar = ((RainbowPublicKeyParameters) this.key).getCoeffScalar();
        short[] sArr2 = new short[coeffQuadratic.length];
        int length = coeffSingular[0].length;
        for (int i10 = 0; i10 < coeffQuadratic.length; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                for (int i13 = i12; i13 < length; i13++) {
                    sArr2[i10] = GF2Field.addElem(sArr2[i10], GF2Field.multElem(coeffQuadratic[i10][i11], GF2Field.multElem(sArr[i12], sArr[i13])));
                    i11++;
                }
                sArr2[i10] = GF2Field.addElem(sArr2[i10], GF2Field.multElem(coeffSingular[i10][i12], sArr[i12]));
            }
            sArr2[i10] = GF2Field.addElem(sArr2[i10], coeffScalar[i10]);
        }
        return sArr2;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) throws Exception {
        Layer[] layers = ((RainbowPrivateKeyParameters) this.key).getLayers();
        int length = layers.length;
        this.f20530x = new short[((RainbowPrivateKeyParameters) this.key).getInvA2().length];
        int viNext = layers[length - 1].getViNext();
        byte[] bArr2 = new byte[viNext];
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(bArr);
        int i10 = 0;
        while (true) {
            try {
                short[] sArrInitSign = initSign(layers, sArrMakeMessageRepresentative);
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    short[] sArr = new short[layers[i12].getOi()];
                    short[] sArr2 = new short[layers[i12].getOi()];
                    for (int i13 = 0; i13 < layers[i12].getOi(); i13++) {
                        sArr[i13] = sArrInitSign[i11];
                        i11++;
                    }
                    short[] sArrSolveEquation = this.f20529cf.solveEquation(layers[i12].plugInVinegars(this.f20530x), sArr);
                    if (sArrSolveEquation == null) {
                        throw new Exception("LES is not solveable!");
                    }
                    for (int i14 = 0; i14 < sArrSolveEquation.length; i14++) {
                        this.f20530x[layers[i12].getVi() + i14] = sArrSolveEquation[i14];
                    }
                }
                short[] sArrMultiplyMatrix = this.f20529cf.multiplyMatrix(((RainbowPrivateKeyParameters) this.key).getInvA2(), this.f20529cf.addVect(((RainbowPrivateKeyParameters) this.key).getB2(), this.f20530x));
                for (int i15 = 0; i15 < viNext; i15++) {
                    bArr2[i15] = (byte) sArrMultiplyMatrix[i15];
                }
            } catch (Exception unused) {
                i10++;
                if (i10 >= 65536) {
                    break;
                }
            }
        }
        if (i10 != 65536) {
            return bArr2;
        }
        throw new IllegalStateException("unable to generate signature - LES not solvable");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        RainbowKeyParameters rainbowKeyParameters;
        if (!z10) {
            rainbowKeyParameters = (RainbowPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                this.key = (RainbowPrivateKeyParameters) parametersWithRandom.getParameters();
                this.signableDocumentLength = this.key.getDocLength();
            }
            this.random = CryptoServicesRegistrar.getSecureRandom();
            rainbowKeyParameters = (RainbowPrivateKeyParameters) cipherParameters;
        }
        this.key = rainbowKeyParameters;
        this.signableDocumentLength = this.key.getDocLength();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArr = new short[bArr2.length];
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            sArr[i10] = (short) (bArr2[i10] & 255);
        }
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(bArr);
        short[] sArrVerifySignatureIntern = verifySignatureIntern(sArr);
        if (sArrMakeMessageRepresentative.length != sArrVerifySignatureIntern.length) {
            return false;
        }
        boolean z10 = true;
        for (int i11 = 0; i11 < sArrMakeMessageRepresentative.length; i11++) {
            z10 = z10 && sArrMakeMessageRepresentative[i11] == sArrVerifySignatureIntern[i11];
        }
        return z10;
    }
}
