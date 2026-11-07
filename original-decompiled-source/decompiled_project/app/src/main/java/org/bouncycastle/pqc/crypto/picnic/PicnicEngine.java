package org.bouncycastle.pqc.crypto.picnic;

import j2.y;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.logging.Logger;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.raw.Bits;
import org.bouncycastle.pqc.crypto.picnic.Signature;
import org.bouncycastle.pqc.crypto.picnic.Signature2;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class PicnicEngine {
    private static final Logger LOG = Logger.getLogger(PicnicEngine.class.getName());
    protected static final int LOWMC_MAX_AND_GATES = 1144;
    protected static final int LOWMC_MAX_KEY_BITS = 256;
    private static final int LOWMC_MAX_STATE_SIZE = 64;
    protected static final int LOWMC_MAX_WORDS = 16;
    private static final int MAX_AUX_BYTES = 176;
    private static final int MAX_DIGEST_SIZE = 64;
    private static final int PICNIC_MAX_LOWMC_BLOCK_SIZE = 32;
    private static final int TRANSFORM_FS = 0;
    private static final int TRANSFORM_INVALID = 255;
    private static final int TRANSFORM_UR = 1;
    private static final int WORD_SIZE_BITS = 32;
    protected static final int saltSizeBytes = 32;
    private final int CRYPTO_BYTES;
    private final int CRYPTO_PUBLICKEYBYTES;
    private final int CRYPTO_SECRETKEYBYTES;
    protected final int UnruhGWithInputBytes;
    protected final int UnruhGWithoutInputBytes;
    protected final int andSizeBytes;
    protected final Xof digest;
    protected final int digestSizeBytes;
    protected final LowmcConstants lowmcConstants;
    protected final int numMPCParties;
    protected final int numMPCRounds;
    protected final int numOpenedRounds;
    protected final int numRounds;
    protected final int numSboxes;
    private final int parameters;
    protected final int pqSecurityLevel;
    protected final int seedSizeBytes;
    private int signatureLength;
    protected final int stateSizeBits;
    protected final int stateSizeBytes;
    protected final int stateSizeWords;
    private final int transform;

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PicnicEngine(int i10, LowmcConstants lowmcConstants) {
        int i11;
        this.lowmcConstants = lowmcConstants;
        this.parameters = i10;
        switch (i10) {
            case 1:
            case 2:
                this.pqSecurityLevel = 64;
                this.stateSizeBits = 128;
                this.numMPCRounds = 219;
                this.numMPCParties = 3;
                this.numSboxes = 10;
                this.numRounds = 20;
                this.digestSizeBytes = 32;
                this.numOpenedRounds = 0;
                switch (i10) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i11 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i11 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i11 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i11 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i11 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i11 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i11 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i11 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i11 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i11 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i11 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i11 = 126286;
                        break;
                    default:
                        i11 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                int iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                int iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                int i12 = this.stateSizeBits;
                this.stateSizeWords = (i12 + 31) / 32;
                switch (i10) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i13 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i13;
                    this.UnruhGWithInputBytes = i13 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                this.digest = (i12 == 128 || i12 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            case 3:
            case 4:
                this.pqSecurityLevel = 96;
                this.stateSizeBits = 192;
                this.numMPCRounds = 329;
                this.numMPCParties = 3;
                this.numSboxes = 10;
                this.numRounds = 30;
                this.digestSizeBytes = 48;
                this.numOpenedRounds = 0;
                switch (i10) {
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes4 = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes4;
                int iNumBytes22 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes22;
                int iNumBytes32 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes32;
                int i122 = this.stateSizeBits;
                this.stateSizeWords = (i122 + 31) / 32;
                switch (i10) {
                }
                if (this.transform == 1) {
                }
                this.digest = (i122 == 128 || i122 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            case 5:
            case 6:
                this.pqSecurityLevel = 128;
                this.stateSizeBits = 256;
                this.numMPCRounds = 438;
                this.numMPCParties = 3;
                this.numSboxes = 10;
                this.numRounds = 38;
                this.digestSizeBytes = 64;
                this.numOpenedRounds = 0;
                switch (i10) {
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes42 = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes42;
                int iNumBytes222 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes222;
                int iNumBytes322 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes322;
                int i1222 = this.stateSizeBits;
                this.stateSizeWords = (i1222 + 31) / 32;
                switch (i10) {
                }
                if (this.transform == 1) {
                }
                this.digest = (i1222 == 128 || i1222 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            case 7:
                this.pqSecurityLevel = 64;
                this.stateSizeBits = 129;
                this.numMPCRounds = 250;
                this.numOpenedRounds = 36;
                this.numMPCParties = 16;
                this.numSboxes = 43;
                this.numRounds = 4;
                this.digestSizeBytes = 32;
                switch (i10) {
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes422 = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes422;
                int iNumBytes2222 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2222;
                int iNumBytes3222 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3222;
                int i12222 = this.stateSizeBits;
                this.stateSizeWords = (i12222 + 31) / 32;
                switch (i10) {
                }
                if (this.transform == 1) {
                }
                this.digest = (i12222 == 128 || i12222 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            case 8:
                this.pqSecurityLevel = 96;
                this.stateSizeBits = 192;
                this.numMPCRounds = 419;
                this.numOpenedRounds = 52;
                this.numMPCParties = 16;
                this.numSboxes = 64;
                this.numRounds = 4;
                this.digestSizeBytes = 48;
                switch (i10) {
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes4222 = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes4222;
                int iNumBytes22222 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes22222;
                int iNumBytes32222 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes32222;
                int i122222 = this.stateSizeBits;
                this.stateSizeWords = (i122222 + 31) / 32;
                switch (i10) {
                }
                if (this.transform == 1) {
                }
                this.digest = (i122222 == 128 || i122222 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            case 9:
                this.pqSecurityLevel = 128;
                this.stateSizeBits = 255;
                this.numMPCRounds = 601;
                this.numOpenedRounds = 68;
                this.numMPCParties = 16;
                this.numSboxes = 85;
                this.numRounds = 4;
                this.digestSizeBytes = 64;
                switch (i10) {
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes42222 = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes42222;
                int iNumBytes222222 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes222222;
                int iNumBytes322222 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes322222;
                int i1222222 = this.stateSizeBits;
                this.stateSizeWords = (i1222222 + 31) / 32;
                switch (i10) {
                }
                if (this.transform == 1) {
                }
                this.digest = (i1222222 == 128 || i1222222 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            case 10:
                this.pqSecurityLevel = 64;
                this.stateSizeBits = 129;
                this.numMPCRounds = 219;
                this.numMPCParties = 3;
                this.numSboxes = 43;
                this.numRounds = 4;
                this.digestSizeBytes = 32;
                this.numOpenedRounds = 0;
                switch (i10) {
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes422222 = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes422222;
                int iNumBytes2222222 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2222222;
                int iNumBytes3222222 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3222222;
                int i12222222 = this.stateSizeBits;
                this.stateSizeWords = (i12222222 + 31) / 32;
                switch (i10) {
                }
                if (this.transform == 1) {
                }
                this.digest = (i12222222 == 128 || i12222222 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            case 11:
                this.pqSecurityLevel = 96;
                this.stateSizeBits = 192;
                this.numMPCRounds = 329;
                this.numMPCParties = 3;
                this.numSboxes = 64;
                this.numRounds = 4;
                this.digestSizeBytes = 48;
                this.numOpenedRounds = 0;
                switch (i10) {
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes4222222 = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes4222222;
                int iNumBytes22222222 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes22222222;
                int iNumBytes32222222 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes32222222;
                int i122222222 = this.stateSizeBits;
                this.stateSizeWords = (i122222222 + 31) / 32;
                switch (i10) {
                }
                if (this.transform == 1) {
                }
                this.digest = (i122222222 == 128 || i122222222 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            case 12:
                this.pqSecurityLevel = 128;
                this.stateSizeBits = 255;
                this.numMPCRounds = 438;
                this.numMPCParties = 3;
                this.numSboxes = 85;
                this.numRounds = 4;
                this.digestSizeBytes = 64;
                this.numOpenedRounds = 0;
                switch (i10) {
                }
                this.CRYPTO_BYTES = i11;
                int iNumBytes42222222 = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes42222222;
                int iNumBytes222222222 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes222222222;
                int iNumBytes322222222 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes322222222;
                int i1222222222 = this.stateSizeBits;
                this.stateSizeWords = (i1222222222 + 31) / 32;
                switch (i10) {
                }
                if (this.transform == 1) {
                }
                this.digest = (i1222222222 == 128 || i1222222222 == 129) ? new SHAKEDigest(128) : new SHAKEDigest(256);
                return;
            default:
                throw new IllegalArgumentException(y.a(i10, "unknown parameter set "));
        }
    }

    private void Commit(byte[] bArr, int i10, View view, byte[] bArr2) {
        this.digest.update((byte) 4);
        this.digest.update(bArr, i10, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update((byte) 0);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.outputShare), 0, this.stateSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
    }

    private void G(int i10, byte[] bArr, int i11, View view, byte[] bArr2) {
        int i12 = this.seedSizeBytes + this.andSizeBytes;
        this.digest.update((byte) 5);
        this.digest.update(bArr, i11, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        if (i10 == 2) {
            this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
            i12 += this.stateSizeBytes;
        }
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(i12), 0, 2);
        this.digest.doFinal(bArr2, 0, i12);
    }

    private void H3(int[] iArr, int[] iArr2, View[][] viewArr, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        this.digest.update((byte) 1);
        byte[] bArr6 = new byte[this.stateSizeWords * 4];
        for (int i10 = 0; i10 < this.numMPCRounds; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                Pack.intToLittleEndian(viewArr[i10][i11].outputShare, bArr6, 0);
                this.digest.update(bArr6, 0, this.stateSizeBytes);
            }
        }
        implH3(iArr, iArr2, bArr, bArr2, bArr3, bArr4, bArr5);
    }

    private void HCP(byte[] bArr, int[] iArr, int[] iArr2, byte[][] bArr2, byte[] bArr3, byte[] bArr4, int[] iArr3, int[] iArr4, byte[] bArr5) {
        for (int i10 = 0; i10 < this.numMPCRounds; i10++) {
            this.digest.update(bArr2[i10], 0, this.digestSizeBytes);
        }
        byte[] bArr6 = new byte[32];
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr4, 0, 32);
        updateDigest(iArr3, bArr6);
        updateDigest(iArr4, bArr6);
        this.digest.update(bArr5, 0, bArr5.length);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
        if (iArr == null || iArr2 == null) {
            return;
        }
        expandChallengeHash(bArr, iArr, iArr2);
    }

    private void LowMCEnc(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        if (iArr != iArr2) {
            System.arraycopy(iArr, 0, iArr2, 0, this.stateSizeWords);
        }
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr4, iArr3, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        xor_array(iArr2, iArr2, iArr4, 0);
        for (int i10 = 1; i10 <= this.numRounds; i10++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i10);
            matrix_mul(iArr4, iArr3, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            substitution(iArr2);
            int i11 = i10 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i11);
            matrix_mul(iArr2, iArr2, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i11);
            xor_array(iArr2, iArr2, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer());
            xor_array(iArr2, iArr2, iArr4, 0);
        }
    }

    public static int appendUnique(int[] iArr, int i10, int i11) {
        if (i11 == 0) {
            iArr[i11] = i10;
        } else {
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == i10) {
                    return i11;
                }
            }
            iArr[i11] = i10;
        }
        return i11 + 1;
    }

    private boolean arePaddingBitsZero(byte[] bArr, int i10) {
        int iNumBytes = Utils.numBytes(i10);
        while (i10 < iNumBytes * 8) {
            if (Utils.getBit(bArr, i10) != 0) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private void aux_mpc_AND(int i10, int i11, int i12, Tape tape) {
        int i13 = this.numMPCParties - 1;
        Utils.setBit(tape.tapes[i13], tape.pos - 1, (byte) ((((i10 & i11) ^ (Utils.parity16(tape.tapesToWord()) ^ Utils.getBit(tape.tapes[i13], tape.pos - 1))) ^ i12) & 255));
    }

    public static int bitsToChunks(int i10, byte[] bArr, int i11, int[] iArr) {
        int i12 = i11 * 8;
        if (i10 > i12) {
            return 0;
        }
        int i13 = i12 / i10;
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i14] = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                iArr[i14] = iArr[i14] + (Utils.getBit(bArr, (i14 * i10) + i15) << i15);
            }
        }
        return i13;
    }

    private void commit(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i10, int i11) {
        this.digest.update(bArr2, 0, this.seedSizeBytes);
        if (bArr3 != null) {
            this.digest.update(bArr3, 0, this.andSizeBytes);
        }
        this.digest.update(bArr4, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i10), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i11), 0, 2);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_h(byte[] bArr, byte[][] bArr2) {
        for (int i10 = 0; i10 < this.numMPCParties; i10++) {
            this.digest.update(bArr2[i10], 0, this.digestSizeBytes);
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_v(byte[] bArr, byte[] bArr2, Msg msg) {
        this.digest.update(bArr2, 0, this.stateSizeBytes);
        for (int i10 = 0; i10 < this.numMPCParties; i10++) {
            this.digest.update(msg.msgs[i10], 0, Utils.numBytes(msg.pos));
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void computeSaltAndRootSeed(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        updateDigest(iArr, bArr3);
        this.digest.update(bArr2, 0, bArr2.length);
        updateDigest(iArr2, bArr3);
        updateDigest(iArr3, bArr3);
        Pack.shortToLittleEndian((short) this.stateSizeBits, bArr3, 0);
        this.digest.update(bArr3, 0, 2);
        this.digest.doFinal(bArr, 0, bArr.length);
    }

    private byte[] computeSeeds(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr) {
        byte[] bArr2 = new byte[(this.numMPCParties * this.numMPCRounds * this.seedSizeBytes) + 32];
        byte[] bArr3 = new byte[32];
        updateDigest(iArr, bArr3);
        this.digest.update(bArr, 0, bArr.length);
        updateDigest(iArr2, bArr3);
        updateDigest(iArr3, bArr3);
        this.digest.update(Pack.intToLittleEndian(this.stateSizeBits), 0, 2);
        this.digest.doFinal(bArr2, 0, (this.numMPCParties * this.numMPCRounds * this.seedSizeBytes) + 32);
        return bArr2;
    }

    private boolean contains(int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    private int countNonZeroChallenges(byte[] bArr, int i10) {
        int i11;
        int i12 = 0;
        int i13 = 0;
        int iBitCount = 0;
        while (true) {
            int i14 = i12 + 16;
            i11 = this.numMPCRounds;
            if (i14 > i11) {
                break;
            }
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i12 >>> 2) + i10);
            int i15 = iLittleEndianToInt >>> 1;
            i13 |= iLittleEndianToInt & i15;
            iBitCount += Integers.bitCount((iLittleEndianToInt ^ i15) & 1431655765);
            i12 = i14;
        }
        int i16 = (i11 - i12) * 2;
        if (i16 > 0) {
            int iLittleEndianToInt_Low = Pack.littleEndianToInt_Low(bArr, i10 + (i12 >>> 2), (i16 + 7) / 8) & Utils.getTrailingBitsMask(i16);
            int i17 = iLittleEndianToInt_Low >>> 1;
            i13 |= iLittleEndianToInt_Low & i17;
            iBitCount += Integers.bitCount((iLittleEndianToInt_Low ^ i17) & 1431655765);
        }
        if ((i13 & 1431655765) == 0) {
            return iBitCount;
        }
        return -1;
    }

    private boolean createRandomTape(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        if (i13 < this.digestSizeBytes) {
            return false;
        }
        this.digest.update((byte) 2);
        this.digest.update(bArr, i10, this.seedSizeBytes);
        this.digest.doFinal(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i11), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i12), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i13), 0, 2);
        this.digest.doFinal(bArr3, 0, i13);
        return true;
    }

    private void createRandomTapes(Tape tape, byte[][] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.andSizeBytes * 2;
        for (int i13 = 0; i13 < this.numMPCParties; i13++) {
            this.digest.update(bArr[i13 + i10], 0, this.seedSizeBytes);
            this.digest.update(bArr2, 0, 32);
            this.digest.update(Pack.intToLittleEndian(i11), 0, 2);
            this.digest.update(Pack.intToLittleEndian(i13), 0, 2);
            this.digest.doFinal(tape.tapes[i13], 0, i12);
        }
    }

    private int deserializeSignature(Signature signature, byte[] bArr, int i10, int i11) {
        int iCountNonZeroChallenges;
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int iNumBytes = Utils.numBytes(this.numMPCRounds * 2);
        if (i10 < iNumBytes || (iCountNonZeroChallenges = countNonZeroChallenges(bArr, i11)) < 0) {
            return -1;
        }
        int i12 = this.stateSizeBytes * iCountNonZeroChallenges;
        int i13 = this.numMPCRounds;
        int i14 = (((this.seedSizeBytes * 2) + this.andSizeBytes + this.digestSizeBytes) * i13) + iNumBytes + 32 + i12;
        if (this.transform == 1) {
            i14 = (this.UnruhGWithoutInputBytes * iCountNonZeroChallenges) + ((i13 - iCountNonZeroChallenges) * this.UnruhGWithInputBytes) + i14;
        }
        if (i10 != i14) {
            LOG.fine("sigBytesLen = " + i10 + ", expected bytesRequired = " + i14);
            return -1;
        }
        System.arraycopy(bArr, i11, bArr2, 0, iNumBytes);
        int i15 = i11 + iNumBytes;
        System.arraycopy(bArr, i15, signature.salt, 0, 32);
        int i16 = i15 + 32;
        for (int i17 = 0; i17 < this.numMPCRounds; i17++) {
            int challenge = getChallenge(bArr2, i17);
            System.arraycopy(bArr, i16, proofArr[i17].view3Commitment, 0, this.digestSizeBytes);
            int i18 = i16 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i19 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(bArr, i18, proofArr[i17].view3UnruhG, 0, i19);
                i18 += i19;
            }
            System.arraycopy(bArr, i18, proofArr[i17].communicatedBits, 0, this.andSizeBytes);
            int i20 = i18 + this.andSizeBytes;
            System.arraycopy(bArr, i20, proofArr[i17].seed1, 0, this.seedSizeBytes);
            int i21 = this.seedSizeBytes;
            int i22 = i20 + i21;
            System.arraycopy(bArr, i22, proofArr[i17].seed2, 0, i21);
            i16 = i22 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.littleEndianToInt(bArr, i16, proofArr[i17].inputShare, 0, this.stateSizeBytes / 4);
                int i23 = this.stateSizeBits;
                if (i23 == 129) {
                    proofArr[i17].inputShare[this.stateSizeWords - 1] = bArr[(this.stateSizeBytes + i16) - 1] & 255;
                }
                i16 += this.stateSizeBytes;
                if (!arePaddingBitsZero(proofArr[i17].inputShare, i23)) {
                    return -1;
                }
            }
        }
        return 0;
    }

    private int deserializeSignature2(Signature2 signature2, byte[] bArr, int i10, int i11) {
        Logger logger;
        String str;
        int i12 = this.digestSizeBytes;
        int i13 = i12 + 32;
        if (bArr.length < i13) {
            return -1;
        }
        System.arraycopy(bArr, i11, signature2.challengeHash, 0, i12);
        int i14 = i11 + this.digestSizeBytes;
        System.arraycopy(bArr, i14, signature2.salt, 0, 32);
        int i15 = i14 + 32;
        expandChallengeHash(signature2.challengeHash, signature2.challengeC, signature2.challengeP);
        int iRevealSeedsSize = new Tree(this, this.numMPCRounds, this.seedSizeBytes).revealSeedsSize(signature2.challengeC, this.numOpenedRounds);
        signature2.iSeedInfoLen = iRevealSeedsSize;
        int i16 = i13 + iRevealSeedsSize;
        int iOpenMerkleTreeSize = new Tree(this, this.numMPCRounds, this.digestSizeBytes).openMerkleTreeSize(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds);
        signature2.cvInfoLen = iOpenMerkleTreeSize;
        int i17 = i16 + iOpenMerkleTreeSize;
        int iRevealSeedsSize2 = new Tree(this, this.numMPCParties, this.seedSizeBytes).revealSeedsSize(new int[1], 1);
        for (int i18 = 0; i18 < this.numMPCRounds; i18++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i18)) {
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i18)] != this.numMPCParties - 1) {
                    i17 += this.andSizeBytes;
                }
                i17 = i17 + iRevealSeedsSize2 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (i10 == i17) {
            int i19 = signature2.iSeedInfoLen;
            byte[] bArr2 = new byte[i19];
            signature2.iSeedInfo = bArr2;
            System.arraycopy(bArr, i15, bArr2, 0, i19);
            int i20 = i15 + signature2.iSeedInfoLen;
            int i21 = signature2.cvInfoLen;
            byte[] bArr3 = new byte[i21];
            signature2.cvInfo = bArr3;
            System.arraycopy(bArr, i20, bArr3, 0, i21);
            int i22 = i20 + signature2.cvInfoLen;
            for (int i23 = 0; i23 < this.numMPCRounds; i23++) {
                if (contains(signature2.challengeC, this.numOpenedRounds, i23)) {
                    signature2.proofs[i23] = new Signature2.Proof2(this);
                    Signature2.Proof2 proof2 = signature2.proofs[i23];
                    proof2.seedInfoLen = iRevealSeedsSize2;
                    byte[] bArr4 = new byte[iRevealSeedsSize2];
                    proof2.seedInfo = bArr4;
                    System.arraycopy(bArr, i22, bArr4, 0, iRevealSeedsSize2);
                    int i24 = i22 + signature2.proofs[i23].seedInfoLen;
                    if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i23)] != this.numMPCParties - 1) {
                        System.arraycopy(bArr, i24, signature2.proofs[i23].aux, 0, this.andSizeBytes);
                        i24 += this.andSizeBytes;
                        if (!arePaddingBitsZero(signature2.proofs[i23].aux, this.numRounds * 3 * this.numSboxes)) {
                            logger = LOG;
                            str = "failed while deserializing aux bits";
                        }
                    }
                    System.arraycopy(bArr, i24, signature2.proofs[i23].input, 0, this.stateSizeBytes);
                    int i25 = i24 + this.stateSizeBytes;
                    int i26 = this.andSizeBytes;
                    System.arraycopy(bArr, i25, signature2.proofs[i23].msgs, 0, i26);
                    int i27 = i25 + i26;
                    if (arePaddingBitsZero(signature2.proofs[i23].msgs, this.numRounds * 3 * this.numSboxes)) {
                        System.arraycopy(bArr, i27, signature2.proofs[i23].C, 0, this.digestSizeBytes);
                        i22 = i27 + this.digestSizeBytes;
                    } else {
                        logger = LOG;
                        str = "failed while deserializing msgs bits";
                    }
                }
            }
            return 0;
        }
        logger = LOG;
        str = "sigLen = " + i10 + ", expected bytesRequired = " + i17;
        logger.fine(str);
        return -1;
    }

    private void expandChallengeHash(byte[] bArr, int[] iArr, int[] iArr2) {
        int iCeil_log2 = Utils.ceil_log2(this.numMPCRounds);
        int iCeil_log22 = Utils.ceil_log2(this.numMPCParties);
        int[] iArr3 = new int[(this.digestSizeBytes * 8) / Math.min(iCeil_log2, iCeil_log22)];
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, this.digestSizeBytes);
        int iAppendUnique = 0;
        while (iAppendUnique < this.numOpenedRounds) {
            int iBitsToChunks = bitsToChunks(iCeil_log2, bArr2, this.digestSizeBytes, iArr3);
            for (int i10 = 0; i10 < iBitsToChunks; i10++) {
                int i11 = iArr3[i10];
                if (i11 < this.numMPCRounds) {
                    iAppendUnique = appendUnique(iArr, i11, iAppendUnique);
                }
                if (iAppendUnique == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
        int i12 = 0;
        while (i12 < this.numOpenedRounds) {
            int iBitsToChunks2 = bitsToChunks(iCeil_log22, bArr2, this.digestSizeBytes, iArr3);
            for (int i13 = 0; i13 < iBitsToChunks2; i13++) {
                int i14 = iArr3[i13];
                if (i14 < this.numMPCParties) {
                    iArr2[i12] = i14;
                    i12++;
                }
                if (i12 == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
    }

    public static int extend(int i10) {
        return ~(i10 - 1);
    }

    private void getAuxBits(byte[] bArr, Tape tape) {
        byte[] bArr2 = tape.tapes[this.numMPCParties - 1];
        int i10 = this.stateSizeBits;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.numRounds; i13++) {
            i11 += i10;
            int i14 = 0;
            while (i14 < i10) {
                Utils.setBit(bArr, i12, Utils.getBit(bArr2, i11));
                i14++;
                i12++;
                i11++;
            }
        }
    }

    private int[] getMissingLeavesList(int[] iArr) {
        int[] iArr2 = new int[this.numMPCRounds - this.numOpenedRounds];
        int i10 = 0;
        for (int i11 = 0; i11 < this.numMPCRounds; i11++) {
            if (!contains(iArr, this.numOpenedRounds, i11)) {
                iArr2[i10] = i11;
                i10++;
            }
        }
        return iArr2;
    }

    private void implH3(int[] iArr, int[] iArr2, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        byte[] bArr6 = new byte[this.digestSizeBytes];
        bArr2[Utils.numBytes(this.numMPCRounds * 2) - 1] = 0;
        for (int i10 = 0; i10 < this.numMPCRounds; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                this.digest.update(bArr[i10][i11], 0, this.digestSizeBytes);
            }
        }
        if (this.transform == 1) {
            for (int i12 = 0; i12 < this.numMPCRounds; i12++) {
                int i13 = 0;
                while (i13 < 3) {
                    this.digest.update(bArr5[i12][i13], 0, i13 == 2 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
                    i13++;
                }
            }
        }
        this.digest.update(Pack.intToLittleEndian(iArr), 0, this.stateSizeBytes);
        this.digest.update(Pack.intToLittleEndian(iArr2), 0, this.stateSizeBytes);
        this.digest.update(bArr3, 0, 32);
        this.digest.update(bArr4, 0, bArr4.length);
        this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        boolean z10 = true;
        int i14 = 0;
        while (z10) {
            for (int i15 = 0; i15 < this.digestSizeBytes; i15++) {
                byte b10 = bArr6[i15];
                int i16 = 0;
                while (true) {
                    if (i16 >= 8) {
                        break;
                    }
                    int i17 = (b10 >>> (6 - i16)) & 3;
                    if (i17 < 3) {
                        setChallenge(bArr2, i14, i17);
                        i14++;
                        if (i14 == this.numMPCRounds) {
                            z10 = false;
                            break;
                        }
                    }
                    i16 += 2;
                }
                if (!z10) {
                    break;
                }
            }
            if (!z10) {
                return;
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr6, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        }
    }

    public static int indexOf(int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public static boolean is_picnic3(int i10) {
        return i10 == 7 || i10 == 8 || i10 == 9;
    }

    private int mpc_AND(int i10, int i11, int i12, int i13, Tape tape, Msg msg) {
        int iExtend = ((i12 & extend(i11)) ^ (i13 & extend(i10))) ^ tape.tapesToWord();
        int i14 = msg.unopened;
        if (i14 >= 0) {
            iExtend = Utils.setBit(iExtend, msg.unopened, Utils.getBit(msg.msgs[i14], msg.pos));
        }
        wordToMsgs(iExtend, msg);
        return (i10 & i11) ^ Utils.parity16(iExtend);
    }

    private void mpc_LowMC(Tape tape, View[] viewArr, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i10 = this.stateSizeWords;
        mpc_xor_constant(iArr2, i10 * 3, iArr, 0, i10);
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        for (int i11 = 0; i11 < 3; i11++) {
            matrix_mul_offset(iArr2, i11 * this.stateSizeWords, viewArr[i11].inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        }
        int[] iArr3 = iArr2;
        mpc_xor(iArr3, iArr3, 3);
        for (int i12 = 1; i12 <= this.numRounds; i12++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i12);
            for (int i13 = 0; i13 < 3; i13++) {
                matrix_mul_offset(iArr3, this.stateSizeWords * i13, viewArr[i13].inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            }
            mpc_substitution(iArr3, tape, viewArr);
            int i14 = i12 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i14);
            int i15 = this.stateSizeWords;
            mpc_matrix_mul(iArr3, i15 * 3, iArr2, i15 * 3, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer(), 3);
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i14);
            iArr3 = iArr2;
            mpc_xor_constant(iArr3, this.stateSizeWords * 3, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer(), this.stateSizeWords);
            mpc_xor(iArr3, iArr3, 3);
        }
        for (int i16 = 0; i16 < 3; i16++) {
            int i17 = this.stateSizeWords;
            System.arraycopy(iArr3, (i16 + 3) * i17, viewArr[i16].outputShare, 0, i17);
        }
    }

    private void mpc_matrix_mul(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = this.stateSizeWords;
            matrix_mul_offset(iArr, (i14 * i15) + i10, iArr2, (i15 * i14) + i11, iArr3, i12);
        }
    }

    private void mpc_sbox(int[] iArr, int[] iArr2, Tape tape, Msg msg) {
        for (int i10 = 0; i10 < this.numSboxes * 3; i10 += 3) {
            int i11 = i10 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i11);
            int i12 = iArr2[i11];
            int i13 = i10 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i13);
            int i14 = iArr2[i13];
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i10);
            int i15 = iArr2[i10];
            int iMpc_AND = mpc_AND(bitFromWordArray, bitFromWordArray2, i12, i14, tape, msg);
            int iMpc_AND2 = mpc_AND(bitFromWordArray2, bitFromWordArray3, i14, i15, tape, msg);
            int iMpc_AND3 = mpc_AND(bitFromWordArray3, bitFromWordArray, i15, i12, tape, msg);
            int i16 = bitFromWordArray ^ iMpc_AND2;
            int i17 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i11, i16);
            Utils.setBitInWordArray(iArr, i13, iMpc_AND3 ^ i17);
            Utils.setBitInWordArray(iArr, i10, (i17 ^ bitFromWordArray3) ^ iMpc_AND);
        }
    }

    private void mpc_substitution(int[] iArr, Tape tape, View[] viewArr) {
        int[] iArr2 = new int[3];
        int[] iArr3 = new int[3];
        int[] iArr4 = new int[3];
        int[] iArr5 = new int[3];
        int[] iArr6 = new int[3];
        int[] iArr7 = new int[3];
        int i10 = 0;
        while (i10 < this.numSboxes * 3) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = ((i11 + 3) * this.stateSizeWords * 32) + i10;
                iArr2[i11] = Utils.getBitFromWordArray(iArr, i12 + 2);
                iArr3[i11] = Utils.getBitFromWordArray(iArr, i12 + 1);
                iArr4[i11] = Utils.getBitFromWordArray(iArr, i12);
            }
            mpc_AND(iArr2, iArr3, iArr5, tape, viewArr);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND(iArr10, iArr8, iArr11, tape, viewArr);
            int[] iArr13 = iArr7;
            mpc_AND(iArr8, iArr9, iArr13, tape, viewArr);
            iArr2 = iArr9;
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = ((i13 + 3) * this.stateSizeWords * 32) + i10;
                Utils.setBitInWordArray(iArr, i14 + 2, iArr2[i13] ^ iArr11[i13]);
                Utils.setBitInWordArray(iArr, i14 + 1, (iArr2[i13] ^ iArr10[i13]) ^ iArr13[i13]);
                Utils.setBitInWordArray(iArr, i14, ((iArr2[i13] ^ iArr10[i13]) ^ iArr8[i13]) ^ iArr12[i13]);
            }
            i10 += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    private void mpc_xor(int[] iArr, int[] iArr2, int i10) {
        int i11 = this.stateSizeWords * i10;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = (this.stateSizeWords * i10) + i12;
            iArr[i13] = iArr[i13] ^ iArr2[i12];
        }
    }

    private void mpc_xor_constant(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 + i10;
            iArr[i14] = iArr[i14] ^ iArr2[i13 + i11];
        }
    }

    private void mpc_xor_constant_verify(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        int i13;
        if (i12 == 0) {
            i13 = this.stateSizeWords * 2;
        } else if (i12 != 2) {
            return;
        } else {
            i13 = this.stateSizeWords * 3;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i14 + i13;
            iArr[i15] = iArr[i15] ^ iArr2[i14 + i10];
        }
    }

    private void picnic_keygen(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int[] iArr = new int[bArr3.length / 4];
        int[] iArr2 = new int[bArr.length / 4];
        int[] iArr3 = new int[bArr2.length / 4];
        secureRandom.nextBytes(bArr3);
        Pack.littleEndianToInt(bArr3, 0, iArr);
        Utils.zeroTrailingBits(iArr, this.stateSizeBits);
        secureRandom.nextBytes(bArr);
        Pack.littleEndianToInt(bArr, 0, iArr2);
        Utils.zeroTrailingBits(iArr2, this.stateSizeBits);
        LowMCEnc(iArr2, iArr3, iArr);
        Pack.intToLittleEndian(iArr, bArr3, 0);
        Pack.intToLittleEndian(iArr2, bArr, 0);
        Pack.intToLittleEndian(iArr3, bArr2, 0);
    }

    private void picnic_read_public_key(int[] iArr, int[] iArr2, byte[] bArr) {
        int i10 = this.stateSizeBytes;
        int i11 = i10 + 1;
        int i12 = i10 / 4;
        Pack.littleEndianToInt(bArr, 1, iArr, 0, i12);
        Pack.littleEndianToInt(bArr, i11, iArr2, 0, i12);
        if (i12 < this.stateSizeWords) {
            int i13 = i12 * 4;
            int i14 = this.stateSizeBytes - i13;
            iArr[i12] = Pack.littleEndianToInt_Low(bArr, i13 + 1, i14);
            iArr2[i12] = Pack.littleEndianToInt_Low(bArr, i11 + i13, i14);
        }
    }

    private boolean picnic_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PicnicEngine picnicEngine;
        int iSerializeSignature2;
        int i10 = this.stateSizeWords;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = this.stateSizeBytes;
        int i12 = i11 + 1;
        int i13 = (i11 * 2) + 1;
        int i14 = i11 / 4;
        Pack.littleEndianToInt(bArr, 1, iArr, 0, i14);
        Pack.littleEndianToInt(bArr, i12, iArr2, 0, i14);
        Pack.littleEndianToInt(bArr, i13, iArr3, 0, i14);
        if (i14 < this.stateSizeWords) {
            int i15 = i14 * 4;
            int i16 = this.stateSizeBytes - i15;
            iArr[i14] = Pack.littleEndianToInt_Low(bArr, i15 + 1, i16);
            iArr2[i14] = Pack.littleEndianToInt_Low(bArr, i12 + i15, i16);
            iArr3[i14] = Pack.littleEndianToInt_Low(bArr, i13 + i15, i16);
        }
        if (is_picnic3(this.parameters)) {
            picnicEngine = this;
            Signature2 signature2 = new Signature2(this);
            if (!picnicEngine.sign_picnic3(iArr, iArr2, iArr3, bArr2, signature2)) {
                LOG.fine("Failed to create signature");
                return false;
            }
            iSerializeSignature2 = serializeSignature2(signature2, bArr3, bArr2.length + 4);
            if (iSerializeSignature2 < 0) {
                LOG.fine("Failed to serialize signature");
                return false;
            }
        } else {
            Signature signature = new Signature(this);
            picnicEngine = this;
            if (picnicEngine.sign_picnic1(iArr, iArr2, iArr3, bArr2, signature) != 0) {
                LOG.fine("Failed to create signature");
                return false;
            }
            iSerializeSignature2 = serializeSignature(signature, bArr3, bArr2.length + 4);
            if (iSerializeSignature2 < 0) {
                LOG.fine("Failed to serialize signature");
                return false;
            }
        }
        picnicEngine.signatureLength = iSerializeSignature2;
        Pack.intToLittleEndian(iSerializeSignature2, bArr3, 0);
        return true;
    }

    private int picnic_verify(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        Logger logger;
        String str;
        int i11 = this.stateSizeWords;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        picnic_read_public_key(iArr, iArr2, bArr);
        if (is_picnic3(this.parameters)) {
            Signature2 signature2 = new Signature2(this);
            if (deserializeSignature2(signature2, bArr3, i10, bArr2.length + 4) == 0) {
                return verify_picnic3(signature2, iArr, iArr2, bArr2);
            }
            logger = LOG;
            str = "Error couldn't deserialize signature (2)!";
        } else {
            Signature signature = new Signature(this);
            if (deserializeSignature(signature, bArr3, i10, bArr2.length + 4) == 0) {
                return verify(signature, iArr, iArr2, bArr2);
            }
            logger = LOG;
            str = "Error couldn't deserialize signature!";
        }
        logger.fine(str);
        return -1;
    }

    private int picnic_write_private_key(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i10 = this.stateSizeBytes;
        int i11 = (i10 * 3) + 1;
        if (bArr4.length < i11) {
            LOG.fine("Failed writing private key!");
            return -1;
        }
        bArr4[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr4, 1, i10);
        int i12 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr4, i12 + 1, i12);
        int i13 = this.stateSizeBytes;
        System.arraycopy(bArr3, 0, bArr4, (i13 * 2) + 1, i13);
        return i11;
    }

    private int picnic_write_public_key(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i10 = this.stateSizeBytes;
        int i11 = (i10 * 2) + 1;
        if (bArr3.length < i11) {
            LOG.fine("Failed writing public key!");
            return -1;
        }
        bArr3[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr3, 1, i10);
        int i12 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr3, i12 + 1, i12);
        return i11;
    }

    private int serializeSignature2(Signature2 signature2, byte[] bArr, int i10) {
        int i11 = this.digestSizeBytes + 32 + signature2.iSeedInfoLen + signature2.cvInfoLen;
        for (int i12 = 0; i12 < this.numMPCRounds; i12++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i12)) {
                int i13 = signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i12)];
                int i14 = i11 + signature2.proofs[i12].seedInfoLen;
                if (i13 != this.numMPCParties - 1) {
                    i14 += this.andSizeBytes;
                }
                i11 = i14 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (bArr.length < i11) {
            return -1;
        }
        System.arraycopy(signature2.challengeHash, 0, bArr, i10, this.digestSizeBytes);
        int i15 = this.digestSizeBytes + i10;
        System.arraycopy(signature2.salt, 0, bArr, i15, 32);
        int i16 = i15 + 32;
        System.arraycopy(signature2.iSeedInfo, 0, bArr, i16, signature2.iSeedInfoLen);
        int i17 = i16 + signature2.iSeedInfoLen;
        System.arraycopy(signature2.cvInfo, 0, bArr, i17, signature2.cvInfoLen);
        int i18 = i17 + signature2.cvInfoLen;
        for (int i19 = 0; i19 < this.numMPCRounds; i19++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i19)) {
                Signature2.Proof2 proof2 = signature2.proofs[i19];
                System.arraycopy(proof2.seedInfo, 0, bArr, i18, proof2.seedInfoLen);
                int i20 = i18 + signature2.proofs[i19].seedInfoLen;
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i19)] != this.numMPCParties - 1) {
                    System.arraycopy(signature2.proofs[i19].aux, 0, bArr, i20, this.andSizeBytes);
                    i20 += this.andSizeBytes;
                }
                System.arraycopy(signature2.proofs[i19].input, 0, bArr, i20, this.stateSizeBytes);
                int i21 = i20 + this.stateSizeBytes;
                System.arraycopy(signature2.proofs[i19].msgs, 0, bArr, i21, this.andSizeBytes);
                int i22 = i21 + this.andSizeBytes;
                System.arraycopy(signature2.proofs[i19].C, 0, bArr, i22, this.digestSizeBytes);
                i18 = i22 + this.digestSizeBytes;
            }
        }
        return i18 - i10;
    }

    private void setChallenge(byte[] bArr, int i10, int i11) {
        int i12 = i10 * 2;
        Utils.setBit(bArr, i12, (byte) (i11 & 1));
        Utils.setBit(bArr, i12 + 1, (byte) ((i11 >>> 1) & 1));
    }

    private int sign_picnic1(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, Signature signature) {
        byte[] bArr2;
        PicnicEngine picnicEngine = this;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        View[][] viewArr = (View[][]) Array.newInstance((Class<?>) View.class, picnicEngine.numMPCRounds, 3);
        int[] iArr4 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr3 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr4);
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, 3, picnicEngine.UnruhGWithInputBytes);
        byte[] bArrComputeSeeds = computeSeeds(iArr, iArr2, iArr3, bArr);
        int i13 = picnicEngine.numMPCParties * picnicEngine.seedSizeBytes;
        System.arraycopy(bArrComputeSeeds, picnicEngine.numMPCRounds * i13, signature.salt, 0, 32);
        Tape tape = new Tape(picnicEngine);
        int i14 = picnicEngine.stateSizeBytes;
        int iMax = Math.max(i14 * 9, i14 + picnicEngine.andSizeBytes);
        byte[] bArr5 = new byte[iMax];
        int i15 = 0;
        while (i15 < picnicEngine.numMPCRounds) {
            viewArr[i15][i12] = new View(picnicEngine);
            viewArr[i15][i11] = new View(picnicEngine);
            viewArr[i15][i10] = new View(picnicEngine);
            int i16 = i12;
            while (i16 < i10) {
                int i17 = i10;
                int i18 = iMax;
                int i19 = i11;
                Tape tape2 = tape;
                byte[] bArr6 = bArrComputeSeeds;
                byte[] bArr7 = bArr5;
                if (!picnicEngine.createRandomTape(bArr6, (picnicEngine.seedSizeBytes * i16) + (i13 * i15), signature.salt, i15, i16, bArr5, picnicEngine.stateSizeBytes + picnicEngine.andSizeBytes)) {
                    LOG.fine("createRandomTape failed");
                    return -1;
                }
                int[] iArr5 = viewArr[i15][i16].inputShare;
                Pack.littleEndianToInt(bArr7, 0, iArr5);
                Utils.zeroTrailingBits(iArr5, picnicEngine.stateSizeBits);
                System.arraycopy(bArr7, picnicEngine.stateSizeBytes, tape2.tapes[i16], 0, picnicEngine.andSizeBytes);
                i16++;
                bArrComputeSeeds = bArr6;
                tape = tape2;
                bArr5 = bArr7;
                iMax = i18;
                i10 = i17;
                i11 = i19;
            }
            int i20 = iMax;
            byte[] bArr8 = bArr5;
            int i21 = i10;
            int i22 = i11;
            Tape tape3 = tape;
            byte[] bArr9 = bArrComputeSeeds;
            int i23 = i13 * i15;
            View[][] viewArr2 = viewArr;
            int i24 = i15;
            if (!picnicEngine.createRandomTape(bArr9, (picnicEngine.seedSizeBytes * 2) + i23, signature.salt, i15, 2, tape3.tapes[i21], picnicEngine.andSizeBytes)) {
                LOG.fine("createRandomTape failed");
                return -1;
            }
            View[] viewArr3 = viewArr2[i24];
            picnicEngine.xor_three(viewArr3[i21].inputShare, iArr, viewArr3[0].inputShare, viewArr3[i22].inputShare);
            tape3.pos = 0;
            int[] iArrLittleEndianToInt = Pack.littleEndianToInt(bArr8, 0, i20 / 4);
            picnicEngine.mpc_LowMC(tape3, viewArr2[i24], iArr3, iArrLittleEndianToInt);
            Pack.intToLittleEndian(iArrLittleEndianToInt, bArr8, 0);
            int[] iArr6 = new int[16];
            View[] viewArr4 = viewArr2[i24];
            picnicEngine.xor_three(iArr6, viewArr4[0].outputShare, viewArr4[i22].outputShare, viewArr4[i21].outputShare);
            if (!subarrayEquals(iArr6, iArr2, picnicEngine.stateSizeWords)) {
                LOG.fine("Simulation failed; output does not match public key (round = " + i24 + ")");
                return -1;
            }
            picnicEngine.Commit(bArr9, i23, viewArr2[i24][0], bArr3[i24][0]);
            picnicEngine.Commit(bArr9, i23 + picnicEngine.seedSizeBytes, viewArr2[i24][i22], bArr3[i24][i22]);
            picnicEngine.Commit(bArr9, (picnicEngine.seedSizeBytes * 2) + i23, viewArr2[i24][i21], bArr3[i24][i21]);
            if (picnicEngine.transform == i22) {
                picnicEngine.G(0, bArr9, i23, viewArr2[i24][0], bArr4[i24][0]);
                picnicEngine.G(1, bArr9, i23 + picnicEngine.seedSizeBytes, viewArr2[i24][i22], bArr4[i24][i22]);
                picnicEngine.G(2, bArr9, (picnicEngine.seedSizeBytes * 2) + i23, viewArr2[i24][i21], bArr4[i24][i21]);
                bArr2 = bArr9;
            } else {
                bArr2 = bArr9;
            }
            i15 = i24 + 1;
            picnicEngine = this;
            tape = tape3;
            bArr5 = bArr8;
            bArrComputeSeeds = bArr2;
            iMax = i20;
            i10 = i21;
            viewArr = viewArr2;
            i11 = 1;
            i12 = 0;
        }
        View[][] viewArr5 = viewArr;
        byte[] bArr10 = bArrComputeSeeds;
        PicnicEngine picnicEngine2 = this;
        picnicEngine2.H3(iArr2, iArr3, viewArr5, bArr3, signature.challengeBits, signature.salt, bArr, bArr4);
        int i25 = 0;
        while (i25 < picnicEngine2.numMPCRounds) {
            byte[] bArr11 = bArr10;
            picnicEngine2.prove(signature.proofs[i25], picnicEngine2.getChallenge(signature.challengeBits, i25), bArr11, i13 * i25, viewArr5[i25], bArr3[i25], picnicEngine2.transform != 1 ? null : bArr4[i25]);
            i25++;
            picnicEngine2 = this;
            bArr10 = bArr11;
        }
        return 0;
    }

    private boolean sign_picnic3(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, Signature2 signature2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.seedSizeBytes + 32;
        byte[] bArr2 = new byte[i15];
        computeSaltAndRootSeed(bArr2, iArr, iArr2, iArr3, bArr);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, i15);
        signature2.salt = Arrays.copyOfRange(bArr2, 0, 32);
        Tree tree = new Tree(this, this.numMPCRounds, this.seedSizeBytes);
        tree.generateSeeds(bArrCopyOfRange, signature2.salt, 0);
        byte[][] leaves = tree.getLeaves();
        int leavesOffset = tree.getLeavesOffset();
        int i16 = this.numMPCRounds;
        Tape[] tapeArr = new Tape[i16];
        Tree[] treeArr = new Tree[i16];
        int i17 = 0;
        while (true) {
            i10 = this.numMPCRounds;
            if (i17 >= i10) {
                break;
            }
            tapeArr[i17] = new Tape(this);
            Tree tree2 = new Tree(this, this.numMPCParties, this.seedSizeBytes);
            treeArr[i17] = tree2;
            tree2.generateSeeds(leaves[i17 + leavesOffset], signature2.salt, i17);
            createRandomTapes(tapeArr[i17], treeArr[i17].getLeaves(), treeArr[i17].getLeavesOffset(), signature2.salt, i17);
            i17++;
        }
        int[] iArr4 = {i10, this.stateSizeWords * 4};
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        byte[] bArr4 = new byte[MAX_AUX_BYTES];
        int i18 = 0;
        while (true) {
            i11 = this.numMPCRounds;
            if (i18 >= i11) {
                break;
            }
            tapeArr[i18].computeAuxTape(bArr3[i18]);
            i18++;
        }
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, i11, this.numMPCParties, this.digestSizeBytes);
        int i19 = 0;
        while (true) {
            i12 = this.numMPCRounds;
            if (i19 >= i12) {
                break;
            }
            int i20 = 0;
            while (true) {
                i14 = this.numMPCParties;
                if (i20 < i14 - 1) {
                    commit(bArr5[i19][i20], treeArr[i19].getLeaf(i20), null, signature2.salt, i19, i20);
                    i20++;
                }
            }
            int i21 = i14 - 1;
            getAuxBits(bArr4, tapeArr[i19]);
            commit(bArr5[i19][i21], treeArr[i19].getLeaf(i21), bArr4, signature2.salt, i19, i21);
            i19++;
        }
        Msg[] msgArr = new Msg[i12];
        int[] iArr5 = new int[this.stateSizeBits];
        int i22 = 0;
        while (true) {
            int i23 = this.numMPCRounds;
            if (i22 >= i23) {
                byte[][] bArr6 = (byte[][]) Array.newInstance((Class<?>) cls, i23, this.digestSizeBytes);
                byte[][] bArr7 = (byte[][]) Array.newInstance((Class<?>) cls, this.numMPCRounds, this.digestSizeBytes);
                for (int i24 = 0; i24 < this.numMPCRounds; i24++) {
                    commit_h(bArr6[i24], bArr5[i24]);
                    commit_v(bArr7[i24], bArr3[i24], msgArr[i24]);
                }
                Tree tree3 = new Tree(this, this.numMPCRounds, this.digestSizeBytes);
                tree3.buildMerkleTree(bArr7, signature2.salt);
                int i25 = this.numOpenedRounds;
                int[] iArr6 = new int[i25];
                signature2.challengeC = iArr6;
                int[] iArr7 = new int[i25];
                signature2.challengeP = iArr7;
                byte[] bArr8 = new byte[this.digestSizeBytes];
                signature2.challengeHash = bArr8;
                int i26 = 0;
                HCP(bArr8, iArr6, iArr7, bArr6, tree3.nodes[0], signature2.salt, iArr2, iArr3, bArr);
                int[] iArr8 = new int[1];
                signature2.cvInfo = tree3.openMerkleTree(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds, iArr8);
                signature2.cvInfoLen = iArr8[0];
                int i27 = this.numMPCRounds;
                int i28 = this.seedSizeBytes;
                byte[] bArr9 = new byte[i27 * i28];
                signature2.iSeedInfo = bArr9;
                signature2.iSeedInfoLen = tree.revealSeeds(signature2.challengeC, this.numOpenedRounds, bArr9, i27 * i28);
                signature2.proofs = new Signature2.Proof2[this.numMPCRounds];
                int i29 = 0;
                while (i29 < this.numMPCRounds) {
                    if (contains(signature2.challengeC, this.numOpenedRounds, i29)) {
                        signature2.proofs[i29] = new Signature2.Proof2(this);
                        int iIndexOf = indexOf(signature2.challengeC, this.numOpenedRounds, i29);
                        int[] iArr9 = {signature2.challengeP[iIndexOf]};
                        Signature2.Proof2 proof2 = signature2.proofs[i29];
                        int i30 = this.numMPCParties;
                        int i31 = this.seedSizeBytes;
                        byte[] bArr10 = new byte[i30 * i31];
                        proof2.seedInfo = bArr10;
                        proof2.seedInfoLen = treeArr[i29].revealSeeds(iArr9, 1, bArr10, i30 * i31);
                        if (signature2.challengeP[iIndexOf] != this.numMPCParties - 1) {
                            getAuxBits(signature2.proofs[i29].aux, tapeArr[i29]);
                        }
                        i13 = i26;
                        System.arraycopy(bArr3[i29], i13, signature2.proofs[i29].input, i13, this.stateSizeBytes);
                        System.arraycopy(msgArr[i29].msgs[signature2.challengeP[iIndexOf]], i13, signature2.proofs[i29].msgs, i13, this.andSizeBytes);
                        System.arraycopy(bArr5[i29][signature2.challengeP[iIndexOf]], i13, signature2.proofs[i29].C, i13, this.digestSizeBytes);
                    } else {
                        i13 = i26;
                    }
                    i29++;
                    i26 = i13;
                }
                return true;
            }
            msgArr[i22] = new Msg(this);
            int[] iArrLittleEndianToInt = Pack.littleEndianToInt(bArr3[i22], 0, this.stateSizeWords);
            xor_array(iArrLittleEndianToInt, iArrLittleEndianToInt, iArr, 0);
            int i32 = i22;
            if (simulateOnline(iArrLittleEndianToInt, tapeArr[i32], iArr5, msgArr[i32], iArr3, iArr2) != 0) {
                LOG.fine("MPC simulation failed, aborting signature");
                return false;
            }
            Pack.intToLittleEndian(iArrLittleEndianToInt, bArr3[i32], 0);
            i22 = i32 + 1;
        }
    }

    private int simulateOnline(int[] iArr, Tape tape, int[] iArr2, Msg msg, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr5, iArr, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        xor_array(iArr6, iArr5, iArr3, 0);
        for (int i10 = 1; i10 <= this.numRounds; i10++) {
            tapesToWords(iArr2, tape);
            mpc_sbox(iArr6, iArr2, tape, msg);
            int i11 = i10 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i11);
            matrix_mul(iArr6, iArr6, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i11);
            xor_array(iArr6, iArr6, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i10);
            matrix_mul(iArr5, iArr, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            xor_array(iArr6, iArr5, iArr6, 0);
        }
        return !subarrayEquals(iArr6, iArr4, this.stateSizeWords) ? -1 : 0;
    }

    private static boolean subarrayEquals(byte[] bArr, byte[] bArr2, int i10) {
        if (bArr.length < i10 || bArr2.length < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private void substitution(int[] iArr) {
        for (int i10 = 0; i10 < this.numSboxes * 3; i10 += 3) {
            int i11 = i10 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i11);
            int i12 = i10 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i12);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i10);
            Utils.setBitInWordArray(iArr, i11, (bitFromWordArray2 & bitFromWordArray3) ^ bitFromWordArray);
            int i13 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i12, (bitFromWordArray & bitFromWordArray3) ^ i13);
            Utils.setBitInWordArray(iArr, i10, (i13 ^ bitFromWordArray3) ^ (bitFromWordArray & bitFromWordArray2));
        }
    }

    private void tapesToWords(int[] iArr, Tape tape) {
        for (int i10 = 0; i10 < this.stateSizeBits; i10++) {
            iArr[i10] = tape.tapesToWord();
        }
    }

    private void updateDigest(int[] iArr, byte[] bArr) {
        Pack.intToLittleEndian(iArr, bArr, 0);
        this.digest.update(bArr, 0, this.stateSizeBytes);
    }

    private int verify(Signature signature, int[] iArr, int[] iArr2, byte[] bArr) {
        String str;
        int i10;
        int i11;
        PicnicEngine picnicEngine = this;
        char c10 = 3;
        char c11 = 2;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][][] bArr3 = (byte[][][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, 3, picnicEngine.UnruhGWithInputBytes);
        int[][][] iArr4 = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, picnicEngine.numMPCRounds, 3, picnicEngine.stateSizeBytes);
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr4 = signature.challengeBits;
        int i12 = picnicEngine.stateSizeBytes;
        byte[] bArr5 = new byte[Math.max(i12 * 6, i12 + picnicEngine.andSizeBytes)];
        Tape tape = new Tape(picnicEngine);
        int i13 = picnicEngine.numMPCRounds;
        View[] viewArr = new View[i13];
        View[] viewArr2 = new View[i13];
        int i14 = 0;
        while (true) {
            int i15 = picnicEngine.numMPCRounds;
            if (i14 < i15) {
                viewArr[i14] = new View(picnicEngine);
                View[] viewArr3 = viewArr2;
                View view = new View(picnicEngine);
                viewArr3[i14] = view;
                Signature.Proof[] proofArr2 = proofArr;
                View[] viewArr4 = viewArr;
                char c12 = c10;
                byte[] bArr6 = bArr4;
                char c13 = c11;
                str = "Invalid signature. Did not verify";
                if (!picnicEngine.verifyProof(proofArr2[i14], viewArr[i14], view, picnicEngine.getChallenge(bArr4, i14), signature.salt, i14, bArr5, iArr2, tape)) {
                    break;
                }
                int challenge = picnicEngine.getChallenge(bArr6, i14);
                picnicEngine.Commit(proofArr2[i14].seed1, 0, viewArr4[i14], bArr2[i14][challenge]);
                int i16 = (challenge + 1) % 3;
                picnicEngine.Commit(proofArr2[i14].seed2, 0, viewArr3[i14], bArr2[i14][i16]);
                int i17 = (challenge + 2) % 3;
                System.arraycopy(proofArr2[i14].view3Commitment, 0, bArr2[i14][i17], 0, picnicEngine.digestSizeBytes);
                if (picnicEngine.transform == 1) {
                    picnicEngine.G(challenge, proofArr2[i14].seed1, 0, viewArr4[i14], bArr3[i14][challenge]);
                    i10 = challenge;
                    picnicEngine = this;
                    i11 = i16;
                    picnicEngine.G(i11, proofArr2[i14].seed2, 0, viewArr3[i14], bArr3[i14][i16]);
                    System.arraycopy(proofArr2[i14].view3UnruhG, 0, bArr3[i14][i17], 0, i10 == 0 ? picnicEngine.UnruhGWithInputBytes : picnicEngine.UnruhGWithoutInputBytes);
                } else {
                    i10 = challenge;
                    i11 = i16;
                }
                iArr4[i14][i10] = viewArr4[i14].outputShare;
                iArr4[i14][i11] = viewArr3[i14].outputShare;
                int[] iArr5 = new int[picnicEngine.stateSizeWords];
                picnicEngine.xor_three(iArr5, viewArr4[i14].outputShare, viewArr3[i14].outputShare, iArr);
                iArr4[i14][i17] = iArr5;
                i14++;
                bArr4 = bArr6;
                proofArr = proofArr2;
                c10 = c12;
                viewArr = viewArr4;
                viewArr2 = viewArr3;
                c11 = c13;
            } else {
                str = "Invalid signature. Did not verify";
                byte[] bArr7 = new byte[Utils.numBytes(i15 * 2)];
                picnicEngine.H3(iArr, iArr2, iArr4, bArr2, bArr7, signature.salt, bArr, bArr3);
                if (subarrayEquals(bArr4, bArr7, Utils.numBytes(picnicEngine.numMPCRounds * 2))) {
                    return 0;
                }
            }
        }
        LOG.fine(str);
        return -1;
    }

    private int verify_picnic3(Signature2 signature2, int[] iArr, int[] iArr2, byte[] bArr) {
        int iVerifyMerkleTree;
        Logger logger;
        String string;
        StringBuilder sb;
        Tape[] tapeArr;
        int i10;
        PicnicEngine picnicEngine = this;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        Msg[] msgArr = new Msg[picnicEngine.numMPCRounds];
        Tree tree = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        byte[] bArr5 = new byte[64];
        int i11 = picnicEngine.numMPCRounds;
        Tree[] treeArr = new Tree[i11];
        Tape[] tapeArr2 = new Tape[i11];
        Tree tree2 = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.seedSizeBytes);
        if (tree2.reconstructSeeds(signature2.challengeC, picnicEngine.numOpenedRounds, signature2.iSeedInfo, signature2.iSeedInfoLen, signature2.salt, 0) != 0) {
            return -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < picnicEngine.numMPCRounds) {
                if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i12)) {
                    treeArr[i12] = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
                    int[] iArr4 = {signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i12)]};
                    Tree tree3 = treeArr[i12];
                    Signature2.Proof2 proof2 = signature2.proofs[i12];
                    int i13 = i12;
                    int iReconstructSeeds = tree3.reconstructSeeds(iArr4, 1, proof2.seedInfo, proof2.seedInfoLen, signature2.salt, i13);
                    i10 = i13;
                    if (iReconstructSeeds != 0) {
                        logger = LOG;
                        sb = new StringBuilder("Failed to reconstruct seeds for round ");
                        sb.append(i10);
                        break;
                    }
                } else {
                    Tree tree4 = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
                    treeArr[i12] = tree4;
                    tree4.generateSeeds(tree2.getLeaf(i12), signature2.salt, i12);
                    i10 = i12;
                }
                i12 = i10 + 1;
            } else {
                int i14 = picnicEngine.numMPCParties - 1;
                byte[] bArr6 = new byte[MAX_AUX_BYTES];
                int i15 = 0;
                while (i15 < picnicEngine.numMPCRounds) {
                    byte[] bArr7 = bArr6;
                    Tape tape = new Tape(picnicEngine);
                    tapeArr2[i15] = tape;
                    byte[][] bArr8 = bArr3;
                    byte[][][] bArr9 = bArr2;
                    picnicEngine.createRandomTapes(tape, treeArr[i15].getLeaves(), treeArr[i15].getLeavesOffset(), signature2.salt, i15);
                    if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i15)) {
                        tapeArr = tapeArr2;
                        int i16 = signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i15)];
                        int i17 = 0;
                        while (i17 < i14) {
                            if (i17 != i16) {
                                picnicEngine.commit(bArr9[i15][i17], treeArr[i15].getLeaf(i17), null, signature2.salt, i15, i17);
                            }
                            i17++;
                            picnicEngine = this;
                        }
                        if (i14 != i16) {
                            picnicEngine = this;
                            picnicEngine.commit(bArr9[i15][i14], treeArr[i15].getLeaf(i14), signature2.proofs[i15].aux, signature2.salt, i15, i14);
                        } else {
                            picnicEngine = this;
                        }
                        System.arraycopy(signature2.proofs[i15].C, 0, bArr9[i15][i16], 0, picnicEngine.digestSizeBytes);
                    } else {
                        tapeArr2[i15].computeAuxTape(null);
                        Tape[] tapeArr3 = tapeArr2;
                        int i18 = 0;
                        while (i18 < i14) {
                            picnicEngine.commit(bArr9[i15][i18], treeArr[i15].getLeaf(i18), null, signature2.salt, i15, i18);
                            i18++;
                            tapeArr3 = tapeArr3;
                        }
                        tapeArr = tapeArr3;
                        picnicEngine.getAuxBits(bArr7, tapeArr[i15]);
                        picnicEngine.commit(bArr9[i15][i14], treeArr[i15].getLeaf(i14), bArr7, signature2.salt, i15, i14);
                    }
                    i15++;
                    bArr6 = bArr7;
                    bArr3 = bArr8;
                    tapeArr2 = tapeArr;
                    bArr2 = bArr9;
                }
                Tape[] tapeArr4 = tapeArr2;
                byte[][][] bArr10 = bArr2;
                byte[][] bArr11 = bArr3;
                for (int i19 = 0; i19 < picnicEngine.numMPCRounds; i19++) {
                    picnicEngine.commit_h(bArr11[i19], bArr10[i19]);
                }
                int[] iArr5 = new int[picnicEngine.stateSizeBits];
                int i20 = 0;
                while (true) {
                    int i21 = picnicEngine.numMPCRounds;
                    if (i20 < i21) {
                        msgArr[i20] = new Msg(picnicEngine);
                        if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i20)) {
                            int i22 = signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i20)];
                            if (i22 != i14) {
                                tapeArr4[i20].setAuxBits(signature2.proofs[i20].aux);
                            }
                            System.arraycopy(signature2.proofs[i20].msgs, 0, msgArr[i20].msgs[i22], 0, picnicEngine.andSizeBytes);
                            Arrays.fill(tapeArr4[i20].tapes[i22], (byte) 0);
                            msgArr[i20].unopened = i22;
                            byte[] bArr12 = new byte[picnicEngine.stateSizeWords * 4];
                            byte[] bArr13 = signature2.proofs[i20].input;
                            System.arraycopy(bArr13, 0, bArr12, 0, bArr13.length);
                            int i23 = picnicEngine.stateSizeWords;
                            int[] iArr6 = new int[i23];
                            Pack.littleEndianToInt(bArr12, 0, iArr6, 0, i23);
                            if (picnicEngine.simulateOnline(iArr6, tapeArr4[i20], iArr5, msgArr[i20], iArr2, iArr) != 0) {
                                logger = LOG;
                                sb = new StringBuilder("MPC simulation failed for round ");
                                sb.append(i20);
                                sb.append(", signature invalid");
                                break;
                            }
                            picnicEngine.commit_v(bArr4[i20], signature2.proofs[i20].input, msgArr[i20]);
                        } else {
                            bArr4[i20] = null;
                        }
                        i20++;
                    } else {
                        if (tree.addMerkleNodes(picnicEngine.getMissingLeavesList(signature2.challengeC), i21 - picnicEngine.numOpenedRounds, signature2.cvInfo, signature2.cvInfoLen) != 0 || (iVerifyMerkleTree = tree.verifyMerkleTree(bArr4, signature2.salt)) != 0) {
                            return -1;
                        }
                        picnicEngine.HCP(bArr5, null, null, bArr11, tree.nodes[0], signature2.salt, iArr, iArr2, bArr);
                        if (subarrayEquals(signature2.challengeHash, bArr5, picnicEngine.digestSizeBytes)) {
                            return iVerifyMerkleTree;
                        }
                        logger = LOG;
                        string = "Challenge does not match, signature invalid";
                    }
                }
            }
        }
        string = sb.toString();
        logger.fine(string);
        return -1;
    }

    private void wordToMsgs(int i10, Msg msg) {
        for (int i11 = 0; i11 < this.numMPCParties; i11++) {
            Utils.setBit(msg.msgs[i11], msg.pos, (byte) Utils.getBit(i10, i11));
        }
        msg.pos++;
    }

    private void xor_three(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i10 = 0; i10 < this.stateSizeWords; i10++) {
            iArr[i10] = (iArr2[i10] ^ iArr3[i10]) ^ iArr4[i10];
        }
    }

    public void aux_mpc_sbox(int[] iArr, int[] iArr2, Tape tape) {
        for (int i10 = 0; i10 < this.numSboxes * 3; i10 += 3) {
            int i11 = i10 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i11);
            int i12 = i10 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i12);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i10);
            int bitFromWordArray4 = Utils.getBitFromWordArray(iArr2, i11);
            int bitFromWordArray5 = Utils.getBitFromWordArray(iArr2, i12);
            aux_mpc_AND(bitFromWordArray, bitFromWordArray2, ((Utils.getBitFromWordArray(iArr2, i10) ^ bitFromWordArray) ^ bitFromWordArray2) ^ bitFromWordArray3, tape);
            aux_mpc_AND(bitFromWordArray2, bitFromWordArray3, bitFromWordArray4 ^ bitFromWordArray, tape);
            aux_mpc_AND(bitFromWordArray3, bitFromWordArray, (bitFromWordArray5 ^ bitFromWordArray) ^ bitFromWordArray2, tape);
        }
    }

    public void crypto_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_sign(bArr3, bArr2, bArr)) {
            System.arraycopy(bArr2, 0, bArr, 4, bArr2.length);
        }
    }

    public void crypto_sign_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i10 = this.stateSizeWords;
        byte[] bArr3 = new byte[i10 * 4];
        byte[] bArr4 = new byte[i10 * 4];
        byte[] bArr5 = new byte[i10 * 4];
        picnic_keygen(bArr3, bArr4, bArr5, secureRandom);
        picnic_write_public_key(bArr4, bArr3, bArr);
        picnic_write_private_key(bArr5, bArr4, bArr3, bArr2);
    }

    public boolean crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_verify(bArr3, Arrays.copyOfRange(bArr2, 4, bArr.length + 4), bArr2, Pack.littleEndianToInt(bArr2, 0)) == -1) {
            return false;
        }
        System.arraycopy(bArr2, 4, bArr, 0, bArr.length);
        return true;
    }

    public int getChallenge(byte[] bArr, int i10) {
        return Utils.getCrumbAligned(bArr, i10);
    }

    public int getPublicKeySize() {
        return this.CRYPTO_PUBLICKEYBYTES;
    }

    public int getSecretKeySize() {
        return this.CRYPTO_SECRETKEYBYTES;
    }

    public int getSignatureSize(int i10) {
        return this.CRYPTO_BYTES + i10;
    }

    public int getTrueSignatureSize() {
        return this.signatureLength;
    }

    public void matrix_mul(int[] iArr, int[] iArr2, int[] iArr3, int i10) {
        matrix_mul_offset(iArr, 0, iArr2, 0, iArr3, i10);
    }

    public void matrix_mul_offset(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        int[] iArr4 = new int[16];
        int i13 = this.stateSizeWords;
        iArr4[i13 - 1] = 0;
        int i14 = this.stateSizeBits;
        int i15 = i14 / 32;
        int i16 = (i13 * 32) - i14;
        int iBitPermuteStepSimple = Bits.bitPermuteStepSimple(Bits.bitPermuteStepSimple(Bits.bitPermuteStepSimple((-1) >>> i16, 1431655765, 1), 858993459, 2), 252645135, 4);
        for (int i17 = 0; i17 < this.stateSizeBits; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 ^= iArr3[i12 + ((this.stateSizeWords * i17) + i19)] & iArr2[i11 + i19];
            }
            if (i16 > 0) {
                i18 ^= (iArr3[i12 + ((this.stateSizeWords * i17) + i15)] & iArr2[i11 + i15]) & iBitPermuteStepSimple;
            }
            Utils.setBit(iArr4, i17, Utils.parity32(i18));
        }
        System.arraycopy(iArr4, 0, iArr, i10, this.stateSizeWords);
    }

    public void mpc_AND_verify(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View view, View view2) {
        byte bit = Utils.getBit(tape.tapes[0], tape.pos);
        byte bit2 = Utils.getBit(tape.tapes[1], tape.pos);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr2[0];
        int i13 = ((((i11 & i12) ^ (iArr2[1] & i10)) ^ (i10 & i12)) ^ bit) ^ bit2;
        iArr3[0] = i13;
        Utils.setBit(view.communicatedBits, tape.pos, (byte) i13);
        iArr3[1] = Utils.getBit(view2.communicatedBits, tape.pos);
        tape.pos++;
    }

    public void mpc_LowMC_verify(View view, View view2, Tape tape, int[] iArr, int[] iArr2, int i10) {
        Arrays.fill(iArr, 0, iArr.length, 0);
        mpc_xor_constant_verify(iArr, iArr2, 0, this.stateSizeWords, i10);
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        int[] iArr3 = iArr;
        matrix_mul_offset(iArr3, 0, view.inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        matrix_mul_offset(iArr3, this.stateSizeWords, view2.inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        mpc_xor(iArr3, iArr3, 2);
        for (int i11 = 1; i11 <= this.numRounds; i11++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i11);
            matrix_mul_offset(iArr3, 0, view.inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            matrix_mul_offset(iArr, this.stateSizeWords, view2.inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            mpc_substitution_verify(iArr, tape, view, view2);
            int i12 = i11 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i12);
            int i13 = this.stateSizeWords;
            mpc_matrix_mul(iArr, i13 * 2, iArr, i13 * 2, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer(), 2);
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i12);
            iArr3 = iArr;
            mpc_xor_constant_verify(iArr3, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer(), this.stateSizeWords, i10);
            mpc_xor(iArr3, iArr3, 2);
        }
        int i14 = this.stateSizeWords;
        System.arraycopy(iArr3, i14 * 2, view.outputShare, 0, i14);
        int i15 = this.stateSizeWords;
        System.arraycopy(iArr3, i15 * 3, view2.outputShare, 0, i15);
    }

    public void mpc_substitution_verify(int[] iArr, Tape tape, View view, View view2) {
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        int[] iArr4 = new int[2];
        int[] iArr5 = new int[2];
        int[] iArr6 = new int[2];
        int[] iArr7 = new int[2];
        int i10 = 0;
        while (i10 < this.numSboxes * 3) {
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = ((i11 + 2) * this.stateSizeWords * 32) + i10;
                iArr2[i11] = Utils.getBitFromWordArray(iArr, i12 + 2);
                iArr3[i11] = Utils.getBitFromWordArray(iArr, i12 + 1);
                iArr4[i11] = Utils.getBitFromWordArray(iArr, i12);
            }
            mpc_AND_verify(iArr2, iArr3, iArr5, tape, view, view2);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND_verify(iArr10, iArr8, iArr11, tape, view, view2);
            int[] iArr13 = iArr7;
            mpc_AND_verify(iArr8, iArr9, iArr13, tape, view, view2);
            iArr2 = iArr9;
            for (int i13 = 0; i13 < 2; i13++) {
                int i14 = ((i13 + 2) * this.stateSizeWords * 32) + i10;
                Utils.setBitInWordArray(iArr, i14 + 2, iArr2[i13] ^ iArr11[i13]);
                Utils.setBitInWordArray(iArr, i14 + 1, (iArr2[i13] ^ iArr10[i13]) ^ iArr13[i13]);
                Utils.setBitInWordArray(iArr, i14, ((iArr2[i13] ^ iArr10[i13]) ^ iArr8[i13]) ^ iArr12[i13]);
            }
            i10 += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    public void prove(Signature.Proof proof, int i10, byte[] bArr, int i11, View[] viewArr, byte[][] bArr2, byte[][] bArr3) {
        if (i10 == 0) {
            System.arraycopy(bArr, i11, proof.seed1, 0, this.seedSizeBytes);
            int i12 = this.seedSizeBytes;
            System.arraycopy(bArr, i11 + i12, proof.seed2, 0, i12);
        } else if (i10 == 1) {
            int i13 = this.seedSizeBytes;
            System.arraycopy(bArr, i11 + i13, proof.seed1, 0, i13);
            int i14 = this.seedSizeBytes;
            System.arraycopy(bArr, (i14 * 2) + i11, proof.seed2, 0, i14);
        } else {
            if (i10 != 2) {
                LOG.fine("Invalid challenge");
                throw new IllegalArgumentException("challenge");
            }
            int i15 = this.seedSizeBytes;
            System.arraycopy(bArr, (i15 * 2) + i11, proof.seed1, 0, i15);
            System.arraycopy(bArr, i11, proof.seed2, 0, this.seedSizeBytes);
        }
        if (i10 == 1 || i10 == 2) {
            System.arraycopy(viewArr[2].inputShare, 0, proof.inputShare, 0, this.stateSizeWords);
        }
        System.arraycopy(viewArr[(i10 + 1) % 3].communicatedBits, 0, proof.communicatedBits, 0, this.andSizeBytes);
        int i16 = (i10 + 2) % 3;
        System.arraycopy(bArr2[i16], 0, proof.view3Commitment, 0, this.digestSizeBytes);
        if (this.transform == 1) {
            System.arraycopy(bArr3[i16], 0, proof.view3UnruhG, 0, i10 == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
        }
    }

    public int serializeSignature(Signature signature, byte[] bArr, int i10) {
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int iNumBytes = Utils.numBytes(this.numMPCRounds * 2) + 32;
        int i11 = this.numMPCRounds;
        int i12 = (((this.seedSizeBytes * 2) + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes) * i11) + iNumBytes;
        if (this.transform == 1) {
            i12 += this.UnruhGWithoutInputBytes * i11;
        }
        if (this.CRYPTO_BYTES < i12) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i10, Utils.numBytes(i11 * 2));
        int iNumBytes2 = Utils.numBytes(this.numMPCRounds * 2) + i10;
        System.arraycopy(signature.salt, 0, bArr, iNumBytes2, 32);
        int i13 = iNumBytes2 + 32;
        for (int i14 = 0; i14 < this.numMPCRounds; i14++) {
            int challenge = getChallenge(bArr2, i14);
            System.arraycopy(proofArr[i14].view3Commitment, 0, bArr, i13, this.digestSizeBytes);
            int i15 = i13 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i16 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(proofArr[i14].view3UnruhG, 0, bArr, i15, i16);
                i15 += i16;
            }
            System.arraycopy(proofArr[i14].communicatedBits, 0, bArr, i15, this.andSizeBytes);
            int i17 = i15 + this.andSizeBytes;
            System.arraycopy(proofArr[i14].seed1, 0, bArr, i17, this.seedSizeBytes);
            int i18 = this.seedSizeBytes;
            int i19 = i17 + i18;
            System.arraycopy(proofArr[i14].seed2, 0, bArr, i19, i18);
            i13 = i19 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.intToLittleEndian(proofArr[i14].inputShare, 0, this.stateSizeWords, bArr, i13);
                i13 += this.stateSizeBytes;
            }
        }
        return i13 - i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verifyProof(Signature.Proof proof, View view, View view2, int i10, byte[] bArr, int i11, byte[] bArr2, int[] iArr, Tape tape) {
        byte[] bArr3;
        boolean z10;
        System.arraycopy(proof.communicatedBits, 0, view2.communicatedBits, 0, this.andSizeBytes);
        tape.pos = 0;
        if (i10 == 0) {
            bArr3 = bArr2;
            boolean zCreateRandomTape = createRandomTape(proof.seed1, 0, bArr, i11, 0, bArr3, this.stateSizeBytes + this.andSizeBytes);
            Pack.littleEndianToInt(bArr3, 0, view.inputShare);
            System.arraycopy(bArr3, this.stateSizeBytes, tape.tapes[0], 0, this.andSizeBytes);
            z10 = zCreateRandomTape && createRandomTape(proof.seed2, 0, bArr, i11, 1, bArr3, this.stateSizeBytes + this.andSizeBytes);
            if (z10) {
                Pack.littleEndianToInt(bArr3, 0, view2.inputShare);
                System.arraycopy(bArr3, this.stateSizeBytes, tape.tapes[1], 0, this.andSizeBytes);
            }
        } else if (i10 == 1) {
            boolean zCreateRandomTape2 = createRandomTape(proof.seed1, 0, bArr, i11, 1, bArr2, this.stateSizeBytes + this.andSizeBytes);
            Pack.littleEndianToInt(bArr2, 0, view.inputShare);
            System.arraycopy(bArr2, this.stateSizeBytes, tape.tapes[0], 0, this.andSizeBytes);
            z10 = zCreateRandomTape2 && createRandomTape(proof.seed2, 0, bArr, i11, 2, tape.tapes[1], this.andSizeBytes);
            if (z10) {
                System.arraycopy(proof.inputShare, 0, view2.inputShare, 0, this.stateSizeWords);
            }
            bArr3 = bArr2;
        } else if (i10 != 2) {
            LOG.fine("Invalid Challenge!");
            bArr3 = bArr2;
            z10 = false;
        } else {
            boolean zCreateRandomTape3 = createRandomTape(proof.seed1, 0, bArr, i11, 2, tape.tapes[0], this.andSizeBytes);
            System.arraycopy(proof.inputShare, 0, view.inputShare, 0, this.stateSizeWords);
            if (zCreateRandomTape3) {
                bArr3 = bArr2;
                if (createRandomTape(proof.seed2, 0, bArr, i11, 0, bArr3, this.stateSizeBytes + this.andSizeBytes)) {
                    z10 = true;
                }
                if (z10) {
                    Pack.littleEndianToInt(bArr3, 0, view2.inputShare);
                    System.arraycopy(bArr3, this.stateSizeBytes, tape.tapes[1], 0, this.andSizeBytes);
                }
            } else {
                bArr3 = bArr2;
            }
            z10 = false;
            if (z10) {
            }
        }
        if (!z10) {
            LOG.fine("Failed to generate random tapes, signature verification will fail (but signature may actually be valid)");
            return false;
        }
        Utils.zeroTrailingBits(view.inputShare, this.stateSizeBits);
        Utils.zeroTrailingBits(view2.inputShare, this.stateSizeBits);
        mpc_LowMC_verify(view, view2, tape, Pack.littleEndianToInt(bArr3, 0, bArr3.length / 4), iArr, i10);
        return true;
    }

    public void xor_array(int[] iArr, int[] iArr2, int[] iArr3, int i10) {
        for (int i11 = 0; i11 < this.stateSizeWords; i11++) {
            iArr[i11] = iArr2[i11] ^ iArr3[i11 + i10];
        }
    }

    private void H3(int[] iArr, int[] iArr2, int[][][] iArr3, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        this.digest.update((byte) 1);
        byte[] bArr6 = new byte[this.stateSizeWords * 4];
        for (int i10 = 0; i10 < this.numMPCRounds; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                Pack.intToLittleEndian(iArr3[i10][i11], bArr6, 0);
                this.digest.update(bArr6, 0, this.stateSizeBytes);
            }
        }
        implH3(iArr, iArr2, bArr, bArr2, bArr3, bArr4, bArr5);
    }

    private boolean arePaddingBitsZero(int[] iArr, int i10) {
        if ((i10 & 31) == 0) {
            return true;
        }
        return (iArr[i10 >>> 5] & (~Utils.getTrailingBitsMask(i10))) == 0;
    }

    private void mpc_AND(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View[] viewArr) {
        byte bit = Utils.getBit(tape.tapes[0], tape.pos);
        byte bit2 = Utils.getBit(tape.tapes[1], tape.pos);
        byte bit3 = Utils.getBit(tape.tapes[2], tape.pos);
        int i10 = iArr[0];
        int i11 = iArr2[1];
        int i12 = iArr[1];
        int i13 = iArr2[0];
        int i14 = (((i10 & i13) ^ ((i10 & i11) ^ (i12 & i13))) ^ bit) ^ bit2;
        iArr3[0] = i14;
        int i15 = iArr2[2];
        int i16 = iArr[2];
        iArr3[1] = (bit2 ^ ((i11 & i12) ^ ((i12 & i15) ^ (i16 & i11)))) ^ bit3;
        iArr3[2] = ((((iArr[0] & i15) ^ (iArr2[0] & i16)) ^ (i16 & i15)) ^ bit3) ^ bit;
        Utils.setBit(viewArr[0].communicatedBits, tape.pos, (byte) i14);
        Utils.setBit(viewArr[1].communicatedBits, tape.pos, (byte) iArr3[1]);
        Utils.setBit(viewArr[2].communicatedBits, tape.pos, (byte) iArr3[2]);
        tape.pos++;
    }

    private static boolean subarrayEquals(int[] iArr, int[] iArr2, int i10) {
        if (iArr.length < i10 || iArr2.length < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
