package xa;

import android.os.Process;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f33538a;

    public d(Runnable runnable) {
        this.f33538a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f33538a.run();
    }
}
