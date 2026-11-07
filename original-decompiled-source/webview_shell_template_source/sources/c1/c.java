package c1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: w, reason: collision with root package name */
    public static final a f2138w = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f2139a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2140b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2142d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f2143e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f2144f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f2145g;
    public int[] h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2146i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2147j;

    /* renamed from: k, reason: collision with root package name */
    public int f2148k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2149l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2150m;

    /* renamed from: n, reason: collision with root package name */
    public final float f2151n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2152o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f2153p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0028c f2154q;

    /* renamed from: r, reason: collision with root package name */
    public View f2155r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f2156t;

    /* renamed from: u, reason: collision with root package name */
    public a f2157u;

    /* renamed from: c, reason: collision with root package name */
    public int f2141c = -1;

    /* renamed from: v, reason: collision with root package name */
    public final b f2158v = new b();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.m(0);
        }
    }

    public c(Context context, CoordinatorLayout coordinatorLayout, AbstractC0028c abstractC0028c) {
        if (abstractC0028c == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.f2156t = coordinatorLayout;
        this.f2154q = abstractC0028c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2152o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2140b = viewConfiguration.getScaledTouchSlop();
        this.f2150m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2151n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2157u = f2138w;
        this.f2153p = new OverScroller(context, new d(this));
    }

    public final void a() {
        this.f2141c = -1;
        float[] fArr = this.f2142d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2143e, 0.0f);
            Arrays.fill(this.f2144f, 0.0f);
            Arrays.fill(this.f2145g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.f2146i, 0);
            Arrays.fill(this.f2147j, 0);
            this.f2148k = 0;
        }
        VelocityTracker velocityTracker = this.f2149l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2149l = null;
        }
    }

    public final void b(View view, int i6) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f2156t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f2155r = view;
        this.f2141c = i6;
        this.f2154q.e(view, i6);
        m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f6, float f7) {
        if (view != null) {
            AbstractC0028c abstractC0028c = this.f2154q;
            boolean z6 = abstractC0028c.c(view) > 0;
            boolean z7 = abstractC0028c.d() > 0;
            if (z6 && z7) {
                float f8 = (f7 * f7) + (f6 * f6);
                int i6 = this.f2140b;
                if (f8 > i6 * i6) {
                }
            } else if (!z6 ? !(!z7 || Math.abs(f7) <= this.f2140b) : Math.abs(f6) > this.f2140b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i6) {
        float[] fArr = this.f2142d;
        if (fArr != null) {
            int i7 = this.f2148k;
            int i8 = 1 << i6;
            if ((i7 & i8) != 0) {
                fArr[i6] = 0.0f;
                this.f2143e[i6] = 0.0f;
                this.f2144f[i6] = 0.0f;
                this.f2145g[i6] = 0.0f;
                this.h[i6] = 0;
                this.f2146i[i6] = 0;
                this.f2147j[i6] = 0;
                this.f2148k = (~i8) & i7;
            }
        }
    }

    public final int e(int i6, int i7, int i8) {
        if (i6 == 0) {
            return 0;
        }
        float width = this.f2156t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i6) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i7);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / i8) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f2139a == 2) {
            OverScroller overScroller = this.f2153p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f2155r.getLeft();
            int top = currY - this.f2155r.getTop();
            if (left != 0) {
                View view = this.f2155r;
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2155r;
                WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f2154q.g(this.f2155r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f2156t.post(this.f2158v);
            }
        }
        return this.f2139a == 2;
    }

    public final View g(int i6, int i7) {
        CoordinatorLayout coordinatorLayout = this.f2156t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f2154q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && i7 >= childAt.getTop() && i7 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i6, int i7, int i8, int i9) {
        float f6;
        float f7;
        float f8;
        float f9;
        int left = this.f2155r.getLeft();
        int top = this.f2155r.getTop();
        int i10 = i6 - left;
        int i11 = i7 - top;
        OverScroller overScroller = this.f2153p;
        if (i10 == 0 && i11 == 0) {
            overScroller.abortAnimation();
            m(0);
            return false;
        }
        View view = this.f2155r;
        int i12 = (int) this.f2151n;
        int i13 = (int) this.f2150m;
        int iAbs = Math.abs(i8);
        if (iAbs < i12) {
            i8 = 0;
        } else if (iAbs > i13) {
            i8 = i8 > 0 ? i13 : -i13;
        }
        int iAbs2 = Math.abs(i9);
        if (iAbs2 < i12) {
            i9 = 0;
        } else if (iAbs2 > i13) {
            i9 = i9 > 0 ? i13 : -i13;
        }
        int iAbs3 = Math.abs(i10);
        int iAbs4 = Math.abs(i11);
        int iAbs5 = Math.abs(i8);
        int iAbs6 = Math.abs(i9);
        int i14 = iAbs5 + iAbs6;
        int i15 = iAbs3 + iAbs4;
        if (i8 != 0) {
            f6 = iAbs5;
            f7 = i14;
        } else {
            f6 = iAbs3;
            f7 = i15;
        }
        float f10 = f6 / f7;
        if (i9 != 0) {
            f8 = iAbs6;
            f9 = i14;
        } else {
            f8 = iAbs4;
            f9 = i15;
        }
        float f11 = f8 / f9;
        AbstractC0028c abstractC0028c = this.f2154q;
        this.f2157u = f2138w;
        overScroller.startScroll(left, top, i10, i11, (int) ((e(i11, i9, abstractC0028c.d()) * f11) + (e(i10, i8, abstractC0028c.c(view)) * f10)));
        m(2);
        return true;
    }

    public final void i(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2149l == null) {
            this.f2149l = VelocityTracker.obtain();
        }
        this.f2149l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x6, (int) y2);
            k(x6, y2, pointerId);
            p(viewG, pointerId);
            int i7 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f2139a == 1) {
                j();
            }
            a();
            return;
        }
        AbstractC0028c abstractC0028c = this.f2154q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f2139a == 1) {
                    this.s = true;
                    abstractC0028c.h(this.f2155r, 0.0f, 0.0f);
                    this.s = false;
                    if (this.f2139a == 1) {
                        m(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x7 = motionEvent.getX(actionIndex);
                float y6 = motionEvent.getY(actionIndex);
                k(x7, y6, pointerId2);
                if (this.f2139a == 0) {
                    p(g((int) x7, (int) y6), pointerId2);
                    int i8 = this.h[pointerId2];
                    return;
                }
                int i9 = (int) x7;
                int i10 = (int) y6;
                View view = this.f2155r;
                if (view != null && i9 >= view.getLeft() && i9 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom()) {
                    i = 1;
                }
                if (i != 0) {
                    p(this.f2155r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f2139a == 1 && pointerId3 == this.f2141c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        i6 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.f2141c) {
                        View viewG2 = g((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.f2155r;
                        if (viewG2 == view2 && p(view2, pointerId4)) {
                            i6 = this.f2141c;
                            break;
                        }
                    }
                    i++;
                }
                if (i6 == -1) {
                    j();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f2139a == 1) {
            int i11 = this.f2141c;
            if (((this.f2148k & (1 << i11)) != 0 ? 1 : 0) == 0 || (iFindPointerIndex = motionEvent.findPointerIndex(i11)) == -1) {
                return;
            }
            float x8 = motionEvent.getX(iFindPointerIndex);
            float y7 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f2144f;
            int i12 = this.f2141c;
            int i13 = (int) (x8 - fArr[i12]);
            int i14 = (int) (y7 - this.f2145g[i12]);
            int left = this.f2155r.getLeft() + i13;
            int top = this.f2155r.getTop() + i14;
            int left2 = this.f2155r.getLeft();
            int top2 = this.f2155r.getTop();
            if (i13 != 0) {
                left = abstractC0028c.a(this.f2155r, left);
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                this.f2155r.offsetLeftAndRight(left - left2);
            }
            if (i14 != 0) {
                top = abstractC0028c.b(this.f2155r, top);
                WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                this.f2155r.offsetTopAndBottom(top - top2);
            }
            if (i13 != 0 || i14 != 0) {
                abstractC0028c.g(this.f2155r, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i15 = 0; i15 < pointerCount2; i15++) {
                int pointerId5 = motionEvent.getPointerId(i15);
                if ((this.f2148k & (1 << pointerId5)) != 0) {
                    float x9 = motionEvent.getX(i15);
                    float y8 = motionEvent.getY(i15);
                    float f6 = x9 - this.f2142d[pointerId5];
                    float f7 = y8 - this.f2143e[pointerId5];
                    Math.abs(f6);
                    Math.abs(f7);
                    int i16 = this.h[pointerId5];
                    Math.abs(f7);
                    Math.abs(f6);
                    int i17 = this.h[pointerId5];
                    Math.abs(f6);
                    Math.abs(f7);
                    int i18 = this.h[pointerId5];
                    Math.abs(f7);
                    Math.abs(f6);
                    int i19 = this.h[pointerId5];
                    if (this.f2139a == 1) {
                        break;
                    }
                    View viewG3 = g((int) x9, (int) y8);
                    if (c(viewG3, f6, f7) && p(viewG3, pointerId5)) {
                        break;
                    }
                }
            }
        }
        l(motionEvent);
    }

    public final void j() {
        VelocityTracker velocityTracker = this.f2149l;
        float f6 = this.f2150m;
        velocityTracker.computeCurrentVelocity(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, f6);
        float xVelocity = this.f2149l.getXVelocity(this.f2141c);
        float fAbs = Math.abs(xVelocity);
        float f7 = this.f2151n;
        if (fAbs < f7) {
            xVelocity = 0.0f;
        } else if (fAbs > f6) {
            xVelocity = xVelocity > 0.0f ? f6 : -f6;
        }
        float yVelocity = this.f2149l.getYVelocity(this.f2141c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f7) {
            f6 = 0.0f;
        } else if (fAbs2 <= f6) {
            f6 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f6 = -f6;
        }
        this.s = true;
        this.f2154q.h(this.f2155r, xVelocity, f6);
        this.s = false;
        if (this.f2139a == 1) {
            m(0);
        }
    }

    public final void k(float f6, float f7, int i6) {
        float[] fArr = this.f2142d;
        if (fArr == null || fArr.length <= i6) {
            int i7 = i6 + 1;
            float[] fArr2 = new float[i7];
            float[] fArr3 = new float[i7];
            float[] fArr4 = new float[i7];
            float[] fArr5 = new float[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2143e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2144f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2145g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2146i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2147j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2142d = fArr2;
            this.f2143e = fArr3;
            this.f2144f = fArr4;
            this.f2145g = fArr5;
            this.h = iArr;
            this.f2146i = iArr2;
            this.f2147j = iArr3;
        }
        float[] fArr9 = this.f2142d;
        this.f2144f[i6] = f6;
        fArr9[i6] = f6;
        float[] fArr10 = this.f2143e;
        this.f2145g[i6] = f7;
        fArr10[i6] = f7;
        int[] iArr7 = this.h;
        int i8 = (int) f6;
        int i9 = (int) f7;
        CoordinatorLayout coordinatorLayout = this.f2156t;
        int left = coordinatorLayout.getLeft();
        int i10 = this.f2152o;
        int i11 = i8 < left + i10 ? 1 : 0;
        if (i9 < coordinatorLayout.getTop() + i10) {
            i11 |= 4;
        }
        if (i8 > coordinatorLayout.getRight() - i10) {
            i11 |= 2;
        }
        if (i9 > coordinatorLayout.getBottom() - i10) {
            i11 |= 8;
        }
        iArr7[i6] = i11;
        this.f2148k |= 1 << i6;
    }

    public final void l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            int pointerId = motionEvent.getPointerId(i6);
            if ((this.f2148k & (1 << pointerId)) != 0) {
                float x6 = motionEvent.getX(i6);
                float y2 = motionEvent.getY(i6);
                this.f2144f[pointerId] = x6;
                this.f2145g[pointerId] = y2;
            }
        }
    }

    public final void m(int i6) {
        this.f2156t.removeCallbacks(this.f2158v);
        if (this.f2139a != i6) {
            this.f2139a = i6;
            this.f2154q.f(i6);
            if (this.f2139a == 0) {
                this.f2155r = null;
            }
        }
    }

    public final boolean n(int i6, int i7) {
        if (this.s) {
            return h(i6, i7, (int) this.f2149l.getXVelocity(this.f2141c), (int) this.f2149l.getYVelocity(this.f2141c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(MotionEvent motionEvent) {
        View viewG;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2149l == null) {
            this.f2149l = VelocityTracker.obtain();
        }
        this.f2149l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            k(x6, y2, pointerId);
            View viewG2 = g((int) x6, (int) y2);
            if (viewG2 == this.f2155r && this.f2139a == 2) {
                p(viewG2, pointerId);
            }
            int i6 = this.h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x7 = motionEvent.getX(actionIndex);
                    float y6 = motionEvent.getY(actionIndex);
                    k(x7, y6, pointerId2);
                    int i7 = this.f2139a;
                    if (i7 == 0) {
                        int i8 = this.h[pointerId2];
                    } else if (i7 == 2 && (viewG = g((int) x7, (int) y6)) == this.f2155r) {
                        p(viewG, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f2142d != null && this.f2143e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i9 = 0; i9 < pointerCount; i9++) {
                int pointerId3 = motionEvent.getPointerId(i9);
                if ((this.f2148k & (1 << pointerId3)) != 0) {
                    float x8 = motionEvent.getX(i9);
                    float y7 = motionEvent.getY(i9);
                    float f6 = x8 - this.f2142d[pointerId3];
                    float f7 = y7 - this.f2143e[pointerId3];
                    View viewG3 = g((int) x8, (int) y7);
                    boolean zC = c(viewG3, f6, f7);
                    if (zC) {
                        int left = viewG3.getLeft();
                        AbstractC0028c abstractC0028c = this.f2154q;
                        int iA = abstractC0028c.a(viewG3, ((int) f6) + left);
                        int top = viewG3.getTop();
                        int iB = abstractC0028c.b(viewG3, ((int) f7) + top);
                        int iC = abstractC0028c.c(viewG3);
                        int iD = abstractC0028c.d();
                        if ((iC == 0 || (iC > 0 && iA == left)) && (iD == 0 || (iD > 0 && iB == top))) {
                            break;
                        }
                        Math.abs(f6);
                        Math.abs(f7);
                        int i10 = this.h[pointerId3];
                        Math.abs(f7);
                        Math.abs(f6);
                        int i11 = this.h[pointerId3];
                        Math.abs(f6);
                        Math.abs(f7);
                        int i12 = this.h[pointerId3];
                        Math.abs(f7);
                        Math.abs(f6);
                        int i13 = this.h[pointerId3];
                        if (this.f2139a == 1 || (zC && p(viewG3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            l(motionEvent);
        }
        return this.f2139a == 1;
    }

    public final boolean p(View view, int i6) {
        if (view == this.f2155r && this.f2141c == i6) {
            return true;
        }
        if (view == null || !this.f2154q.i(view, i6)) {
            return false;
        }
        this.f2141c = i6;
        b(view, i6);
        return true;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: c1.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0028c {
        public abstract int a(View view, int i6);

        public abstract int b(View view, int i6);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public abstract void f(int i6);

        public abstract void g(View view, int i6, int i7);

        public abstract void h(View view, float f6, float f7);

        public abstract boolean i(View view, int i6);

        public void e(View view, int i6) {
        }
    }
}
