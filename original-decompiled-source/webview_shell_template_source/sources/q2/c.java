package q2;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Notification f14112t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14113u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f14114v;

    public c(SystemForegroundService systemForegroundService, int i6, Notification notification, int i7) {
        this.f14114v = systemForegroundService;
        this.s = i6;
        this.f14112t = notification;
        this.f14113u = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = Build.VERSION.SDK_INT;
        Notification notification = this.f14112t;
        int i7 = this.s;
        SystemForegroundService systemForegroundService = this.f14114v;
        if (i6 >= 29) {
            systemForegroundService.startForeground(i7, notification, this.f14113u);
        } else {
            systemForegroundService.startForeground(i7, notification);
        }
    }
}
