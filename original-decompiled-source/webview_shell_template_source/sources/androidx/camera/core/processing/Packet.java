package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.utils.ImageUtil;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class Packet<T> {
    public static Packet<Bitmap> of(Bitmap bitmap, Exif exif, Rect rect, int i6, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bitmap, exif, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i6, matrix, cameraCaptureResult);
    }

    public abstract CameraCaptureResult getCameraCaptureResult();

    public abstract Rect getCropRect();

    public abstract T getData();

    public abstract Exif getExif();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    public abstract Matrix getSensorToBufferTransform();

    public abstract Size getSize();

    public boolean hasCropping() {
        return TransformUtils.hasCropping(getCropRect(), getSize());
    }

    public static Packet<ImageProxy> of(ImageProxy imageProxy, Exif exif, Rect rect, int i6, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        return of(imageProxy, exif, new Size(imageProxy.getWidth(), imageProxy.getHeight()), rect, i6, matrix, cameraCaptureResult);
    }

    public static Packet<ImageProxy> of(ImageProxy imageProxy, Exif exif, Size size, Rect rect, int i6, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (ImageUtil.isJpegFormats(imageProxy.getFormat())) {
            androidx.work.j.e("JPEG image must have Exif.", exif);
        }
        return new AutoValue_Packet(imageProxy, exif, imageProxy.getFormat(), size, rect, i6, matrix, cameraCaptureResult);
    }

    public static Packet<byte[]> of(byte[] bArr, Exif exif, int i6, Size size, Rect rect, int i7, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bArr, exif, i6, size, rect, i7, matrix, cameraCaptureResult);
    }
}
