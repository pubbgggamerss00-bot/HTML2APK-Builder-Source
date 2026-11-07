package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f340t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f341u;

    public /* synthetic */ b0(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f340t = obj;
        this.f341u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((Camera2CameraImpl) this.f340t).lambda$onUseCaseInactive$8((String) this.f341u);
                break;
            case 1:
                ((SynchronizedCaptureSessionBaseImpl) this.f340t).lambda$onSessionFinished$4((SynchronizedCaptureSession) this.f341u);
                break;
            default:
                ((Camera2CameraControlImpl) this.f340t).lambda$removeSessionCameraCaptureCallback$9((CameraCaptureCallback) this.f341u);
                break;
        }
    }
}
