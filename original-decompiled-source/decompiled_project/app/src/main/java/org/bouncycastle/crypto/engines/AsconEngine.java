package org.bouncycastle.crypto.engines;

import j2.y;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class AsconEngine implements AEADCipher {
    private final int ASCON_AEAD_RATE;
    private final long ASCON_IV;
    private final int CRYPTO_ABYTES;
    private final int CRYPTO_KEYBYTES;
    private long K0;
    private long K1;
    private long K2;
    private long N0;
    private long N1;
    private final String algorithmName;
    private final AsconParameters asconParameters;
    private byte[] initialAssociatedText;
    private final byte[] m_buf;
    private final int m_bufferSizeDecrypt;
    private byte[] mac;
    private final int nr;

    /* renamed from: x0, reason: collision with root package name */
    private long f19959x0;

    /* renamed from: x1, reason: collision with root package name */
    private long f19960x1;

    /* renamed from: x2, reason: collision with root package name */
    private long f19961x2;

    /* renamed from: x3, reason: collision with root package name */
    private long f19962x3;

    /* renamed from: x4, reason: collision with root package name */
    private long f19963x4;
    private State m_state = State.Uninitialized;
    private int m_bufPos = 0;

    /* renamed from: org.bouncycastle.crypto.engines.AsconEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State = iArr;
            try {
                iArr[State.DecInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncInit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecAad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncAad.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncFinal.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecData.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncData.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecFinal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters = iArr2;
            try {
                iArr2[AsconParameters.ascon80pq.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128a.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public enum AsconParameters {
        ascon80pq,
        ascon128a,
        ascon128
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

    public AsconEngine(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[asconParameters.ordinal()];
        if (i10 == 1) {
            this.CRYPTO_KEYBYTES = 20;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 8;
            this.ASCON_IV = -6899501409222262784L;
            str = "Ascon-80pq AEAD";
        } else if (i10 == 2) {
            this.CRYPTO_KEYBYTES = 16;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 16;
            this.ASCON_IV = -9187330011336540160L;
            str = "Ascon-128a AEAD";
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("invalid parameter setting for ASCON AEAD");
            }
            this.CRYPTO_KEYBYTES = 16;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 8;
            this.ASCON_IV = -9205344418435956736L;
            str = "Ascon-128 AEAD";
        }
        this.algorithmName = str;
        int i11 = this.ASCON_AEAD_RATE;
        this.nr = i11 == 8 ? 6 : 8;
        int i12 = i11 + this.CRYPTO_ABYTES;
        this.m_bufferSizeDecrypt = i12;
        this.m_buf = new byte[i12];
    }

    private void P(int i10) {
        if (i10 >= 8) {
            if (i10 == 12) {
                ROUND(240L);
                ROUND(225L);
                ROUND(210L);
                ROUND(195L);
            }
            ROUND(180L);
            ROUND(165L);
        }
        ROUND(150L);
        ROUND(135L);
        ROUND(120L);
        ROUND(105L);
        ROUND(90L);
        ROUND(75L);
    }

    private long PAD(int i10) {
        return 128 << (56 - (i10 << 3));
    }

    private void ROUND(long j10) {
        long j11 = this.f19959x0;
        long j12 = this.f19960x1;
        long j13 = this.f19961x2;
        long j14 = this.f19962x3;
        long j15 = this.f19963x4;
        long j16 = ((((j11 ^ j12) ^ j13) ^ j14) ^ j10) ^ ((((j11 ^ j13) ^ j15) ^ j10) & j12);
        long j17 = ((((j11 ^ j13) ^ j14) ^ j15) ^ j10) ^ (((j12 ^ j13) ^ j10) & (j12 ^ j14));
        long j18 = (((j12 ^ j13) ^ j15) ^ j10) ^ (j14 & j15);
        long j19 = ((j13 ^ (j11 ^ j12)) ^ j10) ^ ((~j11) & (j14 ^ j15));
        long j20 = ((j11 ^ j15) & j12) ^ ((j12 ^ j14) ^ j15);
        this.f19959x0 = Longs.rotateRight(j16, 28) ^ (Longs.rotateRight(j16, 19) ^ j16);
        this.f19960x1 = (Longs.rotateRight(j17, 39) ^ j17) ^ Longs.rotateRight(j17, 61);
        this.f19961x2 = ~(Longs.rotateRight(j18, 6) ^ (Longs.rotateRight(j18, 1) ^ j18));
        this.f19962x3 = (Longs.rotateRight(j19, 10) ^ j19) ^ Longs.rotateRight(j19, 17);
        this.f19963x4 = Longs.rotateRight(j20, 41) ^ (Longs.rotateRight(j20, 7) ^ j20);
    }

    private void ascon_aeadinit() {
        long j10 = this.ASCON_IV;
        this.f19959x0 = j10;
        if (this.CRYPTO_KEYBYTES == 20) {
            this.f19959x0 = j10 ^ this.K0;
        }
        this.f19960x1 = this.K1;
        this.f19961x2 = this.K2;
        this.f19962x3 = this.N0;
        this.f19963x4 = this.N1;
        P(12);
        if (this.CRYPTO_KEYBYTES == 20) {
            this.f19961x2 ^= this.K0;
        }
        this.f19962x3 ^= this.K1;
        this.f19963x4 ^= this.K2;
    }

    private void checkAAD() {
        State state;
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i10 == 1) {
            state = State.DecAad;
        } else {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4) {
                    return;
                }
                if (i10 != 5) {
                    throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
                }
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            }
            state = State.EncAad;
        }
        this.m_state = state;
    }

    private boolean checkData() {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 3:
                finishAAD(State.DecData);
                return false;
            case 2:
            case 4:
                finishAAD(State.EncData);
                return true;
            case 5:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 6:
                return false;
            case 7:
                return true;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
    }

    private void finishAAD(State state) {
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i10 == 3 || i10 == 4) {
            byte[] bArr = this.m_buf;
            int i11 = this.m_bufPos;
            bArr[i11] = Byte.MIN_VALUE;
            if (i11 >= 8) {
                this.f19959x0 ^= Pack.bigEndianToLong(bArr, 0);
                this.f19960x1 = (((-1) << (56 - ((this.m_bufPos - 8) << 3))) & Pack.bigEndianToLong(this.m_buf, 8)) ^ this.f19960x1;
            } else {
                this.f19959x0 = (((-1) << (56 - (this.m_bufPos << 3))) & Pack.bigEndianToLong(bArr, 0)) ^ this.f19959x0;
            }
            P(this.nr);
        }
        this.f19963x4 ^= 1;
        this.m_bufPos = 0;
        this.m_state = state;
    }

    private void finishData(State state) {
        long j10;
        long j11;
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[this.asconParameters.ordinal()];
        if (i10 == 1) {
            long j12 = this.f19960x1;
            long j13 = this.K0 << 32;
            long j14 = this.K1;
            this.f19960x1 = j12 ^ (j13 | (j14 >> 32));
            long j15 = this.f19961x2;
            long j16 = j14 << 32;
            long j17 = this.K2;
            this.f19961x2 = j15 ^ (j16 | (j17 >> 32));
            j10 = this.f19962x3;
            j11 = j17 << 32;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                this.f19960x1 ^= this.K1;
                this.f19961x2 ^= this.K2;
                P(12);
                this.f19962x3 ^= this.K1;
                this.f19963x4 ^= this.K2;
                this.m_state = state;
            }
            this.f19961x2 ^= this.K1;
            j10 = this.f19962x3;
            j11 = this.K2;
        }
        this.f19962x3 = j10 ^ j11;
        P(12);
        this.f19962x3 ^= this.K1;
        this.f19963x4 ^= this.K2;
        this.m_state = state;
    }

    private void processBufferAAD(byte[] bArr, int i10) {
        this.f19959x0 ^= Pack.bigEndianToLong(bArr, i10);
        if (this.ASCON_AEAD_RATE == 16) {
            this.f19960x1 = Pack.bigEndianToLong(bArr, i10 + 8) ^ this.f19960x1;
        }
        P(this.nr);
    }

    private void processBufferDecrypt(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.ASCON_AEAD_RATE + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        long jBigEndianToLong = Pack.bigEndianToLong(bArr, i10);
        Pack.longToBigEndian(this.f19959x0 ^ jBigEndianToLong, bArr2, i11);
        this.f19959x0 = jBigEndianToLong;
        if (this.ASCON_AEAD_RATE == 16) {
            long jBigEndianToLong2 = Pack.bigEndianToLong(bArr, i10 + 8);
            Pack.longToBigEndian(this.f19960x1 ^ jBigEndianToLong2, bArr2, i11 + 8);
            this.f19960x1 = jBigEndianToLong2;
        }
        P(this.nr);
    }

    private void processBufferEncrypt(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.ASCON_AEAD_RATE + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        long jBigEndianToLong = this.f19959x0 ^ Pack.bigEndianToLong(bArr, i10);
        this.f19959x0 = jBigEndianToLong;
        Pack.longToBigEndian(jBigEndianToLong, bArr2, i11);
        if (this.ASCON_AEAD_RATE == 16) {
            long jBigEndianToLong2 = Pack.bigEndianToLong(bArr, i10 + 8) ^ this.f19960x1;
            this.f19960x1 = jBigEndianToLong2;
            Pack.longToBigEndian(jBigEndianToLong2, bArr2, i11 + 8);
        }
        P(this.nr);
    }

    private void processFinalDecrypt(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i11 >= 8) {
            long jBigEndianToLong = Pack.bigEndianToLong(bArr, i10);
            long j10 = this.f19959x0 ^ jBigEndianToLong;
            this.f19959x0 = j10;
            Pack.longToBigEndian(j10, bArr2, i12);
            this.f19959x0 = jBigEndianToLong;
            int i13 = i10 + 8;
            int i14 = i12 + 8;
            int i15 = i11 - 8;
            this.f19960x1 ^= PAD(i15);
            if (i15 != 0) {
                long jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i13, i15);
                long j11 = this.f19960x1 ^ jLittleEndianToLong_High;
                this.f19960x1 = j11;
                Pack.longToLittleEndian_High(j11, bArr2, i14, i15);
                this.f19960x1 = jLittleEndianToLong_High ^ (this.f19960x1 & ((-1) >>> (i15 << 3)));
            }
        } else {
            this.f19959x0 ^= PAD(i11);
            if (i11 != 0) {
                long jLittleEndianToLong_High2 = Pack.littleEndianToLong_High(bArr, i10, i11);
                long j12 = this.f19959x0 ^ jLittleEndianToLong_High2;
                this.f19959x0 = j12;
                Pack.longToLittleEndian_High(j12, bArr2, i12, i11);
                this.f19959x0 = jLittleEndianToLong_High2 ^ (this.f19959x0 & ((-1) >>> (i11 << 3)));
            }
        }
        finishData(State.DecFinal);
    }

    private void processFinalEncrypt(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        long jLittleEndianToLong_High;
        if (i11 >= 8) {
            long jBigEndianToLong = this.f19959x0 ^ Pack.bigEndianToLong(bArr, i10);
            this.f19959x0 = jBigEndianToLong;
            Pack.longToBigEndian(jBigEndianToLong, bArr2, i12);
            int i13 = i10 + 8;
            i12 += 8;
            i11 -= 8;
            long jPAD = this.f19960x1 ^ PAD(i11);
            this.f19960x1 = jPAD;
            if (i11 != 0) {
                jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i13, i11) ^ jPAD;
                this.f19960x1 = jLittleEndianToLong_High;
                Pack.longToLittleEndian_High(jLittleEndianToLong_High, bArr2, i12, i11);
            }
        } else {
            long jPAD2 = this.f19959x0 ^ PAD(i11);
            this.f19959x0 = jPAD2;
            if (i11 != 0) {
                jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i10, i11) ^ jPAD2;
                this.f19959x0 = jLittleEndianToLong_High;
                Pack.longToLittleEndian_High(jLittleEndianToLong_High, bArr2, i12, i11);
            }
        }
        finishData(State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (checkData()) {
            int i11 = this.m_bufPos;
            int i12 = this.CRYPTO_ABYTES + i11;
            if (i10 + i12 > bArr.length) {
                throw new OutputLengthException("output buffer too short");
            }
            processFinalEncrypt(this.m_buf, 0, i11, bArr, i10);
            byte[] bArr2 = new byte[this.CRYPTO_ABYTES];
            this.mac = bArr2;
            Pack.longToBigEndian(this.f19962x3, bArr2, 0);
            Pack.longToBigEndian(this.f19963x4, this.mac, 8);
            System.arraycopy(this.mac, 0, bArr, this.m_bufPos + i10, this.CRYPTO_ABYTES);
            reset(false);
            return i12;
        }
        int i13 = this.m_bufPos;
        int i14 = this.CRYPTO_ABYTES;
        if (i13 < i14) {
            throw new InvalidCipherTextException("data too short");
        }
        int i15 = i13 - i14;
        this.m_bufPos = i15;
        if (i10 + i15 > bArr.length) {
            throw new OutputLengthException("output buffer too short");
        }
        processFinalDecrypt(this.m_buf, 0, i15, bArr, i10);
        this.f19962x3 ^= Pack.bigEndianToLong(this.m_buf, this.m_bufPos);
        long jBigEndianToLong = this.f19963x4 ^ Pack.bigEndianToLong(this.m_buf, this.m_bufPos + 8);
        this.f19963x4 = jBigEndianToLong;
        if ((jBigEndianToLong | this.f19962x3) == 0) {
            reset(true);
            return i15;
        }
        throw new InvalidCipherTextException("mac check in " + getAlgorithmName() + " failed");
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public String getAlgorithmVersion() {
        return "v1.2";
    }

    public int getIVBytesSize() {
        return this.CRYPTO_ABYTES;
    }

    public int getKeyBytesSize() {
        return this.CRYPTO_KEYBYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int iMax = Math.max(0, i10);
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i11 == 1 || i11 == 3) {
            return Math.max(0, iMax - this.CRYPTO_ABYTES);
        }
        if (i11 != 5) {
            if (i11 != 6) {
                if (i11 != 7) {
                    if (i11 != 8) {
                        return iMax + this.CRYPTO_ABYTES;
                    }
                }
            }
            return Math.max(0, (iMax + this.m_bufPos) - this.CRYPTO_ABYTES);
        }
        return iMax + this.m_bufPos + this.CRYPTO_ABYTES;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r1 != 8) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getUpdateOutputSize(int i10) {
        int iMax = Math.max(0, i10);
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i11 == 1 || i11 == 3) {
            iMax = Math.max(0, iMax - this.CRYPTO_ABYTES);
        } else if (i11 == 5) {
            iMax += this.m_bufPos;
        } else {
            if (i11 != 6) {
                if (i11 != 7) {
                }
            }
            iMax += this.m_bufPos;
            iMax = Math.max(0, iMax - this.CRYPTO_ABYTES);
        }
        return iMax - (iMax % this.ASCON_AEAD_RATE);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        KeyParameter key;
        byte[] iv;
        long jBigEndianToLong;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize != this.CRYPTO_ABYTES * 8) {
                throw new IllegalArgumentException(y.a(macSize, "Invalid value for MAC size: "));
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to Ascon");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            throw new IllegalArgumentException("Ascon Init parameters must include a key");
        }
        if (iv == null || iv.length != this.CRYPTO_ABYTES) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.asconParameters);
            sb.append(" requires exactly ");
            throw new IllegalArgumentException(x0.a.a(sb, this.CRYPTO_ABYTES, " bytes of IV"));
        }
        byte[] key2 = key.getKey();
        if (key2.length != this.CRYPTO_KEYBYTES) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.asconParameters);
            sb2.append(" key must be ");
            throw new IllegalArgumentException(x0.a.a(sb2, this.CRYPTO_KEYBYTES, " bytes long"));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
        this.N0 = Pack.bigEndianToLong(iv, 0);
        this.N1 = Pack.bigEndianToLong(iv, 8);
        int i10 = this.CRYPTO_KEYBYTES;
        if (i10 == 16) {
            this.K1 = Pack.bigEndianToLong(key2, 0);
            jBigEndianToLong = Pack.bigEndianToLong(key2, 8);
        } else {
            if (i10 != 20) {
                throw new IllegalStateException();
            }
            this.K0 = Pack.bigEndianToInt(key2, 0);
            this.K1 = Pack.bigEndianToLong(key2, 4);
            jBigEndianToLong = Pack.bigEndianToLong(key2, 12);
        }
        this.K2 = jBigEndianToLong;
        this.m_state = z10 ? State.EncInit : State.DecInit;
        reset(true);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        checkAAD();
        byte[] bArr = this.m_buf;
        int i10 = this.m_bufPos;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.m_bufPos = i11;
        if (i11 == this.ASCON_AEAD_RATE) {
            processBufferAAD(bArr, 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 <= 0) {
            return;
        }
        checkAAD();
        int i12 = this.m_bufPos;
        if (i12 > 0) {
            int i13 = this.ASCON_AEAD_RATE - i12;
            if (i11 < i13) {
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
        while (i11 >= this.ASCON_AEAD_RATE) {
            processBufferAAD(bArr, i10);
            int i14 = this.ASCON_AEAD_RATE;
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
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (checkData()) {
            int i14 = this.m_bufPos;
            if (i14 > 0) {
                int i15 = this.ASCON_AEAD_RATE - i14;
                if (i11 < i15) {
                    System.arraycopy(bArr, i10, this.m_buf, i14, i11);
                    this.m_bufPos += i11;
                    return 0;
                }
                System.arraycopy(bArr, i10, this.m_buf, i14, i15);
                i10 += i15;
                i11 -= i15;
                processBufferEncrypt(this.m_buf, 0, bArr2, i12);
                i13 = this.ASCON_AEAD_RATE;
            } else {
                i13 = 0;
            }
            while (i11 >= this.ASCON_AEAD_RATE) {
                processBufferEncrypt(bArr, i10, bArr2, i12 + i13);
                int i16 = this.ASCON_AEAD_RATE;
                i10 += i16;
                i11 -= i16;
                i13 += i16;
            }
            System.arraycopy(bArr, i10, this.m_buf, 0, i11);
            this.m_bufPos = i11;
            return i13;
        }
        int i17 = this.m_bufferSizeDecrypt;
        int i18 = this.m_bufPos;
        int i19 = i17 - i18;
        if (i11 < i19) {
            System.arraycopy(bArr, i10, this.m_buf, i18, i11);
            this.m_bufPos += i11;
            return 0;
        }
        int i20 = 0;
        do {
            int i21 = this.m_bufPos;
            int i22 = this.ASCON_AEAD_RATE;
            if (i21 < i22) {
                int i23 = i22 - i21;
                System.arraycopy(bArr, i10, this.m_buf, i21, i23);
                i10 += i23;
                i11 -= i23;
                processBufferDecrypt(this.m_buf, 0, bArr2, i12 + i20);
                i13 = i20 + this.ASCON_AEAD_RATE;
                while (i11 >= this.m_bufferSizeDecrypt) {
                    processBufferDecrypt(bArr, i10, bArr2, i12 + i13);
                    int i24 = this.ASCON_AEAD_RATE;
                    i10 += i24;
                    i11 -= i24;
                    i13 += i24;
                }
                System.arraycopy(bArr, i10, this.m_buf, 0, i11);
                this.m_bufPos = i11;
                return i13;
            }
            processBufferDecrypt(this.m_buf, 0, bArr2, i12 + i20);
            int i25 = this.m_bufPos;
            int i26 = this.ASCON_AEAD_RATE;
            int i27 = i25 - i26;
            this.m_bufPos = i27;
            byte[] bArr3 = this.m_buf;
            System.arraycopy(bArr3, i26, bArr3, 0, i27);
            int i28 = this.ASCON_AEAD_RATE;
            i20 += i28;
            i19 += i28;
        } while (i11 >= i19);
        System.arraycopy(bArr, i10, this.m_buf, this.m_bufPos, i11);
        this.m_bufPos += i11;
        return i20;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z10) {
        if (z10) {
            this.mac = null;
        }
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
            case 6:
            case 8:
                this.m_state = State.DecInit;
                break;
            case 4:
            case 5:
            case 7:
                this.m_state = State.EncFinal;
                return;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
        ascon_aeadinit();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
