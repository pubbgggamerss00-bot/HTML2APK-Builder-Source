package xb;

import android.content.res.Resources;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class a {
    public static TypedValue a(Resources.Theme theme, int i10) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
}
