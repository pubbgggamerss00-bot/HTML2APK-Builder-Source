package androidx.camera.lifecycle;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.m;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_LifecycleCameraRepository_Key extends LifecycleCameraRepository.Key {
    private final CameraUseCaseAdapter.CameraId cameraId;
    private final m lifecycleOwner;

    public AutoValue_LifecycleCameraRepository_Key(m mVar, CameraUseCaseAdapter.CameraId cameraId) {
        if (mVar == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.lifecycleOwner = mVar;
        if (cameraId == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.cameraId = cameraId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LifecycleCameraRepository.Key) {
            LifecycleCameraRepository.Key key = (LifecycleCameraRepository.Key) obj;
            if (this.lifecycleOwner.equals(key.getLifecycleOwner()) && this.cameraId.equals(key.getCameraId())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public CameraUseCaseAdapter.CameraId getCameraId() {
        return this.cameraId;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public m getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public int hashCode() {
        return ((this.lifecycleOwner.hashCode() ^ 1000003) * 1000003) ^ this.cameraId.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.lifecycleOwner + ", cameraId=" + this.cameraId + "}";
    }
}
