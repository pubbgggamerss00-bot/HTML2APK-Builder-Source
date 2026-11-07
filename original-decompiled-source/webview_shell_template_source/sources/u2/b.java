package u2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s2.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements u2.a {

    /* renamed from: a, reason: collision with root package name */
    public final k f14593a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f14594b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final a f14595c = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.f14594b.post(runnable);
        }
    }

    public b(ExecutorService executorService) {
        this.f14593a = new k(executorService);
    }

    public final void a(Runnable runnable) {
        this.f14593a.execute(runnable);
    }
}
