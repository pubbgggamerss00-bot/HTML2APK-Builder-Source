package bg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class d extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f4217b;

    /* renamed from: d, reason: collision with root package name */
    public final int f4219d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4220e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4216a = new Paint(2);

    /* renamed from: c, reason: collision with root package name */
    public int f4218c = 255;

    public d(Bitmap bitmap) {
        this.f4217b = bitmap;
        if (bitmap != null) {
            this.f4219d = bitmap.getWidth();
            this.f4220e = this.f4217b.getHeight();
        } else {
            this.f4220e = 0;
            this.f4219d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f4217b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f4217b, (Rect) null, getBounds(), this.f4216a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4218c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4220e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4219d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f4220e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f4219d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f4218c = i10;
        this.f4216a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4216a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f4216a.setFilterBitmap(z10);
    }
}
