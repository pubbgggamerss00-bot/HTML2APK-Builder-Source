package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.DeferrableSurface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f346t;

    public /* synthetic */ c0(int i6, Object obj) {
        this.s = i6;
        this.f346t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode) this.f346t).executeInternal();
                break;
            case 1:
                ProcessingCaptureSession.lambda$open$1((DeferrableSurface) this.f346t);
                break;
            case 2:
                VideoUsageControl.decrementUsage$lambda$1((VideoUsageControl) this.f346t);
                break;
            default:
                ((SafeCloseImageReaderProxy) this.f346t).safeClose();
                break;
        }
    }
}
