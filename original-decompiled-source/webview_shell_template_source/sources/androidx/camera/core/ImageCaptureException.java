package androidx.camera.core;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int i6, String str, Throwable th) {
        super(str, th);
        this.mImageCaptureError = i6;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
