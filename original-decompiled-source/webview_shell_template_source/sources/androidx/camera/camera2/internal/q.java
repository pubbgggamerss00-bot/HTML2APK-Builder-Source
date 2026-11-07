package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements MeteringRepeatingSession.SurfaceResetCallback, AsyncFunction, b.c {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f452t;

    public /* synthetic */ q(int i6, Object obj) {
        this.s = i6;
        this.f452t = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        return ((Camera2CapturePipeline.ScreenFlashTask) this.f452t).lambda$preCapture$10((Void) obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 2:
                return Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$1((AtomicReference) this.f452t, aVar);
            case 3:
                return ((Camera2CapturePipeline.TorchTask) this.f452t).lambda$preCapture$0(aVar);
            default:
                return ((FocusMeteringControl) this.f452t).lambda$triggerAePrecapture$3(aVar);
        }
    }

    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback
    public void onSurfaceReset() {
        ((Camera2CameraImpl) this.f452t).lambda$addOrRemoveMeteringRepeatingUseCase$17();
    }
}
