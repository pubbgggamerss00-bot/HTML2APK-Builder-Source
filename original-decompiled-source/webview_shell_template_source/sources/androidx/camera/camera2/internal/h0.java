package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements b.c, AsyncFunction, CameraBurstCaptureCallback.CaptureSequenceCallback {
    public final /* synthetic */ Object s;

    public /* synthetic */ h0(Object obj) {
        this.s = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        return ((Camera2CapturePipeline.TorchTask) this.s).lambda$preCapture$1((Void) obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        return ((Camera2CapturePipeline.AePreCaptureTask) this.s).lambda$preCapture$0(aVar);
    }

    @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
    public void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i6, boolean z6) {
        ((CaptureSession) this.s).lambda$issueBurstCaptureRequest$3(cameraCaptureSession, i6, z6);
    }
}
