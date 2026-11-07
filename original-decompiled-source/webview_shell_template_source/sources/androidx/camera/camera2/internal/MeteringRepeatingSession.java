package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class MeteringRepeatingSession {
    private static final int IMAGE_FORMAT = 34;
    private static final String TAG = "MeteringRepeating";
    private DeferrableSurface mDeferrableSurface;
    private final Size mMeteringRepeatingSize;
    private SessionConfig mSessionConfig;
    private final SurfaceResetCallback mSurfaceResetCallback;
    private final SupportedRepeatingSurfaceSize mSupportedRepeatingSurfaceSize = new SupportedRepeatingSurfaceSize();
    private SessionConfig.CloseableErrorListener mCloseableErrorListener = null;
    private final MeteringRepeatingConfig mConfigWithDefaults = new MeteringRepeatingConfig();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class MeteringRepeatingConfig implements UseCaseConfig<UseCase> {
        private final Config mConfig;

        public MeteringRepeatingConfig() {
            MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
            mutableOptionsBundleCreate.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new Camera2SessionOptionUnpacker());
            mutableOptionsBundleCreate.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
            setTargetConfigs(mutableOptionsBundleCreate);
            this.mConfig = mutableOptionsBundleCreate;
        }

        private void setTargetConfigs(MutableOptionsBundle mutableOptionsBundle) {
            mutableOptionsBundle.insertOption(TargetConfig.OPTION_TARGET_CLASS, MeteringRepeatingSession.class);
            mutableOptionsBundle.insertOption(TargetConfig.OPTION_TARGET_NAME, MeteringRepeatingSession.class.getCanonicalName() + "-" + UUID.randomUUID());
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public Config getConfig() {
            return this.mConfig;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface SurfaceResetCallback {
        void onSurfaceReset();
    }

    public MeteringRepeatingSession(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager, SurfaceResetCallback surfaceResetCallback) {
        this.mSurfaceResetCallback = surfaceResetCallback;
        Size properPreviewSize = getProperPreviewSize(cameraCharacteristicsCompat, displayInfoManager);
        this.mMeteringRepeatingSize = properPreviewSize;
        Logger.d(TAG, "MeteringSession SurfaceTexture size: " + properPreviewSize);
        this.mSessionConfig = createSessionConfig();
    }

    private Size getProperPreviewSize(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager) {
        Size[] outputSizes = cameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(34);
        if (outputSizes == null) {
            Logger.e(TAG, "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] supportedSizes = this.mSupportedRepeatingSurfaceSize.getSupportedSizes(outputSizes);
        List listAsList = Arrays.asList(supportedSizes);
        Collections.sort(listAsList, new s1());
        Size previewSize = displayInfoManager.getPreviewSize();
        long jMin = Math.min(previewSize.getWidth() * previewSize.getHeight(), 307200L);
        int length = supportedSizes.length;
        Size size = null;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            Size size2 = supportedSizes[i6];
            long width = size2.getWidth() * size2.getHeight();
            if (width == jMin) {
                return size2;
            }
            if (width <= jMin) {
                i6++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) listAsList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSessionConfig$0(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        this.mSessionConfig = createSessionConfig();
        SurfaceResetCallback surfaceResetCallback = this.mSurfaceResetCallback;
        if (surfaceResetCallback != null) {
            surfaceResetCallback.onSurfaceReset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getProperPreviewSize$1(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    public void clear() {
        Logger.d(TAG, "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.mDeferrableSurface = null;
    }

    public SessionConfig createSessionConfig() {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.mMeteringRepeatingSize.getWidth(), this.mMeteringRepeatingSize.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(this.mConfigWithDefaults, this.mMeteringRepeatingSize);
        builderCreateFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.mDeferrableSurface = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r12) {
                surface.release();
                surfaceTexture.release();
            }
        }, CameraXExecutors.directExecutor());
        builderCreateFrom.addSurface(this.mDeferrableSurface);
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.camera2.internal.r1
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                this.f458a.lambda$createSessionConfig$0(sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builderCreateFrom.setErrorListener(closeableErrorListener2);
        return builderCreateFrom.build();
    }

    public Size getMeteringRepeatingSize() {
        return this.mMeteringRepeatingSize;
    }

    public String getName() {
        return TAG;
    }

    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    public UseCaseConfig<?> getUseCaseConfig() {
        return this.mConfigWithDefaults;
    }
}
