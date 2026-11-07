package p;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14052a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final a.b f14053b;

    /* renamed from: c, reason: collision with root package name */
    public final c f14054c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f14055d;

    public h(a.b bVar, c cVar, ComponentName componentName) {
        this.f14053b = bVar;
        this.f14054c = cVar;
        this.f14055d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f14052a) {
            try {
                try {
                    this.f14053b.y1(this.f14054c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
