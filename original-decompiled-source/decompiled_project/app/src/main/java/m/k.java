package m;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f17146a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f17147b;

    /* renamed from: c, reason: collision with root package name */
    public int f17148c = 0;

    public k(ImageView imageView) {
        this.f17146a = imageView;
    }

    public final void a() {
        h0 h0Var;
        ImageView imageView = this.f17146a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            u.a(drawable);
        }
        if (drawable == null || (h0Var = this.f17147b) == null) {
            return;
        }
        e.c(drawable, h0Var, imageView.getDrawableState());
    }
}
