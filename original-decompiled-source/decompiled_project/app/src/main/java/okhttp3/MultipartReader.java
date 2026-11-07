package okhttp3;

import hi.g;
import hi.j;
import hi.l0;
import hi.m0;
import hi.z;
import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class MultipartReader implements Closeable {

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Part implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    public final class PartSource implements l0 {
        @Override // hi.l0
        public final m0 b() {
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // hi.l0
        public final long y(long j10, g sink) {
            r.e(sink, "sink");
            if (j10 >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
        }
    }

    static {
        new Companion(0);
        j jVar = j.f13075d;
        z.a.b(j.a.b("\r\n"), j.a.b("--"), j.a.b(" "), j.a.b("\t"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
