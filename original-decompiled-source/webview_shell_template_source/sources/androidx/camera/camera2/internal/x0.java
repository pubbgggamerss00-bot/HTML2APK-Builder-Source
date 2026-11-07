package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements AsyncFunction, b.c {
    public final /* synthetic */ Object s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f475t;

    public /* synthetic */ x0(Object obj, Object obj2) {
        this.s = obj;
        this.f475t = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        return ((Camera2CapturePipeline.ScreenFlashTask) this.s).lambda$preCapture$7((b.d) this.f475t, obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        return ((ZoomControl) this.s).lambda$setZoomRatio$1((ZoomState) this.f475t, aVar);
    }
}
