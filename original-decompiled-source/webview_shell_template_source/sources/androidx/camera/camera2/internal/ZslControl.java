package androidx.camera.camera2.internal;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.SessionConfig;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
interface ZslControl {
    void addZslConfig(SessionConfig.Builder builder);

    ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(ImageProxy imageProxy);

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    void setZslDisabledByFlashMode(boolean z6);

    void setZslDisabledByUserCaseConfig(boolean z6);
}
