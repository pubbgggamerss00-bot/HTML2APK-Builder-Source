package rd;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.internal.p002firebaseauthapi.zze;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f23420a;

    public q0(id.e eVar) {
        eVar.a();
        Context context = eVar.f14480a;
        p pVar = new p();
        p.f23413e.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        pVar.f23416c = new zze(handlerThread.getLooper());
        eVar.a();
        pVar.f23417d = new s(pVar, eVar.f14481b);
        this.f23420a = pVar;
        com.google.android.gms.common.api.internal.c.b((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.c.f5945e.a(new s0(this));
    }
}
