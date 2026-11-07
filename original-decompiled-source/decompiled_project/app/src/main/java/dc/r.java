package dc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class r extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f7845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f7846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f7847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, o oVar) {
        super(taskCompletionSource);
        this.f7847d = xVar;
        this.f7845b = taskCompletionSource2;
        this.f7846c = oVar;
    }

    @Override // dc.o
    public final void a() {
        synchronized (this.f7847d.f7859f) {
            try {
                final x xVar = this.f7847d;
                final TaskCompletionSource taskCompletionSource = this.f7845b;
                xVar.f7858e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: dc.p
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        x xVar2 = xVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (xVar2.f7859f) {
                            xVar2.f7858e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.f7847d.f7864k.getAndIncrement() > 0) {
                    this.f7847d.f7855b.c("Already connected to the service.", new Object[0]);
                }
                x.b(this.f7847d, this.f7846c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
