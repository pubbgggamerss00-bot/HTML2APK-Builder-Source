package m9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.v;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class c2 extends androidx.recyclerview.widget.v {
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public eh.a<pg.f0> O0;
    public eh.a<pg.f0> P0;
    public eh.a<pg.f0> Q0;
    public float R0;
    public float S0;
    public float T0;
    public final OverScroller U0;
    public boolean V0;
    public VelocityTracker W0;
    public boolean X0;
    public float Y0;
    public float Z0;

    /* renamed from: a1, reason: collision with root package name */
    public float f17746a1;

    /* renamed from: b1, reason: collision with root package name */
    public ValueAnimator f17747b1;

    /* renamed from: c1, reason: collision with root package name */
    public final int f17748c1;

    /* renamed from: d1, reason: collision with root package name */
    public final float f17749d1;

    /* renamed from: e1, reason: collision with root package name */
    public final ScaleGestureDetector f17750e1;

    /* renamed from: f1, reason: collision with root package name */
    public final GestureDetector f17751f1;

    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.r.e(animation, "animation");
            c2 c2Var = c2.this;
            if (c2Var.f17747b1 == animation) {
                c2Var.f17747b1 = null;
            }
            eh.a<pg.f0> onTransformSettled = c2Var.getOnTransformSettled();
            if (onTransformSettled != null) {
                onTransformSettled.invoke();
            }
        }
    }

    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent e10) {
            kotlin.jvm.internal.r.e(e10, "e");
            c2 c2Var = c2.this;
            if (!c2Var.getZoomEnabled()) {
                return false;
            }
            c2Var.i0(c2Var.l0() ? 1.0f : 2.5f, e10.getX(), e10.getY());
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent e10) {
            kotlin.jvm.internal.r.e(e10, "e");
            eh.a<pg.f0> onSingleTap = c2.this.getOnSingleTap();
            if (onSingleTap == null) {
                return true;
            }
            onSingleTap.invoke();
            return true;
        }
    }

    public static final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector detector) {
            kotlin.jvm.internal.r.e(detector, "detector");
            c2 c2Var = c2.this;
            c2Var.o0(detector.getScaleFactor() * c2Var.getZoom(), detector.getFocusX(), detector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector detector) {
            kotlin.jvm.internal.r.e(detector, "detector");
            return c2.this.getZoomEnabled();
        }
    }

    public c2(Context context) {
        super(context);
        this.L0 = true;
        this.M0 = true;
        this.N0 = true;
        this.R0 = 1.0f;
        this.U0 = new OverScroller(context);
        this.f17748c1 = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f17749d1 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new c());
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f17750e1 = scaleGestureDetector;
        this.f17751f1 = new GestureDetector(context, new b());
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.V0) {
            OverScroller overScroller = this.U0;
            if (!overScroller.computeScrollOffset()) {
                this.V0 = false;
                eh.a<pg.f0> aVar = this.Q0;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            this.S0 = jh.j.l(overScroller.getCurrX(), (1.0f - this.R0) * getWidth(), CropImageView.DEFAULT_ASPECT_RATIO);
            this.T0 = jh.j.l(overScroller.getCurrY(), (1.0f - this.R0) * getHeight(), CropImageView.DEFAULT_ASPECT_RATIO);
            eh.a<pg.f0> aVar2 = this.P0;
            if (aVar2 != null) {
                aVar2.invoke();
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.r.e(canvas, "canvas");
        if (this.R0 == 1.0f && this.S0 == CropImageView.DEFAULT_ASPECT_RATIO && this.T0 == CropImageView.DEFAULT_ASPECT_RATIO) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.S0, this.T0);
        float f10 = this.R0;
        canvas.scale(f10, f10);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final boolean getContinuous() {
        return this.N0;
    }

    public final eh.a<pg.f0> getOnSingleTap() {
        return this.O0;
    }

    public final eh.a<pg.f0> getOnTransformChanged() {
        return this.P0;
    }

    public final eh.a<pg.f0> getOnTransformSettled() {
        return this.Q0;
    }

    public final float getPanX() {
        return this.S0;
    }

    public final float getPanY() {
        return this.T0;
    }

    public final boolean getVertical() {
        return this.M0;
    }

    public final float getZoom() {
        return this.R0;
    }

    public final boolean getZoomEnabled() {
        return this.L0;
    }

    public final void i0(final float f10, final float f11, final float f12) {
        ValueAnimator valueAnimator = this.f17747b1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f13 = this.R0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m9.b2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                kotlin.jvm.internal.r.e(it, "it");
                float f14 = f10;
                float f15 = f13;
                this.f17736a.o0((it.getAnimatedFraction() * (f14 - f15)) + f15, f11, f12);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        valueAnimatorOfFloat.start();
        this.f17747b1 = valueAnimatorOfFloat;
    }

    public final pg.n<Float, Float> k0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float y10 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (i11 != actionIndex) {
                float x10 = motionEvent.getX(i11) + f10;
                i10++;
                y10 = motionEvent.getY(i11) + y10;
                f10 = x10;
            }
        }
        if (i10 == 0) {
            return new pg.n<>(Float.valueOf(this.Y0), Float.valueOf(this.Z0));
        }
        float f11 = i10;
        return new pg.n<>(Float.valueOf(f10 / f11), Float.valueOf(y10 / f11));
    }

    public final boolean l0() {
        return this.R0 > 1.01f;
    }

    public final void m0() {
        ValueAnimator valueAnimator = this.f17747b1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U0.forceFinished(true);
        this.V0 = false;
        if (this.R0 == 1.0f && this.S0 == CropImageView.DEFAULT_ASPECT_RATIO && this.T0 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        this.R0 = 1.0f;
        this.S0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.T0 = CropImageView.DEFAULT_ASPECT_RATIO;
        invalidate();
        eh.a<pg.f0> aVar = this.P0;
        if (aVar != null) {
            aVar.invoke();
        }
        eh.a<pg.f0> aVar2 = this.Q0;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public final u1 n0() {
        int width = getWidth();
        int height = getHeight();
        float f10 = this.R0;
        float f11 = this.S0;
        float f12 = this.T0;
        return new u1((-f11) / f10, (-f12) / f10, (width - f11) / f10, (height - f12) / f10);
    }

    public final void o0(float f10, float f11, float f12) {
        float fL = jh.j.l(f10, 1.0f, 5.0f);
        this.S0 = jh.j.l(f11 - (((f11 - this.S0) / this.R0) * fL), (1.0f - fL) * getWidth(), CropImageView.DEFAULT_ASPECT_RATIO);
        this.T0 = jh.j.l(f12 - (((f12 - this.T0) / this.R0) * fL), (1.0f - fL) * getHeight(), CropImageView.DEFAULT_ASPECT_RATIO);
        this.R0 = fL;
        invalidate();
        eh.a<pg.f0> aVar = this.P0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.v, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f17747b1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.v, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        if (l0() || e10.getPointerCount() > 1) {
            return true;
        }
        return super.onInterceptTouchEvent(e10);
    }

    @Override // androidx.recyclerview.widget.v, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i12 != 0) {
            if (i10 == i12 && i11 == i13) {
                return;
            }
            m0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r13 != 6) goto L111;
     */
    @Override // androidx.recyclerview.widget.v, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent e10) {
        androidx.recyclerview.widget.o oVar;
        kotlin.jvm.internal.r.e(e10, "e");
        int actionMasked = e10.getActionMasked();
        OverScroller overScroller = this.U0;
        if (actionMasked == 0) {
            ValueAnimator valueAnimator = this.f17747b1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!overScroller.isFinished()) {
                overScroller.forceFinished(true);
            }
            this.V0 = false;
        }
        this.f17751f1.onTouchEvent(e10);
        boolean z10 = this.L0;
        ScaleGestureDetector scaleGestureDetector = this.f17750e1;
        if (z10) {
            scaleGestureDetector.onTouchEvent(e10);
        }
        if (!this.X0 && (l0() || scaleGestureDetector.isInProgress() || e10.getPointerCount() > 1)) {
            MotionEvent motionEventObtain = MotionEvent.obtain(e10);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            setScrollState(0);
            v.z zVar = this.f2670g0;
            androidx.recyclerview.widget.v.this.removeCallbacks(zVar);
            zVar.f2813c.abortAnimation();
            v.l lVar = this.f2682n;
            if (lVar != null && (oVar = lVar.f2744e) != null) {
                oVar.f();
            }
            this.X0 = true;
            VelocityTracker velocityTracker = this.W0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.W0 = VelocityTracker.obtain();
            pg.n<Float, Float> nVarK0 = k0(e10);
            this.Y0 = nVarK0.f21469a.floatValue();
            this.Z0 = nVarK0.f21470b.floatValue();
        }
        if (!this.X0) {
            return super.onTouchEvent(e10);
        }
        VelocityTracker velocityTracker2 = this.W0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(e10);
        }
        pg.n<Float, Float> nVarK02 = k0(e10);
        float fFloatValue = nVarK02.f21469a.floatValue();
        float fFloatValue2 = nVarK02.f21470b.floatValue();
        int actionMasked2 = e10.getActionMasked();
        if (actionMasked2 != 0) {
            if (actionMasked2 == 1) {
                VelocityTracker velocityTracker3 = this.W0;
                if (velocityTracker3 != null) {
                    velocityTracker3.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, this.f17749d1);
                }
                float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                float yVelocity = velocityTracker3 != null ? velocityTracker3.getYVelocity() : 0.0f;
                this.X0 = false;
                VelocityTracker velocityTracker4 = this.W0;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                }
                this.W0 = null;
                float fAbs = Math.abs(xVelocity);
                float f10 = this.f17748c1;
                if (fAbs >= f10 || Math.abs(yVelocity) >= f10) {
                    if (this.N0) {
                        if (this.M0) {
                            G(0, (int) ((-yVelocity) / this.R0));
                            yVelocity = 0.0f;
                        } else {
                            G((int) ((-xVelocity) / this.R0), 0);
                            xVelocity = 0.0f;
                        }
                    }
                    if (l0() && (xVelocity != CropImageView.DEFAULT_ASPECT_RATIO || yVelocity != CropImageView.DEFAULT_ASPECT_RATIO)) {
                        overScroller.fling((int) this.S0, (int) this.T0, (int) xVelocity, (int) yVelocity, (int) ((1.0f - this.R0) * getWidth()), 0, (int) ((1.0f - this.R0) * getHeight()), 0);
                        this.V0 = true;
                        postInvalidateOnAnimation();
                        return true;
                    }
                }
                eh.a<pg.f0> aVar = this.Q0;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else {
                if (actionMasked2 == 2) {
                    float f11 = fFloatValue - this.Y0;
                    float f12 = fFloatValue2 - this.Z0;
                    float fL = jh.j.l(this.S0 + f11, (1.0f - this.R0) * getWidth(), CropImageView.DEFAULT_ASPECT_RATIO);
                    float fL2 = jh.j.l(this.T0 + f12, (1.0f - this.R0) * getHeight(), CropImageView.DEFAULT_ASPECT_RATIO);
                    float f13 = f11 - (fL - this.S0);
                    float f14 = f12 - (fL2 - this.T0);
                    this.S0 = fL;
                    this.T0 = fL2;
                    if (this.N0) {
                        boolean z11 = this.M0;
                        if (z11) {
                            f13 = f14;
                        }
                        if (f13 != CropImageView.DEFAULT_ASPECT_RATIO) {
                            float f15 = ((-f13) / this.R0) + this.f17746a1;
                            this.f17746a1 = f15;
                            int i10 = (int) f15;
                            if (i10 != 0) {
                                this.f17746a1 = f15 - i10;
                                if (z11) {
                                    scrollBy(0, i10);
                                } else {
                                    scrollBy(i10, 0);
                                }
                            }
                        }
                    }
                    invalidate();
                    eh.a<pg.f0> aVar2 = this.P0;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    this.Y0 = fFloatValue;
                    this.Z0 = fFloatValue2;
                    return true;
                }
                if (actionMasked2 == 3) {
                    this.X0 = false;
                    VelocityTracker velocityTracker5 = this.W0;
                    if (velocityTracker5 != null) {
                        velocityTracker5.recycle();
                    }
                    this.W0 = null;
                    eh.a<pg.f0> aVar3 = this.Q0;
                    if (aVar3 != null) {
                        aVar3.invoke();
                        return true;
                    }
                } else if (actionMasked2 != 5) {
                }
            }
            return true;
        }
        this.Y0 = fFloatValue;
        this.Z0 = fFloatValue2;
        return true;
    }

    public final void setContinuous(boolean z10) {
        this.N0 = z10;
    }

    public final void setOnSingleTap(eh.a<pg.f0> aVar) {
        this.O0 = aVar;
    }

    public final void setOnTransformChanged(eh.a<pg.f0> aVar) {
        this.P0 = aVar;
    }

    public final void setOnTransformSettled(eh.a<pg.f0> aVar) {
        this.Q0 = aVar;
    }

    public final void setVertical(boolean z10) {
        this.M0 = z10;
    }

    public final void setZoomEnabled(boolean z10) {
        this.L0 = z10;
    }
}
