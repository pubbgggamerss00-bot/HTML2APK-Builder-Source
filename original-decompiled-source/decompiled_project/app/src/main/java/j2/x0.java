package j2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class x0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2.d f14967a;

    public x0(o2.d dVar) {
        this.f14967a = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f14967a.a();
    }

    @Override // android.content.ComponentCallbacks
    @pg.d
    public final void onLowMemory() {
        this.f14967a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f14967a.a();
    }
}
