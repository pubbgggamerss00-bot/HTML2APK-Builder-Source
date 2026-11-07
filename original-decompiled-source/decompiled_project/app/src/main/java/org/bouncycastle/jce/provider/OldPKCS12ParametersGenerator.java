package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes.dex */
class OldPKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;

    /* renamed from: u, reason: collision with root package name */
    private int f20149u;

    /* renamed from: v, reason: collision with root package name */
    private int f20150v;

    public OldPKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof MD5Digest) {
            this.f20149u = 16;
        } else {
            if (!(digest instanceof SHA1Digest) && !(digest instanceof RIPEMD160Digest)) {
                throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
            }
            this.f20149u = 20;
        }
        this.f20150v = 64;
    }

    private void adjust(byte[] bArr, int i10, byte[] bArr2) {
        int i11 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i10) - 1] & 255) + 1;
        bArr[(bArr2.length + i10) - 1] = (byte) i11;
        int i12 = i11 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i13 = i10 + length;
            int i14 = (bArr2[length] & 255) + (bArr[i13] & 255) + i12;
            bArr[i13] = (byte) i14;
            i12 = i14 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i10, int i11) {
        byte[] bArr;
        byte[] bArr2;
        int i12;
        int i13 = this.f20150v;
        byte[] bArr3 = new byte[i13];
        byte[] bArr4 = new byte[i11];
        int i14 = 0;
        for (int i15 = 0; i15 != i13; i15++) {
            bArr3[i15] = (byte) i10;
        }
        byte[] bArr5 = this.salt;
        int i16 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i17 = this.f20150v;
            int length = (((bArr5.length + i17) - 1) / i17) * i17;
            bArr = new byte[length];
            for (int i18 = 0; i18 != length; i18++) {
                byte[] bArr6 = this.salt;
                bArr[i18] = bArr6[i18 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i19 = this.f20150v;
            int length2 = (((bArr7.length + i19) - 1) / i19) * i19;
            bArr2 = new byte[length2];
            for (int i20 = 0; i20 != length2; i20++) {
                byte[] bArr8 = this.password;
                bArr2[i20] = bArr8[i20 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i21 = this.f20150v;
        byte[] bArr10 = new byte[i21];
        int i22 = this.f20149u;
        int i23 = ((i11 + i22) - 1) / i22;
        int i24 = 1;
        while (i24 <= i23) {
            int i25 = this.f20149u;
            byte[] bArr11 = new byte[i25];
            this.digest.update(bArr3, i14, i13);
            this.digest.update(bArr9, i14, length3);
            this.digest.doFinal(bArr11, i14);
            for (int i26 = i16; i26 != this.iterationCount; i26++) {
                this.digest.update(bArr11, i14, i25);
                this.digest.doFinal(bArr11, i14);
            }
            for (int i27 = i14; i27 != i21; i27++) {
                bArr10[i24] = bArr11[i27 % i25];
            }
            int i28 = i14;
            while (true) {
                int i29 = this.f20150v;
                if (i28 == length3 / i29) {
                    break;
                }
                adjust(bArr9, i29 * i28, bArr10);
                i28++;
            }
            if (i24 == i23) {
                int i30 = i24 - 1;
                int i31 = this.f20149u;
                int i32 = i30 * i31;
                int i33 = i11 - (i30 * i31);
                i12 = 0;
                System.arraycopy(bArr11, 0, bArr4, i32, i33);
            } else {
                i12 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i24 - 1) * this.f20149u, i25);
            }
            i24++;
            i14 = i12;
            i16 = 1;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i10) {
        int i11 = i10 / 8;
        return new KeyParameter(generateDerivedKey(3, i11), 0, i11);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10) {
        int i11 = i10 / 8;
        return new KeyParameter(generateDerivedKey(1, i11), 0, i11);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i10, int i11) {
        int i12 = i10 / 8;
        int i13 = i11 / 8;
        byte[] bArrGenerateDerivedKey = generateDerivedKey(1, i12);
        return new ParametersWithIV(new KeyParameter(bArrGenerateDerivedKey, 0, i12), generateDerivedKey(2, i13), 0, i13);
    }
}
