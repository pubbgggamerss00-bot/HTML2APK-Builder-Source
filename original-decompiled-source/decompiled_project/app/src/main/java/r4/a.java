package r4;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Field;
import java.util.Arrays;
import y3.q0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: w, reason: collision with root package name */
    public static final InterpolatorC0256a f23185w = new InterpolatorC0256a();

    /* renamed from: a, reason: collision with root package name */
    public int f23186a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23187b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f23189d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f23190e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f23191f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f23192g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f23193h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f23194i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f23195j;

    /* renamed from: k, reason: collision with root package name */
    public int f23196k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f23197l;

    /* renamed from: m, reason: collision with root package name */
    public final float f23198m;

    /* renamed from: n, reason: collision with root package name */
    public final float f23199n;

    /* renamed from: o, reason: collision with root package name */
    public final int f23200o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f23201p;

    /* renamed from: q, reason: collision with root package name */
    public final c f23202q;

    /* renamed from: r, reason: collision with root package name */
    public View f23203r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23204s;

    /* renamed from: t, reason: collision with root package name */
    public final m3.b f23205t;

    /* renamed from: u, reason: collision with root package name */
    public InterpolatorC0256a f23206u;

    /* renamed from: c, reason: collision with root package name */
    public int f23188c = -1;

    /* renamed from: v, reason: collision with root package name */
    public final b f23207v = new b();

    /* renamed from: r4.a$a, reason: collision with other inner class name */
    public class InterpolatorC0256a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.m(0);
        }
    }

    public static abstract class c {
        public abstract int a(View view, int i10);

        public abstract int b(View view, int i10);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i10) {
        }

        public abstract void f(int i10);

        public abstract void g(View view, int i10, int i11);

        public abstract void h(View view, float f10, float f11);

        public abstract boolean i(View view, int i10);
    }

    public a(Context context, m3.b bVar, c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.f23205t = bVar;
        this.f23202q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f23200o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f23187b = viewConfiguration.getScaledTouchSlop();
        this.f23198m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23199n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23206u = f23185w;
        this.f23201p = new OverScroller(context, new r4.b(this));
    }

    public final void a() {
        this.f23188c = -1;
        float[] fArr = this.f23189d;
        if (fArr != null) {
            Arrays.fill(fArr, CropImageView.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f23190e, CropImageView.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f23191f, CropImageView.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f23192g, CropImageView.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f23193h, 0);
            Arrays.fill(this.f23194i, 0);
            Arrays.fill(this.f23195j, 0);
            this.f23196k = 0;
        }
        VelocityTracker velocityTracker = this.f23197l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23197l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        m3.b bVar = this.f23205t;
        if (parent != bVar) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + bVar + ")");
        }
        this.f23203r = view;
        this.f23188c = i10;
        this.f23202q.e(view, i10);
        m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f10, float f11) {
        if (view != null) {
            c cVar = this.f23202q;
            boolean z10 = cVar.c(view) > 0;
            boolean z11 = cVar.d() > 0;
            if (z10 && z11) {
                float f12 = (f11 * f11) + (f10 * f10);
                int i10 = this.f23187b;
                if (f12 > i10 * i10) {
                }
            } else if (!z10 ? !(!z11 || Math.abs(f11) <= this.f23187b) : Math.abs(f10) > this.f23187b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10) {
        float[] fArr = this.f23189d;
        if (fArr != null) {
            int i11 = this.f23196k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f23190e[i10] = 0.0f;
                this.f23191f[i10] = 0.0f;
                this.f23192g[i10] = 0.0f;
                this.f23193h[i10] = 0;
                this.f23194i[i10] = 0;
                this.f23195j[i10] = 0;
                this.f23196k = (~i12) & i11;
            }
        }
    }

    public final int e(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        float width = this.f23205t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f23186a == 2) {
            OverScroller overScroller = this.f23201p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f23203r.getLeft();
            int top = currY - this.f23203r.getTop();
            if (left != 0) {
                View view = this.f23203r;
                Field field = q0.f33885a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f23203r;
                Field field2 = q0.f33885a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f23202q.g(this.f23203r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f23205t.post(this.f23207v);
            }
        }
        return this.f23186a == 2;
    }

    public final View g(int i10, int i11) {
        m3.b bVar = this.f23205t;
        for (int childCount = bVar.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f23202q.getClass();
            View childAt = bVar.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f23203r.getLeft();
        int top = this.f23203r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f23201p;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            m(0);
            return false;
        }
        View view = this.f23203r;
        int i16 = (int) this.f23199n;
        int i17 = (int) this.f23198m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i16) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i18 = iAbs5 + iAbs6;
        int i19 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i18;
        } else {
            f10 = iAbs3;
            f11 = i19;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i18;
        } else {
            f12 = iAbs4;
            f13 = i19;
        }
        float f15 = f12 / f13;
        c cVar = this.f23202q;
        this.f23206u = f23185w;
        overScroller.startScroll(left, top, i14, i15, (int) ((e(i15, i13, cVar.d()) * f15) + (e(i14, i12, cVar.c(view)) * f14)));
        m(2);
        return true;
    }

    public final void i(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f23197l == null) {
            this.f23197l = VelocityTracker.obtain();
        }
        this.f23197l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x10, (int) y10);
            k(x10, y10, pointerId);
            p(viewG, pointerId);
            int i11 = this.f23193h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f23186a == 1) {
                j();
            }
            a();
            return;
        }
        c cVar = this.f23202q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f23186a == 1) {
                    this.f23204s = true;
                    cVar.h(this.f23203r, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                    this.f23204s = false;
                    if (this.f23186a == 1) {
                        m(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                k(x11, y11, pointerId2);
                if (this.f23186a == 0) {
                    p(g((int) x11, (int) y11), pointerId2);
                    int i12 = this.f23193h[pointerId2];
                    return;
                }
                int i13 = (int) x11;
                int i14 = (int) y11;
                View view = this.f23203r;
                if (view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom()) {
                    i = 1;
                }
                if (i != 0) {
                    p(this.f23203r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f23186a == 1 && pointerId3 == this.f23188c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        i10 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.f23188c) {
                        View viewG2 = g((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.f23203r;
                        if (viewG2 == view2 && p(view2, pointerId4)) {
                            i10 = this.f23188c;
                            break;
                        }
                    }
                    i++;
                }
                if (i10 == -1) {
                    j();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f23186a == 1) {
            int i15 = this.f23188c;
            if (((this.f23196k & (1 << i15)) != 0 ? 1 : 0) == 0 || (iFindPointerIndex = motionEvent.findPointerIndex(i15)) == -1) {
                return;
            }
            float x12 = motionEvent.getX(iFindPointerIndex);
            float y12 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f23191f;
            int i16 = this.f23188c;
            int i17 = (int) (x12 - fArr[i16]);
            int i18 = (int) (y12 - this.f23192g[i16]);
            int left = this.f23203r.getLeft() + i17;
            int top = this.f23203r.getTop() + i18;
            int left2 = this.f23203r.getLeft();
            int top2 = this.f23203r.getTop();
            if (i17 != 0) {
                left = cVar.a(this.f23203r, left);
                Field field = q0.f33885a;
                this.f23203r.offsetLeftAndRight(left - left2);
            }
            if (i18 != 0) {
                top = cVar.b(this.f23203r, top);
                Field field2 = q0.f33885a;
                this.f23203r.offsetTopAndBottom(top - top2);
            }
            if (i17 != 0 || i18 != 0) {
                cVar.g(this.f23203r, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i19 = 0; i19 < pointerCount2; i19++) {
                int pointerId5 = motionEvent.getPointerId(i19);
                if ((this.f23196k & (1 << pointerId5)) != 0) {
                    float x13 = motionEvent.getX(i19);
                    float y13 = motionEvent.getY(i19);
                    float f10 = x13 - this.f23189d[pointerId5];
                    float f11 = y13 - this.f23190e[pointerId5];
                    Math.abs(f10);
                    Math.abs(f11);
                    int i20 = this.f23193h[pointerId5];
                    Math.abs(f11);
                    Math.abs(f10);
                    int i21 = this.f23193h[pointerId5];
                    Math.abs(f10);
                    Math.abs(f11);
                    int i22 = this.f23193h[pointerId5];
                    Math.abs(f11);
                    Math.abs(f10);
                    int i23 = this.f23193h[pointerId5];
                    if (this.f23186a == 1) {
                        break;
                    }
                    View viewG3 = g((int) x13, (int) y13);
                    if (c(viewG3, f10, f11) && p(viewG3, pointerId5)) {
                        break;
                    }
                }
            }
        }
        l(motionEvent);
    }

    public final void j() {
        VelocityTracker velocityTracker = this.f23197l;
        float f10 = this.f23198m;
        velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, f10);
        float xVelocity = this.f23197l.getXVelocity(this.f23188c);
        float fAbs = Math.abs(xVelocity);
        float f11 = this.f23199n;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > CropImageView.DEFAULT_ASPECT_RATIO ? f10 : -f10;
        }
        float yVelocity = this.f23197l.getYVelocity(this.f23188c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f11) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= CropImageView.DEFAULT_ASPECT_RATIO) {
            f10 = -f10;
        }
        this.f23204s = true;
        this.f23202q.h(this.f23203r, xVelocity, f10);
        this.f23204s = false;
        if (this.f23186a == 1) {
            m(0);
        }
    }

    public final void k(float f10, float f11, int i10) {
        float[] fArr = this.f23189d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f23190e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f23191f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f23192g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f23193h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f23194i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f23195j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f23189d = fArr2;
            this.f23190e = fArr3;
            this.f23191f = fArr4;
            this.f23192g = fArr5;
            this.f23193h = iArr;
            this.f23194i = iArr2;
            this.f23195j = iArr3;
        }
        float[] fArr9 = this.f23189d;
        this.f23191f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f23190e;
        this.f23192g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f23193h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        m3.b bVar = this.f23205t;
        int left = bVar.getLeft();
        int i14 = this.f23200o;
        int i15 = i12 < left + i14 ? 1 : 0;
        if (i13 < bVar.getTop() + i14) {
            i15 |= 4;
        }
        if (i12 > bVar.getRight() - i14) {
            i15 |= 2;
        }
        if (i13 > bVar.getBottom() - i14) {
            i15 |= 8;
        }
        iArr7[i10] = i15;
        this.f23196k |= 1 << i10;
    }

    public final void l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if ((this.f23196k & (1 << pointerId)) != 0) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f23191f[pointerId] = x10;
                this.f23192g[pointerId] = y10;
            }
        }
    }

    public final void m(int i10) {
        this.f23205t.removeCallbacks(this.f23207v);
        if (this.f23186a != i10) {
            this.f23186a = i10;
            this.f23202q.f(i10);
            if (this.f23186a == 0) {
                this.f23203r = null;
            }
        }
    }

    public final boolean n(int i10, int i11) {
        if (this.f23204s) {
            return h(i10, i11, (int) this.f23197l.getXVelocity(this.f23188c), (int) this.f23197l.getYVelocity(this.f23188c));
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
        if (this.f23197l == null) {
            this.f23197l = VelocityTracker.obtain();
        }
        this.f23197l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            k(x10, y10, pointerId);
            View viewG2 = g((int) x10, (int) y10);
            if (viewG2 == this.f23203r && this.f23186a == 2) {
                p(viewG2, pointerId);
            }
            int i10 = this.f23193h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x11 = motionEvent.getX(actionIndex);
                    float y11 = motionEvent.getY(actionIndex);
                    k(x11, y11, pointerId2);
                    int i11 = this.f23186a;
                    if (i11 == 0) {
                        int i12 = this.f23193h[pointerId2];
                    } else if (i11 == 2 && (viewG = g((int) x11, (int) y11)) == this.f23203r) {
                        p(viewG, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f23189d != null && this.f23190e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount; i13++) {
                int pointerId3 = motionEvent.getPointerId(i13);
                if ((this.f23196k & (1 << pointerId3)) != 0) {
                    float x12 = motionEvent.getX(i13);
                    float y12 = motionEvent.getY(i13);
                    float f10 = x12 - this.f23189d[pointerId3];
                    float f11 = y12 - this.f23190e[pointerId3];
                    View viewG3 = g((int) x12, (int) y12);
                    boolean zC = c(viewG3, f10, f11);
                    if (zC) {
                        int left = viewG3.getLeft();
                        c cVar = this.f23202q;
                        int iA = cVar.a(viewG3, ((int) f10) + left);
                        int top = viewG3.getTop();
                        int iB = cVar.b(viewG3, ((int) f11) + top);
                        int iC = cVar.c(viewG3);
                        int iD = cVar.d();
                        if ((iC == 0 || (iC > 0 && iA == left)) && (iD == 0 || (iD > 0 && iB == top))) {
                            break;
                        }
                        Math.abs(f10);
                        Math.abs(f11);
                        int i14 = this.f23193h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i15 = this.f23193h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f11);
                        int i16 = this.f23193h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i17 = this.f23193h[pointerId3];
                        if (this.f23186a == 1 || (zC && p(viewG3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            l(motionEvent);
        }
        return this.f23186a == 1;
    }

    public final boolean p(View view, int i10) {
        if (view == this.f23203r && this.f23188c == i10) {
            return true;
        }
        if (view == null || !this.f23202q.i(view, i10)) {
            return false;
        }
        this.f23188c = i10;
        b(view, i10);
        return true;
    }
}
