package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes2.dex */
public abstract class k extends ci.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f6720b = Logger.getLogger(k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f6721c = r1.f6753e;

    /* renamed from: a, reason: collision with root package name */
    public l f6722a;

    public static class a extends k {

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f6723d;

        /* renamed from: e, reason: collision with root package name */
        public final int f6724e;

        /* renamed from: f, reason: collision with root package name */
        public int f6725f;

        public a(byte[] bArr, int i10) {
            if (((bArr.length - i10) | i10) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            this.f6723d = bArr;
            this.f6725f = 0;
            this.f6724e = i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void U(byte b10) throws IOException {
            try {
                byte[] bArr = this.f6723d;
                int i10 = this.f6725f;
                this.f6725f = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6725f), Integer.valueOf(this.f6724e), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void V(int i10, boolean z10) throws IOException {
            h0(i10, 0);
            U(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void W(int i10, h hVar) throws IOException {
            h0(i10, 2);
            j0(hVar.size());
            hVar.n(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void X(int i10, int i11) throws IOException {
            h0(i10, 5);
            Y(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void Y(int i10) throws IOException {
            try {
                byte[] bArr = this.f6723d;
                int i11 = this.f6725f;
                int i12 = i11 + 1;
                this.f6725f = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f6725f = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f6725f = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f6725f = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6725f), Integer.valueOf(this.f6724e), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void Z(int i10, long j10) throws IOException {
            h0(i10, 1);
            a0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void a0(long j10) throws IOException {
            try {
                byte[] bArr = this.f6723d;
                int i10 = this.f6725f;
                int i11 = i10 + 1;
                this.f6725f = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f6725f = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f6725f = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f6725f = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f6725f = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f6725f = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f6725f = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f6725f = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6725f), Integer.valueOf(this.f6724e), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void b0(int i10, int i11) throws IOException {
            h0(i10, 0);
            c0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void c0(int i10) throws IOException {
            if (i10 >= 0) {
                j0(i10);
            } else {
                l0(i10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void d0(int i10, p0 p0Var, g1 g1Var) throws IOException {
            h0(i10, 2);
            j0(((com.google.crypto.tink.shaded.protobuf.a) p0Var).c(g1Var));
            g1Var.d(p0Var, this.f6722a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void e0(int i10, p0 p0Var) throws IOException {
            h0(1, 3);
            i0(2, i10);
            h0(3, 2);
            j0(p0Var.getSerializedSize());
            p0Var.a(this);
            h0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void f0(int i10, h hVar) throws IOException {
            h0(1, 3);
            i0(2, i10);
            W(3, hVar);
            h0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void g0(int i10, String str) throws IOException {
            h0(i10, 2);
            int i11 = this.f6725f;
            try {
                int iS = k.S(str.length() * 3);
                int iS2 = k.S(str.length());
                byte[] bArr = this.f6723d;
                if (iS2 != iS) {
                    j0(s1.b(str));
                    this.f6725f = s1.f6761a.b(str, bArr, this.f6725f, m0());
                    return;
                }
                int i12 = i11 + iS2;
                this.f6725f = i12;
                int iB = s1.f6761a.b(str, bArr, i12, m0());
                this.f6725f = i11;
                j0((iB - i11) - iS2);
                this.f6725f = iB;
            } catch (s1.d e10) {
                this.f6725f = i11;
                k.f6720b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                byte[] bytes = str.getBytes(y.f6818a);
                try {
                    j0(bytes.length);
                    n0(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e11) {
                    throw new b(e11);
                }
            } catch (IndexOutOfBoundsException e12) {
                throw new b(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void h0(int i10, int i11) throws IOException {
            j0((i10 << 3) | i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void i0(int i10, int i11) throws IOException {
            h0(i10, 0);
            j0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void j0(int i10) throws IOException {
            while (true) {
                int i11 = i10 & (-128);
                byte[] bArr = this.f6723d;
                if (i11 == 0) {
                    int i12 = this.f6725f;
                    this.f6725f = i12 + 1;
                    bArr[i12] = (byte) i10;
                    return;
                } else {
                    try {
                        int i13 = this.f6725f;
                        this.f6725f = i13 + 1;
                        bArr[i13] = (byte) ((i10 & CertificateBody.profileType) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6725f), Integer.valueOf(this.f6724e), 1), e10);
                    }
                }
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6725f), Integer.valueOf(this.f6724e), 1), e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void k0(int i10, long j10) throws IOException {
            h0(i10, 0);
            l0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k
        public final void l0(long j10) throws IOException {
            boolean z10 = k.f6721c;
            byte[] bArr = this.f6723d;
            if (z10 && m0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    int i10 = this.f6725f;
                    this.f6725f = i10 + 1;
                    r1.k(bArr, i10, (byte) ((((int) j10) & CertificateBody.profileType) | 128));
                    j10 >>>= 7;
                }
                int i11 = this.f6725f;
                this.f6725f = i11 + 1;
                r1.k(bArr, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = this.f6725f;
                    this.f6725f = i12 + 1;
                    bArr[i12] = (byte) ((((int) j10) & CertificateBody.profileType) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6725f), Integer.valueOf(this.f6724e), 1), e10);
                }
            }
            int i13 = this.f6725f;
            this.f6725f = i13 + 1;
            bArr[i13] = (byte) j10;
        }

        public final int m0() {
            return this.f6724e - this.f6725f;
        }

        public final void n0(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f6723d, this.f6725f, i11);
                this.f6725f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6725f), Integer.valueOf(this.f6724e), Integer.valueOf(i11)), e10);
            }
        }
    }

    public static class b extends IOException {
        public b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public b(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static int I(int i10, h hVar) {
        return J(hVar) + Q(i10);
    }

    public static int J(h hVar) {
        int size = hVar.size();
        return S(size) + size;
    }

    public static int K(int i10) {
        return Q(i10) + 4;
    }

    public static int L(int i10) {
        return Q(i10) + 8;
    }

    @Deprecated
    public static int M(int i10, p0 p0Var, g1 g1Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) p0Var).c(g1Var) + (Q(i10) * 2);
    }

    public static int N(int i10) {
        if (i10 >= 0) {
            return S(i10);
        }
        return 10;
    }

    public static int O(c0 c0Var) {
        int size = c0Var.f6637b != null ? c0Var.f6637b.size() : c0Var.f6636a != null ? c0Var.f6636a.getSerializedSize() : 0;
        return S(size) + size;
    }

    public static int P(String str) {
        int length;
        try {
            length = s1.b(str);
        } catch (s1.d unused) {
            length = str.getBytes(y.f6818a).length;
        }
        return S(length) + length;
    }

    public static int Q(int i10) {
        return S(i10 << 3);
    }

    public static int R(int i10, int i11) {
        return S(i11) + Q(i10);
    }

    public static int S(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int T(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract void U(byte b10) throws IOException;

    public abstract void V(int i10, boolean z10) throws IOException;

    public abstract void W(int i10, h hVar) throws IOException;

    public abstract void X(int i10, int i11) throws IOException;

    public abstract void Y(int i10) throws IOException;

    public abstract void Z(int i10, long j10) throws IOException;

    public abstract void a0(long j10) throws IOException;

    public abstract void b0(int i10, int i11) throws IOException;

    public abstract void c0(int i10) throws IOException;

    public abstract void d0(int i10, p0 p0Var, g1 g1Var) throws IOException;

    public abstract void e0(int i10, p0 p0Var) throws IOException;

    public abstract void f0(int i10, h hVar) throws IOException;

    public abstract void g0(int i10, String str) throws IOException;

    public abstract void h0(int i10, int i11) throws IOException;

    public abstract void i0(int i10, int i11) throws IOException;

    public abstract void j0(int i10) throws IOException;

    public abstract void k0(int i10, long j10) throws IOException;

    public abstract void l0(long j10) throws IOException;
}
