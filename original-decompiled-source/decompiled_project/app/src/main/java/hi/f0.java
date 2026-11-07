package hi;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public final class f0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f13057a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13058b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13059c;

    public f0(l0 source) {
        kotlin.jvm.internal.r.e(source, "source");
        this.f13057a = source;
        this.f13058b = new g();
    }

    @Override // hi.i
    public final boolean A0(long j10, j bytes) {
        kotlin.jvm.internal.r.e(bytes, "bytes");
        int iD = bytes.d();
        if (this.f13059c) {
            throw new IllegalStateException("closed");
        }
        if (j10 >= 0 && iD >= 0 && bytes.d() >= iD) {
            for (int i10 = 0; i10 < iD; i10++) {
                long j11 = i10 + j10;
                if (Y(1 + j11) && this.f13058b.z(j11) == bytes.i(i10)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // hi.i
    public final int D(z options) throws EOFException {
        kotlin.jvm.internal.r.e(options, "options");
        if (this.f13059c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            g gVar = this.f13058b;
            int iB = ii.a.b(gVar, options, true);
            if (iB != -2) {
                if (iB != -1) {
                    gVar.skip(options.f13120a[iB].d());
                    return iB;
                }
            } else if (this.f13057a.y(8192L, gVar) == -1) {
                break;
            }
        }
        return -1;
    }

    public final short E() throws EOFException {
        u0(2L);
        return this.f13058b.Z();
    }

    @Override // hi.i
    public final String F(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("limit < 0: ", j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jL = l((byte) 10, 0L, j11);
        g gVar = this.f13058b;
        if (jL != -1) {
            return ii.a.a(jL, gVar);
        }
        if (j11 < Long.MAX_VALUE && Y(j11) && gVar.z(j11 - 1) == 13 && Y(j11 + 1) && gVar.z(j11) == 10) {
            return ii.a.a(j11, gVar);
        }
        g gVar2 = new g();
        gVar.l(gVar2, 0L, Math.min(32, gVar.f13061b));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.f13061b, j10) + " content=" + gVar2.m(gVar2.f13061b).e() + (char) 8230);
    }

    public final String M(long j10) throws EOFException {
        u0(j10);
        g gVar = this.f13058b;
        gVar.getClass();
        return gVar.d0(j10, mh.a.f18238b);
    }

    @Override // hi.i
    public final String S(Charset charset) throws IOException {
        l0 l0Var = this.f13057a;
        g gVar = this.f13058b;
        gVar.l0(l0Var);
        return gVar.d0(gVar.f13061b, charset);
    }

    @Override // hi.i
    public final boolean Y(long j10) {
        g gVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
        }
        if (this.f13059c) {
            throw new IllegalStateException("closed");
        }
        do {
            gVar = this.f13058b;
            if (gVar.f13061b >= j10) {
                return true;
            }
        } while (this.f13057a.y(8192L, gVar) != -1);
        return false;
    }

    @Override // hi.i
    public final String a0() {
        return F(Long.MAX_VALUE);
    }

    @Override // hi.l0
    public final m0 b() {
        return this.f13057a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f13059c) {
            return;
        }
        this.f13059c = true;
        this.f13057a.close();
        g gVar = this.f13058b;
        gVar.skip(gVar.f13061b);
    }

    public final boolean h() {
        if (this.f13059c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f13058b;
        return gVar.p() && this.f13057a.y(8192L, gVar) == -1;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13059c;
    }

    public final long l(byte b10, long j10, long j11) {
        if (this.f13059c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j11) {
            throw new IllegalArgumentException(m0.r.a("fromIndex=0 toIndex=", j11).toString());
        }
        long jMax = 0;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jE = this.f13058b.E(b11, jMax, j12);
            if (jE != -1) {
                return jE;
            }
            g gVar = this.f13058b;
            long j13 = gVar.f13061b;
            if (j13 >= j12 || this.f13057a.y(8192L, gVar) == -1) {
                break;
            }
            jMax = Math.max(jMax, j13);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // hi.i
    public final j m(long j10) throws EOFException {
        u0(j10);
        return this.f13058b.m(j10);
    }

    @Override // hi.i
    public final long m0(j0 j0Var) throws IOException {
        g gVar;
        long j10 = 0;
        while (true) {
            l0 l0Var = this.f13057a;
            gVar = this.f13058b;
            if (l0Var.y(8192L, gVar) == -1) {
                break;
            }
            long jH = gVar.h();
            if (jH > 0) {
                j10 += jH;
                j0Var.j(jH, gVar);
            }
        }
        long j11 = gVar.f13061b;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        j0Var.j(j11, gVar);
        return j12;
    }

    public final int p() throws EOFException {
        u0(4L);
        int i10 = this.f13058b.readInt();
        int i11 = b.f13032a;
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.r.e(sink, "sink");
        g gVar = this.f13058b;
        if (gVar.f13061b == 0 && this.f13057a.y(8192L, gVar) == -1) {
            return -1;
        }
        return gVar.read(sink);
    }

    @Override // hi.i
    public final byte readByte() throws EOFException {
        u0(1L);
        return this.f13058b.readByte();
    }

    @Override // hi.i
    public final int readInt() throws EOFException {
        u0(4L);
        return this.f13058b.readInt();
    }

    @Override // hi.i
    public final short readShort() throws EOFException {
        u0(2L);
        return this.f13058b.readShort();
    }

    @Override // hi.i
    public final void skip(long j10) throws EOFException {
        if (this.f13059c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            g gVar = this.f13058b;
            if (gVar.f13061b == 0 && this.f13057a.y(8192L, gVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, gVar.f13061b);
            gVar.skip(jMin);
            j10 -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f13057a + ')';
    }

    @Override // hi.i
    public final void u0(long j10) throws EOFException {
        if (!Y(j10)) {
            throw new EOFException();
        }
    }

    @Override // hi.i
    public final g w() {
        return this.f13058b;
    }

    @Override // hi.l0
    public final long y(long j10, g sink) {
        kotlin.jvm.internal.r.e(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
        }
        if (this.f13059c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f13058b;
        if (gVar.f13061b == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f13057a.y(8192L, gVar) == -1) {
                return -1L;
            }
        }
        return gVar.y(Math.min(j10, gVar.f13061b), sink);
    }

    public final long z() throws EOFException {
        char c10;
        char c11;
        char c12;
        char c13;
        long j10;
        u0(8L);
        g gVar = this.f13058b;
        if (gVar.f13061b < 8) {
            throw new EOFException();
        }
        g0 g0Var = gVar.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        int i10 = g0Var.f13064b;
        int i11 = g0Var.f13065c;
        if (i11 - i10 < 8) {
            j10 = ((gVar.readInt() & BodyPartID.bodyIdMax) << 32) | (gVar.readInt() & BodyPartID.bodyIdMax);
            c12 = '8';
            c13 = '\b';
            c10 = 24;
            c11 = '(';
        } else {
            byte[] bArr = g0Var.f13063a;
            c10 = 24;
            c11 = '(';
            c12 = '8';
            c13 = '\b';
            int i12 = i10 + 7;
            long j11 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            int i13 = i10 + 8;
            j10 = j11 | (bArr[i12] & 255);
            gVar.f13061b -= 8;
            if (i13 == i11) {
                gVar.f13060a = g0Var.a();
                h0.a(g0Var);
            } else {
                g0Var.f13064b = i13;
            }
        }
        int i14 = b.f13032a;
        return ((j10 & 255) << c12) | (((-72057594037927936L) & j10) >>> c12) | ((71776119061217280L & j10) >>> c11) | ((280375465082880L & j10) >>> c10) | ((1095216660480L & j10) >>> c13) | ((4278190080L & j10) << c13) | ((16711680 & j10) << c10) | ((65280 & j10) << c11);
    }

    @Override // hi.i
    public final long z0() throws EOFException {
        g gVar;
        byte bZ;
        u0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zY = Y(i11);
            gVar = this.f13058b;
            if (!zY) {
                break;
            }
            bZ = gVar.z(i10);
            if ((bZ < 48 || bZ > 57) && ((bZ < 97 || bZ > 102) && (bZ < 65 || bZ > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            g8.w.h(16);
            String string = Integer.toString(bZ, 16);
            kotlin.jvm.internal.r.d(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return gVar.z0();
    }
}
