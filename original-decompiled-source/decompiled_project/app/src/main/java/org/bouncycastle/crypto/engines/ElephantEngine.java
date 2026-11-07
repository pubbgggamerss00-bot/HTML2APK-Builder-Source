package org.bouncycastle.crypto.engines;

import b.o;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class ElephantEngine implements AEADCipher {
    private final int BLOCK_SIZE;
    private final byte CRYPTO_ABYTES;

    /* renamed from: ad, reason: collision with root package name */
    private byte[] f19968ad;
    private int adOff;
    private int adlen;
    private final String algorithmName;
    private final byte[] buffer;
    private byte[] current_mask;
    private byte[] expanded_key;
    private boolean forEncryption;
    private boolean initialised;
    private byte[] inputMessage;
    private int inputOff;
    private byte lfsrIV;
    private int nBits;
    private final int nRounds;
    private int nSBox;
    private int nb_its;
    private byte[] next_mask;
    private byte[] npub;
    private final byte[] outputMessage;
    private final ElephantParameters parameters;
    private byte[] previous_mask;
    private final byte[] previous_outputMessage;
    private byte[] tag;
    private final byte[] tag_buffer;
    private final byte CRYPTO_KEYBYTES = RegisterType.UNINIT_REF;
    private final byte CRYPTO_NPUBBYTES = 12;
    private State m_state = State.Uninitialized;
    private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
    private final byte[] sBoxLayer = {-18, -19, -21, -32, -30, -31, -28, -17, -25, -22, -24, -27, -23, -20, -29, -26, -34, -35, -37, -48, -46, -47, -44, -33, -41, -38, -40, -43, -39, -36, -45, -42, -66, -67, -69, -80, -78, -79, -76, -65, -73, -70, -72, -75, -71, PSSSigner.TRAILER_IMPLICIT, -77, -74, RegisterType.DOUBLE_LO, RegisterType.LONG_HI, RegisterType.FLOAT, 0, 2, 1, 4, RegisterType.DOUBLE_HI, 7, 10, 8, 5, 9, 12, 3, 6, 46, 45, 43, 32, 34, 33, 36, 47, 39, 42, 40, 37, 41, 44, 35, 38, 30, 29, 27, RegisterType.UNINIT_REF, RegisterType.REFERENCE, RegisterType.UNINIT_THIS, 20, 31, 23, 26, 24, 21, 25, 28, RegisterType.CONFLICTED, 22, 78, 77, 75, 64, 66, 65, 68, 79, 71, 74, 72, 69, 73, 76, 67, 70, -2, -3, -5, -16, -14, -15, -12, -1, -9, -6, -8, -11, -7, -4, -13, -10, 126, 125, 123, 112, 114, 113, 116, Byte.MAX_VALUE, 119, 122, 120, 117, 121, 124, 115, 118, -82, -83, -85, -96, -94, -95, -92, -81, -89, -86, -88, -91, -87, -84, -93, -90, -114, -115, -117, Byte.MIN_VALUE, -126, -127, -124, -113, -121, -118, -120, -123, -119, -116, -125, -122, 94, 93, 91, 80, 82, 81, 84, 95, 87, 90, 88, 85, 89, 92, 83, 86, -98, -99, -101, -112, -110, -111, -108, -97, -105, -102, -104, -107, -103, -100, -109, -106, -50, -51, -53, -64, -62, -63, -60, -49, -57, -54, -56, -59, -55, -52, -61, -58, 62, 61, 59, 48, 50, 49, 52, 63, 55, 58, 56, 53, 57, 60, 51, 54, 110, 109, 107, 96, 98, 97, 100, 111, 103, 106, 104, 101, 105, 108, 99, 102};
    private final byte[] KeccakRoundConstants = {1, -126, -118, 0, -117, 1, -127, 9, -118, -120, 9, 10, -117, -117, -119, 3, 2, Byte.MIN_VALUE};
    private final int[] KeccakRhoOffsets = {0, 1, 6, 4, 3, 4, 4, 6, 7, 4, 3, 2, 3, 1, 7, 1, 5, 7, 5, 0, 2, 2, 5, 0, 6};

    /* renamed from: org.bouncycastle.crypto.engines.ElephantEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State = iArr;
            try {
                iArr[State.EncInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.DecInit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.Uninitialized.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.DecFinal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.EncFinal.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.EncAad.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.EncData.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.DecData.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[State.DecAad.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[ElephantParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters = iArr2;
            try {
                iArr2[ElephantParameters.elephant160.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[ElephantParameters.elephant176.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[ElephantParameters.elephant200.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum ElephantParameters {
        elephant160,
        elephant176,
        elephant200
    }

    public enum State {
        Uninitialized,
        EncInit,
        EncAad,
        EncData,
        EncFinal,
        DecInit,
        DecAad,
        DecData,
        DecFinal
    }

    public ElephantEngine(ElephantParameters elephantParameters) {
        String str;
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[elephantParameters.ordinal()];
        if (i10 == 1) {
            this.BLOCK_SIZE = 20;
            this.nBits = 160;
            this.nSBox = 20;
            this.nRounds = 80;
            this.lfsrIV = (byte) 117;
            this.CRYPTO_ABYTES = (byte) 8;
            str = "Elephant 160 AEAD";
        } else if (i10 == 2) {
            this.BLOCK_SIZE = 22;
            this.nBits = 176;
            this.nSBox = 22;
            this.nRounds = 90;
            this.lfsrIV = (byte) 69;
            this.CRYPTO_ABYTES = (byte) 8;
            str = "Elephant 176 AEAD";
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("Invalid parameter settings for Elephant");
            }
            this.BLOCK_SIZE = 25;
            this.nRounds = 18;
            this.CRYPTO_ABYTES = RegisterType.UNINIT_REF;
            str = "Elephant 200 AEAD";
        }
        this.algorithmName = str;
        this.parameters = elephantParameters;
        int i11 = this.BLOCK_SIZE;
        this.tag_buffer = new byte[i11];
        this.previous_mask = new byte[i11];
        this.current_mask = new byte[i11];
        this.next_mask = new byte[i11];
        this.buffer = new byte[i11];
        this.previous_outputMessage = new byte[i11];
        this.outputMessage = new byte[i11];
        this.initialised = false;
        reset(false);
    }

    private void KeccakP200Round(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[25];
        for (int i11 = 0; i11 < 5; i11++) {
            for (int i12 = 0; i12 < 5; i12++) {
                bArr2[i11] = (byte) (bArr2[i11] ^ bArr[index(i11, i12)]);
            }
        }
        int i13 = 0;
        while (i13 < 5) {
            int i14 = i13 + 1;
            bArr2[i13 + 5] = (byte) (bArr2[(i13 + 4) % 5] ^ ROL8(bArr2[i14 % 5], 1));
            i13 = i14;
        }
        for (int i15 = 0; i15 < 5; i15++) {
            for (int i16 = 0; i16 < 5; i16++) {
                int iIndex = index(i15, i16);
                bArr[iIndex] = (byte) (bArr[iIndex] ^ bArr2[i15 + 5]);
            }
        }
        for (int i17 = 0; i17 < 5; i17++) {
            for (int i18 = 0; i18 < 5; i18++) {
                bArr2[index(i17, i18)] = ROL8(bArr[index(i17, i18)], this.KeccakRhoOffsets[index(i17, i18)]);
            }
        }
        for (int i19 = 0; i19 < 5; i19++) {
            for (int i20 = 0; i20 < 5; i20++) {
                bArr[index(i20, ((i20 * 3) + (i19 * 2)) % 5)] = bArr2[index(i19, i20)];
            }
        }
        for (int i21 = 0; i21 < 5; i21++) {
            int i22 = 0;
            while (i22 < 5) {
                int i23 = i22 + 1;
                bArr2[i22] = (byte) (bArr[index(i22, i21)] ^ ((~bArr[index(i23 % 5, i21)]) & bArr[index((i22 + 2) % 5, i21)]));
                i22 = i23;
            }
            for (int i24 = 0; i24 < 5; i24++) {
                bArr[index(i24, i21)] = bArr2[i24];
            }
        }
        bArr[0] = (byte) (this.KeccakRoundConstants[i10] ^ bArr[0]);
    }

    private byte ROL8(byte b10, int i10) {
        int i11 = b10;
        if (i10 != 0) {
            int i12 = b10 & 255;
            i11 = (i12 >>> (8 - i10)) ^ (i12 << i10);
        }
        return (byte) i11;
    }

    private void checkAad() {
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()];
        if (i10 == 5) {
            throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " cannot be reused for encryption"));
        }
        if (i10 == 7) {
            throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size"));
        }
        if (i10 == 8) {
            throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the plaintext to be processed exceeds the a block size"));
        }
    }

    private void get_c_block(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        int i13 = this.BLOCK_SIZE;
        int i14 = i12 * i13;
        if (i14 == i11) {
            Arrays.fill(bArr, 0, i13, (byte) 0);
            bArr[0] = 1;
            return;
        }
        int i15 = i11 - i14;
        if (i13 <= i15) {
            System.arraycopy(bArr2, i10, bArr, 0, i13);
            return;
        }
        if (i15 > 0) {
            System.arraycopy(bArr2, i10, bArr, 0, i15);
        }
        Arrays.fill(bArr, i15, this.BLOCK_SIZE, (byte) 0);
        bArr[i15] = 1;
    }

    private int index(int i10, int i11) {
        return (i11 * 5) + i10;
    }

    private void lfsr_step(byte[] bArr, byte[] bArr2) {
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[this.parameters.ordinal()];
        if (i10 == 1) {
            int i11 = this.BLOCK_SIZE - 1;
            byte b10 = bArr2[0];
            int i12 = (bArr2[3] & 255) << 7;
            int i13 = (bArr2[13] & 255) >>> 7;
            bArr[i11] = (byte) (i13 ^ (i12 ^ (((b10 & 255) >>> 5) | ((b10 & 255) << 3))));
        } else if (i10 == 2) {
            bArr[this.BLOCK_SIZE - 1] = (byte) ((rotl(bArr2[0]) ^ ((bArr2[3] & 255) << 7)) ^ ((bArr2[19] & 255) >>> 7));
        } else if (i10 == 3) {
            bArr[this.BLOCK_SIZE - 1] = (byte) ((bArr2[13] << 1) ^ (rotl(bArr2[0]) ^ rotl(bArr2[2])));
        }
        System.arraycopy(bArr2, 1, bArr, 0, this.BLOCK_SIZE - 1);
    }

    private void permutation(byte[] bArr) {
        int i10;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[this.parameters.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            for (int i12 = 0; i12 < this.nRounds; i12++) {
                KeccakP200Round(bArr, i12);
            }
            return;
        }
        byte b10 = this.lfsrIV;
        byte[] bArr2 = new byte[this.nSBox];
        for (int i13 = 0; i13 < this.nRounds; i13++) {
            bArr[0] = (byte) (bArr[0] ^ b10);
            int i14 = this.nSBox - 1;
            int i15 = b10 & 32;
            int i16 = b10 & 64;
            bArr[i14] = (byte) (bArr[i14] ^ ((byte) (((((((((b10 & 1) << 7) | ((b10 & 2) << 5)) | ((b10 & 4) << 3)) | ((b10 & 8) << 1)) | ((b10 & RegisterType.UNINIT_REF) >>> 1)) | (i15 >>> 3)) | (i16 >>> 5)) | ((b10 & 128) >>> 7))));
            b10 = (byte) (((b10 << 1) | ((i16 >>> 6) ^ (i15 >>> 5))) & CertificateBody.profileType);
            for (int i17 = 0; i17 < this.nSBox; i17++) {
                bArr[i17] = this.sBoxLayer[bArr[i17] & 255];
            }
            Arrays.fill(bArr2, (byte) 0);
            int i18 = 0;
            while (true) {
                i10 = this.nSBox;
                if (i18 < i10) {
                    for (int i19 = 0; i19 < 8; i19++) {
                        int i20 = (i18 << 3) + i19;
                        int i21 = this.nBits;
                        if (i20 != i21 - 1) {
                            i20 = ((i20 * i21) >> 2) % (i21 - 1);
                        }
                        int i22 = i20 >>> 3;
                        bArr2[i22] = (byte) (((((bArr[i18] & 255) >>> i19) & 1) << (i20 & 7)) ^ bArr2[i22]);
                    }
                    i18++;
                }
            }
            System.arraycopy(bArr2, 0, bArr, 0, i10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void processAADBytes(byte[] bArr) {
        State state;
        int i10;
        int i11;
        checkAad();
        if (this.adOff == -1) {
            this.adlen = this.aadData.size();
            this.f19968ad = this.aadData.toByteArray();
            this.adOff = 0;
        }
        int[] iArr = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State;
        int i12 = iArr[this.m_state.ordinal()];
        int i13 = 12;
        if (i12 == 1) {
            System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BLOCK_SIZE);
            System.arraycopy(this.npub, 0, bArr, 0, 12);
            state = State.EncAad;
        } else if (i12 != 2) {
            switch (i12) {
                case 5:
                    throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " cannot be reused for encryption"));
                case 6:
                case 9:
                    if (this.adOff == this.adlen) {
                        Arrays.fill(bArr, 0, this.BLOCK_SIZE, (byte) 0);
                        bArr[0] = 1;
                        return;
                    }
                    i13 = 0;
                    i10 = this.BLOCK_SIZE - i13;
                    int i14 = this.adlen;
                    int i15 = this.adOff;
                    i11 = i14 - i15;
                    if (i10 <= i11) {
                        System.arraycopy(this.f19968ad, i15, bArr, i13, i10);
                        this.adOff += i10;
                        return;
                    }
                    if (i11 > 0) {
                        System.arraycopy(this.f19968ad, i15, bArr, i13, i11);
                        this.adOff += i11;
                    }
                    int i16 = i11 + i13;
                    Arrays.fill(bArr, i16, i13 + i10, (byte) 0);
                    bArr[i16] = 1;
                    int i17 = iArr[this.m_state.ordinal()];
                    if (i17 == 6) {
                        this.m_state = State.EncData;
                        return;
                    } else {
                        if (i17 != 9) {
                            return;
                        }
                        this.m_state = State.DecData;
                        return;
                    }
                case 7:
                    throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size"));
                case 8:
                    throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the plaintext to be processed exceeds the a block size"));
                default:
                    i13 = 0;
                    i10 = this.BLOCK_SIZE - i13;
                    int i142 = this.adlen;
                    int i152 = this.adOff;
                    i11 = i142 - i152;
                    if (i10 <= i11) {
                    }
                    break;
            }
        } else {
            System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BLOCK_SIZE);
            System.arraycopy(this.npub, 0, bArr, 0, 12);
            state = State.DecAad;
        }
        this.m_state = state;
        i10 = this.BLOCK_SIZE - i13;
        int i1422 = this.adlen;
        int i1522 = this.adOff;
        i11 = i1422 - i1522;
        if (i10 <= i11) {
        }
    }

    private byte rotl(byte b10) {
        int i10 = b10 & 255;
        return (byte) ((i10 >>> 7) | (i10 << 1));
    }

    private void xor_block(byte[] bArr, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12 + i10]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        int i11;
        int i12;
        if (!this.initialised) {
            throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " needs call init function before doFinal"));
        }
        int i13 = this.inputOff;
        boolean z10 = this.forEncryption;
        if ((z10 && i13 + i10 + this.CRYPTO_ABYTES > bArr.length) || (!z10 && (i13 + i10) - this.CRYPTO_ABYTES > bArr.length)) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.aadData.toByteArray();
        int i14 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()];
        if (i14 == 1 || i14 == 2) {
            processAADBytes(this.tag_buffer);
        }
        int i15 = this.nb_its;
        int i16 = this.BLOCK_SIZE;
        int i17 = ((i15 * i16) + i13) - (this.forEncryption ? (byte) 0 : this.CRYPTO_ABYTES);
        int length = byteArray.length;
        int i18 = i17 / i16;
        int i19 = i18 + 1;
        if (i17 % i16 != 0) {
            i11 = 2;
            i12 = i19;
        } else {
            i11 = 2;
            i12 = i18;
        }
        int i20 = (length + 12) / i16;
        int iProcessBytes = processBytes(this.inputMessage, bArr, i10, Math.max(i18 + i11, i20), i12, i19, i17, i20 + 1) + i10;
        this.tag = new byte[this.CRYPTO_ABYTES];
        xor_block(this.tag_buffer, this.expanded_key, 0, this.BLOCK_SIZE);
        permutation(this.tag_buffer);
        xor_block(this.tag_buffer, this.expanded_key, 0, this.BLOCK_SIZE);
        if (this.forEncryption) {
            System.arraycopy(this.tag_buffer, 0, this.tag, 0, this.CRYPTO_ABYTES);
            byte[] bArr2 = this.tag;
            System.arraycopy(bArr2, 0, bArr, iProcessBytes, bArr2.length);
            i17 += this.CRYPTO_ABYTES;
        } else {
            this.inputOff -= this.CRYPTO_ABYTES;
            for (int i21 = 0; i21 < this.CRYPTO_ABYTES; i21++) {
                if (this.tag_buffer[i21] != this.inputMessage[this.inputOff + i21]) {
                    throw new IllegalArgumentException("Mac does not match");
                }
            }
        }
        reset(false);
        return i17;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public int getBlockSize() {
        return this.CRYPTO_ABYTES;
    }

    public int getIVBytesSize() {
        return 12;
    }

    public int getKeyBytesSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()];
        if (i11 != 1) {
            if (i11 == 3) {
                throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
            }
            if (i11 == 4 || i11 == 5) {
                return 0;
            }
            if (i11 != 6 && i11 != 7) {
                return Math.max(0, i10 - this.CRYPTO_ABYTES);
            }
        }
        return i10 + this.CRYPTO_ABYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()];
        if (i11 != 1) {
            if (i11 == 3) {
                throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
            }
            if (i11 == 4 || i11 == 5) {
                return 0;
            }
            if (i11 != 6 && i11 != 7) {
                return Math.max(0, (i10 + this.inputOff) - this.CRYPTO_ABYTES);
            }
        }
        return this.inputOff + i10 + this.CRYPTO_ABYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z10;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " init parameters must include an IV"));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.npub = iv;
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " requires exactly 12 bytes of IV"));
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " init parameters must include a key"));
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException(o.a(new StringBuilder(), this.algorithmName, " key must be 128 bits long"));
        }
        byte[] bArr = new byte[this.BLOCK_SIZE];
        this.expanded_key = bArr;
        System.arraycopy(key, 0, bArr, 0, 16);
        permutation(this.expanded_key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
        this.initialised = true;
        this.m_state = z10 ? State.EncInit : State.DecInit;
        this.inputMessage = new byte[this.BLOCK_SIZE + (z10 ? (byte) 0 : this.CRYPTO_ABYTES)];
        reset(false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        this.aadData.write(b10);
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
        byte[] byteArray = this.aadData.toByteArray();
        int i13 = this.inputOff;
        if ((i13 + i11) - (this.forEncryption ? (byte) 0 : this.CRYPTO_ABYTES) < this.BLOCK_SIZE) {
            System.arraycopy(bArr, i10, this.inputMessage, i13, i11);
            this.inputOff += i11;
            return 0;
        }
        int i14 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$State[this.m_state.ordinal()];
        if (i14 == 1 || i14 == 2) {
            processAADBytes(this.tag_buffer);
        }
        int i15 = (this.inputOff + i11) - (this.forEncryption ? (byte) 0 : this.CRYPTO_ABYTES);
        int length = byteArray.length;
        int i16 = this.BLOCK_SIZE;
        int i17 = i15 / i16;
        int i18 = i15 % i16 != 0 ? i17 : i17 - 1;
        int i19 = ((length + 12) / i16) + 1;
        int iMax = Math.max(i17, 1) * this.BLOCK_SIZE;
        byte[] bArr3 = new byte[iMax];
        System.arraycopy(this.inputMessage, 0, bArr3, 0, this.inputOff);
        int i20 = this.inputOff;
        int i21 = iMax - i20;
        System.arraycopy(bArr, i10, bArr3, i20, iMax - i20);
        processBytes(bArr3, bArr2, i12, i17, i18 + 1, i17, i15, i19);
        int i22 = i11 - i21;
        this.inputOff = i22;
        System.arraycopy(bArr, i10 + i21, this.inputMessage, 0, i22);
        this.nb_its += i17;
        return i17 * this.BLOCK_SIZE;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private int processBytes(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = this.nb_its;
        int i17 = 0;
        while (i16 < i11) {
            lfsr_step(this.next_mask, this.current_mask);
            if (i16 < i12) {
                System.arraycopy(this.npub, 0, this.buffer, 0, 12);
                Arrays.fill(this.buffer, 12, this.BLOCK_SIZE, (byte) 0);
                xor_block(this.buffer, this.current_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                permutation(this.buffer);
                xor_block(this.buffer, this.current_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                int i18 = i16 == i12 + (-1) ? i14 - (this.BLOCK_SIZE * i16) : this.BLOCK_SIZE;
                xor_block(this.buffer, bArr, 0, i18);
                System.arraycopy(this.buffer, 0, bArr2, i10, i18);
                if (this.forEncryption) {
                    System.arraycopy(this.buffer, 0, this.outputMessage, 0, i18);
                } else {
                    System.arraycopy(bArr, 0, this.outputMessage, 0, i18);
                }
                i17 += i18;
            }
            int i19 = i17;
            if (i16 > 0 && i16 <= i13) {
                get_c_block(this.buffer, this.previous_outputMessage, 0, i14, i16 - 1);
                xor_block(this.buffer, this.previous_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                permutation(this.buffer);
                xor_block(this.buffer, this.previous_mask, 0, this.BLOCK_SIZE);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                xor_block(this.tag_buffer, this.buffer, 0, this.BLOCK_SIZE);
            }
            i16++;
            if (i16 < i15) {
                processAADBytes(this.buffer);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                permutation(this.buffer);
                xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
                xor_block(this.tag_buffer, this.buffer, 0, this.BLOCK_SIZE);
            }
            byte[] bArr3 = this.previous_mask;
            this.previous_mask = this.current_mask;
            this.current_mask = this.next_mask;
            this.next_mask = bArr3;
            System.arraycopy(this.outputMessage, 0, this.previous_outputMessage, 0, this.BLOCK_SIZE);
            i17 = i19;
        }
        return i17;
    }

    private void reset(boolean z10) {
        if (z10) {
            this.tag = null;
        }
        this.aadData.reset();
        Arrays.fill(this.tag_buffer, (byte) 0);
        this.inputOff = 0;
        this.nb_its = 0;
        this.adOff = -1;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.aadData.write(bArr, i10, i11);
    }
}
