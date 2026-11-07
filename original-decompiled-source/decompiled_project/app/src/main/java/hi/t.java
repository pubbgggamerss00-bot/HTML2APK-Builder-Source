package hi;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class t implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f13116a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f13117b;

    public t(InputStream input, m0 timeout) {
        kotlin.jvm.internal.r.e(input, "input");
        kotlin.jvm.internal.r.e(timeout, "timeout");
        this.f13116a = input;
        this.f13117b = timeout;
    }

    @Override // hi.l0
    public final m0 b() {
        return this.f13117b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13116a.close();
    }

    public final String toString() {
        return "source(" + this.f13116a + ')';
    }

    @Override // hi.l0
    public final long y(long j10, g sink) throws IOException {
        kotlin.jvm.internal.r.e(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
        }
        try {
            this.f13117b.f();
            g0 g0VarG0 = sink.g0(1);
            int i10 = this.f13116a.read(g0VarG0.f13063a, g0VarG0.f13065c, (int) Math.min(j10, 8192 - g0VarG0.f13065c));
            if (i10 != -1) {
                g0VarG0.f13065c += i10;
                long j11 = i10;
                sink.f13061b += j11;
                return j11;
            }
            if (g0VarG0.f13064b != g0VarG0.f13065c) {
                return -1L;
            }
            sink.f13060a = g0VarG0.a();
            h0.a(g0VarG0);
            return -1L;
        } catch (AssertionError e10) {
            if (x.c(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }
}
