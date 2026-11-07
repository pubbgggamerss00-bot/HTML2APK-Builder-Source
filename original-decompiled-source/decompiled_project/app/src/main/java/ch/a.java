package ch;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import c9.u1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5568a = 0;

    public static final void a(AutoCloseable autoCloseable, Throwable th2) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th2 != null) {
                try {
                    androidx.documentfile.provider.a.a(autoCloseable);
                    return;
                } catch (Throwable th3) {
                    u1.b(th2, th3);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z10 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        executorService.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
