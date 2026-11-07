package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class SPHINCSPlusSigner implements MessageSigner {
    private SPHINCSPlusPrivateKeyParameters privKey;
    private SPHINCSPlusPublicKeyParameters pubKey;
    private SecureRandom random;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        SPHINCSPlusEngine engine = this.privKey.getParameters().getEngine();
        engine.init(this.privKey.pk.seed);
        int i10 = engine.N;
        byte[] bArr2 = new byte[i10];
        SecureRandom secureRandom = this.random;
        int i11 = 0;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            System.arraycopy(this.privKey.pk.seed, 0, bArr2, 0, i10);
        }
        Fors fors = new Fors(engine);
        byte[] bArrPRF_msg = engine.PRF_msg(this.privKey.sk.prf, bArr2, bArr);
        PK pk = this.privKey.pk;
        IndexedDigest indexedDigestH_msg = engine.H_msg(bArrPRF_msg, pk.seed, pk.root, bArr);
        byte[] bArr3 = indexedDigestH_msg.digest;
        long j10 = indexedDigestH_msg.idx_tree;
        int i12 = indexedDigestH_msg.idx_leaf;
        ADRS adrs = new ADRS();
        adrs.setType(3);
        adrs.setTreeAddress(j10);
        adrs.setKeyPairAddress(i12);
        SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters = this.privKey;
        SIG_FORS[] sig_forsArrSign = fors.sign(bArr3, sPHINCSPlusPrivateKeyParameters.sk.seed, sPHINCSPlusPrivateKeyParameters.pk.seed, adrs);
        ADRS adrs2 = new ADRS();
        adrs2.setType(3);
        adrs2.setTreeAddress(j10);
        adrs2.setKeyPairAddress(i12);
        byte[] bArrPkFromSig = fors.pkFromSig(sig_forsArrSign, bArr3, this.privKey.pk.seed, adrs2);
        new ADRS().setType(2);
        byte[] bArrSign = new HT(engine, this.privKey.getSeed(), this.privKey.getPublicSeed()).sign(bArrPkFromSig, j10, i12);
        int length = sig_forsArrSign.length;
        byte[][] bArr4 = new byte[length + 2][];
        bArr4[0] = bArrPRF_msg;
        while (i11 != sig_forsArrSign.length) {
            int i13 = i11 + 1;
            SIG_FORS sig_fors = sig_forsArrSign[i11];
            bArr4[i13] = Arrays.concatenate(sig_fors.sk, Arrays.concatenate(sig_fors.authPath));
            i11 = i13;
        }
        bArr4[length + 1] = bArrSign;
        return Arrays.concatenate(bArr4);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!z10) {
            this.pubKey = (SPHINCSPlusPublicKeyParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.privKey = (SPHINCSPlusPrivateKeyParameters) cipherParameters;
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (SPHINCSPlusPrivateKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        SPHINCSPlusEngine engine = this.pubKey.getParameters().getEngine();
        engine.init(this.pubKey.getSeed());
        ADRS adrs = new ADRS();
        SIG sig = new SIG(engine.N, engine.K, engine.A, engine.D, engine.H_PRIME, engine.WOTS_LEN, bArr2);
        byte[] r10 = sig.getR();
        SIG_FORS[] sig_fors = sig.getSIG_FORS();
        SIG_XMSS[] sig_ht = sig.getSIG_HT();
        IndexedDigest indexedDigestH_msg = engine.H_msg(r10, this.pubKey.getSeed(), this.pubKey.getRoot(), bArr);
        byte[] bArr3 = indexedDigestH_msg.digest;
        long j10 = indexedDigestH_msg.idx_tree;
        int i10 = indexedDigestH_msg.idx_leaf;
        adrs.setType(3);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j10);
        adrs.setKeyPairAddress(i10);
        byte[] bArrPkFromSig = new Fors(engine).pkFromSig(sig_fors, bArr3, this.pubKey.getSeed(), adrs);
        adrs.setType(2);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j10);
        adrs.setKeyPairAddress(i10);
        return new HT(engine, null, this.pubKey.getSeed()).verify(bArrPkFromSig, sig_ht, this.pubKey.getSeed(), j10, i10, this.pubKey.getRoot());
    }
}
