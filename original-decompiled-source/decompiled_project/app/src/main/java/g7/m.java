package g7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class m extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final l f11513a;

    public m(l lVar) {
        this.f11513a = lVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f11513a.c(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    @pg.d
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
