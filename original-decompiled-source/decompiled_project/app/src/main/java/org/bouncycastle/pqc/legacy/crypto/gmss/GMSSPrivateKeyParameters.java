package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;
import r1.f;

/* loaded from: classes3.dex */
public class GMSSPrivateKeyParameters extends GMSSKeyParameters {
    private int[] K;
    private byte[][][] currentAuthPaths;
    private Vector[][] currentRetain;
    private byte[][] currentRootSig;
    private byte[][] currentSeeds;
    private Vector[] currentStack;
    private Treehash[][] currentTreehash;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private int[] index;
    private byte[][][] keep;
    private int mdLength;
    private Digest messDigestTrees;
    private int[] minTreehash;
    private byte[][][] nextAuthPaths;
    private GMSSLeaf[] nextNextLeaf;
    private GMSSRootCalc[] nextNextRoot;
    private byte[][] nextNextSeeds;
    private Vector[][] nextRetain;
    private byte[][] nextRoot;
    private GMSSRootSig[] nextRootSig;
    private Vector[] nextStack;
    private Treehash[][] nextTreehash;
    private int numLayer;
    private int[] numLeafs;
    private int[] otsIndex;
    private GMSSLeaf[] upperLeaf;
    private GMSSLeaf[] upperTreehashLeaf;
    private boolean used;

    private GMSSPrivateKeyParameters(GMSSPrivateKeyParameters gMSSPrivateKeyParameters) {
        super(true, gMSSPrivateKeyParameters.getParameters());
        this.used = false;
        this.index = Arrays.clone(gMSSPrivateKeyParameters.index);
        this.currentSeeds = Arrays.clone(gMSSPrivateKeyParameters.currentSeeds);
        this.nextNextSeeds = Arrays.clone(gMSSPrivateKeyParameters.nextNextSeeds);
        this.currentAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.currentAuthPaths);
        this.nextAuthPaths = Arrays.clone(gMSSPrivateKeyParameters.nextAuthPaths);
        this.currentTreehash = gMSSPrivateKeyParameters.currentTreehash;
        this.nextTreehash = gMSSPrivateKeyParameters.nextTreehash;
        this.currentStack = gMSSPrivateKeyParameters.currentStack;
        this.nextStack = gMSSPrivateKeyParameters.nextStack;
        this.currentRetain = gMSSPrivateKeyParameters.currentRetain;
        this.nextRetain = gMSSPrivateKeyParameters.nextRetain;
        this.keep = Arrays.clone(gMSSPrivateKeyParameters.keep);
        this.nextNextLeaf = gMSSPrivateKeyParameters.nextNextLeaf;
        this.upperLeaf = gMSSPrivateKeyParameters.upperLeaf;
        this.upperTreehashLeaf = gMSSPrivateKeyParameters.upperTreehashLeaf;
        this.minTreehash = gMSSPrivateKeyParameters.minTreehash;
        this.gmssPS = gMSSPrivateKeyParameters.gmssPS;
        this.nextRoot = Arrays.clone(gMSSPrivateKeyParameters.nextRoot);
        this.nextNextRoot = gMSSPrivateKeyParameters.nextNextRoot;
        this.currentRootSig = gMSSPrivateKeyParameters.currentRootSig;
        this.nextRootSig = gMSSPrivateKeyParameters.nextRootSig;
        this.digestProvider = gMSSPrivateKeyParameters.digestProvider;
        this.heightOfTrees = gMSSPrivateKeyParameters.heightOfTrees;
        this.otsIndex = gMSSPrivateKeyParameters.otsIndex;
        this.K = gMSSPrivateKeyParameters.K;
        this.numLayer = gMSSPrivateKeyParameters.numLayer;
        this.messDigestTrees = gMSSPrivateKeyParameters.messDigestTrees;
        this.mdLength = gMSSPrivateKeyParameters.mdLength;
        this.gmssRandom = gMSSPrivateKeyParameters.gmssRandom;
        this.numLeafs = gMSSPrivateKeyParameters.numLeafs;
    }

    private void computeAuthPaths(int i10) {
        int i11;
        byte[] publicKey;
        int i12 = this.index[i10];
        int i13 = this.heightOfTrees[i10];
        int i14 = this.K[i10];
        int i15 = 0;
        while (true) {
            i11 = i13 - i14;
            if (i15 >= i11) {
                break;
            }
            this.currentTreehash[i10][i15].updateNextSeed(this.gmssRandom);
            i15++;
        }
        int iHeightOfPhi = heightOfPhi(i12);
        byte[] bArr = new byte[this.mdLength];
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(this.currentSeeds[i10]);
        int i16 = (i12 >>> (iHeightOfPhi + 1)) & 1;
        int i17 = this.mdLength;
        byte[] bArr2 = new byte[i17];
        int i18 = i13 - 1;
        if (iHeightOfPhi < i18 && i16 == 0) {
            System.arraycopy(this.currentAuthPaths[i10][iHeightOfPhi], 0, bArr2, 0, i17);
        }
        int i19 = this.mdLength;
        byte[] bArr3 = new byte[i19];
        if (iHeightOfPhi == 0) {
            if (i10 == this.numLayer - 1) {
                publicKey = new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i10]).getPublicKey();
            } else {
                byte[] bArr4 = new byte[i19];
                System.arraycopy(this.currentSeeds[i10], 0, bArr4, 0, i19);
                this.gmssRandom.nextSeed(bArr4);
                byte[] leaf = this.upperLeaf[i10].getLeaf();
                this.upperLeaf[i10].initLeafCalc(bArr4);
                publicKey = leaf;
            }
            System.arraycopy(publicKey, 0, this.currentAuthPaths[i10][0], 0, this.mdLength);
        } else {
            int i20 = i19 << 1;
            byte[] bArr5 = new byte[i20];
            System.arraycopy(this.currentAuthPaths[i10][iHeightOfPhi - 1], 0, bArr5, 0, i19);
            byte[] bArr6 = this.keep[i10][(int) Math.floor(r12 / 2)];
            int i21 = this.mdLength;
            System.arraycopy(bArr6, 0, bArr5, i21, i21);
            this.messDigestTrees.update(bArr5, 0, i20);
            this.currentAuthPaths[i10][iHeightOfPhi] = new byte[this.messDigestTrees.getDigestSize()];
            this.messDigestTrees.doFinal(this.currentAuthPaths[i10][iHeightOfPhi], 0);
            for (int i22 = 0; i22 < iHeightOfPhi; i22++) {
                if (i22 < i11) {
                    if (this.currentTreehash[i10][i22].wasFinished()) {
                        System.arraycopy(this.currentTreehash[i10][i22].getFirstNode(), 0, this.currentAuthPaths[i10][i22], 0, this.mdLength);
                        this.currentTreehash[i10][i22].destroy();
                    } else {
                        System.err.println(f.a(i10, i22, "Treehash (", ",", ") not finished when needed in AuthPathComputation"));
                    }
                }
                if (i22 < i18 && i22 >= i11) {
                    int i23 = i22 - i11;
                    if (this.currentRetain[i10][i23].size() > 0) {
                        System.arraycopy(this.currentRetain[i10][i23].lastElement(), 0, this.currentAuthPaths[i10][i22], 0, this.mdLength);
                        Vector vector = this.currentRetain[i10][i23];
                        vector.removeElementAt(vector.size() - 1);
                    }
                }
                if (i22 < i11 && ((1 << i22) * 3) + i12 < this.numLeafs[i10]) {
                    this.currentTreehash[i10][i22].initialize();
                }
            }
        }
        if (iHeightOfPhi < i18 && i16 == 0) {
            System.arraycopy(bArr2, 0, this.keep[i10][(int) Math.floor(iHeightOfPhi / 2)], 0, this.mdLength);
        }
        if (i10 != this.numLayer - 1) {
            this.minTreehash[i10] = getMinTreehashIndex(i10);
            return;
        }
        for (int i24 = 1; i24 <= i11 / 2; i24++) {
            int minTreehashIndex = getMinTreehashIndex(i10);
            if (minTreehashIndex >= 0) {
                try {
                    byte[] bArr7 = new byte[this.mdLength];
                    System.arraycopy(this.currentTreehash[i10][minTreehashIndex].getSeedActive(), 0, bArr7, 0, this.mdLength);
                    this.currentTreehash[i10][minTreehashIndex].update(this.gmssRandom, new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr7), this.digestProvider.get(), this.otsIndex[i10]).getPublicKey());
                } catch (Exception e10) {
                    System.out.println(e10);
                }
            }
        }
    }

    private int getMinTreehashIndex(int i10) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.heightOfTrees[i10] - this.K[i10]; i12++) {
            if (this.currentTreehash[i10][i12].wasInitialized() && !this.currentTreehash[i10][i12].wasFinished() && (i11 == -1 || this.currentTreehash[i10][i12].getLowestNodeHeight() < this.currentTreehash[i10][i11].getLowestNodeHeight())) {
                i11 = i12;
            }
        }
        return i11;
    }

    private int heightOfPhi(int i10) {
        if (i10 == 0) {
            return -1;
        }
        int i11 = 0;
        int i12 = 1;
        while (i10 % i12 == 0) {
            i12 *= 2;
            i11++;
        }
        return i11 - 1;
    }

    private void nextTree(int i10) {
        if (i10 > 0) {
            int[] iArr = this.index;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            int i12 = i10;
            boolean z10 = true;
            do {
                i12--;
                if (this.index[i12] < this.numLeafs[i12]) {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
            } while (i12 > 0);
            if (z10) {
                return;
            }
            this.gmssRandom.nextSeed(this.currentSeeds[i10]);
            this.nextRootSig[i11].updateSign();
            if (i10 > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i13 = i10 - 2;
                gMSSLeafArr[i13] = gMSSLeafArr[i13].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            gMSSLeafArr2[i11] = gMSSLeafArr2[i11].nextLeaf();
            if (this.minTreehash[i11] >= 0) {
                GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                gMSSLeafArr3[i11] = gMSSLeafArr3[i11].nextLeaf();
                try {
                    this.currentTreehash[i11][this.minTreehash[i11]].update(this.gmssRandom, this.upperTreehashLeaf[i11].getLeaf());
                    this.currentTreehash[i11][this.minTreehash[i11]].wasFinished();
                } catch (Exception e10) {
                    System.out.println(e10);
                }
            }
            updateNextNextAuthRoot(i10);
            this.currentRootSig[i11] = this.nextRootSig[i11].getSig();
            for (int i14 = 0; i14 < this.heightOfTrees[i10] - this.K[i10]; i14++) {
                Treehash[] treehashArr = this.currentTreehash[i10];
                Treehash[][] treehashArr2 = this.nextTreehash;
                treehashArr[i14] = treehashArr2[i11][i14];
                treehashArr2[i11][i14] = this.nextNextRoot[i11].getTreehash()[i14];
            }
            for (int i15 = 0; i15 < this.heightOfTrees[i10]; i15++) {
                System.arraycopy(this.nextAuthPaths[i11][i15], 0, this.currentAuthPaths[i10][i15], 0, this.mdLength);
                System.arraycopy(this.nextNextRoot[i11].getAuthPath()[i15], 0, this.nextAuthPaths[i11][i15], 0, this.mdLength);
            }
            for (int i16 = 0; i16 < this.K[i10] - 1; i16++) {
                Vector[] vectorArr = this.currentRetain[i10];
                Vector[][] vectorArr2 = this.nextRetain;
                vectorArr[i16] = vectorArr2[i11][i16];
                vectorArr2[i11][i16] = this.nextNextRoot[i11].getRetain()[i16];
            }
            Vector[] vectorArr3 = this.currentStack;
            Vector[] vectorArr4 = this.nextStack;
            vectorArr3[i10] = vectorArr4[i11];
            vectorArr4[i11] = this.nextNextRoot[i11].getStack();
            this.nextRoot[i11] = this.nextNextRoot[i11].getRoot();
            int i17 = this.mdLength;
            byte[] bArr = new byte[i17];
            byte[] bArr2 = new byte[i17];
            System.arraycopy(this.currentSeeds[i11], 0, bArr2, 0, i17);
            this.gmssRandom.nextSeed(bArr2);
            this.gmssRandom.nextSeed(bArr2);
            this.nextRootSig[i11].initSign(this.gmssRandom.nextSeed(bArr2), this.nextRoot[i11]);
            nextKey(i11);
        }
    }

    private void updateKey(int i10) {
        computeAuthPaths(i10);
        if (i10 > 0) {
            if (i10 > 1) {
                GMSSLeaf[] gMSSLeafArr = this.nextNextLeaf;
                int i11 = i10 - 2;
                gMSSLeafArr[i11] = gMSSLeafArr[i11].nextLeaf();
            }
            GMSSLeaf[] gMSSLeafArr2 = this.upperLeaf;
            int i12 = i10 - 1;
            gMSSLeafArr2[i12] = gMSSLeafArr2[i12].nextLeaf();
            int iFloor = (int) Math.floor((getNumLeafs(i10) * 2) / (this.heightOfTrees[i12] - this.K[i12]));
            int i13 = this.index[i10];
            if (i13 % iFloor == 1) {
                if (i13 > 1 && this.minTreehash[i12] >= 0) {
                    try {
                        this.currentTreehash[i12][this.minTreehash[i12]].update(this.gmssRandom, this.upperTreehashLeaf[i12].getLeaf());
                        this.currentTreehash[i12][this.minTreehash[i12]].wasFinished();
                    } catch (Exception e10) {
                        System.out.println(e10);
                    }
                }
                this.minTreehash[i12] = getMinTreehashIndex(i12);
                int i14 = this.minTreehash[i12];
                if (i14 >= 0) {
                    this.upperTreehashLeaf[i12] = new GMSSLeaf(this.digestProvider.get(), this.otsIndex[i12], iFloor, this.currentTreehash[i12][i14].getSeedActive());
                    GMSSLeaf[] gMSSLeafArr3 = this.upperTreehashLeaf;
                    gMSSLeafArr3[i12] = gMSSLeafArr3[i12].nextLeaf();
                }
            } else if (this.minTreehash[i12] >= 0) {
                GMSSLeaf[] gMSSLeafArr4 = this.upperTreehashLeaf;
                gMSSLeafArr4[i12] = gMSSLeafArr4[i12].nextLeaf();
            }
            this.nextRootSig[i12].updateSign();
            if (this.index[i10] == 1) {
                this.nextNextRoot[i12].initialize(new Vector());
            }
            updateNextNextAuthRoot(i10);
        }
    }

    private void updateNextNextAuthRoot(int i10) {
        byte[] bArr = new byte[this.mdLength];
        int i11 = i10 - 1;
        byte[] bArrNextSeed = this.gmssRandom.nextSeed(this.nextNextSeeds[i11]);
        if (i10 == this.numLayer - 1) {
            this.nextNextRoot[i11].update(this.nextNextSeeds[i11], new WinternitzOTSignature(bArrNextSeed, this.digestProvider.get(), this.otsIndex[i10]).getPublicKey());
        } else {
            this.nextNextRoot[i11].update(this.nextNextSeeds[i11], this.nextNextLeaf[i11].getLeaf());
            this.nextNextLeaf[i11].initLeafCalc(this.nextNextSeeds[i11]);
        }
    }

    public byte[][][] getCurrentAuthPaths() {
        return Arrays.clone(this.currentAuthPaths);
    }

    public byte[][] getCurrentSeeds() {
        return Arrays.clone(this.currentSeeds);
    }

    public int getIndex(int i10) {
        return this.index[i10];
    }

    public GMSSDigestProvider getName() {
        return this.digestProvider;
    }

    public int getNumLeafs(int i10) {
        return this.numLeafs[i10];
    }

    public byte[] getSubtreeRootSig(int i10) {
        return this.currentRootSig[i10];
    }

    public boolean isUsed() {
        return this.used;
    }

    public void markUsed() {
        this.used = true;
    }

    public GMSSPrivateKeyParameters nextKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = new GMSSPrivateKeyParameters(this);
        gMSSPrivateKeyParameters.nextKey(this.gmssPS.getNumOfLayers() - 1);
        return gMSSPrivateKeyParameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMSSPrivateKeyParameters(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        int i10;
        super(true, gMSSParameters);
        int i11 = 1;
        this.used = false;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTrees = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssPS = gMSSParameters;
        this.otsIndex = gMSSParameters.getWinternitzParameter();
        this.K = gMSSParameters.getK();
        this.heightOfTrees = gMSSParameters.getHeightOfTrees();
        int numOfLayers = this.gmssPS.getNumOfLayers();
        this.numLayer = numOfLayers;
        if (iArr == null) {
            this.index = new int[numOfLayers];
            for (int i12 = 0; i12 < this.numLayer; i12++) {
                this.index[i12] = 0;
            }
        } else {
            this.index = iArr;
        }
        this.currentSeeds = bArr;
        this.nextNextSeeds = bArr2;
        this.currentAuthPaths = Arrays.clone(bArr3);
        this.nextAuthPaths = bArr4;
        if (bArr5 == null) {
            this.keep = new byte[this.numLayer][][];
            int i13 = 0;
            while (i13 < this.numLayer) {
                byte[][][] bArr8 = this.keep;
                int i14 = i11;
                int iFloor = (int) Math.floor(this.heightOfTrees[i13] / 2);
                int[] iArr3 = new int[2];
                iArr3[i14] = this.mdLength;
                iArr3[0] = iFloor;
                bArr8[i13] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr3);
                i13++;
                i11 = i14;
            }
            i10 = i11;
        } else {
            i10 = 1;
            this.keep = bArr5;
        }
        if (vectorArr == null) {
            this.currentStack = new Vector[this.numLayer];
            for (int i15 = 0; i15 < this.numLayer; i15++) {
                this.currentStack[i15] = new Vector();
            }
        } else {
            this.currentStack = vectorArr;
        }
        if (vectorArr2 == null) {
            this.nextStack = new Vector[this.numLayer - 1];
            for (int i16 = 0; i16 < this.numLayer - 1; i16++) {
                this.nextStack[i16] = new Vector();
            }
        } else {
            this.nextStack = vectorArr2;
        }
        this.currentTreehash = treehashArr;
        this.nextTreehash = treehashArr2;
        this.currentRetain = vectorArr3;
        this.nextRetain = vectorArr4;
        this.nextRoot = bArr6;
        this.digestProvider = gMSSDigestProvider;
        if (gMSSRootCalcArr == null) {
            this.nextNextRoot = new GMSSRootCalc[this.numLayer - 1];
            int i17 = 0;
            while (i17 < this.numLayer - 1) {
                int i18 = i17 + 1;
                this.nextNextRoot[i17] = new GMSSRootCalc(this.heightOfTrees[i18], this.K[i18], this.digestProvider);
                i17 = i18;
            }
        } else {
            this.nextNextRoot = gMSSRootCalcArr;
        }
        this.currentRootSig = bArr7;
        this.numLeafs = new int[this.numLayer];
        for (int i19 = 0; i19 < this.numLayer; i19++) {
            this.numLeafs[i19] = i10 << this.heightOfTrees[i19];
        }
        this.gmssRandom = new GMSSRandom(this.messDigestTrees);
        int i20 = this.numLayer;
        if (i20 <= i10) {
            this.nextNextLeaf = new GMSSLeaf[0];
        } else if (gMSSLeafArr == null) {
            this.nextNextLeaf = new GMSSLeaf[i20 - 2];
            int i21 = 0;
            while (i21 < this.numLayer - 2) {
                int i22 = i21 + 1;
                this.nextNextLeaf[i21] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i22], this.numLeafs[i21 + 2], this.nextNextSeeds[i21]);
                i21 = i22;
            }
        } else {
            this.nextNextLeaf = gMSSLeafArr;
        }
        if (gMSSLeafArr2 == null) {
            this.upperLeaf = new GMSSLeaf[this.numLayer - 1];
            int i23 = 0;
            while (i23 < this.numLayer - 1) {
                int i24 = i23 + 1;
                this.upperLeaf[i23] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i23], this.numLeafs[i24], this.currentSeeds[i23]);
                i23 = i24;
            }
        } else {
            this.upperLeaf = gMSSLeafArr2;
        }
        if (gMSSLeafArr3 == null) {
            this.upperTreehashLeaf = new GMSSLeaf[this.numLayer - 1];
            int i25 = 0;
            while (i25 < this.numLayer - 1) {
                int i26 = i25 + 1;
                this.upperTreehashLeaf[i25] = new GMSSLeaf(gMSSDigestProvider.get(), this.otsIndex[i25], this.numLeafs[i26]);
                i25 = i26;
            }
        } else {
            this.upperTreehashLeaf = gMSSLeafArr3;
        }
        if (iArr2 == null) {
            this.minTreehash = new int[this.numLayer - 1];
            for (int i27 = 0; i27 < this.numLayer - 1; i27++) {
                this.minTreehash[i27] = -1;
            }
        } else {
            this.minTreehash = iArr2;
        }
        int i28 = this.mdLength;
        byte[] bArr9 = new byte[i28];
        byte[] bArr10 = new byte[i28];
        if (gMSSRootSigArr != null) {
            this.nextRootSig = gMSSRootSigArr;
            return;
        }
        this.nextRootSig = new GMSSRootSig[this.numLayer - 1];
        int i29 = 0;
        while (i29 < this.numLayer - 1) {
            System.arraycopy(bArr[i29], 0, bArr9, 0, this.mdLength);
            this.gmssRandom.nextSeed(bArr9);
            byte[] bArrNextSeed = this.gmssRandom.nextSeed(bArr9);
            int i30 = i29 + 1;
            this.nextRootSig[i29] = new GMSSRootSig(gMSSDigestProvider.get(), this.otsIndex[i29], this.heightOfTrees[i30]);
            this.nextRootSig[i29].initSign(bArrNextSeed, bArr6[i29]);
            i29 = i30;
        }
    }

    private void nextKey(int i10) {
        int i11 = this.numLayer;
        if (i10 == i11 - 1) {
            int[] iArr = this.index;
            iArr[i10] = iArr[i10] + 1;
        }
        if (this.index[i10] != this.numLeafs[i10]) {
            updateKey(i10);
        } else if (i11 != 1) {
            nextTree(i10);
            this.index[i10] = 0;
        }
    }

    public int[] getIndex() {
        return this.index;
    }

    public GMSSPrivateKeyParameters(byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][] bArr5, byte[][] bArr6, GMSSParameters gMSSParameters, GMSSDigestProvider gMSSDigestProvider) {
        this(null, bArr, bArr2, bArr3, bArr4, null, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, null, null, null, null, bArr5, null, bArr6, null, gMSSParameters, gMSSDigestProvider);
    }
}
