package v0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f14741a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final c f14742a;

        public a(c cVar) {
            this.f14742a = cVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i6) {
            v0.b bVarA = this.f14742a.a(i6);
            if (bVarA == null) {
                return null;
            }
            return bVarA.f14729a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i6) {
            this.f14742a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i6) {
            v0.b bVarB = this.f14742a.b(i6);
            if (bVarB == null) {
                return null;
            }
            return bVarB.f14729a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i6, int i7, Bundle bundle) {
            return this.f14742a.c(i6, i7, bundle);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i6, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f14742a.getClass();
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14741a = new b(this);
        } else {
            this.f14741a = new a(this);
        }
    }

    public v0.b a(int i6) {
        return null;
    }

    public v0.b b(int i6) {
        return null;
    }

    public boolean c(int i6, int i7, Bundle bundle) {
        return false;
    }

    public c(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f14741a = accessibilityNodeProvider;
    }
}
