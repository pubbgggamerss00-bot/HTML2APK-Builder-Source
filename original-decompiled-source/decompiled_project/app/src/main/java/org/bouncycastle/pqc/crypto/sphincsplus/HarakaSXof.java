package org.bouncycastle.pqc.crypto.sphincsplus;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
class HarakaSXof extends HarakaSBase {
    public HarakaSXof(byte[] bArr) {
        byte[] bArr2 = new byte[640];
        update(bArr, 0, bArr.length);
        doFinal(bArr2, 0, 640);
        this.haraka512_rc = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 10, 8);
        this.haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
        for (int i10 = 0; i10 < 10; i10++) {
            interleaveConstant32(this.haraka256_rc[i10], bArr2, i10 << 5);
            interleaveConstant(this.haraka512_rc[i10], bArr2, i10 << 6);
        }
    }

    public int doFinal(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.buffer;
        int i12 = this.off;
        bArr2[i12] = (byte) (bArr2[i12] ^ 31);
        bArr2[31] = (byte) (bArr2[31] ^ 128);
        int i13 = i11;
        while (i13 >= 32) {
            haraka512Perm(this.buffer);
            System.arraycopy(this.buffer, 0, bArr, i10, 32);
            i10 += 32;
            i13 -= 32;
        }
        if (i13 > 0) {
            haraka512Perm(this.buffer);
            System.arraycopy(this.buffer, 0, bArr, i10, i13);
        }
        reset();
        return i11;
    }

    public String getAlgorithmName() {
        return "Haraka-S";
    }

    public void update(byte b10) {
        byte[] bArr = this.buffer;
        int i10 = this.off;
        int i11 = i10 + 1;
        this.off = i11;
        bArr[i10] = (byte) (b10 ^ bArr[i10]);
        if (i11 == 32) {
            haraka512Perm(bArr);
            this.off = 0;
        }
    }

    public void update(byte[] bArr, int i10, int i11) {
        int i12 = (this.off + i11) >> 5;
        int i13 = i10;
        for (int i14 = 0; i14 < i12; i14++) {
            while (true) {
                int i15 = this.off;
                if (i15 < 32) {
                    byte[] bArr2 = this.buffer;
                    this.off = i15 + 1;
                    bArr2[i15] = (byte) (bArr[i13] ^ bArr2[i15]);
                    i13++;
                }
            }
            haraka512Perm(this.buffer);
            this.off = 0;
        }
        while (i13 < i10 + i11) {
            byte[] bArr3 = this.buffer;
            int i16 = this.off;
            this.off = i16 + 1;
            bArr3[i16] = (byte) (bArr3[i16] ^ bArr[i13]);
            i13++;
        }
    }
}
