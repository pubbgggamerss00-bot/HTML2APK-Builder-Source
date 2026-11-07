package j2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n1 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<i3.b, i2.e0> f14832a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<i2.e0, i3.b> f14833b;

    public n1(Context context) {
        super(context);
        setClipChildren(false);
        this.f14832a = new HashMap<>();
        this.f14833b = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<i3.b, i2.e0> getHolderToLayoutNode() {
        return this.f14832a;
    }

    public final HashMap<i2.e0, i3.b> getLayoutNodeToHolder() {
        return this.f14833b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (i3.b bVar : this.f14832a.keySet()) {
            bVar.layout(bVar.getLeft(), bVar.getTop(), bVar.getRight(), bVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            f2.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            f2.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (i3.b bVar : this.f14832a.keySet()) {
            int i13 = bVar.f14104x;
            if (i13 != Integer.MIN_VALUE && (i12 = bVar.f14105y) != Integer.MIN_VALUE) {
                bVar.measure(i13, i12);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            i2.e0 e0Var = this.f14832a.get(childAt);
            if (childAt.isLayoutRequested() && e0Var != null) {
                i2.e0.f0(e0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
