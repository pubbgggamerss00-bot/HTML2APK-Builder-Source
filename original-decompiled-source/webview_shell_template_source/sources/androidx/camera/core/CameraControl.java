package androidx.camera.core;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraControl {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }

        public OperationCanceledException(String str, Throwable th) {
            super(str, th);
        }
    }

    c5.a<Void> cancelFocusAndMetering();

    c5.a<Void> enableTorch(boolean z6);

    c5.a<Integer> setExposureCompensationIndex(int i6);

    c5.a<Void> setLinearZoom(float f6);

    c5.a<Void> setZoomRatio(float f6);

    c5.a<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction);
}
