package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.Threads;
import java.util.Objects;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class RequestWithCallback implements TakePictureCallback {
    private b.a<Void> mCaptureCompleter;
    private c5.a<Void> mCaptureRequestFuture;
    private b.a<Void> mCompleteCompleter;
    private final TakePictureRequest.RetryControl mRetryControl;
    private final TakePictureRequest mTakePictureRequest;
    private boolean mIsAborted = false;
    private boolean mIsStarted = false;
    private final c5.a<Void> mCaptureFuture = y.b.a(new b.c() { // from class: androidx.camera.core.imagecapture.q
        @Override // y.b.c
        public final Object attachCompleter(b.a aVar) {
            return this.s.lambda$new$0(aVar);
        }
    });
    private final c5.a<Void> mCompleteFuture = y.b.a(new b.c() { // from class: androidx.camera.core.imagecapture.r
        @Override // y.b.c
        public final Object attachCompleter(b.a aVar) {
            return this.s.lambda$new$1(aVar);
        }
    });

    public RequestWithCallback(TakePictureRequest takePictureRequest, TakePictureRequest.RetryControl retryControl) {
        this.mTakePictureRequest = takePictureRequest;
        this.mRetryControl = retryControl;
    }

    private void abort(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        this.mIsAborted = true;
        c5.a<Void> aVar = this.mCaptureRequestFuture;
        Objects.requireNonNull(aVar);
        aVar.cancel(true);
        this.mCaptureCompleter.b(imageCaptureException);
        this.mCompleteCompleter.a(null);
    }

    private void checkOnImageCaptured() {
        androidx.work.j.f("onImageCaptured() must be called before onFinalResult()", this.mCaptureFuture.isDone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(b.a aVar) {
        this.mCaptureCompleter = aVar;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$1(b.a aVar) {
        this.mCompleteCompleter = aVar;
        return "RequestCompleteFuture";
    }

    private void markComplete() {
        androidx.work.j.f("The callback can only complete once.", !this.mCompleteFuture.isDone());
        this.mCompleteCompleter.a(null);
    }

    private void onFailure(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        this.mTakePictureRequest.onError(imageCaptureException);
    }

    public void abortAndSendErrorToApp(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (this.mCompleteFuture.isDone()) {
            return;
        }
        abort(imageCaptureException);
        onFailure(imageCaptureException);
    }

    public void abortSilentlyAndRetry() {
        Threads.checkMainThread();
        if (this.mCompleteFuture.isDone()) {
            return;
        }
        abort(new ImageCaptureException(3, "The request is aborted silently and retried.", null));
        this.mRetryControl.retryRequest(this.mTakePictureRequest);
    }

    public c5.a<Void> getCaptureFuture() {
        Threads.checkMainThread();
        return this.mCaptureFuture;
    }

    public c5.a<Void> getCompleteFuture() {
        Threads.checkMainThread();
        return this.mCompleteFuture;
    }

    public TakePictureRequest getTakePictureRequest() {
        return this.mTakePictureRequest;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public boolean isAborted() {
        return this.mIsAborted;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureFailure(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        boolean zDecrementRetryCounter = this.mTakePictureRequest.decrementRetryCounter();
        if (!zDecrementRetryCounter) {
            onFailure(imageCaptureException);
        }
        markComplete();
        this.mCaptureCompleter.b(imageCaptureException);
        if (zDecrementRetryCounter) {
            this.mRetryControl.retryRequest(this.mTakePictureRequest);
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureProcessProgressed(int i6) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        this.mTakePictureRequest.onCaptureProcessProgressed(i6);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureStarted() {
        Threads.checkMainThread();
        if (this.mIsAborted || this.mIsStarted) {
            return;
        }
        this.mIsStarted = true;
        ImageCapture.OnImageCapturedCallback inMemoryCallback = this.mTakePictureRequest.getInMemoryCallback();
        if (inMemoryCallback != null) {
            inMemoryCallback.onCaptureStarted();
        }
        ImageCapture.OnImageSavedCallback onDiskCallback = this.mTakePictureRequest.getOnDiskCallback();
        if (onDiskCallback != null) {
            onDiskCallback.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onFinalResult(ImageCapture.OutputFileResults outputFileResults) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        checkOnImageCaptured();
        markComplete();
        this.mTakePictureRequest.onResult(outputFileResults);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onImageCaptured() {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        if (!this.mIsStarted) {
            onCaptureStarted();
        }
        this.mCaptureCompleter.a(null);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        this.mTakePictureRequest.onPostviewBitmapAvailable(bitmap);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onProcessFailure(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            return;
        }
        checkOnImageCaptured();
        markComplete();
        onFailure(imageCaptureException);
    }

    public void setCaptureRequestFuture(c5.a<Void> aVar) {
        Threads.checkMainThread();
        androidx.work.j.f("CaptureRequestFuture can only be set once.", this.mCaptureRequestFuture == null);
        this.mCaptureRequestFuture = aVar;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onFinalResult(ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mIsAborted) {
            imageProxy.close();
            return;
        }
        checkOnImageCaptured();
        markComplete();
        this.mTakePictureRequest.onResult(imageProxy);
    }
}
