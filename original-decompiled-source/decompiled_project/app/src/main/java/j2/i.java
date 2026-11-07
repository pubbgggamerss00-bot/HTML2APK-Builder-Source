package j2;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f14748a;

    public i(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f14748a = (AccessibilityManager) systemService;
    }

    @Override // j2.h
    public final long a(long j10, boolean z10) {
        if (j10 >= 2147483647L) {
            return j10;
        }
        int i10 = z10 ? 7 : 3;
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f14748a;
        if (i11 >= 29) {
            int iA = o1.a(accessibilityManager, (int) j10, i10);
            if (iA != Integer.MAX_VALUE) {
                return iA;
            }
        } else if (!z10 || !accessibilityManager.isTouchExplorationEnabled()) {
            return j10;
        }
        return Long.MAX_VALUE;
    }
}
