package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f13707a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f13708b;

    /* renamed from: c, reason: collision with root package name */
    public int f13709c = 0;

    public n(ImageView imageView) {
        this.f13707a = imageView;
    }

    public final void a() {
        z0 z0Var;
        ImageView imageView = this.f13707a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            h0.a(drawable);
        }
        if (drawable == null || (z0Var = this.f13708b) == null) {
            return;
        }
        j.e(drawable, z0Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i6) {
        int resourceId;
        ImageView imageView = this.f13707a;
        Context context = imageView.getContext();
        int[] iArr = f.a.f12939f;
        b1 b1VarE = b1.e(i6, 0, context, attributeSet, iArr);
        TypedArray typedArray = b1VarE.f13583b;
        u0.f0.l(imageView, imageView.getContext(), iArr, attributeSet, b1VarE.f13583b, i6, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = y5.b0.d(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(b1VarE.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(h0.b(typedArray.getInt(3, -1), null));
            }
            b1VarE.f();
        } catch (Throwable th) {
            b1VarE.f();
            throw th;
        }
    }
}
