package z3;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {
    public final /* synthetic */ HideBottomViewOnScrollBehavior s;

    public b(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.s = hideBottomViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.s;
        a aVar = hideBottomViewOnScrollBehavior.h;
        if (aVar == null || (accessibilityManager = hideBottomViewOnScrollBehavior.f12005g) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
        hideBottomViewOnScrollBehavior.h = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
