package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3073a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<Runnable> f3074b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f3075c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3076d;

    public r0(Executor executor) {
        kotlin.jvm.internal.r.e(executor, "executor");
        this.f3073a = executor;
        this.f3074b = new ArrayDeque<>();
        this.f3076d = new Object();
    }

    public final void a() {
        synchronized (this.f3076d) {
            try {
                Runnable runnablePoll = this.f3074b.poll();
                Runnable runnable = runnablePoll;
                this.f3075c = runnable;
                if (runnablePoll != null) {
                    this.f3073a.execute(runnable);
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable command) {
        kotlin.jvm.internal.r.e(command, "command");
        synchronized (this.f3076d) {
            try {
                this.f3074b.offer(new Runnable() { // from class: androidx.room.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable = command;
                        r0 r0Var = this;
                        try {
                            runnable.run();
                        } finally {
                            r0Var.a();
                        }
                    }
                });
                if (this.f3075c == null) {
                    a();
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
