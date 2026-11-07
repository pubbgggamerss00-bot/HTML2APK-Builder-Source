package hi;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class s implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f13112a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f13113b;

    /* renamed from: c, reason: collision with root package name */
    public int f13114c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13115d;

    public s(f0 f0Var, Inflater inflater) {
        this.f13112a = f0Var;
        this.f13113b = inflater;
    }

    @Override // hi.l0
    public final m0 b() {
        return this.f13112a.f13057a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13115d) {
            return;
        }
        this.f13113b.end();
        this.f13115d = true;
        this.f13112a.close();
    }

    @Override // hi.l0
    public final long y(long j10, g sink) throws DataFormatException, IOException {
        long j11;
        kotlin.jvm.internal.r.e(sink, "sink");
        while (j10 >= 0) {
            if (this.f13115d) {
                throw new IllegalStateException("closed");
            }
            f0 f0Var = this.f13112a;
            Inflater inflater = this.f13113b;
            if (j10 == 0) {
                j11 = 0;
            } else {
                try {
                    g0 g0VarG0 = sink.g0(1);
                    int iMin = (int) Math.min(j10, 8192 - g0VarG0.f13065c);
                    if (inflater.needsInput() && !f0Var.h()) {
                        g0 g0Var = f0Var.f13058b.f13060a;
                        kotlin.jvm.internal.r.b(g0Var);
                        int i10 = g0Var.f13065c;
                        int i11 = g0Var.f13064b;
                        int i12 = i10 - i11;
                        this.f13114c = i12;
                        inflater.setInput(g0Var.f13063a, i11, i12);
                    }
                    int iInflate = inflater.inflate(g0VarG0.f13063a, g0VarG0.f13065c, iMin);
                    int i13 = this.f13114c;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f13114c -= remaining;
                        f0Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        g0VarG0.f13065c += iInflate;
                        j11 = iInflate;
                        sink.f13061b += j11;
                    } else {
                        if (g0VarG0.f13064b == g0VarG0.f13065c) {
                            sink.f13060a = g0VarG0.a();
                            h0.a(g0VarG0);
                        }
                        j11 = 0;
                    }
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            if (j11 > 0) {
                return j11;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (f0Var.h()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
    }
}
