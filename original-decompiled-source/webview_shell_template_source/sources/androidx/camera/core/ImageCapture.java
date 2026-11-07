package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.p0;
import androidx.camera.core.imagecapture.ImageCaptureControl;
import androidx.camera.core.imagecapture.ImagePipeline;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.ScreenFlashWrapper;
import androidx.camera.core.internal.SupportedOutputSizesSorter;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.io.File;
import java.io.OutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ImageCapture extends UseCase {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;

    @ExperimentalZeroShutterLag
    public static final int CAPTURE_MODE_ZERO_SHUTTER_LAG = 2;
    private static final int DEFAULT_CAPTURE_MODE = 1;
    private static final int DEFAULT_FLASH_MODE = 2;
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    public static final int ERROR_UNKNOWN = 0;
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    public static final int FLASH_MODE_SCREEN = 3;
    private static final int FLASH_MODE_UNKNOWN = -1;
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;
    private static final byte JPEG_QUALITY_MAXIMIZE_QUALITY_MODE = 100;
    private static final byte JPEG_QUALITY_MINIMIZE_LATENCY_MODE = 95;
    private static final int MAX_IMAGES = 2;

    @ExperimentalImageCaptureOutputFormat
    public static final int OUTPUT_FORMAT_JPEG = 0;

    @ExperimentalImageCaptureOutputFormat
    public static final int OUTPUT_FORMAT_JPEG_ULTRA_HDR = 1;
    public static final long SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS = 3;
    private static final String TAG = "ImageCapture";
    private final int mCaptureMode;
    private SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private final ImageReaderProxy.OnImageAvailableListener mClosingListener;
    private Rational mCropAspectRatio;
    private int mFlashMode;
    private final int mFlashType;
    private final ImageCaptureControl mImageCaptureControl;
    private ImagePipeline mImagePipeline;
    private final AtomicReference<Integer> mLockedFlashMode;
    private ScreenFlashWrapper mScreenFlashWrapper;
    SessionConfig.Builder mSessionConfigBuilder;
    private TakePictureManager mTakePictureManager;
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    static final ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new ExifRotationAvailability();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder implements UseCaseConfig.Builder<ImageCapture, ImageCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, IoConfig.Builder<Builder>, ImageInputConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public Builder setBufferFormat(int i6) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, Integer.valueOf(i6));
            return this;
        }

        public Builder setCaptureMode(int i6) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, Integer.valueOf(i6));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setCustomOrderedResolutions(List list) {
            return setCustomOrderedResolutions((List<Size>) list);
        }

        public Builder setFlashMode(int i6) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_MODE, Integer.valueOf(i6));
            return this;
        }

        public Builder setFlashType(int i6) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_TYPE, Integer.valueOf(i6));
            return this;
        }

        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public Builder setJpegQuality(int i6) {
            androidx.work.j.c("jpegQuality", i6, 1, 100);
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i6));
            return this;
        }

        @ExperimentalImageCaptureOutputFormat
        public Builder setOutputFormat(int i6) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, Integer.valueOf(i6));
            return this;
        }

        public Builder setPostviewEnabled(boolean z6) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, Boolean.valueOf(z6));
            return this;
        }

        public Builder setPostviewResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        public Builder setScreenFlash(ScreenFlash screenFlash) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SCREEN_FLASH, screenFlash);
            return this;
        }

        public Builder setSoftwareJpegEncoderRequested(boolean z6) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.valueOf(z6));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public /* bridge */ /* synthetic */ Builder setSupportedResolutions(List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
            return setTargetClass((Class<ImageCapture>) cls);
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(ImageCapture.class)) {
                setCaptureType(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
                setTargetClass(ImageCapture.class);
            } else {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
        }

        public static Builder fromConfig(ImageCaptureConfig imageCaptureConfig) {
            return new Builder(MutableOptionsBundle.from((Config) imageCaptureConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public ImageCapture build() {
            Integer num = (Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num != null) {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, num);
            } else if (ImageCapture.isOutputFormatUltraHdr(getMutableConfig())) {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
            } else {
                getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            }
            ImageCaptureConfig useCaseConfig = getUseCaseConfig();
            ImageOutputConfig.validateConfig(useCaseConfig);
            ImageCapture imageCapture = new ImageCapture(useCaseConfig);
            Size size = (Size) getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null);
            if (size != null) {
                imageCapture.setCropAspectRatio(new Rational(size.getWidth(), size.getHeight()));
            }
            androidx.work.j.e("The IO executor can't be null", (Executor) getMutableConfig().retrieveOption(IoConfig.OPTION_IO_EXECUTOR, CameraXExecutors.ioExecutor()));
            MutableConfig mutableConfig = getMutableConfig();
            Config.Option<Integer> option = ImageCaptureConfig.OPTION_FLASH_MODE;
            if (mutableConfig.containsOption(option)) {
                Integer num2 = (Integer) getMutableConfig().retrieveOption(option);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_SCREEN_FLASH, null) == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
            return imageCapture;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public ImageCaptureConfig getUseCaseConfig() {
            return new ImageCaptureConfig(OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setCustomOrderedResolutions(List<Size> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageInputConfig.Builder
        public Builder setDynamicRange(DynamicRange dynamicRange) {
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setHighResolutionDisabled(boolean z6) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z6));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.IoConfig.Builder
        public Builder setIoExecutor(Executor executor) {
            getMutableConfig().insertOption(IoConfig.OPTION_IO_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setMirrorMode(int i6) {
            throw new UnsupportedOperationException("setMirrorMode is not supported.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setSurfaceOccupancyPriority(int i6) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i6));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public Builder setTargetAspectRatio(int i6) {
            if (i6 == -1) {
                i6 = 0;
            }
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i6));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetClass(Class<ImageCapture> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @Deprecated
        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public Builder setTargetRotation(int i6) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i6));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public Builder setZslDisabled(boolean z6) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z6));
            return this;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CaptureMode {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Defaults implements ConfigProvider<ImageCaptureConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageCaptureConfig DEFAULT_CONFIG;
        private static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final int DEFAULT_OUTPUT_FORMAT = 0;
        private static final ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 4;

        static {
            ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
            DEFAULT_RESOLUTION_SELECTOR = resolutionSelectorBuild;
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            DEFAULT_CONFIG = new Builder().setSurfaceOccupancyPriority(4).setTargetAspectRatio(0).setResolutionSelector(resolutionSelectorBuild).setOutputFormat(0).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        public ImageCaptureConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FlashMode {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FlashType {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ImageCaptureCapabilitiesImpl implements ImageCaptureCapabilities {
        private final CameraInfo mCameraInfo;

        public ImageCaptureCapabilitiesImpl(CameraInfo cameraInfo) {
            this.mCameraInfo = cameraInfo;
        }

        private boolean isUltraHdrSupported() {
            CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof CameraInfoInternal) {
                return ((CameraInfoInternal) cameraInfo).getSupportedOutputFormats().contains(4101);
            }
            return false;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        @ExperimentalImageCaptureOutputFormat
        public Set<Integer> getSupportedOutputFormats() {
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            if (isUltraHdrSupported()) {
                hashSet.add(1);
            }
            return hashSet;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public boolean isCaptureProcessProgressSupported() {
            CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof CameraInfoInternal) {
                return ((CameraInfoInternal) cameraInfo).isCaptureProcessProgressSupported();
            }
            return false;
        }

        @Override // androidx.camera.core.ImageCaptureCapabilities
        public boolean isPostviewSupported() {
            CameraInfo cameraInfo = this.mCameraInfo;
            if (cameraInfo instanceof CameraInfoInternal) {
                return ((CameraInfoInternal) cameraInfo).isPostviewSupported();
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageCaptureError {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Metadata {
        private boolean mIsReversedHorizontal;
        private boolean mIsReversedHorizontalSet = false;
        private boolean mIsReversedVertical;
        private Location mLocation;

        public Location getLocation() {
            return this.mLocation;
        }

        public boolean isReversedHorizontal() {
            return this.mIsReversedHorizontal;
        }

        public boolean isReversedHorizontalSet() {
            return this.mIsReversedHorizontalSet;
        }

        public boolean isReversedVertical() {
            return this.mIsReversedVertical;
        }

        public void setLocation(Location location) {
            this.mLocation = location;
        }

        public void setReversedHorizontal(boolean z6) {
            this.mIsReversedHorizontal = z6;
            this.mIsReversedHorizontalSet = true;
        }

        public void setReversedVertical(boolean z6) {
            this.mIsReversedVertical = z6;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.mIsReversedHorizontal + ", mIsReversedVertical=" + this.mIsReversedVertical + ", mLocation=" + this.mLocation + "}";
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class OutputFileOptions {
        private final ContentResolver mContentResolver;
        private final ContentValues mContentValues;
        private final File mFile;
        private final Metadata mMetadata;
        private final OutputStream mOutputStream;
        private final Uri mSaveCollection;

        public OutputFileOptions(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, Metadata metadata) {
            this.mFile = file;
            this.mContentResolver = contentResolver;
            this.mSaveCollection = uri;
            this.mContentValues = contentValues;
            this.mOutputStream = outputStream;
            this.mMetadata = metadata == null ? new Metadata() : metadata;
        }

        public ContentResolver getContentResolver() {
            return this.mContentResolver;
        }

        public ContentValues getContentValues() {
            return this.mContentValues;
        }

        public File getFile() {
            return this.mFile;
        }

        public Metadata getMetadata() {
            return this.mMetadata;
        }

        public OutputStream getOutputStream() {
            return this.mOutputStream;
        }

        public Uri getSaveCollection() {
            return this.mSaveCollection;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.mFile + ", mContentResolver=" + this.mContentResolver + ", mSaveCollection=" + this.mSaveCollection + ", mContentValues=" + this.mContentValues + ", mOutputStream=" + this.mOutputStream + ", mMetadata=" + this.mMetadata + "}";
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class Builder {
            private ContentResolver mContentResolver;
            private ContentValues mContentValues;
            private File mFile;
            private Metadata mMetadata;
            private OutputStream mOutputStream;
            private Uri mSaveCollection;

            public Builder(File file) {
                this.mFile = file;
            }

            public OutputFileOptions build() {
                return new OutputFileOptions(this.mFile, this.mContentResolver, this.mSaveCollection, this.mContentValues, this.mOutputStream, this.mMetadata);
            }

            public Builder setMetadata(Metadata metadata) {
                this.mMetadata = metadata;
                return this;
            }

            public Builder(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
                this.mContentResolver = contentResolver;
                this.mSaveCollection = uri;
                this.mContentValues = contentValues;
            }

            public Builder(OutputStream outputStream) {
                this.mOutputStream = outputStream;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class OutputFileResults {
        private final Uri mSavedUri;

        public OutputFileResults(Uri uri) {
            this.mSavedUri = uri;
        }

        public Uri getSavedUri() {
            return this.mSavedUri;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputFormat {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface ScreenFlash {
        void apply(long j6, ScreenFlashListener screenFlashListener);

        void clear();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface ScreenFlashListener {
        void onCompleted();
    }

    public ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.mClosingListener = new t();
        this.mLockedFlashMode = new AtomicReference<>(null);
        this.mFlashMode = -1;
        this.mCropAspectRatio = null;
        this.mImageCaptureControl = new ImageCaptureControl() { // from class: androidx.camera.core.ImageCapture.1
            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public void lockFlashMode() {
                ImageCapture.this.lockFlashMode();
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public c5.a<Void> submitStillCaptureRequests(List<CaptureConfig> list) {
                return ImageCapture.this.submitStillCaptureRequest(list);
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public void unlockFlashMode() {
                ImageCapture.this.unlockFlashMode();
            }
        };
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig2.containsOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE)) {
            this.mCaptureMode = imageCaptureConfig2.getCaptureMode();
        } else {
            this.mCaptureMode = 1;
        }
        this.mFlashType = imageCaptureConfig2.getFlashType(0);
        this.mScreenFlashWrapper = ScreenFlashWrapper.from(imageCaptureConfig2.getScreenFlash());
    }

    private void abortImageCaptureRequests() {
        this.mScreenFlashWrapper.completePendingTasks();
        TakePictureManager takePictureManager = this.mTakePictureManager;
        if (takePictureManager != null) {
            takePictureManager.abortRequests();
        }
    }

    private void clearPipeline() {
        clearPipeline(false);
    }

    public static Rect computeDispatchCropRect(Rect rect, Rational rational, int i6, Size size, int i7) {
        if (rect != null) {
            return ImageUtil.computeCropRectFromDispatchInfo(rect, i6, size, i7);
        }
        if (rational != null) {
            if (i7 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (ImageUtil.isAspectRatioValid(size, rational)) {
                Rect rectComputeCropRectFromAspectRatio = ImageUtil.computeCropRectFromAspectRatio(size, rational);
                Objects.requireNonNull(rectComputeCropRectFromAspectRatio);
                return rectComputeCropRectFromAspectRatio;
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private SessionConfig.Builder createPipeline(String str, ImageCaptureConfig imageCaptureConfig, StreamSpec streamSpec) {
        SessionProcessor sessionProcessor;
        Threads.checkMainThread();
        Log.d(TAG, String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, streamSpec));
        Size resolution = streamSpec.getResolution();
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        boolean z6 = !camera.getHasTransform();
        Size size = null;
        if (this.mImagePipeline != null) {
            androidx.work.j.f(null, z6);
            this.mImagePipeline.close();
        }
        int i6 = 35;
        if (((Boolean) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, Boolean.FALSE)).booleanValue() && (sessionProcessor = getSessionProcessor()) != null) {
            ResolutionSelector resolutionSelector = (ResolutionSelector) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
            Map<Integer, List<Size>> supportedPostviewSize = sessionProcessor.getSupportedPostviewSize(resolution);
            List<Size> list = supportedPostviewSize.get(35);
            if (list == null || list.isEmpty()) {
                i6 = 256;
                list = supportedPostviewSize.get(256);
            }
            List<Size> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                if (resolutionSelector != null) {
                    Collections.sort(list2, new CompareSizesByArea(true));
                    CameraInternal camera2 = getCamera();
                    Rect sensorRect = camera2.getCameraControlInternal().getSensorRect();
                    CameraInfoInternal cameraInfoInternal = camera2.getCameraInfoInternal();
                    List<Size> listSortSupportedOutputSizesByResolutionSelector = SupportedOutputSizesSorter.sortSupportedOutputSizesByResolutionSelector(resolutionSelector, list2, null, getTargetRotation(), new Rational(sensorRect.width(), sensorRect.height()), cameraInfoInternal.getSensorRotationDegrees(), cameraInfoInternal.getLensFacing());
                    if (listSortSupportedOutputSizesByResolutionSelector.isEmpty()) {
                        throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                    }
                    size = listSortSupportedOutputSizesByResolutionSelector.get(0);
                } else {
                    size = (Size) Collections.max(list2, new CompareSizesByArea());
                }
            }
        }
        this.mImagePipeline = new ImagePipeline(imageCaptureConfig, resolution, getEffect(), z6, size, i6);
        if (this.mTakePictureManager == null) {
            this.mTakePictureManager = new TakePictureManager(this.mImageCaptureControl);
        }
        this.mTakePictureManager.setImagePipeline(this.mImagePipeline);
        SessionConfig.Builder builderCreateSessionConfigBuilder = this.mImagePipeline.createSessionConfigBuilder(streamSpec.getResolution());
        if (getCaptureMode() == 2 && !streamSpec.getZslDisabled()) {
            getCameraControl().addZslConfig(builderCreateSessionConfigBuilder);
        }
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateSessionConfigBuilder.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new k(this, 1));
        this.mCloseableErrorListener = closeableErrorListener2;
        builderCreateSessionConfigBuilder.setErrorListener(closeableErrorListener2);
        return builderCreateSessionConfigBuilder;
    }

    private int getCameraLens() {
        CameraInternal camera = getCamera();
        if (camera != null) {
            return camera.getCameraInfo().getLensFacing();
        }
        return -1;
    }

    public static int getError(Throwable th) {
        if (th instanceof CameraClosedException) {
            return 3;
        }
        if (th instanceof ImageCaptureException) {
            return ((ImageCaptureException) th).getImageCaptureError();
        }
        return 0;
    }

    public static ImageCaptureCapabilities getImageCaptureCapabilities(CameraInfo cameraInfo) {
        return new ImageCaptureCapabilitiesImpl(cameraInfo);
    }

    private int getJpegQualityInternal() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig.containsOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY)) {
            return imageCaptureConfig.getJpegQuality();
        }
        int i6 = this.mCaptureMode;
        if (i6 == 0) {
            return 100;
        }
        if (i6 == 1 || i6 == 2) {
            return 95;
        }
        throw new IllegalStateException(p0.a(new StringBuilder("CaptureMode "), this.mCaptureMode, " is invalid"));
    }

    private SessionProcessor getSessionProcessor() {
        return getCamera().getExtendedConfig().getSessionProcessor(null);
    }

    private Rect getTakePictureCropRect() {
        Rect viewPortCropRect = getViewPortCropRect();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        Objects.requireNonNull(attachedSurfaceResolution);
        if (viewPortCropRect != null) {
            return viewPortCropRect;
        }
        if (!ImageUtil.isAspectRatioValid(this.mCropAspectRatio)) {
            return new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        int relativeRotation = getRelativeRotation(camera);
        Rational rational = new Rational(this.mCropAspectRatio.getDenominator(), this.mCropAspectRatio.getNumerator());
        if (!TransformUtils.is90or270(relativeRotation)) {
            rational = this.mCropAspectRatio;
        }
        Rect rectComputeCropRectFromAspectRatio = ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational);
        Objects.requireNonNull(rectComputeCropRectFromAspectRatio);
        return rectComputeCropRectFromAspectRatio;
    }

    private static boolean isImageFormatSupported(List<Pair<Integer, Size[]>> list, int i6) {
        if (list == null) {
            return false;
        }
        Iterator<Pair<Integer, Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next().first).equals(Integer.valueOf(i6))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isOutputFormatUltraHdr(MutableConfig mutableConfig) {
        return Objects.equals(mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, null), 1);
    }

    private boolean isSessionProcessorEnabledInCurrentCamera() {
        return (getCamera() == null || getCamera().getExtendedConfig().getSessionProcessor(null) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createPipeline$3(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        if (getCamera() == null) {
            return;
        }
        this.mTakePictureManager.pause();
        clearPipeline(true);
        String cameraId = getCameraId();
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        StreamSpec attachedStreamSpec = getAttachedStreamSpec();
        attachedStreamSpec.getClass();
        SessionConfig.Builder builderCreatePipeline = createPipeline(cameraId, imageCaptureConfig, attachedStreamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        Object[] objArr = {builderCreatePipeline.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        notifyReset();
        this.mTakePictureManager.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            try {
                Log.d(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxyAcquireLatestImage);
                if (imageProxyAcquireLatestImage != null) {
                    imageProxyAcquireLatestImage.close();
                }
            } finally {
            }
        } catch (IllegalStateException e6) {
            Log.e(TAG, "Failed to acquire latest image.", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$submitStillCaptureRequest$4(List list) {
        return null;
    }

    private void sendInvalidCameraError(Executor executor, OnImageCapturedCallback onImageCapturedCallback, OnImageSavedCallback onImageSavedCallback) {
        ImageCaptureException imageCaptureException = new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
        if (onImageCapturedCallback != null) {
            onImageCapturedCallback.onError(imageCaptureException);
        } else {
            if (onImageSavedCallback == null) {
                throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            onImageSavedCallback.onError(imageCaptureException);
        }
    }

    private void setScreenFlashToCameraControl() {
        setScreenFlashToCameraControl(this.mScreenFlashWrapper);
    }

    private void takePictureInternal(Executor executor, OnImageCapturedCallback onImageCapturedCallback, OnImageSavedCallback onImageSavedCallback, OutputFileOptions outputFileOptions) {
        Threads.checkMainThread();
        if (getFlashMode() == 3 && this.mScreenFlashWrapper.getBaseScreenFlash() == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d(TAG, "takePictureInternal");
        CameraInternal camera = getCamera();
        if (camera == null) {
            sendInvalidCameraError(executor, onImageCapturedCallback, onImageSavedCallback);
            return;
        }
        TakePictureManager takePictureManager = this.mTakePictureManager;
        Objects.requireNonNull(takePictureManager);
        takePictureManager.offerRequest(TakePictureRequest.of(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, getTakePictureCropRect(), getSensorToBufferTransformMatrix(), getRelativeRotation(camera), getJpegQualityInternal(), getCaptureMode(), this.mSessionConfigBuilder.getSingleCameraCaptureCallbacks()));
    }

    private void trySetFlashModeToCameraControl() {
        synchronized (this.mLockedFlashMode) {
            try {
                if (this.mLockedFlashMode.get() != null) {
                    return;
                }
                getCameraControl().setFlashMode(getFlashMode());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean enforceSoftwareJpegConstraints(MutableConfig mutableConfig) {
        boolean z6;
        Boolean bool = Boolean.TRUE;
        Config.Option<Boolean> option = ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
        Boolean bool2 = Boolean.FALSE;
        boolean z7 = false;
        if (bool.equals(mutableConfig.retrieveOption(option, bool2))) {
            if (isSessionProcessorEnabledInCurrentCamera()) {
                Logger.w(TAG, "Software JPEG cannot be used with Extensions.");
                z6 = false;
            } else {
                z6 = true;
            }
            Integer num = (Integer) mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z7 = z6;
            } else {
                Logger.w(TAG, "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z7) {
                Logger.w(TAG, "Unable to support software JPEG. Disabling.");
                mutableConfig.insertOption(option, bool2);
            }
        }
        return z7;
    }

    public int getCaptureMode() {
        return this.mCaptureMode;
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig<?> getDefaultConfig(boolean z6, UseCaseConfigFactory useCaseConfigFactory) {
        Defaults defaults = DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), getCaptureMode());
        if (z6) {
            config = Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public int getFlashMode() {
        int flashMode;
        synchronized (this.mLockedFlashMode) {
            flashMode = this.mFlashMode;
            if (flashMode == -1) {
                flashMode = ((ImageCaptureConfig) getCurrentConfig()).getFlashMode(2);
            }
        }
        return flashMode;
    }

    public ImagePipeline getImagePipeline() {
        return this.mImagePipeline;
    }

    public int getJpegQuality() {
        return getJpegQualityInternal();
    }

    @ExperimentalImageCaptureOutputFormat
    public int getOutputFormat() {
        Integer num = (Integer) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, 0);
        num.getClass();
        return num.intValue();
    }

    public ResolutionSelector getPostviewResolutionSelector() {
        return (ResolutionSelector) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
    }

    public ImageCaptureLatencyEstimate getRealtimeCaptureLatencyEstimate() {
        CameraInternal camera = getCamera();
        if (camera == null) {
            return ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY;
        }
        Pair<Long, Long> realtimeCaptureLatency = camera.getExtendedConfig().getSessionProcessor().getRealtimeCaptureLatency();
        return realtimeCaptureLatency == null ? ImageCaptureLatencyEstimate.UNDEFINED_IMAGE_CAPTURE_LATENCY : new ImageCaptureLatencyEstimate(((Long) realtimeCaptureLatency.first).longValue(), ((Long) realtimeCaptureLatency.second).longValue());
    }

    public ResolutionInfo getResolutionInfo() {
        return getResolutionInfoInternal();
    }

    @Override // androidx.camera.core.UseCase
    public ResolutionInfo getResolutionInfoInternal() {
        CameraInternal camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        Rect viewPortCropRect = getViewPortCropRect();
        Rational rational = this.mCropAspectRatio;
        if (viewPortCropRect == null) {
            viewPortCropRect = rational != null ? ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational) : new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        int relativeRotation = getRelativeRotation(camera);
        Objects.requireNonNull(viewPortCropRect);
        return new ResolutionInfo(attachedSurfaceResolution, viewPortCropRect, relativeRotation);
    }

    public ResolutionSelector getResolutionSelector() {
        return ((ImageOutputConfig) getCurrentConfig()).getResolutionSelector(null);
    }

    public ScreenFlash getScreenFlash() {
        return this.mScreenFlashWrapper.getBaseScreenFlash();
    }

    @Override // androidx.camera.core.UseCase
    public Set<Integer> getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public TakePictureManager getTakePictureManager() {
        TakePictureManager takePictureManager = this.mTakePictureManager;
        Objects.requireNonNull(takePictureManager);
        return takePictureManager;
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    public boolean isPostviewEnabled() {
        return ((Boolean) getCurrentConfig().retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, Boolean.FALSE)).booleanValue();
    }

    public boolean isProcessingPipelineEnabled() {
        return (this.mImagePipeline == null || this.mTakePictureManager == null) ? false : true;
    }

    public void lockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            try {
                if (this.mLockedFlashMode.get() != null) {
                    return;
                }
                this.mLockedFlashMode.set(Integer.valueOf(getFlashMode()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        androidx.work.j.e("Attached camera cannot be null", getCamera());
        if (getFlashMode() == 3 && getCameraLens() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // androidx.camera.core.UseCase
    public void onCameraControlReady() {
        Logger.d(TAG, "onCameraControlReady");
        trySetFlashModeToCameraControl();
        setScreenFlashToCameraControl();
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        if (cameraInfoInternal.getCameraQuirks().contains(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            MutableConfig mutableConfig = builder.getMutableConfig();
            Config.Option<Boolean> option = ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(mutableConfig.retrieveOption(option, bool2))) {
                Logger.w(TAG, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                Logger.i(TAG, "Requesting software JPEG due to device quirk.");
                builder.getMutableConfig().insertOption(option, bool2);
            }
        }
        boolean zEnforceSoftwareJpegConstraints = enforceSoftwareJpegConstraints(builder.getMutableConfig());
        Integer num = (Integer) builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            androidx.work.j.a("Cannot set non-JPEG buffer format with Extensions enabled.", !isSessionProcessorEnabledInCurrentCamera() || num.intValue() == 256);
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, Integer.valueOf(zEnforceSoftwareJpegConstraints ? 35 : num.intValue()));
        } else if (isOutputFormatUltraHdr(builder.getMutableConfig())) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
        } else if (zEnforceSoftwareJpegConstraints) {
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
        } else {
            List list = (List) builder.getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
            if (list == null || isImageFormatSupported(list, 256)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
            } else if (isImageFormatSupported(list, 35)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
            }
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public void onStateDetached() {
        abortImageCaptureRequests();
    }

    @Override // androidx.camera.core.UseCase
    public StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        Object[] objArr = {this.mSessionConfigBuilder.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    @Override // androidx.camera.core.UseCase
    public StreamSpec onSuggestedStreamSpecUpdated(StreamSpec streamSpec, StreamSpec streamSpec2) {
        SessionConfig.Builder builderCreatePipeline = createPipeline(getCameraId(), (ImageCaptureConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        Object[] objArr = {builderCreatePipeline.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        notifyActive();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        abortImageCaptureRequests();
        clearPipeline();
        setScreenFlashToCameraControl(null);
    }

    public void setCropAspectRatio(Rational rational) {
        this.mCropAspectRatio = rational;
    }

    public void setFlashMode(int i6) {
        Logger.d(TAG, "setFlashMode: flashMode = " + i6);
        if (i6 != 0 && i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Invalid flash mode: "));
            }
            if (this.mScreenFlashWrapper.getBaseScreenFlash() == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (getCamera() != null && getCameraLens() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.mLockedFlashMode) {
            this.mFlashMode = i6;
            trySetFlashModeToCameraControl();
        }
    }

    public void setScreenFlash(ScreenFlash screenFlash) {
        this.mScreenFlashWrapper = ScreenFlashWrapper.from(screenFlash);
        setScreenFlashToCameraControl();
    }

    public void setTargetRotation(int i6) {
        int targetRotation = getTargetRotation();
        if (!setTargetRotationInternal(i6) || this.mCropAspectRatio == null) {
            return;
        }
        this.mCropAspectRatio = ImageUtil.getRotatedAspectRatio(Math.abs(CameraOrientationUtil.surfaceRotationToDegrees(i6) - CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)), this.mCropAspectRatio);
    }

    public c5.a<Void> submitStillCaptureRequest(List<CaptureConfig> list) {
        Threads.checkMainThread();
        return Futures.transform(getCameraControl().submitStillCaptureRequests(list, this.mCaptureMode, this.mFlashType), new u(), CameraXExecutors.directExecutor());
    }

    /* renamed from: takePicture, reason: merged with bridge method [inline-methods] */
    public void lambda$takePicture$1(Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new q(this, executor, onImageCapturedCallback, 0));
        } else {
            takePictureInternal(executor, onImageCapturedCallback, null, null);
        }
    }

    public String toString() {
        return "ImageCapture:" + getName();
    }

    public void unlockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            try {
                Integer andSet = this.mLockedFlashMode.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != getFlashMode()) {
                    trySetFlashModeToCameraControl();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void clearPipeline(boolean z6) {
        TakePictureManager takePictureManager;
        Log.d(TAG, "clearPipeline");
        Threads.checkMainThread();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        ImagePipeline imagePipeline = this.mImagePipeline;
        if (imagePipeline != null) {
            imagePipeline.close();
            this.mImagePipeline = null;
        }
        if (z6 || (takePictureManager = this.mTakePictureManager) == null) {
            return;
        }
        takePictureManager.abortRequests();
        this.mTakePictureManager = null;
    }

    private void setScreenFlashToCameraControl(ScreenFlash screenFlash) {
        getCameraControl().setScreenFlash(screenFlash);
    }

    /* renamed from: takePicture, reason: merged with bridge method [inline-methods] */
    public void lambda$takePicture$2(OutputFileOptions outputFileOptions, Executor executor, OnImageSavedCallback onImageSavedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new s(this, outputFileOptions, executor, onImageSavedCallback, 0));
        } else {
            takePictureInternal(executor, null, onImageSavedCallback, outputFileOptions);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class OnImageCapturedCallback {
        public void onCaptureStarted() {
        }

        public void onCaptureProcessProgressed(int i6) {
        }

        public void onCaptureSuccess(ImageProxy imageProxy) {
        }

        public void onError(ImageCaptureException imageCaptureException) {
        }

        public void onPostviewBitmapAvailable(Bitmap bitmap) {
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnImageSavedCallback {
        void onError(ImageCaptureException imageCaptureException);

        void onImageSaved(OutputFileResults outputFileResults);

        default void onCaptureStarted() {
        }

        default void onCaptureProcessProgressed(int i6) {
        }

        default void onPostviewBitmapAvailable(Bitmap bitmap) {
        }
    }
}
