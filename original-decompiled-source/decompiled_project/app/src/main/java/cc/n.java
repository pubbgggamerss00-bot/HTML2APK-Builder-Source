package cc;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public class n extends dc.i {

    /* renamed from: a, reason: collision with root package name */
    public final dc.n f5379a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f5380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f5381c;

    public n(q qVar, dc.n nVar, TaskCompletionSource taskCompletionSource) {
        this.f5381c = qVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f5379a = nVar;
        this.f5380b = taskCompletionSource;
    }

    @Override // dc.j
    public void t(Bundle bundle) throws RemoteException {
        this.f5381c.f5385a.c(this.f5380b);
        this.f5379a.c("onRequestInfo", new Object[0]);
    }

    @Override // dc.j
    public void x(Bundle bundle) throws RemoteException {
        this.f5381c.f5385a.c(this.f5380b);
        this.f5379a.c("onCompleteUpdate", new Object[0]);
    }
}
