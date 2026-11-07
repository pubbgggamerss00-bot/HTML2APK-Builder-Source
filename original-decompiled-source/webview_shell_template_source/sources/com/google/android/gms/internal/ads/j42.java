package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j42 extends k42 {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f5936c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5937d;

    /* renamed from: e, reason: collision with root package name */
    public int f5938e;

    /* renamed from: f, reason: collision with root package name */
    public int f5939f;

    /* renamed from: g, reason: collision with root package name */
    public int f5940g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f5941i;

    /* renamed from: j, reason: collision with root package name */
    public int f5942j = Integer.MAX_VALUE;

    public /* synthetic */ j42(InputStream inputStream) {
        Charset charset = s52.f8801a;
        this.f5936c = inputStream;
        this.f5937d = new byte[4096];
        this.f5938e = 0;
        this.f5940g = 0;
        this.f5941i = 0;
    }

    public final void A(int i6) throws u52 {
        InputStream inputStream = this.f5936c;
        int i7 = this.f5938e;
        int i8 = this.f5940g;
        int i9 = i7 - i8;
        if (i6 <= i9 && i6 >= 0) {
            this.f5940g = i8 + i6;
            return;
        }
        if (i6 < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.f5941i;
        int i11 = i10 + i8;
        int i12 = this.f5942j;
        if (i11 + i6 > i12) {
            A((i12 - i10) - i8);
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f5941i = i11;
        this.f5938e = 0;
        this.f5940g = 0;
        while (i9 < i6) {
            long j6 = i6 - i9;
            try {
                try {
                    long jSkip = inputStream.skip(j6);
                    if (jSkip < 0 || jSkip > j6) {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i9 += (int) jSkip;
                    }
                } catch (u52 e6) {
                    e6.s = true;
                    throw e6;
                }
            } catch (Throwable th) {
                this.f5941i += i9;
                C();
                throw th;
            }
        }
        this.f5941i += i9;
        C();
        if (i9 >= i6) {
            return;
        }
        int i13 = this.f5938e;
        int i14 = i13 - this.f5940g;
        this.f5940g = i13;
        D(1);
        while (true) {
            int i15 = i6 - i14;
            int i16 = this.f5938e;
            if (i15 <= i16) {
                this.f5940g = i15;
                return;
            } else {
                i14 += i16;
                this.f5940g = i16;
                D(1);
            }
        }
    }

    public final ArrayList B(int i6) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i6 > 0) {
            int iMin = Math.min(i6, 4096);
            byte[] bArr = new byte[iMin];
            int i7 = 0;
            while (i7 < iMin) {
                int i8 = this.f5936c.read(bArr, i7, iMin - i7);
                if (i8 == -1) {
                    throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f5941i += i8;
                i7 += i8;
            }
            i6 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void C() {
        int i6 = this.f5938e + this.f5939f;
        this.f5938e = i6;
        int i7 = this.f5941i + i6;
        int i8 = this.f5942j;
        if (i7 <= i8) {
            this.f5939f = 0;
            return;
        }
        int i9 = i7 - i8;
        this.f5939f = i9;
        this.f5938e = i6 - i9;
    }

    public final void D(int i6) throws u52 {
        if (E(i6)) {
            return;
        }
        if (i6 <= (Integer.MAX_VALUE - this.f5941i) - this.f5940g) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new u52("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i6) throws IOException {
        InputStream inputStream = this.f5936c;
        int i7 = this.f5940g;
        int i8 = i7 + i6;
        int i9 = this.f5938e;
        if (i8 <= i9) {
            throw new IllegalStateException(androidx.camera.camera2.internal.s0.a(i6, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i10 = this.f5941i;
        if (i6 > (Integer.MAX_VALUE - i10) - i7 || i10 + i7 + i6 > this.f5942j) {
            return false;
        }
        byte[] bArr = this.f5937d;
        if (i7 > 0) {
            if (i9 > i7) {
                System.arraycopy(bArr, i7, bArr, 0, i9 - i7);
            }
            i10 = this.f5941i + i7;
            this.f5941i = i10;
            i9 = this.f5938e - i7;
            this.f5938e = i9;
            this.f5940g = 0;
        }
        try {
            int i11 = inputStream.read(bArr, i9, Math.min(4096 - i9, (Integer.MAX_VALUE - i10) - i9));
            if (i11 == 0 || i11 < -1 || i11 > 4096) {
                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + i11 + "\nThe InputStream implementation is buggy.");
            }
            if (i11 <= 0) {
                return false;
            }
            this.f5938e += i11;
            C();
            if (this.f5938e >= i6) {
                return true;
            }
            return E(i6);
        } catch (u52 e6) {
            e6.s = true;
            throw e6;
        }
    }

    public final byte[] F(int i6) throws IOException {
        byte[] bArrG = G(i6);
        if (bArrG != null) {
            return bArrG;
        }
        int i7 = this.f5940g;
        int i8 = this.f5938e;
        int i9 = i8 - i7;
        this.f5941i += i8;
        this.f5940g = 0;
        this.f5938e = 0;
        ArrayList arrayListB = B(i6 - i9);
        byte[] bArr = new byte[i6];
        System.arraycopy(this.f5937d, i7, bArr, 0, i9);
        int size = arrayListB.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListB.get(i10);
            i10++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i9, length);
            i9 += length;
        }
        return bArr;
    }

    public final byte[] G(int i6) throws IOException {
        if (i6 == 0) {
            return s52.f8802b;
        }
        int i7 = this.f5941i;
        int i8 = this.f5940g;
        int i9 = i7 + i8 + i6;
        if ((-2147483647) + i9 > 0) {
            throw new u52("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i10 = this.f5942j;
        if (i9 > i10) {
            A((i10 - i7) - i8);
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = this.f5938e - i8;
        int i12 = i6 - i11;
        InputStream inputStream = this.f5936c;
        if (i12 >= 4096) {
            try {
                if (i12 > inputStream.available()) {
                    return null;
                }
            } catch (u52 e6) {
                e6.s = true;
                throw e6;
            }
        }
        byte[] bArr = new byte[i6];
        System.arraycopy(this.f5937d, this.f5940g, bArr, 0, i11);
        this.f5941i += this.f5938e;
        this.f5940g = 0;
        this.f5938e = 0;
        while (i11 < i6) {
            try {
                int i13 = inputStream.read(bArr, i11, i6 - i11);
                if (i13 == -1) {
                    throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f5941i += i13;
                i11 += i13;
            } catch (u52 e7) {
                e7.s = true;
                throw e7;
            }
        }
        return bArr;
    }

    public final int H() throws u52 {
        int i6 = this.f5940g;
        if (this.f5938e - i6 < 4) {
            D(4);
            i6 = this.f5940g;
        }
        this.f5940g = i6 + 4;
        byte[] bArr = this.f5937d;
        int i7 = bArr[i6] & 255;
        int i8 = bArr[i6 + 1] & 255;
        int i9 = bArr[i6 + 2] & 255;
        return ((bArr[i6 + 3] & 255) << 24) | (i8 << 8) | i7 | (i9 << 16);
    }

    public final int I() {
        int i6;
        int i7 = this.f5940g;
        int i8 = this.f5938e;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f5937d;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f5940g = i9;
                return b7;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b7;
                if (i11 < 0) {
                    i6 = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        i6 = i13 ^ 16256;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            i6 = (-2080896) ^ i15;
                        } else {
                            i12 = i7 + 5;
                            byte b8 = bArr[i14];
                            int i16 = (i15 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i14 = i7 + 6;
                                if (bArr[i12] < 0) {
                                    i12 = i7 + 7;
                                    if (bArr[i14] < 0) {
                                        i14 = i7 + 8;
                                        if (bArr[i12] < 0) {
                                            i12 = i7 + 9;
                                            if (bArr[i14] < 0) {
                                                int i17 = i7 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i10 = i17;
                                                    i6 = i16;
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i16;
                            }
                            i6 = i16;
                        }
                        i10 = i14;
                    }
                    i10 = i12;
                }
                this.f5940g = i10;
                return i6;
            }
        }
        return (int) L();
    }

    public final long J() throws u52 {
        int i6 = this.f5940g;
        if (this.f5938e - i6 < 8) {
            D(8);
            i6 = this.f5940g;
        }
        this.f5940g = i6 + 8;
        byte[] bArr = this.f5937d;
        long j6 = bArr[i6];
        long j7 = bArr[i6 + 2];
        long j8 = bArr[i6 + 3];
        return ((bArr[i6 + 6] & 255) << 48) | (j6 & 255) | ((bArr[i6 + 1] & 255) << 8) | ((j7 & 255) << 16) | ((j8 & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 7] & 255) << 56);
    }

    public final long K() {
        long j6;
        long j7;
        long j8;
        int i6 = this.f5940g;
        int i7 = this.f5938e;
        if (i7 != i6) {
            int i8 = i6 + 1;
            byte[] bArr = this.f5937d;
            byte b7 = bArr[i6];
            if (b7 >= 0) {
                this.f5940g = i8;
                return b7;
            }
            if (i7 - i8 >= 9) {
                int i9 = i6 + 2;
                int i10 = (bArr[i8] << 7) ^ b7;
                if (i10 < 0) {
                    j6 = i10 ^ (-128);
                } else {
                    int i11 = i6 + 3;
                    int i12 = (bArr[i9] << 14) ^ i10;
                    if (i12 >= 0) {
                        j6 = i12 ^ 16256;
                    } else {
                        int i13 = i6 + 4;
                        int i14 = i12 ^ (bArr[i11] << 21);
                        if (i14 < 0) {
                            long j9 = (-2080896) ^ i14;
                            i9 = i13;
                            j6 = j9;
                        } else {
                            i11 = i6 + 5;
                            long j10 = i14 ^ (bArr[i13] << 28);
                            if (j10 >= 0) {
                                j8 = 266354560;
                            } else {
                                int i15 = i6 + 6;
                                long j11 = j10 ^ (bArr[i11] << 35);
                                if (j11 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i11 = i6 + 7;
                                    j10 = j11 ^ (bArr[i15] << 42);
                                    if (j10 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i15 = i6 + 8;
                                        j11 = j10 ^ (bArr[i11] << 49);
                                        if (j11 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i11 = i6 + 9;
                                            long j12 = (j11 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i16 = i6 + 10;
                                                if (bArr[i11] >= 0) {
                                                    j6 = j12;
                                                    i9 = i16;
                                                }
                                            } else {
                                                j6 = j12;
                                            }
                                        }
                                    }
                                }
                                j6 = j11 ^ j7;
                                i9 = i15;
                            }
                            j6 = j10 ^ j8;
                        }
                    }
                    i9 = i11;
                }
                this.f5940g = i9;
                return j6;
            }
        }
        return L();
    }

    public final long L() throws u52 {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            if (this.f5940g == this.f5938e) {
                D(1);
            }
            int i7 = this.f5940g;
            this.f5940g = i7 + 1;
            j6 |= (r3 & Byte.MAX_VALUE) << i6;
            if ((this.f5937d[i7] & 128) == 0) {
                return j6;
            }
        }
        throw new u52("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final boolean a() {
        return this.f5940g == this.f5938e && !E(1);
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final boolean b() {
        return K() != 0;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final double f() {
        return Double.longBitsToDouble(J());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final float g() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int h() {
        return this.f5941i + this.f5940g;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int i(int i6) throws u52 {
        if (i6 < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i7 = this.f5941i + this.f5940g + i6;
        if (i7 < 0) {
            throw new u52("Failed to parse the message.");
        }
        int i8 = this.f5942j;
        if (i7 > i8) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f5942j = i7;
        C();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int j() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int k() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int l() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int m() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int n() {
        return k42.c(I());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int o() throws u52 {
        if (a()) {
            this.h = 0;
            return 0;
        }
        int I = I();
        this.h = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new u52("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int p() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long q() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long r() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long s() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long t() {
        return k42.d(K());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long u() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final e42 v() throws IOException {
        int I = I();
        int i6 = this.f5938e;
        int i7 = this.f5940g;
        int i8 = i6 - i7;
        byte[] bArr = this.f5937d;
        if (I <= i8 && I > 0) {
            e42 e42VarS = g42.s(i7, I, bArr);
            this.f5940g += I;
            return e42VarS;
        }
        if (I == 0) {
            return g42.f4896t;
        }
        if (I < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrG = G(I);
        if (bArrG != null) {
            return g42.s(0, bArrG.length, bArrG);
        }
        int i9 = this.f5940g;
        int i10 = this.f5938e;
        int i11 = i10 - i9;
        this.f5941i += i10;
        this.f5940g = 0;
        this.f5938e = 0;
        ArrayList arrayListB = B(I - i11);
        byte[] bArr2 = new byte[I];
        System.arraycopy(bArr, i9, bArr2, 0, i11);
        int size = arrayListB.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListB.get(i12);
            i12++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length);
            i11 += length;
        }
        return new e42(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final String w() throws u52 {
        int I = I();
        byte[] bArr = this.f5937d;
        if (I > 0) {
            int i6 = this.f5938e;
            int i7 = this.f5940g;
            if (I <= i6 - i7) {
                String str = new String(bArr, i7, I, s52.f8801a);
                this.f5940g += I;
                return str;
            }
        }
        if (I == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (I < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (I > this.f5938e) {
            return new String(F(I), s52.f8801a);
        }
        D(I);
        String str2 = new String(bArr, this.f5940g, I, s52.f8801a);
        this.f5940g += I;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final String x() throws IOException {
        int I = I();
        int i6 = this.f5940g;
        int i7 = this.f5938e;
        int i8 = i7 - i6;
        byte[] bArrF = this.f5937d;
        if (I <= i8 && I > 0) {
            this.f5940g = i6 + I;
        } else {
            if (I == 0) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (I < 0) {
                throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i6 = 0;
            if (I <= i7) {
                D(I);
                this.f5940g = I;
            } else {
                bArrF = F(I);
            }
        }
        return v72.f9748a.b(i6, I, bArrF);
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final void y() throws u52 {
        if (this.h != 0) {
            throw new u52("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final void z(int i6) {
        this.f5942j = i6;
        C();
    }
}
