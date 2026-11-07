package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;

    /* renamed from: w, reason: collision with root package name */
    private int f20463w;

    public WinternitzOTSVerify(Digest digest, int i10) {
        this.f20463w = i10;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i11 < 1) {
            System.arraycopy(bArr, i10, bArr2, i12, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i10, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i12);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr2, i12, this.mdsize);
            }
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.mdsize;
        byte[] bArr3 = new byte[i14];
        int i15 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i16 = this.mdsize << 3;
        int i17 = this.f20463w;
        int i18 = ((i17 - 1) + i16) / i17;
        boolean z10 = true;
        int log = getLog((i18 << i17) + 1);
        int i19 = this.f20463w;
        int i20 = this.mdsize;
        int i21 = i20 * ((((log + i19) - 1) / i19) + i18);
        if (i21 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i21];
        char c10 = '\b';
        if (8 % i19 == 0) {
            int i22 = 8 / i19;
            int i23 = (1 << i19) - 1;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < i14) {
                int i27 = i25;
                int i28 = 0;
                while (i28 < i22) {
                    int i29 = bArr3[i26] & i23;
                    int i30 = i24 + i29;
                    int i31 = this.mdsize;
                    hashSignatureBlock(bArr2, i27 * i31, i23 - i29, bArr4, i31 * i27);
                    bArr3[i26] = (byte) (bArr3[i26] >>> this.f20463w);
                    i27++;
                    i28++;
                    i24 = i30;
                }
                i26++;
                i25 = i27;
            }
            int i32 = (i18 << this.f20463w) - i24;
            int i33 = i25;
            int i34 = 0;
            while (i34 < log) {
                int i35 = this.mdsize;
                hashSignatureBlock(bArr2, i33 * i35, i23 - (i32 & i23), bArr4, i33 * i35);
                int i36 = this.f20463w;
                i32 >>>= i36;
                i33++;
                i34 += i36;
            }
        } else {
            if (i19 >= 8) {
                if (i19 < 57) {
                    int i37 = (i20 << 3) - i19;
                    int i38 = (1 << i19) - 1;
                    byte[] bArr5 = new byte[i20];
                    int i39 = 0;
                    int i40 = 0;
                    int i41 = 0;
                    while (i39 <= i37) {
                        int i42 = i39 >>> 3;
                        int i43 = i39 % 8;
                        char c11 = c10;
                        i39 += this.f20463w;
                        int i44 = i15;
                        int i45 = i42;
                        long j10 = 0;
                        while (true) {
                            i13 = i37;
                            if (i45 >= ((i39 + 7) >>> 3)) {
                                break;
                            }
                            j10 ^= (bArr3[i45] & 255) << (i44 << 3);
                            i44++;
                            i45++;
                            i37 = i13;
                            bArr3 = bArr3;
                        }
                        byte[] bArr6 = bArr3;
                        long j11 = i38;
                        long j12 = (j10 >>> i43) & j11;
                        i40 = (int) (i40 + j12);
                        int i46 = this.mdsize;
                        System.arraycopy(bArr2, i41 * i46, bArr5, 0, i46);
                        while (j12 < j11) {
                            this.messDigestOTS.update(bArr5, 0, i20);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j12++;
                        }
                        int i47 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i41 * i47, i47);
                        i41++;
                        c10 = c11;
                        i37 = i13;
                        bArr3 = bArr6;
                        i15 = 0;
                    }
                    byte[] bArr7 = bArr3;
                    int i48 = i39 >>> 3;
                    if (i48 < this.mdsize) {
                        int i49 = i39 % 8;
                        int i50 = 0;
                        long j13 = 0;
                        while (true) {
                            i12 = this.mdsize;
                            if (i48 >= i12) {
                                break;
                            }
                            j13 ^= (bArr7[i48] & 255) << (i50 << 3);
                            i50++;
                            i48++;
                        }
                        i10 = i18;
                        long j14 = i38;
                        long j15 = (j13 >>> i49) & j14;
                        i40 = (int) (i40 + j15);
                        System.arraycopy(bArr2, i41 * i12, bArr5, 0, i12);
                        while (j15 < j14) {
                            this.messDigestOTS.update(bArr5, 0, i20);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j15++;
                        }
                        int i51 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i41 * i51, i51);
                        i41++;
                    } else {
                        i10 = i18;
                    }
                    int i52 = (i10 << this.f20463w) - i40;
                    int i53 = 0;
                    while (i53 < log) {
                        int i54 = this.mdsize;
                        System.arraycopy(bArr2, i41 * i54, bArr5, 0, i54);
                        int i55 = i41;
                        for (long j16 = i52 & i38; j16 < i38; j16++) {
                            this.messDigestOTS.update(bArr5, 0, i20);
                            this.messDigestOTS.doFinal(bArr5, 0);
                        }
                        int i56 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i55 * i56, i56);
                        int i57 = this.f20463w;
                        i52 >>>= i57;
                        i41 = i55 + 1;
                        i53 += i57;
                    }
                    i11 = 0;
                }
                this.messDigestOTS.update(bArr4, i11, i21);
                byte[] bArr8 = new byte[this.mdsize];
                this.messDigestOTS.doFinal(bArr8, i11);
                return bArr8;
            }
            int i58 = i20 / i19;
            int i59 = (1 << i19) - 1;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            while (i60 < i58) {
                int i64 = i61;
                boolean z11 = z10;
                long j17 = 0;
                for (int i65 = 0; i65 < this.f20463w; i65++) {
                    j17 ^= (bArr3[i64] & 255) << (i65 << 3);
                    i64++;
                }
                int i66 = 0;
                while (i66 < 8) {
                    int i67 = (int) (j17 & i59);
                    int i68 = i62 + i67;
                    int i69 = this.mdsize;
                    hashSignatureBlock(bArr2, i63 * i69, i59 - i67, bArr4, i69 * i63);
                    j17 >>>= this.f20463w;
                    i63++;
                    i66++;
                    i62 = i68;
                    i59 = i59;
                    i60 = i60;
                }
                i60++;
                z10 = z11;
                i61 = i64;
            }
            int i70 = i59;
            int i71 = this.mdsize % this.f20463w;
            long j18 = 0;
            for (int i72 = 0; i72 < i71; i72++) {
                j18 ^= (bArr3[i61] & 255) << (i72 << 3);
                i61++;
            }
            int i73 = i71 << 3;
            int i74 = 0;
            while (i74 < i73) {
                int i75 = (int) (j18 & i70);
                int i76 = i62 + i75;
                int i77 = this.mdsize;
                hashSignatureBlock(bArr2, i63 * i77, i70 - i75, bArr4, i63 * i77);
                int i78 = this.f20463w;
                j18 >>>= i78;
                i63++;
                i74 += i78;
                i62 = i76;
            }
            int i79 = (i18 << this.f20463w) - i62;
            int i80 = 0;
            while (i80 < log) {
                int i81 = this.mdsize;
                hashSignatureBlock(bArr2, i63 * i81, i70 - (i79 & i70), bArr4, i63 * i81);
                int i82 = this.f20463w;
                i79 >>>= i82;
                i63++;
                i80 += i82;
            }
        }
        i11 = 0;
        this.messDigestOTS.update(bArr4, i11, i21);
        byte[] bArr82 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr82, i11);
        return bArr82;
    }

    public int getLog(int i10) {
        int i11 = 1;
        int i12 = 2;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i10 = this.f20463w;
        int i11 = ((i10 - 1) + (digestSize << 3)) / i10;
        int log = getLog((i11 << i10) + 1);
        return ((((log + r2) - 1) / this.f20463w) + i11) * digestSize;
    }
}
