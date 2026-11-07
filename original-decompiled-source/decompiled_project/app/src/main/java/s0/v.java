package s0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import q1.b1;

/* loaded from: classes.dex */
public final class v extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24168a;

    /* renamed from: b, reason: collision with root package name */
    public b1 f24169b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f24170c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24171d;

    public v(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f24168a = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f24168a) {
            this.f24171d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f24171d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f24171d;
    }
}
