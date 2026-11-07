package ic;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f14445a;

    public h() {
        this.f14445a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f14445a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }

    public h(TaskCompletionSource taskCompletionSource) {
        this.f14445a = taskCompletionSource;
    }
}
