package s7;

import java.io.IOException;
import pg.f0;

/* loaded from: classes.dex */
public final class s implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final hi.i f24591a;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f24591a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return kotlin.jvm.internal.r.a(this.f24591a, ((s) obj).f24591a);
        }
        return false;
    }

    public final f0 h(hi.g gVar) throws IOException {
        this.f24591a.m0(gVar);
        return f0.f21461a;
    }

    public final int hashCode() {
        return this.f24591a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f24591a + ')';
    }
}
