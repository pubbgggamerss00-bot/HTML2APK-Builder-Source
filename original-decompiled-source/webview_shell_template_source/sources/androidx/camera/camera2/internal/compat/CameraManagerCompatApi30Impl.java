package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class CameraManagerCompatApi30Impl extends CameraManagerCompatApi29Impl {
    public CameraManagerCompatApi30Impl(Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getConcurrentCameraIds();
        } catch (CameraAccessException e6) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e6);
        }
    }
}
