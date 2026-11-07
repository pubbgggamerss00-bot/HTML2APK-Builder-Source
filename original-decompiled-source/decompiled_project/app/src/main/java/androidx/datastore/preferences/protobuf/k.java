package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.a2;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public int f2048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2049b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f2050c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public l f2051d;

    public static final class a extends k {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f2052e;

        /* renamed from: f, reason: collision with root package name */
        public int f2053f;

        /* renamed from: g, reason: collision with root package name */
        public int f2054g;

        /* renamed from: h, reason: collision with root package name */
        public int f2055h;

        /* renamed from: i, reason: collision with root package name */
        public final int f2056i;

        /* renamed from: j, reason: collision with root package name */
        public int f2057j;

        /* renamed from: k, reason: collision with root package name */
        public int f2058k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f2052e = bArr;
            this.f2053f = i11 + i10;
            this.f2055h = i10;
            this.f2056i = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int A() throws IOException {
            return k.c(w());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long B() throws IOException {
            return k.d(L());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final String C() throws IOException {
            int iW = w();
            if (iW > 0) {
                int i10 = this.f2053f;
                int i11 = this.f2055h;
                if (iW <= i10 - i11) {
                    String str = new String(this.f2052e, i11, iW, d0.f2005a);
                    this.f2055h += iW;
                    return str;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW < 0) {
                throw e0.e();
            }
            throw e0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final String D() throws IOException {
            int iW = w();
            if (iW > 0) {
                int i10 = this.f2053f;
                int i11 = this.f2055h;
                if (iW <= i10 - i11) {
                    String strA = a2.f1951a.a(this.f2052e, i11, iW);
                    this.f2055h += iW;
                    return strA;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW <= 0) {
                throw e0.e();
            }
            throw e0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int E() throws IOException {
            if (g()) {
                this.f2057j = 0;
                return 0;
            }
            int iW = w();
            this.f2057j = iW;
            if ((iW >>> 3) != 0) {
                return iW;
            }
            throw e0.a();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int F() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long G() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean H(int i10) throws IOException {
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 != 0) {
                if (i11 == 1) {
                    O(8);
                    return true;
                }
                if (i11 == 2) {
                    O(w());
                    return true;
                }
                if (i11 == 3) {
                    I();
                    a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw e0.c();
                }
                O(4);
                return true;
            }
            int i13 = this.f2053f - this.f2055h;
            byte[] bArr = this.f2052e;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f2055h;
                    this.f2055h = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw e0.d();
            }
            while (i12 < 10) {
                int i15 = this.f2055h;
                if (i15 == this.f2053f) {
                    throw e0.g();
                }
                this.f2055h = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw e0.d();
            return true;
        }

        public final int J() throws IOException {
            int i10 = this.f2055h;
            if (this.f2053f - i10 < 4) {
                throw e0.g();
            }
            this.f2055h = i10 + 4;
            byte[] bArr = this.f2052e;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long K() throws IOException {
            int i10 = this.f2055h;
            if (this.f2053f - i10 < 8) {
                throw e0.g();
            }
            this.f2055h = i10 + 8;
            byte[] bArr = this.f2052e;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public final long L() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f2055h;
            int i11 = this.f2053f;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f2052e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f2055h = i12;
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
                    this.f2055h = i13;
                    return j10;
                }
            }
            return M();
        }

        public final long M() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f2055h;
                if (i11 == this.f2053f) {
                    throw e0.g();
                }
                this.f2055h = i11 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((this.f2052e[i11] & 128) == 0) {
                    return j10;
                }
            }
            throw e0.d();
        }

        public final void N() {
            int i10 = this.f2053f + this.f2054g;
            this.f2053f = i10;
            int i11 = i10 - this.f2056i;
            int i12 = this.f2058k;
            if (i11 <= i12) {
                this.f2054g = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f2054g = i13;
            this.f2053f = i10 - i13;
        }

        public final void O(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f2053f;
                int i12 = this.f2055h;
                if (i10 <= i11 - i12) {
                    this.f2055h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw e0.g();
            }
            throw e0.e();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void a(int i10) throws e0 {
            if (this.f2057j != i10) {
                throw new e0("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int e() {
            int i10 = this.f2058k;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - f();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int f() {
            return this.f2055h - this.f2056i;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean g() throws IOException {
            return this.f2055h == this.f2053f;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void j(int i10) {
            this.f2058k = i10;
            N();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int k(int i10) throws e0 {
            if (i10 < 0) {
                throw e0.e();
            }
            int iF = f() + i10;
            if (iF < 0) {
                throw e0.f();
            }
            int i11 = this.f2058k;
            if (iF > i11) {
                throw e0.g();
            }
            this.f2058k = iF;
            N();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean l() throws IOException {
            return L() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // androidx.datastore.preferences.protobuf.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final j.f m() throws IOException {
            byte[] bArrCopyOfRange;
            int iW = w();
            byte[] bArr = this.f2052e;
            if (iW > 0) {
                int i10 = this.f2053f;
                int i11 = this.f2055h;
                if (iW <= i10 - i11) {
                    j.f fVarC = j.c(i11, iW, bArr);
                    this.f2055h += iW;
                    return fVarC;
                }
            }
            if (iW == 0) {
                return j.f2038b;
            }
            if (iW > 0) {
                int i12 = this.f2053f;
                int i13 = this.f2055h;
                if (iW <= i12 - i13) {
                    int i14 = iW + i13;
                    this.f2055h = i14;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                } else {
                    if (iW > 0) {
                        throw e0.g();
                    }
                    if (iW != 0) {
                        throw e0.e();
                    }
                    bArrCopyOfRange = d0.f2006b;
                }
            }
            j.f fVar = j.f2038b;
            return new j.f(bArrCopyOfRange);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final double n() throws IOException {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int o() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int p() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long q() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final float r() throws IOException {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void s(int i10, MessageLite.Builder builder, t tVar) throws IOException {
            b();
            this.f2048a++;
            builder.mergeFrom(this, tVar);
            a((i10 << 3) | 4);
            this.f2048a--;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int t() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long u() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void v(MessageLite.Builder builder, t tVar) throws IOException {
            int iW = w();
            b();
            int iK = k(iW);
            this.f2048a++;
            builder.mergeFrom(this, tVar);
            a(0);
            this.f2048a--;
            if (e() != 0) {
                throw e0.g();
            }
            j(iK);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int w() throws IOException {
            int i10;
            int i11 = this.f2055h;
            int i12 = this.f2053f;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f2052e;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f2055h = i13;
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
                    this.f2055h = i14;
                    return i10;
                }
            }
            return (int) M();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int y() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long z() throws IOException {
            return K();
        }
    }

    public static final class b extends k {

        /* renamed from: e, reason: collision with root package name */
        public final InputStream f2059e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f2060f;

        /* renamed from: g, reason: collision with root package name */
        public int f2061g;

        /* renamed from: h, reason: collision with root package name */
        public int f2062h;

        /* renamed from: i, reason: collision with root package name */
        public int f2063i;

        /* renamed from: j, reason: collision with root package name */
        public int f2064j;

        /* renamed from: k, reason: collision with root package name */
        public int f2065k;

        /* renamed from: l, reason: collision with root package name */
        public int f2066l = Integer.MAX_VALUE;

        public b(InputStream inputStream) {
            d0.a(inputStream, "input");
            this.f2059e = inputStream;
            this.f2060f = new byte[4096];
            this.f2061g = 0;
            this.f2063i = 0;
            this.f2065k = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int A() throws IOException {
            return k.c(w());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long B() throws IOException {
            return k.d(O());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final String C() throws IOException {
            int iW = w();
            byte[] bArr = this.f2060f;
            if (iW > 0) {
                int i10 = this.f2061g;
                int i11 = this.f2063i;
                if (iW <= i10 - i11) {
                    String str = new String(bArr, i11, iW, d0.f2005a);
                    this.f2063i += iW;
                    return str;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW < 0) {
                throw e0.e();
            }
            if (iW > this.f2061g) {
                return new String(J(iW), d0.f2005a);
            }
            R(iW);
            String str2 = new String(bArr, this.f2063i, iW, d0.f2005a);
            this.f2063i += iW;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final String D() throws IOException {
            int iW = w();
            int i10 = this.f2063i;
            int i11 = this.f2061g;
            int i12 = i11 - i10;
            byte[] bArrJ = this.f2060f;
            if (iW <= i12 && iW > 0) {
                this.f2063i = i10 + iW;
            } else {
                if (iW == 0) {
                    return "";
                }
                if (iW < 0) {
                    throw e0.e();
                }
                i10 = 0;
                if (iW <= i11) {
                    R(iW);
                    this.f2063i = iW;
                } else {
                    bArrJ = J(iW);
                }
            }
            return a2.f1951a.a(bArrJ, i10, iW);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int E() throws IOException {
            if (g()) {
                this.f2064j = 0;
                return 0;
            }
            int iW = w();
            this.f2064j = iW;
            if ((iW >>> 3) != 0) {
                return iW;
            }
            throw e0.a();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int F() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean H(int i10) throws IOException {
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 != 0) {
                if (i11 == 1) {
                    S(8);
                    return true;
                }
                if (i11 == 2) {
                    S(w());
                    return true;
                }
                if (i11 == 3) {
                    I();
                    a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw e0.c();
                }
                S(4);
                return true;
            }
            int i13 = this.f2061g - this.f2063i;
            byte[] bArr = this.f2060f;
            if (i13 >= 10) {
                while (i12 < 10) {
                    int i14 = this.f2063i;
                    this.f2063i = i14 + 1;
                    if (bArr[i14] < 0) {
                        i12++;
                    }
                }
                throw e0.d();
            }
            while (i12 < 10) {
                if (this.f2063i == this.f2061g) {
                    R(1);
                }
                int i15 = this.f2063i;
                this.f2063i = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            }
            throw e0.d();
            return true;
        }

        public final byte[] J(int i10) throws IOException {
            byte[] bArrK = K(i10);
            if (bArrK != null) {
                return bArrK;
            }
            int i11 = this.f2063i;
            int i12 = this.f2061g;
            int length = i12 - i11;
            this.f2065k += i12;
            this.f2063i = 0;
            this.f2061g = 0;
            ArrayList arrayListL = L(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2060f, i11, bArr, 0, length);
            int size = arrayListL.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayListL.get(i13);
                i13++;
                byte[] bArr2 = (byte[]) obj;
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] K(int i10) throws IOException {
            if (i10 == 0) {
                return d0.f2006b;
            }
            if (i10 < 0) {
                throw e0.e();
            }
            int i11 = this.f2065k;
            int i12 = this.f2063i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f2050c > 0) {
                throw new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f2066l;
            if (i13 > i14) {
                S((i14 - i11) - i12);
                throw e0.g();
            }
            int i15 = this.f2061g - i12;
            int i16 = i10 - i15;
            InputStream inputStream = this.f2059e;
            if (i16 >= 4096) {
                try {
                    if (i16 > inputStream.available()) {
                        return null;
                    }
                } catch (e0 e10) {
                    e10.f2009a = true;
                    throw e10;
                }
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f2060f, this.f2063i, bArr, 0, i15);
            this.f2065k += this.f2061g;
            this.f2063i = 0;
            this.f2061g = 0;
            while (i15 < i10) {
                try {
                    int i17 = inputStream.read(bArr, i15, i10 - i15);
                    if (i17 == -1) {
                        throw e0.g();
                    }
                    this.f2065k += i17;
                    i15 += i17;
                } catch (e0 e11) {
                    e11.f2009a = true;
                    throw e11;
                }
            }
            return bArr;
        }

        public final ArrayList L(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f2059e.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw e0.g();
                    }
                    this.f2065k += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int M() throws IOException {
            int i10 = this.f2063i;
            if (this.f2061g - i10 < 4) {
                R(4);
                i10 = this.f2063i;
            }
            this.f2063i = i10 + 4;
            byte[] bArr = this.f2060f;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long N() throws IOException {
            int i10 = this.f2063i;
            if (this.f2061g - i10 < 8) {
                R(8);
                i10 = this.f2063i;
            }
            this.f2063i = i10 + 8;
            byte[] bArr = this.f2060f;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        public final long O() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f2063i;
            int i11 = this.f2061g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f2060f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f2063i = i12;
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
                    this.f2063i = i13;
                    return j10;
                }
            }
            return P();
        }

        public final long P() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f2063i == this.f2061g) {
                    R(1);
                }
                int i11 = this.f2063i;
                this.f2063i = i11 + 1;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((this.f2060f[i11] & 128) == 0) {
                    return j10;
                }
            }
            throw e0.d();
        }

        public final void Q() {
            int i10 = this.f2061g + this.f2062h;
            this.f2061g = i10;
            int i11 = this.f2065k + i10;
            int i12 = this.f2066l;
            if (i11 <= i12) {
                this.f2062h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f2062h = i13;
            this.f2061g = i10 - i13;
        }

        public final void R(int i10) throws IOException {
            if (T(i10)) {
                return;
            }
            if (i10 <= (this.f2050c - this.f2065k) - this.f2063i) {
                throw e0.g();
            }
            throw new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void S(int i10) throws IOException {
            int i11 = this.f2061g;
            int i12 = this.f2063i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f2063i = i12 + i10;
                return;
            }
            InputStream inputStream = this.f2059e;
            if (i10 < 0) {
                throw e0.e();
            }
            int i13 = this.f2065k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f2066l;
            if (i15 > i16) {
                S((i16 - i13) - i12);
                throw e0.g();
            }
            this.f2065k = i14;
            int i17 = i11 - i12;
            this.f2061g = 0;
            this.f2063i = 0;
            while (i17 < i10) {
                long j10 = i10 - i17;
                try {
                    try {
                        long jSkip = inputStream.skip(j10);
                        if (jSkip < 0 || jSkip > j10) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i17 += (int) jSkip;
                        }
                    } catch (e0 e10) {
                        e10.f2009a = true;
                        throw e10;
                    }
                } catch (Throwable th2) {
                    this.f2065k += i17;
                    Q();
                    throw th2;
                }
            }
            this.f2065k += i17;
            Q();
            if (i17 >= i10) {
                return;
            }
            int i18 = this.f2061g;
            int i19 = i18 - this.f2063i;
            this.f2063i = i18;
            R(1);
            while (true) {
                int i20 = i10 - i19;
                int i21 = this.f2061g;
                if (i20 <= i21) {
                    this.f2063i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f2063i = i21;
                    R(1);
                }
            }
        }

        public final boolean T(int i10) throws IOException {
            InputStream inputStream = this.f2059e;
            int i11 = this.f2063i;
            int i12 = i11 + i10;
            int i13 = this.f2061g;
            if (i12 <= i13) {
                throw new IllegalStateException(ad.b.b(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i14 = this.f2065k;
            int i15 = this.f2050c;
            if (i10 <= (i15 - i14) - i11 && i14 + i11 + i10 <= this.f2066l) {
                byte[] bArr = this.f2060f;
                if (i11 > 0) {
                    if (i13 > i11) {
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f2065k += i11;
                    this.f2061g -= i11;
                    this.f2063i = 0;
                }
                int i16 = this.f2061g;
                try {
                    int i17 = inputStream.read(bArr, i16, Math.min(bArr.length - i16, (i15 - this.f2065k) - i16));
                    if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i17 > 0) {
                        this.f2061g += i17;
                        Q();
                        if (this.f2061g >= i10) {
                            return true;
                        }
                        return T(i10);
                    }
                } catch (e0 e10) {
                    e10.f2009a = true;
                    throw e10;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void a(int i10) throws e0 {
            if (this.f2064j != i10) {
                throw new e0("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int e() {
            int i10 = this.f2066l;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f2065k + this.f2063i);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int f() {
            return this.f2065k + this.f2063i;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean g() throws IOException {
            return this.f2063i == this.f2061g && !T(1);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void j(int i10) {
            this.f2066l = i10;
            Q();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int k(int i10) throws e0 {
            if (i10 < 0) {
                throw e0.e();
            }
            int i11 = this.f2065k + this.f2063i + i10;
            if (i11 < 0) {
                throw e0.f();
            }
            int i12 = this.f2066l;
            if (i11 > i12) {
                throw e0.g();
            }
            this.f2066l = i11;
            Q();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean l() throws IOException {
            return O() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final j.f m() throws IOException {
            int iW = w();
            int i10 = this.f2061g;
            int i11 = this.f2063i;
            int i12 = i10 - i11;
            byte[] bArr = this.f2060f;
            if (iW <= i12 && iW > 0) {
                j.f fVarC = j.c(i11, iW, bArr);
                this.f2063i += iW;
                return fVarC;
            }
            if (iW == 0) {
                return j.f2038b;
            }
            if (iW < 0) {
                throw e0.e();
            }
            byte[] bArrK = K(iW);
            if (bArrK != null) {
                return j.c(0, bArrK.length, bArrK);
            }
            int i13 = this.f2063i;
            int i14 = this.f2061g;
            int length = i14 - i13;
            this.f2065k += i14;
            this.f2063i = 0;
            this.f2061g = 0;
            ArrayList arrayListL = L(iW - length);
            byte[] bArr2 = new byte[iW];
            System.arraycopy(bArr, i13, bArr2, 0, length);
            int size = arrayListL.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayListL.get(i15);
                i15++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            j.f fVar = j.f2038b;
            return new j.f(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final double n() throws IOException {
            return Double.longBitsToDouble(N());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int o() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int p() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long q() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final float r() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void s(int i10, MessageLite.Builder builder, t tVar) throws IOException {
            b();
            this.f2048a++;
            builder.mergeFrom(this, tVar);
            a((i10 << 3) | 4);
            this.f2048a--;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int t() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long u() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void v(MessageLite.Builder builder, t tVar) throws IOException {
            int iW = w();
            b();
            int iK = k(iW);
            this.f2048a++;
            builder.mergeFrom(this, tVar);
            a(0);
            this.f2048a--;
            if (e() != 0) {
                throw e0.g();
            }
            j(iK);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int w() throws IOException {
            int i10;
            int i11 = this.f2063i;
            int i12 = this.f2061g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f2060f;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f2063i = i13;
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
                    this.f2063i = i14;
                    return i10;
                }
            }
            return (int) P();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int y() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long z() throws IOException {
            return N();
        }
    }

    public static final class c extends k {

        /* renamed from: e, reason: collision with root package name */
        public final ByteBuffer f2067e;

        /* renamed from: f, reason: collision with root package name */
        public final long f2068f;

        /* renamed from: g, reason: collision with root package name */
        public long f2069g;

        /* renamed from: h, reason: collision with root package name */
        public long f2070h;

        /* renamed from: i, reason: collision with root package name */
        public final long f2071i;

        /* renamed from: j, reason: collision with root package name */
        public int f2072j;

        /* renamed from: k, reason: collision with root package name */
        public int f2073k;

        /* renamed from: l, reason: collision with root package name */
        public int f2074l = Integer.MAX_VALUE;

        public c(ByteBuffer byteBuffer, boolean z10) {
            this.f2067e = byteBuffer;
            long j10 = z1.f2186c.j(byteBuffer, z1.f2190g);
            this.f2068f = j10;
            this.f2069g = byteBuffer.limit() + j10;
            long jPosition = j10 + byteBuffer.position();
            this.f2070h = jPosition;
            this.f2071i = jPosition;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int A() throws IOException {
            return k.c(w());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long B() throws IOException {
            return k.d(L());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final String C() throws IOException {
            int iW = w();
            if (iW > 0) {
                long j10 = this.f2069g;
                long j11 = this.f2070h;
                if (iW <= ((int) (j10 - j11))) {
                    byte[] bArr = new byte[iW];
                    long j12 = iW;
                    z1.f2186c.c(j11, bArr, j12);
                    String str = new String(bArr, d0.f2005a);
                    this.f2070h += j12;
                    return str;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW < 0) {
                throw e0.e();
            }
            throw e0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final String D() throws IOException {
            int iW = w();
            if (iW > 0) {
                long j10 = this.f2069g;
                long j11 = this.f2070h;
                if (iW <= ((int) (j10 - j11))) {
                    int i10 = (int) (j11 - this.f2068f);
                    a2.b bVar = a2.f1951a;
                    bVar.getClass();
                    ByteBuffer byteBuffer = this.f2067e;
                    String strA = byteBuffer.hasArray() ? bVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + i10, iW) : byteBuffer.isDirect() ? bVar.c(byteBuffer, i10, iW) : a2.b.b(byteBuffer, i10, iW);
                    this.f2070h += iW;
                    return strA;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW <= 0) {
                throw e0.e();
            }
            throw e0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int E() throws IOException {
            if (g()) {
                this.f2073k = 0;
                return 0;
            }
            int iW = w();
            this.f2073k = iW;
            if ((iW >>> 3) != 0) {
                return iW;
            }
            throw e0.a();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int F() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long G() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean H(int i10) throws IOException {
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 != 0) {
                if (i11 == 1) {
                    O(8);
                    return true;
                }
                if (i11 == 2) {
                    O(w());
                    return true;
                }
                if (i11 == 3) {
                    I();
                    a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 5) {
                    throw e0.c();
                }
                O(4);
                return true;
            }
            if (((int) (this.f2069g - this.f2070h)) >= 10) {
                while (i12 < 10) {
                    long j10 = this.f2070h;
                    this.f2070h = j10 + 1;
                    if (z1.f2186c.e(j10) < 0) {
                        i12++;
                    }
                }
                throw e0.d();
            }
            while (i12 < 10) {
                long j11 = this.f2070h;
                if (j11 == this.f2069g) {
                    throw e0.g();
                }
                this.f2070h = j11 + 1;
                if (z1.f2186c.e(j11) < 0) {
                    i12++;
                }
            }
            throw e0.d();
            return true;
        }

        public final int J() throws IOException {
            long j10 = this.f2070h;
            if (this.f2069g - j10 < 4) {
                throw e0.g();
            }
            this.f2070h = 4 + j10;
            z1.e eVar = z1.f2186c;
            return ((eVar.e(j10 + 3) & 255) << 24) | (eVar.e(j10) & 255) | ((eVar.e(1 + j10) & 255) << 8) | ((eVar.e(2 + j10) & 255) << 16);
        }

        public final long K() throws IOException {
            long j10 = this.f2070h;
            if (this.f2069g - j10 < 8) {
                throw e0.g();
            }
            this.f2070h = 8 + j10;
            z1.e eVar = z1.f2186c;
            return ((eVar.e(j10 + 7) & 255) << 56) | (eVar.e(j10) & 255) | ((eVar.e(1 + j10) & 255) << 8) | ((eVar.e(2 + j10) & 255) << 16) | ((eVar.e(3 + j10) & 255) << 24) | ((eVar.e(4 + j10) & 255) << 32) | ((eVar.e(5 + j10) & 255) << 40) | ((eVar.e(6 + j10) & 255) << 48);
        }

        public final long L() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f2070h;
            if (this.f2069g != j13) {
                long j14 = 1 + j13;
                z1.e eVar = z1.f2186c;
                byte bE = eVar.e(j13);
                if (bE >= 0) {
                    this.f2070h = j14;
                    return bE;
                }
                if (this.f2069g - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iE = (eVar.e(j14) << 7) ^ bE;
                    if (iE >= 0) {
                        long j16 = 3 + j13;
                        int iE2 = iE ^ (eVar.e(j15) << RegisterType.DOUBLE_LO);
                        if (iE2 >= 0) {
                            j10 = iE2 ^ 16256;
                        } else {
                            j15 = j13 + 4;
                            int iE3 = iE2 ^ (eVar.e(j16) << 21);
                            if (iE3 < 0) {
                                i10 = (-2080896) ^ iE3;
                            } else {
                                j16 = 5 + j13;
                                long jE = iE3 ^ (eVar.e(j15) << 28);
                                if (jE < 0) {
                                    long j17 = 6 + j13;
                                    long jE2 = jE ^ (eVar.e(j16) << 35);
                                    if (jE2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j16 = 7 + j13;
                                        jE = jE2 ^ (eVar.e(j17) << 42);
                                        if (jE >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j17 = 8 + j13;
                                            jE2 = jE ^ (eVar.e(j16) << 49);
                                            if (jE2 >= 0) {
                                                long j18 = j13 + 9;
                                                long jE3 = (jE2 ^ (eVar.e(j17) << 56)) ^ 71499008037633920L;
                                                if (jE3 < 0) {
                                                    long j19 = j13 + 10;
                                                    if (eVar.e(j18) >= 0) {
                                                        j15 = j19;
                                                        j10 = jE3;
                                                    }
                                                } else {
                                                    j10 = jE3;
                                                    j15 = j18;
                                                }
                                                this.f2070h = j15;
                                                return j10;
                                            }
                                            j11 = -558586000294016L;
                                        }
                                    }
                                    j10 = j11 ^ jE2;
                                    j15 = j17;
                                    this.f2070h = j15;
                                    return j10;
                                }
                                j12 = 266354560;
                                j10 = j12 ^ jE;
                            }
                        }
                        j15 = j16;
                        this.f2070h = j15;
                        return j10;
                    }
                    i10 = iE ^ (-128);
                    j10 = i10;
                    this.f2070h = j15;
                    return j10;
                }
            }
            return M();
        }

        public final long M() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                long j11 = this.f2070h;
                if (j11 == this.f2069g) {
                    throw e0.g();
                }
                this.f2070h = 1 + j11;
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((z1.f2186c.e(j11) & 128) == 0) {
                    return j10;
                }
            }
            throw e0.d();
        }

        public final void N() {
            long j10 = this.f2069g + this.f2072j;
            this.f2069g = j10;
            int i10 = (int) (j10 - this.f2071i);
            int i11 = this.f2074l;
            if (i10 <= i11) {
                this.f2072j = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f2072j = i12;
            this.f2069g = j10 - i12;
        }

        public final void O(int i10) throws IOException {
            if (i10 >= 0) {
                long j10 = this.f2069g;
                long j11 = this.f2070h;
                if (i10 <= ((int) (j10 - j11))) {
                    this.f2070h = j11 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw e0.g();
            }
            throw e0.e();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void a(int i10) throws e0 {
            if (this.f2073k != i10) {
                throw new e0("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int e() {
            int i10 = this.f2074l;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - f();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int f() {
            return (int) (this.f2070h - this.f2071i);
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean g() throws IOException {
            return this.f2070h == this.f2069g;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void j(int i10) {
            this.f2074l = i10;
            N();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int k(int i10) throws e0 {
            if (i10 < 0) {
                throw e0.e();
            }
            int iF = f() + i10;
            int i11 = this.f2074l;
            if (iF > i11) {
                throw e0.g();
            }
            this.f2074l = iF;
            N();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final boolean l() throws IOException {
            return L() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final j.f m() throws IOException {
            int iW = w();
            if (iW > 0) {
                long j10 = this.f2069g;
                long j11 = this.f2070h;
                if (iW <= ((int) (j10 - j11))) {
                    byte[] bArr = new byte[iW];
                    long j12 = iW;
                    z1.f2186c.c(j11, bArr, j12);
                    this.f2070h += j12;
                    j.f fVar = j.f2038b;
                    return new j.f(bArr);
                }
            }
            if (iW == 0) {
                return j.f2038b;
            }
            if (iW < 0) {
                throw e0.e();
            }
            throw e0.g();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final double n() throws IOException {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int o() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int p() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long q() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final float r() throws IOException {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void s(int i10, MessageLite.Builder builder, t tVar) throws IOException {
            b();
            this.f2048a++;
            builder.mergeFrom(this, tVar);
            a((i10 << 3) | 4);
            this.f2048a--;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int t() throws IOException {
            return w();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long u() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void v(MessageLite.Builder builder, t tVar) throws IOException {
            int iW = w();
            b();
            int iK = k(iW);
            this.f2048a++;
            builder.mergeFrom(this, tVar);
            a(0);
            this.f2048a--;
            if (e() != 0) {
                throw e0.g();
            }
            j(iK);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.e(r8) < 0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
          0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // androidx.datastore.preferences.protobuf.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int w() throws IOException {
            int i10;
            long j10 = this.f2070h;
            if (this.f2069g != j10) {
                long j11 = 1 + j10;
                z1.e eVar = z1.f2186c;
                byte bE = eVar.e(j10);
                if (bE >= 0) {
                    this.f2070h = j11;
                    return bE;
                }
                if (this.f2069g - j11 >= 9) {
                    long j12 = 2 + j10;
                    int iE = (eVar.e(j11) << 7) ^ bE;
                    if (iE < 0) {
                        i10 = iE ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int iE2 = iE ^ (eVar.e(j12) << RegisterType.DOUBLE_LO);
                        if (iE2 >= 0) {
                            i10 = iE2 ^ 16256;
                        } else {
                            j12 = j10 + 4;
                            int iE3 = iE2 ^ (eVar.e(j13) << 21);
                            if (iE3 < 0) {
                                i10 = (-2080896) ^ iE3;
                            } else {
                                j13 = 5 + j10;
                                byte bE2 = eVar.e(j12);
                                int i11 = (iE3 ^ (bE2 << 28)) ^ 266354560;
                                if (bE2 < 0) {
                                    j12 = j10 + 6;
                                    if (eVar.e(j13) < 0) {
                                        j13 = 7 + j10;
                                        if (eVar.e(j12) < 0) {
                                            j12 = j10 + 8;
                                            if (eVar.e(j13) < 0) {
                                                long j14 = 9 + j10;
                                                if (eVar.e(j12) < 0) {
                                                    j12 = j10 + 10;
                                                } else {
                                                    i10 = i11;
                                                    j12 = j14;
                                                }
                                            } else {
                                                i10 = i11;
                                            }
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                        }
                        j12 = j13;
                    }
                    this.f2070h = j12;
                    return i10;
                }
            }
            return (int) M();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final int y() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final long z() throws IOException {
            return K();
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static a h(byte[] bArr, int i10, int i11, boolean z10) {
        a aVar = new a(bArr, i10, i11, z10);
        try {
            aVar.k(i11);
            return aVar;
        } catch (e0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static k i(InputStream inputStream) {
        if (inputStream != null) {
            return new b(inputStream);
        }
        byte[] bArr = d0.f2006b;
        return h(bArr, 0, bArr.length, false);
    }

    public static int x(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & CertificateBody.profileType;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw e0.g();
            }
            i11 |= (i13 & CertificateBody.profileType) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw e0.g();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw e0.d();
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract String C() throws IOException;

    public abstract String D() throws IOException;

    public abstract int E() throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract boolean H(int i10) throws IOException;

    public final void I() throws IOException {
        int iE;
        do {
            iE = E();
            if (iE == 0) {
                return;
            }
            b();
            this.f2048a++;
            this.f2048a--;
        } while (H(iE));
    }

    public abstract void a(int i10) throws e0;

    public final void b() throws e0 {
        if (this.f2048a >= this.f2049b) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g() throws IOException;

    public abstract void j(int i10);

    public abstract int k(int i10) throws e0;

    public abstract boolean l() throws IOException;

    public abstract j.f m() throws IOException;

    public abstract double n() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract float r() throws IOException;

    public abstract void s(int i10, MessageLite.Builder builder, t tVar) throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract void v(MessageLite.Builder builder, t tVar) throws IOException;

    public abstract int w() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;
}
