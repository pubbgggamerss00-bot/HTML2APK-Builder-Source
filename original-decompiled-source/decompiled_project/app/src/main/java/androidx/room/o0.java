package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f3039b;

    /* renamed from: c, reason: collision with root package name */
    public final pg.s f3040c;

    public o0(g0 database) {
        kotlin.jvm.internal.r.e(database, "database");
        this.f3038a = database;
        this.f3039b = new AtomicBoolean(false);
        this.f3040c = e9.w0.b(new n0(this, 0));
    }

    public final i6.f a() {
        g0 g0Var = this.f3038a;
        g0Var.assertNotMainThread();
        return this.f3039b.compareAndSet(false, true) ? (i6.f) this.f3040c.getValue() : g0Var.compileStatement(b());
    }

    public abstract String b();

    public final void c(i6.f statement) {
        kotlin.jvm.internal.r.e(statement, "statement");
        if (statement == ((i6.f) this.f3040c.getValue())) {
            this.f3039b.set(false);
        }
    }
}
