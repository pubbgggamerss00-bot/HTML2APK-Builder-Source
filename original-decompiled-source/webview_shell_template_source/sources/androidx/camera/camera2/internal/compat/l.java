package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f375t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AutoCloseable f376u;

    public /* synthetic */ l(Object obj, AutoCloseable autoCloseable, int i6) {
        this.s = i6;
        this.f375t = obj;
        this.f376u = autoCloseable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((CameraCaptureSessionCompat.StateCallbackExecutorWrapper) this.f375t).lambda$onClosed$5((CameraCaptureSession) this.f376u);
                break;
            default:
                ((CameraDeviceCompat.StateCallbackExecutorWrapper) this.f375t).lambda$onClosed$3((CameraDevice) this.f376u);
                break;
        }
    }
}
