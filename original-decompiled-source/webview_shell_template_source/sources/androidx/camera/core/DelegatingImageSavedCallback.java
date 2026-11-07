package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class DelegatingImageSavedCallback implements ImageCapture.OnImageSavedCallback {
    private final AtomicReference<ImageCapture.OnImageSavedCallback> _delegate;

    public DelegatingImageSavedCallback(ImageCapture.OnImageSavedCallback onImageSavedCallback) {
        kotlin.jvm.internal.j.e("delegate", onImageSavedCallback);
        this._delegate = new AtomicReference<>(onImageSavedCallback);
    }

    private final ImageCapture.OnImageSavedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureProcessProgressed(int i6) {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(i6);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureStarted() {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onError(ImageCaptureException imageCaptureException) {
        kotlin.jvm.internal.j.e("exception", imageCaptureException);
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(imageCaptureException);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
        kotlin.jvm.internal.j.e("outputFileResults", outputFileResults);
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onImageSaved(outputFileResults);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        kotlin.jvm.internal.j.e("bitmap", bitmap);
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(bitmap);
        }
    }
}
