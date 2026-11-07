package okhttp3.internal.cache2;

import hi.g;
import hi.j;
import hi.l0;
import hi.m0;
import java.io.IOException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class Relay {

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public final class RelaySource implements l0 {
        @Override // hi.l0
        public final m0 b() {
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // hi.l0
        public final long y(long j10, g sink) throws IOException {
            r.e(sink, "sink");
            throw new IllegalStateException("Check failed.");
        }
    }

    static {
        new Companion(0);
        j jVar = j.f13075d;
        j.a.b("OkHttp cache v1\n");
        j.a.b("OkHttp DIRTY :(\n");
    }
}
