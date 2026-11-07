package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ex0 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f4413d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f4414e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final go1 f4415f = go1.m(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4416a;

    /* renamed from: b, reason: collision with root package name */
    public int f4417b;

    /* renamed from: c, reason: collision with root package name */
    public int f4418c;

    public ex0(int i6, byte[] bArr) {
        this.f4416a = bArr;
        this.f4418c = i6;
    }

    public final long A() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        long j6 = bArr[i6];
        int i8 = i6 + 2;
        this.f4417b = i8;
        long j7 = bArr[i7];
        int i9 = i6 + 3;
        this.f4417b = i9;
        long j8 = bArr[i8];
        int i10 = i6 + 4;
        this.f4417b = i10;
        long j9 = bArr[i9];
        int i11 = i6 + 5;
        this.f4417b = i11;
        long j10 = bArr[i10];
        int i12 = i6 + 6;
        this.f4417b = i12;
        long j11 = bArr[i11];
        this.f4417b = i6 + 7;
        long j12 = bArr[i12];
        this.f4417b = i6 + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j6) | ((j7 & 255) << 8) | ((j8 & 255) << 16) | ((j9 & 255) << 24) | ((j10 & 255) << 32) | ((j11 & 255) << 40) | ((j12 & 255) << 48);
    }

    public final long B() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        long j6 = bArr[i6];
        int i8 = i6 + 2;
        this.f4417b = i8;
        long j7 = bArr[i7];
        this.f4417b = i6 + 3;
        long j8 = bArr[i8];
        this.f4417b = i6 + 4;
        return ((bArr[r2] & 255) << 24) | (j6 & 255) | ((j7 & 255) << 8) | ((j8 & 255) << 16);
    }

    public final long C() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        long j6 = bArr[i6];
        int i8 = i6 + 2;
        this.f4417b = i8;
        long j7 = bArr[i7];
        int i9 = i6 + 3;
        this.f4417b = i9;
        long j8 = bArr[i8];
        int i10 = i6 + 4;
        this.f4417b = i10;
        long j9 = bArr[i9];
        int i11 = i6 + 5;
        this.f4417b = i11;
        long j10 = bArr[i10];
        int i12 = i6 + 6;
        this.f4417b = i12;
        long j11 = bArr[i11];
        this.f4417b = i6 + 7;
        long j12 = bArr[i12];
        this.f4417b = i6 + 8;
        return (bArr[r3] & 255) | ((j6 & 255) << 56) | ((j7 & 255) << 48) | ((j8 & 255) << 40) | ((j9 & 255) << 32) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long D() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        long j6 = bArr[i6];
        int i8 = i6 + 2;
        this.f4417b = i8;
        long j7 = bArr[i7];
        this.f4417b = i6 + 3;
        long j8 = bArr[i8];
        this.f4417b = i6 + 4;
        return (bArr[r2] & 255) | ((j6 & 255) << 24) | ((j7 & 255) << 16) | ((j8 & 255) << 8);
    }

    public final long E() {
        long jC = C();
        if (jC >= 0) {
            return jC;
        }
        throw new IllegalStateException("Top bit not zero: " + jC);
    }

    public final long F() {
        int i6;
        int i7;
        long j6 = this.f4416a[this.f4417b];
        int i8 = 7;
        while (true) {
            i6 = 0;
            if (i8 < 0) {
                break;
            }
            if (((1 << i8) & j6) != 0) {
                i8--;
            } else if (i8 < 6) {
                j6 &= r7 - 1;
                i6 = 7 - i8;
            } else if (i8 == 7) {
                i6 = 1;
            }
        }
        if (i6 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j6);
        }
        for (i7 = 1; i7 < i6; i7++) {
            if ((this.f4416a[this.f4417b + i7] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j6);
            }
            j6 = (j6 << 6) | (r2 & 63);
        }
        this.f4417b += i6;
        return j6;
    }

    public final String G() {
        int i6 = this.f4418c;
        int i7 = this.f4417b;
        if (i6 - i7 == 0) {
            return null;
        }
        while (i7 < this.f4418c && this.f4416a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.f4416a;
        int i8 = this.f4417b;
        int i9 = j31.f5914a;
        String str = new String(bArr, i8, i7 - i8, StandardCharsets.UTF_8);
        this.f4417b = i7;
        if (i7 < this.f4418c) {
            this.f4417b = i7 + 1;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H(Charset charset) {
        y5.p("Unsupported charset: ".concat(String.valueOf(charset)), f4415f.contains(charset));
        if (this.f4418c - this.f4417b == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            c();
        }
        int i6 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i6 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i7 = this.f4417b;
        while (true) {
            int i8 = this.f4418c;
            if (i7 >= i8 - (i6 - 1)) {
                i7 = i8;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b7 = this.f4416a[i7];
                int i9 = j31.f5914a;
                if (b7 == 10 || b7 == 13) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f4416a;
                    if (bArr[i7] == 0) {
                        byte b8 = bArr[i7 + 1];
                        int i10 = j31.f5914a;
                        if (b8 == 10 || b8 == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            byte[] bArr2 = this.f4416a;
                            if (bArr2[i7 + 1] == 0) {
                                byte b9 = bArr2[i7];
                                int i11 = j31.f5914a;
                                if (b9 == 10 || b9 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i7 += i6;
                    }
                }
            }
        }
        String strB = b(i7 - this.f4417b, charset);
        if (this.f4417b != this.f4418c && m(charset, f4413d) == '\r') {
            m(charset, f4414e);
        }
        return strB;
    }

    public final String a(int i6) {
        if (i6 == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int i7 = this.f4417b;
        int i8 = (i7 + i6) - 1;
        int i9 = (i8 >= this.f4418c || this.f4416a[i8] != 0) ? i6 : i6 - 1;
        byte[] bArr = this.f4416a;
        int i10 = j31.f5914a;
        String str = new String(bArr, i7, i9, StandardCharsets.UTF_8);
        this.f4417b += i6;
        return str;
    }

    public final String b(int i6, Charset charset) {
        byte[] bArr = this.f4416a;
        int i7 = this.f4417b;
        String str = new String(bArr, i7, i6, charset);
        this.f4417b = i7 + i6;
        return str;
    }

    public final Charset c() {
        int i6 = this.f4418c;
        int i7 = this.f4417b;
        int i8 = i6 - i7;
        if (i8 >= 3) {
            byte[] bArr = this.f4416a;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f4417b = i7 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i8 < 2) {
            return null;
        }
        byte[] bArr2 = this.f4416a;
        byte b7 = bArr2[i7];
        if (b7 == -2) {
            if (bArr2[i7 + 1] != -1) {
                return null;
            }
            this.f4417b = i7 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b7 != -1 || bArr2[i7 + 1] != -2) {
            return null;
        }
        this.f4417b = i7 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short d() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        int i8 = bArr[i6] & 255;
        this.f4417b = i6 + 2;
        return (short) ((bArr[i7] & 255) | (i8 << 8));
    }

    public final void e(int i6) {
        byte[] bArr = this.f4416a;
        if (i6 > bArr.length) {
            this.f4416a = Arrays.copyOf(bArr, i6);
        }
    }

    public final void f(int i6, int i7, byte[] bArr) {
        System.arraycopy(this.f4416a, this.f4417b, bArr, i6, i7);
        this.f4417b += i7;
    }

    public final void g(int i6) {
        byte[] bArr = this.f4416a;
        if (bArr.length < i6) {
            bArr = new byte[i6];
        }
        h(i6, bArr);
    }

    public final void h(int i6, byte[] bArr) {
        this.f4416a = bArr;
        this.f4418c = i6;
        this.f4417b = 0;
    }

    public final void i(int i6) {
        boolean z6 = false;
        if (i6 >= 0 && i6 <= this.f4416a.length) {
            z6 = true;
        }
        y5.n(z6);
        this.f4418c = i6;
    }

    public final void j(int i6) {
        boolean z6 = false;
        if (i6 >= 0 && i6 <= this.f4418c) {
            z6 = true;
        }
        y5.n(z6);
        this.f4417b = i6;
    }

    public final void k(int i6) {
        j(this.f4417b + i6);
    }

    public final byte[] l() {
        return this.f4416a;
    }

    public final char m(Charset charset, char[] cArr) {
        int iN = n(charset);
        if (iN != 0) {
            int i6 = iN >> 16;
            for (char c7 : cArr) {
                char c8 = (char) i6;
                if (c7 == c8) {
                    this.f4417b += (char) iN;
                    return c8;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(Charset charset) {
        byte b7;
        int i6;
        byte b8;
        int i7;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            int i8 = this.f4418c;
            int i9 = this.f4417b;
            if (i8 - i9 > 0) {
                long j6 = this.f4416a[i9] & 255;
                char c7 = (char) j6;
                sl1.f(((long) c7) == j6, "Out of range: %s", j6);
                b7 = (byte) c7;
                i6 = 1;
            } else {
                i6 = 2;
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    int i10 = this.f4418c;
                    int i11 = this.f4417b;
                    if (i10 - i11 < 2) {
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            int i12 = this.f4418c;
                            int i13 = this.f4417b;
                            if (i12 - i13 >= 2) {
                                byte[] bArr = this.f4416a;
                                byte b9 = bArr[i13 + 1];
                                b8 = bArr[i13];
                                i7 = b9 << 8;
                            }
                        }
                        return 0;
                    }
                    byte[] bArr2 = this.f4416a;
                    byte b10 = bArr2[i11];
                    b8 = bArr2[i11 + 1];
                    i7 = b10 << 8;
                    b7 = (byte) ((char) ((b8 & 255) | i7));
                }
            }
        }
        long j7 = b7;
        char c8 = (char) j7;
        sl1.f(((long) c8) == j7, "Out of range: %s", j7);
        return (c8 << 16) + i6;
    }

    public final int o() {
        return this.f4418c - this.f4417b;
    }

    public final int p() {
        return this.f4417b;
    }

    public final int q() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        int i8 = bArr[i6] & 255;
        int i9 = i6 + 2;
        this.f4417b = i9;
        int i10 = bArr[i7] & 255;
        int i11 = i6 + 3;
        this.f4417b = i11;
        int i12 = bArr[i9] & 255;
        this.f4417b = i6 + 4;
        return (bArr[i11] & 255) | (i8 << 24) | (i10 << 16) | (i12 << 8);
    }

    public final int r() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        int i8 = bArr[i6] & 255;
        int i9 = i6 + 2;
        this.f4417b = i9;
        int i10 = bArr[i7] & 255;
        int i11 = i6 + 3;
        this.f4417b = i11;
        int i12 = bArr[i9] & 255;
        this.f4417b = i6 + 4;
        return ((bArr[i11] & 255) << 24) | (i10 << 8) | i8 | (i12 << 16);
    }

    public final int s() {
        int iR = r();
        if (iR >= 0) {
            return iR;
        }
        throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(iR, "Top bit not zero: "));
    }

    public final int t() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        int i8 = bArr[i6] & 255;
        this.f4417b = i6 + 2;
        return ((bArr[i7] & 255) << 8) | i8;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        this.f4417b = i6 + 1;
        return bArr[i6] & 255;
    }

    public final int w() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        int i8 = bArr[i6] & 255;
        this.f4417b = i6 + 2;
        int i9 = bArr[i7] & 255;
        this.f4417b = i6 + 4;
        return i9 | (i8 << 8);
    }

    public final int x() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        int i8 = bArr[i6] & 255;
        int i9 = i6 + 2;
        this.f4417b = i9;
        int i10 = bArr[i7] & 255;
        this.f4417b = i6 + 3;
        return (bArr[i9] & 255) | (i8 << 16) | (i10 << 8);
    }

    public final int y() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException(androidx.camera.camera2.internal.compat.workaround.c.d(iQ, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f4416a;
        int i6 = this.f4417b;
        int i7 = i6 + 1;
        this.f4417b = i7;
        int i8 = bArr[i6] & 255;
        this.f4417b = i6 + 2;
        return (bArr[i7] & 255) | (i8 << 8);
    }

    public ex0() {
        this.f4416a = j31.f5919f;
    }

    public ex0(int i6) {
        this.f4416a = new byte[i6];
        this.f4418c = i6;
    }

    public ex0(byte[] bArr) {
        this.f4416a = bArr;
        this.f4418c = bArr.length;
    }
}
