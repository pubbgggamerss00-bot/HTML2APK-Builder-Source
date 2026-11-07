package u0;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.l;
import u0.l0;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.s implements eh.l<l.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f28975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f28976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l0 l0Var, AccessibilityManager accessibilityManager) {
        super(1);
        this.f28975a = l0Var;
        this.f28976b = accessibilityManager;
    }

    @Override // eh.l
    public final pg.f0 invoke(l.a aVar) {
        m0 m0Var;
        if (aVar == l.a.ON_RESUME) {
            l0 l0Var = this.f28975a;
            l0Var.getClass();
            AccessibilityManager accessibilityManager = this.f28976b;
            l0Var.f29047a.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
            accessibilityManager.addAccessibilityStateChangeListener(l0Var);
            n0 n0Var = l0Var.f29048b;
            if (n0Var != null) {
                n0Var.f29082a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                accessibilityManager.addTouchExplorationStateChangeListener(n0Var);
            }
            if (Build.VERSION.SDK_INT >= 33 && (m0Var = l0Var.f29049c) != null) {
                m0Var.f29069a.setValue(Boolean.valueOf(l0.c(accessibilityManager)));
                l0.a.a(accessibilityManager, k0.a(m0Var));
            }
        }
        return pg.f0.f21461a;
    }
}
