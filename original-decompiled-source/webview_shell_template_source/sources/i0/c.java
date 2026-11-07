package i0;

import android.app.Application;
import i0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ Application s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.a f13289t;

    public c(Application application, e.a aVar) {
        this.s = application;
        this.f13289t = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.s.unregisterActivityLifecycleCallbacks(this.f13289t);
    }
}
