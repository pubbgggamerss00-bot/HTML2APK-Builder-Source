package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements b.c, o.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f457t;

    public /* synthetic */ r0(int i6, Object obj) {
        this.s = i6;
        this.f457t = obj;
    }

    @Override // o.a
    public Object apply(Object obj) {
        return ((ProcessingCaptureSession) this.f457t).lambda$open$3((Void) obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        switch (this.s) {
            case 0:
                return ((Camera2CapturePipeline.ScreenFlashTask) this.f457t).lambda$preCapture$5(aVar);
            default:
                return ((FocusMeteringControl) this.f457t).lambda$cancelFocusAndMetering$13(aVar);
        }
    }
}
