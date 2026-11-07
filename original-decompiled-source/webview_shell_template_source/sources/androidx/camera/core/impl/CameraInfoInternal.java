package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.camera2.internal.v0;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraInfoInternal extends CameraInfo {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default List lambda$getCameraSelector$0(List list) {
        String cameraId = getCameraId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            androidx.work.j.b(cameraInfo instanceof CameraInfoInternal);
            if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalStateException(v0.b("Unable to find camera with id ", cameraId, " from list of available cameras."));
    }

    void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback);

    Object getCameraCharacteristics();

    String getCameraId();

    Quirks getCameraQuirks();

    @Override // androidx.camera.core.CameraInfo
    default CameraSelector getCameraSelector() {
        return new CameraSelector.Builder().addCameraFilter(new d(0, this)).addCameraFilter(new LensFacingCameraFilter(getLensFacing())).build();
    }

    EncoderProfilesProvider getEncoderProfilesProvider();

    Object getPhysicalCameraCharacteristics(String str);

    Set<DynamicRange> getSupportedDynamicRanges();

    List<Size> getSupportedHighResolutions(int i6);

    Set<Integer> getSupportedOutputFormats();

    List<Size> getSupportedResolutions(int i6);

    Timebase getTimebase();

    default boolean isCaptureProcessProgressSupported() {
        return false;
    }

    default boolean isPostviewSupported() {
        return false;
    }

    boolean isPreviewStabilizationSupported();

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback);

    default CameraInfoInternal getImplementation() {
        return this;
    }
}
