package v6;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import u6.s0;
import u6.x;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final u6.d f30647a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f30648b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30649c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30650d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f30651e;

    public e(u6.d runnableScheduler, s0 s0Var) {
        r.e(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f30647a = runnableScheduler;
        this.f30648b = s0Var;
        this.f30649c = millis;
        this.f30650d = new Object();
        this.f30651e = new LinkedHashMap();
    }

    public final void a(x token) {
        Runnable runnable;
        r.e(token, "token");
        synchronized (this.f30650d) {
            runnable = (Runnable) this.f30651e.remove(token);
        }
        if (runnable != null) {
            this.f30647a.a(runnable);
        }
    }

    public final void b(final x token) {
        r.e(token, "token");
        Runnable runnable = new Runnable() { // from class: v6.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f30645a.f30648b.a(token, 3);
            }
        };
        synchronized (this.f30650d) {
        }
        this.f30647a.b(this.f30649c, runnable);
    }
}
