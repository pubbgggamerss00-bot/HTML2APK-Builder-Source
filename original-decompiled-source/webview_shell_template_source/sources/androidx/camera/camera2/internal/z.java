package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f483t;

    public /* synthetic */ z(int i6, Object obj) {
        this.s = i6;
        this.f483t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Camera2CameraImpl) this.f483t).closeInternal();
                break;
            case 1:
                ((Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode) this.f483t).execute();
                break;
            default:
                ((Camera2CapturePipeline.Pipeline) this.f483t).executePostCapture();
                break;
        }
    }
}
