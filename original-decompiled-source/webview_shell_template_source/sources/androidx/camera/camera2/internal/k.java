package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f417t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f418u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f419v;

    public /* synthetic */ k(int i6, ExposureControl exposureControl, b.a aVar) {
        this.f418u = exposureControl;
        this.f419v = aVar;
        this.f417t = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((CameraCaptureCallback) this.f418u).onCaptureCompleted(this.f417t, (CameraCaptureResult) this.f419v);
                break;
            default:
                ((ExposureControl) this.f418u).lambda$setExposureCompensationIndex$1((b.a) this.f419v, this.f417t);
                break;
        }
    }

    public /* synthetic */ k(CameraCaptureCallback cameraCaptureCallback, int i6, CameraCaptureResult cameraCaptureResult) {
        this.f418u = cameraCaptureCallback;
        this.f417t = i6;
        this.f419v = cameraCaptureResult;
    }
}
