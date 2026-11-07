package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes3.dex */
class SIG {

    /* renamed from: r, reason: collision with root package name */
    private final byte[] f20427r;
    private final SIG_FORS[] sig_fors;
    private final SIG_XMSS[] sig_ht;

    public SIG(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
        byte[] bArr2 = new byte[i10];
        this.f20427r = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        this.sig_fors = new SIG_FORS[i11];
        int i16 = i10;
        for (int i17 = 0; i17 != i11; i17++) {
            byte[] bArr3 = new byte[i10];
            System.arraycopy(bArr, i16, bArr3, 0, i10);
            i16 += i10;
            byte[][] bArr4 = new byte[i12][];
            for (int i18 = 0; i18 != i12; i18++) {
                byte[] bArr5 = new byte[i10];
                bArr4[i18] = bArr5;
                System.arraycopy(bArr, i16, bArr5, 0, i10);
                i16 += i10;
            }
            this.sig_fors[i17] = new SIG_FORS(bArr3, bArr4);
        }
        this.sig_ht = new SIG_XMSS[i13];
        for (int i19 = 0; i19 != i13; i19++) {
            int i20 = i15 * i10;
            byte[] bArr6 = new byte[i20];
            System.arraycopy(bArr, i16, bArr6, 0, i20);
            i16 += i20;
            byte[][] bArr7 = new byte[i14][];
            for (int i21 = 0; i21 != i14; i21++) {
                byte[] bArr8 = new byte[i10];
                bArr7[i21] = bArr8;
                System.arraycopy(bArr, i16, bArr8, 0, i10);
                i16 += i10;
            }
            this.sig_ht[i19] = new SIG_XMSS(bArr6, bArr7);
        }
        if (i16 != bArr.length) {
            throw new IllegalArgumentException("signature wrong length");
        }
    }

    public byte[] getR() {
        return this.f20427r;
    }

    public SIG_FORS[] getSIG_FORS() {
        return this.sig_fors;
    }

    public SIG_XMSS[] getSIG_HT() {
        return this.sig_ht;
    }
}
