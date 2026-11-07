package qc;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f22635c = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public a f22636a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22637b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f22638a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f22639b;

        /* renamed from: c, reason: collision with root package name */
        public a f22640c;

        public a(Runnable runnable, Executor executor, a aVar) {
            this.f22638a = runnable;
            this.f22639b = executor;
            this.f22640c = aVar;
        }
    }

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f22635c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }
}
