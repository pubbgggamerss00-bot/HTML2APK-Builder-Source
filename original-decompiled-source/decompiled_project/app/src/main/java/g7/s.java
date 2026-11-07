package g7;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class s {
    public static final Drawable a(l lVar, Resources resources) {
        return lVar instanceof g ? ((g) lVar).f11499a : lVar instanceof a ? new BitmapDrawable(resources, ((a) lVar).f11477a) : new m(lVar);
    }

    public static final l b(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new a(((BitmapDrawable) drawable).getBitmap()) : new g(drawable);
    }
}
