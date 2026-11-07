package okhttp3;

import hi.i;
import hi.o;
import hi.p;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class Cache implements Closeable, Flushable {

    public static final class CacheResponseBody extends ResponseBody {

        /* renamed from: okhttp3.Cache$CacheResponseBody$1, reason: invalid class name */
        public final class AnonymousClass1 extends p {
            @Override // hi.p, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                throw null;
            }
        }

        @Override // okhttp3.ResponseBody
        public final long h() {
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType l() {
            return null;
        }

        @Override // okhttp3.ResponseBody
        public final i s0() {
            return null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Entry {

        public static final class Companion {
            public /* synthetic */ Companion(int i10) {
                this();
            }

            private Companion() {
            }
        }

        static {
            new Companion(0);
            Platform.f19768a.getClass();
            Platform.f19769b.getClass();
            Platform.f19769b.getClass();
        }
    }

    public final class RealCacheRequest implements CacheRequest {

        /* renamed from: okhttp3.Cache$RealCacheRequest$1, reason: invalid class name */
        public final class AnonymousClass1 extends o {
            @Override // hi.o, hi.j0, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                throw null;
            }
        }

        public RealCacheRequest() {
            throw null;
        }
    }

    static {
        new Companion(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        throw null;
    }
}
