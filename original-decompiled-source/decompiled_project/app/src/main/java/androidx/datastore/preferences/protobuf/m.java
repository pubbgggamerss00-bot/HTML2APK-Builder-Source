package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a2;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class m extends g {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f2085b = Logger.getLogger(m.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2086c = z1.f2188e;

    /* renamed from: a, reason: collision with root package name */
    public n f2087a;

    public static abstract class a extends m {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f2088d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2089e;

        /* renamed from: f, reason: collision with root package name */
        public int f2090f;

        public a(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f2088d = bArr;
            this.f2089e = bArr.length;
        }

        public final void G(int i10) {
            int i11 = this.f2090f;
            int i12 = i11 + 1;
            this.f2090f = i12;
            byte[] bArr = this.f2088d;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f2090f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f2090f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f2090f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        public final void H(long j10) {
            int i10 = this.f2090f;
            int i11 = i10 + 1;
            this.f2090f = i11;
            byte[] bArr = this.f2088d;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f2090f = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f2090f = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f2090f = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f2090f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f2090f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f2090f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f2090f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        }

        public final void I(int i10, int i11) {
            J((i10 << 3) | i11);
        }

        public final void J(int i10) {
            boolean z10 = m.f2086c;
            byte[] bArr = this.f2088d;
            if (z10) {
                while ((i10 & (-128)) != 0) {
                    int i11 = this.f2090f;
                    this.f2090f = i11 + 1;
                    z1.k(bArr, i11, (byte) ((i10 | 128) & 255));
                    i10 >>>= 7;
                }
                int i12 = this.f2090f;
                this.f2090f = i12 + 1;
                z1.k(bArr, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                int i13 = this.f2090f;
                this.f2090f = i13 + 1;
                bArr[i13] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            }
            int i14 = this.f2090f;
            this.f2090f = i14 + 1;
            bArr[i14] = (byte) i10;
        }

        public final void K(long j10) {
            boolean z10 = m.f2086c;
            byte[] bArr = this.f2088d;
            if (z10) {
                while ((j10 & (-128)) != 0) {
                    int i10 = this.f2090f;
                    this.f2090f = i10 + 1;
                    z1.k(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                int i11 = this.f2090f;
                this.f2090f = i11 + 1;
                z1.k(bArr, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                int i12 = this.f2090f;
                this.f2090f = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) | 128) & 255);
                j10 >>>= 7;
            }
            int i13 = this.f2090f;
            this.f2090f = i13 + 1;
            bArr[i13] = (byte) j10;
        }
    }

    public static class b extends m {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f2091d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2092e;

        /* renamed from: f, reason: collision with root package name */
        public int f2093f;

        public b(byte[] bArr, int i10) {
            if (((bArr.length - i10) | i10) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.f2091d = bArr;
            this.f2093f = 0;
            this.f2092e = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void A(String str) throws IOException {
            int i10 = this.f2093f;
            try {
                int iH = m.h(str.length() * 3);
                int iH2 = m.h(str.length());
                byte[] bArr = this.f2091d;
                if (iH2 != iH) {
                    D(a2.b(str));
                    this.f2093f = a2.f1951a.d(str, bArr, this.f2093f, G());
                    return;
                }
                int i11 = i10 + iH2;
                this.f2093f = i11;
                int iD = a2.f1951a.d(str, bArr, i11, G());
                this.f2093f = i10;
                D((iD - i10) - iH2);
                this.f2093f = iD;
            } catch (a2.d e10) {
                this.f2093f = i10;
                j(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void B(int i10, int i11) throws IOException {
            D((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void C(int i10, int i11) throws IOException {
            B(i10, 0);
            D(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void D(int i10) throws IOException {
            while (true) {
                int i11 = i10 & (-128);
                byte[] bArr = this.f2091d;
                if (i11 == 0) {
                    int i12 = this.f2093f;
                    this.f2093f = i12 + 1;
                    bArr[i12] = (byte) i10;
                    return;
                } else {
                    try {
                        int i13 = this.f2093f;
                        this.f2093f = i13 + 1;
                        bArr[i13] = (byte) ((i10 | 128) & 255);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093f), Integer.valueOf(this.f2092e), 1), e10);
                    }
                }
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093f), Integer.valueOf(this.f2092e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void E(int i10, long j10) throws IOException {
            B(i10, 0);
            F(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void F(long j10) throws IOException {
            boolean z10 = m.f2086c;
            byte[] bArr = this.f2091d;
            if (z10 && G() >= 10) {
                while ((j10 & (-128)) != 0) {
                    int i10 = this.f2093f;
                    this.f2093f = i10 + 1;
                    z1.k(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                int i11 = this.f2093f;
                this.f2093f = i11 + 1;
                z1.k(bArr, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = this.f2093f;
                    this.f2093f = i12 + 1;
                    bArr[i12] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093f), Integer.valueOf(this.f2092e), 1), e10);
                }
            }
            int i13 = this.f2093f;
            this.f2093f = i13 + 1;
            bArr[i13] = (byte) j10;
        }

        public final int G() {
            return this.f2092e - this.f2093f;
        }

        public final void H(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f2091d, this.f2093f, i11);
                this.f2093f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093f), Integer.valueOf(this.f2092e), Integer.valueOf(i11)), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            H(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void k(byte b10) throws IOException {
            try {
                byte[] bArr = this.f2091d;
                int i10 = this.f2093f;
                this.f2093f = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093f), Integer.valueOf(this.f2092e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void l(int i10, boolean z10) throws IOException {
            B(i10, 0);
            k(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void m(int i10, byte[] bArr) throws IOException {
            D(i10);
            H(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void n(int i10, j jVar) throws IOException {
            B(i10, 2);
            o(jVar);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void o(j jVar) throws IOException {
            D(jVar.size());
            jVar.o(this);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void p(int i10, int i11) throws IOException {
            B(i10, 5);
            q(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void q(int i10) throws IOException {
            try {
                byte[] bArr = this.f2091d;
                int i11 = this.f2093f;
                int i12 = i11 + 1;
                this.f2093f = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f2093f = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f2093f = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f2093f = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093f), Integer.valueOf(this.f2092e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void r(int i10, long j10) throws IOException {
            B(i10, 1);
            s(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void s(long j10) throws IOException {
            try {
                byte[] bArr = this.f2091d;
                int i10 = this.f2093f;
                int i11 = i10 + 1;
                this.f2093f = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f2093f = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f2093f = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f2093f = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f2093f = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f2093f = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f2093f = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f2093f = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2093f), Integer.valueOf(this.f2092e), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void t(int i10, int i11) throws IOException {
            B(i10, 0);
            u(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void u(int i10) throws IOException {
            if (i10 >= 0) {
                D(i10);
            } else {
                F(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void v(int i10, MessageLite messageLite, o1 o1Var) throws IOException {
            B(i10, 2);
            D(((AbstractMessageLite) messageLite).getSerializedSize(o1Var));
            o1Var.c(messageLite, this.f2087a);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void w(MessageLite messageLite) throws IOException {
            D(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void x(int i10, MessageLite messageLite) throws IOException {
            B(1, 3);
            C(2, i10);
            B(3, 2);
            w(messageLite);
            B(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void y(int i10, j jVar) throws IOException {
            B(1, 3);
            C(2, i10);
            n(3, jVar);
            B(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void z(int i10, String str) throws IOException {
            B(i10, 2);
            A(str);
        }
    }

    public static class c extends IOException {
        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static final class d extends a {

        /* renamed from: g, reason: collision with root package name */
        public final OutputStream f2094g;

        public d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f2094g = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void A(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iH = m.h(length);
                int i10 = iH + length;
                int i11 = this.f2089e;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iD = a2.f1951a.d(str, bArr, 0, length);
                    D(iD);
                    N(bArr, 0, iD);
                    return;
                }
                if (i10 > i11 - this.f2090f) {
                    L();
                }
                int iH2 = m.h(str.length());
                int i12 = this.f2090f;
                byte[] bArr2 = this.f2088d;
                try {
                    if (iH2 == iH) {
                        int i13 = i12 + iH2;
                        this.f2090f = i13;
                        int iD2 = a2.f1951a.d(str, bArr2, i13, i11 - i13);
                        this.f2090f = i12;
                        J((iD2 - i12) - iH2);
                        this.f2090f = iD2;
                    } else {
                        int iB = a2.b(str);
                        J(iB);
                        this.f2090f = a2.f1951a.d(str, bArr2, this.f2090f, iB);
                    }
                } catch (a2.d e10) {
                    this.f2090f = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new c(e11);
                }
            } catch (a2.d e12) {
                j(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void B(int i10, int i11) throws IOException {
            D((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void C(int i10, int i11) throws IOException {
            M(20);
            I(i10, 0);
            J(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void D(int i10) throws IOException {
            M(5);
            J(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void E(int i10, long j10) throws IOException {
            M(20);
            I(i10, 0);
            K(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void F(long j10) throws IOException {
            M(10);
            K(j10);
        }

        public final void L() throws IOException {
            this.f2094g.write(this.f2088d, 0, this.f2090f);
            this.f2090f = 0;
        }

        public final void M(int i10) throws IOException {
            if (this.f2089e - this.f2090f < i10) {
                L();
            }
        }

        public final void N(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f2090f;
            int i13 = this.f2089e;
            int i14 = i13 - i12;
            byte[] bArr2 = this.f2088d;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f2090f += i11;
                return;
            }
            System.arraycopy(bArr, i10, bArr2, i12, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f2090f = i13;
            L();
            if (i16 > i13) {
                this.f2094g.write(bArr, i15, i16);
            } else {
                System.arraycopy(bArr, i15, bArr2, 0, i16);
                this.f2090f = i16;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            N(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void k(byte b10) throws IOException {
            if (this.f2090f == this.f2089e) {
                L();
            }
            int i10 = this.f2090f;
            this.f2090f = i10 + 1;
            this.f2088d[i10] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void l(int i10, boolean z10) throws IOException {
            M(11);
            I(i10, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            int i11 = this.f2090f;
            this.f2090f = i11 + 1;
            this.f2088d[i11] = b10;
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void m(int i10, byte[] bArr) throws IOException {
            D(i10);
            N(bArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void n(int i10, j jVar) throws IOException {
            B(i10, 2);
            o(jVar);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void o(j jVar) throws IOException {
            D(jVar.size());
            jVar.o(this);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void p(int i10, int i11) throws IOException {
            M(14);
            I(i10, 5);
            G(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void q(int i10) throws IOException {
            M(4);
            G(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void r(int i10, long j10) throws IOException {
            M(18);
            I(i10, 1);
            H(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void s(long j10) throws IOException {
            M(8);
            H(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void t(int i10, int i11) throws IOException {
            M(20);
            I(i10, 0);
            if (i11 >= 0) {
                J(i11);
            } else {
                K(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void u(int i10) throws IOException {
            if (i10 >= 0) {
                D(i10);
            } else {
                F(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void v(int i10, MessageLite messageLite, o1 o1Var) throws IOException {
            B(i10, 2);
            D(((AbstractMessageLite) messageLite).getSerializedSize(o1Var));
            o1Var.c(messageLite, this.f2087a);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void w(MessageLite messageLite) throws IOException {
            D(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void x(int i10, MessageLite messageLite) throws IOException {
            B(1, 3);
            C(2, i10);
            B(3, 2);
            w(messageLite);
            B(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void y(int i10, j jVar) throws IOException {
            B(1, 3);
            C(2, i10);
            n(3, jVar);
            B(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.m
        public final void z(int i10, String str) throws IOException {
            B(i10, 2);
            A(str);
        }
    }

    public static int b(int i10, j jVar) {
        int iG = g(i10);
        int size = jVar.size();
        return h(size) + size + iG;
    }

    public static int c(i0 i0Var) {
        int size = i0Var.f2037b != null ? i0Var.f2037b.size() : i0Var.f2036a != null ? i0Var.f2036a.getSerializedSize() : 0;
        return h(size) + size;
    }

    public static int d(int i10) {
        return h((i10 >> 31) ^ (i10 << 1));
    }

    public static int e(long j10) {
        return i((j10 >> 63) ^ (j10 << 1));
    }

    public static int f(String str) {
        int length;
        try {
            length = a2.b(str);
        } catch (a2.d unused) {
            length = str.getBytes(d0.f2005a).length;
        }
        return h(length) + length;
    }

    public static int g(int i10) {
        return h(i10 << 3);
    }

    public static int h(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int i(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public abstract void A(String str) throws IOException;

    public abstract void B(int i10, int i11) throws IOException;

    public abstract void C(int i10, int i11) throws IOException;

    public abstract void D(int i10) throws IOException;

    public abstract void E(int i10, long j10) throws IOException;

    public abstract void F(long j10) throws IOException;

    public final void j(String str, a2.d dVar) throws IOException {
        f2085b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(d0.f2005a);
        try {
            D(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    public abstract void k(byte b10) throws IOException;

    public abstract void l(int i10, boolean z10) throws IOException;

    public abstract void m(int i10, byte[] bArr) throws IOException;

    public abstract void n(int i10, j jVar) throws IOException;

    public abstract void o(j jVar) throws IOException;

    public abstract void p(int i10, int i11) throws IOException;

    public abstract void q(int i10) throws IOException;

    public abstract void r(int i10, long j10) throws IOException;

    public abstract void s(long j10) throws IOException;

    public abstract void t(int i10, int i11) throws IOException;

    public abstract void u(int i10) throws IOException;

    public abstract void v(int i10, MessageLite messageLite, o1 o1Var) throws IOException;

    public abstract void w(MessageLite messageLite) throws IOException;

    public abstract void x(int i10, MessageLite messageLite) throws IOException;

    public abstract void y(int i10, j jVar) throws IOException;

    public abstract void z(int i10, String str) throws IOException;
}
