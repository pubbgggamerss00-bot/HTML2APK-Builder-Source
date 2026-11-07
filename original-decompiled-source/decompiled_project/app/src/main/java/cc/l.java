package cc;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class l extends dc.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5374c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f5375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str) {
        super(taskCompletionSource);
        this.f5375d = qVar;
        this.f5373b = str;
        this.f5374c = taskCompletionSource2;
    }

    @Override // dc.o
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f5374c;
        q qVar = this.f5375d;
        String str = this.f5373b;
        try {
            qVar.f5385a.f7866m.n(qVar.f5386b, q.a(qVar, str), new p(qVar, taskCompletionSource, str));
        } catch (RemoteException e10) {
            q.f5383e.b(e10, "requestUpdateInfo(%s)", str);
            taskCompletionSource.trySetException(new RuntimeException(e10));
        }
    }
}
