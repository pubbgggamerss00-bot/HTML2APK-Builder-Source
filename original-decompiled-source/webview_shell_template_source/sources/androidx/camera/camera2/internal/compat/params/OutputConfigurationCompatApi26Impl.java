package androidx.camera.camera2.internal.compat.params;

import android.annotation.SuppressLint;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.work.j;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class OutputConfigurationCompatApi26Impl extends OutputConfigurationCompatApi24Impl {
    private static final String MAX_SHARED_SURFACES_COUNT_FIELD = "MAX_SURFACES_COUNT";
    private static final String SURFACES_FIELD = "mSurfaces";

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class OutputConfigurationParamsApi26 {
        long mDynamicRangeProfile = 1;
        final OutputConfiguration mOutputConfiguration;
        String mPhysicalCameraId;

        public OutputConfigurationParamsApi26(OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi26)) {
                return false;
            }
            OutputConfigurationParamsApi26 outputConfigurationParamsApi26 = (OutputConfigurationParamsApi26) obj;
            return Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi26.mOutputConfiguration) && this.mDynamicRangeProfile == outputConfigurationParamsApi26.mDynamicRangeProfile && Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi26.mPhysicalCameraId);
        }

        public int hashCode() {
            int iHashCode = this.mOutputConfiguration.hashCode() ^ 31;
            int i6 = (iHashCode << 5) - iHashCode;
            String str = this.mPhysicalCameraId;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i6;
            return Long.hashCode(this.mDynamicRangeProfile) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    public OutputConfigurationCompatApi26Impl(Surface surface) {
        this(new OutputConfigurationParamsApi26(new OutputConfiguration(surface)));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static int getMaxSharedSurfaceCountApi26() throws NoSuchFieldException, SecurityException {
        Field declaredField = OutputConfiguration.class.getDeclaredField(MAX_SHARED_SURFACES_COUNT_FIELD);
        declaredField.setAccessible(true);
        return declaredField.getInt(null);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static List<Surface> getMutableSurfaceListApi26(OutputConfiguration outputConfiguration) throws NoSuchFieldException, SecurityException {
        Field declaredField = OutputConfiguration.class.getDeclaredField(SURFACES_FIELD);
        declaredField.setAccessible(true);
        return (List) declaredField.get(outputConfiguration);
    }

    public static OutputConfigurationCompatApi26Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi26Impl(new OutputConfigurationParamsApi26(outputConfiguration));
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void addSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((OutputConfigurationParamsApi26) this.mObject).mDynamicRangeProfile;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        try {
            return getMaxSharedSurfaceCountApi26();
        } catch (IllegalAccessException | NoSuchFieldException e6) {
            Logger.e("OutputConfigCompat", "Unable to retrieve max shared surface count.", e6);
            return super.getMaxSharedSurfaceCount();
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        j.b(this.mObject instanceof OutputConfigurationParamsApi26);
        return ((OutputConfigurationParamsApi26) this.mObject).mOutputConfiguration;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public String getPhysicalCameraId() {
        return ((OutputConfigurationParamsApi26) this.mObject).mPhysicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public List<Surface> getSurfaces() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    public final boolean isSurfaceSharingEnabled() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        try {
            if (getMutableSurfaceListApi26((OutputConfiguration) getOutputConfiguration()).remove(surface)) {
            } else {
                throw new IllegalArgumentException("Surface is not part of this output configuration");
            }
        } catch (IllegalAccessException | NoSuchFieldException e6) {
            Logger.e("OutputConfigCompat", "Unable to remove surface from this output configuration.", e6);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j6) {
        ((OutputConfigurationParamsApi26) this.mObject).mDynamicRangeProfile = j6;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(String str) {
        ((OutputConfigurationParamsApi26) this.mObject).mPhysicalCameraId = str;
    }

    public OutputConfigurationCompatApi26Impl(int i6, Surface surface) {
        this(new OutputConfigurationParamsApi26(new OutputConfiguration(i6, surface)));
    }

    public OutputConfigurationCompatApi26Impl(Object obj) {
        super(obj);
    }
}
