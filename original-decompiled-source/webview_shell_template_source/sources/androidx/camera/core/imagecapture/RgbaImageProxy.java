package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ExperimentalGetImage;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Packet;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class RgbaImageProxy implements ImageProxy {
    private final Rect mCropRect;
    private final int mHeight;
    private final ImageInfo mImageInfo;
    private final Object mLock;
    ImageProxy.PlaneProxy[] mPlaneProxy;
    private final int mWidth;

    public RgbaImageProxy(Packet<Bitmap> packet) {
        this(packet.getData(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult().getTimestamp());
    }

    private void checkNotClosed() {
        synchronized (this.mLock) {
            androidx.work.j.f("The image is closed.", this.mPlaneProxy != null);
        }
    }

    private static ImageInfo createImageInfo(final long j6, final int i6, final Matrix matrix) {
        return new ImageInfo() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.2
            @Override // androidx.camera.core.ImageInfo
            public int getRotationDegrees() {
                return i6;
            }

            @Override // androidx.camera.core.ImageInfo
            public Matrix getSensorToBufferTransformMatrix() {
                return new Matrix(matrix);
            }

            @Override // androidx.camera.core.ImageInfo
            public TagBundle getTagBundle() {
                throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
            }

            @Override // androidx.camera.core.ImageInfo
            public long getTimestamp() {
                return j6;
            }

            @Override // androidx.camera.core.ImageInfo
            public void populateExifData(ExifData.Builder builder) {
                throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
            }
        };
    }

    private static ImageProxy.PlaneProxy createPlaneProxy(final ByteBuffer byteBuffer, final int i6, final int i7) {
        return new ImageProxy.PlaneProxy() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.1
            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public ByteBuffer getBuffer() {
                return byteBuffer;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return i7;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return i6;
            }
        };
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        synchronized (this.mLock) {
            checkNotClosed();
            this.mPlaneProxy = null;
        }
    }

    public Bitmap createBitmap() {
        Bitmap bitmapCreateBitmapFromPlane;
        synchronized (this.mLock) {
            checkNotClosed();
            bitmapCreateBitmapFromPlane = ImageUtil.createBitmapFromPlane(getPlanes(), getWidth(), getHeight());
        }
        return bitmapCreateBitmapFromPlane;
    }

    @Override // androidx.camera.core.ImageProxy
    public Rect getCropRect() {
        Rect rect;
        synchronized (this.mLock) {
            checkNotClosed();
            rect = this.mCropRect;
        }
        return rect;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
        synchronized (this.mLock) {
            checkNotClosed();
        }
        return 1;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        int i6;
        synchronized (this.mLock) {
            checkNotClosed();
            i6 = this.mHeight;
        }
        return i6;
    }

    @Override // androidx.camera.core.ImageProxy
    @ExperimentalGetImage
    public Image getImage() {
        synchronized (this.mLock) {
            checkNotClosed();
        }
        return null;
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageInfo getImageInfo() {
        ImageInfo imageInfo;
        synchronized (this.mLock) {
            checkNotClosed();
            imageInfo = this.mImageInfo;
        }
        return imageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    public ImageProxy.PlaneProxy[] getPlanes() {
        ImageProxy.PlaneProxy[] planeProxyArr;
        synchronized (this.mLock) {
            checkNotClosed();
            ImageProxy.PlaneProxy[] planeProxyArr2 = this.mPlaneProxy;
            Objects.requireNonNull(planeProxyArr2);
            planeProxyArr = planeProxyArr2;
        }
        return planeProxyArr;
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        int i6;
        synchronized (this.mLock) {
            checkNotClosed();
            i6 = this.mWidth;
        }
        return i6;
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(Rect rect) {
        synchronized (this.mLock) {
            try {
                checkNotClosed();
                if (rect != null) {
                    this.mCropRect.set(rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RgbaImageProxy(Bitmap bitmap, Rect rect, int i6, Matrix matrix, long j6) {
        this(ImageUtil.createDirectByteBuffer(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i6, matrix, j6);
    }

    public RgbaImageProxy(ByteBuffer byteBuffer, int i6, int i7, int i8, Rect rect, int i9, Matrix matrix, long j6) {
        this.mLock = new Object();
        this.mWidth = i7;
        this.mHeight = i8;
        this.mCropRect = rect;
        this.mImageInfo = createImageInfo(j6, i9, matrix);
        byteBuffer.rewind();
        this.mPlaneProxy = new ImageProxy.PlaneProxy[]{createPlaneProxy(byteBuffer, i7 * i6, i6)};
    }
}
