package c;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.i0;
import com.basitce.htmltoapk.R;
import x0.m0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f4309a = new m0(a.f4310a);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<i0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4310a = new a(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ i0 invoke() {
            return null;
        }
    }

    public static i0 a(x0.j jVar) {
        i0 i0Var = (i0) jVar.f(f4309a);
        Object obj = null;
        if (i0Var == null) {
            jVar.L(544166745);
            View view = (View) jVar.f(AndroidCompositionLocals_androidKt.f1285f);
            kotlin.jvm.internal.r.e(view, "<this>");
            while (true) {
                if (view == null) {
                    i0Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                i0 i0Var2 = tag instanceof i0 ? (i0) tag : null;
                if (i0Var2 != null) {
                    i0Var = i0Var2;
                    break;
                }
                Object objA = b4.a.a(view);
                view = objA instanceof View ? (View) objA : null;
            }
            jVar.B();
        } else {
            jVar.L(544164296);
            jVar.B();
        }
        if (i0Var != null) {
            jVar.L(544164377);
            jVar.B();
            return i0Var;
        }
        jVar.L(544168748);
        Context baseContext = (Context) jVar.f(AndroidCompositionLocals_androidKt.f1281b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof i0) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        i0 i0Var3 = (i0) obj;
        jVar.B();
        return i0Var3;
    }
}
