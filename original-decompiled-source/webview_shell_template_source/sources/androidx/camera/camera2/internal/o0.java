package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements AsyncFunction, b.c, ForceCloseCaptureSession.OnConfigured {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f443t;

    public /* synthetic */ o0(int i6, Object obj) {
        this.s = i6;
        this.f443t = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        switch (this.s) {
            case 0:
                return ((Camera2CapturePipeline.Pipeline) this.f443t).lambda$executePreCapture$3((Boolean) obj);
            case 1:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f443t).lambda$preCapture$4((Void) obj);
            default:
                return ((Camera2CapturePipeline.TorchTask) this.f443t).lambda$preCapture$3((Void) obj);
        }
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        return ((CaptureSession) this.f443t).lambda$release$1(aVar);
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
    public void run(SynchronizedCaptureSession synchronizedCaptureSession) {
        ((SynchronizedCaptureSessionImpl) this.f443t).lambda$onConfigured$1(synchronizedCaptureSession);
    }
}
