package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import java.util.WeakHashMap;
import u0.f0;
import u0.m;
import u0.n;
import u0.n0;
import u0.o;
import u0.p;
import u0.q;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements p, o, m {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
    static final int CIRCLE_DIAMETER = 40;
    static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = {R.attr.enabled};
    private static final String LOG_TAG = "SwipeRefreshLayout";
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private OnChildScrollUpCallback mChildScrollUpCallback;
    private int mCircleDiameter;
    CircleImageView mCircleView;
    private int mCircleViewIndex;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    private final DecelerateInterpolator mDecelerateInterpolator;
    private boolean mEnableLegacyRequestDisallowInterceptTouch;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final n mNestedScrollingChildHelper;
    private final q mNestedScrollingParentHelper;
    private final int[] mNestedScrollingV2ConsumedCompat;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    CircularProgressDrawable mProgress;
    private Animation.AnimationListener mRefreshListener;
    boolean mRefreshing;
    private boolean mReturningToStart;
    boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    boolean mUsingCustomStart;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnRefreshListener {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void animateOffsetToCorrectPosition(int i6, Animation.AnimationListener animationListener) {
        this.mFrom = i6;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200L);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i6, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i6, animationListener);
            return;
        }
        this.mFrom = i6;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200L);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    private void createProgressView() {
        this.mCircleView = new CircleImageView(getContext());
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.mProgress = circularProgressDrawable;
        circularProgressDrawable.setStyle(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    private void ensureTarget() {
        if (this.mTarget == null) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    private void finishSpinner(float f6) {
        if (f6 > this.mTotalDragDistance) {
            setRefreshing(true, true);
            return;
        }
        this.mRefreshing = false;
        this.mProgress.setStartEndTrim(0.0f, 0.0f);
        animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, !this.mScale ? new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (swipeRefreshLayout.mScale) {
                    return;
                }
                swipeRefreshLayout.startScaleDownAnimation(null);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        } : null);
        this.mProgress.setArrowEnabled(false);
    }

    private boolean isAnimationRunning(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void moveSpinner(float f6) {
        this.mProgress.setArrowEnabled(true);
        float fMin = Math.min(1.0f, Math.abs(f6 / this.mTotalDragDistance));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f6) - this.mTotalDragDistance;
        int i6 = this.mCustomSlingshotDistance;
        if (i6 <= 0) {
            i6 = this.mUsingCustomStart ? this.mSpinnerOffsetEnd - this.mOriginalOffsetTop : this.mSpinnerOffsetEnd;
        }
        float f7 = i6;
        double dMax = Math.max(0.0f, Math.min(fAbs, f7 * DECELERATE_INTERPOLATION_FACTOR) / f7) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * DECELERATE_INTERPOLATION_FACTOR;
        int i7 = this.mOriginalOffsetTop + ((int) ((f7 * fMin) + (f7 * fPow * DECELERATE_INTERPOLATION_FACTOR)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f6 / this.mTotalDragDistance));
        }
        if (f6 < this.mTotalDragDistance) {
            if (this.mProgress.getAlpha() > STARTING_PROGRESS_ALPHA && !isAnimationRunning(this.mAlphaStartAnimation)) {
                startProgressAlphaStartAnimation();
            }
        } else if (this.mProgress.getAlpha() < MAX_ALPHA && !isAnimationRunning(this.mAlphaMaxAnimation)) {
            startProgressAlphaMaxAnimation();
        }
        this.mProgress.setStartEndTrim(0.0f, Math.min(MAX_PROGRESS_ANGLE, fMax * MAX_PROGRESS_ANGLE));
        this.mProgress.setArrowScale(Math.min(1.0f, fMax));
        this.mProgress.setProgressRotation(((fPow * DECELERATE_INTERPOLATION_FACTOR) + ((fMax * 0.4f) - 0.25f)) * DRAG_RATE);
        setTargetOffsetTopAndBottom(i7 - this.mCurrentTargetOffsetTop);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i6) {
        this.mCircleView.getBackground().setAlpha(i6);
        this.mProgress.setAlpha(i6);
    }

    private Animation startAlphaAnimation(final int i6, final int i7) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f6, Transformation transformation) {
                SwipeRefreshLayout.this.mProgress.setAlpha((int) (((i7 - r0) * f6) + i6));
            }
        };
        animation.setDuration(300L);
        this.mCircleView.setAnimationListener(null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(animation);
        return animation;
    }

    private void startDragging(float f6) {
        float f7 = this.mInitialDownY;
        float f8 = f6 - f7;
        int i6 = this.mTouchSlop;
        if (f8 <= i6 || this.mIsBeingDragged) {
            return;
        }
        this.mInitialMotionY = f7 + i6;
        this.mIsBeingDragged = true;
        this.mProgress.setAlpha(STARTING_PROGRESS_ALPHA);
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), MAX_ALPHA);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), STARTING_PROGRESS_ALPHA);
    }

    private void startScaleDownReturnToStartAnimation(int i6, Animation.AnimationListener animationListener) {
        this.mFrom = i6;
        this.mStartingScale = this.mCircleView.getScaleX();
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.8
            @Override // android.view.animation.Animation
            public void applyTransformation(float f6, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                float f7 = swipeRefreshLayout.mStartingScale;
                swipeRefreshLayout.setAnimationProgress(((-f7) * f6) + f7);
                SwipeRefreshLayout.this.moveToStart(f6);
            }
        };
        this.mScaleDownToStartAnimation = animation;
        animation.setDuration(150L);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }

    private void startScaleUpAnimation(Animation.AnimationListener animationListener) {
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(MAX_ALPHA);
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f6, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f6);
            }
        };
        this.mScaleAnimation = animation;
        animation.setDuration(this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public boolean canChildScrollUp() {
        OnChildScrollUpCallback onChildScrollUpCallback = this.mChildScrollUpCallback;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.canChildScrollUp(this, this.mTarget);
        }
        View view = this.mTarget;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f7, boolean z6) {
        return this.mNestedScrollingChildHelper.a(f6, f7, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return this.mNestedScrollingChildHelper.b(f6, f7);
    }

    public boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        return i8 == 0 && dispatchNestedPreScroll(i6, i7, iArr, iArr2);
    }

    public void dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        if (i10 == 0) {
            this.mNestedScrollingChildHelper.d(i6, i7, i8, i9, iArr, i10, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i6, int i7) {
        int i8 = this.mCircleViewIndex;
        return i8 < 0 ? i7 : i7 == i6 + (-1) ? i8 : i7 >= i8 ? i7 + 1 : i7;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        q qVar = this.mNestedScrollingParentHelper;
        return qVar.f14523b | qVar.f14522a;
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    public boolean hasNestedScrollingParent(int i6) {
        return i6 == 0 && hasNestedScrollingParent();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.f14519d;
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    public void moveToStart(float f6) {
        setTargetOffsetTopAndBottom((this.mFrom + ((int) ((this.mOriginalOffsetTop - r0) * f6))) - this.mCircleView.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ensureTarget();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.mInitialDownY = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else if (actionMasked == 2) {
            int i6 = this.mActivePointerId;
            if (i6 == -1) {
                Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i6);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            startDragging(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                onSecondaryPointerUp(motionEvent);
            }
        }
        return this.mIsBeingDragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.mCircleView.getMeasuredWidth();
        int measuredHeight2 = this.mCircleView.getMeasuredHeight();
        int i10 = measuredWidth / 2;
        int i11 = measuredWidth2 / 2;
        int i12 = this.mCurrentTargetOffsetTop;
        this.mCircleView.layout(i10 - i11, i12, i10 + i11, measuredHeight2 + i12);
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
        this.mCircleViewIndex = -1;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) == this.mCircleView) {
                this.mCircleViewIndex = i8;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        return dispatchNestedFling(f6, f7, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f6, float f7) {
        return dispatchNestedPreFling(f6, f7);
    }

    @Override // u0.o
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr, int i8) {
        if (i8 == 0) {
            onNestedPreScroll(view, i6, i7, iArr);
        }
    }

    @Override // u0.p
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        if (i10 != 0) {
            return;
        }
        int i11 = iArr[1];
        dispatchNestedScroll(i6, i7, i8, i9, this.mParentOffsetInWindow, i10, iArr);
        int i12 = i9 - (iArr[1] - i11);
        if ((i12 == 0 ? i9 + this.mParentOffsetInWindow[1] : i12) >= 0 || canChildScrollUp()) {
            return;
        }
        float fAbs = this.mTotalUnconsumed + Math.abs(r14);
        this.mTotalUnconsumed = fAbs;
        moveSpinner(fAbs);
        iArr[1] = iArr[1] + i12;
    }

    @Override // u0.o
    public void onNestedScrollAccepted(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            onNestedScrollAccepted(view, view2, i6);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.mRefreshing);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.mRefreshing);
    }

    @Override // u0.o
    public boolean onStartNestedScroll(View view, View view2, int i6, int i7) {
        if (i7 == 0) {
            return onStartNestedScroll(view, view2, i6);
        }
        return false;
    }

    @Override // u0.o
    public void onStopNestedScroll(View view, int i6) {
        if (i6 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsBeingDragged = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.mIsBeingDragged) {
                    float y2 = (motionEvent.getY(iFindPointerIndex) - this.mInitialMotionY) * DRAG_RATE;
                    this.mIsBeingDragged = false;
                    finishSpinner(y2);
                }
                this.mActivePointerId = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex2 < 0) {
                    Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y6 = motionEvent.getY(iFindPointerIndex2);
                startDragging(y6);
                if (this.mIsBeingDragged) {
                    float f6 = (y6 - this.mInitialMotionY) * DRAG_RATE;
                    if (f6 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    moveSpinner(f6);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    onSecondaryPointerUp(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        ViewParent parent;
        View view = this.mTarget;
        if (view != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            if (!f0.d.g(view)) {
                if (this.mEnableLegacyRequestDisallowInterceptTouch || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z6);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(MAX_ALPHA);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public void setAnimationProgress(float f6) {
        this.mCircleView.setScaleX(f6);
        this.mCircleView.setScaleY(f6);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        ensureTarget();
        this.mProgress.setColorSchemeColors(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            iArr2[i6] = context.getColor(iArr[i6]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i6) {
        this.mTotalDragDistance = i6;
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        if (z6) {
            return;
        }
        reset();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z6) {
        this.mEnableLegacyRequestDisallowInterceptTouch = z6;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        n nVar = this.mNestedScrollingChildHelper;
        if (nVar.f14519d) {
            ViewGroup viewGroup = nVar.f14518c;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            f0.d.l(viewGroup);
        }
        nVar.f14519d = z6;
    }

    public void setOnChildScrollUpCallback(OnChildScrollUpCallback onChildScrollUpCallback) {
        this.mChildScrollUpCallback = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.mListener = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i6) {
        setProgressBackgroundColorSchemeResource(i6);
    }

    public void setProgressBackgroundColorSchemeColor(int i6) {
        this.mCircleView.setBackgroundColor(i6);
    }

    public void setProgressBackgroundColorSchemeResource(int i6) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i6));
    }

    public void setProgressViewEndTarget(boolean z6, int i6) {
        this.mSpinnerOffsetEnd = i6;
        this.mScale = z6;
        this.mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean z6, int i6, int i7) {
        this.mScale = z6;
        this.mOriginalOffsetTop = i6;
        this.mSpinnerOffsetEnd = i7;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public void setRefreshing(boolean z6) {
        if (!z6 || this.mRefreshing == z6) {
            setRefreshing(z6, false);
            return;
        }
        this.mRefreshing = z6;
        setTargetOffsetTopAndBottom((!this.mUsingCustomStart ? this.mSpinnerOffsetEnd + this.mOriginalOffsetTop : this.mSpinnerOffsetEnd) - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        startScaleUpAnimation(this.mRefreshListener);
    }

    public void setSize(int i6) {
        if (i6 == 0 || i6 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i6 == 0) {
                this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
            } else {
                this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.setStyle(i6);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public void setSlingshotDistance(int i6) {
        this.mCustomSlingshotDistance = i6;
    }

    public void setTargetOffsetTopAndBottom(int i6) {
        this.mCircleView.bringToFront();
        CircleImageView circleImageView = this.mCircleView;
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        circleImageView.offsetTopAndBottom(i6);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public boolean startNestedScroll(int i6, int i7) {
        return i7 == 0 && startNestedScroll(i6);
    }

    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f6, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f6);
            }
        };
        this.mScaleDownAnimation = animation;
        animation.setDuration(150L);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    public void stopNestedScroll(int i6) {
        if (i6 == 0) {
            stopNestedScroll();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i6) {
                return new SavedState[i6];
            }
        };
        final boolean mRefreshing;

        public SavedState(Parcelable parcelable, boolean z6) {
            super(parcelable);
            this.mRefreshing = z6;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeByte(this.mRefreshing ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mRefreshing = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                OnRefreshListener onRefreshListener;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (!swipeRefreshLayout.mRefreshing) {
                    swipeRefreshLayout.reset();
                    return;
                }
                swipeRefreshLayout.mProgress.setAlpha(SwipeRefreshLayout.MAX_ALPHA);
                SwipeRefreshLayout.this.mProgress.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.mNotify && (onRefreshListener = swipeRefreshLayout2.mListener) != null) {
                    onRefreshListener.onRefresh();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.mCurrentTargetOffsetTop = swipeRefreshLayout3.mCircleView.getTop();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.mAnimateToCorrectPosition = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f6, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                int iAbs = !swipeRefreshLayout.mUsingCustomStart ? swipeRefreshLayout.mSpinnerOffsetEnd - Math.abs(swipeRefreshLayout.mOriginalOffsetTop) : swipeRefreshLayout.mSpinnerOffsetEnd;
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.mFrom + ((int) ((iAbs - r1) * f6))) - swipeRefreshLayout2.mCircleView.getTop());
                SwipeRefreshLayout.this.mProgress.setArrowScale(1.0f - f6);
            }
        };
        this.mAnimateToStartPosition = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f6, Transformation transformation) {
                SwipeRefreshLayout.this.moveToStart(f6);
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(DECELERATE_INTERPOLATION_FACTOR);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        setChildrenDrawingOrderEnabled(true);
        int i6 = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i6;
        this.mTotalDragDistance = i6;
        this.mNestedScrollingParentHelper = new q();
        this.mNestedScrollingChildHelper = new n(this);
        setNestedScrollingEnabled(true);
        int i7 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i7;
        this.mOriginalOffsetTop = i7;
        moveToStart(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.c(i6, i7, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.f(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        if (i7 > 0) {
            float f6 = this.mTotalUnconsumed;
            if (f6 > 0.0f) {
                float f7 = i7;
                if (f7 > f6) {
                    iArr[1] = (int) f6;
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f6 - f7;
                    iArr[1] = i7;
                }
                moveSpinner(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i7 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i7 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i6 - iArr[0], i7 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i6) {
        this.mNestedScrollingParentHelper.f14522a = i6;
        startNestedScroll(i6 & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i6) {
        return (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i6 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.f14522a = 0;
        this.mNestedScrollInProgress = false;
        float f6 = this.mTotalUnconsumed;
        if (f6 > 0.0f) {
            finishSpinner(f6);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i6) {
        return this.mNestedScrollingChildHelper.g(i6, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.h(0);
    }

    public boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr, int i10) {
        return i10 == 0 && this.mNestedScrollingChildHelper.d(i6, i7, i8, i9, iArr, i10, null);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.mNestedScrollingChildHelper.d(i6, i7, i8, i9, iArr, 0, null);
    }

    @Override // u0.o
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10) {
        onNestedScroll(view, i6, i7, i8, i9, i10, this.mNestedScrollingV2ConsumedCompat);
    }

    private void setRefreshing(boolean z6, boolean z7) {
        if (this.mRefreshing != z6) {
            this.mNotify = z7;
            ensureTarget();
            this.mRefreshing = z6;
            if (z6) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            } else {
                startScaleDownAnimation(this.mRefreshListener);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        onNestedScroll(view, i6, i7, i8, i9, 0, this.mNestedScrollingV2ConsumedCompat);
    }
}
