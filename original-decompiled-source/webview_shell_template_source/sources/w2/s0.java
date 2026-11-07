package w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import androidx.activity.ComponentActivity;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s0 extends RecyclerView {

    /* renamed from: c1, reason: collision with root package name */
    public boolean f14986c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f14987d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f14988e1;

    /* renamed from: f1, reason: collision with root package name */
    public p5.a<d5.j> f14989f1;

    /* renamed from: g1, reason: collision with root package name */
    public p5.a<d5.j> f14990g1;

    /* renamed from: h1, reason: collision with root package name */
    public p5.a<d5.j> f14991h1;

    /* renamed from: i1, reason: collision with root package name */
    public float f14992i1;

    /* renamed from: j1, reason: collision with root package name */
    public float f14993j1;

    /* renamed from: k1, reason: collision with root package name */
    public float f14994k1;

    /* renamed from: l1, reason: collision with root package name */
    public final OverScroller f14995l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f14996m1;

    /* renamed from: n1, reason: collision with root package name */
    public VelocityTracker f14997n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f14998o1;

    /* renamed from: p1, reason: collision with root package name */
    public float f14999p1;

    /* renamed from: q1, reason: collision with root package name */
    public float f15000q1;

    /* renamed from: r1, reason: collision with root package name */
    public float f15001r1;

    /* renamed from: s1, reason: collision with root package name */
    public ValueAnimator f15002s1;

    /* renamed from: t1, reason: collision with root package name */
    public final int f15003t1;
    public final float u1;

    /* renamed from: v1, reason: collision with root package name */
    public final ScaleGestureDetector f15004v1;

    /* renamed from: w1, reason: collision with root package name */
    public final GestureDetector f15005w1;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.j.e("animation", animator);
            s0 s0Var = s0.this;
            if (s0Var.f15002s1 == animator) {
                s0Var.f15002s1 = null;
            }
            p5.a<d5.j> onTransformSettled = s0Var.getOnTransformSettled();
            if (onTransformSettled != null) {
                onTransformSettled.a();
            }
        }
    }

    public s0(ComponentActivity componentActivity) {
        super(componentActivity, null);
        this.f14986c1 = true;
        this.f14987d1 = true;
        this.f14988e1 = true;
        this.f14992i1 = 1.0f;
        this.f14995l1 = new OverScroller(componentActivity);
        this.f15003t1 = ViewConfiguration.get(componentActivity).getScaledMinimumFlingVelocity();
        this.u1 = ViewConfiguration.get(componentActivity).getScaledMaximumFlingVelocity();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(componentActivity, new u0(this));
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f15004v1 = scaleGestureDetector;
        this.f15005w1 = new GestureDetector(componentActivity, new t0(this));
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f14996m1) {
            OverScroller overScroller = this.f14995l1;
            if (!overScroller.computeScrollOffset()) {
                this.f14996m1 = false;
                p5.a<d5.j> aVar = this.f14991h1;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            this.f14993j1 = u5.d.o(overScroller.getCurrX(), (1.0f - this.f14992i1) * getWidth(), 0.0f);
            this.f14994k1 = u5.d.o(overScroller.getCurrY(), (1.0f - this.f14992i1) * getHeight(), 0.0f);
            p5.a<d5.j> aVar2 = this.f14990g1;
            if (aVar2 != null) {
                aVar2.a();
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.j.e("canvas", canvas);
        if (this.f14992i1 == 1.0f && this.f14993j1 == 0.0f && this.f14994k1 == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f14993j1, this.f14994k1);
        float f6 = this.f14992i1;
        canvas.scale(f6, f6);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final boolean getContinuous() {
        return this.f14988e1;
    }

    public final p5.a<d5.j> getOnSingleTap() {
        return this.f14989f1;
    }

    public final p5.a<d5.j> getOnTransformChanged() {
        return this.f14990g1;
    }

    public final p5.a<d5.j> getOnTransformSettled() {
        return this.f14991h1;
    }

    public final float getPanX() {
        return this.f14993j1;
    }

    public final float getPanY() {
        return this.f14994k1;
    }

    public final boolean getVertical() {
        return this.f14987d1;
    }

    public final float getZoom() {
        return this.f14992i1;
    }

    public final boolean getZoomEnabled() {
        return this.f14986c1;
    }

    public final void m0(final float f6, final float f7, final float f8) {
        ValueAnimator valueAnimator = this.f15002s1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f9 = this.f14992i1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: w2.r0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                kotlin.jvm.internal.j.e("it", valueAnimator2);
                float f10 = f6;
                float f11 = f9;
                this.f14980a.s0((valueAnimator2.getAnimatedFraction() * (f10 - f11)) + f11, f7, f8);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        valueAnimatorOfFloat.start();
        this.f15002s1 = valueAnimatorOfFloat;
    }

    public final d5.c<Float, Float> o0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f6 = 0.0f;
        float y2 = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < pointerCount; i7++) {
            if (i7 != actionIndex) {
                float x6 = motionEvent.getX(i7) + f6;
                i6++;
                y2 = motionEvent.getY(i7) + y2;
                f6 = x6;
            }
        }
        if (i6 == 0) {
            return new d5.c<>(Float.valueOf(this.f14999p1), Float.valueOf(this.f15000q1));
        }
        float f7 = i6;
        return new d5.c<>(Float.valueOf(f6 / f7), Float.valueOf(y2 / f7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f15002s1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.j.e("e", motionEvent);
        if (p0() || motionEvent.getPointerCount() > 1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        if (i8 != 0) {
            if (i6 == i8 && i7 == i9) {
                return;
            }
            q0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r13 != 6) goto L111;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.recyclerview.widget.o oVar;
        kotlin.jvm.internal.j.e("e", motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        OverScroller overScroller = this.f14995l1;
        if (actionMasked == 0) {
            ValueAnimator valueAnimator = this.f15002s1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!overScroller.isFinished()) {
                overScroller.forceFinished(true);
            }
            this.f14996m1 = false;
        }
        this.f15005w1.onTouchEvent(motionEvent);
        boolean z6 = this.f14986c1;
        ScaleGestureDetector scaleGestureDetector = this.f15004v1;
        if (z6) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.f14998o1 && (p0() || scaleGestureDetector.isInProgress() || motionEvent.getPointerCount() > 1)) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            setScrollState(0);
            RecyclerView.a0 a0Var = this.f1427w0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f1435u.abortAnimation();
            RecyclerView.m mVar = this.F;
            if (mVar != null && (oVar = mVar.f1476e) != null) {
                oVar.f();
            }
            this.f14998o1 = true;
            VelocityTracker velocityTracker = this.f14997n1;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f14997n1 = VelocityTracker.obtain();
            d5.c<Float, Float> cVarO0 = o0(motionEvent);
            this.f14999p1 = cVarO0.s.floatValue();
            this.f15000q1 = cVarO0.f12739t.floatValue();
        }
        if (!this.f14998o1) {
            return super.onTouchEvent(motionEvent);
        }
        VelocityTracker velocityTracker2 = this.f14997n1;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        d5.c<Float, Float> cVarO02 = o0(motionEvent);
        float fFloatValue = cVarO02.s.floatValue();
        float fFloatValue2 = cVarO02.f12739t.floatValue();
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 0) {
            if (actionMasked2 == 1) {
                VelocityTracker velocityTracker3 = this.f14997n1;
                if (velocityTracker3 != null) {
                    velocityTracker3.computeCurrentVelocity(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, this.u1);
                }
                float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                float yVelocity = velocityTracker3 != null ? velocityTracker3.getYVelocity() : 0.0f;
                this.f14998o1 = false;
                VelocityTracker velocityTracker4 = this.f14997n1;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                }
                this.f14997n1 = null;
                float fAbs = Math.abs(xVelocity);
                float f6 = this.f15003t1;
                if (fAbs >= f6 || Math.abs(yVelocity) >= f6) {
                    if (this.f14988e1) {
                        if (this.f14987d1) {
                            I(0, (int) ((-yVelocity) / this.f14992i1));
                            yVelocity = 0.0f;
                        } else {
                            I((int) ((-xVelocity) / this.f14992i1), 0);
                            xVelocity = 0.0f;
                        }
                    }
                    if (p0() && (xVelocity != 0.0f || yVelocity != 0.0f)) {
                        overScroller.fling((int) this.f14993j1, (int) this.f14994k1, (int) xVelocity, (int) yVelocity, (int) ((1.0f - this.f14992i1) * getWidth()), 0, (int) ((1.0f - this.f14992i1) * getHeight()), 0);
                        this.f14996m1 = true;
                        postInvalidateOnAnimation();
                        return true;
                    }
                }
                p5.a<d5.j> aVar = this.f14991h1;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                if (actionMasked2 == 2) {
                    float f7 = fFloatValue - this.f14999p1;
                    float f8 = fFloatValue2 - this.f15000q1;
                    float fO = u5.d.o(this.f14993j1 + f7, (1.0f - this.f14992i1) * getWidth(), 0.0f);
                    float fO2 = u5.d.o(this.f14994k1 + f8, (1.0f - this.f14992i1) * getHeight(), 0.0f);
                    float f9 = f7 - (fO - this.f14993j1);
                    float f10 = f8 - (fO2 - this.f14994k1);
                    this.f14993j1 = fO;
                    this.f14994k1 = fO2;
                    if (this.f14988e1) {
                        boolean z7 = this.f14987d1;
                        if (z7) {
                            f9 = f10;
                        }
                        if (f9 != 0.0f) {
                            float f11 = ((-f9) / this.f14992i1) + this.f15001r1;
                            this.f15001r1 = f11;
                            int i6 = (int) f11;
                            if (i6 != 0) {
                                this.f15001r1 = f11 - i6;
                                if (z7) {
                                    scrollBy(0, i6);
                                } else {
                                    scrollBy(i6, 0);
                                }
                            }
                        }
                    }
                    invalidate();
                    p5.a<d5.j> aVar2 = this.f14990g1;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    this.f14999p1 = fFloatValue;
                    this.f15000q1 = fFloatValue2;
                    return true;
                }
                if (actionMasked2 == 3) {
                    this.f14998o1 = false;
                    VelocityTracker velocityTracker5 = this.f14997n1;
                    if (velocityTracker5 != null) {
                        velocityTracker5.recycle();
                    }
                    this.f14997n1 = null;
                    p5.a<d5.j> aVar3 = this.f14991h1;
                    if (aVar3 != null) {
                        aVar3.a();
                        return true;
                    }
                } else if (actionMasked2 != 5) {
                }
            }
            return true;
        }
        this.f14999p1 = fFloatValue;
        this.f15000q1 = fFloatValue2;
        return true;
    }

    public final boolean p0() {
        return this.f14992i1 > 1.01f;
    }

    public final void q0() {
        ValueAnimator valueAnimator = this.f15002s1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f14995l1.forceFinished(true);
        this.f14996m1 = false;
        if (this.f14992i1 == 1.0f && this.f14993j1 == 0.0f && this.f14994k1 == 0.0f) {
            return;
        }
        this.f14992i1 = 1.0f;
        this.f14993j1 = 0.0f;
        this.f14994k1 = 0.0f;
        invalidate();
        p5.a<d5.j> aVar = this.f14990g1;
        if (aVar != null) {
            aVar.a();
        }
        p5.a<d5.j> aVar2 = this.f14991h1;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    public final m0 r0() {
        int width = getWidth();
        int height = getHeight();
        float f6 = this.f14992i1;
        float f7 = this.f14993j1;
        float f8 = this.f14994k1;
        return new m0((-f7) / f6, (-f8) / f6, (width - f7) / f6, (height - f8) / f6);
    }

    public final void s0(float f6, float f7, float f8) {
        float fO = u5.d.o(f6, 1.0f, 5.0f);
        this.f14993j1 = u5.d.o(f7 - (((f7 - this.f14993j1) / this.f14992i1) * fO), (1.0f - fO) * getWidth(), 0.0f);
        this.f14994k1 = u5.d.o(f8 - (((f8 - this.f14994k1) / this.f14992i1) * fO), (1.0f - fO) * getHeight(), 0.0f);
        this.f14992i1 = fO;
        invalidate();
        p5.a<d5.j> aVar = this.f14990g1;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void setContinuous(boolean z6) {
        this.f14988e1 = z6;
    }

    public final void setOnSingleTap(p5.a<d5.j> aVar) {
        this.f14989f1 = aVar;
    }

    public final void setOnTransformChanged(p5.a<d5.j> aVar) {
        this.f14990g1 = aVar;
    }

    public final void setOnTransformSettled(p5.a<d5.j> aVar) {
        this.f14991h1 = aVar;
    }

    public final void setVertical(boolean z6) {
        this.f14987d1 = z6;
    }

    public final void setZoomEnabled(boolean z6) {
        this.f14986c1 = z6;
    }
}
