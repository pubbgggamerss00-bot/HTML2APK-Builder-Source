package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class TakePictureRequest {
    private int mRemainingRetires = new CaptureFailedRetryEnabler().getRetryCount();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface RetryControl {
        void retryRequest(TakePictureRequest takePictureRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCaptureProcessProgressed$3(int i6) {
        if (getOnDiskCallback() != null) {
            getOnDiskCallback().onCaptureProcessProgressed(i6);
        } else if (getInMemoryCallback() != null) {
            getInMemoryCallback().onCaptureProcessProgressed(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$0(ImageCaptureException imageCaptureException) {
        boolean z6 = getInMemoryCallback() != null;
        boolean z7 = getOnDiskCallback() != null;
        if (z6 && !z7) {
            ImageCapture.OnImageCapturedCallback inMemoryCallback = getInMemoryCallback();
            Objects.requireNonNull(inMemoryCallback);
            inMemoryCallback.onError(imageCaptureException);
        } else {
            if (!z7 || z6) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            ImageCapture.OnImageSavedCallback onDiskCallback = getOnDiskCallback();
            Objects.requireNonNull(onDiskCallback);
            onDiskCallback.onError(imageCaptureException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPostviewBitmapAvailable$4(Bitmap bitmap) {
        if (getOnDiskCallback() != null) {
            getOnDiskCallback().onPostviewBitmapAvailable(bitmap);
        } else if (getInMemoryCallback() != null) {
            getInMemoryCallback().onPostviewBitmapAvailable(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResult$1(ImageCapture.OutputFileResults outputFileResults) {
        ImageCapture.OnImageSavedCallback onDiskCallback = getOnDiskCallback();
        Objects.requireNonNull(onDiskCallback);
        Objects.requireNonNull(outputFileResults);
        onDiskCallback.onImageSaved(outputFileResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResult$2(ImageProxy imageProxy) {
        ImageCapture.OnImageCapturedCallback inMemoryCallback = getInMemoryCallback();
        Objects.requireNonNull(inMemoryCallback);
        Objects.requireNonNull(imageProxy);
        inMemoryCallback.onCaptureSuccess(imageProxy);
    }

    public static TakePictureRequest of(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback, ImageCapture.OnImageSavedCallback onImageSavedCallback, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, Matrix matrix, int i6, int i7, int i8, List<CameraCaptureCallback> list) {
        androidx.work.j.a("onDiskCallback and outputFileOptions should be both null or both non-null.", (onImageSavedCallback == null) == (outputFileOptions == null));
        androidx.work.j.a("One and only one on-disk or in-memory callback should be present.", (onImageCapturedCallback == null) ^ (onImageSavedCallback == null));
        return new AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, rect, matrix, i6, i7, i8, list);
    }

    public boolean decrementRetryCounter() {
        Threads.checkMainThread();
        int i6 = this.mRemainingRetires;
        if (i6 <= 0) {
            return false;
        }
        this.mRemainingRetires = i6 - 1;
        return true;
    }

    public abstract Executor getAppExecutor();

    public abstract int getCaptureMode();

    public abstract Rect getCropRect();

    public abstract ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    public abstract int getJpegQuality();

    public abstract ImageCapture.OnImageSavedCallback getOnDiskCallback();

    public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

    public int getRemainingRetries() {
        Threads.checkMainThread();
        return this.mRemainingRetires;
    }

    public abstract int getRotationDegrees();

    public abstract Matrix getSensorToBufferTransform();

    public abstract List<CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    public void incrementRetryCounter() {
        Threads.checkMainThread();
        this.mRemainingRetires++;
    }

    public void onCaptureProcessProgressed(int i6) {
        getAppExecutor().execute(new s(i6, 0, this));
    }

    public void onError(ImageCaptureException imageCaptureException) {
        getAppExecutor().execute(new m(this, imageCaptureException, 1));
    }

    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        getAppExecutor().execute(new k(2, this, bitmap));
    }

    public void onResult(ImageCapture.OutputFileResults outputFileResults) {
        getAppExecutor().execute(new androidx.camera.core.e(2, this, outputFileResults));
    }

    public void onResult(ImageProxy imageProxy) {
        getAppExecutor().execute(new p(1, this, imageProxy));
    }
}
