package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
class HarakaS256Digest extends HarakaSBase implements Digest {
    public HarakaS256Digest(HarakaSXof harakaSXof) {
        this.haraka256_rc = harakaSXof.haraka256_rc;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[32];
        haraka256Perm(bArr2);
        HarakaSBase.xor(bArr2, 0, this.buffer, 0, bArr, i10, 32);
        reset();
        return bArr.length;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "HarakaS-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.pqc.crypto.sphincsplus.HarakaSBase, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.off;
        if (i10 > 31) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        byte[] bArr = this.buffer;
        this.off = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = this.off;
        if (i12 > 32 - i11) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        System.arraycopy(bArr, i10, this.buffer, i12, i11);
        this.off += i11;
    }
}
