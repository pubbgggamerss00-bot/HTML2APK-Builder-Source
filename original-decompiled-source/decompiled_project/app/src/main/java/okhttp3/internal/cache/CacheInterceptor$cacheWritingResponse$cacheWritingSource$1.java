package okhttp3.internal.cache;

import hi.g;
import hi.l0;
import hi.m0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19403a;

    @Override // hi.l0
    public final m0 b() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zU;
        if (this.f19403a) {
            throw null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        byte[] bArr = Util.f19393a;
        r.e(timeUnit, "timeUnit");
        try {
            zU = Util.u(this, 100);
        } catch (IOException unused) {
            zU = false;
        }
        if (zU) {
            throw null;
        }
        this.f19403a = true;
        throw null;
    }

    @Override // hi.l0
    public final long y(long j10, g sink) throws IOException {
        r.e(sink, "sink");
        throw null;
    }
}
