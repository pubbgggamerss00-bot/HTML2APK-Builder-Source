package e3;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Executor {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f12891t;

    public /* synthetic */ n(Handler handler, int i6) {
        this.s = i6;
        this.f12891t = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.s) {
            case 0:
                this.f12891t.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f12891t;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
