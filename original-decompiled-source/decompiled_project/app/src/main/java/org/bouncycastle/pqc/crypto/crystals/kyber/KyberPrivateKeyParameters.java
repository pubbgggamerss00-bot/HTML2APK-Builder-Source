package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class KyberPrivateKeyParameters extends KyberKeyParameters {
    final byte[] hpk;
    final byte[] nonce;
    final byte[] rho;

    /* renamed from: s, reason: collision with root package name */
    final byte[] f20331s;

    /* renamed from: t, reason: collision with root package name */
    final byte[] f20332t;

    public KyberPrivateKeyParameters(KyberParameters kyberParameters, byte[] bArr) {
        super(true, kyberParameters);
        KyberEngine engine = kyberParameters.getEngine();
        this.f20331s = Arrays.copyOfRange(bArr, 0, engine.getKyberIndCpaSecretKeyBytes());
        int kyberIndCpaSecretKeyBytes = engine.getKyberIndCpaSecretKeyBytes();
        this.f20332t = Arrays.copyOfRange(bArr, kyberIndCpaSecretKeyBytes, (engine.getKyberIndCpaPublicKeyBytes() + kyberIndCpaSecretKeyBytes) - 32);
        int kyberIndCpaPublicKeyBytes = (engine.getKyberIndCpaPublicKeyBytes() - 32) + kyberIndCpaSecretKeyBytes;
        int i10 = kyberIndCpaPublicKeyBytes + 32;
        this.rho = Arrays.copyOfRange(bArr, kyberIndCpaPublicKeyBytes, i10);
        int i11 = kyberIndCpaPublicKeyBytes + 64;
        this.hpk = Arrays.copyOfRange(bArr, i10, i11);
        this.nonce = Arrays.copyOfRange(bArr, i11, kyberIndCpaPublicKeyBytes + 96);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.f20331s, this.f20332t, this.rho, this.hpk, this.nonce});
    }

    public byte[] getHPK() {
        return Arrays.clone(this.hpk);
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return KyberPublicKeyParameters.getEncoded(this.f20332t, this.rho);
    }

    public KyberPublicKeyParameters getPublicKeyParameters() {
        return new KyberPublicKeyParameters(getParameters(), this.f20332t, this.rho);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS() {
        return Arrays.clone(this.f20331s);
    }

    public byte[] getT() {
        return Arrays.clone(this.f20332t);
    }

    public KyberPrivateKeyParameters(KyberParameters kyberParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(true, kyberParameters);
        this.f20331s = Arrays.clone(bArr);
        this.hpk = Arrays.clone(bArr2);
        this.nonce = Arrays.clone(bArr3);
        this.f20332t = Arrays.clone(bArr4);
        this.rho = Arrays.clone(bArr5);
    }
}
