package b4;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import c6.f;
import com.basitce.htmltoapk.R;
import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class a {
    public static final ViewParent a(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void b(Bundle bundle, String key, int[] value) {
        r.e(key, "key");
        r.e(value, "value");
        bundle.putIntArray(key, value);
    }

    public static final void c(Bundle bundle, String key) {
        r.e(key, "key");
        bundle.putString(key, null);
    }

    public static final void d(Bundle bundle, String key, Bundle value) {
        r.e(key, "key");
        r.e(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void e(String key, String value, Bundle bundle) {
        r.e(key, "key");
        r.e(value, "value");
        bundle.putString(key, value);
    }

    public static final void f(Bundle bundle, String key, List value) {
        r.e(key, "key");
        r.e(value, "value");
        bundle.putStringArrayList(key, f.c(value));
    }
}
