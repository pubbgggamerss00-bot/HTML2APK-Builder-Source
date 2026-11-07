package okhttp3.internal.concurrent;

import b.o;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;
import pg.f0;

/* loaded from: classes2.dex */
public final class TaskQueue {

    /* renamed from: a, reason: collision with root package name */
    public final TaskRunner f19412a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19413b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19414c;

    /* renamed from: d, reason: collision with root package name */
    public Task f19415d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f19416e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19417f;

    public static final class AwaitIdleTask extends Task {

        /* renamed from: e, reason: collision with root package name */
        public final CountDownLatch f19418e;

        public AwaitIdleTask() {
            super(o.a(new StringBuilder(), Util.f19399g, " awaitIdle"), false);
            this.f19418e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            this.f19418e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        r.e(name, "name");
        this.f19412a = taskRunner;
        this.f19413b = name;
        this.f19416e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = Util.f19393a;
        synchronized (this.f19412a) {
            try {
                if (b()) {
                    this.f19412a.d(this);
                }
                f0 f0Var = f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        Task task = this.f19415d;
        if (task != null && task.f19409b) {
            this.f19417f = true;
        }
        ArrayList arrayList = this.f19416e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).f19409b) {
                Task task2 = (Task) arrayList.get(size);
                TaskRunner.f19420h.getClass();
                if (TaskRunner.f19422j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(Task task, long j10) {
        r.e(task, "task");
        synchronized (this.f19412a) {
            if (!this.f19414c) {
                if (e(task, j10, false)) {
                    this.f19412a.d(this);
                }
                f0 f0Var = f0.f21461a;
            } else if (task.f19409b) {
                TaskRunner.f19420h.getClass();
                if (TaskRunner.f19422j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                TaskRunner.f19420h.getClass();
                if (TaskRunner.f19422j.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Task task, long j10, boolean z10) {
        int size;
        int size2;
        int i10;
        r.e(task, "task");
        TaskQueue taskQueue = task.f19410c;
        if (taskQueue != this) {
            if (taskQueue != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f19410c = this;
        }
        long jNanoTime = System.nanoTime();
        long j11 = jNanoTime + j10;
        ArrayList arrayList = this.f19416e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f19411d = j11;
            TaskRunner.f19420h.getClass();
            if (TaskRunner.f19422j.isLoggable(Level.FINE)) {
                TaskLoggerKt.a(task, this, z10 ? "run again after ".concat(TaskLoggerKt.b(j11 - jNanoTime)) : "scheduled after ".concat(TaskLoggerKt.b(j11 - jNanoTime)));
            }
            size = arrayList.size();
            size2 = 0;
            i10 = 0;
            while (true) {
                if (i10 < size) {
                    size2 = -1;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                if (((Task) obj).f19411d - jNanoTime > j10) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, task);
            if (size2 != 0) {
                return true;
            }
        } else if (task.f19411d <= j11) {
            TaskRunner.f19420h.getClass();
            if (TaskRunner.f19422j.isLoggable(Level.FINE)) {
                TaskLoggerKt.a(task, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            task.f19411d = j11;
            TaskRunner.f19420h.getClass();
            if (TaskRunner.f19422j.isLoggable(Level.FINE)) {
            }
            size = arrayList.size();
            size2 = 0;
            i10 = 0;
            while (true) {
                if (i10 < size) {
                }
                size2++;
            }
            if (size2 == -1) {
            }
            arrayList.add(size2, task);
            if (size2 != 0) {
            }
        }
        return false;
    }

    public final void f() {
        byte[] bArr = Util.f19393a;
        synchronized (this.f19412a) {
            try {
                this.f19414c = true;
                if (b()) {
                    this.f19412a.d(this);
                }
                f0 f0Var = f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        return this.f19413b;
    }
}
