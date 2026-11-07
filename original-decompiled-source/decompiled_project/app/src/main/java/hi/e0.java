package hi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class e0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f13056a;

    public e0(f0 f0Var) {
        this.f13056a = f0Var;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        f0 f0Var = this.f13056a;
        if (f0Var.f13059c) {
            throw new IOException("closed");
        }
        return (int) Math.min(f0Var.f13058b.f13061b, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13056a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        f0 f0Var = this.f13056a;
        g gVar = f0Var.f13058b;
        if (f0Var.f13059c) {
            throw new IOException("closed");
        }
        if (gVar.f13061b == 0 && f0Var.f13057a.y(8192L, gVar) == -1) {
            return -1;
        }
        return gVar.readByte() & 255;
    }

    public final String toString() {
        return this.f13056a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream out) throws IOException {
        kotlin.jvm.internal.r.e(out, "out");
        f0 f0Var = this.f13056a;
        g gVar = f0Var.f13058b;
        if (f0Var.f13059c) {
            throw new IOException("closed");
        }
        long j10 = 0;
        long j11 = 0;
        while (true) {
            if (gVar.f13061b == j10 && f0Var.f13057a.y(8192L, gVar) == -1) {
                return j11;
            }
            long j12 = gVar.f13061b;
            j11 += j12;
            b.b(j12, 0L, j12);
            g0 g0Var = gVar.f13060a;
            while (j12 > j10) {
                kotlin.jvm.internal.r.b(g0Var);
                int iMin = (int) Math.min(j12, g0Var.f13065c - g0Var.f13064b);
                out.write(g0Var.f13063a, g0Var.f13064b, iMin);
                int i10 = g0Var.f13064b + iMin;
                g0Var.f13064b = i10;
                long j13 = iMin;
                gVar.f13061b -= j13;
                j12 -= j13;
                if (i10 == g0Var.f13065c) {
                    g0 g0VarA = g0Var.a();
                    gVar.f13060a = g0VarA;
                    h0.a(g0Var);
                    g0Var = g0VarA;
                }
                j10 = 0;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i10, int i11) throws IOException {
        kotlin.jvm.internal.r.e(data, "data");
        f0 f0Var = this.f13056a;
        g gVar = f0Var.f13058b;
        if (!f0Var.f13059c) {
            b.b(data.length, i10, i11);
            if (gVar.f13061b == 0 && f0Var.f13057a.y(8192L, gVar) == -1) {
                return -1;
            }
            return gVar.read(data, i10, i11);
        }
        throw new IOException("closed");
    }
}
