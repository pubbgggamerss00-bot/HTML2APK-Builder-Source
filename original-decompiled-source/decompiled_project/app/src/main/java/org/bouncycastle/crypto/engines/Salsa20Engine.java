package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    private static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* renamed from: x, reason: collision with root package name */
    protected int[] f19991x;

    public Salsa20Engine() {
        this(20);
    }

    private boolean limitExceeded() {
        int i10 = this.cW0 + 1;
        this.cW0 = i10;
        if (i10 == 0) {
            int i11 = this.cW1 + 1;
            this.cW1 = i11;
            if (i11 == 0) {
                int i12 = this.cW2 + 1;
                this.cW2 = i12;
                if ((i12 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    public static void salsaCore(int i10, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i10 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        char c10 = 3;
        int i14 = iArr[3];
        char c11 = 4;
        int i15 = iArr[4];
        char c12 = 5;
        int i16 = iArr[5];
        char c13 = 6;
        int i17 = iArr[6];
        int i18 = 7;
        int i19 = iArr[7];
        int i20 = iArr[8];
        int i21 = 9;
        int i22 = iArr[9];
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = iArr[12];
        int i26 = 13;
        int i27 = iArr[13];
        int i28 = iArr[14];
        int iRotateLeft = iArr[15];
        int iRotateLeft2 = i28;
        int iRotateLeft3 = i27;
        int iRotateLeft4 = i25;
        int iRotateLeft5 = i24;
        int iRotateLeft6 = i23;
        int i29 = i22;
        int i30 = i20;
        int i31 = i19;
        int i32 = i17;
        int iRotateLeft7 = i16;
        int i33 = i15;
        int i34 = i14;
        int i35 = i13;
        int i36 = i12;
        int iRotateLeft8 = i11;
        int i37 = i10;
        while (true) {
            char c14 = c10;
            if (i37 <= 0) {
                char c15 = c11;
                char c16 = c12;
                char c17 = c13;
                iArr2[0] = iRotateLeft8 + iArr[0];
                iArr2[1] = i36 + iArr[1];
                iArr2[2] = i35 + iArr[2];
                iArr2[c14] = i34 + iArr[c14];
                iArr2[c15] = i33 + iArr[c15];
                iArr2[c16] = iRotateLeft7 + iArr[c16];
                iArr2[c17] = i32 + iArr[c17];
                iArr2[7] = i31 + iArr[7];
                iArr2[8] = i30 + iArr[8];
                iArr2[9] = i29 + iArr[9];
                iArr2[10] = iRotateLeft6 + iArr[10];
                iArr2[11] = iRotateLeft5 + iArr[11];
                iArr2[12] = iRotateLeft4 + iArr[12];
                iArr2[13] = iRotateLeft3 + iArr[13];
                iArr2[14] = iRotateLeft2 + iArr[14];
                iArr2[15] = iRotateLeft + iArr[15];
                return;
            }
            int iRotateLeft9 = Integers.rotateLeft(iRotateLeft8 + iRotateLeft4, i18) ^ i33;
            int iRotateLeft10 = i30 ^ Integers.rotateLeft(iRotateLeft9 + iRotateLeft8, i21);
            char c18 = c11;
            int iRotateLeft11 = iRotateLeft4 ^ Integers.rotateLeft(iRotateLeft10 + iRotateLeft9, i26);
            char c19 = c12;
            char c20 = c13;
            int iRotateLeft12 = iRotateLeft8 ^ Integers.rotateLeft(iRotateLeft11 + iRotateLeft10, 18);
            int iRotateLeft13 = i29 ^ Integers.rotateLeft(iRotateLeft7 + i36, i18);
            int iRotateLeft14 = iRotateLeft3 ^ Integers.rotateLeft(iRotateLeft13 + iRotateLeft7, i21);
            int iRotateLeft15 = Integers.rotateLeft(iRotateLeft14 + iRotateLeft13, i26) ^ i36;
            int iRotateLeft16 = Integers.rotateLeft(iRotateLeft15 + iRotateLeft14, 18) ^ iRotateLeft7;
            int iRotateLeft17 = iRotateLeft2 ^ Integers.rotateLeft(iRotateLeft6 + i32, 7);
            int iRotateLeft18 = i35 ^ Integers.rotateLeft(iRotateLeft17 + iRotateLeft6, 9);
            int iRotateLeft19 = i32 ^ Integers.rotateLeft(iRotateLeft18 + iRotateLeft17, 13);
            int iRotateLeft20 = iRotateLeft6 ^ Integers.rotateLeft(iRotateLeft19 + iRotateLeft18, 18);
            int iRotateLeft21 = i34 ^ Integers.rotateLeft(iRotateLeft + iRotateLeft5, 7);
            int iRotateLeft22 = i31 ^ Integers.rotateLeft(iRotateLeft21 + iRotateLeft, 9);
            int iRotateLeft23 = iRotateLeft5 ^ Integers.rotateLeft(iRotateLeft22 + iRotateLeft21, 13);
            int iRotateLeft24 = iRotateLeft ^ Integers.rotateLeft(iRotateLeft23 + iRotateLeft22, 18);
            int iRotateLeft25 = iRotateLeft15 ^ Integers.rotateLeft(iRotateLeft12 + iRotateLeft21, 7);
            int iRotateLeft26 = Integers.rotateLeft(iRotateLeft25 + iRotateLeft12, 9) ^ iRotateLeft18;
            int iRotateLeft27 = iRotateLeft21 ^ Integers.rotateLeft(iRotateLeft26 + iRotateLeft25, 13);
            iRotateLeft8 = iRotateLeft12 ^ Integers.rotateLeft(iRotateLeft27 + iRotateLeft26, 18);
            int iRotateLeft28 = Integers.rotateLeft(iRotateLeft16 + iRotateLeft9, 7) ^ iRotateLeft19;
            int iRotateLeft29 = Integers.rotateLeft(iRotateLeft28 + iRotateLeft16, 9) ^ iRotateLeft22;
            int iRotateLeft30 = iRotateLeft9 ^ Integers.rotateLeft(iRotateLeft29 + iRotateLeft28, 13);
            iRotateLeft7 = iRotateLeft16 ^ Integers.rotateLeft(iRotateLeft30 + iRotateLeft29, 18);
            iRotateLeft5 = iRotateLeft23 ^ Integers.rotateLeft(iRotateLeft20 + iRotateLeft13, 7);
            int iRotateLeft31 = Integers.rotateLeft(iRotateLeft5 + iRotateLeft20, 9) ^ iRotateLeft10;
            int iRotateLeft32 = Integers.rotateLeft(iRotateLeft31 + iRotateLeft5, 13) ^ iRotateLeft13;
            iRotateLeft6 = iRotateLeft20 ^ Integers.rotateLeft(iRotateLeft32 + iRotateLeft31, 18);
            iRotateLeft4 = iRotateLeft11 ^ Integers.rotateLeft(iRotateLeft24 + iRotateLeft17, 7);
            iRotateLeft3 = iRotateLeft14 ^ Integers.rotateLeft(iRotateLeft4 + iRotateLeft24, 9);
            iRotateLeft2 = iRotateLeft17 ^ Integers.rotateLeft(iRotateLeft3 + iRotateLeft4, 13);
            iRotateLeft = iRotateLeft24 ^ Integers.rotateLeft(iRotateLeft2 + iRotateLeft3, 18);
            i37 -= 2;
            i30 = iRotateLeft31;
            i36 = iRotateLeft25;
            i32 = iRotateLeft28;
            i33 = iRotateLeft30;
            i31 = iRotateLeft29;
            i29 = iRotateLeft32;
            c10 = c14;
            c11 = c18;
            c12 = c19;
            c13 = c20;
            i18 = 7;
            i35 = iRotateLeft26;
            i34 = iRotateLeft27;
            i21 = 9;
            i26 = 13;
        }
    }

    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[8] + 1;
        iArr[8] = i10;
        if (i10 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f19991x);
        Pack.intToLittleEndian(this.f19991x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.rounds;
    }

    public long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[9] << 32) | (iArr[8] & BodyPartID.bodyIdMax);
    }

    public int getNonceSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + this.index;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            setKey(null, iv);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            byte[] key = ((KeyParameter) parameters).getKey();
            setKey(key, iv);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z10)));
        }
        reset();
        this.initialised = true;
    }

    public void packTauOrSigma(int i10, int[] iArr, int i11) {
        int i12 = (i10 - 16) / 4;
        int[] iArr2 = TAU_SIGMA;
        iArr[i11] = iArr2[i12];
        iArr[i11 + 1] = iArr2[i12 + 1];
        iArr[i11 + 2] = iArr2[i12 + 2];
        iArr[i11 + 3] = iArr2[i12 + 3];
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (limitExceeded(i11)) {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            byte[] bArr3 = this.keyStream;
            int i14 = this.index;
            bArr2[i13 + i12] = (byte) (bArr3[i14] ^ bArr[i13 + i10]);
            int i15 = (i14 + 1) & 63;
            this.index = i15;
            if (i15 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[8];
        if (i10 == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i11 = i10 - 1;
        iArr[8] = i11;
        if (i11 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.keyStream;
        int i10 = this.index;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        int i11 = (i10 + 1) & 63;
        this.index = i11;
        if (i11 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j10) {
        reset();
        return skip(j10);
    }

    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = TAU_SIGMA;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j10) {
        long j11;
        if (j10 >= 0) {
            if (j10 >= 64) {
                long j12 = j10 / 64;
                advanceCounter(j12);
                j11 = j10 - (j12 * 64);
            } else {
                j11 = j10;
            }
            int i10 = this.index;
            int i11 = (((int) j11) + i10) & 63;
            this.index = i11;
            if (i11 < i10) {
                advanceCounter();
            }
        } else {
            long j13 = -j10;
            if (j13 >= 64) {
                long j14 = j13 / 64;
                retreatCounter(j14);
                j13 -= j14 * 64;
            }
            for (long j15 = 0; j15 < j13; j15++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j10;
    }

    public Salsa20Engine(int i10) {
        this.index = 0;
        this.engineState = new int[16];
        this.f19991x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i10 <= 0 || (i10 & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i10;
    }

    private boolean limitExceeded(int i10) {
        int i11 = this.cW0 + i10;
        this.cW0 = i11;
        if (i11 < i10 && i11 >= 0) {
            int i12 = this.cW1 + 1;
            this.cW1 = i12;
            if (i12 == 0) {
                int i13 = this.cW2 + 1;
                this.cW2 = i13;
                if ((i13 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void advanceCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i10;
        }
        int[] iArr2 = this.engineState;
        int i12 = iArr2[8];
        int i13 = i11 + i12;
        iArr2[8] = i13;
        if (i12 == 0 || i13 >= i12) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    public void retreatCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 != 0) {
            int[] iArr = this.engineState;
            int i12 = iArr[9];
            if ((i12 & BodyPartID.bodyIdMax) < (i10 & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[9] = i12 - i10;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[8];
        if ((i13 & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & i11)) {
            iArr2[8] = i13 - i11;
            return;
        }
        int i14 = iArr2[9];
        if (i14 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[9] = i14 - 1;
        iArr2[8] = i13 - i11;
    }
}
