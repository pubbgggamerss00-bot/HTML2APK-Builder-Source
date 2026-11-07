package dc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f7841a;

    public o() {
        this.f7841a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f7841a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }

    public o(TaskCompletionSource taskCompletionSource) {
        this.f7841a = taskCompletionSource;
    }
}
