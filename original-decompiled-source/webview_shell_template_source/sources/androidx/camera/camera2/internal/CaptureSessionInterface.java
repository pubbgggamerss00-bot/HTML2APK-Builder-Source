package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
interface CaptureSessionInterface {
    void cancelIssuedCaptureRequests();

    void close();

    List<CaptureConfig> getCaptureConfigs();

    SessionConfig getSessionConfig();

    boolean isInOpenState();

    void issueCaptureRequests(List<CaptureConfig> list);

    c5.a<Void> open(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener);

    c5.a<Void> release(boolean z6);

    void setSessionConfig(SessionConfig sessionConfig);

    void setStreamUseCaseMap(Map<DeferrableSurface, Long> map);
}
