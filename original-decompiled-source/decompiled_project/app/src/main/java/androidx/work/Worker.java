package androidx.work;

import android.content.Context;
import androidx.work.c;
import java.util.concurrent.ExecutorService;
import k3.d;
import kotlin.jvm.internal.r;
import t6.f0;
import t6.h0;

/* loaded from: classes.dex */
public abstract class Worker extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        r.e(context, "context");
        r.e(workerParams, "workerParams");
    }

    @Override // androidx.work.c
    public final d.C0161d a() {
        ExecutorService backgroundExecutor = this.f3134b.f3112b;
        r.d(backgroundExecutor, "backgroundExecutor");
        return k3.d.a(new h0(backgroundExecutor, new f0(this)));
    }

    @Override // androidx.work.c
    public final d.C0161d b() {
        ExecutorService backgroundExecutor = this.f3134b.f3112b;
        r.d(backgroundExecutor, "backgroundExecutor");
        return k3.d.a(new h0(backgroundExecutor, new d(this)));
    }

    public abstract c.a.C0048c c();
}
