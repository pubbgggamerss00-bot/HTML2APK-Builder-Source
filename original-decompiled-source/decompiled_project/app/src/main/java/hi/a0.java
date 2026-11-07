package hi;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class a0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f13030a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f13031b;

    public a0(OutputStream outputStream, m0 m0Var) {
        this.f13030a = outputStream;
        this.f13031b = m0Var;
    }

    @Override // hi.j0
    public final m0 b() {
        return this.f13031b;
    }

    @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13030a.close();
    }

    @Override // hi.j0, java.io.Flushable
    public final void flush() throws IOException {
        this.f13030a.flush();
    }

    @Override // hi.j0
    public final void j(long j10, g source) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        b.b(source.f13061b, 0L, j10);
        while (j10 > 0) {
            this.f13031b.f();
            g0 g0Var = source.f13060a;
            kotlin.jvm.internal.r.b(g0Var);
            int iMin = (int) Math.min(j10, g0Var.f13065c - g0Var.f13064b);
            this.f13030a.write(g0Var.f13063a, g0Var.f13064b, iMin);
            int i10 = g0Var.f13064b + iMin;
            g0Var.f13064b = i10;
            long j11 = iMin;
            j10 -= j11;
            source.f13061b -= j11;
            if (i10 == g0Var.f13065c) {
                source.f13060a = g0Var.a();
                h0.a(g0Var);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.f13030a + ')';
    }
}
