package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import u0.u0;
import u0.v0;
import u0.w0;
import u0.x0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t extends c0 {
    @Override // androidx.activity.d0
    public void a(t0 t0Var, t0 t0Var2, Window window, View view, boolean z6, boolean z7) {
        kotlin.jvm.internal.j.e("statusBarStyle", t0Var);
        kotlin.jvm.internal.j.e("navigationBarStyle", t0Var2);
        kotlin.jvm.internal.j.e("window", window);
        kotlin.jvm.internal.j.e("view", view);
        u0.q0.a(window, false);
        window.setStatusBarColor(z6 ? t0Var.f89b : t0Var.f88a);
        window.setNavigationBarColor(t0Var2.f89b);
        u0.w wVar = new u0.w(view);
        int i6 = Build.VERSION.SDK_INT;
        (i6 >= 35 ? new x0(window, wVar) : i6 >= 30 ? new w0(window, wVar) : i6 >= 26 ? new v0(window, wVar) : new u0(window, wVar)).l(!z6);
    }
}
