package d7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements e7.a {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7395b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f7396c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f7394a = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final Object f7397d = new Object();

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final s f7398a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f7399b;

        public a(s sVar, Runnable runnable) {
            this.f7398a = sVar;
            this.f7399b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f7399b.run();
                synchronized (this.f7398a.f7397d) {
                    this.f7398a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f7398a.f7397d) {
                    this.f7398a.a();
                    throw th2;
                }
            }
        }
    }

    public s(Executor executor) {
        this.f7395b = executor;
    }

    public final void a() {
        a aVarPoll = this.f7394a.poll();
        this.f7396c = aVarPoll;
        if (aVarPoll != null) {
            this.f7395b.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f7397d) {
            try {
                this.f7394a.add(new a(this, runnable));
                if (this.f7396c == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
