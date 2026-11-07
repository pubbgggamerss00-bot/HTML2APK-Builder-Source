package okhttp3.internal.concurrent;

import fi.b;
import j2.y;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;
import pg.f0;

/* loaded from: classes2.dex */
public final class TaskRunner {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f19420h = new Companion(0);

    /* renamed from: i, reason: collision with root package name */
    public static final TaskRunner f19421i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f19422j;

    /* renamed from: a, reason: collision with root package name */
    public final RealBackend f19423a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19425c;

    /* renamed from: d, reason: collision with root package name */
    public long f19426d;

    /* renamed from: b, reason: collision with root package name */
    public int f19424b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f19427e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f19428f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final TaskRunner$runnable$1 f19429g = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
        @Override // java.lang.Runnable
        public final void run() {
            Task taskC;
            long jNanoTime;
            while (true) {
                TaskRunner taskRunner = this.f19431a;
                synchronized (taskRunner) {
                    taskC = taskRunner.c();
                }
                if (taskC == null) {
                    return;
                }
                TaskQueue taskQueue = taskC.f19410c;
                r.b(taskQueue);
                TaskRunner taskRunner2 = this.f19431a;
                TaskRunner.f19420h.getClass();
                boolean zIsLoggable = TaskRunner.f19422j.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    TaskLoggerKt.a(taskC, taskQueue, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    try {
                        TaskRunner.a(taskRunner2, taskC);
                        f0 f0Var = f0.f21461a;
                        if (zIsLoggable) {
                            TaskLoggerKt.a(taskC, taskQueue, "finished run in ".concat(TaskLoggerKt.b(System.nanoTime() - jNanoTime)));
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        TaskLoggerKt.a(taskC, taskQueue, "failed a run in ".concat(TaskLoggerKt.b(System.nanoTime() - jNanoTime)));
                    }
                    throw th2;
                }
            }
        }
    };

    public interface Backend {
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class RealBackend implements Backend {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f19430a;

        public RealBackend(b bVar) {
            this.f19430a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
        }

        public final void a(TaskRunner$runnable$1 runnable) {
            r.e(runnable, "runnable");
            this.f19430a.execute(runnable);
        }
    }

    static {
        String name = Util.f19399g + " TaskRunner";
        r.e(name, "name");
        f19421i = new TaskRunner(new RealBackend(new b(name, true)));
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        r.d(logger, "getLogger(TaskRunner::class.java.name)");
        f19422j = logger;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        this.f19423a = realBackend;
    }

    public static final void a(TaskRunner taskRunner, Task task) {
        byte[] bArr = Util.f19393a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.f19408a);
        try {
            long jA = task.a();
            synchronized (taskRunner) {
                taskRunner.b(task, jA);
                f0 f0Var = f0.f21461a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (taskRunner) {
                taskRunner.b(task, -1L);
                f0 f0Var2 = f0.f21461a;
                threadCurrentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(Task task, long j10) {
        byte[] bArr = Util.f19393a;
        TaskQueue taskQueue = task.f19410c;
        r.b(taskQueue);
        if (taskQueue.f19415d != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = taskQueue.f19417f;
        taskQueue.f19417f = false;
        taskQueue.f19415d = null;
        this.f19427e.remove(taskQueue);
        if (j10 != -1 && !z10 && !taskQueue.f19414c) {
            taskQueue.e(task, j10, true);
        }
        if (taskQueue.f19416e.isEmpty()) {
            return;
        }
        this.f19428f.add(taskQueue);
    }

    public final Task c() {
        long j10;
        Task task;
        boolean z10;
        byte[] bArr = Util.f19393a;
        while (true) {
            ArrayList arrayList = this.f19428f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i10 = 0;
            Task task2 = null;
            while (true) {
                if (i10 >= size) {
                    j10 = jNanoTime;
                    task = null;
                    z10 = false;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                Task task3 = (Task) ((TaskQueue) obj).f19416e.get(0);
                j10 = jNanoTime;
                task = null;
                long jMax = Math.max(0L, task3.f19411d - j10);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z10 = true;
                        break;
                    }
                    task2 = task3;
                }
                jNanoTime = j10;
            }
            ArrayList arrayList2 = this.f19427e;
            if (task2 != null) {
                byte[] bArr2 = Util.f19393a;
                task2.f19411d = -1L;
                TaskQueue taskQueue = task2.f19410c;
                r.b(taskQueue);
                taskQueue.f19416e.remove(task2);
                arrayList.remove(taskQueue);
                taskQueue.f19415d = task2;
                arrayList2.add(taskQueue);
                if (z10 || (!this.f19425c && !arrayList.isEmpty())) {
                    this.f19423a.a(this.f19429g);
                }
                return task2;
            }
            if (this.f19425c) {
                if (jMin >= this.f19426d - j10) {
                    return task;
                }
                notify();
                return task;
            }
            this.f19425c = true;
            this.f19426d = j10 + jMin;
            try {
                try {
                    long j11 = jMin / 1000000;
                    long j12 = jMin - (1000000 * j11);
                    if (j11 > 0 || jMin > 0) {
                        wait(j11, (int) j12);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((TaskQueue) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size3);
                        taskQueue2.b();
                        if (taskQueue2.f19416e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f19425c = false;
            }
        }
    }

    public final void d(TaskQueue taskQueue) {
        r.e(taskQueue, "taskQueue");
        byte[] bArr = Util.f19393a;
        if (taskQueue.f19415d == null) {
            boolean zIsEmpty = taskQueue.f19416e.isEmpty();
            ArrayList arrayList = this.f19428f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                r.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f19425c) {
            notify();
        } else {
            this.f19423a.a(this.f19429g);
        }
    }

    public final TaskQueue e() {
        int i10;
        synchronized (this) {
            i10 = this.f19424b;
            this.f19424b = i10 + 1;
        }
        return new TaskQueue(this, y.a(i10, "Q"));
    }
}
