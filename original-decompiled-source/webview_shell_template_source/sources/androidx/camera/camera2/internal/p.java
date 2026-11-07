package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f447t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f448u;

    public /* synthetic */ p(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f447t = obj;
        this.f448u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                Camera2CameraImpl.lambda$postSurfaceClosedError$19((SessionConfig.ErrorListener) this.f447t, (SessionConfig) this.f448u);
                break;
            case 1:
                ((Camera2CameraImpl) this.f447t).lambda$release$4((b.a) this.f448u);
                break;
            case 2:
                ((Camera2CameraControlImpl) this.f447t).removeCaptureResultListener((Camera2CapturePipeline.ResultListener) this.f448u);
                break;
            case 3:
                ((FocusMeteringControl) this.f447t).lambda$triggerAePrecapture$2((b.a) this.f448u);
                break;
            default:
                ((SynchronizedCaptureSessionBaseImpl) this.f447t).lambda$onClosed$3((SynchronizedCaptureSession) this.f448u);
                break;
        }
    }
}
