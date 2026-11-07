package androidx.camera.view;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends CameraCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.a f677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraInfo f678b;

    public c(b.a aVar, CameraInfo cameraInfo) {
        this.f677a = aVar;
        this.f678b = cameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureCompleted(int i6, CameraCaptureResult cameraCaptureResult) {
        this.f677a.a(null);
        ((CameraInfoInternal) this.f678b).removeSessionCaptureCallback(this);
    }
}
