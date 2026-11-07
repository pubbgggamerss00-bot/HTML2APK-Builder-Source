package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.l;

/* loaded from: classes.dex */
public class x extends Service implements t {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f2372a = new u0(this);

    @Override // androidx.lifecycle.t
    public final l getLifecycle() {
        return this.f2372a.f2353a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.r.e(intent, "intent");
        u0 u0Var = this.f2372a;
        u0Var.getClass();
        u0Var.a(l.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        u0 u0Var = this.f2372a;
        u0Var.getClass();
        u0Var.a(l.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        u0 u0Var = this.f2372a;
        u0Var.getClass();
        u0Var.a(l.a.ON_STOP);
        u0Var.a(l.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @pg.d
    public final void onStart(Intent intent, int i10) {
        u0 u0Var = this.f2372a;
        u0Var.getClass();
        u0Var.a(l.a.ON_START);
        super.onStart(intent, i10);
    }
}
