package g8;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class b implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11560a;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ph.m mVar = (ph.m) this.f11560a;
        kotlin.jvm.internal.r.e(task, "task");
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(pg.q.a(exception));
        } else if (task.isCanceled()) {
            mVar.cancel(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }
}
