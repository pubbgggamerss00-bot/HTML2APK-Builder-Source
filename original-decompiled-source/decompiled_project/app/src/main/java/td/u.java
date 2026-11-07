package td;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class u implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f28742f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f28743a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f28744b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public c f28745c = c.f28751a;

    /* renamed from: d, reason: collision with root package name */
    public long f28746d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final b f28747e = new b();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f28748a;

        public a(Runnable runnable) {
            this.f28748a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f28748a.run();
        }

        public final String toString() {
            return this.f28748a.toString();
        }
    }

    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f28749a;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        
            r9.f28749a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        
            td.u.f28742f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f28749a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
        
            r9.f28749a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0036 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            Runnable runnable;
            boolean z10 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (u.this.f28744b) {
                        if (z10) {
                            runnable = (Runnable) u.this.f28744b.poll();
                            this.f28749a = runnable;
                            if (runnable != null) {
                            }
                        } else {
                            u uVar = u.this;
                            c cVar = uVar.f28745c;
                            c cVar2 = c.f28754d;
                            if (cVar != cVar2) {
                                uVar.f28746d++;
                                uVar.f28745c = cVar2;
                                z10 = true;
                                runnable = (Runnable) u.this.f28744b.poll();
                                this.f28749a = runnable;
                                if (runnable != null) {
                                    u.this.f28745c = c.f28751a;
                                }
                            }
                        }
                    }
                    if (!zInterrupted) {
                        return;
                    }
                } finally {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (u.this.f28744b) {
                    u.this.f28745c = c.f28751a;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f28749a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + u.this.f28745c + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f28751a;

        /* renamed from: b, reason: collision with root package name */
        public static final c f28752b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f28753c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f28754d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ c[] f28755e;

        static {
            c cVar = new c("IDLE", 0);
            f28751a = cVar;
            c cVar2 = new c("QUEUING", 1);
            f28752b = cVar2;
            c cVar3 = new c("QUEUED", 2);
            f28753c = cVar3;
            c cVar4 = new c("RUNNING", 3);
            f28754d = cVar4;
            f28755e = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f28755e.clone();
        }
    }

    public u(Executor executor) {
        com.google.android.gms.common.internal.p.f(executor);
        this.f28743a = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        com.google.android.gms.common.internal.p.f(runnable);
        synchronized (this.f28744b) {
            c cVar2 = this.f28745c;
            if (cVar2 != c.f28754d && cVar2 != (cVar = c.f28753c)) {
                long j10 = this.f28746d;
                a aVar = new a(runnable);
                this.f28744b.add(aVar);
                c cVar3 = c.f28752b;
                this.f28745c = cVar3;
                try {
                    this.f28743a.execute(this.f28747e);
                    if (this.f28745c != cVar3) {
                        return;
                    }
                    synchronized (this.f28744b) {
                        try {
                            if (this.f28746d == j10 && this.f28745c == cVar3) {
                                this.f28745c = cVar;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f28744b) {
                        try {
                            c cVar4 = this.f28745c;
                            if (cVar4 == c.f28751a || cVar4 == c.f28752b) {
                                z10 = this.f28744b.removeLastOccurrence(aVar);
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f28744b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f28743a + "}";
    }
}
