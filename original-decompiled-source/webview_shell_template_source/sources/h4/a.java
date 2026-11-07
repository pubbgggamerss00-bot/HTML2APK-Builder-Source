package h4;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {
    public final Dialog s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13284t;

    /* renamed from: u, reason: collision with root package name */
    public final int f13285u;

    /* renamed from: v, reason: collision with root package name */
    public final int f13286v;

    public a(Dialog dialog, Rect rect) {
        this.s = dialog;
        this.f13284t = rect.left;
        this.f13285u = rect.top;
        this.f13286v = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f13284t;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f13285u, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i6 = this.f13286v;
            motionEventObtain.setLocation((-i6) - 1, (-i6) - 1);
        }
        view.performClick();
        return this.s.onTouchEvent(motionEventObtain);
    }
}
