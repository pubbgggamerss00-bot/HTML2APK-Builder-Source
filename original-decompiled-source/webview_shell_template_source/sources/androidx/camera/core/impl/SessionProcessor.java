package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface SessionProcessor {
    void abortCapture(int i6);

    void deInitSession();

    default Pair<Long, Long> getRealtimeCaptureLatency() {
        return null;
    }

    default Set<Integer> getSupportedCameraOperations() {
        return Collections.EMPTY_SET;
    }

    default Map<Integer, List<Size>> getSupportedPostviewSize(Size size) {
        return Collections.EMPTY_MAP;
    }

    SessionConfig initSession(CameraInfo cameraInfo, OutputSurfaceConfiguration outputSurfaceConfiguration);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(RequestProcessor requestProcessor);

    void setParameters(Config config);

    int startCapture(boolean z6, TagBundle tagBundle, CaptureCallback captureCallback);

    int startRepeating(TagBundle tagBundle, CaptureCallback captureCallback);

    default int startTrigger(Config config, TagBundle tagBundle, CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface CaptureCallback {
        default void onCaptureFailed(int i6) {
        }

        default void onCaptureProcessProgressed(int i6) {
        }

        default void onCaptureProcessStarted(int i6) {
        }

        default void onCaptureSequenceAborted(int i6) {
        }

        default void onCaptureSequenceCompleted(int i6) {
        }

        default void onCaptureStarted(int i6, long j6) {
        }

        default void onCaptureCompleted(long j6, int i6, CameraCaptureResult cameraCaptureResult) {
        }
    }
}
