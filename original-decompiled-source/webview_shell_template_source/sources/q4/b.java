package q4;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {
    public static TypedValue a(Resources.Theme theme, int i6) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i6, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Resources.Theme theme, int i6, boolean z6) {
        TypedValue typedValueA = a(theme, i6);
        return (typedValueA == null || typedValueA.type != 18) ? z6 : typedValueA.data != 0;
    }

    public static TypedValue c(Context context, String str, int i6) {
        TypedValue typedValueA = a(context.getTheme(), i6);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i6)));
    }

    public static TypedValue d(View view, int i6) {
        return c(view.getContext(), view.getClass().getCanonicalName(), i6);
    }
}
