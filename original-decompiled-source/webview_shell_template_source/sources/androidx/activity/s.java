package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f86a = Color.argb(230, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public static final int f87b = Color.argb(128, 27, 27, 27);

    public static final void a(ComponentActivity componentActivity, t0 t0Var, t0 t0Var2) {
        View decorView = componentActivity.getWindow().getDecorView();
        kotlin.jvm.internal.j.d("window.decorView", decorView);
        p5.l<Resources, Boolean> lVar = t0Var.f91d;
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.j.d("view.resources", resources);
        boolean zBooleanValue = lVar.invoke(resources).booleanValue();
        p5.l<Resources, Boolean> lVar2 = t0Var2.f91d;
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.j.d("view.resources", resources2);
        boolean zBooleanValue2 = lVar2.invoke(resources2).booleanValue();
        int i6 = Build.VERSION.SDK_INT;
        d0 b0Var = i6 >= 30 ? new b0() : i6 >= 29 ? new z() : i6 >= 28 ? new w() : i6 >= 26 ? new u() : new t();
        Window window = componentActivity.getWindow();
        kotlin.jvm.internal.j.d("window", window);
        b0Var.a(t0Var, t0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        kotlin.jvm.internal.j.d("window", window2);
        b0Var.b(window2);
    }
}
