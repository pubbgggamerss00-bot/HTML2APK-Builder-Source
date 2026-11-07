package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSUtil;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GMSSSigner implements MessageSigner {
    private byte[][][] currentAuthPaths;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private GMSSUtil gmssUtil = new GMSSUtil();
    private int[] index;
    GMSSKeyParameters key;
    private int mdLength;
    private Digest messDigestOTS;
    private Digest messDigestTrees;
    private int numLayer;
    private WinternitzOTSignature ots;
    private byte[] pubKeyBytes;
    private SecureRandom random;
    private byte[][] subtreeRootSig;

    public GMSSSigner(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTrees = digest;
        this.messDigestOTS = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTrees);
    }

    private void initSign() {
        int i10;
        this.messDigestTrees.reset();
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = (GMSSPrivateKeyParameters) this.key;
        if (gMSSPrivateKeyParameters.isUsed()) {
            throw new IllegalStateException("Private key already used");
        }
        if (gMSSPrivateKeyParameters.getIndex(0) >= gMSSPrivateKeyParameters.getNumLeafs(0)) {
            throw new IllegalStateException("No more signatures can be generated");
        }
        GMSSParameters parameters = gMSSPrivateKeyParameters.getParameters();
        this.gmssPS = parameters;
        this.numLayer = parameters.getNumOfLayers();
        byte[] bArr = gMSSPrivateKeyParameters.getCurrentSeeds()[this.numLayer - 1];
        int i11 = this.mdLength;
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr, 0, bArr3, 0, i11);
        this.ots = new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr3), this.digestProvider.get(), this.gmssPS.getWinternitzParameter()[this.numLayer - 1]);
        byte[][][] currentAuthPaths = gMSSPrivateKeyParameters.getCurrentAuthPaths();
        this.currentAuthPaths = new byte[this.numLayer][][];
        int i12 = 0;
        while (true) {
            i10 = this.numLayer;
            if (i12 >= i10) {
                break;
            }
            this.currentAuthPaths[i12] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, currentAuthPaths[i12].length, this.mdLength);
            int i13 = 0;
            while (true) {
                byte[][] bArr4 = currentAuthPaths[i12];
                if (i13 < bArr4.length) {
                    System.arraycopy(bArr4[i13], 0, this.currentAuthPaths[i12][i13], 0, this.mdLength);
                    i13++;
                }
            }
            i12++;
        }
        this.index = new int[i10];
        System.arraycopy(gMSSPrivateKeyParameters.getIndex(), 0, this.index, 0, this.numLayer);
        this.subtreeRootSig = new byte[this.numLayer - 1][];
        for (int i14 = 0; i14 < this.numLayer - 1; i14++) {
            byte[] subtreeRootSig = gMSSPrivateKeyParameters.getSubtreeRootSig(i14);
            byte[][] bArr5 = this.subtreeRootSig;
            byte[] bArr6 = new byte[subtreeRootSig.length];
            bArr5[i14] = bArr6;
            System.arraycopy(subtreeRootSig, 0, bArr6, 0, subtreeRootSig.length);
        }
        gMSSPrivateKeyParameters.markUsed();
    }

    private void initVerify() {
        this.messDigestTrees.reset();
        GMSSPublicKeyParameters gMSSPublicKeyParameters = (GMSSPublicKeyParameters) this.key;
        this.pubKeyBytes = gMSSPublicKeyParameters.getPublicKey();
        GMSSParameters parameters = gMSSPublicKeyParameters.getParameters();
        this.gmssPS = parameters;
        this.numLayer = parameters.getNumOfLayers();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2 = new byte[this.mdLength];
        byte[] signature = this.ots.getSignature(bArr);
        byte[] bArrConcatenateArray = this.gmssUtil.concatenateArray(this.currentAuthPaths[this.numLayer - 1]);
        byte[] bArrIntToBytesLittleEndian = this.gmssUtil.intToBytesLittleEndian(this.index[this.numLayer - 1]);
        int length = bArrIntToBytesLittleEndian.length + signature.length + bArrConcatenateArray.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrIntToBytesLittleEndian, 0, bArr3, 0, bArrIntToBytesLittleEndian.length);
        System.arraycopy(signature, 0, bArr3, bArrIntToBytesLittleEndian.length, signature.length);
        System.arraycopy(bArrConcatenateArray, 0, bArr3, bArrIntToBytesLittleEndian.length + signature.length, bArrConcatenateArray.length);
        byte[] bArr4 = new byte[0];
        for (int i10 = this.numLayer - 2; i10 >= 0; i10--) {
            byte[] bArrConcatenateArray2 = this.gmssUtil.concatenateArray(this.currentAuthPaths[i10]);
            byte[] bArrIntToBytesLittleEndian2 = this.gmssUtil.intToBytesLittleEndian(this.index[i10]);
            int length2 = bArr4.length;
            byte[] bArr5 = new byte[length2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            bArr4 = new byte[bArrIntToBytesLittleEndian2.length + length2 + this.subtreeRootSig[i10].length + bArrConcatenateArray2.length];
            System.arraycopy(bArr5, 0, bArr4, 0, length2);
            System.arraycopy(bArrIntToBytesLittleEndian2, 0, bArr4, length2, bArrIntToBytesLittleEndian2.length);
            byte[] bArr6 = this.subtreeRootSig[i10];
            System.arraycopy(bArr6, 0, bArr4, bArrIntToBytesLittleEndian2.length + length2, bArr6.length);
            System.arraycopy(bArrConcatenateArray2, 0, bArr4, length2 + bArrIntToBytesLittleEndian2.length + this.subtreeRootSig[i10].length, bArrConcatenateArray2.length);
        }
        byte[] bArr7 = new byte[bArr4.length + length];
        System.arraycopy(bArr3, 0, bArr7, 0, length);
        System.arraycopy(bArr4, 0, bArr7, length, bArr4.length);
        return bArr7;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!z10) {
            this.key = (GMSSPublicKeyParameters) cipherParameters;
            initVerify();
        } else if (!(cipherParameters instanceof ParametersWithRandom)) {
            this.random = CryptoServicesRegistrar.getSecureRandom();
            this.key = (GMSSPrivateKeyParameters) cipherParameters;
            initSign();
        } else {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            this.key = (GMSSPrivateKeyParameters) parametersWithRandom.getParameters();
            initSign();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        this.messDigestOTS.reset();
        int i10 = 0;
        for (int i11 = this.numLayer - 1; i11 >= 0; i11--) {
            WinternitzOTSVerify winternitzOTSVerify = new WinternitzOTSVerify(this.digestProvider.get(), this.gmssPS.getWinternitzParameter()[i11]);
            int signatureLength = winternitzOTSVerify.getSignatureLength();
            int iBytesToIntLittleEndian = this.gmssUtil.bytesToIntLittleEndian(bArr2, i10);
            int i12 = i10 + 4;
            byte[] bArr3 = new byte[signatureLength];
            System.arraycopy(bArr2, i12, bArr3, 0, signatureLength);
            i10 = i12 + signatureLength;
            bArr = winternitzOTSVerify.Verify(bArr, bArr3);
            if (bArr == null) {
                System.err.println("OTS Public Key is null in GMSSSignature.verify");
                return false;
            }
            byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.gmssPS.getHeightOfTrees()[i11], this.mdLength);
            for (byte[] bArr5 : bArr4) {
                System.arraycopy(bArr2, i10, bArr5, 0, this.mdLength);
                i10 += this.mdLength;
            }
            byte[] bArr6 = new byte[this.mdLength];
            int length = (1 << bArr4.length) + iBytesToIntLittleEndian;
            for (int i13 = 0; i13 < bArr4.length; i13++) {
                int i14 = this.mdLength;
                int i15 = i14 << 1;
                byte[] bArr7 = new byte[i15];
                if (length % 2 == 0) {
                    System.arraycopy(bArr, 0, bArr7, 0, i14);
                    byte[] bArr8 = bArr4[i13];
                    int i16 = this.mdLength;
                    System.arraycopy(bArr8, 0, bArr7, i16, i16);
                    length /= 2;
                } else {
                    System.arraycopy(bArr4[i13], 0, bArr7, 0, i14);
                    System.arraycopy(bArr, 0, bArr7, this.mdLength, bArr.length);
                    length = (length - 1) / 2;
                }
                this.messDigestTrees.update(bArr7, 0, i15);
                bArr = new byte[this.messDigestTrees.getDigestSize()];
                this.messDigestTrees.doFinal(bArr, 0);
            }
        }
        return Arrays.areEqual(this.pubKeyBytes, bArr);
    }
}
