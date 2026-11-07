package androidx.camera.core;

import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.SurfaceProcessorWithExecutor;
import androidx.camera.core.processing.TargetUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class CameraEffect {
    public static final int IMAGE_CAPTURE = 4;
    public static final int OUTPUT_OPTION_ONE_FOR_ALL_TARGETS = 0;
    public static final int OUTPUT_OPTION_ONE_FOR_EACH_TARGET = 1;
    public static final int PREVIEW = 1;
    private static final List<Integer> SURFACE_PROCESSOR_TARGETS = Arrays.asList(1, 2, 3, 7);
    public static final int TRANSFORMATION_ARBITRARY = 0;
    public static final int TRANSFORMATION_CAMERA_AND_SURFACE_ROTATION = 1;
    public static final int TRANSFORMATION_PASSTHROUGH = 2;
    public static final int VIDEO_CAPTURE = 2;
    private final t0.a<Throwable> mErrorListener;
    private final Executor mExecutor;
    private final ImageProcessor mImageProcessor;
    private final int mOutputOption;
    private final SurfaceProcessor mSurfaceProcessor;
    private final int mTargets;
    private final int mTransformation;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Formats {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputOptions {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Targets {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformations {
    }

    public CameraEffect(int i6, Executor executor, ImageProcessor imageProcessor, t0.a<Throwable> aVar) {
        androidx.work.j.a("Currently ImageProcessor can only target IMAGE_CAPTURE.", i6 == 4);
        this.mTargets = i6;
        this.mTransformation = 0;
        this.mOutputOption = 0;
        this.mExecutor = executor;
        this.mSurfaceProcessor = null;
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = aVar;
    }

    public SurfaceProcessorInternal createSurfaceProcessorInternal() {
        return new SurfaceProcessorWithExecutor(this);
    }

    public t0.a<Throwable> getErrorListener() {
        return this.mErrorListener;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public ImageProcessor getImageProcessor() {
        return this.mImageProcessor;
    }

    public int getOutputOption() {
        return this.mOutputOption;
    }

    public SurfaceProcessor getSurfaceProcessor() {
        return this.mSurfaceProcessor;
    }

    public int getTargets() {
        return this.mTargets;
    }

    public int getTransformation() {
        return this.mTransformation;
    }

    public CameraEffect(int i6, int i7, Executor executor, SurfaceProcessor surfaceProcessor, t0.a<Throwable> aVar) {
        this(i6, 0, i7, executor, surfaceProcessor, aVar);
    }

    public CameraEffect(int i6, int i7, int i8, Executor executor, SurfaceProcessor surfaceProcessor, t0.a<Throwable> aVar) {
        TargetUtils.checkSupportedTargets(SURFACE_PROCESSOR_TARGETS, i6);
        this.mTargets = i6;
        this.mOutputOption = i7;
        this.mTransformation = i8;
        this.mExecutor = executor;
        this.mSurfaceProcessor = surfaceProcessor;
        this.mImageProcessor = null;
        this.mErrorListener = aVar;
    }

    public CameraEffect(int i6, Executor executor, SurfaceProcessor surfaceProcessor, t0.a<Throwable> aVar) {
        this(i6, 0, 0, executor, surfaceProcessor, aVar);
    }
}
