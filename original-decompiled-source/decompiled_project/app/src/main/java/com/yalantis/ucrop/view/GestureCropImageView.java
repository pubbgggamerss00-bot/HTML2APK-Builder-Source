package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import bg.f;

/* loaded from: classes2.dex */
public class GestureCropImageView extends CropImageView {
    private static final int DOUBLE_TAP_ZOOM_DURATION = 200;
    private int mDoubleTapScaleSteps;
    private GestureDetector mGestureDetector;
    private boolean mIsGestureEnabled;
    private boolean mIsRotateEnabled;
    private boolean mIsScaleEnabled;
    private float mMidPntX;
    private float mMidPntY;
    private f mRotateDetector;
    private ScaleGestureDetector mScaleDetector;

    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.zoomImageToPosition(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            GestureCropImageView.this.postTranslate(-f10, -f11);
            return true;
        }
    }

    public class RotateListener extends f.b {
        private RotateListener() {
        }

        @Override // bg.f.b, bg.f.a
        public boolean onRotation(f fVar) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.postRotate(fVar.f4231g, gestureCropImageView.mMidPntX, GestureCropImageView.this.mMidPntY);
            return true;
        }
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.postScale(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.mMidPntX, GestureCropImageView.this.mMidPntY);
            return true;
        }
    }

    public GestureCropImageView(Context context) {
        super(context);
        this.mIsRotateEnabled = true;
        this.mIsScaleEnabled = true;
        this.mIsGestureEnabled = true;
        this.mDoubleTapScaleSteps = 5;
    }

    private void setupGestureListeners() {
        this.mGestureDetector = new GestureDetector(getContext(), new GestureListener(), null, true);
        this.mScaleDetector = new ScaleGestureDetector(getContext(), new ScaleListener());
        RotateListener rotateListener = new RotateListener();
        f fVar = new f();
        fVar.f4233i = rotateListener;
        fVar.f4229e = -1;
        fVar.f4230f = -1;
        this.mRotateDetector = fVar;
    }

    public int getDoubleTapScaleSteps() {
        return this.mDoubleTapScaleSteps;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.mDoubleTapScaleSteps));
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void init() {
        super.init();
        setupGestureListeners();
    }

    public boolean isGestureEnabled() {
        return this.mIsGestureEnabled;
    }

    public boolean isRotateEnabled() {
        return this.mIsRotateEnabled;
    }

    public boolean isScaleEnabled() {
        return this.mIsScaleEnabled;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            cancelAllAnimations();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.mMidPntX = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.mMidPntY = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        if (this.mIsGestureEnabled) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (this.mIsScaleEnabled) {
            this.mScaleDetector.onTouchEvent(motionEvent);
        }
        if (this.mIsRotateEnabled) {
            f fVar = this.mRotateDetector;
            fVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                fVar.f4227c = motionEvent.getX();
                fVar.f4228d = motionEvent.getY();
                fVar.f4229e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                fVar.f4231g = CropImageView.DEFAULT_ASPECT_RATIO;
                fVar.f4232h = true;
            } else if (actionMasked == 1) {
                fVar.f4229e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    fVar.f4225a = motionEvent.getX();
                    fVar.f4226b = motionEvent.getY();
                    fVar.f4230f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    fVar.f4231g = CropImageView.DEFAULT_ASPECT_RATIO;
                    fVar.f4232h = true;
                } else if (actionMasked == 6) {
                    fVar.f4230f = -1;
                }
            } else if (fVar.f4229e != -1 && fVar.f4230f != -1 && motionEvent.getPointerCount() > fVar.f4230f) {
                float x10 = motionEvent.getX(fVar.f4229e);
                float y10 = motionEvent.getY(fVar.f4229e);
                float x11 = motionEvent.getX(fVar.f4230f);
                float y11 = motionEvent.getY(fVar.f4230f);
                if (fVar.f4232h) {
                    fVar.f4231g = CropImageView.DEFAULT_ASPECT_RATIO;
                    fVar.f4232h = false;
                } else {
                    float f10 = fVar.f4225a;
                    float degrees = (((float) Math.toDegrees((float) Math.atan2(y11 - y10, x11 - x10))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(fVar.f4226b - fVar.f4228d, f10 - fVar.f4227c))) % 360.0f);
                    fVar.f4231g = degrees;
                    if (degrees < -180.0f) {
                        fVar.f4231g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        fVar.f4231g = degrees - 360.0f;
                    }
                }
                fVar.f4233i.onRotation(fVar);
                fVar.f4225a = x11;
                fVar.f4226b = y11;
                fVar.f4227c = x10;
                fVar.f4228d = y10;
            }
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i10) {
        this.mDoubleTapScaleSteps = i10;
    }

    public void setGestureEnabled(boolean z10) {
        this.mIsGestureEnabled = z10;
    }

    public void setRotateEnabled(boolean z10) {
        this.mIsRotateEnabled = z10;
    }

    public void setScaleEnabled(boolean z10) {
        this.mIsScaleEnabled = z10;
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mIsRotateEnabled = true;
        this.mIsScaleEnabled = true;
        this.mIsGestureEnabled = true;
        this.mDoubleTapScaleSteps = 5;
    }
}
