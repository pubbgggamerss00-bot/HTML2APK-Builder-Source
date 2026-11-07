package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
interface TakePictureCallback {
    boolean isAborted();

    void onCaptureFailure(ImageCaptureException imageCaptureException);

    void onCaptureProcessProgressed(int i6);

    void onCaptureStarted();

    void onFinalResult(ImageCapture.OutputFileResults outputFileResults);

    void onFinalResult(ImageProxy imageProxy);

    void onImageCaptured();

    void onPostviewBitmapAvailable(Bitmap bitmap);

    void onProcessFailure(ImageCaptureException imageCaptureException);
}
