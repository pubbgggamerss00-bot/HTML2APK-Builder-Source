package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class HQCKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private int N_BYTE;
    private int delta;
    private HQCKeyGenerationParameters hqcKeyGenerationParameters;

    /* renamed from: k, reason: collision with root package name */
    private int f20368k;

    /* renamed from: n, reason: collision with root package name */
    private int f20369n;
    private SecureRandom random;

    /* renamed from: w, reason: collision with root package name */
    private int f20370w;

    /* renamed from: we, reason: collision with root package name */
    private int f20371we;
    private int wr;

    private AsymmetricCipherKeyPair genKeyPair(byte[] bArr) {
        HQCEngine engine = this.hqcKeyGenerationParameters.getParameters().getEngine();
        int i10 = this.N_BYTE;
        byte[] bArr2 = new byte[i10 + 40];
        byte[] bArr3 = new byte[i10 + 80];
        engine.genKeyPair(bArr2, bArr3, bArr);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new HQCPublicKeyParameters(this.hqcKeyGenerationParameters.getParameters(), bArr2), (AsymmetricKeyParameter) new HQCPrivateKeyParameters(this.hqcKeyGenerationParameters.getParameters(), bArr3));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[] bArr = new byte[48];
        this.random.nextBytes(bArr);
        return genKeyPair(bArr);
    }

    public AsymmetricCipherKeyPair generateKeyPairWithSeed(byte[] bArr) {
        return genKeyPair(bArr);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.hqcKeyGenerationParameters = (HQCKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        this.f20369n = this.hqcKeyGenerationParameters.getParameters().getN();
        this.f20368k = this.hqcKeyGenerationParameters.getParameters().getK();
        this.delta = this.hqcKeyGenerationParameters.getParameters().getDelta();
        this.f20370w = this.hqcKeyGenerationParameters.getParameters().getW();
        this.wr = this.hqcKeyGenerationParameters.getParameters().getWr();
        this.f20371we = this.hqcKeyGenerationParameters.getParameters().getWe();
        this.N_BYTE = (this.f20369n + 7) / 8;
    }
}
