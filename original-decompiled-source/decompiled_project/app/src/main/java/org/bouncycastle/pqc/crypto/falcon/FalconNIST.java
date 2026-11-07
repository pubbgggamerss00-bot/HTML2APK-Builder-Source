package org.bouncycastle.pqc.crypto.falcon;

import ad.k;
import androidx.datastore.preferences.protobuf.e;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class FalconNIST {
    int CRYPTO_BYTES;
    private int CRYPTO_PUBLICKEYBYTES;
    private int CRYPTO_SECRETKEYBYTES;
    int LOGN;
    private int N;
    int NONCELEN;
    private FalconCodec codec = new FalconCodec();
    private SecureRandom rand;

    public FalconNIST(int i10, int i11, SecureRandom secureRandom) {
        this.rand = secureRandom;
        this.LOGN = i10;
        this.NONCELEN = i11;
        int i12 = 1 << i10;
        this.N = i12;
        this.CRYPTO_PUBLICKEYBYTES = e.a(i12, 14, 8, 1);
        if (i10 == 10) {
            this.CRYPTO_SECRETKEYBYTES = 2305;
            this.CRYPTO_BYTES = 1330;
            return;
        }
        if (i10 == 9 || i10 == 8) {
            this.CRYPTO_SECRETKEYBYTES = ((i12 * 12) / 8) + 1 + i12;
            this.CRYPTO_BYTES = 690;
        } else if (i10 == 7 || i10 == 6) {
            this.CRYPTO_SECRETKEYBYTES = ((i12 * 14) / 8) + 1 + i12;
            this.CRYPTO_BYTES = 690;
        } else {
            this.CRYPTO_SECRETKEYBYTES = k.b(i12, 2, 1, i12);
            this.CRYPTO_BYTES = 690;
        }
    }

    public byte[] crypto_sign(boolean z10, byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3, int i12) {
        int iComp_encode;
        byte[] bArr4;
        int i13 = this.N;
        byte[] bArr5 = new byte[i13];
        byte[] bArr6 = new byte[i13];
        byte[] bArr7 = new byte[i13];
        byte[] bArr8 = new byte[i13];
        short[] sArr = new short[i13];
        short[] sArr2 = new short[i13];
        byte[] bArr9 = new byte[48];
        byte[] bArr10 = new byte[this.NONCELEN];
        SHAKE256 shake256 = new SHAKE256();
        FalconSign falconSign = new FalconSign();
        FalconVrfy falconVrfy = new FalconVrfy();
        FalconCommon falconCommon = new FalconCommon();
        FalconCodec falconCodec = this.codec;
        int i14 = this.LOGN;
        int iTrim_i8_decode = falconCodec.trim_i8_decode(bArr5, 0, i14, falconCodec.max_fg_bits[i14], bArr3, i12, this.CRYPTO_SECRETKEYBYTES);
        if (iTrim_i8_decode == 0) {
            throw new IllegalStateException("f decode failed");
        }
        FalconCodec falconCodec2 = this.codec;
        int i15 = this.LOGN;
        int iTrim_i8_decode2 = falconCodec2.trim_i8_decode(bArr6, 0, i15, falconCodec2.max_fg_bits[i15], bArr3, i12 + iTrim_i8_decode, this.CRYPTO_SECRETKEYBYTES - iTrim_i8_decode);
        if (iTrim_i8_decode2 == 0) {
            throw new IllegalStateException("g decode failed");
        }
        int i16 = iTrim_i8_decode + iTrim_i8_decode2;
        FalconCodec falconCodec3 = this.codec;
        int i17 = this.LOGN;
        int iTrim_i8_decode3 = falconCodec3.trim_i8_decode(bArr7, 0, i17, falconCodec3.max_FG_bits[i17], bArr3, i12 + i16, this.CRYPTO_SECRETKEYBYTES - i16);
        if (iTrim_i8_decode3 == 0) {
            throw new IllegalArgumentException("F decode failed");
        }
        if (i16 + iTrim_i8_decode3 != this.CRYPTO_SECRETKEYBYTES - 1) {
            throw new IllegalStateException("full key not used");
        }
        if (!falconVrfy.complete_private(bArr8, 0, bArr5, 0, bArr6, 0, bArr7, 0, this.LOGN, new short[this.N * 2], 0)) {
            throw new IllegalStateException("complete_private failed");
        }
        this.rand.nextBytes(bArr10);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr10, 0, this.NONCELEN);
        shake256.inner_shake256_inject(bArr2, i10, i11);
        shake256.i_shake256_flip();
        falconCommon.hash_to_point_vartime(shake256, sArr2, 0, this.LOGN);
        this.rand.nextBytes(bArr9);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr9, 0, 48);
        shake256.i_shake256_flip();
        falconSign.sign_dyn(sArr, 0, shake256, bArr5, 0, bArr6, 0, bArr7, 0, bArr8, 0, sArr2, 0, this.LOGN, new FalconFPR[this.N * 10], 0);
        int i18 = (this.CRYPTO_BYTES - 2) - this.NONCELEN;
        byte[] bArr11 = new byte[i18];
        if (z10) {
            int i19 = this.LOGN;
            bArr11[0] = (byte) (i19 + 32);
            int iComp_encode2 = this.codec.comp_encode(bArr11, 1, i18 - 1, sArr, 0, i19);
            if (iComp_encode2 == 0) {
                throw new IllegalStateException("signature failed to generate");
            }
            iComp_encode = iComp_encode2 + 1;
            bArr4 = bArr11;
        } else {
            iComp_encode = this.codec.comp_encode(bArr11, 0, i18, sArr, 0, this.LOGN);
            bArr4 = bArr11;
            if (iComp_encode == 0) {
                throw new IllegalStateException("signature failed to generate");
            }
        }
        bArr[0] = (byte) (this.LOGN + 48);
        System.arraycopy(bArr10, 0, bArr, 1, this.NONCELEN);
        System.arraycopy(bArr4, 0, bArr, this.NONCELEN + 1, iComp_encode);
        return Arrays.copyOfRange(bArr, 0, this.NONCELEN + 1 + iComp_encode);
    }

    public byte[][] crypto_sign_keypair(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.N;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[i12];
        byte[] bArr5 = new byte[i12];
        short[] sArr = new short[i12];
        byte[] bArr6 = new byte[48];
        SHAKE256 shake256 = new SHAKE256();
        FalconKeyGen falconKeyGen = new FalconKeyGen();
        this.rand.nextBytes(bArr6);
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr6, 0, 48);
        shake256.i_shake256_flip();
        falconKeyGen.keygen(shake256, bArr3, 0, bArr4, 0, bArr5, 0, null, 0, sArr, 0, this.LOGN);
        int i13 = this.LOGN;
        bArr2[i11] = (byte) (i13 + 80);
        FalconCodec falconCodec = this.codec;
        int i14 = i11 + 1;
        int iTrim_i8_encode = falconCodec.trim_i8_encode(bArr2, i14, this.CRYPTO_SECRETKEYBYTES - 1, bArr3, 0, i13, falconCodec.max_fg_bits[i13]);
        if (iTrim_i8_encode == 0) {
            throw new IllegalStateException("f encode failed");
        }
        int i15 = iTrim_i8_encode + 1;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i14, i15);
        FalconCodec falconCodec2 = this.codec;
        int i16 = i11 + i15;
        int i17 = this.CRYPTO_SECRETKEYBYTES - i15;
        int i18 = this.LOGN;
        int iTrim_i8_encode2 = falconCodec2.trim_i8_encode(bArr2, i16, i17, bArr4, 0, i18, falconCodec2.max_fg_bits[i18]);
        if (iTrim_i8_encode2 == 0) {
            throw new IllegalStateException("g encode failed");
        }
        int i19 = i15 + iTrim_i8_encode2;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i16, i19);
        FalconCodec falconCodec3 = this.codec;
        int i20 = i11 + i19;
        int i21 = this.CRYPTO_SECRETKEYBYTES - i19;
        int i22 = this.LOGN;
        int iTrim_i8_encode3 = falconCodec3.trim_i8_encode(bArr2, i20, i21, bArr5, 0, i22, falconCodec3.max_FG_bits[i22]);
        if (iTrim_i8_encode3 == 0) {
            throw new IllegalStateException("F encode failed");
        }
        int i23 = i19 + iTrim_i8_encode3;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr2, i20, i23);
        if (i23 != this.CRYPTO_SECRETKEYBYTES) {
            throw new IllegalStateException("secret key encoding failed");
        }
        int i24 = this.LOGN;
        bArr[i10] = (byte) i24;
        if (this.codec.modq_encode(bArr, i10 + 1, this.CRYPTO_PUBLICKEYBYTES - 1, sArr, 0, i24) == this.CRYPTO_PUBLICKEYBYTES - 1) {
            return new byte[][]{Arrays.copyOfRange(bArr, 1, bArr.length), bArrCopyOfRange, bArrCopyOfRange2, bArrCopyOfRange3};
        }
        throw new IllegalStateException("public key encoding failed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r17.codec.comp_decode(r2, 0, r17.LOGN, r19, 0, r9) != r9) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int crypto_sign_open(boolean z10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i10) {
        SHAKE256 shake256;
        FalconVrfy falconVrfy;
        int i11;
        short[] sArr;
        short[] sArr2;
        FalconCommon falconCommon;
        int i12 = this.N;
        short[] sArr3 = new short[i12];
        short[] sArr4 = new short[i12];
        short[] sArr5 = new short[i12];
        SHAKE256 shake2562 = new SHAKE256();
        FalconVrfy falconVrfy2 = new FalconVrfy();
        FalconCommon falconCommon2 = new FalconCommon();
        if (this.codec.modq_decode(sArr3, 0, this.LOGN, bArr4, i10, this.CRYPTO_PUBLICKEYBYTES - 1) != this.CRYPTO_PUBLICKEYBYTES - 1) {
            return -1;
        }
        falconVrfy2.to_ntt_monty(sArr3, 0, this.LOGN);
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!z10) {
            shake256 = shake2562;
            falconVrfy = falconVrfy2;
            i11 = -1;
            sArr = sArr4;
            sArr2 = sArr5;
            if (length >= 1) {
                falconCommon = falconCommon2;
            }
            return -1;
        }
        if (length < 1) {
            return -1;
        }
        byte b10 = bArr[0];
        falconVrfy = falconVrfy2;
        int i13 = this.LOGN;
        i11 = -1;
        if (b10 != ((byte) (i13 + 32))) {
            return -1;
        }
        sArr = sArr4;
        sArr2 = sArr5;
        int i14 = length - 1;
        shake256 = shake2562;
        falconCommon = falconCommon2;
        if (this.codec.comp_decode(sArr2, 0, i13, bArr, 1, i14) != i14) {
            return -1;
        }
        shake256.inner_shake256_init();
        shake256.inner_shake256_inject(bArr2, 0, this.NONCELEN);
        shake256.inner_shake256_inject(bArr3, 0, length2);
        shake256.i_shake256_flip();
        falconCommon.hash_to_point_vartime(shake256, sArr, 0, this.LOGN);
        if (falconVrfy.verify_raw(sArr, 0, sArr2, 0, sArr3, 0, this.LOGN, new short[this.N], 0) == 0) {
            return i11;
        }
        return 0;
    }
}
