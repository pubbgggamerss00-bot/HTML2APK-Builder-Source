package hi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface j0 extends Closeable, Flushable {
    m0 b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    void j(long j10, g gVar) throws IOException;
}
