package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.CaptureConfig;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ImageCaptureControl {
    void lockFlashMode();

    c5.a<Void> submitStillCaptureRequests(List<CaptureConfig> list);

    void unlockFlashMode();
}
