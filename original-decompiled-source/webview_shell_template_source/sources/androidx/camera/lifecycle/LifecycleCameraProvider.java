package androidx.camera.lifecycle;

import androidx.camera.core.CameraProvider;
import androidx.camera.core.UseCase;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
interface LifecycleCameraProvider extends CameraProvider {
    boolean isBound(UseCase useCase);

    void unbind(UseCase... useCaseArr);

    void unbindAll();
}
