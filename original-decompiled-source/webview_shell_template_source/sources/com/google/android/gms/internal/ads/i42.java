package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i42 extends k42 {

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f5548c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f5549d;

    /* renamed from: e, reason: collision with root package name */
    public int f5550e;

    /* renamed from: f, reason: collision with root package name */
    public int f5551f;
    public int h;

    /* renamed from: j, reason: collision with root package name */
    public long f5554j;

    /* renamed from: k, reason: collision with root package name */
    public long f5555k;

    /* renamed from: l, reason: collision with root package name */
    public long f5556l;

    /* renamed from: g, reason: collision with root package name */
    public int f5552g = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f5553i = 0;

    public /* synthetic */ i42(int i6, ArrayList arrayList) {
        this.f5550e = i6;
        this.f5548c = arrayList.iterator();
        if (i6 != 0) {
            D();
            return;
        }
        this.f5549d = s52.f8803c;
        this.f5554j = 0L;
        this.f5555k = 0L;
        this.f5556l = 0L;
    }

    public final long A() throws u52 {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            j6 |= (r3 & Byte.MAX_VALUE) << i6;
            if ((E() & 128) == 0) {
                return j6;
            }
        }
        throw new u52("CodedInputStream encountered a malformed varint.");
    }

    public final int B() {
        return (int) (((this.f5550e - this.f5553i) - this.f5554j) + this.f5555k);
    }

    public final void C(int i6, byte[] bArr) throws u52 {
        if (i6 > B()) {
            if (i6 > 0) {
                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i7 = i6;
        while (i7 > 0) {
            if (this.f5556l - this.f5554j == 0) {
                if (!this.f5548c.hasNext()) {
                    throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                D();
            }
            int iMin = Math.min(i7, (int) (this.f5556l - this.f5554j));
            long j6 = iMin;
            r72.f8574c.i(this.f5554j, bArr, i6 - i7, j6);
            i7 -= iMin;
            this.f5554j += j6;
        }
    }

    public final void D() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f5548c.next();
        this.f5549d = byteBuffer;
        this.f5553i += (int) (this.f5554j - this.f5555k);
        long jPosition = byteBuffer.position();
        this.f5554j = jPosition;
        this.f5555k = jPosition;
        this.f5556l = this.f5549d.limit();
        long jG = r72.g(this.f5549d);
        this.f5554j += jG;
        this.f5555k += jG;
        this.f5556l += jG;
    }

    public final byte E() throws u52 {
        if (this.f5556l - this.f5554j == 0) {
            if (!this.f5548c.hasNext()) {
                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            D();
        }
        long j6 = this.f5554j;
        this.f5554j = 1 + j6;
        return r72.f8574c.a(j6);
    }

    public final int F() {
        long j6 = this.f5556l;
        long j7 = this.f5554j;
        if (j6 - j7 < 4) {
            int iE = E() & 255;
            int iE2 = (E() & 255) << 8;
            return iE | iE2 | ((E() & 255) << 16) | ((E() & 255) << 24);
        }
        this.f5554j = 4 + j7;
        q72 q72Var = r72.f8574c;
        int iA = q72Var.a(j7) & 255;
        int iA2 = (q72Var.a(1 + j7) & 255) << 8;
        return ((q72Var.a(j7 + 3) & 255) << 24) | iA | iA2 | ((q72Var.a(2 + j7) & 255) << 16);
    }

    public final int G() {
        int i6;
        long j6 = this.f5554j;
        if (this.f5556l != j6) {
            long j7 = j6 + 1;
            q72 q72Var = r72.f8574c;
            byte bA = q72Var.a(j6);
            if (bA >= 0) {
                this.f5554j++;
                return bA;
            }
            if (this.f5556l - this.f5554j >= 10) {
                long j8 = 2 + j6;
                int iA = (q72Var.a(j7) << 7) ^ bA;
                if (iA < 0) {
                    i6 = iA ^ (-128);
                } else {
                    long j9 = 3 + j6;
                    int iA2 = (q72Var.a(j8) << 14) ^ iA;
                    if (iA2 >= 0) {
                        i6 = iA2 ^ 16256;
                    } else {
                        long j10 = 4 + j6;
                        int iA3 = iA2 ^ (q72Var.a(j9) << 21);
                        if (iA3 < 0) {
                            i6 = (-2080896) ^ iA3;
                        } else {
                            j9 = 5 + j6;
                            byte bA2 = q72Var.a(j10);
                            int i7 = (iA3 ^ (bA2 << 28)) ^ 266354560;
                            if (bA2 < 0) {
                                j10 = 6 + j6;
                                if (q72Var.a(j9) < 0) {
                                    j9 = 7 + j6;
                                    if (q72Var.a(j10) < 0) {
                                        j10 = 8 + j6;
                                        if (q72Var.a(j9) < 0) {
                                            j9 = 9 + j6;
                                            if (q72Var.a(j10) < 0) {
                                                long j11 = j6 + 10;
                                                if (q72Var.a(j9) >= 0) {
                                                    i6 = i7;
                                                    j8 = j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i7;
                            }
                            i6 = i7;
                        }
                        j8 = j10;
                    }
                    j8 = j9;
                }
                this.f5554j = j8;
                return i6;
            }
        }
        return (int) A();
    }

    public final long H() {
        long j6 = this.f5556l;
        long j7 = this.f5554j;
        if (j6 - j7 < 8) {
            return ((E() & 255) << 56) | (E() & 255) | ((E() & 255) << 8) | ((E() & 255) << 16) | ((E() & 255) << 24) | ((E() & 255) << 32) | ((E() & 255) << 40) | ((E() & 255) << 48);
        }
        this.f5554j = 8 + j7;
        q72 q72Var = r72.f8574c;
        return (q72Var.a(j7) & 255) | ((q72Var.a(j7 + 1) & 255) << 8) | ((q72Var.a(j7 + 2) & 255) << 16) | ((q72Var.a(j7 + 3) & 255) << 24) | ((q72Var.a(j7 + 4) & 255) << 32) | ((q72Var.a(j7 + 5) & 255) << 40) | ((q72Var.a(j7 + 6) & 255) << 48) | ((q72Var.a(j7 + 7) & 255) << 56);
    }

    public final long I() {
        long j6;
        long j7;
        long j8;
        long j9 = this.f5554j;
        if (this.f5556l != j9) {
            long j10 = j9 + 1;
            q72 q72Var = r72.f8574c;
            byte bA = q72Var.a(j9);
            if (bA >= 0) {
                this.f5554j++;
                return bA;
            }
            if (this.f5556l - this.f5554j >= 10) {
                long j11 = 2 + j9;
                int iA = (q72Var.a(j10) << 7) ^ bA;
                if (iA < 0) {
                    j6 = iA ^ (-128);
                } else {
                    long j12 = 3 + j9;
                    int iA2 = (q72Var.a(j11) << 14) ^ iA;
                    if (iA2 >= 0) {
                        j6 = iA2 ^ 16256;
                    } else {
                        long j13 = 4 + j9;
                        int iA3 = iA2 ^ (q72Var.a(j12) << 21);
                        if (iA3 < 0) {
                            j6 = (-2080896) ^ iA3;
                            j11 = j13;
                        } else {
                            j12 = 5 + j9;
                            long jA = (q72Var.a(j13) << 28) ^ iA3;
                            if (jA >= 0) {
                                j8 = 266354560;
                            } else {
                                long j14 = 6 + j9;
                                long jA2 = jA ^ (q72Var.a(j12) << 35);
                                if (jA2 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    j12 = 7 + j9;
                                    jA = jA2 ^ (q72Var.a(j14) << 42);
                                    if (jA >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        j14 = 8 + j9;
                                        jA2 = jA ^ (q72Var.a(j12) << 49);
                                        if (jA2 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            j12 = 9 + j9;
                                            long jA3 = (jA2 ^ (q72Var.a(j14) << 56)) ^ 71499008037633920L;
                                            if (jA3 < 0) {
                                                long j15 = j9 + 10;
                                                if (q72Var.a(j12) >= 0) {
                                                    j11 = j15;
                                                    j6 = jA3;
                                                }
                                            } else {
                                                j6 = jA3;
                                            }
                                        }
                                    }
                                }
                                j6 = j7 ^ jA2;
                                j11 = j14;
                            }
                            j6 = j8 ^ jA;
                        }
                    }
                    j11 = j12;
                }
                this.f5554j = j11;
                return j6;
            }
        }
        return A();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final boolean a() {
        return (((long) this.f5553i) + this.f5554j) - this.f5555k == ((long) this.f5550e);
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final boolean b() {
        return I() != 0;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final double f() {
        return Double.longBitsToDouble(H());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final float g() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int h() {
        return (int) ((this.f5553i + this.f5554j) - this.f5555k);
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int i(int i6) throws u52 {
        if (i6 < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iH = h() + i6;
        int i7 = this.f5552g;
        if (iH > i7) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f5552g = iH;
        int i8 = this.f5550e + this.f5551f;
        this.f5550e = i8;
        if (i8 <= iH) {
            this.f5551f = 0;
            return i7;
        }
        int i9 = i8 - iH;
        this.f5551f = i9;
        this.f5550e = i8 - i9;
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int j() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int k() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int l() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int m() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int n() {
        return k42.c(G());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int o() throws u52 {
        if (a()) {
            this.h = 0;
            return 0;
        }
        int iG = G();
        this.h = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new u52("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final int p() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long q() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long r() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long s() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long t() {
        return k42.d(I());
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final long u() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final e42 v() throws u52 {
        int iG = G();
        if (iG > 0) {
            long j6 = this.f5556l;
            long j7 = this.f5554j;
            long j8 = iG;
            if (j8 <= j6 - j7) {
                byte[] bArr = new byte[iG];
                r72.f8574c.i(j7, bArr, 0L, j8);
                this.f5554j += j8;
                return new e42(bArr);
            }
        }
        if (iG > 0 && iG <= B()) {
            byte[] bArr2 = new byte[iG];
            C(iG, bArr2);
            return new e42(bArr2);
        }
        if (iG == 0) {
            return g42.f4896t;
        }
        if (iG < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final String w() throws u52 {
        int iG = G();
        if (iG > 0) {
            long j6 = this.f5556l;
            long j7 = this.f5554j;
            long j8 = iG;
            if (j8 <= j6 - j7) {
                byte[] bArr = new byte[iG];
                r72.f8574c.i(j7, bArr, 0L, j8);
                String str = new String(bArr, s52.f8801a);
                this.f5554j += j8;
                return str;
            }
        }
        if (iG > 0 && iG <= B()) {
            byte[] bArr2 = new byte[iG];
            C(iG, bArr2);
            return new String(bArr2, s52.f8801a);
        }
        if (iG == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iG < 0) {
            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.k42
    public final String x() throws u52 {
        int iG = G();
        if (iG > 0) {
            long j6 = this.f5556l;
            long j7 = this.f5554j;
            long j8 = iG;
            if (j8 <= j6 - j7) {
                long j9 = j7 - this.f5555k;
                ByteBuffer byteBuffer = this.f5549d;
                int i6 = (int) j9;
                String strB = byteBuffer.hasArray() ? v72.f9748a.b(byteBuffer.arrayOffset() + i6, iG, byteBuffer.array()) : byteBuffer.isDirect() ? s72.a(byteBuffer, i6, iG) : s72.a(byteBuffer, i6, iG);
                this.f5554j += j8;
                return strB;
            }
        }
        if (iG >= 0 && iG <= B()) {
            byte[] bArr = new byte[iG];
            C(iG, bArr);
            return v72.f9748a.b(0, iG, bArr);
        }
        if (iG == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iG <= 0) {
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
        this.f5552g = i6;
        int i7 = this.f5550e + this.f5551f;
        this.f5550e = i7;
        if (i7 <= i6) {
            this.f5551f = 0;
            return;
        }
        int i8 = i7 - i6;
        this.f5551f = i8;
        this.f5550e = i7 - i8;
    }
}
