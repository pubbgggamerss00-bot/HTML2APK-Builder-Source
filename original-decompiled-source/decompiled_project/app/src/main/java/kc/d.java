package kc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f16266a;

    public /* synthetic */ d(e eVar) {
        this.f16266a = eVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar = this.f16266a;
        eVar.f16270b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        eVar.a().post(new b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.f16266a;
        eVar.f16270b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        eVar.a().post(new c(this));
    }
}
