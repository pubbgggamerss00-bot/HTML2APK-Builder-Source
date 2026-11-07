package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.OnImageAvailableListener {
    private static final String TAG = "ImageAnalysisAnalyzer";
    private volatile boolean mOnePixelShiftEnabled;
    private volatile boolean mOutputImageRotationEnabled;
    private volatile int mPrevBufferRotationDegrees;
    private SafeCloseImageReaderProxy mProcessedImageReaderProxy;
    private ImageWriter mProcessedImageWriter;
    ByteBuffer mRGBConvertedBuffer;
    private volatile int mRelativeRotation;
    private ImageAnalysis.Analyzer mSubscribedAnalyzer;
    ByteBuffer mURotatedBuffer;
    private Executor mUserExecutor;
    ByteBuffer mVRotatedBuffer;
    ByteBuffer mYRotatedBuffer;
    private volatile int mOutputImageFormat = 1;
    private Rect mOriginalViewPortCropRect = new Rect();
    private Rect mUpdatedViewPortCropRect = new Rect();
    private Matrix mOriginalSensorToBufferTransformMatrix = new Matrix();
    private Matrix mUpdatedSensorToBufferTransformMatrix = new Matrix();
    private final Object mAnalyzerLock = new Object();
    protected boolean mIsAttached = true;

    private void createHelperBuffer(ImageProxy imageProxy) {
        if (this.mOutputImageFormat != 1) {
            if (this.mOutputImageFormat == 2 && this.mRGBConvertedBuffer == null) {
                this.mRGBConvertedBuffer = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.mYRotatedBuffer == null) {
            this.mYRotatedBuffer = ByteBuffer.allocateDirect(imageProxy.getHeight() * imageProxy.getWidth());
        }
        this.mYRotatedBuffer.position(0);
        if (this.mURotatedBuffer == null) {
            this.mURotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.mURotatedBuffer.position(0);
        if (this.mVRotatedBuffer == null) {
            this.mVRotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getHeight() * imageProxy.getWidth()) / 4);
        }
        this.mVRotatedBuffer.position(0);
    }

    private static SafeCloseImageReaderProxy createImageReaderProxy(int i6, int i7, int i8, int i9, int i10) {
        boolean z6 = i8 == 90 || i8 == 270;
        int i11 = z6 ? i7 : i6;
        if (!z6) {
            i6 = i7;
        }
        return new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(i11, i6, i9, i10));
    }

    public static Matrix getAdditionalTransformMatrixAppliedByProcessor(int i6, int i7, int i8, int i9, int i10) {
        Matrix matrix = new Matrix();
        if (i10 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i6, i7), TransformUtils.NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i10);
            matrix.postConcat(TransformUtils.getNormalizedToBuffer(new RectF(0.0f, 0.0f, i8, i9)));
        }
        return matrix;
    }

    public static Rect getUpdatedCropRect(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$analyzeImage$0(ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, ImageAnalysis.Analyzer analyzer, b.a aVar) {
        if (!this.mIsAttached) {
            aVar.b(new b2.c("ImageAnalysis is detached"));
            return;
        }
        SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy2, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), this.mOutputImageRotationEnabled ? 0 : this.mRelativeRotation, matrix));
        if (!rect.isEmpty()) {
            settableImageProxy.setCropRect(rect);
        }
        analyzer.analyze(settableImageProxy);
        aVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$analyzeImage$1(Executor executor, final ImageProxy imageProxy, final Matrix matrix, final ImageProxy imageProxy2, final Rect rect, final ImageAnalysis.Analyzer analyzer, final b.a aVar) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.m
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$analyzeImage$0(imageProxy, matrix, imageProxy2, rect, analyzer, aVar);
            }
        });
        return "analyzeImage";
    }

    private void recalculateTransformMatrixAndCropRect(int i6, int i7, int i8, int i9) {
        Matrix additionalTransformMatrixAppliedByProcessor = getAdditionalTransformMatrixAppliedByProcessor(i6, i7, i8, i9, this.mRelativeRotation);
        this.mUpdatedViewPortCropRect = getUpdatedCropRect(this.mOriginalViewPortCropRect, additionalTransformMatrixAppliedByProcessor);
        this.mUpdatedSensorToBufferTransformMatrix.setConcat(this.mOriginalSensorToBufferTransformMatrix, additionalTransformMatrixAppliedByProcessor);
    }

    private void recreateImageReaderProxy(ImageProxy imageProxy, int i6) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mProcessedImageReaderProxy;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.safeClose();
        this.mProcessedImageReaderProxy = createImageReaderProxy(imageProxy.getWidth(), imageProxy.getHeight(), i6, this.mProcessedImageReaderProxy.getImageFormat(), this.mProcessedImageReaderProxy.getMaxImages());
        if (this.mOutputImageFormat == 1) {
            ImageWriter imageWriter = this.mProcessedImageWriter;
            if (imageWriter != null) {
                ImageWriterCompat.close(imageWriter);
            }
            this.mProcessedImageWriter = ImageWriterCompat.newInstance(this.mProcessedImageReaderProxy.getSurface(), this.mProcessedImageReaderProxy.getMaxImages());
        }
    }

    public abstract ImageProxy acquireImage(ImageReaderProxy imageReaderProxy);

    public c5.a<Void> analyzeImage(final ImageProxy imageProxy) throws Throwable {
        Object obj;
        final Executor executor;
        final ImageAnalysis.Analyzer analyzer;
        boolean z6;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ImageProxy imageProxy2;
        ImageProxy imageProxyRotateYUV;
        int i6 = this.mOutputImageRotationEnabled ? this.mRelativeRotation : 0;
        Object obj2 = this.mAnalyzerLock;
        synchronized (obj2) {
            try {
                try {
                    executor = this.mUserExecutor;
                    analyzer = this.mSubscribedAnalyzer;
                    z6 = this.mOutputImageRotationEnabled && i6 != this.mPrevBufferRotationDegrees;
                    if (z6) {
                        recreateImageReaderProxy(imageProxy, i6);
                    }
                    if (this.mOutputImageRotationEnabled) {
                        createHelperBuffer(imageProxy);
                    }
                    try {
                        safeCloseImageReaderProxy = this.mProcessedImageReaderProxy;
                        try {
                            imageWriter = this.mProcessedImageWriter;
                            byteBuffer = this.mRGBConvertedBuffer;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                byteBuffer2 = this.mYRotatedBuffer;
                byteBuffer3 = this.mURotatedBuffer;
                byteBuffer4 = this.mVRotatedBuffer;
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                throw th;
            }
        }
        if (analyzer == null || executor == null || !this.mIsAttached) {
            return Futures.immediateFailedFuture(new b2.c("No analyzer or executor currently set."));
        }
        if (safeCloseImageReaderProxy == null) {
            imageProxy2 = null;
        } else {
            if (this.mOutputImageFormat == 2) {
                imageProxyRotateYUV = ImageProcessingUtil.convertYUVToRGB(imageProxy, safeCloseImageReaderProxy, byteBuffer, i6, this.mOnePixelShiftEnabled);
            } else {
                if (this.mOutputImageFormat == 1) {
                    if (this.mOnePixelShiftEnabled) {
                        ImageProcessingUtil.applyPixelShiftForYUV(imageProxy);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        imageProxyRotateYUV = ImageProcessingUtil.rotateYUV(imageProxy, safeCloseImageReaderProxy, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i6);
                    }
                }
                imageProxy2 = null;
            }
            imageProxy2 = imageProxyRotateYUV;
        }
        boolean z7 = imageProxy2 == null;
        final ImageProxy imageProxy3 = z7 ? imageProxy : imageProxy2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.mAnalyzerLock) {
            if (z6 && !z7) {
                try {
                    recalculateTransformMatrixAndCropRect(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy3.getWidth(), imageProxy3.getHeight());
                } finally {
                }
            }
            this.mPrevBufferRotationDegrees = i6;
            rect.set(this.mUpdatedViewPortCropRect);
            matrix.set(this.mUpdatedSensorToBufferTransformMatrix);
        }
        return y.b.a(new b.c() { // from class: androidx.camera.core.n
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar) {
                return this.s.lambda$analyzeImage$1(executor, imageProxy, matrix, imageProxy3, rect, analyzer, aVar);
            }
        });
    }

    public void attach() {
        this.mIsAttached = true;
    }

    public abstract void clearCache();

    public void detach() {
        this.mIsAttached = false;
        clearCache();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireImage = acquireImage(imageReaderProxy);
            if (imageProxyAcquireImage != null) {
                onValidImageAvailable(imageProxyAcquireImage);
            }
        } catch (IllegalStateException e6) {
            Logger.e(TAG, "Failed to acquire image.", e6);
        }
    }

    public abstract void onValidImageAvailable(ImageProxy imageProxy);

    public void setAnalyzer(Executor executor, ImageAnalysis.Analyzer analyzer) {
        if (analyzer == null) {
            clearCache();
        }
        synchronized (this.mAnalyzerLock) {
            this.mSubscribedAnalyzer = analyzer;
            this.mUserExecutor = executor;
        }
    }

    public void setOnePixelShiftEnabled(boolean z6) {
        this.mOnePixelShiftEnabled = z6;
    }

    public void setOutputImageFormat(int i6) {
        this.mOutputImageFormat = i6;
    }

    public void setOutputImageRotationEnabled(boolean z6) {
        this.mOutputImageRotationEnabled = z6;
    }

    public void setProcessedImageReaderProxy(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        synchronized (this.mAnalyzerLock) {
            this.mProcessedImageReaderProxy = safeCloseImageReaderProxy;
        }
    }

    public void setRelativeRotation(int i6) {
        this.mRelativeRotation = i6;
    }

    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalSensorToBufferTransformMatrix = matrix;
            this.mUpdatedSensorToBufferTransformMatrix = new Matrix(this.mOriginalSensorToBufferTransformMatrix);
        }
    }

    public void setViewPortCropRect(Rect rect) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalViewPortCropRect = rect;
            this.mUpdatedViewPortCropRect = new Rect(this.mOriginalViewPortCropRect);
        }
    }
}
