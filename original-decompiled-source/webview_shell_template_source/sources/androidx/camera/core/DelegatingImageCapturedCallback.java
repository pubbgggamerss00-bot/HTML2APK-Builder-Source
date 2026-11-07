package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class DelegatingImageCapturedCallback extends ImageCapture.OnImageCapturedCallback {
    private final AtomicReference<ImageCapture.OnImageCapturedCallback> _delegate;

    public DelegatingImageCapturedCallback(ImageCapture.OnImageCapturedCallback onImageCapturedCallback) {
        kotlin.jvm.internal.j.e("delegate", onImageCapturedCallback);
        this._delegate = new AtomicReference<>(onImageCapturedCallback);
    }

    private final ImageCapture.OnImageCapturedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureProcessProgressed(int i6) {
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(i6);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureStarted() {
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureSuccess(ImageProxy imageProxy) {
        kotlin.jvm.internal.j.e("imageProxy", imageProxy);
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureSuccess(imageProxy);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onError(ImageCaptureException imageCaptureException) {
        kotlin.jvm.internal.j.e("exception", imageCaptureException);
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(imageCaptureException);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        kotlin.jvm.internal.j.e("bitmap", bitmap);
        ImageCapture.OnImageCapturedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(bitmap);
        }
    }
}
