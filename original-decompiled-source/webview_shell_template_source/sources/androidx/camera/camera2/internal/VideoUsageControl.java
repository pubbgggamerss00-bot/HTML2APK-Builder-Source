package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class VideoUsageControl {
    private final Executor executor;
    private final AtomicInteger mVideoUsage;

    public VideoUsageControl(Executor executor) {
        kotlin.jvm.internal.j.e("executor", executor);
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(VideoUsageControl videoUsageControl) {
        kotlin.jvm.internal.j.e("this$0", videoUsageControl);
        int iDecrementAndGet = videoUsageControl.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            Logger.d("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet);
        } else {
            Logger.w("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(VideoUsageControl videoUsageControl) {
        kotlin.jvm.internal.j.e("this$0", videoUsageControl);
        Logger.d("VideoUsageControl", "incrementUsage: mVideoUsage = " + videoUsageControl.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(VideoUsageControl videoUsageControl) {
        kotlin.jvm.internal.j.e("this$0", videoUsageControl);
        videoUsageControl.resetDirectly();
    }

    public final void decrementUsage() {
        this.executor.execute(new c0(2, this));
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }

    public final void incrementUsage() {
        this.executor.execute(new d0(3, this));
    }

    public final void reset() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.a2
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.reset$lambda$2(this.s);
            }
        });
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        Logger.d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
