package v3;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class m implements ThreadFactory {

    public static class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final int f30599a;

        public a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.f30599a = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(this.f30599a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
