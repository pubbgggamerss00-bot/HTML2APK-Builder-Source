package u0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import java.util.List;
import x0.r3;

/* loaded from: classes.dex */
public final class l0 implements AccessibilityManager.AccessibilityStateChangeListener, r3<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final x0.x1 f29047a = bg.b.h(Boolean.FALSE);

    /* renamed from: b, reason: collision with root package name */
    public final n0 f29048b = new n0();

    /* renamed from: c, reason: collision with root package name */
    public final m0 f29049c;

    public static final class a {
        public static final void a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void b(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    public l0() {
        this.f29049c = Build.VERSION.SDK_INT >= 33 ? new m0(this) : null;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && mh.x.r(settingsActivityName, "SwitchAccess", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // x0.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean getValue() {
        boolean z10 = false;
        if (((Boolean) this.f29047a.getValue()).booleanValue()) {
            n0 n0Var = this.f29048b;
            if (n0Var != null ? ((Boolean) n0Var.f29082a.getValue()).booleanValue() : false) {
                z10 = true;
            } else {
                m0 m0Var = this.f29049c;
                if (m0Var != null ? ((Boolean) m0Var.f29069a.getValue()).booleanValue() : false) {
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f29047a.setValue(Boolean.valueOf(z10));
    }
}
