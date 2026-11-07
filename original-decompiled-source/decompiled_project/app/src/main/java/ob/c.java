package ob;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import c1.x;
import com.google.protobuf.DescriptorProtos;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public abstract class c<V extends View> extends e<V> {

    /* renamed from: a, reason: collision with root package name */
    public a f19121a;

    /* renamed from: b, reason: collision with root package name */
    public OverScroller f19122b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19123c;

    /* renamed from: d, reason: collision with root package name */
    public int f19124d;

    /* renamed from: e, reason: collision with root package name */
    public int f19125e;

    /* renamed from: f, reason: collision with root package name */
    public int f19126f;

    /* renamed from: g, reason: collision with root package name */
    public VelocityTracker f19127g;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final m3.b f19128a;

        /* renamed from: b, reason: collision with root package name */
        public final V f19129b;

        public a(m3.b bVar, V v10) {
            this.f19128a = bVar;
            this.f19129b = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            OverScroller overScroller = cVar.f19122b;
            if (overScroller != null) {
                boolean zComputeScrollOffset = overScroller.computeScrollOffset();
                m3.b bVar = this.f19128a;
                V v10 = this.f19129b;
                if (!zComputeScrollOffset) {
                    cVar.n(bVar, v10);
                } else {
                    cVar.p(bVar, v10, cVar.f19122b.getCurrY());
                    v10.postOnAnimation(this);
                }
            }
        }
    }

    public c() {
        this.f19124d = -1;
        this.f19126f = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // m3.b.AbstractC0173b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(m3.b bVar, V v10, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int iFindPointerIndex;
        if (this.f19126f < 0) {
            this.f19126f = ViewConfiguration.get(bVar.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f19123c) {
            int i10 = this.f19124d;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y10 - this.f19125e) > this.f19126f) {
                    this.f19125e = y10;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                }
                velocityTracker = this.f19127g;
                if (velocityTracker != null) {
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.f19124d = -1;
                int x10 = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                boolean z10 = j(v10) && bVar.a(v10, x10, y11);
                this.f19123c = z10;
                if (z10) {
                    this.f19125e = y11;
                    this.f19124d = motionEvent.getPointerId(0);
                    if (this.f19127g == null) {
                        this.f19127g = VelocityTracker.obtain();
                    }
                    OverScroller overScroller = this.f19122b;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.f19122b.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.f19127g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // m3.b.AbstractC0173b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(m3.b bVar, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f19124d);
                if (iFindPointerIndex == -1) {
                    return;
                }
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                int i10 = this.f19125e - y10;
                this.f19125e = y10;
                o(bVar, view, m() - i10, k(view), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f19124d = motionEvent.getPointerId(i11);
                    this.f19125e = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            velocityTracker = this.f19127g;
            if (velocityTracker == null) {
                velocityTracker.addMovement(motionEvent);
                return;
            }
            return;
        }
        VelocityTracker velocityTracker2 = this.f19127g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f19127g.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE);
            float yVelocity = this.f19127g.getYVelocity(this.f19124d);
            int i12 = -l(view);
            Runnable runnable = this.f19121a;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f19121a = null;
            }
            if (this.f19122b == null) {
                this.f19122b = new OverScroller(view.getContext());
            }
            this.f19122b.fling(0, 0, 0, Math.round(yVelocity), 0, 0, i12, 0);
            if (this.f19122b.computeScrollOffset()) {
                a aVar = new a(bVar, view);
                this.f19121a = aVar;
                view.postOnAnimation(aVar);
            } else {
                n(bVar, view);
            }
        }
        this.f19123c = false;
        this.f19124d = -1;
        VelocityTracker velocityTracker3 = this.f19127g;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f19127g = null;
        }
        velocityTracker = this.f19127g;
        if (velocityTracker == null) {
        }
    }

    public boolean j(V v10) {
        return false;
    }

    public int k(V v10) {
        return -v10.getHeight();
    }

    public int l(V v10) {
        return v10.getHeight();
    }

    public int m() {
        return 0;
    }

    public void n(m3.b bVar, V v10) {
    }

    public int o(m3.b bVar, V v10, int i10, int i11, int i12) {
        int iE;
        if (i11 == 0 || i11 > 0 || i12 < 0 || (iE = x.e(i10, i11, i12)) == 0) {
            return 0;
        }
        return 0 - iE;
    }

    public final void p(m3.b bVar, View view, int i10) {
        o(bVar, view, i10, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19124d = -1;
        this.f19126f = -1;
    }
}
