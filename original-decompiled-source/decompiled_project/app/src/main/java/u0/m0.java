package u0;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* loaded from: classes.dex */
public final class m0 implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final x0.x1 f29069a = bg.b.h(Boolean.FALSE);

    public m0(l0 l0Var) {
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f29069a.setValue(Boolean.valueOf(l0.c(accessibilityManager)));
    }
}
