package q2;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Notification f14115t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f14116u;

    public d(SystemForegroundService systemForegroundService, int i6, Notification notification) {
        this.f14116u = systemForegroundService;
        this.s = i6;
        this.f14115t = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14116u.f1819w.notify(this.s, this.f14115t);
    }
}
