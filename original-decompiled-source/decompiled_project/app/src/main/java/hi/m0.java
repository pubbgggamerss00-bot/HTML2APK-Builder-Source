package hi;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f13094d = new a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f13095a;

    /* renamed from: b, reason: collision with root package name */
    public long f13096b;

    /* renamed from: c, reason: collision with root package name */
    public long f13097c;

    public static final class a extends m0 {
        @Override // hi.m0
        public final m0 d(long j10) {
            return this;
        }

        @Override // hi.m0
        public final void f() {
        }

        @Override // hi.m0
        public final m0 g(long j10, TimeUnit unit) {
            kotlin.jvm.internal.r.e(unit, "unit");
            return this;
        }
    }

    public m0 a() {
        this.f13095a = false;
        return this;
    }

    public m0 b() {
        this.f13097c = 0L;
        return this;
    }

    public long c() {
        if (this.f13095a) {
            return this.f13096b;
        }
        throw new IllegalStateException("No deadline");
    }

    public m0 d(long j10) {
        this.f13095a = true;
        this.f13096b = j10;
        return this;
    }

    public boolean e() {
        return this.f13095a;
    }

    public void f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f13095a && this.f13096b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public m0 g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.r.e(unit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("timeout < 0: ", j10).toString());
        }
        this.f13097c = unit.toNanos(j10);
        return this;
    }
}
