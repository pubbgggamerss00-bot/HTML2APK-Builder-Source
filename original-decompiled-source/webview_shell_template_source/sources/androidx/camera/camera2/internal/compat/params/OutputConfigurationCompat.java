package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class OutputConfigurationCompat {
    public static final int STREAM_USE_CASE_NONE = -1;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final OutputConfigurationCompatImpl mImpl;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OutputConfigurationCompatImpl {
        void addSurface(Surface surface);

        void enableSurfaceSharing();

        long getDynamicRangeProfile();

        int getMaxSharedSurfaceCount();

        int getMirrorMode();

        Object getOutputConfiguration();

        String getPhysicalCameraId();

        long getStreamUseCase();

        Surface getSurface();

        int getSurfaceGroupId();

        List<Surface> getSurfaces();

        void removeSurface(Surface surface);

        void setDynamicRangeProfile(long j6);

        void setMirrorMode(int i6);

        void setPhysicalCameraId(String str);

        void setStreamUseCase(long j6);
    }

    public OutputConfigurationCompat(Surface surface) {
        this(-1, surface);
    }

    public static OutputConfigurationCompat wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        int i6 = Build.VERSION.SDK_INT;
        OutputConfigurationCompatImpl outputConfigurationCompatImplWrap = i6 >= 33 ? OutputConfigurationCompatApi33Impl.wrap((OutputConfiguration) obj) : i6 >= 28 ? OutputConfigurationCompatApi28Impl.wrap((OutputConfiguration) obj) : i6 >= 26 ? OutputConfigurationCompatApi26Impl.wrap((OutputConfiguration) obj) : OutputConfigurationCompatApi24Impl.wrap((OutputConfiguration) obj);
        if (outputConfigurationCompatImplWrap == null) {
            return null;
        }
        return new OutputConfigurationCompat(outputConfigurationCompatImplWrap);
    }

    public void addSurface(Surface surface) {
        this.mImpl.addSurface(surface);
    }

    public void enableSurfaceSharing() {
        this.mImpl.enableSurfaceSharing();
    }

    public boolean equals(Object obj) {
        if (obj instanceof OutputConfigurationCompat) {
            return this.mImpl.equals(((OutputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public long getDynamicRangeProfile() {
        return this.mImpl.getDynamicRangeProfile();
    }

    public int getMaxSharedSurfaceCount() {
        return this.mImpl.getMaxSharedSurfaceCount();
    }

    public int getMirrorMode() {
        return this.mImpl.getMirrorMode();
    }

    public String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public long getStreamUseCase() {
        return this.mImpl.getStreamUseCase();
    }

    public Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public int getSurfaceGroupId() {
        return this.mImpl.getSurfaceGroupId();
    }

    public List<Surface> getSurfaces() {
        return this.mImpl.getSurfaces();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public void removeSurface(Surface surface) {
        this.mImpl.removeSurface(surface);
    }

    public void setDynamicRangeProfile(long j6) {
        this.mImpl.setDynamicRangeProfile(j6);
    }

    public void setMirrorMode(int i6) {
        this.mImpl.setMirrorMode(i6);
    }

    public void setPhysicalCameraId(String str) {
        this.mImpl.setPhysicalCameraId(str);
    }

    public void setStreamUseCase(long j6) {
        this.mImpl.setStreamUseCase(j6);
    }

    public Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }

    public OutputConfigurationCompat(int i6, Surface surface) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.mImpl = new OutputConfigurationCompatApi33Impl(i6, surface);
            return;
        }
        if (i7 >= 28) {
            this.mImpl = new OutputConfigurationCompatApi28Impl(i6, surface);
        } else if (i7 >= 26) {
            this.mImpl = new OutputConfigurationCompatApi26Impl(i6, surface);
        } else {
            this.mImpl = new OutputConfigurationCompatApi24Impl(i6, surface);
        }
    }

    public <T> OutputConfigurationCompat(Size size, Class<T> cls) {
        OutputConfiguration outputConfigurationNewOutputConfiguration = ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            this.mImpl = OutputConfigurationCompatApi33Impl.wrap(outputConfigurationNewOutputConfiguration);
        } else if (i6 >= 28) {
            this.mImpl = OutputConfigurationCompatApi28Impl.wrap(outputConfigurationNewOutputConfiguration);
        } else {
            this.mImpl = OutputConfigurationCompatApi26Impl.wrap(outputConfigurationNewOutputConfiguration);
        }
    }

    public OutputConfigurationCompat(OutputConfiguration outputConfiguration) {
        this.mImpl = OutputConfigurationCompatApi33Impl.wrap(outputConfiguration);
    }

    private OutputConfigurationCompat(OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.mImpl = outputConfigurationCompatImpl;
    }
}
