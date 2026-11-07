package j2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public class s2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14894a;

    public s2(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(q1.w0 w0Var, androidx.compose.ui.platform.d dVar, long j10) {
        super.drawChild(q1.c0.a(w0Var), dVar, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            kotlin.jvm.internal.r.c(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((androidx.compose.ui.platform.d) childAt).f1349h) {
                this.f14894a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f14894a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f14894a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
