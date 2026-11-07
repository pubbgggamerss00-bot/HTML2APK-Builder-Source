package z3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f34742a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final k f34743a;

        public a(k kVar) {
            this.f34743a = kVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            j jVarB = this.f34743a.b(i10);
            if (jVarB == null) {
                return null;
            }
            return jVarB.f34725a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f34743a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i10) {
            j jVarC = this.f34743a.c(i10);
            if (jVarC == null) {
                return null;
            }
            return jVarC.f34725a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f34743a.d(i10, i11, bundle);
        }
    }

    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f34743a.a(i10, new j(accessibilityNodeInfo), str, bundle);
        }
    }

    public k() {
        this.f34742a = new b(this);
    }

    public void a(int i10, j jVar, String str, Bundle bundle) {
    }

    public j b(int i10) {
        return null;
    }

    public j c(int i10) {
        return null;
    }

    public boolean d(int i10, int i11, Bundle bundle) {
        return false;
    }

    public k(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f34742a = accessibilityNodeProvider;
    }
}
