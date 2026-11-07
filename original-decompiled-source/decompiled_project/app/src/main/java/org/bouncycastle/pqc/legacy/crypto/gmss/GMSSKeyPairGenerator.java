package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;

/* loaded from: classes3.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";
    private int[] K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() {
        int i10;
        Class cls;
        int i11;
        if (!this.initialized) {
            initializeDefault();
        }
        int i12 = this.numLayer;
        byte[][][] bArr = new byte[i12][][];
        byte[][][] bArr2 = new byte[i12 - 1][][];
        Treehash[][] treehashArr = new Treehash[i12][];
        Treehash[][] treehashArr2 = new Treehash[i12 - 1][];
        Vector[] vectorArr = new Vector[i12];
        Vector[] vectorArr2 = new Vector[i12 - 1];
        Vector[][] vectorArr3 = new Vector[i12][];
        boolean z10 = true;
        Vector[][] vectorArr4 = new Vector[i12 - 1][];
        int i13 = 0;
        while (true) {
            i10 = this.numLayer;
            cls = Byte.TYPE;
            if (i13 >= i10) {
                break;
            }
            int i14 = this.heightOfTrees[i13];
            boolean z11 = z10;
            int[] iArr = new int[2];
            iArr[z11 ? 1 : 0] = this.mdLength;
            iArr[0] = i14;
            bArr[i13] = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
            int i15 = this.heightOfTrees[i13];
            treehashArr[i13] = new Treehash[i15 - this.K[i13]];
            if (i13 > 0) {
                int i16 = i13 - 1;
                int[] iArr2 = new int[2];
                iArr2[z11 ? 1 : 0] = this.mdLength;
                iArr2[0] = i15;
                bArr2[i16] = (byte[][]) Array.newInstance((Class<?>) cls, iArr2);
                treehashArr2[i16] = new Treehash[this.heightOfTrees[i13] - this.K[i13]];
            }
            vectorArr[i13] = new Vector();
            if (i13 > 0) {
                vectorArr2[i13 - 1] = new Vector();
            }
            i13++;
            z10 = z11 ? 1 : 0;
        }
        boolean z12 = z10;
        int[] iArr3 = new int[2];
        iArr3[z12 ? 1 : 0] = this.mdLength;
        iArr3[0] = i10;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr3);
        int i17 = this.numLayer - 1;
        int[] iArr4 = new int[2];
        iArr4[z12 ? 1 : 0] = this.mdLength;
        iArr4[0] = i17;
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        int i18 = this.numLayer;
        int[] iArr5 = new int[2];
        iArr5[z12 ? 1 : 0] = this.mdLength;
        iArr5[0] = i18;
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) cls, iArr5);
        int i19 = 0;
        while (true) {
            i11 = this.numLayer;
            if (i19 >= i11) {
                break;
            }
            System.arraycopy(this.currentSeeds[i19], 0, bArr5[i19], 0, this.mdLength);
            i19++;
            bArr5 = bArr5;
            bArr3 = bArr3;
        }
        byte[][] bArr6 = bArr5;
        byte[][] bArr7 = bArr3;
        int[] iArr6 = new int[2];
        iArr6[z12 ? 1 : 0] = this.mdLength;
        iArr6[0] = i11 - 1;
        this.currentRootSigs = (byte[][]) Array.newInstance((Class<?>) cls, iArr6);
        int i20 = this.numLayer - 1;
        while (i20 >= 0) {
            GMSSRootCalc gMSSRootCalcGenerateCurrentAuthpathAndRoot = i20 == this.numLayer + (-1) ? generateCurrentAuthpathAndRoot(null, vectorArr[i20], bArr6[i20], i20) : generateCurrentAuthpathAndRoot(bArr7[i20 + 1], vectorArr[i20], bArr6[i20], i20);
            int i21 = 0;
            while (i21 < this.heightOfTrees[i20]) {
                System.arraycopy(gMSSRootCalcGenerateCurrentAuthpathAndRoot.getAuthPath()[i21], 0, bArr[i20][i21], 0, this.mdLength);
                i21++;
                i20 = i20;
            }
            int i22 = i20;
            vectorArr3[i22] = gMSSRootCalcGenerateCurrentAuthpathAndRoot.getRetain();
            treehashArr[i22] = gMSSRootCalcGenerateCurrentAuthpathAndRoot.getTreehash();
            System.arraycopy(gMSSRootCalcGenerateCurrentAuthpathAndRoot.getRoot(), 0, bArr7[i22], 0, this.mdLength);
            i20 = i22 - 1;
        }
        int i23 = this.numLayer - 2;
        while (i23 >= 0) {
            int i24 = i23 + 1;
            GMSSRootCalc gMSSRootCalcGenerateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i23], bArr6[i24], i24);
            int i25 = 0;
            while (i25 < this.heightOfTrees[i24]) {
                System.arraycopy(gMSSRootCalcGenerateNextAuthpathAndRoot.getAuthPath()[i25], 0, bArr2[i23][i25], 0, this.mdLength);
                i25++;
                i23 = i23;
                gMSSRootCalcGenerateNextAuthpathAndRoot = gMSSRootCalcGenerateNextAuthpathAndRoot;
            }
            int i26 = i23;
            GMSSRootCalc gMSSRootCalc = gMSSRootCalcGenerateNextAuthpathAndRoot;
            vectorArr4[i26] = gMSSRootCalc.getRetain();
            treehashArr2[i26] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr4[i26], 0, this.mdLength);
            System.arraycopy(bArr6[i24], 0, this.nextNextSeeds[i26], 0, this.mdLength);
            i23 = i26 - 1;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr7[0], this.gmssPS), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.currentSeeds, this.nextNextSeeds, bArr, bArr2, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, bArr4, this.currentRootSigs, this.gmssPS, this.digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i10) {
        byte[] bArrVerify;
        int i11 = this.mdLength;
        byte[] bArr3 = new byte[i11];
        byte[] bArr4 = new byte[i11];
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i10], this.K[i10], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        if (i10 == this.numLayer - 1) {
            bArrVerify = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i10]).getPublicKey();
        } else {
            this.currentRootSigs[i10] = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i10]).getSignature(bArr);
            bArrVerify = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i10]).Verify(bArr, this.currentRootSigs[i10]);
        }
        gMSSRootCalc.update(bArrVerify);
        int i12 = 3;
        int i13 = 0;
        int i14 = 1;
        while (true) {
            int i15 = this.heightOfTrees[i10];
            if (i14 >= (1 << i15)) {
                break;
            }
            if (i14 == i12 && i13 < i15 - this.K[i10]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i13);
                i12 *= 2;
                i13++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i10]).getPublicKey());
            i14++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i10) {
        byte[] bArr2 = new byte[this.numLayer];
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i10], this.K[i10], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i11 = 3;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.heightOfTrees[i10];
            if (i12 >= (1 << i14)) {
                break;
            }
            if (i12 == i11 && i13 < i14 - this.K[i10]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i13);
                i11 *= 2;
                i13++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i10]).getPublicKey());
            i12++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private void initializeDefault() {
        initialize(new GMSSKeyGenerationParameters(null, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(int i10, SecureRandom secureRandom) {
        initialize(i10 <= 10 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2})) : i10 <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2})));
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.gmssParams = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.K = this.gmssPS.getK();
        int[] iArr = {this.numLayer, this.mdLength};
        Class cls = Byte.TYPE;
        this.currentSeeds = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
        this.nextNextSeeds = (byte[][]) Array.newInstance((Class<?>) cls, this.numLayer - 1, this.mdLength);
        SecureRandom random = keyGenerationParameters.getRandom();
        for (int i10 = 0; i10 < this.numLayer; i10++) {
            random.nextBytes(this.currentSeeds[i10]);
            this.gmssRandom.nextSeed(this.currentSeeds[i10]);
        }
        this.initialized = true;
    }
}
