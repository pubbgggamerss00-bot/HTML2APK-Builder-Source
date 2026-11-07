package hi;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class q extends m0 {

    /* renamed from: e, reason: collision with root package name */
    public m0 f13106e;

    public q(m0 delegate) {
        kotlin.jvm.internal.r.e(delegate, "delegate");
        this.f13106e = delegate;
    }

    @Override // hi.m0
    public final m0 a() {
        return this.f13106e.a();
    }

    @Override // hi.m0
    public final m0 b() {
        return this.f13106e.b();
    }

    @Override // hi.m0
    public final long c() {
        return this.f13106e.c();
    }

    @Override // hi.m0
    public final m0 d(long j10) {
        return this.f13106e.d(j10);
    }

    @Override // hi.m0
    public final boolean e() {
        return this.f13106e.e();
    }

    @Override // hi.m0
    public final void f() throws IOException {
        this.f13106e.f();
    }

    @Override // hi.m0
    public final m0 g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.r.e(unit, "unit");
        return this.f13106e.g(j10, unit);
    }
}
