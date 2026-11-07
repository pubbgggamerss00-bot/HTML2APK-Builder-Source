package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m42 extends p42 {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f6934w;

    /* renamed from: x, reason: collision with root package name */
    public final int f6935x;

    /* renamed from: y, reason: collision with root package name */
    public int f6936y;

    public m42(int i6, byte[] bArr) {
        super(10);
        int length = bArr.length;
        if (((length - i6) | i6) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(androidx.camera.view.g.e("Array range is invalid. Buffer.length=", length, i6, ", offset=0, length="));
        }
        this.f6934w = bArr;
        this.f6936y = 0;
        this.f6935x = i6;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void A(long j6) throws n42 {
        int i6 = this.f6936y;
        try {
            byte[] bArr = this.f6934w;
            bArr[i6] = (byte) j6;
            bArr[i6 + 1] = (byte) (j6 >> 8);
            bArr[i6 + 2] = (byte) (j6 >> 16);
            bArr[i6 + 3] = (byte) (j6 >> 24);
            bArr[i6 + 4] = (byte) (j6 >> 32);
            bArr[i6 + 5] = (byte) (j6 >> 40);
            bArr[i6 + 6] = (byte) (j6 >> 48);
            bArr[i6 + 7] = (byte) (j6 >> 56);
            this.f6936y = i6 + 8;
        } catch (IndexOutOfBoundsException e6) {
            throw new n42(i6, this.f6935x, 8, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void B(int i6, int i7) throws n42 {
        J(i6 << 3);
        C(i7);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void C(int i6) throws n42 {
        if (i6 >= 0) {
            J(i6);
        } else {
            L(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void D(int i6, m62 m62Var, b72 b72Var) throws n42 {
        J((i6 << 3) | 2);
        J(((t32) m62Var).f(b72Var));
        b72Var.e(m62Var, this.f7935t);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void E(int i6, m62 m62Var) throws n42 {
        J(11);
        I(2, i6);
        J(26);
        J(m62Var.c());
        m62Var.d(this);
        J(12);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void F(int i6, g42 g42Var) throws n42 {
        J(11);
        I(2, i6);
        w(3, g42Var);
        J(12);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void G(int i6, String str) throws n42 {
        J((i6 << 3) | 2);
        int i7 = this.f6936y;
        try {
            int iR = p42.r(str.length() * 3);
            int iR2 = p42.r(str.length());
            int i8 = this.f6935x;
            byte[] bArr = this.f6934w;
            if (iR2 != iR) {
                J(v72.c(str));
                int i9 = this.f6936y;
                this.f6936y = v72.b(str, bArr, i9, i8 - i9);
            } else {
                int i10 = i7 + iR2;
                this.f6936y = i10;
                int iB = v72.b(str, bArr, i10, i8 - i10);
                this.f6936y = i7;
                J((iB - i7) - iR2);
                this.f6936y = iB;
            }
        } catch (u72 e6) {
            this.f6936y = i7;
            t(str, e6);
        } catch (IndexOutOfBoundsException e7) {
            throw new n42(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void H(int i6, int i7) throws n42 {
        J((i6 << 3) | i7);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void I(int i6, int i7) throws n42 {
        J(i6 << 3);
        J(i7);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void J(int i6) throws n42 {
        int i7;
        int i8 = this.f6936y;
        while (true) {
            int i9 = i6 & (-128);
            byte[] bArr = this.f6934w;
            if (i9 == 0) {
                i7 = i8 + 1;
                bArr[i8] = (byte) i6;
                this.f6936y = i7;
                return;
            } else {
                i7 = i8 + 1;
                try {
                    bArr[i8] = (byte) (i6 | 128);
                    i6 >>>= 7;
                    i8 = i7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new n42(i7, this.f6935x, 1, e6);
                }
            }
            throw new n42(i7, this.f6935x, 1, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void K(int i6, long j6) throws n42 {
        J(i6 << 3);
        L(j6);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void L(long j6) throws n42 {
        int i6;
        int i7 = this.f6936y;
        boolean z6 = p42.f7934v;
        int i8 = this.f6935x;
        byte[] bArr = this.f6934w;
        if (!z6 || i8 - i7 < 10) {
            long j7 = j6;
            while ((j7 & (-128)) != 0) {
                i6 = i7 + 1;
                try {
                    bArr[i7] = (byte) (((int) j7) | 128);
                    j7 >>>= 7;
                    i7 = i6;
                } catch (IndexOutOfBoundsException e6) {
                    throw new n42(i6, i8, 1, e6);
                }
            }
            i6 = i7 + 1;
            bArr[i7] = (byte) j7;
        } else {
            long j8 = j6;
            while ((j8 & (-128)) != 0) {
                r72.l(bArr, i7, (byte) (((int) j8) | 128));
                j8 >>>= 7;
                i7++;
            }
            i6 = i7 + 1;
            r72.l(bArr, i7, (byte) j8);
        }
        this.f6936y = i6;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void e(int i6, int i7, byte[] bArr) throws n42 {
        try {
            System.arraycopy(bArr, i6, this.f6934w, this.f6936y, i7);
            this.f6936y += i7;
        } catch (IndexOutOfBoundsException e6) {
            throw new n42(this.f6936y, this.f6935x, i7, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void u(byte b7) throws n42 {
        int i6 = this.f6936y;
        try {
            int i7 = i6 + 1;
            try {
                this.f6934w[i6] = b7;
                this.f6936y = i7;
            } catch (IndexOutOfBoundsException e6) {
                e = e6;
                i6 = i7;
                throw new n42(i6, this.f6935x, 1, e);
            }
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void v(int i6, boolean z6) throws n42 {
        J(i6 << 3);
        u(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void w(int i6, g42 g42Var) throws n42 {
        J((i6 << 3) | 2);
        J(g42Var.g());
        g42Var.o(this);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void x(int i6, int i7) throws n42 {
        J((i6 << 3) | 5);
        y(i7);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void y(int i6) throws n42 {
        int i7 = this.f6936y;
        try {
            byte[] bArr = this.f6934w;
            bArr[i7] = (byte) i6;
            bArr[i7 + 1] = (byte) (i6 >> 8);
            bArr[i7 + 2] = (byte) (i6 >> 16);
            bArr[i7 + 3] = (byte) (i6 >> 24);
            this.f6936y = i7 + 4;
        } catch (IndexOutOfBoundsException e6) {
            throw new n42(i7, this.f6935x, 4, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void z(int i6, long j6) throws n42 {
        J((i6 << 3) | 1);
        A(j6);
    }
}
