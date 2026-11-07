package w2;

import android.view.ScaleGestureDetector;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u0 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f15045a;

    public u0(s0 s0Var) {
        this.f15045a = s0Var;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        kotlin.jvm.internal.j.e("detector", scaleGestureDetector);
        s0 s0Var = this.f15045a;
        s0Var.s0(scaleGestureDetector.getScaleFactor() * s0Var.getZoom(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        kotlin.jvm.internal.j.e("detector", scaleGestureDetector);
        return this.f15045a.getZoomEnabled();
    }
}
