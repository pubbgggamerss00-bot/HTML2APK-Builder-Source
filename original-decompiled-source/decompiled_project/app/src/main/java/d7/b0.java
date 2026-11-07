package d7;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f7377e = t6.s.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final u6.d f7378a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7379b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7380c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f7381d = new Object();

    public interface a {
        void b(c7.j jVar);
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final b0 f7382a;

        /* renamed from: b, reason: collision with root package name */
        public final c7.j f7383b;

        public b(b0 b0Var, c7.j jVar) {
            this.f7382a = b0Var;
            this.f7383b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f7382a.f7381d) {
                try {
                    if (((b) this.f7382a.f7379b.remove(this.f7383b)) != null) {
                        a aVar = (a) this.f7382a.f7380c.remove(this.f7383b);
                        if (aVar != null) {
                            aVar.b(this.f7383b);
                        }
                    } else {
                        t6.s.d().a("WrkTimerRunnable", "Timer with " + this.f7383b + " is already marked as complete.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public b0(u6.d dVar) {
        this.f7378a = dVar;
    }

    public final void a(c7.j jVar) {
        synchronized (this.f7381d) {
            try {
                if (((b) this.f7379b.remove(jVar)) != null) {
                    t6.s.d().a(f7377e, "Stopping timer for " + jVar);
                    this.f7380c.remove(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
