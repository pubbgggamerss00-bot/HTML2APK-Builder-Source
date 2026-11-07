package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h42 extends k42 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5252c;

    /* renamed from: d, reason: collision with root package name */
    public int f5253d;

    /* renamed from: e, reason: collision with root package name */
    public int f5254e;

    /* renamed from: f, reason: collision with root package name */
    public int f5255f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5256g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f5257i = Integer.MAX_VALUE;

    public /* synthetic */ h42(byte[] bArr, int i6, int i7) {
        this.f5252c = bArr;
        this.f5253d = i7 + i6;
        this.f5255f = i6;
        this.f5256g = i6;
    }

    public final void A() {
        int i6 = this.f5253d + this.f5254e;
        this.f5253d = i6;
        int i7 = i6 - this.f5256g;
        int i8 = this.f5257i;
        if (i7 <= i8) {
            this.f5254e = 0;
            return;
        }
        int i9 = i7 - i8;
        this.f5254e = i9;
        this.f5253d = i6 - i9;
    }

    public final int B() throws u52 {
        int i6 = this.f5255f;
        if (this.f5253d - i6 < 4) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f5255f = i6 + 4;
        byte[] bArr = this.f5252c;
        int i7 = bArr[i6] & 255;
        int i8 = bArr[i6 + 1] & 255;
        int i9 = bArr[i6 + 2] & 255;
        return ((bArr[i6 + 3] & 255) << 24) | (i8 << 8) | i7 | (i9 << 16);
    }

    public final int C() {
        int i6;
        int i7 = this.f5255f;
        int i8 = this.f5253d;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f5252c;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.f5255f = i9;
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
                this.f5255f = i10;
                return i6;
            }
        }
        return (int) F();
    }

    public final long D() throws u52 {
        int i6 = this.f5255f;
        if (this.f5253d - i6 < 8) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f5255f = i6 + 8;
        byte[] bArr = this.f5252c;
        long j6 = bArr[i6];
        long j7 = bArr[i6 + 2];
        long j8 = bArr[i6 + 3];
        return ((bArr[i6 + 6] & 255) << 48) | (j6 & 255) | ((bArr[i6 + 1] & 255) << 8) | ((j7 & 255) << 16) | ((j8 & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 7] & 255) << 56);
    }

    public final long E() {
        long j6;
        long j7;
        long j8;
        int i6 = this.f5255f;
        int i7 = this.f5253d;
        if (i7 != i6) {
            int i8 = i6 + 1;
            byte[] bArr = this.f5252c;
            byte b7 = bArr[i6];
            if (b7 >= 0) {
                this.f5255f = i8;
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
                this.f5255f = i9;
                return j6;
            }
        }
        return F();
    }

    public final long F() throws u52 {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            int i7 = this.f5255f;
            if (i7 == this.f5253d) {
                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f5255f = i7 + 1;
            j6 |= (r3 & Byte.MAX_VALUE) << i6;
            if ((this.f5252c[i7] & 128) == 0) {
                return j6;
            }
        }
        throw new u52("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final boolean a() {
        return this.f5255f == this.f5253d;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final boolean b() {
        return E() != 0;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final double f() {
        return Double.longBitsToDouble(D());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final float g() {
        return Float.intBitsToFloat(B());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int h() {
        return this.f5255f - this.f5256g;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int i(int i6) throws u52 {
        if (i6 < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i7 = (this.f5255f - this.f5256g) + i6;
        if (i7 < 0) {
            throw new u52("Failed to parse the message.");
        }
        int i8 = this.f5257i;
        if (i7 > i8) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f5257i = i7;
        A();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int j() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int k() {
        return B();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int l() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int m() {
        return B();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int n() {
        return k42.c(C());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int o() throws u52 {
        if (a()) {
            this.h = 0;
            return 0;
        }
        int iC = C();
        this.h = iC;
        if ((iC >>> 3) != 0) {
            return iC;
        }
        throw new u52("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int p() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long q() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long r() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long s() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long t() {
        return k42.d(E());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long u() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final e42 v() throws u52 {
        int iC = C();
        byte[] bArr = this.f5252c;
        if (iC > 0) {
            int i6 = this.f5253d;
            int i7 = this.f5255f;
            if (iC <= i6 - i7) {
                e42 e42VarS = g42.s(i7, iC, bArr);
                this.f5255f += iC;
                return e42VarS;
            }
        }
        if (iC == 0) {
            return g42.f4896t;
        }
        if (iC > 0) {
            int i8 = this.f5253d;
            int i9 = this.f5255f;
            if (iC <= i8 - i9) {
                int i10 = iC + i9;
                this.f5255f = i10;
                return new e42(Arrays.copyOfRange(bArr, i9, i10));
            }
        }
        if (iC <= 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final String w() throws u52 {
        int iC = C();
        if (iC > 0) {
            int i6 = this.f5253d;
            int i7 = this.f5255f;
            if (iC <= i6 - i7) {
                String str = new String(this.f5252c, i7, iC, s52.f8801a);
                this.f5255f += iC;
                return str;
            }
        }
        if (iC == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iC < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final String x() throws u52 {
        int iC = C();
        if (iC > 0) {
            int i6 = this.f5253d;
            int i7 = this.f5255f;
            if (iC <= i6 - i7) {
                String strB = v72.f9748a.b(i7, iC, this.f5252c);
                this.f5255f += iC;
                return strB;
            }
        }
        if (iC == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iC <= 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final void y() throws u52 {
        if (this.h != 0) {
            throw new u52("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final void z(int i6) {
        this.f5257i = i6;
        A();
    }
}
