package r9;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class v implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((k) this).f23299f.get().close();
    }
}
