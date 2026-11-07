package org.bouncycastle.crypto.engines;

import b.o;
import j2.y;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SparkleEngine implements AEADCipher {
    private static final int[] RCON = {-1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891};
    private final int CAP_MASK;
    private final int KEY_BYTES;
    private final int KEY_WORDS;
    private final int RATE_BYTES;
    private final int RATE_WORDS;
    private final int SCHWAEMM_KEY_LEN;
    private final int SCHWAEMM_NONCE_LEN;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private final int TAG_BYTES;
    private final int TAG_WORDS;
    private final int _A0;
    private final int _A1;
    private final int _M2;
    private final int _M3;
    private String algorithmName;
    private boolean encrypted;
    private byte[] initialAssociatedText;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f19992k;
    private final byte[] m_buf;
    private final int m_bufferSizeDecrypt;
    private final int[] npub;
    private final int[] state;
    private byte[] tag;
    private State m_state = State.Uninitialized;
    private int m_bufPos = 0;

    /* renamed from: org.bouncycastle.crypto.engines.SparkleEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State = iArr;
            try {
                iArr[State.DecInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecAad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecData.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecFinal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncData.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncFinal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncInit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncAad.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[SparkleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters = iArr2;
            try {
                iArr2[SparkleParameters.SCHWAEMM128_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_128.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM192_192.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_256.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum SparkleParameters {
        SCHWAEMM128_128,
        SCHWAEMM256_128,
        SCHWAEMM192_192,
        SCHWAEMM256_256
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SparkleEngine(SparkleParameters sparkleParameters) {
        int i10;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[sparkleParameters.ordinal()];
        int i12 = 256;
        int i13 = 128;
        if (i11 != 1) {
            i10 = 384;
            if (i11 != 2) {
                if (i11 == 3) {
                    i12 = 192;
                    this.SCHWAEMM_KEY_LEN = 192;
                    this.SCHWAEMM_NONCE_LEN = 192;
                    this.SPARKLE_STEPS_SLIM = 7;
                    this.SPARKLE_STEPS_BIG = 11;
                    this.algorithmName = "SCHWAEMM192-192";
                } else {
                    if (i11 != 4) {
                        throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
                    }
                    this.SCHWAEMM_KEY_LEN = 256;
                    this.SCHWAEMM_NONCE_LEN = 256;
                    this.SPARKLE_STEPS_SLIM = 8;
                    this.SPARKLE_STEPS_BIG = 12;
                    this.algorithmName = "SCHWAEMM256-256";
                    i10 = 512;
                }
                i13 = i12;
                int i14 = this.SCHWAEMM_KEY_LEN;
                int i15 = i14 >>> 5;
                this.KEY_WORDS = i15;
                this.KEY_BYTES = i14 >>> 3;
                this.TAG_WORDS = i12 >>> 5;
                int i16 = i12 >>> 3;
                this.TAG_BYTES = i16;
                int i17 = i10 >>> 5;
                this.STATE_WORDS = i17;
                int i18 = this.SCHWAEMM_NONCE_LEN;
                int i19 = i18 >>> 5;
                this.RATE_WORDS = i19;
                int i20 = i18 >>> 3;
                this.RATE_BYTES = i20;
                int i21 = i13 >>> 6;
                int i22 = i13 >>> 5;
                this.CAP_MASK = i19 <= i22 ? i22 - 1 : -1;
                int i23 = 1 << i21;
                this._A0 = i23 << 24;
                this._A1 = (i23 ^ 1) << 24;
                this._M2 = (i23 ^ 2) << 24;
                this._M3 = (3 ^ i23) << 24;
                this.state = new int[i17];
                this.f19992k = new int[i15];
                this.npub = new int[i19];
                int i24 = i20 + i16;
                this.m_bufferSizeDecrypt = i24;
                this.m_buf = new byte[i24];
            }
            this.SCHWAEMM_KEY_LEN = 128;
            this.SCHWAEMM_NONCE_LEN = 256;
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 11;
            this.algorithmName = "SCHWAEMM256-128";
        } else {
            this.SCHWAEMM_KEY_LEN = 128;
            this.SCHWAEMM_NONCE_LEN = 128;
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 10;
            this.algorithmName = "SCHWAEMM128-128";
            i10 = 256;
        }
        i12 = 128;
        int i142 = this.SCHWAEMM_KEY_LEN;
        int i152 = i142 >>> 5;
        this.KEY_WORDS = i152;
        this.KEY_BYTES = i142 >>> 3;
        this.TAG_WORDS = i12 >>> 5;
        int i162 = i12 >>> 3;
        this.TAG_BYTES = i162;
        int i172 = i10 >>> 5;
        this.STATE_WORDS = i172;
        int i182 = this.SCHWAEMM_NONCE_LEN;
        int i192 = i182 >>> 5;
        this.RATE_WORDS = i192;
        int i202 = i182 >>> 3;
        this.RATE_BYTES = i202;
        int i212 = i13 >>> 6;
        int i222 = i13 >>> 5;
        this.CAP_MASK = i192 <= i222 ? i222 - 1 : -1;
        int i232 = 1 << i212;
        this._A0 = i232 << 24;
        this._A1 = (i232 ^ 1) << 24;
        this._M2 = (i232 ^ 2) << 24;
        this._M3 = (3 ^ i232) << 24;
        this.state = new int[i172];
        this.f19992k = new int[i152];
        this.npub = new int[i192];
        int i242 = i202 + i162;
        this.m_bufferSizeDecrypt = i242;
        this.m_buf = new byte[i242];
    }

    private static int ELL(int i10) {
        return (i10 & 65535) ^ Integers.rotateRight(i10, 16);
    }

    private void checkAAD() {
        State state;
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()];
        if (i10 == 1) {
            state = State.DecAad;
        } else {
            if (i10 == 2) {
                return;
            }
            if (i10 == 6) {
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            }
            if (i10 != 7) {
                if (i10 == 8) {
                    return;
                }
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
            }
            state = State.EncAad;
        }
        this.m_state = state;
    }

    private boolean checkData() {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                finishAAD(State.DecData);
                return false;
            case 3:
                return false;
            case 4:
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
            case 5:
                return true;
            case 6:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 7:
            case 8:
                finishAAD(State.EncData);
                return true;
        }
    }

    private void finishAAD(State state) {
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()];
        if (i10 == 2 || i10 == 8) {
            processFinalAAD();
        }
        this.m_bufPos = 0;
        this.m_state = state;
    }

    private void processBufferAAD(byte[] bArr, int i10) {
        int i11 = 0;
        while (true) {
            int i12 = this.RATE_WORDS;
            if (i11 >= i12 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                return;
            }
            int i13 = (i12 / 2) + i11;
            int[] iArr = this.state;
            int i14 = iArr[i11];
            int i15 = iArr[i13];
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i11 * 4) + i10);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, (i13 * 4) + i10);
            int[] iArr2 = this.state;
            int i16 = this.RATE_WORDS;
            iArr2[i11] = (iLittleEndianToInt ^ i15) ^ iArr2[i16 + i11];
            iArr2[i13] = ((i15 ^ i14) ^ iLittleEndianToInt2) ^ iArr2[i16 + (this.CAP_MASK & i13)];
            i11++;
        }
    }

    private void processBufferDecrypt(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (i11 > bArr2.length - this.RATE_BYTES) {
            throw new OutputLengthException("output buffer too short");
        }
        int i12 = 0;
        while (true) {
            int i13 = this.RATE_WORDS;
            if (i12 >= i13 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i14 = (i13 / 2) + i12;
            int[] iArr = this.state;
            int i15 = iArr[i12];
            int i16 = iArr[i14];
            int i17 = i12 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i10 + i17);
            int i18 = i14 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i10 + i18);
            int[] iArr2 = this.state;
            int i19 = this.RATE_WORDS;
            iArr2[i12] = ((i15 ^ i16) ^ iLittleEndianToInt) ^ iArr2[i19 + i12];
            iArr2[i14] = (i15 ^ iLittleEndianToInt2) ^ iArr2[i19 + (this.CAP_MASK & i14)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i15, bArr2, i11 + i17);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i16, bArr2, i11 + i18);
            i12++;
        }
    }

    private void processBufferEncrypt(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (i11 > bArr2.length - this.RATE_BYTES) {
            throw new OutputLengthException("output buffer too short");
        }
        int i12 = 0;
        while (true) {
            int i13 = this.RATE_WORDS;
            if (i12 >= i13 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i14 = (i13 / 2) + i12;
            int[] iArr = this.state;
            int i15 = iArr[i12];
            int i16 = iArr[i14];
            int i17 = i12 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i10 + i17);
            int i18 = i14 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i10 + i18);
            int[] iArr2 = this.state;
            int i19 = this.RATE_WORDS;
            iArr2[i12] = (i16 ^ iLittleEndianToInt) ^ iArr2[i19 + i12];
            iArr2[i14] = ((i15 ^ i16) ^ iLittleEndianToInt2) ^ iArr2[i19 + (this.CAP_MASK & i14)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i15, bArr2, i11 + i17);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i16, bArr2, i11 + i18);
            i12++;
        }
    }

    private void processFinalAAD() {
        int i10 = this.m_bufPos;
        int i11 = 0;
        if (i10 < this.RATE_BYTES) {
            int[] iArr = this.state;
            int i12 = this.STATE_WORDS - 1;
            iArr[i12] = iArr[i12] ^ this._A0;
            this.m_buf[i10] = Byte.MIN_VALUE;
            while (true) {
                int i13 = this.m_bufPos + 1;
                this.m_bufPos = i13;
                if (i13 >= this.RATE_BYTES) {
                    break;
                } else {
                    this.m_buf[i13] = 0;
                }
            }
        } else {
            int[] iArr2 = this.state;
            int i14 = this.STATE_WORDS - 1;
            iArr2[i14] = iArr2[i14] ^ this._A1;
        }
        while (true) {
            int i15 = this.RATE_WORDS;
            if (i11 >= i15 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
                return;
            }
            int i16 = (i15 / 2) + i11;
            int[] iArr3 = this.state;
            int i17 = iArr3[i11];
            int i18 = iArr3[i16];
            int iLittleEndianToInt = Pack.littleEndianToInt(this.m_buf, i11 * 4);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(this.m_buf, i16 * 4);
            int[] iArr4 = this.state;
            int i19 = this.RATE_WORDS;
            iArr4[i11] = (iLittleEndianToInt ^ i18) ^ iArr4[i19 + i11];
            iArr4[i16] = ((i18 ^ i17) ^ iLittleEndianToInt2) ^ iArr4[i19 + (this.CAP_MASK & i16)];
            i11++;
        }
    }

    private static void sparkle_opt(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 8) {
            sparkle_opt8(iArr, i10);
        } else if (length == 12) {
            sparkle_opt12(iArr, i10);
        } else {
            if (length != 16) {
                throw new IllegalStateException();
            }
            sparkle_opt16(iArr, i10);
        }
    }

    public static void sparkle_opt12(SparkleDigest.Friend friend, int[] iArr, int i10) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt12(iArr, i10);
    }

    public static void sparkle_opt16(SparkleDigest.Friend friend, int[] iArr, int i10) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt16(iArr, i10);
    }

    public static void sparkle_opt8(int[] iArr, int i10) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        char c10 = 2;
        int i13 = iArr[2];
        char c11 = 3;
        int i14 = iArr[3];
        char c12 = 4;
        int i15 = iArr[4];
        char c13 = 5;
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = 0;
        while (i19 < i10) {
            int[] iArr2 = RCON;
            int i20 = i12 ^ iArr2[i19 & 7];
            int i21 = i14 ^ i19;
            int i22 = iArr2[0];
            char c14 = c10;
            int iRotateRight = Integers.rotateRight(i20, 31) + i11;
            char c15 = c11;
            int iRotateRight2 = i20 ^ Integers.rotateRight(iRotateRight, 24);
            char c16 = c12;
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i22);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i23 = (iRotateRight3 ^ i22) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i23, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i23 ^ i22);
            char c17 = c13;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i24 = iRotateRight6 ^ i22;
            int i25 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i21, 31) + i13;
            int iRotateRight9 = i21 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i25);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i26 = (iRotateRight10 ^ i25) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i26, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i26 ^ i25);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i27 = iRotateRight13 ^ i25;
            int i28 = iArr2[c14];
            int iRotateRight15 = Integers.rotateRight(i16, 31) + i15;
            int iRotateRight16 = i16 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i28);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i29 = (iRotateRight17 ^ i28) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i29, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i29 ^ i28);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i30 = iArr2[c15];
            int iRotateRight22 = Integers.rotateRight(i18, 31) + i17;
            int iRotateRight23 = i18 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i30);
            int iRotateRight25 = Integers.rotateRight(iRotateRight24, 17) ^ iRotateRight23;
            int i31 = (iRotateRight24 ^ i30) + iRotateRight25;
            int iRotateRight26 = Integers.rotateRight(i31, 31) ^ iRotateRight25;
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i31 ^ i30);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int iELL = ELL(i24 ^ i27);
            int iELL2 = ELL(iRotateRight7 ^ iRotateRight14);
            int i32 = ((iRotateRight27 ^ i30) ^ i27) ^ iELL2;
            int i33 = (iRotateRight28 ^ iRotateRight14) ^ iELL;
            int i34 = iELL ^ (iRotateRight21 ^ iRotateRight7);
            i19++;
            i16 = iRotateRight7;
            i12 = i33;
            i17 = i27;
            i18 = iRotateRight14;
            i14 = i34;
            i13 = ((iRotateRight20 ^ i28) ^ i24) ^ iELL2;
            c10 = c14;
            c12 = c16;
            c13 = c17;
            i15 = i24;
            i11 = i32;
            c11 = c15;
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[c10] = i13;
        iArr[c11] = i14;
        iArr[c12] = i15;
        iArr[c13] = i16;
        iArr[6] = i17;
        iArr[7] = i18;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        int i11;
        int i12;
        boolean zCheckData = checkData();
        int i13 = this.m_bufPos;
        int i14 = this.TAG_BYTES;
        if (zCheckData) {
            i11 = i13 + i14;
        } else {
            if (i13 < i14) {
                throw new InvalidCipherTextException("data too short");
            }
            i11 = i13 - i14;
            this.m_bufPos = i11;
        }
        if (i10 > bArr.length - i11) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypted || this.m_bufPos > 0) {
            int[] iArr = this.state;
            int i15 = this.STATE_WORDS - 1;
            iArr[i15] = iArr[i15] ^ (this.m_bufPos < this.RATE_BYTES ? this._M2 : this._M3);
            int[] iArr2 = new int[this.RATE_WORDS];
            int i16 = 0;
            while (true) {
                i12 = this.m_bufPos;
                if (i16 >= i12) {
                    break;
                }
                int i17 = i16 >>> 2;
                iArr2[i17] = iArr2[i17] | ((this.m_buf[i16] & 255) << ((i16 & 3) << 3));
                i16++;
            }
            if (i12 < this.RATE_BYTES) {
                if (!zCheckData) {
                    int i18 = (i12 & 3) << 3;
                    int i19 = i12 >>> 2;
                    int i20 = iArr2[i19];
                    int[] iArr3 = this.state;
                    iArr2[i19] = ((iArr3[i12 >>> 2] >>> i18) << i18) | i20;
                    int i21 = (i12 >>> 2) + 1;
                    System.arraycopy(iArr3, i21, iArr2, i21, this.RATE_WORDS - i21);
                }
                int i22 = this.m_bufPos;
                int i23 = i22 >>> 2;
                iArr2[i23] = (128 << ((i22 & 3) << 3)) ^ iArr2[i23];
            }
            int i24 = 0;
            while (true) {
                int i25 = this.RATE_WORDS;
                if (i24 >= i25 / 2) {
                    break;
                }
                int i26 = (i25 / 2) + i24;
                int[] iArr4 = this.state;
                int i27 = iArr4[i24];
                int i28 = iArr4[i26];
                if (zCheckData) {
                    iArr4[i24] = (iArr2[i24] ^ i28) ^ iArr4[i25 + i24];
                    iArr4[i26] = iArr4[i25 + (this.CAP_MASK & i26)] ^ ((i27 ^ i28) ^ iArr2[i26]);
                } else {
                    iArr4[i24] = ((i27 ^ i28) ^ iArr2[i24]) ^ iArr4[i25 + i24];
                    iArr4[i26] = iArr4[i25 + (this.CAP_MASK & i26)] ^ (iArr2[i26] ^ i27);
                }
                iArr2[i24] = iArr2[i24] ^ i27;
                iArr2[i26] = iArr2[i26] ^ i28;
                i24++;
            }
            int i29 = 0;
            while (i29 < this.m_bufPos) {
                bArr[i10] = (byte) (iArr2[i29 >>> 2] >>> ((i29 & 3) << 3));
                i29++;
                i10++;
            }
            sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        }
        for (int i30 = 0; i30 < this.KEY_WORDS; i30++) {
            int[] iArr5 = this.state;
            int i31 = this.RATE_WORDS + i30;
            iArr5[i31] = iArr5[i31] ^ this.f19992k[i30];
        }
        byte[] bArr2 = new byte[this.TAG_BYTES];
        this.tag = bArr2;
        Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, bArr2, 0);
        if (zCheckData) {
            System.arraycopy(this.tag, 0, bArr, i10, this.TAG_BYTES);
        } else if (!Arrays.constantTimeAreEqual(this.TAG_BYTES, this.tag, 0, this.m_buf, this.m_bufPos)) {
            throw new InvalidCipherTextException(o.a(new StringBuilder(), this.algorithmName, " mac does not match"));
        }
        reset(!zCheckData);
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public int getIVBytesSize() {
        return this.RATE_BYTES;
    }

    public int getKeyBytesSize() {
        return this.KEY_BYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int iMax = Math.max(0, i10);
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                return Math.max(0, iMax - this.TAG_BYTES);
            case 3:
            case 4:
                return Math.max(0, (iMax + this.m_bufPos) - this.TAG_BYTES);
            case 5:
            case 6:
                return iMax + this.m_bufPos + this.TAG_BYTES;
            default:
                return iMax + this.TAG_BYTES;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int i11;
        int iMax = Math.max(0, i10) - 1;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 3:
            case 4:
                iMax += this.m_bufPos;
            case 1:
            case 2:
                i11 = iMax - this.TAG_BYTES;
                iMax = Math.max(0, i11);
                break;
            case 5:
            case 6:
                i11 = iMax + this.m_bufPos;
                iMax = Math.max(0, i11);
                break;
        }
        return iMax - (iMax % this.RATE_BYTES);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        KeyParameter key;
        byte[] iv;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize != this.TAG_BYTES * 8) {
                throw new IllegalArgumentException(y.a(macSize, "Invalid value for MAC size: "));
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to Sparkle");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            CipherParameters parameters = parametersWithIV.getParameters();
            key = parameters instanceof KeyParameter ? (KeyParameter) parameters : null;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            throw new IllegalArgumentException("Sparkle init parameters must include a key");
        }
        int i10 = this.KEY_WORDS * 4;
        if (i10 != key.getKeyLength()) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i10 + " bytes of key");
        }
        int i11 = this.RATE_WORDS * 4;
        if (iv == null || i11 != iv.length) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i11 + " bytes of IV");
        }
        Pack.littleEndianToInt(key.getKey(), 0, this.f19992k);
        Pack.littleEndianToInt(iv, 0, this.npub);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
        this.m_state = z10 ? State.EncInit : State.DecInit;
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        checkAAD();
        if (this.m_bufPos == this.RATE_BYTES) {
            processBufferAAD(this.m_buf, 0);
            this.m_bufPos = 0;
        }
        byte[] bArr = this.m_buf;
        int i10 = this.m_bufPos;
        this.m_bufPos = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        if (i10 > bArr.length - i11) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 <= 0) {
            return;
        }
        checkAAD();
        int i12 = this.m_bufPos;
        if (i12 > 0) {
            int i13 = this.RATE_BYTES - i12;
            if (i11 <= i13) {
                System.arraycopy(bArr, i10, this.m_buf, i12, i11);
                this.m_bufPos += i11;
                return;
            } else {
                System.arraycopy(bArr, i10, this.m_buf, i12, i13);
                i10 += i13;
                i11 -= i13;
                processBufferAAD(this.m_buf, 0);
            }
        }
        while (i11 > this.RATE_BYTES) {
            processBufferAAD(bArr, i10);
            int i14 = this.RATE_BYTES;
            i10 += i14;
            i11 -= i14;
        }
        System.arraycopy(bArr, i10, this.m_buf, 0, i11);
        this.m_bufPos = i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException {
        return processBytes(new byte[]{b10}, 0, 1, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        int i13;
        int i14;
        if (i10 > bArr.length - i11) {
            throw new DataLengthException("input buffer too short");
        }
        if (checkData()) {
            int i15 = this.m_bufPos;
            if (i15 > 0) {
                int i16 = this.RATE_BYTES - i15;
                if (i11 <= i16) {
                    System.arraycopy(bArr, i10, this.m_buf, i15, i11);
                    this.m_bufPos += i11;
                    return 0;
                }
                System.arraycopy(bArr, i10, this.m_buf, i15, i16);
                i10 += i16;
                i11 -= i16;
                processBufferEncrypt(this.m_buf, 0, bArr2, i12);
                i14 = this.RATE_BYTES;
            } else {
                i14 = 0;
            }
            while (i11 > this.RATE_BYTES) {
                processBufferEncrypt(bArr, i10, bArr2, i12 + i14);
                int i17 = this.RATE_BYTES;
                i10 += i17;
                i11 -= i17;
                i14 += i17;
            }
            System.arraycopy(bArr, i10, this.m_buf, 0, i11);
            this.m_bufPos = i11;
            return i14;
        }
        int i18 = this.m_bufferSizeDecrypt;
        int i19 = this.m_bufPos;
        int i20 = i18 - i19;
        if (i11 <= i20) {
            System.arraycopy(bArr, i10, this.m_buf, i19, i11);
            this.m_bufPos += i11;
            return 0;
        }
        if (i19 > this.RATE_BYTES) {
            processBufferDecrypt(this.m_buf, 0, bArr2, i12);
            int i21 = this.m_bufPos;
            int i22 = this.RATE_BYTES;
            int i23 = i21 - i22;
            this.m_bufPos = i23;
            byte[] bArr3 = this.m_buf;
            System.arraycopy(bArr3, i22, bArr3, 0, i23);
            i13 = this.RATE_BYTES;
            if (i11 <= i20 + i13) {
                System.arraycopy(bArr, i10, this.m_buf, this.m_bufPos, i11);
                this.m_bufPos += i11;
                return i13;
            }
        } else {
            i13 = 0;
        }
        int i24 = this.RATE_BYTES;
        int i25 = this.m_bufPos;
        int i26 = i24 - i25;
        System.arraycopy(bArr, i10, this.m_buf, i25, i26);
        i10 += i26;
        i11 -= i26;
        processBufferDecrypt(this.m_buf, 0, bArr2, i12 + i13);
        i14 = i13 + this.RATE_BYTES;
        while (i11 > this.m_bufferSizeDecrypt) {
            processBufferDecrypt(bArr, i10, bArr2, i12 + i14);
            int i27 = this.RATE_BYTES;
            i10 += i27;
            i11 -= i27;
            i14 += i27;
        }
        System.arraycopy(bArr, i10, this.m_buf, 0, i11);
        this.m_bufPos = i11;
        return i14;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z10) {
        if (z10) {
            this.tag = null;
        }
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
        this.encrypted = false;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 7:
                break;
            case 2:
            case 3:
            case 4:
                this.m_state = State.DecInit;
                break;
            case 5:
            case 6:
            case 8:
                this.m_state = State.EncFinal;
                return;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
        System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
        System.arraycopy(this.f19992k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
        sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public static void sparkle_opt12(int[] iArr, int i10) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        char c10 = 4;
        int i15 = iArr[4];
        char c11 = 5;
        int i16 = iArr[5];
        char c12 = 6;
        int i17 = iArr[6];
        char c13 = 7;
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i20 = iArr[9];
        int i21 = iArr[10];
        int i22 = iArr[11];
        int i23 = 0;
        int i24 = i20;
        while (i23 < i10) {
            int[] iArr2 = RCON;
            int i25 = i12 ^ iArr2[i23 & 7];
            int i26 = i14 ^ i23;
            int i27 = iArr2[0];
            char c14 = c10;
            int iRotateRight = Integers.rotateRight(i25, 31) + i11;
            char c15 = c11;
            int iRotateRight2 = i25 ^ Integers.rotateRight(iRotateRight, 24);
            char c16 = c12;
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i27);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i28 = (iRotateRight3 ^ i27) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i28, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i28 ^ i27);
            char c17 = c13;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i29 = iRotateRight6 ^ i27;
            int i30 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i26, 31) + i13;
            int iRotateRight9 = i26 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i30);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i31 = (iRotateRight10 ^ i30) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i31, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i31 ^ i30);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i32 = iRotateRight13 ^ i30;
            int i33 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i16, 31) + i15;
            int iRotateRight16 = i16 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i33);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i34 = (iRotateRight17 ^ i33) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i34, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i34 ^ i33);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i35 = iRotateRight20 ^ i33;
            int i36 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i18, 31) + i17;
            int iRotateRight23 = i18 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i36);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i37 = (iRotateRight24 ^ i36) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i37, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i37 ^ i36);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i38 = iRotateRight27 ^ i36;
            int i39 = iArr2[c14];
            int iRotateRight29 = Integers.rotateRight(i24, 31) + i19;
            int iRotateRight30 = i24 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = Integers.rotateRight(iRotateRight30, 17) + (iRotateRight29 ^ i39);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i40 = (iRotateRight31 ^ i39) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i40, 31);
            int iRotateRight34 = Integers.rotateRight(iRotateRight33, 24) + (i40 ^ i39);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i41 = iRotateRight34 ^ i39;
            int i42 = iArr2[c15];
            int iRotateRight36 = Integers.rotateRight(i22, 31) + i21;
            int iRotateRight37 = i22 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = Integers.rotateRight(iRotateRight37, 17) + (iRotateRight36 ^ i42);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i43 = (iRotateRight38 ^ i42) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i43, 31);
            int iRotateRight41 = Integers.rotateRight(iRotateRight40, 24) + (i43 ^ i42);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i44 = iRotateRight41 ^ i42;
            int iELL = ELL((i29 ^ i32) ^ i35);
            int iELL2 = ELL((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21);
            int i45 = (i41 ^ i32) ^ iELL2;
            int i46 = (iRotateRight35 ^ iRotateRight14) ^ iELL;
            int i47 = (iRotateRight42 ^ iRotateRight21) ^ iELL;
            int i48 = iELL ^ (iRotateRight28 ^ iRotateRight7);
            i23++;
            i18 = iRotateRight7;
            i19 = i32;
            i13 = (i44 ^ i35) ^ iELL2;
            i21 = i35;
            i15 = (i38 ^ i29) ^ iELL2;
            c10 = c14;
            c13 = c17;
            i12 = i46;
            i17 = i29;
            i24 = iRotateRight14;
            i11 = i45;
            c12 = c16;
            i14 = i47;
            i22 = iRotateRight21;
            i16 = i48;
            c11 = c15;
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
        iArr[c10] = i15;
        iArr[c11] = i16;
        iArr[c12] = i17;
        iArr[c13] = i18;
        iArr[8] = i19;
        iArr[9] = i24;
        iArr[10] = i21;
        iArr[11] = i22;
    }

    public static void sparkle_opt16(int[] iArr, int i10) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        char c10 = 6;
        int i17 = iArr[6];
        char c11 = 7;
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i20 = iArr[9];
        int i21 = iArr[10];
        int i22 = iArr[11];
        int i23 = iArr[12];
        int i24 = iArr[13];
        int i25 = iArr[14];
        int i26 = i22;
        int i27 = i24;
        int i28 = iArr[15];
        int i29 = 0;
        int i30 = i20;
        while (i29 < i10) {
            int[] iArr2 = RCON;
            int i31 = i12 ^ iArr2[i29 & 7];
            int i32 = i14 ^ i29;
            int i33 = iArr2[0];
            char c12 = c10;
            int iRotateRight = Integers.rotateRight(i31, 31) + i11;
            char c13 = c11;
            int iRotateRight2 = i31 ^ Integers.rotateRight(iRotateRight, 24);
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i33);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i34 = (iRotateRight3 ^ i33) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i34, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i34 ^ i33);
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i35 = iRotateRight6 ^ i33;
            int i36 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i32, 31) + i13;
            int iRotateRight9 = i32 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i36);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i37 = (iRotateRight10 ^ i36) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i37, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i37 ^ i36);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i38 = iRotateRight13 ^ i36;
            int i39 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i16, 31) + i15;
            int iRotateRight16 = i16 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i39);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i40 = (iRotateRight17 ^ i39) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i40, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i40 ^ i39);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i41 = iRotateRight20 ^ i39;
            int i42 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i18, 31) + i17;
            int iRotateRight23 = i18 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i42);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i43 = (iRotateRight24 ^ i42) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i43, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i43 ^ i42);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i44 = i42 ^ iRotateRight27;
            int i45 = iArr2[4];
            int iRotateRight29 = Integers.rotateRight(i30, 31) + i19;
            int iRotateRight30 = i30 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = Integers.rotateRight(iRotateRight30, 17) + (iRotateRight29 ^ i45);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i46 = (iRotateRight31 ^ i45) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i46, 31);
            int iRotateRight34 = Integers.rotateRight(iRotateRight33, 24) + (i46 ^ i45);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i47 = iRotateRight34 ^ i45;
            int i48 = iArr2[5];
            int iRotateRight36 = Integers.rotateRight(i26, 31) + i21;
            int iRotateRight37 = i26 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = Integers.rotateRight(iRotateRight37, 17) + (iRotateRight36 ^ i48);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i49 = (iRotateRight38 ^ i48) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i49, 31);
            int iRotateRight41 = Integers.rotateRight(iRotateRight40, 24) + (i49 ^ i48);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i50 = iRotateRight41 ^ i48;
            int i51 = iArr2[c12];
            int iRotateRight43 = Integers.rotateRight(i27, 31) + i23;
            int iRotateRight44 = i27 ^ Integers.rotateRight(iRotateRight43, 24);
            int iRotateRight45 = Integers.rotateRight(iRotateRight44, 17) + (iRotateRight43 ^ i51);
            int iRotateRight46 = iRotateRight44 ^ Integers.rotateRight(iRotateRight45, 17);
            int i52 = (iRotateRight45 ^ i51) + iRotateRight46;
            int iRotateRight47 = iRotateRight46 ^ Integers.rotateRight(i52, 31);
            int iRotateRight48 = Integers.rotateRight(iRotateRight47, 24) + (i52 ^ i51);
            int iRotateRight49 = iRotateRight47 ^ Integers.rotateRight(iRotateRight48, 16);
            int i53 = iRotateRight48 ^ i51;
            int i54 = iArr2[c13];
            int iRotateRight50 = Integers.rotateRight(i28, 31) + i25;
            int iRotateRight51 = i28 ^ Integers.rotateRight(iRotateRight50, 24);
            int iRotateRight52 = Integers.rotateRight(iRotateRight51, 17) + (iRotateRight50 ^ i54);
            int iRotateRight53 = iRotateRight51 ^ Integers.rotateRight(iRotateRight52, 17);
            int i55 = (iRotateRight52 ^ i54) + iRotateRight53;
            int iRotateRight54 = iRotateRight53 ^ Integers.rotateRight(i55, 31);
            int iRotateRight55 = Integers.rotateRight(iRotateRight54, 24) + (i55 ^ i54);
            int iRotateRight56 = iRotateRight54 ^ Integers.rotateRight(iRotateRight55, 16);
            int i56 = iRotateRight55 ^ i54;
            int iELL = ELL(((i35 ^ i38) ^ i41) ^ i44);
            int iELL2 = ELL(((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21) ^ iRotateRight28);
            int i57 = iRotateRight14 ^ iRotateRight42;
            int i58 = (i50 ^ i38) ^ iELL2;
            int i59 = (i53 ^ i41) ^ iELL2;
            int i60 = (iRotateRight21 ^ iRotateRight49) ^ iELL;
            int i61 = (i56 ^ i44) ^ iELL2;
            int i62 = (i35 ^ i47) ^ iELL2;
            i18 = (iRotateRight7 ^ iRotateRight35) ^ iELL;
            i29++;
            i16 = (iRotateRight56 ^ iRotateRight28) ^ iELL;
            i30 = iRotateRight7;
            i12 = i57 ^ iELL;
            i21 = i38;
            i13 = i59;
            i27 = iRotateRight21;
            i17 = i62;
            i11 = i58;
            i26 = iRotateRight14;
            i25 = i44;
            i14 = i60;
            c10 = c12;
            i19 = i35;
            i23 = i41;
            i15 = i61;
            i28 = iRotateRight28;
            c11 = c13;
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
        iArr[4] = i15;
        iArr[5] = i16;
        iArr[c10] = i17;
        iArr[c11] = i18;
        iArr[8] = i19;
        iArr[9] = i30;
        iArr[10] = i21;
        iArr[11] = i26;
        iArr[12] = i23;
        iArr[13] = i27;
        iArr[14] = i25;
        iArr[15] = i28;
    }
}
