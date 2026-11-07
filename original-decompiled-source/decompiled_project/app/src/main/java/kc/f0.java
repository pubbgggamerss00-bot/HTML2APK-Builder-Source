package kc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class f0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f16285g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f16286h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f16287j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, c0 c0Var) {
        super(taskCompletionSource);
        this.f16287j = eVar;
        this.f16285g = taskCompletionSource2;
        this.f16286h = c0Var;
    }

    @Override // kc.c0
    public final void b() {
        synchronized (this.f16287j.f16274f) {
            try {
                final e eVar = this.f16287j;
                final TaskCompletionSource taskCompletionSource = this.f16285g;
                eVar.f16273e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: kc.e0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        e eVar2 = eVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (eVar2.f16274f) {
                            eVar2.f16273e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.f16287j.f16280l.getAndIncrement() > 0) {
                    this.f16287j.f16270b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f16287j, this.f16286h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
