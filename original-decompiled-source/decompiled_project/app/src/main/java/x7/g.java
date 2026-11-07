package x7;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class g extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f32193a;

    /* renamed from: b, reason: collision with root package name */
    public final f f32194b;

    /* renamed from: c, reason: collision with root package name */
    public float f32195c;

    /* renamed from: d, reason: collision with root package name */
    public float f32196d;

    /* renamed from: e, reason: collision with root package name */
    public float f32197e = 1.0f;

    public g(Drawable drawable, f fVar) {
        this.f32193a = drawable;
        this.f32194b = fVar;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f32195c, this.f32196d);
            float f10 = this.f32197e;
            canvas.scale(f10, f10);
            this.f32193a.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f32193a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f32193a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f32193a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f32193a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @pg.d
    public final int getOpacity() {
        return this.f32193a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f32193a;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f32193a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f32193a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f32195c = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f32196d = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f32197e = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dB = j7.h.b(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f32194b);
        double d10 = 2;
        int iA = gh.a.a((iWidth - (intrinsicWidth * dB)) / d10);
        int iA2 = gh.a.a((iHeight - (intrinsicHeight * dB)) / d10);
        drawable.setBounds(iA, iA2, intrinsicWidth + iA, intrinsicHeight + iA2);
        this.f32195c = rect.left;
        this.f32196d = rect.top;
        this.f32197e = (float) dB;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f32193a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f32193a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f32193a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32193a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f32193a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f32193a.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f32193a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f32193a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f32193a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f32193a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
