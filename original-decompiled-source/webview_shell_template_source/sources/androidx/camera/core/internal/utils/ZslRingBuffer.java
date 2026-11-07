package androidx.camera.core.internal.utils;

import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.internal.utils.RingBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ZslRingBuffer extends ArrayRingBuffer<ImageProxy> {
    public ZslRingBuffer(int i6, RingBuffer.OnRemoveCallback<ImageProxy> onRemoveCallback) {
        super(i6, onRemoveCallback);
    }

    private boolean isValidZslFrame(ImageInfo imageInfo) {
        CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(imageInfo);
        return (cameraCaptureResultRetrieveCameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.LOCKED_FOCUSED || cameraCaptureResultRetrieveCameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.PASSIVE_FOCUSED) && cameraCaptureResultRetrieveCameraCaptureResult.getAeState() == CameraCaptureMetaData.AeState.CONVERGED && cameraCaptureResultRetrieveCameraCaptureResult.getAwbState() == CameraCaptureMetaData.AwbState.CONVERGED;
    }

    @Override // androidx.camera.core.internal.utils.ArrayRingBuffer, androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(ImageProxy imageProxy) {
        if (isValidZslFrame(imageProxy.getImageInfo())) {
            super.enqueue((ZslRingBuffer) imageProxy);
        } else {
            this.mOnRemoveCallback.onRemove(imageProxy);
        }
    }
}
