package z3;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements View.OnAttachStateChangeListener {
    public final /* synthetic */ HideViewOnScrollBehavior s;

    public h(HideViewOnScrollBehavior hideViewOnScrollBehavior) {
        this.s = hideViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.s;
        g gVar = hideViewOnScrollBehavior.f12013c;
        if (gVar == null || (accessibilityManager = hideViewOnScrollBehavior.f12012b) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(gVar);
        hideViewOnScrollBehavior.f12013c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
