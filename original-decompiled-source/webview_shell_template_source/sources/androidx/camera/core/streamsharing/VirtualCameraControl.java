package androidx.camera.core.streamsharing;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ForwardingCameraControl;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.work.j;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class VirtualCameraControl extends ForwardingCameraControl {
    private static final int DEFAULT_JPEG_QUALITY = 100;
    private static final int DEFAULT_ROTATION_DEGREES = 0;
    private final StreamSharing.Control mStreamSharingControl;

    public VirtualCameraControl(CameraControlInternal cameraControlInternal, StreamSharing.Control control) {
        super(cameraControlInternal);
        this.mStreamSharingControl = control;
    }

    private int getJpegQuality(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(DEFAULT_JPEG_QUALITY));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int getRotationDegrees(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_ROTATION, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c5.a lambda$submitStillCaptureRequests$0(c5.a aVar, CameraCapturePipeline cameraCapturePipeline) {
        return ((CameraCapturePipeline) aVar.get()).invokePreCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c5.a lambda$submitStillCaptureRequests$1(List list, Void r42) {
        return this.mStreamSharingControl.jpegSnapshot(getJpegQuality((CaptureConfig) list.get(0)), getRotationDegrees((CaptureConfig) list.get(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c5.a lambda$submitStillCaptureRequests$2(c5.a aVar, Void r12) {
        return ((CameraCapturePipeline) aVar.get()).invokePostCapture();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public c5.a<List<Void>> submitStillCaptureRequests(final List<CaptureConfig> list, int i6, int i7) {
        j.a("Only support one capture config.", list.size() == 1);
        c5.a<CameraCapturePipeline> cameraCapturePipelineAsync = getCameraCapturePipelineAsync(i6, i7);
        return Futures.allAsList(Collections.singletonList(FutureChain.from(cameraCapturePipelineAsync).transformAsync(new c(0, cameraCapturePipelineAsync), CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.d
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final c5.a apply(Object obj) {
                return this.s.lambda$submitStillCaptureRequests$1(list, (Void) obj);
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new e(1, cameraCapturePipelineAsync), CameraXExecutors.directExecutor())));
    }
}
