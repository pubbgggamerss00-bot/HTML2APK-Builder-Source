package ic;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class p implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f14456a;

    public /* synthetic */ p(q qVar) {
        this.f14456a = qVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        q qVar = this.f14456a;
        qVar.f14459b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        qVar.a().post(new n(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        q qVar = this.f14456a;
        qVar.f14459b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        qVar.a().post(new o(this));
    }
}
