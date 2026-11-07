package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.ImageCapture;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f390t;

    public /* synthetic */ d0(int i6, Object obj) {
        this.s = i6;
        this.f390t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Camera2CameraImpl.StateCallback.ScheduledReopen) this.f390t).lambda$run$0();
                break;
            case 1:
                ((SynchronizedCaptureSessionImpl) this.f390t).lambda$close$2();
                break;
            case 2:
                ((ImageCapture.ScreenFlash) this.f390t).clear();
                break;
            default:
                VideoUsageControl.incrementUsage$lambda$0((VideoUsageControl) this.f390t);
                break;
        }
    }
}
