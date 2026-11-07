package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable {

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public final class Editor {
        public Editor() {
            throw null;
        }
    }

    public final class Entry {
        public Entry() {
            throw null;
        }
    }

    public final class Snapshot implements Closeable {
        public Snapshot() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    static {
        new Companion(0);
        r.d(Pattern.compile("[a-z0-9_-]{1,120}"), "compile(...)");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        synchronized (this) {
            throw null;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        throw null;
    }
}
