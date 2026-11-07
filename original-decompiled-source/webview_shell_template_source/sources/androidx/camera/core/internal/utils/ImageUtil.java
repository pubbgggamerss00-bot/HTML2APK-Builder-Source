package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.ExifOutputStream;
import androidx.work.j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ImageUtil {
    public static final int DEFAULT_RGBA_PIXEL_STRIDE = 4;
    private static final String TAG = "ImageUtil";

    private ImageUtil() {
    }

    public static Rect computeCropRectFromAspectRatio(Size size, Rational rational) {
        int i6;
        if (!isAspectRatioValid(rational)) {
            Logger.w(TAG, "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f6 = width;
        float f7 = height;
        float f8 = f6 / f7;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i7 = 0;
        if (rational.floatValue() > f8) {
            int iRound = Math.round((f6 / numerator) * denominator);
            i6 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f7 / denominator) * numerator);
            int i8 = (width - iRound2) / 2;
            width = iRound2;
            i6 = 0;
            i7 = i8;
        }
        return new Rect(i7, i6, width + i7, height + i6);
    }

    public static Rect computeCropRectFromDispatchInfo(Rect rect, int i6, Size size, int i7) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i7 - i6);
        float[] fArrSizeToVertexes = sizeToVertexes(size);
        matrix.mapPoints(fArrSizeToVertexes);
        matrix.postTranslate(-min(fArrSizeToVertexes[0], fArrSizeToVertexes[2], fArrSizeToVertexes[4], fArrSizeToVertexes[6]), -min(fArrSizeToVertexes[1], fArrSizeToVertexes[3], fArrSizeToVertexes[5], fArrSizeToVertexes[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static Bitmap createBitmapFromImageProxy(ImageProxy imageProxy) {
        int format = imageProxy.getFormat();
        if (format == 1) {
            return createBitmapFromRgbaImage(imageProxy);
        }
        if (format == 35) {
            return ImageProcessingUtil.convertYUVToBitmap(imageProxy);
        }
        if (format == 256 || format == 4101) {
            return createBitmapFromJpegImage(imageProxy);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    private static Bitmap createBitmapFromJpegImage(ImageProxy imageProxy) {
        byte[] bArrJpegImageToJpegByteArray = jpegImageToJpegByteArray(imageProxy);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrJpegImageToJpegByteArray, 0, bArrJpegImageToJpegByteArray.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap createBitmapFromPlane(ImageProxy.PlaneProxy[] planeProxyArr, int i6, int i7) {
        j.a("Expect a single plane", planeProxyArr.length == 1);
        j.a("Expect pixelStride=4", planeProxyArr[0].getPixelStride() == 4);
        j.a("Expect rowStride=width*4", planeProxyArr[0].getRowStride() == i6 * 4);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
        planeProxyArr[0].getBuffer().rewind();
        ImageProcessingUtil.copyByteBufferToBitmap(bitmapCreateBitmap, planeProxyArr[0].getBuffer(), planeProxyArr[0].getRowStride());
        return bitmapCreateBitmap;
    }

    private static Bitmap createBitmapFromRgbaImage(ImageProxy imageProxy) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), Bitmap.Config.ARGB_8888);
        imageProxy.getPlanes()[0].getBuffer().rewind();
        ImageProcessingUtil.copyByteBufferToBitmap(bitmapCreateBitmap, imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer createDirectByteBuffer(Bitmap bitmap) {
        j.a("Only accept Bitmap with ARGB_8888 format for now.", bitmap.getConfig() == Bitmap.Config.ARGB_8888);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.copyBitmapToByteBuffer(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    private static byte[] cropJpegByteArray(byte[] bArr, Rect rect, int i6) throws IOException, CodecFailedException {
        try {
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, new BitmapFactory.Options());
            bitmapRegionDecoderNewInstance.recycle();
            if (bitmapDecodeRegion == null) {
                throw new CodecFailedException("Decode byte array failed.", CodecFailedException.FailureType.DECODE_FAILED);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (!bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i6, byteArrayOutputStream)) {
                throw new CodecFailedException("Encode bitmap failed.", CodecFailedException.FailureType.ENCODE_FAILED);
            }
            bitmapDecodeRegion.recycle();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.FailureType.DECODE_FAILED);
        } catch (IllegalArgumentException e6) {
            throw new CodecFailedException("Decode byte array failed with illegal argument." + e6, CodecFailedException.FailureType.DECODE_FAILED);
        }
    }

    public static Rational getRotatedAspectRatio(int i6, Rational rational) {
        return (i6 == 90 || i6 == 270) ? inverseRational(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational inverseRational(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean isAspectRatioValid(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    private static boolean isCropAspectRatioHasEffect(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    public static boolean isJpegFormats(int i6) {
        return i6 == 256 || i6 == 4101;
    }

    public static byte[] jpegImageToJpegByteArray(ImageProxy imageProxy) {
        if (!isJpegFormats(imageProxy.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
        }
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }

    public static float min(float f6, float f7, float f8, float f9) {
        return Math.min(Math.min(f6, f7), Math.min(f8, f9));
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i6) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i6);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static boolean shouldCropImage(int i6, int i7, int i8, int i9) {
        return (i6 == i8 && i7 == i9) ? false : true;
    }

    public static float[] sizeToVertexes(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] yuvImageToJpegByteArray(ImageProxy imageProxy, Rect rect, int i6, int i7) throws CodecFailedException {
        if (imageProxy.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
        }
        YuvImage yuvImage = new YuvImage(yuv_420_888toNv21(imageProxy), 17, imageProxy.getWidth(), imageProxy.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ExifOutputStream exifOutputStream = new ExifOutputStream(byteArrayOutputStream, ExifData.create(imageProxy, i7));
        if (rect == null) {
            rect = new Rect(0, 0, imageProxy.getWidth(), imageProxy.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i6, exifOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.FailureType.ENCODE_FAILED);
    }

    public static byte[] yuv_420_888toNv21(ImageProxy imageProxy) {
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        ImageProxy.PlaneProxy planeProxy2 = imageProxy.getPlanes()[1];
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[2];
        ByteBuffer buffer = planeProxy.getBuffer();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        ByteBuffer buffer3 = planeProxy3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[((imageProxy.getHeight() * imageProxy.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i6 = 0; i6 < imageProxy.getHeight(); i6++) {
            buffer.get(bArr, width, imageProxy.getWidth());
            width += imageProxy.getWidth();
            buffer.position(Math.min(iRemaining, planeProxy.getRowStride() + (buffer.position() - imageProxy.getWidth())));
        }
        int height = imageProxy.getHeight() / 2;
        int width2 = imageProxy.getWidth() / 2;
        int rowStride = planeProxy3.getRowStride();
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride = planeProxy3.getPixelStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        for (int i7 = 0; i7 < height; i7++) {
            buffer3.get(bArr2, 0, Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(rowStride2, buffer2.remaining()));
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < width2; i10++) {
                int i11 = width + 1;
                bArr[width] = bArr2[i8];
                width += 2;
                bArr[i11] = bArr3[i9];
                i8 += pixelStride;
                i9 += pixelStride2;
            }
        }
        return bArr;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class CodecFailedException extends Exception {
        private final FailureType mFailureType;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(String str) {
            super(str);
            this.mFailureType = FailureType.UNKNOWN;
        }

        public FailureType getFailureType() {
            return this.mFailureType;
        }

        public CodecFailedException(String str, FailureType failureType) {
            super(str);
            this.mFailureType = failureType;
        }
    }

    public static boolean isAspectRatioValid(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && isCropAspectRatioHasEffect(size, rational) && !rational.isNaN();
    }

    public static boolean shouldCropImage(ImageProxy imageProxy) {
        return shouldCropImage(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getCropRect().width(), imageProxy.getCropRect().height());
    }

    public static byte[] jpegImageToJpegByteArray(ImageProxy imageProxy, Rect rect, int i6) {
        if (isJpegFormats(imageProxy.getFormat())) {
            return cropJpegByteArray(jpegImageToJpegByteArray(imageProxy), rect, i6);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
    }
}
