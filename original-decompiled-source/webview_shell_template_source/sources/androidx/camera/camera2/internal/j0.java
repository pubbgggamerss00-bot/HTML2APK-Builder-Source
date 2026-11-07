package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements b.c, AsyncFunction, ImageReaderProxy.OnImageAvailableListener {
    public final /* synthetic */ Object s;

    public /* synthetic */ j0(Object obj) {
        this.s = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public c5.a apply(Object obj) {
        return ((Camera2CapturePipeline.ScreenFlashTask) this.s).lambda$preCapture$6((Void) obj);
    }

    @Override // y.b.c
    public Object attachCompleter(b.a aVar) {
        return ((Camera2CapturePipeline.CameraCapturePipelineImpl) this.s).lambda$invokePostCapture$1(aVar);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ((ZslControlImpl) this.s).lambda$addZslConfig$1(imageReaderProxy);
    }
}
