package u0;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import u0.l0;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f28988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f28989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l0 l0Var, AccessibilityManager accessibilityManager) {
        super(0);
        this.f28988a = l0Var;
        this.f28989b = accessibilityManager;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        m0 m0Var;
        l0 l0Var = this.f28988a;
        l0Var.getClass();
        AccessibilityManager accessibilityManager = this.f28989b;
        accessibilityManager.removeAccessibilityStateChangeListener(l0Var);
        n0 n0Var = l0Var.f29048b;
        if (n0Var != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(n0Var);
        }
        if (Build.VERSION.SDK_INT >= 33 && (m0Var = l0Var.f29049c) != null) {
            l0.a.b(accessibilityManager, k0.a(m0Var));
        }
        return pg.f0.f21461a;
    }
}
