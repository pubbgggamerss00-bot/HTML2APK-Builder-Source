package okhttp3.internal.cache;

import hi.p;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class DiskLruCache$Entry$newSource$1 extends p {

    /* renamed from: b, reason: collision with root package name */
    public boolean f19406b;

    @Override // hi.p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f19406b) {
            return;
        }
        this.f19406b = true;
        throw null;
    }
}
