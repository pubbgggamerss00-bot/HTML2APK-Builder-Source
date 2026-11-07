package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class DilithiumPrivateKeyParameters extends DilithiumKeyParameters {

    /* renamed from: k, reason: collision with root package name */
    final byte[] f20324k;
    final byte[] rho;

    /* renamed from: s1, reason: collision with root package name */
    final byte[] f20325s1;

    /* renamed from: s2, reason: collision with root package name */
    final byte[] f20326s2;

    /* renamed from: t0, reason: collision with root package name */
    final byte[] f20327t0;

    /* renamed from: t1, reason: collision with root package name */
    private final byte[] f20328t1;
    final byte[] tr;

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, DilithiumPublicKeyParameters dilithiumPublicKeyParameters) {
        super(true, dilithiumParameters);
        DilithiumEngine engine = dilithiumParameters.getEngine(null);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        this.f20324k = Arrays.copyOfRange(bArr, 32, 64);
        this.tr = Arrays.copyOfRange(bArr, 64, 128);
        int dilithiumL = (engine.getDilithiumL() * engine.getDilithiumPolyEtaPackedBytes()) + 128;
        this.f20325s1 = Arrays.copyOfRange(bArr, 128, dilithiumL);
        int dilithiumK = (engine.getDilithiumK() * engine.getDilithiumPolyEtaPackedBytes()) + dilithiumL;
        this.f20326s2 = Arrays.copyOfRange(bArr, dilithiumL, dilithiumK);
        this.f20327t0 = Arrays.copyOfRange(bArr, dilithiumK, (engine.getDilithiumK() * DilithiumEngine.DilithiumPolyT0PackedBytes) + dilithiumK);
        if (dilithiumPublicKeyParameters != null) {
            this.f20328t1 = dilithiumPublicKeyParameters.getT1();
        } else {
            this.f20328t1 = null;
        }
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.f20324k, this.tr, this.f20325s1, this.f20326s2, this.f20327t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.f20324k);
    }

    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return DilithiumPublicKeyParameters.getEncoded(this.rho, this.f20328t1);
    }

    public DilithiumPublicKeyParameters getPublicKeyParameters() {
        return new DilithiumPublicKeyParameters(getParameters(), this.rho, this.f20328t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.f20325s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.f20326s2);
    }

    public byte[] getT0() {
        return Arrays.clone(this.f20327t0);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f20328t1);
    }

    public byte[] getTr() {
        return Arrays.clone(this.tr);
    }

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, dilithiumParameters);
        this.rho = Arrays.clone(bArr);
        this.f20324k = Arrays.clone(bArr2);
        this.tr = Arrays.clone(bArr3);
        this.f20325s1 = Arrays.clone(bArr4);
        this.f20326s2 = Arrays.clone(bArr5);
        this.f20327t0 = Arrays.clone(bArr6);
        this.f20328t1 = Arrays.clone(bArr7);
    }
}
