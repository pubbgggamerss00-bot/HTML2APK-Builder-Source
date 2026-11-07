package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        this.f20030m = ((this.f20030m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.f20033v2 ^= 238;
        applySipRounds(this.f20027d);
        long j10 = this.f20031v0;
        long j11 = this.f20032v1;
        long j12 = ((j10 ^ j11) ^ this.f20033v2) ^ this.f20034v3;
        this.f20032v1 = j11 ^ 221;
        applySipRounds(this.f20027d);
        long j13 = ((this.f20031v0 ^ this.f20032v1) ^ this.f20033v2) ^ this.f20034v3;
        reset();
        Pack.longToLittleEndian(j12, bArr, i10);
        Pack.longToLittleEndian(j13, bArr, i10 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f20026c + "-" + this.f20027d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f20032v1 ^= 238;
    }

    public SipHash128(int i10, int i11) {
        super(i10, i11);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() throws IllegalStateException, DataLengthException {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
