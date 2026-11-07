package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class LifecycleService extends Service implements m {
    public final e0 s = new e0(this);

    @Override // androidx.lifecycle.m
    public final h getLifecycle() {
        return this.s.f1291a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.j.e("intent", intent);
        this.s.a(h.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.s.a(h.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        h.a aVar = h.a.ON_STOP;
        e0 e0Var = this.s;
        e0Var.a(aVar);
        e0Var.a(h.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i6) {
        this.s.a(h.a.ON_START);
        super.onStart(intent, i6);
    }
}
