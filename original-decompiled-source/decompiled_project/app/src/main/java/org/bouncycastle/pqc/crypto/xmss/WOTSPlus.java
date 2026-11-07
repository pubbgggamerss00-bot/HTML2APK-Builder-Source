package org.bouncycastle.pqc.crypto.xmss;

import ad.b;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
final class WOTSPlus {
    private final KeyedHashFunctions khf;
    private final WOTSPlusParameters params;
    private byte[] publicSeed;
    private byte[] secretKeySeed;

    public WOTSPlus(WOTSPlusParameters wOTSPlusParameters) {
        if (wOTSPlusParameters == null) {
            throw new NullPointerException("params == null");
        }
        this.params = wOTSPlusParameters;
        int treeDigestSize = wOTSPlusParameters.getTreeDigestSize();
        this.khf = new KeyedHashFunctions(wOTSPlusParameters.getTreeDigest(), treeDigestSize);
        this.secretKeySeed = new byte[treeDigestSize];
        this.publicSeed = new byte[treeDigestSize];
    }

    private byte[] chain(byte[] bArr, int i10, int i11, OTSHashAddress oTSHashAddress) {
        int treeDigestSize = this.params.getTreeDigestSize();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != treeDigestSize) {
            throw new IllegalArgumentException(b.b(treeDigestSize, "startHash needs to be ", "bytes"));
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (oTSHashAddress.toByteArray() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        int i12 = i10 + i11;
        if (i12 > this.params.getWinternitzParameter() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i11 == 0) {
            return bArr;
        }
        byte[] bArrChain = chain(bArr, i10, i11 - 1, oTSHashAddress);
        OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(oTSHashAddress.getChainAddress()).withHashAddress(i12 - 1).withKeyAndMask(0).build();
        byte[] bArrPRF = this.khf.PRF(this.publicSeed, oTSHashAddress2.toByteArray());
        byte[] bArrPRF2 = this.khf.PRF(this.publicSeed, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(oTSHashAddress2.getOTSAddress()).withChainAddress(oTSHashAddress2.getChainAddress()).withHashAddress(oTSHashAddress2.getHashAddress()).withKeyAndMask(1).build()).toByteArray());
        byte[] bArr2 = new byte[treeDigestSize];
        for (int i13 = 0; i13 < treeDigestSize; i13++) {
            bArr2[i13] = (byte) (bArrChain[i13] ^ bArrPRF2[i13]);
        }
        return this.khf.F(bArrPRF, bArr2);
    }

    private List<Integer> convertToBaseW(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("msg == null");
        }
        if (i10 != 4 && i10 != 16) {
            throw new IllegalArgumentException("w needs to be 4 or 16");
        }
        int iLog2 = XMSSUtil.log2(i10);
        if (i11 > (bArr.length * 8) / iLog2) {
            throw new IllegalArgumentException("outLength too big");
        }
        ArrayList arrayList = new ArrayList();
        loop0: for (int i12 : bArr) {
            for (int i13 = 8 - iLog2; i13 >= 0; i13 -= iLog2) {
                arrayList.add(Integer.valueOf((i12 >> i13) & (i10 - 1)));
                if (arrayList.size() == i11) {
                    break loop0;
                }
            }
        }
        return arrayList;
    }

    private byte[] expandSecretKeySeed(int i10) {
        if (i10 < 0 || i10 >= this.params.getLen()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.khf.PRF(this.secretKeySeed, XMSSUtil.toBytesBigEndian(i10, 32));
    }

    public KeyedHashFunctions getKhf() {
        return this.khf;
    }

    public WOTSPlusParameters getParams() {
        return this.params;
    }

    public WOTSPlusPrivateKeyParameters getPrivateKey() {
        int len = this.params.getLen();
        byte[][] bArr = new byte[len][];
        for (int i10 = 0; i10 < len; i10++) {
            bArr[i10] = expandSecretKeySeed(i10);
        }
        return new WOTSPlusPrivateKeyParameters(this.params, bArr);
    }

    public WOTSPlusPublicKeyParameters getPublicKey(OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.params.getLen()][];
        for (int i10 = 0; i10 < this.params.getLen(); i10++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i10).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr[i10] = chain(expandSecretKeySeed(i10), 0, this.params.getWinternitzParameter() - 1, oTSHashAddress);
        }
        return new WOTSPlusPublicKeyParameters(this.params, bArr);
    }

    public WOTSPlusPublicKeyParameters getPublicKeyFromSignature(byte[] bArr, WOTSPlusSignature wOTSPlusSignature, OTSHashAddress oTSHashAddress) {
        if (bArr == null) {
            throw new NullPointerException("messageDigest == null");
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (wOTSPlusSignature == null) {
            throw new NullPointerException("signature == null");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        List<Integer> listConvertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int winternitzParameter = 0;
        for (int i10 = 0; i10 < this.params.getLen1(); i10++) {
            winternitzParameter += (this.params.getWinternitzParameter() - 1) - listConvertToBaseW.get(i10).intValue();
        }
        listConvertToBaseW.addAll(convertToBaseW(XMSSUtil.toBytesBigEndian(winternitzParameter << (8 - ((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) % 8)), (int) Math.ceil((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i11 = 0; i11 < this.params.getLen(); i11++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i11).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i11] = chain(wOTSPlusSignature.toByteArray()[i11], listConvertToBaseW.get(i11).intValue(), (this.params.getWinternitzParameter() - 1) - listConvertToBaseW.get(i11).intValue(), oTSHashAddress);
        }
        return new WOTSPlusPublicKeyParameters(this.params, bArr2);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.publicSeed);
    }

    public byte[] getSecretKeySeed() {
        return Arrays.clone(this.secretKeySeed);
    }

    public byte[] getWOTSPlusSecretKey(byte[] bArr, OTSHashAddress oTSHashAddress) {
        return this.khf.PRF(bArr, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).build()).toByteArray());
    }

    public void importKeys(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.secretKeySeed = bArr;
        this.publicSeed = bArr2;
    }

    public WOTSPlusSignature sign(byte[] bArr, OTSHashAddress oTSHashAddress) {
        if (bArr == null) {
            throw new NullPointerException("messageDigest == null");
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        List<Integer> listConvertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int winternitzParameter = 0;
        for (int i10 = 0; i10 < this.params.getLen1(); i10++) {
            winternitzParameter += (this.params.getWinternitzParameter() - 1) - listConvertToBaseW.get(i10).intValue();
        }
        listConvertToBaseW.addAll(convertToBaseW(XMSSUtil.toBytesBigEndian(winternitzParameter << (8 - ((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) % 8)), (int) Math.ceil((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i11 = 0; i11 < this.params.getLen(); i11++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i11).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i11] = chain(expandSecretKeySeed(i11), 0, listConvertToBaseW.get(i11).intValue(), oTSHashAddress);
        }
        return new WOTSPlusSignature(this.params, bArr2);
    }
}
