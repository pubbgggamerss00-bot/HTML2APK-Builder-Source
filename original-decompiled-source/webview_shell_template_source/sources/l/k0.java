package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class k0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final int[] A = new int[2];
    public final float s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13687t;

    /* renamed from: u, reason: collision with root package name */
    public final int f13688u;

    /* renamed from: v, reason: collision with root package name */
    public final View f13689v;

    /* renamed from: w, reason: collision with root package name */
    public a f13690w;

    /* renamed from: x, reason: collision with root package name */
    public b f13691x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13692y;

    /* renamed from: z, reason: collision with root package name */
    public int f13693z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = k0.this.f13689v.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k0 k0Var = k0.this;
            k0Var.a();
            View view = k0Var.f13689v;
            if (view.isEnabled() && !view.isLongClickable() && k0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                k0Var.f13692y = true;
            }
        }
    }

    public k0(View view) {
        this.f13689v = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.s = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f13687t = tapTimeout;
        this.f13688u = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f13691x;
        View view = this.f13689v;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f13690w;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract k.f b();

    public abstract boolean c();

    public boolean d() {
        k.f fVarB = b();
        if (fVarB == null || !fVarB.a()) {
            return true;
        }
        fVarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        boolean z6;
        i0 i0VarI;
        boolean z7 = this.f13692y;
        View view2 = this.f13689v;
        if (z7) {
            k.f fVarB = b();
            if (fVarB == null || !fVarB.a() || (i0VarI = fVarB.i()) == null || !i0VarI.isShown()) {
                z6 = !d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.A;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                i0VarI.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = i0VarI.b(motionEventObtainNoHistory, this.f13693z);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z8 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zB || !z8) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f13693z = motionEvent.getPointerId(0);
                if (this.f13690w == null) {
                    this.f13690w = new a();
                }
                view2.postDelayed(this.f13690w, this.f13687t);
                if (this.f13691x == null) {
                    this.f13691x = new b();
                }
                view2.postDelayed(this.f13691x, this.f13688u);
            } else if (actionMasked2 == 1) {
                a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f13693z);
                if (iFindPointerIndex >= 0) {
                    float x6 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float f6 = this.s;
                    float f7 = -f6;
                    if (x6 < f7 || y2 < f7 || x6 >= (view2.getRight() - view2.getLeft()) + f6 || y2 >= (view2.getBottom() - view2.getTop()) + f6) {
                        a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (c()) {
                            z6 = true;
                        }
                        if (z6) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            z6 = false;
            if (z6) {
            }
        } else {
            z6 = false;
            if (z6) {
            }
        }
        this.f13692y = z6;
        return z6 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f13692y = false;
        this.f13693z = -1;
        a aVar = this.f13690w;
        if (aVar != null) {
            this.f13689v.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
