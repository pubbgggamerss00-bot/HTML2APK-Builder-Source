package ae;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final fe.b<rd.b> f459a;

    /* renamed from: b, reason: collision with root package name */
    public final fe.b<ee.a> f460b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f461c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<nd.b> f462d;

    public g(fe.b<rd.b> tokenProvider, fe.b<ee.a> instanceId, fe.a<nd.b> appCheckDeferred, @jd.c Executor executor) {
        kotlin.jvm.internal.r.e(tokenProvider, "tokenProvider");
        kotlin.jvm.internal.r.e(instanceId, "instanceId");
        kotlin.jvm.internal.r.e(appCheckDeferred, "appCheckDeferred");
        kotlin.jvm.internal.r.e(executor, "executor");
        this.f459a = tokenProvider;
        this.f460b = instanceId;
        this.f461c = executor;
        this.f462d = new AtomicReference<>();
        appCheckDeferred.a(new b(this));
    }

    @Override // ae.a
    public final Task getContext() {
        final Task taskContinueWith;
        final Task taskOnSuccessTask;
        rd.b bVar = this.f459a.get();
        Executor executor = this.f461c;
        if (bVar == null) {
            taskContinueWith = Tasks.forResult(null);
            kotlin.jvm.internal.r.d(taskContinueWith, "forResult(null)");
        } else {
            taskContinueWith = bVar.a().continueWith(executor, new e());
            kotlin.jvm.internal.r.d(taskContinueWith, "auth.getAccessToken(fals…  }\n      authToken\n    }");
        }
        nd.b bVar2 = this.f462d.get();
        if (bVar2 == null) {
            taskOnSuccessTask = Tasks.forResult(null);
            kotlin.jvm.internal.r.d(taskOnSuccessTask, "forResult(null)");
        } else {
            Task taskA = bVar2.a();
            kotlin.jvm.internal.r.d(taskA, "if (getLimitedUseAppChec… appCheck.getToken(false)");
            taskOnSuccessTask = taskA.onSuccessTask(executor, new f());
            kotlin.jvm.internal.r.d(taskOnSuccessTask, "tokenTask.onSuccessTask(…esult(result.token)\n    }");
        }
        return Tasks.whenAll((Task<?>[]) new Task[]{taskContinueWith, taskOnSuccessTask}).onSuccessTask(executor, new SuccessContinuation() { // from class: ae.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(new v((String) taskContinueWith.getResult(), this.f460b.get().a(), (String) taskOnSuccessTask.getResult()));
            }
        });
    }
}
