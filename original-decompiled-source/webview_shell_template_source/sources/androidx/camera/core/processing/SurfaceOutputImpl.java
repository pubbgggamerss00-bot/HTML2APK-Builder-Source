package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.TransformUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class SurfaceOutputImpl implements SurfaceOutput {
    private static final String TAG = "SurfaceOutputImpl";
    private final float[] mAdditionalTransform;
    private final SurfaceOutput.CameraInputInfo mCameraInputInfo;
    private final c5.a<Void> mCloseFuture;
    private b.a<Void> mCloseFutureCompleter;
    private t0.a<SurfaceOutput.Event> mEventListener;
    private Executor mExecutor;
    private final int mFormat;
    private final float[] mInvertedTextureTransform;
    private final float[] mSecondaryAdditionalTransform;
    private final SurfaceOutput.CameraInputInfo mSecondaryCameraInputInfo;
    private final float[] mSecondaryInvertedTextureTransform;
    private Matrix mSensorToBufferTransform;
    private final Size mSize;
    private final Surface mSurface;
    private final int mTargets;
    private final Object mLock = new Object();
    private boolean mHasPendingCloseRequest = false;
    private boolean mIsClosed = false;

    public SurfaceOutputImpl(Surface surface, int i6, int i7, Size size, SurfaceOutput.CameraInputInfo cameraInputInfo, SurfaceOutput.CameraInputInfo cameraInputInfo2, Matrix matrix) {
        float[] fArr = new float[16];
        this.mAdditionalTransform = fArr;
        float[] fArr2 = new float[16];
        this.mSecondaryAdditionalTransform = fArr2;
        float[] fArr3 = new float[16];
        this.mInvertedTextureTransform = fArr3;
        float[] fArr4 = new float[16];
        this.mSecondaryInvertedTextureTransform = fArr4;
        this.mSurface = surface;
        this.mTargets = i6;
        this.mFormat = i7;
        this.mSize = size;
        this.mCameraInputInfo = cameraInputInfo;
        this.mSecondaryCameraInputInfo = cameraInputInfo2;
        this.mSensorToBufferTransform = matrix;
        calculateAdditionalTransform(fArr, fArr3, cameraInputInfo);
        calculateAdditionalTransform(fArr2, fArr4, cameraInputInfo2);
        this.mCloseFuture = y.b.a(new b.c() { // from class: androidx.camera.core.processing.s
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar) {
                return this.s.lambda$new$0(aVar);
            }
        });
    }

    private static void calculateAdditionalTransform(float[] fArr, float[] fArr2, SurfaceOutput.CameraInputInfo cameraInputInfo) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (cameraInputInfo == null) {
            return;
        }
        MatrixExt.preVerticalFlip(fArr, 0.5f);
        MatrixExt.preRotate(fArr, cameraInputInfo.getRotationDegrees(), 0.5f, 0.5f);
        if (cameraInputInfo.getMirroring()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix rectToRect = TransformUtils.getRectToRect(TransformUtils.sizeToRectF(cameraInputInfo.getInputSize()), TransformUtils.sizeToRectF(TransformUtils.rotateSize(cameraInputInfo.getInputSize(), cameraInputInfo.getRotationDegrees())), cameraInputInfo.getRotationDegrees(), cameraInputInfo.getMirroring());
        RectF rectF = new RectF(cameraInputInfo.getInputCropRect());
        rectToRect.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float fWidth = rectF.width() / r1.getWidth();
        float fHeight = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        calculateInvertedTextureTransform(fArr2, cameraInputInfo.getCameraInternal());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void calculateInvertedTextureTransform(float[] fArr, CameraInternal cameraInternal) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        MatrixExt.preVerticalFlip(fArr, 0.5f);
        if (cameraInternal != null) {
            androidx.work.j.f("Camera has no transform.", cameraInternal.getHasTransform());
            MatrixExt.preRotate(fArr, cameraInternal.getCameraInfo().getSensorRotationDegrees(), 0.5f, 0.5f);
            if (cameraInternal.isFrontFacing()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(b.a aVar) {
        this.mCloseFutureCompleter = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestClose$1(AtomicReference atomicReference) {
        ((t0.a) atomicReference.get()).accept(SurfaceOutput.Event.of(0, this));
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.mLock) {
            try {
                if (!this.mIsClosed) {
                    this.mIsClosed = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mCloseFutureCompleter.a(null);
    }

    public CameraInternal getCamera() {
        return this.mCameraInputInfo.getCameraInternal();
    }

    public c5.a<Void> getCloseFuture() {
        return this.mCloseFuture;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getFormat() {
        return this.mFormat;
    }

    public Rect getInputCropRect() {
        return this.mCameraInputInfo.getInputCropRect();
    }

    public Size getInputSize() {
        return this.mCameraInputInfo.getInputSize();
    }

    public int getRotationDegrees() {
        return this.mCameraInputInfo.getRotationDegrees();
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Matrix getSensorToBufferTransform() {
        return new Matrix(this.mSensorToBufferTransform);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Size getSize() {
        return this.mSize;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public Surface getSurface(Executor executor, t0.a<SurfaceOutput.Event> aVar) {
        boolean z6;
        synchronized (this.mLock) {
            this.mExecutor = executor;
            this.mEventListener = aVar;
            z6 = this.mHasPendingCloseRequest;
        }
        if (z6) {
            requestClose();
        }
        return this.mSurface;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public int getTargets() {
        return this.mTargets;
    }

    public boolean isClosed() {
        boolean z6;
        synchronized (this.mLock) {
            z6 = this.mIsClosed;
        }
        return z6;
    }

    public boolean isMirroring() {
        return this.mCameraInputInfo.getMirroring();
    }

    public void requestClose() {
        Executor executor;
        t0.a<SurfaceOutput.Event> aVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.mLock) {
            try {
                if (this.mExecutor == null || (aVar = this.mEventListener) == null) {
                    this.mHasPendingCloseRequest = true;
                } else if (!this.mIsClosed) {
                    atomicReference.set(aVar);
                    executor = this.mExecutor;
                    this.mHasPendingCloseRequest = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new t(0, this, atomicReference));
            } catch (RejectedExecutionException e6) {
                Logger.d(TAG, "Processor executor closed. Close request not posted.", e6);
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput
    public void updateTransformMatrix(float[] fArr, float[] fArr2) {
        updateTransformMatrix(fArr, fArr2, true);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z6) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z6 ? this.mAdditionalTransform : this.mSecondaryAdditionalTransform, 0);
    }
}
