package org.bouncycastle.crypto.digests;

import b.o;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.SparkleEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SparkleDigest implements ExtendedDigest {
    private static final int RATE_BYTES = 16;
    private static final int RATE_WORDS = 4;
    private final int DIGEST_BYTES;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private String algorithmName;
    private final byte[] m_buf = new byte[16];
    private int m_bufPos = 0;
    private final int[] state;

    /* renamed from: org.bouncycastle.crypto.digests.SparkleDigest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters;

        static {
            int[] iArr = new int[SparkleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters = iArr;
            try {
                iArr[SparkleParameters.ESCH256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters[SparkleParameters.ESCH384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public enum SparkleParameters {
        ESCH256,
        ESCH384
    }

    public SparkleDigest(SparkleParameters sparkleParameters) {
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters[sparkleParameters.ordinal()];
        if (i10 == 1) {
            this.algorithmName = "ESCH-256";
            this.DIGEST_BYTES = 32;
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 11;
            this.STATE_WORDS = 12;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
            }
            this.algorithmName = "ESCH-384";
            this.DIGEST_BYTES = 48;
            this.SPARKLE_STEPS_SLIM = 8;
            this.SPARKLE_STEPS_BIG = 12;
            this.STATE_WORDS = 16;
        }
        this.state = new int[this.STATE_WORDS];
    }

    private static int ELL(int i10) {
        return (i10 & 65535) ^ Integers.rotateRight(i10, 16);
    }

    private void processBlock(byte[] bArr, int i10, int i11) {
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i10);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i10 + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i10 + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i10 + 12);
        int iELL = ELL(iLittleEndianToInt ^ iLittleEndianToInt3);
        int iELL2 = ELL(iLittleEndianToInt2 ^ iLittleEndianToInt4);
        int[] iArr = this.state;
        iArr[0] = (iLittleEndianToInt ^ iELL2) ^ iArr[0];
        iArr[1] = (iLittleEndianToInt2 ^ iELL) ^ iArr[1];
        iArr[2] = iArr[2] ^ (iLittleEndianToInt3 ^ iELL2);
        iArr[3] = (iLittleEndianToInt4 ^ iELL) ^ iArr[3];
        iArr[4] = iArr[4] ^ iELL2;
        iArr[5] = iArr[5] ^ iELL;
        if (this.STATE_WORDS != 16) {
            SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, i11);
            return;
        }
        iArr[6] = iArr[6] ^ iELL2;
        iArr[7] = iELL ^ iArr[7];
        SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, i11);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        if (i10 > bArr.length - this.DIGEST_BYTES) {
            throw new OutputLengthException(o.a(new StringBuilder(), this.algorithmName, " input buffer too short"));
        }
        int i11 = this.m_bufPos;
        if (i11 < 16) {
            int[] iArr = this.state;
            int i12 = (this.STATE_WORDS >> 1) - 1;
            iArr[i12] = iArr[i12] ^ 16777216;
            this.m_buf[i11] = Byte.MIN_VALUE;
            while (true) {
                int i13 = this.m_bufPos + 1;
                this.m_bufPos = i13;
                if (i13 >= 16) {
                    break;
                }
                this.m_buf[i13] = 0;
            }
        } else {
            int[] iArr2 = this.state;
            int i14 = (this.STATE_WORDS >> 1) - 1;
            iArr2[i14] = iArr2[i14] ^ 33554432;
        }
        processBlock(this.m_buf, 0, this.SPARKLE_STEPS_BIG);
        Pack.intToLittleEndian(this.state, 0, 4, bArr, i10);
        if (this.STATE_WORDS == 16) {
            SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i10 + 16);
            SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i10 + 32);
        } else {
            SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i10 + 16);
        }
        reset();
        return this.DIGEST_BYTES;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.DIGEST_BYTES;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, 0);
        Arrays.fill(this.m_buf, (byte) 0);
        this.m_bufPos = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        if (this.m_bufPos == 16) {
            processBlock(this.m_buf, 0, this.SPARKLE_STEPS_SLIM);
            this.m_bufPos = 0;
        }
        byte[] bArr = this.m_buf;
        int i10 = this.m_bufPos;
        this.m_bufPos = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        if (i10 > bArr.length - i11) {
            throw new DataLengthException(o.a(new StringBuilder(), this.algorithmName, " input buffer too short"));
        }
        if (i11 < 1) {
            return;
        }
        int i12 = this.m_bufPos;
        int i13 = 16 - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, this.m_buf, i12, i11);
            this.m_bufPos += i11;
            return;
        }
        if (i12 > 0) {
            System.arraycopy(bArr, i10, this.m_buf, i12, i13);
            processBlock(this.m_buf, 0, this.SPARKLE_STEPS_SLIM);
        } else {
            i13 = 0;
        }
        while (true) {
            int i14 = i11 - i13;
            if (i14 <= 16) {
                System.arraycopy(bArr, i10 + i13, this.m_buf, 0, i14);
                this.m_bufPos = i14;
                return;
            } else {
                processBlock(bArr, i10 + i13, this.SPARKLE_STEPS_SLIM);
                i13 += 16;
            }
        }
    }
}
