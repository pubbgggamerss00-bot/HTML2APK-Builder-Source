package n;

import android.os.Handler;
import c5.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18286a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f18287b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f18288c;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f18289a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f18289a.getAndIncrement());
            return thread;
        }
    }
}
