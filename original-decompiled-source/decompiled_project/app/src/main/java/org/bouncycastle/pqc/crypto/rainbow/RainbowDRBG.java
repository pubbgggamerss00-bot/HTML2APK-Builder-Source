package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class RainbowDRBG extends SecureRandom {
    private Digest hashAlgo;
    private byte[] key;
    private byte[] seed;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f20403v;

    public RainbowDRBG(byte[] bArr, Digest digest) {
        this.seed = bArr;
        this.hashAlgo = digest;
        init(256);
    }

    private void AES256_CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = 15;
            while (true) {
                if (i11 >= 0) {
                    byte b10 = bArr3[i11];
                    if ((b10 & 255) != 255) {
                        bArr3[i11] = (byte) (b10 + 1);
                        break;
                    } else {
                        bArr3[i11] = 0;
                        i11--;
                    }
                }
            }
            AES256_ECB(bArr2, bArr3, bArr4, i10 * 16);
        }
        if (bArr != null) {
            for (int i12 = 0; i12 < 48; i12++) {
                bArr4[i12] = (byte) (bArr4[i12] ^ bArr[i12]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    private void AES256_ECB(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        try {
            AESEngine aESEngine = new AESEngine();
            aESEngine.init(true, new KeyParameter(bArr));
            for (int i11 = 0; i11 != bArr2.length; i11 += 16) {
                aESEngine.processBlock(bArr2, i11, bArr3, i10 + i11);
            }
        } catch (Throwable th2) {
            throw new IllegalStateException("drbg failure: " + th2.getMessage(), th2);
        }
    }

    private void init(int i10) {
        byte[] bArr = this.seed;
        if (bArr.length >= 48) {
            randombytes_init(bArr, i10);
        } else {
            randombytes_init(Arrays.concatenate(this.seed, RainbowUtil.hash(this.hashAlgo, bArr, 48 - bArr.length)), i10);
        }
    }

    private void randombytes_init(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.key = bArr3;
        byte[] bArr4 = new byte[16];
        this.f20403v = bArr4;
        AES256_CTR_DRBG_Update(bArr2, bArr3, bArr4);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i10 = 0;
        while (length > 0) {
            int i11 = 15;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                byte[] bArr3 = this.f20403v;
                byte b10 = bArr3[i11];
                if ((b10 & 255) != 255) {
                    bArr3[i11] = (byte) (b10 + 1);
                    break;
                } else {
                    bArr3[i11] = 0;
                    i11--;
                }
            }
            AES256_ECB(this.key, this.f20403v, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i10, 16);
                i10 += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i10, length);
                length = 0;
            }
        }
        AES256_CTR_DRBG_Update(null, this.key, this.f20403v);
    }
}
