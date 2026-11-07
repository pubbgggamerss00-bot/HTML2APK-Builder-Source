package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public abstract class w implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f17204a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17205b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17206c;

    /* renamed from: d, reason: collision with root package name */
    public final View f17207d;

    /* renamed from: e, reason: collision with root package name */
    public a f17208e;

    /* renamed from: f, reason: collision with root package name */
    public b f17209f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17210g;

    /* renamed from: h, reason: collision with root package name */
    public int f17211h;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f17212j = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = w.this.f17207d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            w wVar = w.this;
            wVar.a();
            View view = wVar.f17207d;
            if (view.isEnabled() && !view.isLongClickable() && wVar.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                wVar.f17210g = true;
            }
        }
    }

    public w(View view) {
        this.f17207d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f17204a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f17205b = tapTimeout;
        this.f17206c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f17209f;
        View view = this.f17207d;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f17208e;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract l.h b();

    public abstract boolean c();

    public boolean d() {
        l.h hVarB = b();
        if (hVarB == null || !hVarB.e()) {
            return true;
        }
        hVarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        boolean z10;
        v vVar;
        boolean z11 = this.f17210g;
        View view2 = this.f17207d;
        if (z11) {
            l.h hVarB = b();
            if (hVarB == null || !hVarB.e() || (vVar = (v) hVarB.h()) == null || !vVar.isShown()) {
                z10 = !d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f17212j;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                vVar.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = vVar.b(motionEventObtainNoHistory, this.f17211h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zB || !z12) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f17211h = motionEvent.getPointerId(0);
                if (this.f17208e == null) {
                    this.f17208e = new a();
                }
                view2.postDelayed(this.f17208e, this.f17205b);
                if (this.f17209f == null) {
                    this.f17209f = new b();
                }
                view2.postDelayed(this.f17209f, this.f17206c);
            } else if (actionMasked2 == 1) {
                a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f17211h);
                if (iFindPointerIndex >= 0) {
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    float f10 = this.f17204a;
                    float f11 = -f10;
                    if (x10 < f11 || y10 < f11 || x10 >= (view2.getRight() - view2.getLeft()) + f10 || y10 >= (view2.getBottom() - view2.getTop()) + f10) {
                        a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (c()) {
                            z10 = true;
                        }
                        if (z10) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            z10 = false;
            if (z10) {
            }
        } else {
            z10 = false;
            if (z10) {
            }
        }
        this.f17210g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f17210g = false;
        this.f17211h = -1;
        a aVar = this.f17208e;
        if (aVar != null) {
            this.f17207d.removeCallbacks(aVar);
        }
    }
}
