package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class PhotonBeetleEngine implements AEADCipher {
    private byte[] A;
    private byte[] K;
    private final int LAST_THREE_BITS_OFFSET;
    private byte[] N;
    private final int RATE_INBYTES;
    private final int RATE_INBYTES_HALF;
    private final int STATE_INBYTES;
    private byte[] T;
    private boolean encrypted;
    private boolean forEncryption;
    private boolean initialised;
    private boolean input_empty;
    private byte[] state;
    private byte[][] state_2d;
    private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
    private final ByteArrayOutputStream message = new ByteArrayOutputStream();
    private final int CRYPTO_KEYBYTES = 16;
    private final int CRYPTO_NPUBBYTES = 16;
    private final int TAG_INBYTES = 16;
    private final int ROUND = 12;
    private final int D = 8;
    private final int Dq = 3;
    private final int Dr = 7;
    private final int DSquare = 64;
    private final int S = 4;
    private final int S_1 = 3;
    private final byte[][] RC = {new byte[]{1, 3, 7, RegisterType.DOUBLE_LO, RegisterType.LONG_HI, RegisterType.FLOAT, 6, 12, 9, 2, 5, 10}, new byte[]{0, 2, 6, RegisterType.DOUBLE_HI, 12, 10, 7, RegisterType.LONG_HI, 8, 3, 4, RegisterType.FLOAT}, new byte[]{2, 0, 4, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, 8, 5, RegisterType.DOUBLE_HI, 10, 1, 6, 9}, new byte[]{6, 4, 0, 9, 10, 12, 1, RegisterType.FLOAT, RegisterType.DOUBLE_LO, 5, 2, RegisterType.LONG_HI}, new byte[]{RegisterType.DOUBLE_LO, 12, 8, 1, 2, 4, 9, 3, 6, RegisterType.LONG_HI, 10, 5}, new byte[]{RegisterType.DOUBLE_HI, RegisterType.LONG_HI, 9, 0, 3, 5, 8, 2, 7, 12, RegisterType.FLOAT, 4}, new byte[]{RegisterType.LONG_HI, RegisterType.DOUBLE_HI, RegisterType.FLOAT, 2, 1, 7, 10, 0, 5, RegisterType.DOUBLE_LO, 9, 6}, new byte[]{9, RegisterType.FLOAT, RegisterType.DOUBLE_HI, 6, 5, 3, RegisterType.DOUBLE_LO, 4, 1, 10, RegisterType.LONG_HI, 2}};
    private final byte[][] MixColMatrix = {new byte[]{2, 4, 2, RegisterType.FLOAT, 2, 8, 5, 6}, new byte[]{12, 9, 8, RegisterType.LONG_HI, 7, 7, 5, 2}, new byte[]{4, 4, RegisterType.LONG_HI, RegisterType.LONG_HI, 9, 4, RegisterType.LONG_HI, 9}, new byte[]{1, 6, 5, 1, 12, RegisterType.LONG_HI, RegisterType.DOUBLE_HI, RegisterType.DOUBLE_LO}, new byte[]{RegisterType.DOUBLE_HI, 12, 9, RegisterType.LONG_HI, RegisterType.DOUBLE_LO, 5, RegisterType.DOUBLE_LO, RegisterType.LONG_HI}, new byte[]{9, RegisterType.DOUBLE_LO, 5, RegisterType.DOUBLE_HI, 4, 12, 9, 6}, new byte[]{12, 2, 2, 10, 3, 1, 1, RegisterType.DOUBLE_LO}, new byte[]{RegisterType.DOUBLE_HI, 1, RegisterType.LONG_HI, 10, 5, 10, 2, 3}};
    private final byte[] sbox = {12, 5, 6, RegisterType.FLOAT, 9, 0, 10, RegisterType.LONG_HI, 3, RegisterType.DOUBLE_LO, RegisterType.DOUBLE_HI, 8, 4, 7, 1, 2};

    /* renamed from: org.bouncycastle.crypto.engines.PhotonBeetleEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters;

        static {
            int[] iArr = new int[PhotonBeetleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters = iArr;
            try {
                iArr[PhotonBeetleParameters.pb32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters[PhotonBeetleParameters.pb128.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum PhotonBeetleParameters {
        pb32,
        pb128
    }

    public PhotonBeetleEngine(PhotonBeetleParameters photonBeetleParameters) {
        int i10;
        int i11;
        int i12 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters[photonBeetleParameters.ordinal()];
        if (i12 != 1) {
            i10 = i12 != 2 ? 0 : 128;
            i11 = i10;
        } else {
            i10 = 32;
            i11 = BERTags.FLAGS;
        }
        int i13 = i10 + 7;
        this.RATE_INBYTES = i13 >>> 3;
        this.RATE_INBYTES_HALF = i13 >>> 4;
        int i14 = i10 + i11;
        int i15 = (i14 + 7) >>> 3;
        this.STATE_INBYTES = i15;
        this.LAST_THREE_BITS_OFFSET = (i14 - ((i15 - 1) << 3)) - 3;
        this.initialised = false;
    }

    private void PHOTON_Permutation() {
        for (int i10 = 0; i10 < 64; i10++) {
            this.state_2d[i10 >>> 3][i10 & 7] = (byte) (((this.state[i10 >> 1] & 255) >>> ((i10 & 1) * 4)) & 15);
        }
        for (int i11 = 0; i11 < 12; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                byte[] bArr = this.state_2d[i12];
                bArr[0] = (byte) (bArr[0] ^ this.RC[i12][i11]);
            }
            for (int i13 = 0; i13 < 8; i13++) {
                for (int i14 = 0; i14 < 8; i14++) {
                    byte[] bArr2 = this.state_2d[i13];
                    bArr2[i14] = this.sbox[bArr2[i14]];
                }
            }
            for (int i15 = 1; i15 < 8; i15++) {
                System.arraycopy(this.state_2d[i15], 0, this.state, 0, 8);
                int i16 = 8 - i15;
                System.arraycopy(this.state, i15, this.state_2d[i15], 0, i16);
                System.arraycopy(this.state, 0, this.state_2d[i15], i16, i15);
            }
            for (int i17 = 0; i17 < 8; i17++) {
                for (int i18 = 0; i18 < 8; i18++) {
                    byte b10 = 0;
                    for (int i19 = 0; i19 < 8; i19++) {
                        int i20 = this.MixColMatrix[i18][i19];
                        byte b11 = this.state_2d[i19][i17];
                        int i21 = 0;
                        for (int i22 = 0; i22 < 4; i22++) {
                            if (((b11 >>> i22) & 1) != 0) {
                                i21 ^= i20;
                            }
                            int i23 = (i20 >>> 3) & 1;
                            i20 <<= 1;
                            if (i23 != 0) {
                                i20 ^= 3;
                            }
                        }
                        b10 = (byte) (b10 ^ (i21 & 15));
                    }
                    this.state[i18] = b10;
                }
                for (int i24 = 0; i24 < 8; i24++) {
                    this.state_2d[i24][i17] = this.state[i24];
                }
            }
        }
        for (int i25 = 0; i25 < 64; i25 += 2) {
            byte[] bArr3 = this.state_2d[i25 >>> 3];
            this.state[i25 >>> 1] = (byte) (((bArr3[(i25 + 1) & 7] & RegisterType.DOUBLE_HI) << 4) | (bArr3[i25 & 7] & RegisterType.DOUBLE_HI));
        }
    }

    private void XOR(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            byte[] bArr2 = this.state;
            bArr2[i12] = (byte) (bArr[i10] ^ bArr2[i12]);
            i12++;
            i10++;
        }
    }

    private void rhoohr(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14 = 0;
        byte[] bArr3 = this.state_2d[0];
        int iMin = Math.min(i12, this.RATE_INBYTES_HALF);
        int i15 = 0;
        while (true) {
            i13 = this.RATE_INBYTES_HALF;
            if (i15 >= i13 - 1) {
                break;
            }
            byte[] bArr4 = this.state;
            int i16 = i15 + 1;
            bArr3[i15] = (byte) (((bArr4[i16] & 1) << 7) | ((bArr4[i15] & 255) >>> 1));
            i15 = i16;
        }
        byte[] bArr5 = this.state;
        bArr3[i13 - 1] = (byte) (((bArr5[i15] & 255) >>> 1) | ((bArr5[0] & 1) << 7));
        while (i14 < iMin) {
            bArr[i14 + i10] = (byte) (bArr2[i14 + i11] ^ this.state[this.RATE_INBYTES_HALF + i14]);
            i14++;
        }
        while (i14 < i12) {
            bArr[i14 + i10] = (byte) (bArr2[i14 + i11] ^ bArr3[i14 - this.RATE_INBYTES_HALF]);
            i14++;
        }
        if (this.forEncryption) {
            XOR(bArr2, i11, i12);
        } else {
            XOR(bArr, i11, i12);
        }
    }

    private byte select(boolean z10, boolean z11, byte b10, byte b11) {
        if (z10 && z11) {
            return (byte) 1;
        }
        if (z10) {
            return (byte) 2;
        }
        return z11 ? b10 : b11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        PhotonBeetleEngine photonBeetleEngine;
        byte[] bArr2;
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        int size = this.message.size();
        boolean z10 = this.forEncryption;
        int i11 = size - (z10 ? 0 : 16);
        if ((z10 && i11 + 16 + i10 > bArr.length) || (!z10 && i11 + i10 > bArr.length)) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] byteArray = this.message.toByteArray();
        byte[] byteArray2 = this.aadData.toByteArray();
        this.A = byteArray2;
        int length = byteArray2.length;
        if (length != 0 || i11 != 0) {
            this.input_empty = false;
        }
        byte bSelect = select(i11 != 0, length % this.RATE_INBYTES == 0, (byte) 3, (byte) 4);
        byte bSelect2 = select(length != 0, i11 % this.RATE_INBYTES == 0, (byte) 5, (byte) 6);
        if (length != 0) {
            int i12 = this.RATE_INBYTES;
            int i13 = ((length + i12) - 1) / i12;
            int i14 = 0;
            while (true) {
                int i15 = i13 - 1;
                PHOTON_Permutation();
                if (i14 >= i15) {
                    break;
                }
                byte[] bArr3 = this.A;
                int i16 = this.RATE_INBYTES;
                XOR(bArr3, i14 * i16, i16);
                i14++;
            }
            int i17 = this.RATE_INBYTES;
            int i18 = length - (i14 * i17);
            XOR(this.A, i14 * i17, i18);
            if (i18 < this.RATE_INBYTES) {
                byte[] bArr4 = this.state;
                bArr4[i18] = (byte) (bArr4[i18] ^ 1);
            }
            byte[] bArr5 = this.state;
            int i19 = this.STATE_INBYTES - 1;
            bArr5[i19] = (byte) ((bSelect << this.LAST_THREE_BITS_OFFSET) ^ bArr5[i19]);
        }
        if (i11 != 0) {
            int i20 = this.RATE_INBYTES;
            int i21 = ((i11 + i20) - 1) / i20;
            int i22 = 0;
            while (i22 < i21 - 1) {
                PHOTON_Permutation();
                int i23 = this.RATE_INBYTES;
                rhoohr(bArr, (i22 * i23) + i10, byteArray, i22 * i23, i23);
                i22++;
            }
            photonBeetleEngine = this;
            bArr2 = bArr;
            PHOTON_Permutation();
            int i24 = photonBeetleEngine.RATE_INBYTES;
            int i25 = i11 - (i22 * i24);
            photonBeetleEngine.rhoohr(bArr2, (i22 * i24) + i10, byteArray, i22 * i24, i25);
            if (i25 < photonBeetleEngine.RATE_INBYTES) {
                byte[] bArr6 = photonBeetleEngine.state;
                bArr6[i25] = (byte) (bArr6[i25] ^ 1);
            }
            byte[] bArr7 = photonBeetleEngine.state;
            int i26 = photonBeetleEngine.STATE_INBYTES - 1;
            bArr7[i26] = (byte) (bArr7[i26] ^ (bSelect2 << photonBeetleEngine.LAST_THREE_BITS_OFFSET));
        } else {
            photonBeetleEngine = this;
            bArr2 = bArr;
        }
        int i27 = i10 + i11;
        if (photonBeetleEngine.input_empty) {
            byte[] bArr8 = photonBeetleEngine.state;
            int i28 = photonBeetleEngine.STATE_INBYTES - 1;
            bArr8[i28] = (byte) (bArr8[i28] ^ (1 << photonBeetleEngine.LAST_THREE_BITS_OFFSET));
        }
        PHOTON_Permutation();
        byte[] bArr9 = new byte[16];
        photonBeetleEngine.T = bArr9;
        System.arraycopy(photonBeetleEngine.state, 0, bArr9, 0, 16);
        if (photonBeetleEngine.forEncryption) {
            System.arraycopy(photonBeetleEngine.T, 0, bArr2, i27, 16);
            i11 += 16;
        } else {
            for (int i29 = 0; i29 < 16; i29++) {
                if (photonBeetleEngine.T[i29] != byteArray[i11 + i29]) {
                    throw new IllegalArgumentException("Mac does not match");
                }
            }
        }
        reset(false);
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "Photon-Beetle AEAD";
    }

    public int getBlockSize() {
        return this.RATE_INBYTES;
    }

    public int getIVBytesSize() {
        return 16;
    }

    public int getKeyBytesSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.T;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        return i10 + 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z10;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Photon-Beetle AEAD init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.N = iv;
        if (iv == null || iv.length != 16) {
            throw new IllegalArgumentException("Photon-Beetle AEAD requires exactly 16 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Photon-Beetle AEAD init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        this.K = key;
        if (key.length != 16) {
            throw new IllegalArgumentException("Photon-Beetle AEAD key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
        this.state = new byte[this.STATE_INBYTES];
        this.state_2d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 8);
        this.T = new byte[16];
        this.initialised = true;
        reset(false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        this.aadData.write(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.aadData.write(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException {
        return processBytes(new byte[]{b10}, 0, 1, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.message.write(bArr, i10, i11);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        reset(true);
    }

    private void reset(boolean z10) {
        if (z10) {
            this.T = null;
        }
        this.input_empty = true;
        this.aadData.reset();
        this.message.reset();
        byte[] bArr = this.K;
        System.arraycopy(bArr, 0, this.state, 0, bArr.length);
        byte[] bArr2 = this.N;
        System.arraycopy(bArr2, 0, this.state, this.K.length, bArr2.length);
        this.encrypted = false;
    }
}
