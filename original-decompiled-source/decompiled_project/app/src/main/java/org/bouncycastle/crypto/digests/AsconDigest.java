package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes2.dex */
public class AsconDigest implements ExtendedDigest {
    private final int ASCON_PB_ROUNDS;
    private final String algorithmName;
    AsconParameters asconParameters;

    /* renamed from: x0, reason: collision with root package name */
    private long f19902x0;

    /* renamed from: x1, reason: collision with root package name */
    private long f19903x1;

    /* renamed from: x2, reason: collision with root package name */
    private long f19904x2;

    /* renamed from: x3, reason: collision with root package name */
    private long f19905x3;

    /* renamed from: x4, reason: collision with root package name */
    private long f19906x4;
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private final int CRYPTO_BYTES = 32;

    /* renamed from: org.bouncycastle.crypto.digests.AsconDigest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters;

        static {
            int[] iArr = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters = iArr;
            try {
                iArr[AsconParameters.AsconHash.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters[AsconParameters.AsconHashA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AsconParameters {
        AsconHash,
        AsconHashA
    }

    public AsconDigest(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters[asconParameters.ordinal()];
        if (i10 == 1) {
            this.ASCON_PB_ROUNDS = 12;
            str = "Ascon-Hash";
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Invalid parameter settings for Ascon Hash");
            }
            this.ASCON_PB_ROUNDS = 8;
            str = "Ascon-HashA";
        }
        this.algorithmName = str;
        reset();
    }

    private long LOADBYTES(byte[] bArr, int i10, int i11) {
        long j10 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j10 |= (bArr[i12 + i10] & 255) << ((7 - i12) << 3);
        }
        return j10;
    }

    private void P(int i10) {
        if (i10 == 12) {
            ROUND(240L);
            ROUND(225L);
            ROUND(210L);
            ROUND(195L);
        }
        if (i10 >= 8) {
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

    private long ROR(long j10, int i10) {
        return (j10 << (64 - i10)) | (j10 >>> i10);
    }

    private void ROUND(long j10) {
        long j11 = this.f19902x0;
        long j12 = this.f19903x1;
        long j13 = this.f19904x2;
        long j14 = this.f19905x3;
        long j15 = this.f19906x4;
        long j16 = ((((j11 ^ j12) ^ j13) ^ j14) ^ j10) ^ ((((j11 ^ j13) ^ j15) ^ j10) & j12);
        long j17 = ((((j11 ^ j13) ^ j14) ^ j15) ^ j10) ^ (((j12 ^ j13) ^ j10) & (j12 ^ j14));
        long j18 = (((j12 ^ j13) ^ j15) ^ j10) ^ (j14 & j15);
        long j19 = ((j13 ^ (j11 ^ j12)) ^ j10) ^ ((~j11) & (j14 ^ j15));
        long j20 = ((j11 ^ j15) & j12) ^ ((j12 ^ j14) ^ j15);
        this.f19902x0 = ROR(j16, 28) ^ (ROR(j16, 19) ^ j16);
        this.f19903x1 = (ROR(j17, 39) ^ j17) ^ ROR(j17, 61);
        this.f19904x2 = ~(ROR(j18, 6) ^ (ROR(j18, 1) ^ j18));
        this.f19905x3 = (ROR(j19, 10) ^ j19) ^ ROR(j19, 17);
        this.f19906x4 = ROR(j20, 41) ^ (ROR(j20, 7) ^ j20);
    }

    private void STOREBYTES(byte[] bArr, int i10, long j10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12 + i10] = (byte) (j10 >>> ((7 - i12) << 3));
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        long j10;
        if (i10 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.buffer.toByteArray();
        int size = this.buffer.size();
        int i11 = 0;
        while (true) {
            j10 = this.f19902x0;
            if (size < 8) {
                break;
            }
            this.f19902x0 = j10 ^ LOADBYTES(byteArray, i11, 8);
            P(this.ASCON_PB_ROUNDS);
            i11 += 8;
            size -= 8;
        }
        long jLOADBYTES = j10 ^ LOADBYTES(byteArray, i11, size);
        this.f19902x0 = jLOADBYTES;
        this.f19902x0 = PAD(size) ^ jLOADBYTES;
        P(12);
        int i12 = i10;
        int i13 = 32;
        while (i13 > 8) {
            byte[] bArr2 = bArr;
            STOREBYTES(bArr2, i12, this.f19902x0, 8);
            P(this.ASCON_PB_ROUNDS);
            i12 += 8;
            i13 -= 8;
            bArr = bArr2;
        }
        STOREBYTES(bArr, i12, this.f19902x0, i13);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        long j10;
        this.buffer.reset();
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters[this.asconParameters.ordinal()];
        if (i10 == 1) {
            this.f19902x0 = -1255492011513352131L;
            this.f19903x1 = -8380609354527731710L;
            this.f19904x2 = -5437372128236807582L;
            this.f19905x3 = 4834782570098516968L;
            j10 = 3787428097924915520L;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f19902x0 = 92044056785660070L;
            this.f19903x1 = 8326807761760157607L;
            this.f19904x2 = 3371194088139667532L;
            this.f19905x3 = -2956994353054992515L;
            j10 = -6828509670848688761L;
        }
        this.f19906x4 = j10;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.buffer.write(b10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.buffer.write(bArr, i10, i11);
    }
}
