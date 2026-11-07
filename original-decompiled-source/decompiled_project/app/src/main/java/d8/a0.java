package d8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f7421a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7422b = new AtomicInteger(1);

    public a0(e eVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f7421a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + this.f7422b.getAndIncrement());
        return threadNewThread;
    }
}
