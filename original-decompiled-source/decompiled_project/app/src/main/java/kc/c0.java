package kc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f16265a;

    public c0() {
        this.f16265a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f16265a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f16265a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public c0(TaskCompletionSource taskCompletionSource) {
        this.f16265a = taskCompletionSource;
    }
}
