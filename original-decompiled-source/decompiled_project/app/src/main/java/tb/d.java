package tb;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public final class d {

    public static class a {
        public static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    public static class b {
        public static void a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static ColorStateList a(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !tb.a.a(drawable)) {
            return null;
        }
        return tb.b.a(drawable).getColorStateList();
    }
}
