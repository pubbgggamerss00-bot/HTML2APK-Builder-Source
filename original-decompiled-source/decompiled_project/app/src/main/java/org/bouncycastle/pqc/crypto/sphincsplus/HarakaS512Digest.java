package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
class HarakaS512Digest extends HarakaSBase implements Digest {
    public HarakaS512Digest(HarakaSXof harakaSXof) {
        this.haraka512_rc = harakaSXof.haraka512_rc;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[64];
        haraka512Perm(bArr2);
        HarakaSBase.xor(bArr2, 8, this.buffer, 8, bArr, i10, 8);
        HarakaSBase.xor(bArr2, 24, this.buffer, 24, bArr, i10 + 8, 16);
        HarakaSBase.xor(bArr2, 48, this.buffer, 48, bArr, i10 + 24, 8);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "HarakaS-512";
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
        if (i10 > 63) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        byte[] bArr = this.buffer;
        this.off = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = this.off;
        if (i12 > 64 - i11) {
            throw new IllegalArgumentException("total input cannot be more than 64 bytes");
        }
        System.arraycopy(bArr, i10, this.buffer, i12, i11);
        this.off += i11;
    }
}
