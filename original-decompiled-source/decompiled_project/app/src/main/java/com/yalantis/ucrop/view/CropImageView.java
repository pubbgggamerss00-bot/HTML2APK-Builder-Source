package com.yalantis.ucrop.view;

import ae.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import bg.b;
import com.yalantis.ucrop.view.TransformImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import yf.a;
import yf.c;
import zf.d;

/* loaded from: classes2.dex */
public class CropImageView extends TransformImageView {
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;
    public static final int DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = 500;
    public static final int DEFAULT_MAX_BITMAP_SIZE = 0;
    public static final float DEFAULT_MAX_SCALE_MULTIPLIER = 10.0f;
    public static final float SOURCE_IMAGE_ASPECT_RATIO = 0.0f;
    private c mCropBoundsChangeListener;
    private final RectF mCropRect;
    private long mImageToWrapCropBoundsAnimDuration;
    private int mMaxResultImageSizeX;
    private int mMaxResultImageSizeY;
    private float mMaxScale;
    private float mMaxScaleMultiplier;
    private float mMinScale;
    private float mTargetAspectRatio;
    private final Matrix mTempMatrix;
    private Runnable mWrapCropBoundsRunnable;
    private Runnable mZoomImageToPositionRunnable;

    public static class WrapCropBoundsRunnable implements Runnable {
        private final float mCenterDiffX;
        private final float mCenterDiffY;
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final long mDurationMs;
        private final float mOldScale;
        private final float mOldX;
        private final float mOldY;
        private final long mStartTime = System.currentTimeMillis();
        private final boolean mWillBeImageInBoundsAfterTranslate;

        public WrapCropBoundsRunnable(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j10;
            this.mOldX = f10;
            this.mOldY = f11;
            this.mCenterDiffX = f12;
            this.mCenterDiffY = f13;
            this.mOldScale = f14;
            this.mDeltaScale = f15;
            this.mWillBeImageInBoundsAfterTranslate = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.mCropImageView.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float f10 = this.mCenterDiffX;
            long j10 = this.mDurationMs;
            float f11 = (fMin / j10) - 1.0f;
            float f12 = (((f11 * f11 * f11) + 1.0f) * f10) + CropImageView.DEFAULT_ASPECT_RATIO;
            float f13 = (fMin / j10) - 1.0f;
            float f14 = (((f13 * f13 * f13) + 1.0f) * this.mCenterDiffY) + CropImageView.DEFAULT_ASPECT_RATIO;
            float f15 = b.f(fMin, this.mDeltaScale, j10);
            if (fMin < this.mDurationMs) {
                float[] fArr = cropImageView.mCurrentImageCenter;
                cropImageView.postTranslate(f12 - (fArr[0] - this.mOldX), f14 - (fArr[1] - this.mOldY));
                if (!this.mWillBeImageInBoundsAfterTranslate) {
                    cropImageView.zoomInImage(this.mOldScale + f15, cropImageView.mCropRect.centerX(), cropImageView.mCropRect.centerY());
                }
                if (cropImageView.isImageWrapCropBounds()) {
                    return;
                }
                cropImageView.post(this);
            }
        }
    }

    public static class ZoomImageToPosition implements Runnable {
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final float mDestX;
        private final float mDestY;
        private final long mDurationMs;
        private final float mOldScale;
        private final long mStartTime = System.currentTimeMillis();

        public ZoomImageToPosition(CropImageView cropImageView, long j10, float f10, float f11, float f12, float f13) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j10;
            this.mOldScale = f10;
            this.mDeltaScale = f11;
            this.mDestX = f12;
            this.mDestY = f13;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.mCropImageView.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float f10 = b.f(fMin, this.mDeltaScale, this.mDurationMs);
            if (fMin >= this.mDurationMs) {
                cropImageView.setImageToWrapCropBounds();
            } else {
                cropImageView.zoomInImage(this.mOldScale + f10, this.mDestX, this.mDestY);
                cropImageView.post(this);
            }
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    private float[] calculateImageIndents() {
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] fArr = this.mCurrentImageCorners;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        RectF rectF = this.mCropRect;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        float[] fArr2 = {f10, f11, f12, f11, f12, f13, f10, f13};
        this.mTempMatrix.mapPoints(fArrCopyOf);
        this.mTempMatrix.mapPoints(fArr2);
        RectF rectFA = l.a(fArrCopyOf);
        RectF rectFA2 = l.a(fArr2);
        float f14 = rectFA.left - rectFA2.left;
        float f15 = rectFA.top - rectFA2.top;
        float f16 = rectFA.right - rectFA2.right;
        float f17 = rectFA.bottom - rectFA2.bottom;
        if (f14 <= DEFAULT_ASPECT_RATIO) {
            f14 = 0.0f;
        }
        if (f15 <= DEFAULT_ASPECT_RATIO) {
            f15 = 0.0f;
        }
        if (f16 >= DEFAULT_ASPECT_RATIO) {
            f16 = 0.0f;
        }
        if (f17 >= DEFAULT_ASPECT_RATIO) {
            f17 = 0.0f;
        }
        float[] fArr3 = {f14, f15, f16, f17};
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(getCurrentAngle());
        this.mTempMatrix.mapPoints(fArr3);
        return fArr3;
    }

    private void calculateImageScaleBounds() {
        if (getDrawable() == null) {
            return;
        }
        calculateImageScaleBounds(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    private void setupInitialImagePosition(float f10, float f11) {
        float fWidth = this.mCropRect.width();
        float fHeight = this.mCropRect.height();
        float fMax = Math.max(this.mCropRect.width() / f10, this.mCropRect.height() / f11);
        RectF rectF = this.mCropRect;
        float f12 = ((fWidth - (f10 * fMax)) / 2.0f) + rectF.left;
        float f13 = ((fHeight - (f11 * fMax)) / 2.0f) + rectF.top;
        this.mCurrentImageMatrix.reset();
        this.mCurrentImageMatrix.postScale(fMax, fMax);
        this.mCurrentImageMatrix.postTranslate(f12, f13);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void cancelAllAnimations() {
        removeCallbacks(this.mWrapCropBoundsRunnable);
        removeCallbacks(this.mZoomImageToPositionRunnable);
    }

    public void cropAndSaveImage(Bitmap.CompressFormat compressFormat, int i10, a aVar) {
        cancelAllAnimations();
        setImageToWrapCropBounds(false);
        RectF rectF = this.mCropRect;
        RectF rectFA = l.a(this.mCurrentImageCorners);
        float currentScale = getCurrentScale();
        float currentAngle = getCurrentAngle();
        d dVar = new d();
        dVar.f35070a = rectF;
        dVar.f35071b = rectFA;
        dVar.f35072c = currentScale;
        dVar.f35073d = currentAngle;
        int i11 = this.mMaxResultImageSizeX;
        int i12 = this.mMaxResultImageSizeY;
        String imageInputPath = getImageInputPath();
        String imageOutputPath = getImageOutputPath();
        getExifInfo();
        zf.b bVar = new zf.b();
        bVar.f35059a = i11;
        bVar.f35060b = i12;
        bVar.f35061c = compressFormat;
        bVar.f35062d = i10;
        bVar.f35063e = imageInputPath;
        bVar.f35064f = imageOutputPath;
        bVar.f35065g = getImageInputUri();
        bVar.f35066h = getImageOutputUri();
        new ag.a(getContext(), getViewBitmap(), dVar, bVar, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public c getCropBoundsChangeListener() {
        return this.mCropBoundsChangeListener;
    }

    public float getMaxScale() {
        return this.mMaxScale;
    }

    public float getMinScale() {
        return this.mMinScale;
    }

    public float getTargetAspectRatio() {
        return this.mTargetAspectRatio;
    }

    public boolean isImageWrapCropBounds() {
        return isImageWrapCropBounds(this.mCurrentImageCorners);
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void onImageLaidOut() {
        super.onImageLaidOut();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.mTargetAspectRatio == DEFAULT_ASPECT_RATIO) {
            this.mTargetAspectRatio = intrinsicWidth / intrinsicHeight;
        }
        int i10 = this.mThisWidth;
        float f10 = this.mTargetAspectRatio;
        int i11 = (int) (i10 / f10);
        int i12 = this.mThisHeight;
        if (i11 > i12) {
            this.mCropRect.set((i10 - ((int) (i12 * f10))) / 2, DEFAULT_ASPECT_RATIO, r4 + r2, i12);
        } else {
            this.mCropRect.set(DEFAULT_ASPECT_RATIO, (i12 - i11) / 2, i10, i11 + r6);
        }
        calculateImageScaleBounds(intrinsicWidth, intrinsicHeight);
        setupInitialImagePosition(intrinsicWidth, intrinsicHeight);
        c cVar = this.mCropBoundsChangeListener;
        if (cVar != null) {
            cVar.onCropAspectRatioChanged(this.mTargetAspectRatio);
        }
        TransformImageView.TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onScale(getCurrentScale());
            this.mTransformImageListener.onRotate(getCurrentAngle());
        }
    }

    public void postRotate(float f10) {
        postRotate(f10, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void postScale(float f10, float f11, float f12) {
        if (f10 > 1.0f && getCurrentScale() * f10 <= getMaxScale()) {
            super.postScale(f10, f11, f12);
        } else {
            if (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale()) {
                return;
            }
            super.postScale(f10, f11, f12);
        }
    }

    public void processStyledAttributes(TypedArray typedArray) {
        float fAbs = Math.abs(typedArray.getFloat(0, DEFAULT_ASPECT_RATIO));
        float fAbs2 = Math.abs(typedArray.getFloat(1, DEFAULT_ASPECT_RATIO));
        if (fAbs == DEFAULT_ASPECT_RATIO || fAbs2 == DEFAULT_ASPECT_RATIO) {
            this.mTargetAspectRatio = DEFAULT_ASPECT_RATIO;
        } else {
            this.mTargetAspectRatio = fAbs / fAbs2;
        }
    }

    public void setCropBoundsChangeListener(c cVar) {
        this.mCropBoundsChangeListener = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.mTargetAspectRatio = rectF.width() / rectF.height();
        this.mCropRect.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        calculateImageScaleBounds();
        setImageToWrapCropBounds();
    }

    public void setImageToWrapCropBounds() {
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBoundsAnimDuration(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.mImageToWrapCropBoundsAnimDuration = j10;
    }

    public void setMaxResultImageSizeX(int i10) {
        this.mMaxResultImageSizeX = i10;
    }

    public void setMaxResultImageSizeY(int i10) {
        this.mMaxResultImageSizeY = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.mMaxScaleMultiplier = f10;
    }

    public void setTargetAspectRatio(float f10) {
        if (getDrawable() == null) {
            this.mTargetAspectRatio = f10;
            return;
        }
        if (f10 == DEFAULT_ASPECT_RATIO) {
            this.mTargetAspectRatio = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.mTargetAspectRatio = f10;
        }
        c cVar = this.mCropBoundsChangeListener;
        if (cVar != null) {
            cVar.onCropAspectRatioChanged(this.mTargetAspectRatio);
        }
    }

    public void zoomImageToPosition(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        ZoomImageToPosition zoomImageToPosition = new ZoomImageToPosition(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.mZoomImageToPositionRunnable = zoomImageToPosition;
        post(zoomImageToPosition);
    }

    public void zoomInImage(float f10) {
        zoomInImage(f10, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public void zoomOutImage(float f10) {
        zoomOutImage(f10, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean isImageWrapCropBounds(float[] fArr) {
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        RectF rectF = this.mCropRect;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        float[] fArr2 = {f10, f11, f12, f11, f12, f13, f10, f13};
        this.mTempMatrix.mapPoints(fArr2);
        return l.a(fArrCopyOf).contains(l.a(fArr2));
    }

    public void setImageToWrapCropBounds(boolean z10) {
        boolean z11;
        float fMax;
        float f10;
        float f11;
        if (!this.mBitmapLaidOut || isImageWrapCropBounds()) {
            return;
        }
        float[] fArr = this.mCurrentImageCenter;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.mCropRect.centerX() - f12;
        float fCenterY = this.mCropRect.centerY() - f13;
        this.mTempMatrix.reset();
        this.mTempMatrix.setTranslate(fCenterX, fCenterY);
        float[] fArr2 = this.mCurrentImageCorners;
        float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        boolean zIsImageWrapCropBounds = isImageWrapCropBounds(fArrCopyOf);
        if (zIsImageWrapCropBounds) {
            float[] fArrCalculateImageIndents = calculateImageIndents();
            float f14 = -(fArrCalculateImageIndents[0] + fArrCalculateImageIndents[2]);
            fMax = 0.0f;
            f10 = -(fArrCalculateImageIndents[1] + fArrCalculateImageIndents[3]);
            z11 = zIsImageWrapCropBounds;
            f11 = f14;
        } else {
            RectF rectF = new RectF(this.mCropRect);
            this.mTempMatrix.reset();
            this.mTempMatrix.setRotate(getCurrentAngle());
            this.mTempMatrix.mapRect(rectF);
            float[] fArr3 = this.mCurrentImageCorners;
            z11 = zIsImageWrapCropBounds;
            float[] fArr4 = {(float) Math.sqrt(Math.pow(fArr3[1] - fArr3[3], 2.0d) + Math.pow(fArr3[0] - fArr3[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr3[3] - fArr3[5], 2.0d) + Math.pow(fArr3[2] - fArr3[4], 2.0d))};
            fMax = (Math.max(rectF.width() / fArr4[0], rectF.height() / fArr4[1]) * currentScale) - currentScale;
            f10 = fCenterY;
            f11 = fCenterX;
        }
        if (z10) {
            WrapCropBoundsRunnable wrapCropBoundsRunnable = new WrapCropBoundsRunnable(this, this.mImageToWrapCropBoundsAnimDuration, f12, f13, f11, f10, currentScale, fMax, z11);
            this.mWrapCropBoundsRunnable = wrapCropBoundsRunnable;
            post(wrapCropBoundsRunnable);
        } else {
            postTranslate(f11, f10);
            if (z11) {
                return;
            }
            zoomInImage(currentScale + fMax, this.mCropRect.centerX(), this.mCropRect.centerY());
        }
    }

    public void zoomInImage(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            postScale(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void zoomOutImage(float f10, float f11, float f12) {
        if (f10 >= getMinScale()) {
            postScale(f10 / getCurrentScale(), f11, f12);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCropRect = new RectF();
        this.mTempMatrix = new Matrix();
        this.mMaxScaleMultiplier = 10.0f;
        this.mZoomImageToPositionRunnable = null;
        this.mMaxResultImageSizeX = 0;
        this.mMaxResultImageSizeY = 0;
        this.mImageToWrapCropBoundsAnimDuration = 500L;
    }

    private void calculateImageScaleBounds(float f10, float f11) {
        float fMin = Math.min(Math.min(this.mCropRect.width() / f10, this.mCropRect.width() / f11), Math.min(this.mCropRect.height() / f11, this.mCropRect.height() / f10));
        this.mMinScale = fMin;
        this.mMaxScale = fMin * this.mMaxScaleMultiplier;
    }
}
