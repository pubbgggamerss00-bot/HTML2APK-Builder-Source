package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f373t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f374u;

    public /* synthetic */ k(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f373t = obj;
        this.f374u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((CameraCaptureSessionCompat.StateCallbackExecutorWrapper) this.f373t).lambda$onActive$3((CameraCaptureSession) this.f374u);
                break;
            default:
                ((CameraManagerCompat.AvailabilityCallbackExecutorWrapper) this.f373t).lambda$onCameraUnavailable$2((String) this.f374u);
                break;
        }
    }
}
