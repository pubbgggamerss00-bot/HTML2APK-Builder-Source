package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements b.c, AsyncFunction {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f455t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f456u;

    public /* synthetic */ r(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f455t = obj;
        this.f456u = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        return ((SynchronizedCaptureSessionBaseImpl) this.f455t).lambda$startWithDeferrableSurface$1((List) this.f456u, (List) obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return ((Camera2CameraImpl) this.f455t).lambda$isUseCaseAttached$12((String) this.f456u, aVar);
            default:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f455t).lambda$preCapture$3((AtomicReference) this.f456u, aVar);
        }
    }
}
