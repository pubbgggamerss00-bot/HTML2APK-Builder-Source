package f2;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class f extends Drawable {
    public Drawable s;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.s;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i6) {
        Drawable drawable = this.s;
        return drawable != null ? drawable.setLevel(i6) : super.onLevelChange(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setChangingConfigurations(i6);
        } else {
            super.setChangingConfigurations(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i6, PorterDuff.Mode mode) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setColorFilter(i6, mode);
        } else {
            super.setColorFilter(i6, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z6) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setFilterBitmap(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f6, float f7) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setHotspot(f6, f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i6, int i7, int i8, int i9) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setHotspotBounds(i6, i7, i8, i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.s;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
