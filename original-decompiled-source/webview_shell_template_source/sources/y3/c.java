package y3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e5.i;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c<V extends View> extends e<V> {

    /* renamed from: c, reason: collision with root package name */
    public a f15227c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f15228d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15229e;

    /* renamed from: f, reason: collision with root package name */
    public int f15230f;

    /* renamed from: g, reason: collision with root package name */
    public int f15231g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f15232i;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final CoordinatorLayout s;

        /* renamed from: t, reason: collision with root package name */
        public final V f15233t;

        public a(CoordinatorLayout coordinatorLayout, V v2) {
            this.s = coordinatorLayout;
            this.f15233t = v2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar;
            OverScroller overScroller;
            V v2 = this.f15233t;
            if (v2 == null || (overScroller = (cVar = c.this).f15228d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.s;
            if (!zComputeScrollOffset) {
                cVar.y(coordinatorLayout, v2);
            } else {
                cVar.A(coordinatorLayout, v2, cVar.f15228d.getCurrY());
                v2.postOnAnimation(this);
            }
        }
    }

    public c() {
        this.f15230f = -1;
        this.h = -1;
    }

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i6) {
        z(coordinatorLayout, view, i6, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f15229e) {
            int i6 = this.f15230f;
            if (i6 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i6)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.f15231g) > this.h) {
                    this.f15231g = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                }
                velocityTracker = this.f15232i;
                if (velocityTracker != null) {
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f15230f = -1;
                int x6 = (int) motionEvent.getX();
                int y6 = (int) motionEvent.getY();
                boolean z6 = v(v2) && coordinatorLayout.i(v2, x6, y6);
                this.f15229e = z6;
                if (z6) {
                    this.f15231g = y6;
                    this.f15230f = motionEvent.getPointerId(0);
                    if (this.f15232i == null) {
                        this.f15232i = VelocityTracker.obtain();
                    }
                    OverScroller overScroller = this.f15228d;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f15228d.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.f15232i;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z6;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f15230f);
                if (iFindPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i6 = this.f15231g - y2;
                    this.f15231g = y2;
                    z(coordinatorLayout, v2, t() - i6, w(v2), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i7 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f15230f = motionEvent.getPointerId(i7);
                    this.f15231g = (int) (motionEvent.getY(i7) + 0.5f);
                }
            }
            z6 = false;
            velocityTracker2 = this.f15232i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f15229e || z6;
        }
        VelocityTracker velocityTracker3 = this.f15232i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f15232i.computeCurrentVelocity(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
            float yVelocity = this.f15232i.getYVelocity(this.f15230f);
            int i8 = -x(v2);
            Runnable runnable = this.f15227c;
            if (runnable != null) {
                v2.removeCallbacks(runnable);
                this.f15227c = null;
            }
            if (this.f15228d == null) {
                this.f15228d = new OverScroller(v2.getContext());
            }
            this.f15228d.fling(0, s(), 0, Math.round(yVelocity), 0, 0, i8, 0);
            if (this.f15228d.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v2);
                this.f15227c = aVar;
                v2.postOnAnimation(aVar);
            } else {
                y(coordinatorLayout, v2);
            }
            z6 = true;
        }
        this.f15229e = false;
        this.f15230f = -1;
        velocityTracker = this.f15232i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15232i = null;
        }
        velocityTracker2 = this.f15232i;
        if (velocityTracker2 != null) {
        }
        if (this.f15229e) {
        }
        z6 = false;
        this.f15229e = false;
        this.f15230f = -1;
        velocityTracker = this.f15232i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f15232i;
        if (velocityTracker2 != null) {
        }
        if (this.f15229e) {
        }
    }

    public boolean v(V v2) {
        return false;
    }

    public int w(V v2) {
        return -v2.getHeight();
    }

    public int x(V v2) {
        return v2.getHeight();
    }

    public int z(CoordinatorLayout coordinatorLayout, V v2, int i6, int i7, int i8) {
        int iB;
        int iS = s();
        if (i7 == 0 || iS < i7 || iS > i8 || iS == (iB = i.b(i6, i7, i8))) {
            return 0;
        }
        e1.c cVar = this.f15239a;
        if (cVar == null) {
            this.f15240b = iB;
        } else if (cVar.f12777c != iB) {
            cVar.f12777c = iB;
            cVar.c();
        }
        return iS - iB;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15230f = -1;
        this.h = -1;
    }

    public void y(CoordinatorLayout coordinatorLayout, V v2) {
    }
}
