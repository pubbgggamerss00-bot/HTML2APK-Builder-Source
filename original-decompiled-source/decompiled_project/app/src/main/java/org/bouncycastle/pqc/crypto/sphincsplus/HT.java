package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class HT {
    SPHINCSPlusEngine engine;
    final byte[] htPubKey;
    private final byte[] pkSeed;
    private final byte[] skSeed;
    WotsPlus wots;

    public HT(SPHINCSPlusEngine sPHINCSPlusEngine, byte[] bArr, byte[] bArr2) {
        this.skSeed = bArr;
        this.pkSeed = bArr2;
        this.engine = sPHINCSPlusEngine;
        this.wots = new WotsPlus(sPHINCSPlusEngine);
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(sPHINCSPlusEngine.D - 1);
        adrs.setTreeAddress(0L);
        if (bArr != null) {
            this.htPubKey = xmss_PKgen(bArr, bArr2, adrs);
        } else {
            this.htPubKey = null;
        }
    }

    public byte[] sign(byte[] bArr, long j10, int i10) {
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j10);
        HT ht = this;
        SIG_XMSS sig_xmssXmss_sign = ht.xmss_sign(bArr, this.skSeed, i10, this.pkSeed, adrs);
        int i11 = ht.engine.D;
        SIG_XMSS[] sig_xmssArr = new SIG_XMSS[i11];
        sig_xmssArr[0] = sig_xmssXmss_sign;
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j10);
        byte[] bArrXmss_pkFromSig = ht.xmss_pkFromSig(i10, sig_xmssXmss_sign, bArr, ht.pkSeed, adrs);
        int i12 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = ht.engine;
            if (i12 >= sPHINCSPlusEngine.D) {
                break;
            }
            int i13 = (int) (((1 << r2) - 1) & j10);
            j10 >>>= sPHINCSPlusEngine.H_PRIME;
            adrs.setLayerAddress(i12);
            adrs.setTreeAddress(j10);
            SIG_XMSS sig_xmssXmss_sign2 = ht.xmss_sign(bArrXmss_pkFromSig, ht.skSeed, i13, ht.pkSeed, adrs);
            sig_xmssArr[i12] = sig_xmssXmss_sign2;
            if (i12 < ht.engine.D - 1) {
                bArrXmss_pkFromSig = ht.xmss_pkFromSig(i13, sig_xmssXmss_sign2, bArrXmss_pkFromSig, ht.pkSeed, adrs);
            }
            i12++;
            ht = this;
        }
        byte[][] bArr2 = new byte[i11][];
        for (int i14 = 0; i14 != i11; i14++) {
            SIG_XMSS sig_xmss = sig_xmssArr[i14];
            bArr2[i14] = Arrays.concatenate(sig_xmss.sig, Arrays.concatenate(sig_xmss.auth));
        }
        return Arrays.concatenate(bArr2);
    }

    public byte[] treehash(byte[] bArr, int i10, int i11, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        LinkedList linkedList = new LinkedList();
        int i12 = 1 << i11;
        if (i10 % i12 != 0) {
            return null;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            adrs2.setType(0);
            int i14 = i10 + i13;
            adrs2.setKeyPairAddress(i14);
            byte[] bArrPkGen = this.wots.pkGen(bArr, bArr2, adrs2);
            adrs2.setType(2);
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i14);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrPkGen = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrPkGen);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(bArrPkGen, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }

    public boolean verify(byte[] bArr, SIG_XMSS[] sig_xmssArr, byte[] bArr2, long j10, int i10, byte[] bArr3) {
        ADRS adrs = new ADRS();
        SIG_XMSS sig_xmss = sig_xmssArr[0];
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j10);
        HT ht = this;
        byte[] bArrXmss_pkFromSig = ht.xmss_pkFromSig(i10, sig_xmss, bArr, bArr2, adrs);
        int i11 = 1;
        while (true) {
            SPHINCSPlusEngine sPHINCSPlusEngine = ht.engine;
            if (i11 >= sPHINCSPlusEngine.D) {
                return Arrays.areEqual(bArr3, bArrXmss_pkFromSig);
            }
            int i12 = (int) (((1 << r12) - 1) & j10);
            j10 >>>= sPHINCSPlusEngine.H_PRIME;
            SIG_XMSS sig_xmss2 = sig_xmssArr[i11];
            adrs.setLayerAddress(i11);
            adrs.setTreeAddress(j10);
            bArrXmss_pkFromSig = ht.xmss_pkFromSig(i12, sig_xmss2, bArrXmss_pkFromSig, bArr2, adrs);
            i11++;
            ht = this;
        }
    }

    public byte[] xmss_PKgen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        return treehash(bArr, 0, this.engine.H_PRIME, bArr2, adrs);
    }

    public byte[] xmss_pkFromSig(int i10, SIG_XMSS sig_xmss, byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        int i11 = 0;
        adrs2.setType(0);
        adrs2.setKeyPairAddress(i10);
        byte[] wOTSSig = sig_xmss.getWOTSSig();
        byte[][] xmssauth = sig_xmss.getXMSSAUTH();
        byte[] bArrPkFromSig = this.wots.pkFromSig(wOTSSig, bArr, bArr2, adrs2);
        adrs2.setType(2);
        adrs2.setTreeIndex(i10);
        while (i11 < this.engine.H_PRIME) {
            int i12 = i11 + 1;
            adrs2.setTreeHeight(i12);
            if ((i10 / (1 << i11)) % 2 == 0) {
                adrs2.setTreeIndex(adrs2.getTreeIndex() / 2);
                bArrPkFromSig = this.engine.H(bArr2, adrs2, bArrPkFromSig, xmssauth[i11]);
            } else {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrPkFromSig = this.engine.H(bArr2, adrs2, xmssauth[i11], bArrPkFromSig);
            }
            i11 = i12;
        }
        return bArrPkFromSig;
    }

    public SIG_XMSS xmss_sign(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, ADRS adrs) {
        byte[][] bArr4 = new byte[this.engine.H_PRIME][];
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(2);
        adrs2.setLayerAddress(adrs.getLayerAddress());
        adrs2.setTreeAddress(adrs.getTreeAddress());
        int i11 = 0;
        while (i11 < this.engine.H_PRIME) {
            int i12 = 1 << i11;
            byte[] bArr5 = bArr2;
            byte[] bArr6 = bArr3;
            bArr4[i11] = treehash(bArr5, (1 ^ (i10 / i12)) * i12, i11, bArr6, adrs2);
            i11++;
            bArr2 = bArr5;
            bArr3 = bArr6;
        }
        byte[] bArr7 = bArr3;
        byte[] bArr8 = bArr2;
        ADRS adrs3 = new ADRS(adrs);
        adrs3.setType(1);
        adrs3.setKeyPairAddress(i10);
        return new SIG_XMSS(this.wots.sign(bArr, bArr8, bArr7, adrs3), bArr4);
    }
}
