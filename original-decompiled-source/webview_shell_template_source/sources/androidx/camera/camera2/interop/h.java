package androidx.camera.camera2.interop;

import android.os.Handler;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.Config;
import java.io.File;
import kotlin.jvm.internal.j;
import p5.l;
import u0.r;
import u0.s0;
import w2.l0;
import w2.y;
import x5.o;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Config.OptionMatcher, l, r {
    public final /* synthetic */ Object s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f493t;

    public /* synthetic */ h(Object obj, Object obj2) {
        this.s = obj;
        this.f493t = obj2;
    }

    @Override // u0.r
    public s0 d(View view, s0 s0Var) {
        View childAt;
        LinearLayout linearLayout = (LinearLayout) this.s;
        l0 l0Var = (l0) this.f493t;
        FrameLayout frameLayout = l0Var.G;
        j.e("<unused var>", view);
        m0.b bVarF = s0Var.f14553a.f(647);
        j.d("getInsets(...)", bVarF);
        int i6 = bVarF.f13857d;
        int i7 = bVarF.f13855b;
        int i8 = bVarF.f13856c;
        int i9 = bVarF.f13854a;
        if (linearLayout != null) {
            linearLayout.setPadding(0, i7, 0, 0);
            frameLayout.setPadding(i9, 0, i8, i6);
        } else {
            frameLayout.setPadding(i9, i7, i8, i6);
        }
        if (linearLayout != null && (childAt = linearLayout.getChildAt(0)) != null) {
            childAt.setPadding(l0Var.b(4) + i9, 0, l0Var.b(4) + i8, 0);
        }
        return s0.f14552b;
    }

    @Override // p5.l
    public Object invoke(Object obj) {
        ComponentActivity componentActivity = (ComponentActivity) this.s;
        String str = (String) this.f493t;
        File file = (File) obj;
        j.e("it", file);
        Handler handler = y.f15051a;
        try {
            Object systemService = componentActivity.getSystemService("print");
            j.c("null cannot be cast to non-null type android.print.PrintManager", systemService);
            ((PrintManager) systemService).print(o.A(y.b(str), ".pdf"), new y.a(file, y.b(str)), new PrintAttributes.Builder().build());
        } catch (Exception e6) {
            y.a(componentActivity, e6);
        }
        return d5.j.f12745a;
    }

    @Override // androidx.camera.core.impl.Config.OptionMatcher
    public boolean onOptionMatched(Config.Option option) {
        return CaptureRequestOptions.Builder.lambda$from$0((CaptureRequestOptions.Builder) this.s, (Config) this.f493t, option);
    }
}
