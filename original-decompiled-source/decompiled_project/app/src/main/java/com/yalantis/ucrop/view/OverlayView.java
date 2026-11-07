package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.basitce.htmltoapk.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import yf.d;

/* loaded from: classes2.dex */
public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private d mCallback;
    private boolean mCircleDimmedLayer;
    private Path mCircularPath;
    private Paint mCropFrameCornersPaint;
    private Paint mCropFramePaint;
    protected float[] mCropGridCenter;
    private int mCropGridColumnCount;
    protected float[] mCropGridCorners;
    private Paint mCropGridPaint;
    private int mCropGridRowCount;
    private int mCropRectCornerTouchAreaLineLength;
    private int mCropRectMinSize;
    private final RectF mCropViewRect;
    private int mCurrentTouchCornerIndex;
    private int mDimmedColor;
    private Paint mDimmedStrokePaint;
    private int mFreestyleCropMode;
    private float[] mGridPoints;
    private float mPreviousTouchX;
    private float mPreviousTouchY;
    private boolean mShouldSetupCropBounds;
    private boolean mShowCropFrame;
    private boolean mShowCropGrid;
    private float mTargetAspectRatio;
    private final RectF mTempRect;
    protected int mThisHeight;
    protected int mThisWidth;
    private int mTouchPointThreshold;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    private int getCurrentTouchIndex(float f10, float f11) {
        double d10 = this.mTouchPointThreshold;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f11 - this.mCropGridCorners[i11 + 1], 2.0d) + Math.pow(f10 - this.mCropGridCorners[i11], 2.0d));
            if (dSqrt < d10) {
                i10 = i11 / 2;
                d10 = dSqrt;
            }
        }
        if (this.mFreestyleCropMode == 1 && i10 < 0 && this.mCropViewRect.contains(f10, f11)) {
            return 4;
        }
        return i10;
    }

    private void initCropFrameStyle(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(4, getResources().getColor(R.color.ucrop_color_default_crop_frame));
        this.mCropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.mCropFramePaint.setColor(color);
        Paint paint = this.mCropFramePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mCropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.mCropFrameCornersPaint.setColor(color);
        this.mCropFrameCornersPaint.setStyle(style);
    }

    private void initCropGridStyle(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(9, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(6, getResources().getColor(R.color.ucrop_color_default_crop_grid));
        this.mCropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.mCropGridPaint.setColor(color);
        this.mCropGridRowCount = typedArray.getInt(8, 2);
        this.mCropGridColumnCount = typedArray.getInt(7, 2);
    }

    private void updateCropViewRect(float f10, float f11) {
        this.mTempRect.set(this.mCropViewRect);
        int i10 = this.mCurrentTouchCornerIndex;
        if (i10 == 0) {
            RectF rectF = this.mTempRect;
            RectF rectF2 = this.mCropViewRect;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i10 == 1) {
            RectF rectF3 = this.mTempRect;
            RectF rectF4 = this.mCropViewRect;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i10 == 2) {
            RectF rectF5 = this.mTempRect;
            RectF rectF6 = this.mCropViewRect;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i10 == 3) {
            RectF rectF7 = this.mTempRect;
            RectF rectF8 = this.mCropViewRect;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i10 == 4) {
            this.mTempRect.offset(f10 - this.mPreviousTouchX, f11 - this.mPreviousTouchY);
            if (this.mTempRect.left <= getLeft() || this.mTempRect.top <= getTop() || this.mTempRect.right >= getRight() || this.mTempRect.bottom >= getBottom()) {
                return;
            }
            this.mCropViewRect.set(this.mTempRect);
            updateGridPoints();
            postInvalidate();
            return;
        }
        boolean z10 = this.mTempRect.height() >= ((float) this.mCropRectMinSize);
        boolean z11 = this.mTempRect.width() >= ((float) this.mCropRectMinSize);
        RectF rectF9 = this.mCropViewRect;
        rectF9.set(z11 ? this.mTempRect.left : rectF9.left, z10 ? this.mTempRect.top : rectF9.top, z11 ? this.mTempRect.right : rectF9.right, z10 ? this.mTempRect.bottom : rectF9.bottom);
        if (z10 || z11) {
            updateGridPoints();
            postInvalidate();
        }
    }

    private void updateGridPoints() {
        RectF rectF = this.mCropViewRect;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        this.mCropGridCorners = new float[]{f10, f11, f12, f11, f12, f13, f10, f13};
        this.mCropGridCenter = new float[]{rectF.centerX(), rectF.centerY()};
        this.mGridPoints = null;
        this.mCircularPath.reset();
        this.mCircularPath.addCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, Path.Direction.CW);
    }

    public void drawCropGrid(Canvas canvas) {
        if (this.mShowCropGrid) {
            if (this.mGridPoints == null && !this.mCropViewRect.isEmpty()) {
                this.mGridPoints = new float[(this.mCropGridColumnCount * 4) + (this.mCropGridRowCount * 4)];
                int i10 = 0;
                for (int i11 = 0; i11 < this.mCropGridRowCount; i11++) {
                    float[] fArr = this.mGridPoints;
                    RectF rectF = this.mCropViewRect;
                    fArr[i10] = rectF.left;
                    float f10 = i11 + 1.0f;
                    float fHeight = (f10 / (this.mCropGridRowCount + 1)) * rectF.height();
                    RectF rectF2 = this.mCropViewRect;
                    fArr[i10 + 1] = fHeight + rectF2.top;
                    float[] fArr2 = this.mGridPoints;
                    int i12 = i10 + 3;
                    fArr2[i10 + 2] = rectF2.right;
                    i10 += 4;
                    fArr2[i12] = ((f10 / (this.mCropGridRowCount + 1)) * rectF2.height()) + this.mCropViewRect.top;
                }
                for (int i13 = 0; i13 < this.mCropGridColumnCount; i13++) {
                    float[] fArr3 = this.mGridPoints;
                    float f11 = i13 + 1.0f;
                    float fWidth = (f11 / (this.mCropGridColumnCount + 1)) * this.mCropViewRect.width();
                    RectF rectF3 = this.mCropViewRect;
                    fArr3[i10] = fWidth + rectF3.left;
                    float[] fArr4 = this.mGridPoints;
                    fArr4[i10 + 1] = rectF3.top;
                    int i14 = i10 + 3;
                    float fWidth2 = (f11 / (this.mCropGridColumnCount + 1)) * rectF3.width();
                    RectF rectF4 = this.mCropViewRect;
                    fArr4[i10 + 2] = fWidth2 + rectF4.left;
                    i10 += 4;
                    this.mGridPoints[i14] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.mGridPoints;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.mCropGridPaint);
            }
        }
        if (this.mShowCropFrame) {
            canvas.drawRect(this.mCropViewRect, this.mCropFramePaint);
        }
        if (this.mFreestyleCropMode != 0) {
            canvas.save();
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(this.mCropRectCornerTouchAreaLineLength, -r1);
            RectF rectF5 = this.mTempRect;
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF5, op);
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(-r2, this.mCropRectCornerTouchAreaLineLength);
            canvas.clipRect(this.mTempRect, op);
            canvas.drawRect(this.mCropViewRect, this.mCropFrameCornersPaint);
            canvas.restore();
        }
    }

    public void drawDimmedLayer(Canvas canvas) {
        canvas.save();
        if (this.mCircleDimmedLayer) {
            canvas.clipPath(this.mCircularPath, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.mCropViewRect, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.mDimmedColor);
        canvas.restore();
        if (this.mCircleDimmedLayer) {
            canvas.drawCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, this.mDimmedStrokePaint);
        }
    }

    public RectF getCropViewRect() {
        return this.mCropViewRect;
    }

    public int getFreestyleCropMode() {
        return this.mFreestyleCropMode;
    }

    public d getOverlayViewChangeListener() {
        return this.mCallback;
    }

    public void init() {
    }

    @Deprecated
    public boolean isFreestyleCropEnabled() {
        return this.mFreestyleCropMode == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
        drawCropGrid(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            if (this.mShouldSetupCropBounds) {
                this.mShouldSetupCropBounds = false;
                setTargetAspectRatio(this.mTargetAspectRatio);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCropViewRect.isEmpty() && this.mFreestyleCropMode != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int currentTouchIndex = getCurrentTouchIndex(x10, y10);
                this.mCurrentTouchCornerIndex = currentTouchIndex;
                boolean z10 = currentTouchIndex != -1;
                if (!z10) {
                    this.mPreviousTouchX = -1.0f;
                    this.mPreviousTouchY = -1.0f;
                    return z10;
                }
                if (this.mPreviousTouchX < CropImageView.DEFAULT_ASPECT_RATIO) {
                    this.mPreviousTouchX = x10;
                    this.mPreviousTouchY = y10;
                }
                return z10;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.mCurrentTouchCornerIndex != -1) {
                float fMin = Math.min(Math.max(x10, getPaddingLeft()), getWidth() - getPaddingRight());
                float fMin2 = Math.min(Math.max(y10, getPaddingTop()), getHeight() - getPaddingBottom());
                updateCropViewRect(fMin, fMin2);
                this.mPreviousTouchX = fMin;
                this.mPreviousTouchY = fMin2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.mPreviousTouchX = -1.0f;
                this.mPreviousTouchY = -1.0f;
                this.mCurrentTouchCornerIndex = -1;
                d dVar = this.mCallback;
                if (dVar != null) {
                    dVar.onCropRectUpdated(this.mCropViewRect);
                }
            }
        }
        return false;
    }

    public void processStyledAttributes(TypedArray typedArray) {
        this.mCircleDimmedLayer = typedArray.getBoolean(2, false);
        int color = typedArray.getColor(3, getResources().getColor(R.color.ucrop_color_default_dimmed));
        this.mDimmedColor = color;
        this.mDimmedStrokePaint.setColor(color);
        this.mDimmedStrokePaint.setStyle(Paint.Style.STROKE);
        this.mDimmedStrokePaint.setStrokeWidth(1.0f);
        initCropFrameStyle(typedArray);
        this.mShowCropFrame = typedArray.getBoolean(10, true);
        initCropGridStyle(typedArray);
        this.mShowCropGrid = typedArray.getBoolean(11, true);
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.mCircleDimmedLayer = z10;
    }

    public void setCropFrameColor(int i10) {
        this.mCropFramePaint.setColor(i10);
    }

    public void setCropFrameStrokeWidth(int i10) {
        this.mCropFramePaint.setStrokeWidth(i10);
    }

    public void setCropGridColor(int i10) {
        this.mCropGridPaint.setColor(i10);
    }

    public void setCropGridColumnCount(int i10) {
        this.mCropGridColumnCount = i10;
        this.mGridPoints = null;
    }

    public void setCropGridRowCount(int i10) {
        this.mCropGridRowCount = i10;
        this.mGridPoints = null;
    }

    public void setCropGridStrokeWidth(int i10) {
        this.mCropGridPaint.setStrokeWidth(i10);
    }

    public void setDimmedColor(int i10) {
        this.mDimmedColor = i10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.mFreestyleCropMode = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        this.mFreestyleCropMode = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(d dVar) {
        this.mCallback = dVar;
    }

    public void setShowCropFrame(boolean z10) {
        this.mShowCropFrame = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.mShowCropGrid = z10;
    }

    public void setTargetAspectRatio(float f10) {
        this.mTargetAspectRatio = f10;
        if (this.mThisWidth <= 0) {
            this.mShouldSetupCropBounds = true;
        } else {
            setupCropBounds();
            postInvalidate();
        }
    }

    public void setupCropBounds() {
        int i10 = this.mThisWidth;
        float f10 = this.mTargetAspectRatio;
        int i11 = (int) (i10 / f10);
        int i12 = this.mThisHeight;
        if (i11 > i12) {
            int i13 = (i10 - ((int) (i12 * f10))) / 2;
            this.mCropViewRect.set(getPaddingLeft() + i13, getPaddingTop(), getPaddingLeft() + r1 + i13, getPaddingTop() + this.mThisHeight);
        } else {
            int i14 = (i12 - i11) / 2;
            this.mCropViewRect.set(getPaddingLeft(), getPaddingTop() + i14, getPaddingLeft() + this.mThisWidth, getPaddingTop() + i11 + i14);
        }
        d dVar = this.mCallback;
        if (dVar != null) {
            dVar.onCropRectUpdated(this.mCropViewRect);
        }
        updateGridPoints();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCropViewRect = new RectF();
        this.mTempRect = new RectF();
        this.mGridPoints = null;
        this.mCircularPath = new Path();
        this.mDimmedStrokePaint = new Paint(1);
        this.mCropGridPaint = new Paint(1);
        this.mCropFramePaint = new Paint(1);
        this.mCropFrameCornersPaint = new Paint(1);
        this.mFreestyleCropMode = 0;
        this.mPreviousTouchX = -1.0f;
        this.mPreviousTouchY = -1.0f;
        this.mCurrentTouchCornerIndex = -1;
        this.mTouchPointThreshold = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.mCropRectMinSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.mCropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        init();
    }
}
