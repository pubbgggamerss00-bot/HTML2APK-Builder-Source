package ld;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return task.isSuccessful() ? Tasks.forResult(c.c((kd.b) task.getResult())) : Tasks.forResult(new c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new id.j(task.getException().getMessage(), task.getException())));
    }
}
