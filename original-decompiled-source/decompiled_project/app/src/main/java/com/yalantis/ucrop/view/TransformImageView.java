package com.yalantis.ucrop.view;

import a5.a;
import ag.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;
import bg.d;
import m.l;
import zf.c;

/* loaded from: classes2.dex */
public class TransformImageView extends l {
    private static final int MATRIX_VALUES_COUNT = 9;
    private static final int RECT_CENTER_POINT_COORDS = 2;
    private static final int RECT_CORNER_POINTS_COORDS = 8;
    private static final String TAG = "TransformImageView";
    protected boolean mBitmapDecoded;
    protected boolean mBitmapLaidOut;
    protected final float[] mCurrentImageCenter;
    protected final float[] mCurrentImageCorners;
    protected Matrix mCurrentImageMatrix;
    private c mExifInfo;
    private String mImageInputPath;
    private Uri mImageInputUri;
    private String mImageOutputPath;
    private Uri mImageOutputUri;
    private float[] mInitialImageCenter;
    private float[] mInitialImageCorners;
    private final float[] mMatrixValues;
    private int mMaxBitmapSize;
    protected int mThisHeight;
    protected int mThisWidth;
    protected TransformImageListener mTransformImageListener;

    public interface TransformImageListener {
        void onLoadComplete();

        void onLoadFailure(Exception exc);

        void onRotate(float f10);

        void onScale(float f10);
    }

    public TransformImageView(Context context) {
        this(context, null);
    }

    private void updateCurrentImagePoints() {
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCorners, this.mInitialImageCorners);
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCenter, this.mInitialImageCenter);
    }

    public float getCurrentAngle() {
        return getMatrixAngle(this.mCurrentImageMatrix);
    }

    public float getCurrentScale() {
        return getMatrixScale(this.mCurrentImageMatrix);
    }

    public c getExifInfo() {
        return this.mExifInfo;
    }

    public String getImageInputPath() {
        return this.mImageInputPath;
    }

    public Uri getImageInputUri() {
        return this.mImageInputUri;
    }

    public String getImageOutputPath() {
        return this.mImageOutputPath;
    }

    public Uri getImageOutputUri() {
        return this.mImageOutputUri;
    }

    public float getMatrixAngle(Matrix matrix) {
        return (float) (-(Math.atan2(getMatrixValue(matrix, 1), getMatrixValue(matrix, 0)) * 57.29577951308232d));
    }

    public float getMatrixScale(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(getMatrixValue(matrix, 3), 2.0d) + Math.pow(getMatrixValue(matrix, 0), 2.0d));
    }

    public float getMatrixValue(Matrix matrix, int i10) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i10];
    }

    public int getMaxBitmapSize() {
        int iA;
        if (this.mMaxBitmapSize <= 0) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            int i10 = point.x;
            int iSqrt = (int) Math.sqrt(Math.pow(point.y, 2.0d) + Math.pow(i10, 2.0d));
            Canvas canvas = new Canvas();
            int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            if (iMin > 0) {
                iSqrt = Math.min(iSqrt, iMin);
            }
            try {
                iA = bg.c.a();
            } catch (Exception e10) {
                Log.d("EglUtils", "getMaxTextureSize: ", e10);
                iA = 0;
            }
            if (iA > 0) {
                iSqrt = Math.min(iSqrt, iA);
            }
            a.a(iSqrt, "maxBitmapSize: ", "BitmapLoadUtils");
            this.mMaxBitmapSize = iSqrt;
        }
        return this.mMaxBitmapSize;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof d)) {
            return null;
        }
        return ((d) getDrawable()).f4217b;
    }

    public void init() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void onImageLaidOut() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d(TAG, String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, intrinsicWidth, intrinsicHeight);
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        this.mInitialImageCorners = new float[]{f10, f11, f12, f11, f12, f13, f10, f13};
        this.mInitialImageCenter = new float[]{rectF.centerX(), rectF.centerY()};
        this.mBitmapLaidOut = true;
        TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onLoadComplete();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.mBitmapDecoded && !this.mBitmapLaidOut)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            onImageLaidOut();
        }
    }

    public void postRotate(float f10, float f11, float f12) {
        if (f10 != CropImageView.DEFAULT_ASPECT_RATIO) {
            this.mCurrentImageMatrix.postRotate(f10, f11, f12);
            setImageMatrix(this.mCurrentImageMatrix);
            TransformImageListener transformImageListener = this.mTransformImageListener;
            if (transformImageListener != null) {
                transformImageListener.onRotate(getMatrixAngle(this.mCurrentImageMatrix));
            }
        }
    }

    public void postScale(float f10, float f11, float f12) {
        if (f10 != CropImageView.DEFAULT_ASPECT_RATIO) {
            this.mCurrentImageMatrix.postScale(f10, f10, f11, f12);
            setImageMatrix(this.mCurrentImageMatrix);
            TransformImageListener transformImageListener = this.mTransformImageListener;
            if (transformImageListener != null) {
                transformImageListener.onScale(getMatrixScale(this.mCurrentImageMatrix));
            }
        }
    }

    public void postTranslate(float f10, float f11) {
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO && f11 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        this.mCurrentImageMatrix.postTranslate(f10, f11);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void printMatrix(String str, Matrix matrix) {
        Log.d(TAG, str + ": matrix: { x: " + getMatrixValue(matrix, 2) + ", y: " + getMatrixValue(matrix, 5) + ", scale: " + getMatrixScale(matrix) + ", angle: " + getMatrixAngle(matrix) + " }");
    }

    @Override // m.l, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new d(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.mCurrentImageMatrix.set(matrix);
        updateCurrentImagePoints();
    }

    public void setImageUri(Uri uri, Uri uri2) throws Exception {
        int maxBitmapSize = getMaxBitmapSize();
        new b(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new yf.b() { // from class: com.yalantis.ucrop.view.TransformImageView.1
            @Override // yf.b
            public void onBitmapLoaded(Bitmap bitmap, c cVar, Uri uri3, Uri uri4) {
                TransformImageView.this.mImageInputUri = uri3;
                TransformImageView.this.mImageOutputUri = uri4;
                TransformImageView.this.mImageInputPath = uri3.getPath();
                TransformImageView.this.mImageOutputPath = uri4 != null ? uri4.getPath() : null;
                TransformImageView.this.mExifInfo = cVar;
                TransformImageView transformImageView = TransformImageView.this;
                transformImageView.mBitmapDecoded = true;
                transformImageView.setImageBitmap(bitmap);
            }

            @Override // yf.b
            public void onFailure(Exception exc) {
                Log.e(TransformImageView.TAG, "onFailure: setImageUri", exc);
                TransformImageListener transformImageListener = TransformImageView.this.mTransformImageListener;
                if (transformImageListener != null) {
                    transformImageListener.onLoadFailure(exc);
                }
            }
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void setMaxBitmapSize(int i10) {
        this.mMaxBitmapSize = i10;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w(TAG, "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(TransformImageListener transformImageListener) {
        this.mTransformImageListener = transformImageListener;
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCurrentImageCorners = new float[8];
        this.mCurrentImageCenter = new float[2];
        this.mMatrixValues = new float[9];
        this.mCurrentImageMatrix = new Matrix();
        this.mBitmapDecoded = false;
        this.mBitmapLaidOut = false;
        this.mMaxBitmapSize = 0;
        init();
    }
}
