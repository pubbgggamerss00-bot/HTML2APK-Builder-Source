package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.x;
import androidx.work.j;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Threads {
    private static final long TIMEOUT_RUN_ON_MAIN_MS = 30000;

    private Threads() {
    }

    public static void checkBackgroundThread() {
        j.f("In application's main thread", isBackgroundThread());
    }

    public static void checkMainThread() {
        j.f("Not in application's main thread", isMainThread());
    }

    private static Handler getMainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runOnMainSync$0(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void runOnMain(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            j.f("Unable to post to main thread", getMainHandler().post(runnable));
        }
    }

    public static void runOnMainSync(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        j.f("Unable to post to main thread", getMainHandler().post(new x(3, runnable, countDownLatch)));
        try {
            if (countDownLatch.await(TIMEOUT_RUN_ON_MAIN_MS, TimeUnit.MILLISECONDS)) {
            } else {
                throw new IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (InterruptedException e6) {
            throw new InterruptedRuntimeException(e6);
        }
    }
}
