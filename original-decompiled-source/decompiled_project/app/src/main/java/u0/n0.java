package u0;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class n0 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final x0.x1 f29082a = bg.b.h(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        this.f29082a.setValue(Boolean.valueOf(z10));
    }
}
