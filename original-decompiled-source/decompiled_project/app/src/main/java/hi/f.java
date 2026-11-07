package hi;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class f implements j0 {
    @Override // hi.j0
    public final m0 b() {
        return m0.f13094d;
    }

    @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // hi.j0, java.io.Flushable
    public final void flush() {
    }

    @Override // hi.j0
    public final void j(long j10, g source) throws EOFException {
        kotlin.jvm.internal.r.e(source, "source");
        source.skip(j10);
    }
}
