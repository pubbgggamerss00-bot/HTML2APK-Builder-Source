package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.concurrent.CameraCoordinator;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraFactory {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface Provider {
        CameraFactory newInstance(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector, long j6);
    }

    Set<String> getAvailableCameraIds();

    CameraInternal getCamera(String str);

    CameraCoordinator getCameraCoordinator();

    Object getCameraManager();
}
