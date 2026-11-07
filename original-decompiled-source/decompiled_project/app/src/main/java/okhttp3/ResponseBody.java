package okhttp3;

import hi.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19379a = new Companion(0);

    public static final class BomAwareReader extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i10, int i11) throws IOException {
            r.e(cbuf, "cbuf");
            throw new IOException("Stream closed");
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Util.c(s0());
    }

    public abstract long h();

    public abstract MediaType l();

    public abstract i s0();
}
