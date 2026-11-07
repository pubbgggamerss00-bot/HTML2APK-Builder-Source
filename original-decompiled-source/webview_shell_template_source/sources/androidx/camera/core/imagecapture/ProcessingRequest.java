package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ProcessingRequest {
    static final int PROGRESS_NOT_RECEIVED = -1;
    private final TakePictureCallback mCallback;
    final c5.a<Void> mCaptureFuture;
    private final Rect mCropRect;
    private final int mJpegQuality;
    private int mLastCaptureProcessProgressed;
    private final ImageCapture.OutputFileOptions mOutputFileOptions;
    private final int mRequestId;
    private final int mRotationDegrees;
    private final Matrix mSensorToBufferTransform;
    private final List<Integer> mStageIds;
    private final String mTagBundleKey;

    public ProcessingRequest(CaptureBundle captureBundle, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, int i6, int i7, Matrix matrix, TakePictureCallback takePictureCallback, c5.a<Void> aVar) {
        this(captureBundle, outputFileOptions, rect, i6, i7, matrix, takePictureCallback, aVar, 0);
    }

    public c5.a<Void> getCaptureFuture() {
        return this.mCaptureFuture;
    }

    public Rect getCropRect() {
        return this.mCropRect;
    }

    public int getJpegQuality() {
        return this.mJpegQuality;
    }

    public ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.mOutputFileOptions;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    public Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    public List<Integer> getStageIds() {
        return this.mStageIds;
    }

    public String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    public boolean isAborted() {
        return this.mCallback.isAborted();
    }

    public boolean isInMemoryCapture() {
        return getOutputFileOptions() == null;
    }

    public void onCaptureFailure(ImageCaptureException imageCaptureException) {
        this.mCallback.onCaptureFailure(imageCaptureException);
    }

    public void onCaptureProcessProgressed(int i6) {
        if (this.mLastCaptureProcessProgressed != i6) {
            this.mLastCaptureProcessProgressed = i6;
            this.mCallback.onCaptureProcessProgressed(i6);
        }
    }

    public void onCaptureStarted() {
        this.mCallback.onCaptureStarted();
    }

    public void onFinalResult(ImageCapture.OutputFileResults outputFileResults) {
        this.mCallback.onFinalResult(outputFileResults);
    }

    public void onImageCaptured() {
        if (this.mLastCaptureProcessProgressed != -1) {
            onCaptureProcessProgressed(100);
        }
        this.mCallback.onImageCaptured();
    }

    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        this.mCallback.onPostviewBitmapAvailable(bitmap);
    }

    public void onProcessFailure(ImageCaptureException imageCaptureException) {
        this.mCallback.onProcessFailure(imageCaptureException);
    }

    public ProcessingRequest(CaptureBundle captureBundle, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, int i6, int i7, Matrix matrix, TakePictureCallback takePictureCallback, c5.a<Void> aVar, int i8) {
        this.mLastCaptureProcessProgressed = -1;
        this.mRequestId = i8;
        this.mOutputFileOptions = outputFileOptions;
        this.mJpegQuality = i7;
        this.mRotationDegrees = i6;
        this.mCropRect = rect;
        this.mSensorToBufferTransform = matrix;
        this.mCallback = takePictureCallback;
        this.mTagBundleKey = String.valueOf(captureBundle.hashCode());
        this.mStageIds = new ArrayList();
        List<CaptureStage> captureStages = captureBundle.getCaptureStages();
        Objects.requireNonNull(captureStages);
        Iterator<CaptureStage> it = captureStages.iterator();
        while (it.hasNext()) {
            this.mStageIds.add(Integer.valueOf(it.next().getId()));
        }
        this.mCaptureFuture = aVar;
    }

    public void onFinalResult(ImageProxy imageProxy) {
        this.mCallback.onFinalResult(imageProxy);
    }
}
