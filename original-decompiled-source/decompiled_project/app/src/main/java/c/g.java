package c;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import j2.i2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f4304a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(b.k kVar, f1.b bVar) {
        View childAt = ((ViewGroup) kVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        i2 i2Var = childAt instanceof i2 ? (i2) childAt : null;
        if (i2Var != null) {
            i2Var.setParentCompositionContext(null);
            i2Var.setContent(bVar);
            return;
        }
        i2 i2Var2 = new i2(kVar);
        i2Var2.setParentCompositionContext(null);
        i2Var2.setContent(bVar);
        View decorView = kVar.getWindow().getDecorView();
        if (c1.c(decorView) == null) {
            c1.d(decorView, kVar);
        }
        if (d1.a(decorView) == null) {
            decorView.setTag(com.basitce.htmltoapk.R.id.view_tree_view_model_store_owner, kVar);
        }
        if (b6.c.d(decorView) == null) {
            decorView.setTag(com.basitce.htmltoapk.R.id.view_tree_saved_state_registry_owner, kVar);
        }
        kVar.setContentView(i2Var2, f4304a);
    }
}
