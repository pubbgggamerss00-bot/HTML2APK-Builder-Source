package hi;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class p implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f13105a;

    public p(l0 delegate) {
        kotlin.jvm.internal.r.e(delegate, "delegate");
        this.f13105a = delegate;
    }

    @Override // hi.l0
    public final m0 b() {
        return this.f13105a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13105a.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f13105a + ')';
    }

    @Override // hi.l0
    public long y(long j10, g sink) throws IOException {
        kotlin.jvm.internal.r.e(sink, "sink");
        return this.f13105a.y(j10, sink);
    }
}
