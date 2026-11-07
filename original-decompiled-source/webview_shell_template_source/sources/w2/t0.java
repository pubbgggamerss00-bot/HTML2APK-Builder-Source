package w2;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f15042a;

    public t0(s0 s0Var) {
        this.f15042a = s0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        kotlin.jvm.internal.j.e("e", motionEvent);
        s0 s0Var = this.f15042a;
        if (!s0Var.getZoomEnabled()) {
            return false;
        }
        s0Var.m0(s0Var.p0() ? 1.0f : 2.5f, motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        kotlin.jvm.internal.j.e("e", motionEvent);
        p5.a<d5.j> onSingleTap = this.f15042a.getOnSingleTap();
        if (onSingleTap == null) {
            return true;
        }
        onSingleTap.a();
        return true;
    }
}
