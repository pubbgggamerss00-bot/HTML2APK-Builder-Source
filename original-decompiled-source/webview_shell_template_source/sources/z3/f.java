package z3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends j {
    @Override // z3.j
    public final <V extends View> int a(V v2, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v2.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // z3.j
    public final int b() {
        return 0;
    }

    @Override // z3.j
    public final <V extends View> ViewPropertyAnimator c(V v2, int i6) {
        return v2.animate().translationX(i6);
    }
}
