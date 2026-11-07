package xa;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class c implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f33536b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f33537c = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final String f33535a = "GAC_Transform";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f33537c.newThread(new d(runnable));
        threadNewThread.setName(this.f33535a + "[" + this.f33536b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
