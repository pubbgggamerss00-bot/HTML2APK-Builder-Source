package r0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m implements ThreadFactory {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends Thread {
        public final int s;

        public a(Runnable runnable) {
            super(runnable, "fonts-androidx");
            this.s = 10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(this.s);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
