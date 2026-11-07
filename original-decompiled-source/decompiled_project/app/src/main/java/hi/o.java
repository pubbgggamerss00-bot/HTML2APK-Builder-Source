package hi;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class o implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f13104a;

    public o(j0 delegate) {
        kotlin.jvm.internal.r.e(delegate, "delegate");
        this.f13104a = delegate;
    }

    @Override // hi.j0
    public final m0 b() {
        return this.f13104a.b();
    }

    @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13104a.close();
    }

    @Override // hi.j0, java.io.Flushable
    public void flush() throws IOException {
        this.f13104a.flush();
    }

    @Override // hi.j0
    public void j(long j10, g source) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        this.f13104a.j(j10, source);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f13104a + ')';
    }
}
