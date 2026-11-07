package td;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f28695e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f28696a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f28697b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28698c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f28699d;

    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f28697b = str;
        this.f28698c = i10;
        this.f28699d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f28695e.newThread(new Runnable() { // from class: td.a
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                b bVar = this.f28693a;
                Process.setThreadPriority(bVar.f28698c);
                StrictMode.ThreadPolicy threadPolicy = bVar.f28699d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
            }
        });
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f28697b + " Thread #" + this.f28696a.getAndIncrement());
        return threadNewThread;
    }
}
