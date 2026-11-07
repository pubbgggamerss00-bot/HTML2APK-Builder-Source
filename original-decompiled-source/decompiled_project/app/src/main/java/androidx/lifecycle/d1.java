package androidx.lifecycle;

import android.view.View;
import com.basitce.htmltoapk.R;

/* loaded from: classes.dex */
public final class d1 {
    public static final b1 a(View view) {
        kotlin.jvm.internal.r.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            b1 b1Var = tag instanceof b1 ? (b1) tag : null;
            if (b1Var != null) {
                return b1Var;
            }
            Object objA = b4.a.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }
}
