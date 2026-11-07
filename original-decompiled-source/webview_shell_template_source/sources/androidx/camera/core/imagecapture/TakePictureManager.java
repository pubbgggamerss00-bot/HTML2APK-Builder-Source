package androidx.camera.core.imagecapture;

import android.util.Log;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class TakePictureManager implements ForwardingImageProxy.OnImageCloseListener, TakePictureRequest.RetryControl {
    private static final String TAG = "TakePictureManager";
    private RequestWithCallback mCapturingRequest;
    final ImageCaptureControl mImageCaptureControl;
    ImagePipeline mImagePipeline;
    private final List<RequestWithCallback> mIncompleteRequests;
    final Deque<TakePictureRequest> mNewRequests = new ArrayDeque();
    boolean mPaused = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class CaptureError {
        public static CaptureError of(int i6, ImageCaptureException imageCaptureException) {
            return new AutoValue_TakePictureManager_CaptureError(i6, imageCaptureException);
        }

        public abstract ImageCaptureException getImageCaptureException();

        public abstract int getRequestId();
    }

    public TakePictureManager(ImageCaptureControl imageCaptureControl) {
        Threads.checkMainThread();
        this.mImageCaptureControl = imageCaptureControl;
        this.mIncompleteRequests = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackCurrentRequests$0() {
        this.mCapturingRequest = null;
        issueNextRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trackCurrentRequests$1(RequestWithCallback requestWithCallback) {
        this.mIncompleteRequests.remove(requestWithCallback);
    }

    private c5.a<Void> submitCameraRequest(final CameraRequest cameraRequest) {
        Threads.checkMainThread();
        this.mImageCaptureControl.lockFlashMode();
        c5.a<Void> aVarSubmitStillCaptureRequests = this.mImageCaptureControl.submitStillCaptureRequests(cameraRequest.getCaptureConfigs());
        Futures.addCallback(aVarSubmitStillCaptureRequests, new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.TakePictureManager.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (cameraRequest.isAborted()) {
                    return;
                }
                int id = cameraRequest.getCaptureConfigs().get(0).getId();
                if (th instanceof ImageCaptureException) {
                    TakePictureManager.this.mImagePipeline.notifyCaptureError(CaptureError.of(id, (ImageCaptureException) th));
                } else {
                    TakePictureManager.this.mImagePipeline.notifyCaptureError(CaptureError.of(id, new ImageCaptureException(2, "Failed to submit capture request", th)));
                }
                TakePictureManager.this.mImageCaptureControl.unlockFlashMode();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r12) {
                TakePictureManager.this.mImageCaptureControl.unlockFlashMode();
            }
        }, CameraXExecutors.mainThreadExecutor());
        return aVarSubmitStillCaptureRequests;
    }

    private void trackCurrentRequests(RequestWithCallback requestWithCallback) {
        androidx.work.j.f(null, !hasCapturingRequest());
        this.mCapturingRequest = requestWithCallback;
        requestWithCallback.getCaptureFuture().addListener(new g(1, this), CameraXExecutors.directExecutor());
        this.mIncompleteRequests.add(requestWithCallback);
        requestWithCallback.getCompleteFuture().addListener(new n(1, this, requestWithCallback), CameraXExecutors.directExecutor());
    }

    public void abortRequests() {
        Threads.checkMainThread();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Iterator<TakePictureRequest> it = this.mNewRequests.iterator();
        while (it.hasNext()) {
            it.next().onError(imageCaptureException);
        }
        this.mNewRequests.clear();
        ArrayList arrayList = new ArrayList(this.mIncompleteRequests);
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((RequestWithCallback) obj).abortAndSendErrorToApp(imageCaptureException);
        }
    }

    public RequestWithCallback getCapturingRequest() {
        return this.mCapturingRequest;
    }

    public ImagePipeline getImagePipeline() {
        return this.mImagePipeline;
    }

    public List<RequestWithCallback> getIncompleteRequests() {
        return this.mIncompleteRequests;
    }

    public boolean hasCapturingRequest() {
        return this.mCapturingRequest != null;
    }

    public void issueNextRequest() {
        Threads.checkMainThread();
        Log.d(TAG, "Issue the next TakePictureRequest.");
        if (hasCapturingRequest()) {
            Log.d(TAG, "There is already a request in-flight.");
            return;
        }
        if (this.mPaused) {
            Log.d(TAG, "The class is paused.");
            return;
        }
        if (this.mImagePipeline.getCapacity() == 0) {
            Log.d(TAG, "Too many acquire images. Close image to be able to process next.");
            return;
        }
        TakePictureRequest takePictureRequestPoll = this.mNewRequests.poll();
        if (takePictureRequestPoll == null) {
            Log.d(TAG, "No new request.");
            return;
        }
        RequestWithCallback requestWithCallback = new RequestWithCallback(takePictureRequestPoll, this);
        trackCurrentRequests(requestWithCallback);
        t0.b<CameraRequest, ProcessingRequest> bVarCreateRequests = this.mImagePipeline.createRequests(takePictureRequestPoll, requestWithCallback, requestWithCallback.getCaptureFuture());
        CameraRequest cameraRequest = bVarCreateRequests.f14401a;
        Objects.requireNonNull(cameraRequest);
        ProcessingRequest processingRequest = bVarCreateRequests.f14402b;
        Objects.requireNonNull(processingRequest);
        this.mImagePipeline.submitProcessingRequest(processingRequest);
        requestWithCallback.setCaptureRequestFuture(submitCameraRequest(cameraRequest));
    }

    public void offerRequest(TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        this.mNewRequests.offer(takePictureRequest);
        issueNextRequest();
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(ImageProxy imageProxy) {
        CameraXExecutors.mainThreadExecutor().execute(new i(1, this));
    }

    public void pause() {
        Threads.checkMainThread();
        this.mPaused = true;
        RequestWithCallback requestWithCallback = this.mCapturingRequest;
        if (requestWithCallback != null) {
            requestWithCallback.abortSilentlyAndRetry();
        }
    }

    public void resume() {
        Threads.checkMainThread();
        this.mPaused = false;
        issueNextRequest();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.RetryControl
    public void retryRequest(TakePictureRequest takePictureRequest) {
        Threads.checkMainThread();
        Logger.d(TAG, "Add a new request for retrying.");
        this.mNewRequests.addFirst(takePictureRequest);
        issueNextRequest();
    }

    public void setImagePipeline(ImagePipeline imagePipeline) {
        Threads.checkMainThread();
        this.mImagePipeline = imagePipeline;
        imagePipeline.setOnImageCloseListener(this);
    }
}
