package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements b.c, AsyncFunction {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f453t;

    public /* synthetic */ q0(int i6, Object obj) {
        this.s = i6;
        this.f453t = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        return ((Camera2CapturePipeline.ScreenFlashTask) this.f453t).lambda$preCapture$8((Void) obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return ((Camera2CapturePipeline.ResultListener) this.f453t).lambda$new$0(aVar);
            default:
                return ((Camera2CameraControlImpl) this.f453t).lambda$updateSessionConfigAsync$7(aVar);
        }
    }
}
