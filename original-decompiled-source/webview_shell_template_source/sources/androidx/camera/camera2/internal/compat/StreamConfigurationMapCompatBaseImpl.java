package androidx.camera.camera2.internal.compat;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;
import androidx.camera.core.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class StreamConfigurationMapCompatBaseImpl implements StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl {
    private static final String TAG = "StreamConfigurationMapCompatBaseImpl";
    final StreamConfigurationMap mStreamConfigurationMap;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Size[] getHighResolutionOutputSizes(StreamConfigurationMap streamConfigurationMap, int i6) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i6);
        }
    }

    public StreamConfigurationMapCompatBaseImpl(StreamConfigurationMap streamConfigurationMap) {
        this.mStreamConfigurationMap = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getHighResolutionOutputSizes(int i6) {
        return Api23Impl.getHighResolutionOutputSizes(this.mStreamConfigurationMap, i6);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public int[] getOutputFormats() {
        try {
            return this.mStreamConfigurationMap.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e6) {
            Logger.w(TAG, "Failed to get output formats from StreamConfigurationMap", e6);
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getOutputSizes(int i6) {
        return i6 == 34 ? this.mStreamConfigurationMap.getOutputSizes(SurfaceTexture.class) : this.mStreamConfigurationMap.getOutputSizes(i6);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public StreamConfigurationMap unwrap() {
        return this.mStreamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public <T> Size[] getOutputSizes(Class<T> cls) {
        return this.mStreamConfigurationMap.getOutputSizes(cls);
    }
}
