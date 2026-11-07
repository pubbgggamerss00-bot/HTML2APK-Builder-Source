package cc;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class m extends dc.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f5378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str) {
        super(taskCompletionSource);
        this.f5378d = qVar;
        this.f5376b = taskCompletionSource2;
        this.f5377c = str;
    }

    @Override // dc.o
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.f5376b;
        q qVar = this.f5378d;
        try {
            qVar.f5385a.f7866m.h(qVar.f5386b, q.b(), new o(qVar, new dc.n("OnCompleteUpdateCallback"), taskCompletionSource));
        } catch (RemoteException e10) {
            q.f5383e.b(e10, "completeUpdate(%s)", this.f5377c);
            taskCompletionSource.trySetException(new RuntimeException(e10));
        }
    }
}
