package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CaptureBundles;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.InternalImageProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ImagePipeline {
    static final ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new ExifRotationAvailability();
    static final byte JPEG_QUALITY_MAX_QUALITY = 100;
    static final byte JPEG_QUALITY_MIN_LATENCY = 95;
    private static int sNextRequestId;
    private final CaptureConfig mCaptureConfig;
    private final CaptureNode mCaptureNode;
    private final CaptureNode.In mPipelineIn;
    private final ProcessingNode mProcessingNode;
    private final ImageCaptureConfig mUseCaseConfig;

    public ImagePipeline(ImageCaptureConfig imageCaptureConfig, Size size) {
        this(imageCaptureConfig, size, null, false, null, 35);
    }

    private CameraRequest createCameraRequest(int i6, CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        for (CaptureStage captureStage : captureStages) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(takePictureRequest.getSessionConfigCameraCaptureCallbacks());
            builder.addSurface(this.mPipelineIn.getSurface());
            builder.setPostviewEnabled(shouldEnablePostview());
            if (ImageUtil.isJpegFormats(this.mPipelineIn.getInputFormat())) {
                if (EXIF_ROTATION_AVAILABILITY.isRotationOptionSupported()) {
                    builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(takePictureRequest.getRotationDegrees()));
                }
                builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(getCameraRequestJpegQuality(takePictureRequest)));
            }
            builder.addImplementationOptions(captureStage.getCaptureConfig().getImplementationOptions());
            builder.addTag(strValueOf, Integer.valueOf(captureStage.getId()));
            builder.setId(i6);
            builder.addCameraCaptureCallback(this.mPipelineIn.getCameraCaptureCallback());
            arrayList.add(builder.build());
        }
        return new CameraRequest(arrayList, takePictureCallback);
    }

    private CaptureBundle createCaptureBundle() {
        CaptureBundle captureBundle = this.mUseCaseConfig.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        Objects.requireNonNull(captureBundle);
        return captureBundle;
    }

    private ProcessingRequest createProcessingRequest(int i6, CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, c5.a<Void> aVar) {
        return new ProcessingRequest(captureBundle, takePictureRequest.getOutputFileOptions(), takePictureRequest.getCropRect(), takePictureRequest.getRotationDegrees(), takePictureRequest.getJpegQuality(), takePictureRequest.getSensorToBufferTransform(), takePictureCallback, aVar, i6);
    }

    private int getOutputFormat() {
        Integer num = (Integer) this.mUseCaseConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.mUseCaseConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT, null);
        return (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
    }

    private boolean shouldEnablePostview() {
        return this.mPipelineIn.getPostviewSurface() != null;
    }

    public void close() {
        Threads.checkMainThread();
        this.mCaptureNode.release();
        this.mProcessingNode.release();
    }

    public t0.b<CameraRequest, ProcessingRequest> createRequests(TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, c5.a<Void> aVar) {
        Threads.checkMainThread();
        CaptureBundle captureBundleCreateCaptureBundle = createCaptureBundle();
        int i6 = sNextRequestId;
        sNextRequestId = i6 + 1;
        return new t0.b<>(createCameraRequest(i6, captureBundleCreateCaptureBundle, takePictureRequest, takePictureCallback), createProcessingRequest(i6, captureBundleCreateCaptureBundle, takePictureRequest, takePictureCallback, aVar));
    }

    public SessionConfig.Builder createSessionConfigBuilder(Size size) {
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(this.mUseCaseConfig, size);
        builderCreateFrom.addNonRepeatingSurface(this.mPipelineIn.getSurface());
        if (this.mPipelineIn.getPostviewSurface() != null) {
            builderCreateFrom.setPostviewSurface(this.mPipelineIn.getPostviewSurface());
        }
        return builderCreateFrom;
    }

    public boolean expectsMetadata() {
        return this.mCaptureNode.getSafeCloseImageReaderProxy().getImageReaderProxy() instanceof MetadataImageReader;
    }

    public int getCameraRequestJpegQuality(TakePictureRequest takePictureRequest) {
        return ((takePictureRequest.getOnDiskCallback() != null) && TransformUtils.hasCropping(takePictureRequest.getCropRect(), this.mPipelineIn.getSize())) ? takePictureRequest.getCaptureMode() == 0 ? 100 : 95 : takePictureRequest.getJpegQuality();
    }

    public int getCapacity() {
        Threads.checkMainThread();
        return this.mCaptureNode.getCapacity();
    }

    public CaptureNode getCaptureNode() {
        return this.mCaptureNode;
    }

    public Size getPostviewSize() {
        return this.mPipelineIn.getPostviewSize();
    }

    public ProcessingNode getProcessingNode() {
        return this.mProcessingNode;
    }

    public void notifyCaptureError(TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        this.mPipelineIn.getErrorEdge().accept(captureError);
    }

    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        this.mCaptureNode.setOnImageCloseListener(onImageCloseListener);
    }

    public void submitProcessingRequest(ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        this.mPipelineIn.getRequestEdge().accept(processingRequest);
    }

    public ImagePipeline(ImageCaptureConfig imageCaptureConfig, Size size, CameraEffect cameraEffect, boolean z6) {
        this(imageCaptureConfig, size, cameraEffect, z6, null, 35);
    }

    public ImagePipeline(ImageCaptureConfig imageCaptureConfig, Size size, CameraEffect cameraEffect, boolean z6, Size size2, int i6) {
        Threads.checkMainThread();
        this.mUseCaseConfig = imageCaptureConfig;
        this.mCaptureConfig = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        CaptureNode captureNode = new CaptureNode();
        this.mCaptureNode = captureNode;
        Executor ioExecutor = imageCaptureConfig.getIoExecutor(CameraXExecutors.ioExecutor());
        Objects.requireNonNull(ioExecutor);
        ProcessingNode processingNode = new ProcessingNode(ioExecutor, cameraEffect != null ? new InternalImageProcessor(cameraEffect) : null);
        this.mProcessingNode = processingNode;
        CaptureNode.In inOf = CaptureNode.In.of(size, imageCaptureConfig.getInputFormat(), getOutputFormat(), z6, imageCaptureConfig.getImageReaderProxyProvider(), size2, i6);
        this.mPipelineIn = inOf;
        processingNode.transform(captureNode.transform(inOf));
    }
}
