package t6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f27992a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27993b;

    public c(boolean z10) {
        this.f27993b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        kotlin.jvm.internal.r.e(runnable, "runnable");
        StringBuilder sbA = k1.q.a(this.f27993b ? "WM.task-" : "androidx.work-");
        sbA.append(this.f27992a.incrementAndGet());
        return new Thread(runnable, sbA.toString());
    }
}
