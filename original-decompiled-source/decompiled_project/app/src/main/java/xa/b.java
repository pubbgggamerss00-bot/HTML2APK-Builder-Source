package xa;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f33533a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f33534b = Executors.defaultThreadFactory();

    public b(String str) {
        this.f33533a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f33534b.newThread(new d(runnable));
        threadNewThread.setName(this.f33533a);
        return threadNewThread;
    }
}
