package u6;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f29273a = Handler.createAsync(Looper.getMainLooper());

    public final void a(Runnable runnable) {
        this.f29273a.removeCallbacks(runnable);
    }

    public final void b(long j10, Runnable runnable) {
        this.f29273a.postDelayed(runnable, j10);
    }
}
