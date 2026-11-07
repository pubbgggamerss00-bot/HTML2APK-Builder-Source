package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public int f6678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6679b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f6680c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public j f6681d;

    public static final class a extends i {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f6682e;

        /* renamed from: f, reason: collision with root package name */
        public int f6683f;

        /* renamed from: g, reason: collision with root package name */
        public int f6684g;

        /* renamed from: h, reason: collision with root package name */
        public int f6685h;

        /* renamed from: i, reason: collision with root package name */
        public final int f6686i;

        /* renamed from: j, reason: collision with root package name */
        public int f6687j;

        /* renamed from: k, reason: collision with root package name */
        public int f6688k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f6682e = bArr;
            this.f6683f = i11 + i10;
            this.f6685h = i10;
            this.f6686i = i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean A(int i10) throws IOException {
            int iX;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f6683f - this.f6685h;
                byte[] bArr = this.f6682e;
                if (i13 >= 10) {
                    while (i12 < 10) {
                        int i14 = this.f6685h;
                        this.f6685h = i14 + 1;
                        if (bArr[i14] < 0) {
                            i12++;
                        }
                    }
                    throw z.d();
                }
                while (i12 < 10) {
                    int i15 = this.f6685h;
                    if (i15 == this.f6683f) {
                        throw z.g();
                    }
                    this.f6685h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i12++;
                    }
                }
                throw z.d();
                return true;
            }
            if (i11 == 1) {
                H(8);
                return true;
            }
            if (i11 == 2) {
                H(D());
                return true;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw z.c();
                }
                H(4);
                return true;
            }
            do {
                iX = x();
                if (iX == 0) {
                    break;
                }
            } while (A(iX));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }

        public final int B() throws IOException {
            int i10 = this.f6685h;
            if (this.f6683f - i10 < 4) {
                throw z.g();
            }
            this.f6685h = i10 + 4;
            byte[] bArr = this.f6682e;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long C() throws IOException {
            int i10 = this.f6685h;
            if (this.f6683f - i10 < 8) {
                throw z.g();
            }
            this.f6685h = i10 + 8;
            byte[] bArr = this.f6682e;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public final int D() throws IOException {
            int i10;
            int i11 = this.f6685h;
            int i12 = this.f6683f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f6682e;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f6685h = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << RegisterType.DOUBLE_LO) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f6685h = i14;
                    return i10;
                }
            }
            return (int) F();
        }

        public final long E() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f6685h;
            int i11 = this.f6683f;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f6682e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f6685h = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << RegisterType.DOUBLE_LO) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i17] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f6685h = i13;
                    return j10;
                }
            }
            return F();
        }

        public final long F() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f6685h;
                if (i11 == this.f6683f) {
                    throw z.g();
                }
                this.f6685h = i11 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((this.f6682e[i11] & 128) == 0) {
                    return j10;
                }
            }
            throw z.d();
        }

        public final void G() {
            int i10 = this.f6683f + this.f6684g;
            this.f6683f = i10;
            int i11 = i10 - this.f6686i;
            int i12 = this.f6688k;
            if (i11 <= i12) {
                this.f6684g = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f6684g = i13;
            this.f6683f = i10 - i13;
        }

        public final void H(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f6683f;
                int i12 = this.f6685h;
                if (i10 <= i11 - i12) {
                    this.f6685h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw z.g();
            }
            throw z.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final void a(int i10) throws z {
            if (this.f6687j != i10) {
                throw new z("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int d() {
            return this.f6685h - this.f6686i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean e() throws IOException {
            return this.f6685h == this.f6683f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final void g(int i10) {
            this.f6688k = i10;
            G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int h(int i10) throws z {
            if (i10 < 0) {
                throw z.e();
            }
            int iD = d() + i10;
            if (iD < 0) {
                throw z.f();
            }
            int i11 = this.f6688k;
            if (iD > i11) {
                throw z.g();
            }
            this.f6688k = iD;
            G();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean i() throws IOException {
            return E() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // com.google.crypto.tink.shaded.protobuf.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final h.f j() throws IOException {
            byte[] bArrCopyOfRange;
            int iD = D();
            byte[] bArr = this.f6682e;
            if (iD > 0) {
                int i10 = this.f6683f;
                int i11 = this.f6685h;
                if (iD <= i10 - i11) {
                    h.f fVarC = h.c(i11, iD, bArr);
                    this.f6685h += iD;
                    return fVarC;
                }
            }
            if (iD == 0) {
                return h.f6665b;
            }
            if (iD > 0) {
                int i12 = this.f6683f;
                int i13 = this.f6685h;
                if (iD <= i12 - i13) {
                    int i14 = iD + i13;
                    this.f6685h = i14;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                } else {
                    if (iD > 0) {
                        throw z.g();
                    }
                    if (iD != 0) {
                        throw z.e();
                    }
                    bArrCopyOfRange = y.f6819b;
                }
            }
            h.f fVar = h.f6665b;
            return new h.f(bArrCopyOfRange);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final double k() throws IOException {
            return Double.longBitsToDouble(C());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int l() throws IOException {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int m() throws IOException {
            return B();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long n() throws IOException {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final float o() throws IOException {
            return Float.intBitsToFloat(B());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int p() throws IOException {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long q() throws IOException {
            return E();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int r() throws IOException {
            return B();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long s() throws IOException {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int t() throws IOException {
            return i.b(D());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long u() throws IOException {
            return i.c(E());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final String v() throws IOException {
            int iD = D();
            if (iD > 0) {
                int i10 = this.f6683f;
                int i11 = this.f6685h;
                if (iD <= i10 - i11) {
                    String str = new String(this.f6682e, i11, iD, y.f6818a);
                    this.f6685h += iD;
                    return str;
                }
            }
            if (iD == 0) {
                return "";
            }
            if (iD < 0) {
                throw z.e();
            }
            throw z.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final String w() throws IOException {
            int iD = D();
            if (iD > 0) {
                int i10 = this.f6683f;
                int i11 = this.f6685h;
                if (iD <= i10 - i11) {
                    String strA = s1.f6761a.a(this.f6682e, i11, iD);
                    this.f6685h += iD;
                    return strA;
                }
            }
            if (iD == 0) {
                return "";
            }
            if (iD <= 0) {
                throw z.e();
            }
            throw z.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int x() throws IOException {
            if (e()) {
                this.f6687j = 0;
                return 0;
            }
            int iD = D();
            this.f6687j = iD;
            if ((iD >>> 3) != 0) {
                return iD;
            }
            throw z.a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int y() throws IOException {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long z() throws IOException {
            return E();
        }
    }

    public static final class b extends i {

        /* renamed from: e, reason: collision with root package name */
        public final ByteArrayInputStream f6689e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f6690f;

        /* renamed from: g, reason: collision with root package name */
        public int f6691g;

        /* renamed from: h, reason: collision with root package name */
        public int f6692h;

        /* renamed from: i, reason: collision with root package name */
        public int f6693i;

        /* renamed from: j, reason: collision with root package name */
        public int f6694j;

        /* renamed from: k, reason: collision with root package name */
        public int f6695k;

        /* renamed from: l, reason: collision with root package name */
        public int f6696l = Integer.MAX_VALUE;

        public b(ByteArrayInputStream byteArrayInputStream) {
            Charset charset = y.f6818a;
            this.f6689e = byteArrayInputStream;
            this.f6690f = new byte[4096];
            this.f6691g = 0;
            this.f6693i = 0;
            this.f6695k = 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean A(int i10) throws IOException {
            int iX;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f6691g - this.f6693i;
                byte[] bArr = this.f6690f;
                if (i13 >= 10) {
                    while (i12 < 10) {
                        int i14 = this.f6693i;
                        this.f6693i = i14 + 1;
                        if (bArr[i14] < 0) {
                            i12++;
                        }
                    }
                    throw z.d();
                }
                while (i12 < 10) {
                    if (this.f6693i == this.f6691g) {
                        K(1);
                    }
                    int i15 = this.f6693i;
                    this.f6693i = i15 + 1;
                    if (bArr[i15] < 0) {
                        i12++;
                    }
                }
                throw z.d();
                return true;
            }
            if (i11 == 1) {
                L(8);
                return true;
            }
            if (i11 == 2) {
                L(G());
                return true;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw z.c();
                }
                L(4);
                return true;
            }
            do {
                iX = x();
                if (iX == 0) {
                    break;
                }
            } while (A(iX));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] B(int i10) throws IOException {
            byte[] bArrC = C(i10);
            if (bArrC != null) {
                return bArrC;
            }
            int i11 = this.f6693i;
            int i12 = this.f6691g;
            int length = i12 - i11;
            this.f6695k += i12;
            this.f6693i = 0;
            this.f6691g = 0;
            ArrayList arrayListD = D(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f6690f, i11, bArr, 0, length);
            int size = arrayListD.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayListD.get(i13);
                i13++;
                byte[] bArr2 = (byte[]) obj;
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] C(int i10) throws IOException {
            if (i10 == 0) {
                return y.f6819b;
            }
            if (i10 < 0) {
                throw z.e();
            }
            int i11 = this.f6695k;
            int i12 = this.f6693i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f6680c > 0) {
                throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f6696l;
            if (i13 > i14) {
                L((i14 - i11) - i12);
                throw z.g();
            }
            int i15 = this.f6691g - i12;
            int i16 = i10 - i15;
            ByteArrayInputStream byteArrayInputStream = this.f6689e;
            if (i16 >= 4096) {
                try {
                    if (i16 > byteArrayInputStream.available()) {
                        return null;
                    }
                } catch (z e10) {
                    e10.f6822a = true;
                    throw e10;
                }
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f6690f, this.f6693i, bArr, 0, i15);
            this.f6695k += this.f6691g;
            this.f6693i = 0;
            this.f6691g = 0;
            while (i15 < i10) {
                try {
                    int i17 = byteArrayInputStream.read(bArr, i15, i10 - i15);
                    if (i17 == -1) {
                        throw z.g();
                    }
                    this.f6695k += i17;
                    i15 += i17;
                } catch (z e11) {
                    e11.f6822a = true;
                    throw e11;
                }
            }
            return bArr;
        }

        public final ArrayList D(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f6689e.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw z.g();
                    }
                    this.f6695k += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int E() throws IOException {
            int i10 = this.f6693i;
            if (this.f6691g - i10 < 4) {
                K(4);
                i10 = this.f6693i;
            }
            this.f6693i = i10 + 4;
            byte[] bArr = this.f6690f;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long F() throws IOException {
            int i10 = this.f6693i;
            if (this.f6691g - i10 < 8) {
                K(8);
                i10 = this.f6693i;
            }
            this.f6693i = i10 + 8;
            byte[] bArr = this.f6690f;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public final int G() throws IOException {
            int i10;
            int i11 = this.f6693i;
            int i12 = this.f6691g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f6690f;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f6693i = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << RegisterType.DOUBLE_LO) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f6693i = i14;
                    return i10;
                }
            }
            return (int) I();
        }

        public final long H() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f6693i;
            int i11 = this.f6691g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f6690f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f6693i = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << RegisterType.DOUBLE_LO) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (bArr[i17] << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (bArr[i13] << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (bArr[i17] << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (bArr[i13] << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f6693i = i13;
                    return j10;
                }
            }
            return I();
        }

        public final long I() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f6693i == this.f6691g) {
                    K(1);
                }
                int i11 = this.f6693i;
                this.f6693i = i11 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((this.f6690f[i11] & 128) == 0) {
                    return j10;
                }
            }
            throw z.d();
        }

        public final void J() {
            int i10 = this.f6691g + this.f6692h;
            this.f6691g = i10;
            int i11 = this.f6695k + i10;
            int i12 = this.f6696l;
            if (i11 <= i12) {
                this.f6692h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f6692h = i13;
            this.f6691g = i10 - i13;
        }

        public final void K(int i10) throws IOException {
            if (M(i10)) {
                return;
            }
            if (i10 <= (this.f6680c - this.f6695k) - this.f6693i) {
                throw z.g();
            }
            throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void L(int i10) throws IOException {
            int i11 = this.f6691g;
            int i12 = this.f6693i;
            int i13 = i11 - i12;
            if (i10 <= i13 && i10 >= 0) {
                this.f6693i = i12 + i10;
                return;
            }
            ByteArrayInputStream byteArrayInputStream = this.f6689e;
            if (i10 < 0) {
                throw z.e();
            }
            int i14 = this.f6695k;
            int i15 = i14 + i12;
            int i16 = i15 + i10;
            int i17 = this.f6696l;
            if (i16 > i17) {
                L((i17 - i14) - i12);
                throw z.g();
            }
            this.f6695k = i15;
            this.f6691g = 0;
            this.f6693i = 0;
            while (i13 < i10) {
                long j10 = i10 - i13;
                try {
                    try {
                        long jSkip = byteArrayInputStream.skip(j10);
                        if (jSkip < 0 || jSkip > j10) {
                            throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i13 += (int) jSkip;
                        }
                    } catch (z e10) {
                        e10.f6822a = true;
                        throw e10;
                    }
                } catch (Throwable th2) {
                    this.f6695k += i13;
                    J();
                    throw th2;
                }
            }
            this.f6695k += i13;
            J();
            if (i13 >= i10) {
                return;
            }
            int i18 = this.f6691g;
            int i19 = i18 - this.f6693i;
            this.f6693i = i18;
            K(1);
            while (true) {
                int i20 = i10 - i19;
                int i21 = this.f6691g;
                if (i20 <= i21) {
                    this.f6693i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f6693i = i21;
                    K(1);
                }
            }
        }

        public final boolean M(int i10) throws IOException {
            ByteArrayInputStream byteArrayInputStream = this.f6689e;
            int i11 = this.f6693i;
            int i12 = i11 + i10;
            int i13 = this.f6691g;
            if (i12 <= i13) {
                throw new IllegalStateException(ad.b.b(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i14 = this.f6695k;
            int i15 = this.f6680c;
            if (i10 <= (i15 - i14) - i11 && i14 + i11 + i10 <= this.f6696l) {
                byte[] bArr = this.f6690f;
                if (i11 > 0) {
                    if (i13 > i11) {
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f6695k += i11;
                    this.f6691g -= i11;
                    this.f6693i = 0;
                }
                int i16 = this.f6691g;
                try {
                    int i17 = byteArrayInputStream.read(bArr, i16, Math.min(bArr.length - i16, (i15 - this.f6695k) - i16));
                    if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i17 > 0) {
                        this.f6691g += i17;
                        J();
                        if (this.f6691g >= i10) {
                            return true;
                        }
                        return M(i10);
                    }
                } catch (z e10) {
                    e10.f6822a = true;
                    throw e10;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final void a(int i10) throws z {
            if (this.f6694j != i10) {
                throw new z("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int d() {
            return this.f6695k + this.f6693i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean e() throws IOException {
            return this.f6693i == this.f6691g && !M(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final void g(int i10) {
            this.f6696l = i10;
            J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int h(int i10) throws z {
            if (i10 < 0) {
                throw z.e();
            }
            int i11 = this.f6695k + this.f6693i + i10;
            int i12 = this.f6696l;
            if (i11 > i12) {
                throw z.g();
            }
            this.f6696l = i11;
            J();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean i() throws IOException {
            return H() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final h.f j() throws IOException {
            int iG = G();
            int i10 = this.f6691g;
            int i11 = this.f6693i;
            int i12 = i10 - i11;
            byte[] bArr = this.f6690f;
            if (iG <= i12 && iG > 0) {
                h.f fVarC = h.c(i11, iG, bArr);
                this.f6693i += iG;
                return fVarC;
            }
            if (iG == 0) {
                return h.f6665b;
            }
            byte[] bArrC = C(iG);
            if (bArrC != null) {
                return h.c(0, bArrC.length, bArrC);
            }
            int i13 = this.f6693i;
            int i14 = this.f6691g;
            int length = i14 - i13;
            this.f6695k += i14;
            this.f6693i = 0;
            this.f6691g = 0;
            ArrayList arrayListD = D(iG - length);
            byte[] bArr2 = new byte[iG];
            System.arraycopy(bArr, i13, bArr2, 0, length);
            int size = arrayListD.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayListD.get(i15);
                i15++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            h.f fVar = h.f6665b;
            return new h.f(bArr2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final double k() throws IOException {
            return Double.longBitsToDouble(F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int l() throws IOException {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int m() throws IOException {
            return E();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long n() throws IOException {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final float o() throws IOException {
            return Float.intBitsToFloat(E());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int p() throws IOException {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long q() throws IOException {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int r() throws IOException {
            return E();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long s() throws IOException {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int t() throws IOException {
            return i.b(G());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long u() throws IOException {
            return i.c(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final String v() throws IOException {
            int iG = G();
            byte[] bArr = this.f6690f;
            if (iG > 0) {
                int i10 = this.f6691g;
                int i11 = this.f6693i;
                if (iG <= i10 - i11) {
                    String str = new String(bArr, i11, iG, y.f6818a);
                    this.f6693i += iG;
                    return str;
                }
            }
            if (iG == 0) {
                return "";
            }
            if (iG > this.f6691g) {
                return new String(B(iG), y.f6818a);
            }
            K(iG);
            String str2 = new String(bArr, this.f6693i, iG, y.f6818a);
            this.f6693i += iG;
            return str2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final String w() throws IOException {
            int iG = G();
            int i10 = this.f6693i;
            int i11 = this.f6691g;
            int i12 = i11 - i10;
            byte[] bArrB = this.f6690f;
            if (iG <= i12 && iG > 0) {
                this.f6693i = i10 + iG;
            } else {
                if (iG == 0) {
                    return "";
                }
                i10 = 0;
                if (iG <= i11) {
                    K(iG);
                    this.f6693i = iG;
                } else {
                    bArrB = B(iG);
                }
            }
            return s1.f6761a.a(bArrB, i10, iG);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int x() throws IOException {
            if (e()) {
                this.f6694j = 0;
                return 0;
            }
            int iG = G();
            this.f6694j = iG;
            if ((iG >>> 3) != 0) {
                return iG;
            }
            throw z.a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final int y() throws IOException {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final long z() throws IOException {
            return H();
        }
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static a f(byte[] bArr, int i10, int i11, boolean z10) {
        a aVar = new a(bArr, i10, i11, z10);
        try {
            aVar.h(i11);
            return aVar;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract boolean A(int i10) throws IOException;

    public abstract void a(int i10) throws z;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void g(int i10);

    public abstract int h(int i10) throws z;

    public abstract boolean i() throws IOException;

    public abstract h.f j() throws IOException;

    public abstract double k() throws IOException;

    public abstract int l() throws IOException;

    public abstract int m() throws IOException;

    public abstract long n() throws IOException;

    public abstract float o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract String v() throws IOException;

    public abstract String w() throws IOException;

    public abstract int x() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;
}
