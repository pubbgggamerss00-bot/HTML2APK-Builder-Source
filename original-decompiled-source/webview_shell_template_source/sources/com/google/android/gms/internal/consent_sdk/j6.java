package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j6 extends k6 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11788d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11789e;

    /* renamed from: f, reason: collision with root package name */
    public int f11790f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f11791g;

    public j6(OutputStream outputStream, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i6, 20);
        this.f11788d = new byte[iMax];
        this.f11789e = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f11791g = outputStream;
    }

    public final void A(long j6) {
        int i6 = this.f11790f;
        byte[] bArr = this.f11788d;
        bArr[i6] = (byte) j6;
        bArr[i6 + 1] = (byte) (j6 >> 8);
        bArr[i6 + 2] = (byte) (j6 >> 16);
        bArr[i6 + 3] = (byte) (j6 >> 24);
        bArr[i6 + 4] = (byte) (j6 >> 32);
        bArr[i6 + 5] = (byte) (j6 >> 40);
        bArr[i6 + 6] = (byte) (j6 >> 48);
        bArr[i6 + 7] = (byte) (j6 >> 56);
        this.f11790f = i6 + 8;
    }

    public final void B(int i6) {
        boolean z6 = k6.f11799c;
        byte[] bArr = this.f11788d;
        if (z6) {
            while ((i6 & (-128)) != 0) {
                int i7 = this.f11790f;
                this.f11790f = i7 + 1;
                s8.j(bArr, i7, (byte) (i6 | 128));
                i6 >>>= 7;
            }
            int i8 = this.f11790f;
            this.f11790f = i8 + 1;
            s8.j(bArr, i8, (byte) i6);
            return;
        }
        while ((i6 & (-128)) != 0) {
            int i9 = this.f11790f;
            this.f11790f = i9 + 1;
            bArr[i9] = (byte) (i6 | 128);
            i6 >>>= 7;
        }
        int i10 = this.f11790f;
        this.f11790f = i10 + 1;
        bArr[i10] = (byte) i6;
    }

    public final void C(long j6) {
        boolean z6 = k6.f11799c;
        byte[] bArr = this.f11788d;
        if (z6) {
            while (true) {
                int i6 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i7 = this.f11790f;
                    this.f11790f = i7 + 1;
                    s8.j(bArr, i7, (byte) i6);
                    return;
                } else {
                    int i8 = this.f11790f;
                    this.f11790f = i8 + 1;
                    s8.j(bArr, i8, (byte) (i6 | 128));
                    j6 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i9 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i10 = this.f11790f;
                    this.f11790f = i10 + 1;
                    bArr[i10] = (byte) i9;
                    return;
                } else {
                    int i11 = this.f11790f;
                    this.f11790f = i11 + 1;
                    bArr[i11] = (byte) (i9 | 128);
                    j6 >>>= 7;
                }
            }
        }
    }

    public final void D(int i6, byte[] bArr) throws IOException {
        int i7 = this.f11790f;
        int i8 = this.f11789e;
        int i9 = i8 - i7;
        byte[] bArr2 = this.f11788d;
        if (i9 >= i6) {
            System.arraycopy(bArr, 0, bArr2, i7, i6);
            this.f11790f += i6;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i7, i9);
        this.f11790f = i8;
        x();
        int i10 = i6 - i9;
        if (i10 > i8) {
            this.f11791g.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f11790f = i10;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.c6
    public final void a(int i6, byte[] bArr) throws IOException {
        D(i6, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void e(byte b7) throws IOException {
        if (this.f11790f == this.f11789e) {
            x();
        }
        int i6 = this.f11790f;
        this.f11788d[i6] = b7;
        this.f11790f = i6 + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void f(int i6, boolean z6) throws IOException {
        y(11);
        B(i6 << 3);
        int i7 = this.f11790f;
        this.f11788d[i7] = z6 ? (byte) 1 : (byte) 0;
        this.f11790f = i7 + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void g(int i6, byte[] bArr) throws IOException {
        u(i6);
        D(i6, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void h(int i6, h6 h6Var) throws IOException {
        u((i6 << 3) | 2);
        i(h6Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void i(h6 h6Var) throws IOException {
        u(h6Var.e());
        h6Var.h(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void j(int i6, int i7) throws IOException {
        y(14);
        B((i6 << 3) | 5);
        z(i7);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void k(int i6) throws IOException {
        y(4);
        z(i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void l(int i6, long j6) throws IOException {
        y(18);
        B((i6 << 3) | 1);
        A(j6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void m(long j6) throws IOException {
        y(8);
        A(j6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void n(int i6, int i7) throws IOException {
        y(20);
        B(i6 << 3);
        if (i7 >= 0) {
            B(i7);
        } else {
            C(i7);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void o(int i6) throws IOException {
        if (i6 >= 0) {
            u(i6);
        } else {
            w(i6);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void p(v7 v7Var) throws IOException {
        u(v7Var.zzn());
        v7Var.a(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void q(int i6, String str) throws IOException {
        u((i6 << 3) | 2);
        r(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void r(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iC = k6.c(length);
            int i6 = iC + length;
            int i7 = this.f11789e;
            if (i6 > i7) {
                byte[] bArr = new byte[length];
                int iA = u8.a(str, bArr, 0, length);
                u(iA);
                D(iA, bArr);
                return;
            }
            if (i6 > i7 - this.f11790f) {
                x();
            }
            int iC2 = k6.c(str.length());
            int i8 = this.f11790f;
            byte[] bArr2 = this.f11788d;
            try {
                if (iC2 == iC) {
                    int i9 = i8 + iC2;
                    this.f11790f = i9;
                    int iA2 = u8.a(str, bArr2, i9, i7 - i9);
                    this.f11790f = i8;
                    B((iA2 - i8) - iC2);
                    this.f11790f = iA2;
                } else {
                    int iB = u8.b(str);
                    B(iB);
                    this.f11790f = u8.a(str, bArr2, this.f11790f, iB);
                }
            } catch (t8 e6) {
                this.f11790f = i8;
                throw e6;
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new i6(e7);
            }
        } catch (t8 e8) {
            k6.f11798b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e8);
            byte[] bytes = str.getBytes(e7.f11716a);
            try {
                int length2 = bytes.length;
                u(length2);
                a(length2, bytes);
            } catch (IndexOutOfBoundsException e9) {
                throw new i6(e9);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void s(int i6, int i7) throws IOException {
        u((i6 << 3) | i7);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void t(int i6, int i7) throws IOException {
        y(20);
        B(i6 << 3);
        B(i7);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void u(int i6) throws IOException {
        y(5);
        B(i6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void v(int i6, long j6) throws IOException {
        y(20);
        B(i6 << 3);
        C(j6);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public final void w(long j6) throws IOException {
        y(10);
        C(j6);
    }

    public final void x() throws IOException {
        this.f11791g.write(this.f11788d, 0, this.f11790f);
        this.f11790f = 0;
    }

    public final void y(int i6) throws IOException {
        if (this.f11789e - this.f11790f < i6) {
            x();
        }
    }

    public final void z(int i6) {
        int i7 = this.f11790f;
        byte[] bArr = this.f11788d;
        bArr[i7] = (byte) i6;
        bArr[i7 + 1] = (byte) (i6 >> 8);
        bArr[i7 + 2] = (byte) (i6 >> 16);
        bArr[i7 + 3] = (byte) (i6 >> 24);
        this.f11790f = i7 + 4;
    }
}
