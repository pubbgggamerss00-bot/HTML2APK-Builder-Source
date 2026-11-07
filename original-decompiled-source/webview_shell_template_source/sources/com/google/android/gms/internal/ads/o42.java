package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o42 extends p42 {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f7596w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7597x;

    /* renamed from: y, reason: collision with root package name */
    public int f7598y;

    /* renamed from: z, reason: collision with root package name */
    public final ByteArrayOutputStream f7599z;

    public o42(ByteArrayOutputStream byteArrayOutputStream, int i6) {
        super(10);
        if (i6 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i6, 20);
        this.f7596w = new byte[iMax];
        this.f7597x = iMax;
        this.f7599z = byteArrayOutputStream;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void A(long j6) throws IOException {
        N(8);
        P(j6);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void B(int i6, int i7) throws IOException {
        N(20);
        Q(i6 << 3);
        if (i7 >= 0) {
            Q(i7);
        } else {
            R(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void C(int i6) throws IOException {
        if (i6 >= 0) {
            J(i6);
        } else {
            L(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void D(int i6, m62 m62Var, b72 b72Var) throws IOException {
        J((i6 << 3) | 2);
        J(((t32) m62Var).f(b72Var));
        b72Var.e(m62Var, this.f7935t);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void E(int i6, m62 m62Var) throws IOException {
        J(11);
        I(2, i6);
        J(26);
        J(m62Var.c());
        m62Var.d(this);
        J(12);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void F(int i6, g42 g42Var) throws IOException {
        J(11);
        I(2, i6);
        w(3, g42Var);
        J(12);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void G(int i6, String str) throws IOException {
        J((i6 << 3) | 2);
        try {
            int length = str.length() * 3;
            int iR = p42.r(length);
            int i7 = iR + length;
            int i8 = this.f7597x;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int iB = v72.b(str, bArr, 0, length);
                J(iB);
                S(0, iB, bArr);
                return;
            }
            if (i7 > i8 - this.f7598y) {
                M();
            }
            int iR2 = p42.r(str.length());
            int i9 = this.f7598y;
            byte[] bArr2 = this.f7596w;
            try {
                if (iR2 == iR) {
                    int i10 = i9 + iR2;
                    this.f7598y = i10;
                    int iB2 = v72.b(str, bArr2, i10, i8 - i10);
                    this.f7598y = i9;
                    Q((iB2 - i9) - iR2);
                    this.f7598y = iB2;
                } else {
                    int iC = v72.c(str);
                    Q(iC);
                    this.f7598y = v72.b(str, bArr2, this.f7598y, iC);
                }
            } catch (u72 e6) {
                this.f7598y = i9;
                throw e6;
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new n42(e7);
            }
        } catch (u72 e8) {
            t(str, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void H(int i6, int i7) throws IOException {
        J((i6 << 3) | i7);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void I(int i6, int i7) throws IOException {
        N(20);
        Q(i6 << 3);
        Q(i7);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void J(int i6) throws IOException {
        N(5);
        Q(i6);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void K(int i6, long j6) throws IOException {
        N(20);
        Q(i6 << 3);
        R(j6);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void L(long j6) throws IOException {
        N(10);
        R(j6);
    }

    public final void M() throws IOException {
        this.f7599z.write(this.f7596w, 0, this.f7598y);
        this.f7598y = 0;
    }

    public final void N(int i6) throws IOException {
        if (this.f7597x - this.f7598y < i6) {
            M();
        }
    }

    public final void O(int i6) {
        int i7 = this.f7598y;
        byte[] bArr = this.f7596w;
        bArr[i7] = (byte) i6;
        bArr[i7 + 1] = (byte) (i6 >> 8);
        bArr[i7 + 2] = (byte) (i6 >> 16);
        bArr[i7 + 3] = (byte) (i6 >> 24);
        this.f7598y = i7 + 4;
    }

    public final void P(long j6) {
        int i6 = this.f7598y;
        byte[] bArr = this.f7596w;
        bArr[i6] = (byte) j6;
        bArr[i6 + 1] = (byte) (j6 >> 8);
        bArr[i6 + 2] = (byte) (j6 >> 16);
        bArr[i6 + 3] = (byte) (j6 >> 24);
        bArr[i6 + 4] = (byte) (j6 >> 32);
        bArr[i6 + 5] = (byte) (j6 >> 40);
        bArr[i6 + 6] = (byte) (j6 >> 48);
        bArr[i6 + 7] = (byte) (j6 >> 56);
        this.f7598y = i6 + 8;
    }

    public final void Q(int i6) {
        boolean z6 = p42.f7934v;
        byte[] bArr = this.f7596w;
        if (z6) {
            while ((i6 & (-128)) != 0) {
                int i7 = this.f7598y;
                this.f7598y = i7 + 1;
                r72.l(bArr, i7, (byte) (i6 | 128));
                i6 >>>= 7;
            }
            int i8 = this.f7598y;
            this.f7598y = i8 + 1;
            r72.l(bArr, i8, (byte) i6);
            return;
        }
        while ((i6 & (-128)) != 0) {
            int i9 = this.f7598y;
            this.f7598y = i9 + 1;
            bArr[i9] = (byte) (i6 | 128);
            i6 >>>= 7;
        }
        int i10 = this.f7598y;
        this.f7598y = i10 + 1;
        bArr[i10] = (byte) i6;
    }

    public final void R(long j6) {
        boolean z6 = p42.f7934v;
        byte[] bArr = this.f7596w;
        if (z6) {
            while (true) {
                int i6 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i7 = this.f7598y;
                    this.f7598y = i7 + 1;
                    r72.l(bArr, i7, (byte) i6);
                    return;
                } else {
                    int i8 = this.f7598y;
                    this.f7598y = i8 + 1;
                    r72.l(bArr, i8, (byte) (i6 | 128));
                    j6 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i9 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i10 = this.f7598y;
                    this.f7598y = i10 + 1;
                    bArr[i10] = (byte) i9;
                    return;
                } else {
                    int i11 = this.f7598y;
                    this.f7598y = i11 + 1;
                    bArr[i11] = (byte) (i9 | 128);
                    j6 >>>= 7;
                }
            }
        }
    }

    public final void S(int i6, int i7, byte[] bArr) throws IOException {
        int i8 = this.f7598y;
        int i9 = this.f7597x;
        int i10 = i9 - i8;
        byte[] bArr2 = this.f7596w;
        if (i10 >= i7) {
            System.arraycopy(bArr, i6, bArr2, i8, i7);
            this.f7598y += i7;
            return;
        }
        System.arraycopy(bArr, i6, bArr2, i8, i10);
        int i11 = i6 + i10;
        this.f7598y = i9;
        M();
        int i12 = i7 - i10;
        if (i12 > i9) {
            this.f7599z.write(bArr, i11, i12);
        } else {
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            this.f7598y = i12;
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void e(int i6, int i7, byte[] bArr) throws IOException {
        S(i6, i7, bArr);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void u(byte b7) throws IOException {
        if (this.f7598y == this.f7597x) {
            M();
        }
        int i6 = this.f7598y;
        this.f7596w[i6] = b7;
        this.f7598y = i6 + 1;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void v(int i6, boolean z6) throws IOException {
        N(11);
        Q(i6 << 3);
        int i7 = this.f7598y;
        this.f7596w[i7] = z6 ? (byte) 1 : (byte) 0;
        this.f7598y = i7 + 1;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void w(int i6, g42 g42Var) throws IOException {
        J((i6 << 3) | 2);
        J(g42Var.g());
        g42Var.o(this);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void x(int i6, int i7) throws IOException {
        N(14);
        Q((i6 << 3) | 5);
        O(i7);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void y(int i6) throws IOException {
        N(4);
        O(i6);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void z(int i6, long j6) throws IOException {
        N(18);
        Q((i6 << 3) | 1);
        P(j6);
    }
}
