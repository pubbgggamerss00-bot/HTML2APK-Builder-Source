package hi;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class d0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f13051a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13052b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13053c;

    public d0(j0 sink) {
        kotlin.jvm.internal.r.e(sink, "sink");
        this.f13051a = sink;
        this.f13052b = new g();
    }

    @Override // hi.h
    public final h A(j byteString) throws IOException {
        kotlin.jvm.internal.r.e(byteString, "byteString");
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        this.f13052b.k0(byteString);
        h();
        return this;
    }

    @Override // hi.h
    public final h O(String string) throws IOException {
        kotlin.jvm.internal.r.e(string, "string");
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        this.f13052b.F0(string);
        h();
        return this;
    }

    @Override // hi.h
    public final h V(long j10) throws IOException {
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        this.f13052b.v0(j10);
        h();
        return this;
    }

    @Override // hi.j0
    public final m0 b() {
        return this.f13051a.b();
    }

    @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        j0 j0Var = this.f13051a;
        if (this.f13053c) {
            return;
        }
        try {
            g gVar = this.f13052b;
            long j10 = gVar.f13061b;
            if (j10 > 0) {
                j0Var.j(j10, gVar);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            j0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f13053c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // hi.h, hi.j0, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f13052b;
        long j10 = gVar.f13061b;
        j0 j0Var = this.f13051a;
        if (j10 > 0) {
            j0Var.j(j10, gVar);
        }
        j0Var.flush();
    }

    public final h h() throws IOException {
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f13052b;
        long jH = gVar.h();
        if (jH > 0) {
            this.f13051a.j(jH, gVar);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13053c;
    }

    @Override // hi.j0
    public final void j(long j10, g source) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        this.f13052b.j(j10, source);
        h();
    }

    public final h l(long j10) throws IOException {
        boolean z10;
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f13052b;
        gVar.getClass();
        if (j10 == 0) {
            gVar.q0(48);
        } else {
            if (j10 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    gVar.F0("-9223372036854775808");
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            byte[] bArr = ii.a.f14534a;
            int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
            int i10 = iNumberOfLeadingZeros + (j10 > ii.a.f14535b[iNumberOfLeadingZeros] ? 1 : 0);
            if (z10) {
                i10++;
            }
            g0 g0VarG0 = gVar.g0(i10);
            byte[] bArr2 = g0VarG0.f13063a;
            int i11 = g0VarG0.f13065c + i10;
            while (j10 != 0) {
                long j11 = 10;
                i11--;
                bArr2[i11] = ii.a.f14534a[(int) (j10 % j11)];
                j10 /= j11;
            }
            if (z10) {
                bArr2[i11 - 1] = 45;
            }
            g0VarG0.f13065c += i10;
            gVar.f13061b += i10;
        }
        h();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f13051a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f13052b.write(source);
        h();
        return iWrite;
    }

    @Override // hi.h
    public final h writeByte(int i10) throws IOException {
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        this.f13052b.q0(i10);
        h();
        return this;
    }

    @Override // hi.h
    public final h writeInt(int i10) throws IOException {
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        this.f13052b.y0(i10);
        h();
        return this;
    }

    @Override // hi.h
    public final h writeShort(int i10) throws IOException {
        if (this.f13053c) {
            throw new IllegalStateException("closed");
        }
        this.f13052b.D0(i10);
        h();
        return this;
    }

    @Override // hi.h
    public final h write(byte[] bArr) throws IOException {
        if (!this.f13053c) {
            this.f13052b.m86write(bArr);
            h();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
