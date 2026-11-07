package ic;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class k extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hc.g f14450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f14451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, hc.g gVar) {
        super(taskCompletionSource);
        this.f14449b = taskCompletionSource2;
        this.f14450c = gVar;
        this.f14451d = qVar;
    }

    @Override // ic.h
    public final void a() {
        synchronized (this.f14451d.f14463f) {
            try {
                final q qVar = this.f14451d;
                final TaskCompletionSource taskCompletionSource = this.f14449b;
                qVar.f14462e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: ic.j
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        q qVar2 = qVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (qVar2.f14463f) {
                            qVar2.f14462e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.f14451d.f14468k.getAndIncrement() > 0) {
                    this.f14451d.f14459b.a("Already connected to the service.", new Object[0]);
                }
                q.b(this.f14451d, this.f14450c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
